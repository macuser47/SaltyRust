package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;

// $FF: renamed from: com.corrodinggames.rts.game.i
public class class_36 extends class_34 {
   // $FF: renamed from: a int
   int field_101;
   // $FF: renamed from: b int
   int field_102;
   // $FF: renamed from: c int
   int field_103 = 50;
   // $FF: renamed from: d int
   int field_104 = 40;
   // $FF: renamed from: e int
   int field_105;
   // $FF: renamed from: f int
   int field_106 = -1;
   // $FF: renamed from: g android.graphics.RectF
   static RectF field_107 = new RectF();
   // $FF: renamed from: h android.graphics.Rect
   static Rect field_108 = new Rect();
   // $FF: renamed from: i android.graphics.Paint
   static Paint field_109 = new class_441();
   // $FF: renamed from: j com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_110 = null;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_111 = null;
   // $FF: renamed from: l com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_112 = null;

   // $FF: renamed from: b () void
   public static strictfp void method_198() {
      class_236 var0 = class_236.method_1549();
      field_110 = var0.field_1935.method_61(R$drawable.scorch_mark, true);
      field_111 = var0.field_1935.method_61(R$drawable.scorch_mark_nuke, true);
      field_112 = var0.field_1935.method_61(R$drawable.blood_mark, true);
   }

   public strictfp class_36() {
      class_236 var1 = class_236.method_1549();
      this.I(-1);
      this.field_105 = var1.field_1921;
   }

   // $FF: renamed from: a (float, float) void
   public static strictfp void method_199(float var0, float var1) {
      method_200(var0, var1, class_244.field_2172);
   }

   // $FF: renamed from: a (float, float, com.corrodinggames.rts.game.j) void
   public static strictfp void method_200(float var0, float var1, class_244 var2) {
      if (method_202(var0, var1, var2)) {
         class_36 var3 = new class_36();
         var3.dh = var0;
         var3.di = var1;
         if (var2 == class_244.field_2172) {
            var3.field_101 = 0;
            var3.field_102 = class_296.method_2014(var3, 0, 3, 0);
         } else {
            var3.field_101 = 2;
         }

         var3.method_204();
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, int) void
   public static strictfp void method_201(class_44 var0, int var1) {
      if (!var0.bO()) {
         if (!method_202(var0.dh, var0.di, var1 == 2 ? class_244.field_2173 : class_244.field_2172)) {
            return;
         }

         class_36 var2 = new class_36();
         var2.field_101 = var1;
         var2.dh = var0.dh;
         var2.di = var0.di;
         var2.field_102 = class_296.method_2014(var2, 0, 3, 0);
         var2.method_204();
      }

   }

   // $FF: renamed from: b (float, float, com.corrodinggames.rts.game.j) boolean
   public static strictfp boolean method_202(float var0, float var1, class_244 var2) {
      if (var2 != class_244.field_2172) {
         return true;
      } else {
         int var3 = 0;
         class_34[] var4 = class_34.field_79.method_1339();
         int var5 = class_34.field_79.size();

         for(int var6 = 0; var6 < var5; ++var6) {
            class_34 var7 = var4[var6];
            if (var7 instanceof class_36) {
               class_36 var8 = (class_36)var7;
               if (class_296.method_2042(var8.dh - var0) < 14.0F && class_296.method_2042(var8.di - var1) < 14.0F) {
                  ++var3;
               }
            }
         }

         if (var3 >= 3) {
            return false;
         } else {
            return true;
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k) boolean
   public strictfp boolean method_183(class_236 var1) {
      return false;
   }

   // $FF: renamed from: f (float) boolean
   public strictfp boolean method_182(float var1) {
      return false;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.l, float, float) void
   public strictfp void method_203(class_22 var1, float var2, float var3) {
      int var4 = this.field_102 * this.field_103;
      byte var5 = 0;
      class_306 var6 = null;
      int var7 = this.field_103;
      int var8 = this.field_104;
      if (this.field_101 == 0) {
         var6 = field_110;
      } else if (this.field_101 == 1) {
         var6 = field_112;
      } else if (this.field_101 == 2) {
         var6 = field_111;
         var7 = var6.method_2128();
         var8 = var6.method_2127();
      }

      field_108.method_1911(var4, var5, var4 + var7, var5 + var8);
      float var9 = (float)((int)this.dh);
      float var10 = (float)((int)this.di);
      field_107.method_1969(var9, var10, var9 + (float)var7, var10 + (float)var8);
      field_107.method_1972((float)((int)(-field_107.method_1964() / 2.0F)), (float)((int)(-field_107.method_1965() / 2.0F)));
      field_107.method_1972(-var2, -var3);
      var1.method_68(var6, field_108, field_107, field_109);
   }

   // $FF: renamed from: c () void
   private strictfp void method_204() {
      class_236 var1 = class_236.method_1549();
      var1.field_1932.method_2599(this);
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
   }

   // $FF: renamed from: d (float) void
   public strictfp void method_178(float var1) {
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.dh);
      var1.method_2542(this.di);
      var1.method_2541(this.field_101);
      var1.method_2541(this.field_102);
      var1.method_2541(this.field_103);
      var1.method_2541(this.field_104);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.dh = var1.method_3012();
      this.di = var1.method_3012();
      this.field_101 = var1.method_3011();
      this.field_102 = var1.method_3011();
      this.field_103 = var1.method_3011();
      this.field_104 = var1.method_3011();
      super.method_175(var1);
   }
}
