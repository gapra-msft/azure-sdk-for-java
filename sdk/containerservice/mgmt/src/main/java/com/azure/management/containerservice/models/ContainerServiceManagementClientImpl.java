// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.AzureServiceClient;

/** Initializes a new instance of the ContainerServiceManagementClientImpl type. */
public final class ContainerServiceManagementClientImpl extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(ContainerServiceManagementClientImpl.class);

    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of
     * the URI for every service call.
     */
    private String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    public ContainerServiceManagementClientImpl setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** server parameter. */
    private String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Sets server parameter.
     *
     * @param host the host value.
     * @return the service client itself.
     */
    public ContainerServiceManagementClientImpl setHost(String host) {
        this.host = host;
        return this;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The OpenShiftManagedClustersInner object to access its operations. */
    private final OpenShiftManagedClustersInner openShiftManagedClusters;

    /**
     * Gets the OpenShiftManagedClustersInner object to access its operations.
     *
     * @return the OpenShiftManagedClustersInner object.
     */
    public OpenShiftManagedClustersInner openShiftManagedClusters() {
        return this.openShiftManagedClusters;
    }

    /** The ContainerServicesInner object to access its operations. */
    private final ContainerServicesInner containerServices;

    /**
     * Gets the ContainerServicesInner object to access its operations.
     *
     * @return the ContainerServicesInner object.
     */
    public ContainerServicesInner containerServices() {
        return this.containerServices;
    }

    /** The OperationsInner object to access its operations. */
    private final OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     *
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /** The ManagedClustersInner object to access its operations. */
    private final ManagedClustersInner managedClusters;

    /**
     * Gets the ManagedClustersInner object to access its operations.
     *
     * @return the ManagedClustersInner object.
     */
    public ManagedClustersInner managedClusters() {
        return this.managedClusters;
    }

    /** The AgentPoolsInner object to access its operations. */
    private final AgentPoolsInner agentPools;

    /**
     * Gets the AgentPoolsInner object to access its operations.
     *
     * @return the AgentPoolsInner object.
     */
    public AgentPoolsInner agentPools() {
        return this.agentPools;
    }

    /** Initializes an instance of ContainerServiceManagementClient client. */
    public ContainerServiceManagementClientImpl() {
        this(
            new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(),
            AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of ContainerServiceManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public ContainerServiceManagementClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of ContainerServiceManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public ContainerServiceManagementClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.openShiftManagedClusters = new OpenShiftManagedClustersInner(this);
        this.containerServices = new ContainerServicesInner(this);
        this.operations = new OperationsInner(this);
        this.managedClusters = new ManagedClustersInner(this);
        this.agentPools = new AgentPoolsInner(this);
    }
}
