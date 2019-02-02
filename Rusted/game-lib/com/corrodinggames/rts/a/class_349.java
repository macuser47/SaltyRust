package com.corrodinggames.rts.a;

import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.a.f
class class_349 implements Runnable {
   // $FF: renamed from: a java.lang.String
   public String field_2749;
   // $FF: renamed from: b com.corrodinggames.rts.a.e
   // $FF: synthetic field
   final class_273 field_2750;

   class_349(class_273 var1) {
      this.field_2750 = var1;
   }

   public void run() {
      class_236 var1 = class_236.method_1549();
      var1.method_1577();
      var1.field_1947.method_1988(this.field_2749);
      var1.method_1576();
      if (this.field_2750.field_2342 != null && this.field_2750.field_2342.isShowing()) {
         this.field_2750.b(0);
      }

   }
}
