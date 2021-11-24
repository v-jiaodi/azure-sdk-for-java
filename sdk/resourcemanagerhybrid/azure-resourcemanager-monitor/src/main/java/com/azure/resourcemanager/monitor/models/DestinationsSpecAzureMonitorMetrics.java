// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Azure Monitor Metrics destination. */
@Fluent
public final class DestinationsSpecAzureMonitorMetrics extends AzureMonitorMetricsDestination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DestinationsSpecAzureMonitorMetrics.class);

    /** {@inheritDoc} */
    @Override
    public DestinationsSpecAzureMonitorMetrics withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}