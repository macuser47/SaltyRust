package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.d.class_432;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.d
public class class_124 extends class_121 {
   public class_124() {
      super("c_8");
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_1047(class_39 var1, boolean var2) {
      return -1;
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return 0;
   }

   // $FF: renamed from: m () com.corrodinggames.rts.game.units.ao
   public class_469 method_1082() {
      return null;
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public class_516 method_1059() {
      return class_516.field_4694;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_518.field_4700;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return class_432.method_2744("gui.actions.guardUnit.description");
   }

   // $FF: renamed from: d_ () java.lang.String
   public String method_1063() {
      return this.method_1044() + "\n" + this.method_1045();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return class_432.method_2744("gui.actions.guardUnit");
   }

   // $FF: renamed from: p () boolean
   public boolean method_1067() {
      return true;
   }

   // $FF: renamed from: k () float
   public float method_1071() {
      return !class_236.method_1654() ? 0.6F : 0.5F;
   }

   // $FF: renamed from: h () boolean
   public boolean method_1053() {
      return true;
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_1055() {
      return this.method_1082();
   }
}
