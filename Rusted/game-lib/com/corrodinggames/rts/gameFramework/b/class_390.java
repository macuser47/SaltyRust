package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.h.class_441;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.b.e
public final class class_390 {
   // $FF: renamed from: ap com.corrodinggames.rts.gameFramework.b.c
   private final class_391 field_3118;
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.u
   public class_34 field_3119;
   // $FF: renamed from: b boolean
   public boolean field_3120;
   // $FF: renamed from: c boolean
   public boolean field_3121;
   // $FF: renamed from: d boolean
   public boolean field_3122 = true;
   // $FF: renamed from: e boolean
   public boolean field_3123 = false;
   // $FF: renamed from: f int
   public int field_3124;
   // $FF: renamed from: g int
   public static int field_3125 = 1;
   // $FF: renamed from: h int
   public static int field_3126 = 2;
   // $FF: renamed from: i int
   public static int field_3127 = 3;
   // $FF: renamed from: j int
   public static int field_3128 = 4;
   // $FF: renamed from: k int
   public static int field_3129 = 5;
   // $FF: renamed from: l int
   public static int field_3130 = 6;
   // $FF: renamed from: m int
   public static int field_3131 = 7;
   // $FF: renamed from: n boolean
   public boolean field_3132;
   // $FF: renamed from: o boolean
   public boolean field_3133;
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.b.h
   public class_395 field_3134;
   // $FF: renamed from: q boolean
   public boolean field_3135;
   // $FF: renamed from: r boolean
   public boolean field_3136;
   // $FF: renamed from: s float
   public float field_3137;
   // $FF: renamed from: t boolean
   public boolean field_3138;
   // $FF: renamed from: u boolean
   public boolean field_3139;
   // $FF: renamed from: v float
   public float field_3140;
   // $FF: renamed from: w int
   public int field_3141;
   // $FF: renamed from: x android.graphics.LightingColorFilter
   public LightingColorFilter field_3142;
   // $FF: renamed from: y float
   public float field_3143;
   // $FF: renamed from: z float
   public float field_3144;
   // $FF: renamed from: A float
   public float field_3145;
   // $FF: renamed from: B boolean
   public boolean field_3146;
   // $FF: renamed from: C float
   public float field_3147;
   // $FF: renamed from: D float
   public float field_3148;
   // $FF: renamed from: E float
   public float field_3149;
   // $FF: renamed from: F boolean
   public boolean field_3150;
   // $FF: renamed from: G float
   public float field_3151;
   // $FF: renamed from: H float
   public float field_3152;
   // $FF: renamed from: I float
   public float field_3153;
   // $FF: renamed from: J float
   public float field_3154;
   // $FF: renamed from: K float
   public float field_3155;
   // $FF: renamed from: L float
   public float field_3156;
   // $FF: renamed from: M float
   public float field_3157;
   // $FF: renamed from: N float
   public float field_3158;
   // $FF: renamed from: O float
   public float field_3159;
   // $FF: renamed from: P float
   public float field_3160;
   // $FF: renamed from: Q float
   public float field_3161;
   // $FF: renamed from: R float
   public float field_3162;
   // $FF: renamed from: S float
   public float field_3163;
   // $FF: renamed from: T java.lang.String
   public String field_3164;
   // $FF: renamed from: U android.graphics.Paint
   public Paint field_3165;
   // $FF: renamed from: V float
   public float field_3166;
   // $FF: renamed from: W float
   public float field_3167;
   // $FF: renamed from: X boolean
   public boolean field_3168;
   // $FF: renamed from: Y int
   public int field_3169;
   // $FF: renamed from: Z int
   public int field_3170;
   // $FF: renamed from: aa boolean
   public boolean field_3171;
   // $FF: renamed from: ab float
   public float field_3172;
   // $FF: renamed from: ac float
   public float field_3173;
   // $FF: renamed from: ad boolean
   public boolean field_3174;
   // $FF: renamed from: ae boolean
   public boolean field_3175;
   // $FF: renamed from: af int
   public int field_3176;
   // $FF: renamed from: ag com.corrodinggames.rts.gameFramework.b.g
   public class_394 field_3177;
   // $FF: renamed from: ah int
   public int field_3178;
   // $FF: renamed from: ai short
   public short field_3179;
   // $FF: renamed from: aj boolean
   public boolean field_3180;
   // $FF: renamed from: ak android.graphics.Paint
   public Paint field_3181;
   // $FF: renamed from: al float
   public float field_3182;
   // $FF: renamed from: am int
   public int field_3183;
   // $FF: renamed from: an boolean
   public boolean field_3184;
   // $FF: renamed from: ao com.corrodinggames.rts.gameFramework.h.p[]
   public static class_441[] field_3185 = new class_441[128];

