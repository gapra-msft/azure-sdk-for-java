// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Geographical region. */
@JsonFlatten
@Immutable
public class GeoRegionInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GeoRegionInner.class);

    /*
     * Region description.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Display name for region.
     */
    @JsonProperty(value = "properties.displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Display name for region.
     */
    @JsonProperty(value = "properties.orgDomain", access = JsonProperty.Access.WRITE_ONLY)
    private String orgDomain;

    /**
     * Get the description property: Region description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the displayName property: Display name for region.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the orgDomain property: Display name for region.
     *
     * @return the orgDomain value.
     */
    public String orgDomain() {
        return this.orgDomain;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
