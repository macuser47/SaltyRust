package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.a.class_137;
import com.corrodinggames.rts.gameFramework.class_236;

final class g$11 extends class_137 {
   g$11(String var1) {
      super(var1);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return "Slow motion";
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1916 != 0.1F ? "Slow motion: Off" : "Slow motion: On";
   }
}
