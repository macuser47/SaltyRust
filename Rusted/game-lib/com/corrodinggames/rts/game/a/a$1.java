package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.custom.class_479;

class a$1 extends class_150 {
   // $FF: renamed from: a com.corrodinggames.rts.game.a.a
   // $FF: synthetic field
   final class_112 field_1408;

   a$1(class_112 var1, String var2) {
      super(var1, var2);
      this.field_1408 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) boolean
   public boolean method_1143(class_24 var1) {
      class_39 var2 = class_39.method_216(var1);
      if (!var2.method_212() && var2 instanceof class_44 && !var2.method_278() && !var2.method_283() && ((class_44)var2).l()) {
         if (var1 instanceof class_479) {
            class_479 var3 = (class_479)var1;
            if (var3.field_4395) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
