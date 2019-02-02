package a.a.a;

import java.io.IOException;

// $FF: renamed from: a.a.a.g
public class class_189 extends class_182 {
   // $FF: renamed from: a int
   private int field_1593;
   // $FF: renamed from: b int
   private int field_1594;
   // $FF: renamed from: c int
   private int field_1595;
   // $FF: renamed from: d int
   private int field_1596;
   // $FF: renamed from: e int
   private int field_1597;
   // $FF: renamed from: f int
   private int field_1598;
   // $FF: renamed from: g int
   private int field_1599;
   // $FF: renamed from: h int
   private int field_1600;
   // $FF: renamed from: i int
   private int field_1601;
   // $FF: renamed from: j int
   private int field_1602;
   // $FF: renamed from: k int
   private int field_1603;

   protected class_189() {
   }

   public class_189(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      this.a(-128, var1, 22);
      this.field_1593 = 1;
      this.field_1594 = var2;
      this.field_1595 = 1;
      this.field_1596 = var3;
      this.field_1597 = var4;
      this.field_1598 = var5;
      this.field_1599 = var6;
      this.field_1600 = var7;
      this.field_1601 = var8;
      this.field_1602 = var9;
      this.field_1603 = var10;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1270() {
      return "SYN";
   }

   // $FF: renamed from: c () int
   public int method_1283() {
      return this.field_1594;
   }

   // $FF: renamed from: e () int
   public int method_1284() {
      return this.field_1596;
   }

   // $FF: renamed from: f () int
   public int method_1285() {
      return this.field_1597;
   }

   // $FF: renamed from: g () int
   public int method_1286() {
      return this.field_1598;
   }

   // $FF: renamed from: h () int
   public int method_1287() {
      return this.field_1599;
   }

   // $FF: renamed from: i () int
   public int method_1288() {
      return this.field_1600;
   }

   // $FF: renamed from: j () int
   public int method_1289() {
      return this.field_1601;
   }

   // $FF: renamed from: k () int
   public int method_1290() {
      return this.field_1602;
   }

   // $FF: renamed from: l () int
   public int method_1291() {
      return this.field_1603;
   }

   // $FF: renamed from: d () byte[]
   public byte[] method_1277() {
      byte[] var1 = super.method_1277();
      var1[4] = (byte)(this.field_1593 << 4 & 255);
      var1[5] = (byte)(this.field_1594 & 255);
      var1[6] = (byte)(this.field_1595 & 255);
      var1[7] = 0;
      var1[8] = (byte)(this.field_1596 >>> 8 & 255);
      var1[9] = (byte)(this.field_1596 >>> 0 & 255);
      var1[10] = (byte)(this.field_1597 >>> 8 & 255);
      var1[11] = (byte)(this.field_1597 >>> 0 & 255);
      var1[12] = (byte)(this.field_1598 >>> 8 & 255);
      var1[13] = (byte)(this.field_1598 >>> 0 & 255);
      var1[14] = (byte)(this.field_1599 >>> 8 & 255);
      var1[15] = (byte)(this.field_1599 >>> 0 & 255);
      var1[16] = (byte)(this.field_1600 & 255);
      var1[17] = (byte)(this.field_1601 & 255);
      var1[18] = (byte)(this.field_1602 & 255);
      var1[19] = (byte)(this.field_1603 & 255);
      return var1;
   }

   // $FF: renamed from: a (byte[], int, int) void
   protected void method_1280(byte[] var1, int var2, int var3) {
      super.method_1280(var1, var2, var3);
      if (var3 < 22) {
         throw new IOException("Invalid SYN segment");
      } else {
         this.field_1593 = (var1[var2 + 4] & 255) >>> 4;
         if (this.field_1593 != 1) {
            throw new IOException("Invalid RUDP version:" + this.field_1593);
         } else {
            this.field_1594 = var1[var2 + 5] & 255;
            this.field_1595 = var1[var2 + 6] & 255;
            this.field_1596 = (var1[var2 + 8] & 255) << 8 | (var1[var2 + 9] & 255) << 0;
            this.field_1597 = (var1[var2 + 10] & 255) << 8 | (var1[var2 + 11] & 255) << 0;
            this.field_1598 = (var1[var2 + 12] & 255) << 8 | (var1[var2 + 13] & 255) << 0;
            this.field_1599 = (var1[var2 + 14] & 255) << 8 | (var1[var2 + 15] & 255) << 0;
            this.field_1600 = var1[var2 + 16] & 255;
            this.field_1601 = var1[var2 + 17] & 255;
            this.field_1602 = var1[var2 + 18] & 255;
            this.field_1603 = var1[var2 + 19] & 255;
         }
      }
   }
}
