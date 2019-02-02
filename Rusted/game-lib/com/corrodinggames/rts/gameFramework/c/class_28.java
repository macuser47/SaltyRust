package com.corrodinggames.rts.gameFramework.c;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_27;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.n
public class class_28 extends class_27 {
   // $FF: renamed from: a float[]
   float[] field_4;
   // $FF: renamed from: b int
   int field_5 = 0;
   // $FF: renamed from: c android.graphics.Paint
   Paint field_6;
   // $FF: renamed from: d int
   int field_7;

   class_28(int var1, Paint var2) {
      this.field_7 = var1;
      this.field_4 = new float[var1 * 2];
      this.field_6 = var2;
   }

   // $FF: renamed from: a (float, float) void
   public final void method_147(float var1, float var2) {
      this.field_4[this.field_5] = var1;
      this.field_4[this.field_5 + 1] = var2;
      this.field_5 += 2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.l) void
   public void method_146(class_22 var1) {
      var1.method_86(this.field_4, 0, this.field_5, this.field_6);
      class_174.method_1235(this);
   }
}
