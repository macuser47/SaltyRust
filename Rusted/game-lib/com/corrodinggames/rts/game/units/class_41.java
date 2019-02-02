package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.w
public class class_41 extends class_40 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_223 = new class_306[2];
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   class_306 field_224;
   // $FF: renamed from: c int
   int field_225;
   // $FF: renamed from: d int
   int field_226 = 0;
   // $FF: renamed from: e float
   float field_227;
   // $FF: renamed from: f float
   float field_228;
   // $FF: renamed from: g int
   int field_229 = 0;
   // $FF: renamed from: h int
   int field_230 = 0;
   // $FF: renamed from: i float
   float field_231;
   // $FF: renamed from: j float
   float field_232;
   // $FF: renamed from: k boolean
   boolean field_233 = false;
   // $FF: renamed from: l float
   float field_234;
   // $FF: renamed from: m float
   float field_235;
   // $FF: renamed from: n float
   float field_236;
   // $FF: renamed from: o float
   float field_237;
   // $FF: renamed from: p float
   float field_238;
   // $FF: renamed from: q float
   float field_239;
   // $FF: renamed from: r boolean
   boolean field_240;
   // $FF: renamed from: s android.graphics.Point
   static Point field_241 = new Point();
   // $FF: renamed from: t com.corrodinggames.rts.game.units.x
   public static class_253 field_242 = new class_253();
   // $FF: renamed from: u android.graphics.Rect
   Rect field_243 = new Rect();

   // $FF: renamed from: b () void
   public static void method_332() {
      class_236 var0 = class_236.method_1549();
      field_223[0] = var0.field_1935.method_60(R$drawable.fire);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2541(this.field_225);
      var1.method_2541(this.field_226);
      var1.method_2542(this.field_227);
      var1.method_2539(0);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_175(class_463 var1) {
      this.field_225 = var1.method_3011();
      this.field_226 = var1.method_3011();
      this.field_227 = var1.method_3012();
      var1.method_3009();
      super.a(var1);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_333() {
      return this.field_224;
   }

   // $FF: renamed from: e () boolean
   public boolean method_250() {
      return false;
   }

   public class_41(boolean var1) {
      super(var1);
      this.method_334(0);
      this.by = 20.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 100.0F;
      this.bI = this.bJ;
      this.bv = -90.0F;
      this.bh = false;
      this.field_237 = 0.05F;
      this.field_238 = 120.0F;
      this.I(3);
   }

   // $FF: renamed from: a (int) void
   public void method_334(int var1) {
      this.field_225 = var1;
      if (this.field_225 == 0) {
         this.J(20);
         this.K(20);
         this.field_229 = 0;
         this.field_230 = 0;
         this.field_224 = field_223[0];
      } else {
         throw new RuntimeException("Fire type:" + this.field_225 + " is not supported");
      }
   }

   // $FF: renamed from: d () void
   public void method_335() {
      this.field_233 = true;
      this.field_231 = (float)class_296.method_2014(this, -5, 5, 1);
      this.field_232 = (float)class_296.method_2014(this, -5, 5, 2);
      this.field_227 = (float)class_296.method_2014(this, 1, 10, 3);
      this.field_226 = class_296.method_2014(this, 0, 2, 4);
      this.field_228 = (float)class_296.method_2014(this, 7, 13, 5);
      class_236 var1 = class_236.method_1549();
      class_408 var2 = var1.field_1932;
      var1.field_1932.method_2578(this.dh, this.di);
      int var3 = var1.field_1932.field_3355;
      int var4 = var1.field_1932.field_3356;
      if (!var2.method_2584(var3, var4)) {
         this.field_234 = 0.0F;
         this.field_235 = 0.0F;
         this.field_236 = 2.0F;
      } else {
         class_416[][] var5 = var1.field_1932.field_3337.method_2699();
         class_416 var6 = var5[var3][var4];
         boolean var7 = false;
         if (var6.field_3425 || var6.field_3427 || var6.field_3430) {
            var7 = true;
         }

         if (var7) {
            this.field_234 = 0.0F;
            this.field_235 = 0.0F;
            this.field_236 = 2.0F;
         } else {
            this.field_234 = 5.0E-4F;
            this.field_235 = 1.0F;
            this.field_236 = 0.3F;
            this.field_237 += (float)class_296.method_2014(this, 0, 10, 10) / 1000.0F;
         }
      }
   }

   // $FF: renamed from: a (float) void
   public void method_176(float var1) {
      super.a(var1);
      if (!this.field_233) {
         this.method_335();
      }

      if (this.field_237 < this.field_235) {
         this.field_237 += this.field_234 * var1;
         if (this.field_237 > this.field_235) {
            this.field_237 = this.field_235;
         }
      }

      if (this.field_237 > this.field_236) {
         this.field_239 = (float)((double)this.field_239 + 0.01D * (double)var1);
         if (!this.field_240 && this.field_239 > 1.0F || this.field_239 > 8.0F) {
            this.field_239 = (float)class_296.method_2014(this, 0, 10, 10) / 1000.0F;
            this.method_336();
         }
      }

      this.field_227 += var1;
      if (this.field_227 > 10.0F) {
         this.field_227 = 0.0F;
         ++this.field_226;
         if (this.field_226 > 3) {
            this.field_226 = 0;
         }
      }

      if (this.field_237 < 0.0F) {
         this.aW();
      }

   }

   // $FF: renamed from: f () void
   public void method_336() {
      this.field_240 = true;
      this.method_337(-1, -1);
      this.method_337(0, -1);
      this.method_337(1, -1);
      this.method_337(-1, 0);
      this.method_337(1, 0);
      this.method_337(-1, 1);
      this.method_337(0, 1);
      this.method_337(1, 1);
   }

   // $FF: renamed from: a (int, int) void
   public void method_337(int var1, int var2) {
      class_236 var3 = class_236.method_1549();
      float var4 = (float)((int)(this.dh + (float)(var1 * var3.field_1932.field_3330)));
      float var5 = (float)((int)(this.di + (float)(var2 * var3.field_1932.field_3331)));
      class_41 var6 = method_338(var4, var5);
      if (var6 == null) {
         class_41 var7 = new class_41(false);
         var7.dh = var4;
         var7.di = var5;
         var7.a(this.bk);
         var3.field_1949.method_3239(var7);
         this.field_240 = false;
      }

   }

   // $FF: renamed from: a (float, float) com.corrodinggames.rts.game.units.w
   public static class_41 method_338(float var0, float var1) {
      class_236 var2 = class_236.method_1549();
      field_242.method_1808(var0, var1);
      var2.field_1949.method_3233(var0, var1, 30.0F, (class_44)null, 1.0F, field_242);
      return field_242.field_2251;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public Rect method_299(boolean var1) {
      int var2 = this.field_229;
      int var3 = this.field_230;
      var2 += this.field_226 * this.dl;
      cH.method_1911(var2, var3, var2 + this.dl, var3 + this.dm);
      return cH;
   }

   // $FF: renamed from: c (float) boolean
   public boolean method_181(float var1) {
      class_306 var2 = this.method_333();
      class_236 var3 = class_236.method_1549();
      if (!this.bt()) {
         return false;
      } else {
         cA.method_1970(this.bL());
         cA.method_1972(0.0F, (float)((int)(-this.dj)));
         cA.method_1972(this.field_231, this.field_232);
         cB.method_1912(this.method_299(false));
         var3.field_1935.method_89();
         float var4 = cA.method_1966();
         float var5 = cA.method_1967();
         var3.field_1935.method_91(this.d(false), var4, var5);
         var3.field_1935.method_93(this.field_237 * 2.7F, this.field_237 * 2.7F, var4, var5);
         var3.field_1935.method_68(var2, cB, cA, (Paint)null);
         var3.field_1935.method_90();
         return true;
      }
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public class_503 method_279() {
      return class_503.field_4617;
   }

   // $FF: renamed from: i () boolean
   public boolean method_280() {
      return false;
   }

   // $FF: renamed from: H () boolean
   public boolean method_282() {
      return false;
   }

   // $FF: renamed from: Y () boolean
   public boolean method_284() {
      return false;
   }

   // $FF: renamed from: X () boolean
   public boolean method_283() {
      return false;
   }

   // $FF: renamed from: o_ () boolean
   public boolean method_288() {
      return true;
   }

   // $FF: renamed from: c_ () boolean
   public boolean method_242() {
      return false;
   }

   // $FF: renamed from: m () com.corrodinggames.rts.game.units.ao
   public class_469 method_339() {
      return class_469.field_4077;
   }

   // $FF: renamed from: n () void
   public void method_249() {
      super.n();
   }

   // $FF: renamed from: q () float
   public float method_229() {
      return -1.0F;
   }

   // $FF: renamed from: l () boolean
   public boolean method_312() {
      return false;
   }

   // $FF: renamed from: G () boolean
   public boolean method_286() {
      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public float method_246(class_39 var1, float var2, class_97 var3) {
      this.field_237 -= var2 / 100.0F;
      var2 = 0.0F;
      return super.a(var1, var2, var3);
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_339();
   }
}
