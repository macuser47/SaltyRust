package com.corrodinggames.rts.game.units.b;

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
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.b.a
public class class_74 extends class_73 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_618 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_619 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_620 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_621 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_622 = new class_306[10];
   // $FF: renamed from: f float
   float field_623;
   // $FF: renamed from: g android.graphics.Rect
   Rect field_624 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_624() {
      return class_469.field_4045;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_625() {
      class_236 var0 = class_236.method_1549();
      field_619 = var0.field_1935.method_60(R$drawable.ship);
      field_620 = var0.field_1935.method_60(R$drawable.ship_shadow);
      field_618 = var0.field_1935.method_60(R$drawable.ship_dead);
      field_622 = class_107.method_948(field_619);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_618 : field_622[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_620;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_621;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_618;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_74(boolean var1) {
      super(var1);
      this.J(24);
      this.K(22);
      this.by = 11.0F;
      this.bz = this.by + 0.0F;
      this.bJ = 250.0F;
      this.bI = this.bJ;
      this.G = field_619;
      this.H = field_620;
      this.dj = 0.0F;
      this.field_623 = 0.18F;
      this.I(5);
   }

   // $FF: renamed from: C () boolean
   public strictfp boolean method_431() {
      return true;
   }

   // $FF: renamed from: i () boolean
   public strictfp boolean method_280() {
      return true;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (!this.bi) {
         this.dj = class_296.method_2021(this.dj, 20.0F, 0.3F * var1);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_874 = 30.0F;
      var4.field_842 = var1;
      var4.field_839 = 75.0F;
      var4.field_849 = 6.0F;
      var4.field_850 = 2.0F;
      var4.field_851 = 4.0F;
      var4.field_895 = Color.method_3077(250, 74, 232, 255);
      class_236 var6 = class_236.method_1549();
      class_390 var7 = var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      if (var7 != null) {
         var7.field_3178 = 10;
      }

      float var8 = 1.0F + class_296.method_2033(-0.1F, 0.1F);
      var6.field_1933.method_3324(class_525.field_4766, 0.14F, var8, var3.field_2406, var3.field_2407);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 170.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 40.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return this.dj < 15.0F ? 0.0F : 2.4F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 3.7F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.4F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 3.7F;
   }

   // $FF: renamed from: aM () boolean
   public strictfp boolean method_473() {
      return false;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return 0.4F;
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return false;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 10.0F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.1F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.16F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return true;
   }

   // $FF: renamed from: T () boolean
   public strictfp boolean method_380() {
      return true;
   }

   // $FF: renamed from: U () boolean
   public strictfp boolean method_381() {
      return false;
   }

   // $FF: renamed from: aI () boolean
   public strictfp boolean method_468() {
      return true;
   }

   // $FF: renamed from: aJ () boolean
   public strictfp boolean method_469() {
      return true;
   }

   // $FF: renamed from: d (boolean) float
   public strictfp float method_227(boolean var1) {
      return this.bV[0].field_4608 + 90.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_624();
   }
}
