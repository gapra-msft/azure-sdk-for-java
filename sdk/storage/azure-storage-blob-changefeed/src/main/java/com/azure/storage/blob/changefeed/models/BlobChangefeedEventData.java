package com.azure.storage.blob.changefeed.models;

import com.azure.storage.blob.models.BlobType;
import com.azure.storage.internal.avro.implementation.schema.primitive.AvroNullSchema;

import java.util.Map;

public class BlobChangefeedEventData {

    private final String api;
    private final String clientRequestId;
    private final String requestId;
    private final String eTag;
    private final String contentType;
    private final Long contentLength;
    private final BlobType blobType;
    private final Long contentOffset;
    private final String destinationUrl;
    private final String sourceUrl;
    private final String blobUrl;
    private final Boolean recursive;
    private final String sequencer;

    public BlobChangefeedEventData(String api, String clientRequestId, String requestId, String eTag,
        String contentType, Long contentLength, BlobType blobType, Long contentOffset, String destinationUrl,
        String sourceUrl, String blobUrl, Boolean recursive, String sequencer) {
        this.api = api;
        this.clientRequestId = clientRequestId;
        this.requestId = requestId;
        this.eTag = eTag;
        this.contentType = contentType;
        this.contentLength = contentLength;
        this.blobType = blobType;
        this.contentOffset = contentOffset;
        this.destinationUrl = destinationUrl;
        this.sourceUrl = sourceUrl;
        this.blobUrl = blobUrl;
        this.recursive = recursive;
        this.sequencer = sequencer;
    }

    public static BlobChangefeedEventData fromRecord(Map<String, Object> data) {
        Object api = data.get("api");
        Object clientRequestId = data.get("clientRequestId");
        Object requestId = data.get("requestId");
        Object eTag = data.get("etag");
        Object contentType = data.get("contentType");
        Object contentLength = data.get("contentLength");
        Object blobType = data.get("blobType");
        Object contentOffset = data.get("contentOffset");
        Object destinationUrl = data.get("destinationUrl");
        Object sourceUrl = data.get("sourceUrl");
        Object blobUrl = data.get("url");
        Object recursive = data.get("recursive");
        Object sequencer = data.get("sequencer");

        return new BlobChangefeedEventData(BlobChangefeedEvent.isNull(api) ? null : api.toString(),
            BlobChangefeedEvent.isNull(clientRequestId) ? null : clientRequestId.toString(),
            BlobChangefeedEvent.isNull(requestId) ? null : requestId.toString(),
            BlobChangefeedEvent.isNull(eTag) ? null : eTag.toString(),
            BlobChangefeedEvent.isNull(contentType) ? null : contentType.toString(),
            BlobChangefeedEvent.isNull(contentLength) ? null : (Long) contentLength,
            BlobChangefeedEvent.isNull(blobType) ? null : BlobType.fromString(blobType.toString()),
            BlobChangefeedEvent.isNull(contentOffset) ? null : (Long) contentOffset,
            BlobChangefeedEvent.isNull(destinationUrl) ? null : destinationUrl.toString(),
            BlobChangefeedEvent.isNull(sourceUrl) ? null : sourceUrl.toString(),
            BlobChangefeedEvent.isNull(blobUrl) ? null : blobUrl.toString(),
            BlobChangefeedEvent.isNull(recursive) ? null : (Boolean) recursive,
            BlobChangefeedEvent.isNull(sequencer) ? null : sequencer.toString());
    }

    public String getApi() {
        return api;
    }

    public String getClientRequestId() {
        return clientRequestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public String geteTag() {
        return eTag;
    }

    public String getContentType() {
        return contentType;
    }

    public Long getContentLength() {
        return contentLength;
    }

    public BlobType getBlobType() {
        return blobType;
    }

    public Long getContentOffset() {
        return contentOffset;
    }

    public String getDestinationUrl() {
        return destinationUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public String getBlobUrl() {
        return blobUrl;
    }

    public Boolean getRecursive() {
        return recursive;
    }

    public String getSequencer() {
        return sequencer;
    }
}
