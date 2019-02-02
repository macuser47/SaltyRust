package com.corrodinggames.rts.java;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.PorterDuff.Mode;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_23;
import com.corrodinggames.rts.gameFramework.h.class_27;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.h.class_472;
import com.corrodinggames.rts.gameFramework.utility.class_196;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import org.lwjgl.opengl.GL14;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.GlyphPage;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.opengl.PNGImageData;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.LineStripRenderer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.util.FastTrig;
import org.newdawn.slick.util.ResourceLoader;

// $FF: renamed from: com.corrodinggames.rts.java.d
public class class_339 implements class_22 {
   // $FF: renamed from: a boolean
   public boolean field_2698;
   // $FF: renamed from: b org.newdawn.slick.Color
   public static Color field_2699 = new Color(0, 0, 0, 255);
   // $FF: renamed from: c org.newdawn.slick.Color
   public static Color field_2700 = new Color(0, 0, 0, 255);
   // $FF: renamed from: d org.newdawn.slick.Color
   public static Color field_2701 = new Color(0, 0, 0, 255);
   // $FF: renamed from: e org.newdawn.slick.Graphics
   public Graphics field_2702;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_2703;
   // $FF: renamed from: g org.newdawn.slick.Graphics
   public static Graphics field_2704 = null;
   // $FF: renamed from: C org.newdawn.slick.opengl.renderer.SGL
   private static SGL field_2705 = Renderer.get();
   // $FF: renamed from: h android.graphics.Rect
   Rect field_2706 = new Rect();
   // $FF: renamed from: i android.graphics.Rect
   Rect field_2707 = new Rect();
   // $FF: renamed from: j android.graphics.RectF
   RectF field_2708 = new RectF();
   // $FF: renamed from: k java.util.ArrayList
   ArrayList field_2709 = new ArrayList();
   // $FF: renamed from: l int
   int field_2710 = -1;
   // $FF: renamed from: m android.graphics.Paint
   Paint field_2711 = null;
   // $FF: renamed from: n com.corrodinggames.rts.java.u
   class_308 field_2712 = null;
   // $FF: renamed from: o android.graphics.Paint
   final Paint field_2713 = new Paint();
   // $FF: renamed from: p org.newdawn.slick.Color
   public static Color field_2714 = new Color(0, 0, 0, 255);
   // $FF: renamed from: q com.corrodinggames.rts.java.e
   class_340 field_2715 = new class_340(this);
   // $FF: renamed from: r byte[]
   byte[] field_2716 = new byte[4];
   // $FF: renamed from: s int
   int field_2717 = 0;
   // $FF: renamed from: t android.graphics.RectF
   RectF field_2718 = new RectF();
   // $FF: renamed from: u android.graphics.RectF
   static RectF field_2719 = new RectF();
   // $FF: renamed from: v android.graphics.RectF
   static RectF field_2720 = new RectF();
   // $FF: renamed from: w android.graphics.Rect
   Rect field_2721 = new Rect();
   // $FF: renamed from: x java.util.Stack
   Stack field_2722 = new Stack();
   // $FF: renamed from: y int
   int field_2723 = -1;
   // $FF: renamed from: z float
   float field_2724;
   // $FF: renamed from: A float
   float field_2725;
   // $FF: renamed from: B float
   float field_2726;
   // $FF: renamed from: D org.newdawn.slick.opengl.renderer.LineStripRenderer
   private static LineStripRenderer field_2727 = Renderer.getLineStripRenderer();

   // $FF: renamed from: k () org.newdawn.slick.Color
   public Color method_2245() {
      return field_2699;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e) com.corrodinggames.rts.gameFramework.h.l
   public class_22 method_54(class_306 var1) {
      class_339 var2 = new class_339();
      class_308 var3 = this.method_2263(var1);

      try {
         var2.field_2702 = var3.method_2138().getGraphics();
         var2.field_2703 = var1;
         return var2;
      } catch (SlickException var5) {
         throw new RuntimeException(var5);
      }
   }

