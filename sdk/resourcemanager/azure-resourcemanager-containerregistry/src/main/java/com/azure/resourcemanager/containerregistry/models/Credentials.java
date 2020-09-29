// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters that describes a set of credentials that will be used when a run is invoked. */
@Fluent
public final class Credentials {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Credentials.class);

    /*
     * Describes the credential parameters for accessing the source registry.
     */
    @JsonProperty(value = "sourceRegistry")
    private SourceRegistryCredentials sourceRegistry;

    /*
     * Describes the credential parameters for accessing other custom
     * registries. The key
     * for the dictionary item will be the registry login server
     * (myregistry.azurecr.io) and
     * the value of the item will be the registry credentials for accessing the
     * registry.
     */
    @JsonProperty(value = "customRegistries")
    private Map<String, CustomRegistryCredentials> customRegistries;

    /**
     * Get the sourceRegistry property: Describes the credential parameters for accessing the source registry.
     *
     * @return the sourceRegistry value.
     */
    public SourceRegistryCredentials sourceRegistry() {
        return this.sourceRegistry;
    }

    /**
     * Set the sourceRegistry property: Describes the credential parameters for accessing the source registry.
     *
     * @param sourceRegistry the sourceRegistry value to set.
     * @return the Credentials object itself.
     */
    public Credentials withSourceRegistry(SourceRegistryCredentials sourceRegistry) {
        this.sourceRegistry = sourceRegistry;
        return this;
    }

    /**
     * Get the customRegistries property: Describes the credential parameters for accessing other custom registries. The
     * key for the dictionary item will be the registry login server (myregistry.azurecr.io) and the value of the item
     * will be the registry credentials for accessing the registry.
     *
     * @return the customRegistries value.
     */
    public Map<String, CustomRegistryCredentials> customRegistries() {
        return this.customRegistries;
    }

    /**
     * Set the customRegistries property: Describes the credential parameters for accessing other custom registries. The
     * key for the dictionary item will be the registry login server (myregistry.azurecr.io) and the value of the item
     * will be the registry credentials for accessing the registry.
     *
     * @param customRegistries the customRegistries value to set.
     * @return the Credentials object itself.
     */
    public Credentials withCustomRegistries(Map<String, CustomRegistryCredentials> customRegistries) {
        this.customRegistries = customRegistries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceRegistry() != null) {
            sourceRegistry().validate();
        }
        if (customRegistries() != null) {
            customRegistries()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
