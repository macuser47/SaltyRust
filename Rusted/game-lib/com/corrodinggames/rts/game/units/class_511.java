package com.corrodinggames.rts.game.units;

import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.game.units.ai
public final class class_511 extends class_508 {
   // $FF: renamed from: a android.graphics.RectF
   public RectF field_4659 = new RectF();
   // $FF: renamed from: b float
   public float field_4660;
   // $FF: renamed from: c float
   public float field_4661;
   // $FF: renamed from: d float
   public float field_4662;
   // $FF: renamed from: e float
   public float field_4663;
   // $FF: renamed from: f float
   public float field_4664;
   // $FF: renamed from: g float
   public float field_4665;
   // $FF: renamed from: h float
   public float field_4666;

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public final boolean method_3248(class_39 var1) {
      if (this.field_4660 <= var1.dh && var1.dh <= this.field_4661 && this.field_4662 <= var1.di && var1.di <= this.field_4663) {
         float var2 = class_296.method_2026(this.field_4664, this.field_4665, var1.dh, var1.di);
         return var2 < this.field_4666;
      } else {
         return false;
      }
   }
}
