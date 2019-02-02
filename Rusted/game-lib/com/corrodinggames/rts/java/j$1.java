package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;

class j$1 implements Runnable {
   // $FF: renamed from: a java.lang.String
   // $FF: synthetic field
   final String field_1814;
   // $FF: renamed from: b com.corrodinggames.rts.java.j
   // $FF: synthetic field
   final class_330 field_1815;

   j$1(class_330 var1, String var2) {
      this.field_1815 = var1;
      this.field_1814 = var2;
   }

   public void run() {
      class_236.method_1591("slick post-alert:" + this.field_1814);
      this.field_1815.field_2633.field_1847.method_1840("", this.field_1814);
   }
}
