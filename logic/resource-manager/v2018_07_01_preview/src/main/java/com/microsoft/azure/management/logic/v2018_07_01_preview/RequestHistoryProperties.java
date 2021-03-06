/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The request history.
 */
public class RequestHistoryProperties {
    /**
     * The time the request started.
     */
    @JsonProperty(value = "startTime")
    private DateTime startTime;

    /**
     * The time the request ended.
     */
    @JsonProperty(value = "endTime")
    private DateTime endTime;

    /**
     * The request.
     */
    @JsonProperty(value = "request")
    private Request request;

    /**
     * The response.
     */
    @JsonProperty(value = "response")
    private Response response;

    /**
     * Get the time the request started.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the time the request started.
     *
     * @param startTime the startTime value to set
     * @return the RequestHistoryProperties object itself.
     */
    public RequestHistoryProperties withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the time the request ended.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the time the request ended.
     *
     * @param endTime the endTime value to set
     * @return the RequestHistoryProperties object itself.
     */
    public RequestHistoryProperties withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the request.
     *
     * @return the request value
     */
    public Request request() {
        return this.request;
    }

    /**
     * Set the request.
     *
     * @param request the request value to set
     * @return the RequestHistoryProperties object itself.
     */
    public RequestHistoryProperties withRequest(Request request) {
        this.request = request;
        return this;
    }

    /**
     * Get the response.
     *
     * @return the response value
     */
    public Response response() {
        return this.response;
    }

    /**
     * Set the response.
     *
     * @param response the response value to set
     * @return the RequestHistoryProperties object itself.
     */
    public RequestHistoryProperties withResponse(Response response) {
        this.response = response;
        return this;
    }

}
