package com.corrodinggames.rts.gameFramework.i;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.b.class_410;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.f.class_454;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.i.a
public class class_257 {
   // $FF: renamed from: a java.lang.String
   public String field_2274;
   // $FF: renamed from: b java.lang.String
   public String field_2275;
   // $FF: renamed from: c java.lang.String
   public String field_2276;
   // $FF: renamed from: d java.util.ArrayList
   public ArrayList field_2277 = new ArrayList();
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.i.b
   public class_256 field_2278;
   // $FF: renamed from: f boolean
   public boolean field_2279;
   // $FF: renamed from: g boolean
   public boolean field_2280;
   // $FF: renamed from: h int
   public int field_2281 = -1;
   // $FF: renamed from: i com.corrodinggames.rts.game.b.a
   public class_410 field_2282;
   // $FF: renamed from: j boolean
   public boolean field_2283 = false;
   // $FF: renamed from: k java.util.ArrayList
   ArrayList field_2284 = new ArrayList();

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_1813(String var1) {
      return this.field_2282.field_3400.getProperty(var1);
   }

   // $FF: renamed from: a (java.lang.String, int) int
   public int method_1814(String var1, int var2) {
      String var3 = this.field_2282.field_3400.getProperty(var1, (String)null);
      return var3 == null ? var2 : Integer.parseInt(var3);
   }

   // $FF: renamed from: b (java.lang.String) java.lang.Integer
   public Integer method_1815(String var1) {
      String var2 = this.field_2282.field_3400.getProperty(var1, (String)null);
      return var2 == null ? null : Integer.parseInt(var2);
   }

   // $FF: renamed from: a (java.lang.String, boolean) boolean
   public boolean method_1816(String var1, boolean var2) {
      String var3 = this.field_2282.field_3400.getProperty(var1, (String)null);
      return var3 == null ? var2 : Boolean.parseBoolean(var3);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   public String method_1817(String var1, String var2) {
      return this.field_2282.field_3400.getProperty(var1, var2);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1818(class_39 var1) {
      return this.field_2282.method_2633(var1);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_1819(String var1) {
      class_454.method_2887("MapTrigger-Error (" + this.field_2274 + " id:" + this.field_2275 + "): " + var1);
   }

   // $FF: renamed from: d (java.lang.String) void
   public void method_1820(String var1) {
      class_236.method_1591("MapTrigger-Debug (" + this.field_2275 + "): " + var1);
   }

   // $FF: renamed from: a () com.corrodinggames.rts.game.k
   public class_107 method_1821() {
      int var1 = Integer.parseInt(this.method_1817("team", "-99"));
      if (var1 == -99) {
         return null;
      } else {
         class_107 var2 = class_107.method_954(var1);
         if (var2 == null) {
            this.method_1819("Cannot find team:" + var1);
            return null;
         } else {
            return var2;
         }
      }
   }

   // $FF: renamed from: b () boolean
   public boolean method_1822() {
      Integer var1 = this.method_1815("maxUnits");
      byte var2 = 1;
      if (var1 != null) {
         var2 = 0;
      }

      Integer var3 = this.method_1814("minUnits", var2);
      class_107 var4 = this.method_1821();
      int var5 = 0;
      class_24 var6 = null;
      String var7 = this.method_1813("unitType");
      if (var7 != null) {
         var6 = class_469.method_3052(var7);
         if (var6 == null) {
            this.method_1819("Cound not find unitType:" + var7);
         }
      }

      boolean var8 = this.method_1816("onlybuildings", false);
      class_39[] var9 = class_39.field_126.method_1326();
      int var10 = 0;

      for(int var11 = class_39.field_126.size(); var10 < var11; ++var10) {
         class_39 var12 = var9[var10];
         if ((var4 == null || var12.field_143 == var4) && var12 instanceof class_44 && var12.method_228() && this.method_1818(var12) && (var6 == null || var12.method_295() == var6) && (!var8 || var12.method_212())) {
            ++var5;
         }
      }

      if (var5 < var3 || var1 != null && var5 > var1) {
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: c () int
   public int method_1823() {
      return (int)this.field_2282.field_3396.method_1966();
   }

   // $FF: renamed from: d () int
   public int method_1824() {
      return (int)this.field_2282.field_3396.method_1967();
   }
}
