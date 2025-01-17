// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.CatalogListResult;
import org.junit.jupiter.api.Test;

public final class CatalogListResultTests {
    @Test
    public void testDeserialize() {
        CatalogListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"i\",\"lastSyncTime\":\"2021-01-23T09:13:04Z\"},\"id\":\"vjsllrmvvdfw\",\"name\":\"t\",\"type\":\"pnpulexxbczwtru\"},{\"properties\":{\"provisioningState\":\"zb\",\"lastSyncTime\":\"2021-02-10T16:58:51Z\"},\"id\":\"myokacspkwlh\",\"name\":\"dobpxjmflbvvn\",\"type\":\"hrk\"},{\"properties\":{\"provisioningState\":\"wwzjuqkhrsajiwku\",\"lastSyncTime\":\"2021-10-04T05:41:09Z\"},\"id\":\"hsauuimjmvxied\",\"name\":\"ugidyjrr\",\"type\":\"byao\"}],\"nextLink\":\"e\"}")
                .toObject(CatalogListResult.class);
    }

    @Test
    public void testSerialize() {
        CatalogListResult model = new CatalogListResult();
        model = BinaryData.fromObject(model).toObject(CatalogListResult.class);
    }
}
