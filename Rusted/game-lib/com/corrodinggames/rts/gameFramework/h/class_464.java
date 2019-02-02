package com.corrodinggames.rts.gameFramework.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.BitmapFactory.Options;
import android.graphics.PorterDuff.Mode;
import android.graphics.Region.Op;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.io.InputStream;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.k
public class class_464 implements class_22 {
   // $FF: renamed from: a boolean
   public boolean field_3996 = false;
   // $FF: renamed from: l android.content.Context
   private Context field_3997;
   // $FF: renamed from: m com.corrodinggames.rts.gameFramework.h.h
   private class_23 field_3998;
   // $FF: renamed from: n com.corrodinggames.rts.gameFramework.h.a
   private class_472 field_3999;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.k
   class_236 field_4000;
   // $FF: renamed from: c android.graphics.Rect
   Rect field_4001 = new Rect();
   // $FF: renamed from: d android.graphics.Rect
   Rect field_4002 = new Rect();
   // $FF: renamed from: e android.graphics.RectF
   RectF field_4003 = new RectF();
   // $FF: renamed from: f android.graphics.RectF
   RectF field_4004 = new RectF();
   // $FF: renamed from: g android.graphics.Matrix
   Matrix field_4005 = new Matrix();
   // $FF: renamed from: h android.graphics.RectF
   RectF field_4006 = new RectF();
   // $FF: renamed from: i android.graphics.RectF
   static RectF field_4007 = new RectF();
   // $FF: renamed from: j android.graphics.RectF
   static RectF field_4008 = new RectF();
   // $FF: renamed from: k android.graphics.Rect
   static Rect field_4009 = new Rect();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e) com.corrodinggames.rts.gameFramework.h.l
   public class_22 method_54(class_306 var1) {
      class_464 var2 = new class_464();
      var2.method_56(this.field_3997);
      Canvas var3 = new Canvas();
      var3.method_3082(var1.method_2114());
      var2.field_3998 = new class_474(var3);
      return var2;
   }

   // $FF: renamed from: a () boolean
   public boolean method_55() {
      return this.field_3996;
   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_56(Context var1) {
      this.field_3997 = var1;
      this.field_4000 = class_236.method_1549();
   }

   // $FF: renamed from: b () com.corrodinggames.rts.gameFramework.h.h
   public class_23 method_57() {
      return this.field_3998;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.h) void
   public void method_58(class_23 var1) {
      this.field_3998 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.a) void
   public void method_59(class_472 var1) {
      this.field_3999 = var1;
   }

   // $FF: renamed from: a (int) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_60(int var1) {
      return this.method_61(var1, true);
   }

   // $FF: renamed from: a (int, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_61(int var1, boolean var2) {
      Options var3 = null;
      var3 = new Options();
      if (var2) {
         var3.inPreferredConfig = Bitmap$Config.field_3075;
      } else {
         var3.inPreferredConfig = Bitmap$Config.field_3073;
      }

      var3.inScaled = false;
      Bitmap var4 = BitmapFactory.decodeResource(this.field_3997.method_1854(), var1, var3);
      if (var4 == null) {
         throw new RuntimeException("Could not load image with resId:" + var1);
      } else {
         return this.method_3042(var4);
      }
   }

   // $FF: renamed from: a (java.io.InputStream, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_62(InputStream var1, boolean var2) {
      if (var1 == null) {
         throw new RuntimeException("loadImage: steam is null");
      } else {
         Options var3 = new Options();
         if (var2) {
            var3.inPreferredConfig = Bitmap$Config.field_3075;
         } else {
            var3.inPreferredConfig = Bitmap$Config.field_3073;
         }

         var3.inScaled = false;
         Bitmap var4 = BitmapFactory.decodeStream(var1, (Rect)null, var3);
         if (var4 == null) {
            class_236.method_1595("Could not load image from steam");
            return null;
         } else {
            Log.method_1712("RustedWarfare", "load a:" + var2 + " as " + var4.method_3308());
            return this.method_3042(var4);
         }
      }
   }

   // $FF: renamed from: a (android.graphics.Bitmap) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_3042(Bitmap var1) {
      class_306 var2 = new class_306();
      var2.method_2118(var1);
      if (this.field_3996) {
         var2.method_2112();
      }

      return var2;
   }

   // $FF: renamed from: a (int, int, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_63(int var1, int var2, boolean var3) {
      return this.method_64(var1, var2, var3);
   }

   // $FF: renamed from: b (int, int, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_64(int var1, int var2, boolean var3) {
      Bitmap$Config var4;
      if (var3) {
         var4 = Bitmap$Config.field_3075;
      } else {
         var4 = Bitmap$Config.field_3073;
      }

      Bitmap var5 = Bitmap.method_3301(var1, var2, var4);
      if (var5 == null) {
         throw new OutOfMemoryError("createBitmap returned null, possible out of memory");
      } else {
         return this.method_3042(var5);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, float, float, float, android.graphics.Paint) void
   public void method_65(class_306 var1, float var2, float var3, float var4, Paint var5) {
      this.field_3998.method_120();
      this.field_3998.method_119(var4 + 90.0F, var2, var3);
      this.method_71(var1, var2 - var1.field_2535, var3 - var1.field_2536, var5);
      this.field_3998.method_118();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.Rect, float, float, float, android.graphics.Paint) void
   public void method_66(class_306 var1, Rect var2, float var3, float var4, float var5, Paint var6) {
      this.field_3998.method_120();
      int var7 = var2.method_1904() >> 1;
      int var8 = var2.method_1905() >> 1;
      this.field_4004.method_1969(var3 - (float)var7, var4 - (float)var8, var3 + (float)var7, var4 + (float)var8);
      this.field_3998.method_119(var5 + 90.0F, var3, var4);
      this.method_68(var1, var2, this.field_4004, var6);
      this.field_3998.method_118();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.Rect, android.graphics.Rect, android.graphics.Paint) void
   public void method_67(class_306 var1, Rect var2, Rect var3, Paint var4) {
      this.field_4006.method_1971(var3);
      this.method_68(var1, var2, this.field_4006, var4);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.Rect, android.graphics.RectF, android.graphics.Paint) void
   public void method_68(class_306 var1, Rect var2, RectF var3, Paint var4) {
      if (this.field_3996) {
         if (!this.field_3999.field_4103) {
            return;
         }

         if (var1.field_2527 == null) {
            this.field_3999.method_3068(var1);
         }

         if (var1.field_2527 != null) {
            class_473 var5 = this.field_3999.method_3064();
            var5.field_4122 = class_471.field_4098;
            var5.field_4123 = var1;
            var5.field_4126.method_1912(var2);
            var5.field_4127.method_1970(var3);
            return;
         }
      } else {
         Bitmap var6 = var1.method_2114();
         if (var6 != null) {
            this.field_3998.method_109(var6, var2, var3, var4);
            return;
         }
      }

      throw new RuntimeException("bitmap was not drawn");
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, float, float, android.graphics.Paint) void
   public void method_69(class_306 var1, float var2, float var3, Paint var4) {
      this.method_71(var1, var2 - var1.field_2535, var3 - var1.field_2536, var4);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, float, float, android.graphics.Paint, float, float) void
   public void method_70(class_306 var1, float var2, float var3, Paint var4, float var5, float var6) {
      this.field_4005.method_1787();
      this.field_4005.method_1790(var6, var6);
      if (var5 != 0.0F) {
         this.field_4005.method_1788(var5 + 90.0F, var1.field_2535, var1.field_2536);
      }

      this.field_4005.method_1789(var2, var3);
      this.field_3998.method_108(var1.method_2114(), this.field_4005, var4);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.h.e, float, float, android.graphics.Paint) void
   public void method_71(class_306 var1, float var2, float var3, Paint var4) {
      if (this.field_3996) {
         if (!this.field_3999.field_4103) {
            return;
         }

         this.field_3999.method_3068(var1);
         if (var1.field_2527 != null) {
            class_473 var5 = this.field_3999.method_3064();
            var5.field_4122 = class_471.field_4097;
            var5.field_4123 = var1;
            var5.field_4124 = var2;
            var5.field_4125 = var3;
            return;
         }
      } else {
         Bitmap var6 = var1.method_2114();
         if (var6 != null) {
            this.field_3998.method_107(var6, var2, var3, var4);
            return;
         }
      }

      throw new RuntimeException("bitmap was not drawn");
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.Rect, android.graphics.Paint) void
   public void method_72(class_306 var1, Rect var2, Paint var3) {
      this.method_73(var1, var2, var3, 0, 0, 0, 0);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.Rect, android.graphics.Paint, int, int, int, int) void
   public void method_73(class_306 var1, Rect var2, Paint var3, int var4, int var5, int var6, int var7) {
      if (var4 < 0) {
         var4 = -var4 + var1.method_2128();
      }

      if (var4 != 0) {
         var4 %= var1.method_2128();
      }

      if (var5 < 0) {
         var5 = -var5 + var1.method_2127();
      }

      if (var5 != 0) {
         var5 %= var1.method_2127();
      }

      int var8 = var2.field_2352 - var4;
      int var9 = var2.field_2353 - var5;
      int var10 = var1.method_2128();

      for(int var11 = var1.method_2127(); var8 < var2.field_2354; var9 = var2.field_2353 - var5) {
         while(var9 < var2.field_2355) {
            int var12 = var2.field_2354 - var8;
            if (var12 > var10) {
               var12 = var10;
            }

            int var13 = var2.field_2355 - var9;
            if (var13 > var11) {
               var13 = var11;
            }

            if (var13 > 0 && var12 > 0) {
               this.field_4001.method_1911(0, 0, var12, var13);
               this.field_4002.method_1911(var8, var9, var8 + var12, var9 + var13);
               this.method_67(var1, this.field_4001, this.field_4002, var3);
               var9 += var11 - var7;
            }
         }

         var8 += var10 - var6;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.RectF, android.graphics.Paint, float, float, int, int) void
   public void method_74(class_306 var1, RectF var2, Paint var3, float var4, float var5, int var6, int var7) {
      if (var4 < 0.0F) {
         var4 = -var4 + (float)var1.method_2128();
      }

      if (var4 != 0.0F) {
         var4 %= (float)var1.method_2128();
      }

      if (var5 < 0.0F) {
         var5 = -var5 + (float)var1.method_2127();
      }

      if (var5 != 0.0F) {
         var5 %= (float)var1.method_2127();
      }

      float var8 = var2.field_2416 - var4;
      float var9 = var2.field_2417 - var5;
      int var10 = var1.method_2128();

      for(int var11 = var1.method_2127(); var8 < var2.field_2418; var9 = var2.field_2417 - var5) {
         while(var9 < var2.field_2419) {
            float var12 = var2.field_2418 - var8;
            if (var12 > (float)var10) {
               var12 = (float)var10;
            }

            float var13 = var2.field_2419 - var9;
            if (var13 > (float)var11) {
               var13 = (float)var11;
            }

            if (var13 > 0.0F && var12 > 0.0F) {
               this.field_4001.method_1911(0, 0, (int)var12, (int)var13);
               this.field_4003.method_1969(var8, var9, var8 + var12, var9 + var13);
               this.method_68(var1, this.field_4001, this.field_4003, var3);
               var9 += (float)(var11 - var7);
            }
         }

         var8 += (float)(var10 - var6);
      }

   }

   // $FF: renamed from: b (int) void
   public void method_75(int var1) {
      if (!this.field_3996) {
         this.field_3998.method_112(var1);
      }

   }

   // $FF: renamed from: a (int, android.graphics.PorterDuff.Mode) void
   public void method_76(int var1, Mode var2) {
      if (!this.field_3996) {
         this.field_3998.method_111(var1, var2);
      }

   }

   // $FF: renamed from: a (java.lang.String, float, float, android.graphics.Paint, android.graphics.Paint, float) void
   public void method_77(String var1, float var2, float var3, Paint var4, Paint var5, float var6) {
      float var7 = var4.method_2807(var1);
      field_4008.method_1969(var2, var3, var2 + var7, var3 + (float)this.method_101(var1, var4));
      field_4007.method_1970(field_4008);
      if (var4.method_2800() == Paint$Align.field_2227) {
         field_4007.method_1972(-(var7 / 2.0F), 0.0F);
      }

      class_296.method_2052(field_4007, var6);
      this.field_4000.field_1935.method_57().method_116(field_4007, var5);
      this.method_78(var1, field_4008.field_2416 + var6 / 2.0F, field_4008.field_2419 - var6 / 2.0F, var4);
   }

   // $FF: renamed from: a (java.lang.String, float, float, android.graphics.Paint) void
   public void method_78(String var1, float var2, float var3, Paint var4) {
      if (!this.field_3996) {
         this.field_3998.method_117(var1, var2, var3, var4);
      }

   }

   // $FF: renamed from: a (android.graphics.Rect, android.graphics.Paint) void
   public void method_79(Rect var1, Paint var2) {
      if (!this.field_3996) {
         this.field_3998.method_115(var1, var2);
      }

   }

   // $FF: renamed from: a (android.graphics.RectF, android.graphics.Paint) void
   public void method_80(RectF var1, Paint var2) {
      if (!this.field_3996) {
         this.field_3998.method_116(var1, var2);
      }

   }

   // $FF: renamed from: c () void
   public void method_81() {
      if (this.field_3996) {
         this.field_3999.method_3067();
      }

   }

   // $FF: renamed from: b (android.graphics.Rect, android.graphics.Paint) void
   public void method_82(Rect var1, Paint var2) {
      this.field_4002.method_1911(var1.field_2352, var1.field_2353, var1.field_2352 + var1.field_2354, var1.field_2353 + var1.field_2355);
      this.method_57().method_115(this.field_4002, var2);
   }

   // $FF: renamed from: a (android.graphics.Rect) void
   public void method_83(Rect var1) {
      this.method_57().method_105(var1, Op.REPLACE);
   }

   // $FF: renamed from: a (android.graphics.RectF) void
   public void method_84(RectF var1) {
      this.method_57().method_106(var1, Op.REPLACE);
   }

   // $FF: renamed from: a (float, float, float, android.graphics.Paint) void
   public void method_85(float var1, float var2, float var3, Paint var4) {
      this.method_57().method_110(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (float[], int, int, android.graphics.Paint) void
   public void method_86(float[] var1, int var2, int var3, Paint var4) {
      this.method_57().method_114(var1, var2, var3, var4);
   }

   // $FF: renamed from: d () void
   public void method_87() {
      this.method_57().method_120();
   }

   // $FF: renamed from: e () void
   public void method_88() {
      this.method_57().method_118();
   }

   // $FF: renamed from: f () void
   public void method_89() {
      this.method_57().method_120();
   }

   // $FF: renamed from: g () void
   public void method_90() {
      this.method_57().method_118();
   }

   // $FF: renamed from: a (float, float, float) void
   public void method_91(float var1, float var2, float var3) {
      this.method_57().method_119(var1, var2, var3);
   }

   // $FF: renamed from: a (float, float) void
   public void method_92(float var1, float var2) {
      this.method_57().method_121(var1, var2);
   }

   // $FF: renamed from: a (float, float, float, float) void
   public void method_93(float var1, float var2, float var3, float var4) {
      this.method_57().method_122(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (float, float) void
   public void method_94(float var1, float var2) {
      this.method_57().method_124(var1, var2);
   }

   // $FF: renamed from: a (float, float, float, float, android.graphics.Paint) void
   public void method_96(float var1, float var2, float var3, float var4, Paint var5) {
      this.method_57().method_113(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.i) void
   public void method_95(class_27 var1) {
      this.method_57().method_125(var1);
   }

   // $FF: renamed from: h () void
   public void method_97() {
   }

   // $FF: renamed from: a (android.graphics.Paint) void
   public void method_98(Paint var1) {
   }

   // $FF: renamed from: i () void
   public void method_99() {
   }

   // $FF: renamed from: j () void
   public void method_100() {
   }

   // $FF: renamed from: a (java.lang.String, android.graphics.Paint) int
   public int method_101(String var1, Paint var2) {
      return (int)var2.method_2803();
   }

   // $FF: renamed from: b (java.lang.String, android.graphics.Paint) int
   public int method_102(String var1, Paint var2) {
      var2.method_2815(var1, 0, var1.length(), field_4009);
      return field_4009.method_1904();
   }
}
