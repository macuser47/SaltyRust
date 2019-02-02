package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public final class LogicBoolean$ShieldBoolean extends LogicBoolean$AbstractBoolean {
   public String getName() {
      return "Shield";
   }

   public float getValue(class_66 var1) {
      return var1.bL;
   }

   public float getMaxValue(class_66 var1) {
      return var1.bO;
   }
}
