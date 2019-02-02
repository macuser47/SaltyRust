package com.corrodinggames.rts.game.units.b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.e.class_93;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.b.c
public class class_75 extends class_73 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_625 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_626 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_627 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_628 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_629 = new class_306[10];
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_630 = new class_306[10];
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_631 = new class_306[10];
   // $FF: renamed from: o com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_632 = null;
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_633 = null;
   // $FF: renamed from: q float
   float field_634;
   // $FF: renamed from: r boolean
   boolean field_635 = true;
   // $FF: renamed from: s boolean
   boolean field_636 = true;
   // $FF: renamed from: t float
   float field_637 = 0.0F;
   // $FF: renamed from: u float
   float field_638 = 0.0F;
   // $FF: renamed from: v android.graphics.Paint
   protected Paint field_639 = new class_441();
   // $FF: renamed from: w android.graphics.PointF
   PointF field_640 = new PointF();
   // $FF: renamed from: x android.graphics.Rect
   Rect field_641 = new Rect();
   // $FF: renamed from: y com.corrodinggames.rts.game.units.a.l
   public static final class_121 field_642 = new c$1(151);
   // $FF: renamed from: z com.corrodinggames.rts.game.units.a.l
   public static final class_121 field_643 = new c$2(152);
   // $FF: renamed from: A java.util.ArrayList
   static ArrayList field_644 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2540(this.field_635);
      var1.method_2542(this.field_637);
      var1.method_2542(this.field_638);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_635 = var1.method_3010();
      this.field_636 = !this.method_282();
      if (var1.method_3006() >= 21) {
         this.field_637 = var1.method_3012();
      }

      if (var1.method_3006() >= 22) {
         this.field_638 = var1.method_3012();
      }

      this.method_631();
      super.method_175(var1);
   }

   // $FF: renamed from: H () boolean
   public strictfp boolean method_282() {
      return this.dj < -1.0F;
   }

   // $FF: renamed from: b () boolean
   public strictfp boolean method_626() {
      return !this.field_635 || this.dj < 0.0F;
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_279() {
      if (this.bD) {
         return class_503.field_4620;
      } else {
         return this.method_626() ? class_503.field_4621 : class_503.field_4620;
      }
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_627() {
      return class_469.field_4071;
   }

   // $FF: renamed from: cd () void
   public static strictfp void method_628() {
      class_236 var0 = class_236.method_1549();
      field_626 = var0.field_1935.method_60(R$drawable.amphibious_jet);
      field_627 = var0.field_1935.method_60(R$drawable.amphibious_jet_shadow);
      field_625 = var0.field_1935.method_60(R$drawable.amphibious_jet_dead);
      field_629 = class_107.method_948(field_626);
      class_306 var1 = var0.field_1935.method_60(R$drawable.amphibious_jet_p1);
      class_306 var2 = var0.field_1935.method_60(R$drawable.amphibious_jet_p2);
      field_630 = class_107.method_948(var1);
      field_631 = class_107.method_948(var2);
      field_632 = a(var1);
      field_633 = a(var2);
   }

   // $FF: renamed from: au () boolean
   public strictfp boolean method_430() {
      if (super.au()) {
         this.method_629(true);
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else if (this.bi) {
         return true;
      } else {
         this.method_629(false);
         if (!this.bi) {
            for(int var2 = 0; var2 < this.method_317(); ++var2) {
               if (var2 != this.method_632()) {
                  float var3 = this.bV[var2].field_4612 / this.method_445(var2);
                  if (var3 != 0.0F) {
                     class_236 var4 = class_236.method_1549();
                     PointF var5 = this.w(var2);
                     var4.field_1935.method_87();
                     var4.field_1935.method_94(var5.field_2406 - var4.field_1965, var5.field_2407 - var4.field_1966 - this.dj);
                     var4.field_1935.method_92(var3 * 0.7F, var3 * 0.7F);
                     var4.field_1935.method_69(class_93.field_810, 0.0F, 0.0F, (Paint)null);
                     var4.field_1935.method_88();
                  }
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: e (boolean) void
   public strictfp void method_629(boolean var1) {
      class_236 var2 = class_236.method_1549();
      Paint var3;
      if (!var1) {
         var3 = this.as();
      } else {
         this.field_639.method_2791(50, 255, 255, 255);
         var3 = this.field_639;
      }

      for(int var5 = 0; var5 <= 1; ++var5) {
         PointF var6 = this.method_630(var5, var1);
         float var7 = var6.field_2406 - var2.field_1965;
         float var8 = var6.field_2407 - var2.field_1966;
         float var9 = this.method_227(false) - 90.0F;
         if (!var1) {
            var8 -= this.dj;
         }

         class_306 var4;
         if (var5 == 0) {
            if (var1) {
               var4 = field_633;
            } else {
               var4 = field_631[this.bk.method_963()];
            }

            var9 += 0.0F;
         } else {
            if (var1) {
               var4 = field_632;
            } else {
               var4 = field_630[this.bk.method_963()];
            }

            var9 -= 0.0F;
         }

         var2.field_1935.method_65(var4, var7, var8, var9, var3);
      }

   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return 3;
   }

   // $FF: renamed from: x (int) android.graphics.PointF
   public strictfp PointF method_479(int var1) {
      if (var1 == this.method_632()) {
         return super.x(var1);
      } else {
         float var2 = this.method_227(false) - 90.0F;
         PointF var3 = this.method_630(var1, false);
         float var4 = var3.field_2406;
         float var5 = var3.field_2407;
         var4 += class_296.method_2099(var2) * 5.0F;
         var5 += class_296.method_2098(var2) * 5.0F;
         aH.method_1960(var4, var5);
         return aH;
      }
   }

   // $FF: renamed from: a (int, boolean) android.graphics.PointF
   public strictfp PointF method_630(int var1, boolean var2) {
      float var3 = this.method_227(false) - 90.0F;
      if (var1 == this.method_632()) {
         throw new RuntimeException("index==2 is for base");
      } else {
         float var4 = this.dh;
         float var5 = this.di;
         float var6 = this.field_638 * 4.0F;
         var6 = class_296.method_2023(var6, 0.0F, 1.0F);
         float var7 = this.field_638 * 2.0F - 1.0F;
         var7 = class_296.method_2023(var7, 0.0F, 1.0F);
         var4 += class_296.method_2099(var3) * (7.0F - 5.0F * var6);
         var5 += class_296.method_2098(var3) * (7.0F - 5.0F * var6);
         float var8 = (float)(-90 + 180 * var1);
         var4 += class_296.method_2099(var3 + var8) * (12.0F - 5.0F * var7);
         var5 += class_296.method_2098(var3 + var8) * (12.0F - 5.0F * var7);
         this.field_640.method_1960(var4, var5);
         return this.field_640;
      }
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_625 : field_629[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_627;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return field_628;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_625;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_75(boolean var1) {
      super(var1);
      this.b(field_626);
      this.by = 12.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 530.0F;
      this.bI = this.bJ;
      this.G = field_626;
      this.H = field_627;
      this.dj = 0.0F;
      this.I(5);
   }

   // $FF: renamed from: i () boolean
   public strictfp boolean method_280() {
      return !this.method_626();
   }

   // $FF: renamed from: ce () void
   public strictfp void method_631() {
      if (!this.field_636) {
         this.I(1);
      } else {
         this.I(5);
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (this.bj() && !this.bi) {
         class_236 var2 = class_236.method_1549();
         this.field_634 += 2.0F * var1;
         if (this.field_634 > 360.0F) {
            this.field_634 -= 360.0F;
         }

         float var3;
         if (this.field_635) {
            var3 = 20.0F + class_296.method_2098(this.field_634) * 1.5F;
         } else {
            var3 = -8.0F;
         }

         if (this.field_635 && !this.method_282()) {
            this.field_638 = class_296.method_2021(this.field_638, 0.0F, 0.018F * var1);
         } else {
            this.field_638 = class_296.method_2021(this.field_638, 1.0F, 0.018F * var1);
         }

         if (class_296.method_2042(this.dj - var3) > 3.0F) {
            float var4 = 0.6F;
            if (this.method_282()) {
               var4 /= 6.0F;
            }

            this.field_637 = class_296.method_2022(this.field_637, var4);
            this.field_637 = class_296.method_2021(this.field_637, var4, 0.006F * var1);
         } else {
            this.field_637 = class_296.method_2021(this.field_637, 0.07F, 0.006F * var1);
         }

         this.dj = class_296.method_2021(this.dj, var3, this.field_637 * var1);
         boolean var10 = false;
         if (this.field_636 && this.method_282()) {
            if (!this.bO()) {
               this.field_635 = true;
            } else {
               this.field_636 = false;
               this.method_631();
               var10 = true;
            }
         }

         if (!this.field_636 && !this.method_282()) {
            this.field_636 = true;
            this.method_631();
            var10 = true;
         }

         if (var10) {
            var2.field_1938.method_2477(this.dh, this.di, 0.0F, 0, 0.0F, 0.0F);

            for(int var5 = -180; var5 < 180; var5 += 45) {
               float var6 = this.bv + (float)var5;
               float var7 = (float)((double)this.dh + Math.cos(Math.toRadians((double)var6)) * -5.0D);
               float var8 = (float)((double)this.di + Math.sin(Math.toRadians((double)var6)) * -5.0D);
               class_390 var9 = var2.field_1938.method_2476(var7, var8, 0.0F, var6);
               if (var9 != null) {
                  var9.field_3179 = 2;
                  var9.field_3136 = true;
                  var9.field_3137 = 7.0F;
               }
            }
         }

      }
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return var1 == this.method_632() ? 0.0F : 45.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      if (var2 != this.method_632()) {
         PointF var3 = this.w(var2);
         class_97 var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
         var4.field_895 = Color.method_3077(255, 247, 212, 129);
         var4.field_874 = this.method_442(var2);
         var4.field_842 = var1;
         var4.field_839 = 10.0F;
         var4.field_849 = 4.0F;
         var4.field_850 = 2.0F;
         var4.field_925 = false;
         var4.field_853 = true;
         var4.field_864 = true;
         var4.field_888 = 0.5F;
         var4.field_890 = 1.0F;
         var4.field_891 = 0.1F;
         class_236 var5 = class_236.method_1549();
         var5.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1118482);
         var5.field_1933.method_3323(class_525.field_4765, 0.2F, this.dh, this.di);
      }
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return this.method_626() ? 100.0F : 170.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 110.0F;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return (float)(25 + var1 * 10);
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_448(int var1) {
      return 0.2F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return !this.method_282() ? 1.4F : 0.4F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return !this.method_282() ? 3.8F : 1.5F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.3F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 4.0F;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return 0.35F;
   }

   // $FF: renamed from: t (int) float
   public strictfp float method_455(int var1) {
      return 0.38F;
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return false;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.03F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return true;
   }

   // $FF: renamed from: aI () boolean
   public strictfp boolean method_468() {
      return true;
   }

   // $FF: renamed from: aJ () boolean
   public strictfp boolean method_469() {
      return true;
   }

   // $FF: renamed from: g (float) void
   public strictfp void method_361(float var1) {
      if (!this.O()) {
         super.g(var1);
      } else {
         this.bv += var1;
         if (this.bv > 180.0F) {
            this.bv -= 360.0F;
         }

         if (this.bv < -180.0F) {
            this.bv += 360.0F;
         }

      }
   }

   // $FF: renamed from: cf () int
   public strictfp int method_632() {
      return 2;
   }

   // $FF: renamed from: d (boolean) float
   public strictfp float method_227(boolean var1) {
      return this.bV[this.method_632()].field_4608 + 90.0F;
   }

   // $FF: renamed from: V () boolean
   public strictfp boolean method_382() {
      return !this.method_282();
   }

   // $FF: renamed from: S () boolean
   public strictfp boolean method_379() {
      return this.method_282();
   }

   // $FF: renamed from: T () boolean
   public strictfp boolean method_380() {
      return !this.method_282();
   }

   // $FF: renamed from: U () boolean
   public strictfp boolean method_381() {
      return !this.method_282() ? true : true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
      if (var1 == field_642) {
         this.field_635 = true;
      }

      if (var1 == field_643) {
         this.field_635 = false;
      }

   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_644;
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      super.e(var1);
      float var2 = this.method_439();
      class_205.method_1355(this, var2);
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_627();
   }

   static {
      field_644.add(field_642);
      field_644.add(field_643);
   }
}
