package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.gameFramework.class_236;

public abstract class LogicBoolean$TimeBoolean extends LogicBoolean {
   @LogicBoolean$Parameter
   public float laterThanSeconds = -1.0F;
   @LogicBoolean$Parameter
   public float withinSeconds = -1.0F;

   public abstract String getName();

   public abstract int getTime(class_66 var1);

   public String getMatchFailReasonForPlayer(class_66 var1) {
      String var2 = this.getName() + " ";
      if (this.not) {
         var2 = var2 + "not ";
      }

      return var2;
   }

   public boolean read(class_66 var1) {
      int var2 = this.getTime(var1);
      boolean var3 = true;
      class_236 var4 = class_236.method_1549();
      if (this.withinSeconds > 0.0F && (float)var4.field_1921 - this.withinSeconds * 1000.0F > (float)var2) {
         var3 = false;
      }

      if (this.laterThanSeconds > 0.0F && (float)var4.field_1921 - this.laterThanSeconds * 1000.0F < (float)var2) {
         var3 = false;
      }

      if (this.not) {
         return !var3;
      } else {
         return var3;
      }
   }
}
