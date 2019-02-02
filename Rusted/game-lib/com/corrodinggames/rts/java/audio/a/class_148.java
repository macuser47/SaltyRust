package com.corrodinggames.rts.java.audio.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.a
public class class_148 {
   // $FF: renamed from: a java.io.InputStream
   protected InputStream field_1391;
   // $FF: renamed from: b java.io.File
   protected File field_1392;
   // $FF: renamed from: c java.lang.String
   protected String field_1393;

   public class_148(String var1) {
      this.field_1392 = new File(var1);
      this.field_1393 = this.field_1392.getName();
   }

   public class_148(InputStream var1, String var2) {
      this.field_1391 = var1;
      this.field_1393 = var2;
      if (this.field_1391 == null) {
         throw new RuntimeException("inputStream==null");
      }
   }

   // $FF: renamed from: a () java.io.InputStream
   public InputStream method_1140() {
      if (this.field_1391 != null) {
         return this.field_1391;
      } else {
         try {
            return new FileInputStream(this.field_1392);
         } catch (FileNotFoundException var2) {
            throw new RuntimeException(var2);
         }
      }
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1141() {
      String var1 = this.field_1393;
      int var2 = var1.lastIndexOf(46);
      return var2 == -1 ? "" : var1.substring(var2 + 1);
   }
}
