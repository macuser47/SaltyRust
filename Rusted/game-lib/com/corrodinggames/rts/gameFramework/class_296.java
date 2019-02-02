package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Environment;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.R$raw;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.gameFramework.utility.class_196;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f
public final class class_296 {
   // $FF: renamed from: a java.util.Random
   static final Random field_2477 = new Random();
   // $FF: renamed from: b java.util.Random
   static final Random field_2478 = new Random();
   // $FF: renamed from: c android.graphics.PointF
   public static final PointF field_2479 = new PointF();
   // $FF: renamed from: d android.graphics.PointF
   static PointF field_2480 = new PointF();
   // $FF: renamed from: e android.graphics.PointF
   static PointF field_2481 = new PointF();
   // $FF: renamed from: f android.graphics.PointF
   static PointF field_2482 = new PointF();
   // $FF: renamed from: g android.graphics.PointF
   static PointF field_2483 = new PointF();
   // $FF: renamed from: h android.graphics.PointF
   static PointF field_2484 = new PointF();
   // $FF: renamed from: j char[]
   private static final char[] field_2485 = new char[36];
   // $FF: renamed from: k float[]
   private static final float[] field_2486;
   // $FF: renamed from: l float[]
   private static final float[] field_2487;
   // $FF: renamed from: m float[]
   private static final float[] field_2488;
   // $FF: renamed from: n float[]
   private static final float[] field_2489;
   // $FF: renamed from: o float[]
   private static final float[] field_2490;
   // $FF: renamed from: p float[]
   private static final float[] field_2491;
   // $FF: renamed from: q float[]
   private static final float[] field_2492;
   // $FF: renamed from: r float[]
   private static final float[] field_2493;
   // $FF: renamed from: i int
   static int field_2494;
   // $FF: renamed from: s float[]
   private static final float[] field_2495;
   // $FF: renamed from: t float[]
   private static final float[] field_2496;

   // $FF: renamed from: a () void
   public static final strictfp void method_2012() {
      field_2478.setSeed(0L);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int, int) int
   public static final strictfp int method_2013(class_39 var0, int var1, int var2) {
      return method_2014(var0, var1, var2, 0);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.u, int, int, int) int
   public static final strictfp int method_2014(class_34 var0, int var1, int var2, int var3) {
      class_236 var4 = class_236.method_1549();
      if (var1 >= var2) {
         if (var1 > var2) {
            class_236.method_1588("min>max");
         }

         return var1;
      } else {
         byte var5 = 0;
         int var6 = (int)((long)var5 + var0.field_67 * 13L);
         var6 = (int)((long)var6 + var0.field_67 * 1300L);
         var6 = (int)((float)var6 + var0.field_74 * 13.0F);
         var6 = (int)((float)var6 + var0.field_75 * 13.0F);
         var6 = (int)((float)var6 + var0.field_74 * 130.0F);
         var6 = (int)((float)var6 + var0.field_75 * 130.0F);
         var6 += var3 * 133 * var2;
         var6 = (int)((long)var6 + (long)var3 * var0.field_67 + (long)var3);
         var6 += var3 * var4.field_1920 * 1313;
         var6 += var4.field_1920 * 13 + var4.field_1920 % 10;
         var6 %= var2 - var1;
         if (var6 < 0) {
            var6 = -var6;
         }

         var6 += var1;
         return var6;
      }
   }

   // $FF: renamed from: a (float, float, int) float
   public static final strictfp float method_2015(float var0, float var1, int var2) {
      return (float)method_2016((int)(var0 * 100.0F), (int)(var1 * 100.0F), var2) / 100.0F;
   }

