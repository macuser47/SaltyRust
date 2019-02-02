package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_477;
import com.corrodinggames.rts.game.units.custom.class_66;

public final class LogicBoolean$EnergyIncludingQueuedBoolean extends LogicBoolean$AbstractBoolean {
   public String getName() {
      return "EnergyIncludingQueued";
   }

   public float getValue(class_66 var1) {
      float var2 = var1.bP;
      class_477 var3 = var1.method_599();
      var2 += var3.field_4157;
      return var2;
   }

   public float getMaxValue(class_66 var1) {
      return var1.method_461();
   }
}
