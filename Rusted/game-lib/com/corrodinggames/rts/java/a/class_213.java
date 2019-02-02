package com.corrodinggames.rts.java.a;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

// $FF: renamed from: com.corrodinggames.rts.java.a.j
public class class_213 extends InputStream {
   // $FF: renamed from: a java.util.concurrent.LinkedBlockingDeque
   LinkedBlockingDeque field_1731;
   // $FF: renamed from: b boolean
   boolean field_1732;
   // $FF: renamed from: c byte[]
   byte[] field_1733;
   // $FF: renamed from: d com.corrodinggames.rts.java.a.i
   // $FF: synthetic field
   final class_212 field_1734;

   public class_213(class_212 var1) {
      this.field_1734 = var1;
      this.field_1731 = new LinkedBlockingDeque();
      this.field_1732 = true;
      this.field_1733 = new byte[1];
   }

   // $FF: renamed from: a (byte[]) void
   public void method_1421(byte[] var1) {
      ByteBuffer var2 = ByteBuffer.wrap(var1);
      this.field_1731.add(var2);
   }

   public int read() {
      int var1;
      do {
         var1 = this.read(this.field_1733, 0, 1);
      } while(var1 <= 0);

      int var2 = this.field_1733[0] & 255;
      return var2;
   }

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public int read(byte[] var1, int var2, int var3) {
      if (this.field_1734.field_1727) {
         throw new IOException("closed");
      } else {
         int var4 = 0;
         int var5 = var3;
         int var6 = var2;

         while(!this.field_1734.field_1727) {
            ByteBuffer var7;
            try {
               var7 = (ByteBuffer)this.field_1731.take();
            } catch (InterruptedException var9) {
               var9.printStackTrace();
               return var4;
            }

            if (var7 != null) {
               if (this.field_1732) {
                  this.field_1732 = false;
                  class_236.method_1591("First packet from:" + this.field_1734.field_1730);
               }

               int var8;
               if (var7.remaining() <= var5) {
                  var8 = var7.remaining();
                  var7.get(var1, var6, var8);
               } else {
                  var8 = var5;
                  var7.get(var1, var6, var5);
                  this.field_1731.addFirst(var7);
               }

               var4 += var8;
               var5 -= var8;
               var6 += var8;
               if (var5 < 0) {
                  throw new IOException("bytesNeeded<0:" + var5);
               }

               if (var5 == 0) {
                  return var4;
               }
            }
         }

         throw new IOException("Closed");
      }
   }
}
