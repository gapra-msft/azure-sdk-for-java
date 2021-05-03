package com.azure.storage.blob;

import com.azure.core.http.ProxyOptions;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.util.Context;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.specialized.BlockBlobClient;
import com.azure.storage.blob.specialized.SpecializedBlobClientBuilder;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.common.implementation.Constants;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.nio.charset.StandardCharsets.UTF_8;

public class MemoryRepro {



    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10* 1000);

        while (true) {
            Thread t = new Uploader();
            t.start();
            while(t.isAlive()) {
                Thread.sleep(1000);
            }
        }
    }

    public static class Uploader extends Thread {
        public void run() {
            String accountName = "gaprauswest2";
            String accountKey = "";
            String localPathName = "C:\\Users\\gapra\\Downloads\\1";
            long localFileSize = 200 * Constants.MB;
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream(localPathName);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Lock lockRead = new ReentrantLock();
            Lock lockProgress = new ReentrantLock();
            AtomicReference<Exception> azureException = null;
            int azureBlockUploadSize = 4194304;
            int azureMaxUploadConcurrency = 8;
            AtomicBoolean isError = new AtomicBoolean(false);
            AtomicLong transferedSize = new AtomicLong();
            List<String> objList = Collections.synchronizedList(new ArrayList<String>());

            ExecutorService executor = Executors.newFixedThreadPool(azureMaxUploadConcurrency);
            List<Callable<Void>> callableTasks = new ArrayList<Callable<Void>>();
            long numberOfBlocks = (long) Math.ceil((double) localFileSize / azureBlockUploadSize);
            String endpoint = String.format(Locale.ROOT,
                "https://%s.blob.core.windows.net", accountName);
            StorageSharedKeyCredential credential
                = new StorageSharedKeyCredential(accountName, accountKey);
            BlockBlobClient blockBlobClient = new SpecializedBlobClientBuilder()
                .httpClient(new NettyAsyncHttpClientBuilder().proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("localhost", 8888))).wiretap(true).build())
                .endpoint(endpoint).credential(credential)
                .containerName("test")
                .blobName("temp-2.txt")
                .buildBlockBlobClient();
            InputStream finalInputStream = inputStream;
            for (int i = 0; i < numberOfBlocks && !interrupted(); i++) {
                Callable<Void> callableTask = () -> {
                    int totalBlockBytesRead = 0;
                    int numberOfBytesReadOnLastRead = -1;
                    String base64BlockId = null;
                    byte[] blockContent = new byte[azureBlockUploadSize];
                    try {
                        synchronized (lockRead) { //reading the block synchronize
                            while (totalBlockBytesRead < azureBlockUploadSize
                                && ((numberOfBytesReadOnLastRead = finalInputStream.read(blockContent, totalBlockBytesRead, azureBlockUploadSize - totalBlockBytesRead)) != -1)
                                && !interrupted()) {
                                totalBlockBytesRead += numberOfBytesReadOnLastRead;
                            }
                            if (totalBlockBytesRead == 0) {
                                return null;
                            }
                            base64BlockId = generateBase64BlockId();
                        }
                        if (interrupted()) {
                            return null;
                        }
                        byte[] blockContentToUpload = null;
                        //the array length should be the same as totalBlockBytesRead.
                        if (totalBlockBytesRead < azureBlockUploadSize) {
                            blockContentToUpload = new byte[totalBlockBytesRead];
                            System.arraycopy(blockContent, 0, blockContentToUpload, 0, totalBlockBytesRead);
                        } else {
                            blockContentToUpload = blockContent;
                        }
                        System.out.println(String.format("Start stage block base64BlockId %s is sized %s bytes", base64BlockId, totalBlockBytesRead));
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blockContentToUpload);
                        blockBlobClient.stageBlock(base64BlockId, byteArrayInputStream, totalBlockBytesRead);
                        objList.add(base64BlockId);
                        System.out.println(String.format("End stage block base64BlockId %s is sized %s bytes", base64BlockId, totalBlockBytesRead));
                        byteArrayInputStream.close();
                        byteArrayInputStream = null;
                        blockContent = blockContentToUpload = null;
                        synchronized (lockProgress) {
                            transferedSize.addAndGet(totalBlockBytesRead);
                            System.out.println("Transferred " + transferedSize);
                        }
                    } catch (Exception e) {
                        isError.set(true);
                        System.out.println(String.format("An exception was thrown while uploading base64BlockId %s : %s", base64BlockId, e.getMessage()));
                        azureException.set(e);
                        throw e;
                    } finally {
                        //releaseMemory();
                    }
                    return null;
                };
                callableTasks.add(callableTask);
            }
            if (!interrupted()) {
                //This is blocking method - wait for all tasks being completed
                try {
                    executor.invokeAll(callableTasks);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                executor.shutdown();
                if (!isError.get()) {
                    System.out.println("Start commit all blocks from the staging area");
                    BlobHttpHeaders blobHttpHeaders = null;
                    blobHttpHeaders = new BlobHttpHeaders();
                    blobHttpHeaders.setContentType("text");

//                    try {
//                        Thread.sleep(10*1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                    blockBlobClient.commitBlockListWithResponse(objList, blobHttpHeaders, null, null, null, null, Context.NONE);
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("End commit all blocks from the staging area");
                } else {
                    System.out.println("Exception was occurred when trying to stage blocks");
                }
            }

//            System.gc();

        }

        private String generateBase64BlockId() {
            return Base64.getEncoder().encodeToString(UUID.randomUUID().toString().getBytes(UTF_8));
        }
    }
}
