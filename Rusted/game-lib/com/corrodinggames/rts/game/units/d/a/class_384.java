package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.a.e
class class_384 extends class_382 {
   // $FF: renamed from: b com.corrodinggames.rts.game.units.d.a.b
   // $FF: synthetic field
   final class_51 field_3052;

   strictfp class_384(class_51 var1) {
      super(var1);
      this.field_3052 = var1;
   }

   // $FF: renamed from: c () java.lang.String
   public strictfp String method_2415() {
      return class_51.field_389;
   }

   // $FF: renamed from: d () int
   public strictfp int method_2423() {
      return class_469.field_4038.method_130() + class_51.field_403.method_1046();
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_2413(int var1) {
      return class_51.method_538();
   }

   // $FF: renamed from: a () float
   strictfp float method_2408() {
      return 155.0F;
   }

   // $FF: renamed from: a (int) float
   public strictfp float method_2409(int var1) {
      return 5.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_2410(int var1) {
      return 3.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_2412(class_39 var1, int var2) {
      PointF var3 = this.c(var2);
      class_97 var4 = class_97.method_697(this.field_3052, var3.field_2406, var3.field_2407);
      var4.field_839 = 60.0F;
      var4.field_849 = 3.0F + (float)(this.field_3052.field_383 * 13) % 2.0F;
      var4.field_926 = false;
      var4.field_859 = true;
      var4.field_895 = Color.method_3077(105, 255, 255, 255);
      var4.field_867 = 3;
      var4.field_850 = 1.3F;
      PointF var5 = var1.method_310(var3.field_2406, var3.field_2407, var4.field_849, var4.field_839, this.method_2408());
      var4.field_901 = true;
      var4.field_843 = true;
      var4.field_844 = var5.field_2406;
      var4.field_845 = var5.field_2407;
      var4.field_844 += (float)(-15 + this.field_3052.field_383 * 13 % 30);
      var4.field_845 += (float)(-15 + (63 + this.field_3052.field_383 * 33) % 30);
      var4.df = 3;
      var4.field_878 = this.method_2410(var2);
      var4.field_879 = 65.0F;
      var4.field_880 = true;
      var4.field_855 = true;
      class_236 var6 = class_236.method_1549();
      ++this.field_3052.field_383;
      if (this.field_3052.field_383 > 10) {
         this.field_3052.field_383 = 0;
         var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.field_3052.dj, this.field_3052.bV[var2].field_4608);
      }

   }

   // $FF: renamed from: b () int
   public strictfp int method_2414() {
      return 2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.a.c) void
   public strictfp void method_2416(class_382 var1) {
      class_51 var10000 = this.field_3052;
      var10000.bJ += 900.0F;
      var10000 = this.field_3052;
      var10000.bI += 900.0F;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_2418(float var1) {
      if (this.field_3052.bI < this.field_3052.bJ) {
         class_51 var10000 = this.field_3052;
         var10000.bI += 0.15F * var1;
         if (this.field_3052.bI > this.field_3052.bJ) {
            this.field_3052.bI = this.field_3052.bJ;
         }
      }

   }

   // $FF: renamed from: e (int) float
   public strictfp float method_2419(int var1) {
      return 11.0F;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_2420(int var1) {
      return 2.0F;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_2421(int var1) {
      return 18.0F;
   }

   // $FF: renamed from: h (int) float
   public strictfp float method_2422(int var1) {
      return 0.0F;
   }
}
