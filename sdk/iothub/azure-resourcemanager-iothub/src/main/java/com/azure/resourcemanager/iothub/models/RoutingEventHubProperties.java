// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties related to an event hub endpoint. */
@Fluent
public final class RoutingEventHubProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutingEventHubProperties.class);

    /*
     * Id of the event hub endpoint
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The connection string of the event hub endpoint.
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * The url of the event hub endpoint. It must include the protocol sb://
     */
    @JsonProperty(value = "endpointUri")
    private String endpointUri;

    /*
     * Event hub name on the event hub namespace
     */
    @JsonProperty(value = "entityPath")
    private String entityPath;

    /*
     * Method used to authenticate against the event hub endpoint
     */
    @JsonProperty(value = "authenticationType")
    private AuthenticationType authenticationType;

    /*
     * Managed identity properties of routing event hub endpoint.
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * The name that identifies this endpoint. The name can only include
     * alphanumeric characters, periods, underscores, hyphens and has a maximum
     * length of 64 characters. The following names are reserved:  events,
     * fileNotifications, $default. Endpoint names must be unique across
     * endpoint types.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The subscription identifier of the event hub endpoint.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The name of the resource group of the event hub endpoint.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * Get the id property: Id of the event hub endpoint.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of the event hub endpoint.
     *
     * @param id the id value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the connectionString property: The connection string of the event hub endpoint.
     *
     * @return the connectionString value.
     */
    public String connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of the event hub endpoint.
     *
     * @param connectionString the connectionString value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the endpointUri property: The url of the event hub endpoint. It must include the protocol sb://.
     *
     * @return the endpointUri value.
     */
    public String endpointUri() {
        return this.endpointUri;
    }

    /**
     * Set the endpointUri property: The url of the event hub endpoint. It must include the protocol sb://.
     *
     * @param endpointUri the endpointUri value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withEndpointUri(String endpointUri) {
        this.endpointUri = endpointUri;
        return this;
    }

    /**
     * Get the entityPath property: Event hub name on the event hub namespace.
     *
     * @return the entityPath value.
     */
    public String entityPath() {
        return this.entityPath;
    }

    /**
     * Set the entityPath property: Event hub name on the event hub namespace.
     *
     * @param entityPath the entityPath value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withEntityPath(String entityPath) {
        this.entityPath = entityPath;
        return this;
    }

    /**
     * Get the authenticationType property: Method used to authenticate against the event hub endpoint.
     *
     * @return the authenticationType value.
     */
    public AuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Method used to authenticate against the event hub endpoint.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the identity property: Managed identity properties of routing event hub endpoint.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed identity properties of routing event hub endpoint.
     *
     * @param identity the identity value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name that identifies this endpoint. The name can only include alphanumeric characters,
     * periods, underscores, hyphens and has a maximum length of 64 characters. The following names are reserved:
     * events, fileNotifications, $default. Endpoint names must be unique across endpoint types.
     *
     * @param name the name value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription identifier of the event hub endpoint.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription identifier of the event hub endpoint.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: The name of the resource group of the event hub endpoint.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: The name of the resource group of the event hub endpoint.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the RoutingEventHubProperties object itself.
     */
    public RoutingEventHubProperties withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model RoutingEventHubProperties"));
        }
    }
}
