package com.corrodinggames.rts.gameFramework.f;

import a.a.class_376;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.ad
class class_438 implements Runnable {
   // $FF: renamed from: j com.corrodinggames.rts.gameFramework.f.x
   private final class_454 field_3668;
   // $FF: renamed from: a boolean
   volatile boolean field_3669 = true;
   // $FF: renamed from: b java.net.ServerSocket
   ServerSocket field_3670;
   // $FF: renamed from: c boolean
   boolean field_3671;
   // $FF: renamed from: d long
   long field_3672 = -1L;
   // $FF: renamed from: e boolean
   final boolean field_3673 = false;
   // $FF: renamed from: f boolean
   final boolean field_3674 = true;
   // $FF: renamed from: g java.util.ArrayList
   ArrayList field_3675 = new ArrayList();
   // $FF: renamed from: h int
   int field_3676 = 0;
   // $FF: renamed from: i boolean
   boolean field_3677;

   strictfp class_438(class_454 var1) {
      this.field_3668 = var1;
   }

   // $FF: renamed from: a (java.net.InetAddress) boolean
   public strictfp boolean method_2748(InetAddress var1) {
      if (var1 == null) {
         class_236.method_1591("isIpAllowed: inetAddress==null");
         return true;
      } else {
         long var2 = System.currentTimeMillis();
         if (var2 > this.field_3672 + 60000L) {
            this.field_3672 = var2;
            this.field_3675.clear();
            this.field_3676 = 0;
            this.field_3677 = false;
         }

         boolean var4 = false;
         Iterator var5 = this.field_3675.iterator();

         while(var5.hasNext()) {
            class_440 var6 = (class_440)var5.next();
            if (var1.equals(var6.field_3714)) {
               ++var6.field_3715;
               if (var6.field_3715 > 30) {
                  if (!var6.field_3716) {
                     var6.field_3716 = true;
                     class_236.method_1591("DOS: Too many attempts:" + var6.field_3715 + " ip:" + var1.toString());
                  }

                  return false;
               }

               var4 = true;
               break;
            }
         }

         Iterator var9;
         if (!var4) {
            ++this.field_3676;
            class_440 var8;
            if (this.field_3675.size() > 200) {
               var8 = null;
               var9 = this.field_3675.iterator();

               label77:
               while(true) {
                  class_440 var7;
                  do {
                     if (!var9.hasNext()) {
                        if (var8 != null) {
                           this.field_3675.remove(var8);
                        }
                        break label77;
                     }

                     var7 = (class_440)var9.next();
                  } while(var8 != null && var8.field_3715 <= var7.field_3715);

                  var8 = var7;
               }
            }

            var8 = new class_440(this);
            var8.field_3714 = var1;
            this.field_3675.add(var8);
         }

         if (this.field_3676 > 500) {
            if (!this.field_3677) {
               this.field_3677 = true;
               class_236.method_1591("DOS: Too many attempts. udp:" + this.field_3671);
            }

            return false;
         } else {
            int var10 = 0;
            var9 = this.field_3668.field_3877.iterator();

            while(var9.hasNext()) {
               class_458 var11 = (class_458)var9.next();
               if (var11.field_3927 != null && var1.equals(var11.field_3927)) {
                  ++var10;
               }
            }

            if (var10 > 30) {
               if (!this.field_3677) {
                  this.field_3677 = true;
                  class_236.method_1591("DOS: Too open connections ip:" + var1.toString());
               }

               return false;
            } else {
               return true;
            }
         }
      }
   }

   // $FF: renamed from: a (boolean) void
   public strictfp void method_2749(boolean var1) {
      this.field_3668.method_2885("starting socket..");
      this.field_3671 = var1;
      if (!var1) {
         this.field_3670 = new ServerSocket(this.field_3668.field_3795);
      } else {
         this.field_3670 = new class_376(this.field_3668.field_3795, 0, (InetAddress)null, true);
      }

   }

   public strictfp void run() {
      class_236.method_1649();
      Thread.currentThread().setName("NewConnectionWorker-" + (this.field_3671 ? "udp" : "tcp"));

      try {
         this.field_3668.method_2885("reading..");

         while(this.field_3669) {
            Socket var1 = this.field_3670.accept();

            try {
               var1.setTcpNoDelay(true);
               var1.setSoTimeout(90000);
               String var2 = "<unknown>";
               InetAddress var3 = var1.getInetAddress();
               if (var3 != null) {
                  var2 = var3.getHostAddress();
               }

               if (!this.method_2748(var3)) {
                  var1.close();
               } else {
                  class_458 var4 = new class_458(this.field_3668, var1);
                  String var5 = "Accepted new connection id:" + var4.field_3925 + ".. (ip:" + var2 + ")";
                  if (this.field_3671) {
                     var5 = var5 + " (udp)";
                  }

                  this.field_3668.method_2885(var5);
                  var4.field_3930 = this.field_3671;
                  var4.field_3927 = var3;
                  var4.method_2986();
                  this.field_3668.field_3877.add(var4);
                  this.field_3668.method_2909();
               }
            } catch (IOException var6) {
               class_236.method_1591("Got IOException on new player connection");
               var6.printStackTrace();
            }
         }
      } catch (IOException var7) {
         if (this.field_3669) {
            throw new RuntimeException(var7);
         }

         class_236.method_1591("Got expected IOException after closed socket");
         var7.printStackTrace();
      }

   }

   // $FF: renamed from: a () void
   public strictfp void method_2750() {
      this.field_3669 = false;

      try {
         if (this.field_3670 != null) {
            this.field_3670.close();
         }

      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }
}
