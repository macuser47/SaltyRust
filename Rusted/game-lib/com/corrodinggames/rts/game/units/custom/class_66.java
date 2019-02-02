package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_36;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_10;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_280;
import com.corrodinggames.rts.game.units.class_281;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_284;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_41;
import com.corrodinggames.rts.game.units.class_501;
import com.corrodinggames.rts.game.units.class_502;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.class_512;
import com.corrodinggames.rts.game.units.class_65;
import com.corrodinggames.rts.game.units.class_9;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_134;
import com.corrodinggames.rts.game.units.d.class_277;
import com.corrodinggames.rts.game.units.d.class_32;
import com.corrodinggames.rts.game.units.d.class_49;
import com.corrodinggames.rts.game.units.d.class_50;
import com.corrodinggames.rts.game.units.d.class_60;
import com.corrodinggames.rts.game.units.d.class_61;
import com.corrodinggames.rts.game.units.d.class_8;
import com.corrodinggames.rts.game.units.e.class_84;
import com.corrodinggames.rts.game.units.e.class_91;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_295;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_35;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_193;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.e
public final class class_66 extends class_65 implements class_9, class_8, class_10 {
   // $FF: renamed from: a int
   int field_531;
   // $FF: renamed from: b com.corrodinggames.rts.game.units.custom.a
   class_475 field_532 = new class_475(this);
   // $FF: renamed from: c float
   float field_533 = 1.0F;
   // $FF: renamed from: d float
   float field_534;
   // $FF: renamed from: e float
   float field_535;
   // $FF: renamed from: f float
   float field_536;
   // $FF: renamed from: g boolean
   boolean field_537;
   // $FF: renamed from: h float
   float field_538 = 1.0F;
   // $FF: renamed from: i boolean
   boolean field_539 = false;
   // $FF: renamed from: j float
   float field_540;
   // $FF: renamed from: k boolean
   boolean field_541;
   // $FF: renamed from: l float
   float field_542;
   // $FF: renamed from: m boolean
   boolean field_543;
   // $FF: renamed from: n float
   float field_544;
   // $FF: renamed from: o float
   float field_545;
   // $FF: renamed from: p float
   float field_546;
   // $FF: renamed from: q boolean
   boolean field_547;
   // $FF: renamed from: r float
   float field_548;
   // $FF: renamed from: s com.corrodinggames.rts.game.units.custom.g
   public class_479 field_549;
   // $FF: renamed from: t com.corrodinggames.rts.game.units.custom.g
   public class_479 field_550;
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.utility.k
   public class_193 field_551 = new class_193();
   // $FF: renamed from: v android.graphics.PointF[]
   PointF[] field_552 = null;
   // $FF: renamed from: w android.graphics.PointF[]
   PointF[] field_553 = null;
   // $FF: renamed from: x android.graphics.PointF
   static PointF field_554 = new PointF();
   // $FF: renamed from: y com.corrodinggames.rts.game.f[]
   class_97[] field_555;
   // $FF: renamed from: z android.graphics.Rect
   Rect field_556 = new Rect();
   // $FF: renamed from: A android.graphics.PointF
   static PointF field_557 = new PointF();
   // $FF: renamed from: B android.graphics.PointF
   static PointF field_558 = new PointF();
   // $FF: renamed from: C android.graphics.Paint
   Paint field_559 = class_205.method_1363();
   // $FF: renamed from: D com.corrodinggames.rts.game.units.d.j
   class_277 field_560 = new class_277(this);
   // $FF: renamed from: E float
   public float field_561;
   // $FF: renamed from: cM float
   public float field_562;
   // $FF: renamed from: cN float
   public float field_563;
   // $FF: renamed from: cO android.graphics.Rect
   static Rect field_564 = new Rect();
   // $FF: renamed from: cP android.graphics.RectF
   static RectF field_565 = new RectF();
   // $FF: renamed from: cQ com.corrodinggames.rts.game.units.custom.f[]
   public class_480[] field_566 = null;
   // $FF: renamed from: cR java.util.ArrayList
   static ArrayList field_567 = new ArrayList();
   // $FF: renamed from: cS android.graphics.PointF
   static PointF field_568 = new PointF();

   // $FF: renamed from: D () void
   public strictfp void method_582() {
      this.field_552 = new PointF[6];
      this.field_553 = new PointF[this.field_552.length];

      for(int var1 = 0; var1 < this.field_552.length; ++var1) {
         this.field_552[var1] = new PointF();
         this.field_553[var1] = new PointF();
      }

   }

   // $FF: renamed from: b () android.graphics.PointF[]
   public strictfp PointF[] method_18() {
      if (this.field_552 == null) {
         this.method_582();
      }

      return this.field_552;
   }

   // $FF: renamed from: c () android.graphics.PointF[]
   public strictfp PointF[] method_19() {
      if (this.field_552 == null) {
         this.method_582();
      }

      return this.field_553;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2541(7);
      var1.method_2542(this.field_535);
      var1.method_2542(this.field_540);
      var1.method_2540(this.field_541);
      var1.method_2541(this.field_551.size());
      Iterator var2 = this.field_551.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         var1.method_2550(var3);
      }

      var1.method_2540(this.field_543);
      var1.method_2542(this.field_542);
      var1.method_2542(this.field_536);
      var1.method_2542(this.field_544);
      var1.method_2540(this.field_547);
      byte var5 = 0;
      if (this.field_566 != null) {
         var5 = (byte)this.field_566.length;
      }

      var1.method_2539(var5);
      if (this.field_566 != null) {
         for(int var6 = 0; var6 < var5; ++var6) {
            class_480 var4 = this.field_566[var6];
            var1.method_2542(var4.field_4428);
            var1.method_2542(var4.field_4429);
            var1.method_2542(var4.field_4430);
            var1.method_2542(var4.field_4437);
            var1.method_2540(var4.field_4441);
            var1.method_2540(var4.field_4440);
            var1.method_2540(var4.field_4443);
            var1.method_2540(var4.field_4444);
         }
      }

      this.field_560.method_1920(var1);
      var1.method_2554(this.field_550);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      if (var1.method_3006() >= 32) {
         int var2 = var1.method_3011();
         this.field_535 = var1.method_3012();
         this.field_540 = var1.method_3012();
         this.field_541 = var1.method_3010();
         this.field_551.clear();
         int var3 = var1.method_3011();

         for(int var4 = 0; var4 < var3; ++var4) {
            class_39 var5 = var1.method_3019();
            if (var5 != null) {
               this.field_551.add(var5);
            }
         }

         if (var2 >= 1) {
            this.field_543 = var1.method_3010();
         }

         if (var2 >= 2) {
            this.field_542 = var1.method_3012();
         }

         if (var2 >= 3) {
            this.field_536 = var1.method_3012();
            this.field_544 = var1.method_3012();
         }

         if (var2 >= 4) {
            this.field_547 = var1.method_3010();
         }

         if (var2 >= 5) {
            byte var7 = var1.method_3009();
            if (var7 != 0) {
               this.method_600();
               if (this.field_566 == null) {
                  class_236.method_1591("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
               }

               for(int var9 = 0; var9 < var7; ++var9) {
                  class_480 var6;
                  if (this.field_566 == null) {
                     var6 = new class_480(this);
                  } else if (var9 >= this.field_566.length) {
                     class_236.method_1591("readIn: legs " + var9 + ">=" + this.field_566.length);
                     var6 = new class_480(this);
                  } else {
                     var6 = this.field_566[var9];
                  }

                  var6.field_4428 = var1.method_3012();
                  var6.field_4429 = var1.method_3012();
                  var6.field_4430 = var1.method_3012();
                  var6.field_4437 = var1.method_3012();
                  var6.field_4441 = var1.method_3010();
                  var6.field_4445 = true;
                  var6.field_4440 = var1.method_3010();
                  var6.field_4443 = var1.method_3010();
                  var6.field_4444 = var1.method_3010();
               }
            }
         }

         if (var2 >= 6) {
            this.field_560.method_1921(var1);
         }

         if (var2 >= 7) {
            class_24 var8 = var1.method_3023();
            if (var8 != null) {
               if (var8 instanceof class_479) {
                  this.field_550 = (class_479)var8;
               } else {
                  class_236.method_1588("Got non CustomUnitMetadata object of:" + var8.method_141() + " loading real_meta");
                  this.field_550 = class_479.field_4185;
               }
            }
         }
      }

      super.a(var1);
      if (this.field_566 != null) {
         this.field_561 = this.dh;
         this.field_562 = this.di;
         this.field_563 = this.bv;
      }

   }

   // $FF: renamed from: bD () boolean
   public strictfp boolean method_278() {
      return this.field_549.field_4374 > 0;
   }

   // $FF: renamed from: j () int
   public strictfp int method_20() {
      return this.field_551.size();
   }

   // $FF: renamed from: l_ () boolean
   public strictfp boolean method_21() {
      return this.field_541;
   }

