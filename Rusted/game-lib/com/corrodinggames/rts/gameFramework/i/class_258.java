package com.corrodinggames.rts.gameFramework.i;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.i.f
class class_258 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ap
   class_24 field_2285;
   // $FF: renamed from: b int
   int field_2286;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.i.c
   // $FF: synthetic field
   final class_33 field_2287;

   class_258(class_33 var1) {
      this.field_2287 = var1;
   }

   // $FF: renamed from: a (float, float) void
   public void method_1825(float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      int var4 = 0;

      for(int var5 = 0; var5 < this.field_2286; ++var5) {
         class_39 var6 = this.field_2285.method_128();
         byte var7 = 85;
         var6.dh = var1 + (float)class_296.method_2016(-var7, var7, var4 + 0);
         var6.di = var2 + (float)class_296.method_2016(-var7, var7, var4 + 1);
         var6.field_154 = (float)class_296.method_2016(-180, 180, var4 + 2);
         var4 += 3;
         var6.method_259(1);
         if (var6.dh < 0.0F) {
            var6.dh = 0.0F;
         }

         if (var6.di < 0.0F) {
            var6.di = 0.0F;
         }

         if (var6.dh > var3.field_1932.method_2612()) {
            var6.dh = var3.field_1932.method_2612();
         }

         if (var6.di > var3.field_1932.method_2613()) {
            var6.di = var3.field_1932.method_2613();
         }

         if (var5 == 0) {
            var3.field_1943.method_1244(var6);
         }
      }

   }

   public String toString() {
      if (this.field_2285 == null) {
         return "No units";
      } else {
         String var1 = "";
         var1 = var1 + this.field_2286 + "x ";
         var1 = var1 + this.field_2285.method_139() + "(s)";
         return var1;
      }
   }
}
