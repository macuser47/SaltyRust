package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_299;
import com.corrodinggames.rts.gameFramework.a.class_325;
import com.corrodinggames.rts.java.audio.Sound;

// $FF: renamed from: com.corrodinggames.rts.java.s
public class class_302 extends class_299 {
   // $FF: renamed from: a com.corrodinggames.rts.java.audio.Sound
   Sound field_2511;
   // $FF: renamed from: b com.corrodinggames.rts.java.q
   // $FF: synthetic field
   final class_328 field_2512;

   public class_302(class_328 var1, String var2, class_325 var3) {
      super(var1, var2, var3);
      this.field_2512 = var1;
   }

   // $FF: renamed from: a (float, float, int, int, float) void
   public void method_2104(float var1, float var2, int var3, int var4, float var5) {
      class_297 var6 = (class_297)this.field_2512.field_2629.method_1254();
      if (var6 != null) {
         var6.field_2498 = var1;
         var6.field_2499 = var2;
         var6.field_2500 = var3;
         var6.field_2501 = var4;
         var6.field_2502 = var5;
         var6.field_2497 = this;
         this.field_2512.field_2628.offer(var6);
      }
   }

   // $FF: renamed from: b (float, float, int, int, float) void
   public void method_2106(float var1, float var2, int var3, int var4, float var5) {
      if (this.field_2511 == null) {
         class_236.method_1591("Sound not loaded");
      } else {
         synchronized(this.field_2512.method_2211()) {
            float var7 = 0.0F;
            float var8 = class_296.method_2046(var1, var2);
            this.field_2511.play(var8, var5, var7);
         }
      }
   }
}
