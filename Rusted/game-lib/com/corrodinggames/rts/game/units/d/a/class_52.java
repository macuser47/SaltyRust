package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_502;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.d.class_32;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.a.a
public class class_52 extends class_51 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_405 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_406 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_407 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_408 = new class_306[10];
   // $FF: renamed from: e com.corrodinggames.rts.game.units.a.l
   public static class_121 field_409 = new a$1(102);
   // $FF: renamed from: f java.util.ArrayList
   static ArrayList field_410 = new ArrayList();

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_408[this.bk.method_963()];
   }

   // $FF: renamed from: b () void
   public static strictfp void method_543() {
      class_236 var0 = class_236.method_1549();
      field_405 = var0.field_1935.method_60(R$drawable.anti_air_top);
      field_406 = var0.field_1935.method_60(R$drawable.anti_air_top_l2);
      field_407 = var0.field_1935.method_60(R$drawable.unit_icon_building_air_turrent);
      field_408 = class_107.method_948(field_407);
   }

   public strictfp class_52(boolean var1) {
      super(var1);
      this.bJ = 800.0F;
      this.bI = this.bJ;
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return !this.j ? 250.0F : 320.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return !this.j ? 80.0F : 70.0F;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      if (!this.j) {
         return super.e(var1);
      } else {
         return var1 == 2 ? 25.0F : super.e(var1);
      }
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      if (this.j && var1 != 0) {
         float var2 = this.x() ? this.bv : this.bV[var1].field_4608;
         PointF var3 = this.x(var1);
         var2 += var1 == 1 ? -30.0F : 30.0F;
         float var4 = var3.field_2406 + class_296.method_2099(var2) * 10.0F;
         float var5 = var3.field_2407 + class_296.method_2098(var2) * 10.0F;
         aG.method_1960(var4, var5);
         return aG;
      } else {
         return super.method_478(var1);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      PointF var3 = this.method_478(var2);
      class_97 var4 = class_97.method_697(this, var3.field_2406, var3.field_2407);
      PointF var5 = this.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_849 = 0.3F;
      var4.field_847 = 6.0F;
      if (!this.j) {
         var4.field_895 = Color.method_3077(255, 230, 230, 50);
         var4.field_874 = 60.0F;
         var4.field_839 = 220.0F;
      } else {
         var4.field_895 = Color.method_3077(255, 230, 50, 50);
         var4.field_874 = 60.0F;
         var4.field_839 = 250.0F;
         var4.field_849 = 0.5F;
         var4.field_847 = 7.0F;
      }

      var4.field_867 = 4;
      var4.field_850 = 1.0F;
      var4.field_842 = var1;
      var4.field_915 = false;
      var4.field_916 = 0.0F;
      var4.field_917 = 0.0F;
      var4.field_920 = true;
      var4.field_925 = true;
      var4.field_914 = true;
      class_236 var6 = class_236.method_1549();
      float var7 = 1.0F + class_296.method_2033(-0.07F, 0.07F);
      var6.field_1933.method_3324(class_525.field_4754, 0.3F, var7, var3.field_2406, var3.field_2407);
      var6.field_1938.method_2472(var4, -1118720);
      var6.field_1938.method_2474(var3.field_2406, var3.field_2407, this.dj, -1127220);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_530() {
      return this.j ? class_469.field_4078 : class_469.field_4039;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return !this.j ? field_405 : field_406;
   }

   // $FF: renamed from: T () boolean
   public strictfp boolean method_380() {
      return true;
   }

   // $FF: renamed from: U () boolean
   public strictfp boolean method_381() {
      return false;
   }

   // $FF: renamed from: o (float) void
   public strictfp void method_528(float var1) {
      byte var2 = 0;
      if (this.bV[var2].field_4610 == 0.0F) {
         class_502 var10000 = this.bV[var2];
         var10000.field_4608 += this.method_453(var2) * var1 * 0.1F;
      }

   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 9.0F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 6.0F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 1.0F;
   }

   // $FF: renamed from: q (int) boolean
   public strictfp boolean method_449(int var1) {
      if (!this.j) {
         return super.q(var1);
      } else {
         return var1 == 0 ? false : super.q(var1);
      }
   }

   // $FF: renamed from: r (int) int
   public strictfp int method_450(int var1) {
      if (!this.j) {
         return -1;
      } else if (var1 == 1) {
         return 0;
      } else {
         return var1 == 2 ? 0 : -1;
      }
   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return 3;
   }

   // $FF: renamed from: n (int) boolean
   public strictfp boolean method_444(int var1) {
      return this.j || var1 <= 1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      if (var1.field_16.equals(field_409.method_1043())) {
         this.method_356(2);
         this.L();
      }

   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      return !this.j ? field_409.method_1043() : class_121.field_1347;
   }

   // $FF: renamed from: a (java.util.ArrayList) void
   public strictfp void method_272(ArrayList var1) {
      var1.clear();
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
      if (var1 == 1) {
         this.j = false;
      } else if (var1 == 2 && !this.j) {
         this.j = true;
         this.bJ += 600.0F;
         this.bI += 600.0F;
      }

   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_410;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_530();
   }

   static {
      field_410.add(field_409);
   }
}
