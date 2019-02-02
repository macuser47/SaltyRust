package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.class_210;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.m
class class_485 {
   // $FF: renamed from: a java.lang.String
   public String field_4485;
   // $FF: renamed from: b int
   public int field_4486;
   // $FF: renamed from: c int
   public int field_4487;
   // $FF: renamed from: d float
   public float field_4488;
   // $FF: renamed from: e float
   public float field_4489;
   // $FF: renamed from: f float
   public float field_4490;
   // $FF: renamed from: g boolean
   public boolean field_4491;
   // $FF: renamed from: h float
   public float field_4492;
   // $FF: renamed from: i float
   public float field_4493;
   // $FF: renamed from: j java.util.ArrayList
   public ArrayList field_4494 = new ArrayList();
   // $FF: renamed from: k boolean
   public boolean field_4495 = true;
   // $FF: renamed from: l float
   public float field_4496;
   // $FF: renamed from: m boolean
   public boolean field_4497;
   // $FF: renamed from: n java.util.ArrayList
   public ArrayList field_4498 = new ArrayList();
   // $FF: renamed from: o float
   public float field_4499;

   public strictfp class_485(String var1) {
      this.field_4485 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g) void
   public strictfp void method_3199(class_479 var1) {
      Iterator var2 = this.field_4494.iterator();

      class_484 var3;
      boolean var4;
      do {
         do {
            if (!var2.hasNext()) {
               return;
            }

            var3 = (class_484)var2.next();
         } while(var3.field_4479 != class_483.field_4469 && var3.field_4479 != class_483.field_4470 && var3.field_4479 != class_483.field_4472 && var3.field_4479 != class_483.field_4471);

         var4 = false;
         class_358[] var5 = var1.field_4411;
         int var6 = var5.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            class_358 var8 = var5[var7];
            if (var3.field_4481.equals(var8.field_2806)) {
               var3.field_4480 = var8.field_2805;
               var4 = true;
               break;
            }
         }
      } while(var4);

