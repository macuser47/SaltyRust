package com.corrodinggames.rts.java;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_305;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

// $FF: renamed from: com.corrodinggames.rts.java.u
public class class_308 extends class_306 {
   // $FF: renamed from: p java.util.ArrayList
   public static ArrayList field_2544;
   // $FF: renamed from: B org.newdawn.slick.Image
   private Image field_2545;
   // $FF: renamed from: q org.newdawn.slick.opengl.ImageData
   ImageData field_2546;
   // $FF: renamed from: r java.nio.ByteBuffer
   ByteBuffer field_2547;
   // $FF: renamed from: s java.lang.String
   String field_2548;
   // $FF: renamed from: t boolean
   boolean field_2549 = false;
   // $FF: renamed from: u int
   int field_2550 = 1;
   // $FF: renamed from: v boolean
   final boolean field_2551 = false;
   // $FF: renamed from: w boolean
   final boolean field_2552 = true;
   // $FF: renamed from: x boolean
   boolean field_2553 = false;
   // $FF: renamed from: y boolean
   boolean field_2554 = false;
   // $FF: renamed from: z long
   long field_2555 = -1L;
   // $FF: renamed from: A int
   static int field_2556 = 1000;

   // $FF: renamed from: t () org.newdawn.slick.Image
   public Image method_2138() {
      return this.field_2545;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_2113() {
      return this.field_2548;
   }

   public class_308() {
      if (field_2544 == null) {
         field_2544 = new ArrayList();
      }

      field_2544.add(this);
   }

   // $FF: renamed from: u () void
   public void method_2139() {
      if (this.field_2545 != null) {
         try {
            this.field_2545.destroy();
         } catch (SlickException var2) {
            throw new RuntimeException(var2);
         }
      }

      Image var1 = new Image(this.field_2546);
      this.field_2545 = var1;
      this.method_2143();
      this.i = this.field_2545.getWidth();
      this.j = this.field_2545.getHeight();
      this.f();
      this.r();
   }

   // $FF: renamed from: a (org.newdawn.slick.Image, java.lang.String) void
   public void method_2140(Image var1, String var2) {
      if (this.field_2545 != null) {
         class_236.method_1595("this.slickImage!=null");
      }

      this.field_2545 = var1;
      this.method_2143();
      this.i = this.field_2545.getWidth();
      this.j = this.field_2545.getHeight();
      this.f();
      this.field_2548 = var2;
      if (this.field_2548 != null) {
         File var3 = new File(this.field_2548);
         if (!var3.exists()) {
            throw new RuntimeException(this.field_2548 + " does not exist");
         }

         this.field_2555 = this.method_2145(true);
      }

   }

   // $FF: renamed from: a (org.newdawn.slick.opengl.ImageData, java.lang.String, boolean) void
   public void method_2141(ImageData var1, String var2, boolean var3) {
      this.field_2546 = var1;
      if (this.field_2546 instanceof ImageBuffer) {
         this.field_2547 = ByteBuffer.wrap(((ImageBuffer)this.field_2546).getRGBA());
      } else {
         this.field_2547 = this.field_2546.getImageBufferData();
      }

      if (!var3) {
         this.method_2139();
      }

      this.field_2548 = var2;
      if (this.field_2548 != null) {
         File var4 = new File(this.field_2548);
         if (!var4.exists()) {
            throw new RuntimeException(this.field_2548 + " does not exist");
         }

         this.field_2555 = this.method_2145(true);
      }

      this.f();
   }

   // $FF: renamed from: a (java.nio.ByteBuffer, java.nio.ByteBuffer) java.nio.ByteBuffer
   public static ByteBuffer method_2142(ByteBuffer var0, ByteBuffer var1) {
      var0.rewind();
      var1.put(var0);
      var0.rewind();
      var1.flip();
      return var1;
   }

   // $FF: renamed from: a (int, int, boolean) com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_2122(int var1, int var2, boolean var3) {
      class_308 var4 = new class_308();
      ImageBuffer var5 = new ImageBuffer(var1, var2);
      var4.field_2546 = var5;
      var4.field_2547 = ByteBuffer.wrap(var5.getRGBA());
      if (var3) {
         boolean var6 = true;
         if (var6) {
            ByteBuffer var7 = this.field_2546.getImageBufferData();
            method_2142(var7, var4.field_2547);
         } else {
            for(int var9 = 0; var9 < var1; ++var9) {
               for(int var8 = 0; var8 < var2; ++var8) {
                  var4.method_2126(var9, var8, this.method_2125(var9, var8));
               }
            }
         }
      }

      var4.method_2141(var5, this.field_2548, true);
      var4.i = var1;
      var4.j = var2;
      var4.f();
      var4.field_2549 = true;
      return var4;
   }

