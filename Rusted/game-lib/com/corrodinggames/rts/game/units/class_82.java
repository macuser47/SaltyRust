package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.graphics.PointF;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.e.class_79;
import com.corrodinggames.rts.game.units.e.class_84;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.f
public class class_82 extends class_79 implements class_9 {
   // $FF: renamed from: a android.graphics.PointF[]
   PointF[] field_719 = new PointF[6];
   // $FF: renamed from: b android.graphics.PointF[]
   PointF[] field_720;
   // $FF: renamed from: c android.graphics.Paint
   static Paint field_721;
   // $FF: renamed from: d android.graphics.Paint
   static Paint field_722;
   // $FF: renamed from: e android.graphics.Paint
   static Paint field_723;
   // $FF: renamed from: f int
   int field_724;
   // $FF: renamed from: g float
   float field_725;
   // $FF: renamed from: h float
   float field_726;
   // $FF: renamed from: i int
   int field_727;

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_650() {
      return class_469.field_4040;
   }

   // $FF: renamed from: b () android.graphics.PointF[]
   public strictfp PointF[] method_18() {
      return this.field_719;
   }

   // $FF: renamed from: c () android.graphics.PointF[]
   public strictfp PointF[] method_19() {
      return this.field_720;
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : cO[this.bk.method_963()];
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_386(class_39 var1) {
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? class_84.field_733 : class_84.field_735[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = class_84.field_733;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4756, 0.8F, this.dh, this.di);
      this.aQ();
      return true;
   }

   public strictfp class_82(boolean var1) {
      super(var1);
      this.field_720 = new PointF[this.field_719.length];
      field_721 = new Paint();
      field_721.method_2791(40, 0, 255, 0);
      field_721.method_2781(true);
      field_721.method_2793(2.0F);
      field_721.method_2794(Paint$Cap.field_1808);
      field_722 = new Paint();
      field_722.method_2776(field_721);
      field_722.method_2791(55, 255, 60, 60);
      field_723 = new Paint();
      field_723.method_2791(60, 255, 255, 255);
      this.J(20);
      this.K(20);
      this.by = 10.0F;
      this.dh = -1000.0F;
      this.di = -1000.0F;
      this.bz = this.by;
      this.bJ = 170000.0F;
      this.bI = this.bJ;
      this.G = class_84.field_733;

      for(int var2 = 0; var2 < this.field_719.length; ++var2) {
         this.field_719[var2] = new PointF();
         this.field_720[var2] = new PointF();
      }

   }

   // $FF: renamed from: a (float, com.corrodinggames.rts.game.units.d) void
   public static strictfp void method_651(float var0, class_9 var1) {
      class_44 var2 = (class_44)var1;
      PointF[] var3 = var1.method_18();
      PointF[] var4 = var1.method_19();
      class_39 var5 = var2.method_365();
      var2.field_329 = var5 != null;
      int var6;
      PointF var7;
      PointF var8;
      if (var5 != null) {
         for(var6 = 0; var6 < var3.length; ++var6) {
            var7 = var3[var6];
            var8 = var4[var6];
            var7.field_2406 = class_296.method_2021(var7.field_2406, var8.field_2406, 0.1F * var0);
            var7.field_2407 = class_296.method_2021(var7.field_2407, var8.field_2407, 0.1F * var0);
            var7.field_2406 += (var8.field_2406 - var7.field_2406) * 0.04F * var0;
            var7.field_2407 += (var8.field_2407 - var7.field_2407) * 0.04F * var0;
            float var9 = var5.field_157 * 0.75F;
            if (class_296.method_2042(var7.field_2406 - var8.field_2406) < 1.0F) {
               var8.field_2406 = class_296.method_2034(-var9, var9);
            }

            if (class_296.method_2042(var7.field_2407 - var8.field_2407) < 1.0F) {
               var8.field_2407 = class_296.method_2034(-var9, var9);
            }
         }
      } else if (var3[0].field_2406 != 0.0F || var3[0].field_2407 != 0.0F) {
         for(var6 = 0; var6 < var3.length; ++var6) {
            var7 = var3[var6];
            var8 = var4[var6];
            var7.field_2406 = 0.0F;
            var7.field_2407 = 0.0F;
            var8.field_2406 = 0.0F;
            var8.field_2407 = 0.0F;
         }
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (!this.bi) {
         method_651(var1, this);
      }

      this.bI = this.bJ;
      ++this.field_724;
      this.field_725 += var1;
      this.field_726 += var1;
      class_236 var2 = class_236.method_1549();
      if (this.field_726 > 3.0F) {
         this.field_726 = 0.0F;
         ++this.field_727;
         int var3 = class_469.field_4085.size();
         int var4 = class_296.method_2014(this, 0, var3 - 1, 1 + this.field_727);
         class_24 var5 = (class_24)class_469.field_4085.get(var4);
         boolean var6 = true;
         if (class_479.field_4185 == var5) {
            var6 = false;
         }

         if (var5 == class_469.field_4077) {
            var6 = false;
         }

         if (var6) {
            class_39 var7 = var5.method_128();
            var7.dh = (float)class_296.method_2014(this, 200, (int)var2.field_1932.method_2612() - 200, 2 + this.field_724);
            var7.di = (float)class_296.method_2014(this, 200, (int)var2.field_1932.method_2613() - 200, 3 + this.field_724);
            var7.method_259(class_296.method_2014(this, 0, 3, 4 + this.field_724));
            if (var7.method_318()) {
               var7.method_184();
            }

            if (var7.method_222()) {
               var7.method_184();
            }
         }
      }

   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
      if (!this.bi) {
      }

   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_448(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         if (!this.bi) {
            float var3 = this.bV[0].field_4612 / this.method_445(0);
            if (var3 != 0.0F) {
               PointF var4 = this.w(0);
               var2.field_1935.method_87();
               var2.field_1935.method_94(var4.field_2406 - var2.field_1965, var4.field_2407 - var2.field_1966);
               var2.field_1935.method_92(var3, var3);
               if (this.N()) {
                  var2.field_1935.method_69(class_84.field_737, 0.0F, 0.0F, (Paint)null);
               } else {
                  var2.field_1935.method_69(class_84.field_736, 0.0F, 0.0F, (Paint)null);
               }

               var2.field_1935.method_88();
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
   }

   // $FF: renamed from: a_ () boolean
   public strictfp boolean method_433() {
      return false;
   }

   // $FF: renamed from: r () int
   public strictfp int method_290() {
      return 850000;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_291(class_39 var1) {
      return 1.0E7F;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_292(class_39 var1) {
      return 1.0E7F;
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 30.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 100.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return this.bP() ? 4.7F : 4.8F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.35F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.04F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return true;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 10.0F;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && !this.bi;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 1.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 1.0F;
   }

   // $FF: renamed from: B () boolean
   public strictfp boolean method_318() {
      return true;
   }

   // $FF: renamed from: C () boolean
   public strictfp boolean method_431() {
      return false;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_319(class_39 var1) {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public strictfp float method_246(class_39 var1, float var2, class_97 var3) {
      var2 = 0.0F;
      return super.a(var1, var2, var3);
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_650();
   }
}
