// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.EndpointServiceResultInner;

/** An instance of this class provides access to all the operations defined in AvailableEndpointServicesClient. */
public interface AvailableEndpointServicesClient {
    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListAvailableEndpointServices API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<EndpointServiceResultInner> listAsync(String location);

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListAvailableEndpointServices API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EndpointServiceResultInner> list(String location);

    /**
     * List what values of endpoint services are available for use.
     *
     * @param location The location to check available endpoint services.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the ListAvailableEndpointServices API service call.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EndpointServiceResultInner> list(String location, Context context);
}
