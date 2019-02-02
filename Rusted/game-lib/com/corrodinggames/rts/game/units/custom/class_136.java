package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.a.class_134;
import com.corrodinggames.rts.game.units.a.class_516;
import com.corrodinggames.rts.game.units.a.class_518;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_34;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.y
class class_136 extends class_134 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.custom.v
   public class_496 field_1364;
   // $FF: renamed from: b com.corrodinggames.rts.game.units.custom.q
   public class_489 field_1365;
   // $FF: renamed from: e com.corrodinggames.rts.game.units.custom.w
   public class_495 field_1366;

   public strictfp class_136(class_496 var1, class_489 var2) {
      super((String)null);
      this.field_1366 = class_495.field_4520;
      String var3 = "";
      if (var1.field_4531 != null) {
         var3 = var3 + var1.field_4531;
      }

      var3 = var3 + "_" + var1.field_4524;
      this.e(var3);
      this.field_1364 = var1;
      this.field_1365 = var2;
      this.field_1366 = var1.field_4574;
      if (this.field_1366 == class_495.field_4519) {
         boolean var4 = false;
         boolean var5 = false;
         if (var1.field_4554 != null && var1.field_4555 == null) {
            var5 = true;
         }

         if (var1.field_4535.method_3127()) {
            var4 = true;
            this.field_1366 = class_495.field_4521;
         }

         if (var4 && !var5) {
            this.field_1366 = class_495.field_4521;
         } else {
            this.field_1366 = class_495.field_4522;
         }
      }

   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_1056() {
      return true;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public strictfp boolean method_1050(class_39 var1, boolean var2) {
      class_66 var3 = (class_66)var1;
      if (!this.field_1364.field_4545 && var3.method_13(this.v(), var2) > 0) {
         return false;
      } else if (!this.field_1364.field_4535.method_3119(var1, true)) {
         return false;
      } else if (this.field_1364.field_4536 != null && !this.field_1364.field_4536.read(var3)) {
         return false;
      } else {
         return this.field_1364.field_4538 != null && this.field_1364.field_4538.read(var3) ? false : super.b(var1, var2);
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_1051(class_39 var1) {
      class_66 var2 = (class_66)var1;
      return this.field_1364.field_4537 != null ? this.field_1364.field_4537.read(var2) : super.b(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public strictfp int method_1047(class_39 var1, boolean var2) {
      return this.field_1364.field_4569 ? this.field_1364.field_4535.method_3118(var1, true) : super.method_1047(var1, var2);
   }

   // $FF: renamed from: j () java.lang.String
   public strictfp String method_1062() {
      if (this.field_1364.field_4538 != null && this.field_1364.field_4539 != null) {
         class_236 var1 = class_236.method_1549();
         class_34[] var2 = class_34.field_79.method_1339();
         int var3 = class_34.field_79.size();
         boolean var4 = false;
         boolean var5 = true;

         for(int var6 = 0; var6 < var3; ++var6) {
            class_34 var7 = var2[var6];
            if (var7 instanceof class_66) {
               class_66 var8 = (class_66)var7;
               if (var8.bS && var1.field_1939.method_769(var8) && var8.b(this.v()) != null) {
                  if (!this.field_1364.field_4538.read(var8)) {
                     var5 = false;
                     break;
                  }

                  var4 = true;
               }
            }
         }

         if (var4 && var5) {
            return this.field_1364.field_4539.method_2303();
         }
      }

      return super.j();
   }

   // $FF: renamed from: b () java.lang.String
   public strictfp String method_1044() {
      return this.field_1364.field_4527;
   }

   // $FF: renamed from: a () java.lang.String
   public strictfp String method_1045() {
      return this.field_1364.field_4529;
   }

   // $FF: renamed from: B () boolean
   public strictfp boolean method_1103() {
      return this.field_1364.field_4547;
   }

   // $FF: renamed from: t () float
   public strictfp float method_1100() {
      return this.field_1364.field_4546 >= 1.0F ? 1000.0F : this.field_1364.field_4546;
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public strictfp class_516 method_1059() {
      return this.field_1364.field_4530;
   }

   // $FF: renamed from: C () com.corrodinggames.rts.game.units.custom.b
   public strictfp class_477 method_1104() {
      return this.field_1364.field_4535;
   }

   // $FF: renamed from: c () int
   public strictfp int method_1046() {
      return this.field_1364.field_4535.field_4156;
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   public strictfp class_24 method_1055() {
      return this.field_1365 == null ? null : this.field_1365.method_3210();
   }

   // $FF: renamed from: g () boolean
   public strictfp boolean method_1058() {
      return false;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public strictfp class_518 method_1060() {
      return this.field_1364.field_4566;
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_1061(class_39 var1) {
      return this.field_1364.field_4540.read((class_66)var1);
   }

   // $FF: renamed from: z () boolean
   public strictfp boolean method_1073() {
      return this.field_1364.field_4541;
   }

   // $FF: renamed from: A () boolean
   public strictfp boolean method_1074() {
      return this.field_1364.field_4542;
   }
}
