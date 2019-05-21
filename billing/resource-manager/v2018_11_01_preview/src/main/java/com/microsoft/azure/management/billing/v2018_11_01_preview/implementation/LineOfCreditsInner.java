/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ErrorResponseException;
import com.microsoft.azure.management.billing.v2018_11_01_preview.IncreaseLineOfCreditRequestProperties;
import com.microsoft.azure.management.billing.v2018_11_01_preview.LineOfCreditsIncreaseHeaders;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LineOfCredits.
 */
public class LineOfCreditsInner {
    /** The Retrofit service to perform REST calls. */
    private LineOfCreditsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of LineOfCreditsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LineOfCreditsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(LineOfCreditsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LineOfCredits to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LineOfCreditsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.LineOfCredits get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingAccounts/default/lineOfCredit/default")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.LineOfCredits increase" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingAccounts/default/lineOfCredit/default/increase")
        Observable<Response<ResponseBody>> increase(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body IncreaseLineOfCreditRequestProperties parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.LineOfCredits beginIncrease" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Billing/billingAccounts/default/lineOfCredit/default/increase")
        Observable<Response<ResponseBody>> beginIncrease(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body IncreaseLineOfCreditRequestProperties parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LineOfCreditInner object if successful.
     */
    public LineOfCreditInner get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Get the current line of credit.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LineOfCreditInner> getAsync(final ServiceCallback<LineOfCreditInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Get the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LineOfCreditInner object
     */
    public Observable<LineOfCreditInner> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<LineOfCreditInner>, LineOfCreditInner>() {
            @Override
            public LineOfCreditInner call(ServiceResponse<LineOfCreditInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LineOfCreditInner object
     */
    public Observable<ServiceResponse<LineOfCreditInner>> getWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LineOfCreditInner>>>() {
                @Override
                public Observable<ServiceResponse<LineOfCreditInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LineOfCreditInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LineOfCreditInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LineOfCreditInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LineOfCreditInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Increase the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void increase() {
        increaseWithServiceResponseAsync().toBlocking().last().body();
    }

    /**
     * Increase the current line of credit.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> increaseAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(increaseWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Increase the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> increaseAsync() {
        return increaseWithServiceResponseAsync().map(new Func1<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>, Void>() {
            @Override
            public Void call(ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Increase the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>> increaseWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Double desiredCreditLimit = null;
        IncreaseLineOfCreditRequestProperties parameters = new IncreaseLineOfCreditRequestProperties();
        parameters.withDesiredCreditLimit(null);
        Observable<Response<ResponseBody>> observable = service.increase(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultWithHeadersAsync(observable, new TypeToken<Void>() { }.getType(), LineOfCreditsIncreaseHeaders.class);
    }
    /**
     * Increase the current line of credit.
     *
     * @param desiredCreditLimit The desired credit limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void increase(Double desiredCreditLimit) {
        increaseWithServiceResponseAsync(desiredCreditLimit).toBlocking().last().body();
    }

    /**
     * Increase the current line of credit.
     *
     * @param desiredCreditLimit The desired credit limit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> increaseAsync(Double desiredCreditLimit, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(increaseWithServiceResponseAsync(desiredCreditLimit), serviceCallback);
    }

    /**
     * Increase the current line of credit.
     *
     * @param desiredCreditLimit The desired credit limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<Void> increaseAsync(Double desiredCreditLimit) {
        return increaseWithServiceResponseAsync(desiredCreditLimit).map(new Func1<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>, Void>() {
            @Override
            public Void call(ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Increase the current line of credit.
     *
     * @param desiredCreditLimit The desired credit limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>> increaseWithServiceResponseAsync(Double desiredCreditLimit) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        IncreaseLineOfCreditRequestProperties parameters = new IncreaseLineOfCreditRequestProperties();
        parameters.withDesiredCreditLimit(desiredCreditLimit);
        Observable<Response<ResponseBody>> observable = service.increase(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultWithHeadersAsync(observable, new TypeToken<Void>() { }.getType(), LineOfCreditsIncreaseHeaders.class);
    }

    /**
     * Increase the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginIncrease() {
        beginIncreaseWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Increase the current line of credit.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginIncreaseAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(beginIncreaseWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Increase the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<Void> beginIncreaseAsync() {
        return beginIncreaseWithServiceResponseAsync().map(new Func1<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>, Void>() {
            @Override
            public Void call(ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Increase the current line of credit.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>> beginIncreaseWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Double desiredCreditLimit = null;
        IncreaseLineOfCreditRequestProperties parameters = new IncreaseLineOfCreditRequestProperties();
        parameters.withDesiredCreditLimit(null);
        return service.beginIncrease(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders> clientResponse = beginIncreaseDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Increase the current line of credit.
     *
     * @param desiredCreditLimit The desired credit limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void beginIncrease(Double desiredCreditLimit) {
        beginIncreaseWithServiceResponseAsync(desiredCreditLimit).toBlocking().single().body();
    }

    /**
     * Increase the current line of credit.
     *
     * @param desiredCreditLimit The desired credit limit.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> beginIncreaseAsync(Double desiredCreditLimit, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(beginIncreaseWithServiceResponseAsync(desiredCreditLimit), serviceCallback);
    }

    /**
     * Increase the current line of credit.
     *
     * @param desiredCreditLimit The desired credit limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<Void> beginIncreaseAsync(Double desiredCreditLimit) {
        return beginIncreaseWithServiceResponseAsync(desiredCreditLimit).map(new Func1<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>, Void>() {
            @Override
            public Void call(ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Increase the current line of credit.
     *
     * @param desiredCreditLimit The desired credit limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>> beginIncreaseWithServiceResponseAsync(Double desiredCreditLimit) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        IncreaseLineOfCreditRequestProperties parameters = new IncreaseLineOfCreditRequestProperties();
        parameters.withDesiredCreditLimit(desiredCreditLimit);
        return service.beginIncrease(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders> clientResponse = beginIncreaseDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<Void, LineOfCreditsIncreaseHeaders> beginIncreaseDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildWithHeaders(response, LineOfCreditsIncreaseHeaders.class);
    }

}
