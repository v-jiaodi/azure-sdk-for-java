// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.LinkConnectionsImpl;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.EditTablesRequest;
import com.azure.analytics.synapse.artifacts.models.LinkConnectionDetailedStatus;
import com.azure.analytics.synapse.artifacts.models.LinkConnectionQueryTableStatus;
import com.azure.analytics.synapse.artifacts.models.LinkConnectionResource;
import com.azure.analytics.synapse.artifacts.models.LinkTableListResponse;
import com.azure.analytics.synapse.artifacts.models.QueryTableStatusRequest;
import com.azure.analytics.synapse.artifacts.models.UpdateLandingZoneCredential;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class LinkConnectionClient {
    @Generated private final LinkConnectionsImpl serviceClient;

    /**
     * Initializes an instance of LinkConnectionClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    LinkConnectionClient(LinkConnectionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List link connections.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LinkConnectionResource> listLinkConnectionsByWorkspace() {
        return this.serviceClient.listLinkConnectionsByWorkspace();
    }

    /**
     * List link connections.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LinkConnectionResource> listLinkConnectionsByWorkspace(Context context) {
        return this.serviceClient.listLinkConnectionsByWorkspace(context);
    }

    /**
     * Creates or updates a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param linkConnection Link connection resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkConnectionResource createOrUpdateLinkConnection(
            String linkConnectionName, LinkConnectionResource linkConnection) {
        return this.serviceClient.createOrUpdateLinkConnection(linkConnectionName, linkConnection);
    }

    /**
     * Creates or updates a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param linkConnection Link connection resource definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinkConnectionResource> createOrUpdateLinkConnectionWithResponse(
            String linkConnectionName, LinkConnectionResource linkConnection, Context context) {
        return this.serviceClient.createOrUpdateLinkConnectionWithResponse(linkConnectionName, linkConnection, context);
    }

    /**
     * Get a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a link connection.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkConnectionResource getLinkConnection(String linkConnectionName) {
        return this.serviceClient.getLinkConnection(linkConnectionName);
    }

    /**
     * Get a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a link connection along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinkConnectionResource> getLinkConnectionWithResponse(String linkConnectionName, Context context) {
        return this.serviceClient.getLinkConnectionWithResponse(linkConnectionName, context);
    }

    /**
     * Delete a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteLinkConnection(String linkConnectionName) {
        this.serviceClient.deleteLinkConnection(linkConnectionName);
    }

    /**
     * Delete a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteLinkConnectionWithResponse(String linkConnectionName, Context context) {
        return this.serviceClient.deleteLinkConnectionWithResponse(linkConnectionName, context);
    }

    /**
     * Edit tables for a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param editTablesRequest Edit tables request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void editTables(String linkConnectionName, EditTablesRequest editTablesRequest) {
        this.serviceClient.editTables(linkConnectionName, editTablesRequest);
    }

    /**
     * Edit tables for a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param editTablesRequest Edit tables request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> editTablesWithResponse(
            String linkConnectionName, EditTablesRequest editTablesRequest, Context context) {
        return this.serviceClient.editTablesWithResponse(linkConnectionName, editTablesRequest, context);
    }

    /**
     * Start a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void start(String linkConnectionName) {
        this.serviceClient.start(linkConnectionName);
    }

    /**
     * Start a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> startWithResponse(String linkConnectionName, Context context) {
        return this.serviceClient.startWithResponse(linkConnectionName, context);
    }

    /**
     * Stop a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void stop(String linkConnectionName) {
        this.serviceClient.stop(linkConnectionName);
    }

    /**
     * Stop a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> stopWithResponse(String linkConnectionName, Context context) {
        return this.serviceClient.stopWithResponse(linkConnectionName, context);
    }

    /**
     * Get the detailed status of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed status of a link connection.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkConnectionDetailedStatus getDetailedStatus(String linkConnectionName) {
        return this.serviceClient.getDetailedStatus(linkConnectionName);
    }

    /**
     * Get the detailed status of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the detailed status of a link connection along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinkConnectionDetailedStatus> getDetailedStatusWithResponse(
            String linkConnectionName, Context context) {
        return this.serviceClient.getDetailedStatusWithResponse(linkConnectionName, context);
    }

    /**
     * List the link tables of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkTableListResponse listLinkTables(String linkConnectionName) {
        return this.serviceClient.listLinkTables(linkConnectionName);
    }

    /**
     * List the link tables of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinkTableListResponse> listLinkTablesWithResponse(String linkConnectionName, Context context) {
        return this.serviceClient.listLinkTablesWithResponse(linkConnectionName, context);
    }

    /**
     * Query the link table status of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param queryTableStatusRequest Query table status request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinkConnectionQueryTableStatus queryTableStatus(
            String linkConnectionName, QueryTableStatusRequest queryTableStatusRequest) {
        return this.serviceClient.queryTableStatus(linkConnectionName, queryTableStatusRequest);
    }

    /**
     * Query the link table status of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param queryTableStatusRequest Query table status request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinkConnectionQueryTableStatus> queryTableStatusWithResponse(
            String linkConnectionName, QueryTableStatusRequest queryTableStatusRequest, Context context) {
        return this.serviceClient.queryTableStatusWithResponse(linkConnectionName, queryTableStatusRequest, context);
    }

    /**
     * Update landing zone credential of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param updateLandingZoneCredentialRequest update landing zone credential request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateLandingZoneCredential(
            String linkConnectionName, UpdateLandingZoneCredential updateLandingZoneCredentialRequest) {
        this.serviceClient.updateLandingZoneCredential(linkConnectionName, updateLandingZoneCredentialRequest);
    }

    /**
     * Update landing zone credential of a link connection.
     *
     * @param linkConnectionName The link connection name.
     * @param updateLandingZoneCredentialRequest update landing zone credential request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> updateLandingZoneCredentialWithResponse(
            String linkConnectionName,
            UpdateLandingZoneCredential updateLandingZoneCredentialRequest,
            Context context) {
        return this.serviceClient.updateLandingZoneCredentialWithResponse(
                linkConnectionName, updateLandingZoneCredentialRequest, context);
    }
}
