package com.corrodinggames.rts.game.units.e;

import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_10;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_193;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.e.i
public class class_91 extends class_87 implements class_10 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_788 = null;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_789 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_790 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_791 = new class_306[10];
   // $FF: renamed from: e float
   float field_792 = 0.0F;
   // $FF: renamed from: f float
   float field_793;
   // $FF: renamed from: g boolean
   boolean field_794;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.utility.k
   class_193 field_795 = new class_193();
   // $FF: renamed from: i com.corrodinggames.rts.game.units.a.l
   public static final class_121 field_796 = new i$1(109);
   // $FF: renamed from: j com.corrodinggames.rts.game.units.a.l
   public static final class_121 field_797 = new i$2(110);
   // $FF: renamed from: k java.util.ArrayList
   static ArrayList field_798 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_792);
      var1.method_2542(this.field_793);
      var1.method_2540(this.field_794);
      var1.method_2541(this.field_795.size());
      Iterator var2 = this.field_795.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         var1.method_2550(var3);
      }

      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_792 = var1.method_3012();
      this.field_793 = var1.method_3012();
      this.field_794 = var1.method_3010();
      this.field_795.clear();
      int var2 = var1.method_3011();

      for(int var3 = 0; var3 < var2; ++var3) {
         class_39 var4 = var1.method_3019();
         if (var4 != null) {
            this.field_795.add(var4);
         }
      }

      super.a(var1);
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_672() {
      return class_469.field_4051;
   }

   // $FF: renamed from: c () void
   public static strictfp void method_673() {
      class_236 var0 = class_236.method_1549();
      field_788 = var0.field_1935.method_60(R$drawable.hovercraft);
      field_790 = var0.field_1935.method_60(R$drawable.hovercraft_shadow);
      field_789 = var0.field_1935.method_60(R$drawable.hovercraft_dead);
      field_791 = class_107.method_948(field_788);
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? field_789 : field_791[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return field_790;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      this.G = field_789;
      this.I(0);
      this.bh = false;
      this.method_674(true);
      this.a(class_282.field_2422);
      return true;
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      this.method_674(true);
      super.a();
   }

   // $FF: renamed from: e (boolean) void
   public strictfp void method_674(boolean var1) {
      Iterator var2 = this.field_795.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         var3.field_182 = null;
         var3.dh = this.dh + class_296.method_2099(this.bv) * -9.0F;
         var3.di = this.di + class_296.method_2098(this.bv) * -9.0F;
         if (var1) {
            var3.field_167 = -1.0F;
         }
      }

      this.field_795.clear();
   }

   public strictfp class_91(boolean var1) {
      super(var1);
      this.J(20);
      this.K(32);
      this.by = 15.0F;
      this.bz = this.by;
      this.bJ = 450.0F;
      this.bI = this.bJ;
      this.G = field_788;
      this.H = field_790;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.k) int
   public static strictfp int method_675(class_193 var0) {
      int var1 = 0;

      class_39 var3;
      for(Iterator var2 = var0.iterator(); var2.hasNext(); var1 += var3.method_287()) {
         var3 = (class_39)var2.next();
      }

      return var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.k, int, com.corrodinggames.rts.game.units.aa) boolean
   public static strictfp boolean method_676(class_193 var0, int var1, class_39 var2) {
      int var3 = method_675(var0);
      return var3 + var2.method_287() <= var1;
   }

   // $FF: renamed from: bn () int
   public strictfp int method_233() {
      return method_675(this.field_795);
   }

   // $FF: renamed from: bo () int
   public strictfp int method_234() {
      return 4;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, com.corrodinggames.rts.game.units.aa, boolean) boolean
   public static strictfp boolean method_677(class_39 var0, class_39 var1, boolean var2) {
      float var3 = 9.0F;
      float var4 = -180.0F;
      float var5 = 70.0F;
      float var6 = 0.0F;
      float var7 = 7.0F;
      return method_678(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, com.corrodinggames.rts.game.units.aa, boolean, float, float, float, float, float) boolean
   public static strictfp boolean method_678(class_39 var0, class_39 var1, boolean var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = var0.dh + class_296.method_2099(var0.field_154 + var4) * var7 - class_296.method_2098(var0.field_154 + var4) * var6;
      float var9 = var0.di + class_296.method_2098(var0.field_154 + var4) * var7 + class_296.method_2099(var0.field_154 + var4) * var6;
      var8 += class_296.method_2099(var0.field_154 + 90.0F) * (var2 ? -var3 : var3);
      var9 += class_296.method_2098(var0.field_154 + 90.0F) * (var2 ? -var3 : var3);
      if (!class_205.method_1367(var1, var8, var9)) {
         var8 += 10.0F;
      }

      if (!class_205.method_1367(var1, var8, var9)) {
         var8 -= 20.0F;
      }

      if (!class_205.method_1367(var1, var8, var9)) {
         var8 -= 10.0F;
         var9 += 10.0F;
      }

      if (!class_205.method_1367(var1, var8, var9)) {
         var9 -= 20.0F;
      }

      if (!class_205.method_1367(var1, var8, var9)) {
         return false;
      } else {
         var1.field_182 = null;
         var1.dh = var8;
         var1.di = var9;
         var1.field_144 += 0.1F;
         var1.field_154 = var0.field_154 + var4;
         var1.field_138 = var0;
         var1.field_139 = 45.0F;
         if (var1 instanceof class_44) {
            class_44 var10 = (class_44)var1;
            var10.method_362(var1.field_154);
            var10.method_407();
            var10.method_397(var1.dh + class_296.method_2099(var1.field_154 + (var2 ? -var3 : var3)) * var5, var1.di + class_296.method_2098(var1.field_154 + (var2 ? -var3 : var3)) * var5);
            var10.field_290 = 0;
         }

         return true;
      }
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      super.method_176(var1);
      if (!this.bi && this.bj()) {
         if (this.bA == 0.0F && this.df != 3) {
            this.I(3);
         }

         if (this.field_794 && !this.bP() && !this.bU) {
            this.field_793 = class_296.method_2020(this.field_793, var1);
            if (this.field_793 == 0.0F) {
               this.field_793 = 30.0F;
               if (this.field_795.size() == 0) {
                  this.field_794 = false;
               } else {
                  boolean var2 = this.field_795.size() % 2 == 0;
                  class_39 var3 = (class_39)this.field_795.remove(this.field_795.size() - 1);
                  boolean var4 = method_677(this, var3, var2);
                  if (!var4) {
                     this.field_795.add(var3);
                  }

                  if (this.field_795.size() == 0) {
                     this.field_794 = false;
                  }
               }
            }
         }

         this.field_792 += 4.0F * var1;
         if (this.field_792 > 360.0F) {
            this.field_792 -= 360.0F;
         }

         if (!this.field_794) {
            this.dj = class_296.method_2021(this.dj, 3.0F + class_296.method_2098(this.field_792) * 1.5F, 0.1F * var1);
         } else {
            this.dj = class_296.method_2021(this.dj, 0.0F, 0.1F * var1);
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 30.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 100.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return this.bP() ? 1.2F : 0.9F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return this.bP() ? 1.8F : 1.4F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 0.1F;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.03F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.05F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: o (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_276(class_39 var1) {
      if (this.field_794) {
         return false;
      } else if (!method_676(this.field_795, 4, var1)) {
         return false;
      } else {
         return var1 == this ? false : class_205.method_1362(var1, true);
      }
   }

   // $FF: renamed from: p (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_277(class_39 var1) {
      if (!this.method_276(var1)) {
         return false;
      } else {
         this.method_679(var1);
         return true;
      }
   }

   // $FF: renamed from: r (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_679(class_39 var1) {
      var1.field_182 = this;
      this.field_795.add(var1);
      class_236 var2 = class_236.method_1549();
      var2.field_1939.method_765(var1);
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 12000.0F;
   }

   // $FF: renamed from: l_ () boolean
   public strictfp boolean method_21() {
      return this.field_794;
   }

   // $FF: renamed from: cd () void
   public strictfp void method_680() {
      this.field_794 = true;
      this.field_793 = 30.0F;
   }

   // $FF: renamed from: ce () void
   public strictfp void method_681() {
      this.field_794 = false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
      if (var1 == field_796) {
         this.method_680();
      }

      if (var1 == field_797) {
         this.method_681();
      }

   }

   // $FF: renamed from: bD () boolean
   public strictfp boolean method_278() {
      return true;
   }

   // $FF: renamed from: j () int
   public strictfp int method_20() {
      return this.field_795.size();
   }

   // $FF: renamed from: bB () java.lang.String
   public strictfp String method_273() {
      return field_796.method_1043();
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_798;
   }

   // $FF: renamed from: m_ () boolean
   public strictfp boolean method_22() {
      return !this.bP();
   }

   // $FF: renamed from: n_ () boolean
   public strictfp boolean method_23() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_672();
   }

   static {
      field_798.add(field_796);
      field_798.add(field_797);
   }
}
