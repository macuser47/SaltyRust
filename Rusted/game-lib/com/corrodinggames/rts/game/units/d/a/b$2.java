package com.corrodinggames.rts.game.units.d.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_134;
import com.corrodinggames.rts.game.units.a.class_518;
import com.corrodinggames.rts.gameFramework.d.class_432;

final class b$2 extends class_134 {
   b$2(int var1) {
      super(var1);
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return "-Extra attack damage, and range.\n-Large amount of HP\n-Self repair";
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return class_432.method_2744("gui.actions.upgradeToGunT3");
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return 11000;
   }

   // $FF: renamed from: t () float
   public float method_1100() {
      return 3.0E-4F;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      class_51 var3 = (class_51)var1;
      return var3.a(class_121.field_1347, var2) > 0 ? false : super.b(var1, var2);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1051(class_39 var1) {
      class_51 var2 = (class_51)var1;
      return var2.field_384 instanceof class_383;
   }

   // $FF: renamed from: B () com.corrodinggames.rts.game.units.ao
   public class_469 method_1106() {
      return null;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_518.field_4702;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) void
   public void method_1065(class_39 var1) {
      class_51 var2 = (class_51)var1;
      var2.method_525(class_51.field_387);
      class_51.method_540(var2);
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_1055() {
      return this.method_1106();
   }
}
