package com.corrodinggames.rts.a;

import com.corrodinggames.rts.gameFramework.f.class_462;
import java.util.Comparator;

final class m$1 implements Comparator {
   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.g) int
   public int method_2424(class_462 var1) {
      if (var1.field_3976.equals("chat")) {
         return 1;
      } else if (var1.field_3961) {
         return 2;
      } else if (!var1.field_3976.equals("battleroom")) {
         return 99;
      } else {
         if (var1.field_3979 != -1 && var1.field_3979 < var1.field_3980) {
            if (var1.field_3966 && !var1.field_3981) {
               return 3;
            }

            if (var1.field_3981) {
               return 4;
            }
         } else {
            if (var1.field_3966 && !var1.field_3981) {
               return 5;
            }

            if (var1.field_3981) {
               return 6;
            }
         }

         return 6;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.g, com.corrodinggames.rts.gameFramework.f.g) int
   public int method_2425(class_462 var1, class_462 var2) {
      Integer var3 = this.method_2424(var1);
      Integer var4 = this.method_2424(var2);
      int var5 = var3.compareTo(var4);
      return var5 != 0 ? var5 : var1.field_3974.compareTo(var2.field_3974);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_2425((class_462)var1, (class_462)var2);
   }
}
