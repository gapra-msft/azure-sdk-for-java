// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.fluent.models.PolicyDefinitionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PolicyDefinitionsClient. */
public interface PolicyDefinitionsClient {
    /**
     * This operation creates or updates a policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param parameters The policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicyDefinitionInner>> createOrUpdateWithResponseAsync(
        String policyDefinitionName, PolicyDefinitionInner parameters);

    /**
     * This operation creates or updates a policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param parameters The policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicyDefinitionInner> createOrUpdateAsync(String policyDefinitionName, PolicyDefinitionInner parameters);

    /**
     * This operation creates or updates a policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param parameters The policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner createOrUpdate(String policyDefinitionName, PolicyDefinitionInner parameters);

    /**
     * This operation creates or updates a policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param parameters The policy definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> createOrUpdateWithResponse(
        String policyDefinitionName, PolicyDefinitionInner parameters, Context context);

    /**
     * This operation deletes the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String policyDefinitionName);

    /**
     * This operation deletes the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String policyDefinitionName);

    /**
     * This operation deletes the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String policyDefinitionName);

    /**
     * This operation deletes the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String policyDefinitionName, Context context);

    /**
     * This operation retrieves the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicyDefinitionInner>> getWithResponseAsync(String policyDefinitionName);

    /**
     * This operation retrieves the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicyDefinitionInner> getAsync(String policyDefinitionName);

    /**
     * This operation retrieves the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner get(String policyDefinitionName);

    /**
     * This operation retrieves the policy definition in the given subscription with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> getWithResponse(String policyDefinitionName, Context context);

    /**
     * This operation retrieves the built-in policy definition with the given name.
     *
     * @param policyDefinitionName The name of the built-in policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicyDefinitionInner>> getBuiltInWithResponseAsync(String policyDefinitionName);

    /**
     * This operation retrieves the built-in policy definition with the given name.
     *
     * @param policyDefinitionName The name of the built-in policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicyDefinitionInner> getBuiltInAsync(String policyDefinitionName);

    /**
     * This operation retrieves the built-in policy definition with the given name.
     *
     * @param policyDefinitionName The name of the built-in policy definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner getBuiltIn(String policyDefinitionName);

    /**
     * This operation retrieves the built-in policy definition with the given name.
     *
     * @param policyDefinitionName The name of the built-in policy definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> getBuiltInWithResponse(String policyDefinitionName, Context context);

    /**
     * This operation creates or updates a policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicyDefinitionInner>> createOrUpdateAtManagementGroupWithResponseAsync(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters);

    /**
     * This operation creates or updates a policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicyDefinitionInner> createOrUpdateAtManagementGroupAsync(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters);

    /**
     * This operation creates or updates a policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner createOrUpdateAtManagementGroup(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters);

    /**
     * This operation creates or updates a policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> createOrUpdateAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters, Context context);

    /**
     * This operation deletes the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteAtManagementGroupWithResponseAsync(
        String policyDefinitionName, String managementGroupId);

    /**
     * This operation deletes the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAtManagementGroupAsync(String policyDefinitionName, String managementGroupId);

    /**
     * This operation deletes the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAtManagementGroup(String policyDefinitionName, String managementGroupId);

    /**
     * This operation deletes the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to delete.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, Context context);

    /**
     * This operation retrieves the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicyDefinitionInner>> getAtManagementGroupWithResponseAsync(
        String policyDefinitionName, String managementGroupId);

    /**
     * This operation retrieves the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicyDefinitionInner> getAtManagementGroupAsync(String policyDefinitionName, String managementGroupId);

    /**
     * This operation retrieves the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDefinitionInner getAtManagementGroup(String policyDefinitionName, String managementGroupId);

    /**
     * This operation retrieves the policy definition in the given management group with the given name.
     *
     * @param policyDefinitionName The name of the policy definition to get.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDefinitionInner> getAtManagementGroupWithResponse(
        String policyDefinitionName, String managementGroupId, Context context);

    /**
     * This operation retrieves a list of all the policy definitions in a given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PolicyDefinitionInner> listAsync();

    /**
     * This operation retrieves a list of all the policy definitions in a given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> list();

    /**
     * This operation retrieves a list of all the policy definitions in a given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> list(Context context);

    /**
     * This operation retrieves a list of all the built-in policy definitions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PolicyDefinitionInner> listBuiltInAsync();

    /**
     * This operation retrieves a list of all the built-in policy definitions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> listBuiltIn();

    /**
     * This operation retrieves a list of all the built-in policy definitions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> listBuiltIn(Context context);

    /**
     * This operation retrieves a list of all the policy definitions in a given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PolicyDefinitionInner> listByManagementGroupAsync(String managementGroupId);

    /**
     * This operation retrieves a list of all the policy definitions in a given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> listByManagementGroup(String managementGroupId);

    /**
     * This operation retrieves a list of all the policy definitions in a given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicyDefinitionInner> listByManagementGroup(String managementGroupId, Context context);
}
