package com.corrodinggames.rts.gameFramework.a;

import android.content.Context;
import com.corrodinggames.rts.R$raw;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.utility.class_196;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.a.e
public class class_525 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.a.h
   public static class_325 field_4749 = new class_327();
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4750;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4751;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4752;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4753;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4754;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4755;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4756;
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4757;
   // $FF: renamed from: j com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4758;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4759;
   // $FF: renamed from: l com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4760;
   // $FF: renamed from: m com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4761;
   // $FF: renamed from: n com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4762;
   // $FF: renamed from: o com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4763;
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4764;
   // $FF: renamed from: q com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4765;
   // $FF: renamed from: r com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4766;
   // $FF: renamed from: s com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4767;
   // $FF: renamed from: t com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4768;
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4769;
   // $FF: renamed from: v com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4770;
   // $FF: renamed from: w com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4771;
   // $FF: renamed from: x com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4772;
   // $FF: renamed from: y com.corrodinggames.rts.gameFramework.a.i
   public static class_299 field_4773;

   // $FF: renamed from: a () boolean
   public boolean method_3318() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1937.masterVolume * var1.field_1937.gameVolume < 0.01F ? false : var1.field_1937.enableSounds;
   }

   // $FF: renamed from: b () void
   public static void method_3319() {
   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_3320(Context var1) {
      field_4749.method_2209(var1);
      field_4750 = field_4749.method_2207(R$raw.attack);
      field_4751 = field_4749.method_2207(R$raw.move);
      field_4752 = field_4749.method_2207(R$raw.click);
      field_4754 = field_4749.method_2207(R$raw.missile_fire);
      field_4755 = field_4749.method_2207(R$raw.missile_hit);
      field_4756 = field_4749.method_2207(R$raw.unit_explode);
      field_4757 = field_4749.method_2207(R$raw.buiding_explode);
      field_4758 = field_4749.method_2207(R$raw.tank_firing);
      field_4759 = field_4749.method_2207(R$raw.cannon_firing);
      field_4760 = field_4749.method_2207(R$raw.gun_fire);
      field_4765 = field_4749.method_2207(R$raw.lighting_burst);
      field_4766 = field_4749.method_2207(R$raw.plasma_fire);
      field_4767 = field_4749.method_2207(R$raw.plasma_fire2);
      field_4761 = field_4749.method_2207(R$raw.firing3);
      field_4762 = field_4749.method_2207(R$raw.firing4);
      field_4763 = field_4749.method_2207(R$raw.large_gun_fire1);
      field_4764 = field_4749.method_2207(R$raw.large_gun_fire2);
      field_4768 = field_4749.method_2207(R$raw.bug_die);
      field_4769 = field_4749.method_2207(R$raw.bug_attack);
      field_4753 = field_4749.method_2207(R$raw.interface_error);
      field_4770 = field_4749.method_2207(R$raw.nuke_explode);
      field_4771 = field_4749.method_2207(R$raw.nuke_launch);
      field_4772 = field_4749.method_2207(R$raw.laser_deflect);
      field_4773 = field_4749.method_2207(R$raw.laser_deflect2);
      field_4749.method_2210();
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.a.i
   public class_299 method_3321(String var1) {
      class_299 var2 = (class_299)field_4749.field_2620.get(var1);
      if (var2 == null) {
         throw new RuntimeException("Could not find sound:" + var1);
      } else {
         return var2;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.a.i, float) void
   public void method_3322(class_299 var1, float var2) {
      if (this.method_3318()) {
         class_236 var3 = class_236.method_1549();
         var2 *= var3.field_1937.masterVolume * var3.field_1937.gameVolume;
         var1.method_2104(var2, var2, 1, 0, 1.0F);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.a.i, float, float, float) void
   public void method_3323(class_299 var1, float var2, float var3, float var4) {
      this.method_3324(var1, var2, 1.0F, var3, var4);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.a.i, float, float, float, float) void
   public void method_3324(class_299 var1, float var2, float var3, float var4, float var5) {
      if (this.method_3318()) {
         class_236 var6 = class_236.method_1549();
         if (var6.field_1884) {
            var2 /= 20.0F;
         }

         if (var6.field_1948.method_2658() && (double)var6.field_1916 > 1.5D) {
            var2 /= var6.field_1916;
         }

         int var7 = (int)(var6.field_1965 + var6.field_1975);
         int var8 = (int)(var6.field_1966 + var6.field_1976);
         float var9 = class_296.method_2026((float)var7, (float)var8, var4, var5);
         float var10 = var6.field_1975 * 2.0F;
         if ((double)var6.field_1988 < 0.5D) {
            var2 *= 4.0F;
            var2 *= class_296.method_2041(var6.field_1988, 2.0F);
         }

         if (var2 > 1.0F || var1.field_2505 || var9 <= var10 * var10) {
            float var11 = (float)Math.sqrt((double)var9);
            float var12 = 1.0F;
            if (var11 > var6.field_1975) {
               var12 = 1.0F - (var11 - var6.field_1975) / var6.field_1975;
            }

            float var13 = var12 * var2;
            if ((double)var13 > 0.05D || var1.field_2505) {
               if (var13 > 1.0F) {
                  var13 = 1.0F;
               }

               var13 *= var6.field_1937.masterVolume * var6.field_1937.gameVolume;
               var1.method_2104(var13, var13, 1, 0, var3);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.utility.j, boolean) com.corrodinggames.rts.gameFramework.a.i
   public class_299 method_3325(String var1, class_196 var2, boolean var3) {
      return field_4749.method_2208(var1, var2, var3);
   }
}
