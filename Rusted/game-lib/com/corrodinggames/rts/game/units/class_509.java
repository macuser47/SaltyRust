package com.corrodinggames.rts.game.units;

import android.graphics.RectF;

// $FF: renamed from: com.corrodinggames.rts.game.units.ak
public final class class_509 extends class_508 {
   // $FF: renamed from: a android.graphics.RectF
   public RectF field_4649 = new RectF();
   // $FF: renamed from: b float
   public float field_4650;
   // $FF: renamed from: c float
   public float field_4651;
   // $FF: renamed from: d float
   public float field_4652;
   // $FF: renamed from: e float
   public float field_4653;

   // $FF: renamed from: a (float, float, float, float) void
   public void method_3249(float var1, float var2, float var3, float var4) {
      this.field_4650 = var1;
      this.field_4651 = var3;
      this.field_4652 = var2;
      this.field_4653 = var4;
      this.field_4649.method_1969(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public final boolean method_3248(class_39 var1) {
      return this.field_4650 <= var1.dh && var1.dh <= this.field_4651 && this.field_4652 <= var1.di && var1.di <= this.field_4653;
   }
}
