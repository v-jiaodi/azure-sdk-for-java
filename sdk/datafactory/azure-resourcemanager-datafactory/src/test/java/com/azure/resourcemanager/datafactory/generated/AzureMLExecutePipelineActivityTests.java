// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.AzureMLExecutePipelineActivity;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureMLExecutePipelineActivityTests {
    @Test
    public void testDeserialize() {
        AzureMLExecutePipelineActivity model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureMLExecutePipeline\",\"typeProperties\":{},\"linkedServiceName\":{\"referenceName\":\"p\",\"parameters\":{}},\"policy\":{\"retryIntervalInSeconds\":2013244480,\"secureInput\":false,\"secureOutput\":false,\"\":{}},\"name\":\"cdbkpdjtaq\",\"description\":\"mqazpdgonjh\",\"dependsOn\":[{\"activity\":\"thmgpczqulp\",\"dependencyConditions\":[\"Skipped\",\"Completed\",\"Skipped\",\"Completed\"],\"\":{}}],\"userProperties\":[{\"name\":\"igqqbtimpkjblo\"},{\"name\":\"nsihqhudsm\"},{\"name\":\"suaawj\"},{\"name\":\"kxwj\"}],\"\":{}}")
                .toObject(AzureMLExecutePipelineActivity.class);
        Assertions.assertEquals("cdbkpdjtaq", model.name());
        Assertions.assertEquals("mqazpdgonjh", model.description());
        Assertions.assertEquals("thmgpczqulp", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("igqqbtimpkjblo", model.userProperties().get(0).name());
        Assertions.assertEquals("p", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2013244480, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
    }

    @Test
    public void testSerialize() {
        AzureMLExecutePipelineActivity model =
            new AzureMLExecutePipelineActivity()
                .withName("cdbkpdjtaq")
                .withDescription("mqazpdgonjh")
                .withDependsOn(
                    Arrays
                        .asList(
                            new ActivityDependency()
                                .withActivity("thmgpczqulp")
                                .withDependencyConditions(
                                    Arrays
                                        .asList(
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED,
                                            DependencyCondition.SKIPPED,
                                            DependencyCondition.COMPLETED))
                                .withAdditionalProperties(mapOf())))
                .withUserProperties(
                    Arrays
                        .asList(
                            new UserProperty().withName("igqqbtimpkjblo"),
                            new UserProperty().withName("nsihqhudsm"),
                            new UserProperty().withName("suaawj"),
                            new UserProperty().withName("kxwj")))
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("p").withParameters(mapOf()))
                .withPolicy(
                    new ActivityPolicy()
                        .withRetryIntervalInSeconds(2013244480)
                        .withSecureInput(false)
                        .withSecureOutput(false)
                        .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(AzureMLExecutePipelineActivity.class);
        Assertions.assertEquals("cdbkpdjtaq", model.name());
        Assertions.assertEquals("mqazpdgonjh", model.description());
        Assertions.assertEquals("thmgpczqulp", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SKIPPED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("igqqbtimpkjblo", model.userProperties().get(0).name());
        Assertions.assertEquals("p", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2013244480, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(false, model.policy().secureOutput());
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
