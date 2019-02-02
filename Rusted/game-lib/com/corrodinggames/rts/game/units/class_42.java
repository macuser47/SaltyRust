package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.z
public class class_42 extends class_40 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_244 = new class_306[2];
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_245 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   class_306 field_246;
   // $FF: renamed from: d int
   int field_247;
   // $FF: renamed from: e int
   int field_248;
   // $FF: renamed from: f int
   int field_249 = 0;
   // $FF: renamed from: g float
   float field_250;
   // $FF: renamed from: h boolean
   boolean field_251;
   // $FF: renamed from: i float
   float field_252;
   // $FF: renamed from: j int
   int field_253 = 0;
   // $FF: renamed from: k int
   int field_254 = 0;
   // $FF: renamed from: l float
   float field_255 = 1.0F;
   // $FF: renamed from: m boolean
   boolean field_256 = false;
   // $FF: renamed from: n android.graphics.Rect
   Rect field_257 = new Rect();

   // $FF: renamed from: b () void
   public static void method_340() {
      class_236 var0 = class_236.method_1549();
      field_244[0] = var0.field_1935.method_60(R$drawable.palm_tree);
      field_244[1] = var0.field_1935.method_60(R$drawable.trees);
      field_245 = var0.field_1935.method_60(R$drawable.palm_leaves);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2541(this.field_247);
      var1.method_2541(this.field_249);
      var1.method_2542(this.field_250);
      var1.method_2540(this.field_251);
      var1.method_2542(this.field_252);
      var1.method_2539(2);
      var1.method_2542(this.field_255);
      var1.method_2541(this.field_248);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_175(class_463 var1) {
      this.field_247 = var1.method_3011();
      this.field_249 = var1.method_3011();
      this.field_250 = var1.method_3012();
      this.field_251 = var1.method_3010();
      this.field_252 = var1.method_3012();
      byte var2 = var1.method_3009();
      if (var2 >= 1) {
         this.field_255 = var1.method_3012();
      } else {
         this.field_255 = 1.0F;
      }

      if (var2 >= 2) {
         this.field_248 = var1.method_3011();
      } else {
         this.field_248 = 0;
      }

      this.method_342(this.field_247, this.field_248);
      super.a(var1);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_341() {
      return this.field_246;
   }

   // $FF: renamed from: e () boolean
   public boolean method_250() {
      this.method_344();
      return true;
   }

   public class_42(boolean var1) {
      super(var1);
      this.method_342(1, -1);
      this.by = 3.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 100.0F;
      this.bI = this.bJ;
      this.bv = -90.0F;
      this.I(3);
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_303(String var1) {
      int var3 = -1;
      String[] var4 = var1.split("\\.");
      if (var4.length != 0 && var4.length != 1) {
         if (var4.length != 2) {
            throw new RuntimeException("Tree sub unknown format with parts:" + var4.length);
         }

         var1 = var4[0];

         try {
            var3 = Integer.parseInt(var4[1]);
         } catch (NumberFormatException var7) {
            throw new RuntimeException("Tree sub type format error:" + var4[1]);
         }
      }

      int var2;
      try {
         var2 = Integer.parseInt(var1);
      } catch (NumberFormatException var6) {
         throw new RuntimeException("Tree type format error:" + var1);
      }

      this.method_342(var2, var3);
   }

   // $FF: renamed from: a (int, int) void
   public void method_342(int var1, int var2) {
      this.field_247 = var1;
      this.field_248 = var2;
      if (this.field_247 == 0) {
         this.J(27);
         this.K(41);
         this.field_253 = 1;
         this.field_254 = 1;
         this.field_246 = field_244[0];
      } else {
         if (this.field_247 != 1) {
            throw new RuntimeException("Tree type:" + this.field_247 + " is not supported");
         }

         if (var2 == -1) {
            var2 = class_296.method_2016(0, 4, (int)this.da);
         }

         if (var2 < 0 || var2 > 4) {
            throw new RuntimeException("Tree subType out of range:" + var2);
         }

         this.J(25);
         this.K(30);
         this.field_246 = field_244[1];
         this.field_253 = 0;
         this.field_254 = 30 * var2;
         if (var2 == 0) {
            this.field_255 = class_296.method_2015(1.0F, 1.2F, (int)this.da + 1);
         } else {
            this.field_255 = class_296.method_2015(1.0F, 2.0F, (int)this.da + 1);
         }

         this.field_256 = true;
      }

   }

   // $FF: renamed from: a (float) void
   public void method_176(float var1) {
      super.a(var1);
      if (this.field_251) {
         if (this.field_247 == 0 && this.field_249 < 4) {
            this.field_250 += var1;
            if (this.field_250 > 5.0F) {
               this.field_250 = 0.0F;
               ++this.field_249;
            }
         }
      } else if (this.field_247 == 0) {
         if (this.field_252 != 0.0F) {
            this.field_252 = class_296.method_2020(this.field_252, 0.1F * var1);
            this.field_249 = 2;
         } else if (this.field_249 > 1) {
            this.field_249 = 1;
         }
      }

   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public Rect method_299(boolean var1) {
      int var2 = this.field_253;
      int var3 = this.field_254;
      var2 += this.field_249 * (this.dl + 1);
      cH.method_1911(var2, var3, var2 + this.dl, var3 + this.dm);
      return cH;
   }

   // $FF: renamed from: c (float) boolean
   public boolean method_181(float var1) {
      class_306 var2 = this.method_341();
      class_236 var3 = class_236.method_1549();
      if (!this.bt()) {
         return false;
      } else if ((double)var3.field_1988 < 0.15D) {
         return false;
      } else {
         cA.method_1970(this.bL());
         cA.method_1972(0.0F, (float)((int)(-this.dj)));
         float var4 = cA.method_1966();
         float var5 = cA.method_1967();
         cB.method_1912(this.method_299(false));
         var3.field_1935.method_89();
         if (this.field_255 != 1.0F) {
            var3.field_1935.method_93(this.field_255, this.field_255, var4, var5);
         }

         if (this.field_256) {
            cB.method_1913(this.dl, 0);
            var3.field_1935.method_68(var2, cB, cA, (Paint)null);
            cB.method_1913(-this.dl, 0);
         }

         var3.field_1935.method_91(this.d(false), var4, var5);
         var3.field_1935.method_68(var2, cB, cA, (Paint)null);
         var3.field_1935.method_90();
         return true;
      }
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public class_503 method_279() {
      return class_503.field_4617;
   }

   // $FF: renamed from: i () boolean
   public boolean method_280() {
      return false;
   }

   // $FF: renamed from: H () boolean
   public boolean method_282() {
      return false;
   }

   // $FF: renamed from: X () boolean
   public boolean method_283() {
      return false;
   }

   // $FF: renamed from: Y () boolean
   public boolean method_284() {
      return false;
   }

   // $FF: renamed from: o_ () boolean
   public boolean method_288() {
      return true;
   }

   // $FF: renamed from: c_ () boolean
   public boolean method_242() {
      return false;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.game.units.ao
   public class_469 method_343() {
      return class_469.field_4059;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float) boolean
   public boolean method_302(class_39 var1, float var2) {
      if (!this.field_251) {
         if (this.field_252 == 0.0F) {
         }

         this.bI -= var1.method_220() / 3000.0F * this.bJ * 0.06F * var2;
         this.field_252 = 1.0F;
         this.cv = 1000.0F;
         if (this.bI <= 0.0F) {
            float var3 = class_296.method_2031(this.dh, this.di, var1.dh, var1.di) + 180.0F;
            this.bv = var3;
            this.method_344();
         }

         if (!this.field_251) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: f () void
   public void method_344() {
      if (!this.field_251) {
         class_236 var1 = class_236.method_1549();
         this.field_249 = 2;
         this.field_250 = 0.0F;
         this.I(0);
         this.bh = false;
         this.bi = true;
         this.bj = (long)var1.field_1921;
         this.field_251 = true;
         this.field_256 = false;

         for(int var2 = 0; var2 < 1; ++var2) {
            var1.field_1938.method_2486();
            class_390 var3 = var1.field_1938.method_2488(this.dh + class_296.method_2033(-12.0F, 12.0F), this.di + class_296.method_2033(-12.0F, 12.0F), this.dj, class_393.field_3201, false, class_395.field_3223);
            if (var3 != null) {
               var3.field_3178 = 9;
               var3.field_3176 = class_296.method_2036(4, 5);
               var3.field_3162 = class_296.method_2033(-180.0F, 180.0F);
               var3.field_3175 = true;
               var3.field_3149 = 5.0F + class_296.method_2033(0.0F, 3.0F);
               var3.field_3154 = class_296.method_2033(-0.05F, 0.05F) + class_296.method_2099(this.bv) * 0.4F;
               var3.field_3155 = class_296.method_2033(-0.05F, 0.05F) + class_296.method_2098(this.bv) * 0.4F;
               var3.field_3139 = true;
               var3.field_3140 = 0.2F;
               var3.field_3145 = 0.4F * this.field_255;
               var3.field_3144 = 0.4F * this.field_255;
               var3.field_3160 = (float)(90 + class_296.method_2036(0, 40));
               var3.field_3161 = var3.field_3160;
               var3.field_3135 = true;
               var3.field_3179 = 2;
            }
         }

         float var8 = this.dh + class_296.method_2099(this.bv) * (float)(this.dm - 5);
         float var9 = this.di + class_296.method_2098(this.bv) * (float)(this.dm - 5);
         boolean var4 = true;

         for(int var5 = 0; var5 < 1; ++var5) {
            byte var6 = 17;
            var1.field_1938.method_2486();
            class_390 var7 = var1.field_1938.method_2488(var8 + class_296.method_2033((float)(-var6), (float)var6), var9 + class_296.method_2033((float)(-var6), (float)var6), this.dj, class_393.field_3201, false, class_395.field_3223);
            if (var7 != null) {
               var7.field_3178 = 9;
               var7.field_3176 = class_296.method_2036(4, 5);
               if (var4) {
                  var4 = false;
                  var7.field_3176 = 3;
               }

               var7.field_3162 = class_296.method_2033(-180.0F, 180.0F);
               var7.field_3175 = true;
               if (var7.field_3176 == 3) {
                  var7.field_3154 = class_296.method_2033(-0.05F, 0.05F);
                  var7.field_3155 = class_296.method_2033(-0.05F, 0.05F);
                  var7.field_3145 = 1.5F * this.field_255;
                  var7.field_3144 = 2.2F * this.field_255;
                  var7.field_3160 = (float)(90 + class_296.method_2036(0, 40));
                  var7.field_3179 = 2;
               } else {
                  var7.field_3154 = class_296.method_2033(-0.05F, 0.05F);
                  var7.field_3155 = class_296.method_2033(-0.05F, 0.0F);
                  var7.field_3145 = 1.3F;
                  var7.field_3144 = 1.3F;
                  var7.field_3160 = (float)(60 + class_296.method_2036(0, 40));
                  var7.field_3179 = 1;
               }

               var7.field_3161 = var7.field_3160;
               var7.field_3135 = true;
            }
         }

         if (this.field_247 == 1) {
            this.dh += class_296.method_2099(this.bv) * (float)(this.dm / 2 - 3);
            this.di += class_296.method_2098(this.bv) * (float)(this.dm / 2 - 3);
         }
      }

   }

   // $FF: renamed from: n () void
   public void method_249() {
      super.n();
      this.bv = class_296.method_2029(this.di * 5.0F + this.dh * 3.0F, false);
      if (this.field_247 == 0) {
         this.field_249 = (int)(this.di * 5.0F + this.dh * 3.0F) % 1;
      }

      if (this.field_247 == 1) {
      }

   }

   // $FF: renamed from: q () float
   public float method_229() {
      return -1.0F;
   }

   // $FF: renamed from: l () boolean
   public boolean method_312() {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public float method_246(class_39 var1, float var2, class_97 var3) {
      boolean var4 = this.bi;
      float var5 = super.a(var1, var2, var3);
      if (!var4 && this.bi && var3 != null) {
         float var6 = class_296.method_2031(this.dh, this.di, var3.dh, var3.di) + 180.0F;
         this.bv = var6;
      }

      return var5;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_343();
   }
}
