// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

module com.azure.storage.internal.avro {
    requires com.azure.core;
    requires transitive com.azure.storage.common;

    exports com.azure.storage.internal.avro.implementation;
    exports com.azure.storage.internal.avro.implementation.schema.primitive;
    exports com.azure.storage.internal.avro.implementation.util;
}
