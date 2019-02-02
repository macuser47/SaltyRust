package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.gameFramework.f.class_444;
import java.lang.Thread.UncaughtExceptionHandler;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.l
public class class_335 implements UncaughtExceptionHandler {
   // $FF: renamed from: a java.lang.Thread.UncaughtExceptionHandler
   private UncaughtExceptionHandler field_2685;

   strictfp class_335(UncaughtExceptionHandler var1) {
      this.field_2685 = var1;
   }

   public strictfp synchronized void uncaughtException(Thread var1, Throwable var2) {
      boolean var3 = false;
      boolean var4 = false;

      try {
         class_236.field_2036 = null;
         System.gc();

         try {
            class_236.method_1591("uncaughtException start");
            class_236 var5 = class_236.method_1549();
            if (var5 != null && var2 instanceof OutOfMemoryError) {
               class_236.method_1591("Freeing memory");

               try {
                  class_408.field_3374 = null;
                  if (var5.field_1932 != null) {
                     var5.field_1932 = null;
                  }

                  if (var5.field_1934 != null) {
                     var5.field_1934.method_2766();
                     var5.field_1934 = null;
                  }

                  System.gc();
                  class_236.method_1591("uncaughtException: Memory freed");
               } catch (Throwable var17) {
                  class_236.method_1591("exception freeing memory");
                  var17.printStackTrace();
               }
            }

            class_236.method_1589("gameEngine:uncaughtExceptionHandler", var2);
            String var6 = class_236.method_1646(var2);
            boolean var7 = false;
            boolean var8 = false;
            if (var5 != null) {
               SettingsEngine var9 = var5.field_1937;
               if (var9 != null) {
                  var7 = var9.sendReports;
               } else {
                  class_236.method_1591("CustomExceptionHandler: no settings");
               }
            } else {
               class_236.method_1591("CustomExceptionHandler: no game");
            }

            if (class_236.field_2035) {
               class_236.method_1591("CustomExceptionHandler: a crash was already sent");
               var7 = false;
               var8 = true;
            }

            class_236.field_2035 = true;
            if (var7) {
               try {
                  class_236.method_1591("Starting errorReport");
                  class_444.method_2841("uncaughtException", var6);
                  class_236.method_1591("waiting");
                  Thread.sleep(800L);
               } catch (InterruptedException var16) {
                  var16.printStackTrace();
               }
            }

            if (!var8 && var5 != null && var5.field_2025 != null) {
               var5.field_2025.method_2215(var2);
            }

            var4 = true;
         } catch (Exception var18) {
            class_236.method_1591("exception sending crash");
            var18.printStackTrace();
         }

         if (this.field_2685 != null) {
            class_236.method_1591("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
            this.field_2685.uncaughtException(var1, var2);
            class_236.method_1591("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
         } else {
            class_236.method_1591("CustomExceptionHandler: defaultUEH==null");
            System.exit(2);
         }

         var3 = true;
      } catch (Throwable var19) {
         class_236.method_1591("Exception in uncaughtException");
         var19.printStackTrace();
      } finally {
         if (!var3) {
            class_236.method_1591("Crash was not handled, exiting");
            Runtime.getRuntime().halt(1);
         }

      }

   }
}
