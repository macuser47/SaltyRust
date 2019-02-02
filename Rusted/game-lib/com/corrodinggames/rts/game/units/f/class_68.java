package com.corrodinggames.rts.game.units.f;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_391;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.units.f.a
public class class_68 extends class_67 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_574 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_575 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_576 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_577 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_578 = new class_306[10];
   // $FF: renamed from: f android.graphics.Rect
   Rect field_579 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_611() {
      return class_469.field_4053;
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 9000.0F;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_612() {
      class_236 var0 = class_236.method_1549();
      field_575 = var0.field_1935.method_60(R$drawable.battle_ship_t2);
      field_574 = var0.field_1935.method_60(R$drawable.battle_ship_t2_dead);
      field_576 = var0.field_1935.method_60(R$drawable.battle_ship_t2_turret);
      field_578 = class_107.method_948(field_575);
      field_577 = a(field_575, field_575.method_2128(), field_575.method_2127());
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_574 : field_578[this.bk.method_963()];
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_576;
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_577;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && this.dj > -2.0F;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 3.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 3.0F;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_574;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_68(boolean var1) {
      super(var1);
      this.b(field_575);
      this.by = 20.0F;
      this.bz = this.by;
      this.bJ = 1200.0F;
      this.bI = this.bJ;
      this.G = field_575;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 65.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_874 = this.method_442(var2);
      var4.field_842 = var1;
      var4.field_839 = 80.0F;
      var4.field_850 = 2.0F;
      var4.field_849 = 4.0F;
      var4.field_872 = true;
      var4.field_895 = Color.method_3077(255, 180, 180, 0);
      var4.field_925 = true;
      class_236 var6 = class_236.method_1549();
      var6.field_1933.method_3323(class_525.field_4759, 0.2F, var3.field_2406, var3.field_2407);
      var6.field_1938.method_2472(var4, -1118720);
      class_390 var7 = var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      if (var7 != null) {
         class_391.method_2471(var7, this);
      }

      var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1118720);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 240.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.8F;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return 1.0F;
   }

   // $FF: renamed from: v (int) float
   public strictfp float method_476(int var1) {
      if (this.bx && (double)this.method_460() > 0.95D) {
         return var1 == 0 ? this.bv + 140.0F : this.bv - 140.0F;
      } else {
         return this.bv;
      }
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.8F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.08F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 2.5F;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return 0.08F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.03F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
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
      return false;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 15.0F;
   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return 2;
   }

   // $FF: renamed from: x (int) android.graphics.PointF
   public strictfp PointF method_479(int var1) {
      PointF var2 = super.x(var1);
      float var3 = var2.field_2406;
      float var4 = var2.field_2407;
      float var5;
      if (var1 == 0) {
         var5 = 22.0F;
      } else {
         var5 = 4.0F;
      }

      var3 += class_296.method_2099(this.bv) * var5;
      var4 += class_296.method_2098(this.bv) * var5;
      aH.method_1960(var3, var4);
      return aH;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return (float)(120 - var1 * 28);
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return (float)(var1 * 30);
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      super.e(var1);
      float var2 = this.method_439();
      class_205.method_1355(this, var2);
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
      return this.method_611();
   }
}
