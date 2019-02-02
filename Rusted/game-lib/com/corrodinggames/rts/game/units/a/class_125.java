package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.e
public class class_125 extends class_121 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.a.l
   class_121 field_1352;
   // $FF: renamed from: b com.corrodinggames.rts.game.units.a.a
   class_392 field_1353 = new class_392();

   // $FF: renamed from: i_ () float
   public float method_1036() {
      return this.field_1352.method_1036();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l) int
   public int method_1037(class_121 var1) {
      return this.field_1352.method_1037(var1);
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return this.field_1352.method_1044();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      String var1 = this.field_1352.method_1045();
      return var1;
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return 0;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_1047(class_39 var1, boolean var2) {
      return this.field_1352.method_1047(var1, var2);
   }

   // $FF: renamed from: k_ () boolean
   public boolean method_1048() {
      return this.field_1352.method_1048();
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1050(class_39 var1, boolean var2) {
      return true;
   }

   // $FF: renamed from: o () int
   public int method_1057() {
      return this.field_1352.method_1057();
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) void
   public void method_1065(class_39 var1) {
      this.field_1352.method_1065(var1);
   }

   public boolean equals(Object var1) {
      return var1 instanceof class_125 ? this.field_1352.equals(((class_125)var1).field_1352) : false;
   }

   // $FF: renamed from: a (java.lang.String) boolean
   public boolean method_1040(String var1) {
      return this.field_1352.method_1040(var1);
   }

   // $FF: renamed from: q () boolean
   public boolean method_1049() {
      return this.field_1352.method_1049();
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1051(class_39 var1) {
      return !this.field_1353.method_2495(this, var1) ? false : this.field_1352.method_1051(var1);
   }

   // $FF: renamed from: r () boolean
   public boolean method_1052() {
      return this.field_1352.method_1052();
   }

   // $FF: renamed from: h () boolean
   public boolean method_1053() {
      return this.field_1352.method_1053();
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   public class_24 method_1055() {
      return this.field_1352.method_1055();
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return this.field_1352.method_1058();
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public class_516 method_1059() {
      return this.field_1352.method_1059();
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return this.field_1352.method_1060();
   }

   // $FF: renamed from: j () java.lang.String
   public String method_1062() {
      return this.field_1352.method_1062();
   }

   // $FF: renamed from: d_ () java.lang.String
   public String method_1063() {
      String var1 = this.field_1352.method_1063();
      class_24 var2 = this.field_1352.method_1055();
      if (var2 != null && var2 instanceof class_479) {
         class_479 var3 = (class_479)var2;
         if (var3.field_4213 != null) {
            String var4 = var3.field_4213.method_1422();
            var4 = class_296.method_2060(var4, 30);
            var1 = var1 + "\n(mod: " + var4 + ")";
         }
      }

      return var1;
   }

   // $FF: renamed from: s () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_1066() {
      return this.field_1352.method_1066();
   }

   public int hashCode() {
      return this.field_1352.hashCode();
   }

   public String toString() {
      return this.field_1352.toString();
   }

   public class_125(class_121 var1, class_392 var2) {
      super(var1.method_1043());
      this.field_1352 = var1;
      this.field_1353 = var2;
      this.e(this.field_1352.method_1043());
      this.c = this.field_1352.field_1346;
   }

   // $FF: renamed from: t () com.corrodinggames.rts.game.units.a.l
   public class_121 method_1083() {
      return this.field_1352;
   }

   // $FF: renamed from: u () boolean
   public boolean method_1075() {
      return true;
   }

   // $FF: renamed from: p () boolean
   public boolean method_1067() {
      return this.field_1353.method_2495(this, (class_39)null);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_1037((class_121)var1);
   }
}
