/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationAlertSettingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationAlertSettings.
 */
public interface ReplicationAlertSettings extends SupportsCreating<Alert.DefinitionStages.Blank>, HasInner<ReplicationAlertSettingsInner> {
    /**
     * Gets an email notification(alert) configuration.
     * Gets the details of the specified email notification(alert) configuration.
     *
     * @param alertSettingName The name of the email notification configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Alert> getAsync(String alertSettingName);

    /**
     * Gets the list of configured email notification(alert) configurations.
     * Gets the list of email notification(alert) configurations for the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Alert> listAsync();

}
