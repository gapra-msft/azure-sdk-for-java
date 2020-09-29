/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual Wan Vpn profile parameters Vpn profile generation.
 */
public class VirtualWanVpnProfileParameters {
    /**
     * VpnServerConfiguration partial resource uri with which VirtualWan is
     * associated to.
     */
    @JsonProperty(value = "vpnServerConfigurationResourceId")
    private String vpnServerConfigurationResourceId;

    /**
     * VPN client authentication method. Possible values include: 'EAPTLS',
     * 'EAPMSCHAPv2'.
     */
    @JsonProperty(value = "authenticationMethod")
    private AuthenticationMethod authenticationMethod;

    /**
     * Get vpnServerConfiguration partial resource uri with which VirtualWan is associated to.
     *
     * @return the vpnServerConfigurationResourceId value
     */
    public String vpnServerConfigurationResourceId() {
        return this.vpnServerConfigurationResourceId;
    }

    /**
     * Set vpnServerConfiguration partial resource uri with which VirtualWan is associated to.
     *
     * @param vpnServerConfigurationResourceId the vpnServerConfigurationResourceId value to set
     * @return the VirtualWanVpnProfileParameters object itself.
     */
    public VirtualWanVpnProfileParameters withVpnServerConfigurationResourceId(String vpnServerConfigurationResourceId) {
        this.vpnServerConfigurationResourceId = vpnServerConfigurationResourceId;
        return this;
    }

    /**
     * Get vPN client authentication method. Possible values include: 'EAPTLS', 'EAPMSCHAPv2'.
     *
     * @return the authenticationMethod value
     */
    public AuthenticationMethod authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Set vPN client authentication method. Possible values include: 'EAPTLS', 'EAPMSCHAPv2'.
     *
     * @param authenticationMethod the authenticationMethod value to set
     * @return the VirtualWanVpnProfileParameters object itself.
     */
    public VirtualWanVpnProfileParameters withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }

}
