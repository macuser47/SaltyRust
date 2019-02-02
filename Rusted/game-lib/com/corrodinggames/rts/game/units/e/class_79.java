package com.corrodinggames.rts.game.units.e;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.class_65;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.j
public abstract class class_79 extends class_65 {
   // $FF: renamed from: cM com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_676 = null;
   // $FF: renamed from: cN com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_677 = null;
   // $FF: renamed from: cO com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_678 = new class_306[10];
   // $FF: renamed from: cP com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_679 = new class_306[10];

   public strictfp class_79(boolean var1) {
      super(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      if (this.bk.field_1227 == -1) {
         return null;
      } else {
         return this.ca() ? field_679[this.bk.method_963()] : field_678[this.bk.method_963()];
      }
   }

   // $FF: renamed from: cf () void
   public static strictfp void method_643() {
      class_236 var0 = class_236.method_1549();
      field_676 = var0.field_1935.method_60(R$drawable.unit_icon_land);
      if (field_676 == null) {
         throw new RuntimeException("IMAGE_ICON is null");
      } else {
         field_678 = class_107.method_948(field_676);
         field_677 = var0.field_1935.method_60(R$drawable.unit_icon_land_exp);
         if (field_677 == null) {
            throw new RuntimeException("IMAGE_ICON_EXP is null");
         } else {
            field_679 = class_107.method_948(field_677);
         }
      }
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_279() {
      return class_503.field_4618;
   }
}
