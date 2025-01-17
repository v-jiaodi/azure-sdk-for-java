// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.NetezzaTableDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class NetezzaTableDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        NetezzaTableDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(NetezzaTableDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        NetezzaTableDatasetTypeProperties model = new NetezzaTableDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(NetezzaTableDatasetTypeProperties.class);
    }
}
