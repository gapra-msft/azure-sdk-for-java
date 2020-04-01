// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.changefeed;

import com.azure.core.util.paging.ContinuablePagedIterable;
import com.azure.storage.blob.changefeed.models.BlobChangefeedEvent;

/**
 * Implementation of {@link ContinuablePagedIterable} where the continuation token type is {@link String},
 * the element type is {@link BlobChangefeedEvent}, and the page type is {@link BlobChangefeedPagedResponse}.
 */
public final class BlobChangefeedPagedIterable extends ContinuablePagedIterable<String,
    BlobChangefeedEvent, BlobChangefeedPagedResponse> {
    /**
     * Creates an instance of {@link BlobChangefeedPagedIterable}.
     *
     * @param pagedFlux The {@link BlobChangefeedPagedFlux} that will be consumed as an iterable.
     */
    public BlobChangefeedPagedIterable(BlobChangefeedPagedFlux pagedFlux) {
        super(pagedFlux);
    }
}
