package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public final class LogicBoolean$TimeAliveBoolean extends LogicBoolean$TimeBoolean {
   public String getName() {
      return "TimeAlive";
   }

   public int getTime(class_66 var1) {
      return var1.aP;
   }
}
