package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.gameFramework.d.class_432;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.v
class class_119 extends class_117 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ap
   class_24 field_1343;
   // $FF: renamed from: b int
   int field_1344;

   public strictfp class_119(float var1, float var2, class_24 var3) {
      super(var1, var2);
      this.field_1343 = var3;
      this.field_1344 = 1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.c.y) boolean
   public strictfp boolean method_1032(class_117 var1) {
      if (super.method_1032(var1) && var1 instanceof class_119) {
         class_119 var2 = (class_119)var1;
         return var2.field_1343 == this.field_1343;
      } else {
         return false;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.c.y) void
   public strictfp void method_1034(class_117 var1) {
      this.c = var1.field_1337;
      ++this.field_1344;
      this.f = null;
      this.g = false;
   }

   // $FF: renamed from: a () java.lang.String
   public strictfp String method_1035() {
      if (this.f == null) {
         String var1 = "gui.log.unitCreated";
         if (this.field_1343.method_134()) {
            var1 = "gui.log.buildingConstructed";
         }

         this.f = String.format(class_432.method_2744(var1), this.field_1343.method_139(), this.field_1344);
      }

      return this.f;
   }
}
