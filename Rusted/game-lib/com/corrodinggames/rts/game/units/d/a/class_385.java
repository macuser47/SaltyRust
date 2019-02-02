package com.corrodinggames.rts.game.units.d.a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.a.d
class class_385 extends class_382 {
   // $FF: renamed from: b com.corrodinggames.rts.game.units.d.a.b
   // $FF: synthetic field
   final class_51 field_3053;

   strictfp class_385(class_51 var1) {
      super(var1);
      this.field_3053 = var1;
   }

   // $FF: renamed from: c () java.lang.String
   public strictfp String method_2415() {
      return class_51.field_388;
   }

   // $FF: renamed from: d () int
   public strictfp int method_2423() {
      return class_469.field_4038.method_130() + class_51.field_402.method_1046();
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_2413(int var1) {
      return class_51.method_537();
   }

   // $FF: renamed from: a () float
   strictfp float method_2408() {
      return 350.0F;
   }

   // $FF: renamed from: a (int) float
   public strictfp float method_2409(int var1) {
      return 220.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_2410(int var1) {
      return 80.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_2412(class_39 var1, int var2) {
      PointF var3 = this.c(var2);
      class_97 var4 = class_97.method_697(this.field_3053, var3.field_2406, var3.field_2407);
      PointF var5 = this.field_3053.B(var2);
      var4.field_862 = var5.field_2406;
      var4.field_863 = var5.field_2407;
      var4.field_839 = 150.0F;
      var4.field_849 = 4.0F;
      var4.field_925 = true;
      var4.field_895 = Color.method_3077(255, 190, 190, 80);
      var4.field_869 = 2;
      var4.field_867 = 0;
      var4.field_850 = 0.9F;
      PointF var6 = var1.method_310(var3.field_2406, var3.field_2407, var4.field_849, var4.field_839, this.method_2408());
      var4.field_901 = true;
      var4.field_843 = true;
      var4.field_844 = var6.field_2406;
      var4.field_845 = var6.field_2407;
      var4.field_878 = this.method_2410(var2);
      var4.field_879 = 45.0F;
      var4.field_880 = true;
      class_236 var7 = class_236.method_1549();
      var7.field_1933.method_3323(class_525.field_4759, 0.3F, var3.field_2406, var3.field_2407);
      var7.field_1938.method_2466(var3.field_2406, var3.field_2407, this.field_3053.dj, this.field_3053.bV[var2].field_4608);
      var7.field_1938.method_2472(var4, -1118482);
      class_390 var8 = var7.field_1938.method_2474(var3.field_2406, var3.field_2407, this.field_3053.dj, -1118482);
      if (var8 != null) {
         var8.field_3160 = 15.0F;
         var8.field_3161 = var8.field_3160;
      }

   }

   // $FF: renamed from: b () int
   public strictfp int method_2414() {
      return 2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.a.c) void
   public strictfp void method_2416(class_382 var1) {
      class_51 var10000 = this.field_3053;
      var10000.bJ += 300.0F;
      var10000 = this.field_3053;
      var10000.bI += 300.0F;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_2419(int var1) {
      return 2.5F;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_2420(int var1) {
      return 0.2F;
   }

   // $FF: renamed from: h (int) float
   public strictfp float method_2422(int var1) {
      return -2.0F;
   }
}
