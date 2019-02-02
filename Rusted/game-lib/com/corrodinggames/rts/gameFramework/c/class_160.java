package com.corrodinggames.rts.gameFramework.c;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.class_236;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.c
public class class_160 {
   // $FF: renamed from: a android.graphics.Rect
   static Rect field_1449 = new Rect();
   // $FF: renamed from: b java.util.ArrayList
   static ArrayList field_1450 = new ArrayList();

   // $FF: renamed from: a (android.graphics.Paint) int
   public static int method_1175(Paint var0) {
      String var1 = "abcABC123!|";
      return class_236.method_1549().field_1935.method_101(var1, var0) + 4;
   }

   // $FF: renamed from: a (java.lang.String, android.graphics.Rect, android.graphics.Paint, android.graphics.Paint, boolean) java.util.ArrayList
   public static ArrayList method_1176(String var0, Rect var1, Paint var2, Paint var3, boolean var4) {
      field_1450.clear();
      String var5 = "";
      int var6 = 0;

      int var8;
      for(int var7 = 0; var7 < var0.length(); var7 += var8) {
         var8 = var3.method_2812(var0, var7, var0.length(), true, (float)(var1.method_1904() - 5), (float[])null);
         if (var8 == 0) {
            break;
         }

         int var9 = var0.indexOf("\n", var7 + 1);
         String var10;
         if (var9 != -1 && var9 < var7 + var8) {
            var8 = var9 - var7;
         } else if (var7 + var8 < var0.length()) {
            var10 = var0.substring(var7, var7 + var8);
            int var11 = var10.lastIndexOf(" ");
            if (var11 != -1 && var11 != 0) {
               var8 = var11;
            }
         }

         var10 = var0.substring(var7, var7 + var8);
         var10 = var10.replaceAll("(\\n)", "");
         if (var10.length() > var5.length()) {
            var5 = var10;
            var6 = field_1450.size();
         }

         field_1450.add(var10);
      }

      var1.field_2355 = var1.field_2353 + field_1450.size() * method_1175(var3);
      if (var4) {
         float var12 = (float)var1.method_1906();
         Paint var13 = var3;
         if (var6 == 0) {
            var13 = var2;
         }

         float var14 = (float)class_236.method_1549().field_1935.method_102(var5, var13);
         if (var14 < (float)var1.method_1904()) {
            var1.field_2352 = (int)(var12 - var14 / 2.0F);
            var1.field_2354 = (int)(var12 + var14 / 2.0F);
         }
      }

      return field_1450;
   }
}
