package com.corrodinggames.rts.game.units.d.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.a.c
abstract class class_382 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.d.a.b
   // $FF: synthetic field
   final class_51 field_3050;

   strictfp class_382(class_51 var1) {
      this.field_3050 = var1;
   }

   // $FF: renamed from: a () float
   abstract float method_2408();

   // $FF: renamed from: a (int) float
   public abstract float method_2409(int var1);

   // $FF: renamed from: b (int) float
   public abstract float method_2410(int var1);

   // $FF: renamed from: c (int) android.graphics.PointF
   public strictfp PointF method_2411(int var1) {
      return class_51.method_531(this.field_3050, var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public abstract void method_2412(class_39 var1, int var2);

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public abstract class_306 method_2413(int var1);

   // $FF: renamed from: b () int
   public abstract int method_2414();

   // $FF: renamed from: c () java.lang.String
   public abstract String method_2415();

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.a.c) void
   public abstract void method_2416(class_382 var1);

   // $FF: renamed from: a (java.lang.String) boolean
   public strictfp boolean method_2417(String var1) {
      return this.method_2415().equals(var1);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_2418(float var1) {
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_2419(int var1) {
      return 5.0F;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_2420(int var1) {
      return 0.5F;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_2421(int var1) {
      return 23.0F;
   }

   // $FF: renamed from: h (int) float
   public strictfp float method_2422(int var1) {
      return -1.0F;
   }

   // $FF: renamed from: d () int
   public abstract int method_2423();
}
