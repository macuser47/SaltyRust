package com.corrodinggames.rts.game.units.d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_512;
import com.corrodinggames.rts.game.units.class_9;
import com.corrodinggames.rts.game.units.a.class_128;
import com.corrodinggames.rts.game.units.a.class_129;
import com.corrodinggames.rts.game.units.e.class_84;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.p
public class class_49 extends class_47 implements class_9 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_360 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_361 = new class_306[10];
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_362 = null;
   // $FF: renamed from: d float
   float field_363;
   // $FF: renamed from: e com.corrodinggames.rts.game.units.d.q
   public static class_255 field_364 = new class_255(true);
   // $FF: renamed from: f android.graphics.Rect
   Rect field_365 = new Rect();
   // $FF: renamed from: g android.graphics.Rect
   Rect field_366 = new Rect();
   // $FF: renamed from: h java.util.ArrayList
   static ArrayList field_367 = new ArrayList();
   // $FF: renamed from: i android.graphics.PointF[]
   PointF[] field_368 = new PointF[6];
   // $FF: renamed from: j android.graphics.PointF[]
   PointF[] field_369;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      super.method_175(var1);
   }

   // $FF: renamed from: cd () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_519() {
      return class_469.field_4060;
   }

   // $FF: renamed from: cg () void
   public static strictfp void method_520() {
      class_236 var0 = class_236.method_1549();
      field_360 = var0.field_1935.method_60(R$drawable.repair_bay);
      field_362 = var0.field_1935.method_60(R$drawable.repair_bay_dead);
      field_361 = class_107.method_948(field_360);
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      this.G = field_362;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2423);
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      if (this.bi) {
         return field_362;
      } else {
         return this.bk == null ? field_361[field_361.length - 1] : field_361[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
   }

   public strictfp class_49(boolean var1) {
      super(var1);
      this.field_369 = new PointF[this.field_368.length];
      this.G = field_360;
      this.b(field_360);
      this.by = 30.0F;
      this.bz = this.by;
      this.bJ = 1000.0F;
      this.bI = this.bJ;
      this.n.method_1911(-1, -1, 1, 1);
      this.o.method_1911(-1, -1, 1, 1);

      for(int var2 = 0; var2 < this.field_368.length; ++var2) {
         this.field_368[var2] = new PointF();
         this.field_369[var2] = new PointF();
      }

   }

   // $FF: renamed from: r () int
   public strictfp int method_290() {
      return 230;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_292(class_39 var1) {
      return 0.2F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_386(class_39 var1) {
      return !var1.method_330();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float, float, boolean) com.corrodinggames.rts.game.units.ar
   public static strictfp class_512 method_521(class_44 var0, float var1, float var2, boolean var3) {
      class_236 var4 = class_236.method_1549();
      field_364.method_1810((float)var0.r() + var2, var3);
      var4.field_1949.method_3233(var0.dh, var0.di, (float)var0.r() + var2, var0, var1, field_364);
      class_39 var5 = field_364.field_2262;
      if (var5 != null) {
         class_512 var6 = var0.method_395();
         var6.method_3265(var5);
         if (var6 != null) {
            var6.field_4676 = var2;
            var6.field_4678 = true;
            return var6;
         }
      }

      return null;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (this.bj() && !this.bi) {
         this.field_363 += var1;
         if (this.ac() && this.field_363 > 40.0F) {
            this.field_363 = 0.0F;
            method_521(this, var1, 0.0F, false);
         }

         if (!this.bi) {
            class_84.method_656(var1, this);
         }

      }
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return super.method_181(var1);
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
      super.a(var1, var2);
      if (!this.bi) {
         class_84.method_657(var1, this);
      }

   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      throw new RuntimeException("Unit cannot shoot");
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      PointF var2 = this.x(var1);
      float var3 = var2.field_2406 + 0.0F;
      float var4 = var2.field_2407 - 33.0F;
      aG.method_1960(var3, var4);
      return aG;
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_367;
   }

   // $FF: renamed from: b () android.graphics.PointF[]
   public strictfp PointF[] method_18() {
      return this.field_368;
   }

   // $FF: renamed from: c () android.graphics.PointF[]
   public strictfp PointF[] method_19() {
      return this.field_369;
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return (float)this.method_290();
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      super.e(var1);
      float var2 = (float)this.method_290();
      class_205.method_1355(this, var2);
   }

   // $FF: renamed from: Z () boolean
   public strictfp boolean method_391() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_519();
   }

   static {
      field_367.add(new class_128(true));
      field_367.add(new class_129());
   }
}
