// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.azure.storage.file.share.implementation.models.SmbMultichannel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Settings for SMB protocol. */
@JacksonXmlRootElement(localName = "ShareSmbSettings")
@Fluent
public final class ShareSmbSettings {
    /*
     * Settings for SMB Multichannel.
     */
    @JsonProperty(value = "Multichannel")
    private SmbMultichannel multichannel;

    /**
     * Get the multichannel property: Settings for SMB Multichannel.
     *
     * @return the multichannel value.
     */
    public SmbMultichannel getMultichannel() {
        return this.multichannel;
    }

    /**
     * Set the multichannel property: Settings for SMB Multichannel.
     *
     * @param multichannel the multichannel value to set.
     * @return the ShareSmbSettings object itself.
     */
    public ShareSmbSettings setMultichannel(SmbMultichannel multichannel) {
        this.multichannel = multichannel;
        return this;
    }
}
