// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.containerservice.NetworkProfile;
import com.azure.management.containerservice.OpenShiftManagedClusterAgentPoolProfile;
import com.azure.management.containerservice.OpenShiftManagedClusterAuthProfile;
import com.azure.management.containerservice.OpenShiftManagedClusterMasterPoolProfile;
import com.azure.management.containerservice.OpenShiftRouterProfile;
import com.azure.management.containerservice.PurchasePlan;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OpenShiftManagedCluster model. */
@JsonFlatten
@Fluent
public class OpenShiftManagedClusterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenShiftManagedClusterInner.class);

    /*
     * Define the resource plan as required by ARM for billing purposes
     */
    @JsonProperty(value = "plan")
    private PurchasePlan plan;

    /*
     * The current deployment or provisioning state, which only appears in the
     * response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Version of OpenShift specified when creating the cluster.
     */
    @JsonProperty(value = "properties.openShiftVersion")
    private String openShiftVersion;

    /*
     * Version of OpenShift specified when creating the cluster.
     */
    @JsonProperty(value = "properties.clusterVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String clusterVersion;

    /*
     * Service generated FQDN for OpenShift API server.
     */
    @JsonProperty(value = "properties.publicHostname", access = JsonProperty.Access.WRITE_ONLY)
    private String publicHostname;

    /*
     * Service generated FQDN for OpenShift API server loadbalancer internal
     * hostname.
     */
    @JsonProperty(value = "properties.fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /*
     * Configuration for OpenShift networking.
     */
    @JsonProperty(value = "properties.networkProfile")
    private NetworkProfile networkProfile;

    /*
     * Configuration for OpenShift router(s).
     */
    @JsonProperty(value = "properties.routerProfiles")
    private List<OpenShiftRouterProfile> routerProfiles;

    /*
     * Configuration for OpenShift master VMs.
     */
    @JsonProperty(value = "properties.masterPoolProfile")
    private OpenShiftManagedClusterMasterPoolProfile masterPoolProfile;

    /*
     * Configuration of OpenShift cluster VMs.
     */
    @JsonProperty(value = "properties.agentPoolProfiles")
    private List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles;

    /*
     * Configures OpenShift authentication.
     */
    @JsonProperty(value = "properties.authProfile")
    private OpenShiftManagedClusterAuthProfile authProfile;

    /**
     * Get the plan property: Define the resource plan as required by ARM for billing purposes.
     *
     * @return the plan value.
     */
    public PurchasePlan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Define the resource plan as required by ARM for billing purposes.
     *
     * @param plan the plan value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withPlan(PurchasePlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the openShiftVersion property: Version of OpenShift specified when creating the cluster.
     *
     * @return the openShiftVersion value.
     */
    public String openShiftVersion() {
        return this.openShiftVersion;
    }

    /**
     * Set the openShiftVersion property: Version of OpenShift specified when creating the cluster.
     *
     * @param openShiftVersion the openShiftVersion value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withOpenShiftVersion(String openShiftVersion) {
        this.openShiftVersion = openShiftVersion;
        return this;
    }

    /**
     * Get the clusterVersion property: Version of OpenShift specified when creating the cluster.
     *
     * @return the clusterVersion value.
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Get the publicHostname property: Service generated FQDN for OpenShift API server.
     *
     * @return the publicHostname value.
     */
    public String publicHostname() {
        return this.publicHostname;
    }

    /**
     * Get the fqdn property: Service generated FQDN for OpenShift API server loadbalancer internal hostname.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the networkProfile property: Configuration for OpenShift networking.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Configuration for OpenShift networking.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the routerProfiles property: Configuration for OpenShift router(s).
     *
     * @return the routerProfiles value.
     */
    public List<OpenShiftRouterProfile> routerProfiles() {
        return this.routerProfiles;
    }

    /**
     * Set the routerProfiles property: Configuration for OpenShift router(s).
     *
     * @param routerProfiles the routerProfiles value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withRouterProfiles(List<OpenShiftRouterProfile> routerProfiles) {
        this.routerProfiles = routerProfiles;
        return this;
    }

    /**
     * Get the masterPoolProfile property: Configuration for OpenShift master VMs.
     *
     * @return the masterPoolProfile value.
     */
    public OpenShiftManagedClusterMasterPoolProfile masterPoolProfile() {
        return this.masterPoolProfile;
    }

    /**
     * Set the masterPoolProfile property: Configuration for OpenShift master VMs.
     *
     * @param masterPoolProfile the masterPoolProfile value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withMasterPoolProfile(
        OpenShiftManagedClusterMasterPoolProfile masterPoolProfile) {
        this.masterPoolProfile = masterPoolProfile;
        return this;
    }

    /**
     * Get the agentPoolProfiles property: Configuration of OpenShift cluster VMs.
     *
     * @return the agentPoolProfiles value.
     */
    public List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles() {
        return this.agentPoolProfiles;
    }

    /**
     * Set the agentPoolProfiles property: Configuration of OpenShift cluster VMs.
     *
     * @param agentPoolProfiles the agentPoolProfiles value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withAgentPoolProfiles(
        List<OpenShiftManagedClusterAgentPoolProfile> agentPoolProfiles) {
        this.agentPoolProfiles = agentPoolProfiles;
        return this;
    }

    /**
     * Get the authProfile property: Configures OpenShift authentication.
     *
     * @return the authProfile value.
     */
    public OpenShiftManagedClusterAuthProfile authProfile() {
        return this.authProfile;
    }

    /**
     * Set the authProfile property: Configures OpenShift authentication.
     *
     * @param authProfile the authProfile value to set.
     * @return the OpenShiftManagedClusterInner object itself.
     */
    public OpenShiftManagedClusterInner withAuthProfile(OpenShiftManagedClusterAuthProfile authProfile) {
        this.authProfile = authProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (routerProfiles() != null) {
            routerProfiles().forEach(e -> e.validate());
        }
        if (masterPoolProfile() != null) {
            masterPoolProfile().validate();
        }
        if (agentPoolProfiles() != null) {
            agentPoolProfiles().forEach(e -> e.validate());
        }
        if (authProfile() != null) {
            authProfile().validate();
        }
    }
}
