package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.c.class_99;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.h
public class class_135 extends class_134 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ap
   class_24 field_1363;

   public strictfp class_135(class_24 var1, Integer var2) {
      super("u_" + var1.method_144());
      class_24 var3 = class_479.method_3170(var1);
      if (var3 != null) {
         var1 = var3;
         this.e("u_" + var3.method_144());
      }

      if (var2 != null) {
         this.c = (float)var2;
      }

      this.field_1363 = var1;
   }

   // $FF: renamed from: a () java.lang.String
   public strictfp String method_1045() {
      String var1 = this.field_1363.method_140();
      boolean var2 = false;
      boolean var3 = true;
      var1 = var1 + "\n\n" + class_99.method_824(class_39.method_217(this.field_1363), false, var2, var3);
      return var1;
   }

   // $FF: renamed from: b () java.lang.String
   public strictfp String method_1044() {
      return this.field_1363.method_139();
   }

   // $FF: renamed from: c () int
   public strictfp int method_1046() {
      return this.field_1363.method_130();
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   public strictfp class_24 method_1055() {
      return this.field_1363;
   }

   // $FF: renamed from: t () float
   public strictfp float method_1100() {
      return this.field_1363.method_132();
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public strictfp class_518 method_1060() {
      return class_518.field_4703;
   }

   // $FF: renamed from: k_ () boolean
   public strictfp boolean method_1048() {
      return !this.field_1363.method_126();
   }

   // $FF: renamed from: q () boolean
   public strictfp boolean method_1049() {
      class_236 var1 = class_236.method_1549();
      return this.method_1055().method_127();
   }

   // $FF: renamed from: g () boolean
   public strictfp boolean method_1058() {
      return true;
   }
}
