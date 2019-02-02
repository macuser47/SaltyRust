package com.corrodinggames.rts.game.units.b;

import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.a.class_137;
import com.corrodinggames.rts.gameFramework.d.class_432;

final class d$2 extends class_137 {
   d$2(int var1) {
      super(var1);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return "-Stop unloading";
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return class_432.method_2744("gui.actions.cancel");
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      return ((class_76)var1).field_651;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1051(class_39 var1) {
      return this.method_1050(var1, false);
   }
}
