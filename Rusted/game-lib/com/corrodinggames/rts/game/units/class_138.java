package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.a.class_137;
import com.corrodinggames.rts.game.units.a.class_516;
import com.corrodinggames.rts.game.units.a.class_518;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_34;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.i
class class_138 extends class_137 {
   // $FF: renamed from: a boolean
   boolean field_1367;
   // $FF: renamed from: b boolean
   boolean field_1368;

   public strictfp class_138(boolean var1, boolean var2) {
      super("changeTeam" + var1 + "d:" + var2);
      this.field_1367 = var1;
      this.field_1368 = var2;
   }

   // $FF: renamed from: b () java.lang.String
   public strictfp String method_1044() {
      if (this.field_1368) {
         return "sandbox team";
      } else {
         return this.field_1367 ? "<- Set team" : "Set team ->";
      }
   }

   // $FF: renamed from: j () java.lang.String
   public strictfp String method_1062() {
      if (!this.field_1368) {
         return this.field_1367 ? "<-" : "->";
      } else {
         class_236 var1 = class_236.method_1549();
         class_107 var2 = null;
         Iterator var3 = class_34.field_79.iterator();

         while(var3.hasNext()) {
            class_34 var4 = (class_34)var3.next();
            if (var4 instanceof class_44) {
               class_44 var5 = (class_44)var4;
               if (var5.bS && var1.field_1939.method_769(var5)) {
                  var2 = var5.bk;
               }
            }
         }

         String var6 = "";
         if (var2 != null) {
            var6 = var6 + "Team - " + (var2.field_1227 + 1) + "";
         }

         return var6;
      }
   }

   // $FF: renamed from: a () java.lang.String
   public strictfp String method_1045() {
      return "Change targeted team for editor";
   }

   // $FF: renamed from: k () float
   public strictfp float method_1071() {
      return !class_236.method_1654() ? 0.8F : 0.5F;
   }

   // $FF: renamed from: l () int
   public strictfp int method_1072() {
      return this.field_1368 ? 2 : 4;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public strictfp class_518 method_1060() {
      return this.field_1368 ? class_518.field_4706 : super.method_1060();
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public strictfp class_516 method_1059() {
      return this.field_1368 ? class_516.field_4691 : super.method_1059();
   }
}
