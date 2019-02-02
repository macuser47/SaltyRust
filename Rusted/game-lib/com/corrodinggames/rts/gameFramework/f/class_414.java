package com.corrodinggames.rts.gameFramework.f;

import java.io.IOException;
import java.util.TimerTask;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.ai
class class_414 extends TimerTask {
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.f.x
   private final class_454 field_3415;
   // $FF: renamed from: a boolean
   public boolean field_3416 = true;

   class_414(class_454 var1) {
      this.field_3415 = var1;
   }

   public void run() {
      try {
         if (this.field_3416) {
            class_404 var1 = new class_404();
            var1.method_2543(System.currentTimeMillis());
            var1.method_2539(0);
            class_413 var2 = var1.method_2535(108);
            this.field_3415.method_2923(var2);
         } else {
            this.field_3415.method_2909();
         }

         this.field_3416 = !this.field_3416;
      } catch (IOException var3) {
         var3.printStackTrace();
      }

   }
}
