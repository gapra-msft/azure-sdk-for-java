// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FirewallPolicyFilterRuleAction model. */
@Fluent
public final class FirewallPolicyFilterRuleAction {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyFilterRuleAction.class);

    /*
     * The type of action.
     */
    @JsonProperty(value = "type")
    private FirewallPolicyFilterRuleActionType type;

    /**
     * Get the type property: The type of action.
     *
     * @return the type value.
     */
    public FirewallPolicyFilterRuleActionType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of action.
     *
     * @param type the type value to set.
     * @return the FirewallPolicyFilterRuleAction object itself.
     */
    public FirewallPolicyFilterRuleAction withType(FirewallPolicyFilterRuleActionType type) {
        this.type = type;
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
