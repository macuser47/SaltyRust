package com.corrodinggames.rts.game.units;

import java.util.Comparator;

final class ao$44 implements Comparator {
   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, com.corrodinggames.rts.game.units.ap) int
   public int method_3326(class_24 var1, class_24 var2) {
      Integer var3 = var1.method_130();
      Integer var4 = var2.method_130();
      int var5 = var3.compareTo(var4);
      return var5;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_3326((class_24)var1, (class_24)var2);
   }
}
