// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationStatusJobExtendedInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationStatusJobExtendedInfoTests {
    @Test
    public void testDeserialize() {
        OperationStatusJobExtendedInfo model =
            BinaryData
                .fromString("{\"objectType\":\"OperationStatusJobExtendedInfo\",\"jobId\":\"afbwqroohtuovmao\"}")
                .toObject(OperationStatusJobExtendedInfo.class);
        Assertions.assertEquals("afbwqroohtuovmao", model.jobId());
    }

    @Test
    public void testSerialize() {
        OperationStatusJobExtendedInfo model = new OperationStatusJobExtendedInfo().withJobId("afbwqroohtuovmao");
        model = BinaryData.fromObject(model).toObject(OperationStatusJobExtendedInfo.class);
        Assertions.assertEquals("afbwqroohtuovmao", model.jobId());
    }
}
