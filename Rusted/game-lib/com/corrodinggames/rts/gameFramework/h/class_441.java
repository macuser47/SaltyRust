package com.corrodinggames.rts.gameFramework.h;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.p
public class class_441 extends Paint {
   // $FF: renamed from: r boolean
   boolean field_3752 = false;

   // $FF: renamed from: n () void
   public void method_2824() {
      this.field_3752 = true;
   }

   // $FF: renamed from: c (float) void
   public void method_2825(float var1) {
      super.method_2804(var1);
   }

   // $FF: renamed from: b (float) void
   public void method_2804(float var1) {
      if (this.field_3752) {
         class_236.method_1588("UniquePaint changed when locked down:");
         class_236.method_1588("from:" + this.k() + " to: " + var1);
         class_236.method_1594();
      }

      super.method_2804(var1);
   }

   // $FF: renamed from: a (android.graphics.Typeface) android.graphics.Typeface
   public Typeface method_2799(Typeface var1) {
      if (this.field_3752) {
         class_236.method_1588("UniquePaint changed when locked down:");
         class_236.method_1594();
      }

      return super.method_2799(var1);
   }

   // $FF: renamed from: b (android.graphics.Paint) void
   public static void method_2826(Paint var0) {
      ((class_441)var0).method_2824();
   }
}
