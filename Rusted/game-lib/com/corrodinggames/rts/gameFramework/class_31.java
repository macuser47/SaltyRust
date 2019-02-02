package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.y
public class class_31 extends class_30 {
   // $FF: renamed from: a int
   int field_14;
   // $FF: renamed from: b android.graphics.PointF
   PointF field_15 = new PointF();

   // $FF: renamed from: a () void
   public void method_149() {
      this.field_14 = 1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2541(0);
      var1.method_2541(this.field_14);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_150(class_463 var1) {
      var1.method_3011();
      this.field_14 = var1.method_3011();
   }

   // $FF: renamed from: a (float) void
   public void method_151(float var1) {
   }

   // $FF: renamed from: b () com.corrodinggames.rts.gameFramework.z
   public class_295 method_152() {
      class_295 var1 = new class_295(this);
      var1.field_2458 = this.field_14++;
      return var1;
   }

   // $FF: renamed from: c () com.corrodinggames.rts.gameFramework.z
   public class_295 method_153() {
      class_295 var1 = new class_295(this);
      var1.field_2458 = -1;
      var1.field_2455 = true;
      return var1;
   }
}