   protected class_390(class_391 var1) {
      this.field_3134 = class_395.field_3221;
      this.field_3140 = 1.0F;
      this.field_3142 = null;
      this.field_3175 = false;
      this.field_3179 = 2;
      this.field_3180 = false;
      this.field_3181 = new class_441();
      this.field_3118 = var1;
   }

   // $FF: renamed from: a (float) com.corrodinggames.rts.gameFramework.h.p
   public class_441 method_2452(float var1) {
      int var2 = (int)(var1 * (float)(field_3185.length - 1));
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 > field_3185.length - 1) {
         var2 = field_3185.length - 1;
      }

      return field_3185[var2];
   }

   // $FF: renamed from: a () void
   public void method_2453() {
      if (this.field_3133) {
         this.field_3133 = false;
         --this.field_3118.field_3186;
      }

   }

   // $FF: renamed from: b () void
   public void method_2454() {
      this.field_3134 = class_395.field_3221;
      this.field_3119 = null;
      this.field_3120 = false;
      this.field_3121 = false;
      this.field_3122 = true;
      this.field_3123 = false;
      this.field_3124 = 0;
      this.field_3132 = false;
      this.field_3147 = 0.0F;
      this.field_3148 = 0.0F;
      this.field_3150 = false;
      this.field_3151 = 0.0F;
      this.field_3152 = 0.0F;
      this.field_3153 = 0.0F;
      this.field_3149 = 0.0F;
      this.field_3179 = 2;
      this.field_3175 = false;
      this.field_3168 = false;
      this.field_3173 = 0.0F;
      this.field_3172 = 0.0F;
      this.field_3170 = 0;
      this.field_3171 = false;
      this.field_3174 = false;
      this.field_3176 = 0;
      this.field_3178 = 0;
      this.field_3177 = null;
      this.field_3159 = 0.0F;
      this.field_3160 = 15.0F;
      this.field_3161 = this.field_3160;
      this.field_3135 = false;
      this.field_3136 = false;
      this.field_3137 = 0.0F;
      this.field_3144 = 1.0F;
      this.field_3145 = 1.0F;
      this.field_3146 = false;
      this.field_3138 = false;
      this.field_3139 = false;
      this.field_3140 = 1.0F;
      this.field_3143 = 1.0F;
      this.field_3162 = 0.0F;
      this.field_3163 = 0.0F;
      this.field_3154 = 0.0F;
      this.field_3155 = 0.0F;
      this.field_3156 = 0.0F;
      this.field_3157 = 0.0F;
      this.field_3158 = 0.0F;
      this.field_3164 = null;
      this.field_3165 = null;
      this.field_3166 = 0.0F;
      this.field_3167 = 0.0F;
      this.field_3141 = -1;
      this.field_3142 = null;
      this.field_3181.method_2796((ColorFilter)null);
      this.field_3184 = false;
      this.field_3180 = false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.b.e) void
   public void method_2455(class_390 var1) {
      this.field_3134 = var1.field_3134;
      this.field_3124 = var1.field_3124;
      this.field_3119 = var1.field_3119;
      this.field_3120 = var1.field_3120;
      this.field_3121 = var1.field_3121;
      this.field_3122 = var1.field_3122;
      this.field_3132 = var1.field_3132;
      this.field_3147 = var1.field_3147;
      this.field_3148 = var1.field_3148;
      this.field_3150 = var1.field_3150;
      this.field_3151 = var1.field_3151;
      this.field_3152 = var1.field_3152;
      this.field_3153 = var1.field_3153;
      this.field_3149 = var1.field_3149;
      this.field_3179 = var1.field_3179;
      this.field_3175 = var1.field_3175;
      this.field_3168 = var1.field_3168;
      this.field_3173 = var1.field_3173;
      this.field_3172 = var1.field_3172;
      this.field_3170 = var1.field_3170;
      this.field_3171 = var1.field_3171;
      this.field_3174 = var1.field_3171;
      this.field_3176 = var1.field_3176;
      this.field_3178 = var1.field_3178;
      this.field_3177 = var1.field_3177;
      this.field_3159 = var1.field_3159;
      this.field_3160 = var1.field_3160;
      this.field_3161 = var1.field_3161;
      this.field_3135 = var1.field_3135;
      this.field_3136 = var1.field_3136;
      this.field_3137 = var1.field_3137;
      this.field_3144 = var1.field_3144;
      this.field_3145 = var1.field_3145;
      this.field_3146 = var1.field_3146;
      this.field_3138 = var1.field_3138;
      this.field_3139 = var1.field_3139;
      this.field_3140 = var1.field_3140;
      this.field_3143 = var1.field_3143;
      this.field_3162 = var1.field_3162;
      this.field_3163 = var1.field_3163;
      this.field_3154 = var1.field_3154;
      this.field_3155 = var1.field_3155;
      this.field_3156 = var1.field_3156;
      this.field_3157 = var1.field_3157;
      this.field_3158 = var1.field_3158;
      this.field_3164 = var1.field_3164;
      this.field_3165 = var1.field_3165;
      this.field_3166 = var1.field_3166;
      this.field_3167 = var1.field_3167;
      this.field_3141 = var1.field_3141;
      this.field_3142 = var1.field_3142;
      this.field_3180 = var1.field_3180;
   }

   // $FF: renamed from: b (float) void
   public void method_2456(float var1) {
      this.field_3159 = class_296.method_2020(this.field_3159, var1);
      if (this.field_3159 <= 0.0F) {
         this.field_3160 -= var1;
         if (this.field_3119 != null && this.field_3119.field_69 && !this.field_3121) {
            this.field_3160 = -1.0F;
         }

         if (this.field_3160 < 0.0F) {
            this.method_2453();
         } else {
            if (this.field_3168) {
               if (this.field_3174) {
                  this.field_3173 -= this.field_3172 * var1;
               } else {
                  this.field_3173 += this.field_3172 * var1;
               }

               if (this.field_3171) {
                  if (!this.field_3174) {
                     if (this.field_3173 >= (float)(this.field_3170 + 1)) {
                        this.field_3174 = true;
                        this.field_3173 = (float)this.field_3170;
                     }
                  } else if (this.field_3173 < (float)this.field_3169) {
                     this.method_2453();
                     return;
                  }
               } else if (this.field_3173 >= (float)(this.field_3170 + 1)) {
                  this.method_2453();
                  return;
               }

               this.field_3176 = (int)this.field_3173;
            }

            if (this.field_3138) {
               float var2 = class_296.method_2041(0.998F, var1);
               this.field_3156 *= var2;
               this.field_3154 -= var1 * 0.0015F;
            }

            if (this.field_3139) {
               if (this.field_3149 > 0.0F) {
                  this.field_3156 -= 0.1F * this.field_3140 * var1;
               } else {
                  if (this.field_3156 < 0.0F) {
                     this.field_3156 = -this.field_3156;
                     this.field_3156 *= 0.5F;
                     this.field_3156 = class_296.method_2020(this.field_3156, 1.3F);
                  }

                  if (this.field_3149 < 0.0F) {
                     this.field_3149 = 0.0F;
                  }

                  if ((double)this.field_3156 < 0.2D) {
                     this.field_3179 = 1;
                  }

                  this.field_3154 = class_296.method_2020(this.field_3154, 0.15F * var1);
                  this.field_3155 = class_296.method_2020(this.field_3155, 0.15F * var1);
                  this.field_3163 = class_296.method_2020(this.field_3163, 1.0F * var1);
               }
            }

            this.field_3147 += this.field_3154 * var1;
            this.field_3148 += this.field_3155 * var1;
            this.field_3149 += this.field_3156 * var1;
            this.field_3162 += this.field_3163 * var1;
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k, boolean) void
   public void method_2457(class_236 var1, boolean var2) {
      Rect var3 = class_391.field_3193;
      RectF var4 = class_391.field_3192;
      if (this.field_3159 <= 0.0F) {
         if (!var2 || this.field_3149 >= 1.0F) {
            class_394 var5;
            if (this.field_3177 != null) {
               var5 = this.field_3177;
            } else {
               var5 = class_391.field_3195[this.field_3178];
            }

            if (!var5.field_3220) {
               int var6 = var5.field_3214 + this.field_3176 * var5.field_3216;
               int var7 = var5.field_3215;
               var3.method_1911(var6, var7, var6 + var5.field_3212, var7 + var5.field_3213);
            } else {
               var3.method_1911(0, 0, var5.field_3218.method_2128(), var5.field_3218.method_2127());
            }

            PointF var17;
            if (!var2) {
               var17 = class_296.method_2039(this.field_3147, this.field_3148, this.field_3149);
            } else {
               var17 = class_296.method_2039(this.field_3147, this.field_3148, 0.0F);
            }

            var4.method_1969(var17.field_2406, var17.field_2407, var17.field_2406 + (float)var3.method_1904(), var17.field_2407 + (float)var3.method_1905());
            if (this.field_3175) {
               var4.method_1972(-var4.method_1964() / 2.0F, -var4.method_1965() / 2.0F);
            }

            if (this.field_3119 != null) {
               var4.method_1972(this.field_3119.field_74, this.field_3119.field_75 - this.field_3119.field_76);
            }

            if (this.field_3132 && !this.field_3150 || class_296.method_2081(var1.field_1980, var4)) {
               float var8;
               float var18;
               if (!this.field_3122 && !this.field_3132 && !this.field_3123) {
                  var18 = var4.method_1966();
                  var8 = var4.method_1967();
                  if (!var1.field_1932.method_2577(var18, var8, var1.field_1915)) {
                     return;
                  }

                  this.field_3123 = true;
               }

               if (!this.field_3132) {
                  var4.method_1972(-var1.field_1965, -var1.field_1966);
               }

               if (this.field_3157 != 0.0F) {
                  var18 = class_296.method_2098((this.field_3161 - this.field_3160) / this.field_3158 * 360.0F) * this.field_3157;
                  var4.method_1972(0.0F, var18);
               }

               var18 = 1.0F;
               var8 = 1.0F;
               float var9 = 1.0F;
               float var10 = 1.0F;
               if (this.field_3141 != -1) {
                  var18 = (float)Color.method_3072(this.field_3141) * 0.003921569F;
                  var8 = (float)Color.method_3073(this.field_3141) * 0.003921569F;
                  var9 = (float)Color.method_3074(this.field_3141) * 0.003921569F;
                  var10 = (float)Color.method_3075(this.field_3141) * 0.003921569F;
               }

               float var11 = this.field_3161 - this.field_3160;
               if (this.field_3135 && var11 >= this.field_3137) {
                  var18 *= (this.field_3160 - this.field_3137) / this.field_3161 * this.field_3143;
               } else if (this.field_3136 && var11 < this.field_3137) {
                  var18 *= var11 / this.field_3137 * this.field_3143;
               } else {
                  var18 *= this.field_3143;
               }

               if (var18 > 1.0F) {
                  var18 = 1.0F;
               }

               if (var18 < 0.0F) {
                  var18 = 0.0F;
               }

               boolean var19 = false;
               if (this.field_3162 != 0.0F) {
                  if (!var19) {
                     var19 = true;
                     var1.field_1935.method_89();
                  }

                  var1.field_1935.method_91(this.field_3162 + 90.0F, var4.method_1966(), var4.method_1967());
               }

               if (this.field_3145 != 1.0F || this.field_3144 != 1.0F || this.field_3146) {
                  if (!var19) {
                     var19 = true;
                     var1.field_1935.method_89();
                  }

                  float var12 = class_296.method_2067(this.field_3145, this.field_3144, 1.0F - this.field_3160 / this.field_3161);
                  if (this.field_3146 && !this.field_3132) {
                     var12 *= 1.0F / var1.field_1988;
                     var12 *= var1.field_1955;
                  }

                  var1.field_1935.method_93(var12, var12, var4.method_1966(), var4.method_1967());
               }

               if (var2) {
                  var18 /= 3.0F;
                  var18 = class_296.method_2023(var18, 0.0F, 1.0F);
                  var8 = 0.0F;
                  var9 = 0.0F;
                  var10 = 0.0F;
               }

               if (this.field_3142 != null) {
                  if (!this.field_3184) {
                     this.field_3181.method_2796(this.field_3142);
                     this.field_3184 = true;
                  }
               } else if (this.field_3184) {
                  this.field_3181.method_2796((ColorFilter)null);
                  this.field_3184 = false;
               }

               int var13 = class_296.method_2083(255, (int)(var8 * 255.0F), (int)(var9 * 255.0F), (int)(var10 * 255.0F));
               Object var20;
               if (this.field_3142 == null && var13 == -1) {
                  var20 = this.method_2452(var18);
               } else {
                  var20 = this.field_3181;
                  float var14 = this.field_3182 - var18;
                  if (var14 < -0.01F || var14 > 0.01F || this.field_3183 != var13) {
                     this.field_3182 = var18;
                     this.field_3183 = var13;
                     int var15 = class_296.method_2083((int)(var18 * 255.0F), (int)(var8 * 255.0F), (int)(var9 * 255.0F), (int)(var10 * 255.0F));
                     this.field_3181.method_2788(var15);
                  }
               }

               if (this.field_3164 != null) {
                  Object var21 = var20;
                  if (this.field_3165 != null) {
                     var21 = this.field_3165;
                  }

                  float var22 = var4.method_1966() + this.field_3166;
                  float var16 = var4.method_1967() + this.field_3167;
                  var1.field_1935.method_78(this.field_3164, var22, var16, (Paint)var21);
               }

               if (this.field_3150) {
                  var17 = class_296.method_2039(this.field_3151, this.field_3152, this.field_3153);
                  var1.field_1935.method_96(var4.field_2416, var4.field_2417, var17.field_2406 - var1.field_1965, var17.field_2407 - var1.field_1966, this.field_3118.field_3199);
               } else if (var2) {
                  var1.field_1935.method_68(var5.field_3219, var3, var4, (Paint)var20);
               } else {
                  var1.field_1935.method_68(var5.field_3218, var3, var4, (Paint)var20);
               }

               if (var19) {
                  var1.field_1935.method_90();
               }

            }
         }
      }
   }

   static {
      for(int var0 = 0; var0 < field_3185.length; ++var0) {
         field_3185[var0] = new class_441();
         float var1 = (float)var0 / (float)field_3185.length - 1.0F;
         field_3185[var0].c((int)(var1 * 255.0F));
      }

   }
}
