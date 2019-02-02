package com.corrodinggames.rts.java.a;

import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamNetworking$P2PSend;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

// $FF: renamed from: com.corrodinggames.rts.java.a.k
public class class_214 extends OutputStream {
   // $FF: renamed from: a boolean
   boolean field_1735;
   // $FF: renamed from: b com.corrodinggames.rts.java.a.i
   // $FF: synthetic field
   final class_212 field_1736;

   public class_214(class_212 var1) {
      this.field_1736 = var1;
      this.field_1735 = true;
   }

   public void write(int var1) {
      class_236.method_1595("SteamSocketOutputStream: Slow write: " + var1);
      byte[] var2 = new byte[]{(byte)var1};
      this.write(var2);
   }

   public void write(byte[] var1, int var2, int var3) {
      if (this.field_1736.field_1727) {
         class_236.method_1591("cannot write steam socket closed");
      } else {
         ByteBuffer var4 = ByteBuffer.allocateDirect(var3);
         var4.put(var1, var2, var3);
         var4.flip();
         synchronized(this.field_1736.field_1726) {
            try {
               if (this.field_1735) {
                  this.field_1735 = false;
                  class_236.method_1591("First packet to:" + this.field_1736.field_1730);
               }

               this.field_1736.field_1726.field_1783.sendP2PPacket(this.field_1736.field_1730, var4, SteamNetworking$P2PSend.Reliable, 0);
            } catch (SteamException var8) {
               throw new IOException(var8);
            }

         }
      }
   }

   public void write(byte[] var1) {
      this.write(var1, 0, var1.length);
   }
}
