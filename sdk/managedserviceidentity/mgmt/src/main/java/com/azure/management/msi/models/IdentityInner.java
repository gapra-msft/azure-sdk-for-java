// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.msi.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The Identity model. */
@JsonFlatten
@Immutable
public class IdentityInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IdentityInner.class);

    /*
     * The id of the tenant which the identity belongs to.
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /*
     * The id of the service principal object associated with the created
     * identity.
     */
    @JsonProperty(value = "properties.principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /*
     * The id of the app associated with the identity. This is a random
     * generated UUID by MSI.
     */
    @JsonProperty(value = "properties.clientId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID clientId;

    /**
     * Get the tenantId property: The id of the tenant which the identity belongs to.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the principalId property: The id of the service principal object associated with the created identity.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the clientId property: The id of the app associated with the identity. This is a random generated UUID by
     * MSI.
     *
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.clientId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
