package com.corrodinggames.rts.game.units;

// $FF: renamed from: com.corrodinggames.rts.game.units.k
public enum class_279 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.k
   field_2393,
   // $FF: renamed from: b com.corrodinggames.rts.game.units.k
   field_2394,
   // $FF: renamed from: c com.corrodinggames.rts.game.units.k
   field_2395,
   // $FF: renamed from: d com.corrodinggames.rts.game.units.k
   field_2396,
   // $FF: renamed from: e com.corrodinggames.rts.game.units.k
   field_2397,
   // $FF: renamed from: f com.corrodinggames.rts.game.units.k
   field_2398,
   // $FF: renamed from: g com.corrodinggames.rts.game.units.k
   field_2399;

   private strictfp class_279() {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) boolean
   public abstract boolean method_1956(class_24 var1);

   // $FF: renamed from: a () java.lang.String
   public strictfp String method_1957() {
      return this.name();
   }

   // $FF: renamed from: a (boolean) com.corrodinggames.rts.game.units.k
   public strictfp class_279 method_1958(boolean var1) {
      return !var1 ? this.method_1959(1) : this.method_1959(-1);
   }

   // $FF: renamed from: a (int) com.corrodinggames.rts.game.units.k
   public strictfp class_279 method_1959(int var1) {
      int var2 = this.ordinal() + var1;
      var2 %= values().length;
      if (var2 < 0) {
         var2 += values().length;
      }

      return values()[var2];
   }

   // $FF: synthetic method
   class_279(g$1 var3) {
      this();
   }
}
