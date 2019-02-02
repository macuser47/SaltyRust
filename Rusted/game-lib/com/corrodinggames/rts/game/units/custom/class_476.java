package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.c
public class class_476 {
   // $FF: renamed from: a java.lang.String
   final String field_4153;
   // $FF: renamed from: b java.util.ArrayList
   public static ArrayList field_4154 = new ArrayList();
   // $FF: renamed from: c com.corrodinggames.rts.game.units.custom.d
   static final class_478 field_4155 = new class_478(new class_476[0]);

   private class_476(String var1) {
      this.field_4153 = var1;
   }

   public String toString() {
      return this.field_4153;
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.game.units.custom.d
   public static class_478 method_3108(String var0) {
      return method_3109(var0, (class_478)null);
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.game.units.custom.d) com.corrodinggames.rts.game.units.custom.d
   public static class_478 method_3109(String var0, class_478 var1) {
      if (var0 == null) {
         return var1;
      } else if (var0.trim().equals("")) {
         return var1;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var3 = var0.split(",");
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            var6 = var6.trim();
            if (!var6.equals("")) {
               class_476 var7 = method_3110(var6);
               var2.add(var7);
            }
         }

         if (var2.size() == 0) {
            return var1;
         } else {
            class_478 var8 = new class_478((class_476[])var2.toArray(new class_476[0]));
            return var8;
         }
      }
   }

   // $FF: renamed from: b (java.lang.String) com.corrodinggames.rts.game.units.custom.c
   public static class_476 method_3110(String var0) {
      var0 = var0.trim();
      var0 = var0.toLowerCase(Locale.ROOT);
      Iterator var1 = field_4154.iterator();

      class_476 var2;
      do {
         if (!var1.hasNext()) {
            class_476 var3 = new class_476(var0);
            field_4154.add(var3);
            return var3;
         }

         var2 = (class_476)var1.next();
      } while(!var2.field_4153.equals(var0));

      return var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.d, com.corrodinggames.rts.gameFramework.f.af) void
   public static void method_3111(class_478 var0, class_404 var1) {
      if (var0 == null) {
         var1.method_2544((String)null);
      } else if (var0.field_4165.length == 0) {
         var1.method_2544("");
      } else {
         StringBuilder var2 = new StringBuilder();
         class_476[] var3 = var0.field_4165;
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            class_476 var6 = var3[var5];
            var2.append(var6.field_4153);
         }

         var1.method_2544(var2.toString());
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) com.corrodinggames.rts.game.units.custom.d
   public static class_478 method_3112(class_463 var0) {
      String var1 = var0.method_3014();
      if (var1 == null) {
         return null;
      } else {
         class_478 var2 = method_3108(var1);
         return var2;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.d, com.corrodinggames.rts.game.units.custom.d) boolean
   public static boolean method_3113(class_478 var0, class_478 var1) {
      if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.field_4165.length; ++var2) {
            for(int var3 = 0; var3 < var0.field_4165.length; ++var3) {
               if (var0.field_4165[var3] == var1.field_4165[var2]) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.c, com.corrodinggames.rts.game.units.custom.d) boolean
   public static boolean method_3114(class_476 var0, class_478 var1) {
      if (var1 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var1.field_4165.length; ++var2) {
            if (var1.field_4165[var2] == var0) {
               return true;
            }
         }

         return false;
      }
   }
}
