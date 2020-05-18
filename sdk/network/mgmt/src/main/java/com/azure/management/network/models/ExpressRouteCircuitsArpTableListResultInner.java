// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.network.ExpressRouteCircuitArpTable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteCircuitsArpTableListResult model. */
@Fluent
public final class ExpressRouteCircuitsArpTableListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitsArpTableListResultInner.class);

    /*
     * Gets list of the ARP table.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitArpTable> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets list of the ARP table.
     *
     * @return the value value.
     */
    public List<ExpressRouteCircuitArpTable> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets list of the ARP table.
     *
     * @param value the value value to set.
     * @return the ExpressRouteCircuitsArpTableListResultInner object itself.
     */
    public ExpressRouteCircuitsArpTableListResultInner withValue(List<ExpressRouteCircuitArpTable> value) {
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
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteCircuitsArpTableListResultInner object itself.
     */
    public ExpressRouteCircuitsArpTableListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
