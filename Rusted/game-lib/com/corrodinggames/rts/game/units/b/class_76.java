package com.corrodinggames.rts.game.units.b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_10;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.e.class_91;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_193;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.b.d
public class class_76 extends class_73 implements class_10 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_645 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_646 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_647 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_648 = new class_306[10];
   // $FF: renamed from: e float
   float field_649 = 0.0F;
   // $FF: renamed from: f float
   float field_650;
   // $FF: renamed from: g boolean
   boolean field_651;
   // $FF: renamed from: o com.corrodinggames.rts.gameFramework.utility.k
   class_193 field_652 = new class_193();
   // $FF: renamed from: p android.graphics.Rect
   Rect field_653 = new Rect();
   // $FF: renamed from: q com.corrodinggames.rts.game.units.a.l
   public static final class_121 field_654 = new d$1(109);
   // $FF: renamed from: r com.corrodinggames.rts.game.units.a.l
   public static final class_121 field_655 = new d$2(110);
   // $FF: renamed from: s java.util.ArrayList
   static ArrayList field_656 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_649);
      var1.method_2542(this.field_650);
      var1.method_2540(this.field_651);
      var1.method_2541(this.field_652.size());
      Iterator var2 = this.field_652.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         var1.method_2550(var3);
      }

      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_649 = var1.method_3012();
      this.field_650 = var1.method_3012();
      this.field_651 = var1.method_3010();
      this.field_652.clear();
      int var2 = var1.method_3011();

      for(int var3 = 0; var3 < var2; ++var3) {
         class_39 var4 = var1.method_3019();
         if (var4 != null) {
            this.field_652.add(var4);
         }
      }

      super.method_175(var1);
   }

   // $FF: renamed from: bn () int
   public strictfp int method_233() {
      return class_91.method_675(this.field_652);
   }

   // $FF: renamed from: bo () int
   public strictfp int method_234() {
      return 4;
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_633() {
      return class_469.field_4058;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_634() {
      class_236 var0 = class_236.method_1549();
      field_646 = var0.field_1935.method_60(R$drawable.dropship);
      field_647 = var0.field_1935.method_60(R$drawable.dropship_shadow);
      field_645 = var0.field_1935.method_60(R$drawable.dropship_dead);
      field_648 = class_107.method_948(field_646);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_645 : field_648[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_647;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_645;
      this.I(0);
      this.bh = false;
      this.method_635(true);
      return true;
   }

   public strictfp class_76(boolean var1) {
      super(var1);
      this.J(45);
      this.K(47);
      this.by = 20.0F;
      this.bz = this.by + 0.0F;
      this.bJ = 500.0F;
      this.bI = this.bJ;
      this.G = field_646;
      this.H = field_647;
      this.dj = 0.0F;
   }

   // $FF: renamed from: C () boolean
   public strictfp boolean method_431() {
      return true;
   }

   // $FF: renamed from: i () boolean
   public strictfp boolean method_280() {
      return this.dj >= 4.0F;
   }

   // $FF: renamed from: bE () boolean
   public strictfp boolean method_281() {
      return true;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (!this.bi) {
         boolean var2 = this.bP();
         boolean var3;
         if (this.field_651 && !var2 && !this.bU && this.dj < 4.0F) {
            this.field_650 = class_296.method_2020(this.field_650, var1);
            if (this.field_650 == 0.0F) {
               this.field_650 = 30.0F;
               if (this.field_652.size() == 0) {
                  this.field_651 = false;
               } else {
                  var3 = this.field_652.size() % 2 == 0;
                  float var4 = this.dh + class_296.method_2099(this.bv) * -9.0F;
                  float var5 = this.di + class_296.method_2098(this.bv) * -9.0F;
                  var4 += class_296.method_2099(this.bv + 90.0F) * (float)(var3 ? -7 : 7);
                  var4 += class_296.method_2098(this.bv + 90.0F) * (float)(var3 ? -7 : 7);
                  class_39 var6 = (class_39)this.field_652.remove(this.field_652.size() - 1);
                  if (!class_205.method_1367(var6, var4, var5)) {
                     var4 += 10.0F;
                  }

                  if (!class_205.method_1367(var6, var4, var5)) {
                     var4 -= 20.0F;
                  }

                  if (!class_205.method_1367(var6, var4, var5)) {
                     var4 -= 10.0F;
                     var5 += 10.0F;
                  }

                  if (!class_205.method_1367(var6, var4, var5)) {
                     var5 -= 20.0F;
                  }

                  if (!class_205.method_1367(var6, var4, var5)) {
                     this.field_652.add(var6);
                  } else {
                     var6.field_182 = null;
                     var6.dh = var4;
                     var6.di = var5;
                     var6.field_144 += 0.1F;
                     var6.field_154 = this.bv + 180.0F;
                     var6.field_138 = this;
                     var6.field_139 = 45.0F;
                     if (var6 instanceof class_44) {
                        class_44 var7 = (class_44)var6;
                        var7.method_407();
                        var7.method_397(this.dh + class_296.method_2099(this.bv) * -66.0F, this.di + class_296.method_2098(this.bv) * -66.0F);
                     }

                     if (this.field_652.size() == 0) {
                        this.field_651 = false;
                     }
                  }
               }
            }
         }

         this.field_649 += 2.0F * var1;
         if (this.field_649 > 360.0F) {
            this.field_649 -= 360.0F;
         }

         var3 = this.method_280();
         if (this.bj()) {
            if (this.ac() && !var2) {
               this.dj = class_296.method_2021(this.dj, 2.0F, 0.4F * var1);
            } else {
               this.dj = class_296.method_2021(this.dj, 35.0F + class_296.method_2098(this.field_649) * 1.5F, 0.35F * var1);
            }
         }

         if (var3 != this.method_280()) {
            this.ak = true;
            if (this.method_280()) {
               this.I(5);
            } else {
               this.I(2);
            }
         }

      }
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      float var2 = this.method_474(var1);
      float var3 = this.bv;
      float var4 = this.dh + class_296.method_2099(var3) * var2;
      float var5 = this.di + class_296.method_2098(var3) * var2;
      aG.method_1960(var4, var5);
      return aG;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.method_478(var2);
      class_97 var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
      var4.field_895 = Color.method_3077(255, 150, 230, 40);
      var4.field_874 = 35.0F;
      var4.field_842 = var1;
      var4.field_839 = 80.0F;
      var4.field_849 = 4.0F;
      var4.field_850 = 2.0F;
      class_236 var5 = class_236.method_1549();
      var5.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1127220);
      var5.field_1938.method_2466(var3.field_2406, var3.field_2407, this.dj, this.bV[var2].field_4608);
      var5.field_1933.method_3323(class_525.field_4762, 0.3F, this.dh, this.di);
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 140.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 40.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 2.3F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.4F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
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
      return 0.05F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 15.0F;
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      this.method_635(true);
      super.a();
   }

   // $FF: renamed from: e (boolean) void
   public strictfp void method_635(boolean var1) {
      Iterator var2 = this.field_652.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         var3.field_182 = null;
         var3.dh = this.dh + class_296.method_2099(this.bv) * -9.0F;
         var3.di = this.di + class_296.method_2098(this.bv) * -9.0F;
         if (var1) {
            var3.field_167 = -1.0F;
         }
      }

      this.field_652.clear();
   }

   // $FF: renamed from: l_ () boolean
   public strictfp boolean method_21() {
      return this.field_651;
   }

   // $FF: renamed from: cd () void
   public strictfp void method_636() {
      this.field_651 = true;
      this.field_650 = 30.0F;
   }

   // $FF: renamed from: ce () void
   public strictfp void method_637() {
      this.field_651 = false;
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 16000.0F;
   }

   // $FF: renamed from: o (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_276(class_39 var1) {
      if (this.field_651) {
         return false;
      } else if (!class_91.method_676(this.field_652, 4, var1)) {
         return false;
      } else {
         return var1 == this ? false : class_205.method_1362(var1, true);
      }
   }

   // $FF: renamed from: p (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_277(class_39 var1) {
      if (!this.method_276(var1)) {
         return false;
      } else {
         this.method_638(var1);
         return true;
      }
   }

   // $FF: renamed from: r (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_638(class_39 var1) {
      var1.field_182 = this;
      this.field_652.add(var1);
      class_236 var2 = class_236.method_1549();
      var2.field_1939.method_765(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
      if (var1 == field_654) {
         this.method_636();
      }

      if (var1 == field_655) {
         this.method_637();
      }

   }

   // $FF: renamed from: j () int
   public strictfp int method_20() {
      return this.field_652.size();
   }

   // $FF: renamed from: bD () boolean
   public strictfp boolean method_278() {
      return true;
   }

   // $FF: renamed from: bB () java.lang.String
   public strictfp String method_273() {
      return field_654.method_1043();
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_656;
   }

   // $FF: renamed from: m_ () boolean
   public strictfp boolean method_22() {
      return !this.bP();
   }

   // $FF: renamed from: n_ () boolean
   public strictfp boolean method_23() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_633();
   }

   static {
      field_656.add(field_654);
      field_656.add(field_655);
   }
}
