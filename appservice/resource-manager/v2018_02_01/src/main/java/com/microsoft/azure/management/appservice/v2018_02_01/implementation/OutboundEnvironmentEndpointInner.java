/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.EndpointDependency;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Endpoints of a common type.
 */
public class OutboundEnvironmentEndpointInner {
    /**
     * Short description of the endpoints.
     */
    @JsonProperty(value = "category")
    private String category;

    /**
     * The endpoint's domain name and the IP Addresses it currently resolves
     * to.
     */
    @JsonProperty(value = "endpoints")
    private List<EndpointDependency> endpoints;

    /**
     * Get short description of the endpoints.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set short description of the endpoints.
     *
     * @param category the category value to set
     * @return the OutboundEnvironmentEndpointInner object itself.
     */
    public OutboundEnvironmentEndpointInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the endpoint's domain name and the IP Addresses it currently resolves to.
     *
     * @return the endpoints value
     */
    public List<EndpointDependency> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoint's domain name and the IP Addresses it currently resolves to.
     *
     * @param endpoints the endpoints value to set
     * @return the OutboundEnvironmentEndpointInner object itself.
     */
    public OutboundEnvironmentEndpointInner withEndpoints(List<EndpointDependency> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

}
