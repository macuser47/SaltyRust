package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.java.t
public class class_304 extends Thread {
   // $FF: renamed from: a com.corrodinggames.rts.java.q
   // $FF: synthetic field
   final class_328 field_2518;

   public class_304(class_328 var1) {
      this.field_2518 = var1;
   }

   public void run() {
      class_236.method_1649();

      try {
         while(true) {
            class_297 var1 = (class_297)this.field_2518.field_2628.take();
            var1.method_2102();
            this.field_2518.field_2629.method_1255(var1);
         }
      } catch (InterruptedException var2) {
      }
   }
}
