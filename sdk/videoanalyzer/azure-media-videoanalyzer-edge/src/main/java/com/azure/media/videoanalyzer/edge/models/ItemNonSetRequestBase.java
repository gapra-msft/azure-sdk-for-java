// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ItemNonSetRequestBase model. */
@Fluent
public class ItemNonSetRequestBase extends MethodRequest {
    /*
     * method name
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of ItemNonSetRequestBase class.
     *
     * @param name the name value to set.
     */
    @JsonCreator
    public ItemNonSetRequestBase(@JsonProperty(value = "name", required = true) String name) {
        this.name = name;
    }

    /**
     * Get the name property: method name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }
}
