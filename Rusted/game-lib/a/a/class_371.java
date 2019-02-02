package a.a;

import a.a.a.class_182;
import a.a.a.class_183;
import a.a.a.class_184;
import a.a.a.class_185;
import a.a.a.class_186;
import a.a.a.class_187;
import a.a.a.class_188;
import a.a.a.class_189;
import a.a.a.class_191;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// $FF: renamed from: a.a.f
public class class_371 extends Socket {
   // $FF: renamed from: b java.net.DatagramSocket
   protected DatagramSocket field_2979;
   // $FF: renamed from: c java.net.SocketAddress
   protected SocketAddress field_2980;
   // $FF: renamed from: d a.a.n
   protected class_381 field_2981;
   // $FF: renamed from: e a.a.p
   protected class_378 field_2982;
   // $FF: renamed from: a byte[]
   private byte[] field_2983;
   // $FF: renamed from: f boolean
   private boolean field_2984;
   // $FF: renamed from: g boolean
   private boolean field_2985;
   // $FF: renamed from: h boolean
   private boolean field_2986;
   // $FF: renamed from: i boolean
   private boolean field_2987;
   // $FF: renamed from: j int
   private int field_2988;
   // $FF: renamed from: k int
   private int field_2989;
   // $FF: renamed from: l boolean
   private boolean field_2990;
   // $FF: renamed from: m boolean
   private boolean field_2991;
   // $FF: renamed from: n java.lang.Object
   private Object field_2992;
   // $FF: renamed from: o java.lang.Object
   private Object field_2993;
   // $FF: renamed from: p java.util.ArrayList
   private ArrayList field_2994;
   // $FF: renamed from: q java.util.ArrayList
   private ArrayList field_2995;
   // $FF: renamed from: r a.a.m
   private class_379 field_2996;
   // $FF: renamed from: s a.a.q
   private class_377 field_2997;
   // $FF: renamed from: t java.util.ArrayList
   private ArrayList field_2998;
   // $FF: renamed from: u java.util.ArrayList
   private ArrayList field_2999;
   // $FF: renamed from: v java.util.ArrayList
   private ArrayList field_3000;
   // $FF: renamed from: w java.lang.Object
   private Object field_3001;
   // $FF: renamed from: x a.a.g
   private class_373 field_3002;
   // $FF: renamed from: y java.lang.Thread
   private Thread field_3003;
   // $FF: renamed from: z int
   private int field_3004;
   // $FF: renamed from: A int
   private int field_3005;
   // $FF: renamed from: B int
   private int field_3006;
   // $FF: renamed from: C int
   private int field_3007;
   // $FF: renamed from: D a.a.a.i
   private class_191 field_3008;
   // $FF: renamed from: E a.a.a.i
   private class_191 field_3009;
   // $FF: renamed from: F a.a.a.i
   private class_191 field_3010;
   // $FF: renamed from: G a.a.a.i
   private class_191 field_3011;
   // $FF: renamed from: H boolean
   private static final boolean field_3012 = Boolean.getBoolean("net.rudp.debug");

   public class_371() {
      this(new class_377());
   }

   public class_371(class_377 var1) {
      this(new DatagramSocket(), var1);
   }

   protected class_371(DatagramSocket var1) {
      this(var1, new class_377());
   }

   protected class_371(DatagramSocket var1, class_377 var2) {
      this.field_2983 = new byte['\uffff'];
      this.field_2984 = false;
      this.field_2985 = false;
      this.field_2986 = false;
      this.field_2987 = true;
      this.field_2988 = 0;
      this.field_2989 = 0;
      this.field_2990 = false;
      this.field_2991 = false;
      this.field_2992 = new Object();
      this.field_2993 = new Object();
      this.field_2994 = new ArrayList();
      this.field_2995 = new ArrayList();
      this.field_2997 = new class_377();
      this.field_2998 = new ArrayList();
      this.field_2999 = new ArrayList();
      this.field_3000 = new ArrayList();
      this.field_3001 = new Object();
      this.field_3002 = new class_373(this);
      this.field_3003 = new class_368(this);
      this.field_3004 = 32;
      this.field_3005 = 32;
      this.field_3008 = new class_191("ReliableSocket-NullSegmentTimer", new class_369(this, (f$1)null));
      this.field_3009 = new class_191("ReliableSocket-RetransmissionTimer", new class_380(this, (f$1)null));
      this.field_3010 = new class_191("ReliableSocket-CumulativeAckTimer", new class_367(this, (f$1)null));
      this.field_3011 = new class_191("ReliableSocket-KeepAliveTimer", new class_366(this, (f$1)null));
      if (var1 == null) {
         throw new NullPointerException("sock");
      } else {
         this.method_2321(var1, var2);
      }
   }

