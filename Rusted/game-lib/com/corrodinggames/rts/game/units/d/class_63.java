package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.s
public class class_63 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_517 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_518 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_519 = new class_306[10];
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_520 = new class_306[10];
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_521 = null;
   // $FF: renamed from: f int
   int field_522 = 1;
   // $FF: renamed from: g float
   float field_523 = 0.0F;
   // $FF: renamed from: h int
   int field_524 = 0;
   // $FF: renamed from: i int
   public static int field_525 = 0;
   // $FF: renamed from: j com.corrodinggames.rts.game.units.a.l
   static class_121 field_526 = new s$1(102);
   // $FF: renamed from: k java.util.ArrayList
   static ArrayList field_527 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2541(this.field_522);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_175(class_463 var1) {
      int var2 = var1.method_3011();
      this.method_356(var2);
      super.method_175(var1);
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public class_469 method_577() {
      return class_469.field_4072;
   }

   // $FF: renamed from: c () void
   public static void method_578() {
      class_236 var0 = class_236.method_1549();
      field_517 = var0.field_1935.method_60(R$drawable.supply_depot);
      field_518 = var0.field_1935.method_60(R$drawable.supply_depot_t2);
      field_519 = class_107.method_948(field_517);
      field_520 = class_107.method_948(field_518);
      field_521 = var0.field_1935.method_60(R$drawable.supply_depot_dead);
   }

   // $FF: renamed from: D () boolean
   public boolean method_510() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2460(this.dh, this.di, this.dj);
      this.G = field_521;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4757, 0.8F, this.dh, this.di);
      return false;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_346() {
      if (this.bi) {
         return field_521;
      } else if (this.bk == null) {
         return field_519[field_519.length - 1];
      } else {
         return this.field_522 == 1 ? field_519[this.bk.method_963()] : field_520[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_347() {
      return null;
   }

   public class_63(boolean var1) {
      super(var1);
      this.G = field_517;
      this.a(this.G, 1);
      this.by = 20.0F;
      this.bz = this.by;
      this.bJ = 800.0F;
      this.bI = this.bJ;
      this.n.method_1911(-1, -1, 0, 0);
      this.o.method_1912(this.n);
   }

   // $FF: renamed from: a (float) void
   public void method_176(float var1) {
      super.method_176(var1);
      if (!this.bj() || this.bi) {
         ;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public void method_10(class_32 var1) {
      if (var1.field_16.equals(field_526.method_1043())) {
         this.method_579();
         this.L();
      }

   }

   // $FF: renamed from: a (int) void
   public void method_356(int var1) {
      this.field_522 = var1;
   }

   // $FF: renamed from: cd () void
   public void method_579() {
      if (this.field_522 == 1) {
         this.field_522 = 2;
         this.I();
      }

   }

   // $FF: renamed from: by () java.lang.String
   public String method_269() {
      return this.field_522 == 1 ? field_526.method_1043() : class_121.field_1347;
   }

   // $FF: renamed from: E () java.util.ArrayList
   public ArrayList method_260() {
      return field_527;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_577();
   }

   static {
      field_527.add(field_526);
   }
}
