// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.models;

import com.azure.resourcemanager.logz.fluent.models.VMResourcesInner;

/** An immutable client-side representation of VMResources. */
public interface VMResources {
    /**
     * Gets the id property: Request of a list vm host update operation.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the agentVersion property: Version of the Logz agent installed on the VM.
     *
     * @return the agentVersion value.
     */
    String agentVersion();

    /**
     * Gets the inner com.azure.resourcemanager.logz.fluent.models.VMResourcesInner object.
     *
     * @return the inner object.
     */
    VMResourcesInner innerModel();
}