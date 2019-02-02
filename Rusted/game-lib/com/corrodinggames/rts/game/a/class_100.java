package com.corrodinggames.rts.game.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_30;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.utility.class_205;

// $FF: renamed from: com.corrodinggames.rts.game.a.n
public abstract class class_100 extends class_30 {
   // $FF: renamed from: E int
   public int field_1138;
   // $FF: renamed from: F com.corrodinggames.rts.game.a.a
   protected final class_112 field_1139;
   // $FF: renamed from: G float
   public float field_1140;
   // $FF: renamed from: H float
   public float field_1141;
   // $FF: renamed from: I float
   public float field_1142;
   // $FF: renamed from: J boolean
   public boolean field_1143;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2542(this.field_1140);
      var1.method_2542(this.field_1141);
      var1.method_2542(this.field_1142);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_836(class_463 var1) {
      this.field_1140 = var1.method_3012();
      this.field_1141 = var1.method_3012();
      this.field_1142 = var1.method_3012();
   }

   public class_100(class_112 var1) {
      ++var1.field_1273;
      this.field_1138 = var1.field_1273;
      this.field_1139 = var1;
      this.field_1139.field_1299.add(this);
      this.field_1139.field_1300.add(this);
   }

   public class_100(class_112 var1, float var2, float var3) {
      this(var1);
      this.field_1140 = var2;
      this.field_1141 = var3;
   }

   // $FF: renamed from: k () void
   public void method_837() {
      this.field_1139.field_1299.remove(this);
      this.field_1139.field_1300.remove(this);
      this.field_1143 = true;
   }

   // $FF: renamed from: d (float, float) boolean
   public boolean method_838(float var1, float var2) {
      float var3 = class_296.method_2026(this.field_1140, this.field_1141, var1, var2);
      float var4 = this.field_1142;
      return var3 < var4 * var4;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_839(class_39 var1) {
      float var2 = class_296.method_2026(this.field_1140, this.field_1141, var1.dh, var1.di);
      float var3 = this.field_1142 + var1.field_157;
      return var2 < var3 * var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float) boolean
   public boolean method_840(class_39 var1, float var2) {
      float var3 = class_296.method_2026(this.field_1140, this.field_1141, var1.dh, var1.di);
      float var4 = this.field_1142 + var1.field_157 + var2;
      return var3 < var4 * var4;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) float
   public float method_841(class_39 var1) {
      return class_296.method_2026(this.field_1140, this.field_1141, var1.dh, var1.di);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.a.h) float
   public float method_842(class_106 var1) {
      return class_296.method_2026(this.field_1140, this.field_1141, var1.G, var1.H);
   }

   // $FF: renamed from: e (float, float) float
   public float method_843(float var1, float var2) {
      return class_296.method_2026(this.field_1140, this.field_1141, var1, var2);
   }

   // $FF: renamed from: s () android.graphics.PointF
   public PointF method_844() {
      PointF var1 = new PointF();
      float var2 = (float)(Math.random() * 360.0D);
      float var3 = (float)(Math.random() * (double)this.field_1142);
      var1.method_1960(this.field_1140 + class_296.method_2099(var2) * var3, this.field_1141 + class_296.method_2098(var2) * var3);
      return var1;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.ap) android.graphics.PointF
   public PointF method_845(class_24 var1) {
      class_236 var2 = class_236.method_1549();
      PointF var3 = new PointF();
      float var4 = this.field_1142;
      class_503 var5 = class_503.field_4618;
      if (var1 == class_469.field_4036) {
         var4 = 600.0F;
         var5 = class_503.field_4621;
      }

      for(int var6 = 0; var6 < 6; ++var6) {
         float var7 = (float)(Math.random() * 360.0D);
         float var8 = (float)(Math.random() * (double)var4);
         var3.method_1960(this.field_1140 + class_296.method_2099(var7) * var8, this.field_1141 + class_296.method_2098(var7) * var8);
         var2.field_1932.method_2578(var3.field_2406, var3.field_2407);
         int var9 = var2.field_1932.field_3355;
         int var10 = var2.field_1932.field_3356;
         if (var2.field_1932.method_2584(var9, var10)) {
            int var11 = class_205.method_1370((float)var9, (float)var10, var5);
            if ((var11 > 5 || var11 == 0) && class_47.method_507(var1, var3.field_2406, var3.field_2407)) {
               return var3;
            }
         }

         if (var1 == class_469.field_4036) {
            var4 += 100.0F;
         }
      }

      return null;
   }
}
