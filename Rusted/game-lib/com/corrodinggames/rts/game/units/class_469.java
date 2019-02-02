package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_133;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.d.class_432;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.ao
public enum class_469 implements class_24 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ao
   field_4033,
   // $FF: renamed from: b com.corrodinggames.rts.game.units.ao
   field_4034,
   // $FF: renamed from: c com.corrodinggames.rts.game.units.ao
   field_4035,
   // $FF: renamed from: d com.corrodinggames.rts.game.units.ao
   field_4036,
   // $FF: renamed from: e com.corrodinggames.rts.game.units.ao
   field_4037,
   // $FF: renamed from: f com.corrodinggames.rts.game.units.ao
   field_4038,
   // $FF: renamed from: g com.corrodinggames.rts.game.units.ao
   field_4039,
   // $FF: renamed from: h com.corrodinggames.rts.game.units.ao
   field_4040,
   // $FF: renamed from: i com.corrodinggames.rts.game.units.ao
   field_4041,
   // $FF: renamed from: j com.corrodinggames.rts.game.units.ao
   field_4042,
   // $FF: renamed from: k com.corrodinggames.rts.game.units.ao
   field_4043,
   // $FF: renamed from: l com.corrodinggames.rts.game.units.ao
   field_4044,
   // $FF: renamed from: m com.corrodinggames.rts.game.units.ao
   field_4045,
   // $FF: renamed from: n com.corrodinggames.rts.game.units.ao
   field_4046,
   // $FF: renamed from: o com.corrodinggames.rts.game.units.ao
   field_4047,
   // $FF: renamed from: p com.corrodinggames.rts.game.units.ao
   field_4048,
   // $FF: renamed from: q com.corrodinggames.rts.game.units.ao
   field_4049,
   // $FF: renamed from: r com.corrodinggames.rts.game.units.ao
   field_4050,
   // $FF: renamed from: s com.corrodinggames.rts.game.units.ao
   field_4051,
   // $FF: renamed from: t com.corrodinggames.rts.game.units.ao
   field_4052,
   // $FF: renamed from: u com.corrodinggames.rts.game.units.ao
   field_4053,
   // $FF: renamed from: v com.corrodinggames.rts.game.units.ao
   field_4054,
   // $FF: renamed from: w com.corrodinggames.rts.game.units.ao
   field_4055,
   // $FF: renamed from: x com.corrodinggames.rts.game.units.ao
   field_4056,
   // $FF: renamed from: y com.corrodinggames.rts.game.units.ao
   field_4057,
   // $FF: renamed from: z com.corrodinggames.rts.game.units.ao
   field_4058,
   // $FF: renamed from: A com.corrodinggames.rts.game.units.ao
   field_4059,
   // $FF: renamed from: B com.corrodinggames.rts.game.units.ao
   field_4060,
   // $FF: renamed from: C com.corrodinggames.rts.game.units.ao
   field_4061,
   // $FF: renamed from: D com.corrodinggames.rts.game.units.ao
   field_4062,
   // $FF: renamed from: E com.corrodinggames.rts.game.units.ao
   field_4063,
   // $FF: renamed from: F com.corrodinggames.rts.game.units.ao
   field_4064,
   // $FF: renamed from: G com.corrodinggames.rts.game.units.ao
   field_4065,
   // $FF: renamed from: H com.corrodinggames.rts.game.units.ao
   field_4066,
   // $FF: renamed from: I com.corrodinggames.rts.game.units.ao
   field_4067,
   // $FF: renamed from: J com.corrodinggames.rts.game.units.ao
   field_4068,
   // $FF: renamed from: K com.corrodinggames.rts.game.units.ao
   field_4069,
   // $FF: renamed from: L com.corrodinggames.rts.game.units.ao
   field_4070,
   // $FF: renamed from: M com.corrodinggames.rts.game.units.ao
   field_4071,
   // $FF: renamed from: N com.corrodinggames.rts.game.units.ao
   field_4072,
   // $FF: renamed from: O com.corrodinggames.rts.game.units.ao
   field_4073,
   // $FF: renamed from: P com.corrodinggames.rts.game.units.ao
   field_4074,
   // $FF: renamed from: Q com.corrodinggames.rts.game.units.ao
   field_4075,
   // $FF: renamed from: R com.corrodinggames.rts.game.units.ao
   field_4076,
   // $FF: renamed from: S com.corrodinggames.rts.game.units.ao
   field_4077,
   // $FF: renamed from: T com.corrodinggames.rts.game.units.ao
   field_4078,
   // $FF: renamed from: U com.corrodinggames.rts.game.units.ao
   field_4079,
   // $FF: renamed from: V com.corrodinggames.rts.game.units.ao
   field_4080;

   // $FF: renamed from: W com.corrodinggames.rts.game.units.a.s
   class_133 field_4081;
   // $FF: renamed from: X int
   int field_4082;
   // $FF: renamed from: Y java.lang.String
   String field_4083;
   // $FF: renamed from: Z java.lang.String
   String field_4084;
   // $FF: renamed from: aa java.util.ArrayList
   public static ArrayList field_4085;
   // $FF: renamed from: ab com.corrodinggames.rts.game.units.aq[]
   class_513[] field_4086;
   // $FF: renamed from: ac boolean
   public static boolean field_4087;

   private class_469() {
      this.field_4081 = new class_133(this);
      this.field_4082 = -1;
   }

   // $FF: renamed from: a () com.corrodinggames.rts.game.units.aa
   public class_39 method_128() {
      return this.method_3049(false);
   }

   // $FF: renamed from: a (boolean) com.corrodinggames.rts.game.units.aa
   public abstract class_39 method_3049(boolean var1);

   // $FF: renamed from: b () void
   public abstract void method_3050();

   // $FF: renamed from: c () int
   public abstract int method_130();

   // $FF: renamed from: d () com.corrodinggames.rts.game.units.a.s
   public class_133 method_129() {
      return this.field_4081;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_139() {
      if (this.field_4082 != class_432.field_3652 || this.field_4083 == null) {
         this.field_4082 = class_432.field_3652;
         this.field_4083 = class_432.method_2744("units." + this.name() + ".name");
      }

      return this.field_4083;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_140() {
      if (this.field_4082 != class_432.field_3652 || this.field_4084 == null) {
         this.field_4082 = class_432.field_3652;
         this.field_4084 = class_432.method_2744("units." + this.name() + ".description");
      }

      return this.field_4084;
   }

   // $FF: renamed from: g () int
   public int method_133() {
      return 1;
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public void method_3051(ArrayList var1, int var2) {
   }

   // $FF: renamed from: h () void
   public void method_142() {
      class_513[] var1 = new class_513[3];

      for(int var2 = 1; var2 <= 3; ++var2) {
         class_513 var3 = new class_513();
         this.method_3051(var3.field_4679, var2);
         var1[var2 - 1] = var3;
      }

      this.field_4086 = var1;
   }

   // $FF: renamed from: a (int) java.util.ArrayList
   public ArrayList method_143(int var1) {
      if (var1 > 3) {
         throw new RuntimeException("Tech level:" + var1 + " greater than maxTechLevel");
      } else {
         return this.field_4086[var1 - 1].field_4679;
      }
   }

   // $FF: renamed from: i () java.lang.String
   public String method_141() {
      return this.name();
   }

   // $FF: renamed from: j () boolean
   public boolean method_134() {
      return false;
   }

   // $FF: renamed from: k () boolean
   public boolean method_135() {
      return false;
   }

   // $FF: renamed from: l () boolean
   public boolean method_136() {
      return this.method_135();
   }

   // $FF: renamed from: m () com.corrodinggames.rts.game.units.ac
   public class_503 method_137() {
      class_39 var1 = class_39.method_216(this);
      if (var1 == null) {
         throw new RuntimeException("Shared unit is null for:" + this.name());
      } else {
         return var1.method_279();
      }
   }

   // $FF: renamed from: n () boolean
   public boolean method_138() {
      return false;
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.game.units.ap
   public static class_24 method_3052(String var0) {
      return method_3053(var0, true);
   }

   // $FF: renamed from: a (java.lang.String, boolean) com.corrodinggames.rts.game.units.ap
   public static class_24 method_3053(String var0, boolean var1) {
      if (var1) {
         class_24 var2 = class_479.method_3169(var0);
         if (var2 != null) {
            return var2;
         }
      }

      class_469[] var6 = values();
      int var3 = var6.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         class_469 var5 = var6[var4];
         if (var5.name().equalsIgnoreCase(var0)) {
            return var5;
         }
      }

      class_479 var7 = class_479.method_3171(var0);
      if (var7 != null) {
         return var7;
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.String, float) java.lang.String
   private static String method_3054(String var0, float var1) {
      return method_3055(var0, var1, "");
   }

   // $FF: renamed from: a (java.lang.String, float, java.lang.String) java.lang.String
   private static String method_3055(String var0, float var1, String var2) {
      String var3 = "" + var1;
      if (var1 % 1.0F == 0.0F) {
         var3 = "" + (int)var1;
      }

      return method_3056(var0, var3, var2);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) java.lang.String
   private static String method_3056(String var0, String var1, String var2) {
      return var0 + ": " + var1 + var2 + "\n";
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) int
   private static int method_3057(class_44 var0) {
      String var1 = var0.by();
      if (var1 != null) {
         class_121 var2 = var0.b(var1);
         if (var2 != null) {
            return var2.method_1046();
         }
      }

      return 0;
   }

   // $FF: renamed from: o () void
   public static void method_3058() {
      for(int var0 = 0; var0 < 50; ++var0) {
         class_236.method_1587("printForHelp() is unsafe to run");
      }

      String[] var18 = new String[]{"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
      String var1 = "";
      ArrayList var2 = new ArrayList();
      var2.addAll(field_4085);
      Collections.sort(var2, new ao$44());
      Iterator var3 = var2.iterator();

      while(true) {
         class_24 var4;
         class_44 var7;
         boolean var8;
         int var11;
         do {
            class_39 var5;
            class_24 var6;
            do {
               do {
                  do {
                     do {
                        if (!var3.hasNext()) {
                           class_236.method_1591(var1);
                           return;
                        }

                        var4 = (class_24)var3.next();
                        var5 = class_39.method_216(var4);
                     } while(!(var5 instanceof class_44));
                  } while(var4.method_141().startsWith("bug"));

                  var6 = class_479.method_3170(var4);
               } while(var6 != null);
            } while(var4 instanceof class_479 && !((class_479)var4).field_4217);

            var7 = (class_44)var5;
            var8 = false;
            String[] var9 = var18;
            int var10 = var18.length;

            for(var11 = 0; var11 < var10; ++var11) {
               String var12 = var9[var11];
               if (var12.equals(var4.method_141())) {
                  var8 = true;
               }
            }
         } while(var8);

         var1 = var1 + "\n";
         var1 = var1 + "<div class=\"unit\">\n";
         var1 = var1 + "<img src=\"unit:" + var4.method_141() + "\" />\n";
         var1 = var1 + "<h4>" + var4.method_139() + "</h4>\n";
         var1 = var1 + "<p>" + var4.method_140().replace("\n", "<br/>") + "</p>\n";
         var1 = var1 + "<pre>";
         var1 = var1 + method_3056("Price", "$" + var4.method_130(), "");
         int var19 = method_3057(var7);
         if (var19 > 0) {
            var1 = var1 + method_3056("T2 Upgrade Price", "$" + var19, "");
            class_44 var20 = (class_44)var4.method_128();
            var20.method_356(2);
            if (var20.method_261() == 2) {
               var11 = method_3057(var20);
               if (var11 > 0) {
                  var1 = var1 + method_3056("T3 Upgrade Price", "$" + var11, "");
               }
            }
         }

         var1 = var1 + method_3054("Hp", var7.bJ);
         var1 = var1 + method_3054("Speed", var7.method_458());
         var1 = var1 + method_3054("Turn speed", var7.method_451());
         var1 = var1 + method_3054("Mass", var7.be());
         if (var7.l()) {
            var1 = var1 + method_3054("Shoot Delay", var7.method_441(0));
            var1 = var1 + method_3054("Attack Range", var7.method_439());
            float var21 = 0.0F;
            float var22 = 0.0F;
            float var23 = 0.0F;
            float var13 = 0.0F;
            int var14 = var7.method_317();

            for(int var15 = 0; var15 < var14; ++var15) {
               int var16 = class_97.field_833.field_1647;
               var7.method_471(var7, var15);
               if (var16 != class_97.field_833.field_1647) {
                  class_97 var17 = (class_97)class_97.field_833.get(class_97.field_833.field_1647 - 1);
                  if (var17.field_874 > var21) {
                     var21 = var17.field_874;
                  }

                  if (var17.field_878 > var22) {
                     var22 = var17.field_878;
                  }

                  var23 += var17.field_874;
                  var13 += var17.field_878;
               }
            }

            String var24;
            if (var23 != 0.0F) {
               var24 = "";
               if (var23 != var21) {
                  var24 = " (total:" + var23 + ")";
               }

               var1 = var1 + method_3055("Direct Damage", var21, var24);
            }

            if (var13 != 0.0F) {
               var24 = "";
               if (var13 != var22) {
                  var24 = " (total:" + var13 + ")";
               }

               var1 = var1 + method_3055("Area Damage", var22, var24);
            }
         }

         var1 = var1 + "</pre>";
         var1 = var1 + "</div>\n";
      }
   }

   // $FF: renamed from: p () void
   public static void method_3059() {
      class_469[] var0 = values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         class_469 var3 = var0[var2];
         var3.name();
         var3.method_139();
         var3.method_140();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, float, float, float, float, com.corrodinggames.rts.game.k) boolean
   public static boolean method_3060(class_24 var0, float var1, float var2, float var3, float var4, class_107 var5) {
      class_236 var6 = class_236.method_1549();
      class_39 var7 = class_39.method_216(var0);
      if (var7 == null) {
         class_236.method_1591("isValidHere: Failed to get unit from type:" + var0);
         return false;
      } else {
         var7.method_258(var5);
         var7.dj = var4;
         var7.dh = var1;
         var7.di = var2;
         if (!var7.method_212()) {
            var7.field_154 = var3;
            if (var7 instanceof class_44) {
               class_44 var8 = (class_44)var7;
               var8.method_362(var3);
            }
         }

         boolean var10 = true;
         if (var7 instanceof class_44) {
            class_44 var9 = (class_44)var7;
            var10 = var9.method_493();
         }

         var7.dj = 0.0F;
         var7.field_154 = 0.0F;
         return var10;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, float, float, float, float, com.corrodinggames.rts.game.k, float, float, boolean, boolean, int) void
   public static void method_3061(class_24 var0, float var1, float var2, float var3, float var4, class_107 var5, float var6, float var7, boolean var8, boolean var9, int var10) {
      boolean var11 = true;
      method_3062(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, float, float, float, float, com.corrodinggames.rts.game.k, float, float, boolean, boolean, int, boolean) void
   public static void method_3062(class_24 var0, float var1, float var2, float var3, float var4, class_107 var5, float var6, float var7, boolean var8, boolean var9, int var10, boolean var11) {
      class_236 var12 = class_236.method_1549();
      class_39 var13 = class_39.method_217(var0);
      boolean var14 = var13.method_212();
      var13.method_258(var5);
      class_44 var15;
      if (var13 instanceof class_44) {
         var15 = (class_44)var13;
         var15.method_356(var10);
      }

      var13.dj = var4;
      if (var13.method_279() == class_503.field_4622 || var13.method_279() == class_503.field_4623 || var13.method_279() == class_503.field_4624) {
         var13.dj += 4.0F;
      }

      if (var13.method_279() == class_503.field_4620) {
         var13.dj += 10.0F;
      }

      if (!var14) {
         var13.field_154 = var3;
         if (var13 instanceof class_44) {
            var15 = (class_44)var13;
            var15.method_362(var3);
         }
      } else {
         var13.field_154 = -90.0F;
      }

      boolean var20 = true;
      boolean var16 = var13.field_162;
      var13.field_162 = true;
      var13.field_165 = false;
      var13.field_166 = false;
      if (!var11) {
         var13.field_166 = true;
      }

      var13.field_161 = false;
      var13.field_163 = false;
      var13.field_164 = false;
      if (!var8 && !var9) {
         var13.field_161 = true;
      } else {
         var13.field_163 = var9;
         var13.field_164 = var8;
         var20 = false;
      }

      if (!var20) {
         var13.dh = var1;
         var13.di = var2;
      } else {
         var13.dh = var12.field_1965 + var1;
         var13.di = var12.field_1966 + var2;
      }

      float var17 = var13.field_157 * 2.0F * 0.8F;
      if (var13 instanceof class_44) {
         class_44 var18 = (class_44)var13;
         if (var18.field_259 != null) {
            float var19 = (float)var18.dm * var18.bJ();
            if (var19 > var17) {
               var17 = var19;
            }
         }
      }

      float var21 = 1.0F;
      if (var17 < var6) {
         var21 = var6 / var17;
      }

      if (var17 > var7) {
         var21 = var7 / var17;
      }

      var12.field_1935.method_89();
      if (var20) {
      }

      if (var21 != 1.0F) {
         var12.field_1935.method_93(var21, var21, var1, var2);
      }

      if (var21 < 1.0F) {
         field_4087 = true;
      } else {
         field_4087 = false;
      }

      var13.method_178(0.0F);
      var13.method_181(0.0F);
      var13.method_177(0.0F, false);
      var12.field_1935.method_90();
      var13.dj = 0.0F;
      if (!var14) {
         var13.field_154 = 0.0F;
      } else {
         var13.field_154 = -90.0F;
      }

      if (var13 instanceof class_44) {
         class_44 var22 = (class_44)var13;
         var22.method_362(0.0F);
         var22.method_356(1);
      }

      var13.field_163 = false;
      var13.field_164 = false;
      var13.field_162 = var16;
      var13.field_161 = false;
   }

   // $FF: renamed from: b (int) int
   public int method_131(int var1) {
      int var2 = this.method_130();
      if (var1 >= 2) {
         var2 += this.method_3063(2);
      }

      if (var1 >= 3) {
         var2 += this.method_3063(2);
      }

      return var2;
   }

   // $FF: renamed from: c (int) int
   public int method_3063(int var1) {
      return 0;
   }

   // $FF: renamed from: q () java.lang.String
   public String method_144() {
      return this.name();
   }

   // $FF: renamed from: r () boolean
   public boolean method_127() {
      return false;
   }

   // $FF: synthetic method
   class_469(ao$1 var3) {
      this();
   }
}