   // $FF: renamed from: a () boolean
   public boolean method_55() {
      return false;
   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_56(Context var1) {
   }

   // $FF: renamed from: b () com.corrodinggames.rts.gameFramework.h.h
   public class_23 method_57() {
      return null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.h) void
   public void method_58(class_23 var1) {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.a) void
   public void method_59(class_472 var1) {
   }

   // $FF: renamed from: a (java.lang.String) boolean
   public static boolean method_2246(String var0) {
      for(int var1 = 0; var1 < var0.length(); ++var1) {
         int var2 = var0.codePointAt(var1);
         if (var2 > 255) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.java.e, java.lang.String, boolean) org.newdawn.slick.Font
   Font method_2247(class_340 var1, String var2, boolean var3) {
      class_340 var4 = this.method_2248(var1, var3);
      if (var4.method_2267(var2)) {
         return var4.field_2731;
      } else {
         UnicodeFont var5 = (UnicodeFont)var4.field_2731;
         int var6 = 0;

         GlyphPage var9;
         for(Iterator var7 = var5.getGlyphPages().iterator(); var7.hasNext(); var6 += var9.getGlyphs().size()) {
            Object var8 = var7.next();
            var9 = (GlyphPage)var8;
         }

         int var13;
         for(var13 = 0; var13 < var2.length(); ++var13) {
            var2.charAt(var13);
            boolean var15 = false;
            if (!var15) {
            }
         }

         var13 = var5.getGlyphPages().size();
         var5.addGlyphs(var2);

         try {
            var5.loadGlyphs();
         } catch (SlickException var12) {
            throw new RuntimeException(var12);
         }

         int var14 = 0;

         GlyphPage var11;
         for(Iterator var16 = var5.getGlyphPages().iterator(); var16.hasNext(); var14 += var11.getGlyphs().size()) {
            Object var10 = var16.next();
            var11 = (GlyphPage)var10;
         }

         int var17 = var5.getGlyphPages().size();
         if (var6 != var14) {
            class_236.method_1591("new glypth, " + var14 + " " + var4.toString() + " for text:" + var2);
         }

         var4.method_2268(var2);
         return var4.field_2731;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.java.e, boolean) com.corrodinggames.rts.java.e
   class_340 method_2248(class_340 var1, boolean var2) {
      Iterator var3 = this.field_2709.iterator();

      class_340 var4;
      do {
         if (!var3.hasNext()) {
            var1 = var1.method_2266();
            class_236.method_1591("New font:" + var1.field_2728 + " bold:" + var1.field_2729);
            if (var2) {
            }

            String var12 = "font/Roboto-Regular.ttf";
            if (var1.field_2729) {
               var12 = "font/Roboto-Bold.ttf";
            }

            if (var1.field_2730) {
               var12 = "font/DroidSansFallback.ttf";
            }

            boolean var13 = false;

            java.awt.Font var5;
            try {
               InputStream var6 = ResourceLoader.getResourceAsStream(var12);
               var5 = java.awt.Font.createFont(0, var6);
               var5 = var5.deriveFont((float)var1.field_2728);
            } catch (IOException var10) {
               throw new RuntimeException(var10);
            } catch (FontFormatException var11) {
               throw new RuntimeException(var11);
            }

            UnicodeFont var14 = new UnicodeFont(var5);
            var14.addAsciiGlyphs();
            java.awt.Color var7 = new java.awt.Color(255, 255, 255);
            var14.getEffects().add(new ColorEffect(var7));

            try {
               var14.loadGlyphs();
            } catch (SlickException var9) {
               throw new RuntimeException(var9);
            }

            class_236.method_1591("loadGlyphs");
            var1.field_2731 = var14;
            this.field_2709.add(var1);
            return var1;
         }

         var4 = (class_340)var3.next();
      } while(var4.field_2728 != var1.field_2728 || var4.field_2729 != var1.field_2729 || var4.field_2730 != var1.field_2730);

      return var4;
   }

   // $FF: renamed from: a (android.graphics.Paint, java.lang.String) void
   public void method_2249(Paint var1, String var2) {
      this.method_2252(var1, true, var2, (class_308)null);
   }

   // $FF: renamed from: a (android.graphics.Paint, boolean) void
   public void method_2250(Paint var1, boolean var2) {
      this.method_2252(var1, var2, (String)null, (class_308)null);
   }

   // $FF: renamed from: a (android.graphics.Paint, com.corrodinggames.rts.java.u) void
   public void method_2251(Paint var1, class_308 var2) {
      this.method_2252(var1, false, (String)null, var2);
   }

   // $FF: renamed from: a (android.graphics.Paint, boolean, java.lang.String, com.corrodinggames.rts.java.u) void
   public void method_2252(Paint var1, boolean var2, String var3, class_308 var4) {
      if (field_2704 != this.field_2702) {
         this.method_2264();
         this.field_2698 = true;
         Color.setRebindRequired();
         this.field_2711 = this.field_2713;
      }

      field_2704 = this.field_2702;
      if (var1 != null && !(var1 instanceof class_441) || this.field_2711 != var1 || this.field_2712 != var4 || var2) {
         this.field_2711 = var1;
         this.field_2712 = var4;
         if (this.field_2710 != Graphics.MODE_NORMAL) {
            this.field_2710 = Graphics.MODE_NORMAL;
            this.field_2702.setDrawMode(this.field_2710);
         }

         if (this.field_2703 != null) {
            field_2705.glEnable(3042);
            field_2705.glColorMask(true, true, true, true);
            GL14.glBlendFuncSeparate(770, 771, 770, 1);
         }

         boolean var5;
         if (var1 == null) {
            var5 = false;
            this.method_2254(Color.white);
            this.field_2702.setLineWidth(1.0F);
            if (var2) {
               this.field_2702.resetFont();
            }
         } else {
            var5 = var1.method_2780();
         }

         boolean var6;
         if (var4 != null) {
            var6 = var4.field_2550 == 1;
            if (var6 != var5) {
               int var7 = var5 ? 1 : 2;
               var4.method_2138().setFilter(var7);
               var4.field_2550 = var7;
            }
         }

         if (var1 != null) {
            var6 = true;
            ColorFilter var10 = var1.method_2795();
            if (var10 != null && var10 instanceof LightingColorFilter) {
               LightingColorFilter var8 = (LightingColorFilter)var10;
               if (var8.field_3994 != 0 && var8.field_3994 != -1) {
                  int var9 = var8.field_3994;
                  field_2700.r = (float)android.graphics.Color.method_3073(var9) / 255.0F;
                  field_2700.g = (float)android.graphics.Color.method_3074(var9) / 255.0F;
                  field_2700.b = (float)android.graphics.Color.method_3075(var9) / 255.0F;
                  field_2700.a = (float)android.graphics.Color.method_3072(var9) / 255.0F;
                  method_2259(var1.method_2787(), field_2701);
                  Color var10000 = field_2700;
                  var10000.r *= field_2701.r;
                  var10000 = field_2700;
                  var10000.g *= field_2701.g;
                  var10000 = field_2700;
                  var10000.b *= field_2701.b;
                  var10000 = field_2700;
                  var10000.a *= field_2701.a;
                  this.method_2254(field_2700);
                  this.field_2710 = Graphics.MODE_ADD;
                  this.field_2702.setDrawMode(this.field_2710);
                  field_2705.glEnable(3042);
                  field_2705.glColorMask(true, true, true, true);
                  field_2705.glBlendFunc(770, 1);
                  var6 = false;
               }
            }

            if (var6) {
               this.method_2253(var1.method_2787());
            }

            if (var1.method_2792() != 0.0F) {
               this.field_2702.setLineWidth(var1.method_2792());
            } else {
               this.field_2702.setLineWidth(1.0F);
            }

            if (var2) {
               Font var11 = this.method_2255(var1, var3, true);
               this.field_2702.setFont(var11);
            }
         }

      }
   }

   // $FF: renamed from: c (int) void
   public void method_2253(int var1) {
      method_2259(var1, field_2714);
      this.method_2254(field_2714);
   }

   // $FF: renamed from: a (org.newdawn.slick.Color) void
   public void method_2254(Color var1) {
      if (this.field_2698 || !field_2699.equals(var1)) {
         field_2699.a = var1.a;
         field_2699.r = var1.r;
         field_2699.g = var1.g;
         field_2699.b = var1.b;
         this.field_2702.setColor(field_2699);
      }

   }

   // $FF: renamed from: a (android.graphics.Paint, java.lang.String, boolean) org.newdawn.slick.Font
   public Font method_2255(Paint var1, String var2, boolean var3) {
      class_340 var4 = this.field_2715;
      var4.field_2728 = (int)var1.method_2803();
      Typeface var5 = var1.method_2798();
      var4.field_2729 = false;
      if (var5 != null) {
         var4.field_2729 = var5.method_1915();
      }

      var4.field_2730 = false;
      boolean var6 = method_2246(var2);
      if (var6) {
         var4.field_2730 = true;
      }

      Font var7 = this.method_2247(var4, var2, var3);
      return var7;
   }

   // $FF: renamed from: a (org.newdawn.slick.opengl.ImageData, java.nio.ByteBuffer, int, int, int, int, int, int) void
   public static void method_2256(ImageData var0, ByteBuffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = (var2 + var3 * var0.getTexWidth()) * 4;
      if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
         var1.put(var8, (byte)var6);
         var1.put(var8 + 1, (byte)var5);
         var1.put(var8 + 2, (byte)var4);
         var1.put(var8 + 3, (byte)var7);
      } else {
         var1.put(var8, (byte)var4);
         var1.put(var8 + 1, (byte)var5);
         var1.put(var8 + 2, (byte)var6);
         var1.put(var8 + 3, (byte)var7);
      }

   }

   // $FF: renamed from: a (org.newdawn.slick.opengl.ImageData, java.nio.ByteBuffer, int, int) int
   public static int method_2257(ImageData var0, ByteBuffer var1, int var2, int var3) {
      int var4 = (var2 + var3 * var0.getTexWidth()) * 4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
         var7 = var1.get(var4) & 255;
         var6 = var1.get(var4 + 1) & 255;
         var5 = var1.get(var4 + 2) & 255;
         var8 = var1.get(var4 + 3) & 255;
      } else {
         var5 = var1.get(var4) & 255;
         var6 = var1.get(var4 + 1) & 255;
         var7 = var1.get(var4 + 2) & 255;
         var8 = var1.get(var4 + 3) & 255;
      }

      return method_2258(var8, var5, var6, var7);
   }

   // $FF: renamed from: a (int, int, int, int) int
   public static int method_2258(int var0, int var1, int var2, int var3) {
      return var0 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   // $FF: renamed from: a (int, org.newdawn.slick.Color) org.newdawn.slick.Color
   public static Color method_2259(int var0, Color var1) {
      return method_2260(var0, var1, true);
   }

   // $FF: renamed from: a (int, org.newdawn.slick.Color, boolean) org.newdawn.slick.Color
   public static Color method_2260(int var0, Color var1, boolean var2) {
      var1.r = (float)android.graphics.Color.method_3073(var0) / 255.0F;
      var1.g = (float)android.graphics.Color.method_3074(var0) / 255.0F;
      var1.b = (float)android.graphics.Color.method_3075(var0) / 255.0F;
      var1.a = var2 ? (float)android.graphics.Color.method_3072(var0) / 255.0F : 1.0F;
      return var1;
   }

   // $FF: renamed from: a (int) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_60(int var1) {
      return this.method_61(var1, true);
   }

   // $FF: renamed from: b (int, boolean) com.corrodinggames.rts.java.u
   public static class_308 method_2261(int var0, boolean var1) {
      String var2 = class_296.method_2075(var0);

      try {
         FileInputStream var3 = new FileInputStream(var2);
         BufferedInputStream var4 = new BufferedInputStream(var3);
         PNGImageData var5 = new PNGImageData();
         var5.loadImage(var4);
         var4.close();
         var3.close();
         return method_2262(var5, var2);
      } catch (IOException var6) {
         throw new RuntimeException(var6);
      }
   }

   // $FF: renamed from: a (int, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_61(int var1, boolean var2) {
      return method_2261(var1, var2);
   }

