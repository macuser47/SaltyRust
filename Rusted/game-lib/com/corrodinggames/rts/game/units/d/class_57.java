package com.corrodinggames.rts.game.units.d;

import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_35;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.f
public class class_57 extends class_50 {
   // $FF: renamed from: a float
   float field_450;
   // $FF: renamed from: b int
   int field_451 = 1;
   // $FF: renamed from: c float
   float field_452 = 0.0F;
   // $FF: renamed from: d int
   int field_453 = 0;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_454 = new class_306[10];
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_455 = new class_306[10];
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_456 = new class_306[10];
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_457 = null;
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_458 = null;
   // $FF: renamed from: j android.graphics.Rect
   Rect field_459 = new Rect();
   // $FF: renamed from: k android.graphics.Rect
   Rect field_460 = new Rect();
   // $FF: renamed from: l int
   public static int field_461 = 0;
   // $FF: renamed from: v com.corrodinggames.rts.game.units.a.l
   static class_121 field_462 = new f$1(102);
   // $FF: renamed from: w com.corrodinggames.rts.game.units.a.l
   static class_121 field_463 = new f$2(103);
   // $FF: renamed from: x java.util.ArrayList
   static ArrayList field_464 = new ArrayList();
   // $FF: renamed from: y java.util.ArrayList
   static ArrayList field_465;
   // $FF: renamed from: z java.util.ArrayList
   static ArrayList field_466;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_450);
      var1.method_2540(this.field_451 > 1);
      var1.method_2541(this.field_451);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_450 = var1.method_3012();
      int var2 = 1;
      boolean var3 = var1.method_3010();
      if (var3) {
         var2 = 2;
      }

      if (var1.method_3006() >= 31) {
         var2 = var1.method_3011();
      }

      if (var2 != 1) {
         this.method_356(var2);
      }

      super.method_175(var1);
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_559() {
      return class_469.field_4033;
   }

   // $FF: renamed from: aS () boolean
   public strictfp boolean method_493() {
      class_236 var1 = class_236.method_1549();
      var1.field_1932.method_2578(this.dh, this.di);
      class_416 var2 = var1.field_1932.method_2587(var1.field_1932.field_3355, var1.field_1932.field_3356);
      return var2 != null && var2.field_3428 ? super.aS() : false;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_560() {
      class_236 var0 = class_236.method_1549();
      class_306 var1 = var0.field_1935.method_60(R$drawable.extractor);
      class_306 var2 = var0.field_1935.method_60(R$drawable.extractor_t2);
      class_306 var3 = var0.field_1935.method_60(R$drawable.extractor_t3);
      field_458 = var0.field_1935.method_60(R$drawable.extractor_dead);
      field_454 = class_107.method_948(var1);
      field_455 = class_107.method_948(var2);
      field_456 = class_107.method_948(var3);
      var1.method_2129();
      var2.method_2129();
      var3.method_2129();
      field_457 = var0.field_1935.method_60(R$drawable.extractor_back);
   }

   // $FF: renamed from: D () boolean
   public strictfp boolean method_510() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2460(this.dh, this.di, this.dj);
      this.G = field_458;
      this.m = null;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4757, 0.8F, this.dh, this.di);
      class_35 var2 = class_35.method_194(this.dh, this.di);
      var2.field_89 = -6684775;
      class_35 var3 = class_35.method_195(this.dh, this.di);
      var3.field_80 = 500.0F;
      var3.field_89 = -6684775;
      var1.field_1938.method_2485(class_395.field_3225);
      class_390 var4 = var1.field_1938.method_2479(this.dh, this.di, this.dj, -1127220);
      if (var4 != null) {
         var4.field_3145 = 0.15F;
         var4.field_3144 = 1.0F;
         var4.field_3179 = 2;
         var4.field_3160 = 35.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3159 = 0.0F;
         var4.field_3141 = -13378253;
      }

      this.aO();
      return false;
   }

   // $FF: renamed from: aP () int
   public strictfp int method_488() {
      return 16;
   }

   // $FF: renamed from: I () void
   public strictfp void method_345() {
      super.I();
      if (this.bi) {
         this.m = null;
      } else {
         this.m = field_457;
      }

   }

   // $FF: renamed from: ce () boolean
   public strictfp boolean method_506() {
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      if (this.bi) {
         return field_458;
      } else if (this.bk == null) {
         return field_454[field_454.length - 1];
      } else if (this.field_451 == 3) {
         return field_456[this.bk.method_963()];
      } else {
         return this.field_451 == 2 ? field_455[this.bk.method_963()] : field_454[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   public strictfp class_57(boolean var1) {
      super(var1);
      this.G = field_454[9];
      this.J(37);
      this.K(56);
      this.by = 18.0F;
      this.bz = this.by;
      this.bJ = 800.0F;
      this.bI = this.bJ;
      this.n.method_1911(0, -1, 0, 0);
      this.o.method_1912(this.n);
      this.method_345();
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (this.bj() && !this.bi) {
         this.field_452 = class_296.method_2020(this.field_452, var1 * (float)this.field_451);
         if (this.field_452 == 0.0F) {
            this.field_452 = 17.0F;
            ++this.field_453;
            if (this.field_453 > 7) {
               this.field_453 = 0;
            }

            if (this.field_453 <= 3) {
               this.u = this.field_453;
            } else {
               this.u = 7 - this.field_453;
            }
         }

         this.field_450 += var1;
         if (this.field_450 > 39.9F) {
            this.field_450 -= 40.0F;
            this.bk.method_930((int)this.method_294());
         }

      }
   }

   // $FF: renamed from: bI () float
   public strictfp float method_294() {
      if (this.field_451 == 3) {
         return 18.0F;
      } else {
         return this.field_451 == 2 ? 12.0F : 8.0F;
      }
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return super.method_181(var1);
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      throw new RuntimeException("Unit cannot shoot");
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 0.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      if (var1.field_16.equals(field_462.method_1043())) {
         this.method_356(2);
         this.L();
      }

      if (var1.field_16.equals(field_463.method_1043())) {
         this.method_356(3);
         this.L();
      }

   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      if (this.field_451 == 1) {
         return field_462.method_1043();
      } else {
         return this.field_451 == 2 ? field_463.method_1043() : class_121.field_1347;
      }
   }

   // $FF: renamed from: K () int
   public strictfp int method_261() {
      return this.field_451;
   }

   // $FF: renamed from: a (int) void
   public strictfp void method_356(int var1) {
      if (this.field_451 > var1) {
         this.field_451 = 1;
         this.bJ = 800.0F;
         if (this.bI > this.bJ) {
            this.bI = this.bJ;
         }
      }

      if (this.field_451 < 2 && var1 >= 2) {
         this.bJ += 200.0F;
         this.bI += 200.0F;
      }

      if (this.field_451 < 3 && var1 >= 3) {
         this.bJ += 1000.0F;
         this.bI += 1000.0F;
      }

      this.field_451 = var1;
      if (aT.contains(this)) {
         class_107.method_959(this);
      }

      this.method_345();
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      if (this.field_451 == 1) {
         return field_464;
      } else {
         return this.field_451 == 2 ? field_465 : field_466;
      }
   }

   // $FF: renamed from: q (com.corrodinggames.rts.game.units.aa) int
   public strictfp int method_289(class_39 var1) {
      return var1.method_306() ? 110 : 0;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_559();
   }

   static {
      field_464.add(field_462);
      field_465 = new ArrayList();
      field_465.add(field_463);
      field_466 = new ArrayList();
   }
}
