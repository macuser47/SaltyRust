package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.b.class_390;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.u
public class class_493 {
   // $FF: renamed from: a java.lang.String
   public String field_4515;
   // $FF: renamed from: b com.corrodinggames.rts.game.units.custom.z[]
   public class_498[] field_4516;
   // $FF: renamed from: c com.corrodinggames.rts.game.units.custom.g
   // $FF: synthetic field
   final class_479 field_4517;

   // $FF: renamed from: a () boolean
   public strictfp boolean method_3213() {
      return this.field_4516 != null && this.field_4516.length != 0;
   }

   private strictfp class_493(class_479 var1, String var2) {
      this.field_4517 = var1;
      this.field_4515 = var2;
      var1.field_4414.add(this);
   }

   // $FF: renamed from: b () void
   public strictfp void method_3214() {
      if (this.field_4515 != null && !this.field_4515.equals("") && !this.field_4515.equalsIgnoreCase("NONE")) {
         ArrayList var1 = new ArrayList();
         String[] var2 = this.field_4515.split(",");
         String[] var3 = var2;
         int var4 = var2.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            var6 = var6.trim();
            String[] var7 = var6.split("\\*");
            String var8 = var7[0];
            int var9 = 1;
            if (var7.length >= 2) {
               var9 = Integer.parseInt(var7[1]);
            }

            class_498 var10 = this.field_4517.method_3179(var8);

            for(int var11 = 0; var11 < var9; ++var11) {
               var1.add(var10);
            }
         }

         this.field_4516 = (class_498[])var1.toArray(new class_498[0]);
      } else {
         this.field_4516 = new class_498[0];
      }
   }

   // $FF: renamed from: a (float, float, float, float, com.corrodinggames.rts.gameFramework.u) com.corrodinggames.rts.gameFramework.b.e
   public strictfp class_390 method_3215(float var1, float var2, float var3, float var4, class_34 var5) {
      return this.method_3216(var1, var2, var3, var4, var5, 0);
   }

   // $FF: renamed from: a (float, float, float, float, com.corrodinggames.rts.gameFramework.u, int) com.corrodinggames.rts.gameFramework.b.e
   public strictfp class_390 method_3216(float var1, float var2, float var3, float var4, class_34 var5, int var6) {
      class_390 var7 = null;
      class_498[] var8 = this.field_4516;
      int var9 = var8.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         class_498 var11 = var8[var10];
         class_390 var12 = var11.method_3217(var1, var2, var3, var4, var5, var6);
         if (var12 != null && var7 == null) {
            var7 = var12;
         }
      }

      return var7;
   }

   // $FF: synthetic method
   class_493(class_479 var1, String var2, g$1 var3) {
      this(var1, var2);
   }
}
