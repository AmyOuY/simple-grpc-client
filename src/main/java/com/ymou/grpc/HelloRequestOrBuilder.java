// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.ymou.grpc;

public interface HelloRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HelloRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   */
  int getAge();

  /**
   * <code>repeated string hobbies = 3;</code>
   */
  java.util.List<java.lang.String>
      getHobbiesList();
  /**
   * <code>repeated string hobbies = 3;</code>
   */
  int getHobbiesCount();
  /**
   * <code>repeated string hobbies = 3;</code>
   */
  java.lang.String getHobbies(int index);
  /**
   * <code>repeated string hobbies = 3;</code>
   */
  com.google.protobuf.ByteString
      getHobbiesBytes(int index);

  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  int getBagOfTricksCount();
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  boolean containsBagOfTricks(
      java.lang.String key);
  /**
   * Use {@link #getBagOfTricksMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getBagOfTricks();
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getBagOfTricksMap();
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  java.lang.String getBagOfTricksOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  java.lang.String getBagOfTricksOrThrow(
      java.lang.String key);

  /**
   * <code>.Sentiment sentiment = 5;</code>
   */
  int getSentimentValue();
  /**
   * <code>.Sentiment sentiment = 5;</code>
   */
  com.ymou.grpc.Sentiment getSentiment();
}
