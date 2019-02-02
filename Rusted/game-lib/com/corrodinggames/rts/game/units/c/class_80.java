package com.corrodinggames.rts.game.units.c;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_36;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_281;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.e.class_79;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.c.a
public class class_80 extends class_79 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_680 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_681 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_682 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_683 = new class_306[10];
   // $FF: renamed from: e int
   int field_684 = 0;
   // $FF: renamed from: f float
   float field_685 = 0.0F;
   // $FF: renamed from: g android.graphics.Rect
   Rect field_686 = new Rect();
   // $FF: renamed from: h android.graphics.Rect
   Rect field_687 = new Rect();

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public class_469 method_644() {
      return class_469.field_4052;
   }

   // $FF: renamed from: c () void
   public static void method_645() {
      class_236 var0 = class_236.method_1549();
      field_681 = var0.field_1935.method_60(R$drawable.ladybug);
      field_683 = class_107.method_948(field_681);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_346() {
      return this.bi ? field_680 : field_683[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_347() {
      return null;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public boolean method_250() {
      class_236 var1 = class_236.method_1549();
      class_390 var2 = var1.field_1938.method_2488(this.dh, this.di, this.dj, class_393.field_3209, false, class_395.field_3223);
      if (var2 != null) {
      }

      var1.field_1933.method_3323(class_525.field_4768, 0.8F, this.dh, this.di);
      class_36.method_201(this, 1);
      return false;
   }

   public class_80(boolean var1) {
      super(var1);
      this.J(17);
      this.K(26);
      this.by = 5.0F;
      this.bz = this.by + 3.0F;
      this.bJ = 130.0F;
      this.bI = this.bJ;
      this.G = field_681;
      this.I = class_281.field_2408;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public Rect method_299(boolean var1) {
      int var2 = this.field_684 * this.dl;
      byte var3 = 0;
      this.field_686.method_1911(var2, var3, var2 + this.dl, var3 + this.dm);
      return this.field_686;
   }

   // $FF: renamed from: bg () boolean
   public boolean method_223() {
      return true;
   }

   // $FF: renamed from: bf () boolean
   public boolean method_222() {
      return true;
   }

   // $FF: renamed from: a (float) void
   public void method_176(float var1) {
      super.a(var1);
      if (this.bU) {
         if (this.field_684 == 0) {
            this.field_684 = 1;
         } else {
            this.field_684 = 0;
         }
      }

      if (this.field_685 != 0.0F) {
         this.field_685 = class_296.method_2020(this.field_685, var1);
         this.field_684 = 2;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public void method_471(class_39 var1, int var2) {
      class_97.method_700(this, var1, 14.0F, (class_97)null);
      this.field_685 = 4.0F;
      PointF var3 = this.w(var2);
      class_236 var4 = class_236.method_1549();
      var4.field_1933.method_3323(class_525.field_4769, 0.3F, var3.field_2406, var3.field_2407);
   }

   // $FF: renamed from: m () float
   public float method_439() {
      return 43.0F;
   }

   // $FF: renamed from: b (int) float
   public float method_441(int var1) {
      return 17.0F;
   }

   // $FF: renamed from: s () float
   public float method_458() {
      return 1.7F;
   }

   // $FF: renamed from: t () float
   public float method_451() {
      return 5.5F;
   }

   // $FF: renamed from: c (int) float
   public float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: c (float) boolean
   public boolean method_181(float var1) {
      return super.c(var1);
   }

   // $FF: renamed from: v () float
   public float method_466() {
      return 0.07F;
   }

   // $FF: renamed from: w () float
   public float method_467() {
      return 0.12F;
   }

   // $FF: renamed from: l () boolean
   public boolean method_312() {
      return true;
   }

   // $FF: renamed from: T () boolean
   public boolean method_380() {
      return false;
   }

   // $FF: renamed from: g (int) float
   public float method_474(int var1) {
      return 7.0F;
   }

   // $FF: renamed from: x () boolean
   public boolean method_456() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_644();
   }
}
