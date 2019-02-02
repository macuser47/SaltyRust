package com.corrodinggames.rts.game.b;

import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Map.Entry;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// $FF: renamed from: com.corrodinggames.rts.game.b.i
public class class_420 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_3490;
   // $FF: renamed from: b java.lang.String
   public String field_3491;
   // $FF: renamed from: c int
   int field_3492;
   // $FF: renamed from: d int
   int field_3493;
   // $FF: renamed from: e int
   int field_3494;
   // $FF: renamed from: f int
   int field_3495;
   // $FF: renamed from: g int
   int field_3496 = 0;
   // $FF: renamed from: h int
   int field_3497 = 0;
   // $FF: renamed from: i int
   int field_3498;
   // $FF: renamed from: j float
   float field_3499;
   // $FF: renamed from: k int
   public int field_3500;
   // $FF: renamed from: l int
   public int field_3501 = Integer.MAX_VALUE;
   // $FF: renamed from: m short
   public short field_3502;
   // $FF: renamed from: n com.corrodinggames.rts.game.b.b
   public class_408 field_3503;
   // $FF: renamed from: o boolean
   public boolean field_3504 = false;
   // $FF: renamed from: p boolean
   public boolean field_3505 = false;
   // $FF: renamed from: u java.util.HashMap
   private HashMap field_3506 = new HashMap();
   // $FF: renamed from: q java.lang.String
   static String field_3507 = "[EMBED]";
   // $FF: renamed from: r java.util.ArrayList
   static ArrayList field_3508 = new ArrayList();
   // $FF: renamed from: s android.graphics.Rect
   Rect field_3509 = new Rect();
   // $FF: renamed from: t int
   int field_3510 = -1;

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b, org.w3c.dom.Element) java.lang.String
   public strictfp String method_2664(class_408 var1, Element var2) {
      Element var3 = (Element)var2.getElementsByTagName("properties").item(0);
      if (var3 != null) {
         NodeList var4 = var3.getElementsByTagName("property");

         for(int var5 = 0; var5 < var4.getLength(); ++var5) {
            Element var6 = (Element)var4.item(var5);
            String var7 = var6.getAttribute("name");
            if (var7.equals("embedded_png")) {
               String var8 = var6.getAttribute("value");
               if (var8 != null && !var8.equals("")) {
                  return var8;
               }

               Node var9 = var6.getFirstChild();
               if (var9 != null) {
                  String var10 = var9.getNodeValue();
                  return var10;
               }
            }
         }
      }

      return null;
   }

   public strictfp class_420(class_408 var1, Element var2) {
      this.field_3503 = var1;
      this.field_3500 = Integer.parseInt(var2.getAttribute("firstgid"));
      String var3 = var2.getAttribute("source");
      if (var3 != null && !var3.equals("")) {
         try {
            InputStream var4 = var1.method_2626("tilesets/", var3);
            DocumentBuilder var5 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document var6 = var5.parse(var4);
            Element var7 = var6.getDocumentElement();
            var2 = var7;
         } catch (Exception var18) {
            class_236.method_1549().method_1608("Unable to load or parse sourced tileset: tilesets/" + var3, 1);
            throw new RuntimeException("Unable to load or parse sourced tileset: tilesets/" + var3, var18);
         }
      }

      NodeList var19 = var2.getElementsByTagName("image");
      if (var19.getLength() > 0) {
         Element var20 = (Element)var19.item(0);
         String var22 = var20.getAttribute("source");
         var22 = var22.trim();
         this.field_3491 = class_236.method_1640(var22);
      }

      String var21 = this.method_2664(var1, var2);
      if (var21 != null) {
         this.field_3491 = method_2665(var21, this.field_3491);
      }

      if (this.field_3491 == null) {
         throw new RuntimeException("Map tileset is missing an image tag or embedded image data");
      } else {
         this.field_3492 = var1.field_3330;
         this.field_3493 = var1.field_3331;
         if (var2.hasAttribute("tilewidth")) {
            this.field_3492 = Integer.parseInt(var2.getAttribute("tilewidth"));
            this.field_3493 = Integer.parseInt(var2.getAttribute("tileheight"));
         }

         if (class_236.method_1550()) {
            this.field_3492 = var1.field_3330;
            this.field_3493 = var1.field_3331;
         }

         int var23 = 0;
         if (var2.hasAttribute("spacing")) {
            var23 = Integer.parseInt(var2.getAttribute("spacing"));
         }

         this.field_3494 = this.field_3492 + var23;
         this.field_3495 = this.field_3493 + var23;
         NodeList var24 = var2.getElementsByTagName("tile");

         for(int var8 = 0; var8 < var24.getLength(); ++var8) {
            Element var9 = (Element)var24.item(var8);
            int var10 = Integer.parseInt(var9.getAttribute("id"));
            var10 += this.field_3500;
            Properties var11 = new Properties();
            Element var12 = (Element)var9.getElementsByTagName("properties").item(0);
            if (var12 != null) {
               NodeList var13 = var12.getElementsByTagName("property");

               for(int var14 = 0; var14 < var13.getLength(); ++var14) {
                  Element var15 = (Element)var13.item(var14);
                  String var16 = var15.getAttribute("name");
                  String var17 = var15.getAttribute("value");
                  if ("unit".equalsIgnoreCase(var16) || "customUnit".equalsIgnoreCase(var16)) {
                     this.field_3505 = true;
                  }

                  var11.setProperty(var16, var17);
               }
            }

            this.field_3506.put(new Integer(var10), var11);
         }

      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   public static strictfp String method_2665(String var0, String var1) {
      Iterator var2 = field_3508.iterator();

      class_418 var3;
      do {
         if (!var2.hasNext()) {
            class_418 var4 = new class_418();
            var4.field_3472 = false;
            var4.field_3475 = null;
            var4.field_3476 = var0;
            var4.field_3473 = field_3507;
            var4.field_3474 = field_3507 + class_418.field_3471;
            var4.field_3477 = var1;
            ++class_418.field_3471;
            field_3508.add(var4);
            return var4.field_3474;
         }

         var3 = (class_418)var2.next();
      } while(!var0.equalsIgnoreCase(var3.field_3476));

      return var3.field_3474;
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.h.e
   public static strictfp class_306 method_2666(String var0) {
      class_236 var1 = class_236.method_1549();
      String var2 = "tilesets/bitmaps/";
      if (var0.startsWith(field_3507)) {
         var2 = field_3507;
      }

      class_418 var3 = null;
      Iterator var4 = field_3508.iterator();

      while(var4.hasNext()) {
         class_418 var5 = (class_418)var4.next();
         if (var0.equalsIgnoreCase(var5.field_3474) && var2.equalsIgnoreCase(var5.field_3473)) {
            var3 = var5;
            break;
         }
      }

      InputStream var11;
      if (var3 != null) {
         if (var3.field_3476 != null) {
            var11 = class_425.method_2704(var3.field_3476, "base64", "");
            BufferedInputStream var13 = new BufferedInputStream(var11);
            boolean var14 = false;

            class_306 var15;
            try {
               var15 = var1.field_1935.method_62(var13, var14);
            } catch (RuntimeException var9) {
               var9.printStackTrace();
               throw new RuntimeException("Error loading embedded base64 image:" + var3.field_3477 + " - " + var9.getMessage());
            }

            if (var15 == null) {
               throw new RuntimeException("Embedded tilesetBitmap is null for: " + var0);
            }

            var3.field_3475 = var15;
            var3.field_3476 = null;
         }

         var3.field_3472 = true;
         return var3.field_3475;
      } else {
         try {
            var11 = var1.field_1932.method_2626(var2, var0);
         } catch (IOException var10) {
            throw new RuntimeException(var10);
         }

         boolean var12 = false;
         class_306 var6 = var1.field_1935.method_62(var11, var12);
         if (var6 == null) {
            throw new RuntimeException("tilesetBitmap is null for: " + var0);
         } else {
            var6.field_2526 = "tilesets/" + var0;
            class_418 var7 = new class_418();
            var7.field_3472 = true;
            var7.field_3475 = var6;
            var7.field_3473 = var2;
            var7.field_3474 = var0;
            field_3508.add(var7);
            return var7.field_3475;
         }
      }
   }

   // $FF: renamed from: a () void
   public static strictfp void method_2667() {
      class_418 var1;
      for(Iterator var0 = field_3508.iterator(); var0.hasNext(); var1.field_3472 = false) {
         var1 = (class_418)var0.next();
      }

   }

   // $FF: renamed from: b () void
   public static strictfp void method_2668() {
      Iterator var0 = field_3508.iterator();

      while(var0.hasNext()) {
         class_418 var1 = (class_418)var0.next();
         if (!var1.field_3472) {
            if (var1.field_3475 != null) {
               var1.field_3475.method_2130();
               var1.field_3475 = null;
            }

            var1.field_3476 = null;
            var0.remove();
         }
      }

   }

   // $FF: renamed from: c () void
   strictfp void method_2669() {
      this.field_3490 = method_2666(this.field_3491);
      this.field_3498 = this.field_3490.method_2128() / this.field_3494;
      if (this.field_3498 == 0) {
         this.field_3498 = 1;
      }

      this.field_3499 = 1.0F / (float)this.field_3498;
   }

   // $FF: renamed from: a (int) java.util.Properties
   public strictfp Properties method_2670(int var1) {
      return (Properties)this.field_3506.get(new Integer(var1));
   }

   // $FF: renamed from: a (int, android.graphics.Rect) void
   public strictfp void method_2671(int var1, Rect var2) {
      int var3 = var1 % this.field_3498;
      int var4 = (int)((float)var1 * this.field_3499);
      int var5 = this.field_3496 + var3 * this.field_3494;
      int var6 = this.field_3497 + var4 * this.field_3495;
      var2.method_1911(var5, var6, var5 + this.field_3492, var6 + this.field_3493);
   }

   // $FF: renamed from: b (int) android.graphics.Rect
   public strictfp Rect method_2672(int var1) {
      if (this.field_3510 == var1) {
         return this.field_3509;
      } else {
         this.field_3510 = var1;
         this.method_2671(var1, this.field_3509);
         return this.field_3509;
      }
   }

   // $FF: renamed from: c (int) void
   public strictfp void method_2673(int var1) {
      this.field_3501 = var1;
   }

   // $FF: renamed from: d (int) boolean
   public strictfp boolean method_2674(int var1) {
      return var1 >= this.field_3500 && var1 <= this.field_3501;
   }

   // $FF: renamed from: d () void
   public strictfp void method_2675() {
      this.field_3490 = null;
      this.field_3503 = null;
      this.field_3506 = null;
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) java.lang.Integer
   public strictfp Integer method_2676(String var1, String var2) {
      Iterator var3 = this.field_3506.entrySet().iterator();

      Integer var5;
      String var7;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         Entry var4 = (Entry)var3.next();
         var5 = (Integer)var4.getKey();
         Properties var6 = (Properties)var4.getValue();
         var7 = var6.getProperty(var1);
      } while(var7 == null || !var7.equals(var2));

      return var5;
   }
}
