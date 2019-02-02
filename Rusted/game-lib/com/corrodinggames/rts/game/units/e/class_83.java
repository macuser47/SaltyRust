package com.corrodinggames.rts.game.units.e;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.a
public class class_83 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_728 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_729 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_730 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_731 = new class_306[10];

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_652() {
      return class_469.field_4043;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_653() {
      class_236 var0 = class_236.method_1549();
      field_728 = var0.field_1935.method_60(R$drawable.artillery2);
      field_729 = var0.field_1935.method_60(R$drawable.artillery1_dead);
      field_731 = class_107.method_948(field_728);
      field_730 = a(field_728);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_729 : field_731[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_730;
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
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      this.G = field_729;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2423);
      return true;
   }

   public strictfp class_83(boolean var1) {
      super(var1);
      this.J(28);
      this.K(50);
      this.by = 18.0F;
      this.bz = this.by;
      this.bJ = 140.0F;
      this.bI = this.bJ;
      this.G = field_728;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_839 = 150.0F;
      var4.field_849 = 4.0F;
      var4.field_925 = true;
      var4.field_895 = Color.method_3077(255, 190, 190, 80);
      var4.field_869 = 2;
      var4.field_867 = 1;
      var4.field_850 = 0.9F;
      PointF var6 = var1.method_310(var3.field_2406, var3.field_2407, var4.field_849, var4.field_839, this.method_439());
      var4.field_901 = true;
      var4.field_843 = true;
      var4.field_844 = var6.field_2406;
      var4.field_845 = var6.field_2407;
      var4.field_878 = 80.0F;
      var4.field_879 = 45.0F;
      var4.field_880 = true;
      class_236 var7 = class_236.method_1549();
      var7.field_1933.method_3323(class_525.field_4759, 0.3F, var3.field_2406, var3.field_2407);
      var7.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      class_390 var8 = var7.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1118482);
      if (var8 != null) {
         var8.field_3160 = 15.0F;
         var8.field_3161 = var8.field_3160;
      }

   }

   // $FF: renamed from: bl () float
   public strictfp float method_231() {
      return this.bV[0].field_4611 > 0.0F ? 1.0F - this.bV[0].field_4611 / this.method_441(0) : super.bl();
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 290.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 240.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.9F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.7F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.05F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return true;
   }

   // $FF: renamed from: T () boolean
   public strictfp boolean method_380() {
      return false;
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return true;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 20.0F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.05F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.12F;
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      super.e(var1);
      float var2 = this.method_439();
      class_205.method_1355(this, var2);
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 14000.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_652();
   }
}
