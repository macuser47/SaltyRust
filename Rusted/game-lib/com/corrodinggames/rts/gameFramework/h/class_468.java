package com.corrodinggames.rts.gameFramework.h;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.n
public class class_468 {
   // $FF: renamed from: a (java.lang.String, float, float, android.graphics.Paint) void
   public static void method_3048(String var0, float var1, float var2, Paint var3) {
      class_236 var4 = class_236.method_1549();
      String[] var5 = var0.split("\n");
      float var6 = (float)var4.field_1935.method_101("|1A", var3);
      float var7 = (float)var5.length * var6;
      int var8 = 0;
      String[] var9 = var5;
      int var10 = var5.length;

      for(int var11 = 0; var11 < var10; ++var11) {
         String var12 = var9[var11];
         float var15 = var2 - var7 / 2.0F + (float)var8 * var6 + var6;
         var4.field_1935.method_78(var12, var1, var15, var3);
         ++var8;
      }

   }
}
