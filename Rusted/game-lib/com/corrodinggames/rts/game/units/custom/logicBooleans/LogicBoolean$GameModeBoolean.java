package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.gameFramework.class_236;

public class LogicBoolean$GameModeBoolean extends LogicBoolean {
   @LogicBoolean$Parameter
   public boolean nukesEnabled;

   public boolean read(class_66 var1) {
      boolean var2 = true;
      class_236 var3 = class_236.method_1549();
      if (this.nukesEnabled && var3.method_1656() && var3.field_1944.field_3863.field_3783) {
         var2 = false;
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }

   public String getMatchFailReasonForPlayer(class_66 var1) {
      return "GameMode - " + (this.nukesEnabled ? "Nukes enabled" : "Nukes disabled");
   }
}
