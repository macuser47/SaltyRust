package com.corrodinggames.rts.game.units.e;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.f;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.c
public class class_88 extends class_87 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_765 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_766 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_767 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_768 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_769 = null;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_770 = new class_306[10];
   // $FF: renamed from: g int
   int field_771;
   // $FF: renamed from: h float
   float field_772 = 0.0F;
   // $FF: renamed from: i com.corrodinggames.rts.game.f
   class_97 field_773;
   // $FF: renamed from: j android.graphics.Rect
   Rect field_774 = new Rect();
   // $FF: renamed from: k android.graphics.Paint
   Paint field_775 = class_205.method_1363();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_666() {
      return class_469.field_4073;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_667() {
      class_236 var0 = class_236.method_1549();
      class_306 var1 = var0.field_1935.method_60(R$drawable.experimental_hovertank);
      field_770 = class_107.method_948(var1);
      field_765 = var0.field_1935.method_60(R$drawable.experimental_hovertank_dead);
      field_766 = var0.field_1935.method_60(R$drawable.experimental_hovertank_turret);
      field_767 = a(var1, var1.method_2128() / 1, var1.method_2127());
      field_768 = var0.field_1935.method_60(R$drawable.experimental_hovertank_shield);
      field_769 = var0.field_1935.method_60(R$drawable.shield_mid);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      if (this.field_773 != null && this.field_773.dc) {
         this.field_773 = null;
      }

      var1.method_2546(this.field_773);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_773 = (class_97)var1.method_3017(f.class);
      super.a(var1);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_765 : field_770[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_767;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && this.dj > -2.0F;
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
      return field_766;
   }

   // $FF: renamed from: J () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_349() {
      return field_768;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      this.G = field_765;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2425);
      return true;
   }

   public strictfp class_88(boolean var1) {
      super(var1);
      this.a(field_770[7], 1);
      this.by = 30.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 3500.0F;
      this.bI = this.bJ;
      this.bO = 5000.0F;
      this.bL = this.bO;
      this.G = field_770[7];
   }

   // $FF: renamed from: bl () float
   public strictfp float method_231() {
      return this.bO > 0.0F && this.bL < this.bO ? this.bL / this.bO : super.bl();
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (!this.bi && this.bj()) {
         if (!this.bi) {
            if (this.bA != 0.0F) {
               this.I(2);
            } else {
               this.I(4);
            }
         }

         if (this.bU) {
         }

         this.field_772 += 1.0F * var1;
         if (this.field_772 > 360.0F) {
            this.field_772 -= 360.0F;
         }

         this.dj = class_296.method_2021(this.dj, 4.0F + class_296.method_2098(this.field_772) * 2.0F, 0.1F * var1);
         this.bL = class_296.method_2021(this.bL, this.bO, 0.25F * var1);
         this.bM = class_296.method_2021(this.bM, 0.0F, 4.0F * var1);
         if (this.bM > 50.0F) {
            this.bM = 50.0F;
         }

         if (this.field_773 != null) {
            PointF var2 = this.w(0);
            this.field_773.dh = var2.field_2406;
            this.field_773.di = var2.field_2407;
            this.field_773.dj = this.dj;
            if (this.field_773.dc) {
               this.field_773 = null;
            }
         }

      }
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 80000.0F;
   }

   // $FF: renamed from: C (int) float
   public strictfp float method_484(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: B (int) android.graphics.PointF
   public strictfp PointF method_483(int var1) {
      PointF var2 = super.B(var1);
      if (this.field_773 != null) {
         var2.field_2406 += this.field_773.field_862;
         var2.field_2407 += this.field_773.field_863;
      }

      return var2;
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      class_236 var3 = class_236.method_1549();
      PointF var4 = this.w(var2);
      if (this.field_773 != null) {
         boolean var5 = false;
         if (this.field_773.dc) {
            var5 = true;
         }

         if (this.field_773.field_842 != var1) {
            var5 = true;
         }

         if (var5) {
            this.field_773 = null;
         }
      }

      float var7 = this.method_441(var2) + this.method_445(var2) + 5.0F;
      if (this.field_773 != null) {
         this.field_773.field_839 = var7;
      } else {
         class_97 var6 = class_97.method_697(this, var4.field_2406, var4.field_2407);
         var6.field_874 = 380.0F;
         var6.field_842 = var1;
         var6.field_839 = var7;
         var6.field_854 = true;
         var6.field_853 = true;
         var6.field_925 = true;
         var6.field_857 = true;
         var6.field_861 = 70.0F;
         var6.field_858 = 230.0F;
         var6.df = this.df;
         this.field_773 = var6;
      }

   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 180.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 8.0F;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 8.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.7F;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return 1.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.2F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.04F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 1.5F;
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
         int var4 = var2 + this.field_771 * this.dl;
         this.field_774.method_1911(var4, var3, var4 + this.dl, var3 + this.dm);
         return this.field_774;
      }
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         class_205.method_1364(this);
         if (!this.bi) {
            float var2 = 0.0F;
            if (this.field_773 != null) {
               var2 = class_296.method_2022(this.field_773.method_701(), 0.25F) * 3.0F;
            }

            class_205.method_1365(this, class_93.field_810, var2, 0);
         }

         class_236 var7 = class_236.method_1549();
         if (!this.bi && this.bL > 0.0F && this.bN == 0.0F) {
            class_306 var3 = this.method_349();
            if (var3 != null) {
               float var4 = 0.09F;
               var4 += this.bL / this.bO * 0.4F;
               var4 += class_296.method_2022(this.bM, 50.0F) / 50.0F * 0.5F;
               this.field_775.method_2791((int)(var4 * 255.0F), 255, 255, 255);
               float var5 = this.dh - var7.field_1965;
               float var6 = this.di - var7.field_1966 - this.dj;
               var7.field_1935.method_65(var3, var5, var6, this.d(false) - 90.0F, this.field_775);
            }
         }

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
      return 8.0F;
   }

   // $FF: renamed from: x (int) android.graphics.PointF
   public strictfp PointF method_479(int var1) {
      float var2 = this.dh;
      float var3 = this.di;
      aH.method_1960(var2, var3);
      return aH;
   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return 1;
   }

   // $FF: renamed from: aI () boolean
   public strictfp boolean method_468() {
      return true;
   }

   // $FF: renamed from: aJ () boolean
   public strictfp boolean method_469() {
      return true;
   }

   // $FF: renamed from: bG () int
   public strictfp int method_287() {
      return 5;
   }

   // $FF: renamed from: ca () boolean
   public strictfp boolean method_329() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_666();
   }
}
