package com.corrodinggames.rts.gameFramework.a;

import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.a.d
public class class_524 extends Thread {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.a.a
   // $FF: synthetic field
   final class_327 field_4748;

   public class_524(class_327 var1) {
      this.field_4748 = var1;
   }

   public void run() {
      class_236.method_1649();

      try {
         while(true) {
            class_523 var1 = (class_523)this.field_4748.field_2621.take();
            var1.method_3317();
            this.field_4748.field_2623.method_1255(var1);
         }
      } catch (InterruptedException var2) {
      }
   }
}
