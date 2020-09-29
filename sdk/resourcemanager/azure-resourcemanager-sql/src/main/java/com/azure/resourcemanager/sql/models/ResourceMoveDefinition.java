// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the information necessary to perform a resource move (rename). */
@Fluent
public final class ResourceMoveDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceMoveDefinition.class);

    /*
     * The target ID for the resource
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: The target ID for the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The target ID for the resource.
     *
     * @param id the id value to set.
     * @return the ResourceMoveDefinition object itself.
     */
    public ResourceMoveDefinition withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model ResourceMoveDefinition"));
        }
    }
}
