// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Queries are stored pieces of KQL, along with a list of relevant metadata items. */
@Fluent
public final class MetadataQuery {
    /*
     * The ID of the query.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The display name of the query.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the query.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The KQL body of the query.
     */
    @JsonProperty(value = "body", required = true)
    private String body;

    /*
     * The user defined labels associated with the query.
     */
    @JsonProperty(value = "labels")
    private List<String> labels;

    /*
     * The tags associated with the query.
     */
    @JsonProperty(value = "tags")
    private Object tags;

    /*
     * The properties of the query.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /*
     * The related metadata items for the query.
     */
    @JsonProperty(value = "related")
    private MetadataQueryRelated related;

    /**
     * Creates an instance of MetadataQuery class.
     *
     * @param id the id value to set.
     * @param body the body value to set.
     */
    @JsonCreator
    public MetadataQuery(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "body", required = true) String body) {
        this.id = id;
        this.body = body;
    }

    /**
     * Get the id property: The ID of the query.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name of the query.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the query.
     *
     * @param displayName the displayName value to set.
     * @return the MetadataQuery object itself.
     */
    public MetadataQuery setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the query.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the query.
     *
     * @param description the description value to set.
     * @return the MetadataQuery object itself.
     */
    public MetadataQuery setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the body property: The KQL body of the query.
     *
     * @return the body value.
     */
    public String getBody() {
        return this.body;
    }

    /**
     * Get the labels property: The user defined labels associated with the query.
     *
     * @return the labels value.
     */
    public List<String> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: The user defined labels associated with the query.
     *
     * @param labels the labels value to set.
     * @return the MetadataQuery object itself.
     */
    public MetadataQuery setLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the tags property: The tags associated with the query.
     *
     * @return the tags value.
     */
    public Object getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags associated with the query.
     *
     * @param tags the tags value to set.
     * @return the MetadataQuery object itself.
     */
    public MetadataQuery setTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties of the query.
     *
     * @return the properties value.
     */
    public Object getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the query.
     *
     * @param properties the properties value to set.
     * @return the MetadataQuery object itself.
     */
    public MetadataQuery setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the related property: The related metadata items for the query.
     *
     * @return the related value.
     */
    public MetadataQueryRelated getRelated() {
        return this.related;
    }

    /**
     * Set the related property: The related metadata items for the query.
     *
     * @param related the related value to set.
     * @return the MetadataQuery object itself.
     */
    public MetadataQuery setRelated(MetadataQueryRelated related) {
        this.related = related;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getId() == null) {
            throw new IllegalArgumentException("Missing required property id in model MetadataQuery");
        }
        if (getBody() == null) {
            throw new IllegalArgumentException("Missing required property body in model MetadataQuery");
        }
        if (getRelated() != null) {
            getRelated().validate();
        }
    }
}
