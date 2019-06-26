/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.ReplicationFabrics;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10.Fabric;

class ReplicationFabricsImpl extends WrapperImpl<ReplicationFabricsInner> implements ReplicationFabrics {
    private final RecoveryServicesManager manager;

    ReplicationFabricsImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationFabrics());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public FabricImpl define(String name) {
        return wrapModel(name);
    }

    private FabricImpl wrapModel(FabricInner inner) {
        return  new FabricImpl(inner, manager());
    }

    private FabricImpl wrapModel(String name) {
        return new FabricImpl(name, this.manager());
    }

    @Override
    public Completable migrateToAadAsync(String fabricName) {
        ReplicationFabricsInner client = this.inner();
        return client.migrateToAadAsync(fabricName).toCompletable();
    }

    @Override
    public Observable<Fabric> renewCertificateAsync(String fabricName) {
        ReplicationFabricsInner client = this.inner();
        return client.renewCertificateAsync(fabricName)
        .map(new Func1<FabricInner, Fabric>() {
            @Override
            public Fabric call(FabricInner inner) {
                return new FabricImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Fabric> reassociateGatewayAsync(String fabricName) {
        ReplicationFabricsInner client = this.inner();
        return client.reassociateGatewayAsync(fabricName)
        .map(new Func1<FabricInner, Fabric>() {
            @Override
            public Fabric call(FabricInner inner) {
                return new FabricImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Fabric> checkConsistencyAsync(String fabricName) {
        ReplicationFabricsInner client = this.inner();
        return client.checkConsistencyAsync(fabricName)
        .map(new Func1<FabricInner, Fabric>() {
            @Override
            public Fabric call(FabricInner inner) {
                return new FabricImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String fabricName) {
        ReplicationFabricsInner client = this.inner();
        return client.deleteAsync(fabricName).toCompletable();
    }

    @Override
    public Observable<Fabric> listAsync() {
        ReplicationFabricsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<FabricInner>, Iterable<FabricInner>>() {
            @Override
            public Iterable<FabricInner> call(Page<FabricInner> page) {
                return page.items();
            }
        })
        .map(new Func1<FabricInner, Fabric>() {
            @Override
            public Fabric call(FabricInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Fabric> getAsync(String fabricName) {
        ReplicationFabricsInner client = this.inner();
        return client.getAsync(fabricName)
        .map(new Func1<FabricInner, Fabric>() {
            @Override
            public Fabric call(FabricInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable purgeAsync(String fabricName) {
        ReplicationFabricsInner client = this.inner();
        return client.purgeAsync(fabricName).toCompletable();
    }

}
