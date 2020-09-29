// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for TimeGranularity. */
public enum TimeGranularity {
    /** Enum value yearly. */
    YEARLY("yearly"),

    /** Enum value monthly. */
    MONTHLY("monthly"),

    /** Enum value weekly. */
    WEEKLY("weekly"),

    /** Enum value daily. */
    DAILY("daily"),

    /** Enum value hourly. */
    HOURLY("hourly"),

    /** Enum value minutely. */
    PER_MINUTE("minutely"),

    /** Enum value secondly. */
    PER_SECOND("secondly");

    /** The actual serialized value for a TimeGranularity instance. */
    private final String value;

    TimeGranularity(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TimeGranularity instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TimeGranularity object, or null if unable to parse.
     */
    @JsonCreator
    public static TimeGranularity fromString(String value) {
        TimeGranularity[] items = TimeGranularity.values();
        for (TimeGranularity item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
