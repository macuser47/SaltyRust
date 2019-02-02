package com.corrodinggames.rts.a;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

class e$11 implements OnClickListener {
   // $FF: renamed from: a android.widget.EditText
   // $FF: synthetic field
   final EditText field_3243;
   // $FF: renamed from: b com.corrodinggames.rts.a.e
   // $FF: synthetic field
   final class_273 field_3244;

   e$11(class_273 var1, EditText var2) {
      this.field_3244 = var1;
      this.field_3243 = var2;
   }

   public void onClick(DialogInterface var1, int var2) {
      String var3 = this.field_3243.getText().toString();
      if (!var3.contains("/") && !var3.contains("\\") && !var3.contains(":") && !var3.contains("*") && !var3.contains("?") && !var3.contains("\"") && !var3.contains("<") && !var3.contains(">")) {
         this.field_3244.method_1894(var3);
      } else {
         Builder var4 = new Builder(this.field_3244);
         var4.setTitle("Bad Save Name");
         var4.setMessage("The characters /\\:*?\"<> are not allowed (fat32 formatting)");
         var4.setPositiveButton("Ok", new e$11$1(this, var3));
         var4.show();
      }

   }
}
