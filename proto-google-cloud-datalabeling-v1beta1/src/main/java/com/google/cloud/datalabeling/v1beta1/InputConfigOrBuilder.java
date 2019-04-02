// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /** <code>.google.cloud.datalabeling.v1beta1.GcsSource gcs_source = 2;</code> */
  boolean hasGcsSource();
  /** <code>.google.cloud.datalabeling.v1beta1.GcsSource gcs_source = 2;</code> */
  com.google.cloud.datalabeling.v1beta1.GcsSource getGcsSource();
  /** <code>.google.cloud.datalabeling.v1beta1.GcsSource gcs_source = 2;</code> */
  com.google.cloud.datalabeling.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Data type must be specifed when user tries to import data.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.DataType data_type = 1;</code>
   */
  int getDataTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Data type must be specifed when user tries to import data.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.DataType data_type = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.DataType getDataType();

  public com.google.cloud.datalabeling.v1beta1.InputConfig.SourceCase getSourceCase();
}
