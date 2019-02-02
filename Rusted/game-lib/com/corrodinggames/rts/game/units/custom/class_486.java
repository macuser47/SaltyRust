package com.corrodinggames.rts.game.units.custom;

import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.l
class class_486 {
   // $FF: renamed from: a java.lang.String
   String field_4500;
   // $FF: renamed from: b com.corrodinggames.rts.game.units.custom.m
   class_485 field_4501;
   // $FF: renamed from: c com.corrodinggames.rts.game.units.custom.g
   // $FF: synthetic field
   final class_479 field_4502;

   public strictfp class_486(class_479 var1) {
      this.field_4502 = var1;
   }

   // $FF: renamed from: a () void
   public strictfp void method_3205() {
      if (this.field_4500 != null && this.method_3206() == null) {
         throw new RuntimeException("Failed to find animation:" + this.field_4500);
      }
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.custom.m
   public strictfp class_485 method_3206() {
      if (this.field_4500 == null) {
         return null;
      } else if (this.field_4501 != null) {
         return this.field_4501;
      } else {
         Iterator var1 = this.field_4502.field_4314.iterator();

         class_485 var2;
         do {
            if (!var1.hasNext()) {
               return null;
            }

            var2 = (class_485)var1.next();
         } while(!var2.field_4485.equalsIgnoreCase(this.field_4500));

         this.field_4501 = var2;
         return var2;
      }
   }
}
