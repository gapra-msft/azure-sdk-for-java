/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * This class represents the recovery plan shutdown group task details.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("RecoveryPlanShutdownGroupTaskDetails")
public class RecoveryPlanShutdownGroupTaskDetails extends GroupTaskDetails {
    /**
     * The name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The group identifier.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /**
     * The group type.
     */
    @JsonProperty(value = "rpGroupType")
    private String rpGroupType;

    /**
     * Get the name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name.
     *
     * @param name the name value to set
     * @return the RecoveryPlanShutdownGroupTaskDetails object itself.
     */
    public RecoveryPlanShutdownGroupTaskDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the group identifier.
     *
     * @return the groupId value
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the group identifier.
     *
     * @param groupId the groupId value to set
     * @return the RecoveryPlanShutdownGroupTaskDetails object itself.
     */
    public RecoveryPlanShutdownGroupTaskDetails withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the group type.
     *
     * @return the rpGroupType value
     */
    public String rpGroupType() {
        return this.rpGroupType;
    }

    /**
     * Set the group type.
     *
     * @param rpGroupType the rpGroupType value to set
     * @return the RecoveryPlanShutdownGroupTaskDetails object itself.
     */
    public RecoveryPlanShutdownGroupTaskDetails withRpGroupType(String rpGroupType) {
        this.rpGroupType = rpGroupType;
        return this;
    }

}
