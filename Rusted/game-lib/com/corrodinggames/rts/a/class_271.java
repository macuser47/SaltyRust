package com.corrodinggames.rts.a;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_110;
import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_289;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $FF: renamed from: com.corrodinggames.rts.a.g
public class class_271 extends class_266 {
   // $FF: renamed from: b () void
   public void method_1871() {
      super.b();
      class_353.method_2299(this, true);
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   public static String method_1885(String var0) {
      String[] var1 = var0.split("/");
      return var1[var1.length - 1];
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) boolean
   public static boolean method_1886(String var0, String var1) {
      Pattern var2 = Pattern.compile(".*\\[(.*)\\].*");
      Matcher var3 = var2.matcher(var0);
      String var4;
      if (var3.matches()) {
         var4 = var3.group(1);
         if ((var4.toLowerCase(Locale.ENGLISH) + "|").contains("demo|")) {
            return true;
         }
      }

      var4 = var1.replace(".tmx", "");
      var4 = var4 + "_demo";
      return class_236.method_1634(var4);
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   public static String method_1887(String var0) {
      return class_353.method_2291(var0);
   }

   // $FF: renamed from: a (java.lang.String, boolean, int, int, boolean, boolean) void
   public static void method_1888(String var0, boolean var1, int var2, int var3, boolean var4, boolean var5) {
      class_236 var6 = class_236.method_1549();
      var6.field_1939.method_712();
      if (var1) {
         int var7 = 0;
         var6.method_1577();
         synchronized(var6) {
            var6.field_2002 = null;
            var6.field_2001 = var0;
            class_107.method_933();
            var6.field_1915 = new class_110(0);
            var6.field_1915.field_1233 = "You";

            int var9;
            for(var9 = 1; var9 <= var2; ++var9) {
               class_112 var10 = new class_112(var9);
               var10.field_1233 = "AI";
               if (var4) {
                  var10.field_1231 = 1;
               }

               if (var9 == 2 && var3 >= 1) {
                  var10.field_1231 = 0;
                  ++var7;
               }

               if (var9 == 4 && var3 >= 2) {
                  var10.field_1231 = 0;
                  ++var7;
               }

               if (var9 == 6 && var3 >= 3) {
                  var10.field_1231 = 0;
                  ++var7;
               }
            }

            var6.field_1944.method_2961();

            for(var9 = 1; var9 <= var2; ++var9) {
               class_107 var13 = class_107.method_954(var9);
               if (var13 != null) {
                  if (var7 >= var3) {
                     break;
                  }

                  if (var13.field_1231 != 0) {
                     var13.field_1231 = 0;
                     ++var7;
                  }
               }
            }

            if (!var5) {
               var6.method_1570(false, class_289.field_2445);
            }
         }
      } else {
         var6.method_1577();
         var6.field_2002 = null;
         var6.field_2001 = var0;
         if (!var5) {
            var6.method_1570(true, class_289.field_2445);
         }
      }

   }
}
