// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

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
import com.azure.resourcemanager.network.fluent.LoadBalancerLoadBalancingRulesClient;
import com.azure.resourcemanager.network.fluent.models.LoadBalancingRuleInner;
import com.azure.resourcemanager.network.models.LoadBalancerLoadBalancingRuleListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LoadBalancerLoadBalancingRulesClient. */
public final class LoadBalancerLoadBalancingRulesClientImpl implements LoadBalancerLoadBalancingRulesClient {
    private final ClientLogger logger = new ClientLogger(LoadBalancerLoadBalancingRulesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final LoadBalancerLoadBalancingRulesService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LoadBalancerLoadBalancingRulesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LoadBalancerLoadBalancingRulesClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    LoadBalancerLoadBalancingRulesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientLoadBalancerLoadBalancingRules to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface LoadBalancerLoadBalancingRulesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/loadBalancers/{loadBalancerName}/loadBalancingRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LoadBalancerLoadBalancingRuleListResult>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/loadBalancers/{loadBalancerName}/loadBalancingRules/{loadBalancingRuleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LoadBalancingRuleInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @PathParam("loadBalancingRuleName") String loadBalancingRuleName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LoadBalancerLoadBalancingRuleListResult>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LoadBalancingRuleInner>> listSinglePageAsync(
        String resourceGroupName, String loadBalancerName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (loadBalancerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            loadBalancerName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<LoadBalancingRuleInner>>map(
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
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LoadBalancingRuleInner>> listSinglePageAsync(
        String resourceGroupName, String loadBalancerName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (loadBalancerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                loadBalancerName,
                apiVersion,
                this.client.getSubscriptionId(),
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
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LoadBalancingRuleInner> listAsync(String resourceGroupName, String loadBalancerName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, loadBalancerName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LoadBalancingRuleInner> listAsync(
        String resourceGroupName, String loadBalancerName, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, loadBalancerName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LoadBalancingRuleInner> list(String resourceGroupName, String loadBalancerName) {
        return new PagedIterable<>(listAsync(resourceGroupName, loadBalancerName));
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancing rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LoadBalancingRuleInner> list(
        String resourceGroupName, String loadBalancerName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, loadBalancerName, context));
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LoadBalancingRuleInner>> getWithResponseAsync(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (loadBalancerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null."));
        }
        if (loadBalancingRuleName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancingRuleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            loadBalancerName,
                            loadBalancingRuleName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LoadBalancingRuleInner>> getWithResponseAsync(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (loadBalancerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null."));
        }
        if (loadBalancingRuleName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter loadBalancingRuleName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2020-05-01";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                loadBalancerName,
                loadBalancingRuleName,
                apiVersion,
                this.client.getSubscriptionId(),
                context);
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LoadBalancingRuleInner> getAsync(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        return getWithResponseAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName)
            .flatMap(
                (Response<LoadBalancingRuleInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LoadBalancingRuleInner get(String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        return getAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName).block();
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer load balancing rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LoadBalancingRuleInner> getWithResponse(
        String resourceGroupName, String loadBalancerName, String loadBalancingRuleName, Context context) {
        return getWithResponseAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListLoadBalancingRule API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LoadBalancingRuleInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<LoadBalancingRuleInner>>map(
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
     * @return response for ListLoadBalancingRule API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LoadBalancingRuleInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
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
