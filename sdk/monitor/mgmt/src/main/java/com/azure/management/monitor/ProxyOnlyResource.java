// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The ProxyOnlyResource model. */
@Immutable
public class ProxyOnlyResource extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProxyOnlyResource.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
