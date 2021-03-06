/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2016_03_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the MonitorManagementClientImpl class.
 */
public class MonitorManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The Azure subscription Id. */
    private String subscriptionId;

    /**
     * Gets The Azure subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Azure subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public MonitorManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Client Api Version. */
    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public MonitorManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public MonitorManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public MonitorManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The AlertRulesInner object to access its operations.
     */
    private AlertRulesInner alertRules;

    /**
     * Gets the AlertRulesInner object to access its operations.
     * @return the AlertRulesInner object.
     */
    public AlertRulesInner alertRules() {
        return this.alertRules;
    }

    /**
     * The AlertRuleIncidentsInner object to access its operations.
     */
    private AlertRuleIncidentsInner alertRuleIncidents;

    /**
     * Gets the AlertRuleIncidentsInner object to access its operations.
     * @return the AlertRuleIncidentsInner object.
     */
    public AlertRuleIncidentsInner alertRuleIncidents() {
        return this.alertRuleIncidents;
    }

    /**
     * The LogProfilesInner object to access its operations.
     */
    private LogProfilesInner logProfiles;

    /**
     * Gets the LogProfilesInner object to access its operations.
     * @return the LogProfilesInner object.
     */
    public LogProfilesInner logProfiles() {
        return this.logProfiles;
    }

    /**
     * The MetricDefinitionsInner object to access its operations.
     */
    private MetricDefinitionsInner metricDefinitions;

    /**
     * Gets the MetricDefinitionsInner object to access its operations.
     * @return the MetricDefinitionsInner object.
     */
    public MetricDefinitionsInner metricDefinitions() {
        return this.metricDefinitions;
    }

    /**
     * Initializes an instance of MonitorManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public MonitorManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of MonitorManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public MonitorManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of MonitorManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public MonitorManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2016-03-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.alertRules = new AlertRulesInner(restClient().retrofit(), this);
        this.alertRuleIncidents = new AlertRuleIncidentsInner(restClient().retrofit(), this);
        this.logProfiles = new LogProfilesInner(restClient().retrofit(), this);
        this.metricDefinitions = new MetricDefinitionsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "MonitorManagementClient", "2016-03-01");
    }
}
