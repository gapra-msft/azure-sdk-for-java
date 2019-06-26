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

/**
 * Recovery plan update properties.
 */
public class UpdateRecoveryPlanInputProperties {
    /**
     * The recovery plan groups.
     */
    @JsonProperty(value = "groups")
    private List<RecoveryPlanGroup> groups;

    /**
     * Get the recovery plan groups.
     *
     * @return the groups value
     */
    public List<RecoveryPlanGroup> groups() {
        return this.groups;
    }

    /**
     * Set the recovery plan groups.
     *
     * @param groups the groups value to set
     * @return the UpdateRecoveryPlanInputProperties object itself.
     */
    public UpdateRecoveryPlanInputProperties withGroups(List<RecoveryPlanGroup> groups) {
        this.groups = groups;
        return this;
    }

}
