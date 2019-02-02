package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_130;
import com.corrodinggames.rts.game.units.a.class_135;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.a
public class class_53 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_411 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_412 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_413 = new class_306[10];
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_414 = new class_306[10];
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_415 = null;
   // $FF: renamed from: f int
   int field_416 = 1;
   // $FF: renamed from: g float
   float field_417 = 0.0F;
   // $FF: renamed from: h com.corrodinggames.rts.game.units.a.l
   static class_121 field_418 = new a$1(110);

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2541(this.field_416);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      if (var1.method_3006() >= 17) {
         int var2 = var1.method_3011();
         this.method_356(var2);
      }

      super.method_175(var1);
   }

   // $FF: renamed from: b () void
   public static strictfp void method_544() {
      class_236 var0 = class_236.method_1549();
      field_411 = var0.field_1935.method_60(R$drawable.air_factory);
      field_412 = var0.field_1935.method_60(R$drawable.air_factory_t2);
      field_415 = var0.field_1935.method_60(R$drawable.air_factory_dead);
      field_413 = class_107.method_948(field_411);
      field_414 = class_107.method_948(field_412);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_545() {
      return class_469.field_4035;
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      this.G = field_415;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2424);
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      if (this.bi) {
         return field_415;
      } else if (this.bk == null) {
         return field_413[field_413.length - 1];
      } else {
         return this.field_416 == 1 ? field_413[this.bk.method_963()] : field_414[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   public strictfp class_53(boolean var1) {
      super(var1);
      this.G = field_411;
      this.J(40);
      this.K(61);
      this.by = 30.0F;
      this.bz = this.by;
      this.bJ = 1000.0F;
      this.bI = this.bJ;
      this.n.method_1911(-1, -1, 1, 1);
      this.o.method_1911(-1, -1, 1, 2);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (this.bj() && !this.bi) {
         this.field_417 = class_296.method_2020(this.field_417, var1);
         if (this.field_417 == 0.0F) {
            this.field_417 = 27.0F;
            ++this.u;
            if (this.u > 4) {
               this.u = 0;
            }
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      if (var1.field_16.equals(field_418.method_1043())) {
         this.method_356(2);
         this.L();
      } else {
         super.method_10(var1);
      }

   }

   // $FF: renamed from: K () int
   public strictfp int method_261() {
      return this.field_416;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
      if (var1 == 1) {
         this.field_416 = 1;
      } else if (var1 == 2 && this.field_416 == 1) {
         this.field_416 = 2;
      }

      this.I();
   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      return this.field_416 == 1 ? field_418.method_1043() : class_121.field_1347;
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public static strictfp void method_546(ArrayList var0, int var1) {
      var0.add(new class_130());
      if (var1 == 1) {
         var0.add(field_418);
      }

      if (var1 > 1) {
         var0.add(new class_135(class_469.field_4058, 3));
         var0.add(new class_135(class_469.field_4046, 4));
         var0.add(new class_135(class_469.field_4071, 5));
      }

   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return this.method_545().method_143(this.method_261());
   }

   // $FF: renamed from: ba () boolean
   public strictfp boolean method_213() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_545();
   }
}
