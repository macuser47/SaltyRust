package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.class_107;

// $FF: renamed from: com.corrodinggames.rts.game.units.x
public class class_253 extends class_251 {
   // $FF: renamed from: a float
   float field_2249;
   // $FF: renamed from: b float
   float field_2250;
   // $FF: renamed from: c com.corrodinggames.rts.game.units.w
   public class_41 field_2251;

   class_253() {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) int
   public int method_1804(class_44 var1) {
      return -2;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.p) com.corrodinggames.rts.game.k
   public class_107 method_1805(class_44 var1) {
      return null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float) void
   public void method_1806(class_44 var1, float var2) {
      this.field_2251 = null;
   }

   // $FF: renamed from: a (float, float) void
   public void method_1808(float var1, float var2) {
      this.field_2249 = var1;
      this.field_2250 = var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float, com.corrodinggames.rts.game.units.aa) void
   public void method_1803(class_44 var1, float var2, class_39 var3) {
      if (var3 instanceof class_41 && !var3.field_141 && var3.method_255(this.field_2249, this.field_2250, 0.0F)) {
         this.field_2251 = (class_41)var3;
      }

   }
}
