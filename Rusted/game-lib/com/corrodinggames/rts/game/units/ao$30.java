package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.d.class_58;

enum ao$30 {
   // $FF: renamed from: j () boolean
   public boolean method_134() {
      return true;
   }

   // $FF: renamed from: s () boolean
   public boolean method_126() {
      return true;
   }

   // $FF: renamed from: a (boolean) com.corrodinggames.rts.game.units.aa
   public class_39 method_3049(boolean var1) {
      return new class_58(var1);
   }

   // $FF: renamed from: b () void
   public void method_3050() {
      class_58.method_562();
   }

   // $FF: renamed from: c () int
   public int method_130() {
      return 1500;
   }

   // $FF: renamed from: c (int) int
   public int method_3063(int var1) {
      if (var1 == 2) {
         return 3000;
      } else {
         return var1 == 3 ? 5000 : 0;
      }
   }

   // $FF: renamed from: t () float
   public float method_132() {
      return 0.0014F;
   }
}
