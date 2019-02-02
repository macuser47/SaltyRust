package com.corrodinggames.rts.game.units.e;

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

// $FF: renamed from: com.corrodinggames.rts.game.units.e.n
public class class_95 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_819 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_820 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_821 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_822 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_823 = new class_306[10];
   // $FF: renamed from: f int
   int field_824;
   // $FF: renamed from: g float
   float field_825;
   // $FF: renamed from: h float
   float field_826;
   // $FF: renamed from: i android.graphics.Rect
   Rect field_827 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_688() {
      return class_469.field_4041;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_689() {
      class_236 var0 = class_236.method_1549();
      field_820 = var0.field_1935.method_60(R$drawable.tank2);
      field_819 = var0.field_1935.method_60(R$drawable.tank2_dead);
      field_821 = var0.field_1935.method_60(R$drawable.tank2_turret);
      field_822 = var0.field_1935.method_60(R$drawable.tank2_shadow);
      field_823 = class_107.method_948(field_820);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_819 : field_823[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_822;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && !this.bi;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 3.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 3.0F;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_821;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      this.G = field_819;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2422);
      return true;
   }

   public strictfp class_95(boolean var1) {
      super(var1);
      this.a(field_820, 3);
      this.by = 11.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 210.0F;
      this.bI = this.bJ;
      this.G = field_820;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (!this.bi) {
         if (this.bu != 0.0F) {
            this.field_825 += var1;
            if (this.field_825 > 1.0F) {
               this.field_825 = 0.0F;
               ++this.field_824;
               if (this.field_824 > 2) {
                  this.field_824 = 0;
               }
            }

            if (this.bu > 0.0F && this.de) {
               this.field_826 += var1;
               if (this.field_826 > 9.0F) {
                  this.field_826 = 0.0F;
                  this.method_690();
               }
            }
         }

      }
   }

   // $FF: renamed from: D () void
   public strictfp void method_690() {
      class_236 var1 = class_236.method_1549();

      for(int var2 = 0; var2 <= 1; ++var2) {
         float var3 = (float)(var2 == 0 ? -20 : 20);
         float var4 = this.dh + class_296.method_2099(this.bv + 180.0F + var3) * this.by + 3.0F;
         float var5 = this.di + class_296.method_2098(this.bv + 180.0F + var3) * this.by + 3.0F;
         var1.field_1938.method_2470(var4, var5, this.dj, this.bv + 180.0F, 0);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_874 = 30.0F;
      var4.field_842 = var1;
      var4.field_839 = 60.0F;
      var4.field_849 = 3.0F;
      var4.field_867 = 1;
      var4.field_850 = 1.0F;
      class_236 var6 = class_236.method_1549();
      var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1127220);
      var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      float var7 = 1.0F + class_296.method_2033(-0.07F, 0.07F);
      var6.field_1933.method_3324(class_525.field_4758, 0.3F, var7, var3.field_2406, var3.field_2407);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 130.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 75.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 1.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 4.1F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 4.0F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.25F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         class_205.method_1364(this);
         if (!this.bi) {
         }

         return true;
      }
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.07F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.17F;
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
      return 20.0F;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public strictfp Rect method_299(boolean var1) {
      if (var1) {
         return super.a_(var1);
      } else {
         return this.bi ? super.a_(var1) : super.a(var1, this.field_824);
      }
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_688();
   }
}
