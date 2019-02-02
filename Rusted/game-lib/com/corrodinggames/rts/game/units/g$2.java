package com.corrodinggames.rts.game.units;

import java.util.Comparator;

final class g$2 implements Comparator {
   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, com.corrodinggames.rts.game.units.ap) int
   public strictfp int method_2496(class_24 var1, class_24 var2) {
      class_39 var4 = class_39.method_217(var1);
      class_39 var5 = class_39.method_217(var2);
      Boolean var6 = var4.method_223();
      Boolean var7 = var5.method_223();
      int var3 = var6.compareTo(var7);
      if (var3 != 0) {
         return var3;
      } else {
         Boolean var8 = var1.method_134();
         Boolean var9 = var2.method_134();
         var3 = var8.compareTo(var9);
         if (var3 != 0) {
            return var3;
         } else {
            Boolean var10 = var4.method_222();
            Boolean var11 = var5.method_222();
            var3 = var10.compareTo(var11);
            if (var3 != 0) {
               return var3;
            } else {
               Integer var12 = var1.method_130();
               Integer var13 = var2.method_130();
               var3 = var12.compareTo(var13);
               return var3;
            }
         }
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_2496((class_24)var1, (class_24)var2);
   }
}
