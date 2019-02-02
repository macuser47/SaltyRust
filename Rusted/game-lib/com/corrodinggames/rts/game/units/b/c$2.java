package com.corrodinggames.rts.game.units.b;

import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.a.class_137;

final class c$2 extends class_137 {
   c$2(int var1) {
      super(var1);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return "-Dive unit underwater.";
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return "Dive";
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      return ((class_75)var1).field_635 && ((class_44)var1).bO();
   }
}
