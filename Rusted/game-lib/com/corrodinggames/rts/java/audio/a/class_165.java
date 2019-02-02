package com.corrodinggames.rts.java.audio.a;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.s
public final class class_165 {
   // $FF: renamed from: a byte[]
   public static final byte[] field_1475 = new byte[0];

   // $FF: renamed from: a (java.io.InputStream, java.io.OutputStream) void
   public static void method_1199(InputStream var0, OutputStream var1) {
      method_1200(var0, var1, new byte[4096]);
   }

   // $FF: renamed from: a (java.io.InputStream, java.io.OutputStream, byte[]) void
   public static void method_1200(InputStream var0, OutputStream var1, byte[] var2) {
      int var3;
      while((var3 = var0.read(var2)) != -1) {
         var1.write(var2, 0, var3);
      }

   }

   // $FF: renamed from: a (java.io.InputStream, int) byte[]
   public static byte[] method_1201(InputStream var0, int var1) {
      class_163 var2 = new class_163(Math.max(0, var1));
      method_1199(var0, var2);
      return var2.toByteArray();
   }

   // $FF: renamed from: a (java.io.Closeable) void
   public static void method_1202(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (Throwable var2) {
         }
      }

   }
}
