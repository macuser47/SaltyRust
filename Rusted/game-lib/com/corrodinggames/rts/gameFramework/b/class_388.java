package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.utility.class_199;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.b.a
public class class_388 {
   // $FF: renamed from: a float
   float field_3083;
   // $FF: renamed from: b float
   float field_3084;
   // $FF: renamed from: c boolean
   public boolean field_3085;
   // $FF: renamed from: d com.corrodinggames.rts.game.units.ap
   public class_24 field_3086;
   // $FF: renamed from: e com.corrodinggames.rts.game.k
   public class_107 field_3087;
   // $FF: renamed from: f int
   public int field_3088 = 1;
   // $FF: renamed from: g float
   public float field_3089;
   // $FF: renamed from: h float
   public float field_3090;
   // $FF: renamed from: i boolean
   public boolean field_3091;
   // $FF: renamed from: j com.corrodinggames.rts.game.k
   public class_107 field_3092;
   // $FF: renamed from: k boolean
   public boolean field_3093;
   // $FF: renamed from: l int
   public int field_3094;
   // $FF: renamed from: m int
   public int field_3095;
   // $FF: renamed from: n boolean
   public boolean field_3096;
   // $FF: renamed from: o com.corrodinggames.rts.game.units.p
   public class_44 field_3097;
   // $FF: renamed from: p boolean
   boolean field_3098 = false;
   // $FF: renamed from: q int
   public int field_3099;
   // $FF: renamed from: r float
   public float field_3100;
   // $FF: renamed from: s float
   public float field_3101 = 0.04F;
   // $FF: renamed from: t com.corrodinggames.rts.game.units.aa
   public class_39 field_3102;
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.utility.m
   public static class_199 field_3103 = new class_199();
   // $FF: renamed from: v android.graphics.Point
   static Point field_3104 = new Point();
   // $FF: renamed from: w android.graphics.RectF
   static RectF field_3105 = new RectF();
   // $FF: renamed from: x android.graphics.RectF
   static RectF field_3106 = new RectF();
   // $FF: renamed from: y android.graphics.RectF
   static RectF field_3107 = new RectF();
   // $FF: renamed from: z android.graphics.Paint
   Paint field_3108 = new Paint();
   // $FF: renamed from: A android.graphics.Paint
   static Paint field_3109 = new class_441();
   // $FF: renamed from: B android.graphics.Paint
   static Paint field_3110;
   // $FF: renamed from: C android.graphics.RectF
   static RectF field_3111 = new RectF();

   public class_388() {
      field_3103.add(this);
      field_3103.method_1318();
   }

   // $FF: renamed from: a () void
   public static void method_2437() {
      field_3103.clear();
   }

   // $FF: renamed from: a (float) void
   public static void method_2438(float var0) {
      Iterator var1 = field_3103.iterator();

      while(var1.hasNext()) {
         class_388 var2 = (class_388)var1.next();
         var2.method_2446(var0);
      }

      field_3103.method_1318();
   }

