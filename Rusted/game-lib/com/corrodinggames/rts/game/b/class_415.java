package com.corrodinggames.rts.game.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

// $FF: renamed from: com.corrodinggames.rts.game.b.h
public class class_415 {
   // $FF: renamed from: a int
   public int field_3417;
   // $FF: renamed from: b java.lang.String
   public String field_3418;
   // $FF: renamed from: c java.util.ArrayList
   public ArrayList field_3419;
   // $FF: renamed from: d int
   public int field_3420;
   // $FF: renamed from: e int
   public int field_3421;
   // $FF: renamed from: f java.util.Properties
   public Properties field_3422;

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.game.b.a
   public strictfp class_410 method_2636(String var1) {
      if (this.field_3419 != null) {
         Iterator var2 = this.field_3419.iterator();

         while(var2.hasNext()) {
            class_410 var3 = (class_410)var2.next();
            if (var1.equalsIgnoreCase(var3.field_3387)) {
               return var3;
            }
         }
      }

      return null;
   }

   public strictfp class_415(Element var1, class_408 var2) {
      this.field_3418 = var1.getAttribute("name");
      if (var1.hasAttribute("width")) {
         this.field_3420 = Integer.parseInt(var1.getAttribute("width"));
      }

      if (var1.hasAttribute("height")) {
         this.field_3421 = Integer.parseInt(var1.getAttribute("height"));
      }

      this.field_3419 = new ArrayList();
      Element var3 = (Element)var1.getElementsByTagName("properties").item(0);
      NodeList var4;
      int var5;
      Element var6;
      if (var3 != null) {
         var4 = var3.getElementsByTagName("property");
         if (var4 != null) {
            this.field_3422 = new Properties();

            for(var5 = 0; var5 < var4.getLength(); ++var5) {
               var6 = (Element)var4.item(var5);
               String var7 = var6.getAttribute("name");
               String var8 = var6.getAttribute("value");
               this.field_3422.setProperty(var7, var8);
            }
         }
      }

      var4 = var1.getElementsByTagName("object");

      for(var5 = 0; var5 < var4.getLength(); ++var5) {
         var6 = (Element)var4.item(var5);
         class_410 var9 = new class_410(var6, var2);
         var9.field_3386 = var5;
         this.field_3419.add(var9);
      }

   }
}
