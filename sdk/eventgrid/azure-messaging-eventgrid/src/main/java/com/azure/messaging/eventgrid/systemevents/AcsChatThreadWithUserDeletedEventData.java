// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The AcsChatThreadWithUserDeletedEventData model. */
@Fluent
public final class AcsChatThreadWithUserDeletedEventData extends AcsChatThreadEventBaseProperties {
    /*
     * The MRI of the user who deleted the thread
     */
    @JsonProperty(value = "deletedBy")
    private String deletedBy;

    /*
     * The deletion time of the thread
     */
    @JsonProperty(value = "deleteTime")
    private OffsetDateTime deleteTime;

    /**
     * Get the deletedBy property: The MRI of the user who deleted the thread.
     *
     * @return the deletedBy value.
     */
    public String getDeletedBy() {
        return this.deletedBy;
    }

    /**
     * Set the deletedBy property: The MRI of the user who deleted the thread.
     *
     * @param deletedBy the deletedBy value to set.
     * @return the AcsChatThreadWithUserDeletedEventData object itself.
     */
    public AcsChatThreadWithUserDeletedEventData setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
        return this;
    }

    /**
     * Get the deleteTime property: The deletion time of the thread.
     *
     * @return the deleteTime value.
     */
    public OffsetDateTime getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * Set the deleteTime property: The deletion time of the thread.
     *
     * @param deleteTime the deleteTime value to set.
     * @return the AcsChatThreadWithUserDeletedEventData object itself.
     */
    public AcsChatThreadWithUserDeletedEventData setDeleteTime(OffsetDateTime deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }
}
