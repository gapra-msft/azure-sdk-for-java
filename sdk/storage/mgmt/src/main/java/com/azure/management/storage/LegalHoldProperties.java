// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LegalHoldProperties model. */
@Fluent
public final class LegalHoldProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LegalHoldProperties.class);

    /*
     * The hasLegalHold public property is set to true by SRP if there are at
     * least one existing tag. The hasLegalHold public property is set to false
     * by SRP if all existing legal hold tags are cleared out. There can be a
     * maximum of 1000 blob containers with hasLegalHold=true for a given
     * account.
     */
    @JsonProperty(value = "hasLegalHold", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasLegalHold;

    /*
     * The list of LegalHold tags of a blob container.
     */
    @JsonProperty(value = "tags")
    private List<TagProperty> tags;

    /**
     * Get the hasLegalHold property: The hasLegalHold public property is set to true by SRP if there are at least one
     * existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared
     * out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     *
     * @return the hasLegalHold value.
     */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }

    /**
     * Get the tags property: The list of LegalHold tags of a blob container.
     *
     * @return the tags value.
     */
    public List<TagProperty> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The list of LegalHold tags of a blob container.
     *
     * @param tags the tags value to set.
     * @return the LegalHoldProperties object itself.
     */
    public LegalHoldProperties withTags(List<TagProperty> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tags() != null) {
            tags().forEach(e -> e.validate());
        }
    }
}
