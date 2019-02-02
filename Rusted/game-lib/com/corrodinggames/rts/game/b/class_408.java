package com.corrodinggames.rts.game.b;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_36;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_42;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.class_402;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.i.class_33;
import com.corrodinggames.rts.gameFramework.utility.class_196;
import com.corrodinggames.rts.gameFramework.utility.class_199;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// $FF: renamed from: com.corrodinggames.rts.game.b.b
public final class class_408 {
   // $FF: renamed from: a boolean
   static final boolean field_3320 = false;
   // $FF: renamed from: b boolean
   static final boolean field_3321 = false;
   // $FF: renamed from: c boolean
   static final boolean field_3322 = false;
   // $FF: renamed from: d android.graphics.Paint
   static Paint field_3323 = new Paint();
   // $FF: renamed from: e android.graphics.Paint
   static Paint field_3324 = new Paint();
   // $FF: renamed from: f android.graphics.Paint
   static Paint field_3325 = new Paint();
   // $FF: renamed from: g android.graphics.Paint
   static Paint field_3326 = new Paint();
   // $FF: renamed from: h boolean[]
   boolean[] field_3327 = new boolean[256];
   // $FF: renamed from: i int
   public static int field_3328 = 20;
   // $FF: renamed from: j int
   public static int field_3329 = 20;
   // $FF: renamed from: k int
   public int field_3330 = 20;
   // $FF: renamed from: l int
   public int field_3331 = 20;
   // $FF: renamed from: m int
   public int field_3332;
   // $FF: renamed from: n int
   public int field_3333;
   // $FF: renamed from: o float
   public float field_3334;
   // $FF: renamed from: p float
   public float field_3335;
   // $FF: renamed from: q java.util.ArrayList
   public ArrayList field_3336 = new ArrayList();
   // $FF: renamed from: r com.corrodinggames.rts.game.b.e
   public class_425 field_3337 = null;
   // $FF: renamed from: s com.corrodinggames.rts.game.b.e
   public class_425 field_3338 = null;
   // $FF: renamed from: t com.corrodinggames.rts.game.b.e
   public class_425 field_3339 = null;
   // $FF: renamed from: u java.util.ArrayList
   public ArrayList field_3340 = new ArrayList();
   // $FF: renamed from: v java.util.ArrayList
   public ArrayList field_3341 = new ArrayList();
   // $FF: renamed from: w int
   public int field_3342;
   // $FF: renamed from: x int
   public int field_3343;
   // $FF: renamed from: y boolean
   public boolean field_3344 = true;
   // $FF: renamed from: z boolean
   public boolean field_3345 = false;
   // $FF: renamed from: A boolean
   public boolean field_3346 = false;
   // $FF: renamed from: B boolean
   public static boolean field_3347 = true;
   // $FF: renamed from: C boolean
   public static boolean field_3348 = false;
   // $FF: renamed from: D com.corrodinggames.rts.gameFramework.h.e[]
   public static class_306[] field_3349;
   // $FF: renamed from: E byte[][]
   public byte[][] field_3350;
   // $FF: renamed from: F byte[][]
   public byte[][] field_3351;
   // $FF: renamed from: G android.graphics.Rect
   Rect field_3352 = new Rect();
   // $FF: renamed from: H java.util.ArrayList
   protected ArrayList field_3353 = new ArrayList();
   // $FF: renamed from: I com.corrodinggames.rts.game.b.h
   public class_415 field_3354;
   // $FF: renamed from: J int
   public int field_3355;
   // $FF: renamed from: K int
   public int field_3356;
   // $FF: renamed from: L android.graphics.PointF
   public PointF field_3357 = new PointF();
   // $FF: renamed from: M boolean
   public boolean field_3358;
   // $FF: renamed from: N boolean
   public boolean field_3359;
   // $FF: renamed from: O int
   public int field_3360;
   // $FF: renamed from: P int
   public int field_3361;
   // $FF: renamed from: Q float
   float field_3362 = 0.0F;
   // $FF: renamed from: R android.graphics.Paint
   Paint field_3363;
   // $FF: renamed from: S android.graphics.Paint
   Paint field_3364;
   // $FF: renamed from: T android.graphics.Paint
   Paint field_3365;
   // $FF: renamed from: U android.graphics.Paint
   Paint field_3366;
   // $FF: renamed from: V android.graphics.Paint
   Paint field_3367;
   // $FF: renamed from: W android.graphics.Paint
   Paint field_3368;
   // $FF: renamed from: X android.graphics.Rect
   Rect field_3369 = new Rect();
   // $FF: renamed from: Y android.graphics.Rect
   Rect field_3370 = new Rect();
   // $FF: renamed from: Z java.util.ArrayList
   ArrayList field_3371 = new ArrayList();
   // $FF: renamed from: aa float
   float field_3372;
   // $FF: renamed from: ab float
   float field_3373 = 1.0F;
   // $FF: renamed from: ac com.corrodinggames.rts.game.b.c
   public static class_423 field_3374 = new class_423();
   // $FF: renamed from: ad android.graphics.Paint
   Paint field_3375 = new Paint();
   // $FF: renamed from: ae android.graphics.Rect
   Rect field_3376 = new Rect();
   // $FF: renamed from: af android.graphics.Rect
   Rect field_3377 = new Rect();
   // $FF: renamed from: ag long
   long field_3378;
   // $FF: renamed from: ah float
   float field_3379;
   // $FF: renamed from: ai float
   float field_3380;

