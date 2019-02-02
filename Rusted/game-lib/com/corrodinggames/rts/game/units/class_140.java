package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.a.class_137;
import com.corrodinggames.rts.game.units.a.class_516;
import com.corrodinggames.rts.game.units.a.class_518;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.game.units.j
class class_140 extends class_137 {
   // $FF: renamed from: a boolean
   boolean field_1369;
   // $FF: renamed from: b boolean
   boolean field_1370;

   public strictfp class_140(boolean var1, boolean var2) {
      super("changeUnitTab" + var1 + "d:" + var2);
      this.field_1369 = var1;
      this.field_1370 = var2;
   }

   // $FF: renamed from: b () java.lang.String
   public strictfp String method_1044() {
      return this.method_1062();
   }

   // $FF: renamed from: j () java.lang.String
   public strictfp String method_1062() {
      class_81 var1 = class_81.method_648();
      if (var1 == null) {
         return "<NULL>";
      } else if (this.field_1370) {
         return var1.field_717.method_1957();
      } else {
         String var2 = "";
         if (this.field_1369) {
            var2 = var2 + "<- ";
         }

         if (!this.field_1369) {
            var2 = var2 + " ->";
         }

         return var2;
      }
   }

   // $FF: renamed from: m () void
   public strictfp void method_1121() {
      class_81 var1 = class_81.method_648();
      if (var1 == null) {
         class_236.method_1588("Editor not active");
      } else if (!this.field_1370) {
         var1.field_717 = var1.field_717.method_1958(this.field_1369);
      }
   }

   // $FF: renamed from: a () java.lang.String
   public strictfp String method_1045() {
      return "Change unit tab in editor";
   }

   // $FF: renamed from: k () float
   public strictfp float method_1071() {
      return !class_236.method_1654() ? 0.8F : 0.5F;
   }

   // $FF: renamed from: l () int
   public strictfp int method_1072() {
      return this.field_1370 ? 2 : 4;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public strictfp class_518 method_1060() {
      return this.field_1370 ? class_518.field_4706 : super.method_1060();
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public strictfp class_516 method_1059() {
      return this.field_1370 ? class_516.field_4691 : super.method_1059();
   }
}
