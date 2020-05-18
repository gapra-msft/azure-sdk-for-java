// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CsmCopySlotEntity model. */
@Fluent
public final class CsmCopySlotEntityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CsmCopySlotEntityInner.class);

    /*
     * Destination deployment slot during copy operation.
     */
    @JsonProperty(value = "targetSlot", required = true)
    private String targetSlot;

    /*
     * The site object which will be merged with the source slot site
     * to produce new destination slot site object.
     * <code>null</code> to just copy source slot content. Otherwise a
     * <code>Site</code>
     * object with properties to override source slot site.
     */
    @JsonProperty(value = "siteConfig", required = true)
    private SiteConfigInner siteConfig;

    /**
     * Get the targetSlot property: Destination deployment slot during copy operation.
     *
     * @return the targetSlot value.
     */
    public String targetSlot() {
        return this.targetSlot;
    }

    /**
     * Set the targetSlot property: Destination deployment slot during copy operation.
     *
     * @param targetSlot the targetSlot value to set.
     * @return the CsmCopySlotEntityInner object itself.
     */
    public CsmCopySlotEntityInner withTargetSlot(String targetSlot) {
        this.targetSlot = targetSlot;
        return this;
    }

    /**
     * Get the siteConfig property: The site object which will be merged with the source slot site to produce new
     * destination slot site object. &lt;code&gt;null&lt;/code&gt; to just copy source slot content. Otherwise a
     * &lt;code&gt;Site&lt;/code&gt; object with properties to override source slot site.
     *
     * @return the siteConfig value.
     */
    public SiteConfigInner siteConfig() {
        return this.siteConfig;
    }

    /**
     * Set the siteConfig property: The site object which will be merged with the source slot site to produce new
     * destination slot site object. &lt;code&gt;null&lt;/code&gt; to just copy source slot content. Otherwise a
     * &lt;code&gt;Site&lt;/code&gt; object with properties to override source slot site.
     *
     * @param siteConfig the siteConfig value to set.
     * @return the CsmCopySlotEntityInner object itself.
     */
    public CsmCopySlotEntityInner withSiteConfig(SiteConfigInner siteConfig) {
        this.siteConfig = siteConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetSlot() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetSlot in model CsmCopySlotEntityInner"));
        }
        if (siteConfig() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property siteConfig in model CsmCopySlotEntityInner"));
        } else {
            siteConfig().validate();
        }
    }
}
