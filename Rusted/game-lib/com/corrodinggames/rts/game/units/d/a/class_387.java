package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.a.g
class class_387 extends class_382 {
   // $FF: renamed from: b com.corrodinggames.rts.game.units.d.a.b
   // $FF: synthetic field
   final class_51 field_3055;

   strictfp class_387(class_51 var1) {
      super(var1);
      this.field_3055 = var1;
   }

   // $FF: renamed from: c () java.lang.String
   public strictfp String method_2415() {
      return class_51.field_387;
   }

   // $FF: renamed from: d () int
   public strictfp int method_2423() {
      return class_469.field_4038.method_130() + class_51.field_400.method_1046() + class_51.field_401.method_1046();
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_2413(int var1) {
      return class_51.method_535();
   }

   // $FF: renamed from: a () float
   strictfp float method_2408() {
      return 320.0F;
   }

   // $FF: renamed from: a (int) float
   public strictfp float method_2409(int var1) {
      return 13.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_2410(int var1) {
      return 40.0F;
   }

   // $FF: renamed from: c (int) android.graphics.PointF
   public strictfp PointF method_2411(int var1) {
      PointF var2 = class_51.method_536(this.field_3055, var1);
      float var3 = this.field_3055.x() ? this.field_3055.bv : this.field_3055.bV[var1].field_4608;
      var3 += (float)(this.field_3055.field_383 == 1 ? -90 : 90);
      var2.field_2406 += class_296.method_2099(var3) * 4.0F;
      var2.field_2407 += class_296.method_2098(var3) * 4.0F;
      return var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_2412(class_39 var1, int var2) {
      PointF var3 = this.method_2411(var2);
      class_97 var4 = class_97.method_697(this.field_3055, var3.field_2406, var3.field_2407);
      PointF var5 = this.field_3055.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_842 = var1;
      var4.field_839 = 60.0F;
      var4.field_849 = 9.0F;
      var4.field_895 = Color.method_3077(255, 180, 30, 30);
      var4.field_874 = this.method_2410(var2);
      var4.field_867 = 5;
      var4.field_850 = 1.0F;
      class_236 var6 = class_236.method_1549();
      var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.field_3055.dj, -1127220);
      var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.field_3055.dj, this.field_3055.bV[var2].field_4608);
      float var7 = 1.0F + class_296.method_2033(-0.07F, 0.07F);
      var6.field_1933.method_3324(class_525.field_4761, 0.15F, var7, var3.field_2406, var3.field_2407);
      this.field_3055.field_383 = this.field_3055.field_383 == 1 ? 0 : 1;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_2418(float var1) {
      if (this.field_3055.bI < this.field_3055.bJ) {
         class_51 var10000 = this.field_3055;
         var10000.bI += 0.1F * var1;
         if (this.field_3055.bI > this.field_3055.bJ) {
            this.field_3055.bI = this.field_3055.bJ;
         }
      }

      this.field_3055.method_528(var1);
   }

   // $FF: renamed from: b () int
   public strictfp int method_2414() {
      return 3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.a.c) void
   public strictfp void method_2416(class_382 var1) {
      class_51 var10000;
      if (!(var1 instanceof class_383)) {
         var10000 = this.field_3055;
         var10000.bJ += 400.0F;
         var10000 = this.field_3055;
         var10000.bI += 400.0F;
      }

      var10000 = this.field_3055;
      var10000.bJ += 2800.0F;
      var10000 = this.field_3055;
      var10000.bI += 2800.0F;
   }
}
