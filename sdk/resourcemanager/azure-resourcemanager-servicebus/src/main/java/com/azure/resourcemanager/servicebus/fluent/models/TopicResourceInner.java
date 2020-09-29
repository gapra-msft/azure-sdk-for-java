// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.models.EntityAvailabilityStatus;
import com.azure.resourcemanager.servicebus.models.EntityStatus;
import com.azure.resourcemanager.servicebus.models.MessageCountDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Description of topic resource. */
@JsonFlatten
@Fluent
public class TopicResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopicResourceInner.class);

    /*
     * Last time the message was sent, or a request was received, for this
     * topic.
     */
    @JsonProperty(value = "properties.accessedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime accessedAt;

    /*
     * TimeSpan idle interval after which the topic is automatically deleted.
     * The minimum duration is 5 minutes.
     */
    @JsonProperty(value = "properties.autoDeleteOnIdle")
    private String autoDeleteOnIdle;

    /*
     * Entity availability status for the topic.
     */
    @JsonProperty(value = "properties.entityAvailabilityStatus")
    private EntityAvailabilityStatus entityAvailabilityStatus;

    /*
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * Message Count Details.
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /*
     * Default message time to live value. This is the duration after which the
     * message expires, starting from when the message is sent to Service Bus.
     * This is the default value used when TimeToLive is not set on a message
     * itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    private String defaultMessageTimeToLive;

    /*
     * TimeSpan structure that defines the duration of the duplicate detection
     * history. The default value is 10 minutes.
     */
    @JsonProperty(value = "properties.duplicateDetectionHistoryTimeWindow")
    private String duplicateDetectionHistoryTimeWindow;

    /*
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /*
     * Value that indicates whether Express Entities are enabled. An express
     * topic holds a message in memory temporarily before writing it to
     * persistent storage.
     */
    @JsonProperty(value = "properties.enableExpress")
    private Boolean enableExpress;

    /*
     * Value that indicates whether the topic to be partitioned across multiple
     * message brokers is enabled.
     */
    @JsonProperty(value = "properties.enablePartitioning")
    private Boolean enablePartitioning;

    /*
     * Whether messages should be filtered before publishing.
     */
    @JsonProperty(value = "properties.filteringMessagesBeforePublishing")
    private Boolean filteringMessagesBeforePublishing;

    /*
     * Value that indicates whether the message is accessible anonymously.
     */
    @JsonProperty(value = "properties.isAnonymousAccessible")
    private Boolean isAnonymousAccessible;

    /*
     * The isExpress property.
     */
    @JsonProperty(value = "properties.isExpress")
    private Boolean isExpress;

    /*
     * Maximum size of the topic in megabytes, which is the size of the memory
     * allocated for the topic.
     */
    @JsonProperty(value = "properties.maxSizeInMegabytes")
    private Long maxSizeInMegabytes;

    /*
     * Value indicating if this topic requires duplicate detection.
     */
    @JsonProperty(value = "properties.requiresDuplicateDetection")
    private Boolean requiresDuplicateDetection;

    /*
     * Size of the topic, in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /*
     * Enumerates the possible values for the status of a messaging entity.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /*
     * Number of subscriptions.
     */
    @JsonProperty(value = "properties.subscriptionCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer subscriptionCount;

    /*
     * Value that indicates whether the topic supports ordering.
     */
    @JsonProperty(value = "properties.supportOrdering")
    private Boolean supportOrdering;

    /*
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the accessedAt property: Last time the message was sent, or a request was received, for this topic.
     *
     * @return the accessedAt value.
     */
    public OffsetDateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the autoDeleteOnIdle property: TimeSpan idle interval after which the topic is automatically deleted. The
     * minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public String autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: TimeSpan idle interval after which the topic is automatically deleted. The
     * minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withAutoDeleteOnIdle(String autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the entityAvailabilityStatus property: Entity availability status for the topic.
     *
     * @return the entityAvailabilityStatus value.
     */
    public EntityAvailabilityStatus entityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }

    /**
     * Set the entityAvailabilityStatus property: Entity availability status for the topic.
     *
     * @param entityAvailabilityStatus the entityAvailabilityStatus value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        this.entityAvailabilityStatus = entityAvailabilityStatus;
        return this;
    }

    /**
     * Get the createdAt property: Exact time the message was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the countDetails property: Message Count Details.
     *
     * @return the countDetails value.
     */
    public MessageCountDetails countDetails() {
        return this.countDetails;
    }

    /**
     * Get the defaultMessageTimeToLive property: Default message time to live value. This is the duration after which
     * the message expires, starting from when the message is sent to Service Bus. This is the default value used when
     * TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public String defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive property: Default message time to live value. This is the duration after which
     * the message expires, starting from when the message is sent to Service Bus. This is the default value used when
     * TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withDefaultMessageTimeToLive(String defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the duplicateDetectionHistoryTimeWindow property: TimeSpan structure that defines the duration of the
     * duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    public String duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set the duplicateDetectionHistoryTimeWindow property: TimeSpan structure that defines the duration of the
     * duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withDuplicateDetectionHistoryTimeWindow(String duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get the enableExpress property: Value that indicates whether Express Entities are enabled. An express topic holds
     * a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value.
     */
    public Boolean enableExpress() {
        return this.enableExpress;
    }

    /**
     * Set the enableExpress property: Value that indicates whether Express Entities are enabled. An express topic holds
     * a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withEnableExpress(Boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

    /**
     * Get the enablePartitioning property: Value that indicates whether the topic to be partitioned across multiple
     * message brokers is enabled.
     *
     * @return the enablePartitioning value.
     */
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }

    /**
     * Set the enablePartitioning property: Value that indicates whether the topic to be partitioned across multiple
     * message brokers is enabled.
     *
     * @param enablePartitioning the enablePartitioning value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    /**
     * Get the filteringMessagesBeforePublishing property: Whether messages should be filtered before publishing.
     *
     * @return the filteringMessagesBeforePublishing value.
     */
    public Boolean filteringMessagesBeforePublishing() {
        return this.filteringMessagesBeforePublishing;
    }

    /**
     * Set the filteringMessagesBeforePublishing property: Whether messages should be filtered before publishing.
     *
     * @param filteringMessagesBeforePublishing the filteringMessagesBeforePublishing value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withFilteringMessagesBeforePublishing(Boolean filteringMessagesBeforePublishing) {
        this.filteringMessagesBeforePublishing = filteringMessagesBeforePublishing;
        return this;
    }

    /**
     * Get the isAnonymousAccessible property: Value that indicates whether the message is accessible anonymously.
     *
     * @return the isAnonymousAccessible value.
     */
    public Boolean isAnonymousAccessible() {
        return this.isAnonymousAccessible;
    }

    /**
     * Set the isAnonymousAccessible property: Value that indicates whether the message is accessible anonymously.
     *
     * @param isAnonymousAccessible the isAnonymousAccessible value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withIsAnonymousAccessible(Boolean isAnonymousAccessible) {
        this.isAnonymousAccessible = isAnonymousAccessible;
        return this;
    }

    /**
     * Get the isExpress property: The isExpress property.
     *
     * @return the isExpress value.
     */
    public Boolean isExpress() {
        return this.isExpress;
    }

    /**
     * Set the isExpress property: The isExpress property.
     *
     * @param isExpress the isExpress value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withIsExpress(Boolean isExpress) {
        this.isExpress = isExpress;
        return this;
    }

    /**
     * Get the maxSizeInMegabytes property: Maximum size of the topic in megabytes, which is the size of the memory
     * allocated for the topic.
     *
     * @return the maxSizeInMegabytes value.
     */
    public Long maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maxSizeInMegabytes property: Maximum size of the topic in megabytes, which is the size of the memory
     * allocated for the topic.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withMaxSizeInMegabytes(Long maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get the requiresDuplicateDetection property: Value indicating if this topic requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value.
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set the requiresDuplicateDetection property: Value indicating if this topic requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get the sizeInBytes property: Size of the topic, in bytes.
     *
     * @return the sizeInBytes value.
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @return the status value.
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @param status the status value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the subscriptionCount property: Number of subscriptions.
     *
     * @return the subscriptionCount value.
     */
    public Integer subscriptionCount() {
        return this.subscriptionCount;
    }

    /**
     * Get the supportOrdering property: Value that indicates whether the topic supports ordering.
     *
     * @return the supportOrdering value.
     */
    public Boolean supportOrdering() {
        return this.supportOrdering;
    }

    /**
     * Set the supportOrdering property: Value that indicates whether the topic supports ordering.
     *
     * @param supportOrdering the supportOrdering value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withSupportOrdering(Boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
        return this;
    }

    /**
     * Get the updatedAt property: The exact time the message was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the TopicResourceInner object itself.
     */
    public TopicResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (countDetails() != null) {
            countDetails().validate();
        }
    }
}
