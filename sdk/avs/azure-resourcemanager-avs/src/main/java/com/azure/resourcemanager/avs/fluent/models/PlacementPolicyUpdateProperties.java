// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.PlacementPolicyState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of a placement policy resource that may be updated. */
@Fluent
public final class PlacementPolicyUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PlacementPolicyUpdateProperties.class);

    /*
     * Whether the placement policy is enabled or disabled
     */
    @JsonProperty(value = "state")
    private PlacementPolicyState state;

    /*
     * Virtual machine members list
     */
    @JsonProperty(value = "vmMembers")
    private List<String> vmMembers;

    /*
     * Host members list
     */
    @JsonProperty(value = "hostMembers")
    private List<String> hostMembers;

    /**
     * Get the state property: Whether the placement policy is enabled or disabled.
     *
     * @return the state value.
     */
    public PlacementPolicyState state() {
        return this.state;
    }

    /**
     * Set the state property: Whether the placement policy is enabled or disabled.
     *
     * @param state the state value to set.
     * @return the PlacementPolicyUpdateProperties object itself.
     */
    public PlacementPolicyUpdateProperties withState(PlacementPolicyState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the vmMembers property: Virtual machine members list.
     *
     * @return the vmMembers value.
     */
    public List<String> vmMembers() {
        return this.vmMembers;
    }

    /**
     * Set the vmMembers property: Virtual machine members list.
     *
     * @param vmMembers the vmMembers value to set.
     * @return the PlacementPolicyUpdateProperties object itself.
     */
    public PlacementPolicyUpdateProperties withVmMembers(List<String> vmMembers) {
        this.vmMembers = vmMembers;
        return this;
    }

    /**
     * Get the hostMembers property: Host members list.
     *
     * @return the hostMembers value.
     */
    public List<String> hostMembers() {
        return this.hostMembers;
    }

    /**
     * Set the hostMembers property: Host members list.
     *
     * @param hostMembers the hostMembers value to set.
     * @return the PlacementPolicyUpdateProperties object itself.
     */
    public PlacementPolicyUpdateProperties withHostMembers(List<String> hostMembers) {
        this.hostMembers = hostMembers;
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