package com.corrodinggames.rts.game.units.f;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.f.e
public class class_72 extends class_67 {
   // $FF: renamed from: a boolean
   boolean field_599 = false;
   // $FF: renamed from: b boolean
   boolean field_600 = true;
   // $FF: renamed from: c float
   float field_601 = 0.0F;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_602 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_603 = null;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_604 = null;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.e
   public static class_306 field_605 = null;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_606 = new class_306[10];
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_607 = new class_306[10];
   // $FF: renamed from: j com.corrodinggames.rts.game.units.a.l
   public static final class_121 field_608 = new e$1(151);
   // $FF: renamed from: k com.corrodinggames.rts.game.units.a.l
   public static final class_121 field_609 = new e$2(152);
   // $FF: renamed from: l java.util.ArrayList
   static ArrayList field_610 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2540(this.field_599);
      var1.method_2542(this.field_601);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_599 = var1.method_3010();
      this.field_600 = !this.method_282();
      if (var1.method_3006() >= 21) {
         this.field_601 = var1.method_3012();
      }

      this.method_622();
      super.method_175(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_606[this.bk.method_963()];
   }

   // $FF: renamed from: b () void
   public static strictfp void method_620() {
      class_236 var0 = class_236.method_1549();
      field_603 = var0.field_1935.method_60(R$drawable.attack_submarine);
      field_604 = a(field_603, field_603.method_2128(), field_603.method_2127());
      field_602 = var0.field_1935.method_60(R$drawable.attack_submarine_dead);
      field_605 = var0.field_1935.method_60(R$drawable.unit_icon_water);
      field_606 = class_107.method_948(field_605);
      field_607 = class_107.method_948(field_603);
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && this.dj >= 0.0F;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 0.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 0.0F;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_602 : field_607[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_604;
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_279() {
      return class_503.field_4621;
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_621() {
      return class_469.field_4069;
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_610() {
      return !this.method_282();
   }

   public strictfp class_72(boolean var1) {
      super(var1);
      this.b(field_603);
      this.by = 15.0F;
      this.bz = this.by - 2.0F;
      this.bJ = 260.0F;
      this.bI = this.bJ;
      this.G = field_603;
   }

   // $FF: renamed from: cd () void
   public strictfp void method_622() {
      if (!this.field_600) {
         this.I(1);
      } else {
         this.I(2);
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (this.bj() && !this.bi) {
         class_236 var2 = class_236.method_1549();
         float var3;
         if (this.field_599) {
            var3 = 1.0F;
         } else {
            var3 = -8.0F;
         }

         if (class_296.method_2042(this.dj - var3) > 2.0F) {
            this.field_601 = class_296.method_2021(this.field_601, 0.08F, 0.003F * var1);
         } else {
            this.field_601 = class_296.method_2021(this.field_601, 0.02F, 0.003F * var1);
         }

         this.dj = class_296.method_2021(this.dj, var3, this.field_601 * var1);
         boolean var4 = false;
         if (this.field_600 && this.method_282()) {
            this.field_600 = false;
            this.method_622();
            var4 = true;
         }

         if (!this.field_600 && !this.method_282()) {
            this.field_600 = true;
            this.method_622();
            var4 = true;
         }

         if (var4) {
            var2.field_1938.method_2478(this.dh, this.di, 0.0F, 0, 0.0F, 0.0F, this.bv);
         }

      }
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return !this.method_282() ? 250.0F : 180.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 170.0F;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 10.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return !this.method_282() ? 0.8F : 0.45F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.2F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.06F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 2.5F;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      return 0.08F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.018F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return true;
   }

   // $FF: renamed from: H () boolean
   public strictfp boolean method_282() {
      return this.dj < -1.0F;
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

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 42.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3;
      class_97 var4;
      PointF var5;
      class_236 var6;
      if (!this.method_282()) {
         var3 = this.w(var2);
         var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
         var5 = this.B(var2);
         var4.field_862 = var5.field_2406;
         var4.field_863 = var5.field_2407;
         var4.field_895 = Color.method_3077(255, 230, 230, 50);
         var4.field_874 = 42.0F;
         var4.field_842 = var1;
         var4.field_839 = 190.0F;
         var4.field_849 = 2.0F;
         var4.field_915 = true;
         var4.field_920 = true;
         var4.field_925 = true;
         var6 = class_236.method_1549();
         var6.field_1933.method_3323(class_525.field_4754, 0.8F, this.dh, this.di);
         var6.field_1938.method_2474(this.dh, this.di, this.dj, -1118720);
      } else {
         var3 = this.w(var2);
         var4 = class_97.method_698(this, var3.field_2406, var3.field_2407, this.dj);
         var5 = this.B(var2);
         var4.field_862 = var5.field_2406;
         var4.field_863 = var5.field_2407;
         var4.field_895 = Color.method_3077(255, 30, 30, 150);
         var4.field_850 = 1.0F;
         var4.field_874 = 42.0F;
         var4.field_842 = var1;
         var4.field_839 = 250.0F;
         var4.field_849 = 1.3F;
         var4.field_915 = false;
         var4.field_920 = true;
         var4.field_925 = true;
         var6 = class_236.method_1549();
      }

   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_602;
      this.I(0);
      this.bh = false;
      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
      if (var1 == field_608) {
         this.field_599 = true;
      }

      if (var1 == field_609) {
         this.field_599 = false;
      }

   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_610;
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
      return this.method_621();
   }

   static {
      field_610.add(field_608);
      field_610.add(field_609);
   }
}
