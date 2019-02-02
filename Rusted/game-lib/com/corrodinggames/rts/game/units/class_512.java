package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_295;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;

// $FF: renamed from: com.corrodinggames.rts.game.units.ar
public final class class_512 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.as
   class_501 field_4667;
   // $FF: renamed from: b com.corrodinggames.rts.game.units.ap
   class_24 field_4668;
   // $FF: renamed from: c int
   int field_4669;
   // $FF: renamed from: d float
   float field_4670 = 1.0F;
   // $FF: renamed from: e float
   float field_4671 = 1.0F;
   // $FF: renamed from: f long
   long field_4672 = -1L;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.aa
   class_39 field_4673;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.z
   public class_295 field_4674;
   // $FF: renamed from: i boolean
   public boolean field_4675;
   // $FF: renamed from: j float
   public float field_4676 = -1.0F;
   // $FF: renamed from: k float
   public float field_4677 = -1.0F;
   // $FF: renamed from: l boolean
   public boolean field_4678;

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ar) boolean
   public strictfp boolean method_3250(class_512 var1) {
      if (var1 == null) {
         return false;
      } else if (this.field_4667 != var1.field_4667) {
         return false;
      } else if (this.field_4668 != var1.field_4668) {
         return false;
      } else if (class_296.method_2042(this.field_4670 - var1.field_4670) <= 1.0F && class_296.method_2042(this.field_4671 - var1.field_4671) <= 1.0F) {
         return this.field_4669 == var1.field_4669;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a () com.corrodinggames.rts.game.units.ap
   public strictfp class_24 method_3251() {
      return this.field_4668;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_3252(class_404 var1) {
      var1.method_2553(this.field_4667);
      var1.method_2554(this.field_4668);
      var1.method_2542(this.field_4670);
      var1.method_2542(this.field_4671);
      if (this.field_4672 != -1L) {
         var1.method_2543(this.field_4672);
      } else {
         var1.method_2550(this.field_4673);
      }

      var1.method_2539(this.field_4669);
      var1.method_2542(this.field_4676);
      var1.method_2542(this.field_4677);
      var1.method_2540(this.field_4678);
      var1.method_2540(this.field_4675);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_3253(class_463 var1) {
      this.field_4667 = (class_501)var1.method_3022(as.class);
      this.field_4668 = var1.method_3023();
      this.field_4670 = var1.method_3012();
      this.field_4671 = var1.method_3012();
      this.field_4672 = var1.method_3016();
      this.field_4673 = null;
      if (var1.method_3006() >= 40) {
         this.field_4669 = var1.method_3009();
      }

      if (var1.method_3006() >= 46) {
         this.field_4676 = var1.method_3012();
         this.field_4677 = var1.method_3012();
      }

      if (var1.method_3006() >= 58) {
         this.field_4678 = var1.method_3010();
      }

      if (var1.method_3006() >= 65) {
         this.field_4675 = var1.method_3010();
      }

   }

   // $FF: renamed from: b () void
   public strictfp void method_3254() {
      if (this.field_4672 != -1L) {
         this.field_4673 = class_34.method_186(this.field_4672, true);
         if (this.field_4673 == null) {
            class_236.method_1588("convertUnitIds failed");
            if (this.field_4667 != null) {
               class_236.method_1588("convertUnitIds: type:" + this.field_4667.toString());
            }

            if (this.field_4668 != null) {
               class_236.method_1588("convertUnitIds: build:" + this.field_4668.toString());
            }

            class_236.method_1588("convertUnitIds: x:" + this.field_4670 + ", y:" + this.field_4671);
         }

         this.field_4672 = -1L;
      }

   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.as
   public strictfp class_501 method_3255() {
      return this.field_4667;
   }

   // $FF: renamed from: d () void
   public strictfp void method_3256() {
      this.field_4667 = class_501.field_4595;
      this.field_4668 = null;
      this.field_4669 = 1;
      this.field_4670 = 2.0F;
      this.field_4671 = 2.0F;
      this.field_4672 = -1L;
      this.field_4673 = null;
      this.field_4674 = null;
      this.field_4676 = -1.0F;
      this.field_4677 = -1.0F;
      this.field_4678 = false;
      this.field_4675 = false;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_3257() {
      return this.field_4667 == class_501.field_4596 || this.field_4667 == class_501.field_4598 || this.field_4667 == class_501.field_4601 || this.field_4667 == class_501.field_4599 || this.field_4667 == class_501.field_4603 || this.field_4667 == class_501.field_4605;
   }

   // $FF: renamed from: f () float
   public strictfp float method_3258() {
      return this.method_3257() && this.field_4673 != null ? this.field_4673.dh : this.field_4670;
   }

   // $FF: renamed from: g () float
   public strictfp float method_3259() {
      return this.method_3257() && this.field_4673 != null ? this.field_4673.di : this.field_4671;
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_3260() {
      return this.field_4673;
   }

   // $FF: renamed from: a (float, float) void
   public strictfp void method_3261(float var1, float var2) {
      this.method_3256();
      this.field_4667 = class_501.field_4595;
      this.field_4670 = var1;
      this.field_4671 = var2;
   }

   // $FF: renamed from: b (float, float) void
   public strictfp void method_3262(float var1, float var2) {
      this.method_3256();
      this.field_4667 = class_501.field_4602;
      this.field_4670 = var1;
      this.field_4671 = var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_3263(class_39 var1) {
      this.method_3256();
      this.field_4667 = class_501.field_4596;
      this.field_4673 = var1;
   }

   // $FF: renamed from: a (float, float, com.corrodinggames.rts.game.units.ap, int) void
   public strictfp void method_3264(float var1, float var2, class_24 var3, int var4) {
      this.method_3256();
      this.field_4667 = class_501.field_4597;
      this.field_4670 = var1;
      this.field_4671 = var2;
      this.field_4668 = var3;
      this.field_4669 = var4;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_3265(class_39 var1) {
      this.method_3256();
      this.field_4667 = class_501.field_4598;
      this.field_4673 = var1;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_3266(class_39 var1) {
      this.method_3256();
      this.field_4667 = class_501.field_4605;
      this.field_4673 = var1;
   }

   // $FF: renamed from: c (float, float) void
   public strictfp void method_3267(float var1, float var2) {
      this.method_3256();
      this.field_4667 = class_501.field_4604;
      this.field_4670 = var1;
      this.field_4671 = var2;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_3268(class_39 var1) {
      this.method_3256();
      this.field_4667 = class_501.field_4601;
      this.field_4673 = var1;
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_3269(class_39 var1) {
      this.method_3256();
      this.field_4667 = class_501.field_4599;
      this.field_4673 = var1;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_3270(class_39 var1) {
      this.method_3256();
      this.field_4667 = class_501.field_4603;
      this.field_4673 = var1;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ar) void
   public strictfp void method_3271(class_512 var1) {
      this.method_3256();
      this.field_4667 = var1.field_4667;
      this.field_4668 = var1.field_4668;
      this.field_4670 = var1.field_4670;
      this.field_4671 = var1.field_4671;
      this.field_4673 = var1.field_4673;
      this.field_4674 = var1.field_4674;
      this.field_4669 = var1.field_4669;
      this.field_4675 = var1.field_4675;
   }

   // $FF: renamed from: i () long
   public strictfp long method_3272() {
      long var1 = 0L;
      if (this.field_4667 != null) {
         var1 += (long)this.field_4667.ordinal();
      }

      return var1;
   }

   // $FF: renamed from: j () void
   public strictfp void method_3273() {
      if (this.field_4673 != null) {
         this.field_4672 = this.field_4673.da;
         this.field_4673 = null;
      }

      this.field_4674 = null;
   }
}
