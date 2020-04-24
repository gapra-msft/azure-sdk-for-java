// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.changefeed.models;

import com.azure.storage.internal.avro.implementation.AvroParser;
import com.azure.storage.internal.avro.implementation.schema.primitive.AvroNullSchema;

import java.time.OffsetDateTime;
import java.util.Map;

public class BlobChangefeedEvent {
    private final String topic;
    private final String subject;
    private final BlobChangefeedEventType eventType;
    private final OffsetDateTime eventTime;
    private final String id;
    private final BlobChangefeedEventData data;
    private final Long dataVersion;
    private final String metadataVersion;

    public BlobChangefeedEvent(String topic, String subject, BlobChangefeedEventType eventType,
        OffsetDateTime eventTime, String id, BlobChangefeedEventData data, Long dataVersion, String metadataVersion) {
        this.topic = topic;
        this.subject = subject;
        this.eventType = eventType;
        this.eventTime = eventTime;
        this.id = id;
        this.data = data;
        this.dataVersion = dataVersion;
        this.metadataVersion = metadataVersion;
    }

    public static BlobChangefeedEvent fromRecord(Object r) {

        if (!(r instanceof Map)) {
            throw new IllegalArgumentException("Expected record to be of type Map");
        }

        Map<String, Object> record = (Map<String, Object>) r;

        Object topic = record.get("topic");
        Object subject = record.get("subject");
        Object eventType = record.get("eventType");
        Object eventTime = record.get("eventTime");
        Object id = record.get("id");
        Object data = record.get("data");
        Object dataVersion = record.get("dataVersion");
        Object metadataVersion = record.get("metadataVersion");

        System.out.println((String) subject);

        return new BlobChangefeedEvent(isNull(topic) ? null : topic.toString(),
            isNull(subject) ? null : subject.toString(),
            isNull(eventType) ? null : BlobChangefeedEventType.fromString(eventType.toString()),
            isNull(eventTime) ? null : OffsetDateTime.parse(eventTime.toString()),
            isNull(id) ? null : id.toString(),
            isNull(data) ? null : BlobChangefeedEventData.fromRecord((Map<String, Object>) data),
            isNull(dataVersion) ? null : (Long) dataVersion,
            isNull(metadataVersion) ? null : metadataVersion.toString());
    }

    static boolean isNull(Object o) {
        return o == null || o instanceof AvroNullSchema.Null;
    }


    public String getTopic() {
        return topic;
    }

    public String getSubject() {
        return subject;
    }

    public BlobChangefeedEventType getEventType() {
        return eventType;
    }

    public OffsetDateTime getEventTime() {
        return eventTime;
    }

    public String getId() {
        return id;
    }

    public BlobChangefeedEventData getData() {
        return data;
    }

    public Long getDataVersion() {
        return dataVersion;
    }

    public String getMetadataVersion() {
        return metadataVersion;
    }
}
