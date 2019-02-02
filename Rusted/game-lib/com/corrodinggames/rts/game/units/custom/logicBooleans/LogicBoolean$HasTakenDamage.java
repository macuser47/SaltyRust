package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public class LogicBoolean$HasTakenDamage extends LogicBoolean$TimeBoolean {
   public int getTime(class_66 var1) {
      return var1.aN;
   }

   public String getName() {
      return "HasTakenDamage";
   }
}
