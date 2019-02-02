package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_512;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.z
public class class_295 {
   // $FF: renamed from: a java.util.ArrayList
   ArrayList field_2454;
   // $FF: renamed from: b boolean
   boolean field_2455;
   // $FF: renamed from: c float
   float field_2456;
   // $FF: renamed from: d float
   float field_2457;
   // $FF: renamed from: e int
   int field_2458;
   // $FF: renamed from: f boolean
   boolean field_2459;
   // $FF: renamed from: g java.util.ArrayList
   public ArrayList field_2460;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.y
   // $FF: synthetic field
   final class_31 field_2461;

   public class_295(class_31 var1) {
      this.field_2461 = var1;
      this.field_2454 = new ArrayList();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, com.corrodinggames.rts.game.units.ar) void
   public void method_1997(class_44 var1, class_512 var2) {
      var2.field_4674 = this;
      this.field_2459 = var2.field_4675;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ar) void
   public void method_1998(class_512 var1) {
      Iterator var2 = this.field_2454.iterator();

      while(var2.hasNext()) {
         class_44 var3 = (class_44)var2.next();
         if (!var3.bi) {
            class_512 var4 = var3.method_400();
            if (var4 != null && var4.method_3250(var1)) {
               var3.method_406();
            }
         }
      }

   }

