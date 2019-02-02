package com.corrodinggames.rts.gameFramework.g;

import android.graphics.Paint;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import java.util.LinkedList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g.c
public class class_242 {
   // $FF: renamed from: y com.corrodinggames.rts.gameFramework.g.d
   private class_238 field_2144;
   // $FF: renamed from: a int
   protected int field_2145;
   // $FF: renamed from: b int
   protected static int field_2146;
   // $FF: renamed from: c int
   protected int field_2147;
   // $FF: renamed from: d short
   protected short field_2148;
   // $FF: renamed from: e short
   protected short field_2149;
   // $FF: renamed from: f java.lang.Float
   protected Float field_2150;
   // $FF: renamed from: g boolean
   protected boolean field_2151;
   // $FF: renamed from: h short
   protected short field_2152;
   // $FF: renamed from: i short
   protected short field_2153;
   // $FF: renamed from: j short
   protected short field_2154;
   // $FF: renamed from: k com.corrodinggames.rts.game.units.ac
   protected class_503 field_2155;
   // $FF: renamed from: l boolean
   public boolean field_2156;
   // $FF: renamed from: m int
   public int field_2157;
   // $FF: renamed from: n boolean
   public boolean field_2158;
   // $FF: renamed from: o float
   public float field_2159;
   // $FF: renamed from: p float
   public float field_2160;
   // $FF: renamed from: q boolean
   public boolean field_2161;
   // $FF: renamed from: r boolean
   protected boolean field_2162;
   // $FF: renamed from: s boolean
   protected boolean field_2163;
   // $FF: renamed from: z java.util.LinkedList
   private LinkedList field_2164;
   // $FF: renamed from: t byte[][]
   public byte[][] field_2165;
   // $FF: renamed from: u byte[][]
   public byte[][] field_2166;
   // $FF: renamed from: v byte[][]
   public byte[][] field_2167;
   // $FF: renamed from: w short[][]
   public short[][] field_2168;
   // $FF: renamed from: x byte[][]
   public byte[][] field_2169;

