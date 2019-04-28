/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2018_09_15.ArmTemplates;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlab.v2018_09_15.ArmTemplate;

class ArmTemplatesImpl extends WrapperImpl<ArmTemplatesInner> implements ArmTemplates {
    private final DevTestLabManager manager;

    ArmTemplatesImpl(DevTestLabManager manager) {
        super(manager.inner().armTemplates());
        this.manager = manager;
    }

    public DevTestLabManager manager() {
        return this.manager;
    }

    private ArmTemplateImpl wrapModel(ArmTemplateInner inner) {
        return  new ArmTemplateImpl(inner, manager());
    }

    @Override
    public Observable<ArmTemplate> listAsync(final String resourceGroupName, final String labName, final String artifactSourceName) {
        ArmTemplatesInner client = this.inner();
        return client.listAsync(resourceGroupName, labName, artifactSourceName)
        .flatMapIterable(new Func1<Page<ArmTemplateInner>, Iterable<ArmTemplateInner>>() {
            @Override
            public Iterable<ArmTemplateInner> call(Page<ArmTemplateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ArmTemplateInner, ArmTemplate>() {
            @Override
            public ArmTemplate call(ArmTemplateInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ArmTemplate> getAsync(String resourceGroupName, String labName, String artifactSourceName, String name) {
        ArmTemplatesInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, artifactSourceName, name)
        .map(new Func1<ArmTemplateInner, ArmTemplate>() {
            @Override
            public ArmTemplate call(ArmTemplateInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
