package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.game.units.a.class_137;
import com.corrodinggames.rts.gameFramework.class_236;

final class g$9 extends class_137 {
   g$9(String var1) {
      super(var1);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return "Freeze high level AI logic (120secs)";
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return "Freeze AI";
   }

   // $FF: renamed from: j () java.lang.String
   public String method_1062() {
      String var1 = "Freeze AI";
      class_236 var2 = class_236.method_1549();
      class_81 var3 = null;
      var3 = class_81.method_648();
      if (var3 != null && var3 instanceof class_81) {
         int var4 = -1;
         if (var3.bk instanceof class_112) {
            class_112 var5 = (class_112)var3.bk;
            var4 = (int)var5.field_1315 / 60;
         }

         if (var4 > 0) {
            var1 = var1 + "(" + var4 + ")";
         }
      }

      return var1;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      return var1.field_143 instanceof class_112;
   }
}
