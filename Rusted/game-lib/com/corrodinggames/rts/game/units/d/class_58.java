package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.g
public class class_58 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_467 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_468 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_469 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_470 = new class_306[10];
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_471 = new class_306[10];
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_472 = new class_306[10];
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_473 = null;
   // $FF: renamed from: h float
   float field_474;
   // $FF: renamed from: i float
   float field_475 = 0.0F;
   // $FF: renamed from: j int
   int field_476 = 0;
   // $FF: renamed from: k com.corrodinggames.rts.game.units.a.l
   static class_121 field_477 = new g$1(102);
   // $FF: renamed from: l com.corrodinggames.rts.game.units.a.l
   static class_121 field_478 = new g$2(103);
   // $FF: renamed from: v java.util.ArrayList
   static ArrayList field_479 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2542(this.field_474);
      var1.method_2540(this.r == 2);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_175(class_463 var1) {
      this.field_474 = var1.method_3012();
      boolean var2 = var1.method_3010();
      if (var1.method_3006() < 51 && var2) {
         this.method_356(2);
      }

      super.method_175(var1);
   }

   // $FF: renamed from: H (int) void
   public void method_508(int var1) {
      this.method_356(var1);
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public class_469 method_561() {
      return class_469.field_4068;
   }

   // $FF: renamed from: c () void
   public static void method_562() {
      class_236 var0 = class_236.method_1549();
      field_467 = var0.field_1935.method_60(R$drawable.power);
      field_468 = var0.field_1935.method_60(R$drawable.power_t2);
      field_469 = var0.field_1935.method_60(R$drawable.power_t3);
      field_470 = class_107.method_948(field_467);
      field_471 = class_107.method_948(field_468);
      field_472 = class_107.method_948(field_469);
      field_473 = var0.field_1935.method_60(R$drawable.power_dead);
   }

   // $FF: renamed from: D () boolean
   public boolean method_510() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2460(this.dh, this.di, this.dj);
      this.G = field_473;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4757, 0.8F, this.dh, this.di);
      var1.field_1938.method_2485(class_395.field_3225);
      class_390 var2 = var1.field_1938.method_2479(this.dh, this.di, this.dj, -1127220);
      if (var2 != null) {
         var2.field_3145 = 0.15F;
         var2.field_3144 = 1.0F;
         var2.field_3179 = 2;
         var2.field_3160 = 35.0F;
         var2.field_3161 = var2.field_3160;
         var2.field_3159 = 0.0F;
         var2.field_3141 = -14492382;
      }

      this.aO();
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_346() {
      if (this.bi) {
         return field_473;
      } else if (this.bk == null) {
         return field_470[field_470.length - 1];
      } else if (this.r == 1) {
         return field_470[this.bk.method_963()];
      } else if (this.r == 2) {
         return field_471[this.bk.method_963()];
      } else if (this.r == 3) {
         return field_472[this.bk.method_963()];
      } else {
         class_236.method_1591("Unknown tech level:" + this.r);
         return field_470[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_347() {
      return null;
   }

   public class_58(boolean var1) {
      super(var1);
      this.G = field_467;
      this.a(this.G, 3);
      this.by = 25.0F;
      this.bz = this.by;
      this.bJ = 800.0F;
      this.bI = this.bJ;
      this.n.method_1911(-1, -1, 1, 1);
      this.o.method_1912(this.n);
   }

   // $FF: renamed from: a (float) void
   public void method_176(float var1) {
      super.method_176(var1);
      if (this.bj() && !this.bi) {
         this.field_475 = class_296.method_2020(this.field_475, var1);
         if (this.field_475 == 0.0F) {
            this.field_475 = 17.0F;
            ++this.field_476;
            if (this.field_476 > 5) {
               this.field_476 = 0;
            }

            if (this.field_476 <= 2) {
               this.u = this.field_476;
            } else {
               this.u = 5 - this.field_476;
            }
         }

         this.field_474 += var1;
         if (this.field_474 > 39.9F) {
            this.field_474 -= 40.0F;
            this.bk.method_930((int)this.method_294());
         }

      }
   }

   // $FF: renamed from: bI () float
   public float method_294() {
      if (this.r == 1) {
         return 2.0F;
      } else {
         return this.r == 2 ? 7.0F : 14.0F;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public void method_10(class_32 var1) {
      if (var1.field_16.equals(field_477.method_1043())) {
         this.method_356(2);
         this.L();
      }

      if (var1.field_16.equals(field_478.method_1043())) {
         this.method_356(3);
         this.L();
      }

   }

   // $FF: renamed from: by () java.lang.String
   public String method_269() {
      if (this.r == 1) {
         return field_477.method_1043();
      } else {
         return this.r == 2 ? field_478.method_1043() : class_121.field_1347;
      }
   }

   // $FF: renamed from: K () int
   public int method_261() {
      return this.r;
   }

   // $FF: renamed from: a (int) void
   public void method_356(int var1) {
      if (this.r > var1) {
         this.r = 1;
         this.bJ = 800.0F;
         if (this.bI > this.bJ) {
            this.bI = this.bJ;
         }
      }

      if (this.r < 2 && var1 >= 2) {
         this.bJ += 500.0F;
         this.bI += 500.0F;
      }

      if (this.r < 3 && var1 >= 3) {
         this.bJ += 1300.0F;
         this.bI += 1300.0F;
      }

      this.r = var1;
      if (aT.contains(this)) {
         class_107.method_959(this);
      }

      this.I();
   }

   // $FF: renamed from: E () java.util.ArrayList
   public ArrayList method_260() {
      return field_479;
   }

   // $FF: renamed from: bY () float
   public float method_325() {
      return super.bY() - 8.0F;
   }

   // $FF: renamed from: aP () int
   public int method_488() {
      return 12;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_561();
   }

   static {
      field_479.add(field_477);
      field_479.add(field_478);
   }
}
