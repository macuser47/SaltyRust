package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.c.class_99;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.HashMap;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.l
public abstract class class_121 implements Comparable {
   // $FF: renamed from: c float
   public float field_1346 = -999.0F;
   // $FF: renamed from: d java.lang.String
   public static final String field_1347 = method_1041("-1");
   // $FF: renamed from: a java.lang.String
   private String field_1348;
   // $FF: renamed from: b java.util.HashMap
   private static HashMap field_1349;

   // $FF: renamed from: i_ () float
   public float method_1036() {
      if (this instanceof class_130) {
         return -100.0F;
      } else if (this.field_1346 != -999.0F) {
         return this.field_1346;
      } else {
         class_24 var1 = this.method_1055();
         return var1 != null && this.method_1058() ? (float)var1.method_133() : 1.0F;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l) int
   public int method_1037(class_121 var1) {
      if (var1 == null) {
         return 0;
      } else {
         float var2 = this.method_1036() - var1.method_1036();
         if (var2 < 0.0F) {
            return -1;
         } else {
            return var2 > 0.0F ? 1 : 0;
         }
      }
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && var1.getClass() == this.getClass()) {
         class_121 var2 = (class_121)var1;
         return this.field_1348.equals(var2.field_1348);
      } else {
         return false;
      }
   }

   // $FF: renamed from: b (java.lang.String) boolean
   public static final boolean method_1038(String var0) {
      return var0 == null || var0 == field_1347;
   }

   // $FF: renamed from: c (java.lang.String) boolean
   public static final boolean method_1039(String var0) {
      return !method_1038(var0);
   }

   // $FF: renamed from: a (java.lang.String) boolean
   public boolean method_1040(String var1) {
      return var1 != null && var1 != field_1347 ? this.method_1043().equals(var1) : false;
   }

   public class_121(int var1) {
      this.method_1042(String.valueOf(var1));
   }

   public class_121(String var1) {
      this.method_1042(var1);
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   public static String method_1041(String var0) {
      if (field_1349 == null) {
         field_1349 = new HashMap();
      }

      String var1 = (String)field_1349.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         field_1349.put(var0, var0);
         return var0;
      }
   }

   // $FF: renamed from: e (java.lang.String) void
   public final void method_1042(String var1) {
      this.field_1348 = method_1041(var1);
   }

   // $FF: renamed from: v () java.lang.String
   public final String method_1043() {
      return this.field_1348;
   }

   // $FF: renamed from: b () java.lang.String
   public abstract String method_1044();

   // $FF: renamed from: a () java.lang.String
   public abstract String method_1045();

   // $FF: renamed from: c () int
   public abstract int method_1046();

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public abstract int method_1047(class_39 var1, boolean var2);

   // $FF: renamed from: k_ () boolean
   public boolean method_1048() {
      return false;
   }

   // $FF: renamed from: q () boolean
   public boolean method_1049() {
      return false;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      if (this.method_1049()) {
         return false;
      } else {
         return var2 ? var1.field_143.method_942(this.method_1046()) : var1.field_143.method_939(this.method_1046());
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1051(class_39 var1) {
      return true;
   }

   // $FF: renamed from: r () boolean
   public boolean method_1052() {
      return false;
   }

   // $FF: renamed from: h () boolean
   public boolean method_1053() {
      return false;
   }

   // $FF: renamed from: w () boolean
   public boolean method_1054() {
      return true;
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   public abstract class_24 method_1055();

   // $FF: renamed from: x () boolean
   public boolean method_1056() {
      return false;
   }

   // $FF: renamed from: o () int
   public int method_1057() {
      return 1;
   }

   // $FF: renamed from: g () boolean
   public abstract boolean method_1058();

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public abstract class_516 method_1059();

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public abstract class_518 method_1060();

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1061(class_39 var1) {
      return false;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_1062() {
      String var1 = this.method_1044();
      class_236 var2 = class_236.method_1549();
      int var3 = 0;
      class_39[] var4 = var2.field_1939.field_1056.method_1326();
      int var5 = var2.field_1939.field_1056.size();

      for(int var6 = 0; var6 < var5; ++var6) {
         class_39 var7 = var4[var6];
         if (var7 instanceof class_44) {
            class_44 var8 = (class_44)var7;
            if (var8.bS && var2.field_1939.method_769(var8)) {
               int var9 = this.method_1047(var8, true);
               if (var9 != -1 && var9 != 0) {
                  var3 += var9;
               }
            }
         }
      }

      if (var3 != -1 && var3 != 0) {
         var1 = var1 + " (" + var3 + ")";
      }

      return var1;
   }

   // $FF: renamed from: d_ () java.lang.String
   public String method_1063() {
      String var1 = this.method_1044();
      int var2 = this.method_1046();
      if (var2 != -1 && var2 != 0) {
         var1 = var1 + " ($" + var2 + ")";
      }

      String var3 = class_99.method_823(this, false);
      if (var3 != null && !"".equals(var3)) {
         var1 = var1 + "\n" + var3;
      }

      String var4 = this.method_1045();
      if (var4 != null && !"".equals(var4)) {
         var1 = var1 + "\n";
         var1 = var1 + var4;
      }

      var1 = var1.trim();
      return var1;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1064(class_39 var1, boolean var2) {
      return false;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) void
   public void method_1065(class_39 var1) {
   }

   // $FF: renamed from: s () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_1066() {
      return this.method_1060() == class_518.field_4702 ? class_236.method_1549().field_1939.field_1036 : null;
   }

   // $FF: renamed from: p () boolean
   public boolean method_1067() {
      return false;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1068(class_39 var1) {
      return true;
   }

   // $FF: renamed from: y () boolean
   public boolean method_1069() {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public void method_1070(class_39 var1) {
   }

   // $FF: renamed from: k () float
   public float method_1071() {
      return 1.0F;
   }

   // $FF: renamed from: l () int
   public int method_1072() {
      return -1;
   }

   // $FF: renamed from: z () boolean
   public boolean method_1073() {
      return false;
   }

   // $FF: renamed from: A () boolean
   public boolean method_1074() {
      return false;
   }

   // $FF: renamed from: u () boolean
   public boolean method_1075() {
      return false;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.aa) float
   public float method_1076(class_39 var1) {
      return -1.0F;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_1037((class_121)var1);
   }
}
