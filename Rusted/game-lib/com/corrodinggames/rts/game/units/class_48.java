package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.game.units.e
public class class_48 extends class_47 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_357 = null;
   // $FF: renamed from: b float
   float field_358;
   // $FF: renamed from: c android.graphics.PorterDuffColorFilter
   static PorterDuffColorFilter field_359;

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public class_469 method_517() {
      return class_469.field_4066;
   }

   // $FF: renamed from: c () void
   public static void method_518() {
      class_236 var0 = class_236.method_1549();
      field_357 = var0.field_1935.method_60(R$drawable.crystal);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_346() {
      return field_357;
   }

   // $FF: renamed from: e () boolean
   public boolean method_250() {
      return true;
   }

   // $FF: renamed from: a (int) void
   public void method_356(int var1) {
   }

   public class_48(boolean var1) {
      super(var1);
      this.G = field_357;
      this.b(field_357);
      this.by = 11.0F;
      this.bz = this.by + 1.0F;
      this.bJ = 600.0F;
      this.bI = this.bJ;
      this.I(1);
      this.n.method_1911(0, -1, 0, 0);
      this.o.method_1912(this.n);
   }

   // $FF: renamed from: f () android.graphics.Paint
   public Paint method_516() {
      Paint var1 = super.method_516();
      return var1;
   }

   // $FF: renamed from: a (float) void
   public void method_176(float var1) {
      super.a(var1);
      this.field_358 += 0.01F * var1;
      if (this.field_358 > 1.0F) {
         --this.field_358;
         if (this.field_358 > 1.0F) {
            this.field_358 = 0.0F;
         }
      }

   }

   // $FF: renamed from: g () float
   public float method_316() {
      return 0.02F;
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public class_503 method_279() {
      return class_503.field_4617;
   }

   // $FF: renamed from: i () boolean
   public boolean method_280() {
      return false;
   }

   // $FF: renamed from: o_ () boolean
   public boolean method_288() {
      class_236 var1 = class_236.method_1549();
      cA.method_1970(this.bK());
      return RectF.method_1976(var1.field_1979, cA);
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_347() {
      return null;
   }

   // $FF: renamed from: l () boolean
   public boolean method_312() {
      return false;
   }

   // $FF: renamed from: m () float
   public float method_439() {
      return 0.0F;
   }

   // $FF: renamed from: b (int) float
   public float method_441(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: c (int) float
   public float method_453(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public void method_471(class_39 var1, int var2) {
   }

   // $FF: renamed from: n () void
   public void method_249() {
      super.n();
      this.field_358 = (this.di * 5.0F + this.dh * 3.0F) % 1.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_517();
   }

   static {
      field_359 = new PorterDuffColorFilter(Color.method_3076(200, 200, 200), Mode.MULTIPLY);
   }
}
