package com.corrodinggames.rts.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.corrodinggames.rts.gameFramework.class_236;

class e$6 implements OnClickListener {
   // $FF: renamed from: a com.corrodinggames.rts.a.e
   // $FF: synthetic field
   final class_273 field_2215;

   e$6(class_273 var1) {
      this.field_2215 = var1;
   }

   public void onClick(DialogInterface var1, int var2) {
      class_236 var3 = class_236.method_1549();
      var3.field_1944.method_2873("exited");
      this.field_2215.method_1871();
   }
}
