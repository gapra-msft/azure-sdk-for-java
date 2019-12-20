// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Additional parameters for create operation.
 */
@JacksonXmlRootElement(localName = "blob-container-encryption-scope")
@Fluent
public final class BlobContainerEncryptionScope {
    /*
     * Optional.  Version 2019-02-02 and later.  Specifies the default
     * encryption scope to set on the container and use for all future writes.
     */
    @JsonProperty(value = "defaultEncryptionScope")
    private String defaultEncryptionScope;

    /*
     * Optional.  Version 2019-02-02 and newer.  If true, prevents any request
     * from specifying a different encryption scope than the scope set on the
     * container.
     */
    @JsonProperty(value = "denyEncryptionScopeOverride")
    private boolean denyEncryptionScopeOverride;

    /**
     * Get the defaultEncryptionScope property: Optional.  Version 2019-02-02
     * and later.  Specifies the default encryption scope to set on the
     * container and use for all future writes.
     *
     * @return the defaultEncryptionScope value.
     */
    public String getDefaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }

    /**
     * Set the defaultEncryptionScope property: Optional.  Version 2019-02-02
     * and later.  Specifies the default encryption scope to set on the
     * container and use for all future writes.
     *
     * @param defaultEncryptionScope the defaultEncryptionScope value to set.
     * @return the BlobContainerEncryptionScope object itself.
     */
    public BlobContainerEncryptionScope setDefaultEncryptionScope(String defaultEncryptionScope) {
        this.defaultEncryptionScope = defaultEncryptionScope;
        return this;
    }

    /**
     * Get the denyEncryptionScopeOverride property: Optional.  Version
     * 2019-02-02 and newer.  If true, prevents any request from specifying a
     * different encryption scope than the scope set on the container.
     *
     * @return the denyEncryptionScopeOverride value.
     */
    public boolean isDenyEncryptionScopeOverride() {
        return this.denyEncryptionScopeOverride;
    }

    /**
     * Set the denyEncryptionScopeOverride property: Optional.  Version
     * 2019-02-02 and newer.  If true, prevents any request from specifying a
     * different encryption scope than the scope set on the container.
     *
     * @param denyEncryptionScopeOverride the denyEncryptionScopeOverride value
     * to set.
     * @return the BlobContainerEncryptionScope object itself.
     */
    public BlobContainerEncryptionScope setDenyEncryptionScopeOverride(Boolean denyEncryptionScopeOverride) {
        this.denyEncryptionScopeOverride = denyEncryptionScopeOverride;
        return this;
    }
}
