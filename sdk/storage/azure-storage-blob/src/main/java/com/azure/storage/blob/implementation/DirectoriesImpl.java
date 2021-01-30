// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Head;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.blob.implementation.models.DataLakeStorageErrorException;
import com.azure.storage.blob.implementation.models.DirectoriesCreateResponse;
import com.azure.storage.blob.implementation.models.DirectoriesDeleteResponse;
import com.azure.storage.blob.implementation.models.DirectoriesGetAccessControlResponse;
import com.azure.storage.blob.implementation.models.DirectoriesRenameResponse;
import com.azure.storage.blob.implementation.models.DirectoriesSetAccessControlResponse;
import com.azure.storage.blob.implementation.models.DirectoryHttpHeaders;
import com.azure.storage.blob.models.PathRenameMode;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Directories. */
public final class DirectoriesImpl {
    /** The proxy service used to perform REST calls. */
    private final DirectoriesService service;

    /** The service client containing this operation class. */
    private final AzureBlobStorageImpl client;

    /**
     * Initializes an instance of DirectoriesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DirectoriesImpl(AzureBlobStorageImpl client) {
        this.service =
                RestProxy.create(DirectoriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureBlobStorageDirectories to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureBlobStorageDire")
    private interface DirectoriesService {
        @Put("/{filesystem}/{path}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectoriesCreateResponse> create(
                @HostParam("url") String url,
                @QueryParam("resource") String resource,
                @PathParam("filesystem") String filesystem,
                @PathParam("path") String path,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-properties") String directoryProperties,
                @HeaderParam("x-ms-permissions") String posixPermissions,
                @HeaderParam("x-ms-umask") String posixUmask,
                @HeaderParam("x-ms-cache-control") String cacheControl,
                @HeaderParam("x-ms-content-type") String contentType,
                @HeaderParam("x-ms-content-encoding") String contentEncoding,
                @HeaderParam("x-ms-content-language") String contentLanguage,
                @HeaderParam("x-ms-content-disposition") String contentDisposition,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/{filesystem}/{path}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectoriesRenameResponse> rename(
                @HostParam("url") String url,
                @PathParam("filesystem") String filesystem,
                @PathParam("path") String path,
                @QueryParam("timeout") Integer timeout,
                @QueryParam("continuation") String marker,
                @QueryParam("mode") PathRenameMode pathRenameMode,
                @HeaderParam("x-ms-rename-source") String renameSource,
                @HeaderParam("x-ms-properties") String directoryProperties,
                @HeaderParam("x-ms-permissions") String posixPermissions,
                @HeaderParam("x-ms-umask") String posixUmask,
                @HeaderParam("x-ms-cache-control") String cacheControl,
                @HeaderParam("x-ms-content-type") String contentType,
                @HeaderParam("x-ms-content-encoding") String contentEncoding,
                @HeaderParam("x-ms-content-language") String contentLanguage,
                @HeaderParam("x-ms-content-disposition") String contentDisposition,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("x-ms-source-lease-id") String sourceLeaseId,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("x-ms-source-if-modified-since") DateTimeRfc1123 sourceIfModifiedSince,
                @HeaderParam("x-ms-source-if-unmodified-since") DateTimeRfc1123 sourceIfUnmodifiedSince,
                @HeaderParam("x-ms-source-if-match") String sourceIfMatch,
                @HeaderParam("x-ms-source-if-none-match") String sourceIfNoneMatch,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Delete("/{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectoriesDeleteResponse> delete(
                @HostParam("url") String url,
                @PathParam("filesystem") String filesystem,
                @PathParam("path") String path,
                @QueryParam("timeout") Integer timeout,
                @QueryParam("recursive") boolean recursiveDirectoryDelete,
                @QueryParam("continuation") String marker,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("Accept") String accept,
                Context context);

        @Patch("/{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectoriesSetAccessControlResponse> setAccessControl(
                @HostParam("url") String url,
                @QueryParam("action") String action,
                @QueryParam("timeout") Integer timeout,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("x-ms-owner") String owner,
                @HeaderParam("x-ms-group") String group,
                @HeaderParam("x-ms-permissions") String posixPermissions,
                @HeaderParam("x-ms-acl") String posixAcl,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);

        @Head("/{filesystem}/{path}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(DataLakeStorageErrorException.class)
        Mono<DirectoriesGetAccessControlResponse> getAccessControl(
                @HostParam("url") String url,
                @QueryParam("action") String action,
                @QueryParam("timeout") Integer timeout,
                @QueryParam("upn") Boolean upn,
                @HeaderParam("x-ms-lease-id") String leaseId,
                @HeaderParam("If-Match") String ifMatch,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @HeaderParam("If-Modified-Since") DateTimeRfc1123 ifModifiedSince,
                @HeaderParam("If-Unmodified-Since") DateTimeRfc1123 ifUnmodifiedSince,
                @HeaderParam("x-ms-client-request-id") String requestId,
                @HeaderParam("x-ms-version") String version,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Create a directory. By default, the destination is overwritten and if the destination already exists and has a
     * lease the lease is broken. This operation supports conditional HTTP requests. For more information, see
     * [Specifying Conditional Headers for Blob Service
     * Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).
     * To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param directoryProperties Optional. User-defined properties to be stored with the file or directory, in the
     *     format of a comma-separated list of name and value pairs "n1=v1, n2=v2, ...", where each value is base64
     *     encoded.
     * @param posixPermissions Optional and only valid if Hierarchical Namespace is enabled for the account. Sets POSIX
     *     access permissions for the file owner, the file owning group, and others. Each class may be granted read,
     *     write, or execute permission. The sticky bit is also supported. Both symbolic (rwxrw-rw-) and 4-digit octal
     *     notation (e.g. 0766) are supported.
     * @param posixUmask Only valid if Hierarchical Namespace is enabled for the account. This umask restricts
     *     permission settings for file and directory, and will only be applied when default Acl does not exist in
     *     parent directory. If the umask bit has set, it means that the corresponding permission will be disabled.
     *     Otherwise the corresponding permission will be determined by the permission. A 4-digit octal notation (e.g.
     *     0022) is supported here. If no umask was specified, a default umask - 0027 will be used.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param directoryHttpHeaders Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectoriesCreateResponse> createWithResponseAsync(
            String filesystem,
            String path,
            Integer timeout,
            String directoryProperties,
            String posixPermissions,
            String posixUmask,
            String leaseId,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String ifMatch,
            String ifNoneMatch,
            String requestId,
            DirectoryHttpHeaders directoryHttpHeaders,
            Context context) {
        final String resource = "directory";
        final String accept = "application/xml";
        String cacheControlInternal = null;
        if (directoryHttpHeaders != null) {
            cacheControlInternal = directoryHttpHeaders.getCacheControl();
        }
        String cacheControl = cacheControlInternal;
        String contentTypeInternal = null;
        if (directoryHttpHeaders != null) {
            contentTypeInternal = directoryHttpHeaders.getContentType();
        }
        String contentType = contentTypeInternal;
        String contentEncodingInternal = null;
        if (directoryHttpHeaders != null) {
            contentEncodingInternal = directoryHttpHeaders.getContentEncoding();
        }
        String contentEncoding = contentEncodingInternal;
        String contentLanguageInternal = null;
        if (directoryHttpHeaders != null) {
            contentLanguageInternal = directoryHttpHeaders.getContentLanguage();
        }
        String contentLanguage = contentLanguageInternal;
        String contentDispositionInternal = null;
        if (directoryHttpHeaders != null) {
            contentDispositionInternal = directoryHttpHeaders.getContentDisposition();
        }
        String contentDisposition = contentDispositionInternal;
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.create(
                this.client.getUrl(),
                resource,
                filesystem,
                path,
                timeout,
                directoryProperties,
                posixPermissions,
                posixUmask,
                cacheControl,
                contentType,
                contentEncoding,
                contentLanguage,
                contentDisposition,
                leaseId,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                ifMatch,
                ifNoneMatch,
                this.client.getVersion(),
                requestId,
                accept,
                context);
    }

    /**
     * Rename a directory. By default, the destination is overwritten and if the destination already exists and has a
     * lease the lease is broken. This operation supports conditional HTTP requests. For more information, see
     * [Specifying Conditional Headers for Blob Service
     * Operations](https://docs.microsoft.com/en-us/rest/api/storageservices/specifying-conditional-headers-for-blob-service-operations).
     * To fail if the destination already exists, use a conditional request with If-None-Match: "*".
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param renameSource The file or directory to be renamed. The value must have the following format:
     *     "/{filesysystem}/{path}". If "x-ms-properties" is specified, the properties will overwrite the existing
     *     properties; otherwise, the existing properties will be preserved.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param marker When renaming a directory, the number of paths that are renamed with each invocation is limited. If
     *     the number of paths to be renamed exceeds this limit, a continuation token is returned in this response
     *     header. When a continuation token is returned in the response, it must be specified in a subsequent
     *     invocation of the rename operation to continue renaming the directory.
     * @param directoryProperties Optional. User-defined properties to be stored with the file or directory, in the
     *     format of a comma-separated list of name and value pairs "n1=v1, n2=v2, ...", where each value is base64
     *     encoded.
     * @param posixPermissions Optional and only valid if Hierarchical Namespace is enabled for the account. Sets POSIX
     *     access permissions for the file owner, the file owning group, and others. Each class may be granted read,
     *     write, or execute permission. The sticky bit is also supported. Both symbolic (rwxrw-rw-) and 4-digit octal
     *     notation (e.g. 0766) are supported.
     * @param posixUmask Only valid if Hierarchical Namespace is enabled for the account. This umask restricts
     *     permission settings for file and directory, and will only be applied when default Acl does not exist in
     *     parent directory. If the umask bit has set, it means that the corresponding permission will be disabled.
     *     Otherwise the corresponding permission will be determined by the permission. A 4-digit octal notation (e.g.
     *     0022) is supported here. If no umask was specified, a default umask - 0027 will be used.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param sourceLeaseId A lease ID for the source path. If specified, the source path must have an active lease and
     *     the lease ID must match.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param sourceIfModifiedSince Specify this header value to operate only on a blob if it has been modified since
     *     the specified date/time.
     * @param sourceIfUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified
     *     since the specified date/time.
     * @param sourceIfMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param sourceIfNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param directoryHttpHeaders Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectoriesRenameResponse> renameWithResponseAsync(
            String filesystem,
            String path,
            String renameSource,
            Integer timeout,
            String marker,
            String directoryProperties,
            String posixPermissions,
            String posixUmask,
            String leaseId,
            String sourceLeaseId,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String ifMatch,
            String ifNoneMatch,
            OffsetDateTime sourceIfModifiedSince,
            OffsetDateTime sourceIfUnmodifiedSince,
            String sourceIfMatch,
            String sourceIfNoneMatch,
            String requestId,
            DirectoryHttpHeaders directoryHttpHeaders,
            Context context) {
        final String accept = "application/xml";
        String cacheControlInternal = null;
        if (directoryHttpHeaders != null) {
            cacheControlInternal = directoryHttpHeaders.getCacheControl();
        }
        String cacheControl = cacheControlInternal;
        String contentTypeInternal = null;
        if (directoryHttpHeaders != null) {
            contentTypeInternal = directoryHttpHeaders.getContentType();
        }
        String contentType = contentTypeInternal;
        String contentEncodingInternal = null;
        if (directoryHttpHeaders != null) {
            contentEncodingInternal = directoryHttpHeaders.getContentEncoding();
        }
        String contentEncoding = contentEncodingInternal;
        String contentLanguageInternal = null;
        if (directoryHttpHeaders != null) {
            contentLanguageInternal = directoryHttpHeaders.getContentLanguage();
        }
        String contentLanguage = contentLanguageInternal;
        String contentDispositionInternal = null;
        if (directoryHttpHeaders != null) {
            contentDispositionInternal = directoryHttpHeaders.getContentDisposition();
        }
        String contentDisposition = contentDispositionInternal;
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        DateTimeRfc1123 sourceIfModifiedSinceConverted =
                sourceIfModifiedSince == null ? null : new DateTimeRfc1123(sourceIfModifiedSince);
        DateTimeRfc1123 sourceIfUnmodifiedSinceConverted =
                sourceIfUnmodifiedSince == null ? null : new DateTimeRfc1123(sourceIfUnmodifiedSince);
        return service.rename(
                this.client.getUrl(),
                filesystem,
                path,
                timeout,
                marker,
                this.client.getPathRenameMode(),
                renameSource,
                directoryProperties,
                posixPermissions,
                posixUmask,
                cacheControl,
                contentType,
                contentEncoding,
                contentLanguage,
                contentDisposition,
                leaseId,
                sourceLeaseId,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                ifMatch,
                ifNoneMatch,
                sourceIfModifiedSinceConverted,
                sourceIfUnmodifiedSinceConverted,
                sourceIfMatch,
                sourceIfNoneMatch,
                this.client.getVersion(),
                requestId,
                accept,
                context);
    }

    /**
     * Deletes the directory.
     *
     * @param filesystem The filesystem name.
     * @param path The namespace path to a file or directory.
     * @param recursiveDirectoryDelete If "true", all paths beneath the directory will be deleted. If "false" and the
     *     directory is non-empty, an error occurs.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param marker When renaming a directory, the number of paths that are renamed with each invocation is limited. If
     *     the number of paths to be renamed exceeds this limit, a continuation token is returned in this response
     *     header. When a continuation token is returned in the response, it must be specified in a subsequent
     *     invocation of the rename operation to continue renaming the directory.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectoriesDeleteResponse> deleteWithResponseAsync(
            String filesystem,
            String path,
            boolean recursiveDirectoryDelete,
            Integer timeout,
            String marker,
            String leaseId,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String ifMatch,
            String ifNoneMatch,
            String requestId,
            Context context) {
        final String accept = "application/xml";
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.delete(
                this.client.getUrl(),
                filesystem,
                path,
                timeout,
                recursiveDirectoryDelete,
                marker,
                leaseId,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                ifMatch,
                ifNoneMatch,
                this.client.getVersion(),
                requestId,
                accept,
                context);
    }

    /**
     * Set the owner, group, permissions, or access control list for a directory.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param owner Optional. The owner of the blob or directory.
     * @param group Optional. The owning group of the blob or directory.
     * @param posixPermissions Optional and only valid if Hierarchical Namespace is enabled for the account. Sets POSIX
     *     access permissions for the file owner, the file owning group, and others. Each class may be granted read,
     *     write, or execute permission. The sticky bit is also supported. Both symbolic (rwxrw-rw-) and 4-digit octal
     *     notation (e.g. 0766) are supported.
     * @param posixAcl Sets POSIX access control rights on files and directories. The value is a comma-separated list of
     *     access control entries. Each access control entry (ACE) consists of a scope, a type, a user or group
     *     identifier, and permissions in the format "[scope:][type]:[id]:[permissions]".
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectoriesSetAccessControlResponse> setAccessControlWithResponseAsync(
            Integer timeout,
            String leaseId,
            String owner,
            String group,
            String posixPermissions,
            String posixAcl,
            String ifMatch,
            String ifNoneMatch,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String requestId,
            Context context) {
        final String action = "setAccessControl";
        final String accept = "application/xml";
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.setAccessControl(
                this.client.getUrl(),
                action,
                timeout,
                leaseId,
                owner,
                group,
                posixPermissions,
                posixAcl,
                ifMatch,
                ifNoneMatch,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                requestId,
                this.client.getVersion(),
                accept,
                context);
    }

    /**
     * Get the owner, group, permissions, or access control list for a directory.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a
     *     href="https://docs.microsoft.com/en-us/rest/api/storageservices/fileservices/setting-timeouts-for-blob-service-operations"&gt;Setting
     *     Timeouts for Blob Service Operations.&lt;/a&gt;.
     * @param upn Optional. Valid only when Hierarchical Namespace is enabled for the account. If "true", the identity
     *     values returned in the x-ms-owner, x-ms-group, and x-ms-acl response headers will be transformed from Azure
     *     Active Directory Object IDs to User Principal Names. If "false", the values will be returned as Azure Active
     *     Directory Object IDs. The default value is false.
     * @param leaseId If specified, the operation only succeeds if the resource's lease is active and matches this ID.
     * @param ifMatch Specify an ETag value to operate only on blobs with a matching value.
     * @param ifNoneMatch Specify an ETag value to operate only on blobs without a matching value.
     * @param ifModifiedSince Specify this header value to operate only on a blob if it has been modified since the
     *     specified date/time.
     * @param ifUnmodifiedSince Specify this header value to operate only on a blob if it has not been modified since
     *     the specified date/time.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *     analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws DataLakeStorageErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the owner, group, permissions, or access control list for a directory.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectoriesGetAccessControlResponse> getAccessControlWithResponseAsync(
            Integer timeout,
            Boolean upn,
            String leaseId,
            String ifMatch,
            String ifNoneMatch,
            OffsetDateTime ifModifiedSince,
            OffsetDateTime ifUnmodifiedSince,
            String requestId,
            Context context) {
        final String action = "getAccessControl";
        final String accept = "application/xml";
        DateTimeRfc1123 ifModifiedSinceConverted =
                ifModifiedSince == null ? null : new DateTimeRfc1123(ifModifiedSince);
        DateTimeRfc1123 ifUnmodifiedSinceConverted =
                ifUnmodifiedSince == null ? null : new DateTimeRfc1123(ifUnmodifiedSince);
        return service.getAccessControl(
                this.client.getUrl(),
                action,
                timeout,
                upn,
                leaseId,
                ifMatch,
                ifNoneMatch,
                ifModifiedSinceConverted,
                ifUnmodifiedSinceConverted,
                requestId,
                this.client.getVersion(),
                accept,
                context);
    }
}
