// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationResultInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationResultInfoTests {
    @Test
    public void testDeserialize() {
        OperationResultInfo model =
            BinaryData
                .fromString("{\"objectType\":\"OperationResultInfo\",\"jobList\":[\"vzuyturmlmu\",\"wolba\"]}")
                .toObject(OperationResultInfo.class);
        Assertions.assertEquals("vzuyturmlmu", model.jobList().get(0));
    }

    @Test
    public void testSerialize() {
        OperationResultInfo model = new OperationResultInfo().withJobList(Arrays.asList("vzuyturmlmu", "wolba"));
        model = BinaryData.fromObject(model).toObject(OperationResultInfo.class);
        Assertions.assertEquals("vzuyturmlmu", model.jobList().get(0));
    }
}
