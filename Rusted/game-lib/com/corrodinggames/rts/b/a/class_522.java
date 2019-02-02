package com.corrodinggames.rts.b.a;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.b.a.d
public class class_522 {
   // $FF: renamed from: a () void
   public void method_3295() {
      class_236.method_1591("Running unit tests");
      (new class_520()).method_3293();
      (new class_521()).method_3294();
   }

   // $FF: renamed from: a (float, float) void
   public static void method_3296(float var0, float var1) {
      if (class_296.method_2042(var0 - var1) > 0.001F) {
         throw new RuntimeException("Asset failed:" + var0 + "!=" + var1);
      }
   }
}
