package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_36;
import com.corrodinggames.rts.game.a.class_102;
import com.corrodinggames.rts.game.a.class_106;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_125;
import com.corrodinggames.rts.game.units.a.class_131;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.game.units.d.class_49;
import com.corrodinggames.rts.gameFramework.class_192;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_295;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_319;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_35;
import com.corrodinggames.rts.gameFramework.b.class_388;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.g.class_238;
import com.corrodinggames.rts.gameFramework.g.class_242;
import com.corrodinggames.rts.gameFramework.g.class_243;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.utility.class_199;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// $FF: renamed from: com.corrodinggames.rts.game.units.p
public abstract class class_44 extends class_43 {
   // $FF: renamed from: F boolean
   static final boolean field_258 = false;
   // $FF: renamed from: G com.corrodinggames.rts.gameFramework.h.e
   protected class_306 field_259;
   // $FF: renamed from: H com.corrodinggames.rts.gameFramework.h.e
   protected class_306 field_260;
   // $FF: renamed from: a int
   private int field_261;
   // $FF: renamed from: b float
   private float field_262;
   // $FF: renamed from: c float
   private float field_263;
   // $FF: renamed from: d float
   private float field_264;
   // $FF: renamed from: e float
   private float field_265;
   // $FF: renamed from: f int
   private int field_266 = 0;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.ar[]
   private class_512[] field_267 = new class_512[30];
   // $FF: renamed from: I com.corrodinggames.rts.game.units.a
   public class_281 field_268;
   // $FF: renamed from: J int
   int field_269;
   // $FF: renamed from: K com.corrodinggames.rts.game.units.aa
   public class_39 field_270;
   // $FF: renamed from: L float
   public float field_271;
   // $FF: renamed from: M float
   public float field_272;
   // $FF: renamed from: N float
   public float field_273;
   // $FF: renamed from: h boolean
   private boolean field_274;
   // $FF: renamed from: O float
   public float field_275;
   // $FF: renamed from: P float
   public float field_276;
   // $FF: renamed from: i boolean
   private boolean field_277;
   // $FF: renamed from: j boolean
   private boolean field_278;
   // $FF: renamed from: k float
   private float field_279;
   // $FF: renamed from: l float
   private float field_280;
   // $FF: renamed from: m int
   private int field_281;
   // $FF: renamed from: n float
   private float field_282;
   // $FF: renamed from: o float
   private float field_283;
   // $FF: renamed from: p int
   private int field_284;
   // $FF: renamed from: q float
   private float field_285;
   // $FF: renamed from: r boolean
   private boolean field_286;
   // $FF: renamed from: Q com.corrodinggames.rts.game.units.aa
   public class_39 field_287;
   // $FF: renamed from: R int
   public int field_288;
   // $FF: renamed from: S float
   public float field_289;
   // $FF: renamed from: T int
   public int field_290;
   // $FF: renamed from: U com.corrodinggames.rts.game.units.p
   public class_44 field_291;
   // $FF: renamed from: V boolean
   public boolean field_292;
   // $FF: renamed from: W boolean
   public boolean field_293;
   // $FF: renamed from: X short
   public short field_294;
   // $FF: renamed from: Y float
   public float field_295;
   // $FF: renamed from: Z boolean
   public boolean field_296;
   // $FF: renamed from: aa float
   public float field_297;
   // $FF: renamed from: ab float
   public float field_298;
   // $FF: renamed from: ac float
   public float field_299;
   // $FF: renamed from: ad int
   public int field_300;
   // $FF: renamed from: ae float
   public float field_301;
   // $FF: renamed from: af boolean
   public boolean field_302;
   // $FF: renamed from: ag boolean
   public boolean field_303;
   // $FF: renamed from: ah com.corrodinggames.rts.game.units.t[]
   protected class_283[] field_304;
   // $FF: renamed from: ai int
   protected int field_305;
   // $FF: renamed from: s boolean
   private boolean field_306;
   // $FF: renamed from: t int
   private int field_307;
   // $FF: renamed from: u int
   private int field_308;
   // $FF: renamed from: aj boolean
   public boolean field_309;
   // $FF: renamed from: ak boolean
   public boolean field_310;
   // $FF: renamed from: al com.corrodinggames.rts.game.a.g
   public class_102 field_311;
   // $FF: renamed from: am com.corrodinggames.rts.game.a.h
   public class_106 field_312;
   // $FF: renamed from: an boolean
   public boolean field_313;
   // $FF: renamed from: ao com.corrodinggames.rts.gameFramework.h.p
   protected static class_441 field_314 = new class_441();
   // $FF: renamed from: ap android.graphics.PointF
   public static final PointF field_315;
   // $FF: renamed from: v com.corrodinggames.rts.gameFramework.h.p
   private class_441 field_316;
   // $FF: renamed from: w int
   private int field_317;
   // $FF: renamed from: x com.corrodinggames.rts.gameFramework.h.p
   private class_441 field_318;
   // $FF: renamed from: y int
   private int field_319;
   // $FF: renamed from: z android.graphics.Paint
   private static Paint field_320;
   // $FF: renamed from: A int
   private static int field_321;
   // $FF: renamed from: B com.corrodinggames.rts.gameFramework.h.p
   private static class_441 field_322;
   // $FF: renamed from: C com.corrodinggames.rts.gameFramework.h.p
   private static class_441 field_323;
   // $FF: renamed from: aq com.corrodinggames.rts.game.units.an
   public static class_250 field_324;
   // $FF: renamed from: ar byte
   byte field_325;
   // $FF: renamed from: as com.corrodinggames.rts.game.units.aa[]
   class_39[] field_326;
   // $FF: renamed from: at float[]
   float[] field_327;
   // $FF: renamed from: au int
   int field_328;
   // $FF: renamed from: av boolean
   public boolean field_329;
   // $FF: renamed from: aw com.corrodinggames.rts.game.units.s
   public static class_252 field_330;
   // $FF: renamed from: ax com.corrodinggames.rts.game.units.s
   public static class_252 field_331;
   // $FF: renamed from: ay com.corrodinggames.rts.game.units.v
   public static class_254 field_332;
   // $FF: renamed from: az com.corrodinggames.rts.game.units.v
   public static class_254 field_333;
   // $FF: renamed from: aA com.corrodinggames.rts.gameFramework.g.c
   class_242 field_334;
   // $FF: renamed from: aB android.graphics.PorterDuffColorFilter
   protected static PorterDuffColorFilter field_335;
   // $FF: renamed from: aC android.graphics.PorterDuffColorFilter
   protected static PorterDuffColorFilter field_336;
   // $FF: renamed from: aD android.graphics.PorterDuffColorFilter
   protected static PorterDuffColorFilter field_337;
   // $FF: renamed from: aE android.graphics.PorterDuffColorFilter
   protected static PorterDuffColorFilter field_338;
   // $FF: renamed from: aF android.graphics.PointF
   static PointF field_339;
   // $FF: renamed from: aG android.graphics.PointF
   protected static PointF field_340;
   // $FF: renamed from: aH android.graphics.PointF
   protected static PointF field_341;
   // $FF: renamed from: aI android.graphics.PointF
   protected static PointF field_342;
   // $FF: renamed from: aJ android.graphics.Point
   static Point field_343;
   // $FF: renamed from: aK android.graphics.Point
   static Point field_344;
   // $FF: renamed from: aL android.graphics.PointF
   static PointF field_345;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_262);
      var1.method_2542(this.field_263);
      var1.method_2542(this.bV[0].field_4611);
      var1.method_2541(this.field_266);
      int var2 = this.field_266;
      var1.method_2541(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field_267[var3].method_3252(var1);
      }

      var1.method_2553(this.field_268);
      class_39 var5 = this.field_270;
      if (var5 != null && var5.field_141) {
         var5 = null;
      }

      var1.method_2550(var5);
      var1.method_2542(this.field_271);
      var1.method_2542(this.field_273);
      var1.method_2542(this.field_275);
      var1.method_2563("pathing_active:");
      var1.method_2540(this.field_278);
      var1.method_2542(this.field_279);
      var1.method_2542(this.field_280);
      var1.method_2542(this.field_285);
      var1.method_2551(this.field_291);
      var1.method_2540(this.field_292);
      var1.method_2540(this.field_293);
      var1.method_2540(this.field_296);
      var1.method_2542(this.field_297);
      var1.method_2542(this.field_298);
      var1.method_2542(this.field_299);
      var1.method_2541(this.field_300);
      var1.method_2541(this.field_290);
      var1.method_2563("activePathCount:");
      var1.method_2541(this.field_305);

      for(int var4 = 0; var4 < this.field_305; ++var4) {
         this.field_304[var4].method_1980(var1);
      }

      var1.method_2541(this.field_305);
      var1.method_2541(this.field_307);
      if (var1.method_2564()) {
      }

      var1.method_2539(9);
      var1.method_2542(this.field_282);
      var1.method_2542(this.field_283);
      var1.method_2542(this.field_264);
      var1.method_2542(this.field_265);
      var1.method_2540(this.field_306);
      var1.method_2542(this.field_295);
      var1.method_2541(this.field_281);
      var1.method_2542(this.field_276);
      var1.method_2542(this.field_301);
      var1.method_2540(this.field_302);
      var1.method_2540(this.field_303);
      var1.method_2561(this.field_294);
      var1.method_2542(this.field_289);
      var1.method_2541(this.field_308);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_262 = var1.method_3012();
      this.field_263 = var1.method_3012();
      this.bV[0].field_4611 = var1.method_3012();
      this.field_266 = var1.method_3011();
      int var2 = 30;
      if (var1.method_3006() >= 42) {
         var2 = var1.method_3011();
      }

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var3;
         if (var3 >= this.field_267.length) {
            class_236.method_1588("Too many waypoints:" + var3);
            var4 = this.field_267.length - 1;
         }

         if (this.field_267[var4] == null) {
            this.field_267[var4] = new class_512();
         }

         this.field_267[var4].method_3253(var1);
      }

      this.field_268 = (class_281)var1.method_3022(a.class);
      if (this.field_268 == class_281.field_2408 && !this.method_431()) {
         this.field_268 = class_281.field_2409;
      }

      long var7 = var1.method_3016();
      this.field_271 = var1.method_3012();
      this.field_273 = var1.method_3012();
      this.field_275 = var1.method_3012();
      this.field_278 = var1.method_3010();
      this.field_279 = var1.method_3012();
      this.field_280 = var1.method_3012();
      this.field_285 = var1.method_3012();
      this.field_291 = var1.method_3021();
      this.field_292 = var1.method_3010();
      this.field_293 = var1.method_3010();
      this.field_296 = var1.method_3010();
      this.field_297 = var1.method_3012();
      this.field_298 = var1.method_3012();
      this.field_299 = var1.method_3012();
      this.field_300 = var1.method_3011();
      if (var1.method_3006() >= 18) {
         this.field_290 = var1.method_3011();
      }

      int var6;
      if (var1.method_3006() >= 21) {
         int var5 = var1.method_3011();

         for(var6 = 0; var6 < var5; ++var6) {
            if (this.field_304[var6] == null) {
               this.field_304[var6] = new class_283();
            }

            this.field_304[var6].method_1981(var1);
         }
      } else {
         boolean var8 = true;

         for(var6 = 0; var6 < 60; ++var6) {
            if (this.field_304[var6] == null) {
               this.field_304[var6] = new class_283();
            }

            this.field_304[var6].method_1981(var1);
         }
      }

      this.field_305 = var1.method_3011();
      this.field_307 = var1.method_3011();
      byte var9 = var1.method_3009();
      if (var9 >= 1) {
         this.field_282 = var1.method_3012();
         this.field_283 = var1.method_3012();
      }

      if (var9 >= 2) {
         this.field_264 = var1.method_3012();
         this.field_265 = var1.method_3012();
      }

      if (var9 >= 3) {
         this.field_306 = var1.method_3010();
      }

      if (var9 >= 4) {
         this.field_295 = var1.method_3012();
         this.field_281 = var1.method_3011();
      }

      if (var9 >= 5) {
         this.field_276 = var1.method_3012();
      }

      if (var9 >= 6) {
         this.field_301 = var1.method_3012();
         this.field_302 = var1.method_3010();
         this.field_303 = var1.method_3010();
      }

      if (var9 >= 7) {
         this.field_294 = var1.method_3027();
      }

      if (var9 >= 8) {
         this.field_289 = var1.method_3012();
      }

      if (var9 >= 9) {
         this.field_308 = var1.method_3011();
      }

      super.a(var1);
      if (!this.bi) {
         this.field_270 = class_34.method_186(var7, false);

         for(var6 = 0; var6 < 30; ++var6) {
            if (var6 < this.field_266) {
               if (this.field_267[var6] == null) {
                  class_236.method_1591("readIn: convertUnitIds is null: " + var6 + " waypointsCount:" + this.field_266);
               } else {
                  this.field_267[var6].method_3254();
               }
            }
         }
      }

      this.method_345();
      if (this.bi) {
         this.dp = true;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) void
   public strictfp void method_258(class_107 var1) {
      super.a(var1);
      this.method_345();
   }

   // $FF: renamed from: I () void
   public strictfp void method_345() {
      this.field_259 = this.method_346();
      this.field_260 = this.method_347();
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public abstract class_306 method_346();

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public abstract class_306 method_347();

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public abstract class_306 method_348(int var1);

   // $FF: renamed from: J () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_349() {
      return null;
   }

   // $FF: renamed from: a (int, android.graphics.ColorFilter, boolean) android.graphics.Paint
   public strictfp Paint method_350(int var1, ColorFilter var2, boolean var3) {
      if (var1 == -1 && var2 == null) {
         return var3 ? field_323 : field_322;
      } else {
         Object var4;
         int var5;
         if (this.bD) {
            var4 = field_320;
            var5 = field_321;
            field_321 = var1;
         } else if (var3) {
            if (this.field_318 == null) {
               this.field_318 = method_351(true);
            }

            var4 = this.field_318;
            var5 = this.field_319;
            this.field_319 = var1;
         } else {
            if (this.field_316 == null) {
               this.field_316 = method_351(false);
            }

            var4 = this.field_316;
            var5 = this.field_317;
            this.field_317 = var1;
         }

         if (var5 != var1) {
            ((Paint)var4).method_2788(var1);
         }

         if (((Paint)var4).method_2795() != var2) {
            ((Paint)var4).method_2796(var2);
         }

         return (Paint)var4;
      }
   }

   // $FF: renamed from: a (boolean) com.corrodinggames.rts.gameFramework.h.p
   public static strictfp class_441 method_351(boolean var0) {
      class_441 var1 = new class_441();
      if (var0) {
         var1.a(true);
         var1.d(true);
         var1.b(true);
      }

      return var1;
   }

   public strictfp class_44(boolean var1) {
      super(var1);
      this.field_268 = class_281.field_2409;
      this.field_269 = -9999;
      this.field_279 = 3.0F;
      this.field_280 = 3.0F;
      this.field_296 = false;
      this.field_297 = 0.0F;
      this.field_298 = 0.0F;
      this.field_299 = 0.0F;
      this.field_300 = 0;
      this.field_301 = -999.0F;
      this.field_302 = false;
      this.field_303 = false;
      this.field_304 = new class_283[120];
      this.field_305 = 0;
      this.field_307 = 0;
      this.field_309 = true;
      this.field_316 = null;
      this.field_318 = null;
      this.field_325 = 0;
      this.field_328 = -9999;
      this.field_334 = null;
   }

   // $FF: renamed from: h (int) void
   public strictfp void method_352(int var1) {
      int var2 = this.method_317();

      for(int var3 = 0; var3 < var2; ++var3) {
         if (this.bV[var3].field_4610 < (float)var1) {
            this.bV[var3].field_4610 = (float)var1;
         }
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      class_236 var2 = class_236.method_1549();
      this.field_310 = false;
      if (this.bA != 0.0F) {
         this.bA = class_296.method_2020(this.bA, var1);
      }

      if (!this.bi && this.bj()) {
         float var3 = this.dh;
         float var4 = this.di;
         int var5 = this.method_317();

         int var6;
         class_502 var7;
         float var8;
         float var9;
         for(var6 = 0; var6 < var5; ++var6) {
            var7 = this.bV[var6];
            var8 = this.method_476(var6);
            if (var7.field_4608 != var8) {
               var7.field_4610 = class_296.method_2020(var7.field_4610, var1);
               if (var7.field_4610 == 0.0F && this.method_470(var6, var1)) {
                  var9 = class_296.method_2030(var7.field_4608, var8, 360.0F);
                  if (class_296.method_2042(var9) < 0.5F) {
                     var7.field_4610 = 20.0F;
                     var7.field_4609 = 0.0F;
                  } else {
                     this.method_364(var1, var8, var6);
                  }
               }
            }
         }

         if (!this.method_472()) {
            this.method_367(var1);
         }

         for(var6 = 0; var6 < var5; ++var6) {
            var7 = this.bV[var6];
            if (var7.field_4611 != 0.0F) {
               var7.field_4611 = class_296.method_2020(var7.field_4611, var1);
            }
         }

         boolean var15 = this.method_468();
         boolean var16 = false;
         if (var15) {
            var16 = this.br != 0.0F || this.bs != 0.0F;
         }

         if ((this.bu != 0.0F || var16) && this.method_431()) {
            var8 = this.bv;
            if (this.method_469()) {
               var8 = this.bw;
            }

            if (!var15) {
               var9 = this.method_458() * this.bu * var1;
               var3 += class_296.method_2099(var8) * var9;
               var4 += class_296.method_2098(var8) * var9;
            } else {
               var9 = this.method_458();
               float var10;
               float var11;
               float var12;
               if (this.bu != 0.0F) {
                  var10 = this.method_466() * 1.41F;
                  var11 = class_296.method_2099(var8) * var9 * this.bu;
                  var12 = class_296.method_2098(var8) * var9 * this.bu;
               } else {
                  var10 = this.method_467() * 1.41F;
                  var11 = 0.0F;
                  var12 = 0.0F;
               }

               float var13 = class_296.method_2026(this.br, this.bs, var11, var12);
               if (var13 < var10 * var10) {
                  this.br = var11;
                  this.bs = var12;
               } else {
                  float var14 = class_296.method_2031(this.br, this.bs, var11, var12);
                  this.br += class_296.method_2099(var14) * var10 * var1;
                  this.bs += class_296.method_2098(var14) * var10 * var1;
               }

               var3 += this.br * var1;
               var4 += this.bs * var1;
            }

            this.field_310 = true;
         }

         this.bn = this.bl;
         this.bo = this.bm;
         if (this.bl != 0.0F || this.bm != 0.0F) {
            this.bl = class_296.method_2023(this.bl, -15.0F, 15.0F);
            this.bm = class_296.method_2023(this.bm, -15.0F, 15.0F);
            var3 += this.bl;
            var4 += this.bm;
            this.bl = 0.0F;
            this.bm = 0.0F;
            this.field_310 = true;
         }

         if (this.field_310 && this.method_431()) {
            this.method_353(var1, var2, var3, var4);
         }

         if (this.field_309) {
            this.field_309 = false;
            this.method_491(false);
            this.field_310 = true;
         }
      }

   }

   // $FF: renamed from: a (float, com.corrodinggames.rts.gameFramework.k, float, float) void
   private strictfp void method_353(float var1, class_236 var2, float var3, float var4) {
      float var5 = this.dh * var2.field_1932.field_3334;
      float var6 = this.di * var2.field_1932.field_3335;
      float var7 = var3 * var2.field_1932.field_3334;
      float var8 = var4 * var2.field_1932.field_3335;
      PointF var9 = null;
      boolean var10 = false;
      int var11 = class_296.method_2050(var5);
      int var12 = class_296.method_2050(var6);
      int var13 = class_296.method_2050(var7);
      int var14 = class_296.method_2050(var8);
      boolean var15;
      boolean var16;
      if ((var11 != var13 || var12 != var14) && this.bA == 0.0F && var2.field_1941.method_1682(this.h(), var13, var14)) {
         if (var11 != var13 && var12 != var14) {
            var15 = var2.field_1941.method_1682(this.h(), var11, var14);
            var16 = var2.field_1941.method_1682(this.h(), var13, var12);
            if (var15 && var16) {
               var10 = true;
               field_315.method_1960(var5, var6);
               var9 = field_315;
            }

            if (var9 == null && var15) {
               var9 = class_505.method_3245(this.h(), var5, var6, var7, var8, var11, var14);
            }

            if (var9 == null && var16) {
               var9 = class_505.method_3245(this.h(), var5, var6, var7, var8, var13, var12);
            }
         }

         if (var9 == null) {
            var9 = class_505.method_3245(this.h(), var5, var6, var7, var8, var13, var14);
         }

         if (var9 == null) {
            var10 = true;
            field_315.method_1960(var5, var6);
            var9 = field_315;
         }
      }

      var15 = false;
      if (var9 != null) {
         var16 = false;
         boolean var17 = var2.field_1941.method_1682(this.h(), var11, var12);
         if (var17 && !var2.field_1941.method_1683(this.h(), var13, var14)) {
            var16 = true;
         }

         if (!var16) {
            var3 = var9.field_2406 * (float)var2.field_1932.field_3330;
            var4 = var9.field_2407 * (float)var2.field_1932.field_3331;
            var15 = true;
         } else {
            var10 = false;
         }
      }

      if (var15) {
         this.field_262 += var1;
         this.field_261 = 0;
      } else if (this.field_262 != 0.0F && var1 > 0.0F) {
         ++this.field_261;
         if (this.field_261 >= 3) {
            this.field_262 = 0.0F;
         }
      }

      if (!var10) {
         int var18 = class_296.method_2050(var3 * var2.field_1932.field_3334);
         int var19 = class_296.method_2050(var4 * var2.field_1932.field_3335);
         if (var11 != var18 || var12 != var19) {
            this.method_491(true);
         }

         this.dh = var3;
         this.di = var4;
      }

   }

   // $FF: renamed from: b (float) void
   public static strictfp void method_354(float var0) {
      class_236 var1 = class_236.method_1549();
      class_39[] var2 = class_39.field_126.method_1326();
      int var3 = class_39.field_126.size();
      var1.field_1950.method_2526(class_192.field_1625);

      int var4;
      class_44 var5;
      for(var4 = 0; var4 < var3; ++var4) {
         if (var2[var4] instanceof class_44) {
            var5 = (class_44)var2[var4];
            var5.bp = false;
            if ((var5.field_310 || var5.bq) && var5.method_431() && var5.field_328 <= var1.field_1921) {
               var5.bq = false;
               var5.field_310 = true;
               float var6;
               if (var5.bU) {
                  var6 = var5.by + 7.0F;
                  var5.field_328 = var1.field_1921 + 50 + var4 % 50;
               } else {
                  var6 = var5.by + 5.0F;
                  var5.field_328 = var1.field_1921 + 250 + var4 % 50;
               }

               var5.field_325 = 0;
               var1.field_1949.method_3234(var5.dh, var5.di, var6, var5, var0, field_324);
            }
         }
      }

      var1.field_1950.method_2527(class_192.field_1625);
      var1.field_1950.method_2526(class_192.field_1626);

      for(var4 = 0; var4 < var3; ++var4) {
         if (var2[var4] instanceof class_44) {
            var5 = (class_44)var2[var4];
            if (var5.field_310 && var5.method_431() && var5.field_328 > var1.field_1921) {
               var5.bp = true;
               var5.bq = true;

               for(int var9 = 0; var9 < var5.field_325; ++var9) {
                  if (var9 < var5.field_326.length) {
                     class_39 var10000 = var5.field_326[var9];
                     boolean var8 = false;
                     if (!var8) {
                        var5.method_355(var5.field_326[var9], var0, false);
                     }
                  }
               }
            }
         }
      }

      var1.field_1950.method_2527(class_192.field_1626);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, boolean) void
   private strictfp void method_355(class_39 var1, float var2, boolean var3) {
      if (var1 != this && var1.field_140 && this.bh && this.i() == var1.method_280() && this.H() == var1.method_282() && var1.field_182 == null && this.bX == null && this.be != var1 && var1.field_137 != this) {
         float var5 = class_296.method_2026(this.dh + this.bl, this.di + this.bm, var1.dh + var1.field_144, var1.di + var1.field_145);
         float var6 = this.by + var1.field_157;
         float var7;
         if (var3) {
            var7 = var5;
            if (var5 < var6 * var6) {
               var7 = 0.0F;
            }

            int var22;
            if (var1 instanceof class_44) {
               for(var22 = 0; var22 < ((class_44)var1).field_325; ++var22) {
                  if (((class_44)var1).field_326[var22] == this) {
                     return;
                  }
               }
            }

            if (this.field_326 == null) {
               this.field_326 = new class_39[10];
               this.field_327 = new float[10];
            }

            var22 = -1;

            int var23;
            for(var23 = 0; var23 < this.field_325; ++var23) {
               if (var7 < this.field_327[var23]) {
                  var22 = var23;
                  break;
               }
            }

            if (var22 == -1) {
               if (this.field_325 >= this.field_326.length) {
                  return;
               }

               var22 = this.field_325;
            }

            if (this.field_325 < this.field_326.length) {
               ++this.field_325;
            }

            for(var23 = this.field_325 - 1; var23 > var22; --var23) {
               this.field_326[var23] = this.field_326[var23 - 1];
            }

            this.field_326[var22] = var1;
            this.field_327[var22] = var7;
            return;
         }

         if (var5 < var6 * var6 && !var1.method_302(this, var2) && !this.a(var1, var2)) {
            var7 = class_296.method_2031(this.dh + this.bl, this.di + this.bm, var1.dh + var1.field_144, var1.di + var1.field_145);
            float var8 = (float)Math.sqrt((double)var5);
            float var9 = var6 - var8 + 0.001F;
            if (var9 <= 0.0F) {
               return;
            }

            int var10 = this.m(var1);
            int var11 = var1.method_221(this);
            int var12 = var10 > var11 ? var10 : var11;
            float var13;
            if (var12 != 0) {
               var13 = var9 / (float)var12 * var2;
               if (var13 > var9) {
                  var13 = var9;
               }

               var9 = var13;
            }

            var13 = 0.0F;
            float var14 = this.be();
            float var15 = var1.method_220();
            if (class_296.method_2042(this.bl) > 2.0F * var2 || class_296.method_2042(this.bm) > 2.0F * var2) {
               var14 *= 1.2F;
               if (class_296.method_2042(this.bl) > 8.0F * var2 || class_296.method_2042(this.bm) > 8.0F * var2) {
                  var14 *= 2.0F;
               }
            }

            if (class_296.method_2042(var1.field_144) > 2.0F * var2 || class_296.method_2042(var1.field_145) > 2.0F * var2) {
               var15 *= 1.2F;
               if (class_296.method_2042(var1.field_144) > 8.0F * var2 || class_296.method_2042(var1.field_145) > 8.0F * var2) {
                  var15 *= 2.0F;
               }
            }

            float var17;
            if (this.bk == var1.field_143) {
               boolean var16 = false;
               var17 = 1.7F;
               if (this.field_291 == var1) {
                  var15 *= var17;
                  var16 = true;
               }

               if (var1 instanceof class_44) {
                  class_44 var18 = (class_44)var1;
                  if (var18.field_291 == this) {
                     var14 *= var17;
                     var16 = true;
                  }

                  if (!var16) {
                     if (this.field_292 && var18.field_291 != null) {
                        var14 *= var17;
                     }

                     if (var18.field_292 && this.field_291 != null) {
                        var15 *= var17;
                     }
                  }
               }
            }

            if (var1 instanceof class_65) {
               var13 = var14 / (var14 + var15);
            }

            float var24 = 1.0F - var13;
            var17 = class_296.method_2099(var7);
            float var25 = class_296.method_2098(var7);
            if (var1 instanceof class_65) {
               var1.field_144 += var17 * var9 * var13;
               var1.field_145 += var25 * var9 * var13;
            }

            this.bl -= var17 * var9 * var24;
            this.bm -= var25 * var9 * var24;
            class_236 var19 = class_236.method_1549();
            this.field_287 = var1;
            this.field_288 = var19.field_1920;
            class_44 var20;
            if (var1 instanceof class_44) {
               var20 = (class_44)var1;
               var20.field_287 = this;
               var20.field_288 = var19.field_1920;
            }

            if (var1 instanceof class_44) {
               var20 = (class_44)var1;
               if (this.field_290 != 0 && this.field_290 == var20.field_290) {
                  class_512 var21;
                  if (this.method_400() == null) {
                     var21 = var20.method_400();
                     if (var21 != null && (var21.field_4667 == class_501.field_4595 || var21.field_4667 == class_501.field_4602)) {
                        var20.method_406();
                     }
                  }

                  if (var20.method_400() == null) {
                     var21 = var20.method_400();
                     if (var21 != null && (var21.field_4667 == class_501.field_4595 || var21.field_4667 == class_501.field_4602)) {
                        this.method_406();
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: K () int
   public strictfp int method_261() {
      return 1;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
   }

   // $FF: renamed from: L () void
   protected strictfp void method_357() {
      class_236 var1 = class_236.method_1549();
      if (this.bk == var1.field_1915) {
         var1.field_1939.field_948.method_1021(this);
      }

   }

   // $FF: renamed from: a (float, float, float) float
   public strictfp float method_358(float var1, float var2, float var3) {
      if (this.method_456()) {
         float var8 = class_296.method_2031(this.dh, this.di, var2, var3);
         return this.method_359(var1, var8);
      } else if (this.method_317() < 1) {
         return 0.0F;
      } else {
         int var4 = this.method_434();
         if (var4 == -1) {
            var4 = 0;
         }

         PointF var5 = this.method_479(var4);
         float var6 = class_296.method_2031(var5.field_2406, var5.field_2407, var2, var3);
         class_502 var7 = this.bV[var4];
         var7.field_4610 = 70.0F;
         return this.method_364(var1, var6, var4);
      }
   }

   // $FF: renamed from: a (float, float) float
   public strictfp float method_359(float var1, float var2) {
      boolean var3 = false;
      boolean var4 = false;
      if (this.bx && this.method_459()) {
         var3 = true;
         var4 = true;
      }

      return this.method_360(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (float, float, boolean, boolean) float
   public strictfp float method_360(float var1, float var2, boolean var3, boolean var4) {
      this.bw = var2;
      if (Math.abs(this.bv - var2) < 0.01F) {
         if (var3 && this.bx) {
            this.method_352(25);
            this.bx = false;
         }

         return 0.0F;
      } else {
         float var5 = class_296.method_2030(this.bv, var2, 360.0F);
         if (var3) {
            if (var4 && Math.abs(var5) > 100.0F) {
               var5 = class_296.method_2030(this.bv, var2 + 180.0F, 360.0F);
               if (!this.bx) {
                  this.method_352(25);
                  this.bx = true;
               }
            } else if (this.bx) {
               this.method_352(25);
               this.bx = false;
            }
         }

         if (Math.abs(var5) < 0.01F) {
            return 0.0F;
         } else {
            float var6;
            float var7;
            if (this.method_452() <= 0.0F) {
               var6 = var5 > 0.0F ? 1.0F : -1.0F;
               var7 = var6 * this.method_451() * var1;
               if (class_296.method_2042(var7) > class_296.method_2042(var5)) {
                  var7 = var5;
               }

               this.method_361(var7);
            } else {
               var6 = var5 > 0.0F ? 1.0F : -1.0F;
               var7 = class_296.method_2042(this.bt) / this.method_452();
               if (class_296.method_2042(var5) < var7) {
                  this.bt = class_296.method_2021(this.bt, var6 * this.method_452(), this.method_452() * var1);
               } else {
                  this.bt = class_296.method_2021(this.bt, var6 * this.method_451(), this.method_452() * var1);
               }

               float var8 = this.bt * var1;
               if (class_296.method_2042(var8) > class_296.method_2042(var5)) {
                  this.bt = 0.0F;
                  var8 = var5;
               }

               this.method_361(var8);
            }

            return var5;
         }
      }
   }

   // $FF: renamed from: g (float) void
   public strictfp void method_361(float var1) {
      this.bv += var1;
      if (this.bv > 180.0F) {
         this.bv -= 360.0F;
      }

      if (this.bv < -180.0F) {
         this.bv += 360.0F;
      }

      if (this.method_473()) {
         int var2 = this.method_317();

         for(int var3 = 0; var3 < var2; ++var3) {
            class_502 var4 = this.bV[var3];
            var4.field_4608 += var1;
            if (var4.field_4608 > 180.0F) {
               var4.field_4608 -= 360.0F;
            }

            if (var4.field_4608 < -180.0F) {
               var4.field_4608 += 360.0F;
            }
         }
      }

   }

   // $FF: renamed from: h (float) void
   public strictfp void method_362(float var1) {
      int var2 = this.method_317();

      for(int var3 = 0; var3 < var2; ++var3) {
         class_502 var4 = this.bV[var3];
         var4.field_4608 = var1;
      }

   }

   // $FF: renamed from: a (int, float) void
   public strictfp void method_363(int var1, float var2) {
      class_502 var3 = this.bV[var1];
      var3.field_4608 += var2;
   }

   // $FF: renamed from: a (float, float, int) float
   public strictfp float method_364(float var1, float var2, int var3) {
      class_502 var4 = this.bV[var3];
      float var5 = var4.field_4608;
      float var6 = class_296.method_2030(var5, var2, 360.0F);
      if (var6 == 0.0F) {
         return var6;
      } else {
         float var7 = this.method_454(var3);
         float var8;
         if (var7 <= 0.0F) {
            var8 = class_296.method_2030(var4.field_4608, var2, this.method_453(var3) * var1);
            this.method_363(var3, var8);
            var6 -= var8;
         } else {
            var8 = this.method_455(var3);
            float var9 = var6 > 0.0F ? 1.0F : -1.0F;
            float var10 = class_296.method_2042(var4.field_4609) / var8;
            boolean var11 = var6 > 0.0F == var4.field_4609 > 0.0F;
            if (class_296.method_2042(var6) < var10 && var11) {
               var4.field_4609 = class_296.method_2021(var4.field_4609, var9 * var8, var8 * var1);
            } else {
               var4.field_4609 = class_296.method_2021(var4.field_4609, var9 * this.method_453(var3), var7 * var1);
            }

            float var12 = var4.field_4609 * var1;
            if (class_296.method_2042(var12) > class_296.method_2042(var6)) {
               var4.field_4609 = 0.0F;
               var12 = var6;
            }

            this.method_363(var3, var12);
            var6 -= var12;
         }

         return var6;
      }
   }

   // $FF: renamed from: M () com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_365() {
      if (this.field_274) {
         class_512 var1 = this.method_400();
         if (var1 != null && (var1.field_4667 == class_501.field_4598 || var1.field_4667 == class_501.field_4601) && var1.field_4673 != null && !var1.field_4673.field_141) {
            return var1.field_4673;
         }
      }

      return null;
   }

   // $FF: renamed from: N () boolean
   public strictfp boolean method_366() {
      class_512 var1 = this.method_400();
      return var1 != null && var1.field_4667 == class_501.field_4601;
   }

   // $FF: renamed from: i (float) void
   public strictfp void method_367(float var1) {
      class_236 var2 = class_236.method_1549();
      this.be = null;
      if (this.bf != null) {
         this.bg = class_296.method_2020(this.bg, var1);
         this.be = this.bf;
         if (this.bg == 0.0F) {
            this.bf = null;
         }
      }

      if (this.field_285 != 0.0F) {
         this.field_285 = class_296.method_2020(this.field_285, var1);
      }

      if (this.bu != 0.0F) {
         this.field_263 = class_296.method_2020(this.field_263, var1);
      }

      class_512 var3 = this.method_400();
      float var4 = 0.0F;
      if (var3 == null) {
      }

      float var5 = 10.0F;
      this.field_277 = false;
      boolean var6 = true;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = this.field_278;
      this.field_278 = false;
      this.field_286 = false;
      this.field_284 = 150;
      if (var3 != null) {
         this.field_275 += var1;
         float var10 = var3.method_3258();
         float var11 = var3.method_3259();
         float var12 = class_296.method_2026(this.dh, this.di, var10, var11);
         float var14;
         float var15;
         boolean var16;
         boolean var17;
         if (var3.field_4667 != class_501.field_4595 && var3.field_4667 != class_501.field_4602 && var3.field_4667 != class_501.field_4604) {
            float var39;
            if (var3.field_4667 == class_501.field_4596) {
               class_280 var29 = this.method_462();
               if (var29 != class_280.field_2404) {
                  if (var3.field_4673 == null || var3.field_4673.field_141) {
                     if (this.field_270 != null && this.field_270.field_141) {
                        this.field_270 = null;
                     }

                     var14 = this.method_394(true);
                     this.method_372(var2, var1, var14);
                     if (this.field_270 != null) {
                        var3.field_4673 = this.field_270;
                        this.method_409();
                        this.method_413();
                     } else {
                        this.method_406();
                        var3 = null;
                     }
                  }
               } else {
                  if (var3 != null && (var3.field_4673 == null || var3.field_4673.field_141) && !this.field_303) {
                     if (this.field_270 != null && this.field_270.field_141) {
                        this.field_270 = null;
                     }

                     var14 = this.method_394(true) + 200.0F;
                     this.method_372(var2, var1, var14);
                     if (this.field_270 != null) {
                        var3.field_4673 = this.field_270;
                        this.method_409();
                        this.method_413();
                     } else {
                        this.field_303 = true;
                        this.field_302 = true;
                     }
                  }

                  if (var3 != null && (var3.field_4673 == null || var3.field_4673.field_141)) {
                     if (var3.field_4673 == null) {
                        this.method_406();
                        var3 = null;
                     } else if (!this.field_302) {
                        this.method_406();
                        var3 = null;
                     }
                  }

                  if (this.field_301 < -900.0F) {
                     var14 = class_296.method_2031(this.dh, this.di, var10, var11);
                     this.field_301 = var14;
                  }
               }

               if (var3 != null && !this.method_432() && !this.l()) {
                  this.method_406();
                  var3 = null;
               }

               if (var3 != null) {
                  if (this.field_291 != null) {
                     if (var12 < 490000.0F) {
                        if (var12 < 48400.0F) {
                           var6 = false;
                           var7 = true;
                        }

                        var14 = class_296.method_2026(this.field_291.dh, this.field_291.di, var10, var11);
                        if (var14 < 48400.0F) {
                           var6 = false;
                           var7 = true;
                        }

                        if (var14 < 270400.0F && this.method_440()) {
                           var6 = false;
                           var7 = true;
                        }
                     }

                     if (this.field_291.field_270 == var3.field_4673) {
                        var6 = false;
                        var7 = true;
                     }

                     if (var6) {
                        this.field_295 = 0.0F;
                     } else {
                        this.field_295 += var1;
                     }
                  } else {
                     this.field_295 = 500.0F;
                  }

                  var14 = this.method_435(var3.field_4673);
                  boolean var31 = true;
                  if (var12 < var14 * var14) {
                     if (this.field_270 != var3.field_4673) {
                        if (this.method_385(var3.field_4673)) {
                           this.field_270 = var3.field_4673;
                           this.field_271 = 10.0F;
                           this.method_485(-1);
                        }
                     } else {
                        this.field_271 = 10.0F;
                     }

                     var39 = var14;
                     if (!this.method_456()) {
                        var39 = var14 - 1.0F;
                        if (this.method_440()) {
                           var39 -= 2.0F;
                        }

                        if (this.method_445(0) > 5.0F) {
                           var39 -= 3.0F;
                        }
                     }

                     if (var12 < var39 * var39 && this.method_462() != class_280.field_2404 && (var3.field_4673 == null || this.method_383(var3.field_4673))) {
                        var31 = false;
                     }
                  }

                  if (var31) {
                     this.field_278 = true;
                     this.field_279 = var10;
                     this.field_280 = var11;
                     this.field_281 = 0;
                     if (var29 == class_280.field_2404) {
                        if (var12 < 10000.0F && this.bm()) {
                           this.field_302 = true;
                        }

                        if (this.field_302) {
                           if ((double)this.bP >= (double)this.method_461() * 0.6D && var12 >= 40000.0F) {
                              this.field_302 = false;
                              this.field_301 = -999.0F;
                              this.method_413();
                           } else {
                              this.field_279 += class_296.method_2099(this.field_301 + 180.0F) * 600.0F;
                              this.field_280 += class_296.method_2098(this.field_301 + 180.0F) * 600.0F;
                           }
                        }
                     }

                     this.field_281 = this.method_438(var3.field_4673);
                     if (this.field_285 > 90.0F) {
                        this.field_285 = 90.0F;
                     }

                     if (var12 < 810000.0F) {
                        if (this.bE() || this.method_440()) {
                           this.field_277 = true;
                        }

                        if (!var6 && this.field_295 < 120.0F) {
                           this.field_285 = 0.1F;
                           this.field_277 = true;
                        }
                     }
                  }
               }
            } else {
               boolean var18;
               boolean var19;
               boolean var20;
               class_39 var30;
               byte var35;
               if (var3.field_4667 == class_501.field_4597) {
                  var30 = class_39.method_216(var3.field_4668);
                  if (var30 == null) {
                     String var37 = "{build is null}";
                     if (var3.field_4668 != null) {
                        var37 = var3.field_4668.method_141();
                     }

                     class_236.method_1591("Build unit type missing: " + var37);
                     this.method_406();
                     var3 = null;
                  }

                  if (var3 != null) {
                     int var41 = var30.method_289(this) + this.r();
                     var35 = 30;
                     var16 = false;
                     if (var41 <= 30) {
                        var35 = 9;
                     }

                     if (var41 <= 25 && this.dj > 4.0F) {
                        var16 = true;
                     }

                     if (this.field_291 != null) {
                        class_512 var40 = this.field_291.method_400();
                        if (var40 == null || var40.field_4667 != class_501.field_4597) {
                           var6 = false;
                        }

                        if (var40 != null && !var3.method_3250(var40)) {
                           var6 = false;
                        }
                     }

                     var17 = false;
                     if (!class_205.method_1378(this.field_269, 200)) {
                        var17 = true;
                     }

                     if (var12 <= (float)(var41 * var41) && !var16) {
                        if (!var17 && (!this.method_433() || Math.abs(this.method_358(var1, var10, var11)) <= 30.0F)) {
                           var18 = false;
                           var19 = false;
                           var20 = false;
                           class_44 var21 = (class_44)class_47.method_515(var3.field_4668);
                           var21.bB = 0.0F;
                           var2.field_1932.method_2581(var3.field_4670 - var21.bW() + 1.0F, var3.field_4671 - var21.bX() + 1.0F);
                           var21.dh = (float)var2.field_1932.field_3355 + var21.bW();
                           var21.di = (float)var2.field_1932.field_3356 + var21.bX();
                           var21.method_258(this.bk);
                           if (var21.bS()) {
                              var21.method_258(class_107.field_1224);
                           }

                           if (var3.field_4669 != 1) {
                              var21.method_356(var3.field_4669);
                           }

                           var21.bT();
                           class_121 var22 = this.method_389(var3.field_4668, var3.field_4669);
                           if (var22 == null) {
                              class_236.method_1588("Unit '" + this.o().method_141() + "' can not build:" + var3.field_4668.method_141());
                              var19 = false;
                           } else {
                              if (var21.method_493()) {
                                 boolean var23 = true;
                                 if (!var3.field_4668.method_134() && !var22.method_1075() && this.bk.method_924() >= this.bk.method_925()) {
                                    var23 = false;
                                    if (this.bk == var2.field_1915) {
                                       var2.field_1939.method_705(var2.field_1939.field_946.field_1112);
                                    }
                                 }

                                 if (var23) {
                                    int var24 = var22.method_1046();
                                    if (this.bk.method_940(var24)) {
                                       var19 = true;
                                    } else {
                                       this.field_269 = var2.field_1921;
                                       if (this.field_275 < 1000.0F) {
                                          var18 = true;
                                          class_388 var25 = class_388.method_2444(this.bk, var21.dh, var21.di);
                                          if (var25 != null) {
                                             var25.field_3091 = true;
                                          }
                                       }
                                    }
                                 }
                              } else {
                                 class_44 var57 = var21.method_497();
                                 if (var57 != null && this.method_386(var57)) {
                                    var20 = true;
                                    var3.method_3256();
                                    var3.field_4667 = class_501.field_4598;
                                    var3.field_4673 = var57;
                                    this.method_413();
                                 }
                              }

                              if (var22.method_1049()) {
                                 class_454.method_2889("Builder tried to build a locked building:" + var22.method_1043(), true);
                                 var18 = false;
                                 var19 = false;
                              }
                           }

                           if (!var19) {
                              var21.method_184();
                              if (!var18 && !var20) {
                                 this.method_406();
                              }
                           } else {
                              this.method_392(var21);
                              var21.method_492();
                              var2.field_1941.method_1689(var21);
                              if (this.method_386(var21)) {
                                 var3.method_3256();
                                 var3.field_4667 = class_501.field_4598;
                                 var3.field_4673 = var21;
                                 this.method_413();
                              } else {
                                 this.method_406();
                              }

                              this.field_269 = -9999;
                           }
                        }
                     } else {
                        this.field_278 = true;
                        this.field_279 = var10;
                        this.field_280 = var11;
                        var5 = (float)var35;
                        if (var41 > 58) {
                           this.field_281 = (int)(((float)var41 - 41.0F) / ((float)var2.field_1932.field_3330 * 1.414F));
                        }

                        if (this.field_285 > 90.0F) {
                           this.field_285 = 90.0F;
                        }
                     }
                  }
               } else {
                  float var42;
                  class_512 var44;
                  if (var3.field_4667 != class_501.field_4598 && var3.field_4667 != class_501.field_4601) {
                     if (var3.field_4667 == class_501.field_4599) {
                        if (var3.field_4673 == null || var3.field_4673.field_141) {
                           this.method_406();
                           var3 = null;
                        }

                        if (var3 != null && !var3.field_4673.method_276(this)) {
                           this.method_406();
                        }

                        if (var3 != null) {
                           this.be = var3.field_4673;
                           if (var12 > 441.0F) {
                              this.field_278 = true;
                              this.field_279 = var10;
                              this.field_280 = var11;
                              var5 = 0.0F;
                              var5 = 8.0F;
                              if (this.field_285 > 90.0F) {
                                 this.field_285 = 90.0F;
                              }

                              this.field_284 = 18;
                              if (var12 < 48400.0F) {
                                 var6 = false;
                                 if (this.field_285 > 0.0F && this.field_334 == null) {
                                    this.field_277 = true;
                                 }
                              }

                              if (this.field_291 != null && !this.field_291.bj()) {
                                 var6 = false;
                              }
                           } else {
                              var30 = var3.field_4673;
                              var30.method_277(this);
                              this.method_406();
                           }
                        }
                     } else if (var3.field_4667 == class_501.field_4603) {
                        if (var3.field_4673 == null || var3.field_4673.field_141 || !var3.field_4673.method_228()) {
                           this.method_406();
                           var3 = null;
                        }

                        if (var3 != null && !this.o(var3.field_4673)) {
                           this.method_406();
                        }

                        if (var3 != null) {
                           this.be = var3.field_4673;
                           if (var12 > 441.0F) {
                              this.field_278 = true;
                              this.field_279 = var10;
                              this.field_280 = var11;
                              var5 = 0.0F;
                              var5 = 8.0F;
                              if (this.field_285 > 90.0F) {
                                 this.field_285 = 90.0F;
                              }

                              this.field_284 = 18;
                              if (var12 < 72900.0F) {
                                 var6 = false;
                                 if (this.field_285 > 0.0F && this.field_334 == null) {
                                    this.field_277 = true;
                                 }
                              }

                              if (this.field_291 != null && !this.field_291.bj()) {
                                 var6 = false;
                              }
                           } else {
                              this.p(var3.field_4673);
                              this.method_406();
                           }
                        }
                     } else if (var3.field_4667 == class_501.field_4605 || var3.field_4667 == class_501.field_4606) {
                        if (var3.field_4667 == class_501.field_4605 && (var3.field_4673 == null || var3.field_4673.field_141)) {
                           this.method_406();
                           var3 = null;
                        }

                        if (var3 != null) {
                           var30 = var3.field_4673;
                           boolean var43 = false;
                           var15 = this.by + var30.field_157;
                           if (this.bU) {
                              var15 += 80.0F;
                           } else {
                              var15 += 100.0F;
                           }

                           if (var12 > var15 * var15) {
                              this.field_278 = true;
                              this.field_279 = var10;
                              this.field_280 = var11;
                              var5 = 8.0F;
                              if (this.field_285 > 90.0F) {
                                 this.field_285 = 90.0F;
                              }

                              if (this.field_291 != null && !this.field_291.bj()) {
                                 var6 = false;
                              }
                           } else {
                              this.field_308 = 0;
                           }

                           var6 = false;
                           var7 = true;
                           if (!var43 && this.field_270 != null && !this.field_270.field_141 && this.method_393(this.field_270, false)) {
                              var39 = class_296.method_2026(this.dh, this.di, this.field_270.dh, this.field_270.di);
                              var42 = this.method_435(var3.field_4673);
                              var18 = false;
                              var19 = false;
                              if (var39 < var42 * var42) {
                                 var19 = true;
                              }

                              if (var19 && !this.method_370()) {
                                 var19 = false;
                              }

                              if (var12 < 22500.0F) {
                                 this.field_308 = 0;
                              }

                              if (!var19 && (this.field_308 == 1 || var12 > 122500.0F)) {
                                 var18 = true;
                                 this.field_308 = 1;
                              }

                              if (var12 > 302500.0F || this.field_308 == 1 && var12 > 202500.0F) {
                                 var18 = true;
                                 this.field_308 = 1;
                              }

                              if (!var18) {
                                 var43 = true;
                                 this.field_308 = 0;
                                 if (var19) {
                                    this.field_278 = false;
                                 } else {
                                    if (this.field_285 > 90.0F) {
                                       this.field_285 = 90.0F;
                                    }

                                    this.field_278 = true;
                                    this.field_279 = this.field_270.dh;
                                    this.field_280 = this.field_270.di;
                                    this.field_281 = 0;
                                    this.field_277 = true;
                                 }
                              }
                           }

                           if (!var43) {
                              class_39 var54 = var30.method_247(2.0F);
                              if (var54 != null && !this.method_393(var54, true)) {
                                 var54 = null;
                              }

                              if (var54 == null && this.field_308 != 1) {
                                 var54 = this.n(2.0F);
                                 if (var54 != null && !this.method_393(var54, true)) {
                                    var54 = null;
                                 }
                              }

                              if (var54 != null) {
                                 var43 = true;
                                 if (this.field_285 > 90.0F) {
                                    this.field_285 = 90.0F;
                                 }

                                 this.field_278 = true;
                                 this.field_279 = var54.dh;
                                 this.field_280 = var54.di;
                                 this.field_281 = 0;
                                 this.field_277 = true;
                              }
                           }

                           if (!var43 && this.method_386(var30) && (var30.field_167 < var30.field_168 || var30.field_160 < 1.0F) && this.method_386(var30)) {
                              var44 = this.method_395();
                              if (var44 != null) {
                                 var44.method_3265(var30);
                                 var44.field_4678 = true;
                                 var43 = true;
                                 if (this.field_285 > 20.0F) {
                                    this.field_285 = 20.0F;
                                 }
                              }
                           }

                           if (!var43 && this.method_284() && var30 instanceof class_44) {
                              class_44 var61 = (class_44)var30;
                              class_39 var47 = var61.method_365();
                              if (var47 != null && this.method_386(var47)) {
                                 class_512 var51 = this.method_395();
                                 if (var51 != null) {
                                    var51.method_3265(var47);
                                    var51.field_4678 = true;
                                    var43 = true;
                                    if (this.field_285 > 20.0F) {
                                       this.field_285 = 20.0F;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else {
                     if (var3 != null && (var3.field_4673 == null || var3.field_4673.field_141 || var3.field_4673.field_182 != null)) {
                        this.method_406();
                        var3 = null;
                     }

                     if (var3 != null && !this.method_386(var3.field_4673)) {
                        this.method_406();
                        var3 = null;
                     }

                     if (var3 != null && var3.field_4673 == this) {
                        this.method_406();
                        var3 = null;
                     }

                     boolean var32;
                     if (var3 != null && var3 != null && var3.field_4673 != null && var3.field_4673.method_316() != 0.0F) {
                        var32 = false;
                        if (var3.field_4667 == class_501.field_4598) {
                           var32 = true;
                        }

                        if (var3.field_4667 == class_501.field_4601 && !this.method_391()) {
                           var32 = true;
                        }

                        if (var32) {
                           this.method_406();
                           var3 = null;
                        }
                     }

                     if (var3 != null && var3.field_4667 == class_501.field_4601 && var3.field_4673.field_143 != this.bk && var3.field_4673.method_316() == 0.0F) {
                        var32 = true;
                        if (var2.method_1579() && this.bk.method_944(var3.field_4673.field_143)) {
                           var32 = false;
                        }

                        if (var32) {
                           this.method_406();
                           var3 = null;
                        }
                     }

                     if (var3 != null) {
                        int var38 = var3.field_4673.method_289(this) + this.r();
                        if (this.field_291 != null) {
                           var14 = class_296.method_2026(this.field_291.dh, this.field_291.di, var10, var11);
                           int var36 = var38 + 80;
                           if (var14 < (float)(var36 * var36)) {
                              var6 = false;
                           }

                           var44 = this.field_291.method_400();
                           if (var44 == null) {
                              var6 = false;
                           }

                           if (var44 != null && !var3.method_3250(var44)) {
                              var6 = false;
                           }
                        }

                        var14 = (float)var38;
                        if (this.field_274) {
                           var14 += 5.0F;
                        }

                        var35 = 30;
                        if (var38 <= 30) {
                           var35 = 9;
                        }

                        if (var12 > var14 * var14) {
                           if (this.method_432() && var3.field_4676 != 0.0F) {
                              this.field_278 = true;
                              this.field_279 = var10;
                              this.field_280 = var11;
                              var5 = (float)var35;
                              if (var38 > 58) {
                                 this.field_281 = (int)(((float)var38 - 41.0F) / ((float)var2.field_1932.field_3330 * 1.414F));
                              }

                              this.field_284 = this.field_281;
                              if (this.field_285 > 90.0F) {
                                 this.field_285 = 90.0F;
                              }
                           } else {
                              this.method_406();
                           }
                        } else {
                           int var46 = this.method_434();
                           if (var46 == -1) {
                              var46 = 0;
                           }

                           var42 = 0.0F;
                           if (this.method_433()) {
                              var42 = this.method_358(var1, var10, var11);
                           }

                           var18 = false;
                           if (Math.abs(var42) < 30.0F || !this.method_433()) {
                              var8 = true;
                              class_502 var45 = this.bV[var46];
                              if (var45.field_4612 < this.method_445(var46)) {
                                 var45.field_4612 += var1;
                              } else {
                                 var45.field_4612 = this.method_445(var46);
                                 var18 = true;
                              }
                           }

                           if (var18) {
                              class_39 var48 = var3.field_4673;
                              if (var3.field_4667 != class_501.field_4601) {
                                 this.method_502(var48, var1, var46);
                                 if (var48.field_160 < 1.0F) {
                                    float var49 = var48.method_295().method_132();
                                    if (var48.method_261() == 2) {
                                       var49 *= 0.5F;
                                    }

                                    if (var48.method_261() == 3) {
                                       var49 *= 0.25F;
                                    }

                                    var49 *= this.b(var48);
                                    var48.field_160 += var49 * var1;
                                    if (var48.field_160 >= 1.0F) {
                                       var48.field_160 = 1.0F;
                                       this.bk.method_922(true);
                                       if ((double)var49 < 0.3D && var48.field_143 == var2.field_1915) {
                                          var2.field_1939.field_948.method_1020(var48);
                                       }
                                    }
                                 } else {
                                    var48.field_160 = 1.0F;
                                    var48.field_167 += this.c(var48) * var1;
                                    if (var48.field_167 > var48.field_168) {
                                       var48.field_167 = var48.field_168;
                                       this.method_406();
                                    }
                                 }
                              } else {
                                 this.field_273 = class_296.method_2020(this.field_273, var1);
                                 float var58;
                                 if (this.field_273 == 0.0F) {
                                    this.field_273 = 5.0F;
                                    PointF var56 = this.method_478(0);
                                    class_390 var50 = var2.field_1938.method_2488(var48.dh, var48.di, var48.dj, class_393.field_3201, false, class_395.field_3222);
                                    if (var50 != null) {
                                       float var53 = (float)((double)var56.field_2406 + -8.0D + Math.random() * 16.0D);
                                       var58 = (float)((double)var56.field_2407 + -8.0D + Math.random() * 16.0D);
                                       float var59 = class_296.method_2031(var48.dh, var48.di - var48.dj, var53, var58);
                                       var50.field_3154 = class_296.method_2099(var59) * class_296.method_2033(2.0F, 4.0F);
                                       var50.field_3155 = class_296.method_2098(var59) * class_296.method_2033(2.0F, 4.0F);
                                       var50.field_3176 = 5;
                                       var50.field_3160 = 20.0F;
                                       var50.field_3161 = var50.field_3160;
                                       var50.field_3135 = true;
                                       var50.field_3143 = 0.8F;
                                       var50.field_3145 = 0.2F;
                                       var50.field_3144 = 1.0F;
                                    }
                                 }

                                 var20 = false;
                                 float var52 = 5.1F;
                                 boolean var55 = false;
                                 var58 = this.c(var48) * var52;
                                 if (var3.field_4673.method_316() > 0.0F) {
                                    var58 = var3.field_4673.method_316();
                                    var55 = true;
                                 }

                                 boolean var60 = false;
                                 if (this.field_275 < 200.0F) {
                                    if ((double)var48.field_160 < 0.5D) {
                                       var60 = true;
                                    } else if ((double)(var48.field_167 / var48.field_168) < 0.5D) {
                                       var60 = true;
                                    }
                                 }

                                 class_107 var10000;
                                 if (!var60) {
                                    if (var48.field_160 < 1.0F) {
                                       var48.field_160 = (float)((double)var48.field_160 - 0.001D * (double)var1 * (double)var52);
                                       if (var48.field_160 <= 0.0F) {
                                          var20 = true;
                                       }
                                    } else {
                                       float var62 = var58 * var1;
                                       var48.field_167 -= var62;
                                       var48.field_206 = 1000.0F;
                                       if (var55) {
                                          float var26 = var62 / var48.field_168;
                                          this.field_289 += var26 * (float)var48.method_309();
                                          if (this.field_289 > 1.0F) {
                                             var10000 = this.bk;
                                             var10000.field_1229 += (int)this.field_289;
                                             this.field_289 -= (float)((int)this.field_289);
                                          }
                                       }

                                       if (var48.field_167 <= 0.0F) {
                                          var20 = true;
                                       }
                                    }
                                 }

                                 if (var20 && !var48.field_141) {
                                    if (!var55) {
                                       var10000 = this.bk;
                                       var10000.field_1229 = (int)((double)var10000.field_1229 + (double)var48.method_309() * 0.8D);
                                    }

                                    var48.field_141 = true;
                                    var48.field_142 = (long)var2.field_1921;
                                    var48.method_184();
                                    if (var48 instanceof class_44 && var48.method_212()) {
                                       var2.field_1941.method_1689((class_44)var48);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            if (!this.method_432()) {
               this.method_406();
               var3 = null;
            }

            float var13 = 16.0F;
            if (var3 != null && var3.field_4667 == class_501.field_4604) {
               if (this.method_402() == 1) {
                  var13 = 30.0F;
                  if (!var9 || this.field_288 == var2.field_1920 || this.field_288 == var2.field_1920 - 1) {
                     var13 = 80.0F;
                  }
               } else {
                  var13 = 20.0F;
                  var14 = 30.0F;
                  if (!var9 || this.field_288 == var2.field_1920 || this.field_288 == var2.field_1920 - 1) {
                     var14 = 70.0F;
                  }

                  if (var12 < var14 * var14) {
                     this.method_398(var3);
                     this.method_406();
                     var3 = null;
                  }
               }
            }

            if (var3 != null) {
               if (var12 < var13 * var13) {
                  if (var3.field_4667 == class_501.field_4604) {
                     if (this.method_402() == 1) {
                     }
                  } else {
                     this.method_406();
                     var3 = null;
                  }
               } else {
                  this.field_278 = true;
                  this.field_279 = var10;
                  this.field_280 = var11;
                  this.field_281 = 0;
                  if (var3.field_4667 == class_501.field_4604) {
                     this.field_286 = true;
                     this.method_409();
                  }
               }
            }

            if (var3 != null) {
               if (var3.field_4667 == class_501.field_4602 || var3.field_4667 == class_501.field_4604) {
                  if (this.field_270 != null && !this.field_270.field_141 && this.method_393(this.field_270, false)) {
                     var14 = class_296.method_2026(this.dh, this.di, this.field_270.dh, this.field_270.di);
                     var15 = this.method_435(var3.field_4673);
                     var16 = false;
                     if (var14 < var15 * var15) {
                        var16 = true;
                     }

                     if (var16 && !this.method_370()) {
                        var16 = false;
                     }

                     if (var16) {
                        this.field_278 = false;
                     } else {
                        var17 = false;
                        if (this.method_440()) {
                           var17 = true;
                        }

                        if (var3.field_4667 == class_501.field_4604) {
                           var17 = true;
                        }

                        if (var17) {
                           if (this.field_285 > 90.0F) {
                              this.field_285 = 90.0F;
                           }

                           this.field_278 = true;
                           this.field_279 = this.field_270.dh;
                           this.field_280 = this.field_270.di;
                           this.field_281 = 0;
                           this.field_277 = true;
                        }
                     }
                  }

                  if (this.field_291 != null && this.field_291.field_270 != null) {
                     var6 = false;
                     var7 = true;
                  }
               }

               if (var3.field_4667 == class_501.field_4604) {
                  if (this.field_270 == null) {
                     class_39 var33 = this.n(3.0F);
                     if (var33 != null && this.method_393(var33, true)) {
                        if (this.field_285 > 90.0F) {
                           this.field_285 = 90.0F;
                        }

                        this.field_278 = true;
                        this.field_279 = var33.dh;
                        this.field_280 = var33.di;
                        this.field_281 = 0;
                        this.field_277 = true;
                     }
                  }

                  if (this.method_284() && (long)(var2.field_1920 % 10) == this.da % 10L) {
                     class_512 var34 = class_49.method_521(this, var1, 150.0F, true);
                     if (var34 != null) {
                        var34.field_4678 = false;
                        this.field_278 = false;
                        this.method_413();
                     }
                  }
               }
            }
         }
      }

      if (var3 != null && var3.field_4678 && this.field_266 > 1) {
         boolean var27 = true;
         class_512 var28 = this.method_401(1);
         if (var28 != null && (var28.field_4667 == class_501.field_4605 || var28.field_4667 == class_501.field_4604)) {
            var27 = false;
         }

         if (var27) {
            this.method_406();
            var3 = null;
         }
      }

      this.field_274 = var8;
      if (var3 == null) {
         this.field_278 = false;
      }

      this.method_375(var2, var1);
      this.method_368(var2, var1, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k, float, com.corrodinggames.rts.game.units.ar, float, float, boolean, boolean) void
   private strictfp void method_368(class_236 var1, float var2, class_512 var3, float var4, float var5, boolean var6, boolean var7) {
      boolean var8 = false;
      boolean var9 = this.method_431();
      if (this.field_334 != null) {
         this.method_419(var1);
      }

      if (this.field_291 != null && (this.field_291.bi || !this.field_291.bj())) {
         this.field_291 = null;
      }

      boolean var10 = false;
      if (this.field_278) {
         class_283 var11 = this.method_411();
         float var12 = 0.0F;
         float var13 = 0.0F;
         class_512 var14 = this.method_400();
         if (var14 == null) {
            var6 = false;
         }

         if (var14 != null) {
         }

         float var16;
         boolean var18;
         boolean var21;
         if (this.field_291 != null && var6) {
            int var26 = var1.field_1921 - this.field_291.field_300;
            if (var26 > 300 || this.field_262 > 1.0F) {
               this.field_264 += var2;
            }

            if (this.field_264 > 300.0F) {
               this.field_263 = 35.0F;
            }

            if (this.field_262 > 1.0F) {
               if (this.field_263 != 0.0F) {
                  this.field_263 = 35.0F;
               }

               if (this.field_264 > 10.0F) {
                  this.field_263 = 35.0F;
               }
            }

            float var17;
            if (this.field_263 == 0.0F) {
               this.method_413();
               var12 = this.field_291.dh + this.field_297;
               var13 = this.field_291.di + this.field_298;
               if (var26 < 950) {
                  class_283 var28 = null;
                  if (var28 == null && this.field_291.field_307 > 0 && this.field_291.field_305 + 0 >= this.field_291.field_307) {
                     var28 = this.field_291.method_421(0);
                  }

                  if (var28 == null && this.field_291.field_307 > 3 && this.field_291.field_305 + 3 >= this.field_291.field_307) {
                     var28 = this.field_291.method_421(3);
                  }

                  if (var28 != null) {
                     var10 = true;
                     var12 = var28.field_2428 + this.field_297;
                     var13 = var28.field_2429 + this.field_298;
                  }
               }

               if (field_258) {
               }

               var16 = class_296.method_2026(this.dh, this.di, var12, var13);
               var17 = 3600.0F;
               if (var26 < 500 && this.field_262 <= 1.0F) {
                  var17 = 8100.0F;
               }

               if (var16 < var17) {
                  this.field_264 = 0.0F;
               }

               var18 = false;
               class_512 var19 = this.field_291.method_400();
               boolean var20 = false;
               if (var19 != null && var3 != null && var19.field_4667 != var3.field_4667) {
                  var20 = true;
               }

               if (var19 == null || var20) {
                  this.field_265 += var2;
                  var21 = false;
                  if (var3 != null && (var3.field_4667 == class_501.field_4595 || var3.field_4667 == class_501.field_4602 || var3.field_4667 == class_501.field_4604)) {
                     var21 = true;
                  }

                  if (var21 && this.field_265 > 300.0F) {
                     if (var16 < 2500.0F) {
                        var18 = true;
                     }
                  } else if (var16 < 256.0F) {
                     var18 = true;
                  }
               }

               if (var18) {
                  var21 = false;
                  if (var19 == null) {
                     var21 = true;
                  }

                  if (var20) {
                     var21 = true;
                  }

                  if (var21) {
                     float var22 = this.method_359(var2, this.field_299);
                     if (Math.abs(var22) < 3.0F && var3 != null && var3.field_4667 == class_501.field_4595) {
                        this.method_406();
                     }
                  }
               } else {
                  var8 = true;
               }
            } else {
               var16 = class_296.method_2026(this.dh, this.di, this.field_291.dh, this.field_291.di);
               var17 = this.by + this.field_291.by + 10.0F;
               if (var16 < var17 * var17) {
                  this.field_264 = 0.0F;
                  this.field_263 = 0.0F;
               }

               if (var11 == null) {
                  if (this.field_285 == 0.0F && this.field_334 == null) {
                     this.field_285 = 500.0F;
                     var18 = false;
                     this.method_417(this.field_291.dh, this.field_291.di, 0, false, var18);
                  }
               } else {
                  var12 = var11.field_2428;
                  var13 = var11.field_2429;
                  var8 = true;
               }
            }
         } else if (this.bA != 0.0F) {
            var12 = this.field_279;
            var13 = this.field_280;
            var8 = true;
         } else {
            boolean var15 = false;
            if (this.field_334 == null) {
               if (var11 == null && this.field_285 == 0.0F) {
                  var15 = true;
               }

               if (this.field_285 == 0.0F && (this.bE() || this.method_440())) {
                  var16 = this.method_439();
                  if (class_296.method_2042(this.field_282 - this.field_279) > var16 || class_296.method_2042(this.field_283 - this.field_280) > var16) {
                     var15 = true;
                  }
               }

               if (var3 != null && this.field_285 == 0.0F && (var3.field_4667 == class_501.field_4599 || var3.field_4667 == class_501.field_4603)) {
                  var16 = 12.0F;
                  if (class_296.method_2042(this.field_282 - this.field_279) > var16 || class_296.method_2042(this.field_283 - this.field_280) > var16) {
                     var15 = true;
                  }
               }

               if (var3 != null) {
                  var16 = (float)this.field_284;
                  if (class_296.method_2042(this.field_282 - this.field_279) > var16 || class_296.method_2042(this.field_283 - this.field_280) > var16) {
                     if (this.field_285 > 30.0F) {
                        this.field_285 = 30.0F;
                     }

                     if (this.field_285 == 0.0F) {
                        var15 = true;
                     }
                  }
               }
            }

            if (var15) {
               this.field_285 = 500.0F;
               this.method_417(this.field_279, this.field_280, this.field_281, this.field_292, this.field_286);
            }

            if (var11 != null) {
               var12 = var11.field_2428;
               var13 = var11.field_2429;
               var8 = true;
            } else if (this.field_277) {
               var12 = this.field_279;
               var13 = this.field_280;
               var8 = true;
            }
         }

         if (var8 && var9) {
            float var27 = class_296.method_2031(this.dh, this.di, var12, var13);
            var16 = class_296.method_2026(this.dh, this.di, var12, var13);
            boolean var29 = false;
            if (this.method_460() > 0.95F) {
               var29 = true;
            } else if ((double)this.method_460() > 0.4D && this.field_294 <= 1 && this.field_305 > 0 && this.field_305 <= 3 && this.field_292 && var16 < 10000.0F) {
               var29 = true;
            }

            var18 = true;
            float var30 = 179.0F;
            if (this.field_270 != null && this.method_456() && this.method_469() && !this.method_440()) {
               this.bw = var27;
            } else {
               var30 = this.method_360(var2, var27, var18, var29);
            }

            float var31 = 20.0F;
            if (var16 > 361.0F) {
               var31 = 46.0F;
            }

            if (var16 > 3600.0F) {
               var31 = 89.0F;
            }

            if ((double)this.method_451() < 1.4D) {
               if (var16 > 6400.0F) {
                  var31 *= 0.5F;
               } else {
                  var31 = 17.0F;
               }
            }

            if ((double)this.method_451() < 1.1D) {
               var31 *= 0.7F;
            }

            if ((double)this.bu > 0.4D && var16 > 16900.0F) {
               var31 = 180.0F;
            }

            if (this.method_457() && this.field_307 == this.field_305) {
               var31 = 1.0F;
            }

            if (this.method_469()) {
               var31 = 180.0F;
            }

            var21 = this.field_305 == 1;
            if ((!var21 || var16 >= var5 * var5) && Math.abs(var30) < var31) {
               var4 = 1.0F;
               if (var10) {
                  var4 -= 0.15F;
               } else if (this.field_291 != null && var16 > 400.0F) {
                  var4 += 0.2F;
               }

               if (var16 < 9.0F) {
                  var4 = 0.0F;
               }
            }

            if (var21 && var4 != 0.0F) {
               if (var16 < 324.0F && this.method_467() < 0.13F && this.method_458() > 1.0F) {
                  var4 = 0.5F * var4;
               }

               if (var16 < 169.0F && this.method_467() < 0.15F && this.method_458() > 0.9F) {
                  var4 = 0.5F * var4;
               }
            }

            boolean var32 = false;
            if (!var21 && var16 < 256.0F) {
               var32 = true;
            }

            if (var21 && var16 < var5 * var5) {
               var32 = true;
            }

            if ((this.field_288 == var1.field_1920 || this.field_288 == var1.field_1920 - 1) && this.field_287 != null && this.field_287.method_255(var12, var13, 2.0F)) {
               var32 = true;
            }

            if (var4 > 0.0F) {
               this.field_276 += var2;
               if (this.field_276 > 200.0F && var16 < 3600.0F && this.field_305 >= 2) {
                  float var23 = this.field_276;
                  this.method_415();
                  this.field_276 = var23;
               }

               if (this.field_276 > 600.0F && this.field_305 >= 2) {
                  this.method_413();
               }

               if (this.field_276 > 40.0F && this.field_305 >= 2) {
                  class_283 var33 = this.field_304[1];
                  float var24 = class_296.method_2026(this.dh, this.di, var33.field_2428, var33.field_2429);
                  if (var24 < var16) {
                     float var25 = this.field_276;
                     this.method_415();
                     this.field_276 = var25;
                  }
               }
            }

            if (var32) {
               this.method_415();
               if (var21) {
                  this.field_264 = 0.0F;
                  this.field_263 = 0.0F;
               }

               if (!this.field_306 && this.field_291 == null && var21 && var3 != null && var3.field_4667 == class_501.field_4595) {
                  this.method_406();
               }
            }
         }
      }

      if (this.bx && !this.method_469()) {
         var4 = -var4 * this.method_460();
      }

      if (!this.method_468()) {
         if (this.bu < var4) {
            this.bu = class_296.method_2021(this.bu, var4, this.method_466() * var2);
         }

         if (this.bu > var4) {
            this.bu = class_296.method_2021(this.bu, var4, this.method_467() * var2);
         }
      } else {
         this.bu = var4;
      }

      this.bU = var8 && var9;
   }

   // $FF: renamed from: O () boolean
   @Deprecated
   public strictfp boolean method_369() {
      return this.field_270 != null;
   }

   // $FF: renamed from: P () boolean
   public strictfp boolean method_370() {
      if (this.field_270 != null && !this.field_270.field_141) {
         int var1 = this.method_317();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (this.bV[var2].field_4616 != null && this.method_444(var2)) {
               return true;
            }
         }
      }

      return false;
   }

   // $FF: renamed from: Q () com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_371() {
      if (this.field_270 != null && !this.field_270.field_141) {
         return this.field_270;
      } else {
         class_512 var1 = this.method_400();
         return var1 != null && var1.field_4673 != null && !var1.field_4673.field_141 ? var1.field_4673 : null;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k, float, float) void
   private strictfp void method_372(class_236 var1, float var2, float var3) {
      field_330.method_1807(var3);
      var1.field_1949.method_3233(this.dh, this.di, var3, this, var2, field_330);
      if (field_330.field_2245 != 0 && (this.field_270 == null || !this.method_378(this.field_270))) {
         field_331.method_1807(var3);
         var1.field_1949.method_3233(this.dh, this.di, var3, this, var2, field_331);
      }

   }

   // $FF: renamed from: R () boolean
   public strictfp boolean method_373() {
      return this.method_317() > 1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k, float) void
   private strictfp void method_374(class_236 var1, float var2) {
      int var3 = this.method_317();
      if (this.method_373()) {
         boolean var9 = false;

         int var5;
         for(var5 = 0; var5 < var3; ++var5) {
            class_502 var6 = this.bV[var5];
            if (this.method_450(var5) == -1) {
               boolean var7 = false;
               boolean var8 = false;
               if (this.method_384(var5, this.field_270, false, false)) {
                  var6.field_4616 = this.field_270;
               } else {
                  var9 = true;
                  if (var6.field_4616 == this.field_270) {
                     var6.field_4616 = null;
                  }
               }
            }
         }

         if (var9) {
            float var10 = this.method_394(false);
            field_333.method_1809(this);
            var1.field_1949.method_3233(this.dh, this.di, var10, this, var2, field_333);
         }

         for(var5 = 0; var5 < var3; ++var5) {
            int var11 = this.method_450(var5);
            if (var11 != -1) {
               this.bV[var5].field_4616 = this.bV[var11].field_4616;
            }
         }

      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.bV[var4].field_4616 = this.field_270;
         }

      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.k, float) void
   private strictfp void method_375(class_236 var1, float var2) {
      int var3 = this.method_317();
      boolean var4 = false;
      if (this.l()) {
         boolean var5 = false;
         if (this.field_270 != null && !this.method_393(this.field_270, false)) {
            this.field_270 = null;
         }

         if (this.field_270 != null) {
            var5 = !this.method_378(this.field_270);
         }

         this.field_271 = class_296.method_2020(this.field_271, var2);
         this.field_272 = class_296.method_2020(this.field_272, var2);
         float var6;
         if ((this.field_270 == null || var5) && this.field_271 == 0.0F && this.method_463()) {
            this.field_271 = 20.0F + this.dh % 5.0F + this.di % 5.0F;
            var6 = this.method_394(false);
            this.method_372(var1, var2, var6);
            if (this.field_270 != null) {
               this.field_272 = 0.0F;
            }
         }

         if (this.field_270 != null && this.field_272 == 0.0F) {
            this.field_272 = 20.0F + this.dh % 5.0F + this.di % 5.0F;
            this.method_374(var1, var2);
         }

         for(int var22 = 0; var22 < var3; ++var22) {
            this.bV[var22].field_4613 = false;
         }

         if (this.field_270 != null) {
            var6 = class_296.method_2026(this.dh, this.di, this.field_270.dh, this.field_270.di);
            float var7 = this.method_435(this.field_270);
            if (var6 < var7 * var7) {
               int var8 = this.method_434();

               int var9;
               class_502 var10;
               class_39 var11;
               for(var9 = 0; var9 < var3; ++var9) {
                  var10 = this.bV[var9];
                  var11 = var10.field_4616;
                  if (var11 != null) {
                     boolean var12 = var11 == this.field_270;
                     if (!var12 && !this.method_393(var11, true)) {
                        var10.field_4616 = null;
                     } else {
                        boolean var13 = false;
                        boolean var14 = !var12;
                        if (!this.method_384(var9, var11, false, var14)) {
                           var10.field_4616 = null;
                        } else {
                           PointF var15 = this.method_479(var9);
                           PointF var16 = this.method_483(var9);
                           var16.field_2406 += var11.dh;
                           var16.field_2407 += var11.di;
                           float var17 = class_296.method_2031(var15.field_2406, var15.field_2407, var16.field_2406, var16.field_2407);
                           if (this.method_450(var9) == -1 && var9 != var8) {
                              if (!this.method_456()) {
                                 var10.field_4610 = 70.0F;
                                 float var24 = this.method_364(var2, var17, var9);
                                 if (Math.abs(var24) < 5.0F) {
                                    var10.field_4613 = true;
                                 }
                              } else {
                                 boolean var18 = false;
                                 class_512 var19 = this.method_400();
                                 if (var19 != null && (var19.field_4667 == class_501.field_4597 || var19.field_4667 == class_501.field_4598 || var19.field_4667 == class_501.field_4601)) {
                                    var18 = true;
                                 }

                                 if (!var18 && (!this.field_278 || this.method_469())) {
                                    float var20 = this.method_359(var2, var17);
                                    if (Math.abs(var20) < 5.0F) {
                                       var10.field_4613 = true;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               for(var9 = 0; var9 < var3; ++var9) {
                  var10 = this.bV[var9];
                  var11 = var10.field_4616;
                  if (var11 != null) {
                     if (this.method_449(var9) && var10.field_4611 == 0.0F) {
                        var4 = true;
                     }

                     if (this.method_449(var9)) {
                        this.method_377(var2, var11, var9);
                     }
                  }
               }
            } else if (!this.field_278 && this.field_268 == class_281.field_2408 || this.field_268 == class_281.field_2412 || this.field_268 == class_281.field_2413) {
               this.field_277 = true;
               this.field_278 = true;
               this.field_279 = this.field_270.dh;
               this.field_280 = this.field_270.di;
               this.field_281 = 0;
            }
         }
      }

      if (this.field_329 && this.method_365() != null) {
         var4 = true;
      }

      for(int var21 = 0; var21 < var3; ++var21) {
         class_502 var23 = this.bV[var21];
         if (!var4 && var23.field_4612 != 0.0F) {
            var23.field_4612 = class_296.method_2020(var23.field_4612, this.method_448(var21) * var2);
         }
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_376(class_39 var1, int var2) {
   }

   // $FF: renamed from: a (float, com.corrodinggames.rts.game.units.aa, int) boolean
   public strictfp boolean method_377(float var1, class_39 var2, int var3) {
      class_502 var4 = this.bV[var3];
      int var5 = this.method_450(var3);
      if (var5 != -1) {
         var4.field_4608 = this.bV[var5].field_4608;
      }

      boolean var6 = this.method_446(var3);
      boolean var7 = false;
      if (var6) {
         if (var4.field_4612 < this.method_445(var3)) {
            if (var4.field_4612 == 0.0F) {
               this.method_376(var2, var3);
            }

            var4.field_4612 += var1;
         } else {
            var4.field_4612 = this.method_445(var3);
         }

         var7 = true;
      }

      if (var4.field_4611 == 0.0F && this.method_444(var3)) {
         boolean var8 = false;
         boolean var9 = false;
         if (!this.method_384(var3, var2, false, false)) {
            var4.field_4611 = -10.0F;
         } else {
            if (!var6) {
               if (var4.field_4612 < this.method_445(var3)) {
                  if (var4.field_4612 == 0.0F) {
                     this.method_376(var2, var3);
                  }

                  var4.field_4612 += var1;
               } else {
                  var7 = true;
               }
            }

            if (var7) {
               var4.field_4611 = this.method_441(var3) + this.method_447(var3);
               if (!var6) {
                  var4.field_4612 = 0.0F;
               }

               this.method_471(var2, var3);
               this.method_485(var3);
               return true;
            }
         }
      }

      return false;
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_378(class_39 var1) {
      float var2 = class_296.method_2026(this.dh, this.di, var1.dh, var1.di);
      float var3 = this.method_435(var1);
      return var2 < var3 * var3;
   }

   // $FF: renamed from: S () boolean
   public strictfp boolean method_379() {
      return false;
   }

   // $FF: renamed from: T () boolean
   public strictfp boolean method_380() {
      return true;
   }

   // $FF: renamed from: U () boolean
   public strictfp boolean method_381() {
      return true;
   }

   // $FF: renamed from: V () boolean
   public strictfp boolean method_382() {
      return true;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_383(class_39 var1) {
      int var2 = this.method_317();

      for(int var3 = 0; var3 < var2; ++var3) {
         boolean var4 = false;
         boolean var5 = false;
         if (this.method_384(var3, var1, false, false) && this.method_444(var3)) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (int, com.corrodinggames.rts.game.units.aa, boolean, boolean) boolean
   public strictfp boolean method_384(int var1, class_39 var2, boolean var3, boolean var4) {
      return var3 || !var4 || this.method_378(var2);
   }

   // $FF: renamed from: g (com.corrodinggames.rts.game.units.aa) boolean
   public final strictfp boolean method_385(class_39 var1) {
      if (var1.method_280()) {
         return this.method_380();
      } else if (var1.method_282()) {
         return this.method_379();
      } else {
         return !this.method_382() && !var1.method_304() ? false : this.method_381();
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_386(class_39 var1) {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) com.corrodinggames.rts.game.units.a.l
   public strictfp class_121 method_387(class_24 var1) {
      return this.method_389(var1, -1);
   }

   // $FF: renamed from: W () boolean
   public strictfp boolean method_388() {
      Iterator var1 = this.E().iterator();

      class_121 var2;
      do {
         if (!var1.hasNext()) {
            return false;
         }

         var2 = (class_121)var1.next();
      } while(!var2.method_1058());

      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, int) com.corrodinggames.rts.game.units.a.l
   public strictfp class_121 method_389(class_24 var1, int var2) {
      Iterator var3 = this.E().iterator();

      class_121 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class_121)var3.next();
         if (var4 instanceof class_131 && var4.method_1055() == var1 && (var2 == -1 || var2 == var4.method_1057())) {
            return var4;
         }
      } while(!(var4 instanceof class_125) || var4.method_1055() != var1);

      return var4;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ap) boolean
   public strictfp boolean method_390(class_24 var1) {
      return this.method_387(var1) != null;
   }

   // $FF: renamed from: X () boolean
   public strictfp boolean method_283() {
      return this.o().method_135();
   }

   // $FF: renamed from: Y () boolean
   public strictfp boolean method_284() {
      return this.o().method_135();
   }

   // $FF: renamed from: Z () boolean
   public strictfp boolean method_391() {
      return false;
   }

   // $FF: renamed from: h (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_392(class_39 var1) {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public final strictfp boolean method_393(class_39 var1, boolean var2) {
      if (this.bk != var1.field_143 && !var1.field_141 && this.bk.method_943(var1.field_143)) {
         if (this.field_268 == class_281.field_2411) {
            return false;
         } else if (this.field_268 == class_281.field_2410) {
            return false;
         } else if (var1.field_182 != null) {
            return false;
         } else if (!this.method_385(var1)) {
            return false;
         } else if (!var1.method_319(this)) {
            return false;
         } else if (!var2) {
            float var3 = class_296.method_2026(this.dh, this.di, var1.dh, var1.di);
            float var5 = this.method_394(false);
            float var4 = var5 * var5;
            return var3 < var4;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: b (boolean) float
   public strictfp float method_394(boolean var1) {
      float var2 = this.method_439();
      class_512 var3 = this.method_400();
      if (var3 != null && (var3.field_4667 == class_501.field_4602 || var3.field_4667 == class_501.field_4604 || var3.field_4667 == class_501.field_4605)) {
         if (var3.field_4667 == class_501.field_4604) {
            var2 += 110.0F;
         } else if (var3.field_4667 == class_501.field_4605) {
            var2 += 90.0F;
         } else {
            var2 += 20.0F;
         }

         if (var2 < 190.0F) {
            var2 = 190.0F;
         }
      }

      if (this.field_268 == class_281.field_2408) {
         var2 += 250.0F;
      } else if (this.field_268 == class_281.field_2412) {
         var2 += 150.0F;
      } else if (this.field_268 == class_281.field_2413) {
         var2 += 180.0F;
      } else if (var1) {
         var2 += 60.0F;
      }

      return var2;
   }

   // $FF: renamed from: aa () com.corrodinggames.rts.game.units.ar
   public strictfp class_512 method_395() {
      class_512 var1 = this.field_267[29];

      for(int var2 = 29; var2 >= 1; --var2) {
         this.field_267[var2] = this.field_267[var2 - 1];
      }

      this.field_267[0] = var1;
      if (this.field_266 < 29) {
         ++this.field_266;
      }

      if (this.field_267[0] == null) {
         this.field_267[0] = new class_512();
      }

      class_512 var3 = this.field_267[0];
      var3.method_3256();
      return var3;
   }

   // $FF: renamed from: ab () com.corrodinggames.rts.game.units.ar
   public strictfp class_512 method_396() {
      if (this.field_267[this.field_266] == null) {
         this.field_267[this.field_266] = new class_512();
      }

      class_512 var1 = this.field_267[this.field_266];
      var1.method_3256();
      if (this.field_266 < 29) {
         ++this.field_266;
      }

      return var1;
   }

   // $FF: renamed from: b (float, float) com.corrodinggames.rts.game.units.ar
   public strictfp class_512 method_397(float var1, float var2) {
      class_512 var3 = this.method_396();
      var3.method_3261(var1, var2);
      return var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ar) com.corrodinggames.rts.game.units.ar
   public strictfp class_512 method_398(class_512 var1) {
      class_512 var2 = this.method_396();
      var2.method_3271(var1);
      return var2;
   }

   // $FF: renamed from: ac () boolean
   public strictfp boolean method_399() {
      return this.method_400() == null;
   }

   // $FF: renamed from: ad () com.corrodinggames.rts.game.units.ar
   public strictfp class_512 method_400() {
      return this.field_266 == 0 ? null : this.field_267[0];
   }

   // $FF: renamed from: i (int) com.corrodinggames.rts.game.units.ar
   public strictfp class_512 method_401(int var1) {
      return this.field_267[var1];
   }

   // $FF: renamed from: ae () int
   public strictfp int method_402() {
      return this.field_266;
   }

   // $FF: renamed from: af () boolean
   public strictfp boolean method_403() {
      class_512 var1 = this.method_400();
      return var1 != null && var1.field_4667 == class_501.field_4596;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, float, float) boolean
   public strictfp boolean method_404(class_24 var1, float var2, float var3) {
      for(int var4 = 0; var4 < this.field_266; ++var4) {
         class_512 var5 = this.field_267[var4];
         if (var5.field_4667 == class_501.field_4597 && var5.field_4668 == var1 && class_296.method_2042(var5.field_4670 - var2) < 10.0F && class_296.method_2042(var5.field_4671 - var3) < 10.0F) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: j (int) void
   public strictfp void method_405(int var1) {
      if (this.field_266 <= var1) {
         throw new IndexOutOfBoundsException("completeWaypoint: waypointsCount:" + this.field_266 + ", waypointIndex:" + var1);
      } else if (var1 == 0) {
         this.method_406();
      } else {
         class_512 var2 = this.field_267[var1];

         for(int var3 = var1; var3 < this.field_266 - 1; ++var3) {
            this.field_267[var3] = this.field_267[var3 + 1];
         }

         this.field_267[this.field_266 - 1] = var2;
         --this.field_266;
      }
   }

   // $FF: renamed from: ag () void
   public strictfp void method_406() {
      this.field_275 = 0.0F;
      this.field_276 = 0.0F;
      this.field_302 = false;
      this.field_301 = -999.0F;
      this.field_303 = false;
      this.field_308 = 0;
      if (this.field_266 == 0) {
         this.method_413();
      } else if (this.field_266 == 1) {
         this.field_266 = 0;
         this.method_413();
      } else {
         class_512 var1 = this.field_267[0];

         for(int var2 = 0; var2 < this.field_266 - 1; ++var2) {
            this.field_267[var2] = this.field_267[var2 + 1];
         }

         this.field_267[this.field_266 - 1] = var1;
         --this.field_266;
         this.method_413();
      }
   }

   // $FF: renamed from: ah () void
   public strictfp void method_407() {
      this.field_275 = 0.0F;
      this.field_276 = 0.0F;
      this.field_302 = false;
      this.field_301 = -999.0F;
      this.field_303 = false;
      this.field_266 = 0;
      this.method_413();
      this.method_410();
      this.field_291 = null;
      this.field_265 = 0.0F;
      this.field_264 = 0.0F;
      this.field_308 = 0;
   }

   // $FF: renamed from: ai () void
   public strictfp void method_408() {
      for(int var1 = 0; var1 < this.field_266; ++var1) {
         class_512 var2 = this.field_267[var1];
         if (var2 != null && var2.field_4667 != class_501.field_4597 && var2.field_4667 != class_501.field_4598) {
            this.method_405(var1);
         }
      }

   }

   // $FF: renamed from: aj () void
   public strictfp void method_409() {
      this.field_291 = null;
      this.field_292 = false;
      this.field_296 = false;
      this.field_297 = 0.0F;
      this.field_298 = 0.0F;
      this.field_290 = 0;
   }

   // $FF: renamed from: ak () void
   public strictfp void method_410() {
      class_44 var1 = null;
      class_39[] var2 = class_39.field_126.method_1326();
      int var3 = 0;

      for(int var4 = class_39.field_126.size(); var3 < var4; ++var3) {
         class_39 var5 = var2[var3];
         if (var5 instanceof class_44) {
            class_44 var6 = (class_44)var5;
            if (var6.field_291 == this) {
               var6.field_291 = null;
               var1 = var6;
            }
         }
      }

      if (var1 != null) {
         class_512 var7 = var1.method_400();
         if (var7 != null) {
            class_295 var8 = var7.field_4674;
            if (var8 != null) {
               var8.method_2005();
            }
         }
      }

   }

   // $FF: renamed from: al () com.corrodinggames.rts.game.units.t
   public strictfp class_283 method_411() {
      return this.field_305 == 0 ? null : this.field_304[0];
   }

   // $FF: renamed from: a (int, float, float) void
   public strictfp void method_412(int var1, float var2, float var3) {
      if (this.field_304[var1] == null) {
         this.field_304[var1] = new class_283();
      }

      this.field_304[var1].field_2428 = var2;
      this.field_304[var1].field_2429 = var3;
   }

   // $FF: renamed from: am () void
   public strictfp void method_413() {
      this.field_305 = 0;
      this.field_306 = false;
      this.field_307 = 0;
      this.field_285 = 0.0F;
      this.field_276 = 0.0F;
   }

   // $FF: renamed from: an () void
   public strictfp void method_414() {
      this.method_413();
      this.field_304 = new class_283[120];
      this.field_325 = 0;
      this.field_326 = null;
      this.field_327 = null;
   }

   // $FF: renamed from: ao () void
   public strictfp void method_415() {
      this.field_276 = 0.0F;
      if (this.field_305 != 0) {
         if (this.field_305 == 1) {
            this.field_305 = 0;
         } else {
            class_283 var1 = this.field_304[0];

            for(int var2 = 0; var2 < this.field_305 - 1; ++var2) {
               this.field_304[var2] = this.field_304[var2 + 1];
            }

            this.field_304[this.field_305 - 1] = var1;
            --this.field_305;
         }
      }
   }

   // $FF: renamed from: ap () boolean
   public strictfp boolean method_416() {
      class_236 var1 = class_236.method_1549();
      boolean var2 = false;
      boolean var3 = false;
      if (this.bE()) {
         var2 = true;
      }

      var1.field_1932.method_2578(this.dh, this.di);
      int var4 = var1.field_1932.field_3355;
      int var5 = var1.field_1932.field_3356;
      if (var1.field_1941.method_1682(this.h(), var4, var5) && !var1.field_1941.method_1683(this.h(), var4, var5)) {
         var2 = true;
         var3 = true;
      }

      return var2;
   }

   // $FF: renamed from: a (float, float, int, boolean, boolean) void
   public strictfp void method_417(float var1, float var2, int var3, boolean var4, boolean var5) {
      class_238 var6 = class_236.method_1549().field_1941;
      class_236 var7 = class_236.method_1549();
      class_408 var8 = var7.field_1932;
      this.bU = true;
      boolean var9 = false;
      boolean var10 = false;
      if (this.bE()) {
         var9 = true;
      }

      var7.field_1932.method_2578(this.dh, this.di);
      int var11 = var7.field_1932.field_3355;
      int var12 = var7.field_1932.field_3356;
      if (var7.field_1941.method_1682(this.h(), var11, var12) && !var7.field_1941.method_1683(this.h(), var11, var12)) {
         var9 = true;
         var10 = true;
      }

      this.field_282 = var1;
      this.field_283 = var2;
      if (var9) {
         this.field_306 = false;
         this.field_305 = 0;
         float var21 = var8.method_2582(var1);
         float var22 = var8.method_2583(var2);
         if (var10) {
            float var23 = class_296.method_2031(this.dh, this.di, var21, var22);
            float var25 = class_296.method_2027(this.dh, this.di, var21, var22);
            if (var25 > 60.0F) {
               var25 = 60.0F;
               this.field_306 = true;
               if (this.field_285 > 10.0F) {
                  this.field_285 = 10.0F;
               }
            }

            var21 = this.dh + class_296.method_2099(var23) * var25;
            var22 = this.di + class_296.method_2098(var23) * var25;
         }

         this.method_412(this.field_305, var21, var22);
         ++this.field_305;
         this.field_307 = this.field_305;
      } else {
         class_295 var13 = null;
         boolean var14 = false;
         class_512 var15 = this.method_400();
         if (var15 != null) {
            var13 = var15.field_4674;
            if (var13 == null) {
            }
         }

         if (var13 != null && var13.field_2460 != null) {
            class_319 var16 = null;
            float var17 = 3600.0F;
            Iterator var18 = var13.field_2460.iterator();

            while(var18.hasNext()) {
               class_319 var19 = (class_319)var18.next();
               var14 = true;
               if (var19.field_2577 != null && var19.field_2577.method_1741() != null && class_296.method_2042(var19.field_2581 - var1) <= 10.0F && class_296.method_2042(var19.field_2582 - var2) <= 10.0F && var19.field_2583 + 180 >= var7.field_1920 && var19.field_2584 == this.h()) {
                  float var20 = class_296.method_2026(this.dh, this.di, var19.field_2579, var19.field_2580);
                  if (var20 < var17) {
                     var16 = var19;
                  }
               }
            }

            if (var16 != null) {
               this.field_334 = var16.field_2577;
               return;
            }
         }

         boolean var24 = true;
         this.field_334 = this.method_418(var1, var2, var3, var4, var24, var5);
      }
   }

   // $FF: renamed from: a (float, float, int, boolean, boolean, boolean) com.corrodinggames.rts.gameFramework.g.c
   public strictfp class_242 method_418(float var1, float var2, int var3, boolean var4, boolean var5, boolean var6) {
      class_238 var7 = class_236.method_1549().field_1941;
      class_236 var8 = class_236.method_1549();
      class_408 var9 = var8.field_1932;
      class_242 var10 = var7.method_1693(var5);
      var9.method_2578(this.dh, this.di);
      boolean var11 = false;
      if (this.method_459() || this.bx) {
         var11 = true;
      }

      var10.method_1739(this.h(), (short)var9.field_3355, (short)var9.field_3356, this.bv, var11);
      var9.method_2578(var1, var2);
      var10.method_1740((short)var9.field_3355, (short)var9.field_3356, (short)var3);
      var10.field_2156 = var4;
      var10.field_2157 = this.method_465();
      var10.field_2158 = var6;
      boolean var12 = this.bU;
      this.bU = true;
      var7.method_1694(var10, var5);
      this.bU = var12;
      return var10;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.k) void
   strictfp void method_419(class_236 var1) {
      if (this.field_334 != null) {
         class_408 var2 = var1.field_1932;
         LinkedList var3 = this.field_334.method_1741();
         if (var3 != null) {
            this.field_305 = 0;
            this.field_306 = false;
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               class_243 var5 = (class_243)var4.next();
               var2.method_2579(var5.field_2170, var5.field_2171);
               float var6 = (float)(var2.field_3355 + var2.field_3332);
               float var7 = (float)(var2.field_3356 + var2.field_3333);
               this.method_412(this.field_305, var6, var7);
               ++this.field_305;
               if (this.field_305 >= 120) {
                  this.field_306 = true;
                  break;
               }
            }

            boolean var8 = false;
            if (var3.size() != 0) {
               var2.method_2578(this.field_282, this.field_283);
               if (((class_243)var3.getLast()).field_2170 == var2.field_3355 && ((class_243)var3.getLast()).field_2171 == var2.field_3356) {
                  var8 = true;
               }
            }

            if (var8 && this.field_305 < 120) {
               this.method_412(this.field_305, this.field_282, this.field_283);
               ++this.field_305;
            }

            this.field_334 = null;
            if (this.field_305 >= 2) {
               PointF var9 = class_505.method_3244(this.h(), this.dh, this.di, this.field_304[1].field_2428, this.field_304[1].field_2429);
               if (var9 == null) {
                  this.method_415();
               }
            }

            if (this.field_305 > 120) {
               class_236.method_1588("activePathCount>maxPathNodes: activePathCount:" + this.field_305);
               this.field_305 = 120;
            }

            this.field_307 = this.field_305;
         }
      }

   }

   // $FF: renamed from: aq () long
   public strictfp long method_420() {
      long var1 = 0L;

      for(int var3 = 0; var3 < this.field_305; ++var3) {
         class_283 var4 = this.field_304[var3];
         if (var4 != null) {
            var1 += (long)Float.floatToRawIntBits(var4.field_2428);
            var1 += (long)Float.floatToRawIntBits(var4.field_2429);
         }
      }

      return var1;
   }

   // $FF: renamed from: k (int) com.corrodinggames.rts.game.units.t
   strictfp class_283 method_421(int var1) {
      return var1 >= this.field_305 ? null : this.field_304[var1];
   }

   // $FF: renamed from: d (float) void
   public strictfp void method_178(float var1) {
      super.d(var1);
   }

   // $FF: renamed from: ar () float
   public strictfp float method_422() {
      return 1.0F;
   }

   // $FF: renamed from: as () android.graphics.Paint
   public strictfp Paint method_423() {
      class_236 var1 = class_236.method_1549();
      PorterDuffColorFilter var2 = null;
      boolean var3 = true;
      int var5;
      if (this.dj < -0.3F) {
         int var4 = (int)((1.0F - -this.dj / 10.0F) * 130.0F + 45.0F);
         if (var4 < 45) {
            var4 = 45;
         }

         var5 = Color.method_3077(var4, 255, 255, 255);
      } else {
         var5 = -1;
      }

      if (this.bB < 1.0F && this.bB < this.method_422()) {
         float var6 = this.bB / this.method_422() * 220.0F;
         var5 = Color.method_3077((int)(20.0F + var6), 140, 255, 140);
         var2 = field_335;
      }

      if (this.bD) {
         if (this.bG) {
            var5 = Color.method_3077(200, 20, 255, 20);
            var2 = field_336;
         }

         if (this.bH) {
            var5 = Color.method_3077(200, 255, 20, 20);
            var2 = field_337;
         }

         if (this.bE) {
            var5 = Color.method_3077(50, 70, 70, 245);
            var2 = field_338;
            if (this.bH) {
               var5 = Color.method_3077(50, 255, 20, 20);
               var2 = field_337;
            }
         }

         if (this.bF) {
            var5 = Color.method_3077(150, 100, 100, 100);
         }
      }

      boolean var7 = var1.field_1937.renderAntiAlias;
      if (class_236.field_1900) {
         var7 = false;
         if (var1.field_1988 < 1.0F) {
            var7 = true;
         }
      }

      if (this.bC) {
         var7 = class_469.field_4087;
      }

      return this.method_350(var5, var2, var7);
   }

   // $FF: renamed from: l (int) float
   public strictfp float method_424(int var1) {
      return 1.0F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      super.c(var1);
      if (!this.bt()) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         Paint var3 = this.method_423();
         float var4 = this.bJ();
         PointF var5;
         if (this.dp) {
            var5 = this.bV();
            float var6 = this.dh + var5.field_2406 - var2.field_1965;
            float var7 = this.di + var5.field_2407 - var2.field_1966 - this.dj;
            if (var4 != 1.0F) {
               var2.field_1935.method_89();
               var2.field_1935.method_93(var4, var4, var6, var7);
            }

            this.method_430();
            var2.field_1935.method_65(this.field_259, var6, var7, this.d(false) - 90.0F, var3);
            if (var4 != 1.0F) {
               var2.field_1935.method_90();
            }
         } else {
            var5 = this.bV();
            RectF var10 = this.bL();
            var10.method_1972(var5.field_2406, var5.field_2407 - this.dj);
            Rect var11 = this.a_(false);
            float var8 = var10.method_1966();
            float var9 = var10.method_1967();
            var2.field_1935.method_89();
            if (var4 != 1.0F) {
               var2.field_1935.method_93(var4, var4, var8, var9);
            }

            this.method_430();
            var2.field_1935.method_91(this.d(false), var8, var9);
            var2.field_1935.method_68(this.field_259, var11, var10, var3);
            var2.field_1935.method_90();
         }

         return true;
      }
   }

   // $FF: renamed from: j (float) void
   public strictfp void method_425(float var1) {
      class_236 var2 = class_236.method_1549();
      if (field_258 && this.field_291 != null) {
         cz.method_2788(Color.method_3077(100, 0, 155, 155));
         var2.field_1935.method_96(this.dh - var2.field_1965, this.di - var2.field_1966, this.field_291.dh - var2.field_1965, this.field_291.di - var2.field_1966, cz);
      }

   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return this.dj > 0.0F && this.bB >= 1.0F && !this.bE;
   }

   // $FF: renamed from: at () android.graphics.PointF
   public strictfp PointF method_427() {
      field_339.method_1960(this.method_428(), this.method_429());
      return field_339;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 0.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 0.0F;
   }

   // $FF: renamed from: au () boolean
   public strictfp boolean method_430() {
      if (this.field_260 != null && this.method_426()) {
         class_236 var1 = class_236.method_1549();
         if (!var1.field_1995 && this.by < 18.0F && (double)this.dj < 0.5D) {
            return true;
         } else if (!var1.field_1996 && this.by < 28.0F && this.dj < 5.0F) {
            return true;
         } else {
            PointF var2 = this.method_427();
            float var3 = this.dh + var2.field_2406 - var1.field_1965;
            float var4 = this.di + var2.field_2407 - var1.field_1966;
            var1.field_1935.method_65(this.field_260, var3, var4, this.d(true) - 90.0F, field_314);
            return true;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: o_ () boolean
   public strictfp boolean method_288() {
      class_236 var1 = class_236.method_1549();
      return RectF.method_1976(var1.field_1979, this.bK());
   }

   // $FF: renamed from: C () boolean
   public abstract boolean method_431();

   // $FF: renamed from: av () boolean
   public strictfp boolean method_432() {
      return this.method_431();
   }

   // $FF: renamed from: a_ () boolean
   public strictfp boolean method_433() {
      return true;
   }

   // $FF: renamed from: aw () int
   public strictfp int method_434() {
      return -1;
   }

   // $FF: renamed from: i (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_435(class_39 var1) {
      return this.method_440() && var1 != null ? this.method_439() + this.by + var1.field_157 : this.method_439();
   }

   // $FF: renamed from: j (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_436(class_39 var1) {
      return this.method_440() && var1 != null ? this.method_437() + this.by + var1.field_157 : this.method_437();
   }

   // $FF: renamed from: ax () float
   public strictfp float method_437() {
      return this.method_439();
   }

   // $FF: renamed from: k (com.corrodinggames.rts.game.units.aa) int
   public strictfp int method_438(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      int var3 = 0;
      float var4 = this.method_436(var1);
      if (var4 > 58.0F) {
         var3 = (int)((var4 - 41.0F) / ((float)var2.field_1932.field_3330 * 1.414F));
      }

      return var3;
   }

   // $FF: renamed from: m () float
   public abstract float method_439();

   // $FF: renamed from: ay () boolean
   public strictfp boolean method_440() {
      return false;
   }

   // $FF: renamed from: b (int) float
   public abstract float method_441(int var1);

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: az () java.util.ArrayList
   public strictfp ArrayList method_443() {
      ArrayList var1 = new ArrayList();
      if (this.l()) {
         int var2 = this.method_317();

         for(int var3 = 0; var3 < var2; ++var3) {
            float var4 = this.method_442(var3);
            if (var4 != 0.0F) {
               float var5 = this.method_441(var3);
               if (var5 == 9000.0F) {
                  var5 = 0.0F;
               }

               boolean var6 = false;
               Iterator var7 = var1.iterator();

               while(var7.hasNext()) {
                  class_285 var8 = (class_285)var7.next();
                  if (var8.field_2434 == var4 && (var8.field_2435 == var5 || var5 == 0.0F || var8.field_2435 == 0.0F)) {
                     ++var8.field_2437;
                     if (var8.field_2435 == 0.0F) {
                        var8.field_2435 = var5;
                     }

                     var6 = true;
                     break;
                  }
               }

               if (!var6) {
                  class_285 var9 = new class_285();
                  var9.field_2434 = var4;
                  var9.field_2435 = var5;
                  var9.field_2436 = this.method_445(var3);
                  var1.add(var9);
               }
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: n (int) boolean
   public strictfp boolean method_444(int var1) {
      return true;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: o (int) boolean
   public strictfp boolean method_446(int var1) {
      return false;
   }

   // $FF: renamed from: p (int) float
   public strictfp float method_447(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_448(int var1) {
      return 4.0F;
   }

   // $FF: renamed from: q (int) boolean
   public strictfp boolean method_449(int var1) {
      int var2 = this.method_450(var1);
      return var2 == -1 ? this.bV[var1].field_4613 : this.bV[var2].field_4613;
   }

   // $FF: renamed from: r (int) int
   public strictfp int method_450(int var1) {
      return -1;
   }

   // $FF: renamed from: t () float
   public abstract float method_451();

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return -1.0F;
   }

   // $FF: renamed from: c (int) float
   public abstract float method_453(int var1);

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return -1.0F;
   }

   // $FF: renamed from: t (int) float
   public strictfp float method_455(int var1) {
      return this.method_454(var1);
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return false;
   }

   // $FF: renamed from: aA () boolean
   public strictfp boolean method_457() {
      return false;
   }

   // $FF: renamed from: s () float
   public abstract float method_458();

   // $FF: renamed from: aB () boolean
   public strictfp boolean method_459() {
      return this.method_460() > 0.95F;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return 0.6F;
   }

   // $FF: renamed from: aD () float
   public strictfp float method_461() {
      return 0.0F;
   }

   // $FF: renamed from: aE () com.corrodinggames.rts.game.units.b
   public strictfp class_280 method_462() {
      return class_280.field_2401;
   }

   // $FF: renamed from: aF () boolean
   public strictfp boolean method_463() {
      return true;
   }

   // $FF: renamed from: aG () boolean
   public strictfp boolean method_464() {
      return true;
   }

   // $FF: renamed from: aH () int
   public strictfp int method_465() {
      return 0;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 99.0F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 99.0F;
   }

   // $FF: renamed from: aI () boolean
   public strictfp boolean method_468() {
      return false;
   }

   // $FF: renamed from: aJ () boolean
   public strictfp boolean method_469() {
      return false;
   }

   // $FF: renamed from: b (int, float) boolean
   public strictfp boolean method_470(int var1, float var2) {
      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public abstract void method_471(class_39 var1, int var2);

   // $FF: renamed from: aK () boolean
   public strictfp boolean method_472() {
      return false;
   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return 1;
   }

   // $FF: renamed from: aM () boolean
   public strictfp boolean method_473() {
      return true;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: u (int) float
   public strictfp float method_475(int var1) {
      return 99999.0F;
   }

   // $FF: renamed from: v (int) float
   public strictfp float method_476(int var1) {
      return this.bx && this.method_459() ? this.bv + 180.0F : this.bv;
   }

   // $FF: renamed from: aN () android.graphics.PointF
   public strictfp PointF method_477() {
      int var1 = this.method_434();
      return var1 == -1 ? this.method_478(0) : this.method_478(var1);
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      class_502 var2 = this.bV[var1];
      float var3 = this.method_474(var1);
      float var4 = this.method_456() ? this.bv : var2.field_4608;
      PointF var5 = this.method_479(var1);
      float var6 = var5.field_2406 + class_296.method_2099(var4) * var3;
      float var7 = var5.field_2407 + class_296.method_2098(var4) * var3;
      field_340.method_1960(var6, var7);
      return field_340;
   }

   // $FF: renamed from: x (int) android.graphics.PointF
   public strictfp PointF method_479(int var1) {
      class_502 var2 = this.bV[var1];
      float var3 = this.dh;
      float var4 = this.di;
      float var5 = this.method_480(var1);
      if (var2.field_4611 != 0.0F && var5 != 0.0F) {
         float var6 = this.method_481(var1);
         float var7 = this.method_482(var1);
         float var8 = 0.0F;
         float var9 = this.method_441(var1) - var2.field_4611;
         if (var9 < var6) {
            var8 = var9 / var6 * var5;
         } else if (var9 < var7 + var6) {
            var8 = var5 - (var9 - var6) / var7 * var5;
         }

         if (var8 != 0.0F) {
            var3 += class_296.method_2099(var2.field_4608) * var8;
            var4 += class_296.method_2098(var2.field_4608) * var8;
         }
      }

      field_341.method_1960(var3, var4);
      return field_341;
   }

   // $FF: renamed from: y (int) float
   public strictfp float method_480(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: z (int) float
   public strictfp float method_481(int var1) {
      return 4.0F;
   }

   // $FF: renamed from: A (int) float
   public strictfp float method_482(int var1) {
      return 6.0F;
   }

   // $FF: renamed from: B (int) android.graphics.PointF
   public strictfp PointF method_483(int var1) {
      PointF var2 = field_342;
      var2.method_1960(0.0F, 0.0F);
      class_502 var3 = this.bV[var1];
      var2.field_2406 += var3.field_4614;
      var2.field_2407 += var3.field_4615;
      return var2;
   }

   // $FF: renamed from: C (int) float
   public strictfp float method_484(int var1) {
      return 0.6F;
   }

   // $FF: renamed from: D (int) void
   public strictfp void method_485(int var1) {
      if (var1 != -1) {
         class_502 var4 = this.bV[var1];
         var4.field_4614 = 0.0F;
         var4.field_4615 = 0.0F;
         if (this.field_270 != null && this.method_484(var1) != 0.0F) {
            float var5 = this.field_270.field_157 * this.method_484(var1);
            var4.field_4614 += (float)class_296.method_2014(this, (int)(-var5), (int)var5, 1 + var1);
            var4.field_4615 += (float)class_296.method_2014(this, (int)(-var5), (int)var5, 2 + var1);
         }

      } else {
         int var2 = this.method_317();

         for(int var3 = 0; var3 < var2; ++var3) {
            this.method_485(var3);
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.r) void
   public strictfp void method_486(class_282 var1) {
      class_236 var2 = class_236.method_1549();
      if (var1 == class_282.field_2426) {
         var2.field_1933.method_3323(class_525.field_4757, 0.8F, this.dh, this.di);
         var2.field_1938.method_2460(this.dh, this.di, this.dj);
         var2.field_1938.method_2485(class_395.field_3225);
         class_390 var3 = var2.field_1938.method_2479(this.dh, this.di, this.dj, -1127220);
         if (var3 != null) {
            var3.field_3145 = 0.2F;
            var3.field_3144 = 2.0F;
            var3.field_3179 = 2;
            var3.field_3160 = 45.0F;
            var3.field_3161 = var3.field_3160;
            var3.field_3159 = 0.0F;
         }
      } else if (var1 == class_282.field_2424) {
         var2.field_1933.method_3323(class_525.field_4757, 0.8F, this.dh, this.di);
         var2.field_1938.method_2460(this.dh, this.di, this.dj);
      } else {
         float var5;
         if (var1 == class_282.field_2421) {
            var5 = 1.0F + class_296.method_2033(-0.07F, 0.07F);
            var2.field_1933.method_3324(class_525.field_4756, 0.4F, var5, this.dh, this.di);
            var2.field_1938.method_2463(this.dh, this.di, this.dj);
         } else if (var1 == class_282.field_2425) {
            var5 = 1.0F + class_296.method_2033(-0.07F, 0.07F);
            var2.field_1933.method_3324(class_525.field_4756, 0.8F, var5, this.dh, this.di);
            var2.field_1938.method_2463(this.dh, this.di, this.dj);
            var2.field_1938.method_2485(class_395.field_3225);
            class_390 var4 = var2.field_1938.method_2479(this.dh, this.di, this.dj, -1127220);
            if (var4 != null) {
               var4.field_3145 = 0.2F;
               var4.field_3144 = 2.0F;
               var4.field_3179 = 2;
               var4.field_3160 = 45.0F;
               var4.field_3161 = var4.field_3160;
               var4.field_3159 = 0.0F;
            }
         } else {
            var5 = 1.0F + class_296.method_2033(-0.07F, 0.07F);
            var2.field_1933.method_3324(class_525.field_4756, 0.8F, var5, this.dh, this.di);
            var2.field_1938.method_2463(this.dh, this.di, this.dj);
         }
      }

      if (var1 != class_282.field_2421) {
         var2.field_1938.method_2480(this.dh, this.di, this.dj, 0);
         if (!this.bf()) {
            this.method_487();
         }

         if (!this.bP()) {
            class_35.method_194(this.dh, this.di);
            class_35.method_195(this.dh, this.di);
            this.method_489();
         }
      }

   }

   // $FF: renamed from: aO () void
   public strictfp void method_487() {
      class_236 var1 = class_236.method_1549();
      float var2 = 1.0F;
      float var3 = 1.0F;
      int var4 = this.method_488();
      if (var4 >= 10) {
         var2 = 1.2F;
         var3 = 1.4F;
      }

      if (var4 >= 20) {
         var2 = 1.5F;
         var3 = 1.7F;
      }

      if (this.dj > -1.0F) {
         for(int var5 = 0; var5 < var4; ++var5) {
            var1.field_1938.method_2483(this.dh, this.di, this.dj, var2, var3);
         }
      }

   }

   // $FF: renamed from: aP () int
   public strictfp int method_488() {
      if (this.ca()) {
         return 8;
      } else {
         return this.aZ() ? 7 : 4;
      }
   }

   // $FF: renamed from: aQ () void
   public strictfp void method_489() {
      if (!this.bP()) {
         class_36.method_199(this.dh, this.di);
      }

   }

   // $FF: renamed from: b_ () int
   public strictfp int method_490() {
      return 15;
   }

   // $FF: renamed from: c (boolean) void
   public strictfp void method_491(boolean var1) {
      class_236 var2 = class_236.method_1549();
      if (this.bX == null) {
         int var3 = this.method_490();
         var2.field_1932.method_2614(this.dh, this.di, var3, this.bk, var1);
      }
   }

   // $FF: renamed from: aR () void
   public strictfp void method_492() {
      class_236 var1 = class_236.method_1549();
      RectF var2 = new RectF();
      var2.method_1971(this.bs());
      var2.field_2417 *= (float)var1.field_1932.field_3331;
      var2.field_2419 *= (float)var1.field_1932.field_3331;
      var2.field_2416 *= (float)var1.field_1932.field_3330;
      var2.field_2418 *= (float)var1.field_1932.field_3330;
      var2.method_1972(this.dh, this.di);
      var2.method_1972(-this.bW(), -this.bX());
      float var3 = 10.0F;
      var2.field_2417 -= var3;
      var2.field_2419 += var3;
      var2.field_2416 -= var3;
      var2.field_2418 += var3;
      class_199 var4 = class_34.method_189();
      Iterator var5 = var4.iterator();

      while(var5.hasNext()) {
         class_34 var6 = (class_34)var5.next();
         if (var6 instanceof class_39) {
            class_39 var7 = (class_39)var6;
            if (var7 != this && var7.method_254(var2)) {
               if (var7 instanceof class_44 && var7.field_141) {
                  var7.method_184();
               }

               if (var7 instanceof class_42) {
                  ((class_42)var7).method_344();
               }
            }
         }
      }

   }

   // $FF: renamed from: aS () boolean
   public strictfp boolean method_493() {
      class_236 var1 = class_236.method_1549();
      if (this.o().method_138()) {
         var1.field_1932.method_2578(this.dh, this.di);
         class_416 var2 = var1.field_1932.method_2587(var1.field_1932.field_3355, var1.field_1932.field_3356);
         if (var2 == null || !var2.field_3428) {
            return false;
         }
      }

      if (this.method_496()) {
         return false;
      } else {
         if (!this.o().method_138()) {
            Rect var10 = this.bs();
            Point var3 = this.a(var1.field_1932, field_343);
            int var4 = var3.field_4722;
            int var5 = var3.field_4723;
            class_24 var6 = this.o();
            class_503 var7 = var6.method_137();

            for(int var8 = var4 + var10.field_2352; var8 <= var4 + var10.field_2354; ++var8) {
               for(int var9 = var5 + var10.field_2353; var9 <= var5 + var10.field_2355; ++var9) {
                  if (!class_47.method_512(var6, var7, var8, var9, false)) {
                     return false;
                  }
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: E (int) void
   public strictfp void method_494(int var1) {
      class_236 var2 = class_236.method_1549();
      if (!this.o().method_138()) {
         Rect var3 = this.bs();
         Point var4 = this.a(var2.field_1932, field_344);
         int var5 = var4.field_4722;
         int var6 = var4.field_4723;
         class_24 var7 = this.o();
         int var8 = var5 + var3.field_2352;
         int var9 = var6 + var3.field_2353;
         int var10 = var5 + var3.field_2354;
         int var11 = var6 + var3.field_2355;
         if (var1 != -2) {
            var2.field_1932.method_2601(var8, var9, var10, var11, (int)var2.field_1965, (int)var2.field_1966, var2.field_1935, true, var1);
         }
      }

   }

   // $FF: renamed from: l (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_495(class_39 var1) {
      float var2 = class_296.method_2026(this.dh, this.di, var1.dh, var1.di);
      float var3 = 9.0F;
      if (!var1.method_212()) {
         var3 = this.by + var1.field_157;
         if (var3 < 11.0F) {
            var3 = 11.0F;
         }
      }

      return var2 < var3 * var3;
   }

   // $FF: renamed from: aT () boolean
   public strictfp boolean method_496() {
      boolean var1 = false;
      if (!this.aZ()) {
         var1 = true;
      }

      class_39[] var2 = class_39.field_126.method_1326();
      int var3 = 0;

      for(int var4 = class_39.field_126.size(); var3 < var4; ++var3) {
         class_39 var5 = var2[var3];
         if (var5 != this && (var1 || var5.method_212()) && !var5.field_141 && this.method_495(var5)) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: aU () com.corrodinggames.rts.game.units.p
   public strictfp class_44 method_497() {
      Iterator var1 = class_39.field_126.iterator();

      while(var1.hasNext()) {
         class_39 var2 = (class_39)var1.next();
         if (var2 != this && var2 instanceof class_44) {
            class_44 var3 = (class_44)var2;
            if (!var3.bi && var3.bk == this.bk && var3.o() == this.o() && this.n(var3)) {
               return var3;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      this.method_407();
      this.method_414();
      super.a();
   }

   // $FF: renamed from: aV () void
   public strictfp void method_251() {
      this.field_291 = null;
      this.field_270 = null;
      this.method_407();
      this.method_414();
      super.aV();
   }

   // $FF: renamed from: aW () void
   public strictfp void method_253() {
      super.aW();
   }

   // $FF: renamed from: aX () int
   public strictfp int method_308() {
      byte var1 = 0;
      int var2 = var1 * 31 + super.aX();
      var2 = var2 * 31 + (int)(this.method_458() * 100.0F);
      var2 = var2 * 31 + (int)(this.method_451() * 100.0F);
      var2 = var2 * 31 + (int)(this.method_439() * 100.0F);
      var2 = var2 * 31 + (int)this.method_441(0);
      var2 = var2 * 31 + (int)(this.method_466() * 100.0F);
      return var2;
   }

   // $FF: renamed from: k (float) android.graphics.PointF
   strictfp PointF method_311(float var1) {
      PointF var2 = this.method_498(var1);
      cJ.method_1960(this.dh + var2.field_2406, this.di + var2.field_2407);
      return cJ;
   }

   // $FF: renamed from: l (float) android.graphics.PointF
   public strictfp PointF method_498(float var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      if (this.method_431() && this.field_262 == 0.0F) {
         if (this.method_468()) {
            var2 = this.br * var1;
            var3 = this.bs * var1;
         } else if (this.bu != 0.0F) {
            float var4 = this.bv;
            if (this.method_469()) {
               var4 = this.bw;
            }

            float var5 = this.method_458() * this.bu * var1;
            var2 = class_296.method_2099(var4) * var5;
            var3 = class_296.method_2098(var4) * var5;
         }
      }

      field_345.method_1960(var2, var3);
      return field_345;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.u) boolean
   public strictfp boolean method_499(class_284 var1) {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l) void
   public strictfp void method_500(class_121 var1) {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, float, float) boolean
   public strictfp boolean method_501(class_121 var1, float var2, float var3) {
      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, int) void
   public strictfp void method_502(class_39 var1, float var2, int var3) {
      this.field_273 = class_296.method_2020(this.field_273, var2);
      if (this.field_273 == 0.0F) {
         this.field_273 = 5.0F;
         if (this.method_288()) {
            PointF var4 = this.method_477();
            class_236 var5 = class_236.method_1549();
            class_390 var6 = var5.field_1938.method_2488(var4.field_2406, var4.field_2407, this.dj, class_393.field_3201, false, class_395.field_3222);
            if (var6 != null) {
               float var7 = (float)((double)var1.dh + -8.0D + Math.random() * 16.0D);
               float var8 = (float)((double)var1.di + -8.0D + Math.random() * 16.0D);
               float var9 = class_296.method_2031(var4.field_2406, var4.field_2407, var7, var8);
               var6.field_3154 = class_296.method_2099(var9) * class_296.method_2033(2.0F, 4.0F);
               var6.field_3155 = class_296.method_2098(var9) * class_296.method_2033(2.0F, 4.0F);
               var6.field_3176 = 6;
               var6.field_3160 = 20.0F;
               var6.field_3161 = var6.field_3160;
               var6.field_3135 = true;
               var6.field_3143 = 0.8F;
               var6.field_3145 = 0.2F;
               var6.field_3144 = 1.0F;
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, com.corrodinggames.rts.game.units.aa, float, boolean) void
   // $FF: synthetic method
   static void method_503(class_44 var0, class_39 var1, float var2, boolean var3) {
      var0.method_355(var1, var2, var3);
   }

   static {
      field_314.a(128, 255, 255, 255);
      field_314.method_2824();
      field_315 = new PointF();
      field_320 = new Paint();
      field_322 = method_351(false);
      field_323 = method_351(true);
      field_324 = new p$1();
      field_330 = new class_252(true);
      field_331 = new class_252(false);
      field_332 = new class_254(true);
      field_333 = new class_254(false);
      field_335 = new PorterDuffColorFilter(Color.method_3076(200, 255, 200), Mode.MULTIPLY);
      field_336 = new PorterDuffColorFilter(Color.method_3076(70, 255, 70), Mode.MULTIPLY);
      field_337 = new PorterDuffColorFilter(Color.method_3076(255, 40, 40), Mode.MULTIPLY);
      field_338 = new PorterDuffColorFilter(Color.method_3076(20, 20, 255), Mode.MULTIPLY);
      field_339 = new PointF();
      field_340 = new PointF();
      field_341 = new PointF();
      field_342 = new PointF();
      field_343 = new Point();
      field_344 = new Point();
      field_345 = new PointF();
   }
}
