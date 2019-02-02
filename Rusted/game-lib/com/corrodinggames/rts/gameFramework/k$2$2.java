package com.corrodinggames.rts.gameFramework;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class k$2$2 implements OnCancelListener {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.k$2
   // $FF: synthetic field
   final k$2 field_4011;

   k$2$2(k$2 var1) {
      this.field_4011 = var1;
   }

   public void onCancel(DialogInterface var1) {
      this.field_4011.field_3069.field_1913 = false;
   }
}