   // $FF: renamed from: h () void
   public void method_2123() {
      if (!this.field_2553) {
         this.method_2124();
      }

   }

   // $FF: renamed from: i () void
   public void method_2124() {
      this.field_2553 = true;
   }

   // $FF: renamed from: a (int, int) int
   public int method_2125(int var1, int var2) {
      return class_339.method_2257(this.field_2546, this.field_2547, var1, var2);
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_2126(int var1, int var2, int var3) {
      class_339.method_2256(this.field_2546, this.field_2547, var1, var2, Color.method_3073(var3), Color.method_3074(var3), Color.method_3075(var3), Color.method_3072(var3));
   }

   // $FF: renamed from: n () void
   public void method_2131() {
      if (this.field_2553) {
         this.field_2553 = false;
         this.method_2139();
      }
   }

   // $FF: renamed from: o () void
   public void method_2132() {
   }

   // $FF: renamed from: l () void
   public void method_2129() {
      this.field_2554 = true;
   }

   // $FF: renamed from: m () void
   public void method_2130() {
      this.field_2546 = null;
      this.field_2547 = null;
      if (field_2544 != null) {
         field_2544.remove(this);
      }

      if (this.field_2545 != null) {
         try {
            this.field_2545.destroy();
         } catch (SlickException var2) {
            var2.printStackTrace();
         }

         this.field_2545 = null;
      }

   }

   protected void finalize() {
      if (this.field_2554) {
         this.method_2130();
      }

      if (this.field_2545 != null) {
         class_236.method_1588("SlickBitmapOrTexture: Leak detection: finalize called with slickImage!=null");
      }

   }

   // $FF: renamed from: g () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_2121() {
      return this.method_2122(this.i, this.j, true);
   }

   // $FF: renamed from: e () void
   protected void method_2117() {
      this.method_2143();
   }

   // $FF: renamed from: v () void
   public void method_2143() {
      if (this.field_2545 == null) {
         class_236.method_1588("slickImage==null");
         class_236.method_1594();
      }

      if (!this.h) {
         this.field_2550 = 2;
         this.field_2545.setFilter(2);
      } else {
         this.field_2550 = 1;
         this.field_2545.setFilter(1);
      }

   }

   // $FF: renamed from: w () void
   public void method_2144() {
      if (this.field_2549) {
         class_236.method_1591("reloadImage: skipping cloned image:" + this.field_2548);
      } else if (this.field_2548 == null) {
         class_236.method_1591("reloadImage: filepath is null, skipping");
      } else {
         try {
            class_236.method_1591("reloadImage: reloading:" + this.field_2548);
            if (this.field_2545 != null) {
               this.field_2545.destroy();
            } else {
               class_236.method_1591("slickImage==null cannot free");
            }

            ++field_2556;
            FileInputStream var1 = new FileInputStream(this.field_2548);

            try {
               this.field_2545 = new Image(var1, "reload_" + field_2556, false);
            } catch (NullPointerException var3) {
               throw new IOException("Failed to reload", var3);
            }

            this.r();
            this.method_2143();
            this.i = this.field_2545.getWidth();
            this.j = this.field_2545.getHeight();
            this.f();
            var1.close();
         } catch (SlickException var4) {
            class_236.method_1591("reloadImage: failed");
            var4.printStackTrace();
         } catch (IOException var5) {
            class_236.method_1591("reloadImage: failed");
            var5.printStackTrace();
         }

         class_236.method_1549().field_1932.method_2604();
      }
   }

   // $FF: renamed from: b (boolean) long
   public long method_2145(boolean var1) {
      return this.field_2548 == null ? -2L : class_305.method_2107(this.field_2548, var1);
   }

   // $FF: renamed from: p () void
   public void method_2133() {
      long var1 = this.method_2145(false);
      if (this.field_2555 == -1L) {
         this.field_2555 = var1;
      } else if (this.field_2555 != var1) {
         class_236.method_1591("reloadImage: '" + this.field_2548 + "' reloading current now:" + var1);
         this.method_2144();
         this.field_2555 = var1;
      }

   }

   // $FF: synthetic method
   public Object clone() {
      return this.method_2121();
   }
}
