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
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.b.e
public class class_77 extends class_73 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_657 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_658 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_659 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_660 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_661 = new class_306[10];
   // $FF: renamed from: f float
   float field_662 = 0.0F;
   // $FF: renamed from: g android.graphics.Rect
   Rect field_663 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_639() {
      return class_469.field_4046;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_640() {
      class_236 var0 = class_236.method_1549();
      field_658 = var0.field_1935.method_60(R$drawable.gunship);
      field_659 = var0.field_1935.method_60(R$drawable.gunship_shadow);
      field_657 = var0.field_1935.method_60(R$drawable.gunship_dead);
      field_661 = class_107.method_948(field_658);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_657 : field_661[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_659;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_657;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_77(boolean var1) {
      super(var1);
      this.J(25);
      this.K(35);
      this.by = 15.0F;
      this.bz = this.by + 0.0F;
      this.bJ = 260.0F;
      this.bI = this.bJ;
      this.G = field_658;
      this.H = field_659;
      this.dj = 0.0F;
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
         this.field_662 += 2.0F * var1;
         if (this.field_662 > 360.0F) {
            this.field_662 -= 360.0F;
         }

         this.dj = class_296.method_2021(this.dj, 20.0F + class_296.method_2098(this.field_662) * 1.5F, 0.1F * var1);
      }
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      float var2 = this.method_474(var1);
      float var3 = this.bv;
      float var4 = this.dh + class_296.method_2099(var3) * var2;
      float var5 = this.di + class_296.method_2098(var3) * var2;
      aG.method_1960(var4, var5);
      return aG;
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 35.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.method_478(var2);
      class_97 var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_895 = Color.method_3077(255, 150, 230, 40);
      var4.field_874 = this.method_442(var2);
      var4.field_842 = var1;
      var4.field_839 = 80.0F;
      var4.field_849 = 4.0F;
      var4.field_850 = 2.0F;
      class_236 var6 = class_236.method_1549();
      var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1127220);
      var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      var6.field_1933.method_3323(class_525.field_4762, 0.3F, this.dh, this.di);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 140.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 40.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return this.dj < 15.0F ? 0.0F : 1.4F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 4.0F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.4F;
   }

   // $FF: renamed from: aI () boolean
   public strictfp boolean method_468() {
      return true;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return false;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.2F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
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

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_639();
   }
}
