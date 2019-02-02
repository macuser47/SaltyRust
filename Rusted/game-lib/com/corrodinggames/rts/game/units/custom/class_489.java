package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_469;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.q
public class class_489 {
   // $FF: renamed from: a java.lang.String
   String field_4506;
   // $FF: renamed from: b java.lang.String
   String field_4507;
   // $FF: renamed from: c java.lang.String
   String field_4508;
   // $FF: renamed from: d com.corrodinggames.rts.game.units.ap
   class_24 field_4509;
   // $FF: renamed from: e boolean
   boolean field_4510;

   // $FF: renamed from: a () void
   public strictfp void method_3208() {
      if (!this.field_4510) {
         this.field_4509 = class_469.method_3052(this.field_4508);
         if (this.field_4509 == null) {
            throw new class_361("Could not find unit target:" + this.field_4508 + " used on:" + this.field_4506 + " in section:" + this.field_4507);
         }
      }

   }

   // $FF: renamed from: b () void
   public strictfp void method_3209() {
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ap
   public strictfp class_24 method_3210() {
      return this.field_4509;
   }
}
