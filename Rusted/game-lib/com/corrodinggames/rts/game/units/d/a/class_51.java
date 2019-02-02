package com.corrodinggames.rts.game.units.d.a;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.d.class_32;
import com.corrodinggames.rts.game.units.d.class_50;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.a.b
public class class_51 extends class_50 {
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_374 = null;
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   private static class_306 field_375 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   private static class_306 field_376 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   private static class_306 field_377 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   private static class_306 field_378 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   private static class_306 field_379 = null;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_380 = new class_306[10];
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_381 = null;
   // $FF: renamed from: j boolean
   boolean field_382;
   // $FF: renamed from: k int
   int field_383;
   // $FF: renamed from: l com.corrodinggames.rts.game.units.d.a.c
   class_382 field_384 = new class_386(this);
   // $FF: renamed from: v java.lang.String
   static String field_385 = "gun";
   // $FF: renamed from: w java.lang.String
   static String field_386 = "gunT2";
   // $FF: renamed from: x java.lang.String
   static String field_387 = "gunT3";
   // $FF: renamed from: y java.lang.String
   static String field_388 = "artillery";
   // $FF: renamed from: z java.lang.String
   static String field_389 = "flamethrower";
   // $FF: renamed from: E java.lang.String
   static String field_390 = "aa_t1";
   // $FF: renamed from: cM java.lang.String
   static String field_391 = "aa_t2";
   // $FF: renamed from: cN java.lang.String
   static String field_392 = "aa_flak";
   // $FF: renamed from: cO com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_393 = null;
   // $FF: renamed from: cP com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_394 = new class_306[10];
   // $FF: renamed from: cQ boolean
   boolean field_395 = true;
   // $FF: renamed from: cR float
   float field_396;
   // $FF: renamed from: cS float
   float field_397;
   // $FF: renamed from: cT boolean
   boolean field_398;
   // $FF: renamed from: cU android.graphics.Rect
   Rect field_399 = new Rect();
   // $FF: renamed from: cV com.corrodinggames.rts.game.units.a.l
   public static class_121 field_400 = new b$1(101);
   // $FF: renamed from: cW com.corrodinggames.rts.game.units.a.l
   public static class_121 field_401 = new b$2(104);
   // $FF: renamed from: cX com.corrodinggames.rts.game.units.a.l
   public static class_121 field_402 = new b$3(102);
   // $FF: renamed from: cY com.corrodinggames.rts.game.units.a.l
   public static class_121 field_403 = new b$4(103);
   // $FF: renamed from: cZ java.util.ArrayList
   static ArrayList field_404 = new ArrayList();

   // $FF: renamed from: cd () int
   public strictfp int method_524() {
      return this.field_384.method_2414();
   }