   // $FF: renamed from: a () void
   public static strictfp void method_2571() {
      class_236 var0 = class_236.method_1549();
      field_3323.method_2791(150, 255, 255, 255);
      field_3323.method_2786(Paint$Style.field_4586);
      field_3323.method_2793(1.0F);
      var0.method_1603(field_3323, 16.0F);
      field_3324.method_2791(150, 255, 0, 0);
      field_3324.method_2786(Paint$Style.field_4586);
      field_3324.method_2793(1.0F);
      field_3325.method_2791(150, 0, 255, 0);
      field_3325.method_2786(Paint$Style.field_4586);
      field_3325.method_2793(1.0F);
      field_3326.method_2791(150, 255, 0, 0);
      if (field_3347) {
         long var1 = class_402.method_2522();
         class_306 var3 = var0.field_1935.method_60(R$drawable.fog_smooth);
         byte var4 = 20;
         byte var5 = 20;
         byte var6 = 1;
         field_3349 = new class_306[256];
         class_306 var7 = var0.field_1935.method_64(var4 + var6, var5 + var6, true);
         class_22 var8 = var0.field_1935.method_54(var7);
         byte var9 = 1;
         byte var10 = 2;
         byte var11 = 4;
         byte var12 = 8;
         byte var13 = 16;
         byte var14 = 32;
         byte var15 = 64;
         byte var16 = -128;
         method_2575(method_2572(var9), 2, 5, true, var7, var8, var3);
         method_2575(method_2572(var10), 0, 5, true, var7, var8, var3);
         method_2575(method_2572(var11), 0, 3, true, var7, var8, var3);
         method_2575(method_2572(var12), 2, 3, true, var7, var8, var3);
         method_2575(method_2573(var13, var9, var10), 1, 0, true, var7, var8, var3);
         method_2575(method_2573(var14, var10, var11), 2, 1, true, var7, var8, var3);
         method_2575(method_2573(var15, var12, var11), 1, 2, true, var7, var8, var3);
         method_2575(method_2573(var16, var9, var12), 0, 1, true, var7, var8, var3);
         method_2575(method_2573(var13 + var14, var10, var9, var11), 2, 0, true, var7, var8, var3);
         method_2575(method_2573(var14 + var15, var11, var12, var10), 2, 2, true, var7, var8, var3);
         method_2575(method_2573(var15 + var16, var12, var11, var9), 0, 2, true, var7, var8, var3);
         method_2575(method_2573(var16 + var13, var9, var12, var10), 0, 0, true, var7, var8, var3);
         method_2576(method_2572(var9 + var10), method_2574(2, 5, 0, 5), true, var7, var8, var3);
         method_2576(method_2572(var10 + var11), method_2574(0, 5, 0, 3), true, var7, var8, var3);
         method_2576(method_2572(var11 + var12), method_2574(0, 3, 2, 3), true, var7, var8, var3);
         method_2576(method_2572(var12 + var9), method_2574(2, 3, 2, 5), true, var7, var8, var3);
         method_2576(method_2573(var13 + var14 + var15, var9, var10, var11, var12), method_2574(2, 0, 2, 2), true, var7, var8, var3);
         method_2576(method_2573(var14 + var15 + var16, var9, var10, var11, var12), method_2574(2, 2, 0, 2), true, var7, var8, var3);
         method_2576(method_2573(var15 + var16 + var13, var9, var10, var11, var12), method_2574(0, 2, 0, 0), true, var7, var8, var3);
         method_2576(method_2573(var16 + var13 + var14, var9, var10, var11, var12), method_2574(0, 0, 2, 0), true, var7, var8, var3);
         method_2576(method_2572(var13 + var15), method_2574(1, 0, 1, 2), true, var7, var8, var3);
         method_2576(method_2572(var16 + var14), method_2574(0, 1, 2, 1), true, var7, var8, var3);
         method_2576(method_2572(var9 + var11), method_2574(2, 5, 0, 3), true, var7, var8, var3);
         method_2576(method_2572(var10 + var12), method_2574(0, 5, 2, 3), true, var7, var8, var3);
         method_2576(method_2573(var13 + var11, var10, var9), method_2574(1, 0, 0, 3), true, var7, var8, var3);
         method_2576(method_2573(var15 + var10, var11, var12), method_2574(1, 2, 0, 5), true, var7, var8, var3);
         method_2576(method_2573(var16 + var10, var9, var12), method_2574(0, 1, 2, 5), true, var7, var8, var3);
         method_2576(method_2573(var14 + var9, var10, var11), method_2574(2, 1, 0, 5), true, var7, var8, var3);
         method_2576(method_2573(var13 + var12, var10, var9), method_2574(1, 0, 2, 3), true, var7, var8, var3);
         method_2576(method_2573(var15 + var9, var11, var12), method_2574(1, 2, 2, 5), true, var7, var8, var3);
         method_2576(method_2573(var16 + var11, var9, var12), method_2574(0, 1, 2, 3), true, var7, var8, var3);
         method_2576(method_2573(var14 + var12, var10, var11), method_2574(2, 1, 0, 3), true, var7, var8, var3);
         method_2576(method_2573(var13 + var11 + var12, var10, var9), method_2574(1, 0, 0, 3, 2, 3), true, var7, var8, var3);
         method_2576(method_2573(var15 + var10 + var9, var11, var12), method_2574(1, 2, 0, 5, 2, 5), true, var7, var8, var3);
         method_2576(method_2573(var16 + var10 + var11, var9, var12), method_2574(0, 1, 2, 5, 2, 3), true, var7, var8, var3);
         method_2576(method_2573(var14 + var9 + var12, var10, var11), method_2574(2, 1, 0, 5, 0, 3), true, var7, var8, var3);
         method_2576(method_2572(-1), method_2574(1, 4), true, var7, var8, var3);
         int var17 = 0;

         for(int var18 = 0; var18 < field_3349.length; ++var18) {
            if (field_3349[var18] != null) {
               ++var17;
            }
         }

         class_236.method_1591("smoothFogImages filled:" + var17);
         class_402.method_2525("smoothFog load took:", var1);
         var8.method_100();
         var8 = null;
      }

      field_3348 = class_236.method_1654();
   }

   // $FF: renamed from: b (int) int[]
   private static strictfp int[] method_2572(int var0) {
      return new int[]{var0};
   }

   // $FF: renamed from: a (int, int[]) int[]
   private static strictfp int[] method_2573(int var0, int... var1) {
      ArrayList var2 = new ArrayList();
      var2.add(var0);
      if (var1.length == 1) {
         var2.add(var0 + var1[0]);
      } else if (var1.length == 2) {
         var2.add(var0 + var1[0]);
         var2.add(var0 + var1[1]);
         var2.add(var0 + var1[0] + var1[1]);
      } else if (var1.length == 3) {
         var2.add(var0 + var1[0]);
         var2.add(var0 + var1[1]);
         var2.add(var0 + var1[2]);
         var2.add(var0 + var1[0] + var1[1]);
         var2.add(var0 + var1[0] + var1[2]);
         var2.add(var0 + var1[1] + var1[2]);
         var2.add(var0 + var1[0] + var1[1] + var1[2]);
      } else {
         if (var1.length != 4) {
            throw new RuntimeException("unhandled:" + var1.length);
         }

         var2.add(var0 + var1[0]);
         var2.add(var0 + var1[1]);
         var2.add(var0 + var1[2]);
         var2.add(var0 + var1[3]);
         var2.add(var0 + var1[0] + var1[1] + var1[2] + var1[3]);
         var2.add(var0 + var1[0] + var1[1] + var1[2]);
         var2.add(var0 + var1[0] + var1[1] + var1[3]);
         var2.add(var0 + var1[1] + var1[2] + var1[3]);
         var2.add(var0 + var1[0] + var1[1]);
         var2.add(var0 + var1[0] + var1[2]);
         var2.add(var0 + var1[0] + var1[3]);
         var2.add(var0 + var1[1] + var1[2]);
         var2.add(var0 + var1[1] + var1[3]);
         var2.add(var0 + var1[2] + var1[3]);
      }

      int[] var3 = new int[var2.size()];

      for(int var4 = 0; var4 < var2.size(); ++var4) {
         if (var2.get(var4) != null) {
            var3[var4] = (Integer)var2.get(var4);
         }
      }

      return var3;
   }

