package com.corrodinggames.rts.game.b;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;

// $FF: renamed from: com.corrodinggames.rts.game.b.d
public class class_422 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.l
   public class_22 field_3515;
   // $FF: renamed from: b int
   int field_3516;
   // $FF: renamed from: c int
   int field_3517;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_3518;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_3519;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.l
   public class_22 field_3520;
   // $FF: renamed from: g float
   public float field_3521;
   // $FF: renamed from: h android.graphics.Paint
   public Paint field_3522;
   // $FF: renamed from: i int
   public int field_3523;
   // $FF: renamed from: j int
   public int field_3524;
   // $FF: renamed from: k boolean
   public boolean field_3525;
   // $FF: renamed from: l boolean
   public boolean field_3526;
   // $FF: renamed from: m int
   public int field_3527;
   // $FF: renamed from: n boolean
   public boolean field_3528;
   // $FF: renamed from: o android.graphics.Rect
   public Rect field_3529;
   // $FF: renamed from: p android.graphics.Rect
   public Rect field_3530;
   // $FF: renamed from: q android.graphics.Rect
   public Rect field_3531;
   // $FF: renamed from: r com.corrodinggames.rts.game.b.c
   // $FF: synthetic field
   final class_423 field_3532;

   // $FF: renamed from: a () void
   public strictfp void method_2677() {
      class_236 var1 = class_236.method_1549();
      this.field_3519 = var1.field_1935.method_63(this.field_3518.field_2531, this.field_3518.field_2532, true);
      this.field_3520 = var1.field_1935.method_54(this.field_3519);
   }

   // $FF: renamed from: b () android.graphics.Rect
   public strictfp Rect method_2678() {
      this.field_3531.method_1911(this.method_2679(), this.method_2680(), this.method_2679() + this.field_3532.field_3541, this.method_2680() + this.field_3532.field_3541);
      return this.field_3531;
   }

   public strictfp class_422(class_423 var1, int var2, int var3) {
      this.field_3532 = var1;
      this.field_3522 = new class_441();
      this.field_3525 = true;
      this.field_3526 = true;
      this.field_3527 = 0;
      this.field_3528 = false;
      this.field_3529 = new Rect();
      this.field_3530 = new Rect();
      this.field_3531 = new Rect();
      this.field_3523 = var2;
      this.field_3524 = var3;
   }

   // $FF: renamed from: c () int
   public strictfp int method_2679() {
      return this.field_3532.field_3538 + this.field_3523 * this.field_3532.field_3543;
   }

   // $FF: renamed from: d () int
   public strictfp int method_2680() {
      return this.field_3532.field_3539 + this.field_3524 * this.field_3532.field_3543;
   }
}
