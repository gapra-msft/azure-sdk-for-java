/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2020_06_01.implementation.SecurityRuleInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkSecurityGroupInner;

/**
 * Type representing NetworkSecurityGroup.
 */
public interface NetworkSecurityGroup extends HasInner<NetworkSecurityGroupInner>, Resource, GroupableResourceCore<NetworkManager, NetworkSecurityGroupInner>, HasResourceGroup, Refreshable<NetworkSecurityGroup>, Updatable<NetworkSecurityGroup.Update>, HasManager<NetworkManager> {
    /**
     * @return the defaultSecurityRules value.
     */
    List<NetworkSecurityGroupSecurityRule> defaultSecurityRules();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the flowLogs value.
     */
    List<FlowLog> flowLogs();

    /**
     * @return the networkInterfaces value.
     */
    List<NetworkInterface> networkInterfaces();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the securityRules value.
     */
    List<NetworkSecurityGroupSecurityRule> securityRules();

    /**
     * @return the subnets value.
     */
    List<Subnet> subnets();

    /**
     * The entirety of the NetworkSecurityGroup definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NetworkSecurityGroup definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NetworkSecurityGroup definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the NetworkSecurityGroup definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the networksecuritygroup definition allowing to specify SecurityRules.
         */
        interface WithSecurityRules {
            /**
             * Specifies securityRules.
             * @param securityRules A collection of security rules of the network security group
             * @return the next definition stage
             */
            WithCreate withSecurityRules(List<SecurityRuleInner> securityRules);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NetworkSecurityGroup>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithSecurityRules {
        }
    }
    /**
     * The template for a NetworkSecurityGroup update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NetworkSecurityGroup>, Resource.UpdateWithTags<Update>, UpdateStages.WithSecurityRules {
    }

    /**
     * Grouping of NetworkSecurityGroup update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the networksecuritygroup update allowing to specify SecurityRules.
         */
        interface WithSecurityRules {
            /**
             * Specifies securityRules.
             * @param securityRules A collection of security rules of the network security group
             * @return the next update stage
             */
            Update withSecurityRules(List<SecurityRuleInner> securityRules);
        }

    }
}
