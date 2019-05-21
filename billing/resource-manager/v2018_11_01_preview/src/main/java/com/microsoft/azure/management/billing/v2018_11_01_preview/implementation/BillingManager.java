/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccounts;
import com.microsoft.azure.management.billing.v2018_11_01_preview.PaymentMethods;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountsValidateAddress;
import com.microsoft.azure.management.billing.v2018_11_01_preview.AvailableBalances;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfiles;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSections;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Departments;
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccounts;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Invoices;
import com.microsoft.azure.management.billing.v2018_11_01_preview.PriceSheets;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Products;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Transactions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Policies;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingPropertys;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Transfers;
import com.microsoft.azure.management.billing.v2018_11_01_preview.RecipientTransfers;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Operations;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingPermissions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleDefinitions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingRoleAssignments;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Agreements;
import com.microsoft.azure.management.billing.v2018_11_01_preview.LineOfCredits;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Billing resource management.
 */
public final class BillingManager extends ManagerCore<BillingManager, BillingManagementClientImpl> {
    private BillingAccounts billingAccounts;
    private PaymentMethods paymentMethods;
    private BillingAccountsValidateAddress billingAccountsValidateAddress;
    private AvailableBalances availableBalances;
    private BillingProfiles billingProfiles;
    private InvoiceSections invoiceSections;
    private Departments departments;
    private EnrollmentAccounts enrollmentAccounts;
    private Invoices invoices;
    private PriceSheets priceSheets;
    private BillingSubscriptions billingSubscriptions;
    private Products products;
    private Transactions transactions;
    private Policies policies;
    private BillingPropertys billingPropertys;
    private Transfers transfers;
    private RecipientTransfers recipientTransfers;
    private Operations operations;
    private BillingPermissions billingPermissions;
    private BillingRoleDefinitions billingRoleDefinitions;
    private BillingRoleAssignments billingRoleAssignments;
    private Agreements agreements;
    private LineOfCredits lineOfCredits;
    /**
    * Get a Configurable instance that can be used to create BillingManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new BillingManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of BillingManager that exposes Billing resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the BillingManager
    */
    public static BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new BillingManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of BillingManager that exposes Billing resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the BillingManager
    */
    public static BillingManager authenticate(RestClient restClient, String subscriptionId) {
        return new BillingManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of BillingManager that exposes Billing management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Billing management API entry points that work across subscriptions
        */
        BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage BillingAccounts.
     */
    public BillingAccounts billingAccounts() {
        if (this.billingAccounts == null) {
            this.billingAccounts = new BillingAccountsImpl(this);
        }
        return this.billingAccounts;
    }

    /**
     * @return Entry point to manage PaymentMethods.
     */
    public PaymentMethods paymentMethods() {
        if (this.paymentMethods == null) {
            this.paymentMethods = new PaymentMethodsImpl(this);
        }
        return this.paymentMethods;
    }

    /**
     * @return Entry point to manage BillingAccountsValidateAddress.
     */
    public BillingAccountsValidateAddress billingAccountsValidateAddress() {
        if (this.billingAccountsValidateAddress == null) {
            this.billingAccountsValidateAddress = new BillingAccountsValidateAddressImpl(this);
        }
        return this.billingAccountsValidateAddress;
    }

    /**
     * @return Entry point to manage AvailableBalances.
     */
    public AvailableBalances availableBalances() {
        if (this.availableBalances == null) {
            this.availableBalances = new AvailableBalancesImpl(this);
        }
        return this.availableBalances;
    }

    /**
     * @return Entry point to manage BillingProfiles.
     */
    public BillingProfiles billingProfiles() {
        if (this.billingProfiles == null) {
            this.billingProfiles = new BillingProfilesImpl(this);
        }
        return this.billingProfiles;
    }

    /**
     * @return Entry point to manage InvoiceSections.
     */
    public InvoiceSections invoiceSections() {
        if (this.invoiceSections == null) {
            this.invoiceSections = new InvoiceSectionsImpl(this);
        }
        return this.invoiceSections;
    }

    /**
     * @return Entry point to manage Departments.
     */
    public Departments departments() {
        if (this.departments == null) {
            this.departments = new DepartmentsImpl(this);
        }
        return this.departments;
    }

    /**
     * @return Entry point to manage EnrollmentAccounts.
     */
    public EnrollmentAccounts enrollmentAccounts() {
        if (this.enrollmentAccounts == null) {
            this.enrollmentAccounts = new EnrollmentAccountsImpl(this);
        }
        return this.enrollmentAccounts;
    }

    /**
     * @return Entry point to manage Invoices.
     */
    public Invoices invoices() {
        if (this.invoices == null) {
            this.invoices = new InvoicesImpl(this);
        }
        return this.invoices;
    }

    /**
     * @return Entry point to manage PriceSheets.
     */
    public PriceSheets priceSheets() {
        if (this.priceSheets == null) {
            this.priceSheets = new PriceSheetsImpl(this);
        }
        return this.priceSheets;
    }

    /**
     * @return Entry point to manage BillingSubscriptions.
     */
    public BillingSubscriptions billingSubscriptions() {
        if (this.billingSubscriptions == null) {
            this.billingSubscriptions = new BillingSubscriptionsImpl(this);
        }
        return this.billingSubscriptions;
    }

    /**
     * @return Entry point to manage Products.
     */
    public Products products() {
        if (this.products == null) {
            this.products = new ProductsImpl(this);
        }
        return this.products;
    }

    /**
     * @return Entry point to manage Transactions.
     */
    public Transactions transactions() {
        if (this.transactions == null) {
            this.transactions = new TransactionsImpl(this);
        }
        return this.transactions;
    }

    /**
     * @return Entry point to manage Policies.
     */
    public Policies policies() {
        if (this.policies == null) {
            this.policies = new PoliciesImpl(this);
        }
        return this.policies;
    }

    /**
     * @return Entry point to manage BillingPropertys.
     */
    public BillingPropertys billingPropertys() {
        if (this.billingPropertys == null) {
            this.billingPropertys = new BillingPropertysImpl(this);
        }
        return this.billingPropertys;
    }

    /**
     * @return Entry point to manage Transfers.
     */
    public Transfers transfers() {
        if (this.transfers == null) {
            this.transfers = new TransfersImpl(this);
        }
        return this.transfers;
    }

    /**
     * @return Entry point to manage RecipientTransfers.
     */
    public RecipientTransfers recipientTransfers() {
        if (this.recipientTransfers == null) {
            this.recipientTransfers = new RecipientTransfersImpl(this);
        }
        return this.recipientTransfers;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage BillingPermissions.
     */
    public BillingPermissions billingPermissions() {
        if (this.billingPermissions == null) {
            this.billingPermissions = new BillingPermissionsImpl(this);
        }
        return this.billingPermissions;
    }

    /**
     * @return Entry point to manage BillingRoleDefinitions.
     */
    public BillingRoleDefinitions billingRoleDefinitions() {
        if (this.billingRoleDefinitions == null) {
            this.billingRoleDefinitions = new BillingRoleDefinitionsImpl(this);
        }
        return this.billingRoleDefinitions;
    }

    /**
     * @return Entry point to manage BillingRoleAssignments.
     */
    public BillingRoleAssignments billingRoleAssignments() {
        if (this.billingRoleAssignments == null) {
            this.billingRoleAssignments = new BillingRoleAssignmentsImpl(this);
        }
        return this.billingRoleAssignments;
    }

    /**
     * @return Entry point to manage Agreements.
     */
    public Agreements agreements() {
        if (this.agreements == null) {
            this.agreements = new AgreementsImpl(this);
        }
        return this.agreements;
    }

    /**
     * @return Entry point to manage LineOfCredits.
     */
    public LineOfCredits lineOfCredits() {
        if (this.lineOfCredits == null) {
            this.lineOfCredits = new LineOfCreditsImpl(this);
        }
        return this.lineOfCredits;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return BillingManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private BillingManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new BillingManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
