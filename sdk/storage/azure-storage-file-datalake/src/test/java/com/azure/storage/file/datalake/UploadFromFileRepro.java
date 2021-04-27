package com.azure.storage.file.datalake;

import com.azure.core.http.ProxyOptions;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.storage.common.ParallelTransferOptions;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.common.implementation.Constants;
import com.ctc.wstx.shaded.msv_core.verifier.jarv.Const;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Random;
import java.util.UUID;

public class UploadFromFileRepro {

    private static final String accountName = "gaprauswest2";
    private static final String accountKey = "REDACT";
    private static final StorageSharedKeyCredential credential = new StorageSharedKeyCredential(accountName, accountKey);
    private final File file;

    public UploadFromFileRepro(int size) throws IOException {
        file = getRandomFile(size);
    }

    public static void main(String[] args) throws IOException {
        int size = 900 * Constants.KB;
        int concurrency = 8;
        long blockSize = 4 * Constants.MB;

        DataLakeFileClient client = new DataLakePathClientBuilder()
            .credential(credential)
            .endpoint(String.format("https://%s.dfs.core.windows.net", accountName))
            .httpClient(new NettyAsyncHttpClientBuilder().wiretap(true).proxy(new ProxyOptions(ProxyOptions.Type.HTTP, new InetSocketAddress("localhost", 8888))).build())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .fileSystemName("test")
            .pathName("temp.txt")
            .buildFileClient();
        ParallelTransferOptions parallelTransferOptions = new ParallelTransferOptions().setBlockSizeLong(blockSize).setMaxConcurrency(concurrency);//.setMaxSingleUploadSizeLong(blockSize);

        UploadFromFileRepro repro = new UploadFromFileRepro(size);

        while(true) {
            repro.uploadFile(client, parallelTransferOptions);
        }

    }

    private void uploadFile(DataLakeFileClient client, ParallelTransferOptions parallelTransferOptions) {

        assert file != null && file.exists();

        long flen = (long) file.length();
        assert flen != 0;
        long t1= System.currentTimeMillis();
        client.uploadFromFile(file.getAbsolutePath(), parallelTransferOptions, null, null, null, null);
        long t2= System.currentTimeMillis();
        System.out.println("time taken to upload in ms " + (t2-t1));

    }

    private File getRandomFile(int size) throws IOException {
        File file = File.createTempFile(UUID.randomUUID().toString(), ".txt");
        file.deleteOnExit();
        FileOutputStream fos = new FileOutputStream(file);

        if (size > Constants.MB) {
            for (int i = 0; i < size / Constants.MB; i++) {
                int dataSize = Math.min(Constants.MB, size - i * Constants.MB);
                fos.write(getRandomByteArray(dataSize));
            }
        } else {
            fos.write(getRandomByteArray(size));
        }

        fos.close();
        return file;
    }

    private byte[] getRandomByteArray(int size) {
        Random rand = new Random();
        byte[] data = new byte[size];
        rand.nextBytes(data);
        return data;
    }
}
