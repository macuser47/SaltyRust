package com.corrodinggames.rts.game.units.b;

import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.a.class_137;
import com.corrodinggames.rts.gameFramework.d.class_432;

final class d$1 extends class_137 {
   d$1(int var1) {
      super(var1);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return "-Will unload all units when stopped";
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return class_432.method_2744("gui.actions.unload");
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_1047(class_39 var1, boolean var2) {
      return ((class_76)var1).field_652.size();
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      if (((class_76)var1).field_651) {
         return false;
      } else {
         return !((class_44)var1).bP() && ((class_76)var1).field_652.size() > 0;
      }
   }
}
