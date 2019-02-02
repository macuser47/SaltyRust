package com.corrodinggames.rts.game.units.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.d
public class class_85 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_746 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_747 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_748 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_749 = new class_306[10];
   // $FF: renamed from: e int
   int field_750;
   // $FF: renamed from: f float
   float field_751;
   // $FF: renamed from: g android.graphics.Rect
   Rect field_752 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_659() {
      return class_469.field_4064;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_660() {
      class_236 var0 = class_236.method_1549();
      class_306 var1 = var0.field_1935.method_60(R$drawable.experimental_tank);
      field_749 = class_107.method_948(var1);
      field_746 = var0.field_1935.method_60(R$drawable.experimental_tank_dead);
      field_747 = var0.field_1935.method_60(R$drawable.experimental_tank_turret);
      field_748 = a(var1, var1.method_2128() / 2, var1.method_2127());
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_746 : field_749[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_748;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && this.dj > -2.0F && this.bB >= 1.0F;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 4.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 4.0F;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return this.method_661(var1) ? null : field_747;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      this.a(class_282.field_2425);
      this.G = field_746;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_85(boolean var1) {
      super(var1);
      this.a(field_749[7], 2);
      this.by = 37.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 6000.0F;
      this.bI = this.bJ;
      this.G = field_749[7];
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (!this.bi) {
         if (this.bA != 0.0F) {
            this.I(2);
         } else {
            this.I(4);
         }
      }

      if (this.bU) {
         this.field_751 += var1;
         if (this.field_751 > 5.0F) {
            this.field_751 = 0.0F;
            this.field_750 = 1 - this.field_750;
         }
      }

   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 80000.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3;
      class_97 var4;
      if (!this.method_661(var2)) {
         var3 = this.w(var2);
         var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
         PointF var5 = this.B(var2);
         var4.field_862 = var5.field_2406;
         var4.field_863 = var5.field_2407;
         var4.field_895 = Color.method_3077(255, 247, 212, 129);
         var4.field_839 = 120.0F;
         var4.field_849 = 5.0F;
         var4.field_842 = var1;
         var4.field_878 = 60.0F;
         var4.field_874 = 40.0F;
         var4.field_879 = 45.0F;
         var4.field_880 = true;
         var4.field_850 = 2.0F;
         var4.field_925 = true;
         var4.field_867 = 9;
         var4.field_850 = 1.0F;
         var4.df = this.df;
         class_236 var6 = class_236.method_1549();
         var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, 16745216);
         var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
         var6.field_1938.method_2472(var4, -1127220);
         var6.field_1933.method_3323(class_525.field_4763, 0.3F, this.dh, this.di);
      } else {
         var3 = this.w(var2);
         var3.method_1960(this.dh, this.di);
         var4 = class_97.method_697(this, this.dh, this.di);
         var4.field_895 = Color.method_3077(255, 230, 230, 50);
         var4.field_874 = 60.0F;
         var4.field_842 = var1;
         var4.field_839 = 190.0F;
         var4.field_849 = 3.0F;
         var4.field_847 = 6.0F;
         var4.field_915 = true;
         var4.field_916 = 10.0F;
         var4.field_917 = 15.0F;
         var4.field_920 = true;
         var4.field_925 = true;
         var4.field_914 = true;
         var4.df = this.df;
         class_236 var7 = class_236.method_1549();
         var7.field_1933.method_3323(class_525.field_4754, 0.2F, this.dh, this.di);
         var7.field_1938.method_2472(var4, -1118720);
         var7.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1127220);
      }

   }

   // $FF: renamed from: a (int, com.corrodinggames.rts.game.units.aa, boolean, boolean) boolean
   public strictfp boolean method_384(int var1, class_39 var2, boolean var3, boolean var4) {
      if (!var3 && var4 && !this.e(var2)) {
         return false;
      } else {
         if (this.method_661(var1)) {
            if (!var2.method_280()) {
               return false;
            }
         } else if (var2.method_280()) {
            return false;
         }

         return true;
      }
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 310.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      if (this.method_661(var1)) {
         var1 -= 4;
      }

      return (float)(110 - var1 * 20);
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      if (this.method_661(var1)) {
         var1 -= 4;
      }

      return (float)(var1 * 20);
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.4F;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return 1.0F;
   }

   // $FF: renamed from: aH () int
   public strictfp int method_465() {
      return 1;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 0.8F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.04F;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return this.method_661(var1) ? 1.0F : 0.08F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return this.method_661(var1) ? 4.5F : 2.5F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.03F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.08F;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public strictfp Rect method_299(boolean var1) {
      if (this.bi && !var1) {
         return super.a_(var1);
      } else if (var1) {
         return super.a_(var1);
      } else {
         byte var2 = 0;
         byte var3 = 0;
         int var4 = var2 + this.field_750 * this.dl;
         this.field_752.method_1911(var4, var3, var4 + this.dl, var3 + this.dm);
         return this.field_752;
      }
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         class_205.method_1364(this);
         return true;
      }
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return true;
   }

   // $FF: renamed from: T () boolean
   public strictfp boolean method_380() {
      return true;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 20.0F;
   }

   // $FF: renamed from: x (int) android.graphics.PointF
   public strictfp PointF method_479(int var1) {
      PointF var2 = super.x(var1);
      float var3 = var2.field_2406;
      float var4 = var2.field_2407;
      if (!this.method_661(var1)) {
         if (var1 <= 1) {
            var3 += class_296.method_2099(this.bv) * 5.0F;
            var4 += class_296.method_2098(this.bv) * 5.0F;
         }

         float var5 = (float)(-45 + 90 * var1);
         var3 += class_296.method_2099(this.bv + var5) * 18.0F;
         var4 += class_296.method_2098(this.bv + var5) * 18.0F;
      }

      aH.method_1960(var3, var4);
      return aH;
   }

   // $FF: renamed from: H (int) boolean
   public strictfp boolean method_661(int var1) {
      return var1 >= 4;
   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return 6;
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      super.e(var1);
      float var2 = this.method_439();
      class_205.method_1355(this, var2);
   }

   // $FF: renamed from: bG () int
   public strictfp int method_287() {
      return 5;
   }

   // $FF: renamed from: ca () boolean
   public strictfp boolean method_329() {
      return true;
   }

   // $FF: renamed from: y (int) float
   public strictfp float method_480(int var1) {
      return -2.0F;
   }

   // $FF: renamed from: z (int) float
   public strictfp float method_481(int var1) {
      return 4.0F;
   }

   // $FF: renamed from: A (int) float
   public strictfp float method_482(int var1) {
      return 12.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_659();
   }
}
