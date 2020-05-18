// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The HttpConfiguration model. */
@Fluent
public final class HttpConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HttpConfiguration.class);

    /*
     * HTTP method.
     */
    @JsonProperty(value = "method")
    private HttpMethod method;

    /*
     * List of HTTP headers.
     */
    @JsonProperty(value = "headers")
    private List<HttpHeader> headers;

    /*
     * Valid status codes.
     */
    @JsonProperty(value = "validStatusCodes")
    private List<Integer> validStatusCodes;

    /**
     * Get the method property: HTTP method.
     *
     * @return the method value.
     */
    public HttpMethod method() {
        return this.method;
    }

    /**
     * Set the method property: HTTP method.
     *
     * @param method the method value to set.
     * @return the HttpConfiguration object itself.
     */
    public HttpConfiguration withMethod(HttpMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the headers property: List of HTTP headers.
     *
     * @return the headers value.
     */
    public List<HttpHeader> headers() {
        return this.headers;
    }

    /**
     * Set the headers property: List of HTTP headers.
     *
     * @param headers the headers value to set.
     * @return the HttpConfiguration object itself.
     */
    public HttpConfiguration withHeaders(List<HttpHeader> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the validStatusCodes property: Valid status codes.
     *
     * @return the validStatusCodes value.
     */
    public List<Integer> validStatusCodes() {
        return this.validStatusCodes;
    }

    /**
     * Set the validStatusCodes property: Valid status codes.
     *
     * @param validStatusCodes the validStatusCodes value to set.
     * @return the HttpConfiguration object itself.
     */
    public HttpConfiguration withValidStatusCodes(List<Integer> validStatusCodes) {
        this.validStatusCodes = validStatusCodes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (headers() != null) {
            headers().forEach(e -> e.validate());
        }
    }
}
