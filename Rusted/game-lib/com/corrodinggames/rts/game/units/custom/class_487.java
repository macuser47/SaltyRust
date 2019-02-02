package com.corrodinggames.rts.game.units.custom;

import java.util.Comparator;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.o
class class_487 implements Comparator {
   public strictfp class_487() {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, com.corrodinggames.rts.game.units.custom.g) int
   public strictfp int method_3207(class_479 var1, class_479 var2) {
      return var1.field_4204 != null && var2.field_4204 != null ? var1.field_4204.compareTo(var2.field_4204) : 0;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_3207((class_479)var1, (class_479)var2);
   }
}
