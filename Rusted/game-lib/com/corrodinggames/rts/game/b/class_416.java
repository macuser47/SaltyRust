package com.corrodinggames.rts.game.b;

import android.util.Log;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.f.class_71;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import java.util.Properties;

// $FF: renamed from: com.corrodinggames.rts.game.b.g
public final class class_416 {
   // $FF: renamed from: a com.corrodinggames.rts.game.b.i
   public class_420 field_3423;
   // $FF: renamed from: b int
   public int field_3424;
   // $FF: renamed from: c boolean
   public boolean field_3425;
   // $FF: renamed from: d boolean
   public boolean field_3426;
   // $FF: renamed from: e boolean
   public boolean field_3427;
   // $FF: renamed from: f boolean
   public boolean field_3428;
   // $FF: renamed from: g byte
   public byte field_3429;
   // $FF: renamed from: h boolean
   public boolean field_3430;
   // $FF: renamed from: i boolean
   public boolean field_3431;

   // $FF: renamed from: a () com.corrodinggames.rts.game.b.g
   public strictfp class_416 method_2637() {
      class_416 var1 = new class_416();
      var1.field_3423 = this.field_3423;
      var1.field_3424 = this.field_3424;
      var1.field_3425 = this.field_3425;
      var1.field_3426 = this.field_3426;
      var1.field_3427 = this.field_3427;
      var1.field_3428 = this.field_3428;
      var1.field_3429 = this.field_3429;
      var1.field_3430 = this.field_3430;
      var1.field_3431 = this.field_3431;
      return var1;
   }

   // $FF: renamed from: a (java.lang.String) void
   public static strictfp void method_2638(String var0) {
      class_236.method_1588(var0);
      class_236.method_1549().method_1608("Missing unit data while loading map: " + var0, 1);

      try {
         Thread.sleep(2L);
      } catch (InterruptedException var2) {
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b, com.corrodinggames.rts.game.b.e, com.corrodinggames.rts.game.b.i, int, short, short) com.corrodinggames.rts.game.b.g
   public static strictfp class_416 method_2639(class_408 var0, class_425 var1, class_420 var2, int var3, short var4, short var5) {
      Properties var6 = var2.method_2670(var2.field_3500 + var3);
      if (var6 != null) {
         String var7 = var6.getProperty("showFog");
         if (var7 != null) {
            int var17 = Integer.parseInt(var7);
            class_236 var18 = class_236.method_1549();
            var0.method_2579(var4, var5);
            float var19 = (float)(var0.field_3355 + var0.field_3332);
            float var20 = (float)(var0.field_3356 + var0.field_3333);
            var18.field_1932.method_2614(var19, var20, var17, var18.field_1915, false);
            return null;
         }

         String var8 = var6.getProperty("unit");
         String var9 = var6.getProperty("customUnit");
         if (var8 != null || var9 != null) {
            String var10 = var6.getProperty("team");
            class_107 var11 = null;
            if ("none".equalsIgnoreCase(var10)) {
               var11 = class_107.method_954(-1);
            } else {
               if (var10 == null) {
                  class_236.method_1592("map", "warning: unit has no team property:" + var8 + " at: " + var4 + "," + var5);
                  return null;
               }

               var11 = class_107.method_954(Integer.valueOf(var10));
               if (var11 == null) {
                  class_236.method_1592("map", "skipping unit without player:" + var8 + " at: " + var4 + "," + var5);
                  return null;
               }
            }

            Object var12 = null;
            String var22;
            if (var9 != null) {
               class_479 var13 = class_479.method_3171(var9);
               if (var13 == null) {
                  var22 = "Could not find custom unit of:" + var9 + " at x:" + var4 + ", y:" + var5;
                  method_2638(var22);
                  throw new class_424(var22);
               }

               class_24 var14 = class_479.method_3170(var13);
               if (var14 != null) {
                  if (var14 instanceof class_479) {
                     var13 = (class_479)var14;
                  } else {
                     class_236.method_1588("replacement not a custom unit:" + var14.method_141());
                  }
               }

               var12 = class_479.method_3172(false, var13);
               if (var12 == null) {
                  String var15 = "Metadata unit is null for:" + var9;
                  method_2638(var15);
                  throw new RuntimeException(var15);
               }
            } else {
               class_24 var21 = class_469.method_3052(var8);
               if (var21 != null) {
                  var12 = var21.method_128();
               }

               if (var12 == null && "scoutShip".equalsIgnoreCase(var8)) {
                  var12 = new class_71(false);
               }

               if (var12 == null) {
                  var22 = "Could not find unit:" + var8 + " at: " + var4 + "," + var5;
                  method_2638(var22);
                  throw new class_424(var22);
               }
            }

            var0.method_2579(var4, var5);
            ((class_39)var12).dh = (float)var0.field_3355 + ((class_39)var12).method_323();
            ((class_39)var12).di = (float)var0.field_3356 + ((class_39)var12).method_324();
            if (var11 == null) {
               throw new RuntimeException("team has not been set for:" + var8);
            }

            ((class_39)var12).method_258(var11);
            if (var6.getProperty("type") != null) {
               ((class_39)var12).method_303(var6.getProperty("type"));
            }

            if (var6.getProperty("randomRotate") != null) {
               ((class_39)var12).field_154 = (float)class_296.method_2013((class_39)var12, -180, 180);
            }

            ((class_39)var12).field_135 = "builder".equalsIgnoreCase(var8) || "builder".equalsIgnoreCase(var9);
            ((class_39)var12).field_136 = "commandCenter".equalsIgnoreCase(var8) || "commandCenter".equalsIgnoreCase(var9);
            ((class_39)var12).field_133 = true;
            ((class_39)var12).method_249();
            class_34.method_190();
            return null;
         }

         if (var1 != null && var1.field_3561.equalsIgnoreCase("units")) {
            Log.method_1712("RustedWarfare", "non unit on units layer at:" + var4 + "," + var5);
            return null;
         }
      }

      class_416 var16 = new class_416();
      var16.field_3423 = var2;
      var2.field_3504 = true;
      var16.field_3424 = var3;
      if (var6 != null) {
         if (var6.getProperty("water") != null) {
            var16.field_3425 = true;
         }

         if (var6.getProperty("lava") != null || var6.getProperty("lava-cliff") != null) {
            var16.field_3426 = true;
            if (var6.getProperty("lava-cliff") != null) {
               var16.field_3427 = true;
            }
         }

         if (var6.getProperty("cliff-soft") != null) {
            var16.field_3427 = true;
         }

         if (var6.getProperty("cliff") != null) {
            var16.field_3427 = true;
         }

         if (var6.getProperty("large-cliff") != null) {
            var16.field_3430 = true;
         }

         if (var6.getProperty("trees") != null) {
            var16.field_3430 = true;
         }

         if (var6.getProperty("res_pool") != null) {
            var16.field_3428 = true;
         }

         if (var6.getProperty("tree") != null) {
         }

         if (var6.getProperty("small-rock") != null) {
            var16.field_3429 = 40;
         }

         if (var6.getProperty("large-rock") != null) {
            var16.field_3429 = -1;
         }

         if (var6.getProperty("block-land") != null) {
            var16.field_3429 = -1;
         }

         if (var6.getProperty("block-buildings") != null) {
            var16.field_3431 = true;
         }
      }

      return var16;
   }

   strictfp class_416() {
   }

   // $FF: synthetic method
   public Object clone() {
      return this.method_2637();
   }
}
