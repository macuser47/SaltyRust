package com.corrodinggames.rts.gameFramework.utility;

class d$3 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.d
   // $FF: synthetic field
   final class_227 field_2790;

   d$3(class_227 var1) {
      this.field_2790 = var1;
   }

   public void run() {
      class_227.method_1481(this.field_2790, (class_227.method_1482(this.field_2790) + 1) % Integer.MAX_VALUE);
   }
}
