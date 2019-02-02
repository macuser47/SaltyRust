package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.t
public class class_64 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_528 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_529 = new class_306[10];
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_530 = null;

   // $FF: renamed from: b () void
   public static strictfp void method_580() {
      class_236 var0 = class_236.method_1549();
      field_528 = var0.field_1935.method_60(R$drawable.wall_v);
      field_530 = var0.field_1935.method_60(R$drawable.wall_v);
      field_529 = class_107.method_948(field_528);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      if (this.bi) {
         return field_530;
      } else {
         return this.bk == null ? field_529[field_529.length - 1] : field_529[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
   }

   public strictfp class_64(boolean var1) {
      super(var1);
      this.b(field_528);
      this.by = 15.0F;
      this.bz = this.by;
      this.bJ = 700.0F;
      this.bI = this.bJ;
      this.G = field_528;
      this.n.method_1911(0, 0, 1, 0);
      this.o.method_1911(0, 0, 1, 0);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_581() {
      return class_469.field_4067;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_581();
   }
}
