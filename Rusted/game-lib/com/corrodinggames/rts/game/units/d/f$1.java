package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_134;
import com.corrodinggames.rts.game.units.a.class_518;
import com.corrodinggames.rts.gameFramework.d.class_432;

final class f$1 extends class_134 {
   f$1(int var1) {
      super(var1);
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return class_432.method_2744("units.extractor.upgrade.description");
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return class_432.method_2744("gui.actions.upgradeT2");
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return class_469.field_4033.method_3063(2);
   }

   // $FF: renamed from: t () float
   public float method_1100() {
      return 6.0E-4F;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      class_57 var3 = (class_57)var1;
      return var3.field_451 == 1 && var3.a(this.v(), var2) <= 0 ? super.b(var1, var2) : false;
   }

   // $FF: renamed from: B () com.corrodinggames.rts.game.units.ao
   public class_469 method_1115() {
      return null;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_518.field_4702;
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_1055() {
      return this.method_1115();
   }
}
