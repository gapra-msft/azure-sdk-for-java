// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the Update OpenID Connect Provider operation. */
@JsonFlatten
@Fluent
public class OpenidConnectProviderUpdateContract {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenidConnectProviderUpdateContract.class);

    /*
     * User-friendly OpenID Connect Provider name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * User-friendly description of OpenID Connect Provider.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Metadata endpoint URI.
     */
    @JsonProperty(value = "properties.metadataEndpoint")
    private String metadataEndpoint;

    /*
     * Client ID of developer console which is the client application.
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /*
     * Client Secret of developer console which is the client application.
     */
    @JsonProperty(value = "properties.clientSecret")
    private String clientSecret;

    /**
     * Get the displayName property: User-friendly OpenID Connect Provider name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: User-friendly OpenID Connect Provider name.
     *
     * @param displayName the displayName value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: User-friendly description of OpenID Connect Provider.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: User-friendly description of OpenID Connect Provider.
     *
     * @param description the description value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the metadataEndpoint property: Metadata endpoint URI.
     *
     * @return the metadataEndpoint value.
     */
    public String metadataEndpoint() {
        return this.metadataEndpoint;
    }

    /**
     * Set the metadataEndpoint property: Metadata endpoint URI.
     *
     * @param metadataEndpoint the metadataEndpoint value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withMetadataEndpoint(String metadataEndpoint) {
        this.metadataEndpoint = metadataEndpoint;
        return this;
    }

    /**
     * Get the clientId property: Client ID of developer console which is the client application.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: Client ID of developer console which is the client application.
     *
     * @param clientId the clientId value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: Client Secret of developer console which is the client application.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: Client Secret of developer console which is the client application.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the OpenidConnectProviderUpdateContract object itself.
     */
    public OpenidConnectProviderUpdateContract withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
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
