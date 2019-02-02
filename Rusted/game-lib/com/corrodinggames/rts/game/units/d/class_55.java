package com.corrodinggames.rts.game.units.d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_130;
import com.corrodinggames.rts.game.units.a.class_135;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_35;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.d
public class class_55 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_431 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_432 = new class_306[10];
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_433 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_434 = null;
   // $FF: renamed from: e float
   float field_435;
   // $FF: renamed from: f float
   public float field_436;
   // $FF: renamed from: g float
   public float field_437;
   // $FF: renamed from: h int
   public int field_438;
   // $FF: renamed from: i float
   public float field_439;
   // $FF: renamed from: j float
   public float field_440;
   // $FF: renamed from: k float
   float field_441 = 20.0F;
   // $FF: renamed from: l int
   int field_442 = 0;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_435);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_435 = var1.method_3012();
      super.method_175(var1);
   }

   // $FF: renamed from: b () void
   public static strictfp void method_552() {
      class_236 var0 = class_236.method_1549();
      field_431 = var0.field_1935.method_60(R$drawable.base);
      field_433 = var0.field_1935.method_60(R$drawable.base_dead);
      field_434 = var0.field_1935.method_60(R$drawable.base_back);
      field_432 = class_107.method_948(field_431);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_553() {
      return class_469.field_4037;
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      class_236 var1 = class_236.method_1549();
      this.G = field_433;
      this.m = null;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2424);
      float var2 = this.dh;
      float var3 = this.di;
      float var4 = 0.0F;
      var1.field_1938.method_2485(class_395.field_3225);
      class_390 var5 = var1.field_1938.method_2474(var2, var3, this.dj, Color.method_3077(255, 255, 255, 255));
      if (var5 != null) {
         var5.field_3145 = 8.0F;
         var5.field_3144 = 5.0F;
         var5.field_3143 = 0.9F;
         var5.field_3160 = 20.0F;
         var5.field_3161 = var5.field_3160;
         var5.field_3135 = true;
      }

      var1.field_1938.method_2485(class_395.field_3225);
      var5 = var1.field_1938.method_2479(var2, var3, var4, -1127220);
      if (var5 != null) {
         var5.field_3145 = 0.2F;
         var5.field_3144 = 2.0F;
         var5.field_3179 = 2;
         var5.field_3160 = 45.0F;
         var5.field_3161 = var5.field_3160;
         var5.field_3159 = 0.0F;
      }

      float var6 = 40.0F;
      float var7 = 70.0F;
      var1.field_1938.method_2461(this.dh, this.di, this.dj, var6, var7);
      class_35.method_194(this.dh, this.di);
      class_35.method_195(this.dh, this.di).field_80 = 800.0F;
      return true;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
   }

   // $FF: renamed from: I () void
   public strictfp void method_345() {
      super.I();
      if (this.bi) {
         this.m = null;
      } else {
         this.m = field_434;
      }

   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_433 : field_432[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   public strictfp class_55(boolean var1) {
      super(var1);
      this.G = field_431;
      this.m = field_434;
      this.J(53);
      this.K(68);
      this.by = 30.0F;
      this.bz = this.by;
      this.bJ = 4000.0F;
      this.bI = this.bJ;
      this.I(3);
      this.n.method_1911(-1, -1, 1, 1);
      this.o.method_1911(-1, -1, 1, 2);
   }

   // $FF: renamed from: bL () android.graphics.RectF
   public strictfp RectF method_298() {
      RectF var1 = super.bL();
      var1.method_1972(6.0F, 0.0F);
      return var1;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      class_236 var2 = class_236.method_1549();
      super.method_176(var1);
      if (this.bj() && !this.bi) {
         this.field_441 = class_296.method_2020(this.field_441, var1);
         if (this.field_441 == 0.0F) {
            this.field_441 = 5.0F;
            ++this.field_442;
            if (this.field_442 > 6) {
               this.field_442 = 0;
               this.field_441 = 70.0F;
            }

            if (this.field_442 <= 3) {
               this.u = this.field_442;
            } else {
               this.u = 6 - this.field_442;
            }
         }

         this.field_436 += var1;
         ++this.field_438;
         this.field_439 += 10.0F;
         if (this.field_440 > var1) {
            this.field_440 = var1;
         }

         this.field_437 += var1;
         this.field_435 += var1;
         if (this.field_435 > 39.9F) {
            this.field_435 -= 40.0F;
            this.bk.method_930((int)this.method_294());
         }

      }
   }

   // $FF: renamed from: bI () float
   public strictfp float method_294() {
      return 18.0F;
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 70.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      class_97 var3 = class_97.method_697(this, this.dh, this.di);
      PointF var4 = this.B(var2);
      var3.field_862 = var4.field_2406;
      var3.field_863 = var4.field_2407;
      var3.field_895 = Color.method_3077(255, 230, 230, 50);
      var3.field_874 = this.method_442(var2);
      var3.field_842 = var1;
      var3.field_839 = 180.0F;
      var3.field_849 = 2.0F;
      var3.field_847 = 5.0F;
      var3.field_915 = true;
      var3.field_920 = true;
      var3.field_925 = true;
      var3.field_914 = true;
      class_236 var5 = class_236.method_1549();
      var5.field_1938.method_2472(var3, -1118720);
      var5.field_1933.method_3323(class_525.field_4754, 0.8F, this.dh, this.di);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 280.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 70.0F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 999.0F;
   }

   // $FF: renamed from: b (int, float) boolean
   public strictfp boolean method_470(int var1, float var2) {
      return false;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return true;
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public static strictfp void method_554(ArrayList var0, int var1) {
      var0.add(new class_130());
      var0.add(new class_135(class_469.field_4040, 1));
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return this.method_553().method_143(this.K());
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public strictfp float method_246(class_39 var1, float var2, class_97 var3) {
      if (var2 > 2500.0F) {
         var2 = 2500.0F;
      }

      return super.a(var1, var2, var3);
   }

   // $FF: renamed from: ba () boolean
   public strictfp boolean method_213() {
      return true;
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      super.e(var1);
      float var2 = this.method_439();
      class_205.method_1355(this, var2);
   }

   // $FF: renamed from: b_ () int
   public strictfp int method_490() {
      return 20;
   }

   // $FF: renamed from: aP () int
   public strictfp int method_488() {
      return 35;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_553();
   }
}
