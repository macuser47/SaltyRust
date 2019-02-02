package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.c.class_99;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.o
public class class_131 extends class_121 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ap
   class_24 field_1355;
   // $FF: renamed from: b int
   int field_1356;

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && var1.getClass() == this.getClass()) {
         class_131 var2 = (class_131)var1;
         if (this.field_1356 != var2.field_1356) {
            return false;
         } else {
            return this.field_1355 != var2.field_1355 ? false : super.equals(var1);
         }
      } else {
         return false;
      }
   }

   public class_131(class_24 var1) {
      this(var1, 1, (Integer)null);
   }

   public class_131(class_24 var1, int var2, Integer var3) {
      super("b_" + var1.method_144());
      this.field_1356 = 1;
      class_24 var4 = class_479.method_3170(var1);
      if (var4 != null) {
         var1 = var4;
         this.e("b_" + var4.method_144());
      }

      if (var2 != 1) {
         this.e(this.v() + "_" + var2);
      }

      this.field_1355 = var1;
      this.field_1356 = var2;
      if (var3 != null) {
         this.c = (float)var3;
      }

   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   public class_24 method_1055() {
      return this.field_1355;
   }

   // $FF: renamed from: o () int
   public int method_1057() {
      return this.field_1356;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      String var1 = this.method_1055().method_140();
      boolean var2 = false;
      boolean var3 = true;
      class_39 var4 = class_39.method_217(this.method_1055());
      if (this.field_1356 != 1 && var4 instanceof class_44) {
         ((class_44)var4).method_356(this.field_1356);
      }

      var1 = var1 + "\n\n" + class_99.method_824(var4, false, var2, var3);
      if (this.field_1356 != 1 && var4 instanceof class_44) {
         ((class_44)var4).method_356(1);
      }

      return var1;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      String var1 = this.method_1055().method_139();
      if (this.method_1057() == 2) {
         var1 = var1 + " T-2";
      }

      if (this.method_1057() == 3) {
         var1 = var1 + " T-3";
      }

      return var1;
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return class_47.method_514(this.method_1055(), this.method_1057());
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_1047(class_39 var1, boolean var2) {
      return -1;
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public class_516 method_1059() {
      return class_516.field_4684;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_518.field_4704;
   }

   // $FF: renamed from: k_ () boolean
   public boolean method_1048() {
      return !this.method_1055().method_126();
   }

   // $FF: renamed from: q () boolean
   public boolean method_1049() {
      class_236 var1 = class_236.method_1549();
      if ((this.method_1055() == class_469.field_4062 || this.method_1055() == class_469.field_4061) && var1.method_1656() && var1.field_1944.field_3863.field_3783) {
         return true;
      } else {
         return this.method_1055().method_127();
      }
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: r () boolean
   public boolean method_1052() {
      return true;
   }

   // $FF: renamed from: w () boolean
   public boolean method_1054() {
      return false;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.aa) float
   public float method_1076(class_39 var1) {
      if (!(var1 instanceof class_44)) {
         return -1.0F;
      } else {
         class_44 var2 = (class_44)var1;
         class_39 var3 = var2.method_365();
         return var3 != null && var3.field_160 < 1.0F && var3.method_295() == this.method_1055() ? var3.field_160 : -1.0F;
      }
   }
}
