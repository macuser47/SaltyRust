package com.corrodinggames.rts.game.units.f;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_9;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_128;
import com.corrodinggames.rts.game.units.a.class_131;
import com.corrodinggames.rts.game.units.e.class_84;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.f.b
public class class_69 extends class_67 implements class_9 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_580 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_581 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_582 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_583 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_584 = new class_306[10];
   // $FF: renamed from: f android.graphics.PointF[]
   PointF[] field_585 = new PointF[6];
   // $FF: renamed from: g android.graphics.PointF[]
   PointF[] field_586;
   // $FF: renamed from: h android.graphics.Rect
   Rect field_587;
   // $FF: renamed from: i com.corrodinggames.rts.game.units.a.l
   static class_121 field_588 = new class_128(false);

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : class_84.field_739[this.bk.method_963()];
   }

   // $FF: renamed from: p_ () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_613() {
      return class_469.field_4070;
   }

   // $FF: renamed from: b () android.graphics.PointF[]
   public strictfp PointF[] method_18() {
      return this.field_585;
   }

   // $FF: renamed from: c () android.graphics.PointF[]
   public strictfp PointF[] method_19() {
      return this.field_586;
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 6000.0F;
   }

   // $FF: renamed from: cd () void
   public static strictfp void method_614() {
      class_236 var0 = class_236.method_1549();
      field_581 = var0.field_1935.method_60(R$drawable.builder_ship);
      field_580 = var0.field_1935.method_60(R$drawable.builder_ship_dead);
      field_582 = var0.field_1935.method_60(R$drawable.builder_ship_turret);
      field_584 = class_107.method_948(field_581);
      field_583 = a(field_581, field_581.method_2128(), field_581.method_2127());
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_580 : field_584[this.bk.method_963()];
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_582;
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_583;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && this.dj > -2.0F;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 3.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 3.0F;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_580;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_69(boolean var1) {
      super(var1);
      this.field_586 = new PointF[this.field_585.length];
      this.field_587 = new Rect();
      this.b(field_581);
      this.by = 13.0F;
      this.bz = this.by;
      this.bJ = 500.0F;
      this.bI = this.bJ;
      this.G = field_581;

      for(int var2 = 0; var2 < this.field_585.length; ++var2) {
         this.field_585[var2] = new PointF();
         this.field_586[var2] = new PointF();
      }

   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 240.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.8F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.9F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.12F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 3.5F;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return 0.25F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.03F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (!this.bi) {
         class_84.method_656(var1, this);
      }

   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
      super.a(var1, var2);
      if (!this.bi) {
         class_84.method_657(var1, this);
      }

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
               var2.field_1935.method_94(var4.field_2406 - var2.field_1965, var4.field_2407 - var2.field_1966 - this.dj);
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

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 11.0F;
   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return 1;
   }

   // $FF: renamed from: x (int) android.graphics.PointF
   public strictfp PointF method_479(int var1) {
      float var2 = 8.0F;
      float var3 = this.dh + class_296.method_2099(this.bv) * var2;
      float var4 = this.di + class_296.method_2098(this.bv) * var2;
      aH.method_1960(var3, var4);
      return aH;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return (float)(120 - var1 * 28);
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 30.0F;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_448(int var1) {
      return 1.3F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_386(class_39 var1) {
      if (var1.method_330()) {
         return false;
      } else {
         return var1.method_212();
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public static strictfp void method_615(ArrayList var0, int var1) {
      var0.add(field_588);
      var0.add(new class_131(class_469.field_4033, 1, 1));
      var0.add(new class_131(class_469.field_4038, 1, 2));
      var0.add(new class_131(class_469.field_4039, 1, 3));
      var0.add(new class_131(class_469.field_4034, 1, 4));
      var0.add(new class_131(class_469.field_4035, 1, 5));
      var0.add(new class_131(class_469.field_4036, 1, 6));
      var0.add(new class_131(class_469.field_4068, 1, 7));
      var0.add(new class_131(class_469.field_4057, 1, 8));
      var0.add(new class_131(class_469.field_4060, 1, 9));
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return this.method_613().method_143(this.K());
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
   }

   // $FF: renamed from: r () int
   public strictfp int method_290() {
      return 145;
   }

   // $FF: renamed from: Z () boolean
   public strictfp boolean method_391() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_613();
   }
}
