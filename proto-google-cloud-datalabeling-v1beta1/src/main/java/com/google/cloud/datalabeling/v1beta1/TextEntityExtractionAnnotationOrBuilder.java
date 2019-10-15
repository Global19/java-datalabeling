/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

public interface TextEntityExtractionAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  boolean hasAnnotationSpec();
  /**
   *
   *
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec();
  /**
   *
   *
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   */
  boolean hasSequentialSegment();
  /**
   *
   *
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.SequentialSegment getSequentialSegment();
  /**
   *
   *
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.SequentialSegmentOrBuilder getSequentialSegmentOrBuilder();
}
