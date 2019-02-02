package a.a;

import java.io.InputStream;

// $FF: renamed from: a.a.n
class class_381 extends InputStream {
   // $FF: renamed from: a a.a.f
   protected class_371 field_3046;
   // $FF: renamed from: b byte[]
   protected byte[] field_3047;
   // $FF: renamed from: c int
   protected int field_3048;
   // $FF: renamed from: d int
   protected int field_3049;

   public class_381(class_371 var1) {
      if (var1 == null) {
         throw new NullPointerException("sock");
      } else {
         this.field_3046 = var1;
         this.field_3047 = new byte[this.field_3046.getReceiveBufferSize()];
         this.field_3048 = this.field_3049 = 0;
      }
   }

   public synchronized int read() {
      return this.method_2407() < 0 ? -1 : this.field_3047[this.field_3048++] & 255;
   }

   public synchronized int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public synchronized int read(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new NullPointerException();
      } else if (var2 >= 0 && var3 >= 0 && var2 + var3 <= var1.length) {
         if (this.method_2407() < 0) {
            return -1;
         } else {
            int var4 = Math.min(this.available(), var3);
            System.arraycopy(this.field_3047, this.field_3048, var1, var2, var4);
            this.field_3048 += var4;
            return var4;
         }
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public synchronized int available() {
      return this.field_3049 - this.field_3048;
   }

   public boolean markSupported() {
      return false;
   }

   public void close() {
      this.field_3046.shutdownInput();
   }

   // $FF: renamed from: a () int
   private int method_2407() {
      if (this.available() == 0) {
         this.field_3049 = this.field_3046.method_2324(this.field_3047, 0, this.field_3047.length);
         this.field_3048 = 0;
      }

      return this.field_3049;
   }
}
