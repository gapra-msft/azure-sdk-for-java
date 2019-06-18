/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Parquet source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ParquetSource")
public class ParquetSource extends CopySource {
    /**
     * Parquet store settings.
     */
    @JsonProperty(value = "storeSettings")
    private ConnectorReadSetting storeSettings;

    /**
     * Get parquet store settings.
     *
     * @return the storeSettings value
     */
    public ConnectorReadSetting storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set parquet store settings.
     *
     * @param storeSettings the storeSettings value to set
     * @return the ParquetSource object itself.
     */
    public ParquetSource withStoreSettings(ConnectorReadSetting storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

}
