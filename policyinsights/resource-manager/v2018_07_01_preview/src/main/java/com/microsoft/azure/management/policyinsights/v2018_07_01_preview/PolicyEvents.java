/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2018_07_01_preview;

import rx.Observable;

/**
 * Type representing PolicyEvents.
 */
public interface PolicyEvents {
    /**
     * Queries policy events for the resources under the management group.
     *
     * @param managementGroupName Management group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyEvent> listQueryResultsForManagementGroupAsync(final String managementGroupName);

    /**
     * Queries policy events for the resources under the subscription.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyEvent> listQueryResultsForSubscriptionAsync(final String subscriptionId);

    /**
     * Queries policy events for the resources under the resource group.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyEvent> listQueryResultsForResourceGroupAsync(final String subscriptionId, final String resourceGroupName);

    /**
     * Queries policy events for the resource.
     *
     * @param resourceId Resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyEvent> listQueryResultsForResourceAsync(final String resourceId);

    /**
     * Queries policy events for the subscription level policy set definition.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policySetDefinitionName Policy set definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyEvent> listQueryResultsForPolicySetDefinitionAsync(final String subscriptionId, final String policySetDefinitionName);

    /**
     * Queries policy events for the subscription level policy definition.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyDefinitionName Policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyEvent> listQueryResultsForPolicyDefinitionAsync(final String subscriptionId, final String policyDefinitionName);

    /**
     * Queries policy events for the subscription level policy assignment.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyAssignmentName Policy assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyEvent> listQueryResultsForSubscriptionLevelPolicyAssignmentAsync(final String subscriptionId, final String policyAssignmentName);

    /**
     * Queries policy events for the resource group level policy assignment.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param policyAssignmentName Policy assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyEvent> listQueryResultsForResourceGroupLevelPolicyAssignmentAsync(final String subscriptionId, final String resourceGroupName, final String policyAssignmentName);

    /**
     * Gets OData metadata XML document.
     *
     * @param scope A valid scope, i.e. management group, subscription, resource group, or resource ID. Scope used has no effect on metadata returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<String> getMetadataAsync(String scope);

}
