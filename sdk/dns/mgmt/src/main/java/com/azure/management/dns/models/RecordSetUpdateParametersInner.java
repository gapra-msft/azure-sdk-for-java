// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.dns.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RecordSetUpdateParameters model. */
@Fluent
public final class RecordSetUpdateParametersInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecordSetUpdateParametersInner.class);

    /*
     * Specifies information about the record set being updated.
     */
    @JsonProperty(value = "RecordSet")
    private RecordSetInner recordSet;

    /**
     * Get the recordSet property: Specifies information about the record set being updated.
     *
     * @return the recordSet value.
     */
    public RecordSetInner recordSet() {
        return this.recordSet;
    }

    /**
     * Set the recordSet property: Specifies information about the record set being updated.
     *
     * @param recordSet the recordSet value to set.
     * @return the RecordSetUpdateParametersInner object itself.
     */
    public RecordSetUpdateParametersInner withRecordSet(RecordSetInner recordSet) {
        this.recordSet = recordSet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (recordSet() != null) {
            recordSet().validate();
        }
    }
}
