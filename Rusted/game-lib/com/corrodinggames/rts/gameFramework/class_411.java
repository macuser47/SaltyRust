package com.corrodinggames.rts.gameFramework;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.ar
class class_411 extends Thread {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.aj
   // $FF: synthetic field
   final class_439 field_3403;

   class_411(class_439 var1) {
      this.field_3403 = var1;
   }

   public void run() {
      while(true) {
         float var1 = 1.0F;
         synchronized(this.field_3403.field_3680) {
            this.field_3403.field_3684 = true;
            if (!this.field_3403.field_3683) {
               try {
                  this.field_3403.field_3680.wait((long)class_439.field_3678.method_2155());
               } catch (InterruptedException var7) {
               }
            }

            this.field_3403.field_3683 = false;
            var1 = this.field_3403.field_3681;
         }

         synchronized(this.field_3403.field_3679) {
            if (!this.field_3403.method_2761(var1)) {
               return;
            }
         }
      }
   }
}
