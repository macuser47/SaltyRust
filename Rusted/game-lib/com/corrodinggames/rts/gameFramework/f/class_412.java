package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.ag
public class class_412 {
   // $FF: renamed from: a java.util.zip.GZIPOutputStream
   public GZIPOutputStream field_3404;
   // $FF: renamed from: b java.io.BufferedOutputStream
   public BufferedOutputStream field_3405;
   // $FF: renamed from: c java.lang.String
   public String field_3406;
   // $FF: renamed from: d java.io.ByteArrayOutputStream
   public ByteArrayOutputStream field_3407 = new ByteArrayOutputStream();
   // $FF: renamed from: e java.io.DataOutputStream
   public DataOutputStream field_3408;
   // $FF: renamed from: f boolean
   public boolean field_3409 = false;

   // $FF: renamed from: a () void
   public strictfp void method_2634() {
      this.field_3408.flush();
      if (this.field_3405 != null) {
         this.field_3405.flush();
      }

      if (this.field_3404 != null) {
         this.field_3404.finish();
      }

   }

   // $FF: renamed from: b () void
   public strictfp void method_2635() {
      if (!this.field_3409) {
         this.field_3408.close();
      } else {
         class_236.method_1595("TODO: Cannot yet close wrapped stream");
      }

   }

   public strictfp class_412(boolean var1) {
      Object var2;
      if (var1) {
         this.field_3404 = new GZIPOutputStream(this.field_3407);
         this.field_3405 = new BufferedOutputStream(this.field_3404);
         var2 = this.field_3405;
      } else {
         var2 = this.field_3407;
      }

      this.field_3408 = new DataOutputStream((OutputStream)var2);
   }
}
