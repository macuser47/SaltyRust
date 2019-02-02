package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.utility.class_193;
import com.corrodinggames.rts.gameFramework.utility.class_210;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.ak
public class class_364 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.k
   class_193 field_2908;

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, com.corrodinggames.rts.gameFramework.utility.z, java.lang.String, java.lang.String) com.corrodinggames.rts.game.units.custom.ak
   public static class_364 method_2312(class_479 var0, class_210 var1, String var2, String var3) {
      String var4 = var1.method_1393(var2, var3, (String)null);
      return method_2313(var0, var4, var2, var3);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, java.lang.String, java.lang.String, java.lang.String) com.corrodinggames.rts.game.units.custom.ak
   public static class_364 method_2313(class_479 var0, String var1, String var2, String var3) {
      class_364 var4 = new class_364();
      if (var1 != null && !"NONE".equalsIgnoreCase(var1) && !"".equals(var1)) {
         String[] var5 = var1.split(",");
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String var8 = var5[var7];
            var8 = var8.trim();
            if (!"".equals(var8)) {
               String[] var9 = var8.split("\\*");
               var8 = var9[0];
               int var10 = 1;
               if (var9.length >= 2) {
                  var10 = Integer.parseInt(var9[1]);
               }

               class_489 var11 = new class_489();
               var11.field_4506 = var3;
               var11.field_4507 = var2;
               var11.field_4508 = var8;
               var0.field_4424.add(var11);
               if (var4.field_2908 == null) {
                  var4.field_2908 = new class_193();
               }

               for(int var12 = 0; var12 < var10; ++var12) {
                  var4.field_2908.add(var11);
               }
            }
         }

         return var4;
      } else {
         return var4;
      }
   }

   // $FF: renamed from: a () boolean
   public boolean method_2314() {
      return this.field_2908 == null || this.field_2908.size() == 0;
   }

   // $FF: renamed from: a (float, float, float, float, com.corrodinggames.rts.game.k, boolean) void
   public void method_2315(float var1, float var2, float var3, float var4, class_107 var5, boolean var6) {
      if (this.field_2908 != null && this.field_2908.size() != 0) {
         if (var5.method_924() > var5.method_925() + 200) {
            class_236.method_1591("spawnUnitsAt: Skipping, too many units already on team");
         } else {
            int var7 = 0;
            Iterator var8 = this.field_2908.iterator();

            while(var8.hasNext()) {
               class_489 var9 = (class_489)var8.next();
               class_24 var10 = var9.method_3210();
               if (var10 != null) {
                  class_39 var11 = var10.method_128();
                  var11.method_258(var5);
                  if (var11.method_314()) {
                     var11.method_258(class_107.field_1224);
                  }

                  var11.dh = var1;
                  var11.di = var2;
                  var11.dj = var3;
                  if (!var11.method_212()) {
                     var11.field_154 = var4;
                  }

                  var11.dh += (float)var7;
                  ++var7;
                  if (var6 && !var11.method_318()) {
                     class_236.method_1549().field_1939.method_763(var11);
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.k, com.corrodinggames.rts.game.k) void
   public void method_2316(class_193 var1, class_107 var2) {
      if (this.field_2908 != null && this.field_2908.size() != 0) {
         if (var2.method_924() > var2.method_925() + 200) {
            class_236.method_1591("spawnUnitsAt: Skipping, too many units already on team");
         } else {
            Iterator var3 = this.field_2908.iterator();

            while(var3.hasNext()) {
               class_489 var4 = (class_489)var3.next();
               class_24 var5 = var4.method_3210();
               if (var5 != null) {
                  class_39 var6 = var5.method_128();
                  var6.method_258(var2);
                  if (var6.method_314()) {
                     var6.method_258(class_107.field_1224);
                  }

                  var1.add(var6);
               }
            }

         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h, boolean) com.corrodinggames.rts.game.units.custom.ak
   public static class_364 method_2317(class_463 var0, boolean var1) {
      int var2 = var0.method_3011();
      if (var1 && var2 == 0) {
         return null;
      } else {
         class_364 var3 = new class_364();

         for(int var4 = 0; var4 < var2; ++var4) {
            class_24 var5 = var0.method_3023();
            if (var5 != null) {
               if (var3.field_2908 == null) {
                  var3.field_2908 = new class_193();
               }

               var3.field_2908.add(class_479.method_3186(var5));
            }
         }

         return var3;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af, com.corrodinggames.rts.game.units.custom.ak) void
   public static void method_2318(class_404 var0, class_364 var1) {
      if (var1 == null) {
         var0.method_2541(0);
      } else {
         if (var1 != null) {
            int var2 = 0;
            if (var1.field_2908 != null) {
               var2 = var1.field_2908.size();
            }

            var0.method_2541(var2);
            if (var1.field_2908 != null) {
               Iterator var3 = var1.field_2908.iterator();

               while(var3.hasNext()) {
                  class_489 var4 = (class_489)var3.next();
                  class_24 var5 = var4.method_3210();
                  var0.method_2554(var5);
               }
            }
         }

      }
   }
}
