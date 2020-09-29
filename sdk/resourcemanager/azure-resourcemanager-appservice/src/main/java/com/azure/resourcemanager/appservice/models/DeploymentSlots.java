// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.AppServiceManager;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingById;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingByName;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasManager;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasParent;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsCreating;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsDeletingById;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsDeletingByName;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsListing;

/** Entry point for Azure web app deployment slot management API. */
@Fluent
public interface DeploymentSlots
    extends SupportsCreating<DeploymentSlot.DefinitionStages.Blank>,
        SupportsListing<WebDeploymentSlotBasic>,
        SupportsGettingByName<DeploymentSlot>,
        SupportsGettingById<DeploymentSlot>,
        SupportsDeletingById,
        SupportsDeletingByName,
        HasManager<AppServiceManager>,
        HasParent<WebApp> {
}
