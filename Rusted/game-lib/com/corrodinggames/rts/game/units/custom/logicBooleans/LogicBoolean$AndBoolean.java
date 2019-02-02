package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public final class LogicBoolean$AndBoolean extends LogicBoolean$JoinerBoolean {
   public String type() {
      return "and";
   }

   public boolean read(class_66 var1) {
      LogicBoolean[] var2 = this.children;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         LogicBoolean var5 = var2[var4];
         if (!var5.read(var1)) {
            return false;
         }
      }

      return true;
   }
}
