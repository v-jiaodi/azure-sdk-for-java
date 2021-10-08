// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a resource currently being monitored by the Logz monitor resource. */
@Fluent
public final class MonitoredResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MonitoredResourceInner.class);

    /*
     * The ARM id of the resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Flag indicating if resource is sending metrics to Logz.
     */
    @JsonProperty(value = "sendingMetrics")
    private Boolean sendingMetrics;

    /*
     * Reason for why the resource is sending metrics (or why it is not
     * sending).
     */
    @JsonProperty(value = "reasonForMetricsStatus")
    private String reasonForMetricsStatus;

    /*
     * Flag indicating if resource is sending logs to Logz.
     */
    @JsonProperty(value = "sendingLogs")
    private Boolean sendingLogs;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Reason for why the resource is sending logs (or why it is not sending).
     */
    @JsonProperty(value = "reasonForLogsStatus")
    private String reasonForLogsStatus;

    /**
     * Get the id property: The ARM id of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ARM id of the resource.
     *
     * @param id the id value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the sendingMetrics property: Flag indicating if resource is sending metrics to Logz.
     *
     * @return the sendingMetrics value.
     */
    public Boolean sendingMetrics() {
        return this.sendingMetrics;
    }

    /**
     * Set the sendingMetrics property: Flag indicating if resource is sending metrics to Logz.
     *
     * @param sendingMetrics the sendingMetrics value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withSendingMetrics(Boolean sendingMetrics) {
        this.sendingMetrics = sendingMetrics;
        return this;
    }

    /**
     * Get the reasonForMetricsStatus property: Reason for why the resource is sending metrics (or why it is not
     * sending).
     *
     * @return the reasonForMetricsStatus value.
     */
    public String reasonForMetricsStatus() {
        return this.reasonForMetricsStatus;
    }

    /**
     * Set the reasonForMetricsStatus property: Reason for why the resource is sending metrics (or why it is not
     * sending).
     *
     * @param reasonForMetricsStatus the reasonForMetricsStatus value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withReasonForMetricsStatus(String reasonForMetricsStatus) {
        this.reasonForMetricsStatus = reasonForMetricsStatus;
        return this;
    }

    /**
     * Get the sendingLogs property: Flag indicating if resource is sending logs to Logz.
     *
     * @return the sendingLogs value.
     */
    public Boolean sendingLogs() {
        return this.sendingLogs;
    }

    /**
     * Set the sendingLogs property: Flag indicating if resource is sending logs to Logz.
     *
     * @param sendingLogs the sendingLogs value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withSendingLogs(Boolean sendingLogs) {
        this.sendingLogs = sendingLogs;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the reasonForLogsStatus property: Reason for why the resource is sending logs (or why it is not sending).
     *
     * @return the reasonForLogsStatus value.
     */
    public String reasonForLogsStatus() {
        return this.reasonForLogsStatus;
    }

    /**
     * Set the reasonForLogsStatus property: Reason for why the resource is sending logs (or why it is not sending).
     *
     * @param reasonForLogsStatus the reasonForLogsStatus value to set.
     * @return the MonitoredResourceInner object itself.
     */
    public MonitoredResourceInner withReasonForLogsStatus(String reasonForLogsStatus) {
        this.reasonForLogsStatus = reasonForLogsStatus;
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