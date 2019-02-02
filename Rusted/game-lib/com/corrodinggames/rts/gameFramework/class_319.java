package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.ac;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.g.class_238;
import com.corrodinggames.rts.gameFramework.g.class_242;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.d
public class class_319 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.g.c
   public class_242 field_2577;
   // $FF: renamed from: b long
   public long field_2578;
   // $FF: renamed from: c float
   public float field_2579;
   // $FF: renamed from: d float
   public float field_2580;
   // $FF: renamed from: e float
   public float field_2581;
   // $FF: renamed from: f float
   public float field_2582;
   // $FF: renamed from: g int
   public int field_2583;
   // $FF: renamed from: h com.corrodinggames.rts.game.units.ac
   public class_503 field_2584;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_2163(class_404 var1) {
      var1.method_2543(this.field_2578);
      var1.method_2542(this.field_2579);
      var1.method_2542(this.field_2580);
      var1.method_2542(this.field_2581);
      var1.method_2542(this.field_2582);
      var1.method_2541(this.field_2583);
      var1.method_2553(this.field_2584);
      var1.method_2540(this.field_2577 != null);
      if (this.field_2577 != null) {
         this.field_2577.method_1735(var1);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_2164(class_463 var1) {
      this.field_2578 = var1.method_3013();
      this.field_2579 = var1.method_3012();
      this.field_2580 = var1.method_3012();
      this.field_2581 = var1.method_3012();
      this.field_2582 = var1.method_3012();
      this.field_2583 = var1.method_3011();
      this.field_2584 = (class_503)var1.method_3022(ac.class);
      boolean var2 = var1.method_3010();
      if (var2) {
         boolean var3 = false;
         this.field_2577 = new class_242((class_238)null, var3);
         this.field_2577.method_1736(var1);
      }

   }
}
