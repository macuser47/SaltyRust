package com.corrodinggames.rts.a;

import com.corrodinggames.rts.gameFramework.class_236;

class e$1 implements Runnable {
   // $FF: renamed from: a int
   // $FF: synthetic field
   final int field_2220;
   // $FF: renamed from: b com.corrodinggames.rts.a.e
   // $FF: synthetic field
   final class_273 field_2221;

   e$1(class_273 var1, int var2) {
      this.field_2221 = var1;
      this.field_2220 = var2;
   }

   public void run() {
      class_236.method_1591("inner selectMenuOption: " + this.field_2220);
      this.field_2221.method_1891(this.field_2220);
   }
}
