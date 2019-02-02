package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.gameFramework.class_296;

public class LogicBoolean$SpeedBoolean extends LogicBoolean {
   @LogicBoolean$Parameter
   public boolean atTopSpeed;

   public boolean read(class_66 var1) {
      boolean var2 = false;
      float var3 = var1.method_458() - 0.1F;
      float var4 = class_296.method_2026(0.0F, 0.0F, var1.br, var1.bs);
      if (var4 > var3 * var3) {
         var2 = true;
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }

   public String getMatchFailReasonForPlayer(class_66 var1) {
      return "Speed";
   }
}
