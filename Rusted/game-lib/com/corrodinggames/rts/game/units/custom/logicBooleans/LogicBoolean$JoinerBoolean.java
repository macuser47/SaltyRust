package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public abstract class LogicBoolean$JoinerBoolean extends LogicBoolean {
   LogicBoolean[] children;

   public abstract String type();

   public static LogicBoolean createJoiner(String var0, LogicBoolean[] var1) {
      Object var2;
      if (var0.equals("or")) {
         var2 = new LogicBoolean$OrBoolean();
      } else {
         if (!var0.equals("and")) {
            throw new RuntimeException("LogicBoolean: unknown joiner:'" + var0 + "'");
         }

         var2 = new LogicBoolean$AndBoolean();
      }

      ((LogicBoolean$JoinerBoolean)var2).children = var1;
      return (LogicBoolean)var2;
   }

   public String getMatchFailReasonForPlayer(class_66 var1) {
      String var2 = "(";
      boolean var3 = true;
      LogicBoolean[] var4 = this.children;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         LogicBoolean var7 = var4[var6];
         if (!var7.read(var1)) {
            if (var3) {
               var3 = false;
            } else {
               var2 = var2 + " " + this.type() + " ";
            }

            var2 = var2 + var7.getMatchFailReasonForPlayer(var1);
         }
      }

      var2 = var2 + ")";
      return var2;
   }
}
