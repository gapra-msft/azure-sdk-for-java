/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Http logs to azure blob storage configuration.
 */
public class AzureBlobStorageHttpLogsConfig {
    /**
     * SAS url to a azure blob container with read/write/list/delete
     * permissions.
     */
    @JsonProperty(value = "sasUrl")
    private String sasUrl;

    /**
     * Retention in days.
     * Remove blobs older than X days.
     * 0 or lower means no retention.
     */
    @JsonProperty(value = "retentionInDays")
    private Integer retentionInDays;

    /**
     * True if configuration is enabled, false if it is disabled and null if
     * configuration is not set.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get sAS url to a azure blob container with read/write/list/delete permissions.
     *
     * @return the sasUrl value
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set sAS url to a azure blob container with read/write/list/delete permissions.
     *
     * @param sasUrl the sasUrl value to set
     * @return the AzureBlobStorageHttpLogsConfig object itself.
     */
    public AzureBlobStorageHttpLogsConfig withSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
        return this;
    }

    /**
     * Get retention in days.
     Remove blobs older than X days.
     0 or lower means no retention.
     *
     * @return the retentionInDays value
     */
    public Integer retentionInDays() {
        return this.retentionInDays;
    }

    /**
     * Set retention in days.
     Remove blobs older than X days.
     0 or lower means no retention.
     *
     * @param retentionInDays the retentionInDays value to set
     * @return the AzureBlobStorageHttpLogsConfig object itself.
     */
    public AzureBlobStorageHttpLogsConfig withRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
        return this;
    }

    /**
     * Get true if configuration is enabled, false if it is disabled and null if configuration is not set.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set true if configuration is enabled, false if it is disabled and null if configuration is not set.
     *
     * @param enabled the enabled value to set
     * @return the AzureBlobStorageHttpLogsConfig object itself.
     */
    public AzureBlobStorageHttpLogsConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
