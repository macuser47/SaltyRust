package com.corrodinggames.rts.gameFramework.utility;

import android.os.Looper;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.a
public class class_228 extends Error {
   private class_228(class_226 var1) {
      super("Application Not Responding", var1);
   }

   public Throwable fillInStackTrace() {
      this.setStackTrace(new StackTraceElement[0]);
      return this;
   }

   // $FF: renamed from: a (java.lang.String, boolean) com.corrodinggames.rts.gameFramework.utility.a
   static class_228 method_1483(String var0, boolean var1) {
      Thread var2 = Looper.method_3227().method_3230();
      TreeMap var3 = new TreeMap(new a$1(var2));
      Iterator var4 = Thread.getAllStackTraces().entrySet().iterator();

      while(true) {
         Entry var5;
         do {
            if (!var4.hasNext()) {
               if (!var3.containsKey(var2)) {
                  var3.put(var2, var2.getStackTrace());
               }

               class_226 var7 = null;

               class_229 var10002;
               for(Iterator var8 = var3.entrySet().iterator(); var8.hasNext(); var7 = new class_226(var10002, var7, (a$1)null)) {
                  Entry var6 = (Entry)var8.next();
                  var10002 = new class_229(method_1485((Thread)var6.getKey()), (StackTraceElement[])var6.getValue(), (a$1)null);
                  var10002.getClass();
               }

               return new class_228(var7);
            }

            var5 = (Entry)var4.next();
         } while(var5.getKey() != var2 && (!((Thread)var5.getKey()).getName().startsWith(var0) || !var1 && ((StackTraceElement[])var5.getValue()).length <= 0));

         var3.put(var5.getKey(), var5.getValue());
      }
   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.utility.a
   static class_228 method_1484() {
      Thread var0 = Looper.method_3227().method_3230();
      StackTraceElement[] var1 = var0.getStackTrace();
      class_229 var10004 = new class_229(method_1485(var0), var1, (a$1)null);
      var10004.getClass();
      return new class_228(new class_226(var10004, (class_226)null, (a$1)null));
   }

   // $FF: renamed from: a (java.lang.Thread) java.lang.String
   private static String method_1485(Thread var0) {
      return var0.getName() + " (state = " + var0.getState() + ")";
   }
}
