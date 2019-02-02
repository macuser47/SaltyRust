package com.corrodinggames.rts.game.units.e;

import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.graphics.PointF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_9;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_128;
import com.corrodinggames.rts.game.units.a.class_131;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.b
public class class_84 extends class_79 implements class_9 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_732 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_733 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_734 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_735 = new class_306[10];
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_736 = null;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_737 = null;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_738 = null;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_739 = new class_306[10];
   // $FF: renamed from: i android.graphics.PointF[]
   PointF[] field_740 = new PointF[6];
   // $FF: renamed from: j android.graphics.PointF[]
   PointF[] field_741;
   // $FF: renamed from: k android.graphics.Paint
   static Paint field_742;
   // $FF: renamed from: l android.graphics.Paint
   static Paint field_743;
   // $FF: renamed from: m android.graphics.Paint
   static Paint field_744;
   // $FF: renamed from: n com.corrodinggames.rts.game.units.a.l
   static class_121 field_745 = new class_128(false);

   // $FF: renamed from: D () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_654() {
      return class_469.field_4040;
   }

   // $FF: renamed from: b () android.graphics.PointF[]
   public strictfp PointF[] method_18() {
      return this.field_740;
   }

   // $FF: renamed from: c () android.graphics.PointF[]
   public strictfp PointF[] method_19() {
      return this.field_741;
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_739[this.bk.method_963()];
   }

   // $FF: renamed from: cd () void
   public static strictfp void method_655() {
      class_236 var0 = class_236.method_1549();
      field_732 = var0.field_1935.method_60(R$drawable.builder);
      field_733 = var0.field_1935.method_60(R$drawable.builder_dead);
      field_734 = a(field_732, field_732.method_2128(), field_732.method_2127());
      field_735 = class_107.method_948(field_732);
      field_736 = var0.field_1935.method_60(R$drawable.builder_charge);
      field_737 = var0.field_1935.method_60(R$drawable.builder_decharge);
      field_738 = var0.field_1935.method_60(R$drawable.unit_icon_builder);
      field_739 = class_107.method_948(field_738);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_386(class_39 var1) {
      if (var1.method_330()) {
         return false;
      } else {
         return var1.method_212();
      }
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_733 : field_735[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_734;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      this.G = field_733;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2422);
      return true;
   }

   public strictfp class_84(boolean var1) {
      super(var1);
      this.field_741 = new PointF[this.field_740.length];
      field_742 = new Paint();
      field_742.method_2791(40, 0, 255, 0);
      field_742.method_2781(true);
      field_742.method_2793(2.0F);
      field_742.method_2794(Paint$Cap.field_1808);
      field_743 = new Paint();
      field_743.method_2776(field_742);
      field_743.method_2791(55, 255, 60, 60);
      field_744 = new Paint();
      field_744.method_2791(60, 255, 255, 255);
      this.J(20);
      this.K(20);
      this.by = 10.0F;
      this.bz = this.by + 2.0F;
      this.bJ = 170.0F;
      this.bI = this.bJ;
      this.G = field_732;

      for(int var2 = 0; var2 < this.field_740.length; ++var2) {
         this.field_740[var2] = new PointF();
         this.field_741[var2] = new PointF();
      }

   }

   // $FF: renamed from: a (float, com.corrodinggames.rts.game.units.d) void
   public static strictfp void method_656(float var0, class_9 var1) {
      class_44 var2 = (class_44)var1;
      PointF[] var3 = var1.method_18();
      PointF[] var4 = var1.method_19();
      class_39 var5 = var2.method_365();
      var2.field_329 = var5 != null;
      int var6;
      PointF var7;
      PointF var8;
      if (var5 != null) {
         for(var6 = 0; var6 < var3.length; ++var6) {
            var7 = var3[var6];
            var8 = var4[var6];
            var7.field_2406 = class_296.method_2021(var7.field_2406, var8.field_2406, 0.1F * var0);
            var7.field_2407 = class_296.method_2021(var7.field_2407, var8.field_2407, 0.1F * var0);
            var7.field_2406 += (var8.field_2406 - var7.field_2406) * 0.04F * var0;
            var7.field_2407 += (var8.field_2407 - var7.field_2407) * 0.04F * var0;
            float var9 = var5.field_157 * 0.75F;
            if (class_296.method_2042(var7.field_2406 - var8.field_2406) < 1.0F) {
               var8.field_2406 = class_296.method_2034(-var9, var9);
            }

            if (class_296.method_2042(var7.field_2407 - var8.field_2407) < 1.0F) {
               var8.field_2407 = class_296.method_2034(-var9, var9);
            }
         }
      } else if (var3[0].field_2406 != 0.0F || var3[0].field_2407 != 0.0F) {
         for(var6 = 0; var6 < var3.length; ++var6) {
            var7 = var3[var6];
            var8 = var4[var6];
            var7.field_2406 = 0.0F;
            var7.field_2407 = 0.0F;
            var8.field_2406 = 0.0F;
            var8.field_2407 = 0.0F;
         }
      }

   }

   // $FF: renamed from: b (float, com.corrodinggames.rts.game.units.d) void
   public static strictfp void method_657(float var0, class_9 var1) {
      class_44 var2 = (class_44)var1;
      class_39 var3 = var2.method_365();
      if (var3 != null) {
         boolean var4 = var2.method_366();
         class_236 var5 = class_236.method_1549();
         PointF[] var6 = var1.method_18();
         Paint var7 = field_742;
         if (var4) {
            var7 = field_743;
         }

         PointF var8 = var2.method_477();

         for(int var9 = 0; var9 < var6.length; ++var9) {
            PointF var10 = var6[var9];
            float var11 = var3.dh + var10.field_2406 - var5.field_1965;
            float var12 = var3.di - var3.dj + var10.field_2407 - var5.field_1966;
            var5.field_1935.method_96(var8.field_2406 + var10.field_2406 * 0.15F - var5.field_1965, var8.field_2407 + var10.field_2407 * 0.15F - var5.field_1966 - var2.dj, var11, var12, var7);
            var5.field_1935.method_89();
            var5.field_1935.method_94(var11, var12);
            var5.field_1935.method_92(0.5F, 0.5F);
            if (var4) {
               var5.field_1935.method_69(field_737, 0.0F, 0.0F, field_744);
            } else {
               var5.field_1935.method_69(field_736, 0.0F, 0.0F, field_744);
            }

            var5.field_1935.method_90();
         }
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (!this.bi) {
         method_656(var1, this);
      }

   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
      super.a(var1, var2);
      if (!this.bi) {
         method_657(var1, this);
      }

   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 30.0F;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_448(int var1) {
      return 1.3F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         if (!this.bi) {
            float var3 = this.bV[0].field_4612 / this.method_445(0);
            if (var3 != 0.0F) {
               PointF var4 = this.aN();
               var2.field_1935.method_87();
               var2.field_1935.method_94(var4.field_2406 - var2.field_1965, var4.field_2407 - var2.field_1966);
               var2.field_1935.method_92(var3, var3);
               if (this.N()) {
                  var2.field_1935.method_69(field_737, 0.0F, 0.0F, (Paint)null);
               } else {
                  var2.field_1935.method_69(field_736, 0.0F, 0.0F, (Paint)null);
               }

               var2.field_1935.method_88();
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 30.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 100.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return this.bP() ? 0.6F : 0.8F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return this.bP() ? 1.7F : 3.8F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.35F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.04F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public static strictfp void method_658(ArrayList var0, int var1) {
      var0.add(field_745);
      var0.add(new class_131(class_469.field_4033, 1, 1));
      var0.add(new class_131(class_469.field_4038, 1, 2));
      var0.add(new class_131(class_469.field_4039, 1, 3));
      var0.add(new class_131(class_469.field_4034, 1, 4));
      var0.add(new class_131(class_469.field_4035, 1, 5));
      var0.add(new class_131(class_469.field_4036, 1, 6));
      var0.add(new class_131(class_469.field_4057, 1, 7));
      var0.add(new class_131(class_469.field_4060, 1, 8));
      var0.add(new class_131(class_469.field_4068, 1, 9));
      var0.add(new class_131(class_469.field_4065, 1, 10));
      var0.add(new class_131(class_469.field_4061, 1, 14));
      var0.add(new class_131(class_469.field_4062, 1, 15));
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return this.method_654().method_143(this.K());
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return true;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 10.0F;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && !this.bi;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 1.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 1.0F;
   }

   // $FF: renamed from: Z () boolean
   public strictfp boolean method_391() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_654();
   }
}
