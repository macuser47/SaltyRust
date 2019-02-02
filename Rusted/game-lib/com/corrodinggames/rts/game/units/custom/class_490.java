package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.class_24;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.s
public class class_490 extends class_489 {
   // $FF: renamed from: a () void
   public strictfp void method_3208() {
      if (!this.e) {
         this.d = class_479.method_3171(this.c);
         if (this.d == null) {
            throw new class_361("Could not find customUnit target:" + this.c + " used on:" + this.a + " in section:" + this.b);
         }
      }

   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.custom.g
   public strictfp class_479 method_3211() {
      return (class_479)this.d;
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_3210() {
      return this.method_3211();
   }
}
