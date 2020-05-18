// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RuleManagementEventClaimsDataSource model. */
@Fluent
public final class RuleManagementEventClaimsDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleManagementEventClaimsDataSource.class);

    /*
     * the email address.
     */
    @JsonProperty(value = "emailAddress")
    private String emailAddress;

    /**
     * Get the emailAddress property: the email address.
     *
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: the email address.
     *
     * @param emailAddress the emailAddress value to set.
     * @return the RuleManagementEventClaimsDataSource object itself.
     */
    public RuleManagementEventClaimsDataSource withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
