package com.corrodinggames.rts.gameFramework.g;

import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g.h
public final class class_243 {
   // $FF: renamed from: a short
   public short field_2170;
   // $FF: renamed from: b short
   public short field_2171;

   public strictfp class_243() {
   }

   public strictfp class_243(short var1, short var2) {
      this.method_1746(var1, var2);
   }

   // $FF: renamed from: a (short, short) com.corrodinggames.rts.gameFramework.g.h
   public final strictfp class_243 method_1746(short var1, short var2) {
      this.field_2170 = var1;
      this.field_2171 = var2;
      return this;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.h) com.corrodinggames.rts.gameFramework.g.h
   public final strictfp class_243 method_1747(class_243 var1) {
      this.field_2170 = var1.field_2170;
      this.field_2171 = var1.field_2171;
      return this;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.f) com.corrodinggames.rts.gameFramework.g.h
   public final strictfp class_243 method_1748(class_245 var1) {
      this.field_2170 = var1.field_2175;
      this.field_2171 = var1.field_2176;
      return this;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.g) int
   public final strictfp int method_1749(class_247 var1) {
      return var1.field_2183[this.field_2170][this.field_2171] != -1 && var1.field_2184[this.field_2170][this.field_2171] != -1 && var1.field_2185[this.field_2170][this.field_2171] != -1 ? var1.field_2183[this.field_2170][this.field_2171] + var1.field_2184[this.field_2170][this.field_2171] + var1.field_2185[this.field_2170][this.field_2171] * 10 : -1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.g, byte) int
   public final strictfp int method_1750(class_247 var1, byte var2) {
      return var1.field_2192[var2][this.field_2170][this.field_2171];
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.g, byte, int) void
   public final strictfp void method_1751(class_247 var1, byte var2, int var3) {
      var1.field_2192[var2][this.field_2170][this.field_2171] = var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.g, byte, boolean) void
   public final strictfp void method_1752(class_247 var1, byte var2, boolean var3) {
      byte[] var10000;
      short var10001;
      if (var3) {
         var10000 = var1.field_2193[var2][this.field_2170];
         var10001 = this.field_2171;
         var10000[var10001] = (byte)(var10000[var10001] | 16);
      } else {
         var10000 = var1.field_2193[var2][this.field_2170];
         var10001 = this.field_2171;
         var10000[var10001] &= -17;
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.g.g, byte) boolean
   public final strictfp boolean method_1753(class_247 var1, byte var2) {
      if (var1.field_2192[var2][this.field_2170][this.field_2171] < var1.field_2191) {
         return false;
      } else {
         return (var1.field_2193[var2][this.field_2170][this.field_2171] & 16) != 0;
      }
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.g.g, byte) byte
   public final strictfp byte method_1754(class_247 var1, byte var2) {
      return (byte)(var1.field_2193[var2][this.field_2170][this.field_2171] & 7);
   }

   // $FF: renamed from: d (com.corrodinggames.rts.gameFramework.g.g, byte) boolean
   public final strictfp boolean method_1755(class_247 var1, byte var2) {
      return (var1.field_2193[var2][this.field_2170][this.field_2171] & 8) != 0;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.g.g, byte, boolean) void
   public final strictfp void method_1756(class_247 var1, byte var2, boolean var3) {
      byte[] var10000;
      short var10001;
      if (var3) {
         var10000 = var1.field_2193[var2][this.field_2170];
         var10001 = this.field_2171;
         var10000[var10001] = (byte)(var10000[var10001] | 8);
      } else {
         var10000 = var1.field_2193[var2][this.field_2170];
         var10001 = this.field_2171;
         var10000[var10001] &= -9;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.g, byte, byte) void
   public final strictfp void method_1757(class_247 var1, byte var2, byte var3) {
      byte[] var10000 = var1.field_2193[var2][this.field_2170];
      short var10001 = this.field_2171;
      var10000[var10001] &= -16;
      var10000 = var1.field_2193[var2][this.field_2170];
      var10001 = this.field_2171;
      var10000[var10001] = (byte)(var10000[var10001] | var3 & 15);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.g, byte, float) void
   public final strictfp void method_1758(class_247 var1, byte var2, float var3) {
      int var4 = (int)(var3 / 360.0F * 8.0F + 0.5F);
      if (var4 < 0) {
         var4 += 8;
      }

      if (var4 > 7) {
         var4 -= 8;
      }

      if (var4 < 0) {
         var4 += 8;
      }

      if (var4 > 7) {
         var4 -= 8;
      }

      if (var4 < 0 || var4 > 7) {
         class_236.method_1591("setCurrentDirectionFromAngle: dir:" + var4 + " direction:" + var3);
         var4 = 0;
      }

      this.method_1757(var1, var2, (byte)var4);
   }

   // $FF: renamed from: e (com.corrodinggames.rts.gameFramework.g.g, byte) boolean
   public final strictfp boolean method_1759(class_247 var1, byte var2) {
      return var1.field_2192[var2][this.field_2170][this.field_2171] >= var1.field_2191;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.gameFramework.g.g, byte) com.corrodinggames.rts.gameFramework.g.h
   public final strictfp class_243 method_1760(class_247 var1, byte var2) {
      class_243 var3 = new class_243();
      return this.method_1761(var1, var2, var3) ? var3 : null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.g, byte, com.corrodinggames.rts.gameFramework.g.h) boolean
   public final strictfp boolean method_1761(class_247 var1, byte var2, class_243 var3) {
      if (!this.method_1759(var1, var2)) {
         var3.method_1746((short)-1, (short)-1);
         return false;
      } else {
         byte var4 = this.method_1754(var1, var2);
         if (this.method_1755(var1, var2)) {
            var3.method_1746((short)-1, (short)-1);
            return false;
         } else {
            int var5 = 0;
            int var6 = 0;
            if (var4 == 0) {
               ++var5;
            }

            if (var4 == 1) {
               ++var5;
               ++var6;
            }

            if (var4 == 2) {
               ++var6;
            }

            if (var4 == 3) {
               ++var6;
               --var5;
            }

            if (var4 == 4) {
               --var5;
            }

            if (var4 == 5) {
               --var5;
               --var6;
            }

            if (var4 == 6) {
               --var6;
            }

            if (var4 == 7) {
               --var6;
               ++var5;
            }

            short var7 = (short)(this.field_2170 - var5);
            short var8 = (short)(this.field_2171 - var6);
            var3.method_1746(var7, var8);
            return true;
         }
      }
   }
}