   // $FF: renamed from: a (java.io.InputStream, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_62(InputStream var1, boolean var2) {
      try {
         String var3 = null;
         if (var1 instanceof class_196) {
            var3 = ((class_196)var1).method_1315();
         } else {
            class_236.method_1588("loadImage InputStream is not AssetInputStream");
            class_236.method_1594();
         }

         ++this.field_2717;
         BufferedInputStream var4 = new BufferedInputStream(var1);
         PNGImageData var5 = new PNGImageData();
         var5.loadImage(var4);
         var4.close();
         return method_2262(var5, var3);
      } catch (IOException var6) {
         throw new RuntimeException(var6);
      }
   }

   // $FF: renamed from: a (org.newdawn.slick.opengl.ImageData, java.lang.String) com.corrodinggames.rts.java.u
   public static class_308 method_2262(ImageData var0, String var1) {
      class_308 var2 = new class_308();
      var2.method_2141(var0, var1, false);
      return var2;
   }

   // $FF: renamed from: a (int, int, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_63(int var1, int var2, boolean var3) {
      class_308 var4 = new class_308();

      try {
         var4.method_2140(new Image(var1, var2), (String)null);
         return var4;
      } catch (SlickException var6) {
         throw new RuntimeException(var6);
      }
   }

   // $FF: renamed from: b (int, int, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_64(int var1, int var2, boolean var3) {
      return method_2262(new ImageBuffer(var1, var2), (String)null);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, float, float, float, android.graphics.Paint) void
   public void method_65(class_306 var1, float var2, float var3, float var4, Paint var5) {
      this.field_2702.pushTransform();
      this.field_2702.rotate(var2, var3, var4 + 90.0F);
      class_308 var6 = this.method_2263(var1);
      this.method_2251(var5, var6);
      this.field_2702.drawImage(var6.method_2138(), var2 - (float)var6.k, var3 - (float)var6.l, this.method_2245());
      this.field_2702.popTransform();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.Rect, float, float, float, android.graphics.Paint) void
   public void method_66(class_306 var1, Rect var2, float var3, float var4, float var5, Paint var6) {
      this.field_2702.pushTransform();
      this.field_2702.rotate(var3, var4, var5);
      class_308 var7 = this.method_2263(var1);
      this.method_2251(var6, var7);
      this.field_2702.drawImage(var7.method_2138(), var3 - (float)var7.k, var4 - (float)var7.l, (float)var2.field_2352, (float)var2.field_2353, (float)var2.field_2354, (float)var2.field_2355, this.method_2245());
      this.field_2702.popTransform();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.Rect, android.graphics.Rect, android.graphics.Paint) void
   public void method_67(class_306 var1, Rect var2, Rect var3, Paint var4) {
      this.field_2718.method_1971(var3);
      this.method_68(var1, var2, this.field_2718, var4);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.h.e) com.corrodinggames.rts.java.u
   private final class_308 method_2263(class_306 var1) {
      class_308 var2 = (class_308)var1.method_2115();
      return var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, android.graphics.Rect, android.graphics.RectF, android.graphics.Paint) void
   public void method_68(class_306 var1, Rect var2, RectF var3, Paint var4) {
      class_308 var5 = this.method_2263(var1);
      this.method_2251(var4, var5);
      this.field_2702.drawImage(var5.method_2138(), var3.field_2416, var3.field_2417, var3.field_2418, var3.field_2419, (float)var2.field_2352, (float)var2.field_2353, (float)var2.field_2354, (float)var2.field_2355, this.method_2245());
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, float, float, android.graphics.Paint) void
   public void method_69(class_306 var1, float var2, float var3, Paint var4) {
      this.method_71(var1, var2 - var1.field_2535, var3 - var1.field_2536, var4);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, float, float, android.graphics.Paint, float, float) void
   public void method_70(class_306 var1, float var2, float var3, Paint var4, float var5, float var6) {
      this.field_2702.pushTransform();
      this.field_2702.translate(var2, var3);
      this.field_2702.scale(var6, var6);
      this.field_2702.rotate(var2, var3, var5);
      class_308 var7 = this.method_2263(var1);
      this.method_2251(var4, var7);
      this.field_2702.drawImage(var7.method_2138(), 0.0F, 0.0F, this.method_2245());
      this.field_2702.popTransform();
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.h.e, float, float, android.graphics.Paint) void
   public void method_71(class_306 var1, float var2, float var3, Paint var4) {
      class_308 var5 = this.method_2263(var1);
      this.method_2251(var4, var5);
      this.field_2702.drawImage(var5.method_2138(), var2, var3, this.method_2245());
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
               this.field_2706.method_1911(0, 0, var12, var13);
               this.field_2707.method_1911(var8, var9, var8 + var12, var9 + var13);
               int var14 = this.field_2707.field_2352 - var2.field_2352;
               Rect var10000;
               if (var14 < 0) {
                  var10000 = this.field_2706;
                  var10000.field_2352 -= var14;
                  var10000 = this.field_2707;
                  var10000.field_2352 -= var14;
               }

               int var15 = this.field_2707.field_2353 - var2.field_2353;
               if (var15 < 0) {
                  var10000 = this.field_2706;
                  var10000.field_2353 -= var15;
                  var10000 = this.field_2707;
                  var10000.field_2353 -= var15;
               }

               this.method_67(var1, this.field_2706, this.field_2707, var3);
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
               this.field_2706.method_1911(0, 0, (int)var12, (int)var13);
               this.field_2708.method_1969(var8, var9, var8 + var12, var9 + var13);
               this.method_68(var1, this.field_2706, this.field_2708, var3);
               var9 += (float)(var11 - var7);
            }
         }

         var8 += (float)(var10 - var6);
      }

   }

   // $FF: renamed from: b (int) void
   public void method_75(int var1) {
      this.field_2711 = null;
      this.field_2702.setBackground(method_2259(var1, field_2701));
      this.field_2702.clear();
   }

   // $FF: renamed from: h () void
   public void method_97() {
      this.field_2711 = null;
      this.field_2702.clearAlphaMap();
   }

   // $FF: renamed from: a (int, android.graphics.PorterDuff.Mode) void
   public void method_76(int var1, Mode var2) {
      this.field_2711 = null;
      if (var2 != Mode.CLEAR) {
         this.method_75(var1);
      } else {
         this.method_75(var1);
         this.field_2702.clearAlphaMap();
      }
   }

   // $FF: renamed from: a (java.lang.String, float, float, android.graphics.Paint, android.graphics.Paint, float) void
   public void method_77(String var1, float var2, float var3, Paint var4, Paint var5, float var6) {
      float var7 = (float)this.method_102(var1, var4);
      field_2719.method_1969(var2, var3, var2 + var7, var3 + (float)this.method_101(var1, var4));
      class_296.method_2052(field_2719, var6);
      field_2720.method_1970(field_2719);
      if (var4.method_2800() == Paint$Align.field_2227) {
         field_2719.method_1972(-(var7 / 2.0F), 0.0F);
      }

      this.method_80(field_2719, var5);
      this.method_78(var1, field_2720.field_2416 + var6, field_2720.field_2419 - var6, var4);
   }

   // $FF: renamed from: a (java.lang.String, float, float, android.graphics.Paint) void
   public void method_78(String var1, float var2, float var3, Paint var4) {
      this.method_2249(var4, var1);
      int var5 = 0;
      int var6;
      if (var4.method_2800() == Paint$Align.field_2227) {
         var6 = this.field_2702.getFont().getWidth(var1);
         var5 -= var6 / 2;
      } else if (var4.method_2800() == Paint$Align.field_2228) {
         var6 = this.field_2702.getFont().getWidth(var1);
         var5 -= var6;
      }

      byte var10 = 0;
      int var7 = this.field_2702.getFont().getLineHeight();
      var6 = var10 - var7;
      int var8 = (int)(var2 + (float)var5);
      int var9 = (int)(var3 + (float)var6);
      this.field_2702.drawString(var1, (float)var8, (float)var9);
   }

   // $FF: renamed from: a (android.graphics.Rect, android.graphics.Paint) void
   public void method_79(Rect var1, Paint var2) {
      this.field_2718.method_1971(var1);
      this.method_80(this.field_2718, var2);
   }

   // $FF: renamed from: a (android.graphics.RectF, android.graphics.Paint) void
   public void method_80(RectF var1, Paint var2) {
      this.method_2250(var2, false);
      if (var2.method_2785() != Paint$Style.field_4585 && var2.method_2785() != Paint$Style.field_4587) {
         this.field_2702.drawRect(var1.field_2416, var1.field_2417, var1.method_1964(), var1.method_1965());
      } else {
         TextureImpl.bindNone();
         field_2705.glBegin(7);
         field_2705.glVertex2f(var1.field_2416, var1.field_2417);
         field_2705.glVertex2f(var1.field_2418, var1.field_2417);
         field_2705.glVertex2f(var1.field_2418, var1.field_2419);
         field_2705.glVertex2f(var1.field_2416, var1.field_2419);
         field_2705.glEnd();
      }

   }

   // $FF: renamed from: c () void
   public void method_81() {
      this.field_2711 = null;
      this.field_2721.method_1910();
      this.field_2722.clear();
      this.field_2698 = true;
   }

   // $FF: renamed from: b (android.graphics.Rect, android.graphics.Paint) void
   public void method_82(Rect var1, Paint var2) {
      this.field_2707.method_1911(var1.field_2352, var1.field_2353, var1.field_2352 + var1.field_2354, var1.field_2353 + var1.field_2355);
      this.method_79(this.field_2707, var2);
   }

   // $FF: renamed from: a (android.graphics.Rect) void
   public void method_83(Rect var1) {
      if (var1 == null) {
         this.field_2721.method_1910();
      } else {
         this.field_2721.method_1912(var1);
      }

      this.method_2264();
   }

   // $FF: renamed from: a (android.graphics.RectF) void
   public void method_84(RectF var1) {
      if (var1 == null) {
         this.field_2721.method_1910();
      } else {
         this.field_2721.method_1911((int)var1.field_2416, (int)var1.field_2417, (int)var1.field_2418, (int)var1.field_2419);
      }

      this.method_2264();
   }

   // $FF: renamed from: l () void
   public void method_2264() {
      if (!this.field_2721.method_1903()) {
         this.field_2702.setWorldClip((float)this.field_2721.field_2352, (float)this.field_2721.field_2353, (float)this.field_2721.method_1904(), (float)this.field_2721.method_1905());
      } else {
         this.field_2702.clearWorldClip();
      }

   }

   // $FF: renamed from: a (float, float, float, android.graphics.Paint) void
   public void method_85(float var1, float var2, float var3, Paint var4) {
      this.method_2250(var4, false);
      if (var4.method_2785() == Paint$Style.field_4586) {
         byte var5 = 40;
         if (var3 > 100.0F) {
            var5 = 60;
         }

         this.method_2265(var1, var2, var3, var5);
      } else {
         this.field_2702.fillOval(var1 - var3, var2 - var3, var3 * 2.0F, var3 * 2.0F);
      }

   }

   // $FF: renamed from: a (float[], int, int, android.graphics.Paint) void
   public void method_86(float[] var1, int var2, int var3, Paint var4) {
      this.method_2250(var4, false);
      float var5 = var4.method_2792();
      int var6 = var2 + var3;
      TextureImpl.bindNone();
      field_2705.glBegin(7);
      float var7 = 1.0F;
      float var8 = 0.0F;
      if (var5 > 1.0F) {
         var7 += (var5 - 1.0F) * 0.5F;
         var8 += (var5 - 1.0F) * 0.5F;
      }

      for(int var9 = var2; var9 < var6; var9 += 2) {
         float var10 = var1[var9];
         float var11 = var1[var9 + 1];
         float var12 = var10 - var8;
         float var13 = var10 + var7;
         float var14 = var11 - var8;
         float var15 = var11 + var7;
         field_2705.glVertex2f(var12, var14);
         field_2705.glVertex2f(var13, var14);
         field_2705.glVertex2f(var13, var15);
         field_2705.glVertex2f(var12, var15);
      }

      field_2705.glEnd();
   }

   // $FF: renamed from: a (float, float, float, int) void
   public void method_2265(float var1, float var2, float var3, int var4) {
      Graphics.setCurrent(this.field_2702);
      TextureImpl.bindNone();
      if (this.field_2723 != var4) {
         this.field_2723 = var4;
         this.field_2724 = 6.283185F / (float)var4;
         this.field_2725 = (float)FastTrig.cos((double)this.field_2724);
         this.field_2726 = (float)FastTrig.sin((double)this.field_2724);
      }

      float var5 = this.field_2725;
      float var6 = this.field_2726;
      float var8 = var3;
      float var9 = 0.0F;
      field_2727.start();
      ++var4;

      for(int var10 = 0; var10 < var4; ++var10) {
         field_2727.vertex(var8 + var1, var9 + var2);
         float var7 = var8;
         var8 = var5 * var8 - var6 * var9;
         var9 = var6 * var7 + var5 * var9;
      }

      field_2727.end();
   }

   // $FF: renamed from: d () void
   public void method_87() {
      this.field_2702.pushTransform();
      this.field_2722.push(new Rect(this.field_2721));
   }

   // $FF: renamed from: e () void
   public void method_88() {
      this.field_2702.popTransform();
      this.field_2721 = (Rect)this.field_2722.pop();
      this.method_2264();
   }

   // $FF: renamed from: f () void
   public void method_89() {
      this.field_2702.pushTransform();
   }

   // $FF: renamed from: g () void
   public void method_90() {
      this.field_2702.popTransform();
   }

   // $FF: renamed from: a (float, float, float) void
   public void method_91(float var1, float var2, float var3) {
      this.field_2702.rotate(var2, var3, var1);
   }

   // $FF: renamed from: a (float, float) void
   public void method_92(float var1, float var2) {
      this.field_2702.scale(var1, var2);
   }

   // $FF: renamed from: a (float, float, float, float) void
   public void method_93(float var1, float var2, float var3, float var4) {
      this.field_2702.translate(var3, var4);
      this.field_2702.scale(var1, var2);
      this.field_2702.translate(-var3, -var4);
   }

   // $FF: renamed from: b (float, float) void
   public void method_94(float var1, float var2) {
      this.field_2702.translate(var1, var2);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.i) void
   public void method_95(class_27 var1) {
      var1.method_146(this);
   }

   // $FF: renamed from: a (float, float, float, float, android.graphics.Paint) void
   public void method_96(float var1, float var2, float var3, float var4, Paint var5) {
      this.method_2250(var5, false);
      this.field_2702.drawLine(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (android.graphics.Paint) void
   public void method_98(Paint var1) {
      this.method_2255(var1, "", false);
   }

   // $FF: renamed from: i () void
   public void method_99() {
      this.field_2711 = null;
      this.field_2702.flush();
   }

   // $FF: renamed from: j () void
   public void method_100() {
      if (this.field_2702 != null) {
         this.field_2702.destroy();
      }

      this.field_2702 = null;
   }

   // $FF: renamed from: a (java.lang.String, android.graphics.Paint) int
   public int method_101(String var1, Paint var2) {
      this.method_2249(var2, var1);
      int var3 = this.field_2702.getFont().getLineHeight();
      return var3;
   }

   // $FF: renamed from: b (java.lang.String, android.graphics.Paint) int
   public int method_102(String var1, Paint var2) {
      this.method_2249(var2, var1);
      int var3 = this.field_2702.getFont().getWidth(var1);
      return var3;
   }
}