   // $FF: renamed from: b (float) void
   public static void method_2439(float var0) {
      Iterator var1 = field_3103.iterator();

      while(var1.hasNext()) {
         class_388 var2 = (class_388)var1.next();
         var2.method_2447(var0);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, int, int, int) boolean
   public static boolean method_2440(class_107 var0, int var1, int var2, int var3) {
      class_236 var4 = class_236.method_1549();
      var4.field_1932.method_2579(var1, var2);
      float var5 = (float)(var4.field_1932.field_3355 + var4.field_1932.field_3332);
      float var6 = (float)(var4.field_1932.field_3356 + var4.field_1932.field_3333);
      field_3105.method_1969(var5, var6, var5 + 1.0F, var6 + 1.0F);
      return method_2443(var0, field_3105, var3);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, com.corrodinggames.rts.game.units.p, int) boolean
   public static boolean method_2441(class_107 var0, class_44 var1, int var2) {
      class_236 var3 = class_236.method_1549();
      class_408 var4 = var3.field_1932;
      field_3105 = var1.a(var4, field_3105);
      return method_2443(var0, field_3105, var2);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, com.corrodinggames.rts.game.units.p) boolean
   public static boolean method_2442(class_44 var0, class_44 var1) {
      class_236 var2 = class_236.method_1549();
      class_408 var3 = var2.field_1932;
      field_3105 = var0.a(var3, field_3105);
      field_3106 = var1.a(var3, field_3106);
      return class_296.method_2082(field_3105, field_3106);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, android.graphics.RectF, int) boolean
   public static boolean method_2443(class_107 var0, RectF var1, int var2) {
      class_236 var3 = class_236.method_1549();
      class_408 var4 = var3.field_1932;
      RectF var5 = field_3107;
      Iterator var6 = field_3103.iterator();

      do {
         class_388 var7;
         do {
            do {
               do {
                  if (!var6.hasNext()) {
                     return false;
                  }

                  var7 = (class_388)var6.next();
               } while(var7.field_3092 != var0);
            } while(!var7.field_3096);
         } while(var2 != -1 && var2 != var7.field_3099);

         class_39 var8 = class_39.method_216(var7.field_3086);
         var8.dh = var7.field_3089;
         var8.di = var7.field_3090;
         var5 = var8.method_327(var4, var5);
      } while(!class_296.method_2082(var5, var1));

      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, float, float) com.corrodinggames.rts.gameFramework.b.a
   public static class_388 method_2444(class_107 var0, float var1, float var2) {
      Iterator var3 = field_3103.iterator();

      while(var3.hasNext()) {
         class_388 var4 = (class_388)var3.next();
         if (var4.field_3092 == var0 && var4.field_3096) {
            float var5 = class_296.method_2026(var4.field_3089, var4.field_3090, var1, var2);
            class_39 var6 = class_39.method_216(var4.field_3086);
            float var7 = var6.field_157 + 1.0F;
            if (var7 < 20.0F) {
               var7 = 20.0F;
            }

            if (var5 < var7 * var7) {
               return var4;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2445() {
      if (this.field_3096) {
         if (this.field_3097 == null || this.field_3097.bi) {
            return false;
         }

         if (!class_469.method_3060(this.field_3086, this.field_3089, this.field_3090, 0.0F, 0.0F, this.field_3087)) {
            return false;
         }
      } else {
         if (this.field_3102 == null) {
            return false;
         }

         if (this.field_3102.method_243()) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: c (float) void
   public void method_2446(float var1) {
      ++this.field_3083;
      this.field_3084 += var1;
      boolean var2 = false;
      this.field_3100 = class_296.method_2020(this.field_3100, this.field_3101 * var1);
      if (this.field_3096) {
         if (this.field_3083 > 6.0F) {
            this.field_3083 = 0.0F;
            boolean var3 = this.field_3097.method_404(this.field_3086, this.field_3089, this.field_3090);
            if (!this.field_3098 && var3) {
               this.field_3098 = true;
            }

            if (!var3) {
               if (this.field_3098) {
                  var2 = true;
               } else if (this.field_3084 > 180.0F) {
                  var2 = true;
               }
            }

            if (!this.method_2445()) {
               var2 = true;
            }
         }
      } else if (this.field_3083 > 2.0F && !this.method_2445()) {
         var2 = true;
      }

      if (var2) {
         this.field_3085 = true;
         field_3103.method_1317(this);
      }

   }

   // $FF: renamed from: d (float) void
   public void method_2447(float var1) {
      class_236 var2 = class_236.method_1549();
      if (var2.field_1915 == this.field_3092) {
         if (var2.field_1980.method_1914((int)this.field_3089, (int)this.field_3090)) {
            float var3 = this.field_3089;
            float var4 = this.field_3090;
            float var5 = 0.0F;
            float var6 = 0.0F;
            float var7 = 1.0F;
            float var8 = 500.0F;
            boolean var9 = false;
            boolean var10 = false;
            if (this.field_3096) {
               var10 = true;
            } else {
               var9 = true;
            }

            boolean var11 = true;
            if (this.field_3091) {
               var11 = false;
            }

            if (var10 && this.field_3100 < 1.0F) {
               float var12 = this.field_3100;
               if (var12 <= 0.0F) {
                  var12 = 0.0F;
               } else {
                  var12 = 1.0F - class_296.method_2099(var12 * 90.0F);
               }

               class_39 var13 = class_39.method_217(this.field_3086);
               if (var13 != null && var13.method_212()) {
                  Rect var14 = var13.method_239();
                  if (var14 != null) {
                     field_3111.method_1971(var14);
                     RectF var10000 = field_3111;
                     var10000.field_2417 *= (float)var2.field_1932.field_3331;
                     var10000 = field_3111;
                     var10000.field_2419 *= (float)var2.field_1932.field_3331;
                     var10000 = field_3111;
                     var10000.field_2416 *= (float)var2.field_1932.field_3330;
                     var10000 = field_3111;
                     var10000.field_2418 *= (float)var2.field_1932.field_3330;
                     float var15 = (float)(var2.field_1932.field_3332 - 3) + var12 * 5.0F;
                     field_3111.method_1972(-(var13.method_323() - (float)var2.field_1932.field_3332), -(var13.method_324() - (float)var2.field_1932.field_3333));
                     class_296.method_2052(field_3111, var15);
                     float var16 = this.field_3089 - var2.field_1965;
                     float var17 = this.field_3090 - var2.field_1966 - var6;
                     field_3111.method_1972(var16, var17);
                     float var18 = 3.0F + var12 * 7.0F;
                     Paint var19 = field_3109;
                     if (this.field_3100 <= 0.0F) {
                        var19 = field_3110;
                     }

                     var2.field_1935.method_96(field_3111.field_2416 - var18, field_3111.field_2417, field_3111.field_2418 + var18, field_3111.field_2417, var19);
                     var2.field_1935.method_96(field_3111.field_2416 - var18, field_3111.field_2419, field_3111.field_2418 + var18, field_3111.field_2419, var19);
                     var2.field_1935.method_96(field_3111.field_2416, field_3111.field_2417 - var18, field_3111.field_2416, field_3111.field_2419 + var18, var19);
                     var2.field_1935.method_96(field_3111.field_2418, field_3111.field_2417 - var18, field_3111.field_2418, field_3111.field_2419 + var18, var19);
                  }
               }
            }

            class_469.method_3062(this.field_3086, var3, var4, var5, var6, this.field_3087, var7, var8, var9, var10, this.field_3088, var11);
         }
      }
   }

   static {
      field_3109.method_2791(90, 0, 0, 255);
      field_3109.method_2786(Paint$Style.field_4586);
      field_3109.method_2793(2.0F);
      field_3110 = new class_441();
      field_3110.method_2791(40, 0, 0, 255);
      field_3110.method_2786(Paint$Style.field_4586);
      field_3110.method_2793(2.0F);
   }
}
