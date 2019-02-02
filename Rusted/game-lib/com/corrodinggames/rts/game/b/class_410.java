package com.corrodinggames.rts.game.b;

import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import java.util.Locale;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

// $FF: renamed from: com.corrodinggames.rts.game.b.a
public class class_410 {
   // $FF: renamed from: a int
   public int field_3386;
   // $FF: renamed from: b java.lang.String
   public String field_3387;
   // $FF: renamed from: c java.lang.String
   public String field_3388;
   // $FF: renamed from: d java.lang.String
   public String field_3389;
   // $FF: renamed from: e float
   public float field_3390;
   // $FF: renamed from: f float
   public float field_3391;
   // $FF: renamed from: g float
   public float field_3392;
   // $FF: renamed from: h float
   public float field_3393;
   // $FF: renamed from: i float
   public float field_3394;
   // $FF: renamed from: q java.lang.String
   private String field_3395;
   // $FF: renamed from: j android.graphics.RectF
   public RectF field_3396;
   // $FF: renamed from: k int
   public int field_3397 = -1;
   // $FF: renamed from: l com.corrodinggames.rts.game.b.i
   public class_420 field_3398;
   // $FF: renamed from: m int
   public int field_3399 = -1;
   // $FF: renamed from: n java.util.Properties
   public Properties field_3400;
   // $FF: renamed from: o android.graphics.Rect
   Rect field_3401 = new Rect();
   // $FF: renamed from: p android.graphics.RectF
   RectF field_3402 = new RectF();

   public class_410(Element var1, class_408 var2) {
      this.field_3387 = var1.getAttribute("name");
      if (this.field_3387 != null) {
         this.field_3388 = this.field_3387.trim().toLowerCase(Locale.ENGLISH);
      }

      this.field_3389 = var1.getAttribute("type");
      this.field_3390 = Float.parseFloat(var1.getAttribute("x"));
      this.field_3391 = Float.parseFloat(var1.getAttribute("y"));
      if (var1.hasAttribute("rotation")) {
         this.field_3394 = Float.parseFloat(var1.getAttribute("rotation")) - 90.0F;
      }

      if (!var1.getAttribute("width").equals("")) {
         this.field_3392 = Float.parseFloat(var1.getAttribute("width"));
      }

      if (!var1.getAttribute("height").equals("")) {
         this.field_3393 = Float.parseFloat(var1.getAttribute("height"));
      }

      Element var3 = (Element)var1.getElementsByTagName("image").item(0);
      if (var3 != null) {
         this.field_3395 = var3.getAttribute("source");
      }

      Element var4 = (Element)var1.getElementsByTagName("properties").item(0);
      String var8;
      String var9;
      if (var4 != null) {
         NodeList var5 = var4.getElementsByTagName("property");
         if (var5 != null) {
            this.field_3400 = new Properties();

            for(int var6 = 0; var6 < var5.getLength(); ++var6) {
               Element var7 = (Element)var5.item(var6);
               var8 = var7.getAttribute("name");
               var9 = "";
               if (var7.hasAttribute("value")) {
                  var9 = var7.getAttribute("value");
               } else {
                  var9 = var7.getTextContent();
               }

               this.field_3400.setProperty(var8, var9);
            }
         }
      }

      if (var1.hasAttribute("gid")) {
         this.field_3397 = Integer.parseInt(var1.getAttribute("gid"));
         this.field_3398 = var2.method_2608(this.field_3397);
         if (this.field_3398 == null) {
            throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + this.field_3397);
         }

         this.field_3398.field_3504 = true;
         this.field_3399 = this.field_3397 - this.field_3398.field_3500;
      }

      Properties var15 = this.field_3400;
      this.field_3396 = new RectF(this.field_3390, this.field_3391, this.field_3390 + this.field_3392, this.field_3391 + this.field_3393);
      var2.method_2588(this.field_3396);
      this.field_3390 = this.field_3396.field_2416;
      this.field_3391 = this.field_3396.field_2417;
      this.field_3392 = this.field_3396.method_1964();
      this.field_3393 = this.field_3396.method_1965();
      float var16 = this.field_3396.method_1966();
      float var17 = this.field_3396.method_1967();
      if (var15 != null) {
         var8 = var15.getProperty("unit");
         var9 = var15.getProperty("customUnit");
         if (var8 != null || var9 != null) {
            String var10 = var15.getProperty("team");
            class_107 var11 = null;
            if ("none".equalsIgnoreCase(var10)) {
               var11 = class_107.method_954(-1);
            } else {
               var11 = class_107.method_954(Integer.valueOf(var10));
               if (var11 == null) {
                  class_236.method_1592("map", "unit object without team:" + var8);
               }
            }

            Object var12;
            if (var9 != null) {
               class_479 var13 = class_479.method_3171(var9);
               if (var13 == null) {
                  throw new class_424("Could not find custom unit of:" + var9 + " at x:" + this.field_3390 + ", y:" + this.field_3391);
               }

               class_24 var14 = class_479.method_3170(var13);
               if (var14 != null) {
                  if (var14 instanceof class_479) {
                     var13 = (class_479)var14;
                  } else {
                     class_236.method_1588("replacement not a custom unit:" + var14.method_141());
                  }
               }

               var12 = class_479.method_3172(false, var13);
               if (var12 == null) {
                  throw new RuntimeException("Metadata unit is null for:" + var9);
               }
            } else {
               var12 = null;
               class_24 var18 = class_469.method_3052(var8);
               if (var18 == null) {
                  throw new class_424("Could not find unit type of:" + var8 + " at x:" + this.field_3390 + ", y:" + this.field_3391);
               }

               var12 = var18.method_128();
            }

            ((class_39)var12).dh = var16;
            ((class_39)var12).di = var17;
            ((class_39)var12).field_154 = this.field_3394;
            if (var11 == null) {
               throw new RuntimeException("team is null:" + var8);
            }

            ((class_39)var12).method_258(var11);
            if (var15.getProperty("type") != null) {
               ((class_39)var12).method_303(var15.getProperty("type"));
            }

            if (var15.getProperty("randomRotate") != null) {
               ((class_39)var12).field_154 = (float)class_296.method_2013((class_39)var12, -180, 180);
            }

            ((class_39)var12).field_135 = "builder".equalsIgnoreCase(var8) || "builder".equalsIgnoreCase(var9);
            ((class_39)var12).field_136 = "commandCenter".equalsIgnoreCase(var8) || "commandCenter".equalsIgnoreCase(var9);
            ((class_39)var12).field_133 = true;
            ((class_39)var12).method_249();
            class_34.method_190();
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_2633(class_39 var1) {
      return this.field_3396.method_1973((float)((int)var1.dh), (float)((int)var1.di));
   }
}
