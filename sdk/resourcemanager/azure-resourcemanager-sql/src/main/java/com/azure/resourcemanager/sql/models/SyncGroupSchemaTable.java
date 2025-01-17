// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of table in sync group schema. */
@Fluent
public final class SyncGroupSchemaTable {
    /*
     * List of columns in sync group schema.
     */
    @JsonProperty(value = "columns")
    private List<SyncGroupSchemaTableColumn> columns;

    /*
     * Quoted name of sync group schema table.
     */
    @JsonProperty(value = "quotedName")
    private String quotedName;

    /**
     * Get the columns property: List of columns in sync group schema.
     *
     * @return the columns value.
     */
    public List<SyncGroupSchemaTableColumn> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: List of columns in sync group schema.
     *
     * @param columns the columns value to set.
     * @return the SyncGroupSchemaTable object itself.
     */
    public SyncGroupSchemaTable withColumns(List<SyncGroupSchemaTableColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the quotedName property: Quoted name of sync group schema table.
     *
     * @return the quotedName value.
     */
    public String quotedName() {
        return this.quotedName;
    }

    /**
     * Set the quotedName property: Quoted name of sync group schema table.
     *
     * @param quotedName the quotedName value to set.
     * @return the SyncGroupSchemaTable object itself.
     */
    public SyncGroupSchemaTable withQuotedName(String quotedName) {
        this.quotedName = quotedName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (columns() != null) {
            columns().forEach(e -> e.validate());
        }
    }
}
