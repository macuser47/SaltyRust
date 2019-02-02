package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public class LogicBoolean$TransportingCountBoolean extends LogicBoolean {
   @LogicBoolean$Parameter
   public int greaterThan = -1;
   @LogicBoolean$Parameter
   public int lessThan = -1;
   @LogicBoolean$Parameter
   public boolean empty;

   public String getMatchFailReasonForPlayer(class_66 var1) {
      String var2 = "Transporting ";
      if (this.not) {
         var2 = var2 + "not ";
      }

      if (this.greaterThan != -1) {
         var2 = var2 + ">" + this.greaterThan;
      }

      if (this.lessThan != -1) {
         var2 = var2 + "<" + this.lessThan;
      }

      if (this.empty) {
         var2 = var2 + "empty ";
      }

      return var2;
   }

   public boolean read(class_66 var1) {
      boolean var2 = true;
      if (this.greaterThan != -1 && var1.method_20() <= this.greaterThan) {
         var2 = false;
      }

      if (this.lessThan != -1 && var1.method_20() >= this.lessThan) {
         var2 = false;
      }

      if (this.empty && var1.method_20() != 0) {
         var2 = false;
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }
}
