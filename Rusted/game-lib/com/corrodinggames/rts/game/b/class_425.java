package com.corrodinggames.rts.game.b;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// $FF: renamed from: com.corrodinggames.rts.game.b.e
public class class_425 {
   // $FF: renamed from: z byte[]
   private static byte[] field_3548 = new byte[256];
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.p
   static class_441 field_3549;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.p[]
   static class_441[] field_3550;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.p
   static class_441 field_3551;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.p
   static class_441 field_3552;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.h.p
   static class_441 field_3553;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.p
   static class_441 field_3554;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.p
   static class_441 field_3555;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.h.p[]
   static class_441[] field_3556;
   // $FF: renamed from: i android.graphics.Paint
   Paint field_3557 = new Paint();
   // $FF: renamed from: j com.corrodinggames.rts.game.b.b
   public class_408 field_3558;
   // $FF: renamed from: k int
   public int field_3559;
   // $FF: renamed from: l java.lang.String
   public String field_3560;
   // $FF: renamed from: m java.lang.String
   public String field_3561;
   // $FF: renamed from: n boolean
   public boolean field_3562;
   // $FF: renamed from: o short
   public short field_3563;
   // $FF: renamed from: p short
   public short field_3564;
   // $FF: renamed from: q java.util.Properties
   public Properties field_3565;
   // $FF: renamed from: r com.corrodinggames.rts.game.b.g[][]
   public class_416[][] field_3566;
   // $FF: renamed from: s boolean
   public boolean field_3567;
   // $FF: renamed from: t android.graphics.Rect
   Rect field_3568 = new Rect();
   // $FF: renamed from: u android.graphics.Rect
   Rect field_3569 = new Rect();
   // $FF: renamed from: v android.graphics.RectF
   RectF field_3570 = new RectF();
   // $FF: renamed from: w int
   final int field_3571 = Integer.MIN_VALUE;
   // $FF: renamed from: x int
   final int field_3572 = 1073741824;
   // $FF: renamed from: y int
   final int field_3573 = 536870912;

   // $FF: renamed from: a () com.corrodinggames.rts.game.b.g[][]
   public class_416[][] method_2699() {
      if (this.field_3566 == null) {
         this.field_3566 = new class_416[this.field_3563][this.field_3564];
      }

      return this.field_3566;
   }