   // $FF: renamed from: a (int[]) int[]
   private static strictfp int[] method_2574(int... var0) {
      return var0;
   }

   // $FF: renamed from: a (int[], int, int, boolean, com.corrodinggames.rts.gameFramework.h.e, com.corrodinggames.rts.gameFramework.h.l, com.corrodinggames.rts.gameFramework.h.e) void
   private static strictfp void method_2575(int[] var0, int var1, int var2, boolean var3, class_306 var4, class_22 var5, class_306 var6) {
      method_2576(var0, method_2574(var1, var2), var3, var4, var5, var6);
   }

   // $FF: renamed from: a (int[], int[], boolean, com.corrodinggames.rts.gameFramework.h.e, com.corrodinggames.rts.gameFramework.h.l, com.corrodinggames.rts.gameFramework.h.e) void
   private static strictfp void method_2576(int[] var0, int[] var1, boolean var2, class_306 var3, class_22 var4, class_306 var5) {
      class_236 var6 = class_236.method_1549();
      if (var2) {
         var4.method_97();
      }

      Rect var7 = new Rect();
      Rect var8 = new Rect();
      Rect var9 = new Rect();
      Rect var10 = new Rect();
      byte var11 = 20;
      byte var12 = 20;
      var7.method_1911(0, 0, var11, var12);
      class_306 var13 = var3.method_2121();
      if (class_236.field_1900) {
         var13.method_2124();
      }

      var13.method_2131();
      class_22 var14 = var6.field_1935.method_54(var13);
      var14.method_97();

      int var15;
      int var16;
      for(var15 = 0; var15 < var1.length; var15 += 2) {
         var16 = var1[var15 + 0] * 20;
         int var17 = var1[var15 + 1] * 20;
         var8.method_1911(var16, var17, var16 + var11, var17 + var12);
         var14.method_67(var5, var8, var7, (Paint)null);
         var10.method_1911(var8.field_2354 - 1, var8.field_2353, var8.field_2354, var8.field_2355);
         var9.method_1911(var7.field_2354, var7.field_2353, var7.field_2354 + 1, var7.field_2355);
         var14.method_67(var5, var10, var9, (Paint)null);
         var10.method_1911(var8.field_2352, var8.field_2355 - 1, var8.field_2354, var8.field_2355);
         var9.method_1911(var7.field_2352, var7.field_2355, var7.field_2354, var7.field_2355 + 1);
         var14.method_67(var5, var10, var9, (Paint)null);
      }

      var14.method_99();
      var14.method_100();
      var14 = null;

      for(var15 = 0; var15 < var0.length; ++var15) {
         var16 = var0[var15] + 128;
         if (field_3349[var16] != null) {
            class_236.method_1591("smoothfog: warning replacing:" + var16);
         }

         field_3349[var16] = var13;
      }

   }

