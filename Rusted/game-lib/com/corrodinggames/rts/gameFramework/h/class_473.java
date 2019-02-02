package com.corrodinggames.rts.gameFramework.h;

import android.graphics.Rect;
import android.graphics.RectF;
import javax.microedition.khronos.opengles.GL10;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.b
public class class_473 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.d
   class_471 field_4122;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   class_306 field_4123;
   // $FF: renamed from: c float
   float field_4124;
   // $FF: renamed from: d float
   float field_4125;
   // $FF: renamed from: e android.graphics.Rect
   Rect field_4126;
   // $FF: renamed from: f android.graphics.RectF
   RectF field_4127;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.a
   // $FF: synthetic field
   final class_472 field_4128;

   // $FF: renamed from: a (javax.microedition.khronos.opengles.GL10) void
   void method_3071(GL10 var1) {
      if (this.field_4128.field_4114 != this.field_4123.field_2527) {
         var1.glBindTexture(3553, this.field_4123.field_2527);
         this.field_4128.field_4114 = this.field_4123.field_2527;
      }

      var1.glPushMatrix();
      var1.glLoadIdentity();
      if (this.field_4122 != class_471.field_4098) {
         var1.glTranslatef(this.field_4124, this.field_4128.field_4106 - this.field_4125 - (float)this.field_4123.method_2127(), 0.0F);
         throw new RuntimeException("Not supported");
      } else {
         var1.glTranslatef(this.field_4127.field_2416, this.field_4128.field_4106 - this.field_4127.field_2417 - (float)this.field_4126.method_1905(), 0.0F);
         class_466 var2 = this.field_4128.field_4113;
         float var3 = (float)this.field_4126.field_2352 / (float)this.field_4123.method_2128();
         float var4 = (float)this.field_4126.field_2354 / (float)this.field_4123.method_2128();
         float var5 = (float)this.field_4126.field_2353 / (float)this.field_4123.method_2127();
         float var6 = (float)this.field_4126.field_2355 / (float)this.field_4123.method_2127();
         if (this.field_4128.field_4115 == this.field_4126.method_1905() && this.field_4128.field_4116 == this.field_4126.method_1904()) {
            var2.method_3043(0, 0, var3, var6);
            var2.method_3043(1, 0, var4, var6);
            var2.method_3043(0, 1, var3, var5);
            var2.method_3043(1, 1, var4, var5);
         } else {
            this.field_4128.field_4115 = this.field_4126.method_1905();
            this.field_4128.field_4116 = this.field_4126.method_1904();
            var2.method_3044(0, 0, 0.0F, 0.0F, 0.0F, var3, var6, (float[])null);
            var2.method_3044(1, 0, (float)this.field_4126.method_1904(), 0.0F, 0.0F, var4, var6, (float[])null);
            var2.method_3044(0, 1, 0.0F, (float)this.field_4126.method_1905(), 0.0F, var3, var5, (float[])null);
            var2.method_3044(1, 1, (float)this.field_4126.method_1904(), (float)this.field_4126.method_1905(), 0.0F, var4, var5, (float[])null);
         }

         var2.method_3046(var1, true, false);
         var1.glPopMatrix();
      }
   }
}
