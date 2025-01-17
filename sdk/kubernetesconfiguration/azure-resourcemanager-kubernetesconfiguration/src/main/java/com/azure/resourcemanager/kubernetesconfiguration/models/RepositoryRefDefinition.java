// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The source reference for the GitRepository object. */
@Fluent
public final class RepositoryRefDefinition {
    /*
     * The git repository branch name to checkout.
     */
    @JsonProperty(value = "branch")
    private String branch;

    /*
     * The git repository tag name to checkout. This takes precedence over
     * branch.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /*
     * The semver range used to match against git repository tags. This takes
     * precedence over tag.
     */
    @JsonProperty(value = "semver")
    private String semver;

    /*
     * The commit SHA to checkout. This value must be combined with the branch
     * name to be valid. This takes precedence over semver.
     */
    @JsonProperty(value = "commit")
    private String commit;

    /**
     * Get the branch property: The git repository branch name to checkout.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The git repository branch name to checkout.
     *
     * @param branch the branch value to set.
     * @return the RepositoryRefDefinition object itself.
     */
    public RepositoryRefDefinition withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the tag property: The git repository tag name to checkout. This takes precedence over branch.
     *
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: The git repository tag name to checkout. This takes precedence over branch.
     *
     * @param tag the tag value to set.
     * @return the RepositoryRefDefinition object itself.
     */
    public RepositoryRefDefinition withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the semver property: The semver range used to match against git repository tags. This takes precedence over
     * tag.
     *
     * @return the semver value.
     */
    public String semver() {
        return this.semver;
    }

    /**
     * Set the semver property: The semver range used to match against git repository tags. This takes precedence over
     * tag.
     *
     * @param semver the semver value to set.
     * @return the RepositoryRefDefinition object itself.
     */
    public RepositoryRefDefinition withSemver(String semver) {
        this.semver = semver;
        return this;
    }

    /**
     * Get the commit property: The commit SHA to checkout. This value must be combined with the branch name to be
     * valid. This takes precedence over semver.
     *
     * @return the commit value.
     */
    public String commit() {
        return this.commit;
    }

    /**
     * Set the commit property: The commit SHA to checkout. This value must be combined with the branch name to be
     * valid. This takes precedence over semver.
     *
     * @param commit the commit value to set.
     * @return the RepositoryRefDefinition object itself.
     */
    public RepositoryRefDefinition withCommit(String commit) {
        this.commit = commit;
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
