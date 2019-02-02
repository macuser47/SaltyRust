package com.corrodinggames.rts.java;

import android.os.Looper;
import com.corrodinggames.rts.gameFramework.class_236;
import java.util.concurrent.Semaphore;

class Main$2 implements Runnable {
   // $FF: renamed from: a java.util.concurrent.Semaphore
   // $FF: synthetic field
   final Semaphore field_4477;
   // $FF: renamed from: b com.corrodinggames.rts.java.Main
   // $FF: synthetic field
   final Main field_4478;

   Main$2(Main var1, Semaphore var2) {
      this.field_4478 = var1;
      this.field_4477 = var2;
   }

   public void run() {
      class_236.method_1649();
      Looper.method_3226();
      this.field_4477.release(1);
      Looper.method_3228();
   }
}
