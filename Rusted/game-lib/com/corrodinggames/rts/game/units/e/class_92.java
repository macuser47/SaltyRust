package com.corrodinggames.rts.game.units.e;

import android.graphics.Color;
import android.graphics.Paint;
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

// $FF: renamed from: com.corrodinggames.rts.game.units.e.k
public class class_92 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_799 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_800 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_801 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_802 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_803 = new class_306[10];
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_804 = null;
   // $FF: renamed from: g android.graphics.Rect
   Rect field_805 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_682() {
      return class_469.field_4050;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_683() {
      class_236 var0 = class_236.method_1549();
      field_800 = var0.field_1935.method_60(R$drawable.laser_tank_base);
      field_799 = var0.field_1935.method_60(R$drawable.laser_tank_dead);
      field_801 = var0.field_1935.method_60(R$drawable.laser_tank_turrent);
      field_802 = var0.field_1935.method_60(R$drawable.laser_tank_charge);
      field_803 = class_107.method_948(field_800);
      field_804 = a(field_800, field_800.method_2128(), field_800.method_2127());
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_799 : field_803[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_804;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && !this.bi;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 2.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 2.0F;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_801;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      this.G = field_799;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2422);
      return true;
   }

   public strictfp class_92(boolean var1) {
      super(var1);
      this.a(field_800, 1);
      this.by = 14.0F;
      this.bz = this.by + 2.0F;
      this.bJ = 300.0F;
      this.bI = this.bJ;
      this.G = field_800;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 450.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
      var4.field_874 = this.method_442(var2);
      var4.field_842 = var1;
      var4.field_839 = 8.0F;
      var4.field_854 = true;
      var4.field_853 = true;
      var4.field_925 = true;
      var4.field_895 = Color.method_3077(80, 255, 0, 0);
      class_236 var5 = class_236.method_1549();
      var5.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1127220);
      var5.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      var5.field_1933.method_3323(class_525.field_4766, 0.3F, var3.field_2406, var3.field_2407);
   }

   // $FF: renamed from: bl () float
   public strictfp float method_231() {
      if (this.bV[0].field_4611 > 0.0F) {
         return 1.0F - this.bV[0].field_4611 / this.method_441(0);
      } else {
         return this.bV[0].field_4612 != 0.0F ? this.bV[0].field_4612 / this.method_445(0) : super.bl();
      }
   }

   // $FF: renamed from: bm () boolean
   public strictfp boolean method_232() {
      return this.bV[0].field_4611 > 0.0F;
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 190.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 450.0F;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 80.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.7F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.5F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.1F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 3.0F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         class_205.method_1364(this);
         if (!this.bi) {
            float var3 = this.bV[0].field_4612 / this.method_445(0);
            if (var3 != 0.0F) {
               PointF var4 = this.w(0);
               var2.field_1935.method_87();
               var2.field_1935.method_94(var4.field_2406 - var2.field_1965, var4.field_2407 - var2.field_1966);
               var2.field_1935.method_92(var3, var3);
               var2.field_1935.method_69(field_802, 0.0F, 0.0F, (Paint)null);
               var2.field_1935.method_88();
            }
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
      return 0.12F;
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
      return 19.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_682();
   }
}
