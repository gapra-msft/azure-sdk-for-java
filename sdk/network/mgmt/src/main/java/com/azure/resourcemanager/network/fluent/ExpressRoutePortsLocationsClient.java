// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.NetworkManagementClient;
import com.azure.resourcemanager.network.fluent.inner.ExpressRoutePortsLocationInner;
import com.azure.resourcemanager.network.fluent.inner.ExpressRoutePortsLocationListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExpressRoutePortsLocations. */
public final class ExpressRoutePortsLocationsClient {
    private final ClientLogger logger = new ClientLogger(ExpressRoutePortsLocationsClient.class);

    /** The proxy service used to perform REST calls. */
    private final ExpressRoutePortsLocationsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClient client;

    /**
     * Initializes an instance of ExpressRoutePortsLocationsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ExpressRoutePortsLocationsClient(NetworkManagementClient client) {
        this.service =
            RestProxy
                .create(
                    ExpressRoutePortsLocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientExpressRoutePortsLocations to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface ExpressRoutePortsLocationsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/ExpressRoutePortsLocations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExpressRoutePortsLocationListResultInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/ExpressRoutePortsLocations/{locationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExpressRoutePortsLocationInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("locationName") String locationName,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExpressRoutePortsLocationListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRoutePortsLocations API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRoutePortsLocationInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-11-01";
        return FluxUtil
            .withContext(
                context ->
                    service.list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, context))
            .<PagedResponse<ExpressRoutePortsLocationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRoutePortsLocations API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRoutePortsLocationInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-11-01";
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRoutePortsLocations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExpressRoutePortsLocationInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync(), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRoutePortsLocations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ExpressRoutePortsLocationInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRoutePortsLocations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRoutePortsLocationInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRoutePortsLocations API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ExpressRoutePortsLocationInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the ExpressRoutePorts peering location resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ExpressRoutePortsLocationInner>> getWithResponseAsync(String locationName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        final String apiVersion = "2019-11-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            apiVersion,
                            locationName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the ExpressRoutePorts peering location resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ExpressRoutePortsLocationInner>> getWithResponseAsync(String locationName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (locationName == null) {
            return Mono.error(new IllegalArgumentException("Parameter locationName is required and cannot be null."));
        }
        final String apiVersion = "2019-11-01";
        return service
            .get(this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, locationName, context);
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the ExpressRoutePorts peering location resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRoutePortsLocationInner> getAsync(String locationName) {
        return getWithResponseAsync(locationName)
            .flatMap(
                (Response<ExpressRoutePortsLocationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the ExpressRoutePorts peering location resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ExpressRoutePortsLocationInner> getAsync(String locationName, Context context) {
        return getWithResponseAsync(locationName, context)
            .flatMap(
                (Response<ExpressRoutePortsLocationInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the ExpressRoutePorts peering location resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRoutePortsLocationInner get(String locationName) {
        return getAsync(locationName).block();
    }

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     *
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the ExpressRoutePorts peering location resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExpressRoutePortsLocationInner get(String locationName, Context context) {
        return getAsync(locationName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRoutePortsLocations API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRoutePortsLocationInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<ExpressRoutePortsLocationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRoutePortsLocations API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ExpressRoutePortsLocationInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