   // $FF: renamed from: a (int, int, com.corrodinggames.rts.game.b.g) void
   public void method_2700(int var1, int var2, class_416 var3) {
      if (this.field_3566 == null) {
         this.field_3566 = new class_416[this.field_3563][this.field_3564];
      }

      if (var3.field_3428) {
         boolean var4 = false;
         Iterator var5 = this.field_3558.field_3341.iterator();

         while(var5.hasNext()) {
            Point var6 = (Point)var5.next();
            if (var6.field_4722 == var1 && var6.field_4723 == var2) {
               class_236.method_1591("resPools point:" + var1 + ", " + var2 + " already exists");
               var4 = true;
            }
         }

         if (!var4) {
            this.field_3558.field_3341.add(new Point(var1, var2));
         }
      }

      this.field_3566[var1][var2] = var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.l, float, float, float, float, float, float, float, float, boolean, boolean, boolean) void
   public void method_2701(class_22 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, boolean var10, boolean var11, boolean var12) {
      class_236 var13 = class_236.method_1549();
      var1.method_87();
      int var14 = (int)(var4 * this.field_3558.field_3334);
      if (var14 < 0) {
         var14 = 0;
      }

      int var15 = (int)(var5 * this.field_3558.field_3335);
      if (var15 < 0) {
         var15 = 0;
      }

      int var16 = (int)((var4 + var6) * this.field_3558.field_3334);
      if (var16 > this.field_3563 - 1) {
         var16 = this.field_3563 - 1;
      }

      int var17 = (int)((var5 + var7) * this.field_3558.field_3335);
      if (var17 > this.field_3564 - 1) {
         var17 = this.field_3564 - 1;
      }

      byte[][] var18 = var13.field_1915.field_1242;
      float var19 = var2 * var8;
      float var20 = var3 * var9;
      float var21 = (float)this.field_3558.field_3330 * var8;
      float var22 = (float)this.field_3558.field_3331 * var9;
      boolean var23 = class_408.field_3347;
      byte var24 = 15;
      if (var23) {
      }

      if (!var11) {
         var24 = 10;
      }

      boolean var25 = this.field_3558.field_3346;
      if (var25) {
         var24 = 15;
      }

      if (var10 && var18 == null) {
         var10 = false;
      }

      class_441 var26 = field_3550[5];
      class_441 var27 = field_3549;
      class_441 var28 = field_3551;
      var28.method_2790(255);
      if (var25) {
         var27 = field_3550[7];
         float var29 = 1.0F - (1.0F - (float)var26.method_2789() / 255.0F) * (1.0F - (float)var27.method_2789() / 255.0F);
         var28.method_2790((int)(var29 * 255.0F));
      }

      boolean var48 = false;
      if (class_236.method_1654() && var8 < 1.0F && var9 < 1.0F) {
         var48 = true;
      }

      class_441 var30;
      if (!this.field_3567) {
         var30 = field_3554;
         if (var48) {
            var30 = field_3555;
         }
      } else {
         var30 = field_3552;
         if (var48) {
            var30 = field_3553;
         }
      }

      class_441 var31 = var30;
      float var32 = 0.0F;
      float var33 = 0.0F;
      boolean var34 = false;
      if (!class_236.method_1654()) {
         var34 = true;
      } else if (!var12 && (var8 < 1.0F || var9 < 1.0F)) {
         var32 = 0.5F * var8;
      }

      class_416[][] var35 = this.method_2699();

      for(int var36 = var14; var36 < var16 + 1; ++var36) {
         for(int var37 = var15; var37 < var17 + 1; ++var37) {
            class_416 var38 = var35[var36][var37];
            if (var38 != null) {
               byte var39 = 0;
               if (var10) {
                  var39 = var18[var36][var37];
               }

               if (var39 != var24) {
                  float var40 = (float)var36 * var21 + var33;
                  float var41 = (float)var37 * var22 + var33;
                  class_420 var42 = null;
                  Rect var43 = null;
                  if (!var12) {
                     var42 = var38.field_3423;
                     var43 = var42.method_2672(var38.field_3424);
                  }

                  float var44 = (float)(var36 + 1) * var21 + var32;
                  float var45 = (float)(var37 + 1) * var22 + var32;
                  this.field_3570.method_1969(var40 - var19, var41 - var20, var44 - var19, var45 - var20);
                  if (var48 && !var12) {
                     this.field_3570.field_2417 = (float)((int)this.field_3570.field_2417);
                     this.field_3570.field_2416 = (float)((int)this.field_3570.field_2416);
                  }

                  if (!var34) {
                     if (!var12) {
                        var1.method_68(var42.field_3490, var43, this.field_3570, var31);
                     }
                  } else {
                     this.field_3569.method_1911((int)(var40 - var19), (int)(var41 - var20), (int)(var44 - var19), (int)(var45 - var20));
                     if (!var12) {
                        var1.method_67(var42.field_3490, var43, this.field_3569, var31);
                     }
                  }

                  if (var10 && this.field_3567 && var11) {
                     byte var51;
                     if (!var23) {
                        if (var39 != 0) {
                           var51 = var39;
                           if (var25 && var39 > 7) {
                              var51 = (byte)(var39 - 2);
                           }

                           if (var51 < 0) {
                              var51 = 0;
                           }

                           if (var51 > 10) {
                              var51 = 10;
                           }

                           var1.method_80(this.field_3570, field_3550[var51]);
                        }
                     } else if (var39 != 0 || this.field_3558.field_3351[var36][var37] != 0 || this.field_3558.field_3350[var36][var37] != 0) {
                        class_306 var50;
                        if (var39 >= 5) {
                           if (var12 && (var39 == 10 || this.field_3558.field_3350[var36][var37] == 0)) {
                              int var46;
                              for(var46 = var37 + 1; var46 < var17; ++var46) {
                                 byte var47 = var18[var36][var46];
                                 if (var39 != var47 || var39 != 10 && this.field_3558.field_3350[var36][var46] != 0) {
                                    break;
                                 }
                              }

                              --var46;
                              if (var46 > var37) {
                                 RectF var10000 = this.field_3570;
                                 var10000.field_2419 += (float)(var46 - var37) * var22;
                                 var37 = var46;
                              }
                           }

                           class_441 var49;
                           if (var39 == 10) {
                              var49 = var28;
                           } else {
                              var49 = var26;
                           }

                           var1.method_80(this.field_3570, var49);
                        } else {
                           var51 = this.field_3558.field_3351[var36][var37];
                           if (var51 == 127) {
                              var51 = this.field_3558.method_2615(var36, var37, var18, (byte)5);
                              this.field_3558.field_3351[var36][var37] = var51;
                           }

                           if (var51 != 0) {
                              var50 = class_408.field_3349[var51 + 128];
                              if (var50 != null) {
                                 this.field_3568.method_1911(0, 0, this.field_3558.field_3330, this.field_3558.field_3331);
                                 var1.method_68(var50, this.field_3568, this.field_3570, var26);
                              } else if (!this.field_3558.field_3327[var51 + 128]) {
                                 class_236.method_1591("SmoothFog, missing: " + var51);
                                 this.field_3558.field_3327[var51 + 128] = true;
                              }
                           }
                        }

                        if (var39 != 10) {
                           var51 = this.field_3558.field_3350[var36][var37];
                           if (var51 == 127) {
                              var51 = this.field_3558.method_2615(var36, var37, var18, (byte)10);
                              this.field_3558.field_3350[var36][var37] = var51;
                           }

                           if (var51 != 0) {
                              var50 = class_408.field_3349[var51 + 128];
                              if (var50 != null) {
                                 this.field_3568.method_1911(0, 0, this.field_3558.field_3330, this.field_3558.field_3331);
                                 var1.method_68(var50, this.field_3568, this.field_3570, var27);
                              } else if (!this.field_3558.field_3327[var51 + 128]) {
                                 class_236.method_1591("SmoothFog, missing: " + var51);
                                 this.field_3558.field_3327[var51 + 128] = true;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      var1.method_88();
   }

   // $FF: renamed from: b () void
   public void method_2702() {
      this.field_3566 = (class_416[][])null;
      this.field_3565 = null;
      this.field_3558 = null;
   }

   class_425(class_408 var1, Element var2) {
      Log.method_1712("RustedWarfare", "MapLayer create");
      this.field_3558 = var1;
      this.field_3560 = var2.getAttribute("name");
      if (this.field_3560 != null) {
         this.field_3561 = this.field_3560.toLowerCase(Locale.ENGLISH);
      }

      this.field_3562 = this.field_3561.contains("items");
      this.field_3563 = Short.parseShort(var2.getAttribute("width"));
      this.field_3564 = Short.parseShort(var2.getAttribute("height"));
      Element var3 = (Element)var2.getElementsByTagName("properties").item(0);
      String var8;
      if (var3 != null) {
         NodeList var4 = var3.getElementsByTagName("property");
         if (var4 != null) {
            this.field_3565 = new Properties();

            for(int var5 = 0; var5 < var4.getLength(); ++var5) {
               Element var6 = (Element)var4.item(var5);
               String var7 = var6.getAttribute("name");
               var8 = var6.getAttribute("value");
               this.field_3565.setProperty(var7, var8);
            }
         }
      }

      Element var12 = (Element)var2.getElementsByTagName("data").item(0);
      String var13 = var12.getAttribute("encoding");
      String var14 = var12.getAttribute("compression");

      try {
         Node var15 = var12.getFirstChild();
         var8 = var15.getNodeValue();
         InputStream var9 = method_2704(var8, var13, var14);
         BufferedInputStream var10 = new BufferedInputStream(var9);
         this.method_2703(var10);
         if (var10 != null) {
            var10.close();
         }

         if (var9 != null) {
            var9.close();
         }

      } catch (IOException var11) {
         throw new RuntimeException("Unable to decode base 64 block", var11);
      }
   }

   // $FF: renamed from: a (java.io.InputStream) void
   void method_2703(InputStream var1) {
      class_416 var2 = null;
      int var3 = -1;
      HashMap var4 = new HashMap();

      for(short var5 = 0; var5 < this.field_3564; ++var5) {
         for(short var6 = 0; var6 < this.field_3563; ++var6) {
            byte var7 = 0;
            int var13 = var7 | var1.read();
            var13 |= var1.read() << 8;
            var13 |= var1.read() << 16;
            var13 |= var1.read() << 24;
            boolean var8 = (var13 & Integer.MIN_VALUE) != 0;
            boolean var9 = (var13 & 1073741824) != 0;
            boolean var10 = (var13 & 536870912) != 0;
            var13 &= 536870911;
            if (!var8 && !var9 && var10) {
            }

            if (var13 != 0) {
               if (var3 == var13 && var2 != null) {
                  this.method_2700(var6, var5, var2);
               } else {
                  class_416 var11 = (class_416)var4.get(var13);
                  if (var11 != null) {
                     var2 = var11;
                     var3 = var13;
                     this.method_2700(var6, var5, var11);
                  } else {
                     class_420 var12 = this.field_3558.method_2608(var13);
                     if (var12 == null) {
                        throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + var13);
                     }

                     var2 = class_416.method_2639(this.field_3558, this, var12, var13 - var12.field_3500, var6, var5);
                     if (var2 != null) {
                        this.method_2700(var6, var5, var2);
                        var4.put(var13, var2);
                     }

                     var3 = var13;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) java.io.InputStream
   public static InputStream method_2704(String var0, String var1, String var2) {
      if (var1.equals("base64")) {
         char[] var4 = var0.toCharArray();
         byte[] var3 = method_2705(var4);
         Object var7;
         if ("gzip".equals(var2)) {
            try {
               GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var3));
               var7 = var5;
            } catch (IOException var6) {
               throw new class_424("Unable to decode block in map", var6);
            }
         } else if ("".equals(var2)) {
            var7 = new ByteArrayInputStream(var3);
         } else {
            if (!"zlib".equals(var2)) {
               throw new class_424("Unsupport tiled map compression: " + var1 + "," + var2 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
            }

            InflaterInputStream var8 = new InflaterInputStream(new ByteArrayInputStream(var3));
            var7 = var8;
         }

         return (InputStream)var7;
      } else {
         throw new class_424("Unsupport tiled map encoding: " + var1 + "," + var2 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
      }
   }

   // $FF: renamed from: a (char[]) byte[]
   public static byte[] method_2705(char[] var0) {
      int var1 = var0.length;

      int var2;
      for(var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] > 255 || field_3548[var0[var2]] < 0) {
            --var1;
         }
      }

      var2 = var1 / 4 * 3;
      if (var1 % 4 == 3) {
         var2 += 2;
      }

      if (var1 % 4 == 2) {
         ++var2;
      }

      byte[] var3 = new byte[var2];
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < var0.length; ++var7) {
         byte var8 = var0[var7] > 255 ? -1 : field_3548[var0[var7]];
         if (var8 >= 0) {
            var5 <<= 6;
            var4 += 6;
            var5 |= var8;
            if (var4 >= 8) {
               var4 -= 8;
               var3[var6++] = (byte)(var5 >> var4 & 255);
            }
         }
      }

      if (var6 != var3.length) {
         throw new RuntimeException("Data length appears to be wrong (wrote " + var6 + " should be " + var3.length + ")");
      } else {
         return var3;
      }
   }

   static {
      int var0;
      for(var0 = 0; var0 < 256; ++var0) {
         field_3548[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field_3548[var0] = (byte)(var0 - 65);
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field_3548[var0] = (byte)(26 + var0 - 97);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field_3548[var0] = (byte)(52 + var0 - 48);
      }

      field_3548[43] = 62;
      field_3548[47] = 63;
      field_3549 = new class_441();
      field_3549.b(-16777216);
      field_3549.a(Paint$Style.field_4585);
      field_3550 = new class_441[11];

      for(var0 = 0; var0 <= 10; ++var0) {
         field_3550[var0] = new class_441();
         field_3550[var0].b(-16777216);
         field_3550[var0].a(Paint$Style.field_4585);
         field_3550[var0].c(var0 * 25);
      }

      field_3551 = new class_441();
      field_3551.b(-16777216);
      field_3551.a(Paint$Style.field_4585);
      field_3552 = new class_441();
      field_3553 = new class_441();
      field_3553.a(true);
      field_3554 = new class_441();
      field_3555 = new class_441();
      field_3555.a(true);
      field_3556 = new class_441[11];

      for(var0 = 0; var0 <= 10; ++var0) {
         class_441 var1 = new class_441();
         var1.a(new LightingColorFilter(Color.method_3076(255 - var0 * 25, 255 - var0 * 25, 255 - var0 * 25), 0));
         field_3556[var0] = var1;
      }

   }
}
