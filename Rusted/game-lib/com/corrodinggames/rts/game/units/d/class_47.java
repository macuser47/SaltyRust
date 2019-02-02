package com.corrodinggames.rts.game.units.d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.b.class_388;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.c
public abstract class class_47 extends class_44 {
   // $FF: renamed from: m com.corrodinggames.rts.gameFramework.h.e
   class_306 field_348;
   // $FF: renamed from: n android.graphics.Rect
   public Rect field_349 = new Rect();
   // $FF: renamed from: o android.graphics.Rect
   public Rect field_350 = new Rect();
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_351 = null;
   // $FF: renamed from: q com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_352 = new class_306[10];
   // $FF: renamed from: r int
   int field_353 = 1;
   // $FF: renamed from: s android.graphics.Point
   static Point field_354 = new Point();
   // $FF: renamed from: t android.graphics.Paint
   protected static Paint field_355 = new Paint();
   // $FF: renamed from: u int
   int field_356 = 0;

   // $FF: renamed from: ce () boolean
   public strictfp boolean method_506() {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2541(this.field_353);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      if (var1.method_3006() >= 15) {
         int var2 = var1.method_3011();
         this.method_508(var2);
      }

      super.method_175(var1);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ap, float, float) boolean
   public static strictfp boolean method_507(class_24 var0, float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      class_44 var4 = (class_44)class_39.method_216(var0);
      var3.field_1932.method_2581(var1, var2);
      var4.dh = (float)var3.field_1932.field_3355 + var4.bW();
      var4.di = (float)var3.field_1932.field_3356 + var4.bW();
      boolean var5 = var4.method_493();
      return var5;
   }

   // $FF: renamed from: H (int) void
   public strictfp void method_508(int var1) {
      this.field_353 = var1;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_352[this.bk.method_963()];
   }

   // $FF: renamed from: cf () void
   public static strictfp void method_509() {
      class_236 var0 = class_236.method_1549();
      field_351 = var0.field_1935.method_60(R$drawable.unit_icon_building);
      field_352 = class_107.method_948(field_351);
   }

   public strictfp class_47(boolean var1) {
      super(var1);
      this.bv = -90.0F;
      this.bh = false;
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      this.a(class_282.field_2424);
      return false;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1941.method_1689(this);
      if (this.bB < 1.0F) {
         this.a(class_282.field_2421);
         return false;
      } else {
         this.field_356 = 0;
         return this.method_510();
      }
   }

   // $FF: renamed from: bs () android.graphics.Rect
   public strictfp Rect method_239() {
      return this.field_350;
   }

