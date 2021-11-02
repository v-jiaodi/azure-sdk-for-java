// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoAnalyzerOperationStatusInner;
import com.azure.resourcemanager.videoanalyzer.models.VideoAnalyzerOperationStatus;

public final class VideoAnalyzerOperationStatusImpl implements VideoAnalyzerOperationStatus {
    private VideoAnalyzerOperationStatusInner innerObject;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    VideoAnalyzerOperationStatusImpl(
        VideoAnalyzerOperationStatusInner innerObject,
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String startTime() {
        return this.innerModel().startTime();
    }

    public String endTime() {
        return this.innerModel().endTime();
    }

    public String status() {
        return this.innerModel().status();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public VideoAnalyzerOperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }
}