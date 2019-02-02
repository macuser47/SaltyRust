package com.corrodinggames.rts.game.units.d;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_282;
import com.corrodinggames.rts.game.units.class_39;
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
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.o
public class class_61 extends class_50 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_500 = new class_306[10];
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_501 = null;
   // $FF: renamed from: c int
   int field_502;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_503 = null;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.e[]
   static class_306[] field_504 = new class_306[10];
   // $FF: renamed from: f android.graphics.PointF
   PointF field_505 = new PointF();
   // $FF: renamed from: g android.graphics.Rect
   Rect field_506 = new Rect();
   // $FF: renamed from: h com.corrodinggames.rts.game.units.a.l
   static class_121 field_507 = new o$1(142);
   // $FF: renamed from: i com.corrodinggames.rts.game.units.a.l
   static class_121 field_508 = new o$2(143);
   // $FF: renamed from: j java.util.ArrayList
   static ArrayList field_509 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2541(this.field_502);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_175(class_463 var1) {
      this.field_502 = var1.method_3011();
      super.method_175(var1);
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : field_504[this.bk.method_963()];
   }

   // $FF: renamed from: b () void
   public static void method_569() {
      class_236 var0 = class_236.method_1549();
      field_501 = var0.field_1935.method_60(R$drawable.nuke_launcher_dead);
      class_306 var1 = var0.field_1935.method_60(R$drawable.nuke_launcher);
      field_500 = class_107.method_948(var1);
      var1.method_2129();
      field_503 = var0.field_1935.method_60(R$drawable.unit_icon_building);
      field_504 = class_107.method_948(field_503);
   }

   // $FF: renamed from: aP () int
   public int method_488() {
      return 20;
   }

   // $FF: renamed from: D () boolean
   public boolean method_510() {
      class_236 var1 = class_236.method_1549();
      this.G = field_501;
      this.I(0);
      this.bh = false;
      this.a(class_282.field_2426);
      float var2 = this.dh;
      float var3 = this.di;
      float var4 = 0.0F;
      var1.field_1938.method_2485(class_395.field_3225);
      class_390 var5 = var1.field_1938.method_2474(var2, var3, this.dj, Color.method_3077(255, 255, 255, 255));
      if (var5 != null) {
         var5.field_3145 = 8.0F;
         var5.field_3144 = 5.0F;
         var5.field_3143 = 0.9F;
         var5.field_3160 = 20.0F;
         var5.field_3161 = var5.field_3160;
         var5.field_3135 = true;
      }

      var1.field_1938.method_2485(class_395.field_3225);
      var5 = var1.field_1938.method_2479(var2, var3, var4, -1127220);
      if (var5 != null) {
         var5.field_3145 = 0.2F;
         var5.field_3144 = 2.0F;
         var5.field_3179 = 2;
         var5.field_3160 = 45.0F;
         var5.field_3161 = var5.field_3160;
         var5.field_3159 = 0.0F;
      }

      float var6 = 40.0F;
      float var7 = 120.0F;
      var1.field_1938.method_2461(this.dh, this.di, this.dj, var6, var7);
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_346() {
      return this.bi ? field_501 : field_500[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_347() {
      return null;
   }

   // $FF: renamed from: a (int) void
   public void method_356(int var1) {
   }

   public class_61(boolean var1) {
      super(var1);
      this.G = field_500[field_500.length - 1];
      this.b(this.G);
      this.by = 40.0F;
      this.bz = this.by;
      this.bJ = 1500.0F;
      this.bI = this.bJ;
      this.n.method_1911(-2, -1, 2, 1);
      this.o.method_1911(-2, -1, 2, 2);
   }

   // $FF: renamed from: a (float) void
   public void method_176(float var1) {
      super.method_176(var1);
      if (!this.bj() || this.bi) {
         ;
      }
   }

   // $FF: renamed from: w (int) android.graphics.PointF
   public PointF method_478(int var1) {
      aG.method_1960(this.dh, this.di - 3.0F);
      return aG;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public void method_471(class_39 var1, int var2) {
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
   public class_469 method_570() {
      return class_469.field_4061;
   }

   // $FF: renamed from: l () boolean
   public boolean method_312() {
      return false;
   }

   // $FF: renamed from: g (int) float
   public float method_474(int var1) {
      return 1.0F;
   }

   // $FF: renamed from: bk () float
   public float method_230() {
      return super.method_230();
   }

   // $FF: renamed from: c (float, float) void
   public void method_571(float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      if (this.field_502 > 0) {
         float var4 = class_296.method_2026(this.dh, this.di, var1, var2);
         if (var4 < 202500.0F) {
            if (this.bk == var3.field_1915) {
               var3.field_1939.method_705("Nuke target too close");
            }

         } else {
            --this.field_502;
            byte var5 = 0;
            PointF var6 = this.method_478(var5);
            float var7 = 5.0F;
            class_97 var8 = method_572(this, var6.field_2406, var6.field_2407, var1, var2);
            var8.field_840 = var7;
            class_390 var9 = var3.field_1938.method_2474(var6.field_2406, var6.field_2407, this.dj, -1127220);
            if (var9 != null) {
               var9.field_3159 = var7;
               var9.field_3145 = 2.1F;
               var9.field_3144 = 2.1F;
               var9.field_3179 = 2;
               var9.field_3136 = true;
               var9.field_3137 = 70.0F;
               var9.field_3160 = 370.0F;
               var9.field_3161 = var9.field_3160;
               var9.field_3143 = 1.0F;
            }

            class_390 var10 = var3.field_1938.method_2480(var6.field_2406, var6.field_2407, 0.0F, -1);
            if (var10 != null) {
               var10.field_3145 = 1.0F;
               var10.field_3144 = 3.1F;
               var10.field_3179 = 2;
               var10.field_3160 = 170.0F;
               var10.field_3161 = var10.field_3160;
               var10.field_3159 = var7 + 20.0F;
            }

            float var11 = 0.8F;
            var3.field_1933.method_3324(class_525.field_4771, 0.27F, var11, var6.field_2406, var6.field_2407);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, float, float, float) com.corrodinggames.rts.game.f
   public static class_97 method_572(class_39 var0, float var1, float var2, float var3, float var4) {
      class_97 var5 = class_97.method_697(var0, var1, var2);
      var5.I(10);
      var5.field_867 = 0;
      var5.field_868 = 1;
      var5.field_869 = 1;
      var5.field_850 = 1.0F;
      var5.field_901 = true;
      var5.field_843 = true;
      var5.field_844 = var3;
      var5.field_845 = var4;
      var5.field_839 = 99999.0F;
      var5.field_849 = 0.1F;
      var5.field_847 = 2.7F;
      var5.field_895 = Color.method_3077(255, 225, 225, 225);
      var5.field_874 = 300.0F;
      var5.field_915 = true;
      var5.field_920 = true;
      var5.field_925 = true;
      var5.field_855 = true;
      var5.field_856 = true;
      var5.field_916 = 80.0F;
      var5.field_917 = 100.0F;
      var5.field_919 = 1.1F;
      var5.field_878 = 5400.0F;
      var5.field_879 = 250.0F;
      var5.field_883 = true;
      var5.field_884 = false;
      var5.field_893 = true;
      var5.field_876 = 75.0F;
      var5.field_877 = var5.field_876;
      var5.field_934 = true;
      class_236 var6 = class_236.method_1549();
      var6.field_1938.method_2485(class_395.field_3225);
      class_390 var7 = var6.field_1938.method_2472(var5, -1118720);
      if (var7 != null) {
         var7.field_3160 = 1300.0F;
         var7.field_3161 = var7.field_3160;
         var7.field_3143 = 0.2F;
         var7.field_3145 = 1.0F;
      }

      return var5;
   }

   // $FF: renamed from: cd () void
   public void method_573() {
      ++this.field_502;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i) void
   public void method_10(class_32 var1) {
      if (var1.field_16.equals(field_508.method_1043())) {
         this.method_573();
      }

   }

   // $FF: renamed from: by () java.lang.String
   public String method_269() {
      return class_121.field_1347;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean, android.graphics.PointF, com.corrodinggames.rts.game.units.aa) void
   public void method_263(class_121 var1, boolean var2, PointF var3, class_39 var4) {
      if (!var2) {
         if (var1 == field_507) {
            this.method_571(var3.field_2406, var3.field_2407);
         } else {
            super.a(var1, var2, var3, var4);
         }
      }
   }

   // $FF: renamed from: E () java.util.ArrayList
   public ArrayList method_260() {
      return field_509;
   }

   // $FF: renamed from: e (float) void
   public void method_179(float var1) {
      super.e(var1);
      class_205.method_1359(this, 450.0F, false);
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_570();
   }

   static {
      field_509.add(field_507);
      field_509.add(field_508);
   }
}
