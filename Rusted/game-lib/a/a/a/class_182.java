package a.a.a;

import java.io.IOException;

// $FF: renamed from: a.a.a.h
public abstract class class_182 {
   // $FF: renamed from: a int
   private int field_1586;
   // $FF: renamed from: b int
   private int field_1587;
   // $FF: renamed from: c int
   private int field_1588;
   // $FF: renamed from: d int
   private int field_1589 = -1;
   // $FF: renamed from: e int
   private int field_1590 = 0;

   protected class_182() {
   }

   // $FF: renamed from: a () java.lang.String
   public abstract String method_1270();

   // $FF: renamed from: m () int
   public int method_1271() {
      return this.field_1588;
   }

   // $FF: renamed from: b () int
   public int method_1272() {
      return this.field_1587;
   }

   // $FF: renamed from: a (int) void
   public void method_1273(int var1) {
      this.field_1586 |= 64;
      this.field_1589 = var1;
   }

   // $FF: renamed from: n () int
   public int method_1274() {
      return (this.field_1586 & 64) == 64 ? this.field_1589 : -1;
   }

   // $FF: renamed from: o () int
   public int method_1275() {
      return this.field_1590;
   }

   // $FF: renamed from: b (int) void
   public void method_1276(int var1) {
      this.field_1590 = var1;
   }

   // $FF: renamed from: d () byte[]
   public byte[] method_1277() {
      byte[] var1 = new byte[this.method_1272()];
      var1[0] = (byte)(this.field_1586 & 255);
      var1[1] = (byte)(this.field_1587 & 255);
      var1[2] = (byte)(this.field_1588 & 255);
      var1[3] = (byte)(this.field_1589 & 255);
      return var1;
   }

   public String toString() {
      return this.method_1270() + " [ SEQ = " + this.method_1271() + ", ACK = " + (this.method_1274() >= 0 ? "" + this.method_1274() : "N/A") + ", LEN = " + this.method_1272() + " ]";
   }

   // $FF: renamed from: b (byte[], int, int) a.a.a.h
   public static class_182 method_1278(byte[] var0, int var1, int var2) {
      Object var3 = null;
      if (var2 < 6) {
         throw new IOException("Invalid segment:" + var2);
      } else {
         byte var4 = var0[var1];
         if ((var4 & -128) != 0) {
            var3 = new class_189();
         } else if ((var4 & 8) != 0) {
            var3 = new class_184();
         } else if ((var4 & 32) != 0) {
            var3 = new class_187();
         } else if ((var4 & 16) != 0) {
            var3 = new class_188();
         } else if ((var4 & 2) != 0) {
            var3 = new class_183();
         } else if ((var4 & 64) != 0) {
            if (var2 == 6) {
               var3 = new class_186();
            } else {
               var3 = new class_185();
            }
         }

         if (var3 == null) {
            throw new IOException("Invalid segment");
         } else {
            ((class_182)var3).method_1280(var0, var1, var2);
            return (class_182)var3;
         }
      }
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_1279(int var1, int var2, int var3) {
      this.field_1586 = var1;
      this.field_1588 = var2;
      this.field_1587 = var3;
   }

   // $FF: renamed from: a (byte[], int, int) void
   protected void method_1280(byte[] var1, int var2, int var3) {
      this.field_1586 = var1[var2] & 255;
      this.field_1587 = var1[var2 + 1] & 255;
      this.field_1588 = var1[var2 + 2] & 255;
      this.field_1589 = var1[var2 + 3] & 255;
   }
}
