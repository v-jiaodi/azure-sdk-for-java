// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Reason. */
public final class Reason extends ExpandableStringEnum<Reason> {
    /** Static value Invalid for Reason. */
    public static final Reason INVALID = fromString("Invalid");

    /** Static value AlreadyExists for Reason. */
    public static final Reason ALREADY_EXISTS = fromString("AlreadyExists");

    /**
     * Creates or finds a Reason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Reason.
     */
    @JsonCreator
    public static Reason fromString(String name) {
        return fromString(name, Reason.class);
    }

    /** @return known Reason values. */
    public static Collection<Reason> values() {
        return values(Reason.class);
    }
}