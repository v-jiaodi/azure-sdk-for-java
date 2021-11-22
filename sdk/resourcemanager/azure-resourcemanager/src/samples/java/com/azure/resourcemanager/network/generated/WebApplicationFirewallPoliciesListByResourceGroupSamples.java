// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for WebApplicationFirewallPolicies ListByResourceGroup. */
public final class WebApplicationFirewallPoliciesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/WafListPolicies.json
     */
    /**
     * Sample code: Lists all WAF policies in a resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listsAllWAFPoliciesInAResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getWebApplicationFirewallPolicies()
            .listByResourceGroup("rg1", Context.NONE);
    }
}