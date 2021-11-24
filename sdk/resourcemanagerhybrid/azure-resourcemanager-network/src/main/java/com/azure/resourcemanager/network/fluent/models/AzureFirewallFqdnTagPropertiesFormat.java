// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Firewall FQDN Tag Properties. */
@Immutable
public final class AzureFirewallFqdnTagPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFirewallFqdnTagPropertiesFormat.class);

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The name of this FQDN Tag.
     */
    @JsonProperty(value = "fqdnTagName", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdnTagName;

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the fqdnTagName property: The name of this FQDN Tag.
     *
     * @return the fqdnTagName value.
     */
    public String fqdnTagName() {
        return this.fqdnTagName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}