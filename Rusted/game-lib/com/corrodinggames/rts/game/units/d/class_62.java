package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_130;
import com.corrodinggames.rts.game.units.a.class_135;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.r
public class class_62 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_510 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_511 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_512 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_513 = new class_306[10];
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_514 = new class_306[10];
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_515 = null;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.a.l
   static class_121 field_516 = new r$1(110);

   // $FF: renamed from: b () void
   public static strictfp void method_574() {
      class_236 var0 = class_236.method_1549();
      field_510 = var0.field_1935.method_60(R$drawable.sea_factory);
      field_511 = var0.field_1935.method_60(R$drawable.sea_factory_t2);
      field_515 = var0.field_1935.method_60(R$drawable.sea_factory_dead);
      field_513 = class_107.method_948(field_510);
      field_514 = class_107.method_948(field_511);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_575() {
      return class_469.field_4036;
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      this.m = null;
      this.G = field_515;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2424);
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      if (this.bi) {
         return field_515;
      } else if (this.bk == null) {
         return field_513[field_513.length - 1];
      } else {
         return this.r == 1 ? field_513[this.bk.method_963()] : field_514[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   public strictfp class_62(boolean var1) {
      super(var1);
      this.G = field_510;
      this.b(field_510);
      this.by = 45.0F;
      this.bz = this.by;
      this.bJ = 1000.0F;
      this.bI = this.bJ;
      this.I(2);
      this.n.method_1911(-1, -1, 1, 2);
      this.o.method_1911(-2, -1, 2, 4);
   }

   // $FF: renamed from: q (com.corrodinggames.rts.game.units.aa) int
   public strictfp int method_289(class_39 var1) {
      return 110;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      if (var1.field_16.equals(field_516.method_1043())) {
         this.method_356(2);
         this.L();
      } else {
         super.method_10(var1);
      }

   }

   // $FF: renamed from: ch () int
   public strictfp int method_523() {
      return -20;
   }

   // $FF: renamed from: K () int
   public strictfp int method_261() {
      return this.r;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
      if (var1 == 1) {
         this.r = 1;
      } else if (var1 == 2 && this.r == 1) {
         this.r = 2;
      }

      this.I();
   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      return this.r == 1 ? field_516.method_1043() : class_121.field_1347;
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public static strictfp void method_576(ArrayList var0, int var1) {
      var0.add(new class_130());
      var0.add(field_516);
      var0.add(new class_135(class_469.field_4070, 1));
      var0.add(new class_135(class_469.field_4048, 2));
      var0.add(new class_135(class_469.field_4047, 3));
      var0.add(new class_135(class_469.field_4051, 4));
      var0.add(new class_135(class_469.field_4053, 5));
      var0.add(new class_135(class_469.field_4069, 6));
      if (var1 > 1) {
      }

   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return this.method_575().method_143(this.method_261());
   }

   // $FF: renamed from: ba () boolean
   public strictfp boolean method_213() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_575();
   }
}
