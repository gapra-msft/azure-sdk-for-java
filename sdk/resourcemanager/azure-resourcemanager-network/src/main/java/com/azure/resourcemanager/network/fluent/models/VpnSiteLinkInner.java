// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnLinkBgpSettings;
import com.azure.resourcemanager.network.models.VpnLinkProviderProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VpnSiteLink Resource. */
@JsonFlatten
@Fluent
public class VpnSiteLinkInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnSiteLinkInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The link provider properties.
     */
    @JsonProperty(value = "properties.linkProperties")
    private VpnLinkProviderProperties linkProperties;

    /*
     * The ip-address for the vpn-site-link.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /*
     * FQDN of vpn-site-link.
     */
    @JsonProperty(value = "properties.fqdn")
    private String fqdn;

    /*
     * The set of bgp properties.
     */
    @JsonProperty(value = "properties.bgpProperties")
    private VpnLinkBgpSettings bgpProperties;

    /*
     * The provisioning state of the VPN site link resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the linkProperties property: The link provider properties.
     *
     * @return the linkProperties value.
     */
    public VpnLinkProviderProperties linkProperties() {
        return this.linkProperties;
    }

    /**
     * Set the linkProperties property: The link provider properties.
     *
     * @param linkProperties the linkProperties value to set.
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withLinkProperties(VpnLinkProviderProperties linkProperties) {
        this.linkProperties = linkProperties;
        return this;
    }

    /**
     * Get the ipAddress property: The ip-address for the vpn-site-link.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The ip-address for the vpn-site-link.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the fqdn property: FQDN of vpn-site-link.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: FQDN of vpn-site-link.
     *
     * @param fqdn the fqdn value to set.
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the bgpProperties property: The set of bgp properties.
     *
     * @return the bgpProperties value.
     */
    public VpnLinkBgpSettings bgpProperties() {
        return this.bgpProperties;
    }

    /**
     * Set the bgpProperties property: The set of bgp properties.
     *
     * @param bgpProperties the bgpProperties value to set.
     * @return the VpnSiteLinkInner object itself.
     */
    public VpnSiteLinkInner withBgpProperties(VpnLinkBgpSettings bgpProperties) {
        this.bgpProperties = bgpProperties;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN site link resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkProperties() != null) {
            linkProperties().validate();
        }
        if (bgpProperties() != null) {
            bgpProperties().validate();
        }
    }
}
