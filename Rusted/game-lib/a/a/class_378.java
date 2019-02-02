package a.a;

import java.io.OutputStream;

// $FF: renamed from: a.a.p
class class_378 extends OutputStream {
   // $FF: renamed from: a a.a.f
   protected class_371 field_3041;
   // $FF: renamed from: b byte[]
   protected byte[] field_3042;
   // $FF: renamed from: c int
   protected int field_3043;

   public class_378(class_371 var1) {
      if (var1 == null) {
         throw new NullPointerException("sock");
      } else {
         this.field_3041 = var1;
         this.field_3042 = new byte[this.field_3041.getSendBufferSize()];
         this.field_3043 = 0;
      }
   }

   public synchronized void write(int var1) {
      if (this.field_3043 >= this.field_3042.length) {
         this.flush();
      }

      this.field_3042[this.field_3043++] = (byte)(var1 & 255);
   }

   public synchronized void write(byte[] var1) {
      this.write(var1, 0, var1.length);
   }

   public synchronized void write(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new NullPointerException();
      } else if (var2 >= 0 && var3 >= 0 && var2 + var3 <= var1.length) {
         int var4;
         for(int var5 = 0; var5 < var3; var5 += var4) {
            var4 = Math.min(this.field_3042.length, var3 - var5);
            if (var4 > this.field_3042.length - this.field_3043) {
               this.flush();
            }

            System.arraycopy(var1, var2 + var5, this.field_3042, this.field_3043, var4);
            this.field_3043 += var4;
         }

      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public synchronized void flush() {
      if (this.field_3043 > 0) {
         this.field_3041.method_2322(this.field_3042, 0, this.field_3043);
         this.field_3043 = 0;
      }

   }

   public synchronized void close() {
      this.flush();
      this.field_3041.shutdownOutput();
   }
}
