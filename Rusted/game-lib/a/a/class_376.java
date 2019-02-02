package a.a;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;

// $FF: renamed from: a.a.b
public class class_376 extends ServerSocket {
   // $FF: renamed from: a java.net.DatagramSocket
   private DatagramSocket field_3022;
   // $FF: renamed from: b int
   private int field_3023;
   // $FF: renamed from: c int
   private int field_3024;
   // $FF: renamed from: d boolean
   private boolean field_3025;
   // $FF: renamed from: e java.util.ArrayList
   private ArrayList field_3026;
   // $FF: renamed from: f java.util.HashMap
   private HashMap field_3027;
   // $FF: renamed from: g java.util.HashMap
   private HashMap field_3028;
   // $FF: renamed from: h a.a.r
   private class_12 field_3029;

   public class_376() {
      this(new DatagramSocket((SocketAddress)null), 0);
   }

   public class_376(int var1, int var2, InetAddress var3, boolean var4) {
      DatagramSocket var5 = new DatagramSocket((SocketAddress)null);
      var5.setReuseAddress(var4);
      var5.bind(new InetSocketAddress(var3, var1));
      this.method_2388(var5, var2);
   }

   public class_376(DatagramSocket var1, int var2) {
      this.method_2388(var1, var2);
   }

   // $FF: renamed from: a (java.net.DatagramSocket, int) void
   public void method_2388(DatagramSocket var1, int var2) {
      if (var1 == null) {
         throw new NullPointerException("sock");
      } else {
         this.field_3022 = var1;
         this.field_3024 = var2 <= 0 ? 50 : var2;
         this.field_3026 = new ArrayList(this.field_3024);
         this.field_3027 = new HashMap();
         this.field_3028 = new HashMap();
         this.field_3029 = new class_370(this, (b$1)null);
         this.field_3023 = 0;
         this.field_3025 = false;
         (new class_375(this)).start();
      }
   }

   public Socket accept() {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else {
         synchronized(this.field_3026) {
            do {
               if (!this.field_3026.isEmpty()) {
                  return (Socket)this.field_3026.remove(0);
               }

               try {
                  if (this.field_3023 == 0) {
                     this.field_3026.wait();
                  } else {
                     long var2 = System.currentTimeMillis();
                     this.field_3026.wait((long)this.field_3023);
                     if (System.currentTimeMillis() - var2 >= (long)this.field_3023) {
                        throw new SocketTimeoutException();
                     }
                  }
               } catch (InterruptedException var5) {
                  var5.printStackTrace();
               }
            } while(!this.isClosed());

            throw new SocketException("Socket is closed");
         }
      }
   }

   public synchronized void bind(SocketAddress var1) {
      this.bind(var1, 0);
   }

   public synchronized void bind(SocketAddress var1, int var2) {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else {
         this.field_3022.setReuseAddress(true);
         this.field_3022.bind(var1);
      }
   }

   public synchronized void close() {
      if (!this.isClosed()) {
         this.field_3025 = true;
         synchronized(this.field_3026) {
            this.field_3026.clear();
            this.field_3026.notify();
         }

         if (this.field_3027.isEmpty()) {
            this.field_3022.close();
         }

      }
   }

   public InetAddress getInetAddress() {
      return this.field_3022.getInetAddress();
   }

   public int getLocalPort() {
      return this.field_3022.getLocalPort();
   }

   public SocketAddress getLocalSocketAddress() {
      return this.field_3022.getLocalSocketAddress();
   }

   public boolean isBound() {
      return this.field_3022.isBound();
   }

   public boolean isClosed() {
      return this.field_3025;
   }

   public void setSoTimeout(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("timeout < 0");
      } else {
         this.field_3023 = var1;
      }
   }

   public int getSoTimeout() {
      return this.field_3023;
   }

   // $FF: renamed from: a (java.net.SocketAddress) a.a.d
   private class_372 method_2389(SocketAddress var1) {
      synchronized(this.field_3027) {
         class_372 var3 = (class_372)this.field_3027.get(var1);
         if (var3 == null) {
            try {
               var3 = new class_372(this, this.field_3022, var1);
               var3.a(this.field_3029);
               this.field_3027.put(var1, var3);
            } catch (IOException var6) {
               var6.printStackTrace();
            }
         }

         return var3;
      }
   }

   // $FF: renamed from: b (java.net.SocketAddress) a.a.d
   private class_372 method_2390(SocketAddress var1) {
      synchronized(this.field_3027) {
         class_372 var3 = (class_372)this.field_3027.remove(var1);
         if (this.field_3027.isEmpty() && this.isClosed()) {
            this.field_3022.close();
         }

         return var3;
      }
   }

   // $FF: renamed from: a (a.a.b) java.net.DatagramSocket
   // $FF: synthetic method
   static DatagramSocket method_2391(class_376 var0) {
      return var0.field_3022;
   }

   // $FF: renamed from: b (a.a.b) java.util.HashMap
   // $FF: synthetic method
   static HashMap method_2392(class_376 var0) {
      return var0.field_3027;
   }

   // $FF: renamed from: c (a.a.b) java.util.HashMap
   // $FF: synthetic method
   static HashMap method_2393(class_376 var0) {
      return var0.field_3028;
   }

   // $FF: renamed from: a (a.a.b, java.net.SocketAddress) a.a.d
   // $FF: synthetic method
   static class_372 method_2394(class_376 var0, SocketAddress var1) {
      return var0.method_2389(var1);
   }

   // $FF: renamed from: d (a.a.b) java.util.ArrayList
   // $FF: synthetic method
   static ArrayList method_2395(class_376 var0) {
      return var0.field_3026;
   }

   // $FF: renamed from: b (a.a.b, java.net.SocketAddress) a.a.d
   // $FF: synthetic method
   static class_372 method_2396(class_376 var0, SocketAddress var1) {
      return var0.method_2390(var1);
   }
}
