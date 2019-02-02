package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.s
abstract class class_116 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.c.s
   static class_116 field_1331 = new s$1();
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.c.s
   static class_116 field_1332 = new s$2();
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.c.s
   static class_116 field_1333 = new s$3();
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.c.s
   static class_116 field_1334 = new s$4();
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.c.s
   static class_116 field_1335 = new s$5();
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.c.s
   static class_116 field_1336 = new s$6();

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) boolean
   public abstract boolean method_1028(class_44 var1);

   // $FF: renamed from: a (java.util.ArrayList, com.corrodinggames.rts.gameFramework.c.s, com.corrodinggames.rts.gameFramework.c.s) void
   public static void method_1029(ArrayList var0, class_116 var1, class_116 var2) {
      class_236 var3 = class_236.method_1549();
      if (var3.field_1939.method_734() != 1) {
         var0.clear();
      }

      class_44 var4 = var3.field_1939.method_737();
      if (var4 != null) {
         if (!var1.method_1028(var4) && (var2 == null || !var2.method_1028(var4))) {
            var0.clear();
         } else if (!var0.contains(var4)) {
            var0.add(var4);
         }
      }

      class_44 var5 = method_1030(var0, var1);
      if (var5 == null && var2 != null) {
         var5 = method_1030(var0, var2);
      }

      if (var5 == null) {
         var0.clear();
         if (var4 != null) {
            var0.add(var4);
         }

         var5 = method_1030(var0, var1);
         if (var5 == null && var2 != null) {
            var5 = method_1030(var0, var2);
         }
      }

      if (var5 != null) {
         var3.field_1939.method_762();
         var3.field_1939.method_763(var5);
         var3.method_1582(var5.dh, var5.di);
         var0.add(var5);
      }

   }

   // $FF: renamed from: a (java.util.ArrayList, com.corrodinggames.rts.gameFramework.c.s) com.corrodinggames.rts.game.units.p
   public static class_44 method_1030(ArrayList var0, class_116 var1) {
      class_236 var2 = class_236.method_1549();
      class_44 var3 = null;
      float var4 = -1.0F;
      Iterator var5 = class_39.field_126.iterator();

      while(true) {
         class_44 var7;
         float var8;
         do {
            do {
               do {
                  do {
                     class_39 var6;
                     do {
                        if (!var5.hasNext()) {
                           return var3;
                        }

                        var6 = (class_39)var5.next();
                     } while(!(var6 instanceof class_44));

                     var7 = (class_44)var6;
                  } while(!var2.field_1939.method_769(var7));
               } while(!var1.method_1028(var7));
            } while(var0.contains(var7));

            var8 = class_296.method_2026(var2.field_1967 + var2.field_1975, var2.field_1968 + var2.field_1976, var7.dh, var7.di);
         } while(var3 != null && var8 >= var4);

         var4 = var8;
         var3 = var7;
      }
   }
}
