package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.gameFramework.d.class_432;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.w
class class_118 extends class_117 {
   // $FF: renamed from: a boolean
   private boolean field_1342;

   public strictfp class_118(float var1, float var2, boolean var3) {
      super(var1, var2);
      this.field_1342 = var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.c.y) boolean
   public strictfp boolean method_1032(class_117 var1) {
      if (super.method_1032(var1) && var1 instanceof class_118) {
         class_118 var2 = (class_118)var1;
         return var2.field_1342 == this.field_1342;
      } else {
         return false;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.c.y) void
   public strictfp void method_1034(class_117 var1) {
   }

   // $FF: renamed from: b () long
   protected strictfp long method_1033() {
      return 20000L;
   }

   // $FF: renamed from: a () java.lang.String
   public strictfp String method_1035() {
      if (this.f == null) {
         if (this.field_1342) {
            this.f = class_432.method_2744("gui.log.baseDamaged");
         } else {
            this.f = class_432.method_2744("gui.log.unitDamaged");
         }
      }

      return this.f;
   }
}
