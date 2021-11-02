// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dataprotection.fluent.ExportJobsOperationResultsClient;
import com.azure.resourcemanager.dataprotection.fluent.models.ExportJobsResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ExportJobsOperationResultsClient. */
public final class ExportJobsOperationResultsClientImpl implements ExportJobsOperationResultsClient {
    private final ClientLogger logger = new ClientLogger(ExportJobsOperationResultsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ExportJobsOperationResultsService service;

    /** The service client containing this operation class. */
    private final DataProtectionClientImpl client;

    /**
     * Initializes an instance of ExportJobsOperationResultsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ExportJobsOperationResultsClientImpl(DataProtectionClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ExportJobsOperationResultsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DataProtectionClientExportJobsOperationResults to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DataProtectionClient")
    private interface ExportJobsOperationResultsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataProtection"
                + "/backupVaults/{vaultName}/backupJobs/operations/{operationId}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ExportJobsResultInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("vaultName") String vaultName,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param operationId OperationID which represents the export job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExportJobsResultInner>> getWithResponseAsync(
        String resourceGroupName, String vaultName, String operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            vaultName,
                            operationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param operationId OperationID which represents the export job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ExportJobsResultInner>> getWithResponseAsync(
        String resourceGroupName, String vaultName, String operationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                vaultName,
                operationId,
                accept,
                context);
    }

    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param operationId OperationID which represents the export job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExportJobsResultInner> getAsync(String resourceGroupName, String vaultName, String operationId) {
        return getWithResponseAsync(resourceGroupName, vaultName, operationId)
            .flatMap(
                (Response<ExportJobsResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param operationId OperationID which represents the export job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExportJobsResultInner get(String resourceGroupName, String vaultName, String operationId) {
        return getAsync(resourceGroupName, vaultName, operationId).block();
    }

    /**
     * Gets the operation result of operation triggered by Export Jobs API. If the operation is successful, then it also
     * contains URL of a Blob and a SAS key to access the same. The blob contains exported jobs in JSON serialized
     * format.
     *
     * @param resourceGroupName The name of the resource group where the backup vault is present.
     * @param vaultName The name of the backup vault.
     * @param operationId OperationID which represents the export job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result of operation triggered by Export Jobs API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ExportJobsResultInner> getWithResponse(
        String resourceGroupName, String vaultName, String operationId, Context context) {
        return getWithResponseAsync(resourceGroupName, vaultName, operationId, context).block();
    }
}