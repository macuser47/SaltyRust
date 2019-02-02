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
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.f
public class class_86 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_753 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_754 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_755 = new class_306[10];
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_756 = null;
   // $FF: renamed from: e int
   int field_757;
   // $FF: renamed from: f float
   float field_758;
   // $FF: renamed from: g float
   float field_759;
   // $FF: renamed from: h android.graphics.Rect
   Rect field_760 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_662() {
      return class_469.field_4055;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_663() {
      class_236 var0 = class_236.method_1549();
      class_306 var1 = var0.field_1935.method_60(R$drawable.heavy_tank);
      field_755 = class_107.method_948(var1);
      field_753 = var0.field_1935.method_60(R$drawable.heavy_tank_dead);
      field_754 = var0.field_1935.method_60(R$drawable.heavy_tank_turret);
      field_756 = a(var1, var1.method_2128() / 3, var1.method_2127());
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_753 : field_755[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_756;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_754;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && !this.bi && this.bB >= 1.0F && !this.bE;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 2.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 2.0F;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      this.G = field_753;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2423);
      return true;
   }

   public strictfp class_86(boolean var1) {
      super(var1);
      this.a(field_755[7], 3);
      this.by = 15.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 600.0F;
      this.bI = this.bJ;
      this.G = field_755[7];
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (!this.bi) {
         if (this.bu != 0.0F) {
            this.field_758 += var1;
            if ((double)this.field_758 > 1.4D) {
               this.field_758 = 0.0F;
               ++this.field_757;
               if (this.field_757 > 2) {
                  this.field_757 = 0;
               }
            }

            if (this.de) {
               this.field_759 += var1;
               if (this.field_759 > 9.0F) {
                  this.field_759 = 0.0F;
                  this.method_664();
               }
            }
         }

      }
   }

   // $FF: renamed from: D () void
   public strictfp void method_664() {
      class_236 var1 = class_236.method_1549();
      float var2 = this.bv;
      if (this.bu < 0.0F) {
         var2 += 180.0F;
      }

      for(int var3 = 0; var3 <= 1; ++var3) {
         float var4 = (float)(var3 == 0 ? -20 : 20);
         float var5 = this.dh + class_296.method_2099(var2 + 180.0F + var4) * this.by + 3.0F;
         float var6 = this.di + class_296.method_2098(var2 + 180.0F + var4) * this.by + 3.0F;
         var1.field_1938.method_2470(var5, var6, this.dj, var2 + 180.0F, 0);
      }

   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 7000.0F;
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 50.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      class_236 var3 = class_236.method_1549();
      PointF var4;
      class_97 var5;
      if (!var1.method_280()) {
         var4 = this.w(var2);
         var5 = class_97.method_697(this, var4.field_2406, var4.field_2407);
         PointF var6 = this.B(var2);
         var5.field_862 = var6.field_2406;
         var5.field_863 = var6.field_2407;
         var5.field_895 = Color.method_3077(235, 150, 230, 40);
         var5.field_874 = this.method_442(var2);
         var5.field_842 = var1;
         var5.field_839 = 60.0F;
         var5.field_849 = 4.0F;
         var5.field_850 = 2.0F;
         var5.field_925 = true;
         var5.field_852 = true;
         var3.field_1938.method_2472(var5, -16716288);
         var3.field_1938.method_2474(var4.field_2406, var4.field_2407, this.dj, -1127220);
         var3.field_1938.method_2466(var4.field_2406, var4.field_2407, this.dj, this.bV[var2].field_4608);
         var3.field_1933.method_3323(class_525.field_4762, 0.3F, this.dh, this.di);
      } else {
         var4 = this.w(var2);
         var4.method_1960(this.dh, this.di);
         var5 = class_97.method_697(this, this.dh, this.di);
         var5.field_895 = Color.method_3077(255, 230, 230, 50);
         var5.field_874 = this.method_442(var2);
         var5.field_842 = var1;
         var5.field_839 = 190.0F;
         var5.field_849 = 0.5F;
         var5.field_847 = 5.0F;
         var5.field_915 = true;
         var5.field_916 = 10.0F;
         var5.field_917 = 15.0F;
         var5.field_920 = true;
         var5.field_925 = true;
         var5.field_914 = true;
         var3.field_1933.method_3323(class_525.field_4754, 0.2F, this.dh, this.di);
         var3.field_1938.method_2472(var5, -1118720);
         var3.field_1938.method_2474(var4.field_2406, var4.field_2407, this.dj, -1127220);
      }

   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 160.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 70.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.8F;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return 1.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.9F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.2F;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return 0.12F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 3.0F;
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
      return 21.0F;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public strictfp Rect method_299(boolean var1) {
      if (var1) {
         return super.a_(var1);
      } else {
         return this.bi ? super.a_(var1) : super.a(var1, this.field_757);
      }
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
      return this.method_662();
   }
}
