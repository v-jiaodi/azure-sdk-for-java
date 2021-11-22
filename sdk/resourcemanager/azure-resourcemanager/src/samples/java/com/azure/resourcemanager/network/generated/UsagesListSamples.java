// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for Usages List. */
public final class UsagesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/UsageList.json
     */
    /**
     * Sample code: List usages.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listUsages(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getUsages().list("westus", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/UsageListSpacedLocation.json
     */
    /**
     * Sample code: List usages spaced location.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listUsagesSpacedLocation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getUsages().list("West US", Context.NONE);
    }
}