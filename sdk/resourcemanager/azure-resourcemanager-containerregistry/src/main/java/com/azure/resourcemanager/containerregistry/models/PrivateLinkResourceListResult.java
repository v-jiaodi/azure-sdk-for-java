// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.fluent.models.PrivateLinkResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result of a request to list private link resources for a container registry. */
@Fluent
public final class PrivateLinkResourceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourceListResult.class);

    /*
     * The list of private link resources. Since this list may be incomplete,
     * the nextLink field should be used to request the next list of private
     * link resources.
     */
    @JsonProperty(value = "value")
    private List<PrivateLinkResourceInner> value;

    /*
     * The URI that can be used to request the next list of private link
     * resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of private link resources. Since this list may be incomplete, the nextLink field
     * should be used to request the next list of private link resources.
     *
     * @return the value value.
     */
    public List<PrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of private link resources. Since this list may be incomplete, the nextLink field
     * should be used to request the next list of private link resources.
     *
     * @param value the value value to set.
     * @return the PrivateLinkResourceListResult object itself.
     */
    public PrivateLinkResourceListResult withValue(List<PrivateLinkResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of private link resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of private link resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the PrivateLinkResourceListResult object itself.
     */
    public PrivateLinkResourceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}