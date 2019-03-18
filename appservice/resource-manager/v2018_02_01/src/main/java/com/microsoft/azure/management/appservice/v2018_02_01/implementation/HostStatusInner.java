/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * Function host status.
 */
@JsonFlatten
public class HostStatusInner extends ProxyOnlyResource {
    /**
     * The host id.
     */
    @JsonProperty(value = "properties.id")
    private String hostStatusId;

    /**
     * The current host state.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * The Function runtime version.
     */
    @JsonProperty(value = "properties.version")
    private String version;

    /**
     * The Function runtime version details.
     */
    @JsonProperty(value = "properties.versionDetails")
    private String versionDetails;

    /**
     * Get the host id.
     *
     * @return the hostStatusId value
     */
    public String hostStatusId() {
        return this.hostStatusId;
    }

    /**
     * Set the host id.
     *
     * @param hostStatusId the hostStatusId value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withHostStatusId(String hostStatusId) {
        this.hostStatusId = hostStatusId;
        return this;
    }

    /**
     * Get the current host state.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the current host state.
     *
     * @param state the state value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the Function runtime version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the Function runtime version.
     *
     * @param version the version value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the Function runtime version details.
     *
     * @return the versionDetails value
     */
    public String versionDetails() {
        return this.versionDetails;
    }

    /**
     * Set the Function runtime version details.
     *
     * @param versionDetails the versionDetails value to set
     * @return the HostStatusInner object itself.
     */
    public HostStatusInner withVersionDetails(String versionDetails) {
        this.versionDetails = versionDetails;
        return this;
    }

}
