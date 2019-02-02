package com.corrodinggames.rts.a;

import android.os.Handler;
import android.os.Message;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_289;
import com.corrodinggames.rts.gameFramework.f.class_396;

// $FF: renamed from: com.corrodinggames.rts.a.l
public class class_270 extends class_266 {
   // $FF: renamed from: b com.corrodinggames.rts.a.l
   static class_270 field_2333;
   // $FF: renamed from: c android.os.Handler
   final Handler field_2334;
   // $FF: renamed from: d boolean
   public static boolean field_2335 = false;
   // $FF: renamed from: e boolean
   public boolean field_2336;
   // $FF: renamed from: f android.os.Handler
   private Handler field_2337;
   // $FF: renamed from: g java.lang.Runnable
   private Runnable field_2338;
   // $FF: renamed from: h java.lang.Runnable
   private Runnable field_2339;
   // $FF: renamed from: i java.lang.Runnable
   private Runnable field_2340;

   // $FF: renamed from: j () boolean
   public static boolean method_1878() {
      return field_2333 == null ? false : field_2333.field_2336;
   }

   // $FF: renamed from: c (java.lang.String) void
   public static void method_1879(String var0) {
      class_270 var1 = field_2333;
      if (var1 != null) {
         Message var2 = var1.field_2337.method_1530();
         var2.method_1946().putString("text", var0);
         var1.field_2337.method_1532(var2);
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public static void method_1880(String var0, String var1) {
      if (field_2333 != null) {
         class_270 var2 = field_2333;
         l$1 var3 = new l$1(var2, var1);
         field_2333.field_2334.method_1531(var3);
      }

   }

   // $FF: renamed from: k () void
   public static void method_1881() {
      class_236 var0 = class_236.method_1549();
      if (var0.field_1944 != null) {
         var0.field_1944.method_2908();
         var0.field_1944.field_3787.method_1500();
      }

      if (!class_236.field_1899) {
         if (var0.field_1944 == null || !var0.field_1944.field_3887) {
            if (field_2333 != null) {
               field_2333.field_2334.method_1531(field_2333.field_2338);
            } else {
               class_236.method_1588("MultiplayerBattleroomActivity:updateUI() lastLoaded==null");
            }

         }
      }
   }

   // $FF: renamed from: l () void
   public static synchronized void method_1882() {
      class_236 var0 = class_236.method_1549();
      if (var0.field_1944 != null) {
         var0.field_1944.field_3787.method_1501();
      }

      if (!class_236.field_1899) {
         if (field_2333 != null) {
            field_2333.field_2334.method_1531(field_2333.field_2339);
         } else {
            class_236.method_1592("askPassword", "lastLoaded is null, deplaying ask password");
            var0.field_1944.field_3807 = true;
         }

      }
   }

   // $FF: renamed from: m () void
   public static void method_1883() {
      if (field_2333 != null) {
         field_2333.field_2334.method_1531(field_2333.field_2340);
         field_2335 = false;
      } else {
         class_236.method_1588("MultiplayerBattleroomActivity:startGame() lastLoaded==null");
         class_236.method_1594();
         field_2335 = true;
      }

   }

   // $FF: renamed from: n () void
   public static void method_1884() {
      class_236 var0 = class_236.method_1549();
      var0.field_2002 = null;
      if (var0.field_1944.field_3863.field_3775 == class_396.field_3239) {
         if (!var0.field_1944.field_3810) {
            var0.field_1947.method_1993(var0.field_1944.field_3865, true, false, false);
         } else {
            var0.field_1947.method_1991(var0.field_1944.field_3863.field_3776, true);
         }
      } else if (var0.field_1944.field_3863.field_3775 == class_396.field_3238) {
         if (!var0.field_1944.field_3810) {
            var0.field_2001 = "";
            var0.field_2002 = var0.field_1944.field_3866;
            var0.method_1570(true, class_289.field_2445);
         } else {
            var0.field_2001 = var0.field_1944.field_3864;
            var0.method_1570(true, class_289.field_2445);
         }
      } else {
         var0.field_2001 = var0.field_1944.field_3864;
         var0.method_1570(true, class_289.field_2445);
      }

   }
}
