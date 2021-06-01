// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encapsulates information regarding data directory. */
@Fluent
public final class SqlDataDirectoryMapping {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlDataDirectoryMapping.class);

    /*
     * Type of data directory mapping
     */
    @JsonProperty(value = "mappingType")
    private SqlDataDirectoryType mappingType;

    /*
     * Restore source logical name path
     */
    @JsonProperty(value = "sourceLogicalName")
    private String sourceLogicalName;

    /*
     * Restore source path
     */
    @JsonProperty(value = "sourcePath")
    private String sourcePath;

    /*
     * Target path
     */
    @JsonProperty(value = "targetPath")
    private String targetPath;

    /**
     * Get the mappingType property: Type of data directory mapping.
     *
     * @return the mappingType value.
     */
    public SqlDataDirectoryType mappingType() {
        return this.mappingType;
    }

    /**
     * Set the mappingType property: Type of data directory mapping.
     *
     * @param mappingType the mappingType value to set.
     * @return the SqlDataDirectoryMapping object itself.
     */
    public SqlDataDirectoryMapping withMappingType(SqlDataDirectoryType mappingType) {
        this.mappingType = mappingType;
        return this;
    }

    /**
     * Get the sourceLogicalName property: Restore source logical name path.
     *
     * @return the sourceLogicalName value.
     */
    public String sourceLogicalName() {
        return this.sourceLogicalName;
    }

    /**
     * Set the sourceLogicalName property: Restore source logical name path.
     *
     * @param sourceLogicalName the sourceLogicalName value to set.
     * @return the SqlDataDirectoryMapping object itself.
     */
    public SqlDataDirectoryMapping withSourceLogicalName(String sourceLogicalName) {
        this.sourceLogicalName = sourceLogicalName;
        return this;
    }

    /**
     * Get the sourcePath property: Restore source path.
     *
     * @return the sourcePath value.
     */
    public String sourcePath() {
        return this.sourcePath;
    }

    /**
     * Set the sourcePath property: Restore source path.
     *
     * @param sourcePath the sourcePath value to set.
     * @return the SqlDataDirectoryMapping object itself.
     */
    public SqlDataDirectoryMapping withSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    /**
     * Get the targetPath property: Target path.
     *
     * @return the targetPath value.
     */
    public String targetPath() {
        return this.targetPath;
    }

    /**
     * Set the targetPath property: Target path.
     *
     * @param targetPath the targetPath value to set.
     * @return the SqlDataDirectoryMapping object itself.
     */
    public SqlDataDirectoryMapping withTargetPath(String targetPath) {
        this.targetPath = targetPath;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
