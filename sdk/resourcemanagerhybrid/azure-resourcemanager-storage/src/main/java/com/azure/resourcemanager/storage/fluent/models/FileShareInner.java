// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.models.AzureEntityResource;
import com.azure.resourcemanager.storage.models.EnabledProtocols;
import com.azure.resourcemanager.storage.models.RootSquashType;
import com.azure.resourcemanager.storage.models.ShareAccessTier;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Properties of the file share, including Id, resource name, resource type, Etag. */
@Fluent
public final class FileShareInner extends AzureEntityResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FileShareInner.class);

    /*
     * Properties of the file share.
     */
    @JsonProperty(value = "properties")
    private FileShareProperties innerFileShareProperties;

    /**
     * Get the innerFileShareProperties property: Properties of the file share.
     *
     * @return the innerFileShareProperties value.
     */
    private FileShareProperties innerFileShareProperties() {
        return this.innerFileShareProperties;
    }

    /**
     * Get the lastModifiedTime property: Returns the date and time the share was last modified.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().lastModifiedTime();
    }

    /**
     * Get the metadata property: A name-value pair to associate with the share as metadata.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().metadata();
    }

    /**
     * Set the metadata property: A name-value pair to associate with the share as metadata.
     *
     * @param metadata the metadata value to set.
     * @return the FileShareInner object itself.
     */
    public FileShareInner withMetadata(Map<String, String> metadata) {
        if (this.innerFileShareProperties() == null) {
            this.innerFileShareProperties = new FileShareProperties();
        }
        this.innerFileShareProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the shareQuota property: The maximum size of the share, in gigabytes. Must be greater than 0, and less than
     * or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     *
     * @return the shareQuota value.
     */
    public Integer shareQuota() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().shareQuota();
    }

    /**
     * Set the shareQuota property: The maximum size of the share, in gigabytes. Must be greater than 0, and less than
     * or equal to 5TB (5120). For Large File Shares, the maximum size is 102400.
     *
     * @param shareQuota the shareQuota value to set.
     * @return the FileShareInner object itself.
     */
    public FileShareInner withShareQuota(Integer shareQuota) {
        if (this.innerFileShareProperties() == null) {
            this.innerFileShareProperties = new FileShareProperties();
        }
        this.innerFileShareProperties().withShareQuota(shareQuota);
        return this;
    }

    /**
     * Get the enabledProtocols property: The authentication protocol that is used for the file share. Can only be
     * specified when creating a share.
     *
     * @return the enabledProtocols value.
     */
    public EnabledProtocols enabledProtocols() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().enabledProtocols();
    }

    /**
     * Set the enabledProtocols property: The authentication protocol that is used for the file share. Can only be
     * specified when creating a share.
     *
     * @param enabledProtocols the enabledProtocols value to set.
     * @return the FileShareInner object itself.
     */
    public FileShareInner withEnabledProtocols(EnabledProtocols enabledProtocols) {
        if (this.innerFileShareProperties() == null) {
            this.innerFileShareProperties = new FileShareProperties();
        }
        this.innerFileShareProperties().withEnabledProtocols(enabledProtocols);
        return this;
    }

    /**
     * Get the rootSquash property: The property is for NFS share only. The default is NoRootSquash.
     *
     * @return the rootSquash value.
     */
    public RootSquashType rootSquash() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().rootSquash();
    }

    /**
     * Set the rootSquash property: The property is for NFS share only. The default is NoRootSquash.
     *
     * @param rootSquash the rootSquash value to set.
     * @return the FileShareInner object itself.
     */
    public FileShareInner withRootSquash(RootSquashType rootSquash) {
        if (this.innerFileShareProperties() == null) {
            this.innerFileShareProperties = new FileShareProperties();
        }
        this.innerFileShareProperties().withRootSquash(rootSquash);
        return this;
    }

    /**
     * Get the version property: The version of the share.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().version();
    }

    /**
     * Get the deleted property: Indicates whether the share was deleted.
     *
     * @return the deleted value.
     */
    public Boolean deleted() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().deleted();
    }

    /**
     * Get the deletedTime property: The deleted time if the share was deleted.
     *
     * @return the deletedTime value.
     */
    public OffsetDateTime deletedTime() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().deletedTime();
    }

    /**
     * Get the remainingRetentionDays property: Remaining retention days for share that was soft deleted.
     *
     * @return the remainingRetentionDays value.
     */
    public Integer remainingRetentionDays() {
        return this.innerFileShareProperties() == null
            ? null
            : this.innerFileShareProperties().remainingRetentionDays();
    }

    /**
     * Get the accessTier property: Access tier for specific share. GpV2 account can choose between TransactionOptimized
     * (default), Hot, and Cool. FileStorage account can choose Premium.
     *
     * @return the accessTier value.
     */
    public ShareAccessTier accessTier() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().accessTier();
    }

    /**
     * Set the accessTier property: Access tier for specific share. GpV2 account can choose between TransactionOptimized
     * (default), Hot, and Cool. FileStorage account can choose Premium.
     *
     * @param accessTier the accessTier value to set.
     * @return the FileShareInner object itself.
     */
    public FileShareInner withAccessTier(ShareAccessTier accessTier) {
        if (this.innerFileShareProperties() == null) {
            this.innerFileShareProperties = new FileShareProperties();
        }
        this.innerFileShareProperties().withAccessTier(accessTier);
        return this;
    }

    /**
     * Get the accessTierChangeTime property: Indicates the last modification time for share access tier.
     *
     * @return the accessTierChangeTime value.
     */
    public OffsetDateTime accessTierChangeTime() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().accessTierChangeTime();
    }

    /**
     * Get the accessTierStatus property: Indicates if there is a pending transition for access tier.
     *
     * @return the accessTierStatus value.
     */
    public String accessTierStatus() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().accessTierStatus();
    }

    /**
     * Get the shareUsageBytes property: The approximate size of the data stored on the share. Note that this value may
     * not include all recently created or recently resized files.
     *
     * @return the shareUsageBytes value.
     */
    public Long shareUsageBytes() {
        return this.innerFileShareProperties() == null ? null : this.innerFileShareProperties().shareUsageBytes();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerFileShareProperties() != null) {
            innerFileShareProperties().validate();
        }
    }
}