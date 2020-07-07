// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MetricDimension model. */
@Fluent
public final class MetricDimension {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricDimension.class);

    /*
     * Name of the dimension
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized friendly display name of the dimension
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the name property: Name of the dimension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the dimension.
     *
     * @param name the name value to set.
     * @return the MetricDimension object itself.
     */
    public MetricDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized friendly display name of the dimension.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized friendly display name of the dimension.
     *
     * @param displayName the displayName value to set.
     * @return the MetricDimension object itself.
     */
    public MetricDimension withDisplayName(String displayName) {
        this.displayName = displayName;
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
