/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.Backends;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.BackendContract;

class BackendsImpl extends WrapperImpl<BackendsInner> implements Backends {
    private final ApiManagementManager manager;

    BackendsImpl(ApiManagementManager manager) {
        super(manager.inner().backends());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public BackendContractImpl define(String name) {
        return wrapModel(name);
    }

    private BackendContractImpl wrapModel(BackendContractInner inner) {
        return  new BackendContractImpl(inner, manager());
    }

    private BackendContractImpl wrapModel(String name) {
        return new BackendContractImpl(name, this.manager());
    }

    @Override
    public Observable<BackendContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        BackendsInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<BackendContractInner>, Iterable<BackendContractInner>>() {
            @Override
            public Iterable<BackendContractInner> call(Page<BackendContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BackendContractInner, BackendContract>() {
            @Override
            public BackendContract call(BackendContractInner inner) {
                return new BackendContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String backendId) {
        BackendsInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, backendId).toCompletable();
    }

    @Override
    public Observable<BackendContract> getAsync(String resourceGroupName, String serviceName, String backendId) {
        BackendsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, backendId)
        .map(new Func1<BackendContractInner, BackendContract>() {
            @Override
            public BackendContract call(BackendContractInner inner) {
                return new BackendContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String backendId, String ifMatch) {
        BackendsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, backendId, ifMatch).toCompletable();
    }

    @Override
    public Completable reconnectAsync(String resourceGroupName, String serviceName, String backendId) {
        BackendsInner client = this.inner();
        return client.reconnectAsync(resourceGroupName, serviceName, backendId).toCompletable();
    }

}
