package com.corrodinggames.rts.gameFramework.h;

import android.graphics.Bitmap;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.e
public class class_306 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e[]
   public class_306[] field_2521;
   // $FF: renamed from: p int
   private static int field_2522;
   // $FF: renamed from: q int
   private static int field_2523;
   // $FF: renamed from: b int
   public int field_2524;
   // $FF: renamed from: c int
   public int field_2525;
   // $FF: renamed from: d java.lang.String
   public String field_2526;
   // $FF: renamed from: e java.lang.Integer
   public Integer field_2527;
   // $FF: renamed from: f int[]
   public int[] field_2528;
   // $FF: renamed from: g android.graphics.Bitmap
   protected Bitmap field_2529;
   // $FF: renamed from: h boolean
   public boolean field_2530 = false;
   // $FF: renamed from: i int
   public int field_2531;
   // $FF: renamed from: j int
   public int field_2532;
   // $FF: renamed from: k int
   public int field_2533;
   // $FF: renamed from: l int
   public int field_2534;
   // $FF: renamed from: m float
   public float field_2535;
   // $FF: renamed from: n float
   public float field_2536;
   // $FF: renamed from: o boolean
   public boolean field_2537;

   public class_306() {
      this.field_2524 = field_2522++;
      this.field_2525 = field_2523++;
   }

   // $FF: renamed from: a () void
   public void method_2112() {
   }

   // $FF: renamed from: b () java.lang.String
   public String method_2113() {
      return this.field_2526;
   }

   // $FF: renamed from: c () android.graphics.Bitmap
   public Bitmap method_2114() {
      return this.field_2529;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_2115() {
      return this;
   }

   // $FF: renamed from: a (boolean) void
   public void method_2116(boolean var1) {
      this.field_2530 = var1;
      this.method_2117();
   }

   // $FF: renamed from: e () void
   protected void method_2117() {
   }

   // $FF: renamed from: a (android.graphics.Bitmap) void
   public void method_2118(Bitmap var1) {
      this.field_2529 = var1;
      this.field_2531 = this.field_2529.method_3306();
      this.field_2532 = this.field_2529.method_3307();
      this.method_2119();
   }

   // $FF: renamed from: f () void
   public void method_2119() {
      this.field_2533 = this.field_2531 / 2;
      this.field_2534 = this.field_2532 / 2;
      this.field_2535 = (float)this.field_2531 / 2.0F;
      this.field_2536 = (float)this.field_2532 / 2.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e) void
   public void method_2120(class_306 var1) {
      var1.field_2530 = this.field_2530;
      var1.field_2531 = this.field_2531;
      var1.field_2532 = this.field_2532;
      var1.field_2533 = this.field_2533;
      var1.field_2534 = this.field_2534;
      var1.field_2535 = this.field_2535;
      var1.field_2536 = this.field_2536;
   }

   // $FF: renamed from: g () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_2121() {
      class_306 var1 = new class_306();
      var1.field_2530 = this.field_2530;
      if (this.field_2529 != null) {
         var1.method_2118(this.field_2529.method_3300(this.field_2529.method_3308(), true));
      }

      return var1;
   }

   // $FF: renamed from: a (int, int, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_2122(int var1, int var2, boolean var3) {
      class_306 var4 = new class_306();
      var4.field_2530 = this.field_2530;
      if (this.field_2529 != null) {
         Bitmap var5 = Bitmap.method_3301(var1, var2, this.field_2529.method_3308());
         var4.method_2118(var5);
         if (var3) {
            for(int var6 = 0; var6 < var5.method_3306(); ++var6) {
               for(int var7 = 0; var7 < var5.method_3307(); ++var7) {
                  var5.method_3313(var6, var7, this.field_2529.method_3309(var6, var7));
               }
            }
         }
      }

      return var4;
   }

   // $FF: renamed from: h () void
   public void method_2123() {
      if (this.field_2528 == null) {
         this.method_2124();
      }

   }

   // $FF: renamed from: i () void
   public void method_2124() {
      if (this.field_2529 != null || !class_236.field_1899 || class_236.field_1900) {
         if (this.field_2528 == null) {
            this.field_2528 = new int[this.field_2531 * this.field_2532];
         }

         this.field_2529.method_3310(this.field_2528, 0, this.field_2531, 0, 0, this.field_2531, this.field_2532);
      }
   }

   // $FF: renamed from: a (int, int) int
   public int method_2125(int var1, int var2) {
      return this.field_2528 != null ? this.field_2528[var1 + var2 * this.field_2531] : this.field_2529.method_3309(var1, var2);
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_2126(int var1, int var2, int var3) {
      if (this.field_2528 != null) {
         this.field_2528[var1 + var2 * this.field_2531] = var3;
      } else {
         this.field_2529.method_3313(var1, var2, var3);
      }
   }

   // $FF: renamed from: j () int
   public int method_2127() {
      return this.field_2532;
   }

   // $FF: renamed from: k () int
   public int method_2128() {
      return this.field_2531;
   }

   // $FF: renamed from: l () void
   public void method_2129() {
   }

   // $FF: renamed from: m () void
   public void method_2130() {
      if (this.field_2529 != null) {
         this.field_2529 = null;
      }

   }

   // $FF: renamed from: n () void
   public void method_2131() {
      if (this.field_2529 != null || !class_236.field_1899 || class_236.field_1900) {
         if (this.field_2528 != null) {
            this.field_2529.method_3314(this.field_2528, 0, this.field_2531, 0, 0, this.field_2531, this.field_2532);
            this.field_2528 = null;
         }

         if (this.field_2529 != null) {
            this.field_2529.method_3315();
         }

      }
   }

   // $FF: renamed from: o () void
   public void method_2132() {
      this.field_2528 = null;
   }

   // $FF: renamed from: p () void
   public void method_2133() {
   }

   // $FF: renamed from: q () int
   public int method_2134() {
      return this.field_2531 * this.field_2532 * 8;
   }

   // $FF: renamed from: r () void
   public void method_2135() {
      this.field_2521 = null;
      this.field_2525 = field_2523++;
   }

   // $FF: renamed from: s () void
   public void method_2136() {
   }

   // $FF: synthetic method
   public Object clone() {
      return this.method_2121();
   }
}
