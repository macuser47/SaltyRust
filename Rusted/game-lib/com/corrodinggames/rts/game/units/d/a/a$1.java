package com.corrodinggames.rts.game.units.d.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_134;
import com.corrodinggames.rts.game.units.a.class_518;

final class a$1 extends class_134 {
   a$1(int var1) {
      super(var1);
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return "-Increases HP, attack damage, and range";
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return "Upgrade";
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return 1200;
   }

   // $FF: renamed from: t () float
   public float method_1100() {
      return 0.001F;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      class_51 var3 = (class_51)var1;
      return !var3.field_382 && var3.a(this.v(), var2) <= 0 ? super.b(var1, var2) : false;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1051(class_39 var1) {
      class_51 var2 = (class_51)var1;
      return !var2.field_382;
   }

   // $FF: renamed from: B () com.corrodinggames.rts.game.units.ao
   public class_469 method_1116() {
      return null;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_518.field_4702;
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_1055() {
      return this.method_1116();
   }
}
