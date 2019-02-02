package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.bd
public class class_400 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.be
   class_401 field_3272 = new class_401(this);
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.be[]
   class_401[] field_3273 = new class_401[10];

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_2514(class_404 var1) {
      var1.method_2565("stats");
      var1.method_2539(0);
      int var2 = this.field_3273.length;
      var1.method_2541(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.field_3273[var3].method_2520(var1);
      }

      var1.method_2567("stats");
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h, boolean) void
   public strictfp void method_2515(class_463 var1, boolean var2) {
      var1.method_3030("stats");
      byte var3 = var1.method_3009();
      int var4 = var1.method_3011();
      this.field_3273 = new class_401[var4];

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field_3273[var5] = new class_401(this);
         this.field_3273[var5].method_2521(var1);
      }

      var1.method_3036("stats");
   }

   // $FF: renamed from: a () void
   public strictfp void method_2516() {
      this.field_3272 = new class_401(this);
      this.field_3273 = new class_401[10];

      for(int var1 = 0; var1 < this.field_3273.length; ++var1) {
         this.field_3273[var1] = new class_401(this);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) com.corrodinggames.rts.gameFramework.be
   public strictfp class_401 method_2517(class_39 var1) {
      return this.method_2518(var1.field_143);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) com.corrodinggames.rts.gameFramework.be
   public strictfp class_401 method_2518(class_107 var1) {
      int var2 = var1.field_1227;
      if (var2 >= 0 && var2 < this.field_3273.length) {
         class_401 var3 = this.field_3273[var2];
         return var3 == null ? this.field_3272 : var3;
      } else {
         return this.field_3272;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, com.corrodinggames.rts.game.units.aa, float) void
   public strictfp void method_2519(class_39 var1, class_39 var2, float var3) {
      if (var1 != null) {
         boolean var4 = var2.field_141;
         class_401 var5 = this.method_2517(var1);
         class_401 var6 = this.method_2517(var2);
         if (var4) {
            if (var2.method_212()) {
               ++var5.field_3282;
               ++var6.field_3285;
            } else if (var2.method_329()) {
               ++var5.field_3283;
               ++var6.field_3286;
            } else {
               ++var5.field_3281;
               ++var6.field_3284;
            }
         }
      }

      class_236 var7 = class_236.method_1549();
      if (var2.field_143 == var7.field_1915) {
         var7.method_1657(var2, var3);
      }

   }
}
