package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.class_236;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public class SlickToAndroidKeycodes {
   // $FF: renamed from: a java.util.HashMap
   static HashMap field_1721 = new HashMap();
   // $FF: renamed from: b java.util.HashMap
   static HashMap field_1722 = method_1415(SlickToAndroidKeycodes$SlickCodes.class);
   // $FF: renamed from: c java.util.HashMap
   static HashMap field_1723 = method_1415(SlickToAndroidKeycodes$AndroidCodes.class);
   // $FF: renamed from: d java.util.HashMap
   static HashMap field_1724 = new HashMap();

   // $FF: renamed from: a (java.lang.Class) java.util.HashMap
   static HashMap method_1415(Class var0) {
      HashMap var1 = new HashMap();
      Field[] var2 = var0.getFields();
      Field[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Field var6 = var3[var5];
         String var7 = var6.getName();
         var7 = var7.replace("KEYCODE_", "");
         var7 = var7.replace("KEY_", "");
         var7 = var7.replace("NUMPAD_", "NUMPAD");

         int var8;
         try {
            var8 = var6.getInt((Object)null);
         } catch (IllegalArgumentException var10) {
            throw new RuntimeException(var10);
         } catch (IllegalAccessException var11) {
            throw new RuntimeException(var11);
         }

         var1.put(var7, var8);
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.String) int
   public static int method_1416(String var0) {
      var0 = var0.toUpperCase();
      Integer var1 = (Integer)field_1723.get(var0);
      if (var1 == null) {
         throw new SlickToAndroidKeycodes$MissingKey("Could not find key:" + var0);
      } else {
         return var1;
      }
   }

   // $FF: renamed from: a (int) java.lang.String
   public static String method_1417(int var0) {
      String var1 = (String)field_1724.get(var0);
      return var1 == null ? "unknown" : var1;
   }

   // $FF: renamed from: b (int) int
   public static int method_1418(int var0) {
      Integer var1 = (Integer)field_1721.get(var0);
      return var1 == null ? 0 : var1;
   }

   // $FF: renamed from: c (int) java.lang.Integer
   public static Integer method_1419(int var0) {
      Object var1 = null;
      if (var0 == 14) {
         return 69;
      } else if (var0 == 211) {
         return 99;
      } else if (var0 == 28) {
         return 72;
      } else if (var0 == 203) {
         return 90;
      } else if (var0 == 205) {
         return 92;
      } else if (var0 == 200) {
         return 91;
      } else if (var0 == 208) {
         return 93;
      } else if (var0 == 15) {
         return 70;
      } else if (var0 == 42) {
         return 138;
      } else if (var0 == 54) {
         return 139;
      } else if (var0 == 29) {
         return 140;
      } else {
         return var0 == 157 ? 141 : null;
      }
   }

   static {
      ArrayList var0 = new ArrayList();
      Iterator var1 = field_1722.keySet().iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         int var3 = (Integer)field_1722.get(var2);
         Integer var4 = (Integer)field_1723.get(var2);
         if (var4 == null) {
            var0.add(var2);
         }

         if (field_1721.get(var3) == null) {
            field_1721.put(var3, var4);
         }

         String var5 = var2.toLowerCase(Locale.ENGLISH);
         if (var4 != null) {
            field_1724.put(var4, var5);
         }
      }

      if (var0.size() != 0) {
         String var6 = "";

         String var8;
         for(Iterator var7 = var0.iterator(); var7.hasNext(); var6 = var6 + var8 + ", ") {
            var8 = (String)var7.next();
         }

         class_236.method_1591("Could not find android keycode for: " + var6);
      }

   }
}
