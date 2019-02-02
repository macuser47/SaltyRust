package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.a.class_270;
import com.corrodinggames.rts.game.class_110;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.c
public class class_458 {
   // $FF: renamed from: E com.corrodinggames.rts.gameFramework.f.x
   private final class_454 field_3922;
   // $FF: renamed from: a boolean
   volatile boolean field_3923 = false;
   // $FF: renamed from: b boolean
   volatile boolean field_3924 = false;
   // $FF: renamed from: c int
   public int field_3925;
   // $FF: renamed from: d java.net.Socket
   Socket field_3926;
   // $FF: renamed from: e java.net.InetAddress
   InetAddress field_3927;
   // $FF: renamed from: f java.util.concurrent.ConcurrentLinkedQueue
   ConcurrentLinkedQueue field_3928 = new ConcurrentLinkedQueue();
   // $FF: renamed from: g long
   public long field_3929;
   // $FF: renamed from: h boolean
   public boolean field_3930;
   // $FF: renamed from: i boolean
   public boolean field_3931;
   // $FF: renamed from: j boolean
   public boolean field_3932;
   // $FF: renamed from: k boolean
   public boolean field_3933;
   // $FF: renamed from: l boolean
   public boolean field_3934;
   // $FF: renamed from: m boolean
   public boolean field_3935;
   // $FF: renamed from: n int
   public int field_3936;
   // $FF: renamed from: o com.corrodinggames.rts.game.e
   public class_110 field_3937;
   // $FF: renamed from: p int
   int field_3938 = -1;
   // $FF: renamed from: q long
   long field_3939 = -1L;
   // $FF: renamed from: r boolean
   boolean field_3940 = false;
   // $FF: renamed from: s boolean
   boolean field_3941 = false;
   // $FF: renamed from: t int
   public int field_3942 = 999999;
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.f.d
   class_459 field_3943;
   // $FF: renamed from: v com.corrodinggames.rts.gameFramework.f.e
   class_457 field_3944;
   // $FF: renamed from: w java.lang.Thread
   Thread field_3945;
   // $FF: renamed from: x java.lang.Thread
   Thread field_3946;
   // $FF: renamed from: y boolean
   boolean field_3947 = false;
   // $FF: renamed from: z boolean
   boolean field_3948 = false;
   // $FF: renamed from: A java.lang.String
   public String field_3949;
   // $FF: renamed from: B int
   public int field_3950;
   // $FF: renamed from: C int
   volatile int field_3951;
   // $FF: renamed from: D int
   volatile int field_3952;

   public strictfp class_458(class_454 var1, Socket var2) {
      this.field_3922 = var1;
      this.field_3926 = var2;
      synchronized(this.field_3922.field_3881) {
         this.field_3925 = this.field_3922.field_3880++;
      }

      this.field_3950 = class_296.method_2036(1, 1000000);
   }

   // $FF: renamed from: a () int
   public strictfp int method_2984() {
      if (this.field_3939 == -1L) {
         return -2;
      } else {
         return this.field_3939 < System.currentTimeMillis() - 5000L ? -1 : this.field_3938;
      }
   }

   // $FF: renamed from: b () int
   strictfp int method_2985() {
      class_110 var1 = this.field_3937;
      return var1 != null ? var1.d : -1;
   }

   // $FF: renamed from: c () void
   public strictfp synchronized void method_2986() {
      this.field_3944 = new class_457(this);
      this.field_3946 = new Thread(this.field_3944);
      this.field_3946.setDaemon(true);
      this.field_3946.start();
      this.field_3943 = new class_459(this, (c$1)null);
      this.field_3945 = new Thread(this.field_3943);
      this.field_3945.setDaemon(true);
      this.field_3945.start();
   }

   // $FF: renamed from: g () void
   private strictfp void method_2987() {
      this.field_3923 = true;
      if (this.field_3922.field_3810 && !this.field_3922.method_2865()) {
         class_110 var1 = this.field_3937;
         if (var1 != null) {
            this.field_3937 = null;
            class_458 var2 = this.field_3922.method_2918(this.field_3937);
            if (var2 == null) {
               var1.m();
            }
         }

         this.field_3922.method_2910((class_458)null);
         class_270.method_1881();
      }

      if (this.field_3945 != null) {
         this.field_3945.interrupt();
      }

      this.field_3922.method_2875(this);
      this.field_3932 = false;
   }

