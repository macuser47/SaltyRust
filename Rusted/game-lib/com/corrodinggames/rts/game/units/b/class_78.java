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
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.b.f
public class class_78 extends class_73 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_664 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_665 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_666 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_667 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_668 = null;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_669 = new class_306[10];
   // $FF: renamed from: g boolean
   boolean field_670 = false;
   // $FF: renamed from: o float
   float field_671;
   // $FF: renamed from: p float
   float field_672 = 0.0F;
   // $FF: renamed from: q float
   float field_673;
   // $FF: renamed from: r android.graphics.Rect
   Rect field_674 = new Rect();
   // $FF: renamed from: s android.graphics.Rect
   Rect field_675 = new Rect();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_672);
      var1.method_2542(this.field_671);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      if (var1.method_3006() >= 9) {
         this.field_672 = var1.method_3012();
         this.field_671 = var1.method_3012();
         if (var1.method_3006() == 8) {
            this.field_670 = var1.method_3010();
         }
      } else {
         this.field_671 = 0.5F;
      }

      super.method_175(var1);
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_641() {
      return class_469.field_4044;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_642() {
      class_236 var0 = class_236.method_1549();
      field_665 = var0.field_1935.method_60(R$drawable.helicopter);
      field_666 = var0.field_1935.method_60(R$drawable.helicopter_blades);
      field_667 = var0.field_1935.method_60(R$drawable.helicopter_shadow);
      field_668 = var0.field_1935.method_60(R$drawable.helicopter_shadow_blades);
      field_664 = var0.field_1935.method_60(R$drawable.helicopter_dead);
      field_669 = class_107.method_948(field_665);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_664 : field_669[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_667;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_664;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_78(boolean var1) {
      super(var1);
      this.J(26);
      this.K(46);
      this.by = 13.0F;
      this.bz = this.by + 2.0F;
      this.bJ = 150.0F;
      this.bI = this.bJ;
      this.G = field_665;
      this.H = field_667;
      this.dj = 0.0F;
      this.field_671 = 0.14F;
      this.field_673 = 0.0F;
      this.I(5);
   }

   // $FF: renamed from: n () void
   public strictfp void method_249() {
      super.n();
      this.dj = 20.0F;
      this.field_671 = 0.5F;
   }

   // $FF: renamed from: C () boolean
   public strictfp boolean method_431() {
      return true;
   }

   // $FF: renamed from: i () boolean
   public strictfp boolean method_280() {
      return true;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (!this.bi) {
         this.field_671 = class_296.method_2021(this.field_671, 0.5F, 0.003F * var1);
         this.field_673 += 70.0F * this.field_671 * var1;
         if (this.field_673 >= 360.0F) {
            this.field_673 -= 360.0F;
            this.field_673 += (float)class_296.method_2013(this, 0, 4);
         }

         if (this.field_671 > 0.4F) {
            this.field_672 += 2.0F * var1;
            if (this.field_672 > 360.0F) {
               this.field_672 -= 360.0F;
            }

            this.dj = class_296.method_2021(this.dj, 20.0F + class_296.method_2098(this.field_672) * 1.5F, 0.1F * var1);
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.w(var2);
      class_97 var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_874 = 17.0F;
      var4.field_842 = var1;
      var4.field_839 = 30.0F;
      var4.field_849 = 8.0F;
      var4.field_872 = false;
      var4.field_895 = Color.method_3077(255, 180, 180, 0);
      var4.field_853 = true;
      var4.field_926 = false;
      class_236 var6 = class_236.method_1549();
      float var7 = 1.0F + class_296.method_2033(-0.08F, 0.08F);
      var6.field_1933.method_3324(class_525.field_4760, 0.2F, var7, var3.field_2406, var3.field_2407);
      var6.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1118720);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 130.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 60.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return this.dj < 15.0F ? 0.0F : 2.2F;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return 0.1F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 6.0F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.4F;
   }

   // $FF: renamed from: aI () boolean
   public strictfp boolean method_468() {
      return true;
   }

   // $FF: renamed from: aJ () boolean
   public strictfp boolean method_469() {
      return true;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 16.0F;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public strictfp Rect method_299(boolean var1) {
      return super.a_(var1);
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         if (!this.bi) {
            Paint var2 = this.as();
            class_236 var3 = class_236.method_1549();
            this.field_675.method_1911(0, 0, field_666.method_2128(), field_666.method_2127());
            float var4 = this.field_673;
            if (this.bC) {
            }

            var3.field_1935.method_66(field_666, this.field_675, this.dh - class_236.method_1549().field_1965, this.di - class_236.method_1549().field_1966 - this.dj, var4, var2);
         }

         return true;
      }
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.07F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return true;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 7.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_641();
   }
}
