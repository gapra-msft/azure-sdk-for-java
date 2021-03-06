/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.LogicManager;
import com.microsoft.azure.management.logic.v2018_07_01_preview.implementation.CallbackUrlInner;

/**
 * Type representing CallbackUrl.
 */
public interface CallbackUrl extends HasInner<CallbackUrlInner>, HasManager<LogicManager> {
    /**
     * @return the value value.
     */
    String value();

}
