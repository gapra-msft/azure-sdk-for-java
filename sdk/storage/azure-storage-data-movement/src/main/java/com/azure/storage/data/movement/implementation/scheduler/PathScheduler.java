// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.data.movement.implementation.scheduler;

import reactor.core.publisher.Flux;

import java.util.Optional;

public interface PathScheduler {

    Flux<Optional> scheduleChunk();
}
