/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties required to update a CdnWebApplicationFirewallPolicy.
 */
public class CdnWebApplicationFirewallPolicyPatchParameters {
    /**
     * CdnWebApplicationFirewallPolicy tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get cdnWebApplicationFirewallPolicy tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set cdnWebApplicationFirewallPolicy tags.
     *
     * @param tags the tags value to set
     * @return the CdnWebApplicationFirewallPolicyPatchParameters object itself.
     */
    public CdnWebApplicationFirewallPolicyPatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
