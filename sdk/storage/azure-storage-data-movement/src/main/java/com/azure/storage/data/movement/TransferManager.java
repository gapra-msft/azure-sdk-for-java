// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.data.movement;

import com.azure.storage.blob.implementation.util.StorageBlockingSink;
import reactor.core.publisher.Flux;

import java.io.Closeable;
import java.io.IOException;

public class TransferManager implements Closeable {

    private final StorageBlockingSink<TransferJob> sink;

    private TransferManager() {
        this.sink = new StorageBlockingSink<>();

        Flux<TransferJob> jobs = this.sink.asFlux();

        jobs.flatMapSequential(job -> job.getScanner().scan(), 5, 1);
    }

    public void scheduleJob(TransferJob job) {
        this.sink.emitNext(job);
    }

    @Override
    public void close() throws IOException {
        this.sink.emitCompleteOrThrow();
    }
}
