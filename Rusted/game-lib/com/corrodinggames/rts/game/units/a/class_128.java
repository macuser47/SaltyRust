package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.d.class_432;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.i
public class class_128 extends class_121 {
   // $FF: renamed from: a boolean
   boolean field_1354;

   public class_128(boolean var1) {
      super("c_2");
      this.field_1354 = var1;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return !this.field_1354 ? class_432.method_2744("gui.actions.reclaimBuildingTarget.description") : class_432.method_2744("gui.actions.reclaimTarget.description");
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return !this.field_1354 ? class_432.method_2744("gui.actions.reclaimBuildingTarget") : class_432.method_2744("gui.actions.reclaimTarget");
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return 0;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_1047(class_39 var1, boolean var2) {
      return -1;
   }

   // $FF: renamed from: t () com.corrodinggames.rts.game.units.ao
   public class_469 method_1086() {
      return null;
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public class_516 method_1059() {
      return class_516.field_4687;
   }

   // $FF: renamed from: d_ () java.lang.String
   public String method_1063() {
      return this.method_1044() + "\n" + this.method_1045();
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_518.field_4705;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: h () boolean
   public boolean method_1053() {
      return true;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1068(class_39 var1) {
      if (var1 == null) {
         return true;
      } else {
         return !this.field_1354 ? var1.method_212() : true;
      }
   }

   // $FF: renamed from: k () float
   public float method_1071() {
      return !class_236.method_1654() ? 0.6F : 1.0F;
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_1055() {
      return this.method_1086();
   }
}
