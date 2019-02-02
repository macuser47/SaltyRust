package com.corrodinggames.rts.gameFramework;

class k$3 extends Thread {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.k
   // $FF: synthetic field
   final class_236 field_3071;

   strictfp k$3(class_236 var1) {
      this.field_3071 = var1;
   }

   public strictfp void run() {
      try {
         sleep(3000L);
      } catch (InterruptedException var2) {
      }

      this.field_3071.method_1610();
   }
}
