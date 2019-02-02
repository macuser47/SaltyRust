package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.game.units.v
public class class_254 extends class_251 {
   // $FF: renamed from: a int
   public int field_2252;
   // $FF: renamed from: b float[]
   public float[] field_2253 = new float[31];
   // $FF: renamed from: c boolean[]
   public boolean[] field_2254 = new boolean[31];
   // $FF: renamed from: d int
   int field_2255;
   // $FF: renamed from: e boolean
   public boolean field_2256;
   // $FF: renamed from: f boolean
   public boolean field_2257;

   strictfp class_254(boolean var1) {
      this.field_2256 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) int
   public strictfp int method_1804(class_44 var1) {
      return -2;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.p) com.corrodinggames.rts.game.k
   public strictfp class_107 method_1805(class_44 var1) {
      return var1.bk;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.p) void
   public strictfp void method_1809(class_44 var1) {
      float var2 = var1.method_394(false);
      this.field_2255 = var1.method_317();

      for(int var3 = 0; var3 < this.field_2255; ++var3) {
         float var4 = var1.method_475(var3);
         if (var4 > var2) {
            var4 = var2;
         }

         this.field_2253[var3] = var4 * var4 + 1.0F;
         this.field_2254[var3] = false;
         if (var1.method_450(var3) == -1 && var1.bV[var3].field_4616 == null) {
            this.field_2254[var3] = true;
         }
      }

      this.field_2257 = true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float) void
   public strictfp void method_1806(class_44 var1, float var2) {
      this.field_2252 = 0;
      if (!this.field_2257) {
         throw new RuntimeException("PassiveTargetCallback not ready");
      } else {
         this.field_2257 = false;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float, com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_1803(class_44 var1, float var2, class_39 var3) {
      if (var1.method_393(var3, true)) {
         ++this.field_2252;
         if (this.field_2256) {
            if (!(var3 instanceof class_44)) {
               return;
            }

            class_44 var4 = (class_44)var3;
            if (!var4.l() || !var4.method_385(var1)) {
               return;
            }
         }

         float var8 = class_296.method_2026(var1.dh, var1.di, var3.dh, var3.di);

         for(int var5 = 0; var5 < this.field_2255; ++var5) {
            if (this.field_2254[var5]) {
               boolean var6 = true;
               boolean var7 = false;
               if (var1.method_384(var5, var3, true, false) && var8 < this.field_2253[var5]) {
                  this.field_2253[var5] = var8;
                  var1.bV[var5].field_4616 = var3;
               }
            }
         }
      }

   }
}
