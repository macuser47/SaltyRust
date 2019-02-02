package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;

// $FF: renamed from: com.corrodinggames.rts.game.units.l
public class class_46 extends class_45 {
   // $FF: renamed from: a int
   public int field_346 = 14;
   // $FF: renamed from: b float
   public float field_347 = 60.0F;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2539(0);
      var1.method_2541(this.field_346);
      var1.method_2542(this.field_347);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      var1.method_3009();
      this.field_346 = var1.method_3011();
      this.field_347 = var1.method_3012();
      super.a(var1);
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_504() {
      return class_469.field_4076;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_505() {
      class_236 var0 = class_236.method_1549();
   }

   public strictfp class_46(boolean var1) {
      super(var1);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      this.field_347 -= var1;
      if (this.field_347 < 0.0F) {
         this.bw();
      }

   }

   // $FF: renamed from: b_ () int
   public strictfp int method_490() {
      return this.field_346;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_504();
   }
}
