// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.data.movement.implementation.scanner;

import reactor.core.publisher.Flux;

public class LocalFilesystemPathScanner implements PathScanner {
    @Override
    public Flux<ScannedPath> scan() {
        return null;
    }
}
