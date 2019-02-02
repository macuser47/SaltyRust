package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_476;
import com.corrodinggames.rts.game.units.custom.class_478;
import com.corrodinggames.rts.game.units.custom.class_66;

public class LogicBoolean$TagsBoolean extends LogicBoolean {
   public class_476 includesTag;

   @LogicBoolean$Parameter
   public void includes(String var1) {
      this.includesTag = class_476.method_3110(var1);
   }

   public String getMatchFailReasonForPlayer(class_66 var1) {
      String var2 = "Tag ";
      if (this.not) {
         var2 = var2 + "not ";
      }

      if (this.includesTag != null) {
         var2 = var2 + " includes " + this.includesTag;
      }

      return var2;
   }

   public boolean read(class_66 var1) {
      boolean var2 = true;
      if (this.includesTag != null) {
         class_478 var3 = var1.method_331();
         if (var3 == null || !class_476.method_3114(this.includesTag, var3)) {
            var2 = false;
         }
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }
}
