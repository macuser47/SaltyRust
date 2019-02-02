package com.corrodinggames.rts.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $FF: renamed from: com.corrodinggames.rts.a.c
public class class_353 {
   // $FF: renamed from: a android.content.Context
   static volatile Context field_2788;

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_2291(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String[] var1;
         if (var0.contains(File.separator)) {
            var1 = var0.split(File.separator);
            var0 = var1[var1.length - 1];
         }

         if (var0.contains("/")) {
            var1 = var0.split("/");
            var0 = var1[var1.length - 1];
         }

         String var4 = null;
         Pattern var2;
         Matcher var3;
         if (var4 == null) {
            var2 = Pattern.compile("^l\\d*;\\[.*\\](.+)\\.tmx");
            var3 = var2.matcher(var0);
            if (var3.matches()) {
               var4 = var3.group(1);
               if (var4.length() >= 1) {
                  var4 = var4.substring(0, 1).toUpperCase() + var4.substring(1);
               }
            }
         }

         if (var4 == null) {
            var2 = Pattern.compile("^l\\d*;(.+)\\.tmx");
            var3 = var2.matcher(var0);
            if (var3.matches()) {
               var4 = var3.group(1);
               if (var4.length() >= 1) {
                  var4 = var4.substring(0, 1).toUpperCase() + var4.substring(1);
               }
            }
         }

         if (var4 == null) {
            var2 = Pattern.compile("^ *\\[.*\\](.+)\\.tmx");
            var3 = var2.matcher(var0);
            if (var3.matches()) {
               var4 = var3.group(1);
               if (var4.length() >= 1) {
                  var4 = var4.substring(0, 1).toUpperCase() + var4.substring(1);
               }
            }
         }

         if (var4 == null) {
            var2 = Pattern.compile("(.*)\\.tmx");
            var3 = var2.matcher(var0);
            if (var3.matches()) {
               var4 = var3.group(1);
               if (var4.length() >= 1) {
                  var4 = var4.substring(0, 1).toUpperCase() + var4.substring(1);
               }
            }
         }

         if (var4 == null) {
            var4 = var0;
         }

         var4 = var4.replace('_', ' ');
         return var4;
      }
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static String method_2292(String var0) {
      String var1 = var0.replace(".tmx", "");
      var1 = var1 + "_map.png";
      return var1;
   }

   // $FF: renamed from: c (android.app.Activity) void
   private static void method_2293(Activity var0) {
      if (VERSION.SDK_INT >= 19) {
         var0.method_1867().getDecorView().setSystemUiVisibility(5894);
      }

   }

   // $FF: renamed from: d (android.app.Activity) void
   private static void method_2294(Activity var0) {
   }

   // $FF: renamed from: a () android.content.Context
   public static Context method_2295() {
      if (field_2788 == null) {
         throw new RuntimeException("ApplicationContext==null");
      } else {
         return field_2788;
      }
   }

   // $FF: renamed from: a (android.app.Activity) void
   public static void method_2296(Activity var0) {
      if (field_2788 == null) {
         field_2788 = var0.g();
      }

   }

   // $FF: renamed from: a (android.content.Context) void
   public static void method_2297(Context var0) {
      if (field_2788 == null) {
         field_2788 = var0.method_1856();
      }

   }

   // $FF: renamed from: a (android.app.Activity, boolean, boolean) void
   public static void method_2298(Activity var0, boolean var1, boolean var2) {
      method_2296(var0);
      class_236 var3;
      if (var2) {
         var3 = class_236.method_1549();
         if (var3 != null && var3.field_1937.immersiveFullScreen) {
            method_2293(var0);
         }
      } else {
         method_2294(var0);
      }

      var3 = class_236.method_1549();
      if (var3 != null) {
         var3.method_1610();
      }

      if (var1) {
         var0.method_1867().setBackgroundDrawable((Drawable)null);
      }

   }

   // $FF: renamed from: a (android.app.Activity, boolean) void
   public static void method_2299(Activity var0, boolean var1) {
      if (var1) {
         var0.method_1873(0, 0);
      }

   }

   // $FF: renamed from: b (android.app.Activity) boolean
   public static boolean method_2300(Activity var0) {
      class_236 var1 = class_236.method_1549();
      if (class_236.field_1899) {
         return true;
      } else if (VERSION.SDK_INT >= 23) {
         if (var1.method_1660() == null) {
         }

         if (ContextCompat.method_3278(var0, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            class_236.method_1591("File Permission is granted");
            return true;
         } else {
            class_236.method_1591("Permission is revoked");
            ActivityCompat.method_2435(var0, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return false;
         }
      } else {
         return true;
      }
   }
}
