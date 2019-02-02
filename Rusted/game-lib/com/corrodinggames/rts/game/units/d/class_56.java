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
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.e
public class class_56 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_443 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_444 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_445 = new class_306[10];
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_446 = new class_306[10];
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_447 = null;
   // $FF: renamed from: f boolean
   boolean field_448;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.a.l
   static class_121 field_449 = new e$1(110);

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2540(this.field_448);
      var1.method_2539(0);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      boolean var2 = var1.method_3010();
      if (var2) {
         this.method_557();
      }

      var1.method_3009();
      super.method_175(var1);
   }

   // $FF: renamed from: b () void
   public static strictfp void method_555() {
      class_236 var0 = class_236.method_1549();
      field_443 = var0.field_1935.method_60(R$drawable.experimental_unit_factory_front);
      field_444 = var0.field_1935.method_60(R$drawable.experimental_unit_factory_base);
      field_447 = var0.field_1935.method_60(R$drawable.experimental_unit_factory_dead);
      field_445 = class_107.method_948(field_443);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_556() {
      return class_469.field_4065;
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      class_236 var1 = class_236.method_1549();
      this.m = null;
      this.G = field_447;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2426);
      return true;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      if (this.bi) {
         return field_447;
      } else if (this.bk == null) {
         return field_445[field_445.length - 1];
      } else {
         return !this.field_448 ? field_445[this.bk.method_963()] : field_446[this.bk.method_963()];
      }
   }

   // $FF: renamed from: I () void
   public strictfp void method_345() {
      super.I();
      if (this.bi) {
         this.m = null;
      } else {
         this.m = field_444;
      }

   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   public strictfp class_56(boolean var1) {
      super(var1);
      this.G = field_443;
      this.m = field_444;
      this.b(this.G);
      this.by = 55.0F;
      this.bz = this.by;
      this.bJ = 3200.0F;
      this.bI = this.bJ;
      this.I(4);
      this.n.method_1911(-2, -2, 2, 2);
      this.o.method_1911(-2, -2, 2, 4);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      if (var1.field_16.equals(field_449.method_1043())) {
         this.method_557();
      } else {
         super.method_10(var1);
      }

   }

   // $FF: renamed from: cd () void
   public strictfp void method_557() {
      if (!this.field_448) {
         this.field_448 = true;
         this.method_345();
      }

   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      return class_121.field_1347;
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public static strictfp void method_558(ArrayList var0, int var1) {
      var0.add(new class_130());
      var0.add(new class_135(class_469.field_4064, 2));
      var0.add(new class_135(class_469.field_4073, 3));
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return this.method_556().method_143(this.K());
   }

   // $FF: renamed from: ba () boolean
   public strictfp boolean method_213() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_556();
   }
}
