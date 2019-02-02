package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;

class j$2 implements Runnable {
   // $FF: renamed from: a java.lang.String
   // $FF: synthetic field
   final String field_1816;
   // $FF: renamed from: b java.lang.String
   // $FF: synthetic field
   final String field_1817;
   // $FF: renamed from: c com.corrodinggames.rts.java.j
   // $FF: synthetic field
   final class_330 field_1818;

   j$2(class_330 var1, String var2, String var3) {
      this.field_1818 = var1;
      this.field_1816 = var2;
      this.field_1817 = var3;
   }

   public void run() {
      class_236.method_1591("slick messageBox:" + this.field_1816);
      this.field_1818.field_2633.field_1847.method_1840(this.field_1817, this.field_1816);
   }
}
