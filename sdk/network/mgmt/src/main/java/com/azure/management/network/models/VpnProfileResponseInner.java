// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VpnProfileResponse model. */
@Fluent
public final class VpnProfileResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnProfileResponseInner.class);

    /*
     * URL to the VPN profile.
     */
    @JsonProperty(value = "profileUrl")
    private String profileUrl;

    /**
     * Get the profileUrl property: URL to the VPN profile.
     *
     * @return the profileUrl value.
     */
    public String profileUrl() {
        return this.profileUrl;
    }

    /**
     * Set the profileUrl property: URL to the VPN profile.
     *
     * @param profileUrl the profileUrl value to set.
     * @return the VpnProfileResponseInner object itself.
     */
    public VpnProfileResponseInner withProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
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
