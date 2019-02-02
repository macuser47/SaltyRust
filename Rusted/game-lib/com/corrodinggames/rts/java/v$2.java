package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

class v$2 implements Runnable {
   // $FF: renamed from: a java.lang.String
   // $FF: synthetic field
   final String field_3080;
   // $FF: renamed from: b java.io.ByteArrayOutputStream
   // $FF: synthetic field
   final ByteArrayOutputStream field_3081;
   // $FF: renamed from: c com.corrodinggames.rts.java.v
   // $FF: synthetic field
   final class_332 field_3082;

   v$2(class_332 var1, String var2, ByteArrayOutputStream var3) {
      this.field_3082 = var1;
      this.field_3080 = var2;
      this.field_3081 = var3;
   }

   public void run() {
      try {
         FileOutputStream var1 = new FileOutputStream("screenshots" + File.separator + this.field_3080);

         try {
            var1.write(this.field_3081.toByteArray());
         } finally {
            var1.close();
         }

         class_236.method_1591("Screenshot saved: " + this.field_3080);
      } catch (Exception var6) {
         var6.printStackTrace();
         class_236.method_1652("Failed to write screenshot:" + var6.getMessage());
      }

   }
}
