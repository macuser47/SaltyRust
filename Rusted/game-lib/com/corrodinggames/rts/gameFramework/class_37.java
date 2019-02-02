package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.aw
public abstract class class_37 extends class_34 {
   // $FF: renamed from: dq int
   public int field_113 = 0;

   protected strictfp class_37() {
   }

   protected strictfp class_37(boolean var1) {
      super(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2563("xy is:");
      var1.method_2542(this.dh);
      var1.method_2542(this.di);
      var1.method_2542(this.dj);
      var1.method_2541(this.field_113);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.dh = var1.method_3012();
      this.di = var1.method_3012();
      this.dj = var1.method_3012();
      this.field_113 = var1.method_3011();
      super.method_175(var1);
   }
}
