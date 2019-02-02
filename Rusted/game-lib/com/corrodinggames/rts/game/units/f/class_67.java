package com.corrodinggames.rts.game.units.f;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.class_65;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.f.f
public abstract class class_67 extends class_65 {
   // $FF: renamed from: m float
   float field_569;
   // $FF: renamed from: n float
   float field_570;
   // $FF: renamed from: o boolean
   boolean field_571 = false;
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_572 = null;
   // $FF: renamed from: q com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_573 = new class_306[10];

   public strictfp class_67(boolean var1) {
      super(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_570);
      var1.method_2540(this.field_571);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_570 = var1.method_3012();
      this.field_571 = var1.method_3010();
      super.a(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_573[this.bk.method_963()];
   }

   // $FF: renamed from: ce () void
   public static strictfp void method_609() {
      class_236 var0 = class_236.method_1549();
      field_572 = var0.field_1935.method_60(R$drawable.unit_icon_water);
      field_573 = class_107.method_948(field_572);
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_279() {
      return class_503.field_4621;
   }

   // $FF: renamed from: bF () boolean
   public strictfp boolean method_285() {
      return true;
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_610() {
      return true;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (this.bi) {
         if (this.dj > -10.0F) {
            this.field_570 += 0.002F * var1;
            this.dj -= this.field_570 * var1;
         } else {
            this.dj = -10.0F;
            if (!this.field_571) {
               this.field_571 = true;
            }
         }

      } else if (this.bj() && !this.bi) {
         if (this.method_610()) {
            if (this.bu != 0.0F) {
               this.field_569 += var1;
            }

            if (this.field_569 > 10.0F) {
               this.field_569 = 0.0F;
               if (this.o_()) {
                  class_236 var2 = class_236.method_1549();
                  float var3 = this.bv + 180.0F;
                  if (this.bu < 0.0F) {
                     var3 += 180.0F;
                  }

                  float var4 = this.by - 6.0F;
                  if (var4 < 4.0F) {
                     var4 = 4.0F;
                  }

                  float var5 = this.dh + class_296.method_2099(var3) * var4;
                  float var6 = this.di + class_296.method_2098(var3) * var4;
                  var2.field_1938.method_2476(var5, var6, 0.0F, var3);
               }
            }
         }

      }
   }
}
