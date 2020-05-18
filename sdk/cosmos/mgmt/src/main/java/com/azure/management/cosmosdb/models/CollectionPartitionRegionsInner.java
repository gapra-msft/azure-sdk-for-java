// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CollectionPartitionRegions. */
public final class CollectionPartitionRegionsInner {
    private final ClientLogger logger = new ClientLogger(CollectionPartitionRegionsInner.class);

    /** The proxy service used to perform REST calls. */
    private final CollectionPartitionRegionsService service;

    /** The service client containing this operation class. */
    private final CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of CollectionPartitionRegionsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CollectionPartitionRegionsInner(CosmosDBManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    CollectionPartitionRegionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientCollectionPartitionRegions to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    private interface CollectionPartitionRegionsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB"
                + "/databaseAccounts/{accountName}/region/{region}/databases/{databaseRid}/collections"
                + "/{collectionRid}/partitions/metrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<SimpleResponse<PartitionMetricListResultInner>> listMetrics(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("accountName") String accountName,
            @PathParam("region") String region,
            @PathParam("databaseRid") String databaseRid,
            @PathParam("collectionRid") String collectionRid,
            @QueryParam("api-version") String apiVersion,
            @QueryParam("$filter") String filter,
            Context context);
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection and region, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PartitionMetricInner>> listMetricsSinglePageAsync(
        String resourceGroupName,
        String accountName,
        String region,
        String databaseRid,
        String collectionRid,
        String filter) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (region == null) {
            return Mono.error(new IllegalArgumentException("Parameter region is required and cannot be null."));
        }
        if (databaseRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseRid is required and cannot be null."));
        }
        if (collectionRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter collectionRid is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listMetrics(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            accountName,
                            region,
                            databaseRid,
                            collectionRid,
                            apiVersion,
                            filter,
                            context))
            .<PagedResponse<PartitionMetricInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection and region, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PartitionMetricInner>> listMetricsSinglePageAsync(
        String resourceGroupName,
        String accountName,
        String region,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        if (this.client.getHost() == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (region == null) {
            return Mono.error(new IllegalArgumentException("Parameter region is required and cannot be null."));
        }
        if (databaseRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseRid is required and cannot be null."));
        }
        if (collectionRid == null) {
            return Mono.error(new IllegalArgumentException("Parameter collectionRid is required and cannot be null."));
        }
        if (filter == null) {
            return Mono.error(new IllegalArgumentException("Parameter filter is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01";
        return service
            .listMetrics(
                this.client.getHost(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                accountName,
                region,
                databaseRid,
                collectionRid,
                apiVersion,
                filter,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection and region, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PartitionMetricInner> listMetricsAsync(
        String resourceGroupName,
        String accountName,
        String region,
        String databaseRid,
        String collectionRid,
        String filter) {
        return new PagedFlux<>(
            () ->
                listMetricsSinglePageAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, filter));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection and region, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PartitionMetricInner> listMetricsAsync(
        String resourceGroupName,
        String accountName,
        String region,
        String databaseRid,
        String collectionRid,
        String filter,
        Context context) {
        return new PagedFlux<>(
            () ->
                listMetricsSinglePageAsync(
                    resourceGroupName, accountName, region, databaseRid, collectionRid, filter, context));
    }

    /**
     * Retrieves the metrics determined by the given filter for the given collection and region, split by partition.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Cosmos DB database account name.
     * @param region Cosmos DB region, with spaces between words and each word capitalized.
     * @param databaseRid Cosmos DB database rid.
     * @param collectionRid Cosmos DB collection rid.
     * @param filter An OData filter expression that describes a subset of metrics to return. The parameters that can be
     *     filtered are name.value (name of the metric, can have an or of multiple names), startTime, endTime, and
     *     timeGrain. The supported operator is eq.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list partition metrics request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PartitionMetricInner> listMetrics(
        String resourceGroupName,
        String accountName,
        String region,
        String databaseRid,
        String collectionRid,
        String filter) {
        return new PagedIterable<>(
            listMetricsAsync(resourceGroupName, accountName, region, databaseRid, collectionRid, filter));
    }
}
