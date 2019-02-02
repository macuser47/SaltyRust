package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.java.l
class class_343 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.java.Main
   // $FF: synthetic field
   final Main field_2739;

   class_343(Main var1) {
      this.field_2739 = var1;
   }

   public void run() {
      class_236.method_1649();

      while(this.field_2739.field_1822) {
         try {
            Thread.sleep(1000L);
            this.field_2739.method_1525(1000);
         } catch (InterruptedException var2) {
            var2.printStackTrace();
         }
      }

   }
}
