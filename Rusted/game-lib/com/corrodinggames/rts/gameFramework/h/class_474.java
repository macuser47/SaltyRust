package com.corrodinggames.rts.gameFramework.h;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import android.graphics.Region.Op;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.g
public class class_474 implements class_23 {
   // $FF: renamed from: a android.graphics.Canvas
   public Canvas field_4129;
   // $FF: renamed from: b boolean
   boolean field_4130 = false;

   public class_474(Canvas var1) {
      this.field_4129 = var1;
   }

   // $FF: renamed from: a (android.graphics.Rect, android.graphics.Region.Op) void
   public void method_105(Rect var1, Op var2) {
      this.field_4129.method_3090(var1, var2);
   }

   // $FF: renamed from: a (android.graphics.RectF, android.graphics.Region.Op) void
   public void method_106(RectF var1, Op var2) {
      this.field_4129.method_3089(var1, var2);
   }

   // $FF: renamed from: a (android.graphics.Bitmap, float, float, android.graphics.Paint) void
   public void method_107(Bitmap var1, float var2, float var3, Paint var4) {
      this.field_4129.method_3098(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (android.graphics.Bitmap, android.graphics.Matrix, android.graphics.Paint) void
   public void method_108(Bitmap var1, Matrix var2, Paint var3) {
      this.field_4129.method_3100(var1, var2, var3);
   }

   // $FF: renamed from: a (android.graphics.Bitmap, android.graphics.Rect, android.graphics.RectF, android.graphics.Paint) void
   public void method_109(Bitmap var1, Rect var2, RectF var3, Paint var4) {
      this.field_4129.method_3099(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (float, float, float, android.graphics.Paint) void
   public void method_110(float var1, float var2, float var3, Paint var4) {
      this.field_4129.method_3097(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (int, android.graphics.PorterDuff.Mode) void
   public void method_111(int var1, Mode var2) {
      this.field_4129.method_3092(var1, var2);
   }

   // $FF: renamed from: a (int) void
   public void method_112(int var1) {
      this.field_4129.method_3091(var1);
   }

   // $FF: renamed from: a (float, float, float, float, android.graphics.Paint) void
   public void method_113(float var1, float var2, float var3, float var4, Paint var5) {
      this.field_4129.method_3094(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (float[], int, int, android.graphics.Paint) void
   public void method_114(float[] var1, int var2, int var3, Paint var4) {
      this.field_4129.method_3093(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (android.graphics.Rect, android.graphics.Paint) void
   public void method_115(Rect var1, Paint var2) {
      this.field_4129.method_3096(var1, var2);
   }

   // $FF: renamed from: a (android.graphics.RectF, android.graphics.Paint) void
   public void method_116(RectF var1, Paint var2) {
      this.field_4129.method_3095(var1, var2);
   }

   // $FF: renamed from: a (java.lang.String, float, float, android.graphics.Paint) void
   public void method_117(String var1, float var2, float var3, Paint var4) {
      this.field_4129.method_3101(var1, var2, var3, var4);
   }

   public boolean equals(Object var1) {
      return this.field_4129.equals(var1);
   }

   public int hashCode() {
      return this.field_4129.hashCode();
   }

   // $FF: renamed from: a () void
   public void method_118() {
      this.field_4129.method_3084();
   }

   // $FF: renamed from: a (float, float, float) void
   public void method_119(float var1, float var2, float var3) {
      this.field_4129.method_3088(var1, var2, var3);
   }

   // $FF: renamed from: b () void
   public void method_120() {
      this.field_4129.method_3083();
   }

   // $FF: renamed from: a (float, float, float, float) void
   public void method_122(float var1, float var2, float var3, float var4) {
      this.field_4129.method_3087(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (float, float) void
   public void method_121(float var1, float var2) {
      this.field_4129.method_3086(var1, var2);
   }

   // $FF: renamed from: a (android.graphics.Bitmap) void
   public void method_123(Bitmap var1) {
      this.field_4129.method_3082(var1);
   }

   public String toString() {
      return this.field_4129.toString();
   }

   // $FF: renamed from: b (float, float) void
   public void method_124(float var1, float var2) {
      this.field_4129.method_3085(var1, var2);
   }

   // $FF: renamed from: a (boolean) void
   public void method_103(boolean var1) {
      this.field_4130 = var1;
   }

   // $FF: renamed from: c () boolean
   public boolean method_104() {
      return this.field_4130;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.i) void
   public void method_125(class_27 var1) {
      var1.method_146(class_236.method_1549().field_1935);
   }
}
