package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.av
public abstract class class_38 extends class_37 {
   // $FF: renamed from: dl int
   public int field_114;
   // $FF: renamed from: dm int
   public int field_115;
   // $FF: renamed from: dn int
   public int field_116;
   // $FF: renamed from: do int
   public int field_117;
   // $FF: renamed from: dp boolean
   public boolean field_118;

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.h.e) void
   public strictfp void method_205(class_306 var1) {
      this.method_207(var1.field_2531);
      this.method_208(var1.field_2532);
      this.field_118 = true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, int) void
   public strictfp void method_206(class_306 var1, int var2) {
      this.method_207(var1.field_2531 / var2);
      this.method_208(var1.field_2532);
      this.field_118 = false;
   }

   // $FF: renamed from: J (int) void
   public strictfp void method_207(int var1) {
      this.field_114 = var1;
      this.field_116 = var1 / 2;
   }

   // $FF: renamed from: K (int) void
   public strictfp void method_208(int var1) {
      this.field_115 = var1;
      this.field_117 = var1 / 2;
   }

   protected strictfp class_38(boolean var1) {
      super(var1);
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      super.a();
   }
}
