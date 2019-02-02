package com.corrodinggames.rts.java;

import com.corrodinggames.rts.a.class_270;
import com.corrodinggames.rts.gameFramework.class_236;

class Main$3 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.java.Main
   // $FF: synthetic field
   final Main field_4466;

   Main$3(Main var1) {
      this.field_4466 = var1;
   }

   public void run() {
      class_236 var1 = class_236.method_1549();
      class_236.method_1591("got startGameEvent..");
      class_270.method_1884();
      var1.field_1929 = false;
      var1.field_1884 = false;
      this.field_4466.field_1836 = false;
      this.field_4466.method_1513();
      this.field_4466.field_1847.getActiveDocument();
      if (this.field_4466.field_1847.field_2314 != null) {
         this.field_4466.field_1847.field_2314.getRoot().resumeNonMenu();
      } else {
         class_236.method_1591("startGameEvent: scriptEngine==null");
         class_236.method_1594();
      }

   }
}
