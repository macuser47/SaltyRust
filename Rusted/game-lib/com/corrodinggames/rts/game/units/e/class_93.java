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
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.l
public class class_93 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_806 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_807 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_808 = new class_306[10];
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_809 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_810 = null;
   // $FF: renamed from: f int
   int field_811;
   // $FF: renamed from: g float
   float field_812;
   // $FF: renamed from: h android.graphics.Rect
   Rect field_813 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_684() {
      return class_469.field_4063;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_685() {
      class_236 var0 = class_236.method_1549();
      class_306 var1 = var0.field_1935.method_60(R$drawable.mammoth_tank);
      field_808 = class_107.method_948(var1);
      field_806 = var0.field_1935.method_60(R$drawable.mammoth_tank_dead);
      field_807 = var0.field_1935.method_60(R$drawable.mammoth_tank_turret);
      field_810 = var0.field_1935.method_60(R$drawable.lighting_charge);
      field_809 = a(var1, var1.method_2128() / 2, var1.method_2127());
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_806 : field_808[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_809;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_807;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && this.dj > -2.0F && !this.bi;
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
      this.G = field_806;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2425);
      return true;
   }

   public strictfp class_93(boolean var1) {
      super(var1);
      this.a(field_808[7], 2);
      this.by = 21.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 2900.0F;
      this.bI = this.bJ;
      this.G = field_808[7];
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (this.bU) {
         this.field_812 += var1;
         if (this.field_812 > 3.0F) {
            this.field_812 = 0.0F;
            this.field_811 = 1 - this.field_811;
         }
      }

   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 14000.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
      var4.field_895 = Color.method_3077(255, 247, 212, 129);
      var4.field_874 = 260.0F;
      var4.field_842 = var1;
      var4.field_839 = 20.0F;
      var4.field_849 = 4.0F;
      var4.field_850 = 2.0F;
      var4.field_925 = true;
      var4.field_853 = true;
      var4.field_864 = true;
      var4.field_888 = 0.5F;
      var4.field_890 = 1.0F;
      var4.field_891 = 0.0F;
      class_236 var5 = class_236.method_1549();
      var5.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1118482);
      var5.field_1933.method_3323(class_525.field_4765, 0.2F, this.dh, this.di);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 210.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 140.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.5F;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return 1.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.0F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.5F;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return 0.08F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 2.5F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.04F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.08F;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public strictfp Rect method_299(boolean var1) {
      return this.bi && !var1 ? super.a_(var1) : super.a(var1, this.field_811);
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         class_205.method_1364(this);
         float var2 = this.bV[0].field_4612 / this.method_445(0);
         class_205.method_1365(this, field_810, var2, 0);
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
      return 22.0F;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 60.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_684();
   }
}
