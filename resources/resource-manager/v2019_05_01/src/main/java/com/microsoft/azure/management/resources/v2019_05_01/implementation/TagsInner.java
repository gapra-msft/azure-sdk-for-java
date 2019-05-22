/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Tags.
 */
public class TagsInner {
    /** The Retrofit service to perform REST calls. */
    private TagsService service;
    /** The service client containing this operation class. */
    private ResourceManagementClientImpl client;

    /**
     * Initializes an instance of TagsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TagsInner(Retrofit retrofit, ResourceManagementClientImpl client) {
        this.service = retrofit.create(TagsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Tags to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TagsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2019_05_01.Tags deleteValue" })
        @HTTP(path = "subscriptions/{subscriptionId}/tagNames/{tagName}/tagValues/{tagValue}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteValue(@Path("tagName") String tagName, @Path("tagValue") String tagValue, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2019_05_01.Tags createOrUpdateValue" })
        @PUT("subscriptions/{subscriptionId}/tagNames/{tagName}/tagValues/{tagValue}")
        Observable<Response<ResponseBody>> createOrUpdateValue(@Path("tagName") String tagName, @Path("tagValue") String tagValue, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2019_05_01.Tags createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/tagNames/{tagName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("tagName") String tagName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2019_05_01.Tags delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/tagNames/{tagName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("tagName") String tagName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2019_05_01.Tags list" })
        @GET("subscriptions/{subscriptionId}/tagNames")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.v2019_05_01.Tags listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void deleteValue(String tagName, String tagValue) {
        deleteValueWithServiceResponseAsync(tagName, tagValue).toBlocking().single().body();
    }

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteValueAsync(String tagName, String tagValue, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteValueWithServiceResponseAsync(tagName, tagValue), serviceCallback);
    }

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteValueAsync(String tagName, String tagValue) {
        return deleteValueWithServiceResponseAsync(tagName, tagValue).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a tag value.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteValueWithServiceResponseAsync(String tagName, String tagValue) {
        if (tagName == null) {
            throw new IllegalArgumentException("Parameter tagName is required and cannot be null.");
        }
        if (tagValue == null) {
            throw new IllegalArgumentException("Parameter tagValue is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.deleteValue(tagName, tagValue, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteValueDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteValueDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TagValueInner object if successful.
     */
    public TagValueInner createOrUpdateValue(String tagName, String tagValue) {
        return createOrUpdateValueWithServiceResponseAsync(tagName, tagValue).toBlocking().single().body();
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TagValueInner> createOrUpdateValueAsync(String tagName, String tagValue, final ServiceCallback<TagValueInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateValueWithServiceResponseAsync(tagName, tagValue), serviceCallback);
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TagValueInner object
     */
    public Observable<TagValueInner> createOrUpdateValueAsync(String tagName, String tagValue) {
        return createOrUpdateValueWithServiceResponseAsync(tagName, tagValue).map(new Func1<ServiceResponse<TagValueInner>, TagValueInner>() {
            @Override
            public TagValueInner call(ServiceResponse<TagValueInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a tag value. The name of the tag must already exist.
     *
     * @param tagName The name of the tag.
     * @param tagValue The value of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TagValueInner object
     */
    public Observable<ServiceResponse<TagValueInner>> createOrUpdateValueWithServiceResponseAsync(String tagName, String tagValue) {
        if (tagName == null) {
            throw new IllegalArgumentException("Parameter tagName is required and cannot be null.");
        }
        if (tagValue == null) {
            throw new IllegalArgumentException("Parameter tagValue is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.createOrUpdateValue(tagName, tagValue, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TagValueInner>>>() {
                @Override
                public Observable<ServiceResponse<TagValueInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TagValueInner> clientResponse = createOrUpdateValueDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TagValueInner> createOrUpdateValueDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TagValueInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TagValueInner>() { }.getType())
                .register(201, new TypeToken<TagValueInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a tag in the subscription.
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TagDetailsInner object if successful.
     */
    public TagDetailsInner createOrUpdate(String tagName) {
        return createOrUpdateWithServiceResponseAsync(tagName).toBlocking().single().body();
    }

    /**
     * Creates a tag in the subscription.
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TagDetailsInner> createOrUpdateAsync(String tagName, final ServiceCallback<TagDetailsInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(tagName), serviceCallback);
    }

    /**
     * Creates a tag in the subscription.
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TagDetailsInner object
     */
    public Observable<TagDetailsInner> createOrUpdateAsync(String tagName) {
        return createOrUpdateWithServiceResponseAsync(tagName).map(new Func1<ServiceResponse<TagDetailsInner>, TagDetailsInner>() {
            @Override
            public TagDetailsInner call(ServiceResponse<TagDetailsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a tag in the subscription.
     * The tag name can have a maximum of 512 characters and is case insensitive. Tag names created by Azure have prefixes of microsoft, azure, or windows. You cannot create tags with one of these prefixes.
     *
     * @param tagName The name of the tag to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TagDetailsInner object
     */
    public Observable<ServiceResponse<TagDetailsInner>> createOrUpdateWithServiceResponseAsync(String tagName) {
        if (tagName == null) {
            throw new IllegalArgumentException("Parameter tagName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.createOrUpdate(tagName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TagDetailsInner>>>() {
                @Override
                public Observable<ServiceResponse<TagDetailsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TagDetailsInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TagDetailsInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TagDetailsInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TagDetailsInner>() { }.getType())
                .register(201, new TypeToken<TagDetailsInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a tag from the subscription.
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String tagName) {
        deleteWithServiceResponseAsync(tagName).toBlocking().single().body();
    }

    /**
     * Deletes a tag from the subscription.
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String tagName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(tagName), serviceCallback);
    }

    /**
     * Deletes a tag from the subscription.
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String tagName) {
        return deleteWithServiceResponseAsync(tagName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a tag from the subscription.
     * You must remove all values from a resource tag before you can delete it.
     *
     * @param tagName The name of the tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String tagName) {
        if (tagName == null) {
            throw new IllegalArgumentException("Parameter tagName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(tagName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TagDetailsInner&gt; object if successful.
     */
    public PagedList<TagDetailsInner> list() {
        ServiceResponse<Page<TagDetailsInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<TagDetailsInner>(response.body()) {
            @Override
            public Page<TagDetailsInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TagDetailsInner>> listAsync(final ListOperationCallback<TagDetailsInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<TagDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagDetailsInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagDetailsInner&gt; object
     */
    public Observable<Page<TagDetailsInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<TagDetailsInner>>, Page<TagDetailsInner>>() {
                @Override
                public Page<TagDetailsInner> call(ServiceResponse<Page<TagDetailsInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagDetailsInner&gt; object
     */
    public Observable<ServiceResponse<Page<TagDetailsInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<TagDetailsInner>>, Observable<ServiceResponse<Page<TagDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagDetailsInner>>> call(ServiceResponse<Page<TagDetailsInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;TagDetailsInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TagDetailsInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TagDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagDetailsInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<TagDetailsInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TagDetailsInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<TagDetailsInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<TagDetailsInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<TagDetailsInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TagDetailsInner&gt; object if successful.
     */
    public PagedList<TagDetailsInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<TagDetailsInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<TagDetailsInner>(response.body()) {
            @Override
            public Page<TagDetailsInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TagDetailsInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<TagDetailsInner>> serviceFuture, final ListOperationCallback<TagDetailsInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<TagDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagDetailsInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagDetailsInner&gt; object
     */
    public Observable<Page<TagDetailsInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<TagDetailsInner>>, Page<TagDetailsInner>>() {
                @Override
                public Page<TagDetailsInner> call(ServiceResponse<Page<TagDetailsInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TagDetailsInner&gt; object
     */
    public Observable<ServiceResponse<Page<TagDetailsInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<TagDetailsInner>>, Observable<ServiceResponse<Page<TagDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagDetailsInner>>> call(ServiceResponse<Page<TagDetailsInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets the names and values of all resource tags that are defined in a subscription.
     *
    ServiceResponse<PageImpl<TagDetailsInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;TagDetailsInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<TagDetailsInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<TagDetailsInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<TagDetailsInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<TagDetailsInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<TagDetailsInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<TagDetailsInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<TagDetailsInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<TagDetailsInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
