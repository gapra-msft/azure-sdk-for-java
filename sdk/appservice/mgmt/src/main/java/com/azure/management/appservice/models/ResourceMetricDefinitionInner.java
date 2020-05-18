// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.appservice.ProxyOnlyResource;
import com.azure.management.appservice.ResourceMetricAvailability;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The ResourceMetricDefinition model. */
@JsonFlatten
@Immutable
public class ResourceMetricDefinitionInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceMetricDefinitionInner.class);

    /*
     * Unit of the metric.
     */
    @JsonProperty(value = "properties.unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * Primary aggregation type.
     */
    @JsonProperty(value = "properties.primaryAggregationType", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAggregationType;

    /*
     * List of time grains supported for the metric together with retention
     * period.
     */
    @JsonProperty(value = "properties.metricAvailabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceMetricAvailability> metricAvailabilities;

    /*
     * Resource URI.
     */
    @JsonProperty(value = "properties.resourceUri", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceUri;

    /*
     * Resource metric definition properties.
     */
    @JsonProperty(value = "properties.properties", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> properties;

    /**
     * Get the unit property: Unit of the metric.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the primaryAggregationType property: Primary aggregation type.
     *
     * @return the primaryAggregationType value.
     */
    public String primaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Get the metricAvailabilities property: List of time grains supported for the metric together with retention
     * period.
     *
     * @return the metricAvailabilities value.
     */
    public List<ResourceMetricAvailability> metricAvailabilities() {
        return this.metricAvailabilities;
    }

    /**
     * Get the resourceUri property: Resource URI.
     *
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Get the properties property: Resource metric definition properties.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (metricAvailabilities() != null) {
            metricAvailabilities().forEach(e -> e.validate());
        }
    }
}
