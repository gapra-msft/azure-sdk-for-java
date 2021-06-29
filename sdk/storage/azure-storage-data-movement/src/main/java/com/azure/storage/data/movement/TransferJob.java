// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.data.movement;

import com.azure.storage.data.movement.implementation.scanner.PathScanner;

public class TransferJob {
    private PathScanner scanner;

    public TransferJob() {
    }

    public PathScanner getScanner() {
        return scanner;
    }

    public void setScanner(PathScanner scanner) {
        this.scanner = scanner;
    }
}
