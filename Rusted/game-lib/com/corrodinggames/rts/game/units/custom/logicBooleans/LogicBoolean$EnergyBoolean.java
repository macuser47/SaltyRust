package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public final class LogicBoolean$EnergyBoolean extends LogicBoolean$AbstractBoolean {
   public String getName() {
      return "Energy";
   }

   public float getValue(class_66 var1) {
      return var1.bP;
   }

   public float getMaxValue(class_66 var1) {
      return var1.method_461();
   }
}
