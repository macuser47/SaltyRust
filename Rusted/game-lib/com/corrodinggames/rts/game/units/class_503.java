package com.corrodinggames.rts.game.units;

import java.util.Locale;

// $FF: renamed from: com.corrodinggames.rts.game.units.ac
public enum class_503 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ac
   field_4617,
   // $FF: renamed from: b com.corrodinggames.rts.game.units.ac
   field_4618,
   // $FF: renamed from: c com.corrodinggames.rts.game.units.ac
   field_4619,
   // $FF: renamed from: d com.corrodinggames.rts.game.units.ac
   field_4620,
   // $FF: renamed from: e com.corrodinggames.rts.game.units.ac
   field_4621,
   // $FF: renamed from: f com.corrodinggames.rts.game.units.ac
   field_4622,
   // $FF: renamed from: g com.corrodinggames.rts.game.units.ac
   field_4623,
   // $FF: renamed from: h com.corrodinggames.rts.game.units.ac
   field_4624;

   // $FF: renamed from: a (java.lang.String, java.lang.String) com.corrodinggames.rts.game.units.ac
   public static strictfp class_503 method_3232(String var0, String var1) {
      try {
         return valueOf(var0.toUpperCase(Locale.ROOT));
      } catch (IllegalArgumentException var8) {
         String var3 = "";
         class_503[] var4 = values();
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            class_503 var7 = var4[var6];
            var3 = var3 + ", " + var7.toString();
         }

         throw new IllegalArgumentException("Unknown movement type:'" + var0 + "' possible type:" + var3 + " on key:" + var1);
      }
   }
}
