package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.game.units.s
public class class_252 extends class_251 {
   // $FF: renamed from: a int
   public int field_2245;
   // $FF: renamed from: b float
   public float field_2246;
   // $FF: renamed from: c boolean
   public boolean field_2247;
   // $FF: renamed from: d boolean
   public boolean field_2248;

   strictfp class_252(boolean var1) {
      this.field_2247 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) int
   public strictfp int method_1804(class_44 var1) {
      return -2;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.p) com.corrodinggames.rts.game.k
   public strictfp class_107 method_1805(class_44 var1) {
      return var1.bk;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_1807(float var1) {
      this.field_2246 = var1 * var1 + 1.0F;
      this.field_2248 = true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float) void
   public strictfp void method_1806(class_44 var1, float var2) {
      this.field_2245 = 0;
      if (!this.field_2248) {
         throw new RuntimeException("PassiveTargetCallback not ready");
      } else {
         this.field_2248 = false;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float, com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_1803(class_44 var1, float var2, class_39 var3) {
      if (var1.method_393(var3, true)) {
         ++this.field_2245;
         if (this.field_2247) {
            if (!(var3 instanceof class_44)) {
               return;
            }

            class_44 var4 = (class_44)var3;
            if (!var4.l() || !var4.method_385(var1)) {
               return;
            }
         }

         float var5 = class_296.method_2026(var1.dh, var1.di, var3.dh, var3.di);
         if (var5 < this.field_2246) {
            this.field_2246 = var5;
            var1.field_270 = var3;
         }
      }

   }
}
