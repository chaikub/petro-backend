// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Account.proto

package com.proto.prime;

public final class Account {
  private Account() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAccountsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAccountsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAccountsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAccountsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignUpRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignUpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignUpResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignUpResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignInRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignInRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SignInResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SignInResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rAccount.proto\"8\n\022GetAccountsRequest\022\020\n" +
      "\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"(\n\023Get" +
      "AccountsResponse\022\021\n\tisSuccess\030\001 \001(\010\"g\n\rS" +
      "ignUpRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010passwo" +
      "rd\030\002 \001(\t\022\021\n\tfirstName\030\004 \001(\t\022\020\n\010lastName\030" +
      "\005 \001(\t\022\r\n\005phone\030\006 \001(\t\"#\n\016SignUpResponse\022\021" +
      "\n\tisSuccess\030\001 \001(\010\"3\n\rSignInRequest\022\020\n\010us" +
      "ername\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"#\n\016SignIn" +
      "Response\022\021\n\tisSuccess\030\001 \001(\0102\246\001\n\016AccountS" +
      "ervice\022+\n\006SignUp\022\016.SignUpRequest\032\017.SignU" +
      "pResponse\"\000\022+\n\006SignIn\022\016.SignInRequest\032\017." +
      "SignInResponse\"\000\022:\n\013getAccounts\022\023.GetAcc" +
      "ountsRequest\032\024.GetAccountsResponse\"\000B\023\n\017" +
      "com.proto.primeP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAccountsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAccountsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAccountsRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_GetAccountsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetAccountsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAccountsResponse_descriptor,
        new java.lang.String[] { "IsSuccess", });
    internal_static_SignUpRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SignUpRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignUpRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "FirstName", "LastName", "Phone", });
    internal_static_SignUpResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SignUpResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignUpResponse_descriptor,
        new java.lang.String[] { "IsSuccess", });
    internal_static_SignInRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SignInRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignInRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_SignInResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SignInResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SignInResponse_descriptor,
        new java.lang.String[] { "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
