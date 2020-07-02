// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The IpTag model. */
@Fluent
public final class IpTag {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpTag.class);

    /*
     * The IP tag type. Example: FirstPartyUsage.
     */
    @JsonProperty(value = "ipTagType")
    private String ipTagType;

    /*
     * The value of the IP tag associated with the public IP. Example: SQL.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the ipTagType property: The IP tag type. Example: FirstPartyUsage.
     *
     * @return the ipTagType value.
     */
    public String ipTagType() {
        return this.ipTagType;
    }

    /**
     * Set the ipTagType property: The IP tag type. Example: FirstPartyUsage.
     *
     * @param ipTagType the ipTagType value to set.
     * @return the IpTag object itself.
     */
    public IpTag withIpTagType(String ipTagType) {
        this.ipTagType = ipTagType;
        return this;
    }

    /**
     * Get the tag property: The value of the IP tag associated with the public IP. Example: SQL.
     *
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: The value of the IP tag associated with the public IP. Example: SQL.
     *
     * @param tag the tag value to set.
     * @return the IpTag object itself.
     */
    public IpTag withTag(String tag) {
        this.tag = tag;
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
