package com.corrodinggames.rts.game.units.e;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.h
public abstract class class_87 extends class_79 {
   // $FF: renamed from: l float
   float field_761;
   // $FF: renamed from: m float
   float field_762;
   // $FF: renamed from: n com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_763 = null;
   // $FF: renamed from: o com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_764 = new class_306[10];

   public strictfp class_87(boolean var1) {
      super(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      if (this.bk.field_1227 == -1) {
         return null;
      } else {
         return this.ca() ? class_79.field_679[this.bk.method_963()] : field_764[this.bk.method_963()];
      }
   }

   // $FF: renamed from: D () void
   public static strictfp void method_665() {
      class_236 var0 = class_236.method_1549();
      field_763 = var0.field_1935.method_60(R$drawable.unit_icon_hover);
      field_764 = class_107.method_948(field_763);
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_279() {
      return class_503.field_4622;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (this.bi) {
         float var2 = 0.0F;
         if (this.bP()) {
            var2 = -10.0F;
         }

         if (this.dj > var2) {
            if (this.dj > 0.0F && this.field_762 < 0.4F) {
               this.field_762 = 0.4F;
            }

            this.field_762 += 0.002F * var1;
            this.dj -= this.field_762 * var1;
            if (this.dj <= var2) {
               this.dj = var2;
            }
         }
      }

      if (this.bj() && !this.bi) {
         if (this.bP()) {
            if (this.bu > 0.0F) {
               this.field_761 += var1;
            }

            if (this.field_761 > 10.0F) {
               this.field_761 = 0.0F;
               if (this.o_()) {
                  class_236 var6 = class_236.method_1549();
                  float var3 = this.dh + class_296.method_2099(this.bv) * 4.0F;
                  float var4 = this.di + class_296.method_2098(this.bv) * 4.0F;
                  class_390 var5 = var6.field_1938.method_2488(var3, var4, 0.0F, class_393.field_3201, false, class_395.field_3222);
                  if (var5 != null) {
                     var5.field_3178 = 0;
                     var5.field_3176 = 13;
                     var5.field_3179 = 1;
                     var5.field_3135 = true;
                     var5.field_3143 = 0.8F;
                     var5.field_3161 = 80.0F;
                     var5.field_3160 = 80.0F;
                     var5.field_3154 = -class_296.method_2099(this.bv) * 0.1F;
                     var5.field_3155 = -class_296.method_2098(this.bv) * 0.1F;
                     var5.field_3162 = class_296.method_2033(-180.0F, 180.0F);
                  }
               }
            }
         }

      }
   }
}
