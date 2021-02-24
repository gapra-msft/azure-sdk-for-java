// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MetricsResponseGranularity. */
public final class MetricsResponseGranularity extends ExpandableStringEnum<MetricsResponseGranularity> {
    /** Static value PT5M for MetricsResponseGranularity. */
    public static final MetricsResponseGranularity PT5M = fromString("PT5M");

    /** Static value PT1H for MetricsResponseGranularity. */
    public static final MetricsResponseGranularity PT1H = fromString("PT1H");

    /** Static value P1D for MetricsResponseGranularity. */
    public static final MetricsResponseGranularity P1D = fromString("P1D");

    /**
     * Creates or finds a MetricsResponseGranularity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MetricsResponseGranularity.
     */
    @JsonCreator
    public static MetricsResponseGranularity fromString(String name) {
        return fromString(name, MetricsResponseGranularity.class);
    }

    /** @return known MetricsResponseGranularity values. */
    public static Collection<MetricsResponseGranularity> values() {
        return values(MetricsResponseGranularity.class);
    }
}
