// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ValidateOperationsResponseInner;

/** An immutable client-side representation of ValidateOperationsResponse. */
public interface ValidateOperationsResponse {
    /**
     * Gets the validateOperationResponse property: Base class for validate operation response.
     *
     * @return the validateOperationResponse value.
     */
    ValidateOperationResponse validateOperationResponse();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ValidateOperationsResponseInner
     * object.
     *
     * @return the inner object.
     */
    ValidateOperationsResponseInner innerModel();
}
