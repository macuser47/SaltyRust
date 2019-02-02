package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public final class LogicBoolean$HpBoolean extends LogicBoolean$AbstractBoolean {
   public String getName() {
      return "Hp";
   }

   public float getValue(class_66 var1) {
      return var1.bI;
   }

   public float getMaxValue(class_66 var1) {
      return var1.bJ;
   }
}
