package com.corrodinggames.rts.gameFramework;

class aj$2 extends Thread {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.aj
   // $FF: synthetic field
   final class_439 field_3478;

   aj$2(class_439 var1) {
      this.field_3478 = var1;
   }

   public void run() {
      synchronized(this.field_3478.field_3679) {
         if (this.field_3478.field_3689) {
            this.field_3478.field_3688.method_2171();
            if (!this.field_3478.field_3703) {
               this.field_3478.field_3688.method_2166(this.field_3478.method_2751(), this.field_3478.method_2751());
            }
         }

         if (this.field_3478.field_3702) {
            this.field_3478.field_3701.method_2171();
         }

      }
   }
}
