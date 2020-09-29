// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU of nat gateway. */
@Fluent
public final class NatGatewaySku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NatGatewaySku.class);

    /*
     * Name of Nat Gateway SKU.
     */
    @JsonProperty(value = "name")
    private NatGatewaySkuName name;

    /**
     * Get the name property: Name of Nat Gateway SKU.
     *
     * @return the name value.
     */
    public NatGatewaySkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of Nat Gateway SKU.
     *
     * @param name the name value to set.
     * @return the NatGatewaySku object itself.
     */
    public NatGatewaySku withName(NatGatewaySkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
