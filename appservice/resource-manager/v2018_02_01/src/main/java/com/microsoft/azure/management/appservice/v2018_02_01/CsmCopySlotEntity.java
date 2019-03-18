/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Copy deployment slot parameters.
 */
public class CsmCopySlotEntity {
    /**
     * Destination deployment slot during copy operation.
     */
    @JsonProperty(value = "targetSlot", required = true)
    private String targetSlot;

    /**
     * The site object which will be merged with the source slot site
     * to produce new destination slot site object.
     * &lt;code&gt;null&lt;/code&gt; to just copy source slot content.
     * Otherwise a &lt;code&gt;Site&lt;/code&gt;
     * object with properties to override source slot site.
     */
    @JsonProperty(value = "siteConfig", required = true)
    private SiteConfig siteConfig;

    /**
     * Get destination deployment slot during copy operation.
     *
     * @return the targetSlot value
     */
    public String targetSlot() {
        return this.targetSlot;
    }

    /**
     * Set destination deployment slot during copy operation.
     *
     * @param targetSlot the targetSlot value to set
     * @return the CsmCopySlotEntity object itself.
     */
    public CsmCopySlotEntity withTargetSlot(String targetSlot) {
        this.targetSlot = targetSlot;
        return this;
    }

    /**
     * Get the site object which will be merged with the source slot site
     to produce new destination slot site object.
     &lt;code&gt;null&lt;/code&gt; to just copy source slot content. Otherwise a &lt;code&gt;Site&lt;/code&gt;
     object with properties to override source slot site.
     *
     * @return the siteConfig value
     */
    public SiteConfig siteConfig() {
        return this.siteConfig;
    }

    /**
     * Set the site object which will be merged with the source slot site
     to produce new destination slot site object.
     &lt;code&gt;null&lt;/code&gt; to just copy source slot content. Otherwise a &lt;code&gt;Site&lt;/code&gt;
     object with properties to override source slot site.
     *
     * @param siteConfig the siteConfig value to set
     * @return the CsmCopySlotEntity object itself.
     */
    public CsmCopySlotEntity withSiteConfig(SiteConfig siteConfig) {
        this.siteConfig = siteConfig;
        return this;
    }

}
