package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.b.class_499;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_329;
import java.awt.Toolkit;
import org.lwjgl.Sys;

// $FF: renamed from: com.corrodinggames.rts.java.j
public class class_330 extends class_329 {
   // $FF: renamed from: a com.corrodinggames.rts.java.Main
   Main field_2633;

   public class_330(Main var1) {
      this.field_2633 = var1;
   }

   // $FF: renamed from: a (java.lang.String, int) void
   public void method_2212(String var1, int var2) {
      class_236.method_1591("slick queuing-alert:" + var1);
      ScriptEngine.getInstance().addRunnableToQueue(new j$1(this, var1));
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_2213(String var1, String var2) {
      class_236.method_1591("slick queuing-messageBox:" + var2);
      ScriptEngine.getInstance().addRunnableToQueue(new j$2(this, var2, var1));
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public void method_2214(String var1, boolean var2) {
      class_236 var3 = class_236.method_1549();
      if (var3 == null || !var3.field_1908) {
         if (this.field_2633.field_1838 != null) {
            this.field_2633.field_1838.method_2232(var1, var2);
         }

      }
   }

   // $FF: renamed from: a (java.lang.Throwable) void
   public void method_2215(Throwable var1) {
      this.method_2217(var1, true);
   }

   // $FF: renamed from: a (java.lang.Throwable, boolean) void
   public void method_2217(Throwable var1, boolean var2) {
      if (class_499.method_3220()) {
         class_236.method_1591("onGameCrash: Not showing popup message due to active debugSocket");
         System.exit(1);
      } else {
         try {
            class_236.method_1591("onGameCrash: Showing message");
            Toolkit.getDefaultToolkit();
            String var3 = class_236.method_1647(var1);
            Sys.alert("Crash", var3 + "\nCheck logs for more details");

            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var5) {
               var5.printStackTrace();
            }

            class_236.method_1591("onGameCrash: end");
         } catch (Throwable var6) {
            class_236.method_1591("exception showing message");
            var6.printStackTrace();
         }

      }
   }

   // $FF: renamed from: a () boolean
   public boolean method_2216() {
      return !class_236.method_1549().method_1575() && !this.field_2633.field_1847.method_1832();
   }
}
