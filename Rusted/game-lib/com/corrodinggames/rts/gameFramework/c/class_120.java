package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.gameFramework.d.class_432;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.x
class class_120 extends class_119 {
   public strictfp class_120(float var1, float var2, class_24 var3) {
      super(var1, var2, var3);
   }

   // $FF: renamed from: a () java.lang.String
   public strictfp String method_1035() {
      if (this.f == null) {
         this.f = String.format(class_432.method_2744("gui.log.upgradeCompleted"), this.a.method_139(), this.b);
      }

      return this.f;
   }
}
