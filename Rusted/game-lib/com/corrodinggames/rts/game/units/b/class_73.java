package com.corrodinggames.rts.game.units.b;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.class_65;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.b.b
public abstract class class_73 extends class_65 {
   // $FF: renamed from: h float
   float field_611;
   // $FF: renamed from: i boolean
   boolean field_612 = false;
   // $FF: renamed from: j float
   float field_613;
   // $FF: renamed from: k java.lang.Boolean
   Boolean field_614;
   // $FF: renamed from: l java.lang.Boolean
   Boolean field_615;
   // $FF: renamed from: m com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_616 = null;
   // $FF: renamed from: n com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_617 = new class_306[10];

   public strictfp class_73(boolean var1) {
      super(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_611);
      var1.method_2540(this.field_612);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_611 = var1.method_3012();
      this.field_612 = var1.method_3010();
      super.a(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_617[this.bk.method_963()];
   }

   // $FF: renamed from: D () void
   public static strictfp void method_623() {
      class_236 var0 = class_236.method_1549();
      field_616 = var0.field_1935.method_60(R$drawable.unit_icon_air);
      field_617 = class_107.method_948(field_616);
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_279() {
      return class_503.field_4620;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (this.bi) {
         if (this.dj > 0.0F) {
            this.field_611 += 0.06F * var1;
            this.dj -= this.field_611 * var1;
         } else {
            if (this.field_614 == null) {
               this.field_614 = this.bP();
            }

            if (this.field_615 == null) {
               this.field_615 = this.bO();
            }

            if (!this.field_612) {
               this.field_612 = true;
               if (this.field_614) {
                  this.a(class_282.field_2421);
                  if (this.field_615) {
                     class_236.method_1549().field_1938.method_2478(this.dh, this.di, 0.0F, 0, 0.0F, 0.0F, this.bv);
                  }
               } else {
                  this.a(class_282.field_2422);
               }

               this.field_611 = 0.0F;
            } else if (this.field_614) {
               if (this.dj > -10.0F) {
                  this.field_611 += 8.0E-4F * var1;
                  this.dj -= this.field_611 * var1;
                  if (this.field_615) {
                     this.field_613 += var1;
                     if (this.field_613 > 30.0F) {
                        this.field_613 = 0.0F;
                        if (this.o_()) {
                           class_236 var2 = class_236.method_1549();
                           class_390 var3 = var2.field_1938.method_2476(this.dh, this.di, this.dj, this.bv);
                           if (var3 != null) {
                              var3.field_3154 = 0.0F;
                              var3.field_3155 = -0.1F;
                           }
                        }
                     }
                  }
               }
            } else {
               this.dj = 0.0F;
            }
         }

      }
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      if (this.dj > -1.0F) {
         for(int var2 = 0; var2 < 3; ++var2) {
            var1.field_1938.method_2482(this.dh, this.di, this.dj);
         }
      }

      return super.e();
   }
}
