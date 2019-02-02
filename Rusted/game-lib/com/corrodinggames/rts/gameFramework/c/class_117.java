package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.y
abstract class class_117 implements Comparable {
   // $FF: renamed from: c long
   long field_1337;
   // $FF: renamed from: d float
   float field_1338;
   // $FF: renamed from: e float
   float field_1339;
   // $FF: renamed from: f java.lang.String
   String field_1340;
   // $FF: renamed from: g boolean
   boolean field_1341;

   public strictfp class_117(float var1, float var2) {
      this.field_1338 = var1;
      this.field_1339 = var2;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.c.y) int
   public strictfp int method_1031(class_117 var1) {
      return (int)(var1.field_1337 - this.field_1337);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.c.y) boolean
   public strictfp boolean method_1032(class_117 var1) {
      if (this.field_1337 + this.method_1033() < System.currentTimeMillis()) {
         return false;
      } else {
         float var2 = class_296.method_2026(this.field_1338, this.field_1339, var1.field_1338, var1.field_1339);
         return var2 <= 90000.0F;
      }
   }

   // $FF: renamed from: b () long
   protected strictfp long method_1033() {
      return 5000L;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.c.y) void
   public abstract void method_1034(class_117 var1);

   // $FF: renamed from: a () java.lang.String
   public abstract String method_1035();

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_1031((class_117)var1);
   }
}
