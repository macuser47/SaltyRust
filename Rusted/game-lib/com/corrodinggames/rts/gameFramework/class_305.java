package com.corrodinggames.rts.gameFramework;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.i
public class class_305 {
   // $FF: renamed from: a java.util.concurrent.ConcurrentHashMap
   static ConcurrentHashMap field_2519 = new ConcurrentHashMap();
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.j
   static class_331 field_2520;

   // $FF: renamed from: a (java.lang.String, boolean) long
   public static long method_2107(String var0, boolean var1) {
      Long var2 = (Long)field_2519.get(var0);
      if (var2 != null) {
         return var2;
      } else {
         var2 = method_2108(var0);
         if (!var1) {
            field_2519.put(var0, var2);
            if (field_2520 == null) {
            }
         }

         return var2;
      }
   }

   // $FF: renamed from: b (java.lang.String) long
   private static long method_2108(String var0) {
      File var1 = new File(var0);
      return var1.lastModified();
   }

   // $FF: renamed from: a () void
   public static synchronized void method_2109() {
      method_2110(class_236.method_1549().field_1937.liveReloading);
   }

   // $FF: renamed from: a (boolean) void
   public static synchronized void method_2110(boolean var0) {
      if (class_236.method_1654()) {
         if (var0) {
            if (field_2520 != null) {
               class_236.method_1591("FileChangeEngine: Already running");
               return;
            }

            class_236.method_1591("FileChangeEngine: Starting");
            field_2520 = new class_331();
            field_2520.start();
         } else if (field_2520 != null) {
            field_2520.field_2635 = false;
            field_2520 = null;
         }

      }
   }

   // $FF: renamed from: a (java.lang.String) long
   // $FF: synthetic method
   static long method_2111(String var0) {
      return method_2108(var0);
   }
}
