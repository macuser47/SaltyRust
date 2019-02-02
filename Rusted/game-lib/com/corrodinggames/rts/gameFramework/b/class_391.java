package com.corrodinggames.rts.gameFramework.b;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.b.c
public final class class_391 {
   // $FF: renamed from: a int
   public int field_3186 = 0;
   // $FF: renamed from: b int
   public int field_3187 = 80;
   // $FF: renamed from: c int
   public int field_3188 = 100;
   // $FF: renamed from: d int
   public int field_3189 = 110;
   // $FF: renamed from: e int
   public int field_3190 = 120;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.b.e[]
   public static class_390[] field_3191 = new class_390[130];
   // $FF: renamed from: g android.graphics.RectF
   public static RectF field_3192 = new RectF();
   // $FF: renamed from: h android.graphics.Rect
   public static Rect field_3193 = new Rect();
   // $FF: renamed from: i android.graphics.Paint
   public static Paint field_3194 = new Paint();
   // $FF: renamed from: j com.corrodinggames.rts.gameFramework.b.g[]
   public static class_394[] field_3195;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.b.h
   class_395 field_3196 = null;
   // $FF: renamed from: l boolean
   boolean field_3197 = false;
   // $FF: renamed from: m boolean
   boolean field_3198 = false;
   // $FF: renamed from: n android.graphics.Paint
   public Paint field_3199 = new Paint();
   // $FF: renamed from: o float
   float field_3200 = 0.0F;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.b.h) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2458(class_395 var1) {
      if (var1 == class_395.field_3221 && this.field_3186 > this.field_3187) {
         return null;
      } else if (var1 == class_395.field_3222 && this.field_3186 > this.field_3188) {
         return null;
      } else if (var1 == class_395.field_3223 && this.field_3186 > this.field_3189) {
         return null;
      } else if (var1 == class_395.field_3224 && this.field_3186 > this.field_3190) {
         return null;
      } else {
         class_390 var2 = null;
         var2 = this.method_2459(true, (class_395)null);
         if (var2 == null && (var1 == class_395.field_3225 || var1 == class_395.field_3224)) {
            var2 = this.method_2459(false, class_395.field_3223);
         }

         if (var2 != null) {
            var2.field_3133 = true;
            ++this.field_3186;
            return var2;
         } else {
            return null;
         }
      }
   }

   // $FF: renamed from: a (boolean, com.corrodinggames.rts.gameFramework.b.h) com.corrodinggames.rts.gameFramework.b.e
   private class_390 method_2459(boolean var1, class_395 var2) {
      for(int var3 = 0; var3 < field_3191.length; ++var3) {
         class_390 var4 = field_3191[var3];
         if ((!var1 || !var4.field_3133) && (var2 == null || var4.field_3134.method_2498(var2))) {
            return var4;
         }
      }

      return null;
   }

   // $FF: renamed from: a (float, float, float) void
   public void method_2460(float var1, float var2, float var3) {
      this.method_2461(var1, var2, var3, 0.0F, 20.0F);
   }

   // $FF: renamed from: a (float, float, float, float, float) void
   public void method_2461(float var1, float var2, float var3, float var4, float var5) {
      for(int var6 = 0; var6 < 7; ++var6) {
         class_390 var7 = this.method_2463(var1 + class_296.method_2033(-20.0F, 20.0F), var2 + class_296.method_2033(-20.0F, 20.0F), var3);
         if (var7 != null) {
            var7.field_3159 = var4 + class_296.method_2033(0.0F, var5);
            var7.field_3172 = class_296.method_2033(0.3F, 0.6F);
         }
      }

   }

   // $FF: renamed from: a (float, float) float
   public float method_2462(float var1, float var2) {
      return class_296.method_2033(var1, var2);
   }

   // $FF: renamed from: b (float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2463(float var1, float var2, float var3) {
      this.method_2486();
      class_390 var4 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3223);
      if (var4 != null) {
         var4.field_3178 = 1;
         var4.field_3168 = true;
         var4.field_3173 = 0.0F;
         var4.field_3172 = 0.5F;
         var4.field_3170 = 12;
         var4.field_3176 = 0;
         var4.field_3160 = 35.0F;
         var4.field_3161 = var4.field_3160 - 10.0F;
         var4.field_3135 = true;
         var4.field_3143 = 0.7F;
         var4.field_3162 = this.method_2462(-180.0F, 180.0F);
         float var5 = this.method_2462(0.8F, 1.0F);
         var4.field_3145 = var5;
         var4.field_3144 = var5;
      }

      return var4;
   }

   // $FF: renamed from: c (float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2464(float var1, float var2, float var3) {
      this.method_2486();
      class_390 var4 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3223);
      if (var4 != null) {
         var4.field_3178 = 13;
         var4.field_3168 = true;
         var4.field_3173 = 3.0F;
         var4.field_3172 = 0.5F;
         var4.field_3170 = 7;
         var4.field_3176 = 0;
         var4.field_3160 = 35.0F;
         var4.field_3161 = var4.field_3160 - 10.0F;
         var4.field_3135 = true;
         var4.field_3143 = 1.0F;
         var4.field_3145 = 0.5F;
         var4.field_3144 = 0.5F;
      }

      return var4;
   }

   // $FF: renamed from: a (float, float, float, float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2465(float var1, float var2, float var3, float var4, float var5, float var6) {
      class_236 var7 = class_236.method_1549();
      if (!var7.field_1932.method_2577(var1, var2, var7.field_1915) && !var7.field_1932.method_2577(var4, var5, var7.field_1915)) {
         return null;
      } else {
         class_390 var8 = this.method_2488(var1, var2, var3, class_393.field_3201, true, class_395.field_3223);
         if (var8 != null) {
            var8.field_3175 = false;
            var8.field_3160 = 5.0F;
            var8.field_3161 = var8.field_3160;
            var8.field_3135 = true;
            var8.field_3143 = 1.0F;
            var8.field_3150 = true;
            var8.field_3151 = var4;
            var8.field_3152 = var5;
            var8.field_3153 = var6;
         }

         return var8;
      }
   }

   // $FF: renamed from: a (float, float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2466(float var1, float var2, float var3, float var4) {
      return this.method_2467(var1, var2, var3, var4, 0);
   }

   // $FF: renamed from: a (float, float, float, float, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2467(float var1, float var2, float var3, float var4, int var5) {
      return this.method_2469(var1, var2, var3, var4, var5, 0);
   }

   // $FF: renamed from: b (float, float, float, float, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2468(float var1, float var2, float var3, float var4, int var5) {
      return this.method_2469(var1, var2, var3, var4, var5, 1);
   }

   // $FF: renamed from: a (float, float, float, float, int, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2469(float var1, float var2, float var3, float var4, int var5, int var6) {
      this.method_2486();
      class_390 var7 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3223);
      if (var7 != null) {
         var7.field_3124 = class_390.field_3127;
         var7.field_3168 = true;
         if (var6 == 1) {
            var7.field_3178 = 3;
            var7.field_3173 = 1.0F;
            var7.field_3172 = 0.4F;
            var7.field_3170 = 4;
         } else {
            var7.field_3178 = 3;
            var7.field_3173 = 0.0F;
            var7.field_3172 = 0.5F;
            var7.field_3170 = 3;
         }

         var7.field_3162 = var4;
         var7.field_3176 = 0;
         var7.field_3160 = 20.0F;
         var7.field_3161 = var7.field_3160;
         var7.field_3135 = false;
         if (var5 != 0) {
            var7.field_3142 = new LightingColorFilter(var5, 0);
         }
      }

      return var7;
   }

   // $FF: renamed from: c (float, float, float, float, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2470(float var1, float var2, float var3, float var4, int var5) {
      class_390 var6 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3221);
      if (var6 != null) {
         var6.field_3178 = 4;
         var6.field_3124 = class_390.field_3126;
         var6.field_3176 = class_296.method_2036(0, 2);
         var6.field_3162 = var4;
         var6.field_3175 = true;
         var6.field_3154 = class_296.method_2099(var4) * 0.2F;
         var6.field_3155 = class_296.method_2098(var4) * 0.2F;
         var6.field_3160 = 30.0F;
         var6.field_3161 = var6.field_3160;
         var6.field_3135 = true;
         var6.field_3179 = 1;
         var6.field_3145 = 0.7F;
         var6.field_3144 = 1.8F;
         if (var5 != 0) {
            var6.field_3142 = new LightingColorFilter(var5, 0);
         }
      }

      return var6;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.b.e, com.corrodinggames.rts.gameFramework.u) void
   public static void method_2471(class_390 var0, class_34 var1) {
      if (var0 != null) {
         var0.field_3119 = var1;
         var0.field_3147 -= var1.field_74;
         var0.field_3148 -= var1.field_75;
         var0.field_3149 -= var1.field_76;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.u, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2472(class_34 var1, int var2) {
      return this.method_2473(var1, var2, 0.5F);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.u, int, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2473(class_34 var1, int var2, float var3) {
      this.method_2487();
      class_390 var4 = this.method_2475(var1.field_74, var1.field_75, var1.field_76, var2);
      if (var4 != null) {
         var4.field_3147 = 0.0F;
         var4.field_3148 = 0.0F;
         var4.field_3149 = 0.0F;
         var4.field_3160 = 400.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3143 = 0.3F;
         var4.field_3145 = var3;
         var4.field_3119 = var1;
      }

      return var4;
   }

   // $FF: renamed from: a (float, float, float, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2474(float var1, float var2, float var3, int var4) {
      if (this.field_3196 == null && !this.field_3198) {
         this.method_2486();
      }

      return this.method_2475(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (float, float, float, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2475(float var1, float var2, float var3, int var4) {
      class_390 var5 = this.method_2488(var1, var2, var3, class_393.field_3201, true, class_395.field_3222);
      if (var5 != null) {
         var5.field_3122 = false;
         var5.field_3124 = class_390.field_3125;
         var5.field_3178 = 2;
         var5.field_3160 = 10.0F;
         var5.field_3161 = var5.field_3160;
         var5.field_3135 = true;
         var5.field_3143 = 0.5F;
         var5.field_3179 = 2;
         if (var4 != 0) {
            var5.field_3142 = new LightingColorFilter(var4, 0);
         }
      }

      return var5;
   }

   // $FF: renamed from: b (float, float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2476(float var1, float var2, float var3, float var4) {
      this.method_2486();
      class_390 var5 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3222);
      if (var5 != null) {
         var5.field_3124 = class_390.field_3129;
         var5.field_3178 = 0;
         var5.field_3176 = 13;
         var5.field_3179 = 1;
         var5.field_3135 = true;
         var5.field_3143 = 0.8F;
         var5.field_3161 = 80.0F;
         var5.field_3160 = var5.field_3161;
         var5.field_3162 = class_296.method_2033(-180.0F, 180.0F);
         var5.field_3145 = class_296.method_2033(0.6F, 0.8F);
         var5.field_3144 = 1.5F;
         var5.field_3154 = class_296.method_2099(var4) * 0.13F * class_296.method_2033(1.0F, 1.5F) + class_296.method_2033(-0.01F, 0.01F);
         var5.field_3155 = class_296.method_2098(var4) * 0.13F * class_296.method_2033(1.0F, 1.5F) + class_296.method_2033(-0.01F, 0.01F);
      }

      return var5;
   }

   // $FF: renamed from: a (float, float, float, int, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2477(float var1, float var2, float var3, int var4, float var5, float var6) {
      class_390 var7 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3223);
      if (var7 != null) {
         var7.field_3124 = class_390.field_3129;
         var7.field_3178 = 6;
         var7.field_3160 = 120.0F;
         var7.field_3161 = var7.field_3160;
         var7.field_3135 = true;
         var7.field_3145 = 0.2F;
         var7.field_3144 = 0.9F;
         var7.field_3179 = 1;
         var7.field_3143 = 0.5F;
         var7.field_3154 = var5;
         var7.field_3155 = var6;
         if (var4 != 0) {
            var4 = Color.method_3077(255, 0, 0, 200);
         }

         if (var4 != 0) {
            var7.field_3142 = new LightingColorFilter(var4, 0);
         }
      }

      return var7;
   }

   // $FF: renamed from: a (float, float, float, int, float, float, float) void
   public void method_2478(float var1, float var2, float var3, int var4, float var5, float var6, float var7) {
      this.method_2477(var1, var2, 0.0F, 0, 0.0F, 0.0F);

      for(int var8 = -180; var8 < 180; var8 += 45) {
         float var9 = var7 + (float)var8;
         float var10 = var1 + class_296.method_2099(var9) * -5.0F;
         float var11 = var2 + class_296.method_2098(var9) * -5.0F;
         class_390 var12 = this.method_2476(var10, var11, 0.0F, var9);
         if (var12 != null) {
            var12.field_3179 = 2;
            var12.field_3136 = true;
            var12.field_3137 = 7.0F;
         }
      }

   }

   // $FF: renamed from: c (float, float, float, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2479(float var1, float var2, float var3, int var4) {
      class_390 var5 = this.method_2480(var1, var2, var3, var4);
      if (var5 != null) {
         var5.field_3178 = 11;
      }

      return var5;
   }

   // $FF: renamed from: d (float, float, float, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2480(float var1, float var2, float var3, int var4) {
      this.method_2486();
      class_390 var5 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3223);
      if (var5 != null) {
         var5.field_3178 = 6;
         var5.field_3160 = 30.0F;
         var5.field_3161 = var5.field_3160;
         var5.field_3135 = true;
         var5.field_3145 = 0.2F;
         var5.field_3144 = 1.3F;
         var5.field_3179 = 1;
         if (var4 != 0) {
            var5.field_3142 = new LightingColorFilter(var4, 0);
         }
      }

      return var5;
   }

   // $FF: renamed from: d (float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2481(float var1, float var2, float var3) {
      class_390 var4 = this.method_2483(var1, var2, var3, 0.3F, 0.7F);
      if (var4 != null) {
         var4.field_3178 = 14;
         var4.field_3176 = class_296.method_2036(0, 5);
         var4.field_3140 = 0.5F;
      }

      return var4;
   }

   // $FF: renamed from: e (float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2482(float var1, float var2, float var3) {
      class_390 var4 = this.method_2483(var1, var2, var3, 1.0F, 1.0F);
      if (var4 != null) {
      }

      return var4;
   }

   // $FF: renamed from: b (float, float, float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2483(float var1, float var2, float var3, float var4, float var5) {
      this.method_2487();
      class_390 var6 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3223);
      if (var6 != null) {
         var6.field_3124 = class_390.field_3130;
         var6.field_3178 = 12;
         var6.field_3176 = class_296.method_2036(0, 7);
         var6.field_3160 = class_296.method_2033(400.0F, 800.0F);
         var6.field_3161 = var6.field_3160 - 150.0F;
         var6.field_3135 = true;
         float var7 = class_296.method_2033(0.6F, 1.0F);
         var6.field_3145 = var7;
         var6.field_3144 = var7;
         var6.field_3179 = 2;
         var6.field_3139 = true;
         var6.field_3180 = true;
         float var8 = class_296.method_2033(-180.0F, 180.0F);
         float var9 = class_296.method_2033(0.4F, 1.2F) * var4;
         var6.field_3154 = class_296.method_2099(var8) * var9;
         var6.field_3155 = class_296.method_2098(var8) * var9;
         var6.field_3156 = class_296.method_2033(0.6F, 2.7F) * var5;
         var6.field_3162 = class_296.method_2033(-180.0F, 180.0F);
         ++var6.field_3149;
      }

      return var6;
   }

   // $FF: renamed from: f (float, float, float) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2484(float var1, float var2, float var3) {
      class_390 var4 = this.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3222);
      if (var4 != null) {
         var4.field_3178 = 8;
         var4.field_3160 = 480.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3135 = false;
         var4.field_3179 = 1;
         var4.field_3168 = true;
         var4.field_3173 = 0.0F;
         var4.field_3145 = 0.5F;
         var4.field_3145 = 1.0F;
         int var5 = class_296.method_2036(0, 100);
         if (var5 > 80) {
            var4.field_3172 = class_296.method_2033(0.1F, 0.15F);
            var4.field_3170 = 15;
         } else if (var5 > 60) {
            var4.field_3172 = class_296.method_2033(0.06F, 0.16F);
            var4.field_3171 = true;
            var4.field_3170 = 6;
            var4.field_3135 = true;
         } else {
            var4.field_3172 = class_296.method_2033(0.06F, 0.16F);
            var4.field_3171 = true;
            var4.field_3170 = 3;
            var4.field_3135 = true;
         }
      }

      return var4;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.b.h) void
   public void method_2485(class_395 var1) {
      this.field_3196 = var1;
   }

   // $FF: renamed from: a () void
   public void method_2486() {
      this.field_3197 = true;
   }

   // $FF: renamed from: b () void
   public void method_2487() {
      this.field_3198 = true;
   }

   // $FF: renamed from: a (float, float, float, com.corrodinggames.rts.gameFramework.b.d, boolean, com.corrodinggames.rts.gameFramework.b.h) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_2488(float var1, float var2, float var3, class_393 var4, boolean var5, class_395 var6) {
      class_236 var7 = class_236.method_1549();
      if (this.field_3196 != null) {
         var6 = this.field_3196;
         this.field_3196 = null;
      }

      boolean var8 = this.field_3198;
      this.field_3198 = false;
      if (this.field_3197) {
         this.field_3197 = false;
         if (!var7.field_1981.method_1973(var1, var2)) {
            return null;
         }
      }

      if (!var5 && var7.field_1932 != null && !var7.field_1932.method_2577(var1, var2, var7.field_1915)) {
         return null;
      } else {
         if (var7.field_1980.method_1914((int)var1, (int)var2)) {
            if (var6 == class_395.field_3221) {
               var6 = class_395.field_3222;
            } else if (var6 == class_395.field_3222) {
               var6 = class_395.field_3223;
            } else if (var6 == class_395.field_3223) {
               var6 = class_395.field_3224;
            }
         } else if (!var8 && !var7.field_1981.method_1973(var1, var2)) {
         }

         class_390 var9 = this.method_2458(var6);
         if (var9 == null) {
            return null;
         } else {
            var9.method_2454();
            var9.field_3134 = var6;
            var9.field_3178 = 0;
            var9.field_3175 = true;
            var9.field_3147 = var1;
            var9.field_3148 = var2;
            var9.field_3149 = var3;
            var9.field_3143 = 1.0F;
            if (var4 == class_393.field_3204 || var4 == class_393.field_3205 || var4 == class_393.field_3206) {
               var9.field_3176 = 7;
               var9.field_3160 = 12.0F;
               var9.field_3135 = true;
               var9.field_3155 = -0.3F;
               var9.field_3143 = 0.7F;
               if (var4 == class_393.field_3206) {
                  var9.field_3176 = 3;
                  var9.field_3155 = -0.7F;
                  var9.field_3160 = 24.0F;
                  var9.field_3143 = 0.7F;
               }

               if (var4 == class_393.field_3205) {
                  var9.field_3176 = 4;
                  var9.field_3160 = 15.0F;
                  var9.field_3143 = 0.4F;
               }
            }

            if (var4 == class_393.field_3203) {
               var9.field_3176 = 1;
               var9.field_3160 = 25.0F;
               var9.field_3135 = true;
            }

            if (var4 == class_393.field_3207) {
               var9.field_3176 = 5;
               var9.field_3160 = 42.0F;
               var9.field_3135 = true;
               var9.field_3155 = 0.1F;
               var9.field_3143 = 2.0F;
            }

            if (var4 == class_393.field_3208) {
               var9.field_3176 = 6;
               var9.field_3160 = 39.0F;
               var9.field_3135 = true;
               var9.field_3155 = 0.1F;
               var9.field_3143 = 2.0F;
            }

            if (var4 == class_393.field_3209) {
               var9.field_3176 = 14;
               var9.field_3160 = 39.0F;
               var9.field_3135 = true;
               var9.field_3155 = 0.1F;
               var9.field_3143 = 0.7F;
            }

            var9.field_3161 = var9.field_3160;
            return var9;
         }
      }
   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_2489(Context var1) {
      class_236 var2 = class_236.method_1549();
      this.field_3199.method_2791(130, 200, 0, 0);
      this.field_3199.method_2781(true);
      this.field_3199.method_2793(2.0F);
      this.field_3199.method_2794(Paint$Cap.field_1808);
      if (class_236.field_1900) {
         this.field_3199.method_2793(3.0F);
      }

      field_3195 = new class_394[17];
      class_394 var3 = new class_394();
      var3.field_3212 = 25;
      var3.field_3213 = 25;
      var3.field_3214 = 1;
      var3.field_3215 = 1;
      var3.field_3216 = 26;
      var3.field_3217 = 26;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.effects, true);
      var3.field_3211 = "effects";
      var3.method_2497();
      field_3195[0] = var3;
      var3 = new class_394();
      var3.field_3212 = 39;
      var3.field_3213 = 40;
      var3.field_3214 = 1;
      var3.field_3215 = 1;
      var3.field_3216 = 40;
      var3.field_3217 = 41;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.explode_big, true);
      var3.field_3211 = "explode_big";
      field_3195[1] = var3;
      var3 = new class_394();
      var3.field_3220 = true;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.light_50, true);
      var3.field_3211 = "light_50";
      field_3195[2] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 25;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = 20;
      var3.field_3217 = 25;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.flame, true);
      var3.field_3211 = "flame";
      field_3195[3] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 25;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.dust, true);
      var3.field_3211 = "dust";
      field_3195[4] = var3;
      var3 = new class_394();
      var3.field_3212 = 50;
      var3.field_3213 = 40;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.smoke_black, true);
      var3.field_3211 = "smoke_black";
      var3.method_2497();
      field_3195[5] = var3;
      var3 = new class_394();
      var3.field_3212 = 50;
      var3.field_3213 = 50;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.shockwave, true);
      var3.field_3211 = "shockwave";
      field_3195[6] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 20;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.fire, true);
      var3.field_3211 = "fire";
      field_3195[7] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 30;
      var3.field_3216 = var3.field_3212 + 2;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.lava_bubble, true);
      var3.field_3211 = "lava_bubble";
      field_3195[8] = var3;
      var3 = new class_394();
      var3.field_3212 = 28;
      var3.field_3213 = 28;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212 + 1;
      var3.field_3217 = var3.field_3213 + 1;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.effects2, true);
      var3.field_3211 = "effects2";
      field_3195[9] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 25;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = 20;
      var3.field_3217 = 25;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.plasma_shot, true);
      var3.field_3211 = "plasma_shot";
      field_3195[10] = var3;
      var3 = new class_394();
      var3.field_3212 = 104;
      var3.field_3213 = 104;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.shockwave_large, true);
      var3.field_3211 = "shockwave_large";
      field_3195[11] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 20;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.explode_bits, true);
      var3.field_3211 = "explode_bits";
      var3.method_2497();
      field_3195[12] = var3;
      var3 = new class_394();
      var3.field_3212 = 39;
      var3.field_3213 = 40;
      var3.field_3214 = 1;
      var3.field_3215 = 1;
      var3.field_3216 = 40;
      var3.field_3217 = 41;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.explode_big2, true);
      var3.field_3211 = "explode_big2";
      field_3195[13] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 20;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.explode_bits_bug, true);
      var3.field_3211 = "explode_bits_bug";
      var3.method_2497();
      field_3195[14] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 20;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.projectiles, true);
      var3.field_3211 = "projectiles";
      var3.method_2497();
      field_3195[15] = var3;
      var3 = new class_394();
      var3.field_3212 = 20;
      var3.field_3213 = 20;
      var3.field_3214 = 0;
      var3.field_3215 = 0;
      var3.field_3216 = var3.field_3212;
      var3.field_3217 = var3.field_3213;
      var3.field_3218 = var2.field_1935.method_61(R$drawable.projectiles2, true);
      var3.field_3211 = "projectiles2";
      var3.method_2497();
      field_3195[16] = var3;
      int var4;
      if (class_236.field_1900) {
         field_3191 = new class_390[260];
         var4 = field_3191.length;
         this.field_3187 = var4 - 60;
         this.field_3188 = var4 - 30;
         this.field_3189 = var4 - 20;
         this.field_3190 = var4 - 10;
      }

      for(var4 = 0; var4 < field_3191.length; ++var4) {
         field_3191[var4] = new class_390(this);
      }

   }

   // $FF: renamed from: a (java.lang.String) int
   public int method_2490(String var1) {
      for(int var2 = 0; var2 < field_3195.length; ++var2) {
         if (field_3195[var2] != null) {
            if (field_3195[var2].field_3211 != null && field_3195[var2].field_3211.equalsIgnoreCase(var1)) {
               return var2;
            }

            if (("" + var2).equals(var1)) {
               return var2;
            }
         }
      }

      return -1;
   }

   // $FF: renamed from: a (float) void
   public void method_2491(float var1) {
      class_236 var2 = class_236.method_1549();

      int var3;
      for(var3 = 0; var3 < field_3191.length; ++var3) {
         class_390 var4 = field_3191[var3];
         if (var4.field_3133) {
            var4.method_2456(var1);
         }
      }

      this.field_3200 += var1;
      if (this.field_3200 > 10.0F) {
         this.field_3200 = 0.0F;
         var3 = var2.field_1963 + class_296.method_2036(0, (int)var2.field_1969);
         int var8 = var2.field_1964 + class_296.method_2036(0, (int)var2.field_1970);
         var2.field_1932.method_2578((float)var3, (float)var8);
         int var5 = var2.field_1932.field_3355;
         int var6 = var2.field_1932.field_3356;
         class_416 var7 = var2.field_1932.method_2586(var5, var6);
         if (var7 != null && var7.field_3426 && !var7.field_3427) {
            var2.field_1932.method_2579(var5, var6);
            this.method_2484((float)(var2.field_1932.field_3355 + 10), (float)(var2.field_1932.field_3356 - 10 + 10), 0.0F);
         }
      }

   }

   // $FF: renamed from: a (float, int) void
   public void method_2492(float var1, int var2) {
      class_236 var3 = class_236.method_1549();
      int var4;
      class_390 var5;
      if (var2 == 1) {
         for(var4 = 0; var4 < field_3191.length; ++var4) {
            var5 = field_3191[var4];
            if (var5.field_3133 && !var5.field_3132 && var5.field_3180) {
               var5.method_2457(var3, true);
            }
         }
      }

      for(var4 = 0; var4 < field_3191.length; ++var4) {
         var5 = field_3191[var4];
         if (var5.field_3133 && !var5.field_3132 && var5.field_3179 == var2) {
            var5.method_2457(var3, false);
         }
      }

   }

   // $FF: renamed from: b (float) void
   public void method_2493(float var1) {
      class_236 var2 = class_236.method_1549();

      for(int var3 = 0; var3 < field_3191.length; ++var3) {
         class_390 var4 = field_3191[var3];
         if (var4.field_3133 && var4.field_3132) {
            var4.method_2457(var2, false);
         }
      }

   }

   // $FF: renamed from: c () void
   public void method_2494() {
      for(int var1 = 0; var1 < field_3191.length; ++var1) {
         class_390 var2 = field_3191[var1];
         if (var2.field_3133) {
            var2.field_3133 = false;
            --this.field_3186;
         }
      }

   }
}
