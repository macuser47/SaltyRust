package com.corrodinggames.rts.gameFramework.c;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.gameFramework.class_236;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.u
public class class_114 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.k
   private class_236 field_1325;
   // $FF: renamed from: b android.graphics.Paint
   private Paint field_1326;
   // $FF: renamed from: c java.util.ArrayList
   private ArrayList field_1327 = new ArrayList();

   public strictfp class_114(class_236 var1) {
      this.field_1325 = var1;
      this.method_1018();
   }

   // $FF: renamed from: a () void
   public strictfp void method_1018() {
      this.field_1326 = new Paint();
      this.field_1326.method_2791(255, 255, 255, 255);
      this.field_1326.method_2781(true);
      this.field_1326.method_2783(true);
      this.field_1326.method_2799(Typeface.method_1917(Typeface.field_2362, 1));
      this.field_1325.method_1603(this.field_1326, 14.0F);
   }

   // $FF: renamed from: b () void
   public strictfp synchronized void method_1019() {
      this.field_1327.clear();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public strictfp synchronized void method_1020(class_39 var1) {
      class_119 var2 = new class_119(var1.dh, var1.di, var1.method_295());
      var2.c = class_236.method_1596();
      this.method_1023(var2);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) void
   public strictfp synchronized void method_1021(class_39 var1) {
      class_120 var2 = new class_120(var1.dh, var1.di, var1.method_295());
      var2.c = class_236.method_1596();
      this.method_1023(var2);
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) void
   public strictfp synchronized void method_1022(class_39 var1) {
      class_118 var2 = new class_118(var1.dh, var1.di, var1.method_212());
      var2.c = class_236.method_1596();
      this.method_1023(var2);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.c.y) void
   private strictfp void method_1023(class_117 var1) {
      boolean var2 = false;
      Iterator var3 = this.field_1327.iterator();

      while(var3.hasNext()) {
         class_117 var4 = (class_117)var3.next();
         if (var4.method_1032(var1)) {
            var4.method_1034(var1);
            var2 = true;
            break;
         }
      }

      if (var2) {
         Collections.sort(this.field_1327);
      } else {
         this.field_1327.add(0, var1);
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp synchronized void method_1024(float var1) {
      this.method_1025();
      class_236 var2 = class_236.method_1549();
      if (var2.field_1937.showWarLogOnScreen) {
         int var3 = (int)(var2.field_1957 - 130.0F * var2.field_1955);
         byte var4 = 20;
         int var5 = (int)(20.0F * var2.field_1955);

         for(Iterator var6 = this.field_1327.iterator(); var6.hasNext(); var3 -= var5) {
            class_117 var7 = (class_117)var6.next();
            String var8 = var7.method_1035();
            if (var7.field_1337 + 5000L < System.currentTimeMillis()) {
               break;
            }

            if (var7.field_1341) {
               this.field_1326.method_2791(255, 160, 160, 160);
            } else {
               this.field_1326.method_2791(255, 255, 255, 255);
            }

            var2.field_1935.method_78(var8, (float)var4, (float)var3, this.field_1326);
         }
      }

   }

   // $FF: renamed from: c () void
   public strictfp synchronized void method_1025() {
      Iterator var1 = this.field_1327.iterator();

      while(var1.hasNext()) {
         class_117 var2 = (class_117)var1.next();
         if (var2.field_1337 + 20000L < System.currentTimeMillis()) {
            var1.remove();
         }
      }

   }

   // $FF: renamed from: d () void
   public strictfp synchronized void method_1026() {
      if (!this.field_1327.isEmpty()) {
         Iterator var1 = this.field_1327.iterator();

         while(var1.hasNext()) {
            class_117 var2 = (class_117)var1.next();
            if (!var2.field_1341) {
               var2.field_1341 = true;
               this.field_1325.method_1582(var2.field_1338, var2.field_1339);
               break;
            }
         }

      }
   }
}
