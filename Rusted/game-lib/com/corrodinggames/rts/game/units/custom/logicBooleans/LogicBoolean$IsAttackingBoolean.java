package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public class LogicBoolean$IsAttackingBoolean extends LogicBoolean {
   public boolean read(class_66 var1) {
      boolean var2 = false;
      if (var1.P()) {
         var2 = true;
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }

   public String getMatchFailReasonForPlayer(class_66 var1) {
      return "Is Attacking";
   }
}