   // $FF: renamed from: a (int, int, int) int
   public static final strictfp int method_2016(int var0, int var1, int var2) {
      class_236 var3 = class_236.method_1549();
      if (var0 >= var1) {
         if (var0 > var1) {
            class_236.method_1588("min>max");
         }

         return var0;
      } else {
         byte var4 = 0;
         int var5 = var4 + var2 * 133 * var1;
         var5 += var2 * 13;
         var5 += var2 * var3.field_1920 * 1313;
         var5 += var3.field_1920 * 13 + var3.field_1920 % 10;
         var5 %= var1 - var0;
         if (var5 < 0) {
            var5 = -var5;
         }

         var5 += var0;
         if (var5 < var0 || var5 > var1) {
            class_236.method_1588("notRandInt number not in range: " + var5 + " min:" + var0 + " max:" + var1);
         }

         return var5;
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static strictfp String method_2017(String var0) {
      Calendar var1 = Calendar.getInstance();
      SimpleDateFormat var2 = new SimpleDateFormat(var0);
      return var2.format(var1.getTime());
   }

   // $FF: renamed from: a (java.io.InputStream) java.lang.String
   public static final strictfp String method_2018(InputStream var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      byte[] var2 = new byte[1024];

      try {
         int var3;
         while((var3 = var0.read(var2)) != -1) {
            var1.write(var2, 0, var3);
         }

         var1.close();
         var0.close();
      } catch (IOException var5) {
      }

      return var1.toString();
   }

   // $FF: renamed from: a (float) float
   public static final strictfp float method_2019(float var0) {
      return (float)StrictMath.sqrt((double)var0);
   }

   // $FF: renamed from: a (float, float) float
   public static final strictfp float method_2020(float var0, float var1) {
      if (var0 > var1) {
         return var0 - var1;
      } else {
         return var0 < -var1 ? var0 + var1 : 0.0F;
      }
   }

   // $FF: renamed from: a (float, float, float) float
   public static final strictfp float method_2021(float var0, float var1, float var2) {
      if (var0 > var1 + var2) {
         return var0 - var2;
      } else {
         return var0 < var1 - var2 ? var0 + var2 : var1;
      }
   }

   // $FF: renamed from: b (float, float) float
   public static final strictfp float method_2022(float var0, float var1) {
      if (var0 > var1) {
         return var1;
      } else {
         return var0 < -var1 ? -var1 : var0;
      }
   }

   // $FF: renamed from: b (float, float, float) float
   public static final strictfp float method_2023(float var0, float var1, float var2) {
      if (var0 > var2) {
         return var2;
      } else {
         return var0 < var1 ? var1 : var0;
      }
   }

   // $FF: renamed from: b (int, int, int) int
   public static final strictfp int method_2024(int var0, int var1, int var2) {
      if (var0 > var2) {
         return var2;
      } else {
         return var0 < var1 ? var1 : var0;
      }
   }

   // $FF: renamed from: a (float, float, float, android.graphics.PointF) void
   public static final strictfp void method_2025(float var0, float var1, float var2, PointF var3) {
      float var4 = method_2098(var2);
      float var5 = method_2099(var2);
      var3.field_2406 -= var0;
      var3.field_2407 -= var1;
      float var6 = var3.field_2406 * var5 - var3.field_2407 * var4;
      float var7 = var3.field_2406 * var4 + var3.field_2407 * var5;
      var3.field_2406 = var6 + var0;
      var3.field_2407 = var7 + var1;
   }

   // $FF: renamed from: a (float, float, float, float) float
   public static final strictfp float method_2026(float var0, float var1, float var2, float var3) {
      return (var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3);
   }

   // $FF: renamed from: b (float, float, float, float) float
   public static final strictfp float method_2027(float var0, float var1, float var2, float var3) {
      return (float)StrictMath.sqrt((double)((var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3)));
   }

   // $FF: renamed from: a (int, int, int, int) int
   public static final strictfp int method_2028(int var0, int var1, int var2, int var3) {
      int var4 = var0 - var2;
      int var5 = var1 - var3;
      if (var4 < 0) {
         var4 = -var4;
      }

      if (var5 < 0) {
         var5 = -var5;
      }

      return var4 > var5 ? var4 : var5;
   }

   // $FF: renamed from: a (float, boolean) float
   public static final strictfp float method_2029(float var0, boolean var1) {
      if (var1) {
         while(var0 > 360.0F || var0 < 0.0F) {
            if (var0 > 360.0F) {
               var0 -= 360.0F;
            }

            if (var0 < 0.0F) {
               var0 += 360.0F;
            }
         }
      } else {
         while(var0 > 180.0F || var0 < -180.0F) {
            if (var0 > 180.0F) {
               var0 -= 360.0F;
            }

            if (var0 < -180.0F) {
               var0 += 360.0F;
            }
         }
      }

      return var0;
   }

   // $FF: renamed from: c (float, float, float) float
   public static final strictfp float method_2030(float var0, float var1, float var2) {
      var0 %= 360.0F;
      var1 %= 360.0F;
      float var3 = var1 - var0;
      if (var3 > 180.0F) {
         var3 -= 360.0F;
      }

      if (var3 < -180.0F) {
         var3 += 360.0F;
      }

      if (var3 > var2) {
         return var2;
      } else {
         return var3 < -var2 ? -var2 : var3;
      }
   }

   // $FF: renamed from: c (float, float, float, float) float
   public static final strictfp float method_2031(float var0, float var1, float var2, float var3) {
      return method_2040(method_2097(var3 - var1, var2 - var0));
   }

   // $FF: renamed from: a (android.graphics.PointF, android.graphics.PointF, android.graphics.PointF, android.graphics.PointF) boolean
   public static final strictfp boolean method_2032(PointF var0, PointF var1, PointF var2, PointF var3) {
      float var4 = (var3.field_2407 - var2.field_2407) * (var1.field_2406 - var0.field_2406) - (var3.field_2406 - var2.field_2406) * (var1.field_2407 - var0.field_2407);
      float var5 = (var3.field_2406 - var2.field_2406) * (var0.field_2407 - var2.field_2407) - (var3.field_2407 - var2.field_2407) * (var0.field_2406 - var2.field_2406);
      float var6 = (var1.field_2406 - var0.field_2406) * (var0.field_2407 - var2.field_2407) - (var1.field_2407 - var0.field_2407) * (var0.field_2406 - var2.field_2406);
      if (var4 == 0.0F) {
         return var5 == 0.0F && var6 == 0.0F ? false : false;
      } else {
         float var7 = var5 / var4;
         float var8 = var6 / var4;
         return var7 >= 0.0F && var7 <= 1.0F && var8 >= 0.0F && var8 <= 1.0F;
      }
   }

   // $FF: renamed from: c (float, float) float
   public static final strictfp float method_2033(float var0, float var1) {
      return field_2477.nextFloat() * (var1 - var0) + var0;
   }

   // $FF: renamed from: d (float, float) float
   public static final strictfp float method_2034(float var0, float var1) {
      return field_2477.nextFloat() * (var1 - var0) + var0;
   }

   // $FF: renamed from: a (int) int
   public static final strictfp int method_2035(int var0) {
      return var0 == 0 ? 0 : field_2477.nextInt(var0);
   }

   // $FF: renamed from: a (int, int) int
   public static strictfp int method_2036(int var0, int var1) {
      int var2;
      if (var1 == var0) {
         var2 = 0;
      } else {
         var2 = field_2477.nextInt(var1 - var0 + 1);
      }

      return var0 + var2;
   }

   // $FF: renamed from: a (android.graphics.Rect) void
   public static final strictfp void method_2037(Rect var0) {
      int var1;
      if (var0.field_2354 < var0.field_2352) {
         var1 = var0.field_2354;
         var0.field_2354 = var0.field_2352;
         var0.field_2352 = var1;
      }

      if (var0.field_2355 < var0.field_2353) {
         var1 = var0.field_2355;
         var0.field_2355 = var0.field_2353;
         var0.field_2353 = var1;
      }

   }

   // $FF: renamed from: a (android.graphics.RectF) void
   public static final strictfp void method_2038(RectF var0) {
      float var1;
      if (var0.field_2418 < var0.field_2416) {
         var1 = var0.field_2418;
         var0.field_2418 = var0.field_2416;
         var0.field_2416 = var1;
      }

      if (var0.field_2419 < var0.field_2417) {
         var1 = var0.field_2419;
         var0.field_2419 = var0.field_2417;
         var0.field_2417 = var1;
      }

   }

   // $FF: renamed from: d (float, float, float) android.graphics.PointF
   public static final strictfp PointF method_2039(float var0, float var1, float var2) {
      field_2484.method_1960(var0, var1 - var2);
      return field_2484;
   }

   // $FF: renamed from: b (float) float
   public static final strictfp float method_2040(float var0) {
      return var0 * 57.29578F;
   }

   // $FF: renamed from: e (float, float) float
   public static final strictfp float method_2041(float var0, float var1) {
      return (float)StrictMath.pow((double)var0, (double)var1);
   }

   // $FF: renamed from: c (float) float
   public static final strictfp float method_2042(float var0) {
      return var0 < 0.0F ? -var0 : var0;
   }

   // $FF: renamed from: b (int) int
   public static final strictfp int method_2043(int var0) {
      return var0 < 0 ? -var0 : var0;
   }

   // $FF: renamed from: b (int, int) int
   public static final strictfp int method_2044(int var0, int var1) {
      return var0 > var1 ? var0 : var1;
   }

   // $FF: renamed from: c (int, int) int
   public static final strictfp int method_2045(int var0, int var1) {
      return var0 < var1 ? var0 : var1;
   }

   // $FF: renamed from: f (float, float) float
   public static final strictfp float method_2046(float var0, float var1) {
      return var0 > var1 ? var0 : var1;
   }

   // $FF: renamed from: g (float, float) float
   public static final strictfp float method_2047(float var0, float var1) {
      return var0 < var1 ? var0 : var1;
   }

   // $FF: renamed from: h (float, float) boolean
   public static final strictfp boolean method_2048(float var0, float var1) {
      return method_2042(var0 - var1) < 0.05F;
   }

   // $FF: renamed from: e (float, float, float) boolean
   public static strictfp boolean method_2049(float var0, float var1, float var2) {
      return method_2042(method_2042(var0) - method_2042(var1)) < var2;
   }

   // $FF: renamed from: d (float) int
   public static final strictfp int method_2050(float var0) {
      if (var0 > 0.0F) {
         return (int)var0;
      } else {
         return var0 < 0.0F ? (int)var0 - 1 : 0;
      }
   }

   // $FF: renamed from: b () boolean
   public static strictfp boolean method_2051() {
      return false;
   }

   // $FF: renamed from: a (android.graphics.RectF, float) void
   public static strictfp void method_2052(RectF var0, float var1) {
      var0.field_2416 -= var1;
      var0.field_2417 -= var1;
      var0.field_2418 += var1;
      var0.field_2419 += var1;
   }

   // $FF: renamed from: a (android.graphics.Rect, float) void
   public static strictfp void method_2053(Rect var0, float var1) {
      var0.field_2352 = (int)((float)var0.field_2352 - var1);
      var0.field_2353 = (int)((float)var0.field_2353 - var1);
      var0.field_2354 = (int)((float)var0.field_2354 + var1);
      var0.field_2355 = (int)((float)var0.field_2355 + var1);
   }

   // $FF: renamed from: c (int) java.lang.String
   public static strictfp String method_2054(int var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0; ++var2) {
         char var3 = field_2485[field_2477.nextInt(field_2485.length)];
         var1.append(var3);
      }

      return var1.toString();
   }

   // $FF: renamed from: c () java.lang.String
   public static strictfp String method_2055() {
      return UUID.randomUUID().toString();
   }

   // $FF: renamed from: a (boolean) java.lang.String
   public static strictfp String method_2056(boolean var0) {
      return var0 ? "true" : "false";
   }

   // $FF: renamed from: e (float) java.lang.String
   public static strictfp String method_2057(float var0) {
      return var0 == (float)((int)var0) ? "" + (int)var0 : String.format("%.2f", var0);
   }

   // $FF: renamed from: a (float, int) java.lang.String
   public static strictfp String method_2058(float var0, int var1) {
      return var0 == (float)((int)var0) ? "" + (int)var0 : String.format("%." + var1 + "f", var0);
   }

   // $FF: renamed from: f (float) java.lang.String
   public static strictfp String method_2059(float var0) {
      return var0 == (float)((int)var0) ? "" + (int)var0 + "s" : String.format("%.1fs", var0);
   }

   // $FF: renamed from: a (java.lang.String, int) java.lang.String
   public static strictfp String method_2060(String var0, int var1) {
      return var0 == null ? null : var0.substring(0, Math.min(var0.length(), var1));
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static strictfp String method_2061(String var0) {
      byte[] var1;
      try {
         var1 = MessageDigest.getInstance("MD5").digest(var0.getBytes("UTF-8"));
      } catch (NoSuchAlgorithmException var8) {
         throw new RuntimeException("MD5 should be supported", var8);
      } catch (UnsupportedEncodingException var9) {
         throw new RuntimeException("UTF-8 should be supported", var9);
      }

      StringBuilder var2 = new StringBuilder(var1.length * 2);
      byte[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         byte var6 = var3[var5];
         int var7 = var6 & 255;
         if (var7 < 16) {
            var2.append('0');
         }

         var2.append(Integer.toHexString(var7));
      }

      return var2.toString();
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   public static strictfp String method_2062(String var0) {
      return method_2064(method_2063(var0));
   }

   // $FF: renamed from: d (java.lang.String) byte[]
   static strictfp byte[] method_2063(String var0) {
      MessageDigest var1 = null;

      try {
         var1 = MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var3) {
         throw new RuntimeException(var3);
      }

      var1.reset();
      return var1.digest(var0.getBytes());
   }

   // $FF: renamed from: a (byte[]) java.lang.String
   static strictfp String method_2064(byte[] var0) {
      return String.format("%0" + var0.length * 2 + "X", new BigInteger(1, var0));
   }

   // $FF: renamed from: d () int
   public static strictfp int method_2065() {
      int var0 = 1;

      try {
         File var1 = new File("/sys/devices/system/cpu/");
         if (var1.exists()) {
            File[] var2 = var1.listFiles(new f$a());
            var0 = var2.length;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         var0 = 1;
      }

      if (var0 == 1) {
         int var4 = Runtime.getRuntime().availableProcessors();
         if (var4 > 1) {
            var0 = var4;
         }
      }

      return var0;
   }

   // $FF: renamed from: a (byte[][], byte[][]) void
   public static strictfp void method_2066(byte[][] var0, byte[][] var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         System.arraycopy(var0[var2], 0, var1[var2], 0, var0[var2].length);
      }

   }

   // $FF: renamed from: f (float, float, float) float
   public static strictfp float method_2067(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   // $FF: renamed from: a (java.util.ArrayList, java.lang.Object[]) void
   public static strictfp void method_2068(ArrayList var0, Object[] var1) {
      Object[] var2 = var1;
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Object var5 = var2[var4];
         var0.add(var5);
      }

   }

   // $FF: renamed from: b (java.lang.String, int) java.lang.String
   public static strictfp String method_2069(String var0, int var1) {
      String var2 = "";

      for(int var3 = 0; var3 <= var1; ++var3) {
         var2 = var2 + var0;
      }

      return var2;
   }

   // $FF: renamed from: c (java.lang.String, int) java.lang.String
   public static strictfp String method_2070(String var0, int var1) {
      for(int var2 = var0.length(); var2 < var1; ++var2) {
         var0 = var0 + " ";
      }

      return var0;
   }

   // $FF: renamed from: a (java.lang.String, int, java.lang.String) java.lang.String
   public static strictfp String method_2071(String var0, int var1, String var2) {
      for(int var3 = var0.length(); var3 < var1; ++var3) {
         var0 = var2 + var0;
      }

      return var0;
   }

   // $FF: renamed from: d (java.lang.String, int) java.lang.String
   public static strictfp String method_2072(String var0, int var1) {
      return String.format("%1$-" + var1 + "s", var0);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) java.lang.String
   private static strictfp String method_2073(String var0, String var1) {
      File var2 = new File(var0);
      File[] var3 = var2.listFiles();
      if (var3 == null) {
         class_236.method_1591("findFileExtension('" + var0 + "','" + var1 + "'): path is not a folder");
         return null;
      } else {
         File[] var4 = var3;
         int var5 = var3.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            File var7 = var4[var6];
            String var8 = var7.getName();
            if (var8.contains(".")) {
               var8 = var8.substring(0, var8.lastIndexOf(46));
            }

            if (var8.equals(var1)) {
               return var0 + "/" + var7.getName();
            }
         }

         class_236.method_1591("Could not find file with path:" + var0 + " file:" + var1);
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.Class, int) java.lang.String
   public static strictfp String method_2074(Class var0, int var1) {
      try {
         Field[] var2 = var0.getFields();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            Field var5 = var2[var4];
            int var6 = var5.getInt((Object)null);
            if (var6 == var1) {
               return var5.getName();
            }
         }

         return null;
      } catch (IllegalArgumentException var7) {
         throw new RuntimeException(var7);
      } catch (IllegalAccessException var8) {
         throw new RuntimeException(var8);
      }
   }

   // $FF: renamed from: d (int) java.lang.String
   public static strictfp String method_2075(int var0) {
      String var1 = method_2074(R$drawable.class, var0);
      if (var1 != null) {
         return method_2073("res/drawable", var1);
      } else {
         var1 = method_2074(R$raw.class, var0);
         return var1 != null ? method_2073("res/raw", var1) : null;
      }
   }

   // $FF: renamed from: e (int) java.lang.String
   public static final strictfp String method_2076(int var0) {
      String var1 = String.format("#%06X", 16777215 & var0);
      return var1;
   }

   // $FF: renamed from: e (java.lang.String) java.lang.String
   public static final strictfp String method_2077(String var0) {
      if (var0 == null) {
         return null;
      } else {
         File var1 = new File(var0);
         String var2 = var1.getName();
         var2 = var2.replaceFirst("[.][^.]+$", "");
         return var2;
      }
   }

   // $FF: renamed from: f (java.lang.String) java.lang.String
   public static final strictfp String method_2078(String var0) {
      File var1 = new File(var0);
      return var1.getParent();
   }

   // $FF: renamed from: g (java.lang.String) java.io.File
   public static strictfp File method_2079(String var0) {
      File var1 = new File(var0);
      if (var1.exists()) {
         return var1;
      } else {
         File var2 = var1.getParentFile();
         if (var2 != null && var2.isDirectory()) {
            File[] var3 = var2.listFiles();
            if (var3 == null) {
               class_236.method_1591("createFileCaseInsensitive: Failed to list files for: " + var0 + " in " + var2);
               return null;
            } else {
               File[] var4 = var3;
               int var5 = var3.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  File var7 = var4[var6];
                  if (var7.getName().equalsIgnoreCase(var1.getName())) {
                     return var7;
                  }
               }

               return null;
            }
         } else {
            class_236.method_1591("createFileCaseInsensitive: did not find parent for: " + var0);
            return null;
         }
      }
   }

   // $FF: renamed from: h (java.lang.String) com.corrodinggames.rts.gameFramework.utility.j
   public static final strictfp class_196 method_2080(String var0) {
      class_196 var1;
      if (!var0.startsWith("/SD/") && !var0.startsWith("\\SD\\")) {
         if (class_236.method_1636(var0)) {
            class_236.method_1591("using " + var0 + " as absolute path");

            try {
               File var7 = method_2079(var0);
               if (var7 == null) {
                  return null;
               }

               FileInputStream var8 = new FileInputStream(var7);
               var1 = new class_196(var8, var7.getAbsolutePath());
            } catch (FileNotFoundException var5) {
               return null;
            }
         } else {
            var1 = class_196.method_1313(var0);
         }
      } else {
         var0 = var0.substring("/SD/".length());
         String var2;
         if (class_236.field_1899) {
            var2 = var0;
         } else {
            var2 = Environment.getExternalStorageDirectory() + "/" + var0;
         }

         try {
            File var3 = method_2079(var2);
            if (var3 == null) {
               return null;
            }

            FileInputStream var4 = new FileInputStream(var3);
            var1 = new class_196(var4, var3.getAbsolutePath());
         } catch (FileNotFoundException var6) {
            return null;
         }
      }

      return var1;
   }

   // $FF: renamed from: a (android.graphics.Rect, android.graphics.RectF) boolean
   public static final strictfp boolean method_2081(Rect var0, RectF var1) {
      return (float)var0.field_2352 < var1.field_2418 && var1.field_2416 < (float)var0.field_2354 && (float)var0.field_2353 < var1.field_2419 && var1.field_2417 < (float)var0.field_2355;
   }

   // $FF: renamed from: a (android.graphics.RectF, android.graphics.RectF) boolean
   public static final strictfp boolean method_2082(RectF var0, RectF var1) {
      return var0.field_2416 < var1.field_2418 && var1.field_2416 < var0.field_2418 && var0.field_2417 < var1.field_2419 && var1.field_2417 < var0.field_2419;
   }

   // $FF: renamed from: b (int, int, int, int) int
   public static final strictfp int method_2083(int var0, int var1, int var2, int var3) {
      return var0 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   // $FF: renamed from: a (long, long) long
   public static final strictfp long method_2084(long var0, long var2) {
      return (var2 - var0) / 1000000L;
   }

   // $FF: renamed from: a (java.lang.String, char) int
   public static final strictfp int method_2085(String var0, char var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         if (var0.charAt(var3) == var1) {
            ++var2;
         }
      }

      return var2;
   }

   // $FF: renamed from: i (java.lang.String) java.lang.String
   public static final strictfp String method_2086(String var0) {
      var0 = var0.replace("&", "&amp;");
      var0 = var0.replace("<", "&lt;");
      var0 = var0.replace(">", "&gt;");
      var0 = var0.replace("${", "$ {");
      return var0;
   }

   // $FF: renamed from: a (java.io.File) java.lang.String
   public static strictfp String method_2087(File var0) {
      try {
         FileInputStream var1 = new FileInputStream(var0);

         try {
            byte[] var2 = new byte[(int)var0.length()];
            int var3 = var2.length;
            int var4 = 0;

            while(true) {
               if (var4 < var3) {
                  int var5 = var1.read(var2, var4, var3 - var4);
                  if (var5 != -1) {
                     var4 += var5;
                     continue;
                  }
               }

               String var13 = new String(var2, Charset.forName("UTF-8"));
               return var13;
            }
         } finally {
            var1.close();
         }
      } catch (FileNotFoundException var11) {
         throw new RuntimeException(var11);
      } catch (IOException var12) {
         throw new RuntimeException(var12);
      }
   }

   // $FF: renamed from: a (java.lang.Exception) java.lang.String
   public static final strictfp String method_2088(Exception var0) {
      StringWriter var1 = new StringWriter();
      PrintWriter var2 = new PrintWriter(var1);
      var0.printStackTrace(var2);
      return var1.toString();
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.String
   public static final strictfp String method_2089(Exception var0) {
      String var1 = var0.getMessage();
      if (var1 == null) {
         var1 = var0.getClass().getName();
      } else {
         boolean var2 = false;
         if (var0 instanceof NumberFormatException) {
            var2 = true;
         }

         if (var0 instanceof ArrayIndexOutOfBoundsException) {
            var2 = true;
         }

         if (var2) {
            var1 = var0.getClass().getName() + " - " + var1;
         }
      }

      Throwable var3;
      Object var4;
      for(var4 = var0; var4 != null; var4 = var3) {
         var3 = ((Throwable)var4).getCause();
         if (var3 == null || var3 == var0 || var3 == var4) {
            break;
         }
      }

      var3 = null;
      if (var4 != null && var4 != var0) {
         String var5 = ((Throwable)var4).getMessage();
         if (var5 == null) {
            var5 = var4.getClass().getName();
         }

         if (!var5.equals(var1)) {
            var1 = var1 + " caused by (" + var5 + ")";
         }
      }

      return var1;
   }

   // $FF: renamed from: j (java.lang.String) java.lang.String
   public static strictfp String method_2090(String var0) {
      return var0.endsWith("\n") ? var0.substring(0, var0.length() - 1) : var0;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   public static strictfp String method_2091(String var0, String var1) {
      return var0.endsWith(var1) ? var0.substring(0, var0.length() - var1.length()) : var0;
   }

   // $FF: renamed from: k (java.lang.String) java.lang.String
   public static strictfp String method_2092(String var0) {
      File var1 = new File(var0);
      return var1.getName();
   }

   // $FF: renamed from: l (java.lang.String) java.lang.Integer
   public static strictfp Integer method_2093(String var0) {
      try {
         return Integer.valueOf(var0);
      } catch (NumberFormatException var2) {
         class_236.method_1591(var2.toString());
         return null;
      }
   }

   // $FF: renamed from: m (java.lang.String) boolean
   public static strictfp boolean method_2094(String var0) {
      int var1 = var0.length();

      int var3;
      for(int var2 = 0; var2 < var1; var2 += Character.charCount(var3)) {
         var3 = var0.codePointAt(var2);
         if (var3 > 128) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (long) java.lang.String
   public static strictfp String method_2095(long var0) {
      int[] var3 = method_2096(var0);
      String var2;
      if (var3[0] == 0) {
         var2 = method_2071("" + var3[1], 2, "0") + ":" + method_2071("" + var3[2], 2, "0");
      } else {
         var2 = method_2071("" + var3[0], 2, "0") + ":" + method_2071("" + var3[1], 2, "0") + ":" + method_2071("" + var3[2], 2, "0");
      }

      return var2;
   }

   // $FF: renamed from: b (long) int[]
   public static strictfp int[] method_2096(long var0) {
      int var2 = (int)var0 / 3600;
      int var3 = (int)var0 - var2 * 3600;
      int var4 = var3 / 60;
      var3 -= var4 * 60;
      int[] var6 = new int[]{var2, var4, var3};
      return var6;
   }

   // $FF: renamed from: i (float, float) float
   public static final strictfp float method_2097(float var0, float var1) {
      try {
         if (var1 >= 0.0F) {
            if (var0 >= 0.0F) {
               return var1 >= var0 ? field_2486[(int)((double)(1024.0F * var0 / var1) + 0.5D)] : field_2487[(int)((double)(1024.0F * var1 / var0) + 0.5D)];
            } else {
               return var1 >= -var0 ? field_2488[(int)((double)(-1024.0F * var0 / var1) + 0.5D)] : field_2489[(int)((double)(-1024.0F * var1 / var0) + 0.5D)];
            }
         } else if (var0 >= 0.0F) {
            return -var1 >= var0 ? field_2490[(int)((double)(-1024.0F * var0 / var1) + 0.5D)] : field_2491[(int)((double)(-1024.0F * var1 / var0) + 0.5D)];
         } else {
            return var1 <= var0 ? field_2492[(int)((double)(1024.0F * var0 / var1) + 0.5D)] : field_2493[(int)((double)(1024.0F * var1 / var0) + 0.5D)];
         }
      } catch (ArrayIndexOutOfBoundsException var3) {
         if (field_2494 < 100) {
            class_236.method_1591("atan2 slow fallback for y:" + var0 + " x:" + var1);
            ++field_2494;
         }

         return (float)StrictMath.atan2((double)var0, (double)var1);
      }
   }

   // $FF: renamed from: g (float) float
   public static final strictfp float method_2098(float var0) {
      return field_2495[(int)(var0 * 11.377778F) & 4095];
   }

   // $FF: renamed from: h (float) float
   public static final strictfp float method_2099(float var0) {
      return field_2496[(int)(var0 * 11.377778F) & 4095];
   }

   // $FF: renamed from: n (java.lang.String) java.lang.String
   public static strictfp String method_2100(String var0) {
      boolean var1 = false;
      StringBuilder var2 = new StringBuilder();
      char[] var3 = var0.toCharArray();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         char var6 = var3[var5];
         boolean var7 = var1;
         var1 = false;
         if (!var7 && var6 == '\\') {
            var1 = true;
         } else {
            var2.append(var6);
         }
      }

      return var2.toString();
   }

   // $FF: renamed from: b (java.lang.String, char) java.lang.String[]
   public static strictfp String[] method_2101(String var0, char var1) {
      ArrayList var2 = new ArrayList();
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      StringBuilder var6 = new StringBuilder();
      char[] var7 = var0.toCharArray();
      int var8 = var7.length;

      for(int var9 = 0; var9 < var8; ++var9) {
         char var10 = var7[var9];
         boolean var11 = var3;
         var3 = false;
         if (!var11) {
            if (var10 == '\\') {
               var3 = true;
            }

            if (!var5 && var10 == '\'') {
               var4 = !var4;
            }

            if (!var4 && var10 == '"') {
               var5 = !var5;
            }
         }

         if (var10 == var1 && !var4 && !var5 && !var4) {
            var2.add(var6.toString());
            var6.setLength(0);
         } else {
            var6.append(var10);
         }
      }

      if (var6.length() != 0) {
         var2.add(var6.toString());
         var6.setLength(0);
      }

      return (String[])var2.toArray(new String[0]);
   }

   static {
      int var0;
      for(var0 = 0; var0 < 10; ++var0) {
         field_2485[var0] = (char)(48 + var0);
      }

      for(var0 = 10; var0 < 36; ++var0) {
         field_2485[var0] = (char)(97 + var0 - 10);
      }

      field_2486 = new float[1025];
      field_2487 = new float[1025];
      field_2488 = new float[1025];
      field_2489 = new float[1025];
      field_2490 = new float[1025];
      field_2491 = new float[1025];
      field_2492 = new float[1025];
      field_2493 = new float[1025];

      for(var0 = 0; var0 <= 1024; ++var0) {
         float var1 = (float)var0 / 1024.0F;
         field_2486[var0] = (float)(StrictMath.atan((double)var1) * 3.1415927410125732D / 3.141592653589793D);
         field_2487[var0] = 1.5707964F - field_2486[var0];
         field_2488[var0] = -field_2486[var0];
         field_2489[var0] = field_2486[var0] - 1.5707964F;
         field_2490[var0] = 3.1415927F - field_2486[var0];
         field_2491[var0] = field_2486[var0] + 1.5707964F;
         field_2492[var0] = field_2486[var0] - 3.1415927F;
         field_2493[var0] = -1.5707964F - field_2486[var0];
      }

      field_2494 = 0;
      field_2495 = new float[4096];
      field_2496 = new float[4096];

      for(var0 = 0; var0 < 4096; ++var0) {
         field_2495[var0] = (float)StrictMath.sin((double)(((float)var0 + 0.5F) / 4096.0F * 6.2831855F));
         field_2496[var0] = (float)StrictMath.cos((double)(((float)var0 + 0.5F) / 4096.0F * 6.2831855F));
      }

   }
}