   // $FF: renamed from: a (float, float, com.corrodinggames.rts.game.k) boolean
   public strictfp boolean method_2577(float var1, float var2, class_107 var3) {
      if (this.field_3344) {
         int var4 = (int)(var1 * this.field_3334);
         int var5 = (int)(var2 * this.field_3335);
         if (var3.field_1242 != null && this.method_2584(var4, var5) && var3.field_1242[var4][var5] >= 5) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: a (float, float) void
   public strictfp void method_2578(float var1, float var2) {
      this.field_3355 = (int)(var1 * this.field_3334);
      this.field_3356 = (int)(var2 * this.field_3335);
   }

   // $FF: renamed from: a (int, int) void
   public strictfp void method_2579(int var1, int var2) {
      this.field_3355 = var1 * this.field_3330;
      this.field_3356 = var2 * this.field_3331;
   }

   // $FF: renamed from: a (android.graphics.Point) android.graphics.PointF
   public strictfp PointF method_2580(Point var1) {
      this.field_3357.method_1960((float)(var1.field_4722 * this.field_3330), (float)(var1.field_4723 * this.field_3331));
      return this.field_3357;
   }

   // $FF: renamed from: b (float, float) void
   public strictfp void method_2581(float var1, float var2) {
      this.method_2578(var1, var2);
      this.method_2579(this.field_3355, this.field_3356);
   }

   // $FF: renamed from: a (float) float
   public strictfp float method_2582(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var1 > this.method_2612()) {
         var1 = this.method_2612();
      }

      return var1;
   }

   // $FF: renamed from: b (float) float
   public strictfp float method_2583(float var1) {
      if (var1 < 0.0F) {
         var1 = 0.0F;
      }

      if (var1 > this.method_2613()) {
         var1 = this.method_2613();
      }

      return var1;
   }

   // $FF: renamed from: b (int, int) boolean
   public final strictfp boolean method_2584(int var1, int var2) {
      return var1 >= 0 && var1 < this.field_3342 && var2 >= 0 && var2 < this.field_3343;
   }

   // $FF: renamed from: c (float, float) com.corrodinggames.rts.game.b.g
   public strictfp class_416 method_2585(float var1, float var2) {
      int var3 = (int)(var1 * this.field_3334);
      int var4 = (int)(var2 * this.field_3335);
      if (var3 >= 0 && var3 < this.field_3342 && var4 >= 0 && var4 < this.field_3343) {
         class_416[][] var5 = this.field_3337.field_3566;
         return var5[var3][var4];
      } else {
         return null;
      }
   }

   // $FF: renamed from: c (int, int) com.corrodinggames.rts.game.b.g
   public strictfp class_416 method_2586(int var1, int var2) {
      if (!this.method_2584(var1, var2)) {
         return null;
      } else {
         class_416[][] var3 = this.field_3337.method_2699();
         return var3[var1][var2];
      }
   }

   // $FF: renamed from: d (int, int) com.corrodinggames.rts.game.b.g
   public strictfp class_416 method_2587(int var1, int var2) {
      if (!this.method_2584(var1, var2)) {
         return null;
      } else if (this.field_3339 == null) {
         return null;
      } else {
         class_416[][] var3 = this.field_3339.method_2699();
         return var3[var1][var2];
      }
   }

   // $FF: renamed from: a (android.graphics.RectF) void
   strictfp void method_2588(RectF var1) {
      if (class_236.method_1550()) {
         var1.field_2416 *= (float)(this.field_3330 / 20);
         var1.field_2418 *= (float)(this.field_3330 / 20);
         var1.field_2417 *= (float)(this.field_3331 / 20);
         var1.field_2419 *= (float)(this.field_3331 / 20);
      }

   }

   public strictfp class_408() {
      if (class_236.method_1550()) {
         this.field_3330 = 60;
         this.field_3331 = 60;
      }

      this.field_3332 = this.field_3330 / 2;
      this.field_3333 = this.field_3331 / 2;
      this.field_3334 = 1.0F / (float)this.field_3330;
      this.field_3335 = 1.0F / (float)this.field_3331;
      this.field_3363 = new class_441();
      this.field_3363.method_2791(100, 255, 0, 0);
      this.field_3363.method_2804(16.0F);
      this.field_3364 = new class_441();
      this.field_3364.method_2786(Paint$Style.field_4586);
      this.field_3364.method_2793(1.0F);
      this.field_3364.method_2791(255, 0, 225, 0);
      this.field_3365 = new class_441();
      this.field_3365.method_2786(Paint$Style.field_4586);
      this.field_3365.method_2793(1.0F);
      this.field_3365.method_2791(100, 0, 185, 0);
      this.field_3366 = new class_441();
      this.field_3366.method_2786(Paint$Style.field_4586);
      this.field_3366.method_2793(1.0F);
      this.field_3366.method_2791(255, 175, 0, 0);
      this.field_3367 = new class_441();
      this.field_3367.method_2791(155, 175, 0, 0);
      this.field_3368 = new class_441();
      this.field_3368.method_2797(new PorterDuffXfermode(Mode.CLEAR));
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.f.af) void
   public static strictfp void method_2589(String var0, class_404 var1) {
      try {
         InputStream var2 = method_2591(var0);
         if (var2 == null) {
            throw new RuntimeException("writeMapStream: Could not find map:" + var0);
         } else {
            var1.method_2558(var2, (int)method_2590(var0));
         }
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   // $FF: renamed from: a (java.lang.String) long
   public static strictfp long method_2590(String var0) {
      String var1 = "" + var0;
      String var2 = class_236.method_1637(var1);
      if (class_236.method_1635(var1)) {
         AssetManager var6 = class_236.method_1549().field_1880.method_1853();

         try {
            AssetFileDescriptor var4 = var6.method_3281(var2);
            return var4.getLength();
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }
      } else {
         File var3 = new File(var2);
         return var3.length();
      }
   }

   // $FF: renamed from: b (java.lang.String) java.io.InputStream
   public static strictfp InputStream method_2591(String var0) {
      InputStream var1 = method_2592(var0);
      if (var1 == null) {
         InputStream var2 = method_2592(var0.replace(".tmx", "") + "_moved");
         if (var2 != null) {
            String var3 = class_296.method_2018(var2);
            var3 = var3.trim();
            class_236.method_1591("Found moved map at:" + var3);
            var1 = method_2592(var3);
         }
      }

      return var1;
   }

   // $FF: renamed from: c (java.lang.String) java.io.InputStream
   public static strictfp InputStream method_2592(String var0) {
      String var1 = "" + var0;
      String var3 = class_236.method_1637(var1);
      Object var2;
      if (class_236.method_1635(var1)) {
         AssetManager var4 = class_236.method_1549().field_1880.method_1853();

         try {
            var2 = var4.method_3279(var3);
         } catch (IOException var7) {
            return null;
         }
      } else {
         File var8 = new File(var3);

         try {
            var2 = new FileInputStream(var8);
         } catch (FileNotFoundException var6) {
            return null;
         }
      }

      return (InputStream)var2;
   }

   // $FF: renamed from: a (org.w3c.dom.Document, java.io.OutputStream) void
   public strictfp void method_2593(Document var1, OutputStream var2) {
      TransformerFactory var3 = TransformerFactory.newInstance();
      Transformer var4 = var3.newTransformer();
      var4.setOutputProperty("indent", "yes");
      DOMSource var5 = new DOMSource(var1);
      StreamResult var6 = new StreamResult(var2);
      var4.transform(var5, var6);
   }

   // $FF: renamed from: a (java.io.InputStream, java.io.OutputStream) void
   public strictfp void method_2594(InputStream var1, OutputStream var2) {
      DocumentBuilderFactory var3 = DocumentBuilderFactory.newInstance();
      var3.setValidating(false);
      DocumentBuilder var4 = var3.newDocumentBuilder();
      var4.setEntityResolver(new b$1(this));
      Document var5 = var4.parse(var1);
      Element var6 = var5.getDocumentElement();
      String var7 = var6.getAttribute("orientation");
      if (!var7.equals("orthogonal")) {
         throw new class_424("Only orthogonal maps are supported, found: " + var7);
      } else {
         NodeList var8 = var6.getElementsByTagName("SOMETHING");

         for(int var9 = 0; var9 < var8.getLength(); ++var9) {
            Element var10 = (Element)var8.item(var9);
         }

         NodeList var21 = var6.getElementsByTagName("layer");

         Element var11;
         for(int var22 = 0; var22 < var21.getLength(); ++var22) {
            var11 = (Element)var21.item(var22);
            String var12 = var11.getAttribute("name");
            if ("units".equalsIgnoreCase(var12)) {
               var11.getParentNode().removeChild(var11);
            }
         }

         NodeList var23 = var6.getElementsByTagName("objectgroup");

         for(int var24 = 0; var24 < var23.getLength(); ++var24) {
            Element var25 = (Element)var23.item(var24);
            String var13 = var25.getAttribute("name");
            if ("UnitObjects".equalsIgnoreCase(var13)) {
               var25.getParentNode().removeChild(var25);
            }
         }

         var11 = var5.createElement("objectgroup");
         var11.setAttribute("name", "UnitObjects");
         class_199 var26 = class_34.method_189();
         Iterator var27 = var26.iterator();

         while(var27.hasNext()) {
            class_34 var14 = (class_34)var27.next();
            if (var14 instanceof class_39 && !(var14 instanceof class_42)) {
               class_39 var15 = (class_39)var14;
               if (!var15.field_141 && !var15.method_318()) {
                  Element var16 = var5.createElement("object");
                  int var17 = 20;
                  if ((float)var17 < var15.field_157) {
                     var17 = (int)var15.field_157;
                  }

                  var16.setAttribute("x", "" + var15.dh);
                  var16.setAttribute("y", "" + var15.di);
                  var16.setAttribute("width", "" + var17);
                  var16.setAttribute("height", "" + var17);
                  var16.setAttribute("rotation", "" + (var15.field_154 + 90.0F));
                  Integer var18 = this.method_2609(var15.method_295());
                  if (var18 != null) {
                     var16.setAttribute("gid", "" + var18);
                  }

                  Element var19 = var5.createElement("properties");
                  Element var20 = var5.createElement("property");
                  var20.setAttribute("name", "unit");
                  var20.setAttribute("value", var15.method_295().method_141());
                  var19.appendChild(var20);
                  var20 = var5.createElement("property");
                  var20.setAttribute("name", "team");
                  var20.setAttribute("value", "" + var15.field_143.field_1227);
                  var19.appendChild(var20);
                  var16.appendChild(var19);
                  var11.appendChild(var16);
               }
            }
         }

         var6.appendChild(var11);
         this.method_2593(var5, var2);
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public strictfp void method_2595(String var1, String var2) {
      class_236.method_1591(" --- Saving map:" + var1 + " to: " + var2);
      InputStream var3 = method_2591(var1);
      if (var3 == null) {
         throw new IOException("Could not find orginal map: " + var1);
      } else {
         BufferedInputStream var4 = new BufferedInputStream(var3);
         var2 = class_236.method_1637(var2);

         FileOutputStream var5;
         try {
            var5 = new FileOutputStream(var2);
         } catch (FileNotFoundException var12) {
            throw new IOException("Failed to open save target:" + var2);
         }

         try {
            this.method_2594(var4, var5);
         } catch (ParserConfigurationException var8) {
            throw new IOException(var8);
         } catch (SAXException var9) {
            throw new IOException(var9);
         } catch (IOException var10) {
            throw new IOException(var10);
         } catch (TransformerException var11) {
            throw new IOException(var11);
         }

         try {
            var5.close();
            var4.close();
            var3.close();
         } catch (IOException var7) {
            var7.printStackTrace();
         }

      }
   }

   // $FF: renamed from: d (java.lang.String) void
   public strictfp void method_2596(String var1) {
      class_236.method_1591(" --- Loading map:" + var1 + " ---");
      InputStream var2 = method_2591(var1);
      if (var2 == null) {
         throw new RuntimeException("Could not find map: " + var1);
      } else {
         BufferedInputStream var3 = new BufferedInputStream(var2);
         this.method_2597(var3);

         try {
            var3.close();
            var2.close();
         } catch (IOException var5) {
            var5.printStackTrace();
         }

      }
   }

   // $FF: renamed from: a (java.io.InputStream) void
   public strictfp void method_2597(InputStream var1) {
      this.field_3341.clear();

      String var6;
      try {
         DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
         var2.setValidating(false);
         DocumentBuilder var3 = var2.newDocumentBuilder();
         var3.setEntityResolver(new b$2(this));
         Document var4 = var3.parse(var1);
         Element var5 = var4.getDocumentElement();
         var6 = var5.getAttribute("orientation");
         if (!var6.equals("orthogonal")) {
            throw new class_424("Only orthogonal maps are supported, found: " + var6);
         }

         int var8 = Integer.parseInt(var5.getAttribute("width"));
         int var9 = Integer.parseInt(var5.getAttribute("height"));
         this.field_3342 = var8;
         this.field_3343 = var9;
         this.field_3380 = 150.0F;
         int var10;
         class_107 var11;
         int var12;
         if (!this.field_3344) {
            for(var10 = 0; var10 < 10; ++var10) {
               var11 = class_107.method_954(var10);
               if (var11 != null) {
                  var11.field_1242 = (byte[][])null;
               }
            }
         } else {
            for(var10 = 0; var10 < 10; ++var10) {
               var11 = class_107.method_954(var10);
               if (var11 != null) {
                  var11.field_1240 = this.field_3342;
                  var11.field_1241 = this.field_3343;
                  var11.field_1242 = new byte[this.field_3342][this.field_3343];
                  var11.field_1243 = new boolean[this.field_3342][this.field_3343];

                  for(var12 = 0; var12 < this.field_3342; ++var12) {
                     for(int var13 = 0; var13 < this.field_3343; ++var13) {
                        var11.field_1242[var12][var13] = 10;
                     }
                  }
               }
            }
         }

         Element var26 = (Element)var5.getElementsByTagName("properties").item(0);
         if (var26 != null) {
            NodeList var27 = var26.getElementsByTagName("property");
            if (var27 != null) {
               Properties var7 = new Properties();

               for(var12 = 0; var12 < var27.getLength(); ++var12) {
                  Element var30 = (Element)var27.item(var12);
                  String var14 = var30.getAttribute("name");
                  String var15 = var30.getAttribute("value");
                  var7.setProperty(var14, var15);
               }
            }
         }

         class_420 var28 = null;
         NodeList var29 = var5.getElementsByTagName("tileset");

         for(short var31 = 0; var31 < var29.getLength(); ++var31) {
            Element var32 = (Element)var29.item(var31);
            class_420 var35 = new class_420(this, var32);
            var35.field_3502 = var31;
            if (var28 != null) {
               var28.method_2673(var35.field_3500 - 1);
            }

            var28 = var35;
            this.field_3336.add(var35);
         }

         NodeList var33 = var5.getElementsByTagName("layer");

         for(int var34 = 0; var34 < var33.getLength(); ++var34) {
            Element var37 = (Element)var33.item(var34);
            String var16 = var37.getAttribute("name");
            if (!"set".equalsIgnoreCase(var16)) {
               class_425 var17 = new class_425(this, var37);
               var17.field_3559 = var34;
               this.field_3340.add(var17);
            }
         }

         Iterator var36 = this.field_3340.iterator();

         label213:
         while(true) {
            class_425 var39;
            do {
               if (!var36.hasNext()) {
                  if (this.field_3337 == null) {
                     throw new class_424("'Ground' layer was not found in map, this layer is required");
                  }

                  int var41;
                  if (!class_236.method_1550() && !class_236.method_1551()) {
                     class_416[][] var38 = this.field_3337.method_2699();

                     for(var41 = 0; var41 < this.field_3342; ++var41) {
                        for(int var42 = 0; var42 < this.field_3343; ++var42) {
                           if (var38[var41][var42] == null) {
                              throw new class_424("An empty tile on the Ground layer, all tiles must be filled");
                           }
                        }
                     }
                  }

                  if (this.field_3339 == null) {
                     throw new class_424("'Items' layer was not found in map, this layer is required");
                  }

                  NodeList var40 = var5.getElementsByTagName("objectgroup");

                  for(var41 = 0; var41 < var40.getLength(); ++var41) {
                     Element var43 = (Element)var40.item(var41);
                     class_415 var44 = new class_415(var43, this);
                     var44.field_3417 = var41;
                     this.field_3353.add(var44);
                  }

                  class_420.method_2667();
                  Iterator var46 = this.field_3336.iterator();

                  while(var46.hasNext()) {
                     class_420 var45 = (class_420)var46.next();
                     if (var45.field_3504) {
                        var45.method_2669();
                     }
                  }

                  class_420.method_2668();
                  this.field_3354 = this.method_2611("triggers");
                  break label213;
               }

               var39 = (class_425)var36.next();
               if (var39.field_3560.equalsIgnoreCase("Ground")) {
                  this.field_3337 = var39;
                  this.field_3337.field_3567 = true;
               }

               if (var39.field_3560.equalsIgnoreCase("GroundDetails")) {
                  this.field_3338 = var39;
               }
            } while(!var39.field_3560.equalsIgnoreCase("Items") && !var39.field_3560.equalsIgnoreCase("Objects"));

            this.field_3339 = var39;
         }
      } catch (IOException var18) {
         throw new class_424("Failed to parse map", var18);
      } catch (ParserConfigurationException var19) {
         throw new RuntimeException("Failed to parse map", var19);
      } catch (SAXException var20) {
         throw new RuntimeException("Failed to parse map", var20);
      }

      class_410 var21 = null;
      if (this.field_3354 != null) {
         var21 = this.field_3354.method_2636("map_info");
      }

      boolean var22 = false;
      boolean var23 = false;
      class_236 var24 = class_236.method_1549();
      var24.field_1951 = null;
      if (var21 != null) {
         var6 = var21.field_3400.getProperty("type");
         if (var6 != null) {
            if (!var6.equalsIgnoreCase("mission") && !var6.equalsIgnoreCase("survival") && !var6.equalsIgnoreCase("challenge") && !var6.equalsIgnoreCase("skirmish")) {
               class_236.method_1588("Unknown map type:" + var6);
            } else {
               var24.field_1951 = new class_33();
               var24.field_1951.method_159();
            }
         } else {
            class_236.method_1588("Map type not found on mapInfo");
         }

         String var25 = var21.field_3400.getProperty("fog");
         if (var25 != null) {
            if (!var25.equalsIgnoreCase("none")) {
               var22 = true;
               if (var25.equalsIgnoreCase("los")) {
                  var23 = true;
               } else if (!var25.equalsIgnoreCase("map")) {
                  class_236.method_1591("Unknown map fog type: " + var25);
               }
            }
         } else if (class_236.method_1654()) {
            var22 = true;
            if (var6 != null && var6.equalsIgnoreCase("skirmish")) {
               var23 = true;
            }
         }
      } else {
         class_236.method_1588("Map has no mapInfo data");
      }

      if (!var22) {
         this.field_3344 = false;
      }

      if (var22 && var23) {
         this.field_3345 = true;
      }

      this.field_3358 = true;
   }

   // $FF: renamed from: b () void
   public strictfp void method_2598() {
      for(int var1 = 0; var1 < field_3374.field_3533; ++var1) {
         for(int var2 = 0; var2 < field_3374.field_3533; ++var2) {
            this.method_2600(var1, var2);
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.i) void
   public strictfp void method_2599(class_36 var1) {
      if (!class_236.field_1899 || class_236.field_1900) {
         field_3374.method_2689(var1);
      }
   }

   // $FF: renamed from: e (int, int) void
   public strictfp void method_2600(int var1, int var2) {
      field_3374.method_2691(var1, var2);
   }

   // $FF: renamed from: a (int, int, int, int, int, int, com.corrodinggames.rts.gameFramework.h.l, boolean, int) void
   public strictfp void method_2601(int var1, int var2, int var3, int var4, int var5, int var6, class_22 var7, boolean var8, int var9) {
      class_236 var10 = class_236.method_1549();
      class_408 var11 = var10.field_1932;
      class_24 var12 = var10.field_1939.field_984.method_1055();
      class_503 var13 = var12.method_137();

      for(int var14 = var1; var14 <= var3; ++var14) {
         for(int var15 = var2; var15 <= var4; ++var15) {
            boolean var16 = class_47.method_511(var12, var13, var14, var15, var9);
            int var17 = var14 * var11.field_3330 - var5;
            int var18 = var15 * var11.field_3331 - var6;
            this.field_3376.method_1911(var17, var18, var17 + var11.field_3330 - 1, var18 + var11.field_3331 - 1);
            if (var8) {
               if (var16) {
                  var7.method_79(this.field_3376, var11.field_3365);
               } else {
                  var7.method_79(this.field_3376, var11.field_3367);
                  var7.method_79(this.field_3376, var11.field_3366);
               }
            } else if (var16) {
               var7.method_79(this.field_3376, var11.field_3364);
            } else {
               var7.method_79(this.field_3376, var11.field_3366);
            }
         }
      }

   }

   // $FF: renamed from: c () void
   public strictfp void method_2602() {
      field_3374.method_2695();
   }

   // $FF: renamed from: c (float) void
   public strictfp void method_2603(float var1) {
      field_3374.method_2698(var1);
   }

   // $FF: renamed from: d () void
   public strictfp void method_2604() {
      field_3374.method_2687();
   }

   // $FF: renamed from: d (float) void
   public strictfp void method_2605(float var1) {
      this.method_2603(var1);
      if (this.field_3359) {
         new Rect();
         Rect var3 = new Rect();
         int var4 = this.field_3360 * this.field_3330;
         int var5 = this.field_3361 * this.field_3331;
         var3.method_1911(var4, var5, var4 + this.field_3330, var5 + this.field_3331);
         var3.method_1913(-class_236.method_1549().field_1963, -class_236.method_1549().field_1964);
      }

   }

   // $FF: renamed from: e (float) void
   public strictfp void method_2606(float var1) {
      class_236 var2 = class_236.method_1549();
      this.method_2622(var1);
   }

   // $FF: renamed from: e () void
   public strictfp void method_2607() {
      Iterator var1 = this.field_3336.iterator();

      while(var1.hasNext()) {
         class_420 var2 = (class_420)var1.next();
         var2.method_2675();
      }

      this.field_3336.clear();
      var1 = this.field_3340.iterator();

      while(var1.hasNext()) {
         class_425 var3 = (class_425)var1.next();
         var3.method_2702();
      }

      this.field_3340.clear();
      this.field_3353.clear();
      this.field_3354 = null;
      field_3374.method_2687();
   }

   // $FF: renamed from: a (int) com.corrodinggames.rts.game.b.i
   public strictfp class_420 method_2608(int var1) {
      for(int var2 = 0; var2 < this.field_3336.size(); ++var2) {
         class_420 var3 = (class_420)this.field_3336.get(var2);
         if (var3.method_2674(var1)) {
            return var3;
         }
      }

      return null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) java.lang.Integer
   public strictfp Integer method_2609(class_24 var1) {
      String var2 = var1.method_141();
      Integer var3 = this.method_2610("unit", var2);
      if (var3 == null) {
         var3 = this.method_2610("customUnit", var2);
      }

      return var3;
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) java.lang.Integer
   public strictfp Integer method_2610(String var1, String var2) {
      for(int var3 = 0; var3 < this.field_3336.size(); ++var3) {
         class_420 var4 = (class_420)this.field_3336.get(var3);
         Integer var5 = var4.method_2676(var1, var2);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   // $FF: renamed from: e (java.lang.String) com.corrodinggames.rts.game.b.h
   public strictfp class_415 method_2611(String var1) {
      Iterator var2 = this.field_3353.iterator();

      class_415 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_415)var2.next();
      } while(!var1.equalsIgnoreCase(var3.field_3418));

      return var3;
   }

   // $FF: renamed from: f () float
   public strictfp float method_2612() {
      return (float)(this.field_3337.field_3563 * this.field_3330);
   }

   // $FF: renamed from: g () float
   public strictfp float method_2613() {
      return (float)(this.field_3337.field_3564 * this.field_3331);
   }

   // $FF: renamed from: a (float, float, int, com.corrodinggames.rts.game.k, boolean) void
   public strictfp void method_2614(float var1, float var2, int var3, class_107 var4, boolean var5) {
      class_236 var6 = class_236.method_1549();
      if (this.field_3344) {
         long var7 = 0L;
         if (field_3320) {
            var7 = class_402.method_2522();
         }

         boolean var9 = true;
         if (!var6.method_1656() && var6.field_1951 != null && !var6.field_1951.method_157() && !var6.field_1951.method_158()) {
            var9 = false;
         }

         if (!var9) {
            this.method_2621(var1, var2, var3, var4, var5);
         } else {
            for(int var10 = 0; var10 < 10; ++var10) {
               class_107 var11 = class_107.method_954(var10);
               if (var11 != null && (var11 == var4 || !var11.field_1234 && var11.method_944(var4))) {
                  this.method_2621(var1, var2, var3, var11, var5);
               }
            }
         }

         if (field_3320) {
            this.field_3378 += class_402.method_2522() - var7;
         }
      }

   }

   // $FF: renamed from: a (int, int, byte[][], byte) byte
   public strictfp byte method_2615(int var1, int var2, byte[][] var3, byte var4) {
      byte var5 = 0;
      if (var1 >= 1) {
         if (var3[var1 - 1][var2] >= var4) {
            var5 = (byte)(var5 - 128);
         }

         if (var2 >= 1 && var3[var1 - 1][var2 - 1] >= var4) {
            ++var5;
         }

         if (var2 < this.field_3343 - 1 && var3[var1 - 1][var2 + 1] >= var4) {
            var5 = (byte)(var5 + 8);
         }
      }

      if (var2 >= 1) {
         if (var3[var1][var2 - 1] >= var4) {
            var5 = (byte)(var5 + 16);
         }

         if (var1 < this.field_3342 - 1 && var3[var1 + 1][var2 - 1] >= var4) {
            var5 = (byte)(var5 + 2);
         }
      }

      if (var1 < this.field_3342 - 1 && var3[var1 + 1][var2] >= var4) {
         var5 = (byte)(var5 + 32);
      }

      if (var2 < this.field_3343 - 1) {
         if (var3[var1][var2 + 1] >= var4) {
            var5 = (byte)(var5 + 64);
         }

         if (var1 < this.field_3342 - 1 && var3[var1 + 1][var2 + 1] >= var4) {
            var5 = (byte)(var5 + 4);
         }
      }

      if (var5 == 127) {
         var5 = -1;
      }

      return var5;
   }

   // $FF: renamed from: h () void
   public strictfp void method_2616() {
      if (field_3347) {
         this.method_2620();

         for(int var1 = 0; var1 < this.field_3342; ++var1) {
            for(int var2 = 0; var2 < this.field_3343; ++var2) {
               this.field_3350[var1][var2] = 0;
               this.field_3351[var1][var2] = 0;
            }
         }
      }

   }

   // $FF: renamed from: f (int, int) void
   public strictfp void method_2617(int var1, int var2) {
      this.field_3350[var1][var2] = 0;
      this.field_3351[var1][var2] = 0;
   }

   // $FF: renamed from: g (int, int) void
   public strictfp void method_2618(int var1, int var2) {
      int var3 = var1 - 1;
      int var4 = var2 - 1;
      if (var3 < 0) {
         var3 = 0;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1 + 1;
      int var6 = var2 + 1;
      if (var5 > this.field_3342 - 1) {
         var5 = this.field_3342 - 1;
      }

      if (var6 > this.field_3343 - 1) {
         var6 = this.field_3343 - 1;
      }

      for(int var7 = var3; var7 <= var5; ++var7) {
         for(int var8 = var4; var8 <= var6; ++var8) {
            if (this.field_3350[var7][var8] != 0) {
               this.field_3350[var7][var8] = 127;
            }

            if (this.field_3351[var7][var8] != 0) {
               this.field_3351[var7][var8] = 127;
            }
         }
      }

   }

   // $FF: renamed from: h (int, int) void
   public strictfp void method_2619(int var1, int var2) {
      int var3 = var1 - 1;
      int var4 = var2 - 1;
      if (var3 < 0) {
         var3 = 0;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      int var5 = var1 + 1;
      int var6 = var2 + 1;
      if (var5 > this.field_3342 - 1) {
         var5 = this.field_3342 - 1;
      }

      if (var6 > this.field_3343 - 1) {
         var6 = this.field_3343 - 1;
      }

      for(int var7 = var3; var7 <= var5; ++var7) {
         for(int var8 = var4; var8 <= var6; ++var8) {
            this.field_3351[var7][var8] = 127;
         }
      }

   }

   // $FF: renamed from: i () void
   public strictfp void method_2620() {
      boolean var1 = false;
      if (this.field_3350 == null) {
         var1 = true;
      } else if (this.field_3350.length != this.field_3342 || this.field_3350[0].length != this.field_3343) {
         class_236.method_1591("smoothFog_cache: Size mismatch");
         var1 = true;
      }

      if (var1) {
         class_236.method_1591("Building smoothFog_cache");
         this.field_3350 = new byte[this.field_3342][this.field_3343];
         this.field_3351 = new byte[this.field_3342][this.field_3343];

         for(int var2 = 0; var2 < this.field_3342; ++var2) {
            for(int var3 = 0; var3 < this.field_3343; ++var3) {
               this.field_3350[var2][var3] = 127;
               this.field_3351[var2][var3] = 127;
            }
         }
      }

   }

   // $FF: renamed from: b (float, float, int, com.corrodinggames.rts.game.k, boolean) void
   public strictfp void method_2621(float var1, float var2, int var3, class_107 var4, boolean var5) {
      class_236 var6 = class_236.method_1549();
      if (this.field_3344 && var4.field_1242 != null) {
         if (field_3347) {
            this.method_2620();
         }

         float var8 = (float)((var3 - 5) * (var3 - 5));
         float var9 = (float)((var3 - 3) * (var3 - 3));
         float var10 = (float)(var3 * var3);
         this.method_2578(var1, var2);
         int var12 = this.field_3355;
         int var13 = this.field_3356;
         float var14 = var1 * this.field_3334;
         float var15 = var2 * this.field_3335;
         byte[][] var16 = var4.field_1242;
         int var17 = var12 - var3;
         int var18 = var13 - var3;
         if (var17 < 0) {
            var17 = 0;
         }

         if (var18 < 0) {
            var18 = 0;
         }

         int var19 = var12 + var3;
         int var20 = var13 + var3;
         if (var19 > this.field_3342 - 1) {
            var19 = this.field_3342 - 1;
         }

         if (var20 > this.field_3343 - 1) {
            var20 = this.field_3343 - 1;
         }

         for(int var21 = var17; var21 <= var19; ++var21) {
            for(int var22 = var18; var22 <= var20; ++var22) {
               byte var23 = var16[var21][var22];
               if (var23 != 0) {
                  float var24 = class_296.method_2026(var14, var15, (float)var21, (float)var22);
                  if (var24 <= var9) {
                     if (var23 > 0) {
                        var16[var21][var22] = 0;
                        if (var4.method_921()) {
                           field_3374.method_2686(var21, var22, true);
                           var6.field_1943.field_1548 = true;
                           if (field_3347) {
                              if (var24 <= var8 && var5) {
                                 this.method_2617(var21, var22);
                              } else {
                                 this.method_2618(var21, var22);
                              }
                           }
                        }
                     }
                  } else if (var24 <= var10) {
                     byte var25 = (byte)((int)((var24 - var9) / (var10 - var9) * 10.0F));
                     if (var23 > var25) {
                        var16[var21][var22] = var25;
                        if (var4.method_921()) {
                           field_3374.method_2686(var21, var22, true);
                           var6.field_1943.field_1548 = true;
                           if (field_3347) {
                              this.method_2618(var21, var22);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: f (float) void
   public strictfp void method_2622(float var1) {
      class_236 var2 = class_236.method_1549();
      if (field_3320) {
         this.field_3379 += var1;
         if (this.field_3379 > 60.0F) {
            this.field_3379 = 0.0F;
            if (this.field_3378 > 0L) {
               class_236.method_1591("seeThoughFogOfWarTimes: " + class_402.method_2529((double)this.field_3378));
               this.field_3378 = 0L;
            }

            if (this.field_3378 < 0L) {
               class_236.method_1591("seeThoughFogOfWarTimes negative: " + class_402.method_2529((double)this.field_3378));
               this.field_3378 = 0L;
            }
         }
      }

      if (this.field_3344 && this.field_3345) {
         if (field_3347) {
            this.method_2620();
         }

         this.field_3380 += var1;
         if (this.field_3380 > 260.0F) {
            this.field_3380 = 0.0F;
            class_34[] var3 = class_39.dk.method_1339();
            int var4 = class_34.field_79.size();
            boolean var5 = false;

            int var6;
            for(var6 = 0; var6 < 10; ++var6) {
               class_107 var7 = class_107.method_954(var6);
               if (var7 != null && !var7.field_1237) {
                  var5 = true;

                  int var8;
                  for(var8 = 0; var8 < var4; ++var8) {
                     class_34 var9 = var3[var8];
                     if (var9 instanceof class_44) {
                        class_44 var10 = (class_44)var9;
                        if (var10.aZ()) {
                           var10.c(var7);
                        }
                     }
                  }

                  if (var7.field_1242 == null) {
                     class_236.method_1588("fogOfWar_map==null for:" + var6);
                  }

                  for(var8 = 0; var8 < this.field_3342; ++var8) {
                     for(int var13 = 0; var13 < this.field_3343; ++var13) {
                        if (var7.field_1242[var8][var13] < 5) {
                           var7.field_1242[var8][var13] = 5;
                           if (var7.method_921()) {
                              field_3374.method_2686(var8, var13, true);
                              var2.field_1943.field_1548 = true;
                              if (field_3347) {
                                 this.method_2619(var8, var13);
                              }
                           }
                        }
                     }
                  }
               }
            }

            class_34 var11;
            class_44 var12;
            for(var6 = 0; var6 < var4; ++var6) {
               var11 = var3[var6];
               if (var11 instanceof class_44) {
                  var12 = (class_44)var11;
                  if (!var12.bi) {
                     var12.method_491(false);
                  }
               }
            }

            if (var5) {
               for(var6 = 0; var6 < var4; ++var6) {
                  var11 = var3[var6];
                  if (var11 instanceof class_44) {
                     var12 = (class_44)var11;
                     if (var12.aZ()) {
                        var12.bU();
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_2623(class_404 var1) {
      var1.method_2540(false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_2624(class_463 var1) {
      boolean var2 = var1.method_3010();
      if (var2) {
         int var3 = var1.method_3011();
         int var4 = var1.method_3011();

         for(int var5 = 0; var5 < var3; ++var5) {
            for(int var6 = 0; var6 < var4; ++var6) {
               var1.method_3009();
            }
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, int) java.io.InputStream
   private strictfp InputStream method_2625(String var1, String var2, int var3) {
      String[] var4 = var2.split("/");
      if (var4.length >= var3) {
         String var5 = "";
         boolean var6 = true;

         for(int var7 = var4.length - var3; var7 < var4.length; ++var7) {
            if (!var6) {
               var5 = var5 + "/";
            }

            var6 = false;
            var5 = var5 + var4[var7];
         }

         return class_196.method_1313(var1 + var5);
      } else {
         return null;
      }
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String) java.io.InputStream
   public strictfp InputStream method_2626(String var1, String var2) {
      Object var3 = null;
      var3 = class_196.method_1313(var1 + var2);
      if (var3 == null) {
         var3 = this.method_2625(var1, var2, 3);
      }

      if (var3 == null) {
         var3 = this.method_2625(var1, var2, 2);
      }

      if (var3 == null) {
         var3 = this.method_2625(var1, var2, 1);
      }

      if (var3 == null) {
         throw new IOException("File could not be found:" + var1 + var2);
      } else {
         return (InputStream)var3;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, int, int) boolean
   public strictfp boolean method_2627(class_107 var1, int var2, int var3) {
      return this.field_3346 || !this.field_3344 || var1.field_1242 == null || !this.method_2584(var2, var3) || var1.field_1242[var2][var3] != 10;
   }
}
