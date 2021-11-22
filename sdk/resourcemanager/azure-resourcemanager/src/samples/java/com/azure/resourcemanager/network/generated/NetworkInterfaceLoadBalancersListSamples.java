// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaceLoadBalancers List. */
public final class NetworkInterfaceLoadBalancersListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkInterfaceLoadBalancerList.json
     */
    /**
     * Sample code: NetworkInterfaceLoadBalancerList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkInterfaceLoadBalancerList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaceLoadBalancers()
            .list("testrg", "nic1", Context.NONE);
    }
}