   // $FF: renamed from: o (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_276(class_39 var1) {
      if (this.field_549.field_4374 == 0) {
         return false;
      } else if (this.field_541) {
         return false;
      } else if (!class_91.method_676(this.field_551, this.field_549.field_4374, var1)) {
         return false;
      } else if (var1 == this) {
         return false;
      } else if (this.field_549.field_4375 != null && !this.field_549.field_4375.method_3128() && !class_476.method_3113(this.field_549.field_4375, var1.method_331())) {
         return false;
      } else {
         boolean var2;
         if (this.field_549.field_4376.size() > 0) {
            var2 = false;
            Iterator var3 = this.field_549.field_4376.iterator();

            while(var3.hasNext()) {
               class_503 var4 = (class_503)var3.next();
               if (var4 == var1.method_279()) {
                  var2 = true;
                  break;
               }
            }

            if (!var2) {
               return false;
            }
         }

         var2 = this.field_549.field_4377;
         return class_205.method_1362(var1, var2);
      }
   }

   // $FF: renamed from: p (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_277(class_39 var1) {
      if (!this.method_276(var1)) {
         return false;
      } else {
         this.method_583(var1);
         return true;
      }
   }

   // $FF: renamed from: r (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_583(class_39 var1) {
      var1.field_182 = this;
      this.field_551.add(var1);
      class_236 var2 = class_236.method_1549();
      var2.field_1939.method_765(var1);
   }

   // $FF: renamed from: cd () void
   public strictfp void method_584() {
      if (this.field_549.field_4374 != 0) {
         this.field_541 = true;
         this.field_540 = 30.0F;
      }
   }

   // $FF: renamed from: ce () void
   public strictfp void method_585() {
      if (this.field_549.field_4374 != 0) {
         this.field_541 = false;
      }
   }

   // $FF: renamed from: bn () int
   public strictfp int method_233() {
      return this.field_549.field_4374 == 0 ? -1 : class_91.method_675(this.field_551);
   }

   // $FF: renamed from: bo () int
   public strictfp int method_234() {
      return this.field_549.field_4374 == 0 ? -1 : this.field_549.field_4374;
   }

   // $FF: renamed from: cf () void
   public strictfp void method_586() {
      if (this.field_551.field_1647 > 0) {
         boolean var1 = this.field_549.field_4380.read(this);
         this.method_587(var1);
      }

   }

   // $FF: renamed from: f (boolean) void
   public strictfp void method_587(boolean var1) {
      Iterator var2 = this.field_551.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         var3.field_182 = null;
         var3.dh = this.dh + class_296.method_2099(this.bv) * -9.0F;
         var3.di = this.di + class_296.method_2098(this.bv) * -9.0F;
         if (var1) {
            var3.field_167 = -1.0F;
         }
      }

      this.field_551.clear();
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      this.method_586();
      this.field_560.method_1932();
      super.a();
   }

   // $FF: renamed from: cg () com.corrodinggames.rts.game.units.custom.g
   public strictfp class_479 method_588() {
      return this.field_549;
   }

   // $FF: renamed from: C () boolean
   public strictfp boolean method_431() {
      if (this.field_549.field_4219) {
         return false;
      } else {
         return !this.field_537;
      }
   }

   // $FF: renamed from: av () boolean
   public strictfp boolean method_432() {
      return !this.field_549.field_4219;
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_279() {
      return this.field_549.field_4219 ? class_503.field_4617 : this.field_549.field_4387;
   }

   // $FF: renamed from: i () boolean
   public strictfp boolean method_280() {
      if (this.method_279() == class_503.field_4620) {
         return this.dj >= 4.0F;
      } else {
         return false;
      }
   }

   // $FF: renamed from: H () boolean
   public strictfp boolean method_282() {
      return this.dj <= -1.0F;
   }

   // $FF: renamed from: bF () boolean
   public strictfp boolean method_285() {
      return this.method_279() == class_503.field_4621;
   }

   // $FF: renamed from: bE () boolean
   public strictfp boolean method_281() {
      return this.method_279() == class_503.field_4620;
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : this.field_549.field_4181[this.bk.method_963()];
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi && this.field_549.field_4177 != null ? this.field_549.field_4177 : this.field_549.field_4180[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return this.field_549.field_4179;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && (!this.bi || this.dj >= 1.0F) && this.dj >= -1.0F;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      if (var2.field_2935 == -1) {
         return null;
      } else if (var2.field_2972 != null) {
         return var2.field_2972[this.bk.method_963()];
      } else if (var2.field_2971 != null) {
         return var2.field_2971;
      } else {
         return this.field_549.field_4182 != null ? this.field_549.field_4182[this.bk.method_963()] : this.field_549.field_4178;
      }
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      if (this.method_212()) {
         var1.field_1941.method_1689(this);
      }

      if (this.bB < 1.0F) {
         this.a(class_282.field_2421);
         return false;
      } else {
         if (!this.field_549.field_4388) {
            this.I(0);
         }

         if (this.field_549.field_4245 != null && this.field_549.field_4245.method_3213()) {
            this.field_549.field_4245.method_3215(this.dh, this.di, this.dj, this.bv, (class_34)null);
         }

         if (this.field_549.field_4246 != -1) {
            this.method_595((class_39)null, this.dh, this.di, this.field_549.field_4246, (class_363)null);
         }

         if (this.field_549.field_4247 != null) {
            class_107 var2;
            if (this.field_549.field_4248 && this.aO != null && this.aO.field_143 != null) {
               var2 = this.aO.field_143;
            } else {
               var2 = this.bk;
            }

            this.field_549.field_4247.method_2315(this.dh, this.di, this.dj, this.bv, var2, this.bS);
         }

         this.bh = false;
         if (!this.field_549.field_4388) {
            this.method_586();
         }

         if (this.field_549.field_4237) {
            boolean var6 = false;
            if (this.field_549.field_4241 && var1.method_1656() && var1.field_1944.field_3863.field_3783) {
               var6 = true;
            }

            if (!var6) {
               class_97 var3 = class_61.method_572(this, this.dh, this.di, this.dh, this.di);
               var3.field_915 = false;
               var3.field_879 = this.field_549.field_4238;
               var3.field_878 = this.field_549.field_4239;
            }
         }

         if (this.field_549.field_4236 != 0) {
            class_41 var8 = new class_41(false);
            var8.dh = this.dh;
            var8.di = this.di;
            var8.G(1);
         }

         int var9;
         if (this.field_549.field_4368) {
            var1.field_1933.method_3323(class_525.field_4768, 0.8F, this.dh, this.di);
            if (this.field_549.field_4242) {
               if (!this.method_280() && !this.field_549.field_4373) {
                  class_36.method_201(this, 1);
               }

               if (this.field_549.field_4234) {
                  this.a(class_282.field_2424);
               }
            }

            if (this.field_549.field_4369) {
               for(var9 = 0; var9 < this.method_488(); ++var9) {
                  var1.field_1938.method_2481(this.dh, this.di, this.dj);
               }
            }
         } else {
            if (this.field_566 != null) {
               this.method_602(0.0F);

               for(var9 = 0; var9 < this.field_566.length; ++var9) {
                  class_480 var7 = this.field_566[var9];
                  float var4 = this.dh + var7.field_4428;
                  float var5 = this.di + var7.field_4429;
                  if (!class_205.method_1373(var4, var5) && !this.field_549.field_4373) {
                     class_36.method_199(var4, var5);
                  }

                  var1.field_1938.method_2463(var4, var5, 0.0F);
               }
            }

            if (!this.method_280()) {
               if (this.field_549.field_4242) {
                  this.a(class_282.field_2422);
               }
            } else {
               if (this.field_549.field_4242) {
                  var1.field_1938.method_2463(this.dh, this.di, this.dj);
               }

               for(var9 = 0; var9 < this.method_488(); ++var9) {
                  var1.field_1938.method_2482(this.dh, this.di, this.dj);
               }
            }
         }

         if (this.field_549.field_4388) {
            return true;
         } else if (this.field_549.field_4177 != null) {
            this.G = this.field_549.field_4177;
            this.field_531 = 0;
            this.dp = true;
            return true;
         } else {
            return false;
         }
      }
   }

   // $FF: renamed from: aQ () void
   public strictfp void method_489() {
      if (!this.field_549.field_4373) {
         super.aQ();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, boolean) void
   public strictfp void method_589(class_479 var1, boolean var2) {
      class_236 var3 = class_236.method_1549();
      class_479 var4 = this.field_549;
      this.field_549 = var1;
      this.cF = this.field_549;
      this.bi();
      if (!var2 && var1.field_4405.length > 1) {
         class_502[] var5 = null;

         for(int var6 = 0; var6 < var1.field_4405.length; ++var6) {
            class_365 var7 = var1.field_4405[var6];
            class_365 var8 = var4.method_3189(var7.field_2909);
            if (var8 != null && var7 != null && var8.field_2913 != var7.field_2913) {
               if (var5 == null) {
                  var5 = (class_502[])Arrays.copyOf(this.bV, this.bV.length);
               }

               var5[var7.field_2913] = this.bV[var8.field_2913];
            }
         }

         if (var5 != null) {
            this.bV = var5;
         }
      }

      this.J(this.field_549.field_4172);
      this.K(this.field_549.field_4173);
      this.dp = false;
      this.by = (float)this.field_549.field_4296;
      this.bz = (float)this.field_549.field_4302;
      this.field_531 = 0;
      this.field_537 = false;
      if (var2) {
         this.dj += this.field_549.field_4340;
      }

      float var11 = this.bJ;
      this.bJ = (float)this.field_549.field_4282;
      if (var2) {
         this.bI = this.bJ;
      } else if (var11 == 0.0F) {
         this.bI = this.bJ;
      } else {
         this.bI = this.bI / var11 * this.bJ;
      }

      float var12 = this.bO;
      this.bO = (float)this.field_549.field_4283;
      if (this.field_549.field_4284) {
         if (this.bL > this.bO) {
            this.bL = this.bO;
         }
      } else if (var2) {
         this.bL = this.bO;
      } else if (var12 == 0.0F) {
         this.bL = this.bO;
      } else {
         this.bL = this.bL / var12 * this.bO;
      }

      if (this.field_549.field_4289) {
         if (this.bP > this.field_549.field_4288) {
            this.bP = this.field_549.field_4288;
         }
      } else if (var2) {
         this.bP = this.field_549.field_4288 * this.field_549.field_4292;
      } else if (var4.field_4288 == 0.0F) {
         this.bP = this.field_549.field_4288;
      } else {
         this.bP = this.bP / var4.field_4288 * this.field_549.field_4288;
      }

      if (this.G == null) {
         this.G = this.field_549.field_4171;
      }

      if (this.field_549.field_4219) {
         if (var2) {
            this.bv = -90.0F;
         }

         this.bh = false;
      } else if (!this.bi) {
         this.bh = true;
      }

      if (!var2 && this.field_549.method_134() != var4.method_134()) {
         var3.field_1941.method_1689(this);
      }

      this.field_538 = 1.0F;
      if (this.field_549.field_4279 != -2) {
      }

      if (!this.bi) {
         this.method_608();
      }

      if (this.field_549.field_4370) {
         this.I = class_281.field_2408;
      }

      this.method_600();
      if (!var2) {
         int var13 = this.method_317();

         for(int var14 = 0; var14 < var13; ++var14) {
            class_502 var9 = this.bV[var14];
            class_365 var10 = this.field_549.field_4405[var14];
            if (var10 != null) {
               if (var9.field_4611 > var10.field_2919) {
                  var9.field_4611 = var10.field_2919;
               }

               if (var9.field_4612 > var10.field_2920) {
                  var9.field_4612 = var10.field_2920;
               }
            }
         }
      }

      if (!var2) {
         if (!this.field_549.field_4301) {
            this.field_560.field_2371 = null;
         }

         if (this.field_549.field_4387 != var4.field_4387) {
            this.am();
         }
      }

   }

   public strictfp class_66(boolean var1, class_479 var2) {
      super(var1);
      this.method_589(var2, true);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.a(var1);
      class_236 var10;
      if (this.bi) {
         if (this.dj > 0.0F) {
            if (this.field_549.field_4388 && (this.bu != 0.0F || this.br != 0.0F || this.bs != 0.0F)) {
               this.field_536 += 0.017F * var1;
               this.dj -= this.field_536 * var1;
               PointF var2 = this.l(var1);
               this.dh += var2.field_2406;
               this.di += var2.field_2407;
               if (this.field_549.field_4387 == class_503.field_4620) {
                  class_236 var3 = class_236.method_1549();
                  this.cw += var1;
                  this.cu += var1;
                  class_390 var4;
                  if (this.field_549.field_4389 && this.cw > 9.0F) {
                     this.cw = class_296.method_2033(1.0F, 3.0F);
                     var4 = var3.field_1938.method_2488(this.dh, this.di, this.dj, class_393.field_3201, false, class_395.field_3222);
                     if (var4 != null) {
                        var4.field_3178 = 0;
                        var4.field_3176 = 0;
                        var4.field_3179 = 2;
                        var4.field_3135 = true;
                        var4.field_3143 = 0.5F;
                        var4.field_3161 = 60.0F;
                        var4.field_3160 = 60.0F;
                        var4.field_3145 = 0.9F;
                        var4.field_3144 = 1.2F;
                        var4.field_3180 = false;
                        var4.field_3154 = 0.0F;
                        var4.field_3155 = 0.0F;
                     }
                  }

                  if (this.cu > 7.0F) {
                     this.cu = 0.0F;
                     var4 = var3.field_1938.method_2488(this.dh, this.di, this.dj, class_393.field_3201, false, class_395.field_3221);
                     if (var4 != null) {
                        class_35.method_193(var4, true);
                        var4.field_3147 = this.dh;
                        var4.field_3148 = this.di;
                        var4.field_3149 = this.dj;
                        var4.field_3154 += class_296.method_2033(-0.1F, 0.1F) + this.br;
                        var4.field_3155 += class_296.method_2033(-0.1F, 0.1F) + this.bs;
                        var4.field_3147 += class_296.method_2033(-4.0F, 4.0F);
                        var4.field_3148 += class_296.method_2033(-4.0F, 4.0F);
                     }
                  }
               }
            } else {
               this.field_536 += 0.06F * var1;
               this.dj -= this.field_536 * var1;
            }
         } else if (!this.field_539) {
            this.field_539 = true;
            if (this.field_549.field_4388) {
               this.method_586();
               this.I(0);
               if (this.field_549.field_4177 != null) {
                  this.G = this.field_549.field_4177;
               }
            }

            if ((double)this.field_536 > 0.5D) {
               if (this.field_549.field_4244 != null && this.field_549.field_4244.method_3213()) {
                  this.field_549.field_4244.method_3215(this.dh, this.di, this.dj, this.bv, (class_34)null);
               }

               if (this.bP()) {
                  if (this.field_549.field_4243) {
                     this.a(class_282.field_2421);
                  }

                  if (this.bO()) {
                     class_236.method_1549().field_1938.method_2478(this.dh, this.di, 0.0F, 0, 0.0F, 0.0F, this.bv);
                  }
               } else if (this.field_549.field_4243) {
                  this.a(class_282.field_2422);
               }
            }

            this.field_536 = 0.0F;
         } else if (this.bP()) {
            if (this.dj > -10.0F) {
               this.field_536 += 8.0E-4F * var1;
               this.dj -= this.field_536 * var1;
               if (this.bO()) {
                  this.field_545 += var1;
                  if (this.field_545 > 30.0F) {
                     this.field_545 = 0.0F;
                     if (this.o_()) {
                        var10 = class_236.method_1549();
                        class_390 var11 = var10.field_1938.method_2476(this.dh, this.di, this.dj, this.bv);
                        if (var11 != null) {
                           var11.field_3154 = 0.0F;
                           var11.field_3155 = -0.1F;
                        }
                     }
                  }
               }
            }
         } else {
            this.dj = 0.0F;
         }
      }

      if (this.field_549.field_4232 != 0.0F && !this.bi && this.bB < 1.0F) {
         this.bB += this.field_549.field_4232 * var1;
         if (this.bB > 1.0F) {
            this.bB = 1.0F;
         }
      }

      if (!this.bi) {
         var10 = class_236.method_1549();
         if (this.field_566 != null && (double)this.field_536 < 0.3D) {
            this.method_602(var1);
         }

         if (!this.bj()) {
            if (this.bB < 1.0F) {
               if (this.field_549.field_4318 != null) {
                  this.field_532.method_3102(this.field_549.field_4318, 8);
                  this.field_532.method_3105(var1);
               } else if (this.field_549.field_4319 != null) {
                  this.field_532.method_3102(this.field_549.field_4319, 99);
                  this.field_532.field_4141 = this.bB;
                  this.field_532.field_4142 = 0.0F;
                  this.field_532.method_3105(var1);
               }
            }

         } else {
            float var6;
            float var7;
            int var12;
            int var14;
            if (this.field_549.field_4249 || this.field_549.field_4250) {
               var12 = this.method_317();

               for(var14 = 0; var14 < var12; ++var14) {
                  class_365 var5 = this.field_549.field_4405[var14];
                  if (var5.field_2959 != null && this.bP > 0.0F && !this.field_547) {
                     var6 = var5.field_2959;
                     field_554.method_1961(this.method_478(var14));
                     var7 = this.method_439();
                     if (var5.field_2953 < 99999.0F) {
                        var7 = var5.field_2953;
                     }

                     if (class_60.method_567(this, field_554.field_2406, field_554.field_2407, this.dj, var7, var6)) {
                     }

                     if (this.bP < 0.0F) {
                        this.bP = 0.0F;
                        this.field_547 = true;
                     }
                  }

                  if (var5.field_2960 != null) {
                     this.method_606(var5);
                  }
               }
            }

            if (this.field_549.field_4224) {
               this.field_546 += var1;
               if (this.field_546 > 40.0F && this.ac()) {
                  this.field_546 = 0.0F;
                  class_49.method_521(this, var1, 0.0F, false);
               }
            }

            if (this.field_549.field_4231 != 0.0F && (this.bI < this.bJ || this.field_549.field_4231 < 0.0F)) {
               this.bI += this.field_549.field_4231 * var1;
               if (this.bI > this.bJ) {
                  this.bI = this.bJ;
               }
            }

            if (this.field_549.field_4288 != 0.0F) {
               if (this.bP < this.field_549.field_4288 || this.field_549.field_4290 < 0.0F) {
                  this.bP += this.field_549.field_4290 * var1;
               }

               if (this.bP >= this.field_549.field_4288) {
                  this.bP = this.field_549.field_4288;
                  this.field_547 = false;
               }

               if (this.bP <= 0.0F) {
                  if (this.field_549.field_4235) {
                     this.method_253();
                  }

                  this.bP = 0.0F;
               }
            }

            if (this.bO != 0.0F) {
               this.bL = class_296.method_2021(this.bL, this.bO, this.field_549.field_4287 * var1);
               if (this.bL < 0.0F) {
                  this.bL = 0.0F;
               }

               if (this.bM != 0.0F) {
                  this.bM *= class_296.method_2041(0.98F, var1);
                  this.bM = class_296.method_2021(this.bM, 0.0F, this.field_549.field_4295 * var1);
                  if (this.bM > 50.0F) {
                     this.bM = 50.0F;
                  }
               }
            }

            if (this.bj()) {
               this.field_560.method_1930(var1);
               if (this.method_284()) {
                  class_84.method_656(var1, this);
               }
            }

            if (this.field_549.field_4274 != 0) {
               this.field_542 += var1;
               if (this.field_542 > (float)this.field_549.field_4275 - 0.1F) {
                  this.field_542 -= (float)this.field_549.field_4275;
                  this.bk.method_930(this.method_590());
               }
            }

            if (this.bU) {
               this.field_532.method_3102(this.field_549.field_4315, 3);
            } else {
               this.field_532.method_3102(this.field_549.field_4316, 2);
            }

            float var13;
            float var15;
            float var16;
            if (this.field_549.field_4253 && var10.field_1994) {
               if (this.bu > 0.0F || this.bu < 0.0F && this.field_549.field_4254) {
                  this.field_545 += var1;
               }

               if (this.field_545 > 10.0F) {
                  this.field_545 = 0.0F;
                  if (this.de && this.bO()) {
                     var13 = this.bv + 180.0F;
                     if (this.bu < 0.0F) {
                        var13 += 180.0F;
                     }

                     var15 = this.by - 6.0F;
                     if (var15 < 4.0F) {
                        var15 = 4.0F;
                     }

                     var16 = this.dh + class_296.method_2099(var13) * var15;
                     var6 = this.di + class_296.method_2098(var13) * var15;
                     var10.field_1938.method_2476(var16, var6, 0.0F, var13);
                  }
               }
            }

            if (this.field_549.field_4255 && var10.field_1993 && (this.bu > 0.0F || this.bu < 0.0F) && this.de) {
               this.field_534 += var1;
               if (this.field_534 > this.field_549.field_4261) {
                  this.field_534 = 0.0F;
                  if (this.bu > 0.0F) {
                     if (this.field_549.field_4258 != null) {
                        this.field_549.field_4258.method_3215(this.dh, this.di, this.dj, this.bv, this);
                     }
                  } else if (this.field_549.field_4259 != null) {
                     var13 = this.bv;
                     if (this.field_549.field_4260) {
                        var13 += 180.0F;
                     }

                     this.field_549.field_4259.method_3215(this.dh, this.di, this.dj, var13, this);
                  }

                  if (this.field_549.field_4256 && (this.bu > 0.0F || this.field_549.field_4257) && !this.bO()) {
                     for(var12 = 0; var12 <= 1; ++var12) {
                        var15 = (float)(var12 == 0 ? -20 : 20);
                        if (this.bu < 0.0F) {
                           var15 += 180.0F;
                        }

                        var16 = this.dh + class_296.method_2099(this.bv + 180.0F + var15) * this.by + 3.0F;
                        var6 = this.di + class_296.method_2098(this.bv + 180.0F + var15) * this.by + 3.0F;
                        var10.field_1938.method_2470(var16, var6, this.dj, this.bv + 180.0F, 0);
                     }
                  }
               }
            }

            boolean var8;
            boolean var19;
            if (this.field_549.field_4374 > 0) {
               if (this.field_549.field_4381 != 0.0F && this.field_551.field_1647 > 0) {
                  Object[] var18 = this.field_551.method_1298();

                  for(var14 = 0; var14 < this.field_551.field_1647; ++var14) {
                     class_39 var17 = (class_39)var18[var14];
                     if (var17.field_167 < var17.field_168 || this.field_549.field_4381 < 0.0F) {
                        var17.field_167 += this.field_549.field_4381 * var1;
                        if (var17.field_167 > var17.field_168) {
                           var17.field_167 = var17.field_168;
                        }
                     }
                  }
               }

               if (this.field_541 && this.field_549.field_4385.read(this)) {
                  this.field_540 = class_296.method_2020(this.field_540, var1);
                  if (this.field_540 == 0.0F) {
                     this.field_540 = 30.0F;
                     if (this.field_551.size() == 0) {
                        this.field_541 = false;
                     } else {
                        var19 = this.field_551.size() % 2 == 0;
                        class_39 var21 = (class_39)this.field_551.remove(this.field_551.size() - 1);
                        var16 = 180.0F;
                        if (this.field_549.field_4308 != null) {
                           var16 = this.field_549.field_4308;
                        }

                        var6 = 70.0F;
                        if (this.field_549.field_4310 != null) {
                           var6 = this.field_549.field_4310;
                        }

                        var7 = 7.0F;
                        var8 = class_91.method_678(this, var21, var19, var7, var16, var6, this.field_549.field_4306, this.field_549.field_4307);
                        if (var8) {
                           var21.dj += this.field_549.field_4309;
                           if (var21 instanceof class_66) {
                              ((class_66)var21).method_608();
                           }
                        }

                        if (!var8) {
                           this.field_551.add(var21);
                        }

                        if (this.field_551.size() == 0) {
                           this.field_541 = false;
                        }
                     }
                  }
               }
            }

            if (!this.bU) {
               this.field_544 += var1;
            } else {
               this.field_544 = 0.0F;
            }

            if (this.field_549.field_4387 != class_503.field_4620) {
               this.method_608();
            }

            if ((this.field_549.field_4387 == class_503.field_4623 || this.field_549.field_4387 == class_503.field_4624) && this.bU) {
               if (this.bN()) {
                  this.field_538 = 0.7F;
               } else {
                  this.field_538 = 1.0F;
               }
            }

            boolean var20;
            if (this.field_549.field_4387 == class_503.field_4620) {
               this.field_535 += 2.0F * var1;
               if (this.field_535 > 360.0F) {
                  this.field_535 -= 360.0F;
               }

               var19 = this.method_280();
               boolean var22 = false;
               if (this.field_549.field_4338) {
                  var20 = this.bP();
                  if (!this.bU && !var20 && this.field_544 > 3.0F && (!this.field_549.field_4339 || this.ac())) {
                     var22 = true;
                  }
               }

               if (var22) {
                  var16 = class_296.method_2042(this.dj - 2.0F) * 0.05F * 0.4F + 0.2F;
                  this.dj = class_296.method_2021(this.dj, 2.0F, var16 * var1);
               } else {
                  var16 = this.field_549.field_4341 + class_296.method_2098(this.field_535) * this.field_549.field_4342;
                  var6 = class_296.method_2042(this.dj - 2.0F) * 0.05F * 0.4F + 0.2F;
                  var7 = class_296.method_2042(this.dj - var16) * 0.05F * 0.3F + 0.1F;
                  var6 = class_296.method_2022(var6, var7);
                  this.dj = class_296.method_2021(this.dj, var16, var6 * var1);
               }

               if (var19 != this.method_280()) {
                  this.ak = true;
                  this.method_608();
               }
            } else if (this.field_549.field_4341 != 0.0F || this.field_549.field_4342 != 0.0F || this.dj > 0.0F) {
               var13 = this.field_549.field_4341;
               if (this.field_549.field_4342 != 0.0F) {
                  this.field_535 += 2.0F * var1;
                  if (this.field_535 > 360.0F) {
                     this.field_535 -= 360.0F;
                  }

                  var13 += class_296.method_2098(this.field_535) * this.field_549.field_4342;
               }

               var15 = class_296.method_2042(this.dj - 2.0F) * 0.05F * 0.4F + 0.2F;
               var16 = class_296.method_2042(this.dj - var13) * 0.05F * 0.3F + 0.1F;
               var15 = class_296.method_2022(var15, var16);
               this.dj = class_296.method_2021(this.dj, var13, var15 * var1);
               boolean var23 = false;
               class_390 var24;
               if (this.dj > this.field_549.field_4341 + this.field_549.field_4342 + 1.0F) {
                  this.field_536 += 0.03F * var1;
                  if (this.dj < 0.0F) {
                     this.field_536 = class_296.method_2022(this.field_536, 0.2F);
                  }

                  this.dj -= this.field_536 * var1;
                  if ((double)this.field_536 > 1.5D) {
                     this.cw += var1;
                     if ((double)this.cw > 0.5D) {
                        this.cw = 0.0F;
                        var24 = var10.field_1938.method_2488(this.dh + class_296.method_2033(-this.by, this.by), this.di + class_296.method_2033(-this.by, this.by), this.dj, class_393.field_3201, false, class_395.field_3223);
                        if (var24 != null) {
                           var24.field_3178 = 0;
                           var24.field_3176 = 0;
                           var24.field_3179 = 2;
                           var24.field_3135 = true;
                           var24.field_3136 = true;
                           var24.field_3137 = 40.0F;
                           var24.field_3175 = true;
                           var24.field_3154 = 0.1F;
                           var24.field_3156 = 0.0F;
                           var24.field_3138 = true;
                           var24.field_3143 = 0.4F;
                           var24.field_3161 = 380.0F;
                           var24.field_3160 = var24.field_3161;
                           var24.field_3145 = 0.8F;
                           var24.field_3144 = 1.7F;
                           var24.field_3180 = false;
                           var24.field_3154 += class_296.method_2033(-0.04F, 0.04F);
                           var24.field_3155 += class_296.method_2033(-0.04F, 0.04F);
                        }
                     }
                  }

                  if (this.dj <= this.field_549.field_4341 + this.field_549.field_4342 + 1.0F) {
                     if (this.field_536 > 2.0F) {
                        var23 = true;
                     }

                     if (this.dj < this.field_549.field_4341 + this.field_549.field_4342) {
                        this.dj = this.field_549.field_4341 + this.field_549.field_4342;
                     }

                     this.field_536 = 0.0F;
                  }
               } else {
                  if (this.field_536 > 2.0F) {
                     var23 = true;
                  }

                  this.field_536 = 0.0F;
               }

               if (var23) {
                  var24 = var10.field_1938.method_2479(this.dh, this.di, this.dj, 0);
                  if (var24 != null) {
                     var24.field_3145 = 0.8F;
                     var24.field_3144 = 1.4F;
                     var24.field_3160 = 60.0F;
                     var24.field_3161 = var24.field_3160;
                  }
               }
            }

            var19 = false;
            if (this.field_549.field_4230) {
               class_121 var27 = this.field_560.method_1929();
               var20 = false;
               if (var27 != null) {
                  if (var27 instanceof class_136) {
                     class_136 var28 = (class_136)var27;
                     class_496 var25 = var28.field_1364;
                     var8 = false;
                     var20 = var28.method_1103();
                     if (var25.field_4532 != null) {
                        class_24 var9 = var25.field_4532.method_3210();
                        if (var9 != null && var9 instanceof class_479) {
                           var19 = true;
                           if (var9 != this.field_549) {
                              if (this.field_550 != null) {
                                 this.method_589(this.field_550, false);
                                 this.field_550 = null;
                              }

                              this.field_550 = this.field_549;
                              this.method_589((class_479)var9, false);
                           }
                        }
                     }

                     if (var25.field_4549 != null) {
                        float var26 = this.a(var1, var25.field_4549, true, var25.field_4550);
                        if (var25.field_4551 && class_296.method_2042(var26) > 5.0F) {
                           var8 = true;
                        }
                     }

                     if (var25.field_4548 != null && !var8) {
                        this.field_532.method_3102(var25.field_4548.method_3206(), 10);
                     }

                     if (var8) {
                        this.field_560.field_2374 = 0.0F;
                     }
                  }

                  if (this.field_549.field_4320 != null && var27.method_1055() != null && this.field_560.field_2374 >= this.field_549.field_4320.field_4499) {
                     this.field_532.method_3102(this.field_549.field_4320, 5);
                  }
               }

               this.field_537 = var20;
               if (this.field_537) {
                  this.br = 0.0F;
                  this.bs = 0.0F;
                  this.bu = 0.0F;
               }
            }

            if (this.field_550 != null && !var19) {
               this.method_589(this.field_550, false);
               this.field_550 = null;
            }

            this.field_532.method_3105(var1);
            this.method_605(var1);
         }
      }
   }

   // $FF: renamed from: bI () float
   public strictfp float method_294() {
      if (this.field_549.field_4274 == 0) {
         return 0.0F;
      } else {
         return this.field_549.field_4275 == 0 ? (float)(this.field_549.field_4274 * 40) : (float)this.field_549.field_4274 * (40.0F / (float)this.field_549.field_4275);
      }
   }

   // $FF: renamed from: ch () int
   public final strictfp int method_590() {
      return this.field_549.field_4274;
   }

   // $FF: renamed from: a (int, com.corrodinggames.rts.game.units.aa, boolean, boolean) boolean
   public strictfp boolean method_384(int var1, class_39 var2, boolean var3, boolean var4) {
      class_365 var5 = this.field_549.field_4405[var1];
      return this.method_592(var5, var1, var2, var3, var4);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.ai, int, float, float, boolean) boolean
   public final strictfp boolean method_591(class_365 var1, int var2, float var3, float var4, boolean var5) {
      class_236 var6 = class_236.method_1549();
      float var7 = class_296.method_2026(this.dh, this.di, var3, var4);
      if (var7 > var1.field_2955) {
         if (this.bk == var6.field_1915) {
            var6.field_1939.method_705("Location too far");
         }

         return false;
      } else if (var7 < var1.field_2957) {
         if (this.bk == var6.field_1915) {
            var6.field_1939.method_705("Location too close");
         }

         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.ai, int, com.corrodinggames.rts.game.units.aa, boolean, boolean) boolean
   public final strictfp boolean method_592(class_365 var1, int var2, class_39 var3, boolean var4, boolean var5) {
      float var6;
      if (!var4 && (var1.field_2941 || var5)) {
         var6 = class_296.method_2026(this.dh, this.di, var3.dh, var3.di);
         if (var6 > var1.field_2955) {
            return false;
         }

         if (var6 < var1.field_2957) {
            return false;
         }
      }

      if (!var1.field_2940) {
         return true;
      } else {
         if (var1.field_2958 != -1.0F) {
            if (var1.field_2929 != -1) {
               var6 = this.bV[var1.field_2929].field_4608 + var1.field_2916;
            } else {
               var6 = this.bv + var1.field_2916;
            }

            float var7 = class_296.method_2031(this.dh, this.di, var3.dh, var3.di);
            float var8 = class_296.method_2030(var6, var7, 360.0F);
            if (class_296.method_2042(var8) > var1.field_2958) {
               return false;
            }
         }

         if (var1.field_2946 != null && !var1.field_2946.read(this)) {
            return false;
         } else if (var3.method_280()) {
            return var1.field_2942 != null ? var1.field_2942.read(this) : true;
         } else if (var3.method_282()) {
            return var1.field_2944 != null ? var1.field_2944.read(this) : true;
         } else if (var1.field_2945 != null && !var1.field_2945.read(this) && !var3.method_304()) {
            return false;
         } else {
            return var1.field_2943 != null ? var1.field_2943.read(this) : true;
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
      class_236 var3 = class_236.method_1549();
      class_365 var4 = this.field_549.field_4405[var2];
      if (var4.field_2934) {
         if (this.method_592(var4, var2, var1, false, false)) {
            for(int var5 = 0; var5 < this.field_549.field_4405.length; ++var5) {
               class_365 var6 = this.field_549.field_4405[var5];
               if (var6 != null && var5 != var2 && var6.field_2964 != null && var6.field_2964 == var4 && this.bV[var5].field_4611 < 9000.0F - (this.method_441(var2) * 0.5F - var6.field_2920)) {
                  this.bV[var5].field_4611 = 0.0F;
               }
            }

            if (var4.field_2929 != -1) {
               class_365 var7 = this.field_549.field_4405[var4.field_2929];
               if (!var7.field_2934 && var7.field_2922 != 0.0F) {
                  this.bV[var4.field_2929].field_4611 = this.method_441(var4.field_2929) + this.method_447(var4.field_2929);
               }
            }

            this.field_532.method_3103(this.field_549.field_4317, 11, true);
            this.method_594(var4);
            this.method_595(var1, -1.0F, -1.0F, var2, (class_363)null);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.ai) boolean
   public strictfp boolean method_593(class_365 var1) {
      if (var1.field_2927 > 0.0F) {
         if (var1.field_2927 > this.bP) {
            return false;
         }

         if (this.field_547) {
            return false;
         }
      }

      return var1.field_2928 == null || var1.field_2928.method_3119(this, false);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.custom.ai) void
   public strictfp void method_594(class_365 var1) {
      if (var1.field_2927 > 0.0F) {
         this.bP -= var1.field_2927;
         if (this.bP < var1.field_2927 && this.field_549.field_4291) {
            this.field_547 = true;
         }
      }

      if (var1.field_2928 != null) {
         var1.field_2928.method_3125(this, false);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, float, int, com.corrodinggames.rts.game.units.custom.af) com.corrodinggames.rts.game.f
   public strictfp class_97 method_595(class_39 var1, float var2, float var3, int var4, class_363 var5) {
      class_236 var6 = class_236.method_1549();
      class_365 var7 = this.field_549.field_4405[var4];
      if (var7.field_2970 != null) {
         this.field_532.method_3103(var7.field_2970.method_3206(), 6, true);
      }

      class_363 var8;
      if (var5 == null) {
         var8 = this.field_549.field_4406[var7.field_2947];
      } else {
         var8 = var5;
      }

      PointF var9 = this.B(var4);
      PointF var10 = this.method_478(var4);
      class_97 var11 = null;
      if (var8.field_2870 && var5 == null) {
         if (this.field_555 == null) {
            this.field_555 = new class_97[31];
         }

         if (this.field_555[var4] != null && !this.field_555[var4].dc) {
            var11 = this.field_555[var4];
            var11.method_693(this, var10.field_2406, var10.field_2407, this.dj);
         }
      }

      if (var11 == null) {
         var11 = class_97.method_698(this, var10.field_2406, var10.field_2407, this.dj);
         if (var8.field_2870) {
            this.field_555[var4] = var11;
         }
      }

      var11.field_929 = this.bV[var4].field_4608;
      var11.field_859 = var8.field_2890;
      var11.field_926 = var8.field_2891;
      var11.field_874 = (float)var8.field_2849;
      var11.field_878 = (float)var8.field_2850;
      var11.field_879 = (float)var8.field_2851;
      if (var8.field_2853) {
         var11.field_880 = false;
         var11.field_881 = true;
      } else {
         var11.field_880 = !var8.field_2852;
      }

      var11.field_882 = var8.field_2855;
      if (var8.field_2854) {
         var11.field_883 = true;
         var11.field_884 = false;
      }

      var11.field_856 = var8.field_2857;
      var11.field_934 = var8.field_2858;
      var11.field_935 = var8.field_2859;
      if ((double)var8.field_2856 < 0.5D) {
         var11.field_855 = true;
      } else {
         var11.field_860 = var8.field_2856;
      }

      var11.field_839 = var8.field_2861;
      var11.field_849 = var8.field_2862;
      if (var8.field_2893 != 0.0F) {
         var11.field_849 += (float)class_296.method_2014(this, (int)(-var8.field_2893 * 100.0F), (int)(var8.field_2893 * 100.0F), 1) / 100.0F;
      }

      var11.field_885 = var8.field_2894;
      var11.field_886 = var8.field_2895;
      var11.field_887 = var8.field_2896;
      var11.field_888 = var8.field_2897;
      var11.field_890 = var8.field_2898;
      var11.field_891 = var8.field_2899;
      var11.field_892 = var8.field_2900;
      if (var8.field_2901 > 0.0F) {
         var11.field_893 = true;
         var11.field_876 = var8.field_2901;
         var11.field_877 = var11.field_876;
      }

      var11.field_905 = var8.field_2902;
      var11.field_906 = var8.field_2903;
      var11.field_895 = var8.field_2887;
      float var12;
      if (var8.field_2889 != 0.0F) {
         var12 = 1.0F - var8.field_2889;
         int var13 = Color.method_3072(var11.field_895);
         int var14 = (int)((float)Color.method_3073(var11.field_895) * var12);
         int var15 = (int)((float)Color.method_3074(var11.field_895) * var12);
         int var16 = (int)((float)Color.method_3075(var11.field_895) * var12);
         int var17 = this.bk.method_945();
         var14 = (int)((float)var14 + (float)Color.method_3073(var17) * var8.field_2889);
         var15 = (int)((float)var15 + (float)Color.method_3074(var17) * var8.field_2889);
         var16 = (int)((float)var16 + (float)Color.method_3075(var17) * var8.field_2889);
         var14 = class_296.method_2024(var14, 0, 255);
         var15 = class_296.method_2024(var15, 0, 255);
         var16 = class_296.method_2024(var16, 0, 255);
         var11.field_895 = Color.method_3077(var13, var14, var15, var16);
      }

      var11.field_867 = var8.field_2863;
      var11.field_869 = var8.field_2864;
      var11.field_868 = var8.field_2865;
      if (var8.field_2866 != null) {
         var11.field_870 = var8.field_2866;
         var11.field_867 = 0;
         var11.field_869 = 0;
      }

      var11.field_850 = var8.field_2888;
      var11.field_843 = var8.field_2860;
      if (var1 == null) {
         var11.field_901 = true;
         var11.field_844 = var2;
         var11.field_845 = var3;
         if (var8.field_2892 != 0.0F) {
            var11.field_844 += (float)class_296.method_2014(this, (int)(-var8.field_2892 * 100.0F), (int)(var8.field_2892 * 100.0F), 2) / 100.0F;
            var11.field_845 += (float)class_296.method_2014(this, (int)(-var8.field_2892 * 100.0F), (int)(var8.field_2892 * 100.0F), 3) / 100.0F;
         }
      } else if (var11.field_843) {
         var11.field_901 = true;
         if (!var8.field_2868) {
            var12 = var11.field_849;
            if (var8.field_2884 != -1.0F) {
               var12 = var8.field_2884;
            }

            if (var8.field_2869 >= 0.0F) {
               var12 = var8.field_2869;
            }

            PointF var18 = var1.method_310(var10.field_2406, var10.field_2407, var12, var11.field_839, this.method_439());
            var11.field_844 = var18.field_2406;
            var11.field_845 = var18.field_2407;
         } else {
            var11.field_844 = var1.dh;
            var11.field_845 = var1.di;
         }

         if (var8.field_2892 != 0.0F) {
            var11.field_844 += (float)class_296.method_2014(this, (int)(-var8.field_2892 * 100.0F), (int)(var8.field_2892 * 100.0F), 2) / 100.0F;
            var11.field_845 += (float)class_296.method_2014(this, (int)(-var8.field_2892 * 100.0F), (int)(var8.field_2892 * 100.0F), 3) / 100.0F;
         }
      } else {
         var11.field_842 = var1;
      }

      var11.field_862 = var9.field_2406;
      var11.field_863 = var9.field_2407;
      var11.df = this.df;
      if (var11.df < 4 && this.dj >= -1.0F) {
         var11.df = 4;
      }

      if (var8.field_2871) {
         var11.df = 1;
      }

      var11.field_853 = var8.field_2867;
      var11.field_864 = var8.field_2872;
      var11.field_854 = var8.field_2873;
      var11.field_915 = var8.field_2874;
      var11.field_914 = var8.field_2886;
      var11.field_920 = var8.field_2875;
      var11.field_921 = var8.field_2876;
      var11.field_922 = var8.field_2877;
      if (var8.field_2878 != null) {
         var8.field_2878.method_3215(var10.field_2406, var10.field_2407, this.dj, this.bV[var4].field_4608, var11);
      }

      if (var8.field_2879 != -1) {
         var6.field_1938.method_2473(var11, var8.field_2879, var8.field_2880);
      }

      var11.field_925 = var8.field_2881;
      if (var8.field_2882 != -1.0F) {
         var11.field_916 = var8.field_2882;
      }

      if (var8.field_2883 != -1.0F) {
         var11.field_917 = var8.field_2883;
      }

      var11.field_919 = -1.0F;
      if (var8.field_2884 != -1.0F) {
         var11.field_847 = var8.field_2884;
      }

      var11.field_848 = var8.field_2885;
      if (var8.field_2904 != null) {
         var11.field_907 = var8.field_2904;
      }

      var11.field_908 = var8.field_2905;
      var11.field_909 = var8.field_2906;
      var11.field_910 = var8.field_2907;
      if (var7.field_2939 != null) {
         var6.field_1938.method_2474(var10.field_2406, var10.field_2407, this.dj, var7.field_2939);
      }

      if (var7.field_2937 != null) {
         var7.field_2937.method_3215(var10.field_2406, var10.field_2407, this.dj, this.bV[var4].field_4608, this);
      }

      if (var7.field_2936 != null) {
         var12 = 1.0F + class_296.method_2033(-0.07F, 0.07F);
         var7.field_2936.method_2307(var10.field_2406, var10.field_2407, var12);
      }

      if (this.field_549.field_4353) {
         this.K = null;
      }

      if (var7.field_2968) {
         this.bV[var4].field_4616 = null;
      }

      if (this.field_549.field_4234 && !this.bi) {
         this.method_253();
      }

      return var11;
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return this.field_549.field_4331;
   }

   // $FF: renamed from: r () int
   public strictfp int method_290() {
      return this.field_549.field_4226 != -1 ? this.field_549.field_4226 : super.r();
   }

   // $FF: renamed from: bH () float
   public strictfp float method_293() {
      return this.field_549.field_4229;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_292(class_39 var1) {
      return this.field_549.field_4227;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_291(class_39 var1) {
      return this.field_549.field_4228;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return this.field_549.field_4335 * this.field_538;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return this.field_549.field_4343;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2948 != null ? var2.field_2948 : this.field_549.field_4348;
   }

   // $FF: renamed from: s (int) float
   public strictfp float method_454(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2949;
   }

   // $FF: renamed from: t (int) float
   public strictfp float method_455(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2950;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return this.field_549.field_4359;
   }

   // $FF: renamed from: bJ () float
   public strictfp float method_296() {
      return this.field_549.field_4251 * this.field_533;
   }

   // $FF: renamed from: l (int) float
   public strictfp float method_424(int var1) {
      return this.field_549.field_4252;
   }

   // $FF: renamed from: d (boolean) float
   public strictfp float method_227(boolean var1) {
      if (!this.field_549.field_4321) {
         return 0.0F;
      } else if (var1 && this.field_549.field_4323) {
         return this.bV[this.field_549.field_4325.field_2913].field_4608 + 90.0F;
      } else {
         return this.field_549.field_4322 ? this.bV[this.field_549.field_4325.field_2913].field_4608 + 90.0F : super.d(var1);
      }
   }

   // $FF: renamed from: bV () android.graphics.PointF
   public strictfp PointF method_322() {
      if (this.field_549.field_4322 && this.bV[this.field_549.field_4325.field_2913].field_4611 != 0.0F) {
         class_365 var1 = this.field_549.field_4325;
         if (var1.field_2922 != 0.0F) {
            field_557.method_1961(this.method_479(this.field_549.field_4325.field_2913));
            field_557.method_1962(-this.dh, -this.di);
            return field_557;
         }
      }

      field_557.method_1960(0.0F, 0.0F);
      return field_557;
   }

   // $FF: renamed from: at () android.graphics.PointF
   public strictfp PointF method_427() {
      PointF var1 = this.method_322();
      field_558.method_1960(var1.field_2406 + this.field_549.field_4280, var1.field_2407 + this.field_549.field_4281);
      return field_558;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (this.field_566 != null && !this.bi) {
         this.method_603(var1, false, false);
      }

      if (!super.c(var1)) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         class_205.method_1364(this);
         if (this.field_566 != null && !this.bi && this.field_549.field_4412) {
            this.method_603(var1, true, false);
         }

         if (this.method_284() && this.field_549.field_4410 != null && !this.bi && !this.field_549.field_4262) {
            float var3 = this.bV[this.field_549.field_4410.field_2913].field_4612 / this.method_445(this.field_549.field_4410.field_2913);
            if (var3 != 0.0F && this.field_549.field_4405[this.field_549.field_4410.field_2913].field_2973 == null) {
               PointF var4 = this.aN();
               var2.field_1935.method_89();
               var2.field_1935.method_94(var4.field_2406 - var2.field_1965, var4.field_2407 - var2.field_1966 - this.dj);
               var2.field_1935.method_92(var3, var3);
               if (this.N()) {
                  var2.field_1935.method_69(class_84.field_737, 0.0F, 0.0F, (Paint)null);
               } else {
                  var2.field_1935.method_69(class_84.field_736, 0.0F, 0.0F, (Paint)null);
               }

               var2.field_1935.method_90();
            }
         }

         float var5;
         if (this.field_549.field_4404 && !this.bi) {
            int var9 = this.method_317();

            for(int var11 = 0; var11 < var9; ++var11) {
               var5 = this.bV[var11].field_4612 / this.method_445(var11);
               class_365 var6 = this.field_549.field_4405[var11];
               if (var6 != null && var5 != 0.0F && var6.field_2973 != null) {
                  class_205.method_1365(this, var6.field_2973, var5, var11);
               }
            }
         }

         if (!this.bi && this.bL > 0.0F && this.bN == 0.0F) {
            class_306 var10 = this.method_349();
            if (var10 != null) {
               float var12 = 0.0F;
               if (!this.field_549.field_4294) {
                  var12 += 0.09F;
                  var12 += this.bL / this.bO * 0.4F;
                  var12 += class_296.method_2022(this.bM, 50.0F) / 50.0F * 0.5F;
               } else {
                  var12 += class_296.method_2022(this.bM, 50.0F) / 50.0F * 0.5F;
                  var5 = this.bM;
                  if (var5 > 5.0F) {
                     var5 = 5.0F;
                  }

                  var12 += var5 / 5.0F * 0.2F;
               }

               if (var12 > 0.0F) {
                  if (var12 > 1.0F) {
                     var12 = 1.0F;
                  }

                  this.field_559.method_2791((int)(var12 * 255.0F), 255, 255, 255);
                  var5 = this.dh - var2.field_1965;
                  float var13 = this.di - var2.field_1966 - this.dj;
                  float var7 = 87.0F;
                  float var8 = (float)(this.field_549.field_4303 * 2) / var7 * 1.25F;
                  var2.field_1935.method_89();
                  var2.field_1935.method_93(var8, var8, var5, var13);
                  var2.field_1935.method_65(var10, var5, var13, this.method_227(false) - 90.0F, this.field_559);
                  var2.field_1935.method_90();
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: J () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_349() {
      return this.field_549.field_4183;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return this.field_549.field_4336;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return this.field_549.field_4337;
   }

   // $FF: renamed from: aI () boolean
   public strictfp boolean method_468() {
      return this.field_549.field_4344;
   }

   // $FF: renamed from: aJ () boolean
   public strictfp boolean method_469() {
      return this.field_549.field_4345;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return this.field_549.field_4360;
   }

   // $FF: renamed from: U () boolean
   public strictfp boolean method_381() {
      return this.field_549.field_4362.read(this);
   }

   // $FF: renamed from: T () boolean
   public strictfp boolean method_380() {
      return this.field_549.field_4361.read(this);
   }

   // $FF: renamed from: S () boolean
   public strictfp boolean method_379() {
      return this.field_549.field_4363.read(this);
   }

   // $FF: renamed from: V () boolean
   public strictfp boolean method_382() {
      return this.field_549.field_4364.read(this);
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return this.field_549.field_4365;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2951;
   }

   // $FF: renamed from: u (int) float
   public strictfp float method_475(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2953;
   }

   // $FF: renamed from: v (int) float
   public strictfp float method_476(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      float var3;
      if (var2.field_2929 != -1) {
         var3 = this.bV[var2.field_2929].field_4608;
      } else {
         var3 = this.bv;
      }

      if (this.bx && (double)this.method_460() > 0.95D) {
         var3 += var2.field_2917;
      } else {
         var3 += var2.field_2916;
      }

      return var2.field_2967 != 0.0F ? 999.0F : var3;
   }

   // $FF: renamed from: aM () boolean
   public strictfp boolean method_473() {
      return this.field_549.field_4333;
   }

   // $FF: renamed from: m (int) float
   public strictfp float method_442(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      if (!var2.field_2934) {
         return 0.0F;
      } else {
         class_363 var3 = this.field_549.field_4406[var2.field_2947];
         float var4 = 0.0F;
         if (!var3.field_2860) {
            var4 += (float)var3.field_2849;
         }

         var4 += (float)var3.field_2850;
         return var4;
      }
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2919;
   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2920;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_448(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2921;
   }

   // $FF: renamed from: o (int) boolean
   public strictfp boolean method_446(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2925;
   }

   // $FF: renamed from: p (int) float
   public strictfp float method_447(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2926 != 0.0F && var2.field_2920 != 0.0F ? -(var2.field_2926 * (this.bV[var1].field_4612 / var2.field_2920)) : 0.0F;
   }

   // $FF: renamed from: n (int) boolean
   public strictfp boolean method_444(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2934;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_376(class_39 var1, int var2) {
      class_365 var3 = this.field_549.field_4405[var2];
      if (var3.field_2938 != null) {
         PointF var4 = this.method_478(var2);
         var3.field_2938.method_3215(var4.field_2406, var4.field_2407, this.dj, this.bV[var2].field_4608, this);
      }

   }

   // $FF: renamed from: q (int) boolean
   public strictfp boolean method_449(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return !this.method_593(var2) ? false : super.q(var1);
   }

   // $FF: renamed from: m (com.corrodinggames.rts.game.units.aa) int
   public strictfp int method_221(class_39 var1) {
      return this.field_549.field_4367;
   }

   // $FF: renamed from: bf () boolean
   public strictfp boolean method_222() {
      return this.field_549.field_4368;
   }

   // $FF: renamed from: bg () boolean
   public strictfp boolean method_223() {
      return this.field_549.field_4369;
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return (float)this.field_549.field_4266;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public strictfp Rect method_299(boolean var1) {
      if (var1) {
         return super.a_(var1);
      } else if (this.bi) {
         return super.a_(var1);
      } else {
         int var2 = this.field_531;
         int var3 = 0;
         if (this.field_549.field_4327 > 0.0F && (this.field_549.field_4328 > 0 || this.field_549.field_4329 > 0)) {
            int var4 = (int)((this.bv - this.field_549.field_4330 - this.field_549.field_4327 * 0.5F) / this.field_549.field_4327);
            int var5 = (int)(360.0F / this.field_549.field_4327);
            var4 %= var5;
            if (var4 < 0) {
               var4 += var5;
            }

            if (this.field_549.field_4328 > 0) {
               var2 += var4 * this.field_549.field_4328;
            }

            if (this.field_549.field_4329 > 0) {
               var3 += var4 * this.field_549.field_4329;
            }
         }

         return super.a(var1, var2, var3);
      }
   }

   // $FF: renamed from: bL () android.graphics.RectF
   public strictfp RectF method_298() {
      class_236 var1 = class_236.method_1549();
      RectF var2 = super.bL();
      var2.method_1972((float)this.field_549.field_4174, (float)this.field_549.field_4175);
      return var2;
   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return this.field_549 == null ? 1 : this.field_549.field_4405.length;
   }

   // $FF: renamed from: r (int) int
   public strictfp int method_450(int var1) {
      return this.field_549.field_4405[var1].field_2930;
   }

   // $FF: renamed from: x (int) android.graphics.PointF
   public strictfp PointF method_479(int var1) {
      return this.method_596(var1, false);
   }

   // $FF: renamed from: a (int, boolean) android.graphics.PointF
   public strictfp PointF method_596(int var1, boolean var2) {
      class_365 var3 = this.field_549.field_4405[var1];
      float var4;
      float var5;
      float var6;
      if (var3.field_2929 == -1) {
         var4 = this.dh;
         var5 = this.di;
         var6 = this.bv;
      } else {
         if (var2) {
            throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");
         }

         aH = this.method_596(var3.field_2929, true);
         var4 = aH.field_2406;
         var5 = aH.field_2407;
         var6 = this.bV[var3.field_2929].field_4608;
      }

      float var7;
      float var8;
      if (this.bV[var1].field_4611 > 0.0F && var3.field_2922 != 0.0F) {
         var7 = 0.0F;
         var8 = this.method_441(var1) + this.method_447(var1) - this.bV[var1].field_4611;
         if (var8 < var3.field_2923) {
            var7 = var8 / var3.field_2923 * var3.field_2922;
         } else if (var8 < var3.field_2923 + var3.field_2924) {
            var7 = var3.field_2922 - (var8 - var3.field_2923) / var3.field_2924 * var3.field_2922;
         }

         if (var7 != 0.0F) {
            var4 += class_296.method_2099(this.bV[var1].field_4608) * var7;
            var5 += class_296.method_2098(this.bV[var1].field_4608) * var7;
         }
      }

      if (var3.field_2914 != 0.0F || var3.field_2915 != 0.0F) {
         var7 = class_296.method_2098(var6);
         var8 = class_296.method_2099(var6);
         var4 += var8 * var3.field_2915 - var7 * var3.field_2914;
         var5 += var7 * var3.field_2915 + var8 * var3.field_2914;
      }

      aH.method_1960(var4, var5);
      return aH;
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return this.field_550 != null ? this.field_550.method_143(this.method_261()) : this.field_549.method_143(this.method_261());
   }

   // $FF: renamed from: K () int
   public strictfp int method_261() {
      return this.field_549.field_4272;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.ap) java.lang.String
   public strictfp String method_274(class_24 var1) {
      return this.field_560.method_1936(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean, android.graphics.PointF, com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_263(class_121 var1, boolean var2, PointF var3, class_39 var4) {
      if (var1 == class_91.field_796) {
         if (!var2) {
            this.method_584();
         } else {
            this.method_585();
         }

      } else if (var1 == class_91.field_797) {
         if (!var2) {
            this.method_585();
         }

      } else {
         class_136 var5;
         if (!var2) {
            if (var3 != null && !this.method_501(var1, var3.field_2406, var3.field_2407)) {
               return;
            }

            if (var1 instanceof class_136) {
               var5 = (class_136)var1;
               if (var5.field_1364.field_4565 != null) {
                  class_236 var6 = class_236.method_1549();
                  if (this.bk == var6.field_1915) {
                     var5.field_1364.field_4565.method_2306();
                  }
               }

               if (var5.field_1364.field_4561 != null) {
                  var5.field_1364.field_4561.method_3215(this.dh, this.di, this.dj, this.bv, this);
               }
            }
         }

         if (var2 && var1 instanceof class_136) {
            var5 = (class_136)var1;
            if (!var5.field_1364.field_4543) {
               return;
            }
         }

         class_32 var7 = this.field_560.method_1937(var1, var2, var3, var4);
         class_136 var8;
         if (!var2) {
            if (var7 != null && var1 instanceof class_136) {
               var8 = (class_136)var1;
               var8.method_1104().method_3125(this, true);
            }
         } else if (var7 != null && var1 instanceof class_136) {
            var8 = (class_136)var1;
            if (var8.field_1364.field_4544) {
               var8.method_1104().method_3126(this, true);
            }
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
      this.method_263(var1, var2, (PointF)null, (class_39)null);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_264(class_121 var1, boolean var2) {
      this.field_560.method_1938(var1, var2);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.l) void
   public strictfp void method_265(class_121 var1) {
      this.field_560.method_1939(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, float, float) boolean
   public strictfp boolean method_501(class_121 var1, float var2, float var3) {
      if (var1 instanceof class_136) {
         class_136 var4 = (class_136)var1;
         if (var4.field_1364.field_4554 != null && var4.field_1364.field_4555 == null) {
            class_365 var5 = this.field_549.field_4405[var4.field_1364.field_4554];
            boolean var6 = true;
            if (!this.method_591(var5, var4.field_1364.field_4554, var2, var3, var6)) {
               return false;
            }
         }
      }

      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l) void
   public strictfp void method_500(class_121 var1) {
      if (var1 instanceof class_136) {
         class_136 var2 = (class_136)var1;
         if (var2.field_1364.field_4554 != null && var2.field_1364.field_4555 == null) {
            class_365 var3 = this.field_549.field_4405[var2.field_1364.field_4554];
            if (var3.field_2956 > 0.0F) {
               class_205.method_1359(this, var3.field_2956, true);
            }

            class_205.method_1357(this, var3.field_2954, true, true);
         }
      }

      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, android.graphics.PointF, com.corrodinggames.rts.game.units.aa, int) boolean
   public strictfp boolean method_597(class_121 var1, PointF var2, class_39 var3, int var4) {
      class_236 var5 = class_236.method_1549();
      if (var1 instanceof class_136) {
         class_136 var6 = (class_136)var1;
         class_496 var7 = var6.field_1364;
         boolean var8 = false;
         if (var7.field_4552 != null) {
            this.bP += var6.field_1364.field_4552;
            var8 = true;
         }

         if (var7.field_4553 != null) {
            var6.field_1364.field_4553.method_3126(this, false);
            var8 = true;
         }

         float var10;
         float var11;
         float var12;
         if (var7.field_4554 != null) {
            PointF var9 = var2;
            if (var7.field_4555 != null) {
               var9 = new PointF();
               var9.method_1960(this.dh, this.di);
               var10 = class_296.method_2099(this.bv);
               var11 = class_296.method_2098(this.bv);
               var12 = var7.field_4555.field_2406;
               float var13 = var7.field_4555.field_2407;
               float var14 = var10 * var13 - var11 * var12;
               float var15 = var11 * var13 + var10 * var12;
               var9.method_1962(var14, var15);
            }

            if (var9 == null) {
               class_454.method_2887("completeQueueItem:" + var6.v() + " for fireTurretXAtGround needs points but it is missing");
            } else {
               this.method_595((class_39)null, var9.field_2406, var9.field_2407, var6.field_1364.field_4554, var6.field_1364.field_4556);
            }

            var8 = true;
         }

         class_121 var16;
         if (var7.field_4558 != null) {
            if ((var7.field_4557 == null || var7.field_4557.read(this)) && var4 < 10) {
               var16 = var6.field_1364.field_4558.method_3212();
               this.method_597(var16, var2, var3, var4 + 1);
            }

            var8 = true;
         }

         if (var6.field_1364.field_4559 != null) {
            var16 = var6.field_1364.field_4559.method_3212();
            if (var7.field_4557 == null || var7.field_4557.read(this)) {
               if (var16 instanceof class_134) {
                  this.field_560.method_1926((class_134)var16, false, var2, var3);
               } else {
                  class_236.method_1652("alsoQueueAction not SpecialQueueAction:" + this.field_549.method_141() + " otherAction:" + var16.method_1043());
               }
            }

            var8 = true;
         }

         if (var7.field_4560 != null) {
            var7.field_4560.method_3215(this.dh, this.di, this.dj, this.bv, this);
            var8 = true;
         }

         if (var7.field_4562 != null) {
            var7.field_4562.method_2307(this.dh, this.di, 1.0F);
            var8 = true;
         }

         if (var7.field_4563 != null) {
            var7.field_4563.method_2306();
            var8 = true;
         }

         if (var7.field_4564 != null) {
            if (this.bk == var5.field_1915) {
               var7.field_4564.method_2306();
            }

            var8 = true;
         }

         if (var7.field_4567 != null) {
            if (var7.field_4567.read(this)) {
               this.aQ = var5.field_1921;
            }

            var8 = true;
         }

         if (var7.field_4568 != null) {
            class_193 var18 = new class_193();
            var7.field_4568.method_2316(var18, this.bk);
            Iterator var17 = var18.iterator();

            while(var17.hasNext()) {
               class_39 var21 = (class_39)var17.next();
               this.method_583(var21);
            }

            var8 = true;
         }

         class_24 var19 = var1.method_1055();
         if (var19 != null) {
            if (!(var19 instanceof class_479)) {
               class_39 var20 = var19.method_128();
               var20.method_258(this.bk);
               if (var20.method_314()) {
                  var20.method_258(class_107.field_1224);
               }

               var20.dh = this.dh;
               var20.di = this.di;
               if (!var20.method_212()) {
                  var20.field_154 = this.bv;
               }

               var11 = this.bJ;
               var12 = var20.field_168;
               if (var11 == 0.0F) {
                  var20.field_167 = var20.field_168;
               } else {
                  var20.field_167 = this.bI / var11 * var12;
               }

               if (this.bS) {
                  class_236.method_1549().field_1939.method_763(var20);
               }

               this.method_184();
            } else {
               var10 = this.method_294();
               boolean var22 = this.method_212();
               this.field_550 = null;
               this.method_589((class_479)var19, false);
               this.I();
               this.field_560.method_1931();
               this.aR = class_236.method_1549().field_1921;
               var12 = this.method_294();
               boolean var23 = this.method_212();
               if (var10 != var12 || var22 != var23) {
                  class_107.method_959(this);
               }
            }

            var8 = true;
            if (var6.method_1046() > 0) {
               this.L();
            }
         }

         if (!var8 && var7.field_4533) {
            class_236.method_1591("completeQueueItem:" + var6.v() + " had no effect (but should have)");
         }

         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public strictfp void method_10(class_32 var1) {
      class_121 var2 = this.b(var1.field_23);
      if (var2 != null) {
         boolean var3 = this.method_597(var2, var1.field_21, var1.field_22, 0);
         if (var3) {
            return;
         }
      }

      float var6 = 0.0F;
      if (this.field_549.field_4219 && this.field_549.field_4308 != null) {
         var6 = this.bv + this.field_549.field_4308;
         var6 += 90.0F;
      }

      float var4;
      if (this.field_549.field_4310 != null) {
         var4 = this.field_549.field_4310;
      } else if (this.field_560.field_2371 != null) {
         var4 = this.by * 3.0F;
      } else {
         var4 = this.by * 2.0F;
      }

      class_39 var5 = this.field_560.method_1922(var1, var4, this.field_543, var6);
      if (var5 != null) {
         this.method_598(var5);
      }

   }

   // $FF: renamed from: s (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_598(class_39 var1) {
      var1.dh = this.dh + this.field_549.field_4306;
      var1.di = this.di + this.field_549.field_4307;
      if (!this.field_549.field_4219) {
         float var2 = 180.0F;
         if (this.field_549.field_4308 != null) {
            var2 = this.field_549.field_4308;
         }

         float var3 = 70.0F;
         if (this.field_549.field_4310 != null) {
            var3 = this.field_549.field_4310;
         }

         float var4 = 7.0F;
         boolean var5 = class_91.method_678(this, var1, this.field_543, var4, var2, var3, this.field_549.field_4306, this.field_549.field_4307);
         var1.dj += this.field_549.field_4309;
         if (var1 instanceof class_66) {
            ((class_66)var1).method_608();
         }

         if ((this.method_280() || !var5 || this.field_549.field_4379.read(this)) && this.method_278()) {
            this.method_583(var1);
         }
      }

      this.field_543 = !this.field_543;
   }

   // $FF: renamed from: cm () com.corrodinggames.rts.game.units.custom.b
   public strictfp class_477 method_599() {
      class_477 var1 = new class_477();
      class_193 var2 = this.field_560.method_1941();
      int var3 = var2.size();
      if (var3 != 0) {
         Object[] var4 = var2.method_1298();

         for(int var5 = 0; var5 < var3; ++var5) {
            class_32 var6 = (class_32)var4[var5];
            class_121 var7 = this.b(var6.field_23);
            if (var7 != null && var7 instanceof class_136) {
               class_136 var8 = (class_136)var7;
               if (var8.field_1364.field_4552 != null) {
                  var1.field_4157 += var8.field_1364.field_4552;
               }

               if (var8.field_1364.field_4553 != null) {
                  class_477 var9 = var8.field_1364.field_4553;
                  var1.field_4157 += var9.field_4157;
                  var1.field_4160 += var9.field_4160;
                  var1.field_4156 += var9.field_4156;
                  var1.field_4158 += var9.field_4158;
                  var1.field_4159 += var9.field_4159;
               }
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: cl () boolean
   public strictfp boolean method_9() {
      return this.field_551.size() > this.field_549.field_4374;
   }

   // $FF: renamed from: h (com.corrodinggames.rts.game.units.ap) int
   public strictfp int method_11(class_24 var1) {
      return this.field_560.method_1933(var1);
   }

   // $FF: renamed from: e (boolean) int
   public strictfp int method_12(boolean var1) {
      return this.field_560.method_1935(class_121.field_1347, var1, true);
   }

   // $FF: renamed from: a (java.lang.String, boolean) int
   public strictfp int method_13(String var1, boolean var2) {
      return this.field_560.method_1934(var1, var2);
   }

   // $FF: renamed from: ci () com.corrodinggames.rts.game.units.d.i
   public strictfp class_32 method_17() {
      return this.field_560.method_1928();
   }

   // $FF: renamed from: ck () void
   public strictfp void method_16() {
      this.field_560.field_2374 = 1.0F;
   }

   // $FF: renamed from: cj () boolean
   public strictfp boolean method_14() {
      return this.field_560.method_1924();
   }

   // $FF: renamed from: a (android.graphics.PointF) void
   public strictfp void method_15(PointF var1) {
      if (this.field_549.field_4301) {
         this.field_560.field_2371 = var1;
      }

   }

   // $FF: renamed from: bk () float
   public strictfp float method_230() {
      return this.bj() && !this.field_560.method_1924() ? this.field_560.field_2374 : super.bk();
   }

   // $FF: renamed from: bl () float
   public strictfp float method_231() {
      if (this.field_549.field_4288 > 0.0F && this.bP < this.field_549.field_4288) {
         return this.bP / this.field_549.field_4288;
      } else if (this.bO > 0.0F && this.bL < this.bO) {
         return this.bL / this.bO;
      } else {
         if (this.field_549.field_4288 == 0.0F && this.bO == 0.0F) {
            if (this.field_549.field_4357 != -1 && this.bV[this.field_549.field_4357].field_4611 > 0.0F) {
               return 1.0F - this.bV[this.field_549.field_4357].field_4611 / this.method_441(this.field_549.field_4357);
            }

            if (this.field_549.field_4358 != -1 && this.bV[this.field_549.field_4358].field_4612 != 0.0F) {
               return this.bV[this.field_549.field_4358].field_4612 / this.method_445(this.field_549.field_4358);
            }
         }

         return super.bl();
      }
   }

   // $FF: renamed from: f (float) boolean
   public strictfp boolean method_182(float var1) {
      return super.f(var1);
   }

   // $FF: renamed from: bp () void
   public strictfp void method_235() {
      if (this.field_560.field_2371 != null) {
         class_236 var1 = class_236.method_1549();
         float var2 = (float)((int)(this.dh - var1.field_1965));
         float var3 = (float)((int)(this.di - var1.field_1966));
         float var4 = (float)((int)(this.field_560.field_2371.field_2406 - var1.field_1965));
         float var5 = (float)((int)(this.field_560.field_2371.field_2407 - var1.field_1966));
         var1.field_1935.method_96(var2, var3, var4, var5, class_50.field_370);
      }

   }

   // $FF: renamed from: bq () void
   public strictfp void method_237() {
      boolean var1 = true;
      float var2;
      if (this.field_549.field_4331 > 90.0F && this.field_549.field_4360) {
         var2 = this.method_439();
         class_205.method_1356(this, var2, var1);
      } else if (this.field_549.field_4219 && this.field_549.field_4226 > 50 && !this.field_549.field_4360) {
         var2 = (float)this.field_549.field_4226;
         class_205.method_1356(this, var2, var1);
      }

      if (this.field_549.field_4225.size() != 0) {
         Iterator var5 = this.field_549.field_4225.iterator();

         while(var5.hasNext()) {
            class_494 var3 = (class_494)var5.next();
            class_205.method_1356(this, var3.field_4518, var1);
         }
      }

      if (this.field_549.field_4250) {
         int var6 = this.method_317();

         for(int var7 = 0; var7 < var6; ++var7) {
            class_365 var4 = this.field_549.field_4405[var7];
            if (var4.field_2960 != null && var4.field_2961 > 0.0F) {
               class_205.method_1358(this, var4.field_2961, Color.method_3077(90, 135, 235, 135), 1, var1);
            }
         }
      }

   }

   // $FF: renamed from: d (float) void
   public strictfp void method_178(float var1) {
      if (this.bt()) {
         super.d(var1);
         if (!this.bi) {
            if (this.field_549.field_4176 != null) {
               class_236 var2 = class_236.method_1549();
               byte var3 = 0;
               byte var4 = 0;
               float var5 = this.dh - var2.field_1965;
               float var6 = this.di - var2.field_1966 - this.dj;
               cA.method_1969(var5 - (float)this.dn, var6 - (float)this.do, var5 + (float)this.dn, var6 + (float)this.do);
               float var7 = this.method_296();
               if (var7 != 1.0F) {
                  var2.field_1935.method_89();
                  var2.field_1935.method_93(var7, var7, var5, var6);
               }

               cB.method_1911(var3, var4, var3 + this.dl, var4 + this.dm);
               var2.field_1935.method_68(this.field_549.field_4176, cB, cA, this.method_423());
               if (var7 != 1.0F) {
                  var2.field_1935.method_90();
               }
            }

            if (this.field_549.field_4413 && this.field_566 != null && !this.bi) {
               this.method_603(var1, false, true);
            }

         }
      }
   }

   // $FF: renamed from: ar () float
   public strictfp float method_422() {
      return this.field_549.field_4326;
   }

   // $FF: renamed from: as () android.graphics.Paint
   public strictfp Paint method_423() {
      Paint var1 = super.as();
      return var1;
   }

   // $FF: renamed from: ay () boolean
   public strictfp boolean method_440() {
      return this.field_549.field_4370;
   }

   // $FF: renamed from: aZ () boolean
   public strictfp boolean method_212() {
      return this.field_549.field_4219;
   }

   // $FF: renamed from: cb () boolean
   public strictfp boolean method_330() {
      return this.field_549.field_4221;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_386(class_39 var1) {
      if (var1.method_330()) {
         return false;
      } else {
         if (var1.method_212()) {
            if (this.field_549.field_4222) {
               return true;
            }
         } else if (this.field_549.field_4223) {
            return true;
         }

         return false;
      }
   }

   // $FF: renamed from: h (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_392(class_39 var1) {
      if (this.field_549.field_4233) {
         class_512 var2 = this.ad();
         if (var2 != null) {
            class_295 var3 = var2.field_4674;
            if (var3 != null) {
               var3.method_1998(var2);
            }
         }

         this.bw();
      }

   }

   // $FF: renamed from: q (com.corrodinggames.rts.game.units.aa) int
   public strictfp int method_289(class_39 var1) {
      int var2 = 0;
      if (this.field_549.field_4220 && this.field_549.field_4219 && var1.method_290() < 20) {
         var2 += 17;
      }

      return var2;
   }

   // $FF: renamed from: X () boolean
   public strictfp boolean method_283() {
      return this.field_549.field_4392;
   }

   // $FF: renamed from: Y () boolean
   public strictfp boolean method_284() {
      return this.field_549.field_4391;
   }

   // $FF: renamed from: Z () boolean
   public strictfp boolean method_391() {
      return this.field_549.field_4390;
   }

   // $FF: renamed from: ba () boolean
   public strictfp boolean method_213() {
      return this.field_549.field_4394;
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
      super.a(var1, var2);
      if (!this.bi && this.method_284() && !this.field_549.field_4262) {
         class_84.method_657(var1, this);
      }

   }

   // $FF: renamed from: bR () boolean
   public strictfp boolean method_313() {
      return this.field_549.field_4276;
   }

   // $FF: renamed from: bS () boolean
   public strictfp boolean method_314() {
      return this.field_549.field_4277;
   }

   // $FF: renamed from: g () float
   public strictfp float method_316() {
      return this.field_549.field_4278;
   }

   // $FF: renamed from: bT () void
   public strictfp void method_315() {
      if (this.field_549.field_4232 == 0.0F && this.method_316() > 0.0F) {
         this.bB = 1.0F;
      }

   }

   // $FF: renamed from: bB () java.lang.String
   public strictfp String method_273() {
      return this.field_549.field_4374 != 0 ? class_91.field_796.method_1043() : super.bB();
   }

   // $FF: renamed from: C (int) float
   public strictfp float method_484(int var1) {
      return this.field_549.field_4366;
   }

   // $FF: renamed from: aD () float
   public strictfp float method_461() {
      return this.field_549.field_4288;
   }

   // $FF: renamed from: aE () com.corrodinggames.rts.game.units.b
   public strictfp class_280 method_462() {
      return this.field_549.field_4349;
   }

   // $FF: renamed from: aF () boolean
   public strictfp boolean method_463() {
      if (this.field_549.field_4352) {
         return false;
      } else if (this.field_549.field_4349 != class_280.field_2404) {
         return true;
      } else {
         class_512 var1 = this.ad();
         if (var1 != null && (var1.method_3255() == class_501.field_4602 || var1.method_3255() == class_501.field_4604)) {
            return true;
         } else {
            return this.I == class_281.field_2408;
         }
      }
   }

   // $FF: renamed from: bm () boolean
   public strictfp boolean method_232() {
      return this.field_547;
   }

   // $FF: renamed from: aG () boolean
   public strictfp boolean method_464() {
      return this.field_549.field_4355;
   }

   // $FF: renamed from: aC () float
   public strictfp float method_460() {
      return this.field_549.field_4356;
   }

   // $FF: renamed from: cn () void
   public strictfp void method_600() {
      if (this.field_549.field_4411 != null || this.field_566 != null) {
         if (this.field_549.field_4411 != null && this.field_549.field_4411.length != 0) {
            if (this.field_566 == null || this.field_566.length != this.field_549.field_4411.length) {
               this.field_566 = new class_480[this.field_549.field_4411.length];

               int var1;
               class_480 var2;
               for(var1 = 0; var1 < this.field_549.field_4411.length; var2.field_4427 = var1++) {
                  var2 = new class_480(this);
                  this.field_566[var1] = var2;
               }

               this.field_561 = this.dh;
               this.field_562 = this.di;
               this.field_563 = this.bv;
               this.method_602(0.0F);

               for(var1 = 0; var1 < this.field_549.field_4411.length; ++var1) {
                  this.field_566[var1].field_4443 = true;
               }

            }
         } else {
            this.field_566 = null;
         }
      }
   }

   // $FF: renamed from: co () void
   public strictfp void method_601() {
      for(int var1 = 0; var1 < this.field_566.length; ++var1) {
         this.field_566[var1].field_4444 = true;
         this.field_566[var1].field_4443 = true;
      }

      this.method_602(0.0F);
   }

   // $FF: renamed from: o (float) void
   public strictfp void method_602(float var1) {
      if (this.field_566 != null) {
         if (this.bX != null) {
            for(int var24 = 0; var24 < this.field_566.length; ++var24) {
               class_480 var25 = this.field_566[var24];
               var25.field_4443 = true;
            }

         } else {
            class_236 var2 = class_236.method_1549();
            float var3 = this.bv;
            if (this.field_549.field_4324) {
               var3 = this.bV[this.field_549.field_4325.field_2913].field_4608;
            }

            float var4 = this.dh - this.field_561;
            float var5 = this.di - this.field_562;
            float var6 = var3 - this.field_563;
            boolean var7 = var4 != 0.0F || var5 != 0.0F || var6 != 0.0F;
            this.field_561 = this.dh;
            this.field_562 = this.di;
            this.field_563 = var3;
            PointF var10 = this.l(15.0F);
            float var8 = var10.field_2406;
            float var9 = var10.field_2407;
            float var11 = class_296.method_2026(0.0F, 0.0F, var8, var9);
            float var12 = class_296.method_2031(0.0F, 0.0F, var8, var9);
            var11 *= 240.0F;
            if (var11 > 15.0F) {
               var11 = 15.0F;
            }

            var8 = class_296.method_2099(var12) * var11;
            var9 = class_296.method_2098(var12) * var11;
            int var26 = 0;
            var11 = 0.0F;
            int var27 = 0;

            int var13;
            class_480 var14;
            class_358 var15;
            boolean var16;
            for(var13 = 0; var13 < this.field_566.length; ++var13) {
               var14 = this.field_566[var13];
               var15 = this.field_549.field_4411[var13];
               var16 = false;
               boolean var17 = false;
               if (var14.field_4443) {
                  var16 = true;
                  var14.field_4443 = false;
                  var14.field_4445 = true;
                  if (var14.field_4444) {
                     var17 = true;
                  }

                  var14.field_4444 = false;
               }

               if (!var15.field_2813) {
                  if (var7) {
                     var14.field_4428 -= var4;
                     var14.field_4429 -= var5;
                     var14.field_4445 = true;
                  }
               } else if (var7 && var6 != 0.0F) {
                  class_296.field_2479.method_1960(var14.field_4428, var14.field_4429);
                  class_296.method_2025(0.0F, 0.0F, var6, class_296.field_2479);
                  var14.field_4428 = class_296.field_2479.field_2406;
                  var14.field_4429 = class_296.field_2479.field_2407;
                  var14.field_4437 += var6;
                  var14.field_4445 = true;
               }

               if (!var15.field_2817) {
                  if (var15.field_2838 != 0.0F) {
                     var14.field_4448 += var15.field_2838 * var1;
                     var14.field_4448 %= 360.0F;
                  }

                  if (var14.field_4445) {
                     float var18 = class_296.method_2099(var3);
                     float var19 = class_296.method_2098(var3);
                     float var20 = var15.field_2808 + var14.field_4446;
                     float var21 = var15.field_2809 + var14.field_4447;
                     var14.field_4432 = var18 * var21 - var19 * var20;
                     var14.field_4433 = var19 * var21 + var18 * var20;
                     if (var16) {
                        var14.field_4428 = var14.field_4432;
                        var14.field_4429 = var14.field_4433;
                        var14.field_4437 = var3 + var15.field_2810;
                        var14.field_4445 = true;
                        if (var17) {
                           var14.field_4428 *= 0.6F;
                           var14.field_4429 *= 0.6F;
                           var14.field_4430 = -3.0F;
                        }
                     }

                     float var22 = var18 * var15.field_2812 - var19 * var15.field_2811;
                     float var23 = var19 * var15.field_2812 + var18 * var15.field_2811;
                     var14.field_4435 = class_296.method_2026(var14.field_4428, var14.field_4429, var14.field_4432, var14.field_4433);
                     if (!var15.field_2813) {
                        var14.field_4432 += var8 * var15.field_2814;
                        var14.field_4433 += var9 * var15.field_2814;
                     }

                     var14.field_4436 = class_296.method_2031(var14.field_4428, var14.field_4429, var14.field_4432, var14.field_4433);
                     var14.field_4434 = class_296.method_2026(var14.field_4428, var14.field_4429, var14.field_4432, var14.field_4433);
                     var14.field_4438 = class_296.method_2031(var14.field_4428, var14.field_4429, var22, var23);
                     var14.field_4439 = class_296.method_2026(var14.field_4428, var14.field_4429, var22, var23);
                     if (var14.field_4434 > var11) {
                        var27 = var13;
                        var11 = var14.field_4434;
                     }

                     if (var14.field_4441) {
                        ++var26;
                     }
                  }
               }
            }

            for(var13 = 0; var13 < this.field_566.length; ++var13) {
               var14 = this.field_566[var13];
               var15 = this.field_549.field_4411[var13];
               if (!var15.field_2817) {
                  float var28;
                  if (var14.field_4434 > 90000.0F) {
                     var14.field_4428 = var15.field_2808;
                     var14.field_4429 = var15.field_2809;
                  } else if (var14.field_4434 > var15.field_2833 * var15.field_2833) {
                     var28 = class_296.method_2031(var14.field_4432, var14.field_4433, var14.field_4428, var14.field_4429);
                     var14.field_4428 = var14.field_4432 + class_296.method_2099(var28) * var15.field_2833;
                     var14.field_4429 = var14.field_4433 + class_296.method_2098(var28) * var15.field_2833;
                     var14.field_4441 = true;
                  }

                  float var31;
                  if (!var14.field_4441 && var14.field_4430 <= 0.1F && var26 < var15.field_2830 && (var13 == var27 || !var15.field_2831)) {
                     var16 = false;
                     if (var15.field_2815) {
                        for(int var29 = 0; var29 < var15.field_2837.length; ++var29) {
                           if (this.field_566[var15.field_2837[var29]].field_4441) {
                              var16 = true;
                           }
                        }
                     }

                     var31 = var15.field_2829;
                     if (var16) {
                        var31 = var15.field_2832;
                     }

                     if (var14.field_4434 > var31 * var31) {
                        var14.field_4441 = true;
                        ++var26;
                     }
                  }

                  if (var15.field_2813) {
                     var14.field_4441 = true;
                  }

                  if (var14.field_4441) {
                     if (var14.field_4430 <= 2.0F && !var15.field_2813) {
                        if (var14.field_4431 < var15.field_2819) {
                           var14.field_4431 += var1;
                        } else {
                           var14.field_4430 += var1 * var15.field_2821;
                        }
                     } else {
                        var28 = var1 * var15.field_2818;
                        if (var14.field_4434 <= var28 * var28) {
                           var14.field_4428 = var14.field_4432;
                           var14.field_4429 = var14.field_4433;
                           var14.field_4445 = true;
                           var14.field_4441 = false;
                        } else {
                           var14.field_4428 += class_296.method_2099(var14.field_4436) * var28;
                           var14.field_4429 += class_296.method_2098(var14.field_4436) * var28;
                           var14.field_4445 = true;
                        }

                        if (var15.field_2813 && var14.field_4430 > 0.0F) {
                           var14.field_4430 -= var1 * var15.field_2821;
                           if (var14.field_4430 <= 0.0F) {
                              var14.field_4430 = 0.0F;
                           }
                        }

                        var31 = class_296.method_2030(var14.field_4437, var3 + var15.field_2810, var15.field_2820 * var1);
                        var14.field_4437 += var31;
                        var14.field_4440 = false;
                     }
                  } else {
                     var14.field_4431 = 0.0F;
                     if (var14.field_4430 > 0.0F) {
                        var14.field_4430 -= var1 * var15.field_2821;
                        if (var14.field_4430 <= 0.0F) {
                           var14.field_4430 = 0.0F;
                           var28 = this.dh + var14.field_4428;
                           var31 = this.di + var14.field_4429;
                           var14.field_4442 = class_205.method_1372(var28, var31);
                           if (var15.field_2828 && !var14.field_4440) {
                              var14.field_4440 = true;
                              if (var14.field_4442) {
                                 if (var2.field_1994 && this.de) {
                                    var2.field_1938.method_2477(var28, var31, var14.field_4430, 0, 0.0F, 0.0F);
                                 }
                              } else if (var2.field_1993 && this.de) {
                                 class_390 var30 = var2.field_1938.method_2470(var28, var31, var14.field_4430, var14.field_4437, 0);
                                 if (var30 != null) {
                                    var30.field_3154 = 0.0F;
                                    var30.field_3155 = 0.0F;
                                    var30.field_3145 = 1.6F;
                                    var30.field_3144 = 2.8F;
                                 }
                              }
                           }
                        }
                     } else if (var14.field_4442 && var14.field_4430 > -3.0F) {
                        var14.field_4430 -= var1 * 0.3F;
                     }
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: a (float, boolean, boolean) void
   public strictfp void method_603(float var1, boolean var2, boolean var3) {
      if (this.field_566 != null) {
         class_236 var4 = class_236.method_1549();
         if (this.bE || this.bD) {
            for(int var5 = 0; var5 < this.field_549.field_4411.length; ++var5) {
               this.field_566[var5].field_4443 = true;
            }

            this.method_602(0.0F);
         }

         float var16 = this.method_296();

         for(int var6 = 0; var6 < this.field_566.length; ++var6) {
            class_358 var7 = this.field_549.field_4411[var6];
            if ((var7.field_2834 == var2 || var7.field_2826 != null) && var7.field_2835 == var3 && !var7.field_2817) {
               class_480 var8 = this.field_566[var6];
               float var9 = this.dj;
               this.dj += var8.field_4430;
               Paint var10 = this.method_423();
               this.dj = var9;
               float var11 = this.dh + var8.field_4428 - class_236.method_1549().field_1965;
               float var12 = this.di + var8.field_4429 - class_236.method_1549().field_1966 - var8.field_4430 - this.dj;
               if (var16 != 1.0F) {
                  var4.field_1935.method_89();
                  var4.field_1935.method_93(var16, var16, var11, var12);
               }

               if (var7.field_2826 != null && !var2 && var4.field_1996 && var8.field_4430 + this.dj > 0.0F) {
                  float var13 = var12 + var8.field_4430 + this.dj;
                  var4.field_1935.method_65(var7.field_2826, var11, var13, var8.field_4437 + var8.field_4448 + var7.field_2836, ao);
               }

               if (var7.field_2834 == var2) {
                  class_306 var17 = var7.field_2824;
                  if (var7.field_2825 != null) {
                     var17 = var7.field_2825[this.bk.method_963()];
                  }

                  if (!var7.field_2827 && var17 != null) {
                     var4.field_1935.method_65(var17, var11, var12, var8.field_4437 + var8.field_4448 + var7.field_2836, var10);
                  }

                  class_306 var14 = var7.field_2823;
                  if (var14 != null) {
                     float var15 = var14.field_2536;
                     if (var8.field_4439 < (float)((var14.field_2532 - 2) * (var14.field_2532 - 2))) {
                        var15 = class_296.method_2019(var8.field_4439);
                     }

                     var4.field_1935.method_89();
                     var4.field_1935.method_91(var8.field_4438 + 90.0F, var11, var12);
                     field_564.method_1911(0, (int)(var14.field_2536 - var15), var14.field_2531, (int)(var14.field_2536 + var15));
                     field_565.method_1969(var11 - (float)var14.field_2533, var12 - var15, var11 + (float)var14.field_2533, var12 + var15);
                     var4.field_1935.method_68(var14, field_564, field_565, var10);
                     var4.field_1935.method_90();
                  }

                  if (var7.field_2827 && var17 != null) {
                     var4.field_1935.method_65(var17, var11, var12, var8.field_4437 + var8.field_4448 + var7.field_2836, var10);
                  }
               }

               if (var16 != 1.0F) {
                  var4.field_1935.method_90();
               }
            }
         }

      }
   }

   // $FF: renamed from: aw () int
   public strictfp int method_434() {
      return this.field_549.field_4410 == null ? -1 : this.field_549.field_4410.field_2913;
   }

   // $FF: renamed from: b_ () int
   public strictfp int method_490() {
      return this.field_549.field_4305;
   }

   // $FF: renamed from: br () android.graphics.Rect
   public strictfp Rect method_238() {
      return this.field_549.field_4297;
   }

   // $FF: renamed from: bs () android.graphics.Rect
   public strictfp Rect method_239() {
      return this.field_549.field_4298;
   }

   // $FF: renamed from: b (int, float) boolean
   public strictfp boolean method_470(int var1, float var2) {
      class_365 var3 = this.field_549.field_4405[var1];
      if (var3.field_2967 != 0.0F) {
         class_502 var10000 = this.bV[var1];
         var10000.field_4608 += var3.field_2967 * var2;
         if (this.bV[var1].field_4608 > 180.0F) {
            var10000 = this.bV[var1];
            var10000.field_4608 -= 360.0F;
         }

         if (this.bV[var1].field_4608 < -180.0F) {
            var10000 = this.bV[var1];
            var10000.field_4608 += 360.0F;
         }

         return false;
      } else {
         return var3.field_2966;
      }
   }

   // $FF: renamed from: bG () int
   public strictfp int method_287() {
      return this.field_549.field_4382;
   }

   // $FF: renamed from: cp () java.util.ArrayList
   public strictfp ArrayList method_604() {
      field_567.clear();
      ArrayList var1 = this.method_260();
      if (var1.size() != 0) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            class_121 var3 = (class_121)var2.next();
            if (var3 instanceof class_136) {
               class_136 var4 = (class_136)var3;
               if (var4.field_1366 == class_495.field_4521) {
                  field_567.add(var4);
               }
            }
         }
      }

      return field_567;
   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      ArrayList var1 = this.method_604();
      return var1.size() > 0 ? ((class_121)var1.get(0)).method_1043() : null;
   }

   // $FF: renamed from: a (java.util.ArrayList) void
   public strictfp void method_272(ArrayList var1) {
      var1.clear();
      ArrayList var2 = this.method_604();
      if (var2.size() >= 2) {
         var2.remove(0);
         Iterator var3 = var2.iterator();

         while(var3.hasNext()) {
            class_121 var4 = (class_121)var3.next();
            var1.add(var4.method_1043());
         }

      }
   }

   // $FF: renamed from: bW () float
   public strictfp float method_323() {
      return this.field_549.field_4299;
   }

   // $FF: renamed from: bX () float
   public strictfp float method_324() {
      return this.field_549.field_4300;
   }

   // $FF: renamed from: aW () void
   public strictfp void method_253() {
      this.field_560.method_1932();
      super.aW();
   }

   // $FF: renamed from: bZ () void
   public strictfp void method_328() {
      this.dj = 170.0F;
      this.field_536 = 1.5F;
      super.bZ();
   }

   // $FF: renamed from: ca () boolean
   public strictfp boolean method_329() {
      return this.field_549.field_4273;
   }

   // $FF: renamed from: aP () int
   public strictfp int method_488() {
      return this.field_549.field_4240;
   }

   // $FF: renamed from: a (int, float) void
   public strictfp void method_363(int var1, float var2) {
      class_502 var10000 = this.bV[var1];
      var10000.field_4608 += var2;
      if (this.field_549.field_4409) {
         for(int var3 = 0; var3 < this.field_549.field_4405.length; ++var3) {
            class_365 var4 = this.field_549.field_4405[var3];
            if (var4.field_2929 == var1) {
               var10000 = this.bV[var3];
               var10000.field_4608 += var2;
               if (this.bV[var3].field_4610 < 2.0F) {
                  this.bV[var3].field_4610 = 2.0F;
               }
            }
         }
      }

   }

   // $FF: renamed from: bY () float
   public strictfp float method_325() {
      return super.bY() + (float)this.field_549.field_4304;
   }

   // $FF: renamed from: y (int) float
   public strictfp float method_480(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2922;
   }

   // $FF: renamed from: z (int) float
   public strictfp float method_481(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2923;
   }

   // $FF: renamed from: A (int) float
   public strictfp float method_482(int var1) {
      class_365 var2 = this.field_549.field_4405[var1];
      return var2.field_2924;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public strictfp float method_246(class_39 var1, float var2, class_97 var3) {
      if (this.field_549.field_4285 > 0.0F && var2 > this.field_549.field_4286) {
         float var4 = this.field_549.field_4285;
         if (var3 != null) {
            var4 -= var3.field_892;
         }

         if (var4 < 0.0F) {
            var4 = 0.0F;
         }

         var2 -= var4;
         if (var2 < this.field_549.field_4286) {
            var2 = this.field_549.field_4286;
         }
      }

      return super.a(var1, var2, var3);
   }

   // $FF: renamed from: ax () float
   public strictfp float method_437() {
      return this.field_549.field_4332;
   }

   // $FF: renamed from: R () boolean
   public strictfp boolean method_373() {
      return !this.field_549.field_4354 ? false : super.R();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.u) boolean
   public strictfp boolean method_499(class_284 var1) {
      if (var1 == class_284.field_2430) {
         return this.field_549.field_4311.method_2306();
      } else if (var1 == class_284.field_2431) {
         return this.field_549.field_4312.method_2306();
      } else {
         return var1 == class_284.field_2432 ? this.field_549.field_4313.method_2306() : false;
      }
   }

   // $FF: renamed from: p (float) void
   public strictfp void method_605(float var1) {
      if (this.field_549.field_4426 != null) {
         class_479 var2 = this.field_549;
         if (this.field_548 != 0.0F) {
            this.field_548 = class_296.method_2020(this.field_548, var1);
            return;
         }

         for(int var3 = 0; var3 < var2.field_4426.length; ++var3) {
            class_492 var4 = var2.field_4426[var3];
            if (var4.field_4513.read(this)) {
               field_568.field_2406 = this.dh;
               field_568.field_2407 = this.di;
               PointF var5 = field_568;
               Object var6 = null;
               this.method_597(var4.field_4514, var5, (class_39)var6, 0);
               this.field_548 = 60.0F;
               if (var2 != this.field_549) {
                  return;
               }
            }
         }
      }

   }

   // $FF: renamed from: cc () com.corrodinggames.rts.game.units.custom.d
   public strictfp class_478 method_331() {
      return this.field_549.field_4208;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.custom.ai) void
   public strictfp void method_606(class_365 var1) {
      if (this.method_593(var1)) {
         float var2 = var1.field_2961;
         float var3 = var1.field_2962;
         float var4 = var1.field_2963;
         class_97 var5 = null;
         class_478 var6 = var1.field_2960;
         Object[] var7 = class_97.field_833.method_1298();

         for(int var8 = 0; var8 < class_97.field_833.field_1647; ++var8) {
            class_97 var9 = (class_97)var7[var8];
            if (var9.field_910 != null && var9.dj > var4 && class_476.method_3113(var9.field_910, var6)) {
               float var10 = class_296.method_2026(this.dh, this.di, var9.dh, var9.di);
               if (var10 < var3 * var3) {
                  float var11 = class_296.method_2026(this.dh, this.di, var9.field_844, var9.field_845);
                  if ((var11 < var2 * var2 || var2 < 0.0F) && (var9.field_841 == null || !var9.field_841.field_143.method_944(this.bk) && var9.field_841.field_143 != this.bk) && !this.method_607(var9)) {
                     var5 = var9;
                  }
               }
            }
         }

         if (var5 != null) {
            this.method_594(var1);
            class_97 var12 = this.method_595((class_39)null, var5.dh, var5.di, var1.field_2913, (class_363)null);
            var12.field_901 = true;
            var12.field_846 = var5;
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.f) boolean
   public strictfp boolean method_607(class_97 var1) {
      Iterator var2 = class_97.field_833.iterator();

      class_97 var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (class_97)var2.next();
      } while(var3 == var1 || var3.field_846 != var1);

      return true;
   }

   // $FF: renamed from: cq () void
   public final strictfp void method_608() {
      if (this.field_549.field_4387 == class_503.field_4620) {
         if (this.method_280()) {
            this.I(5);
         } else if (this.method_278() && this.bA == 0.0F) {
            this.I(3);
         } else {
            this.I(2);
         }
      } else if (this.bA == 0.0F) {
         this.I(this.field_549.field_4279);
      }

   }

   // $FF: renamed from: bx () boolean
   public strictfp boolean method_268() {
      return this.field_549.field_4418;
   }

   // $FF: renamed from: m_ () boolean
   public strictfp boolean method_22() {
      return this.field_549.field_4386.read(this);
   }

   // $FF: renamed from: n_ () boolean
   public strictfp boolean method_23() {
      return true;
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public strictfp PointF method_478(int var1) {
      class_502 var2 = this.bV[var1];
      class_365 var3 = this.field_549.field_4405[var1];
      float var4 = var3.field_2951;
      float var5 = var3.field_2952;
      float var6 = this.method_456() ? this.bv : var2.field_4608;
      PointF var7 = this.method_479(var1);
      float var8 = class_296.method_2099(var6);
      float var9 = class_296.method_2098(var6);
      float var10 = var7.field_2406;
      float var11 = var7.field_2407;
      var10 += var8 * var4 - var9 * var5;
      var11 += var9 * var4 + var8 * var5;
      aG.method_1960(var10, var11);
      return aG;
   }

   // $FF: renamed from: bz () float
   public strictfp float method_270() {
      return this.field_549.field_4402;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, int) void
   public strictfp void method_502(class_39 var1, float var2, int var3) {
      if (this.field_549.field_4262) {
         this.N = class_296.method_2020(this.N, var2);
         if (this.N == 0.0F) {
            this.N = this.field_549.field_4263;
            if (this.field_549.field_4264 != null) {
               class_502 var4 = this.bV[var3];
               PointF var5 = this.method_478(var3);
               this.field_549.field_4264.method_3215(var5.field_2406, var5.field_2407, this.dj, var4.field_4608, this);
            }

            if (this.field_549.field_4265 != null) {
               this.field_549.field_4265.method_3215(var1.dh, var1.di, var1.dj, var1.field_154, var1);
            }
         }
      } else {
         super.a(var1, var2, var3);
      }

   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_588();
   }
}