   // $FF: renamed from: a () void
   public void method_1999() {
      this.field_2454.clear();
      class_39[] var1 = class_39.field_126.method_1326();
      int var2 = 0;

      for(int var3 = class_39.field_126.size(); var2 < var3; ++var2) {
         class_39 var4 = var1[var2];
         if (var4 instanceof class_44) {
            class_44 var5 = (class_44)var4;
            if (var5.method_431()) {
               class_512 var6 = var5.method_400();
               if (var6 != null && var6.field_4674 == this && var5.method_464()) {
                  this.field_2454.add(var5);
                  this.field_2456 = var6.method_3258();
                  this.field_2457 = var6.method_3259();
               }
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   public void method_2000(class_44 var1) {
      var1.field_290 = this.field_2458;
      class_512 var2 = var1.method_400();
      if (var2 != null) {
         var2.field_4674 = this;
      }

   }

   // $FF: renamed from: b () void
   public void method_2001() {
      this.method_2005();
   }

   // $FF: renamed from: a (java.util.ArrayList, float, float, boolean) com.corrodinggames.rts.game.units.p
   public class_44 method_2002(ArrayList var1, float var2, float var3, boolean var4) {
      float var5 = -1.0F;
      class_44 var6 = null;
      Iterator var7 = var1.iterator();

      while(true) {
         class_44 var8;
         float var9;
         do {
            do {
               if (!var7.hasNext()) {
                  return var6;
               }

               var8 = (class_44)var7.next();
            } while(!var4 && (var8.field_291 != null || var8.field_292));

            var9 = class_296.method_2027(var2, var3, var8.dh, var8.di);
            if (var8.field_293) {
               var9 -= 160.0F;
            }
         } while(var5 != -1.0F && var9 >= var5);

         var5 = var9;
         var6 = var8;
      }
   }

   // $FF: renamed from: a (float, float, boolean) java.util.ArrayList
   public ArrayList method_2003(float var1, float var2, boolean var3) {
      ArrayList var4 = new ArrayList(1);
      ArrayList var5 = new ArrayList();
      var5.clear();
      var5.addAll(this.field_2454);

      while(true) {
         class_44 var6 = this.method_2002(var5, var1, var2, true);
         if (var6 == null) {
            return var4;
         }

         var4.add(var6);
         var5.remove(var6);
         ArrayList var7 = this.method_2004(var5, var6, true, var3);
         var5.removeAll(var7);
      }
   }

   // $FF: renamed from: a (java.util.ArrayList, com.corrodinggames.rts.game.units.p, boolean, boolean) java.util.ArrayList
   public ArrayList method_2004(ArrayList var1, class_44 var2, boolean var3, boolean var4) {
      ArrayList var5 = new ArrayList(1);
      var5.clear();
      int var6 = 0;
      Iterator var7 = var1.iterator();

      while(true) {
         class_44 var8;
         float var9;
         do {
            do {
               do {
                  do {
                     if (!var7.hasNext()) {
                        return var5;
                     }

                     var8 = (class_44)var7.next();
                  } while(!var3 && (var8.field_291 != null || var8.field_292));
               } while(!var8.h().equals(var2.h()));

               var9 = class_296.method_2026(var8.dh, var8.di, var2.dh, var2.di);
            } while((!var4 || var9 >= 160000.0F) && (var9 >= 40000.0F || var6 >= 25));
         } while(!var4 && (double)Math.abs(var8.method_458() - var2.method_458()) >= 0.4D);

         var5.add(var8);
         ++var6;
      }
   }

   // $FF: renamed from: c () void
   public void method_2005() {
      class_236 var1 = class_236.method_1549();
      this.method_1999();
      this.field_2461.field_15.method_1960(0.0F, 0.0F);
      Iterator var2 = this.field_2454.iterator();

      class_44 var3;
      while(var2.hasNext()) {
         var3 = (class_44)var2.next();
         var3.field_293 = var3.field_292;
         var3.method_409();
         var3.field_294 = 0;
         var3.field_300 = var1.field_1921;
         var3.field_290 = this.field_2458;
         this.field_2461.field_15.method_1962(var3.dh, var3.di);
      }

      this.field_2461.field_15.method_1960(this.field_2461.field_15.field_2406 / (float)this.field_2454.size(), this.field_2461.field_15.field_2407 / (float)this.field_2454.size());
      int var28 = 0;

      while(true) {
         var3 = null;
         var3 = this.method_2002(this.field_2454, this.field_2456, this.field_2457, false);
         if (var3 == null) {
            return;
         }

         var3.field_292 = true;
         class_295 var4 = null;
         if (var28 > 0) {
            var4 = this.field_2461.method_152();
         }

         if (var4 != null) {
            var4.field_2460 = this.field_2460;
            var4.method_2000(var3);
         }

         ArrayList var5 = this.method_2004(this.field_2454, var3, false, this.field_2459);
         int var6 = 0;
         float var7 = 0.0F;

         for(Iterator var8 = var5.iterator(); var8.hasNext(); ++var6) {
            class_44 var9 = (class_44)var8.next();
            if (var9.by > var7) {
               var7 = var9.by;
            }

            var9.field_291 = var3;
            if (var4 != null) {
               var4.method_2000(var9);
            }
         }

         if (var3 != null) {
            var3.field_294 = (short)(var6 + 1);
         }

         int var29 = 1;
         int var30 = 0;
         byte var10 = 6;
         int var11 = var10 / 2;
         float var12 = class_296.method_2031(this.field_2461.field_15.field_2406, this.field_2461.field_15.field_2407, this.field_2456, this.field_2457);
         float var13 = 2.0F + var7 * 2.0F * 1.5F;
         ArrayList var14 = new ArrayList();
         int var15 = var6;
         if (var6 % 2 != 0) {
            var15 = var6 + 1;
         }

         float var21;
         for(int var16 = 0; var16 < var15; ++var16) {
            int var17;
            if (var29 % 2 == 0) {
               var17 = var11 + var29 / 2;
            } else {
               var17 = var11 - (var29 + 1) / 2;
            }

            float var18 = (float)(var17 - var11) * var13;
            float var19 = (float)(-var30) * var13;
            float var20 = var19 * class_296.method_2099(var12) - var18 * class_296.method_2098(var12);
            var21 = var18 * class_296.method_2099(var12) + var19 * class_296.method_2098(var12);
            var14.add(new PointF(var20, var21));
            ++var29;
            if (var29 > var10) {
               var29 = 0;
               ++var30;
            }
         }

         label113:
         while(!var14.isEmpty()) {
            class_44 var31 = null;
            float var32 = -1.0F;
            PointF var33 = null;
            Iterator var34 = this.field_2454.iterator();

            label110:
            while(true) {
               class_44 var35;
               do {
                  do {
                     if (!var34.hasNext()) {
                        if (var31 == null) {
                           break label113;
                        }

                        var31.field_296 = true;
                        var31.field_297 = var33.field_2406;
                        var31.field_298 = var33.field_2407;
                        var31.field_299 = var12;
                        var31.field_294 = (short)(var6 + 1);
                        var14.remove(var33);
                        continue label113;
                     }

                     var35 = (class_44)var34.next();
                  } while(var35.field_291 != var3);
               } while(var35.field_296);

               var21 = -1.0F;
               PointF var22 = null;
               Iterator var23 = var14.iterator();

               while(true) {
                  PointF var24;
                  float var27;
                  do {
                     if (!var23.hasNext()) {
                        if (var21 > var32) {
                           var31 = var35;
                           var32 = var21;
                           var33 = var22;
                        }
                        continue label110;
                     }

                     var24 = (PointF)var23.next();
                     float var25 = var3.dh + var24.field_2406;
                     float var26 = var3.di + var24.field_2407;
                     var27 = class_296.method_2026(var35.dh, var35.di, var25, var26);
                  } while(var21 != -1.0F && var27 >= var21);

                  var21 = var27;
                  var22 = var24;
               }
            }
         }

         ++var28;
      }
   }
}
