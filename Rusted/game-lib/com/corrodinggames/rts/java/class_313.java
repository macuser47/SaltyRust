package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_310;
import com.corrodinggames.rts.gameFramework.class_315;
import com.corrodinggames.rts.gameFramework.class_320;
import com.corrodinggames.rts.gameFramework.class_402;
import com.corrodinggames.rts.gameFramework.class_439;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;

// $FF: renamed from: com.corrodinggames.rts.java.n
public class class_313 extends class_310 {
   // $FF: renamed from: a boolean
   volatile boolean field_2565;
   // $FF: renamed from: b com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio
   public OpenALAudio field_2566;
   // $FF: renamed from: c boolean
   boolean field_2567 = false;

   // $FF: renamed from: f () java.lang.Object
   public Object method_2156() {
      return this.field_2566;
   }

   // $FF: renamed from: a (float) void
   public void method_2148(float var1) {
      synchronized(this.method_2156()) {
         if (this.field_2565) {
            return;
         }

         long var3 = class_402.method_2522();
         this.field_2566.update();
         double var5 = (double)class_402.method_2523(var3);
         if (var5 > 16.0D) {
            class_236.method_1591("music poll took:" + class_402.method_2528(var5));
         }
      }

      super.method_2148(var1);
   }

   // $FF: renamed from: a (int) void
   public void method_2147(int var1) {
   }

   public class_313(OpenALAudio var1) {
      this.field_2566 = var1;
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.ao
   public class_315 method_2149(String var1) {
      return new class_318(var1, this);
   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.ap
   public class_320 method_2150() {
      class_323 var1 = new class_323(this);
      return var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.aj) void
   public void method_2151(class_439 var1) {
      this.e = var1;
   }

   // $FF: renamed from: b () void
   public void method_2152() {
      synchronized(this.method_2156()) {
         this.field_2565 = true;
      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_2153() {
      return true;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2154() {
      return true;
   }

   // $FF: renamed from: e () int
   public int method_2155() {
      return 100;
   }
}
