/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.LogicManager;
import org.joda.time.DateTime;
import java.util.Map;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.WorkflowInner;

/**
 * Type representing Workflow.
 */
public interface Workflow extends HasInner<WorkflowInner>, Resource, GroupableResourceCore<LogicManager, WorkflowInner>, HasResourceGroup, Refreshable<Workflow>, Updatable<Workflow.Update>, HasManager<LogicManager> {
    /**
     * @return the accessEndpoint value.
     */
    String accessEndpoint();

    /**
     * @return the changedTime value.
     */
    DateTime changedTime();

    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the definition value.
     */
    Object definition();

    /**
     * @return the integrationAccount value.
     */
    ResourceReference integrationAccount();

    /**
     * @return the parameters value.
     */
    Map<String, WorkflowParameter> parameters();

    /**
     * @return the provisioningState value.
     */
    WorkflowProvisioningState provisioningState();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the state value.
     */
    WorkflowState state();

    /**
     * @return the version value.
     */
    String version();

    /**
     * The entirety of the Workflow definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Workflow definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Workflow definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Workflow definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the workflow definition allowing to specify Definition.
         */
        interface WithDefinition {
            /**
             * Specifies definition.
             * @param definition The definition. See [Schema reference for Workflow Definition Language in Azure Logic Apps](https://docs.microsoft.com/azure/logic-apps/logic-apps-workflow-definition-language)
             * @return the next definition stage
             */
            WithCreate withDefinition(Object definition);
        }

        /**
         * The stage of the workflow definition allowing to specify IntegrationAccount.
         */
        interface WithIntegrationAccount {
            /**
             * Specifies integrationAccount.
             * @param integrationAccount The integration account
             * @return the next definition stage
             */
            WithCreate withIntegrationAccount(ResourceReference integrationAccount);
        }

        /**
         * The stage of the workflow definition allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             * @param parameters The parameters
             * @return the next definition stage
             */
            WithCreate withParameters(Map<String, WorkflowParameter> parameters);
        }

        /**
         * The stage of the workflow definition allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku
             * @return the next definition stage
             */
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the workflow definition allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state The state. Possible values include: 'NotSpecified', 'Completed', 'Enabled', 'Disabled', 'Deleted', 'Suspended'
             * @return the next definition stage
             */
            WithCreate withState(WorkflowState state);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Workflow>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDefinition, DefinitionStages.WithIntegrationAccount, DefinitionStages.WithParameters, DefinitionStages.WithSku, DefinitionStages.WithState {
        }
    }
    /**
     * The template for a Workflow update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Workflow>, Resource.UpdateWithTags<Update>, UpdateStages.WithDefinition, UpdateStages.WithIntegrationAccount, UpdateStages.WithParameters, UpdateStages.WithSku, UpdateStages.WithState {
    }

    /**
     * Grouping of Workflow update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the workflow update allowing to specify Definition.
         */
        interface WithDefinition {
            /**
             * Specifies definition.
             * @param definition The definition. See [Schema reference for Workflow Definition Language in Azure Logic Apps](https://docs.microsoft.com/azure/logic-apps/logic-apps-workflow-definition-language)
             * @return the next update stage
             */
            Update withDefinition(Object definition);
        }

        /**
         * The stage of the workflow update allowing to specify IntegrationAccount.
         */
        interface WithIntegrationAccount {
            /**
             * Specifies integrationAccount.
             * @param integrationAccount The integration account
             * @return the next update stage
             */
            Update withIntegrationAccount(ResourceReference integrationAccount);
        }

        /**
         * The stage of the workflow update allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             * @param parameters The parameters
             * @return the next update stage
             */
            Update withParameters(Map<String, WorkflowParameter> parameters);
        }

        /**
         * The stage of the workflow update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The sku
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the workflow update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             * @param state The state. Possible values include: 'NotSpecified', 'Completed', 'Enabled', 'Disabled', 'Deleted', 'Suspended'
             * @return the next update stage
             */
            Update withState(WorkflowState state);
        }

    }
}
