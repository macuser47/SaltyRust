package com.corrodinggames.rts.game.units.custom;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.i
class class_481 implements Comparable {
   // $FF: renamed from: a float
   public float field_4450;
   // $FF: renamed from: b float
   public float field_4451;
   // $FF: renamed from: c float
   public float field_4452;
   // $FF: renamed from: d float
   public float field_4453;

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.i) int
   public strictfp int method_3193(class_481 var1) {
      if (this.field_4450 == var1.field_4450) {
         return 0;
      } else {
         return this.field_4450 > var1.field_4450 ? 1 : -1;
      }
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_3193((class_481)var1);
   }
}
