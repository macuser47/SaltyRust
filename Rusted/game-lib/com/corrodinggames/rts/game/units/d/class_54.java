package com.corrodinggames.rts.game.units.d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.b
public class class_54 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_419 = new class_306[10];
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_420 = null;
   // $FF: renamed from: c boolean
   boolean field_421;
   // $FF: renamed from: d int
   int field_422;
   // $FF: renamed from: e float
   float field_423;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_424 = null;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_425 = new class_306[10];
   // $FF: renamed from: h android.graphics.PointF
   PointF field_426 = new PointF();
   // $FF: renamed from: i android.graphics.Rect
   Rect field_427 = new Rect();
   // $FF: renamed from: j com.corrodinggames.rts.game.units.a.l
   static class_121 field_428 = new b$1(145);
   // $FF: renamed from: k com.corrodinggames.rts.game.units.a.l
   static class_121 field_429 = new b$2(144);
   // $FF: renamed from: l java.util.ArrayList
   static ArrayList field_430 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2540(this.field_421);
      var1.method_2541(this.field_422);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_421 = var1.method_3010();
      if (var1.method_3006() >= 30) {
         this.field_422 = var1.method_3011();
      }

      super.method_175(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_425[this.bk.method_963()];
   }

   // $FF: renamed from: b () void
   public static strictfp void method_547() {
      class_236 var0 = class_236.method_1549();
      field_420 = var0.field_1935.method_60(R$drawable.antinuke_launcher_dead);
      class_306 var1 = var0.field_1935.method_60(R$drawable.antinuke_launcher);
      field_419 = class_107.method_948(var1);
      var1.method_2129();
      field_424 = var0.field_1935.method_60(R$drawable.unit_icon_building_turrent);
      field_425 = class_107.method_948(field_424);
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      class_236 var1 = class_236.method_1549();
      this.G = field_420;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2426);
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_420 : field_419[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
   }

   public strictfp class_54(boolean var1) {
      super(var1);
      this.G = field_419[field_419.length - 1];
      this.b(this.G);
      this.by = 24.0F;
      this.bz = this.by;
      this.bJ = 2800.0F;
      this.bI = this.bJ;
      this.n.method_1911(-1, -1, 1, 1);
      this.o.method_1911(-1, -1, 1, 1);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (this.bj() && !this.bi) {
         if (this.field_422 > 0) {
            class_97 var2 = null;
            this.field_423 = class_296.method_2020(this.field_423, var1);
            if (this.field_423 == 0.0F) {
               this.field_423 = 15.0F;
               Iterator var3 = class_97.field_833.iterator();

               label56:
               while(true) {
                  class_97 var4;
                  float var7;
                  do {
                     do {
                        float var5;
                        float var6;
                        do {
                           do {
                              do {
                                 if (!var3.hasNext()) {
                                    break label56;
                                 }

                                 var4 = (class_97)var3.next();
                              } while(!var4.field_856);
                           } while(var4.dj <= 50.0F);

                           var5 = 2200.0F;
                           var6 = class_296.method_2026(this.dh, this.di, var4.dh, var4.di);
                        } while(var6 >= var5 * var5);

                        var7 = class_296.method_2026(this.dh, this.di, var4.field_844, var4.field_845);
                     } while(var7 >= 1000000.0F);
                  } while(var4.field_841 != null && (var4.field_841.field_143.method_944(this.bk) || var4.field_841.field_143 == this.bk));

                  if (!this.method_548(var4)) {
                     var2 = var4;
                  }
               }
            }

            if (var2 != null) {
               this.method_549(var2);
            }
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.f) boolean
   public strictfp boolean method_548(class_97 var1) {
      Iterator var2 = class_97.field_833.iterator();

      class_97 var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (class_97)var2.next();
      } while(var3 == var1 || var3.field_846 != var1);

      return true;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.f) void
   public strictfp void method_549(class_97 var1) {
      class_236 var2 = class_236.method_1549();
      if (this.field_422 > 0) {
         --this.field_422;
         byte var3 = 0;
         PointF var4 = this.method_478(var3);
         class_97 var5 = class_97.method_697(this, var4.field_2406, var4.field_2407);
         var5.I(10);
         var5.field_867 = 10;
         var5.field_869 = 0;
         var5.field_850 = 1.0F;
         var5.field_901 = true;
         var5.field_846 = var1;
         var5.field_839 = 99999.0F;
         var5.field_849 = 0.2F;
         var5.field_847 = 6.5F;
         var5.field_895 = Color.method_3077(255, 80, 60, 180);
         var5.field_874 = 600.0F;
         var5.field_915 = true;
         var5.field_920 = true;
         var5.field_925 = true;
         var5.field_855 = true;
         var5.field_916 = 80.0F;
         var5.field_917 = 100.0F;
         var5.field_919 = 2.0F;
         var2.field_1938.method_2474(var4.field_2406, var4.field_2407, this.dj, -1127220);
         class_390 var6 = var2.field_1938.method_2480(var4.field_2406, var4.field_2407, 0.0F, -1);
         if (var6 != null) {
            var6.field_3145 = 0.5F;
            var6.field_3144 = 2.1F;
            var6.field_3179 = 2;
            var6.field_3160 = 90.0F;
            var6.field_3161 = var6.field_3160;
            var6.field_3159 = 0.0F;
         }

         float var7 = 1.5F;
         var2.field_1933.method_3324(class_525.field_4771, 0.15F, var7, var4.field_2406, var4.field_2407);
      }
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      aG.method_1960(this.dh, this.di - 9.0F);
      return aG;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 1000.0F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 4.0F;
   }

   // $FF: renamed from: b (int, float) boolean
   public strictfp boolean method_470(int var1, float var2) {
      return false;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return super.method_181(var1);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_550() {
      return class_469.field_4062;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 1.0F;
   }

   // $FF: renamed from: bk () float
   public strictfp float method_230() {
      return super.method_230();
   }

   // $FF: renamed from: cd () void
   public strictfp void method_551() {
      ++this.field_422;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      if (var1.field_16.equals(field_429.method_1043())) {
         this.method_551();
      }

   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      return this.field_422 < 4 ? field_429.method_1043() : class_121.field_1347;
   }

   // $FF: renamed from: bx () boolean
   public strictfp boolean method_268() {
      return false;
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_430;
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      super.e(var1);
   }

   // $FF: renamed from: F () void
   public strictfp void method_236() {
   }

   // $FF: renamed from: bq () void
   public strictfp void method_237() {
      float var1 = 990.0F;
      boolean var2 = false;
      boolean var3 = true;
      class_205.method_1357(this, var1, var2, var3);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k) boolean
   public strictfp boolean method_183(class_236 var1) {
      return this.bS ? true : super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public strictfp float method_246(class_39 var1, float var2, class_97 var3) {
      if (var2 > 2600.0F) {
         var2 = 2600.0F;
      }

      return super.a(var1, var2, var3);
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_550();
   }

   static {
      field_430.add(field_428);
      field_430.add(field_429);
   }
}
