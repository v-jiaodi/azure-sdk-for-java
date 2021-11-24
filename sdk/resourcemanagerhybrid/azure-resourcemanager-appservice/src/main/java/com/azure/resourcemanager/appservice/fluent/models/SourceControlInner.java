// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The source control OAuth token. */
@Fluent
public final class SourceControlInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceControlInner.class);

    /*
     * SourceControl resource specific properties
     */
    @JsonProperty(value = "properties")
    private SourceControlProperties innerProperties;

    /**
     * Get the innerProperties property: SourceControl resource specific properties.
     *
     * @return the innerProperties value.
     */
    private SourceControlProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SourceControlInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the token property: OAuth access token.
     *
     * @return the token value.
     */
    public String token() {
        return this.innerProperties() == null ? null : this.innerProperties().token();
    }

    /**
     * Set the token property: OAuth access token.
     *
     * @param token the token value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withToken(String token) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withToken(token);
        return this;
    }

    /**
     * Get the tokenSecret property: OAuth access token secret.
     *
     * @return the tokenSecret value.
     */
    public String tokenSecret() {
        return this.innerProperties() == null ? null : this.innerProperties().tokenSecret();
    }

    /**
     * Set the tokenSecret property: OAuth access token secret.
     *
     * @param tokenSecret the tokenSecret value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withTokenSecret(String tokenSecret) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withTokenSecret(tokenSecret);
        return this;
    }

    /**
     * Get the refreshToken property: OAuth refresh token.
     *
     * @return the refreshToken value.
     */
    public String refreshToken() {
        return this.innerProperties() == null ? null : this.innerProperties().refreshToken();
    }

    /**
     * Set the refreshToken property: OAuth refresh token.
     *
     * @param refreshToken the refreshToken value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withRefreshToken(String refreshToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withRefreshToken(refreshToken);
        return this;
    }

    /**
     * Get the expirationTime property: OAuth token expiration.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTime();
    }

    /**
     * Set the expirationTime property: OAuth token expiration.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withExpirationTime(OffsetDateTime expirationTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlProperties();
        }
        this.innerProperties().withExpirationTime(expirationTime);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}