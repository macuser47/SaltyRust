package com.corrodinggames.rts.game.units.e;

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
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.m
public class class_94 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_814 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_815 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_816 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_817 = new class_306[10];
   // $FF: renamed from: e android.graphics.Rect
   Rect field_818 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_686() {
      return class_469.field_4049;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_687() {
      class_236 var0 = class_236.method_1549();
      field_815 = var0.field_1935.method_60(R$drawable.mega_tank);
      field_814 = var0.field_1935.method_60(R$drawable.mega_tank_dead);
      field_816 = var0.field_1935.method_60(R$drawable.mega_tank_turret);
      field_817 = class_107.method_948(field_815);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_814 : field_817[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_816;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_814;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4756, 0.8F, this.dh, this.di);
      this.aQ();
      return true;
   }

   public strictfp class_94(boolean var1) {
      super(var1);
      this.J(20);
      this.K(25);
      this.by = 12.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 550.0F;
      this.bI = this.bJ;
      this.G = field_815;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 7000.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      if (!var1.method_280()) {
         PointF var3 = this.w(var2);
         class_97 var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
         var4.field_895 = Color.method_3077(255, 150, 230, 40);
         var4.field_874 = 50.0F;
         var4.field_842 = var1;
         var4.field_839 = 60.0F;
         var4.field_849 = 3.0F;
         var4.field_850 = 2.0F;
         var4.field_925 = true;
         class_236 var5 = class_236.method_1549();
         var5.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1127220);
         var5.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
         var5.field_1933.method_3323(class_525.field_4762, 0.3F, this.dh, this.di);
      } else {
         class_97 var6 = class_97.method_697(this, this.dh, this.di);
         var6.field_895 = Color.method_3077(255, 230, 230, 50);
         var6.field_874 = 40.0F;
         var6.field_842 = var1;
         var6.field_839 = 190.0F;
         var6.field_849 = 4.0F;
         var6.field_915 = true;
         var6.field_916 = 10.0F;
         var6.field_917 = 15.0F;
         var6.field_920 = true;
         var6.field_925 = true;
         class_236 var7 = class_236.method_1549();
         var7.field_1933.method_3323(class_525.field_4754, 0.2F, this.dh, this.di);
      }

   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 140.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 70.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.8F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.2F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 2.0F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.05F;
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
      return true;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 12.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_686();
   }
}
