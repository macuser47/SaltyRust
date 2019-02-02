package com.corrodinggames.rts.game.units.d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.n
public class class_60 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_488 = new class_306[10];
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_489 = new class_306[10];
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_490 = null;
   // $FF: renamed from: d boolean
   boolean field_491;
   // $FF: renamed from: e boolean
   boolean field_492;
   // $FF: renamed from: f float
   float field_493;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_494 = null;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_495 = new class_306[10];
   // $FF: renamed from: i android.graphics.PointF
   PointF field_496 = new PointF();
   // $FF: renamed from: j android.graphics.Rect
   Rect field_497 = new Rect();
   // $FF: renamed from: k com.corrodinggames.rts.game.units.a.l
   static class_121 field_498 = new n$1(102);
   // $FF: renamed from: l java.util.ArrayList
   static ArrayList field_499 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2540(this.field_491);
      var1.method_2542(this.bP);
      var1.method_2540(this.field_492);
      var1.method_2542(this.field_493);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_175(class_463 var1) {
      this.field_491 = var1.method_3010();
      this.bP = var1.method_3012();
      this.field_492 = var1.method_3010();
      if (var1.method_3006() >= 38) {
         this.field_493 = var1.method_3012();
      }

      super.method_175(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_495[this.bk.method_963()];
   }

   // $FF: renamed from: b () void
   public static void method_566() {
      class_236 var0 = class_236.method_1549();
      field_490 = var0.field_1935.method_60(R$drawable.laser_defence_dead);
      class_306 var1 = var0.field_1935.method_60(R$drawable.laser_defence);
      class_306 var2 = var0.field_1935.method_60(R$drawable.laser_defence_t2);
      field_488 = class_107.method_948(var1);
      field_489 = class_107.method_948(var2);
      var1.method_2129();
      var1 = null;
      var2.method_2129();
      var2 = null;
      field_494 = var0.field_1935.method_60(R$drawable.unit_icon_building_turrent);
      field_495 = class_107.method_948(field_494);
   }

   // $FF: renamed from: D () boolean
   public boolean method_510() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2460(this.dh, this.di, this.dj);
      this.G = field_490;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4757, 0.8F, this.dh, this.di);
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_346() {
      if (this.bi) {
         return field_490;
      } else if (this.bk == null) {
         return field_488[field_488.length - 1];
      } else {
         return !this.field_491 ? field_488[this.bk.method_963()] : field_489[this.bk.method_963()];
      }
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_347() {
      return null;
   }

   public class_60(boolean var1) {
      super(var1);
      this.a(field_488[0], 2);
      this.bP = 1.0F;
      this.by = 19.0F;
      this.bz = this.by;
      this.bJ = 500.0F;
      this.bI = this.bJ;
      this.G = field_488[field_488.length - 1];
      this.n.method_1911(0, 0, 1, 1);
      this.o.method_1911(0, 0, 1, 1);
   }

   // $FF: renamed from: a (float) void
   public void method_176(float var1) {
      super.method_176(var1);
      if (this.bj() && !this.bi) {
         class_236 var2 = class_236.method_1549();
         float var3 = 4.0E-4F * var1;
         if (this.field_491) {
            var3 += 2.0E-4F * var1;
         }

         this.bP = class_296.method_2021(this.bP, 1.0F, var3);
         if (this.bP >= 1.0F) {
            this.field_492 = false;
         }

         this.field_493 -= var1;
         this.field_496.method_1961(this.method_478(0));
         if (this.bP > 0.0F && !this.field_492) {
            float var4;
            if (!this.field_491) {
               var4 = 0.11F;
            } else {
               var4 = 0.05F;
            }

            if (method_567(this, this.field_496.field_2406, this.field_496.field_2407, this.dj, this.method_439(), var4)) {
               this.field_493 = 3.0F;
            }

            if (this.bP < 0.0F) {
               this.bP = 0.0F;
               this.field_492 = true;
            }
         }

         if (this.field_492) {
            this.u = 1;
         } else {
            this.u = 0;
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float, float, float, float, float) boolean
   public static boolean method_567(class_44 var0, float var1, float var2, float var3, float var4, float var5) {
      class_236 var6 = class_236.method_1549();
      float var7 = var4 * var4;
      Object[] var8 = class_97.field_833.method_1298();

      for(int var9 = 0; var9 < class_97.field_833.field_1647; ++var9) {
         class_97 var10 = (class_97)var8[var9];
         if (!var10.field_853 && !var10.field_855 && (var10.field_861 > 7.0F || var10.field_861 > 2.0F && var10.field_849 > 8.0F) && !var10.field_928) {
            float var11 = (var10.dh - var1) * (var10.dh - var1) + (var10.di - var2) * (var10.di - var2);
            if (var11 < var7 && var10.dj >= -1.0F) {
               boolean var12 = false;
               if (var10.field_842 != null && var0.bk.method_944(var10.field_842.field_143)) {
                  var12 = true;
               }

               if (!var12 && var10.field_841 != null && var0.bk.method_943(var10.field_841.field_143)) {
                  var12 = true;
               }

               if (var12) {
                  class_390 var13 = var6.field_1938.method_2465(var1, var2, var3, var10.dh, var10.di, var10.dj);
                  if (var13 != null) {
                     var13.field_3160 = 10.0F;
                     var13.field_3161 = var13.field_3160;
                  }

                  class_390 var14 = var6.field_1938.method_2488(var1, var2, var3, class_393.field_3201, false, class_395.field_3223);
                  if (var14 != null) {
                     var14.field_3154 = 0.0F;
                     var14.field_3155 = 0.0F;
                     var14.field_3176 = 4;
                     var14.field_3160 = 39.0F;
                     var14.field_3161 = var14.field_3160;
                     var14.field_3135 = true;
                     var14.field_3143 = 1.3F;
                     var14.field_3145 = 1.1F;
                     var14.field_3144 = 0.7F;
                  }

                  --var10.field_860;
                  if (var10.field_860 <= 0.0F) {
                     var10.method_696();
                     var14 = var6.field_1938.method_2488(var10.dh, var10.di, var10.dj, class_393.field_3201, false, class_395.field_3223);
                     if (var14 != null) {
                        var14.field_3154 = 0.0F;
                        var14.field_3155 = 0.0F;
                        var14.field_3176 = 4;
                        var14.field_3160 = 23.0F;
                        var14.field_3161 = var14.field_3160;
                        var14.field_3135 = true;
                        var14.field_3143 = 0.9F;
                        var14.field_3145 = 0.5F;
                        var14.field_3144 = 0.2F;
                     }

                     float var15 = 1.0F + class_296.method_2033(-0.07F, 0.07F);
                     var6.field_1933.method_3324(class_525.field_4773, 0.2F, var15, var10.dh, var10.di);
                  }

                  var0.bP -= var5;
                  return true;
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public PointF method_478(int var1) {
      aG.method_1960(this.dh, this.di - 13.0F);
      return aG;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public void method_471(class_39 var1, int var2) {
   }

   // $FF: renamed from: m () float
   public float method_439() {
      return !this.field_491 ? 160.0F : 210.0F;
   }

   // $FF: renamed from: c (int) float
   public float method_453(int var1) {
      return 4.0F;
   }

   // $FF: renamed from: b (int, float) boolean
   public boolean method_470(int var1, float var2) {
      return false;
   }

   // $FF: renamed from: c (float) boolean
   public boolean method_181(float var1) {
      return super.method_181(var1);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ao
   public class_469 method_568() {
      return class_469.field_4057;
   }

   // $FF: renamed from: l () boolean
   public boolean method_312() {
      return false;
   }

   // $FF: renamed from: g (int) float
   public float method_474(int var1) {
      return 1.0F;
   }

   // $FF: renamed from: bl () float
   public float method_231() {
      return this.bP != 1.0F ? this.bP : super.bl();
   }

   // $FF: renamed from: bm () boolean
   public boolean method_232() {
      return this.field_492;
   }

   // $FF: renamed from: aD () float
   public float method_461() {
      return 1.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public void method_10(class_32 var1) {
      if (var1.field_16.equals(field_498.method_1043())) {
         this.method_356(2);
         this.L();
      }

   }

   // $FF: renamed from: by () java.lang.String
   public String method_269() {
      return !this.field_491 ? field_498.method_1043() : class_121.field_1347;
   }

   // $FF: renamed from: K () int
   public int method_261() {
      return this.field_491 ? 2 : 1;
   }

   // $FF: renamed from: a (int) void
   public void method_356(int var1) {
      if (var1 == 1) {
         this.field_491 = false;
      } else if (var1 == 2 && !this.field_491) {
         this.field_491 = true;
         this.bJ += 900.0F;
         this.bI += 900.0F;
      }

      this.I();
   }

   // $FF: renamed from: E () java.util.ArrayList
   public ArrayList method_260() {
      return field_499;
   }

   // $FF: renamed from: e (float) void
   public void method_179(float var1) {
      super.e(var1);
      float var2 = this.method_439();
      class_205.method_1355(this, var2);
   }

   // $FF: renamed from: bW () float
   public float method_323() {
      return (float)class_236.method_1549().field_1932.field_3330;
   }

   // $FF: renamed from: bX () float
   public float method_324() {
      return (float)class_236.method_1549().field_1932.field_3331;
   }

   // $FF: renamed from: bY () float
   public float method_325() {
      return super.bY() - 8.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_568();
   }

   static {
      field_499.add(field_498);
   }
}
