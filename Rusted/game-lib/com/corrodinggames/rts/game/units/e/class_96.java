package com.corrodinggames.rts.game.units.e;

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

// $FF: renamed from: com.corrodinggames.rts.game.units.e.o
public class class_96 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_828 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_829 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_830 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_831 = new class_306[10];
   // $FF: renamed from: e android.graphics.Rect
   Rect field_832 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_691() {
      return class_469.field_4054;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_692() {
      class_236 var0 = class_236.method_1549();
      field_829 = var0.field_1935.method_60(R$drawable.tank2);
      field_828 = var0.field_1935.method_60(R$drawable.tank2_dead);
      field_830 = var0.field_1935.method_60(R$drawable.tank2_turret);
      field_831 = class_107.method_948(field_829);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_828 : field_831[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_830;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_828;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4756, 0.8F, this.dh, this.di);
      this.aQ();
      return true;
   }

   public strictfp class_96(boolean var1) {
      super(var1);
      this.J(16);
      this.K(30);
      this.by = 11.0F;
      this.bz = this.by + 2.0F;
      this.bJ = 350.0F;
      this.bI = this.bJ;
      this.G = field_829;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
      var4.field_874 = 35.0F;
      var4.field_842 = var1;
      var4.field_839 = 60.0F;
      var4.field_849 = 3.0F;
      class_236 var5 = class_236.method_1549();
      var5.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1127220);
      var5.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      var5.field_1933.method_3323(class_525.field_4758, 0.3F, var3.field_2406, var3.field_2407);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 150.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 70.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 1.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.9F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 3.0F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return super.c(var1);
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.07F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.12F;
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
      return 10.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_691();
   }
}
