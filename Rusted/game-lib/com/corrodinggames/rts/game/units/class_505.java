package com.corrodinggames.rts.game.units;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.game.units.ae
public final class class_505 {
   // $FF: renamed from: a android.graphics.Point
   static Point field_4637 = new Point();
   // $FF: renamed from: b android.graphics.Rect
   static Rect field_4638 = new Rect();
   // $FF: renamed from: c android.graphics.PointF
   static PointF field_4639 = new PointF();
   // $FF: renamed from: d android.graphics.PointF
   static PointF field_4640 = new PointF();
   // $FF: renamed from: e android.graphics.PointF
   static PointF field_4641 = new PointF();
   // $FF: renamed from: f android.graphics.PointF
   static PointF field_4642 = new PointF();
   // $FF: renamed from: g android.graphics.PointF
   static PointF field_4643 = new PointF();
   // $FF: renamed from: h android.graphics.PointF
   static PointF field_4644 = new PointF();
   // $FF: renamed from: i android.graphics.PointF
   static PointF field_4645 = new PointF();

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, int, int, int, int) android.graphics.Point
   private static strictfp Point method_3243(class_503 var0, int var1, int var2, int var3, int var4) {
      class_236 var6 = class_236.method_1549();
      boolean var7 = Math.abs(var4 - var2) > Math.abs(var3 - var1);
      if (var7) {
         var2 = var1;
         var1 = var4;
         var4 = var3;
      }

      if (var1 > var3) {
         int var5 = var1;
         var1 = var3;
         var3 = var5;
         var5 = var2;
         var2 = var4;
         var4 = var5;
      }

      int var8 = var3 - var1;
      int var9 = Math.abs(var4 - var2);
      int var10 = 0;
      int var12 = var2;
      byte var11;
      if (var2 < var4) {
         var11 = 1;
      } else {
         var11 = -1;
      }

      for(int var13 = var1; var13 <= var3; ++var13) {
         int var14;
         int var15;
         if (var7) {
            var14 = var12;
            var15 = var13;
         } else {
            var14 = var13;
            var15 = var12;
         }

         if (var6.field_1941.method_1682(var0, var14, var15)) {
            field_4637.method_3291(var14, var15);
            return field_4637;
         }

         var10 += var9;
         if (2 * var10 >= var8) {
            var12 += var11;
            var10 -= var8;
         }
      }

      return null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, float, float, float, float) android.graphics.PointF
   public static strictfp PointF method_3244(class_503 var0, float var1, float var2, float var3, float var4) {
      class_236 var5 = class_236.method_1549();
      var5.field_1932.method_2578(var1, var2);
      int var6 = var5.field_1932.field_3355;
      int var7 = var5.field_1932.field_3356;
      var5.field_1932.method_2578(var3, var4);
      int var8 = var5.field_1932.field_3355;
      int var9 = var5.field_1932.field_3356;
      Point var10 = method_3243(var0, var6, var7, var8, var9);
      return var10 != null ? method_3245(var0, (float)var6, (float)var7, (float)var8, (float)var9, var10.field_4722, var10.field_4723) : null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, float, float, float, float, int, int) android.graphics.PointF
   public static strictfp PointF method_3245(class_503 var0, float var1, float var2, float var3, float var4, int var5, int var6) {
      class_236 var7 = class_236.method_1549();
      field_4638.method_1911(var5, var6, var5 + 1, var6 + 1);
      field_4639.method_1960(var1, var2);
      field_4640.method_1960(var3, var4);
      field_4641.method_1961(field_4640);
      byte var8 = -1;
      field_4642.method_1960((float)field_4638.field_2352, (float)field_4638.field_2355);
      field_4643.method_1960((float)field_4638.field_2354, (float)field_4638.field_2353);
      field_4644.method_1960((float)field_4638.field_2352, (float)field_4638.field_2353);
      field_4645.method_1960((float)field_4638.field_2354, (float)field_4638.field_2355);
      if (field_4639.field_2407 < field_4640.field_2407) {
         if (!var7.field_1941.method_1682(var0, var5, var6 - 1) && class_296.method_2032(field_4639, field_4640, field_4644, field_4643)) {
            var8 = 3;
         }
      } else if (!var7.field_1941.method_1682(var0, var5, var6 + 1) && class_296.method_2032(field_4639, field_4640, field_4642, field_4645)) {
         var8 = 1;
      }

      if (field_4639.field_2406 < field_4640.field_2406) {
         if (!var7.field_1941.method_1682(var0, var5 - 1, var6) && class_296.method_2032(field_4639, field_4640, field_4644, field_4642)) {
            var8 = 2;
         }
      } else if (!var7.field_1941.method_1682(var0, var5 + 1, var6) && class_296.method_2032(field_4639, field_4640, field_4643, field_4645)) {
         var8 = 0;
      }

      if (var8 == -1) {
         return null;
      } else {
         if (var8 == 0) {
            field_4641.field_2406 = (float)(var5 + 1) + 0.01F;
         }

         if (var8 == 2) {
            field_4641.field_2406 = (float)var5 - 0.01F;
         }

         if (var8 == 1) {
            field_4641.field_2407 = (float)(var6 + 1) + 0.01F;
         }

         if (var8 == 3) {
            field_4641.field_2407 = (float)var6 - 0.01F;
         }

         return field_4641;
      }
   }
}
