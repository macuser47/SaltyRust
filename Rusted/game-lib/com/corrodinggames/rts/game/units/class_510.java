package com.corrodinggames.rts.game.units;

import android.graphics.RectF;

// $FF: renamed from: com.corrodinggames.rts.game.units.al
public final class class_510 extends class_508 {
   // $FF: renamed from: a android.graphics.RectF
   public RectF field_4654 = new RectF();
   // $FF: renamed from: b float
   public float field_4655;
   // $FF: renamed from: c float
   public float field_4656;
   // $FF: renamed from: d float
   public float field_4657;
   // $FF: renamed from: e float
   public float field_4658;

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public final boolean method_3248(class_39 var1) {
      float var2 = var1.field_157;
      return this.field_4655 - var2 <= var1.dh && var1.dh <= this.field_4656 + var2 && this.field_4657 - var2 <= var1.di && var1.di <= this.field_4658 + var2;
   }
}
