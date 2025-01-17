// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeComputeProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeCustomerVirtualNetwork;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeEdition;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeLicenseType;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeSsisProperties;
import com.azure.resourcemanager.datafactory.models.ManagedIntegrationRuntime;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkReference;
import com.azure.resourcemanager.datafactory.models.ManagedVirtualNetworkReferenceType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedIntegrationRuntimeTests {
    @Test
    public void testDeserialize() {
        ManagedIntegrationRuntime model =
            BinaryData
                .fromString(
                    "{\"type\":\"Managed\",\"state\":\"Starting\",\"typeProperties\":{\"computeProperties\":{\"location\":\"qb\",\"nodeSize\":\"h\",\"numberOfNodes\":207616404,\"maxParallelExecutionsPerNode\":726034233,\"\":{}},\"ssisProperties\":{\"licenseType\":\"LicenseIncluded\",\"edition\":\"Standard\",\"expressCustomSetupProperties\":[],\"packageStores\":[],\"\":{}},\"customerVirtualNetwork\":{\"subnetId\":\"albmqkyojwyvfk\"}},\"managedVirtualNetwork\":{\"type\":\"ManagedVirtualNetworkReference\",\"referenceName\":\"suah\"},\"description\":\"gxjc\",\"\":{}}")
                .toObject(ManagedIntegrationRuntime.class);
        Assertions.assertEquals("gxjc", model.description());
        Assertions
            .assertEquals(
                ManagedVirtualNetworkReferenceType.MANAGED_VIRTUAL_NETWORK_REFERENCE,
                model.managedVirtualNetwork().type());
        Assertions.assertEquals("suah", model.managedVirtualNetwork().referenceName());
        Assertions.assertEquals("qb", model.computeProperties().location());
        Assertions.assertEquals("h", model.computeProperties().nodeSize());
        Assertions.assertEquals(207616404, model.computeProperties().numberOfNodes());
        Assertions.assertEquals(726034233, model.computeProperties().maxParallelExecutionsPerNode());
        Assertions.assertEquals(IntegrationRuntimeLicenseType.LICENSE_INCLUDED, model.ssisProperties().licenseType());
        Assertions.assertEquals(IntegrationRuntimeEdition.STANDARD, model.ssisProperties().edition());
        Assertions.assertEquals("albmqkyojwyvfk", model.customerVirtualNetwork().subnetId());
    }

    @Test
    public void testSerialize() {
        ManagedIntegrationRuntime model =
            new ManagedIntegrationRuntime()
                .withDescription("gxjc")
                .withManagedVirtualNetwork(
                    new ManagedVirtualNetworkReference()
                        .withType(ManagedVirtualNetworkReferenceType.MANAGED_VIRTUAL_NETWORK_REFERENCE)
                        .withReferenceName("suah"))
                .withComputeProperties(
                    new IntegrationRuntimeComputeProperties()
                        .withLocation("qb")
                        .withNodeSize("h")
                        .withNumberOfNodes(207616404)
                        .withMaxParallelExecutionsPerNode(726034233)
                        .withAdditionalProperties(mapOf()))
                .withSsisProperties(
                    new IntegrationRuntimeSsisProperties()
                        .withLicenseType(IntegrationRuntimeLicenseType.LICENSE_INCLUDED)
                        .withEdition(IntegrationRuntimeEdition.STANDARD)
                        .withExpressCustomSetupProperties(Arrays.asList())
                        .withPackageStores(Arrays.asList())
                        .withAdditionalProperties(mapOf()))
                .withCustomerVirtualNetwork(
                    new IntegrationRuntimeCustomerVirtualNetwork().withSubnetId("albmqkyojwyvfk"));
        model = BinaryData.fromObject(model).toObject(ManagedIntegrationRuntime.class);
        Assertions.assertEquals("gxjc", model.description());
        Assertions
            .assertEquals(
                ManagedVirtualNetworkReferenceType.MANAGED_VIRTUAL_NETWORK_REFERENCE,
                model.managedVirtualNetwork().type());
        Assertions.assertEquals("suah", model.managedVirtualNetwork().referenceName());
        Assertions.assertEquals("qb", model.computeProperties().location());
        Assertions.assertEquals("h", model.computeProperties().nodeSize());
        Assertions.assertEquals(207616404, model.computeProperties().numberOfNodes());
        Assertions.assertEquals(726034233, model.computeProperties().maxParallelExecutionsPerNode());
        Assertions.assertEquals(IntegrationRuntimeLicenseType.LICENSE_INCLUDED, model.ssisProperties().licenseType());
        Assertions.assertEquals(IntegrationRuntimeEdition.STANDARD, model.ssisProperties().edition());
        Assertions.assertEquals("albmqkyojwyvfk", model.customerVirtualNetwork().subnetId());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
