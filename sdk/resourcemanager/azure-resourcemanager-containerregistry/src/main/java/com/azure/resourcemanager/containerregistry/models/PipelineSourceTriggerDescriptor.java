// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PipelineSourceTriggerDescriptor model. */
@Fluent
public final class PipelineSourceTriggerDescriptor {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelineSourceTriggerDescriptor.class);

    /*
     * The timestamp when the source update happened.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /**
     * Get the timestamp property: The timestamp when the source update happened.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The timestamp when the source update happened.
     *
     * @param timestamp the timestamp value to set.
     * @return the PipelineSourceTriggerDescriptor object itself.
     */
    public PipelineSourceTriggerDescriptor withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}