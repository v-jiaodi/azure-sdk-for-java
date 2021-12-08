// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.Context;

/** Samples for PolicyMetadata List. */
public final class PolicyMetadataListSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/examples/PolicyMetadata_List.json
     */
    /**
     * Sample code: Get collection of policy metadata resources.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void getCollectionOfPolicyMetadataResources(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.policyMetadatas().list(null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2019-10-01/examples/PolicyMetadata_List_WithTop.json
     */
    /**
     * Sample code: Get collection of policy metadata resources using top query parameter.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void getCollectionOfPolicyMetadataResourcesUsingTopQueryParameter(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.policyMetadatas().list(1, Context.NONE);
    }
}