   // $FF: renamed from: br () android.graphics.Rect
   public strictfp Rect method_238() {
      return this.field_349;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, com.corrodinggames.rts.game.units.ac, int, int, int) boolean
   public static strictfp boolean method_511(class_24 var0, class_503 var1, int var2, int var3, int var4) {
      class_236 var5 = class_236.method_1549();
      class_408 var6 = var5.field_1932;
      if (!var6.method_2584(var2, var3)) {
         return false;
      } else {
         boolean var7 = false;
         if (var6.field_3344 && var5.field_1915.field_1242 != null) {
            if (!var6.field_3346 && var5.field_1915.field_1242[var2][var3] == 10) {
               return false;
            }

            var7 = var5.field_1915.field_1242[var2][var3] >= 5;
         }

         if (method_512(var0, var1, var2, var3, var7)) {
            if (var0.method_138()) {
               class_416 var8 = var6.method_2587(var2, var3);
               return var8 != null && var8.field_3428;
            } else {
               return !class_388.method_2440(var5.field_1915, var2, var3, var4);
            }
         } else {
            return false;
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, com.corrodinggames.rts.game.units.ac, int, int, boolean) boolean
   public static strictfp boolean method_512(class_24 var0, class_503 var1, int var2, int var3, boolean var4) {
      class_236 var5 = class_236.method_1549();
      if (!var5.field_1932.method_2584(var2, var3)) {
         return false;
      } else if (var0 != class_469.field_4036 && var1 != class_503.field_4621) {
         class_416 var6 = var5.field_1932.method_2587(var2, var3);
         if (var6 != null && var6.field_3428) {
            return var0.method_138();
         } else if (var1 == class_503.field_4620) {
            return true;
         } else if (var1 == class_503.field_4622) {
            return !var5.field_1941.method_1684(var5.field_1941.field_2115, var2, var3);
         } else if (var1 == class_503.field_4623) {
            return !var5.field_1941.method_1684(var5.field_1941.field_2116, var2, var3);
         } else if (var1 == class_503.field_4624) {
            return !var5.field_1941.method_1684(var5.field_1941.field_2117, var2, var3);
         } else {
            return !var5.field_1941.method_1685(var5.field_1941.field_2112, var2, var3, var4);
         }
      } else {
         return !var5.field_1941.method_1684(var5.field_1941.field_2113, var2, var3);
      }
   }

   // $FF: renamed from: a (int, int) com.corrodinggames.rts.game.units.aa
   public static strictfp class_39 method_513(int var0, int var1) {
      class_236 var2 = class_236.method_1549();
      var2.field_1932.method_2579(var0, var1);
      field_354.method_3291(var2.field_1932.field_3355 + var2.field_1932.field_3332, var2.field_1932.field_3356 + var2.field_1932.field_3333);
      class_39[] var3 = class_39.field_126.method_1326();
      int var4 = 0;

      for(int var5 = class_39.field_126.size(); var4 < var5; ++var4) {
         class_39 var6 = var3[var4];
         if (var6.method_212() && !var6.field_141 && var6.method_256(field_354)) {
            return var6;
         }
      }

      return null;
   }

   // $FF: renamed from: q (com.corrodinggames.rts.game.units.aa) int
   public strictfp int method_289(class_39 var1) {
      return 0;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ap, int) int
   public static strictfp int method_514(class_24 var0, int var1) {
      if (var0 == null) {
         throw new RuntimeException("type is null");
      } else {
         return var0.method_131(var1);
      }
   }

   // $FF: renamed from: g (com.corrodinggames.rts.game.units.ap) com.corrodinggames.rts.game.units.aa
   public static strictfp class_39 method_515(class_24 var0) {
      if (var0 == null) {
         throw new RuntimeException("type is null");
      } else {
         return var0.method_128();
      }
   }

   // $FF: renamed from: C () boolean
   public strictfp boolean method_431() {
      return false;
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_279() {
      return class_503.field_4617;
   }

   // $FF: renamed from: i () boolean
   public strictfp boolean method_280() {
      return false;
   }

   // $FF: renamed from: H () boolean
   public strictfp boolean method_282() {
      return false;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 0.0F;
   }

   // $FF: renamed from: a_ () boolean
   public strictfp boolean method_433() {
      return false;
   }

   // $FF: renamed from: f () android.graphics.Paint
   public strictfp Paint method_516() {
      class_236 var1 = class_236.method_1549();
      PorterDuffColorFilter var2 = null;
      int var3;
      if (this.bB < 1.0F) {
         var3 = Color.method_3077((int)(40.0F + this.bB * 200.0F), 140, 255, 140);
         var2 = aB;
      } else {
         var3 = Color.method_3077(255, 255, 255, 255);
      }

      if (this.bD) {
         if (this.bG) {
            var3 = Color.method_3077(200, 20, 255, 20);
            var2 = aC;
         }

         if (this.bH) {
            var3 = Color.method_3077(200, 255, 20, 20);
            var2 = aD;
         }

         if (this.bE) {
            var3 = Color.method_3077(70, 70, 70, 245);
            var2 = aE;
            if (this.bH) {
               var3 = Color.method_3077(70, 255, 20, 20);
               var2 = aD;
            }
         }

         if (this.bF) {
            var3 = Color.method_3077(150, 100, 100, 100);
         }
      }

      boolean var4 = var1.field_1937.renderAntiAlias;
      if (class_236.field_1900) {
         var4 = false;
         if (var1.field_1988 < 1.0F) {
            var4 = true;
         }
      }

      if (this.bC) {
         var4 = class_469.field_4087;
      }

      return this.a(var3, var2, var4);
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      class_236 var2 = class_236.method_1549();
      if (!this.bt()) {
         return false;
      } else {
         int var3 = this.field_356 * this.dl;
         byte var4 = 0;
         cA = this.bL();
         cB.method_1911(var3, var4, var3 + this.dl, var4 + this.dm);
         var2.field_1935.method_68(this.G, cB, cA, this.method_516());
         return true;
      }
   }

   // $FF: renamed from: d (float) void
   public strictfp void method_178(float var1) {
      if (this.bt()) {
         super.method_178(var1);
         if (this.field_348 != null) {
            class_236 var2 = class_236.method_1549();
            if (this.method_506()) {
               cA = this.bL();
               var2.field_1935.method_71(this.field_348, this.dh - (float)((int)(this.field_348.field_2535 + 0.1F)) - var2.field_1965, this.di - (float)((int)(this.field_348.field_2536 + 0.1F)) - var2.field_1966, this.method_516());
            } else {
               byte var3 = 0;
               byte var4 = 0;
               cA = this.bL();
               cB.method_1911(var3, var4, var3 + this.dl, var4 + this.dm);
               var2.field_1935.method_68(this.field_348, cB, cA, this.method_516());
            }

         }
      }
   }

   // $FF: renamed from: aZ () boolean
   public strictfp boolean method_212() {
      return true;
   }
}
