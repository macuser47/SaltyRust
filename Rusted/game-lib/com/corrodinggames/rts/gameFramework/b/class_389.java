package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.b.b
public class class_389 {
   // $FF: renamed from: a boolean
   boolean field_3112 = false;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   class_306 field_3113 = null;
   // $FF: renamed from: c android.graphics.Paint
   Paint field_3114 = new class_441();
   // $FF: renamed from: d android.graphics.RectF
   RectF field_3115 = new RectF();
   // $FF: renamed from: e float
   float field_3116 = 0.0F;
   // $FF: renamed from: f float
   float field_3117 = 0.0F;

   // $FF: renamed from: a () boolean
   public boolean method_2448() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1937.renderClouds;
   }

   // $FF: renamed from: b () void
   public void method_2449() {
      class_236 var1 = class_236.method_1549();
      this.field_3113 = var1.field_1935.method_61(R$drawable.noise, false);
      this.field_3112 = true;
   }

   // $FF: renamed from: a (float) void
   public void method_2450(float var1) {
      if (this.method_2448()) {
         if (!this.field_3112) {
            this.method_2449();
         }

         this.field_3116 += 0.2F * var1;
         this.field_3117 += 0.07F * var1;
         this.field_3116 %= (float)this.field_3113.method_2128();
         this.field_3117 %= (float)this.field_3113.method_2127();
      }
   }

   // $FF: renamed from: b (float) void
   public void method_2451(float var1) {
      if (this.method_2448()) {
         if (!this.field_3112) {
            this.method_2449();
         }

         class_236 var2 = class_236.method_1549();
         var2.field_1935.method_87();
         float var3 = 3.0F;
         var2.field_1935.method_92(var3, var3);
         float var4 = (float)((int)class_296.method_2046(-var2.field_1965 / var3, 0.0F));
         float var5 = (float)((int)class_296.method_2046(-var2.field_1966 / var3, 0.0F));
         this.field_3115.method_1969(var4, var5, (float)((int)(var2.field_1969 / var3)), (float)((int)(var2.field_1970 / var3)));
         this.field_3114.method_2788(-16777216);
         this.field_3114.method_2790(35);
         float var6 = var2.field_1965 / var3 + var4;
         float var7 = var2.field_1966 / var3 + var5;
         var6 += this.field_3116;
         var7 += this.field_3117;
         var2.field_1935.method_74(this.field_3113, this.field_3115, this.field_3114, var6, var7, 0, 0);
         var2.field_1935.method_88();
      }
   }
}
