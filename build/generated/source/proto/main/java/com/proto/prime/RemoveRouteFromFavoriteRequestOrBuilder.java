// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route.proto

package com.proto.prime;

public interface RemoveRouteFromFavoriteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RemoveRouteFromFavoriteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>.Route route = 2;</code>
   * @return Whether the route field is set.
   */
  boolean hasRoute();
  /**
   * <code>.Route route = 2;</code>
   * @return The route.
   */
  com.proto.prime.Route getRoute();
  /**
   * <code>.Route route = 2;</code>
   */
  com.proto.prime.RouteOrBuilder getRouteOrBuilder();
}
