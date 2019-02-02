package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public class LogicBoolean$HeightBoolean extends LogicBoolean {
   @LogicBoolean$Parameter
   public boolean underwater;
   @LogicBoolean$Parameter
   public boolean ground;
   @LogicBoolean$Parameter
   public boolean flying;

   public String getMatchFailReasonForPlayer(class_66 var1) {
      String var2 = "";
      if (this.not) {
         var2 = var2 + "not ";
      }

      if (this.underwater) {
         var2 = var2 + "underwater ";
      }

      if (this.ground) {
         var2 = var2 + "ground ";
      }

      if (this.flying) {
         var2 = var2 + "flying ";
      }

      return var2;
   }

   public boolean read(class_66 var1) {
      boolean var2 = false;
      if (this.underwater && var1.dj < -2.0F) {
         var2 = true;
      }

      if (this.ground && var1.dj > -2.0F && var1.dj < 5.0F) {
         var2 = true;
      }

      if (this.flying && var1.dj > 5.0F) {
         var2 = true;
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }
}
