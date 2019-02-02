package com.corrodinggames.rts.game.units.f;

import android.graphics.Color;
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
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.units.f.d
public class class_71 extends class_67 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_593 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_594 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_595 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_596 = new class_306[10];
   // $FF: renamed from: e android.graphics.PointF
   static PointF field_597 = new PointF();
   // $FF: renamed from: f android.graphics.Rect
   Rect field_598 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_618() {
      return class_469.field_4047;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_619() {
      class_236 var0 = class_236.method_1549();
      field_594 = var0.field_1935.method_60(R$drawable.scout_ship);
      field_593 = var0.field_1935.method_60(R$drawable.scout_ship_dead);
      field_595 = a(field_594, field_594.method_2128(), field_594.method_2127());
      field_596 = class_107.method_948(field_594);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_593 : field_596[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_595;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && this.dj > -2.0F;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 3.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 3.0F;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = field_593;
      this.I(0);
      this.bh = false;
      return true;
   }

   public strictfp class_71(boolean var1) {
      super(var1);
      this.J(17);
      this.K(31);
      this.by = 15.0F;
      this.bz = this.by - 2.0F;
      this.bJ = 350.0F;
      this.bI = this.bJ;
      this.G = field_594;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      float var2 = 6.0F;
      float var3 = this.bv;
      float var4 = this.dh + class_296.method_2099(var3) * var2;
      float var5 = this.di + class_296.method_2098(var3) * var2;
      field_597.method_1960(var4, var5);
      return field_597;
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      return 62.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      class_236 var3 = class_236.method_1549();
      PointF var4 = this.method_478(var2);
      class_97 var5;
      if (!var1.method_282()) {
         var5 = class_97.method_698(this, var4.field_2406, var4.field_2407, this.dj);
         PointF var6 = this.B(var2);
         var5.field_862 = var6.field_2406;
         var5.field_863 = var6.field_2407;
         var5.field_895 = Color.method_3077(255, 230, 230, 50);
         var5.field_874 = 62.0F;
         var5.field_842 = var1;
         var5.field_839 = 190.0F;
         var5.field_849 = 2.0F;
         var5.field_915 = true;
         var5.field_920 = true;
         var5.field_925 = true;
         var3.field_1933.method_3323(class_525.field_4754, 0.8F, this.dh, this.di);
         var3.field_1938.method_2474(this.dh, this.di, this.dj, -1118720);
         var3.field_1938.method_2472(var5, -1118720);
      } else {
         var5 = class_97.method_698(this, var4.field_2406, var4.field_2407, this.dj - 1.0F);
         var5.field_895 = Color.method_3077(255, 0, 0, 150);
         var5.field_850 = 1.0F;
         var5.field_874 = 42.0F;
         var5.field_842 = var1;
         var5.field_839 = 220.0F;
         var5.field_849 = 1.9F;
         var5.field_920 = true;
         var5.field_925 = true;
         var3.field_1933.method_3323(class_525.field_4754, 0.8F, this.dh, this.di);
         var3.field_1938.method_2474(this.dh, this.di, this.dj, -1118720);
      }

   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 200.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 170.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 1.2F;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return 1.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 1.9F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.2F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.05F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return super.c(var1);
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return true;
   }

   // $FF: renamed from: S () boolean
   public strictfp boolean method_379() {
      return true;
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
      return this.method_618();
   }
}
