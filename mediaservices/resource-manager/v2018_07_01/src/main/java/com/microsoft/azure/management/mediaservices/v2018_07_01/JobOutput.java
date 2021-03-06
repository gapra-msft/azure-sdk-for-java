/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes all the properties of a JobOutput.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("JobOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobOutputAsset", value = JobOutputAsset.class)
})
public class JobOutput {
    /**
     * If the JobOutput is in the Error state, it contains the details of the
     * error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private JobError error;

    /**
     * Describes the state of the JobOutput. Possible values include:
     * 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued',
     * 'Scheduled'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private JobState state;

    /**
     * If the JobOutput is in a Processing state, this contains the Job
     * completion percentage. The value is an estimate and not intended to be
     * used to predict Job completion times. To determine if the JobOutput is
     * complete, use the State property.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private int progress;

    /**
     * A label that is assigned to a JobOutput in order to help uniquely
     * identify it. This is useful when your Transform has more than one
     * TransformOutput, whereby your Job has more than one JobOutput. In such
     * cases, when you submit the Job, you will add two or more JobOutputs, in
     * the same order as TransformOutputs in the Transform. Subsequently, when
     * you retrieve the Job, either through events or on a GET request, you can
     * use the label to easily identify the JobOutput. If a label is not
     * provided, a default value of '{presetName}_{outputIndex}' will be used,
     * where the preset name is the name of the preset in the corresponding
     * TransformOutput and the output index is the relative index of the this
     * JobOutput within the Job. Note that this index is the same as the
     * relative index of the corresponding TransformOutput within its
     * Transform.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Get if the JobOutput is in the Error state, it contains the details of the error.
     *
     * @return the error value
     */
    public JobError error() {
        return this.error;
    }

    /**
     * Get describes the state of the JobOutput. Possible values include: 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     *
     * @return the state value
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Get if the JobOutput is in a Processing state, this contains the Job completion percentage. The value is an estimate and not intended to be used to predict Job completion times. To determine if the JobOutput is complete, use the State property.
     *
     * @return the progress value
     */
    public int progress() {
        return this.progress;
    }

    /**
     * Get a label that is assigned to a JobOutput in order to help uniquely identify it. This is useful when your Transform has more than one TransformOutput, whereby your Job has more than one JobOutput. In such cases, when you submit the Job, you will add two or more JobOutputs, in the same order as TransformOutputs in the Transform. Subsequently, when you retrieve the Job, either through events or on a GET request, you can use the label to easily identify the JobOutput. If a label is not provided, a default value of '{presetName}_{outputIndex}' will be used, where the preset name is the name of the preset in the corresponding TransformOutput and the output index is the relative index of the this JobOutput within the Job. Note that this index is the same as the relative index of the corresponding TransformOutput within its Transform.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set a label that is assigned to a JobOutput in order to help uniquely identify it. This is useful when your Transform has more than one TransformOutput, whereby your Job has more than one JobOutput. In such cases, when you submit the Job, you will add two or more JobOutputs, in the same order as TransformOutputs in the Transform. Subsequently, when you retrieve the Job, either through events or on a GET request, you can use the label to easily identify the JobOutput. If a label is not provided, a default value of '{presetName}_{outputIndex}' will be used, where the preset name is the name of the preset in the corresponding TransformOutput and the output index is the relative index of the this JobOutput within the Job. Note that this index is the same as the relative index of the corresponding TransformOutput within its Transform.
     *
     * @param label the label value to set
     * @return the JobOutput object itself.
     */
    public JobOutput withLabel(String label) {
        this.label = label;
        return this;
    }

}
