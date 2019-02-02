package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public abstract class LogicBoolean$AbstractBoolean extends LogicBoolean {
   @LogicBoolean$Parameter
   public boolean full;
   @LogicBoolean$Parameter
   public boolean empty;
   @LogicBoolean$Parameter
   public float greaterThan = -1.0F;
   @LogicBoolean$Parameter
   public float lessThan = -1.0F;

   public abstract String getName();

   public abstract float getValue(class_66 var1);

   public abstract float getMaxValue(class_66 var1);

   public String getMatchFailReasonForPlayer(class_66 var1) {
      String var2 = this.getName() + " ";
      if (this.not) {
         var2 = var2 + "not ";
      }

      if (this.full) {
         var2 = var2 + "full ";
      }

      if (this.empty) {
         var2 = var2 + "empty ";
      }

      return var2;
   }

   public boolean read(class_66 var1) {
      float var2 = this.getValue(var1);
      boolean var3 = true;
      if (this.full && var2 < this.getMaxValue(var1)) {
         var3 = false;
      }

      if (this.empty && var2 > 0.0F) {
         var3 = false;
      }

      if (this.greaterThan != -1.0F && var2 <= this.greaterThan) {
         var3 = false;
      }

      if (this.lessThan != -1.0F && var2 >= this.lessThan) {
         var3 = false;
      }

      if (this.not) {
         return !var3;
      } else {
         return var3;
      }
   }
}
