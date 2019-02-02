package com.corrodinggames.rts.gameFramework;

import android.widget.Toast;

class k$1 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.k
   // $FF: synthetic field
   final class_236 field_3068;

   k$1(class_236 var1) {
      this.field_3068 = var1;
   }

   public void run() {
      String var1 = this.field_3068.field_2020;
      byte var2 = 1;
      Toast var3 = Toast.makeText(this.field_3068.field_1880, var1, var2);
      var3.show();
   }
}
