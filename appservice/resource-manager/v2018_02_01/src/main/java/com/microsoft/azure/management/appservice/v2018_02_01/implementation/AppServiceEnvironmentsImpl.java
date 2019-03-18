/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceEnvironments;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.appservice.v2018_02_01.AppServiceEnvironmentResource;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.appservice.v2018_02_01.Sites;
import com.microsoft.azure.management.appservice.v2018_02_01.VirtualNetworkProfile;
import com.microsoft.azure.management.appservice.v2018_02_01.StampCapacity;
import com.microsoft.azure.management.appservice.v2018_02_01.AddressResponse;
import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentDiagnostics;
import java.util.List;
import com.microsoft.azure.management.appservice.v2018_02_01.InboundEnvironmentEndpoint;
import com.microsoft.azure.management.appservice.v2018_02_01.MetricDefinition;
import com.microsoft.azure.management.appservice.v2018_02_01.SiteResourceMetricDefinition;
import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentResourceMetric;
import com.microsoft.azure.management.appservice.v2018_02_01.SiteResourceMetric;
import com.microsoft.azure.management.appservice.v2018_02_01.MultiRolePools;
import com.microsoft.azure.management.appservice.v2018_02_01.SkuInfo;
import com.microsoft.azure.management.appservice.v2018_02_01.Usage;
import com.microsoft.azure.management.appservice.v2018_02_01.SiteCsmUsageQuota;
import com.microsoft.azure.management.appservice.v2018_02_01.Operation;
import com.microsoft.azure.management.appservice.v2018_02_01.OutboundEnvironmentEndpoint;
import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentAppServicePlan;
import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentSite;
import com.microsoft.azure.management.appservice.v2018_02_01.WorkerPools;

class AppServiceEnvironmentsImpl extends WrapperImpl<AppServiceEnvironmentsInner> implements AppServiceEnvironments {
    private final CertificateRegistrationManager manager;

    AppServiceEnvironmentsImpl(CertificateRegistrationManager manager) {
        super(manager.inner().appServiceEnvironments());
        this.manager = manager;
    }

    public CertificateRegistrationManager manager() {
        return this.manager;
    }

    @Override
    public AppServiceEnvironmentResourceImpl defineHostingEnvironment(String name) {
        return wrapHostingEnvironmentModel(name);
    }

    @Override
    public WorkerPoolsImpl defineWorkerPool(String name) {
        return wrapWorkerPoolModel(name);
    }

    private AppServiceEnvironmentResourceImpl wrapHostingEnvironmentModel(String name) {
        return new AppServiceEnvironmentResourceImpl(name, new AppServiceEnvironmentResourceInner(), this.manager());
    }

    private WorkerPoolsImpl wrapWorkerPoolModel(String name) {
        return new WorkerPoolsImpl(name, this.manager());
    }

    private AppServiceEnvironmentResourceImpl wrapAppServiceEnvironmentResourceModel(AppServiceEnvironmentResourceInner inner) {
        return  new AppServiceEnvironmentResourceImpl(inner.name(), inner, manager());
    }

    private HostingEnvironmentDiagnosticsImpl wrapHostingEnvironmentDiagnosticsModel(HostingEnvironmentDiagnosticsInner inner) {
        return  new HostingEnvironmentDiagnosticsImpl(inner, manager());
    }

    private InboundEnvironmentEndpointImpl wrapInboundEnvironmentEndpointModel(InboundEnvironmentEndpointInner inner) {
        return  new InboundEnvironmentEndpointImpl(inner, manager());
    }

    private HostingEnvironmentResourceMetricImpl wrapHostingEnvironmentResourceMetricModel(ResourceMetricInner inner) {
        return  new HostingEnvironmentResourceMetricImpl(inner, manager());
    }

    private MultiRolePoolsImpl wrapMultiRolePoolsModel(WorkerPoolResourceInner inner) {
        return  new MultiRolePoolsImpl(inner, manager());
    }

    private OperationImpl wrapOperationModel(OperationInner inner) {
        return  new OperationImpl(inner, manager());
    }