   public strictfp class_242(class_238 var1, boolean var2) {
      this.field_2144 = var1;
      if (var2) {
         this.field_2145 = field_2146++;
      }

      class_236 var3 = class_236.method_1549();
      this.field_2147 = var3.field_1920;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_1735(class_404 var1) {
      if (this.field_2164 == null) {
         var1.method_2540(false);
      } else {
         var1.method_2540(true);
         var1.method_2566("p", true);
         var1.method_2541(this.field_2164.size());
         if (this.field_2164.size() != 0) {
            class_243 var2 = (class_243)this.field_2164.get(0);
            var1.method_2561(var2.field_2170);
            var1.method_2561(var2.field_2171);

            for(int var3 = 1; var3 < this.field_2164.size(); ++var3) {
               class_243 var4 = (class_243)this.field_2164.get(var3);
               int var5 = var4.field_2170 - var2.field_2170;
               int var6 = var4.field_2171 - var2.field_2171;
               boolean var7 = class_296.method_2043(var5) > 1 || class_296.method_2043(var6) > 1;
               int var8;
               if (var7) {
                  class_236.method_1591("writeOutCompressedPath: out of range:" + var5 + "," + var6);
                  var8 = 128;
               } else {
                  var8 = var5 + 1 + (var6 + 1 << 2);
               }

               var1.method_2539(var8);
               if (var7) {
                  var1.method_2561(var4.field_2170);
                  var1.method_2561(var4.field_2171);
               }

               var2 = var4;
            }
         }

         var1.method_2567("p");
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_1736(class_463 var1) {
      boolean var2 = var1.method_3010();
      if (!var2) {
         this.field_2164 = null;
      } else {
         var1.method_3032("p", true);
         int var3 = var1.method_3011();
         if (var3 > 160000 || var3 < 0) {
            class_236.method_1591("readInCompressedPath: Path too big at:" + var3);
            var3 = -1;
         }

         if (var3 != -1) {
            this.field_2161 = true;
            if (this.field_2164 == null) {
               this.field_2164 = new LinkedList();
            }

            this.field_2164.clear();
         }

         if (var3 > 0) {
            short var4 = var1.method_3027();
            short var5 = var1.method_3027();
            this.field_2164.add(new class_243(var4, var5));

            for(int var6 = 1; var6 < var3; ++var6) {
               byte var7 = var1.method_3009();
               byte var8 = 3;
               byte var9 = 12;
               if (var7 >= 128) {
                  class_236.method_1591("readInCompressedPath: out of range unpack:" + var4 + "," + var5);
                  var4 = var1.method_3027();
                  var5 = var1.method_3027();
                  this.field_2164.add(new class_243(var4, var5));
               } else {
                  int var10 = (var7 & var8) - 1;
                  int var11 = ((var7 & var9) >> 2) - 1;
                  boolean var12 = class_296.method_2043(var10) > 1 || class_296.method_2043(var11) > 1;
                  if (var12) {
                     class_236.method_1591("readInCompressedPath: out of range but shouldn't be:" + var10 + "," + var11 + " for: " + var7);
                  }

                  var4 = (short)(var4 + var10);
                  var5 = (short)(var5 + var11);
                  this.field_2164.add(new class_243(var4, var5));
               }
            }
         }

         var1.method_3036("p");
      }

   }

   // $FF: renamed from: a () void
   public strictfp void method_1737() {
      class_240 var1 = this.field_2144.method_1681(this.field_2155);
      if (var1 == null) {
         throw new RuntimeException("Could not get costs for:" + this.field_2155.toString());
      } else {
         this.field_2165 = var1.field_2130;
         this.field_2166 = var1.field_2131;
         this.field_2167 = var1.field_2132;
         this.field_2168 = var1.field_2133;
         this.field_2169 = var1.field_2136;
      }
   }

   // $FF: renamed from: b () void
   public strictfp void method_1738() {
      this.field_2165 = (byte[][])null;
      this.field_2166 = (byte[][])null;
      this.field_2167 = (byte[][])null;
      this.field_2168 = (short[][])null;
      this.field_2169 = (byte[][])null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, short, short, java.lang.Float, boolean) void
   public strictfp void method_1739(class_503 var1, short var2, short var3, Float var4, boolean var5) {
      if (var1 == null) {
         throw new RuntimeException("MovementType is null");
      } else {
         this.field_2155 = var1;
         this.field_2148 = var2;
         this.field_2149 = var3;
         this.field_2150 = var4;
         this.field_2151 = var5;
         if (this.field_2148 < 0) {
            this.field_2148 = 0;
         }

         if (this.field_2149 < 0) {
            this.field_2149 = 0;
         }

         if (this.field_2148 > this.field_2144.field_2106 - 1) {
            this.field_2148 = (short)(this.field_2144.field_2106 - 1);
         }

         if (this.field_2149 > this.field_2144.field_2107 - 1) {
            this.field_2149 = (short)(this.field_2144.field_2107 - 1);
         }

         if (this.field_2144.method_1681(var1) == null) {
            throw new RuntimeException("Could not get costs for:" + var1.toString());
         }
      }
   }

   // $FF: renamed from: a (short, short, short) void
   public strictfp void method_1740(short var1, short var2, short var3) {
      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 < 0) {
         var2 = 0;
      }

      if (var1 > this.field_2144.field_2106 - 1) {
         var1 = (short)(this.field_2144.field_2106 - 1);
      }

      if (var2 > this.field_2144.field_2107 - 1) {
         var2 = (short)(this.field_2144.field_2107 - 1);
      }

      this.field_2152 = var1;
      this.field_2153 = var2;
      this.field_2154 = var3;
   }

   // $FF: renamed from: c () java.util.LinkedList
   public strictfp LinkedList method_1741() {
      class_236 var1 = class_236.method_1549();
      if (!var1.field_1944.field_3809 && !var1.field_1948.method_2657()) {
         return this.field_2164;
      } else {
         return this.field_2161 ? this.field_2164 : null;
      }
   }

   // $FF: renamed from: d () boolean
   protected strictfp boolean method_1742() {
      return this.field_2164 != null;
   }

   // $FF: renamed from: a (java.util.LinkedList) void
   protected strictfp void method_1743(LinkedList var1) {
      this.field_2164 = var1;
   }

   // $FF: renamed from: e () void
   public strictfp void method_1744() {
      class_236 var1 = class_236.method_1549();
      class_408 var2 = var1.field_1932;
      Paint var3 = new Paint();
      var3.method_2793(2.0F);
      var3.method_2791(100, 0, 100, 0);
      var1.field_1935.method_85((float)(this.field_2152 * var2.field_3330 + var2.field_3332 - class_236.method_1549().field_1963), (float)(this.field_2153 * var2.field_3331 + var2.field_3333 - class_236.method_1549().field_1964), (float)(this.field_2154 * var2.field_3330), var3);
      var3.method_2791(225, 0, 0, 255);
      var1.field_1935.method_96((float)(this.field_2148 * var2.field_3330 + var2.field_3332 - class_236.method_1549().field_1963), (float)(this.field_2149 * var2.field_3331 + var2.field_3333 - class_236.method_1549().field_1964), (float)(this.field_2152 * var2.field_3330 + var2.field_3332 - class_236.method_1549().field_1963), (float)(this.field_2153 * var2.field_3331 + var2.field_3333 - class_236.method_1549().field_1964), var3);
   }

   // $FF: renamed from: f () void
   public strictfp void method_1745() {
      if (this.field_2164 != null) {
         class_236 var1 = class_236.method_1549();
         class_408 var2 = var1.field_1932;
         if (this.field_2164.size() >= 1) {
            for(int var3 = 1; var3 < this.field_2164.size(); ++var3) {
               class_243 var4 = (class_243)this.field_2164.get(var3);
               class_243 var5 = (class_243)this.field_2164.get(var3 - 1);
               Paint var6 = new Paint();
               var6.method_2791(255, 0, 255, 0);
               var6.method_2793(2.0F);
               int var7 = var4.field_2170 * var2.field_3330 + var2.field_3332 - class_236.method_1549().field_1963;
               int var8 = var4.field_2171 * var2.field_3331 + var2.field_3333 - class_236.method_1549().field_1964;
               int var9 = var5.field_2170 * var2.field_3330 + var2.field_3332 - class_236.method_1549().field_1963;
               int var10 = var5.field_2171 * var2.field_3331 + var2.field_3333 - class_236.method_1549().field_1964;
               var1.field_1935.method_96((float)var7, (float)var8, (float)var9, (float)var10, var6);
            }
         }
      }

   }
}