   // $FF: renamed from: h () void
   private strictfp synchronized void method_2988() {
      if (!this.field_3923) {
         this.field_3924 = true;
         if (this.field_3944 != null) {
            this.field_3944.method_2982();
         }

         if (this.field_3945 != null) {
            this.field_3945.interrupt();
         }

         this.field_3922.method_2875(this);
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   public strictfp void method_2989(String var1) {
      class_404 var2 = new class_404();

      try {
         if (var1 == null) {
            var1 = "NULL";
         }

         var2.method_2545(var1);
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }

      this.method_2998(var2.method_2535(111));
      this.method_2988();
   }

   // $FF: renamed from: b (boolean, boolean) void
   private strictfp synchronized void method_2990(boolean var1, boolean var2) {
      this.method_2993(var1, var2);
   }

   // $FF: renamed from: d () java.lang.String
   public strictfp String method_2991() {
      String var1 = "<null>";
      if (this.field_3937 != null) {
         var1 = this.field_3937.j;
      }

      return var1;
   }

   // $FF: renamed from: e () java.lang.String
   public strictfp String method_2992() {
      String var1 = "<no socket>";

      try {
         Socket var2 = this.field_3926;
         if (var2 != null) {
            var1 = "<no bond socket>";
            InetAddress var3 = var2.getInetAddress();
            if (var3 != null) {
               var1 = var3.getHostAddress();
            }
         }

         return var1;
      } catch (Exception var4) {
         var4.printStackTrace();
         return "<socket error>";
      }
   }

   // $FF: renamed from: a (boolean, boolean) void
   public strictfp synchronized void method_2993(boolean var1, boolean var2) {
      if (!this.field_3923) {
         this.method_2996("handleRemoteDisconnect");
         String var3 = null;
         if (this.field_3937 != null) {
            var3 = this.field_3937.j;
         }

         String var4 = null;
         if (this.field_3937 != null) {
            var4 = "player '" + this.field_3937.j + "' disconnected";
         } else if (this.field_3932) {
            var4 = "a player disconnected";
         }

         if (!this.field_3922.field_3810) {
            var4 = "The server disconnected";
         }

         if (var4 != null) {
            if (!this.field_3922.field_3810) {
               this.field_3922.method_2886(var4);
            } else {
               this.field_3922.method_2936(var4);
            }
         }

         this.method_2987();
         this.field_3922.field_3787.method_1494(this, var3);
      } else {
         this.method_2996("handleRemoteDisconnect: connection is already disconnecting");
      }

      if (!var2 && this.field_3944 != null) {
         this.field_3944.method_2982();
      }

      if (var2) {
         this.field_3947 = true;
      }

      if (var1) {
         this.field_3948 = true;
      }

      if (this.field_3947 && this.field_3948) {
         try {
            this.field_3926.close();
         } catch (IOException var5) {
            class_236.method_1589("Error while closing network socket", var5);
         }

         this.field_3946 = null;
         this.field_3945 = null;
         this.field_3944 = null;
         this.field_3943 = null;
         if (this.field_3928 != null) {
            this.field_3928.clear();
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.Throwable) void
   public strictfp void method_2994(String var1, Throwable var2) {
      class_236.method_1589(this.method_2997(var1), var2);
   }

   // $FF: renamed from: b (java.lang.String) void
   public strictfp void method_2995(String var1) {
      class_236.method_1588(this.method_2997(var1));
   }

   // $FF: renamed from: c (java.lang.String) void
   public strictfp void method_2996(String var1) {
      class_236.method_1591(this.method_2997(var1));
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   public strictfp String method_2997(String var1) {
      var1 = "id:" + this.field_3925 + ": " + var1;
      if (this.field_3937 != null) {
         var1 = var1 + " (Player:" + this.field_3937.j + ")";
      }

      return var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.ah) void
   public strictfp void method_2998(class_413 var1) {
      if (this.field_3944 != null || !this.field_3923) {
         this.field_3944.method_2981(var1);
      }
   }

   // $FF: renamed from: f () boolean
   public strictfp boolean method_2999() {
      return !this.field_3923;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, boolean, boolean) void
   // $FF: synthetic method
   static void method_3000(class_458 var0, boolean var1, boolean var2) {
      var0.method_2990(var1, var2);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c) com.corrodinggames.rts.gameFramework.f.x
   // $FF: synthetic method
   static class_454 method_3001(class_458 var0) {
      return var0.field_3922;
   }
}