      throw new class_361("Cannot find leg:" + var3.field_4481 + " for animation:" + this.field_4485);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.h) boolean
   public strictfp boolean method_3200(class_482 var1) {
      Iterator var2 = this.field_4498.iterator();

      class_482 var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (class_482)var2.next();
      } while(var3 != var1);

      return true;
   }

   // $FF: renamed from: a () boolean
   public strictfp boolean method_3201() {
      return this.field_4497;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, com.corrodinggames.rts.gameFramework.utility.z, java.lang.String, java.lang.String) void
   public strictfp void method_3202(class_479 var1, class_210 var2, String var3, String var4) {
      boolean var5 = false;
      String var6 = null;
      String var7 = var2.method_1393(var3, var4 + "onActions", (String)null);
      String var11;
      if (var7 != null) {
         String[] var8 = var7.split(",");
         int var9 = var8.length;

         for(int var10 = 0; var10 < var9; ++var10) {
            var11 = var8[var10];
            var11 = var11.trim();
            if (!var11.equals("")) {
               class_482 var12 = class_482.method_3194(var11);
               if (var12 == null) {
                  throw new class_361("Unknown action type: " + var11 + " on animation:" + this.field_4485);
               }

               class_485 var13 = var1.method_3175(var12);
               if (var13 != null) {
                  throw new class_361("Cannot add action: " + var11 + " to:" + this.field_4485 + " it already exists on:" + var13.field_4485);
               }

               this.field_4498.add(var12);
            }
         }
      }

      this.field_4499 = var2.method_1398(var3, var4 + "onActionsQueuedUnitPlayAt", 0.0F);
      this.field_4486 = var2.method_1397(var3, var4 + "start", 0);
      this.field_4487 = var2.method_1397(var3, var4 + "end", -1);
      if (this.field_4487 != -1 && this.field_4487 < this.field_4486) {
         throw new RuntimeException("animationEnd cannot before animationStart on animation:" + this.field_4485);
      } else {
         this.field_4492 = var2.method_1403(var3, var4 + "blendIn", -1.0F);
         this.field_4493 = var2.method_1403(var3, var4 + "blendOut", -1.0F);
         this.field_4488 = var2.method_1398(var3, var4 + "scale_start", 1.0F);
         this.field_4489 = var2.method_1398(var3, var4 + "scale_end", 1.0F);
         Float var17 = var2.method_1398(var3, var4 + "speed", (Float)null);
         if (var17 != null) {
            this.field_4490 = var17;
            var5 = true;
            var6 = "speed";
         } else {
            this.field_4490 = 40.0F;
         }

         this.field_4491 = var2.method_1390(var3, var4 + "pingPong", false);
         float var18 = 1.0F * this.field_4490;
         float var19 = var2.method_1398(var3, var4 + "KeyframeTimeScale", 1.0F);
         class_484 var20;
         if (this.field_4487 != -1) {
            var5 = true;
            var6 = "animationEnd";
            var20 = new class_484();
            var20.field_4479 = class_483.field_4467;
            this.field_4494.add(var20);
            int var21 = this.field_4487 - this.field_4486 + 1;
            var18 *= (float)var21;
            var20.method_3195(0.0F, (float)this.field_4486);
            var20.method_3195(var18, (float)this.field_4487 + 0.99F);
         }

         if (this.field_4488 != 1.0F || this.field_4489 != 1.0F) {
            var5 = true;
            var6 = "animationScaleX";
            var20 = new class_484();
            var20.field_4479 = class_483.field_4468;
            this.field_4494.add(var20);
            var20.method_3195(0.0F, this.field_4488);
            var20.method_3195(var18, this.field_4489);
         }

         if (var5) {
            this.field_4496 = var18;
         }

         var11 = var4 + "leg";
         String var22 = var4 + "arm";
         ArrayList var23 = var2.method_1411(var3, var11, var22);
         var23.addAll(var2.method_1410(var3, var4 + "turret"));
         var23.addAll(var2.method_1410(var3, var4 + "body"));
         var23.addAll(var2.method_1410(var3, var4 + "effect"));
         Iterator var14 = var23.iterator();

         while(var14.hasNext()) {
            String var15 = (String)var14.next();
            boolean var16 = false;
            if (!var16) {
               if (var5) {
                  throw new class_361("Cannot mix new (" + var15 + ") and old style (" + var6 + ") animations on:" + this.field_4485);
               }

               this.method_3204(var2, var3, var4, var15);
            }
         }

         ArrayList var24 = new ArrayList();
         this.field_4495 = false;
         Iterator var25 = this.field_4494.iterator();

         while(var25.hasNext()) {
            class_484 var26 = (class_484)var25.next();
            var26.method_3196(var19);
            var26.method_3197();
            if (this.field_4496 < var26.field_4482) {
               this.field_4496 = var26.field_4482;
            }

            if (var26.field_4483.length > 0) {
               this.field_4497 = true;
               if (var26.field_4479 != class_483.field_4467 && var26.field_4479 != class_483.field_4468) {
                  this.field_4495 = true;
               }

               var24.add(var26);
            }
         }

         this.field_4494 = var24;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) com.corrodinggames.rts.game.units.custom.j
   public strictfp class_484 method_3203(String var1, String var2) {
      Object var5 = null;
      class_483 var3;
      int var4;
      if (!var2.startsWith("leg") && !var2.startsWith("arm")) {
         if (var2.startsWith("turret")) {
            var4 = Integer.parseInt(var2.substring("turret".length()));
            --var4;
            if (var1.equalsIgnoreCase("x")) {
               var3 = class_483.field_4473;
            } else {
               if (!var1.equalsIgnoreCase("y")) {
                  throw new class_361("Unknown turret animation type:" + var1 + " on animation:" + this.field_4485);
               }

               var3 = class_483.field_4474;
            }
         } else {
            if (!var2.startsWith("body")) {
               throw new class_361("Unknown animation target:" + var2 + " on animation:" + this.field_4485);
            }

            var4 = 0;
            if (var1.equalsIgnoreCase("scale")) {
               var3 = class_483.field_4468;
            } else {
               if (!var1.equalsIgnoreCase("frame")) {
                  throw new class_361("Unknown body animation type:" + var1 + " on animation:" + this.field_4485);
               }

               var3 = class_483.field_4467;
            }
         }
      } else {
         var4 = -1;
         if (var1.equalsIgnoreCase("x")) {
            var3 = class_483.field_4469;
         } else if (var1.equalsIgnoreCase("y")) {
            var3 = class_483.field_4470;
         } else if (var1.equalsIgnoreCase("dir")) {
            var3 = class_483.field_4471;
         } else {
            if (!var1.equalsIgnoreCase("height")) {
               throw new class_361("Unknown leg/arm animation type:" + var1 + " on animation:" + this.field_4485);
            }

            var3 = class_483.field_4472;
         }
      }

      Iterator var6 = this.field_4494.iterator();

      class_484 var7;
      do {
         if (!var6.hasNext()) {
            class_484 var8 = new class_484();
            var8.field_4479 = var3;
            var8.field_4480 = var4;
            var8.field_4481 = var2;
            this.field_4494.add(var8);
            return var8;
         }

         var7 = (class_484)var6.next();
      } while(var7.field_4479 != var3 || !var2.equals(var7.field_4481));

      return var7;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.z, java.lang.String, java.lang.String, java.lang.String) void
   public strictfp void method_3204(class_210 var1, String var2, String var3, String var4) {
      String var5 = var4.substring(var3.length());
      String var6 = var5.split("_")[0];
      String var7 = var3 + var6 + "_";
      String var10 = var4.substring(var7.length());

      float var9;
      try {
         var9 = var1.method_1404(var10, false);
      } catch (NumberFormatException var24) {
         throw new class_361("Failed to read time:" + var10 + " in key:" + var4 + " section:" + var2 + " expected a float with optional 's' or 'ms' postfix");
      }

      String var11 = var1.method_1392(var2, var4);
      if (var11.startsWith("{") && var11.endsWith("}")) {
         var11 = var11.substring(1, var11.length() - 1);
         String[] var12 = var11.split(",");
         String[] var13 = var12;
         int var14 = var12.length;

         for(int var15 = 0; var15 < var14; ++var15) {
            String var16 = var13[var15];
            String[] var17 = var16.split(":");
            if (var17.length != 2) {
               throw new class_361("Unknown format on part:" + var16 + " of: " + var11, var2, var4);
            }

            String var18 = var17[0].trim();
            String var19 = var17[1].trim();
            class_484 var20 = this.method_3203(var18, var6);

            float var21;
            try {
               var21 = Float.parseFloat(var19);
            } catch (NumberFormatException var23) {
               throw new class_361("Failed to read float:" + var19 + " as part of key:" + var4 + " section:" + var2);
            }

            var20.method_3195(var9, var21);
         }

      } else {
         throw new class_361("Unknown format:" + var11, var2, var4);
      }
   }
}
