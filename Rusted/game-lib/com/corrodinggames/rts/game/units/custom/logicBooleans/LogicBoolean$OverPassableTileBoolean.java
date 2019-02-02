package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.utility.class_205;

public class LogicBoolean$OverPassableTileBoolean extends LogicBoolean {
   class_503 movementType;

   public LogicBoolean$OverPassableTileBoolean() {
      this.movementType = class_503.field_4618;
   }

   @LogicBoolean$Parameter
   public void type(String var1) {
      this.movementType = class_503.method_3232(var1, "isOverPassableTile()");
   }

   public boolean read(class_66 var1) {
      boolean var2 = false;
      class_236 var3 = class_236.method_1549();
      if (!class_205.method_1368(var1.dh, var1.di, this.movementType)) {
         var2 = true;
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }

   public String getMatchFailReasonForPlayer(class_66 var1) {
      return "OverLand";
   }
}
