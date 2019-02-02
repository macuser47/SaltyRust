package com.corrodinggames.rts.b;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.librocket.scripts.ScriptEngine$Action;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;

// $FF: renamed from: com.corrodinggames.rts.b.a
public class class_499 implements Runnable {
   // $FF: renamed from: a java.net.ServerSocket
   public ServerSocket field_4579;
   // $FF: renamed from: b boolean
   public boolean field_4580 = true;
   // $FF: renamed from: c boolean
   public static boolean field_4581 = false;
   // $FF: renamed from: d java.util.ArrayList
   static ArrayList field_4582 = new ArrayList();

   // $FF: renamed from: a () boolean
   public static strictfp boolean method_3220() {
      return field_4581;
   }

   // $FF: renamed from: a (java.lang.String) void
   public static strictfp void method_3221(String var0) {
      field_4581 = true;
      field_4582.add(var0);
   }

   // $FF: renamed from: b () void
   public static strictfp void method_3222() {
      if (field_4582.size() != 0) {
         a$1 var0 = new a$1();
         Thread var1 = new Thread(var0);
         var1.start();
      }
   }

   // $FF: renamed from: a (int, java.lang.String) void
   public static strictfp void method_3223(int var0, String var1) {
      try {
         field_4581 = true;
         class_236.field_1898 = true;
         class_236.method_1591("");
         class_236.method_1591("----- createDebugSocket ----");
         class_236.method_1591("port: " + var0);
         class_236.method_1591("password: " + var1);
         class_236.method_1591("------------------");
         class_236.method_1591("");
         class_499 var2 = new class_499();
         if (var0 != -1) {
            var2.field_4579 = new ServerSocket(var0);
            Thread var3 = new Thread(var2);
            var3.start();
         }

      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }
   }

   private strictfp class_499() {
   }

   public strictfp void run() {
      try {
         while(this.field_4580) {
            Socket var1 = this.field_4579.accept();

            try {
               var1.setTcpNoDelay(true);
               class_500 var2 = new class_500(this, var1);
               Thread var3 = new Thread(var2);
               var3.run();
            } catch (IOException var4) {
               class_236.method_1591("Got IOException on debugSocket connection");
               var4.printStackTrace();
               throw new RuntimeException(var4);
            }
         }

      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static strictfp String method_3224(String var0) {
      String var2 = null;
      String[] var3 = null;
      int var4 = var0.indexOf(" ");
      if (var4 == -1) {
         var4 = var0.length();
      }

      String var1 = var0.substring(0, var4).toLowerCase(Locale.ENGLISH);
      if (var4 != -1 && var0.length() >= var4 + 1) {
         var2 = var0.substring(var4 + 1);
         var3 = var2.split(" ");
      }

      if (ScriptEngine.getInstance() == null) {
         class_236.method_1588("DebugSocketConnection: waiting for ScriptEngine to start....");

         for(int var5 = 0; var5 < 100; ++var5) {
            if (ScriptEngine.getInstance() != null) {
               class_236.method_1588("started");
               break;
            }

            try {
               Thread.sleep(100L);
            } catch (InterruptedException var11) {
               var11.printStackTrace();
            }
         }
      }

      if (var1.equalsIgnoreCase("ping")) {
         return "pong";
      } else {
         ScriptEngine var12;
         if (var1.equalsIgnoreCase("script")) {
            if (var2 == null) {
               return "argString==null";
            } else {
               var12 = ScriptEngine.getInstance();
               ScriptEngine$Action var6 = var12.addScriptToQueue(var2);
               String var13 = var6.waitForCompletionOrCrash();
               return var13 == null ? "done" : var13;
            }
         } else if (var1.equalsIgnoreCase("function")) {
            if (var2 == null) {
               return "argString==null";
            } else {
               var12 = ScriptEngine.getInstance();
               a$2 var7 = new a$2(var12, var2);
               ScriptEngine$Action var8 = var12.addRunnableToQueue(var7);
               var8.tryToCatchCrash = true;
               String var9 = var8.waitForCompletionOrCrash();
               String var10;
               if (var9 == null) {
                  var10 = "ok\n";
                  if (var7.field_2356 == null) {
                     var10 = var10 + "<NULL>";
                  } else {
                     var10 = var10 + "" + var7.field_2356;
                  }

                  var10 = var10 + "\u0000";
                  return var10;
               } else {
                  var10 = "crash\n";
                  var10 = var10 + var9;
                  var10 = var10 + "\u0000";
                  return var10;
               }
            }
         } else {
            return "unknown command";
         }
      }
   }
}
