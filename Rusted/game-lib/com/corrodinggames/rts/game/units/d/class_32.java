package com.corrodinggames.rts.game.units.d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_30;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.i
public class class_32 extends class_30 {
   // $FF: renamed from: a java.lang.String
   public String field_16;
   // $FF: renamed from: b int
   public int field_17;
   // $FF: renamed from: c float
   public float field_18;
   // $FF: renamed from: d int
   public int field_19;
   // $FF: renamed from: e boolean
   public boolean field_20;
   // $FF: renamed from: f android.graphics.PointF
   public PointF field_21;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.aa
   public class_39 field_22;
   // $FF: renamed from: h java.lang.String
   public String field_23;
   // $FF: renamed from: i boolean
   public boolean field_24;
   // $FF: renamed from: j boolean
   public boolean field_25;
   // $FF: renamed from: k float
   public float field_26;

   public strictfp class_32() {
      this.field_23 = class_121.field_1347;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2541(-1);
      var1.method_2541(this.field_17);
      var1.method_2542(this.field_18);
      var1.method_2541(-1);
      var1.method_2541(this.field_19);
      var1.method_2540(this.field_20);
      var1.method_2545(this.field_16);
      var1.method_2545(this.field_23);
      var1.method_2549(this.field_22);
      var1.method_2552(this.field_21);
      var1.method_2540(this.field_25);
      var1.method_2542(this.field_26);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_154(class_463 var1) {
      this.field_16 = String.valueOf(var1.method_3011());
      this.field_17 = var1.method_3011();
      this.field_18 = var1.method_3012();
      if (var1.method_3006() >= 4) {
         this.field_23 = class_121.method_1041(String.valueOf(var1.method_3011()));
      }

      if (var1.method_3006() >= 6) {
         this.field_19 = var1.method_3011();
      }

      if (var1.method_3006() >= 25) {
         this.field_20 = var1.method_3010();
      }

      if (var1.method_3006() >= 33) {
         this.field_16 = var1.method_3015();
         this.field_23 = class_121.method_1041(var1.method_3015());
      }

      if (var1.method_3006() >= 61) {
         this.field_22 = var1.method_3019();
         this.field_21 = var1.method_3037();
      }

      if (var1.method_3006() >= 64) {
         this.field_25 = var1.method_3010();
         this.field_26 = var1.method_3012();
      }

   }
}
