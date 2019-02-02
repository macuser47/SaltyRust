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
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.f.c
public class class_70 extends class_67 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_589 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_590 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_591 = new class_306[10];
   // $FF: renamed from: d android.graphics.Rect
   Rect field_592 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_616() {
      return class_469.field_4048;
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 1500.0F;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_617() {
      class_236 var0 = class_236.method_1549();
      field_590 = var0.field_1935.method_60(R$drawable.gun_boat);
      field_589 = var0.field_1935.method_60(R$drawable.gun_boat_dead);
      field_591 = class_107.method_948(field_590);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_589 : field_591[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_589;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_70(boolean var1) {
      super(var1);
      this.J(15);
      this.K(27);
      this.by = 12.0F;
      this.bz = this.by - 2.0F;
      this.bJ = 170.0F;
      this.bI = this.bJ;
      this.G = field_590;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 12.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.dj = this.dj;
      var4.field_874 = this.method_442(var2);
      var4.field_842 = var1;
      var4.field_839 = 30.0F;
      var4.field_849 = 8.0F;
      var4.field_872 = false;
      var4.field_895 = Color.method_3077(255, 180, 180, 0);
      class_236 var6 = class_236.method_1549();
      var6.field_1933.method_3323(class_525.field_4760, 0.2F, var3.field_2406, var3.field_2407);
      var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1118720);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 120.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 60.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 1.5F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 2.8F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.3F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.07F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.2F;
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
      return false;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_616();
   }
}
