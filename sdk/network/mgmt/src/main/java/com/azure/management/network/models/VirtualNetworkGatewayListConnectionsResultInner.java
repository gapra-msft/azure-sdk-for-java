// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualNetworkGatewayListConnectionsResult model. */
@Fluent
public final class VirtualNetworkGatewayListConnectionsResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualNetworkGatewayListConnectionsResultInner.class);

    /*
     * Gets a list of VirtualNetworkGatewayConnection resources that exists in
     * a resource group.
     */
    @JsonProperty(value = "value")
    private List<VirtualNetworkGatewayConnectionListEntityInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Gets a list of VirtualNetworkGatewayConnection resources that exists in a resource group.
     *
     * @return the value value.
     */
    public List<VirtualNetworkGatewayConnectionListEntityInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a list of VirtualNetworkGatewayConnection resources that exists in a resource group.
     *
     * @param value the value value to set.
     * @return the VirtualNetworkGatewayListConnectionsResultInner object itself.
     */
    public VirtualNetworkGatewayListConnectionsResultInner withValue(
        List<VirtualNetworkGatewayConnectionListEntityInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
