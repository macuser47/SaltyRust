package com.corrodinggames.rts.gameFramework.utility;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.corrodinggames.rts.a.class_353;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.j
public class class_196 extends InputStream {
   // $FF: renamed from: a java.io.InputStream
   InputStream field_1656;
   // $FF: renamed from: b java.lang.String
   String field_1657;
   // $FF: renamed from: c java.lang.String
   String field_1658;

   // $FF: renamed from: a () java.io.FileDescriptor
   public FileDescriptor method_1312() {
      if (this.field_1656 instanceof FileInputStream) {
         FileInputStream var4 = (FileInputStream)this.field_1656;
         return var4.getFD();
      } else if (!class_236.method_1654() && this.field_1658 != null) {
         Context var1 = class_353.method_2295();
         AssetManager var2 = var1.method_1853();
         AssetFileDescriptor var3 = var2.method_3281(this.field_1658);
         return var3.getFileDescriptor();
      } else {
         throw new RuntimeException("AssetInputStream: unexpected stream for: " + this.field_1657);
      }
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.utility.j
   public static class_196 method_1313(String var0) {
      class_196 var1 = new class_196();
      var1.field_1658 = var0;
      var1.field_1657 = "assets/" + var0;
      Context var2 = class_353.method_2295();
      AssetManager var3 = var2.method_1853();

      try {
         var1.field_1656 = var3.method_3279(var1.field_1658);
         return var1;
      } catch (IOException var5) {
         class_236.method_1591("Could not find:" + var1.field_1657);
         return null;
      }
   }

   private class_196() {
   }

   public class_196(FileInputStream var1, String var2) {
      this.field_1656 = var1;
      this.field_1657 = var2;
   }

   // $FF: renamed from: b () long
   public long method_1314() {
      if (!class_236.method_1654()) {
         return -1L;
      } else if (this.field_1657 == null) {
         return -2L;
      } else {
         File var1 = new File(this.field_1657);
         return var1.lastModified();
      }
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1315() {
      return this.field_1657;
   }

   public int available() {
      return this.field_1656.available();
   }

   public void close() {
      this.field_1656.close();
   }

   public boolean equals(Object var1) {
      return this.field_1656.equals(var1);
   }

   public int hashCode() {
      return this.field_1656.hashCode();
   }

   public void mark(int var1) {
      this.field_1656.mark(var1);
   }

   public boolean markSupported() {
      return this.field_1656.markSupported();
   }

   public int read() {
      return this.field_1656.read();
   }

   public int read(byte[] var1, int var2, int var3) {
      return this.field_1656.read(var1, var2, var3);
   }

   public int read(byte[] var1) {
      return this.field_1656.read(var1);
   }

   public void reset() {
      this.field_1656.reset();
   }

   public long skip(long var1) {
      return this.field_1656.skip(var1);
   }

   public String toString() {
      return this.field_1656.toString();
   }
}
