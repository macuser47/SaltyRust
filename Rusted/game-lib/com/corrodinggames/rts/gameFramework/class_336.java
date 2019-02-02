package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.h.class_441;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.m
class class_336 {
   // $FF: renamed from: a float
   float field_2686;
   // $FF: renamed from: b android.graphics.Paint
   Paint field_2687;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.k
   // $FF: synthetic field
   final class_236 field_2688;

   strictfp class_336(class_236 var1) {
      this.field_2688 = var1;
   }

   // $FF: renamed from: a () void
   strictfp void method_2242() {
      float var1 = (float)this.field_2688.method_1598(this.field_2686);
      if (this.field_2687.method_2803() != var1) {
         if (this.field_2687 instanceof class_441) {
            ((class_441)this.field_2687).method_2825(var1);
         } else {
            this.field_2687.method_2804(var1);
         }
      }

   }
}