    private OutboundEnvironmentEndpointImpl wrapOutboundEnvironmentEndpointModel(OutboundEnvironmentEndpointInner inner) {
        return  new OutboundEnvironmentEndpointImpl(inner, manager());
    }

    private HostingEnvironmentAppServicePlanImpl wrapHostingEnvironmentAppServicePlanModel(AppServicePlanInner inner) {
        return  new HostingEnvironmentAppServicePlanImpl(inner, manager());
    }

    private HostingEnvironmentSiteImpl wrapHostingEnvironmentSiteModel(SiteInner inner) {
        return  new HostingEnvironmentSiteImpl(inner, manager());
    }

    private WorkerPoolsImpl wrapWorkerPoolsModel(WorkerPoolResourceInner inner) {
        return  new WorkerPoolsImpl(inner, manager());
    }

    private Observable<AppServiceEnvironmentResourceInner> getAppServiceEnvironmentResourceInnerUsingAppServiceEnvironmentsInnerAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    private Observable<HostingEnvironmentDiagnosticsInner> getHostingEnvironmentDiagnosticsInnerUsingAppServiceEnvironmentsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String name = IdParsingUtils.getValueFromIdByName(id, "hostingEnvironments");
        String diagnosticsName = IdParsingUtils.getValueFromIdByName(id, "diagnostics");
        AppServiceEnvironmentsInner client = this.inner();
        return client.getDiagnosticsItemAsync(resourceGroupName, name, diagnosticsName);
    }

    private Observable<WorkerPoolResourceInner> getWorkerPoolResourceInnerUsingAppServiceEnvironmentsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String name = IdParsingUtils.getValueFromIdByName(id, "hostingEnvironments");
        String workerPoolName = IdParsingUtils.getValueFromIdByName(id, "workerPools");
        AppServiceEnvironmentsInner client = this.inner();
        return client.getWorkerPoolAsync(resourceGroupName, name, workerPoolName);
    }

    @Override
    public Observable<AppServiceEnvironmentResource> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getAppServiceEnvironmentResourceInnerUsingAppServiceEnvironmentsInnerAsync(resourceGroupName, name).map(new Func1<AppServiceEnvironmentResourceInner, AppServiceEnvironmentResource> () {
            @Override
            public AppServiceEnvironmentResource call(AppServiceEnvironmentResourceInner inner) {
                return wrapAppServiceEnvironmentResourceModel(inner);
            }
        });
    }

    @Override
    public Observable<AppServiceEnvironmentResource> listByResourceGroupAsync(String resourceGroupName) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<AppServiceEnvironmentResourceInner>, Iterable<AppServiceEnvironmentResourceInner>>() {
            @Override
            public Iterable<AppServiceEnvironmentResourceInner> call(Page<AppServiceEnvironmentResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppServiceEnvironmentResourceInner, AppServiceEnvironmentResource>() {
            @Override
            public AppServiceEnvironmentResource call(AppServiceEnvironmentResourceInner inner) {
                return wrapAppServiceEnvironmentResourceModel(inner);
            }
        });
    }

    @Override
    public Observable<AppServiceEnvironmentResource> listAsync() {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AppServiceEnvironmentResourceInner>, Iterable<AppServiceEnvironmentResourceInner>>() {
            @Override
            public Iterable<AppServiceEnvironmentResourceInner> call(Page<AppServiceEnvironmentResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppServiceEnvironmentResourceInner, AppServiceEnvironmentResource>() {
            @Override
            public AppServiceEnvironmentResource call(AppServiceEnvironmentResourceInner inner) {
                return wrapAppServiceEnvironmentResourceModel(inner);
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String name) {
        return this.inner().deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<Sites> changeVnetAsync(final String resourceGroupName, final String name, final VirtualNetworkProfile vnetInfo) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.changeVnetAsync(resourceGroupName, name, vnetInfo)
        .flatMapIterable(new Func1<Page<SiteInner>, Iterable<SiteInner>>() {
            @Override
            public Iterable<SiteInner> call(Page<SiteInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SiteInner, Sites>() {
            @Override
            public Sites call(SiteInner inner) {
                return new SitesImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    public Completable rebootAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.rebootAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<Sites> resumeAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.resumeAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<SiteInner>, Iterable<SiteInner>>() {
            @Override
            public Iterable<SiteInner> call(Page<SiteInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SiteInner, Sites>() {
            @Override
            public Sites call(SiteInner inner) {
                return new SitesImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    public Observable<Sites> suspendAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.suspendAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<SiteInner>, Iterable<SiteInner>>() {
            @Override
            public Iterable<SiteInner> call(Page<SiteInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SiteInner, Sites>() {
            @Override
            public Sites call(SiteInner inner) {
                return new SitesImpl(inner.name(), inner, manager());
            }
        });
    }

    @Override
    public Observable<StampCapacity> listCapacitiesAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listCapacitiesAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<StampCapacityInner>, Iterable<StampCapacityInner>>() {
            @Override
            public Iterable<StampCapacityInner> call(Page<StampCapacityInner> page) {
                return page.items();
            }
        })
        .map(new Func1<StampCapacityInner, StampCapacity>() {
            @Override
            public StampCapacity call(StampCapacityInner inner) {
                return new StampCapacityImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AddressResponse> listVipsAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listVipsAsync(resourceGroupName, name)
        .map(new Func1<AddressResponseInner, AddressResponse>() {
            @Override
            public AddressResponse call(AddressResponseInner inner) {
                return new AddressResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<HostingEnvironmentDiagnostics> getDiagnosticsItemAsync(String resourceGroupName, String name, String diagnosticsName) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.getDiagnosticsItemAsync(resourceGroupName, name, diagnosticsName)
        .map(new Func1<HostingEnvironmentDiagnosticsInner, HostingEnvironmentDiagnostics>() {
            @Override
            public HostingEnvironmentDiagnostics call(HostingEnvironmentDiagnosticsInner inner) {
                return wrapHostingEnvironmentDiagnosticsModel(inner);
            }
       });
    }

    @Override
    public Observable<HostingEnvironmentDiagnostics> listDiagnosticsAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listDiagnosticsAsync(resourceGroupName, name)
        .flatMap(new Func1<List<HostingEnvironmentDiagnosticsInner>, Observable<HostingEnvironmentDiagnosticsInner>>() {
            @Override
            public Observable<HostingEnvironmentDiagnosticsInner> call(List<HostingEnvironmentDiagnosticsInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<HostingEnvironmentDiagnosticsInner, HostingEnvironmentDiagnostics>() {
            @Override
            public HostingEnvironmentDiagnostics call(HostingEnvironmentDiagnosticsInner inner) {
                return wrapHostingEnvironmentDiagnosticsModel(inner);
            }
        });
    }

    @Override
    public Observable<InboundEnvironmentEndpoint> getInboundNetworkDependenciesEndpointsAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.getInboundNetworkDependenciesEndpointsAsync(resourceGroupName, name)
        .flatMap(new Func1<List<InboundEnvironmentEndpointInner>, Observable<InboundEnvironmentEndpointInner>>() {
            @Override
            public Observable<InboundEnvironmentEndpointInner> call(List<InboundEnvironmentEndpointInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<InboundEnvironmentEndpointInner, InboundEnvironmentEndpoint>() {
            @Override
            public InboundEnvironmentEndpoint call(InboundEnvironmentEndpointInner inner) {
                return wrapInboundEnvironmentEndpointModel(inner);
            }
        });
    }

    @Override
    public Observable<MetricDefinition> listMetricDefinitionsAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMetricDefinitionsAsync(resourceGroupName, name)
        .map(new Func1<MetricDefinitionInner, MetricDefinition>() {
            @Override
            public MetricDefinition call(MetricDefinitionInner inner) {
                return new MetricDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SiteResourceMetricDefinition> listMultiRolePoolInstanceMetricDefinitionsAsync(final String resourceGroupName, final String name, final String instance) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMultiRolePoolInstanceMetricDefinitionsAsync(resourceGroupName, name, instance)
        .flatMapIterable(new Func1<Page<ResourceMetricDefinitionInner>, Iterable<ResourceMetricDefinitionInner>>() {
            @Override
            public Iterable<ResourceMetricDefinitionInner> call(Page<ResourceMetricDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricDefinitionInner, SiteResourceMetricDefinition>() {
            @Override
            public SiteResourceMetricDefinition call(ResourceMetricDefinitionInner inner) {
                return new SiteResourceMetricDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SiteResourceMetricDefinition> listMultiRoleMetricDefinitionsAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMultiRoleMetricDefinitionsAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<ResourceMetricDefinitionInner>, Iterable<ResourceMetricDefinitionInner>>() {
            @Override
            public Iterable<ResourceMetricDefinitionInner> call(Page<ResourceMetricDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricDefinitionInner, SiteResourceMetricDefinition>() {
            @Override
            public SiteResourceMetricDefinition call(ResourceMetricDefinitionInner inner) {
                return new SiteResourceMetricDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SiteResourceMetricDefinition> listWorkerPoolInstanceMetricDefinitionsAsync(final String resourceGroupName, final String name, final String workerPoolName, final String instance) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listWorkerPoolInstanceMetricDefinitionsAsync(resourceGroupName, name, workerPoolName, instance)
        .flatMapIterable(new Func1<Page<ResourceMetricDefinitionInner>, Iterable<ResourceMetricDefinitionInner>>() {
            @Override
            public Iterable<ResourceMetricDefinitionInner> call(Page<ResourceMetricDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricDefinitionInner, SiteResourceMetricDefinition>() {
            @Override
            public SiteResourceMetricDefinition call(ResourceMetricDefinitionInner inner) {
                return new SiteResourceMetricDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SiteResourceMetricDefinition> listWebWorkerMetricDefinitionsAsync(final String resourceGroupName, final String name, final String workerPoolName) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listWebWorkerMetricDefinitionsAsync(resourceGroupName, name, workerPoolName)
        .flatMapIterable(new Func1<Page<ResourceMetricDefinitionInner>, Iterable<ResourceMetricDefinitionInner>>() {
            @Override
            public Iterable<ResourceMetricDefinitionInner> call(Page<ResourceMetricDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricDefinitionInner, SiteResourceMetricDefinition>() {
            @Override
            public SiteResourceMetricDefinition call(ResourceMetricDefinitionInner inner) {
                return new SiteResourceMetricDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<HostingEnvironmentResourceMetric> listMetricsAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMetricsAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<ResourceMetricInner>, Iterable<ResourceMetricInner>>() {
            @Override
            public Iterable<ResourceMetricInner> call(Page<ResourceMetricInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricInner, HostingEnvironmentResourceMetric>() {
            @Override
            public HostingEnvironmentResourceMetric call(ResourceMetricInner inner) {
                return wrapHostingEnvironmentResourceMetricModel(inner);
            }
        });
    }

    @Override
    public Observable<SiteResourceMetric> listMultiRolePoolInstanceMetricsAsync(final String resourceGroupName, final String name, final String instance) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMultiRolePoolInstanceMetricsAsync(resourceGroupName, name, instance)
        .flatMapIterable(new Func1<Page<ResourceMetricInner>, Iterable<ResourceMetricInner>>() {
            @Override
            public Iterable<ResourceMetricInner> call(Page<ResourceMetricInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricInner, SiteResourceMetric>() {
            @Override
            public SiteResourceMetric call(ResourceMetricInner inner) {
                return new SiteResourceMetricImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SiteResourceMetric> listMultiRoleMetricsAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMultiRoleMetricsAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<ResourceMetricInner>, Iterable<ResourceMetricInner>>() {
            @Override
            public Iterable<ResourceMetricInner> call(Page<ResourceMetricInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricInner, SiteResourceMetric>() {
            @Override
            public SiteResourceMetric call(ResourceMetricInner inner) {
                return new SiteResourceMetricImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SiteResourceMetric> listWorkerPoolInstanceMetricsAsync(final String resourceGroupName, final String name, final String workerPoolName, final String instance) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listWorkerPoolInstanceMetricsAsync(resourceGroupName, name, workerPoolName, instance)
        .flatMapIterable(new Func1<Page<ResourceMetricInner>, Iterable<ResourceMetricInner>>() {
            @Override
            public Iterable<ResourceMetricInner> call(Page<ResourceMetricInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricInner, SiteResourceMetric>() {
            @Override
            public SiteResourceMetric call(ResourceMetricInner inner) {
                return new SiteResourceMetricImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SiteResourceMetric> listWebWorkerMetricsAsync(final String resourceGroupName, final String name, final String workerPoolName) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listWebWorkerMetricsAsync(resourceGroupName, name, workerPoolName)
        .flatMapIterable(new Func1<Page<ResourceMetricInner>, Iterable<ResourceMetricInner>>() {
            @Override
            public Iterable<ResourceMetricInner> call(Page<ResourceMetricInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceMetricInner, SiteResourceMetric>() {
            @Override
            public SiteResourceMetric call(ResourceMetricInner inner) {
                return new SiteResourceMetricImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MultiRolePools> listMultiRolePoolsAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMultiRolePoolsAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<WorkerPoolResourceInner>, Iterable<WorkerPoolResourceInner>>() {
            @Override
            public Iterable<WorkerPoolResourceInner> call(Page<WorkerPoolResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkerPoolResourceInner, MultiRolePools>() {
            @Override
            public MultiRolePools call(WorkerPoolResourceInner inner) {
                return wrapMultiRolePoolsModel(inner);
            }
        });
    }

    @Override
    public Observable<MultiRolePools> getMultiRolePoolAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.getMultiRolePoolAsync(resourceGroupName, name)
        .map(new Func1<WorkerPoolResourceInner, MultiRolePools>() {
            @Override
            public MultiRolePools call(WorkerPoolResourceInner inner) {
                return new MultiRolePoolsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MultiRolePools> createOrUpdateMultiRolePoolAsync(String resourceGroupName, String name, WorkerPoolResourceInner multiRolePoolEnvelope) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.createOrUpdateMultiRolePoolAsync(resourceGroupName, name, multiRolePoolEnvelope)
        .map(new Func1<WorkerPoolResourceInner, MultiRolePools>() {
            @Override
            public MultiRolePools call(WorkerPoolResourceInner inner) {
                return new MultiRolePoolsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<MultiRolePools> updateMultiRolePoolAsync(String resourceGroupName, String name, WorkerPoolResourceInner multiRolePoolEnvelope) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.updateMultiRolePoolAsync(resourceGroupName, name, multiRolePoolEnvelope)
        .map(new Func1<WorkerPoolResourceInner, MultiRolePools>() {
            @Override
            public MultiRolePools call(WorkerPoolResourceInner inner) {
                return new MultiRolePoolsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SkuInfo> listMultiRolePoolSkusAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMultiRolePoolSkusAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<SkuInfoInner>, Iterable<SkuInfoInner>>() {
            @Override
            public Iterable<SkuInfoInner> call(Page<SkuInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SkuInfoInner, SkuInfo>() {
            @Override
            public SkuInfo call(SkuInfoInner inner) {
                return new SkuInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SkuInfo> listWorkerPoolSkusAsync(final String resourceGroupName, final String name, final String workerPoolName) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listWorkerPoolSkusAsync(resourceGroupName, name, workerPoolName)
        .flatMapIterable(new Func1<Page<SkuInfoInner>, Iterable<SkuInfoInner>>() {
            @Override
            public Iterable<SkuInfoInner> call(Page<SkuInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SkuInfoInner, SkuInfo>() {
            @Override
            public SkuInfo call(SkuInfoInner inner) {
                return new SkuInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Usage> listMultiRoleUsagesAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listMultiRoleUsagesAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<UsageInner>, Iterable<UsageInner>>() {
            @Override
            public Iterable<UsageInner> call(Page<UsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageInner, Usage>() {
            @Override
            public Usage call(UsageInner inner) {
                return new UsageImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SiteCsmUsageQuota> listUsagesAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listUsagesAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<CsmUsageQuotaInner>, Iterable<CsmUsageQuotaInner>>() {
            @Override
            public Iterable<CsmUsageQuotaInner> call(Page<CsmUsageQuotaInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CsmUsageQuotaInner, SiteCsmUsageQuota>() {
            @Override
            public SiteCsmUsageQuota call(CsmUsageQuotaInner inner) {
                return new SiteCsmUsageQuotaImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Usage> listWebWorkerUsagesAsync(final String resourceGroupName, final String name, final String workerPoolName) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listWebWorkerUsagesAsync(resourceGroupName, name, workerPoolName)
        .flatMapIterable(new Func1<Page<UsageInner>, Iterable<UsageInner>>() {
            @Override
            public Iterable<UsageInner> call(Page<UsageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UsageInner, Usage>() {
            @Override
            public Usage call(UsageInner inner) {
                return new UsageImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Operation> listOperationsAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listOperationsAsync(resourceGroupName, name)
        .flatMap(new Func1<List<OperationInner>, Observable<OperationInner>>() {
            @Override
            public Observable<OperationInner> call(List<OperationInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<OperationInner, Operation>() {
            @Override
            public Operation call(OperationInner inner) {
                return wrapOperationModel(inner);
            }
        });
    }

    @Override
    public Observable<OutboundEnvironmentEndpoint> getOutboundNetworkDependenciesEndpointsAsync(String resourceGroupName, String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.getOutboundNetworkDependenciesEndpointsAsync(resourceGroupName, name)
        .flatMap(new Func1<List<OutboundEnvironmentEndpointInner>, Observable<OutboundEnvironmentEndpointInner>>() {
            @Override
            public Observable<OutboundEnvironmentEndpointInner> call(List<OutboundEnvironmentEndpointInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<OutboundEnvironmentEndpointInner, OutboundEnvironmentEndpoint>() {
            @Override
            public OutboundEnvironmentEndpoint call(OutboundEnvironmentEndpointInner inner) {
                return wrapOutboundEnvironmentEndpointModel(inner);
            }
        });
    }

    @Override
    public Observable<HostingEnvironmentAppServicePlan> listAppServicePlansAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listAppServicePlansAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<AppServicePlanInner>, Iterable<AppServicePlanInner>>() {
            @Override
            public Iterable<AppServicePlanInner> call(Page<AppServicePlanInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AppServicePlanInner, HostingEnvironmentAppServicePlan>() {
            @Override
            public HostingEnvironmentAppServicePlan call(AppServicePlanInner inner) {
                return wrapHostingEnvironmentAppServicePlanModel(inner);
            }
        });
    }

    @Override
    public Observable<HostingEnvironmentSite> listWebAppsAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listWebAppsAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<SiteInner>, Iterable<SiteInner>>() {
            @Override
            public Iterable<SiteInner> call(Page<SiteInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SiteInner, HostingEnvironmentSite>() {
            @Override
            public HostingEnvironmentSite call(SiteInner inner) {
                return wrapHostingEnvironmentSiteModel(inner);
            }
        });
    }

    @Override
    public Observable<WorkerPools> getWorkerPoolAsync(String resourceGroupName, String name, String workerPoolName) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.getWorkerPoolAsync(resourceGroupName, name, workerPoolName)
        .map(new Func1<WorkerPoolResourceInner, WorkerPools>() {
            @Override
            public WorkerPools call(WorkerPoolResourceInner inner) {
                return wrapWorkerPoolsModel(inner);
            }
       });
    }

    @Override
    public Observable<WorkerPools> listWorkerPoolsAsync(final String resourceGroupName, final String name) {
        AppServiceEnvironmentsInner client = this.inner();
        return client.listWorkerPoolsAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<WorkerPoolResourceInner>, Iterable<WorkerPoolResourceInner>>() {
            @Override
            public Iterable<WorkerPoolResourceInner> call(Page<WorkerPoolResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<WorkerPoolResourceInner, WorkerPools>() {
            @Override
            public WorkerPools call(WorkerPoolResourceInner inner) {
                return wrapWorkerPoolsModel(inner);
            }
        });
    }

}
