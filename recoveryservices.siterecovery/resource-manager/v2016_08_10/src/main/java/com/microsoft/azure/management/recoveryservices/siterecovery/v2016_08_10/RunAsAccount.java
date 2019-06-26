/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2016_08_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CS Accounts Details.
 */
public class RunAsAccount {
    /**
     * The CS RunAs account Id.
     */
    @JsonProperty(value = "accountId")
    private String accountId;

    /**
     * The CS RunAs account name.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /**
     * Get the CS RunAs account Id.
     *
     * @return the accountId value
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Set the CS RunAs account Id.
     *
     * @param accountId the accountId value to set
     * @return the RunAsAccount object itself.
     */
    public RunAsAccount withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get the CS RunAs account name.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the CS RunAs account name.
     *
     * @param accountName the accountName value to set
     * @return the RunAsAccount object itself.
     */
    public RunAsAccount withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

}
