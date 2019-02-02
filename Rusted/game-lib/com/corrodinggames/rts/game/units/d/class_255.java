package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_251;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.q
public class class_255 extends class_251 {
   // $FF: renamed from: a float
   public float field_2258;
   // $FF: renamed from: b boolean
   public boolean field_2259;
   // $FF: renamed from: c boolean
   public boolean field_2260;
   // $FF: renamed from: d com.corrodinggames.rts.game.k
   class_107 field_2261;
   // $FF: renamed from: e com.corrodinggames.rts.game.units.aa
   class_39 field_2262;
   // $FF: renamed from: f float
   float field_2263;
   // $FF: renamed from: g float
   float field_2264;
   // $FF: renamed from: h boolean
   boolean field_2265;

   strictfp class_255(boolean var1) {
      this.field_2259 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) int
   public strictfp int method_1804(class_44 var1) {
      return -2;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.p) com.corrodinggames.rts.game.k
   public strictfp class_107 method_1805(class_44 var1) {
      return null;
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_1810(float var1, boolean var2) {
      this.field_2258 = var1 * var1;
      this.field_2265 = var2;
      this.field_2260 = true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float) void
   public strictfp void method_1806(class_44 var1, float var2) {
      this.field_2262 = null;
      this.field_2263 = -1.0F;
      this.field_2264 = -1.0F;
      this.field_2261 = var1.bk;
      if (!this.field_2260) {
         throw new RuntimeException("AutoRepairCallback not ready");
      } else {
         this.field_2260 = false;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float, com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_1803(class_44 var1, float var2, class_39 var3) {
      if (var1 != var3) {
         if ((var3.field_167 < var3.field_168 || var3.field_160 < 1.0F) && !var3.field_141 && var3.field_182 == null && this.field_2261.method_944(var3.field_143) && var1.method_386(var3)) {
            float var4 = class_296.method_2026(var1.dh, var1.di, var3.dh, var3.di);
            if (var4 < this.field_2258) {
               boolean var5 = false;
               if (!this.field_2265) {
                  if (this.field_2263 == -1.0F || this.field_2263 > var3.field_167) {
                     var5 = true;
                  }
               } else if (this.field_2264 == -1.0F || this.field_2264 > var4) {
                  var5 = true;
               }

               if (var5 && var3.method_316() == 0.0F) {
                  this.field_2263 = var3.field_167;
                  this.field_2264 = var4;
                  this.field_2262 = var3;
               }
            }
         }

      }
   }
}
