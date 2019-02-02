package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.bg
public final class class_402 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.k
   class_236 field_3291;
   // $FF: renamed from: b int
   public int field_3292 = 0;
   // $FF: renamed from: c int
   public static int field_3293 = 40;
   // $FF: renamed from: d int
   public int field_3294 = 0;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.bi
   class_403 field_3295 = new class_403(this);
   // $FF: renamed from: f android.graphics.Paint
   Paint field_3296 = new Paint();
   // $FF: renamed from: g android.graphics.Rect
   Rect field_3297 = new Rect();
   // $FF: renamed from: h int
   int field_3298 = -1;

   public class_402(class_236 var1) {
      this.field_3291 = var1;
   }

   // $FF: renamed from: a () long
   public static final long method_2522() {
      return System.nanoTime();
   }

   // $FF: renamed from: a (long) float
   public static final float method_2523(long var0) {
      return (float)(System.nanoTime() - var0) / 1000000.0F;
   }

   // $FF: renamed from: a (long, long) double
   public static final double method_2524(long var0, long var2) {
      return (double)(var2 - var0) / 1000000.0D;
   }

   // $FF: renamed from: a (java.lang.String, long) void
   public static final void method_2525(String var0, long var1) {
      class_236.method_1591(var0 + "" + method_2528((double)method_2523(var1)));
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.bh) void
   public final void method_2526(class_192 var1) {
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.bh) void
   public final void method_2527(class_192 var1) {
   }

   // $FF: renamed from: a (double) java.lang.String
   public static final String method_2528(double var0) {
      return "" + var0 + "ms";
   }

   // $FF: renamed from: b (double) java.lang.String
   public static final String method_2529(double var0) {
      return "" + var0 / 1000000.0D + "ms";
   }

   // $FF: renamed from: b () void
   public final void method_2530() {
   }

   // $FF: renamed from: c () void
   public final void method_2531() {
   }

   // $FF: renamed from: a (boolean, boolean) void
   public final void method_2532(boolean var1, boolean var2) {
   }
}
