package com.corrodinggames.rts.gameFramework.utility;

import java.io.OutputStream;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.u
public class class_207 extends OutputStream {
   // $FF: renamed from: a byte[]
   public byte[] field_1698;
   // $FF: renamed from: b int
   protected int field_1699;

   public class_207() {
      this.field_1698 = new byte[32];
   }

   public class_207(int var1) {
      if (var1 >= 0) {
         this.field_1698 = new byte[var1];
      } else {
         throw new IllegalArgumentException("size < 0");
      }
   }

   public void close() {
      super.close();
   }

   // $FF: renamed from: a (int) void
   private void method_1379(int var1) {
      if (this.field_1699 + var1 > this.field_1698.length) {
         byte[] var2 = new byte[(this.field_1699 + var1) * 2];
         System.arraycopy(this.field_1698, 0, var2, 0, this.field_1699);
         this.field_1698 = var2;
      }
   }

   // $FF: renamed from: a () void
   public synchronized void method_1380() {
      this.field_1699 = 0;
   }

   // $FF: renamed from: b () int
   public int method_1381() {
      return this.field_1699;
   }

   public String toString() {
      return new String(this.field_1698, 0, this.field_1699);
   }

   // $FF: renamed from: a (int, int, int) void
   public static void method_1382(int var0, int var1, int var2) {
      if ((var1 | var2) < 0 || var1 > var0 || var0 - var1 < var2) {
         throw new ArrayIndexOutOfBoundsException();
      }
   }

   public synchronized void write(byte[] var1, int var2, int var3) {
      method_1382(var1.length, var2, var3);
      if (var3 != 0) {
         this.method_1379(var3);
         System.arraycopy(var1, var2, this.field_1698, this.field_1699, var3);
         this.field_1699 += var3;
      }
   }

   public synchronized void write(int var1) {
      if (this.field_1699 == this.field_1698.length) {
         this.method_1379(1);
      }

      this.field_1698[this.field_1699++] = (byte)var1;
   }
}
