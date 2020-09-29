// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.RunCommandDocumentBaseInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Virtual Machine operation response. */
@Fluent
public final class RunCommandListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunCommandListResult.class);

    /*
     * The list of virtual machine run commands.
     */
    @JsonProperty(value = "value", required = true)
    private List<RunCommandDocumentBaseInner> value;

    /*
     * The uri to fetch the next page of run commands. Call ListNext() with
     * this to fetch the next page of run commands.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of virtual machine run commands.
     *
     * @return the value value.
     */
    public List<RunCommandDocumentBaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machine run commands.
     *
     * @param value the value value to set.
     * @return the RunCommandListResult object itself.
     */
    public RunCommandListResult withValue(List<RunCommandDocumentBaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of run commands. Call ListNext() with this to fetch the
     * next page of run commands.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of run commands. Call ListNext() with this to fetch the
     * next page of run commands.
     *
     * @param nextLink the nextLink value to set.
     * @return the RunCommandListResult object itself.
     */
    public RunCommandListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model RunCommandListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
