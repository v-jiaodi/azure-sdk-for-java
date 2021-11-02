// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.GremlinGraphGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.models.GremlinGraphGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an Azure Cosmos DB Gremlin graph. */
@Fluent
public final class GremlinGraphGetProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GremlinGraphGetProperties.class);

    /*
     * The resource property.
     */
    @JsonProperty(value = "resource")
    private GremlinGraphGetPropertiesResource resource;

    /*
     * The options property.
     */
    @JsonProperty(value = "options")
    private GremlinGraphGetPropertiesOptions options;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public GremlinGraphGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the GremlinGraphGetProperties object itself.
     */
    public GremlinGraphGetProperties withResource(GremlinGraphGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: The options property.
     *
     * @return the options value.
     */
    public GremlinGraphGetPropertiesOptions options() {
        return this.options;
    }

    /**
     * Set the options property: The options property.
     *
     * @param options the options value to set.
     * @return the GremlinGraphGetProperties object itself.
     */
    public GremlinGraphGetProperties withOptions(GremlinGraphGetPropertiesOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() != null) {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }
}