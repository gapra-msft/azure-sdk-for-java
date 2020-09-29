/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the os disk image information.
 */
public class OSDiskImage {
    /**
     * The operating system of the osDiskImage. Possible values include:
     * 'Windows', 'Linux'.
     */
    @JsonProperty(value = "operatingSystem", required = true)
    private OperatingSystemTypes operatingSystem;

    /**
     * Get the operating system of the osDiskImage. Possible values include: 'Windows', 'Linux'.
     *
     * @return the operatingSystem value
     */
    public OperatingSystemTypes operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operating system of the osDiskImage. Possible values include: 'Windows', 'Linux'.
     *
     * @param operatingSystem the operatingSystem value to set
     * @return the OSDiskImage object itself.
     */
    public OSDiskImage withOperatingSystem(OperatingSystemTypes operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

}
