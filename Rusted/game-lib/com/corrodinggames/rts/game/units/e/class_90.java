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

// $FF: renamed from: com.corrodinggames.rts.game.units.e.g
public class class_90 extends class_87 {
   // $FF: renamed from: a float
   float field_782 = 0.0F;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_783 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_784 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_785 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_786 = new class_306[10];
   // $FF: renamed from: f android.graphics.Rect
   Rect field_787 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_670() {
      return class_469.field_4042;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_671() {
      class_236 var0 = class_236.method_1549();
      field_784 = var0.field_1935.method_60(R$drawable.hover_tank);
      field_783 = var0.field_1935.method_60(R$drawable.hover_tank_dead);
      field_785 = var0.field_1935.method_60(R$drawable.hover_tank_shadow);
      field_786 = class_107.method_948(field_784);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_783 : field_786[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_785;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      this.G = field_783;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2422);
      return true;
   }

   public strictfp class_90(boolean var1) {
      super(var1);
      this.b(field_784);
      this.by = 7.0F;
      this.bz = this.by + 2.0F;
      this.bJ = 150.0F;
      this.bI = this.bJ;
      this.G = field_784;
      this.H = field_785;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (!this.bi && this.bj()) {
         this.field_782 += 3.0F * var1;
         if (this.field_782 > 360.0F) {
            this.field_782 -= 360.0F;
         }

         this.dj = class_296.method_2021(this.dj, 4.0F + class_296.method_2098(this.field_782) * 1.5F, 0.1F * var1);
      }
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 23.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_895 = Color.method_3077(255, 50, 230, 50);
      var4.field_874 = this.method_442(var2);
      var4.field_842 = var1;
      var4.field_839 = 85.0F;
      var4.field_849 = 2.0F;
      var4.field_847 = 6.0F;
      var4.field_848 = 0.2F;
      var4.field_867 = 6;
      var4.field_850 = 1.0F;
      class_236 var6 = class_236.method_1549();
      var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -14483678);
      var6.field_1938.method_2472(var4, -16716288);
      float var7 = 1.3F + class_296.method_2033(-0.07F, 0.07F);
      var6.field_1933.method_3324(class_525.field_4767, 0.3F, var7, var3.field_2406, var3.field_2407);
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return false;
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 140.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 90.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 1.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 180.0F;
   }

   // $FF: renamed from: g (float) void
   public strictfp void method_361(float var1) {
      this.bv += var1;
      if (this.bv > 180.0F) {
         this.bv -= 360.0F;
      }

      if (this.bv < -180.0F) {
         this.bv += 360.0F;
      }

   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.04F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.09F;
   }

   // $FF: renamed from: aI () boolean
   public strictfp boolean method_468() {
      return true;
   }

   // $FF: renamed from: aJ () boolean
   public strictfp boolean method_469() {
      return true;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 4.0F;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return 0.2F;
   }

   // $FF: renamed from: d (boolean) float
   public strictfp float method_227(boolean var1) {
      return this.bV[0].field_4608 + 90.0F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return super.c(var1);
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
      return 2.0F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.5F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_670();
   }
}