   // $FF: renamed from: y (int) float
   public strictfp float method_480(int var1) {
      return this.field_384.method_2422(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public strictfp void method_303(String var1) {
      this.method_525(var1);
   }

   // $FF: renamed from: d (java.lang.String) void
   public strictfp void method_525(String var1) {
      if (!this.field_384.method_2417(var1)) {
         class_382 var2 = this.field_384;
         this.field_384 = this.method_526(var1);
         this.field_384.method_2416(var2);
      }

   }

   // $FF: renamed from: e (java.lang.String) com.corrodinggames.rts.game.units.d.a.c
   public strictfp class_382 method_526(String var1) {
      if (var1.equals(field_385)) {
         return new class_386(this);
      } else if (var1.equals(field_386)) {
         return new class_383(this);
      } else if (var1.equals(field_387)) {
         return new class_387(this);
      } else if (var1.equals(field_388)) {
         return new class_385(this);
      } else {
         return var1.equals(field_389) ? new class_384(this) : null;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2540(this.field_382);
      var1.method_2540(this.field_383 == 1);
      var1.method_2545(this.field_384.method_2415());
      var1.method_2541(this.field_383);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      boolean var2 = var1.method_3010();
      if (var2) {
         this.method_356(2);
      }

      if (var1.method_3006() >= 27) {
         this.field_383 = var1.method_3010() ? 1 : 0;
      }

      if (var1.method_3006() >= 35) {
         String var3 = var1.method_3015();
         if (!this.field_384.method_2417(var3)) {
            this.method_525(var3);
         }

         this.field_383 = var1.method_3011();
      } else if (var2 && !(this instanceof class_52)) {
         this.method_525(field_386);
      }

      super.method_175(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_394[this.bk.method_963()];
   }

   // $FF: renamed from: cm () void
   public static strictfp void method_527() {
      class_236 var0 = class_236.method_1549();
      field_374 = var0.field_1935.method_60(R$drawable.turret_base);
      field_381 = var0.field_1935.method_60(R$drawable.turret_base_dead);
      field_375 = var0.field_1935.method_60(R$drawable.turret_top);
      field_376 = var0.field_1935.method_60(R$drawable.turret_top_l2);
      field_377 = var0.field_1935.method_60(R$drawable.turret_top_l3);
      field_378 = var0.field_1935.method_60(R$drawable.turret_top_artillery);
      field_379 = var0.field_1935.method_60(R$drawable.turret_top_flame);
      field_380 = class_107.method_948(field_374);
      field_393 = var0.field_1935.method_60(R$drawable.unit_icon_building_turrent);
      field_394 = class_107.method_948(field_393);
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      this.G = field_381;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2424);
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      if (this.bi) {
         return field_381;
      } else {
         return this.bk == null ? field_380[field_380.length - 1] : field_380[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return this.field_384.method_2413(var1);
   }

   public strictfp class_51(boolean var1) {
      super(var1);
      this.J(35);
      this.K(42);
      this.by = 16.0F;
      this.bz = this.by;
      this.bJ = 700.0F;
      this.bI = this.bJ;
      this.G = field_374;
      this.bV[0].field_4608 = (float)class_296.method_2013(this, -180, 180);
      this.n.method_1911(0, 0, 1, 1);
      this.o.method_1911(0, 0, 1, 1);
   }

   // $FF: renamed from: o (float) void
   public strictfp void method_528(float var1) {
      byte var2 = 0;
      if (this.bV[var2].field_4610 == 0.0F) {
         if (this.field_395) {
            this.field_396 = this.bV[var2].field_4608;
            this.field_395 = false;
            this.field_397 = (float)class_296.method_2013(this, 0, 120);
         }

         this.field_397 += var1;
         if (this.field_397 > 450.0F) {
            this.field_397 = (float)class_296.method_2013(this, 0, 30);
            this.field_398 = !this.field_398;
         }

         if (this.field_397 < 120.0F) {
            if (this.field_398) {
               this.a(var1 * 0.3F, this.field_396 - 20.0F, var2);
            } else {
               this.a(var1 * 0.3F, this.field_396 + 20.0F, var2);
            }
         }
      } else {
         this.field_395 = true;
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (this.bj()) {
         this.field_384.method_2418(var1);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      this.field_384.method_2412(var1, var2);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return this.field_384.method_2408();
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return this.field_384.method_2409(var1);
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return this.field_384.method_2419(var1);
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return this.field_384.method_2420(var1);
   }

   // $FF: renamed from: b (int, float) boolean
   public strictfp boolean method_470(int var1, float var2) {
      return false;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.method_181(var1)) {
         return false;
      } else {
         if (!this.bi) {
            this.method_529();
         }

         return true;
      }
   }

   // $FF: renamed from: cn () void
   strictfp void method_529() {
      class_236 var1 = class_236.method_1549();
      class_306 var2 = null;
      byte var3 = 0;
      var2 = this.method_348(var3);
      PointF var4 = this.method_479(var3);
      var1.field_1935.method_65(var2, var4.field_2406 - class_236.method_1549().field_1965, var4.field_2407 - class_236.method_1549().field_1966, this.bV[var3].field_4608, this.f());
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_530() {
      return class_469.field_4038;
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
      return this.field_384.method_2421(var1);
   }

   // $FF: renamed from: D (int) void
   public strictfp void method_485(int var1) {
      if (this.method_441(var1) >= 10.0F) {
         super.D(var1);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      class_121 var2 = this.b(var1.field_16);
      if (var2 != null) {
         var2.method_1065(this);
      } else {
         class_454.method_2889("specialAction=null on completeQueueItem(turret) for item.uIndex:" + var1.field_23 + " id:" + this.da, true);
      }

   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      if (this.method_524() == 1) {
         return field_400.method_1043();
      } else {
         return this.field_384 instanceof class_383 ? field_401.method_1043() : class_121.field_1347;
      }
   }

   // $FF: renamed from: a (java.util.ArrayList) void
   public strictfp void method_272(ArrayList var1) {
      var1.clear();
      if (this.method_524() == 1) {
         var1.add(field_402.method_1043());
         var1.add(field_403.method_1043());
      }

   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
      if (var1 == 1) {
         this.field_382 = false;
      } else if (var1 == 2 && !this.field_382) {
         this.field_382 = true;
      }

   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      return this.field_384.method_2411(var1);
   }

   // $FF: renamed from: bk () float
   public strictfp float method_230() {
      return this.bV[0].field_4611 > 0.0F && this.field_384.method_2417(field_388) ? 1.0F - this.bV[0].field_4611 / this.method_441(0) : super.method_230();
   }

   // $FF: renamed from: x (int) android.graphics.PointF
   public strictfp PointF method_479(int var1) {
      aH.method_1961(super.x(var1));
      aH.method_1962(0.0F, -5.0F);
      return aH;
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_404;
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      super.e(var1);
      float var2 = this.method_439();
      class_205.method_1355(this, var2);
   }

   // $FF: renamed from: bW () float
   public strictfp float method_323() {
      return (float)class_236.method_1549().field_1932.field_3330;
   }

   // $FF: renamed from: bX () float
   public strictfp float method_324() {
      return (float)class_236.method_1549().field_1932.field_3331;
   }

   // $FF: renamed from: bY () float
   public strictfp float method_325() {
      return super.bY() - 8.0F;
   }

   // $FF: renamed from: bQ () int
   public strictfp int method_309() {
      return this.field_384.method_2423();
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return this.field_384.method_2410(var1);
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_530();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.a.b, int) android.graphics.PointF
   // $FF: synthetic method
   static PointF method_531(class_51 var0, int var1) {
      return var0.w(var1);
   }

   // $FF: renamed from: co () com.corrodinggames.rts.gameFramework.h.e
   // $FF: synthetic method
   static class_306 method_532() {
      return field_375;
   }

   // $FF: renamed from: cp () com.corrodinggames.rts.gameFramework.h.e
   // $FF: synthetic method
   static class_306 method_533() {
      return field_376;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.d.a.b, int) android.graphics.PointF
   // $FF: synthetic method
   static PointF method_534(class_51 var0, int var1) {
      return var0.w(var1);
   }

   // $FF: renamed from: cq () com.corrodinggames.rts.gameFramework.h.e
   // $FF: synthetic method
   static class_306 method_535() {
      return field_377;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.d.a.b, int) android.graphics.PointF
   // $FF: synthetic method
   static PointF method_536(class_51 var0, int var1) {
      return var0.w(var1);
   }

   // $FF: renamed from: cr () com.corrodinggames.rts.gameFramework.h.e
   // $FF: synthetic method
   static class_306 method_537() {
      return field_378;
   }

   // $FF: renamed from: cs () com.corrodinggames.rts.gameFramework.h.e
   // $FF: synthetic method
   static class_306 method_538() {
      return field_379;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.a.b) void
   // $FF: synthetic method
   static void method_539(class_51 var0) {
      var0.L();
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.d.a.b) void
   // $FF: synthetic method
   static void method_540(class_51 var0) {
      var0.L();
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.d.a.b) void
   // $FF: synthetic method
   static void method_541(class_51 var0) {
      var0.L();
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.d.a.b) void
   // $FF: synthetic method
   static void method_542(class_51 var0) {
      var0.L();
   }

   static {
      field_404.add(field_400);
      field_404.add(field_401);
      field_404.add(field_402);
      field_404.add(field_403);
   }
}
