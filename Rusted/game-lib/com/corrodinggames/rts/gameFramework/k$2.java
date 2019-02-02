package com.corrodinggames.rts.gameFramework;

import android.app.AlertDialog.Builder;

class k$2 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.k
   // $FF: synthetic field
   final class_236 field_3069;

   k$2(class_236 var1) {
      this.field_3069 = var1;
   }

   public void run() {
      k$2$1 var1 = new k$2$1(this);
      k$2$2 var2 = new k$2$2(this);
      class_236.method_1591("showMessageBoxRunnable context:" + this.field_3069.field_1880.getClass().getName());
      (new Builder(this.field_3069.field_1880)).setIcon(17301543).setTitle(this.field_3069.field_2022).setMessage(this.field_3069.field_2023).setOnCancelListener(var2).setPositiveButton("Ok", var1).show();
   }
}
