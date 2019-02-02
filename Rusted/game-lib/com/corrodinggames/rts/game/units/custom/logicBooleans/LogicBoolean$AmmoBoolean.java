package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public final class LogicBoolean$AmmoBoolean extends LogicBoolean$AbstractBoolean {
   public String getName() {
      return "Ammo";
   }

   public float getValue(class_66 var1) {
      return (float)var1.bQ;
   }

   public float getMaxValue(class_66 var1) {
      return 2.14748365E9F;
   }
}
