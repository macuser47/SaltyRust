package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.d.class_32;
import com.corrodinggames.rts.game.units.d.class_8;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.p
public abstract class class_134 extends class_121 {
   public class_134(int var1) {
      super(var1);
   }

   public class_134(String var1) {
      super(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_1047(class_39 var1, boolean var2) {
      return !(var1 instanceof class_8) ? 99 : ((class_8)var1).method_13(this.v(), var2);
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.aa) float
   public float method_1076(class_39 var1) {
      if (!(var1 instanceof class_8)) {
         return -1.0F;
      } else {
         class_8 var2 = (class_8)var1;
         class_32 var3 = var2.method_17();
         if (var3 == null) {
            return -1.0F;
         } else {
            return !this.a(var3.field_23) ? -1.0F : var3.field_26;
         }
      }
   }

   // $FF: renamed from: t () float
   public float method_1100() {
      return 0.01F;
   }

   // $FF: renamed from: r () boolean
   public boolean method_1052() {
      return true;
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public class_516 method_1059() {
      return class_516.field_4685;
   }
}
