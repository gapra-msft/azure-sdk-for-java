// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.DatabaseAutomaticTuningInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DatabaseAutomaticTuningsClient. */
public interface DatabaseAutomaticTuningsClient {
    /**
     * Gets a database's automatic tuning.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's automatic tuning.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DatabaseAutomaticTuningInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database's automatic tuning.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's automatic tuning.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DatabaseAutomaticTuningInner> getAsync(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database's automatic tuning.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's automatic tuning.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseAutomaticTuningInner get(String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a database's automatic tuning.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's automatic tuning.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabaseAutomaticTuningInner> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, Context context);

    /**
     * Update automatic tuning properties for target database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters Database-level Automatic Tuning.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database-level Automatic Tuning.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DatabaseAutomaticTuningInner>> updateWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters);

    /**
     * Update automatic tuning properties for target database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters Database-level Automatic Tuning.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database-level Automatic Tuning.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DatabaseAutomaticTuningInner> updateAsync(
        String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters);

    /**
     * Update automatic tuning properties for target database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters Database-level Automatic Tuning.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database-level Automatic Tuning.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseAutomaticTuningInner update(
        String resourceGroupName, String serverName, String databaseName, DatabaseAutomaticTuningInner parameters);

    /**
     * Update automatic tuning properties for target database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters Database-level Automatic Tuning.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return database-level Automatic Tuning.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabaseAutomaticTuningInner> updateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        DatabaseAutomaticTuningInner parameters,
        Context context);
}
