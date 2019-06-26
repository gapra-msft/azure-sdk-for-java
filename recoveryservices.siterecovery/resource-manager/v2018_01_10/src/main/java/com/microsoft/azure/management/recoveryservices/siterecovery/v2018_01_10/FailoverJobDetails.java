/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the details for a failover job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("FailoverJobDetails")
public class FailoverJobDetails extends JobDetails {
    /**
     * The test VM details.
     */
    @JsonProperty(value = "protectedItemDetails")
    private List<FailoverReplicationProtectedItemDetails> protectedItemDetails;

    /**
     * Get the test VM details.
     *
     * @return the protectedItemDetails value
     */
    public List<FailoverReplicationProtectedItemDetails> protectedItemDetails() {
        return this.protectedItemDetails;
    }

    /**
     * Set the test VM details.
     *
     * @param protectedItemDetails the protectedItemDetails value to set
     * @return the FailoverJobDetails object itself.
     */
    public FailoverJobDetails withProtectedItemDetails(List<FailoverReplicationProtectedItemDetails> protectedItemDetails) {
        this.protectedItemDetails = protectedItemDetails;
        return this;
    }

}
