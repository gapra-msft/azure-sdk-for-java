// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.HeaderCollection;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Defines headers for GetProperties operation.
 */
@JacksonXmlRootElement(localName = "Share-GetProperties-Headers")
@Fluent
public final class ShareGetPropertiesHeaders {
    /*
     * The metadata property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> metadata;

    /*
     * The ETag contains a value that you can use to perform operations
     * conditionally, in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * Returns the date and time the share was last modified. Any operation
     * that modifies the share or its properties updates the last modified
     * time. Operations on files do not affect the last modified time of the
     * share.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * Returns the current share quota in GB.
     */
    @JsonProperty(value = "x-ms-share-quota")
    private Integer quota;

    /*
     * Returns the current share provisioned ipos.
     */
    @JsonProperty(value = "x-ms-share-provisioned-iops")
    private Integer provisionedIops;

    /*
     * Returns the current share provisioned ingress in megabytes per second.
     */
    @JsonProperty(value = "x-ms-share-provisioned-ingress-mbps")
    private Integer provisionedIngressMBps;

    /*
     * Returns the current share provisioned egress in megabytes per second.
     */
    @JsonProperty(value = "x-ms-share-provisioned-egress-mbps")
    private Integer provisionedEgressMBps;

    /*
     * Returns the current share next allowed quota downgrade time.
     */
    @JsonProperty(value = "x-ms-share-next-allowed-quota-downgrade-time")
    private DateTimeRfc1123 nextAllowedQuotaDowngradeTime;

    /*
     * Returns the access tier set on the share.
     */
    @JsonProperty(value = "x-ms-access-tier")
    private String accessTier;

    /*
     * Returns the last modified time (in UTC) of the access tier of the share.
     */
    @JsonProperty(value = "x-ms-access-tier-change-time")
    private DateTimeRfc1123 accessTierChangeTime;

    /*
     * Returns the transition state betweeen access tiers, when present.
     */
    @JsonProperty(value = "x-ms-access-tier-transition-state")
    private String accessTierTransitionState;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: Returns the date and time the share was
     * last modified. Any operation that modifies the share or its properties
     * updates the last modified time. Operations on files do not affect the
     * last modified time of the share.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the share was
     * last modified. Any operation that modifies the share or its properties
     * updates the last modified time. Operations on files do not affect the
     * last modified time of the share.
     *
     * @param lastModified the lastModified value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the quota property: Returns the current share quota in GB.
     *
     * @return the quota value.
     */
    public Integer getQuota() {
        return this.quota;
    }

    /**
     * Set the quota property: Returns the current share quota in GB.
     *
     * @param quota the quota value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get the provisionedIops property: Returns the current share provisioned
     * ipos.
     *
     * @return the provisionedIops value.
     */
    public Integer getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * Set the provisionedIops property: Returns the current share provisioned
     * ipos.
     *
     * @param provisionedIops the provisionedIops value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setProvisionedIops(Integer provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }

    /**
     * Get the provisionedIngressMBps property: Returns the current share
     * provisioned ingress in megabytes per second.
     *
     * @return the provisionedIngressMBps value.
     */
    public Integer getProvisionedIngressMBps() {
        return this.provisionedIngressMBps;
    }

    /**
     * Set the provisionedIngressMBps property: Returns the current share
     * provisioned ingress in megabytes per second.
     *
     * @param provisionedIngressMBps the provisionedIngressMBps value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setProvisionedIngressMBps(Integer provisionedIngressMBps) {
        this.provisionedIngressMBps = provisionedIngressMBps;
        return this;
    }

    /**
     * Get the provisionedEgressMBps property: Returns the current share
     * provisioned egress in megabytes per second.
     *
     * @return the provisionedEgressMBps value.
     */
    public Integer getProvisionedEgressMBps() {
        return this.provisionedEgressMBps;
    }

    /**
     * Set the provisionedEgressMBps property: Returns the current share
     * provisioned egress in megabytes per second.
     *
     * @param provisionedEgressMBps the provisionedEgressMBps value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setProvisionedEgressMBps(Integer provisionedEgressMBps) {
        this.provisionedEgressMBps = provisionedEgressMBps;
        return this;
    }

    /**
     * Get the nextAllowedQuotaDowngradeTime property: Returns the current
     * share next allowed quota downgrade time.
     *
     * @return the nextAllowedQuotaDowngradeTime value.
     */
    public OffsetDateTime getNextAllowedQuotaDowngradeTime() {
        if (this.nextAllowedQuotaDowngradeTime == null) {
            return null;
        }
        return this.nextAllowedQuotaDowngradeTime.getDateTime();
    }

    /**
     * Set the nextAllowedQuotaDowngradeTime property: Returns the current
     * share next allowed quota downgrade time.
     *
     * @param nextAllowedQuotaDowngradeTime the nextAllowedQuotaDowngradeTime
     * value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setNextAllowedQuotaDowngradeTime(OffsetDateTime nextAllowedQuotaDowngradeTime) {
        if (nextAllowedQuotaDowngradeTime == null) {
            this.nextAllowedQuotaDowngradeTime = null;
        } else {
            this.nextAllowedQuotaDowngradeTime = new DateTimeRfc1123(nextAllowedQuotaDowngradeTime);
        }
        return this;
    }

    /**
     * Get the accessTier property: Returns the access tier set on the share.
     *
     * @return the accessTier value.
     */
    public String getAccessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier property: Returns the access tier set on the share.
     *
     * @param accessTier the accessTier value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setAccessTier(String accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the accessTierChangeTime property: Returns the last modified time
     * (in UTC) of the access tier of the share.
     *
     * @return the accessTierChangeTime value.
     */
    public OffsetDateTime getAccessTierChangeTime() {
        if (this.accessTierChangeTime == null) {
            return null;
        }
        return this.accessTierChangeTime.getDateTime();
    }

    /**
     * Set the accessTierChangeTime property: Returns the last modified time
     * (in UTC) of the access tier of the share.
     *
     * @param accessTierChangeTime the accessTierChangeTime value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setAccessTierChangeTime(OffsetDateTime accessTierChangeTime) {
        if (accessTierChangeTime == null) {
            this.accessTierChangeTime = null;
        } else {
            this.accessTierChangeTime = new DateTimeRfc1123(accessTierChangeTime);
        }
        return this;
    }

    /**
     * Get the accessTierTransitionState property: Returns the transition state
     * betweeen access tiers, when present.
     *
     * @return the accessTierTransitionState value.
     */
    public String getAccessTierTransitionState() {
        return this.accessTierTransitionState;
    }

    /**
     * Set the accessTierTransitionState property: Returns the transition state
     * betweeen access tiers, when present.
     *
     * @param accessTierTransitionState the accessTierTransitionState value to
     * set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setAccessTierTransitionState(String accessTierTransitionState) {
        this.accessTierTransitionState = accessTierTransitionState;
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the ShareGetPropertiesHeaders object itself.
     */
    public ShareGetPropertiesHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
