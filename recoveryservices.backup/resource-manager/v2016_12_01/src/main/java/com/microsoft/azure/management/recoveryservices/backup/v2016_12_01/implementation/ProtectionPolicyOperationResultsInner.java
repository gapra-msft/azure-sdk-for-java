/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ProtectionPolicyOperationResults.
 */
public class ProtectionPolicyOperationResultsInner {
    /** The Retrofit service to perform REST calls. */
    private ProtectionPolicyOperationResultsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectionPolicyOperationResultsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProtectionPolicyOperationResultsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(ProtectionPolicyOperationResultsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProtectionPolicyOperationResults to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProtectionPolicyOperationResultsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.ProtectionPolicyOperationResults get" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupPolicies/{policyName}/operationResults/{operationId}")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Path("policyName") String policyName, @Path("operationId") String operationId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProtectionPolicyResourceInner object if successful.
     */
    public ProtectionPolicyResourceInner get(String vaultName, String resourceGroupName, String policyName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, policyName, operationId).toBlocking().single().body();
    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProtectionPolicyResourceInner> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId, final ServiceCallback<ProtectionPolicyResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName, policyName, operationId), serviceCallback);
    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ProtectionPolicyResourceInner> getAsync(String vaultName, String resourceGroupName, String policyName, String operationId) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName, policyName, operationId).map(new Func1<ServiceResponse<ProtectionPolicyResourceInner>, ProtectionPolicyResourceInner>() {
            @Override
            public ProtectionPolicyResourceInner call(ServiceResponse<ProtectionPolicyResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Provides the result of an operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param policyName Backup policy name whose operation's result needs to be fetched.
     * @param operationId Operation ID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProtectionPolicyResourceInner object
     */
    public Observable<ServiceResponse<ProtectionPolicyResourceInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName, String policyName, String operationId) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (policyName == null) {
            throw new IllegalArgumentException("Parameter policyName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), policyName, operationId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProtectionPolicyResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<ProtectionPolicyResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProtectionPolicyResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProtectionPolicyResourceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProtectionPolicyResourceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProtectionPolicyResourceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
