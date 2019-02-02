package com.corrodinggames.rts.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.corrodinggames.rts.gameFramework.class_236;

class e$8 implements OnClickListener {
   // $FF: renamed from: a android.widget.EditText
   // $FF: synthetic field
   final EditText field_2212;
   // $FF: renamed from: b com.corrodinggames.rts.a.e
   // $FF: synthetic field
   final class_273 field_2213;

   e$8(class_273 var1, EditText var2) {
      this.field_2213 = var1;
      this.field_2212 = var2;
   }

   public void onClick(DialogInterface var1, int var2) {
      String var3 = this.field_2212.getText().toString();
      class_236 var4 = class_236.method_1549();
      if (!var3.trim().equals("")) {
         var4.field_1944.method_2938(var3);
      }

      var4.field_1939.field_955 = false;
   }
}
