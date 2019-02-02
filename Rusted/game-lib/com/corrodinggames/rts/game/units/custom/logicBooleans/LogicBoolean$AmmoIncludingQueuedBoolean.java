package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_477;
import com.corrodinggames.rts.game.units.custom.class_66;

public final class LogicBoolean$AmmoIncludingQueuedBoolean extends LogicBoolean$AbstractBoolean {
   public String getName() {
      return "AmmoIncludingQueued";
   }

   public float getValue(class_66 var1) {
      int var2 = var1.bQ;
      class_477 var3 = var1.method_599();
      var2 += var3.field_4160;
      return (float)var2;
   }

   public float getMaxValue(class_66 var1) {
      return 2.14748365E9F;
   }
}
