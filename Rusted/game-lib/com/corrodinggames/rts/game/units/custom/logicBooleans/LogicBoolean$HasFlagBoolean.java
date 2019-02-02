package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.class_66;

public class LogicBoolean$HasFlagBoolean extends LogicBoolean {
   public int flagMask = 0;
   public int flagId = -1;

   // $FF: renamed from: id (int) void
   @LogicBoolean$Parameter
   public void method_1250(int var1) {
      if (var1 >= 0 && var1 <= 31) {
         this.flagId = var1;
         this.flagMask = 1 << var1;
      } else {
         throw new RuntimeException("Flag id must be between 0-31");
      }
   }

   public static boolean isFlagSet(int var0, int var1) {
      return (var1 & var0) == var1;
   }

   public static byte setFlag(int var0, int var1) {
      return (byte)(var1 | var0);
   }

   public static byte unsetFlag(int var0, int var1) {
      return (byte)(var1 & ~var0);
   }

   public String getMatchFailReasonForPlayer(class_66 var1) {
      String var2 = "HasFlag ";
      if (this.not) {
         var2 = var2 + "not ";
      }

      var2 = var2 + "id:" + this.flagId;
      return var2;
   }

   public boolean read(class_66 var1) {
      boolean var2 = true;
      if (this.flagMask != 0 && !isFlagSet(var1.bR, this.flagMask)) {
         var2 = false;
      }

      if (this.not) {
         return !var2;
      } else {
         return var2;
      }
   }
}
