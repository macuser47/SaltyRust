package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

// $FF: renamed from: com.corrodinggames.rts.java.a.i
public class class_212 extends Socket {
   // $FF: renamed from: a com.corrodinggames.rts.java.a.b
   class_224 field_1726;
   // $FF: renamed from: b boolean
   boolean field_1727 = false;
   // $FF: renamed from: c com.corrodinggames.rts.java.a.j
   class_213 field_1728;
   // $FF: renamed from: d com.corrodinggames.rts.java.a.k
   class_214 field_1729;
   // $FF: renamed from: e com.codedisaster.steamworks.SteamID
   SteamID field_1730;

   public class_212(class_224 var1, SteamID var2) {
      this.field_1726 = var1;
      this.field_1730 = var2;
      this.field_1728 = new class_213(this);
      this.field_1729 = new class_214(this);
   }

   public void bind(SocketAddress var1) {
      throw new RuntimeException("Not supported");
   }

   public synchronized void close() {
      if (!this.field_1727) {
         this.field_1727 = true;
         class_236.method_1591("Closing steam socket");
      }

      if (this.field_1728 != null) {
         this.field_1728.method_1421(new byte[0]);
      }

   }

   public void connect(SocketAddress var1, int var2) {
      throw new RuntimeException("Not supported");
   }

   public void connect(SocketAddress var1) {
      throw new RuntimeException("Not supported");
   }

   public SocketChannel getChannel() {
      throw new RuntimeException("Not supported");
   }

   public InetAddress getInetAddress() {
      return null;
   }

   public InetAddress getLocalAddress() {
      return null;
   }

   public SocketAddress getLocalSocketAddress() {
      return null;
   }

   public SocketAddress getRemoteSocketAddress() {
      return null;
   }

   public InputStream getInputStream() {
      return this.field_1728;
   }

   public boolean getKeepAlive() {
      return true;
   }

   public int getLocalPort() {
      return 5555;
   }

   public boolean getOOBInline() {
      return false;
   }

   public OutputStream getOutputStream() {
      return this.field_1729;
   }

   public int getPort() {
      return 5555;
   }

   public synchronized int getReceiveBufferSize() {
      return 512;
   }

   public boolean getReuseAddress() {
      return false;
   }

   public synchronized int getSendBufferSize() {
      return 512;
   }

   public int getSoLinger() {
      return 0;
   }

   public synchronized int getSoTimeout() {
      return 0;
   }

   public boolean getTcpNoDelay() {
      return true;
   }

   public int getTrafficClass() {
      return 0;
   }

   public boolean isBound() {
      return true;
   }

   public boolean isClosed() {
      return this.field_1727;
   }

   public boolean isConnected() {
      return true;
   }

   public boolean isInputShutdown() {
      return this.field_1728 != null;
   }

   public boolean isOutputShutdown() {
      return this.field_1729 != null;
   }

   public void sendUrgentData(int var1) {
   }

   public void setKeepAlive(boolean var1) {
   }

   public void setOOBInline(boolean var1) {
   }

   public void setPerformancePreferences(int var1, int var2, int var3) {
   }

   public synchronized void setReceiveBufferSize(int var1) {
   }

   public void setReuseAddress(boolean var1) {
   }

   public synchronized void setSendBufferSize(int var1) {
   }

   public void setSoLinger(boolean var1, int var2) {
   }

   public synchronized void setSoTimeout(int var1) {
   }

   public void setTcpNoDelay(boolean var1) {
   }

   public void setTrafficClass(int var1) {
   }

   public void shutdownInput() {
   }

   public void shutdownOutput() {
   }

   public String toString() {
      return "<SteamSocket>";
   }
}
