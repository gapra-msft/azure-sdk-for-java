// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TriggerUpdateParameters model. */
@Fluent
public final class TriggerUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggerUpdateParameters.class);

    /*
     * The collection of triggers based on source code repository.
     */
    @JsonProperty(value = "sourceTriggers")
    private List<SourceTriggerUpdateParameters> sourceTriggers;

    /*
     * The trigger based on base image dependencies.
     */
    @JsonProperty(value = "baseImageTrigger")
    private BaseImageTriggerUpdateParameters baseImageTrigger;

    /**
     * Get the sourceTriggers property: The collection of triggers based on source code repository.
     *
     * @return the sourceTriggers value.
     */
    public List<SourceTriggerUpdateParameters> sourceTriggers() {
        return this.sourceTriggers;
    }

    /**
     * Set the sourceTriggers property: The collection of triggers based on source code repository.
     *
     * @param sourceTriggers the sourceTriggers value to set.
     * @return the TriggerUpdateParameters object itself.
     */
    public TriggerUpdateParameters withSourceTriggers(List<SourceTriggerUpdateParameters> sourceTriggers) {
        this.sourceTriggers = sourceTriggers;
        return this;
    }

    /**
     * Get the baseImageTrigger property: The trigger based on base image dependencies.
     *
     * @return the baseImageTrigger value.
     */
    public BaseImageTriggerUpdateParameters baseImageTrigger() {
        return this.baseImageTrigger;
    }

    /**
     * Set the baseImageTrigger property: The trigger based on base image dependencies.
     *
     * @param baseImageTrigger the baseImageTrigger value to set.
     * @return the TriggerUpdateParameters object itself.
     */
    public TriggerUpdateParameters withBaseImageTrigger(BaseImageTriggerUpdateParameters baseImageTrigger) {
        this.baseImageTrigger = baseImageTrigger;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceTriggers() != null) {
            sourceTriggers().forEach(e -> e.validate());
        }
        if (baseImageTrigger() != null) {
            baseImageTrigger().validate();
        }
    }
}
