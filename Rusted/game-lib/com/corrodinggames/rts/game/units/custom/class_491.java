package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.a.class_121;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.r
public class class_491 extends class_490 {
   // $FF: renamed from: f java.lang.String
   String field_4511;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.a.l
   class_121 field_4512;

   // $FF: renamed from: a () void
   public strictfp void method_3208() {
   }

   // $FF: renamed from: b () void
   public strictfp void method_3209() {
      super.method_3208();
      class_479 var1 = this.e();
      this.field_4512 = var1.method_3192(this.field_4511);
      if (this.field_4512 == null) {
         throw new class_361("Could not find action:" + this.field_4511 + " on unit target:" + this.c + " used on:" + this.a + " in section:" + this.b);
      }
   }

   // $FF: renamed from: d () com.corrodinggames.rts.game.units.a.l
   public strictfp class_121 method_3212() {
      return this.field_4512;
   }
}
