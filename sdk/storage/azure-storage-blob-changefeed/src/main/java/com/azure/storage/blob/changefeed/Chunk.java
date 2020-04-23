package com.azure.storage.blob.changefeed;

import com.azure.core.util.logging.ClientLogger;
import com.azure.storage.blob.BlobContainerAsyncClient;
import com.azure.storage.blob.BlobServiceAsyncClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.changefeed.implementation.util.BlobChangefeedCursor;
import com.azure.storage.blob.changefeed.implementation.util.BlobChangefeedEventWrapper;
import com.azure.storage.blob.changefeed.models.BlobChangefeedEvent;
import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.internal.avro.implementation.AvroParser;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Map;

/**
 * Gets events for a chunk.
 * A chunk is an avro formatted append blob that contains change feed events.
 */
class Chunk {

    private static ClientLogger logger = new ClientLogger(Chunk.class);

    /* Changefeed container */
    private final BlobContainerAsyncClient client;

    /* Chunk event data location. */
    private final String chunkPath;

    /* Cursor associated with parent shard. */
    private final BlobChangefeedCursor shardCursor;

    private long eventNumber;

    private final BlobChangefeedCursor userCursor;


    Chunk(BlobContainerAsyncClient client, String chunkPath, BlobChangefeedCursor shardCursor,
        BlobChangefeedCursor userCursor) {
        this.client = client;
        this.chunkPath = chunkPath;
        this.shardCursor = shardCursor;
        this.eventNumber = -1;
        this.userCursor = userCursor;
        System.out.println(chunkPath);
    }

    Flux<BlobChangefeedEventWrapper> getEvents() {
        /* Download Avro data file. */
        /* TODO (gapra): Lazy download. */
        AvroParser parser = new AvroParser();
        return client.getBlobAsyncClient(chunkPath)
            .download()
            .concatMap(parser::parse)
            .map(object -> {
                BlobChangefeedCursor eventCursor = shardCursor.toEventCursor(eventNumber++);
                return new BlobChangefeedEventWrapper(BlobChangefeedEvent.fromRecord((Map<String, Object>) object), eventCursor);
            });
    }
}
