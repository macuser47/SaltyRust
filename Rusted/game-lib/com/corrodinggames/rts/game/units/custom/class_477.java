package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.utility.class_210;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.b
public class class_477 {
   // $FF: renamed from: a int
   public int field_4156;
   // $FF: renamed from: b float
   public float field_4157;
   // $FF: renamed from: c float
   public float field_4158;
   // $FF: renamed from: d float
   public float field_4159;
   // $FF: renamed from: e int
   public int field_4160;
   // $FF: renamed from: f int
   public int field_4161;
   // $FF: renamed from: g int
   public int field_4162;
   // $FF: renamed from: h int
   public int field_4163;
   // $FF: renamed from: i int
   public int field_4164;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.z, java.lang.String, java.lang.String, boolean) com.corrodinggames.rts.game.units.custom.b
   public static class_477 method_3115(class_210 var0, String var1, String var2, boolean var3) {
      String var4 = var0.method_1393(var1, var2, (String)null);
      if (var4 == null && !var3) {
         throw new RuntimeException("Could not find " + var2 + " in configuration file under:" + var1);
      } else {
         try {
            class_477 var5 = method_3117(var4);
            return var5;
         } catch (class_361 var6) {
            throw new class_361("Error on key:" + var2 + " section:" + var1 + " - " + var6.getMessage());
         }
      }
   }

   // $FF: renamed from: a (int) void
   public static void method_3116(int var0) {
      if (var0 < 0 || var0 > 31) {
         throw new class_361("Flag id must be between 0-31 (is:" + var0 + ")");
      }
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.game.units.custom.b
   public static class_477 method_3117(String var0) {
      class_477 var1 = new class_477();
      if (var0 == null) {
         return var1;
      } else {
         String[] var2 = var0.split(",");
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            var5 = var5.trim();
            if (!var5.equals("")) {
               String[] var8 = var5.split("=|:");
               String var6;
               String var7;
               if (var8.length == 1) {
                  var6 = "credits";
                  var7 = var8[0];
               } else {
                  if (var8.length != 2) {
                     throw new class_361("Unknown price format:" + var0);
                  }

                  var6 = var8[0];
                  var7 = var8[1];
               }

               try {
                  int var9;
                  if (var6.equals("credits")) {
                     var9 = Integer.parseInt(var7);
                     var1.field_4156 = var9;
                  } else {
                     float var11;
                     if (var6.equals("energy")) {
                        var11 = Float.parseFloat(var7);
                        var1.field_4157 = var11;
                     } else if (var6.equals("hp")) {
                        var11 = Float.parseFloat(var7);
                        var1.field_4158 = var11;
                     } else if (var6.equals("shield")) {
                        var11 = Float.parseFloat(var7);
                        var1.field_4159 = var11;
                     } else if (var6.equals("ammo")) {
                        var9 = Integer.parseInt(var7);
                        var1.field_4160 = var9;
                     } else if (var6.equals("hasFlag")) {
                        var9 = Integer.parseInt(var7);
                        method_3116(var9);
                        var1.field_4163 |= 1 << var9;
                     } else if (var6.equals("hasMissingFlag")) {
                        var9 = Integer.parseInt(var7);
                        method_3116(var9);
                        var1.field_4164 |= 1 << var9;
                     } else if (var6.equals("setFlag")) {
                        var9 = Integer.parseInt(var7);
                        method_3116(var9);
                        var1.field_4161 |= 1 << var9;
                     } else {
                        if (!var6.equals("unsetFlag")) {
                           throw new class_361("Unknown price type:" + var6);
                        }

                        var9 = Integer.parseInt(var7);
                        method_3116(var9);
                        var1.field_4162 |= 1 << var9;
                     }
                  }
               } catch (NumberFormatException var10) {
                  var10.printStackTrace();
                  throw new class_361("Bad price number:" + var7 + " in " + var0);
               }
            }
         }

         return var1;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_3118(class_39 var1, boolean var2) {
      int var3 = 9999;
      int var4;
      if (!var2 && this.field_4156 > 0) {
         var4 = var1.field_143.field_1229 / this.field_4156;
         var3 = class_296.method_2045(var3, var4);
      }

      if (this.field_4157 > 0.0F) {
         var4 = (int)(var1.field_174 / this.field_4157);
         var3 = class_296.method_2045(var3, var4);
      }

      if (this.field_4158 > 0.0F) {
         var4 = (int)(var1.field_167 / this.field_4158);
         var3 = class_296.method_2045(var3, var4);
      }

      if (this.field_4159 > 0.0F) {
         var4 = (int)(var1.field_170 / this.field_4159);
         var3 = class_296.method_2045(var3, var4);
      }

      if (this.field_4160 > 0) {
         var4 = var1.field_175 / this.field_4160;
         var3 = class_296.method_2045(var3, var4);
      }

      if (!this.method_3122(var1)) {
         var3 = 0;
      }

      return var3;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_3119(class_39 var1, boolean var2) {
      if (!var2 && this.field_4156 > 0 && !var1.field_143.method_939(this.field_4156)) {
         return false;
      } else if (this.field_4157 > 0.0F && var1.field_174 < this.field_4157) {
         return false;
      } else if (this.field_4158 > 0.0F && var1.field_167 < this.field_4158) {
         return false;
      } else if (this.field_4159 > 0.0F && var1.field_170 < this.field_4159) {
         return false;
      } else if (this.field_4160 > 0 && var1.field_175 < this.field_4160) {
         return false;
      } else {
         return this.method_3122(var1);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.e) void
   public void method_3120(class_66 var1) {
      if (var1.bP < 0.0F) {
         var1.bP = 0.0F;
      }

      if (var1.bP > var1.method_461()) {
         var1.bP = var1.method_461();
      }

      if (var1.bL < 0.0F) {
         var1.bL = 0.0F;
      }

      if (var1.bL > var1.bO) {
         var1.bL = var1.bO;
      }

      if (var1.bJ > var1.bJ) {
         var1.bJ = var1.bJ;
      }

      if (var1.bQ < 0) {
         var1.bQ = 0;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public void method_3121(class_39 var1) {
      if (this.field_4161 != 0) {
         var1.field_176 |= this.field_4161;
      }

      if (this.field_4162 != 0) {
         var1.field_176 &= ~this.field_4162;
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_3122(class_39 var1) {
      if (this.field_4163 != 0 && !method_3123(var1.field_176, this.field_4163)) {
         return false;
      } else {
         return this.field_4164 == 0 || !method_3124(var1.field_176, this.field_4164);
      }
   }

   // $FF: renamed from: a (int, int) boolean
   public static boolean method_3123(int var0, int var1) {
      return (var1 & var0) == var1;
   }

   // $FF: renamed from: b (int, int) boolean
   public static boolean method_3124(int var0, int var1) {
      return (var1 & var0) != 0;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.e, boolean) void
   public void method_3125(class_66 var1, boolean var2) {
      if (!var2) {
         class_107 var10000 = var1.bk;
         var10000.field_1229 -= this.field_4156;
      }

      var1.bP -= this.field_4157;
      var1.bI -= this.field_4158;
      var1.bL -= this.field_4159;
      var1.bQ -= this.field_4160;
      this.method_3121(var1);
      this.method_3120(var1);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.custom.e, boolean) void
   public void method_3126(class_66 var1, boolean var2) {
      if (!var2) {
         class_107 var10000 = var1.bk;
         var10000.field_1229 += this.field_4156;
      }

      var1.bP += this.field_4157;
      var1.bI += this.field_4158;
      var1.bL += this.field_4159;
      var1.bQ += this.field_4160;
      this.method_3121(var1);
      this.method_3120(var1);
   }

   // $FF: renamed from: a () boolean
   public boolean method_3127() {
      if (this.field_4156 == 0 && this.field_4157 == 0.0F && this.field_4158 == 0.0F && this.field_4159 == 0.0F && this.field_4160 == 0) {
         return this.field_4161 != 0 || this.field_4162 != 0 || this.field_4163 != 0 || this.field_4164 != 0;
      } else {
         return true;
      }
   }
}
