// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share.options;

import com.azure.core.annotation.Fluent;
import com.azure.storage.file.share.models.ShareAccessTier;

import java.util.Map;

/**
 * Extended options that may be passed when creating a Share.
 */
@Fluent
public class ShareCreateOptions {

    private ShareAccessTier accessTier;
    private Map<String, String> metadata;
    private Integer quotaInGB;

    /**
     * @return {@link ShareAccessTier}
     */
    public ShareAccessTier getAccessTier() {
        return accessTier;
    }

    /**
     * @return The metadata to associate with the share to create.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * @return The maximum size the share to be created is allowed to grow to in GB.
     */
    public Integer getQuotaInGB() {
        return quotaInGB;
    }

    /**
     * @param accessTier {@link ShareAccessTier}
     * @return The updated options.
     */
    public ShareCreateOptions setAccessTier(ShareAccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * @param metadata The metadata to associate with the share to create.
     * @return The updated options.
     */
    public ShareCreateOptions setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * @param quotaInGB The maximum size the share is allowed to grow to in GB. This must be greater than 0 and less
     * than or equal to 5120. The default value is 5120.
     * @return The updated options.
     */
    public ShareCreateOptions setQuotaInGB(Integer quotaInGB) {
        this.quotaInGB = quotaInGB;
        return this;
    }
}