   // $FF: renamed from: a (java.net.DatagramSocket, a.a.q) void
   protected void method_2321(DatagramSocket var1, class_377 var2) {
      this.field_2979 = var1;
      this.field_2997 = var2;
      this.field_2996 = new class_379(this);
      this.field_3006 = (this.field_2997.method_2397() - 6) * 32;
      this.field_3007 = (this.field_2997.method_2397() - 6) * 32;

      try {
         Runtime.getRuntime().addShutdownHook(this.field_2996);
      } catch (IllegalStateException var4) {
         if (field_3012) {
            var4.printStackTrace();
         }
      }

      this.field_3003.start();
   }

   public void bind(SocketAddress var1) {
      this.field_2979.bind(var1);
   }

   public void connect(SocketAddress var1) {
      this.connect(var1, 0);
   }

   public void connect(SocketAddress var1, int var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("connect: The address can't be null");
      } else if (var2 < 0) {
         throw new IllegalArgumentException("connect: timeout can't be negative");
      } else if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (this.isConnected()) {
         throw new SocketException("already connected");
      } else if (!(var1 instanceof InetSocketAddress)) {
         throw new IllegalArgumentException("Unsupported address type");
      } else {
         this.field_2980 = (InetSocketAddress)var1;
         this.field_2988 = 2;
         Random var3 = new Random(System.currentTimeMillis());
         class_189 var4 = new class_189(this.field_3002.method_2374(var3.nextInt(255)), this.field_2997.method_2398(), this.field_2997.method_2397(), this.field_2997.method_2404(), this.field_2997.method_2405(), this.field_2997.method_2403(), this.field_2997.method_2399(), this.field_2997.method_2400(), this.field_2997.method_2401(), this.field_2997.method_2402());
         this.method_2328(var4);
         boolean var5 = false;
         synchronized(this) {
            if (!this.isConnected()) {
               try {
                  if (var2 == 0) {
                     this.wait();
                  } else {
                     long var7 = System.currentTimeMillis();
                     this.wait((long)var2);
                     if (System.currentTimeMillis() - var7 >= (long)var2) {
                        var5 = true;
                     }
                  }
               } catch (InterruptedException var12) {
                  var12.printStackTrace();
               }
            }
         }

         if (this.field_2988 != 3) {
            synchronized(this.field_2998) {
               this.field_2998.clear();
               this.field_2998.notifyAll();
            }

            this.field_3002.method_2386();
            this.field_3009.method_1297();
            switch(this.field_2988) {
            case 0:
            case 4:
               this.field_2988 = 0;
               throw new SocketException("Socket closed");
            case 1:
            case 3:
            default:
               return;
            case 2:
               this.method_2331();
               this.field_2988 = 0;
               if (var5) {
                  throw new SocketTimeoutException();
               } else {
                  throw new SocketException("Connection refused");
               }
            }
         }
      }
   }

   public SocketChannel getChannel() {
      return null;
   }

   public InetAddress getInetAddress() {
      return !this.isConnected() ? null : ((InetSocketAddress)this.field_2980).getAddress();
   }

   public int getPort() {
      return !this.isConnected() ? 0 : ((InetSocketAddress)this.field_2980).getPort();
   }

   public SocketAddress getRemoteSocketAddress() {
      return !this.isConnected() ? null : new InetSocketAddress(this.getInetAddress(), this.getPort());
   }

   public InetAddress getLocalAddress() {
      return this.field_2979.getLocalAddress();
   }

   public int getLocalPort() {
      return this.field_2979.getLocalPort();
   }

   public SocketAddress getLocalSocketAddress() {
      return this.field_2979.getLocalSocketAddress();
   }

   public InputStream getInputStream() {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (!this.isConnected()) {
         throw new SocketException("Socket is not connected");
      } else if (this.isInputShutdown()) {
         throw new SocketException("Socket input is shutdown");
      } else {
         return this.field_2981;
      }
   }

   public OutputStream getOutputStream() {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (!this.isConnected()) {
         throw new SocketException("Socket is not connected");
      } else if (this.isOutputShutdown()) {
         throw new SocketException("Socket output is shutdown");
      } else {
         return this.field_2982;
      }
   }

   public synchronized void close() {
      synchronized(this.field_2992) {
         if (!this.isClosed()) {
            try {
               Runtime.getRuntime().removeShutdownHook(this.field_2996);
            } catch (IllegalStateException var10) {
               if (field_3012) {
                  var10.printStackTrace();
               }
            }

            switch(this.field_2988) {
            case 0:
               this.field_3009.destroy();
               this.field_3010.destroy();
               this.field_3011.destroy();
               this.field_3008.destroy();
               this.field_2979.close();
               break;
            case 1:
            case 3:
            case 4:
               this.method_2326(new class_183(this.field_3002.method_2373()));
               this.method_2347();
               break;
            case 2:
               synchronized(this) {
                  this.notify();
               }
            }

            this.field_2984 = true;
            this.field_2988 = 0;
            synchronized(this.field_2998) {
               this.field_2998.notify();
            }

            synchronized(this.field_3000) {
               this.field_3000.notify();
            }

         }
      }
   }

   public boolean isBound() {
      return this.field_2979.isBound();
   }

   public boolean isConnected() {
      return this.field_2985;
   }

   public boolean isClosed() {
      synchronized(this.field_2992) {
         return this.field_2984;
      }
   }

   public void setSoTimeout(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("timeout < 0");
      } else {
         this.field_2989 = var1;
      }
   }

   public synchronized void setSendBufferSize(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("negative receive size");
      } else if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (!this.isConnected()) {
         this.field_3006 = var1;
      }
   }

   public synchronized int getSendBufferSize() {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else {
         return this.field_3006;
      }
   }

   public synchronized void setReceiveBufferSize(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("negative send size");
      } else if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (!this.isConnected()) {
         this.field_3007 = var1;
      }
   }

   public synchronized int getReceiveBufferSize() {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else {
         return this.field_3007;
      }
   }

   public void setTcpNoDelay(boolean var1) {
   }

   public boolean getTcpNoDelay() {
      return false;
   }

   public synchronized void setKeepAlive(boolean var1) {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (this.field_2987 ^ var1) {
         this.field_2987 = var1;
         if (this.isConnected()) {
            if (this.field_2987) {
               this.field_3011.method_1293((long)(this.field_2997.method_2403() * 6), (long)(this.field_2997.method_2403() * 6));
            } else {
               this.field_3011.method_1297();
            }
         }

      }
   }

   public synchronized boolean getKeepAlive() {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else {
         return this.field_2987;
      }
   }

   public void shutdownInput() {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (!this.isConnected()) {
         throw new SocketException("Socket is not connected");
      } else if (this.isInputShutdown()) {
         throw new SocketException("Socket input is already shutdown");
      } else {
         this.field_2990 = true;
         synchronized(this.field_3001) {
            this.field_3001.notify();
         }
      }
   }

   public void shutdownOutput() {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (!this.isConnected()) {
         throw new SocketException("Socket is not connected");
      } else if (this.isOutputShutdown()) {
         throw new SocketException("Socket output is already shutdown");
      } else {
         this.field_2991 = true;
         synchronized(this.field_2998) {
            this.field_2998.notifyAll();
         }
      }
   }

   public boolean isInputShutdown() {
      return this.field_2990;
   }

   public boolean isOutputShutdown() {
      return this.field_2991;
   }

   // $FF: renamed from: a (byte[], int, int) void
   protected void method_2322(byte[] var1, int var2, int var3) {
      this.method_2323(var1, var2, var3, false);
   }

   // $FF: renamed from: a (byte[], int, int, boolean) void
   public void method_2323(byte[] var1, int var2, int var3, boolean var4) {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else if (this.isOutputShutdown()) {
         throw new IOException("Socket output is shutdown");
      } else if (!this.isConnected()) {
         throw new SocketException("Connection reset");
      } else {
         int var5 = 0;

         while(var5 < var3) {
            synchronized(this.field_2993) {
               while(this.field_2986) {
                  try {
                     this.field_2993.wait();
                  } catch (InterruptedException var10) {
                     var10.printStackTrace();
                  }
               }

               int var7 = Math.min(this.field_2997.method_2397() - 6, var3 - var5);
               class_185 var8 = new class_185(this.field_3002.method_2373(), this.field_3002.method_2376(), var1, var2 + var5, var7);
               this.method_2328(var8);
               if (var4) {
                  this.method_2326(var8);
               }

               var5 += var7;
            }
         }

      }
   }

   // $FF: renamed from: b (byte[], int, int) int
   protected int method_2324(byte[] var1, int var2, int var3) {
      int var4 = 0;
      synchronized(this.field_3001) {
         while(true) {
            while(!this.field_3000.isEmpty()) {
               Iterator var6 = this.field_3000.iterator();

               while(var6.hasNext()) {
                  class_182 var7 = (class_182)var6.next();
                  if (var7 instanceof class_188) {
                     var6.remove();
                     break;
                  }

                  if (var7 instanceof class_183) {
                     if (var4 <= 0) {
                        var6.remove();
                        return -1;
                     }
                     break;
                  }

                  if (var7 instanceof class_185) {
                     byte[] var8 = ((class_185)var7).method_1281();
                     if (var8.length + var4 > var3) {
                        if (var4 <= 0) {
                           throw new IOException("insufficient buffer space");
                        }
                        break;
                     }

                     System.arraycopy(var8, 0, var1, var2 + var4, var8.length);
                     var4 += var8.length;
                     var6.remove();
                  }
               }

               if (var4 > 0) {
                  return var4;
               }
            }

            if (this.isClosed()) {
               throw new SocketException("Socket is closed");
            }

            if (this.isInputShutdown()) {
               throw new EOFException();
            }

            if (!this.isConnected()) {
               throw new SocketException("Connection reset");
            }

            try {
               if (this.field_2989 == 0) {
                  this.field_3001.wait();
               } else {
                  long var12 = System.currentTimeMillis();
                  this.field_3001.wait((long)this.field_2989);
                  if (System.currentTimeMillis() - var12 >= (long)this.field_2989) {
                     throw new SocketTimeoutException();
                  }
               }
            } catch (InterruptedException var10) {
               var10.printStackTrace();
            }
         }
      }
   }

   // $FF: renamed from: a (a.a.r) void
   public void method_2325(class_12 var1) {
      if (var1 == null) {
         throw new NullPointerException("stateListener");
      } else {
         synchronized(this.field_2995) {
            if (!this.field_2995.contains(var1)) {
               this.field_2995.add(var1);
            }

         }
      }
   }

   // $FF: renamed from: a (a.a.a.h) void
   private void method_2326(class_182 var1) {
      if (var1 instanceof class_185 || var1 instanceof class_188 || var1 instanceof class_183 || var1 instanceof class_184) {
         this.method_2341(var1);
      }

      if (var1 instanceof class_185 || var1 instanceof class_188 || var1 instanceof class_183) {
         this.field_3008.method_1296();
      }

      if (field_3012) {
         this.method_2348("sent " + var1);
      }

      this.method_2344(var1);
   }

   // $FF: renamed from: e () a.a.a.h
   private class_182 method_2327() {
      class_182 var1;
      if ((var1 = this.method_2345()) != null) {
         if (field_3012) {
            this.method_2348("recv " + var1);
         }

         if (var1 instanceof class_185 || var1 instanceof class_184 || var1 instanceof class_188 || var1 instanceof class_183 || var1 instanceof class_189) {
            this.field_3002.method_2377();
         }

         if (this.field_2987) {
            this.field_3011.method_1296();
         }
      }

      return var1;
   }

   // $FF: renamed from: c (a.a.a.h) void
   private void method_2328(class_182 var1) {
      synchronized(this.field_2998) {
         while(this.field_2998.size() >= this.field_3004 || this.field_3002.method_2384() > this.field_2997.method_2398()) {
            if (this.field_2984) {
               throw new SocketException("Socket is closed");
            }

            try {
               this.field_2998.wait(10000L);
            } catch (InterruptedException var8) {
               var8.printStackTrace();
            }
         }

         this.field_3002.method_2383();
         this.field_2998.add(var1);
      }

      if (this.field_2984) {
         throw new SocketException("Socket is closed");
      } else {
         if (!(var1 instanceof class_187) && !(var1 instanceof class_186)) {
            synchronized(this.field_3009) {
               if (this.field_3009.method_1295()) {
                  this.field_3009.method_1293((long)this.field_2997.method_2404(), (long)this.field_2997.method_2404());
               }
            }
         }

         this.method_2326(var1);
         if (var1 instanceof class_185) {
            synchronized(this.field_2994) {
               Iterator var3 = this.field_2994.iterator();

               while(var3.hasNext()) {
                  class_13 var4 = (class_13)var3.next();
                  var4.method_48();
               }
            }
         }

      }
   }

   // $FF: renamed from: d (a.a.a.h) void
   private void method_2329(class_182 var1) {
      if (this.field_2997.method_2399() > 0) {
         var1.method_1276(var1.method_1275() + 1);
      }

      if (this.field_2997.method_2399() != 0 && var1.method_1275() > this.field_2997.method_2399()) {
         this.method_2333();
      } else {
         this.method_2326(var1);
         if (var1 instanceof class_185) {
            synchronized(this.field_2994) {
               Iterator var3 = this.field_2994.iterator();

               while(var3.hasNext()) {
                  class_13 var4 = (class_13)var3.next();
                  var4.method_49();
               }
            }
         }

      }
   }

   // $FF: renamed from: f () void
   private void method_2330() {
      if (this.isConnected()) {
         this.field_3008.method_1297();
         if (this.field_2987) {
            this.field_3011.method_1297();
         }

         synchronized(this.field_2993) {
            this.field_2986 = false;
            this.field_2993.notify();
         }
      } else {
         synchronized(this) {
            try {
               this.field_2981 = new class_381(this);
               this.field_2982 = new class_378(this);
               this.field_2985 = true;
               this.field_2988 = 3;
            } catch (IOException var5) {
               var5.printStackTrace();
            }

            this.notify();
         }

         synchronized(this.field_2995) {
            Iterator var2 = this.field_2995.iterator();

            while(var2.hasNext()) {
               class_12 var3 = (class_12)var2.next();
               var3.method_43(this);
            }
         }
      }

      this.field_3008.method_1293(0L, (long)this.field_2997.method_2403());
      if (this.field_2987) {
         this.field_3011.method_1293((long)(this.field_2997.method_2403() * 6), (long)(this.field_2997.method_2403() * 6));
      }

   }

   // $FF: renamed from: g () void
   private void method_2331() {
      synchronized(this.field_2995) {
         Iterator var2 = this.field_2995.iterator();

         while(var2.hasNext()) {
            class_12 var3 = (class_12)var2.next();
            var3.method_44(this);
         }

      }
   }

   // $FF: renamed from: h () void
   private void method_2332() {
      synchronized(this.field_2995) {
         Iterator var2 = this.field_2995.iterator();

         while(var2.hasNext()) {
            class_12 var3 = (class_12)var2.next();
            var3.method_45(this);
         }

      }
   }

   // $FF: renamed from: i () void
   private void method_2333() {
      synchronized(this.field_2992) {
         if (this.isClosed()) {
            return;
         }

         switch(this.field_2988) {
         case 1:
         case 3:
         case 4:
            this.field_2985 = false;
            synchronized(this.field_2998) {
               this.field_2998.notifyAll();
            }

            synchronized(this.field_3001) {
               this.field_3001.notify();
            }

            this.method_2347();
            break;
         case 2:
            synchronized(this) {
               this.notify();
            }
         }

         this.field_2988 = 0;
         this.field_2984 = true;
      }

      synchronized(this.field_2995) {
         Iterator var2 = this.field_2995.iterator();

         while(var2.hasNext()) {
            class_12 var3 = (class_12)var2.next();
            var3.method_46(this);
         }

      }
   }

   // $FF: renamed from: j () void
   private void method_2334() {
      synchronized(this.field_2995) {
         Iterator var2 = this.field_2995.iterator();

         while(var2.hasNext()) {
            class_12 var3 = (class_12)var2.next();
            var3.method_47(this);
         }

      }
   }

   // $FF: renamed from: a (a.a.a.g) void
   private void method_2335(class_189 var1) {
      try {
         switch(this.field_2988) {
         case 0:
            this.field_3002.method_2375(var1.m());
            this.field_2988 = 1;
            Random var2 = new Random(System.currentTimeMillis());
            this.field_2997 = new class_377(this.field_3004, this.field_3005, var1.method_1284(), var1.method_1283(), var1.method_1288(), var1.method_1289(), var1.method_1290(), var1.method_1291(), var1.method_1287(), var1.method_1285(), var1.method_1286());
            class_189 var3 = new class_189(this.field_3002.method_2374(var2.nextInt(255)), this.field_2997.method_2398(), this.field_2997.method_2397(), this.field_2997.method_2404(), this.field_2997.method_2405(), this.field_2997.method_2403(), this.field_2997.method_2399(), this.field_2997.method_2400(), this.field_2997.method_2401(), this.field_2997.method_2402());
            var3.method_1273(var1.m());
            this.method_2328(var3);
            break;
         case 2:
            this.field_3002.method_2375(var1.m());
            this.field_2988 = 3;
            this.method_2338();
            this.method_2330();
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   // $FF: renamed from: a (a.a.a.c) void
   private void method_2336(class_187 var1) {
      int[] var3 = var1.method_1282();
      int var4 = var1.n();
      int var5 = var3[var3.length - 1];
      synchronized(this.field_2998) {
         Iterator var2 = this.field_2998.iterator();

         while(true) {
            class_182 var7;
            while(var2.hasNext()) {
               var7 = (class_182)var2.next();
               if (this.method_2350(var7.method_1271(), var4) <= 0) {
                  var2.remove();
               } else {
                  for(int var8 = 0; var8 < var3.length; ++var8) {
                     if (this.method_2350(var7.method_1271(), var3[var8]) == 0) {
                        var2.remove();
                        break;
                     }
                  }
               }
            }

            var2 = this.field_2998.iterator();

            while(var2.hasNext()) {
               var7 = (class_182)var2.next();
               if (this.method_2350(var4, var7.method_1271()) < 0 && this.method_2350(var5, var7.method_1271()) > 0) {
                  try {
                     this.method_2329(var7);
                  } catch (IOException var10) {
                     var10.printStackTrace();
                  }
               }
            }

            this.field_2998.notifyAll();
            return;
         }
      }
   }

   // $FF: renamed from: e (a.a.a.h) void
   private void method_2337(class_182 var1) {
      if (var1 instanceof class_188) {
         synchronized(this.field_2993) {
            this.field_2986 = true;
         }

         this.method_2334();
      }

      if (var1 instanceof class_183) {
         switch(this.field_2988) {
         case 0:
            break;
         case 2:
            synchronized(this) {
               this.notify();
               break;
            }
         default:
            this.field_2988 = 4;
         }
      }

      boolean var2 = false;
      synchronized(this.field_3001) {
         if (this.method_2350(var1.method_1271(), this.field_3002.method_2376()) > 0) {
            if (this.method_2350(var1.method_1271(), method_2349(this.field_3002.method_2376())) == 0) {
               var2 = true;
               if (this.field_3000.size() == 0 || this.field_3000.size() + this.field_2999.size() < this.field_3005) {
                  this.field_3002.method_2375(var1.method_1271());
                  if (var1 instanceof class_185 || var1 instanceof class_188 || var1 instanceof class_183) {
                     this.field_3000.add(var1);
                  }

                  if (var1 instanceof class_185) {
                     synchronized(this.field_2994) {
                        Iterator var5 = this.field_2994.iterator();

                        while(var5.hasNext()) {
                           class_13 var6 = (class_13)var5.next();
                           var6.method_50();
                        }
                     }
                  }

                  this.method_2343();
               }
            } else if (this.field_3000.size() + this.field_2999.size() < this.field_3005) {
               boolean var4 = false;

               for(int var17 = 0; var17 < this.field_2999.size() && !var4; ++var17) {
                  class_182 var18 = (class_182)this.field_2999.get(var17);
                  int var7 = this.method_2350(var1.method_1271(), var18.method_1271());
                  if (var7 == 0) {
                     var4 = true;
                  } else if (var7 < 0) {
                     this.field_2999.add(var17, var1);
                     var4 = true;
                  }
               }

               if (!var4) {
                  this.field_2999.add(var1);
               }

               this.field_3002.method_2380();
               if (var1 instanceof class_185) {
                  synchronized(this.field_2994) {
                     Iterator var19 = this.field_2994.iterator();

                     while(var19.hasNext()) {
                        class_13 var20 = (class_13)var19.next();
                        var20.method_51();
                     }
                  }
               }
            }
         }

         if (var2 && (var1 instanceof class_188 || var1 instanceof class_184 || var1 instanceof class_183)) {
            this.method_2338();
         } else if (this.field_3002.method_2381() <= 0 || this.field_2997.method_2401() != 0 && this.field_3002.method_2381() <= this.field_2997.method_2401()) {
            if (this.field_3002.method_2378() > 0 && (this.field_2997.method_2400() == 0 || this.field_3002.method_2378() > this.field_2997.method_2400())) {
               this.method_2340();
            } else {
               synchronized(this.field_3010) {
                  if (this.field_3010.method_1295()) {
                     this.field_3010.method_1292((long)this.field_2997.method_2405());
                  }
               }
            }
         } else {
            this.method_2339();
         }

      }
   }

   // $FF: renamed from: k () void
   private void method_2338() {
      synchronized(this.field_3001) {
         if (!this.field_2999.isEmpty()) {
            this.method_2339();
         } else {
            this.method_2340();
         }
      }
   }

   // $FF: renamed from: l () void
   private void method_2339() {
      synchronized(this.field_3001) {
         if (!this.field_2999.isEmpty()) {
            this.field_3002.method_2379();
            this.field_3002.method_2382();
            int[] var2 = new int[this.field_2999.size()];

            int var3;
            for(var3 = 0; var3 < var2.length; ++var3) {
               class_182 var4 = (class_182)this.field_2999.get(var3);
               var2[var3] = var4.method_1271();
            }

            try {
               var3 = this.field_3002.method_2376();
               this.method_2326(new class_187(method_2349(var3), var3, var2));
            } catch (IOException var6) {
               var6.printStackTrace();
            }

         }
      }
   }

   // $FF: renamed from: m () void
   private void method_2340() {
      if (this.field_3002.method_2379() != 0) {
         try {
            int var1 = this.field_3002.method_2376();
            this.method_2326(new class_186(method_2349(var1), var1));
         } catch (IOException var2) {
            var2.printStackTrace();
         }

      }
   }

   // $FF: renamed from: f (a.a.a.h) void
   private void method_2341(class_182 var1) {
      if (this.field_3002.method_2379() != 0) {
         var1.method_1273(this.field_3002.method_2376());
      }
   }

   // $FF: renamed from: g (a.a.a.h) void
   private void method_2342(class_182 var1) {
      int var2 = var1.method_1274();
      if (var2 >= 0) {
         this.field_3002.method_2385();
         if (this.field_2988 == 1) {
            this.field_2988 = 3;
            this.method_2330();
         }

         synchronized(this.field_2998) {
            Iterator var4 = this.field_2998.iterator();

            while(var4.hasNext()) {
               class_182 var5 = (class_182)var4.next();
               if (this.method_2350(var5.method_1271(), var2) <= 0) {
                  var4.remove();
               }
            }

            if (this.field_2998.isEmpty()) {
               this.field_3009.method_1297();
            }

            this.field_2998.notifyAll();
         }
      }
   }

   // $FF: renamed from: n () void
   private void method_2343() {
      synchronized(this.field_3001) {
         Iterator var2 = this.field_2999.iterator();

         while(true) {
            class_182 var3;
            do {
               if (!var2.hasNext()) {
                  this.field_3001.notify();
                  return;
               }

               var3 = (class_182)var2.next();
            } while(this.method_2350(var3.method_1271(), method_2349(this.field_3002.method_2376())) != 0);

            this.field_3002.method_2375(var3.method_1271());
            if (var3 instanceof class_185 || var3 instanceof class_188 || var3 instanceof class_183) {
               this.field_3000.add(var3);
            }

            var2.remove();
         }
      }
   }

   // $FF: renamed from: b (a.a.a.h) void
   protected void method_2344(class_182 var1) {
      try {
         DatagramPacket var2 = new DatagramPacket(var1.method_1277(), var1.method_1272(), this.field_2980);
         this.field_2979.send(var2);
      } catch (IOException var3) {
         if (!this.isClosed()) {
            var3.printStackTrace();
         }
      }

   }

   // $FF: renamed from: a () a.a.a.h
   protected class_182 method_2345() {
      try {
         DatagramPacket var1 = new DatagramPacket(this.field_2983, this.field_2983.length);
         this.field_2979.receive(var1);
         return class_182.method_1278(var1.getData(), 0, var1.getLength());
      } catch (IOException var2) {
         if (!this.isClosed()) {
            var2.printStackTrace();
         }

         return null;
      }
   }

   // $FF: renamed from: b () void
   protected void method_2346() {
      this.field_2979.close();
   }

   // $FF: renamed from: c () void
   protected void method_2347() {
      this.field_3008.method_1297();
      this.field_3011.method_1297();
      this.field_2988 = 4;
      f$1 var1 = new f$1(this);
      var1.setName("ReliableSocket-Closing");
      var1.setDaemon(true);
      var1.start();
   }

   // $FF: renamed from: a (java.lang.String) void
   protected void method_2348(String var1) {
      System.out.println(this.getLocalPort() + ": " + var1);
   }

   // $FF: renamed from: b (int) int
   private static int method_2349(int var0) {
      return (var0 + 1) % 255;
   }

   // $FF: renamed from: a (int, int) int
   private int method_2350(int var1, int var2) {
      if (var1 == var2) {
         return 0;
      } else {
         return (var1 >= var2 || var2 - var1 <= 127) && (var1 <= var2 || var1 - var2 >= 127) ? -1 : 1;
      }
   }

   // $FF: renamed from: a (a.a.f) a.a.a.i
   // $FF: synthetic method
   static class_191 method_2351(class_371 var0) {
      return var0.field_3011;
   }

   // $FF: renamed from: b (a.a.f) a.a.a.i
   // $FF: synthetic method
   static class_191 method_2352(class_371 var0) {
      return var0.field_3008;
   }

   // $FF: renamed from: c (a.a.f) a.a.q
   // $FF: synthetic method
   static class_377 method_2353(class_371 var0) {
      return var0.field_2997;
   }

   // $FF: renamed from: d (a.a.f) a.a.a.i
   // $FF: synthetic method
   static class_191 method_2354(class_371 var0) {
      return var0.field_3009;
   }

   // $FF: renamed from: e (a.a.f) a.a.a.i
   // $FF: synthetic method
   static class_191 method_2355(class_371 var0) {
      return var0.field_3010;
   }

   // $FF: renamed from: f (a.a.f) void
   // $FF: synthetic method
   static void method_2356(class_371 var0) {
      var0.method_2332();
   }

   // $FF: renamed from: a (int) int
   // $FF: synthetic method
   static int method_2357(int var0) {
      return method_2349(var0);
   }

   // $FF: renamed from: g (a.a.f) a.a.a.h
   // $FF: synthetic method
   static class_182 method_2358(class_371 var0) {
      return var0.method_2327();
   }

   // $FF: renamed from: a (a.a.f, a.a.a.g) void
   // $FF: synthetic method
   static void method_2359(class_371 var0, class_189 var1) {
      var0.method_2335(var1);
   }

   // $FF: renamed from: a (a.a.f, a.a.a.c) void
   // $FF: synthetic method
   static void method_2360(class_371 var0, class_187 var1) {
      var0.method_2336(var1);
   }

   // $FF: renamed from: a (a.a.f, a.a.a.h) void
   // $FF: synthetic method
   static void method_2361(class_371 var0, class_182 var1) {
      var0.method_2337(var1);
   }

   // $FF: renamed from: b (a.a.f, a.a.a.h) void
   // $FF: synthetic method
   static void method_2362(class_371 var0, class_182 var1) {
      var0.method_2342(var1);
   }

   // $FF: renamed from: h (a.a.f) java.util.ArrayList
   // $FF: synthetic method
   static ArrayList method_2363(class_371 var0) {
      return var0.field_2998;
   }

   // $FF: renamed from: i (a.a.f) a.a.g
   // $FF: synthetic method
   static class_373 method_2364(class_371 var0) {
      return var0.field_3002;
   }

   // $FF: renamed from: c (a.a.f, a.a.a.h) void
   // $FF: synthetic method
   static void method_2365(class_371 var0, class_182 var1) {
      var0.method_2328(var1);
   }

   // $FF: renamed from: d () boolean
   // $FF: synthetic method
   static boolean method_2366() {
      return field_3012;
   }

   // $FF: renamed from: d (a.a.f, a.a.a.h) void
   // $FF: synthetic method
   static void method_2367(class_371 var0, class_182 var1) {
      var0.method_2329(var1);
   }

   // $FF: renamed from: j (a.a.f) void
   // $FF: synthetic method
   static void method_2368(class_371 var0) {
      var0.method_2338();
   }

   // $FF: renamed from: k (a.a.f) void
   // $FF: synthetic method
   static void method_2369(class_371 var0) {
      var0.method_2333();
   }

   // $FF: renamed from: l (a.a.f) int
   // $FF: synthetic method
   static int method_2370(class_371 var0) {
      return var0.field_2988;
   }

   // $FF: renamed from: e (a.a.f, a.a.a.h) void
   // $FF: synthetic method
   static void method_2371(class_371 var0, class_182 var1) {
      var0.method_2326(var1);
   }
}
