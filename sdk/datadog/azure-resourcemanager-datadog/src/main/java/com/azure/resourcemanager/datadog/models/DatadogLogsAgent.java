// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DatadogLogsAgent model. */
@Fluent
public final class DatadogLogsAgent {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatadogLogsAgent.class);

    /*
     * The transport.
     */
    @JsonProperty(value = "transport")
    private String transport;

    /**
     * Get the transport property: The transport.
     *
     * @return the transport value.
     */
    public String transport() {
        return this.transport;
    }

    /**
     * Set the transport property: The transport.
     *
     * @param transport the transport value to set.
     * @return the DatadogLogsAgent object itself.
     */
    public DatadogLogsAgent withTransport(String transport) {
        this.transport = transport;
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
