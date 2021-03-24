// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.OpenidConnectProviderContractInner;

/** An immutable client-side representation of OpenidConnectProviderContract. */
public interface OpenidConnectProviderContract {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the displayName property: User-friendly OpenID Connect Provider name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the description property: User-friendly description of OpenID Connect Provider.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the metadataEndpoint property: Metadata endpoint URI.
     *
     * @return the metadataEndpoint value.
     */
    String metadataEndpoint();

    /**
     * Gets the clientId property: Client ID of developer console which is the client application.
     *
     * @return the clientId value.
     */
    String clientId();

    /**
     * Gets the clientSecret property: Client Secret of developer console which is the client application.
     *
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.OpenidConnectProviderContractInner object.
     *
     * @return the inner object.
     */
    OpenidConnectProviderContractInner innerModel();

    /** The entirety of the OpenidConnectProviderContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The OpenidConnectProviderContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the OpenidConnectProviderContract definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the OpenidConnectProviderContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param serviceName The name of the API Management service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }
        /**
         * The stage of the OpenidConnectProviderContract definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDisplayName,
                DefinitionStages.WithDescription,
                DefinitionStages.WithMetadataEndpoint,
                DefinitionStages.WithClientId,
                DefinitionStages.WithClientSecret,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            OpenidConnectProviderContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            OpenidConnectProviderContract create(Context context);
        }
        /** The stage of the OpenidConnectProviderContract definition allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: User-friendly OpenID Connect Provider name..
             *
             * @param displayName User-friendly OpenID Connect Provider name.
             * @return the next definition stage.
             */
            WithCreate withDisplayName(String displayName);
        }
        /** The stage of the OpenidConnectProviderContract definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: User-friendly description of OpenID Connect Provider..
             *
             * @param description User-friendly description of OpenID Connect Provider.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the OpenidConnectProviderContract definition allowing to specify metadataEndpoint. */
        interface WithMetadataEndpoint {
            /**
             * Specifies the metadataEndpoint property: Metadata endpoint URI..
             *
             * @param metadataEndpoint Metadata endpoint URI.
             * @return the next definition stage.
             */
            WithCreate withMetadataEndpoint(String metadataEndpoint);
        }
        /** The stage of the OpenidConnectProviderContract definition allowing to specify clientId. */
        interface WithClientId {
            /**
             * Specifies the clientId property: Client ID of developer console which is the client application..
             *
             * @param clientId Client ID of developer console which is the client application.
             * @return the next definition stage.
             */
            WithCreate withClientId(String clientId);
        }
        /** The stage of the OpenidConnectProviderContract definition allowing to specify clientSecret. */
        interface WithClientSecret {
            /**
             * Specifies the clientSecret property: Client Secret of developer console which is the client application..
             *
             * @param clientSecret Client Secret of developer console which is the client application.
             * @return the next definition stage.
             */
            WithCreate withClientSecret(String clientSecret);
        }
        /** The stage of the OpenidConnectProviderContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the OpenidConnectProviderContract resource.
     *
     * @return the stage of resource update.
     */
    OpenidConnectProviderContract.Update update();

    /** The template for OpenidConnectProviderContract update. */
    interface Update
        extends UpdateStages.WithDisplayName,
            UpdateStages.WithDescription,
            UpdateStages.WithMetadataEndpoint,
            UpdateStages.WithClientId,
            UpdateStages.WithClientSecret,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        OpenidConnectProviderContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        OpenidConnectProviderContract apply(Context context);
    }
    /** The OpenidConnectProviderContract update stages. */
    interface UpdateStages {
        /** The stage of the OpenidConnectProviderContract update allowing to specify displayName. */
        interface WithDisplayName {
            /**
             * Specifies the displayName property: User-friendly OpenID Connect Provider name..
             *
             * @param displayName User-friendly OpenID Connect Provider name.
             * @return the next definition stage.
             */
            Update withDisplayName(String displayName);
        }
        /** The stage of the OpenidConnectProviderContract update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: User-friendly description of OpenID Connect Provider..
             *
             * @param description User-friendly description of OpenID Connect Provider.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the OpenidConnectProviderContract update allowing to specify metadataEndpoint. */
        interface WithMetadataEndpoint {
            /**
             * Specifies the metadataEndpoint property: Metadata endpoint URI..
             *
             * @param metadataEndpoint Metadata endpoint URI.
             * @return the next definition stage.
             */
            Update withMetadataEndpoint(String metadataEndpoint);
        }
        /** The stage of the OpenidConnectProviderContract update allowing to specify clientId. */
        interface WithClientId {
            /**
             * Specifies the clientId property: Client ID of developer console which is the client application..
             *
             * @param clientId Client ID of developer console which is the client application.
             * @return the next definition stage.
             */
            Update withClientId(String clientId);
        }
        /** The stage of the OpenidConnectProviderContract update allowing to specify clientSecret. */
        interface WithClientSecret {
            /**
             * Specifies the clientSecret property: Client Secret of developer console which is the client application..
             *
             * @param clientSecret Client Secret of developer console which is the client application.
             * @return the next definition stage.
             */
            Update withClientSecret(String clientSecret);
        }
        /** The stage of the OpenidConnectProviderContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    OpenidConnectProviderContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    OpenidConnectProviderContract refresh(Context context);

    /**
     * Gets the client secret details of the OpenID Connect Provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the client secret details of the OpenID Connect Provider.
     */
    ClientSecretContract listSecrets();

    /**
     * Gets the client secret details of the OpenID Connect Provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the client secret details of the OpenID Connect Provider.
     */
    Response<ClientSecretContract> listSecretsWithResponse(Context context);
}
