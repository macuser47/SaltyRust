package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_503;

class a$4 extends class_150 {
   // $FF: renamed from: a com.corrodinggames.rts.game.a.a
   // $FF: synthetic field
   final class_112 field_1405;

   a$4(class_112 var1, String var2) {
      super(var1, var2);
      this.field_1405 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) boolean
   public boolean method_1143(class_24 var1) {
      return this.field_1405.field_1306.method_1143(var1) && var1.method_137() == class_503.field_4620;
   }
}
