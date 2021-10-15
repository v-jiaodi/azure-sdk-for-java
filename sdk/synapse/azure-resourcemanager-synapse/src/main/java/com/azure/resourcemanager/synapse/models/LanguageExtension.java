// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.resourcemanager.synapse.fluent.models.LanguageExtensionInner;

/** An immutable client-side representation of LanguageExtension. */
public interface LanguageExtension {
    /**
     * Gets the languageExtensionName property: The language extension name.
     *
     * @return the languageExtensionName value.
     */
    LanguageExtensionName languageExtensionName();

    /**
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.LanguageExtensionInner object.
     *
     * @return the inner object.
     */
    LanguageExtensionInner innerModel();
}