package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.class_236;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.ag
public class class_359 {
   // $FF: renamed from: a java.util.ArrayList
   ArrayList field_2839 = new ArrayList();
   // $FF: renamed from: b int
   int field_2840;

   // $FF: renamed from: a (float) void
   public void method_2305(float var1) {
      class_360 var3;
      for(Iterator var2 = this.field_2839.iterator(); var2.hasNext(); var3.field_2842 = var1) {
         var3 = (class_360)var2.next();
      }

   }

   // $FF: renamed from: a () boolean
   public boolean method_2306() {
      return this.method_2308(0.0F, 0.0F, 1.0F, true);
   }

   // $FF: renamed from: a (float, float, float) boolean
   public boolean method_2307(float var1, float var2, float var3) {
      return this.method_2308(var1, var2, var3, false);
   }

   // $FF: renamed from: a (float, float, float, boolean) boolean
   public boolean method_2308(float var1, float var2, float var3, boolean var4) {
      if (this.field_2839.size() == 0) {
         return false;
      } else {
         if (this.field_2840 >= this.field_2839.size()) {
            this.field_2840 = 0;
         }

         class_360 var5 = (class_360)this.field_2839.get(this.field_2840);
         class_236 var6 = class_236.method_1549();
         if (var4) {
            var6.field_1933.method_3322(var5.field_2841, var5.field_2842);
         } else {
            var6.field_1933.method_3323(var5.field_2841, var5.field_2842, var1, var2);
         }

         ++this.field_2840;
         return true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, java.lang.String) com.corrodinggames.rts.game.units.custom.ag
   public static class_359 method_2309(class_479 var0, String var1) {
      return method_2310(var0, var1, (class_359)null);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, java.lang.String, com.corrodinggames.rts.game.units.custom.ag) com.corrodinggames.rts.game.units.custom.ag
   public static class_359 method_2310(class_479 var0, String var1, class_359 var2) {
      if ((var1 == null || var1.equals("")) && var2 != null) {
         return var2;
      } else {
         class_359 var3 = new class_359(var0, var1);
         return var3;
      }
   }

   public class_359() {
   }

   public class_359(class_479 var1, String var2) {
      if (var2 != null && !var2.equals("") && !var2.equalsIgnoreCase("NONE")) {
         String var3 = var1.field_4211;
         String[] var4 = var2.split(",");
         String[] var5 = var4;
         int var6 = var4.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String var8 = var5[var7];
            class_360 var9 = new class_360(this);
            String[] var10 = var8.split(":");
            String var11 = null;
            String var12 = var10[0].trim();
            if (var10.length != 1) {
               if (var10.length != 2) {
                  throw new RuntimeException("Unknown sound format:" + var8);
               }

               var11 = var10[1].trim();
            }

            if (var11 != null) {
               var9.field_2842 = Float.parseFloat(var11);
            }

            var9.field_2841 = class_479.method_3166(var3, var12, var1);
            if (var9.field_2841 != null) {
               this.field_2839.add(var9);
            }
         }

      }
   }
}
