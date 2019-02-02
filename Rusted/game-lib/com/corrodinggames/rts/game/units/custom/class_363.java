package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_210;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.af
public class class_363 {
   // $FF: renamed from: a java.lang.String
   public String field_2847;
   // $FF: renamed from: b int
   public int field_2848;
   // $FF: renamed from: c int
   public int field_2849;
   // $FF: renamed from: d int
   public int field_2850;
   // $FF: renamed from: e int
   public int field_2851 = 35;
   // $FF: renamed from: f boolean
   public boolean field_2852 = false;
   // $FF: renamed from: g boolean
   public boolean field_2853 = false;
   // $FF: renamed from: h boolean
   public boolean field_2854 = false;
   // $FF: renamed from: i boolean
   public boolean field_2855 = false;
   // $FF: renamed from: j float
   public float field_2856 = 1.0F;
   // $FF: renamed from: k boolean
   public boolean field_2857 = false;
   // $FF: renamed from: l boolean
   public boolean field_2858 = false;
   // $FF: renamed from: m boolean
   public boolean field_2859 = false;
   // $FF: renamed from: n boolean
   public boolean field_2860 = false;
   // $FF: renamed from: o float
   public float field_2861;
   // $FF: renamed from: p float
   public float field_2862 = 5.0F;
   // $FF: renamed from: q short
   public short field_2863 = -1;
   // $FF: renamed from: r short
   public short field_2864;
   // $FF: renamed from: s short
   public short field_2865 = -1;
   // $FF: renamed from: t com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_2866;
   // $FF: renamed from: u boolean
   public boolean field_2867 = false;
   // $FF: renamed from: v boolean
   public boolean field_2868 = false;
   // $FF: renamed from: w float
   public float field_2869 = -1.0F;
   // $FF: renamed from: x boolean
   public boolean field_2870 = false;
   // $FF: renamed from: y boolean
   public boolean field_2871 = false;
   // $FF: renamed from: z boolean
   public boolean field_2872 = false;
   // $FF: renamed from: A boolean
   public boolean field_2873 = false;
   // $FF: renamed from: B boolean
   public boolean field_2874 = false;
   // $FF: renamed from: C boolean
   public boolean field_2875 = false;
   // $FF: renamed from: D float
   public float field_2876 = 3.0F;
   // $FF: renamed from: E com.corrodinggames.rts.game.units.custom.u
   public class_493 field_2877;
   // $FF: renamed from: F com.corrodinggames.rts.game.units.custom.u
   public class_493 field_2878;
   // $FF: renamed from: G int
   public int field_2879 = -1;
   // $FF: renamed from: H float
   public float field_2880 = 0.5F;
   // $FF: renamed from: I boolean
   public boolean field_2881 = false;
   // $FF: renamed from: J float
   public float field_2882 = -1.0F;
   // $FF: renamed from: K float
   public float field_2883 = -1.0F;
   // $FF: renamed from: L float
   public float field_2884 = -1.0F;
   // $FF: renamed from: M float
   public float field_2885 = 0.1F;
   // $FF: renamed from: N boolean
   public boolean field_2886 = false;
   // $FF: renamed from: O int
   public int field_2887 = Color.method_3077(255, 255, 255, 255);
   // $FF: renamed from: P float
   public float field_2888 = 1.0F;
   // $FF: renamed from: Q float
   public float field_2889 = 0.0F;
   // $FF: renamed from: R boolean
   public boolean field_2890;
   // $FF: renamed from: S boolean
   public boolean field_2891 = true;
   // $FF: renamed from: T float
   public float field_2892;
   // $FF: renamed from: U float
   public float field_2893;
   // $FF: renamed from: V boolean
   public boolean field_2894;
   // $FF: renamed from: W float
   public float field_2895;
   // $FF: renamed from: X float
   public float field_2896;
   // $FF: renamed from: Y float
   public float field_2897 = 1.0F;
   // $FF: renamed from: Z float
   public float field_2898 = 1.0F;
   // $FF: renamed from: aa float
   public float field_2899 = 1.0F;
   // $FF: renamed from: ab float
   public float field_2900;
   // $FF: renamed from: ac float
   public float field_2901 = -1.0F;
   // $FF: renamed from: ad com.corrodinggames.rts.game.units.custom.u
   public class_493 field_2902;
   // $FF: renamed from: ae com.corrodinggames.rts.game.units.custom.u
   public class_493 field_2903;
   // $FF: renamed from: af com.corrodinggames.rts.game.units.custom.ak
   public class_364 field_2904;
   // $FF: renamed from: ag int
   public int field_2905;
   // $FF: renamed from: ah boolean
   public boolean field_2906;
   // $FF: renamed from: ai com.corrodinggames.rts.game.units.custom.d
   public class_478 field_2907;

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.af, com.corrodinggames.rts.game.units.custom.g, com.corrodinggames.rts.gameFramework.utility.z, java.lang.String) void
   public static void method_2311(class_363 var0, class_479 var1, class_210 var2, String var3) {
      Integer var5 = var2.method_1397(var3, "directDamage", (Integer)null);
      Integer var6 = var2.method_1397(var3, "areaDamage", (Integer)null);
      if (var5 == null && var6 == null) {
         throw new RuntimeException("[" + var3 + "]: directDamage or areaDamage must be set");
      } else {
         if (var5 != null || var6 != null) {
            var0.field_2849 = var2.method_1397(var3, "directDamage", var0.field_2849);
            var0.field_2850 = var2.method_1397(var3, "areaDamage", var0.field_2850);
            var0.field_2851 = var2.method_1397(var3, "areaRadius", var0.field_2851);
            if ("only-ignoreEnemy".equalsIgnoreCase(var2.method_1393(var3, "friendlyFire", (String)null))) {
               var0.field_2853 = true;
            } else {
               Boolean var7 = var2.method_1390(var3, "friendlyFire", (Boolean)null);
               if (var7 != null) {
                  var0.field_2853 = false;
                  var0.field_2852 = var7;
               }
            }

            var0.field_2854 = var2.method_1390(var3, "areaHitAirAndLandAtSameTime", var0.field_2854);
            var0.field_2855 = var2.method_1390(var3, "areaHitUnderwaterAlways", var0.field_2855);
            var0.field_2856 = var2.method_1398(var3, "deflectionPower", var0.field_2856);
            var0.field_2857 = var2.method_1390(var3, "nukeWeapon", var0.field_2857);
            var0.field_2858 = var2.method_1390(var3, "shouldRevealFog", var0.field_2858);
            var0.field_2859 = var2.method_1390(var3, "alwaysVisibleInFog", var0.field_2859);
            var0.field_2860 = var2.method_1390(var3, "targetGround", var0.field_2860);
            var0.field_2861 = var2.method_1400(var3, "life");
            var0.field_2862 = var2.method_1398(var3, "speed", var0.field_2862);
            var0.field_2863 = var2.method_1396(var3, "frame", var0.field_2863);
            var0.field_2864 = var2.method_1396(var3, "drawType", var0.field_2864);
            var0.field_2865 = var2.method_1396(var3, "shadowFrame", var0.field_2865);
            class_306 var13 = class_479.method_3163(var1.field_4211, var2.method_1393(var3, "image", (String)null), var1.field_4169, var1);
            if (var13 != null) {
               var0.field_2866 = var13;
            }

            var0.field_2867 = var2.method_1390(var3, "instant", var0.field_2867);
            var0.field_2870 = var2.method_1390(var3, "instantReuseLast", var0.field_2870);
            var0.field_2868 = var2.method_1390(var3, "disableLeadTargeting", var0.field_2868);
            var0.field_2869 = var2.method_1398(var3, "leadTargetingSpeedCalculation", var0.field_2869);
            var0.field_2874 = var2.method_1390(var3, "ballistic", var0.field_2874);
            String var8 = var2.method_1393(var3, "trailEffect", (String)null);
            if (var8 != null) {
               if (var8.equalsIgnoreCase("true")) {
                  var0.field_2875 = true;
               } else if (var8.equalsIgnoreCase("false")) {
                  var0.field_2875 = false;
               } else {
                  var0.field_2875 = false;
                  var0.field_2877 = var1.method_3177(var8, (class_493)null);
               }
            }

            String var9 = var2.method_1393(var3, "effectOnCreate", (String)null);
            if (var9 != null) {
               var0.field_2878 = var1.method_3177(var9, (class_493)null);
            }

            var0.field_2876 = var2.method_1398(var3, "trailEffectRate", var0.field_2876);
            if (var0.field_2875) {
               var0.field_2879 = -1118720;
            }

            var0.field_2879 = var2.method_1394(var3, "lightColor", var0.field_2879);
            var0.field_2880 = var2.method_1398(var3, "lightSize", var0.field_2880);
            var0.field_2881 = var2.method_1390(var3, "largeHitEffect", var0.field_2881);
            var0.field_2871 = var2.method_1390(var3, "drawUnderUnits", var0.field_2871);
            var0.field_2872 = var2.method_1390(var3, "lightingEffect", var0.field_2872);
            var0.field_2873 = var2.method_1390(var3, "laserEffect", var0.field_2873);
            if (var0.field_2873) {
               var0.field_2887 = Color.method_3077(80, 255, 0, 0);
            }

            if (var0.field_2872 && var0.field_2860) {
               throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
            }

            if (var0.field_2873 && var0.field_2860) {
               throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
            }

            var0.field_2882 = var2.method_1398(var3, "ballistic_delaymove_height", var0.field_2882);
            var0.field_2883 = var2.method_1398(var3, "ballistic_height", var0.field_2883);
            var0.field_2884 = var2.method_1398(var3, "targetSpeed", var0.field_2884);
            var0.field_2885 = var2.method_1398(var3, "targetSpeedAcceleration", var0.field_2885);
            var0.field_2886 = var2.method_1390(var3, "autoTargetingOnDeadTarget", var0.field_2886);
            var0.field_2887 = var2.method_1394(var3, "color", var0.field_2887);
            var0.field_2889 = var2.method_1398(var3, "teamColorRatio", var0.field_2889);
            if (var0.field_2889 < 0.0F || var0.field_2889 > 1.0F) {
               throw new RuntimeException("teamColorRatio should be between 0-1 got:" + var0.field_2889);
            }

            var0.field_2888 = var2.method_1398(var3, "drawSize", var0.field_2888);
            var0.field_2890 = var2.method_1390(var3, "flameWeapon", var0.field_2890);
            var0.field_2891 = var2.method_1390(var3, "hitSound", var0.field_2891);
            var0.field_2892 = var2.method_1398(var3, "targetGroundSpread", var0.field_2892);
            var0.field_2893 = var2.method_1398(var3, "speedSpread", var0.field_2893);
            var0.field_2894 = var2.method_1390(var3, "explodeOnEndOfLife", var0.field_2894);
            var0.field_2895 = var2.method_1398(var3, "pushForce", var0.field_2895);
            var0.field_2896 = var2.method_1398(var3, "pushVelocity", var0.field_2896);
            var0.field_2897 = var2.method_1398(var3, "buildingDamageMultiplier", var0.field_2897);
            var0.field_2898 = var2.method_1398(var3, "shieldDamageMultiplier", var0.field_2898);
            var0.field_2899 = var2.method_1398(var3, "shieldDefectionMultiplier", var0.field_2899);
            var0.field_2900 = var2.method_1398(var3, "armourIgnoreAmount", var0.field_2900);
            var0.field_2901 = var2.method_1398(var3, "areaExpandTime", var0.field_2901);
            String var10 = var2.method_1393(var3, "explodeEffect", (String)null);
            if (var10 != null) {
               var0.field_2902 = var1.method_3177(var10, (class_493)null);
            }

            String var11 = var2.method_1393(var3, "explodeEffectOnShield", (String)null);
            if (var11 != null) {
               var0.field_2903 = var1.method_3177(var11, (class_493)null);
            }

            class_364 var12 = class_364.method_2312(var1, var2, var3, "spawnUnit");
            if (var12 != null && !var12.method_2314()) {
               var0.field_2904 = var12;
            }

            var0.field_2905 = var2.method_1397(var3, "unloadUpToXUnitsFromSource", var0.field_2905);
            var0.field_2906 = var2.method_1390(var3, "teleportSource", var0.field_2906);
            var0.field_2907 = class_476.method_3108(var2.method_1393(var3, "tags", (String)null));
         }

         var1.field_4408.add(var0);
      }
   }
}
