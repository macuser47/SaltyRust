package com.corrodinggames.rts.gameFramework;

import java.util.Comparator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.v
class class_286 implements Comparator {
   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.u, com.corrodinggames.rts.gameFramework.u) int
   public strictfp int method_1983(class_34 var1, class_34 var2) {
      if (var1.field_73 > var2.field_73) {
         return 1;
      } else if (var1.field_73 < var2.field_73) {
         return -1;
      } else if (var1.field_75 > var2.field_75) {
         return 1;
      } else {
         return var1.field_75 < var2.field_75 ? -1 : 0;
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_1983((class_34)var1, (class_34)var2);
   }
}
