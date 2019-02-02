package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.custom.class_476;
import com.corrodinggames.rts.game.units.custom.class_478;
import com.corrodinggames.rts.game.units.custom.class_66;

public class LogicBoolean$TransportingUnitWithTagsBoolean extends LogicBoolean {
   public class_476 includesTag;

   @LogicBoolean$Parameter
   public void includes(String var1) {
      this.includesTag = class_476.method_3110(var1);
   }

   public String getMatchFailReasonForPlayer(class_66 var1) {
      String var2 = "TransportingUnitWithTags ";
      if (this.not) {
         var2 = var2 + "not ";
      }

      if (this.includesTag != null) {
         var2 = var2 + " includes " + this.includesTag;
      }

      return var2;
   }

   public boolean read(class_66 var1) {
      boolean var2 = false;
      if (this.includesTag != null) {
         Object[] var3 = var1.field_551.method_1298();

         for(int var4 = 0; var4 < var1.field_551.field_1647; ++var4) {
            class_39 var5 = (class_39)var3[var4];
            class_478 var6 = var5.method_331();
            if (var6 != null && class_476.method_3114(this.includesTag, var6)) {
               var2 = true;
            }
         }
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }
}
