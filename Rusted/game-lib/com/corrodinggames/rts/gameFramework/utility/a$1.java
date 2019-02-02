package com.corrodinggames.rts.gameFramework.utility;

import java.util.Comparator;

final class a$1 implements Comparator {
   // $FF: renamed from: a java.lang.Thread
   // $FF: synthetic field
   final Thread field_4774;

   a$1(Thread var1) {
      this.field_4774 = var1;
   }

   // $FF: renamed from: a (java.lang.Thread, java.lang.Thread) int
   public int method_3327(Thread var1, Thread var2) {
      if (var1 == var2) {
         return 0;
      } else if (var1 == this.field_4774) {
         return 1;
      } else {
         return var2 == this.field_4774 ? -1 : var2.getName().compareTo(var1.getName());
      }
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_3327((Thread)var1, (Thread)var2);
   }
}
