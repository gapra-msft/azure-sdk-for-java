// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.IpAllocationType;
import com.azure.resourcemanager.network.models.IpVersion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** IpAllocation resource. */
@JsonFlatten
@Fluent
public class IpAllocationInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpAllocationInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The Subnet that using the prefix of this IpAllocation resource.
     */
    @JsonProperty(value = "properties.subnet", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource subnet;

    /*
     * The VirtualNetwork that using the prefix of this IpAllocation resource.
     */
    @JsonProperty(value = "properties.virtualNetwork", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource virtualNetwork;

    /*
     * The type for the IpAllocation.
     */
    @JsonProperty(value = "properties.type")
    private IpAllocationType typePropertiesType;

    /*
     * The address prefix for the IpAllocation.
     */
    @JsonProperty(value = "properties.prefix")
    private String prefix;

    /*
     * The address prefix length for the IpAllocation.
     */
    @JsonProperty(value = "properties.prefixLength")
    private Integer prefixLength;

    /*
     * The address prefix Type for the IpAllocation.
     */
    @JsonProperty(value = "properties.prefixType")
    private IpVersion prefixType;

    /*
     * The IPAM allocation ID.
     */
    @JsonProperty(value = "properties.ipamAllocationId")
    private String ipamAllocationId;

    /*
     * IpAllocation tags.
     */
    @JsonProperty(value = "properties.allocationTags")
    private Map<String, String> allocationTags;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the subnet property: The Subnet that using the prefix of this IpAllocation resource.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Get the virtualNetwork property: The VirtualNetwork that using the prefix of this IpAllocation resource.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     * Get the typePropertiesType property: The type for the IpAllocation.
     *
     * @return the typePropertiesType value.
     */
    public IpAllocationType typePropertiesType() {
        return this.typePropertiesType;
    }

    /**
     * Set the typePropertiesType property: The type for the IpAllocation.
     *
     * @param typePropertiesType the typePropertiesType value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withTypePropertiesType(IpAllocationType typePropertiesType) {
        this.typePropertiesType = typePropertiesType;
        return this;
    }

    /**
     * Get the prefix property: The address prefix for the IpAllocation.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The address prefix for the IpAllocation.
     *
     * @param prefix the prefix value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the prefixLength property: The address prefix length for the IpAllocation.
     *
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.prefixLength;
    }

    /**
     * Set the prefixLength property: The address prefix length for the IpAllocation.
     *
     * @param prefixLength the prefixLength value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefixLength(Integer prefixLength) {
        this.prefixLength = prefixLength;
        return this;
    }

    /**
     * Get the prefixType property: The address prefix Type for the IpAllocation.
     *
     * @return the prefixType value.
     */
    public IpVersion prefixType() {
        return this.prefixType;
    }

    /**
     * Set the prefixType property: The address prefix Type for the IpAllocation.
     *
     * @param prefixType the prefixType value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefixType(IpVersion prefixType) {
        this.prefixType = prefixType;
        return this;
    }

    /**
     * Get the ipamAllocationId property: The IPAM allocation ID.
     *
     * @return the ipamAllocationId value.
     */
    public String ipamAllocationId() {
        return this.ipamAllocationId;
    }

    /**
     * Set the ipamAllocationId property: The IPAM allocation ID.
     *
     * @param ipamAllocationId the ipamAllocationId value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withIpamAllocationId(String ipamAllocationId) {
        this.ipamAllocationId = ipamAllocationId;
        return this;
    }

    /**
     * Get the allocationTags property: IpAllocation tags.
     *
     * @return the allocationTags value.
     */
    public Map<String, String> allocationTags() {
        return this.allocationTags;
    }

    /**
     * Set the allocationTags property: IpAllocation tags.
     *
     * @param allocationTags the allocationTags value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withAllocationTags(Map<String, String> allocationTags) {
        this.allocationTags = allocationTags;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
