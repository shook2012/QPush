// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb_message.proto

package com.argo.qpush.protobuf;

public final class PbMessage {
  private PbMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_PBAPNSUserInfo_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_message_PBAPNSUserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_PBAPNSBody_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_message_PBAPNSBody_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_PBAPNSMessage_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_message_PBAPNSMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_PBAPNSEvent_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_message_PBAPNSEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020pb_message.proto\022\007message\",\n\016PBAPNSUse" +
      "rInfo\022\013\n\003key\030\001 \002(\t\022\r\n\005value\030\002 \002(\t\"9\n\nPBA" +
      "PNSBody\022\r\n\005alert\030\001 \001(\t\022\r\n\005sound\030\002 \001(\t\022\r\n" +
      "\005badge\030\003 \001(\005\"\\\n\rPBAPNSMessage\022 \n\003aps\030\001 \002" +
      "(\0132\023.message.PBAPNSBody\022)\n\010userInfo\030\002 \003(" +
      "\0132\027.message.PBAPNSUserInfo\"\271\001\n\013PBAPNSEve" +
      "nt\022\n\n\002op\030\001 \002(\005\022\r\n\005token\030\002 \002(\t\022\016\n\006appKey\030" +
      "\003 \002(\t\022\016\n\006userId\030\004 \002(\t\022\016\n\006typeId\030\005 \002(\005\":\n" +
      "\003Ops\022\n\n\006Online\020\001\022\r\n\tKeepAlive\020\002\022\013\n\007PushA" +
      "ck\020\003\022\013\n\007Offline\020\004\"#\n\013DeviceTypes\022\007\n\003iOS\020",
      "\001\022\013\n\007Android\020\002B\033\n\027com.argo.qpush.protobu" +
      "fP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_message_PBAPNSUserInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_message_PBAPNSUserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_message_PBAPNSUserInfo_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_message_PBAPNSBody_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_message_PBAPNSBody_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_message_PBAPNSBody_descriptor,
        new java.lang.String[] { "Alert", "Sound", "Badge", });
    internal_static_message_PBAPNSMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_message_PBAPNSMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_message_PBAPNSMessage_descriptor,
        new java.lang.String[] { "Aps", "UserInfo", });
    internal_static_message_PBAPNSEvent_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_message_PBAPNSEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_message_PBAPNSEvent_descriptor,
        new java.lang.String[] { "Op", "Token", "AppKey", "UserId", "TypeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
