/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.automation.v2015_10_31.Jobs;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.automation.v2015_10_31.Job;
import java.util.UUID;
import com.microsoft.azure.management.automation.v2015_10_31.JobCreateParameters;

class JobsImpl extends WrapperImpl<JobsInner> implements Jobs {
    private final AutomationManager manager;

    JobsImpl(AutomationManager manager) {
        super(manager.inner().jobs());
        this.manager = manager;
    }

    public AutomationManager manager() {
        return this.manager;
    }

    private JobImpl wrapModel(JobInner inner) {
        return  new JobImpl(inner, manager());
    }

    @Override
    public Completable suspendAsync(String resourceGroupName, String automationAccountName, UUID jobId) {
        JobsInner client = this.inner();
        return client.suspendAsync(resourceGroupName, automationAccountName, jobId).toCompletable();
    }

    @Override
    public Completable stopAsync(String resourceGroupName, String automationAccountName, UUID jobId) {
        JobsInner client = this.inner();
        return client.stopAsync(resourceGroupName, automationAccountName, jobId).toCompletable();
    }

    @Override
    public Observable<Job> createAsync(String resourceGroupName, String automationAccountName, UUID jobId, JobCreateParameters parameters) {
        JobsInner client = this.inner();
        return client.createAsync(resourceGroupName, automationAccountName, jobId, parameters)
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return new JobImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable resumeAsync(String resourceGroupName, String automationAccountName, UUID jobId) {
        JobsInner client = this.inner();
        return client.resumeAsync(resourceGroupName, automationAccountName, jobId).toCompletable();
    }

    @Override
    public Observable<Job> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName) {
        JobsInner client = this.inner();
        return client.listByAutomationAccountAsync(resourceGroupName, automationAccountName)
        .flatMapIterable(new Func1<Page<JobInner>, Iterable<JobInner>>() {
            @Override
            public Iterable<JobInner> call(Page<JobInner> page) {
                return page.items();
            }
        })
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Job> getAsync(String resourceGroupName, String automationAccountName, UUID jobId) {
        JobsInner client = this.inner();
        return client.getAsync(resourceGroupName, automationAccountName, jobId)
        .map(new Func1<JobInner, Job>() {
            @Override
            public Job call(JobInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable getOutputAsync(String resourceGroupName, String automationAccountName, String jobId) {
        JobsInner client = this.inner();
        return client.getOutputAsync(resourceGroupName, automationAccountName, jobId).toCompletable();
    }

    @Override
    public Completable getRunbookContentAsync(String resourceGroupName, String automationAccountName, String jobId) {
        JobsInner client = this.inner();
        return client.getRunbookContentAsync(resourceGroupName, automationAccountName, jobId).toCompletable();
    }

}
