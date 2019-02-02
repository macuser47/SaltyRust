package com.corrodinggames.rts.game.units.d;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.h
public abstract class class_50 extends class_47 implements class_8 {
   // $FF: renamed from: A android.graphics.Paint
   public static final Paint field_370 = new Paint();
   // $FF: renamed from: B com.corrodinggames.rts.game.units.d.j
   class_277 field_371 = this.method_522();
   // $FF: renamed from: C android.graphics.Rect
   Rect field_372 = new Rect();
   // $FF: renamed from: D android.graphics.Rect
   Rect field_373 = new Rect();

   public strictfp class_50(boolean var1) {
      super(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      this.field_371.method_1920(var1);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_371.method_1921(var1);
      super.method_175(var1);
   }

   // $FF: renamed from: cg () com.corrodinggames.rts.game.units.d.j
   public strictfp class_277 method_522() {
      return new class_277(this);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      float var2;
      if (this.field_371.field_2371 != null) {
         var2 = this.by * 2.0F;
      } else {
         var2 = this.by * 3.0F;
      }

      class_39 var3 = this.field_371.method_1922(var1, var2, false, 0.0F);
      if (var3 != null && var3.di - var3.field_157 < this.di + (float)this.method_523()) {
         var3.di = this.di + (float)this.method_523() + var3.field_157;
      }

   }

   // $FF: renamed from: ch () int
   public strictfp int method_523() {
      return -100;
   }

   // $FF: renamed from: e (boolean) int
   public strictfp int method_12(boolean var1) {
      return this.field_371.method_1935(class_121.field_1347, var1, true);
   }

   // $FF: renamed from: a (java.lang.String, boolean) int
   public final strictfp int method_13(String var1, boolean var2) {
      return this.field_371.method_1934(var1, var2);
   }

   // $FF: renamed from: ci () com.corrodinggames.rts.game.units.d.i
   public strictfp class_32 method_17() {
      return this.field_371.method_1928();
   }

   // $FF: renamed from: h (com.corrodinggames.rts.game.units.ap) int
   public strictfp int method_11(class_24 var1) {
      return this.field_371.method_1933(var1);
   }

   // $FF: renamed from: cj () boolean
   public strictfp boolean method_14() {
      return this.field_371.method_1924();
   }

   // $FF: renamed from: ck () void
   public strictfp void method_16() {
      this.field_371.field_2374 = 1.0F;
   }

   // $FF: renamed from: a (android.graphics.PointF) void
   public strictfp void method_15(PointF var1) {
      this.field_371.field_2371 = var1;
   }

   // $FF: renamed from: cl () boolean
   public strictfp boolean method_9() {
      return false;
   }

   // $FF: renamed from: bk () float
   public strictfp float method_230() {
      return this.bj() && !this.field_371.method_1924() ? this.field_371.field_2374 : super.bk();
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.ap) java.lang.String
   public strictfp String method_274(class_24 var1) {
      return this.field_371.method_1936(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
      this.field_371.method_1937(var1, var2, (PointF)null, (class_39)null);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_264(class_121 var1, boolean var2) {
      this.field_371.method_1938(var1, var2);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.l) void
   public strictfp void method_265(class_121 var1) {
      this.field_371.method_1939(var1);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      if (this.bj() && !this.bi) {
         this.field_371.method_1930(var1);
      }
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return super.method_181(var1);
   }

   // $FF: renamed from: aW () void
   public strictfp void method_253() {
      this.field_371.method_1932();
      super.aW();
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      this.field_371.method_1932();
      super.a();
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      throw new RuntimeException("Unit cannot shoot");
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 0.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: bp () void
   public strictfp void method_235() {
      if (this.field_371.field_2371 != null) {
         class_236 var1 = class_236.method_1549();
         float var2 = (float)((int)(this.dh - var1.field_1965));
         float var3 = (float)((int)(this.di - var1.field_1966));
         float var4 = (float)((int)(this.field_371.field_2371.field_2406 - var1.field_1965));
         float var5 = (float)((int)(this.field_371.field_2371.field_2407 - var1.field_1966));
         var1.field_1935.method_96(var2, var3, var4, var5, field_370);
      }

   }

   static {
      field_370.method_2791(255, 0, 255, 0);
      field_370.method_2793(1.5F);
      field_370.method_2781(true);
   }
}
