// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Active Directory settings used to join a cache to a domain. */
@Fluent
public final class CacheActiveDirectorySettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CacheActiveDirectorySettings.class);

    /*
     * Primary DNS IP address used to resolve the Active Directory domain
     * controller's fully qualified domain name.
     */
    @JsonProperty(value = "primaryDnsIpAddress", required = true)
    private String primaryDnsIpAddress;

    /*
     * Secondary DNS IP address used to resolve the Active Directory domain
     * controller's fully qualified domain name.
     */
    @JsonProperty(value = "secondaryDnsIpAddress")
    private String secondaryDnsIpAddress;

    /*
     * The fully qualified domain name of the Active Directory domain
     * controller.
     */
    @JsonProperty(value = "domainName", required = true)
    private String domainName;

    /*
     * The Active Directory domain's NetBIOS name.
     */
    @JsonProperty(value = "domainNetBiosName", required = true)
    private String domainNetBiosName;

    /*
     * The NetBIOS name to assign to the HPC Cache when it joins the Active
     * Directory domain as a server. Length must 1-15 characters from the class
     * [-0-9a-zA-Z].
     */
    @JsonProperty(value = "cacheNetBiosName", required = true)
    private String cacheNetBiosName;

    /*
     * True if the HPC Cache is joined to the Active Directory domain.
     */
    @JsonProperty(value = "domainJoined", access = JsonProperty.Access.WRITE_ONLY)
    private DomainJoinedType domainJoined;

    /*
     * Active Directory admin credentials used to join the HPC Cache to a
     * domain.
     */
    @JsonProperty(value = "credentials")
    private CacheActiveDirectorySettingsCredentials credentials;

    /**
     * Get the primaryDnsIpAddress property: Primary DNS IP address used to resolve the Active Directory domain
     * controller's fully qualified domain name.
     *
     * @return the primaryDnsIpAddress value.
     */
    public String primaryDnsIpAddress() {
        return this.primaryDnsIpAddress;
    }

    /**
     * Set the primaryDnsIpAddress property: Primary DNS IP address used to resolve the Active Directory domain
     * controller's fully qualified domain name.
     *
     * @param primaryDnsIpAddress the primaryDnsIpAddress value to set.
     * @return the CacheActiveDirectorySettings object itself.
     */
    public CacheActiveDirectorySettings withPrimaryDnsIpAddress(String primaryDnsIpAddress) {
        this.primaryDnsIpAddress = primaryDnsIpAddress;
        return this;
    }

    /**
     * Get the secondaryDnsIpAddress property: Secondary DNS IP address used to resolve the Active Directory domain
     * controller's fully qualified domain name.
     *
     * @return the secondaryDnsIpAddress value.
     */
    public String secondaryDnsIpAddress() {
        return this.secondaryDnsIpAddress;
    }

    /**
     * Set the secondaryDnsIpAddress property: Secondary DNS IP address used to resolve the Active Directory domain
     * controller's fully qualified domain name.
     *
     * @param secondaryDnsIpAddress the secondaryDnsIpAddress value to set.
     * @return the CacheActiveDirectorySettings object itself.
     */
    public CacheActiveDirectorySettings withSecondaryDnsIpAddress(String secondaryDnsIpAddress) {
        this.secondaryDnsIpAddress = secondaryDnsIpAddress;
        return this;
    }

    /**
     * Get the domainName property: The fully qualified domain name of the Active Directory domain controller.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The fully qualified domain name of the Active Directory domain controller.
     *
     * @param domainName the domainName value to set.
     * @return the CacheActiveDirectorySettings object itself.
     */
    public CacheActiveDirectorySettings withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the domainNetBiosName property: The Active Directory domain's NetBIOS name.
     *
     * @return the domainNetBiosName value.
     */
    public String domainNetBiosName() {
        return this.domainNetBiosName;
    }

    /**
     * Set the domainNetBiosName property: The Active Directory domain's NetBIOS name.
     *
     * @param domainNetBiosName the domainNetBiosName value to set.
     * @return the CacheActiveDirectorySettings object itself.
     */
    public CacheActiveDirectorySettings withDomainNetBiosName(String domainNetBiosName) {
        this.domainNetBiosName = domainNetBiosName;
        return this;
    }

    /**
     * Get the cacheNetBiosName property: The NetBIOS name to assign to the HPC Cache when it joins the Active Directory
     * domain as a server. Length must 1-15 characters from the class [-0-9a-zA-Z].
     *
     * @return the cacheNetBiosName value.
     */
    public String cacheNetBiosName() {
        return this.cacheNetBiosName;
    }

    /**
     * Set the cacheNetBiosName property: The NetBIOS name to assign to the HPC Cache when it joins the Active Directory
     * domain as a server. Length must 1-15 characters from the class [-0-9a-zA-Z].
     *
     * @param cacheNetBiosName the cacheNetBiosName value to set.
     * @return the CacheActiveDirectorySettings object itself.
     */
    public CacheActiveDirectorySettings withCacheNetBiosName(String cacheNetBiosName) {
        this.cacheNetBiosName = cacheNetBiosName;
        return this;
    }

    /**
     * Get the domainJoined property: True if the HPC Cache is joined to the Active Directory domain.
     *
     * @return the domainJoined value.
     */
    public DomainJoinedType domainJoined() {
        return this.domainJoined;
    }

    /**
     * Get the credentials property: Active Directory admin credentials used to join the HPC Cache to a domain.
     *
     * @return the credentials value.
     */
    public CacheActiveDirectorySettingsCredentials credentials() {
        return this.credentials;
    }

    /**
     * Set the credentials property: Active Directory admin credentials used to join the HPC Cache to a domain.
     *
     * @param credentials the credentials value to set.
     * @return the CacheActiveDirectorySettings object itself.
     */
    public CacheActiveDirectorySettings withCredentials(CacheActiveDirectorySettingsCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (primaryDnsIpAddress() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property primaryDnsIpAddress in model CacheActiveDirectorySettings"));
        }
        if (domainName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property domainName in model CacheActiveDirectorySettings"));
        }
        if (domainNetBiosName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property domainNetBiosName in model CacheActiveDirectorySettings"));
        }
        if (cacheNetBiosName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property cacheNetBiosName in model CacheActiveDirectorySettings"));
        }
        if (credentials() != null) {
            credentials().validate();
        }
    }
}
