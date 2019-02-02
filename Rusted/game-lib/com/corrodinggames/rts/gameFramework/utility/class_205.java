package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.b.class_73;
import com.corrodinggames.rts.game.units.f.class_67;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.g.class_238;
import com.corrodinggames.rts.gameFramework.g.class_240;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.w
public final class class_205 {
   // $FF: renamed from: a android.graphics.Paint
   static Paint field_1687 = new Paint();
   // $FF: renamed from: b android.graphics.RectF
   static RectF field_1688 = new RectF();
   // $FF: renamed from: c java.util.ArrayList
   static ArrayList field_1689 = new ArrayList();
   // $FF: renamed from: d android.graphics.Rect
   static Rect field_1690;
   // $FF: renamed from: e android.graphics.RectF
   static RectF field_1691;
   // $FF: renamed from: f android.graphics.Paint
   static Paint field_1692;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.utility.x[]
   static class_206[] field_1693;
   // $FF: renamed from: h boolean
   static boolean field_1694;

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float) void
   public static strictfp void method_1355(class_39 var0, float var1) {
      method_1357(var0, var1, false, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, boolean) void
   public static strictfp void method_1356(class_39 var0, float var1, boolean var2) {
      method_1357(var0, var1, var2, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, boolean, boolean) void
   public static strictfp void method_1357(class_39 var0, float var1, boolean var2, boolean var3) {
      class_236 var4 = class_236.method_1549();
      if (var0.field_177 && var4.field_1939.method_734() == 1 || var2) {
         float var5 = var0.dh - var4.field_1965;
         float var6 = var0.di - var4.field_1966;
         Paint var7 = class_39.field_196;
         if (var3) {
            var7 = class_39.field_197;
         }

         var4.field_1935.method_85(var5, var6, var1, var7);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, int, int, boolean) void
   public static strictfp void method_1358(class_39 var0, float var1, int var2, int var3, boolean var4) {
      class_236 var5 = class_236.method_1549();
      if (var0.field_177 && var5.field_1939.method_734() < 10 || var4) {
         float var6 = var0.dh - var5.field_1965;
         float var7 = var0.di - var5.field_1966;
         Paint var8 = class_39.field_200;
         var8.method_2788(var2);
         var8.method_2793((float)var3);
         var5.field_1935.method_85(var6, var7, var1, var8);
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, float, boolean) void
   public static strictfp void method_1359(class_39 var0, float var1, boolean var2) {
      method_1360(var0, var1, var2, class_39.field_198);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, boolean, android.graphics.Paint) void
   public static strictfp void method_1360(class_39 var0, float var1, boolean var2, Paint var3) {
      class_236 var4 = class_236.method_1549();
      if (var0.field_177 && var4.field_1939.method_734() == 1 || var2) {
         float var5 = var0.dh - var4.field_1965;
         float var6 = var0.di - var4.field_1966;
         var4.field_1935.method_85(var5, var6, var1, var3);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, float, float, float, float, float, android.graphics.Paint, int, int, int) void
   public static strictfp void method_1361(class_306 var0, float var1, float var2, float var3, float var4, float var5, Paint var6, int var7, int var8, int var9) {
      class_236 var10 = class_236.method_1549();
      byte var11 = 0;
      byte var12 = 0;
      int var13 = var11 + var9 * var7;
      field_1690.method_1911(var13, var12, var13 + var7, var12 + var8);
      field_1691.method_1969(var1 - (float)var7 * var5 / 2.0F, var2 - (float)var8 * var5 / 2.0F - var3, var1 + (float)var7 * var5 / 2.0F, var2 + (float)var8 * var5 / 2.0F - var3);
      var10.field_1935.method_89();
      var10.field_1935.method_91(var4 + 90.0F, field_1691.method_1966(), field_1691.method_1967());
      if (var5 != 1.0F) {
         var10.field_1935.method_93(var5, var5, field_1691.method_1966(), field_1691.method_1967());
      }

      var10.field_1935.method_68(var0, field_1690, field_1691, var6);
      var10.field_1935.method_90();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public static strictfp boolean method_1362(class_39 var0, boolean var1) {
      if (var0.method_278()) {
         return false;
      } else if (var1 && (var0 instanceof class_73 || var0 instanceof class_67)) {
         return false;
      } else if (var0.method_212()) {
         return false;
      } else if (var1 && (var0.method_285() || var0.method_281())) {
         return false;
      } else if (var0.method_286()) {
         return false;
      } else {
         return var0.field_182 == null;
      }
   }

   // $FF: renamed from: a () android.graphics.Paint
   public static strictfp Paint method_1363() {
      class_441 var0 = new class_441();
      class_236 var1 = class_236.method_1549();
      if (var1.field_1937.renderAntiAlias) {
         var0.method_2781(true);
         var0.method_2784(true);
         var0.method_2782(true);
      }

      return var0;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   public static strictfp void method_1364(class_44 var0) {
      if (!var0.bi) {
         int var1 = var0.method_317();

         for(int var2 = 0; var2 < var1; ++var2) {
            method_1366(var0, var2);
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, com.corrodinggames.rts.gameFramework.h.e, float, int) void
   public static strictfp void method_1365(class_44 var0, class_306 var1, float var2, int var3) {
      if (!var0.bi && var2 != 0.0F) {
         class_236 var4 = class_236.method_1549();
         PointF var5 = var0.method_478(var3);
         var4.field_1935.method_89();
         var4.field_1935.method_94(var5.field_2406 - var4.field_1965, var5.field_2407 - var0.dj - var4.field_1966);
         var4.field_1935.method_92(var2, var2);
         var4.field_1935.method_69(var1, 0.0F, 0.0F, (Paint)null);
         var4.field_1935.method_90();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, int) void
   public static strictfp void method_1366(class_44 var0, int var1) {
      class_306 var2 = var0.method_348(var1);
      if (var2 != null) {
         float var3 = var0.method_424(var1);
         Paint var4 = var0.method_423();
         class_236 var5 = class_236.method_1549();
         PointF var6 = var0.method_479(var1);
         float var7 = var6.field_2406 - class_236.method_1549().field_1965;
         float var8 = var6.field_2407 - class_236.method_1549().field_1966 - var0.dj;
         if (var3 != 1.0F) {
            var5.field_1935.method_89();
            var5.field_1935.method_93(var3, var3, var7, var8);
         }

         var5.field_1935.method_65(var2, var7, var8, var0.bV[var1].field_4608, var4);
         if (var3 != 1.0F) {
            var5.field_1935.method_90();
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, float) boolean
   public static strictfp boolean method_1367(class_39 var0, float var1, float var2) {
      return !method_1368(var1, var2, var0.method_279());
   }

   // $FF: renamed from: a (float, float, com.corrodinggames.rts.game.units.ac) boolean
   public static strictfp boolean method_1368(float var0, float var1, class_503 var2) {
      class_238 var3 = class_236.method_1549().field_1941;
      class_408 var4 = class_236.method_1549().field_1932;
      var4.method_2578(var0, var1);
      int var5 = var4.field_3355;
      int var6 = var4.field_3356;
      return var3.method_1682(var2, var5, var6);
   }

   // $FF: renamed from: b (float, float, com.corrodinggames.rts.game.units.ac) short
   public static strictfp short method_1369(float var0, float var1, class_503 var2) {
      class_238 var3 = class_236.method_1549().field_1941;
      class_408 var4 = class_236.method_1549().field_1932;
      class_240 var5 = var3.method_1681(var2);
      if (var5.field_2133 == null) {
         return -3;
      } else {
         var4.method_2578(var0, var1);
         int var6 = var4.field_3355;
         int var7 = var4.field_3356;
         if (!var4.method_2584(var6, var7)) {
            return -2;
         } else {
            short var8 = var5.field_2133[var6][var7];
            return var8;
         }
      }
   }

   // $FF: renamed from: c (float, float, com.corrodinggames.rts.game.units.ac) int
   public static strictfp int method_1370(float var0, float var1, class_503 var2) {
      short var3 = method_1369(var0, var1, var2);
      if (var3 != -3 && var3 != -2 && var3 != -1 && var3 != 0) {
         class_238 var4 = class_236.method_1549().field_1941;
         class_240 var5 = var4.method_1681(var2);
         Integer var6 = (Integer)var5.field_2134.get(var3);
         if (var6 == null) {
            class_236.method_1588("Could not find groupSize for:" + var3 + " at X:" + var0 + " y:" + var1);
            return 0;
         } else {
            return var6;
         }
      } else {
         return 0;
      }
   }

   // $FF: renamed from: a (float, float) boolean
   public static strictfp boolean method_1371(float var0, float var1) {
      class_236 var2 = class_236.method_1549();
      class_408 var3 = var2.field_1932;
      if (var3 == null) {
         class_236.method_1591("isOverClift called without map loaded");
         return false;
      } else {
         int var4 = (int)(var0 * var3.field_3334);
         int var5 = (int)(var1 * var3.field_3335);
         return var2.field_1941.method_1686(var4, var5);
      }
   }

   // $FF: renamed from: b (float, float) boolean
   public static strictfp boolean method_1372(float var0, float var1) {
      class_236 var2 = class_236.method_1549();
      class_408 var3 = var2.field_1932;
      if (var3 == null) {
         class_236.method_1591("isOverWater called without map loaded");
         return false;
      } else {
         class_416 var4 = var3.method_2585(var0, var1);
         return var4 == null ? false : var4.field_3425;
      }
   }

   // $FF: renamed from: c (float, float) boolean
   public static strictfp boolean method_1373(float var0, float var1) {
      class_236 var2 = class_236.method_1549();
      class_408 var3 = var2.field_1932;
      if (var3 == null) {
         class_236.method_1591("isOverLiquid called without map loaded");
         return false;
      } else {
         class_416 var4 = var3.method_2585(var0, var1);
         if (var4 == null) {
            return false;
         } else {
            return var4.field_3425 || var4.field_3426;
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, com.corrodinggames.rts.game.units.aa) boolean
   public static final strictfp boolean method_1374(class_39 var0, class_39 var1) {
      return var0.method_295() == var1.method_295();
   }

   // $FF: renamed from: a (int, int, int, int, android.graphics.Paint$Style) android.graphics.Paint
   public static final strictfp Paint method_1375(int var0, int var1, int var2, int var3, Paint$Style var4) {
      return method_1376(class_296.method_2083(var0, var1, var2, var3), var4);
   }

   // $FF: renamed from: a (int, android.graphics.Paint$Style) android.graphics.Paint
   public static final strictfp Paint method_1376(int var0, Paint$Style var1) {
      for(int var2 = 0; var2 < field_1693.length; ++var2) {
         class_206 var3;
         if (field_1693[var2] == null) {
            var3 = new class_206(var0, var1);
            field_1693[var2] = var3;
            return var3.field_1697;
         }

         var3 = field_1693[var2];
         if (var3.field_1695 == var0 && var3.field_1696 == var1) {
            return var3.field_1697;
         }
      }

      if (!field_1694) {
         field_1694 = true;
         class_236.method_1588("----- getCachingPaint --- Paint fallback was needed!!");
      }

      field_1692.method_2788(var0);
      field_1692.method_2786(var1);
      return field_1692;
   }

   // $FF: renamed from: a (float) void
   public static strictfp void method_1377(float var0) {
      if (field_1689.size() != 0) {
         class_236 var1 = class_236.method_1549();
         Iterator var2 = field_1689.iterator();

         while(var2.hasNext()) {
            class_209 var3 = (class_209)var2.next();
            var3.field_1713 -= var0;
            if (var3.field_1713 <= 0.0F) {
               var2.remove();
            }

            if (var3.field_1712) {
               var1.field_1935.method_96(var3.field_1711.field_2416, var3.field_1711.field_2417, var3.field_1711.field_2418, var3.field_1711.field_2419, var3.field_1710);
            } else {
               var1.field_1935.method_80(var3.field_1711, var3.field_1710);
            }
         }

         field_1689.clear();
      }
   }

   // $FF: renamed from: a (int, int) boolean
   public static final strictfp boolean method_1378(int var0, int var1) {
      class_236 var2 = class_236.method_1549();
      if (var0 + var1 < var2.field_1921) {
         return true;
      } else {
         return var2.field_1921 < var0 - 1000;
      }
   }

   static {
      field_1687.method_2791(205, 255, 0, 0);
      field_1687.method_2786(Paint$Style.field_4586);
      field_1690 = new Rect();
      field_1691 = new RectF();
      field_1692 = new Paint();
      field_1693 = new class_206[20];
      field_1694 = false;
   }
}
