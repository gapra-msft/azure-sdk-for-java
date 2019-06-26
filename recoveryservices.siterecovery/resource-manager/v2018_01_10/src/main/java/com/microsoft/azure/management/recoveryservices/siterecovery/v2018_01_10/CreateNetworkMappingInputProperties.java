/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common input details for network mapping operation.
 */
public class CreateNetworkMappingInputProperties {
    /**
     * Recovery fabric Name.
     */
    @JsonProperty(value = "recoveryFabricName")
    private String recoveryFabricName;

    /**
     * Recovery network Id.
     */
    @JsonProperty(value = "recoveryNetworkId")
    private String recoveryNetworkId;

    /**
     * Fabric specific input properties.
     */
    @JsonProperty(value = "fabricSpecificDetails")
    private FabricSpecificCreateNetworkMappingInput fabricSpecificDetails;

    /**
     * Get recovery fabric Name.
     *
     * @return the recoveryFabricName value
     */
    public String recoveryFabricName() {
        return this.recoveryFabricName;
    }

    /**
     * Set recovery fabric Name.
     *
     * @param recoveryFabricName the recoveryFabricName value to set
     * @return the CreateNetworkMappingInputProperties object itself.
     */
    public CreateNetworkMappingInputProperties withRecoveryFabricName(String recoveryFabricName) {
        this.recoveryFabricName = recoveryFabricName;
        return this;
    }

    /**
     * Get recovery network Id.
     *
     * @return the recoveryNetworkId value
     */
    public String recoveryNetworkId() {
        return this.recoveryNetworkId;
    }

    /**
     * Set recovery network Id.
     *
     * @param recoveryNetworkId the recoveryNetworkId value to set
     * @return the CreateNetworkMappingInputProperties object itself.
     */
    public CreateNetworkMappingInputProperties withRecoveryNetworkId(String recoveryNetworkId) {
        this.recoveryNetworkId = recoveryNetworkId;
        return this;
    }

    /**
     * Get fabric specific input properties.
     *
     * @return the fabricSpecificDetails value
     */
    public FabricSpecificCreateNetworkMappingInput fabricSpecificDetails() {
        return this.fabricSpecificDetails;
    }

    /**
     * Set fabric specific input properties.
     *
     * @param fabricSpecificDetails the fabricSpecificDetails value to set
     * @return the CreateNetworkMappingInputProperties object itself.
     */
    public CreateNetworkMappingInputProperties withFabricSpecificDetails(FabricSpecificCreateNetworkMappingInput fabricSpecificDetails) {
        this.fabricSpecificDetails = fabricSpecificDetails;
        return this;
    }

}
