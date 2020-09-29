// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.implementation;

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
import com.azure.resourcemanager.containerinstance.fluent.LocationsClient;
import com.azure.resourcemanager.containerinstance.fluent.models.UsageInner;
import com.azure.resourcemanager.containerinstance.models.CachedImages;
import com.azure.resourcemanager.containerinstance.models.CachedImagesListResult;
import com.azure.resourcemanager.containerinstance.models.Capabilities;
import com.azure.resourcemanager.containerinstance.models.CapabilitiesListResult;
import com.azure.resourcemanager.containerinstance.models.UsageListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LocationsClient. */
public final class LocationsClientImpl implements LocationsClient {
    private final ClientLogger logger = new ClientLogger(LocationsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LocationsService service;

    /** The service client containing this operation class. */
    private final ContainerInstanceManagementClientImpl client;

    /**
     * Initializes an instance of LocationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LocationsClientImpl(ContainerInstanceManagementClientImpl client) {
        this.service =
            RestProxy.create(LocationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerInstanceManagementClientLocations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ContainerInstanceMan")
    private interface LocationsService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ContainerInstance/locations/{location}/usages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UsageListResult>> listUsage(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ContainerInstance/locations/{location}/cachedImages")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CachedImagesListResult>> listCachedImages(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ContainerInstance/locations/{location}/capabilities")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CapabilitiesListResult>> listCapabilities(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CachedImagesListResult>> listCachedImagesNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CapabilitiesListResult>> listCapabilitiesNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the usage for a subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listUsageSinglePageAsync(String location) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listUsage(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<UsageInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the usage for a subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<UsageInner>> listUsageSinglePageAsync(String location, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listUsage(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the usage for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<UsageInner> listUsageAsync(String location) {
        return new PagedFlux<>(() -> listUsageSinglePageAsync(location));
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the usage for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<UsageInner> listUsageAsync(String location, Context context) {
        return new PagedFlux<>(() -> listUsageSinglePageAsync(location, context));
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the usage for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> listUsage(String location) {
        return new PagedIterable<>(listUsageAsync(location));
    }

    /**
     * Get the usage for a subscription.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the usage for a subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<UsageInner> listUsage(String location, Context context) {
        return new PagedIterable<>(listUsageAsync(location, context));
    }

    /**
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cached images on specific OS type for a subscription in a region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CachedImages>> listCachedImagesSinglePageAsync(String location) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listCachedImages(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<CachedImages>>map(
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
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cached images on specific OS type for a subscription in a region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CachedImages>> listCachedImagesSinglePageAsync(String location, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listCachedImages(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                context)
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
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cached images on specific OS type for a subscription in a region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<CachedImages> listCachedImagesAsync(String location) {
        return new PagedFlux<>(
            () -> listCachedImagesSinglePageAsync(location), nextLink -> listCachedImagesNextSinglePageAsync(nextLink));
    }

    /**
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cached images on specific OS type for a subscription in a region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<CachedImages> listCachedImagesAsync(String location, Context context) {
        return new PagedFlux<>(
            () -> listCachedImagesSinglePageAsync(location, context),
            nextLink -> listCachedImagesNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cached images on specific OS type for a subscription in a region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CachedImages> listCachedImages(String location) {
        return new PagedIterable<>(listCachedImagesAsync(location));
    }

    /**
     * Get the list of cached images on specific OS type for a subscription in a region.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of cached images on specific OS type for a subscription in a region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<CachedImages> listCachedImages(String location, Context context) {
        return new PagedIterable<>(listCachedImagesAsync(location, context));
    }

    /**
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CPU/memory/GPU capabilities of a region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<Capabilities>> listCapabilitiesSinglePageAsync(String location) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listCapabilities(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            context))
            .<PagedResponse<Capabilities>>map(
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
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CPU/memory/GPU capabilities of a region.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<Capabilities>> listCapabilitiesSinglePageAsync(String location, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listCapabilities(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                context)
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
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CPU/memory/GPU capabilities of a region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<Capabilities> listCapabilitiesAsync(String location) {
        return new PagedFlux<>(
            () -> listCapabilitiesSinglePageAsync(location), nextLink -> listCapabilitiesNextSinglePageAsync(nextLink));
    }

    /**
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CPU/memory/GPU capabilities of a region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<Capabilities> listCapabilitiesAsync(String location, Context context) {
        return new PagedFlux<>(
            () -> listCapabilitiesSinglePageAsync(location, context),
            nextLink -> listCapabilitiesNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CPU/memory/GPU capabilities of a region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Capabilities> listCapabilities(String location) {
        return new PagedIterable<>(listCapabilitiesAsync(location));
    }

    /**
     * Get the list of CPU/memory/GPU capabilities of a region.
     *
     * @param location The identifier for the physical azure location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of CPU/memory/GPU capabilities of a region.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<Capabilities> listCapabilities(String location, Context context) {
        return new PagedIterable<>(listCapabilitiesAsync(location, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response containing cached images.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CachedImages>> listCachedImagesNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listCachedImagesNext(nextLink, context))
            .<PagedResponse<CachedImages>>map(
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
     * @return the response containing cached images.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<CachedImages>> listCachedImagesNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listCachedImagesNext(nextLink, context)
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
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response containing list of capabilities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<Capabilities>> listCapabilitiesNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listCapabilitiesNext(nextLink, context))
            .<PagedResponse<Capabilities>>map(
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
     * @return the response containing list of capabilities.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<Capabilities>> listCapabilitiesNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listCapabilitiesNext(nextLink, context)
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
