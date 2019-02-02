package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.ak
public class class_407 {
   // $FF: renamed from: a java.io.BufferedOutputStream
   public BufferedOutputStream field_3315;
   // $FF: renamed from: b java.lang.String
   public String field_3316;
   // $FF: renamed from: c java.io.ByteArrayOutputStream
   public ByteArrayOutputStream field_3317 = new ByteArrayOutputStream();
   // $FF: renamed from: d java.io.PrintStream
   public PrintStream field_3318;
   // $FF: renamed from: e boolean
   public boolean field_3319 = false;

   // $FF: renamed from: a () void
   public strictfp void method_2569() {
      this.field_3318.flush();
      if (this.field_3315 != null) {
         this.field_3315.flush();
      }

   }

   // $FF: renamed from: b () void
   public strictfp void method_2570() {
      if (!this.field_3319) {
         this.field_3318.close();
      } else {
         class_236.method_1595("TODO: Cannot yet close wrapped stream");
      }

   }

   public strictfp class_407(boolean var1) {
      Object var2;
      if (var1) {
         this.field_3315 = new BufferedOutputStream(this.field_3317);
         var2 = this.field_3315;
      } else {
         var2 = this.field_3317;
      }

      this.field_3318 = new PrintStream((OutputStream)var2);
   }
}
