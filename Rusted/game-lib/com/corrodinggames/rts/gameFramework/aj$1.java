package com.corrodinggames.rts.gameFramework;

import android.util.Log;

class aj$1 extends Thread {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.aj
   // $FF: synthetic field
   final class_439 field_3511;

   aj$1(class_439 var1) {
      this.field_3511 = var1;
   }

   public void run() {
      if (this.field_3511.field_3687) {
         Log.method_1708("RustedWarfare", "Music:pause() unsynchronized");
         this.field_3511.method_2764();
      } else {
         synchronized(this.field_3511.field_3679) {
            Log.method_1708("RustedWarfare", "Music:pause() synchronized");
            this.field_3511.method_2764();
         }
      }

   }
}
