package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_134;
import com.corrodinggames.rts.game.units.custom.class_479;
import java.util.Iterator;

class a$8 extends class_150 {
   // $FF: renamed from: a com.corrodinggames.rts.game.a.a
   // $FF: synthetic field
   final class_112 field_1402;

   a$8(class_112 var1, String var2) {
      super(var1, var2);
      this.field_1402 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) boolean
   public boolean method_1143(class_24 var1) {
      class_39 var2 = class_39.method_216(var1);
      if (var2.method_212()) {
         if (var1 instanceof class_479) {
            class_479 var3 = (class_479)var1;
            if (var3.field_4395) {
               return false;
            }
         }

         boolean var8 = false;
         Iterator var4 = var2.method_260().iterator();

         while(var4.hasNext()) {
            class_121 var5 = (class_121)var4.next();
            if (var5 != null && var5 instanceof class_134) {
               class_134 var6 = (class_134)var5;
               if (!var6.x()) {
                  class_24 var7 = var6.i();
                  if (var7 != null && !var7.method_134()) {
                     var8 = true;
                  }
               }
            }
         }

         if (var8) {
            return true;
         }
      }

      return false;
   }
}
