package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_130;
import com.corrodinggames.rts.game.units.a.class_135;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.l
public class class_59 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_480 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_481 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_482 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_483 = new class_306[10];
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_484 = new class_306[10];
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_485 = null;
   // $FF: renamed from: g boolean
   boolean field_486;
   // $FF: renamed from: h com.corrodinggames.rts.game.units.a.l
   static class_121 field_487 = new l$1(110);

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2540(this.field_486);
      var1.method_2539(0);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      boolean var2 = var1.method_3010();
      if (var2) {
         this.method_356(2);
      }

      var1.method_3009();
      super.method_175(var1);
   }

   // $FF: renamed from: b () void
   public static strictfp void method_563() {
      class_236 var0 = class_236.method_1549();
      field_480 = var0.field_1935.method_60(R$drawable.land_factory_front);
      field_481 = var0.field_1935.method_60(R$drawable.land_factory_front_t2);
      field_482 = var0.field_1935.method_60(R$drawable.land_factory_back);
      field_485 = var0.field_1935.method_60(R$drawable.land_factory_dead);
      field_483 = class_107.method_948(field_480);
      field_484 = class_107.method_948(field_481);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_564() {
      return class_469.field_4034;
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2460(this.dh, this.di, this.dj);
      this.m = null;
      this.G = field_485;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4757, 0.8F, this.dh, this.di);
      return true;
   }

   // $FF: renamed from: I () void
   public strictfp void method_345() {
      super.I();
      if (this.bi) {
         this.m = null;
      } else {
         this.m = field_482;
      }

   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      if (this.bi) {
         return field_485;
      } else if (this.bk == null) {
         return field_483[field_483.length - 1];
      } else {
         return !this.field_486 ? field_483[this.bk.method_963()] : field_484[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   public strictfp class_59(boolean var1) {
      super(var1);
      this.G = field_480;
      this.m = field_482;
      this.b(this.G);
      this.by = 30.0F;
      this.bz = this.by;
      this.bJ = 1200.0F;
      this.bI = this.bJ;
      this.I(3);
      this.n.method_1911(-1, -1, 1, 1);
      this.o.method_1911(-1, -1, 1, 3);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      if (field_487.method_1040(var1.field_16)) {
         this.method_356(2);
         this.L();
      } else {
         super.method_10(var1);
      }

   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
      if (var1 == 1) {
         this.field_486 = false;
      } else if (var1 == 2 && !this.field_486) {
         this.field_486 = true;
      }

      this.method_345();
   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      return !this.field_486 ? field_487.method_1043() : class_121.field_1347;
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public static strictfp void method_565(ArrayList var0, int var1) {
      var0.add(new class_130());
      if (var1 == 1) {
         var0.add(field_487);
      }

      var0.add(new class_135(class_469.field_4040, 1));
      var0.add(new class_135(class_469.field_4041, 2));
      var0.add(new class_135(class_469.field_4042, 3));
      var0.add(new class_135(class_469.field_4043, 4));
      if (var1 >= 2) {
         var0.add(new class_135(class_469.field_4051, 5));
         var0.add(new class_135(class_469.field_4055, 6));
         var0.add(new class_135(class_469.field_4056, 7));
         var0.add(new class_135(class_469.field_4050, 8));
      }

   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return this.method_564().method_143(this.method_261());
   }

   // $FF: renamed from: K () int
   public strictfp int method_261() {
      return this.field_486 ? 2 : 1;
   }

   // $FF: renamed from: cg () com.corrodinggames.rts.game.units.d.j
   public strictfp class_277 method_522() {
      return new class_278(this);
   }

   // $FF: renamed from: ba () boolean
   public strictfp boolean method_213() {
      return true;
   }

   // $FF: renamed from: bY () float
   public strictfp float method_325() {
      return super.bY() - 8.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_564();
   }
}
