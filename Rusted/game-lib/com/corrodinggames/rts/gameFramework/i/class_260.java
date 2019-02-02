package com.corrodinggames.rts.gameFramework.i;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.i.d
public class class_260 {
   // $FF: renamed from: a java.util.ArrayList
   public ArrayList field_2295;
   // $FF: renamed from: b boolean
   public boolean field_2296;
   // $FF: renamed from: c boolean
   public boolean field_2297;
   // $FF: renamed from: d float
   public float field_2298;
   // $FF: renamed from: e int
   public int field_2299;
   // $FF: renamed from: f java.lang.String
   public String field_2300;
   // $FF: renamed from: g boolean
   public boolean field_2301;
   // $FF: renamed from: h boolean
   public boolean field_2302;
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.i.c
   // $FF: synthetic field
   final class_33 field_2303;

   public class_260(class_33 var1) {
      this.field_2303 = var1;
      this.field_2295 = new ArrayList();
   }

   // $FF: renamed from: a (java.lang.String) boolean
   public boolean method_1826(String var1) {
      var1 = var1.trim();
      class_236.method_1591("Got:" + var1);
      if (var1.length() == 0) {
         return false;
      } else {
         class_236.method_1591("..");
         String var2 = null;
         String var3 = null;
         String var4 = null;
         String var5 = null;
         Pattern var6;
         Matcher var7;
         if (var1.startsWith("+")) {
            var6 = Pattern.compile("\\+([^ ]*)([^\\[-]*)(\\[(.*?)\\])? *(-.*)?");
            var7 = var6.matcher(var1);
            if (!var7.matches()) {
               throw new RuntimeException("Match failed: " + var1);
            }

            var2 = var7.group(1);
            var3 = var7.group(2);
            var4 = var7.group(4);
            var5 = var7.group(5);
            class_236.method_1591("Got o:" + var4 + " d:" + var2 + " dn:" + var3 + " units:" + var5);
         } else {
            if (!var1.startsWith("!")) {
               throw new RuntimeException("Unknown format: " + var1);
            }

            var6 = Pattern.compile("\\!(.*)");
            var7 = var6.matcher(var1);
            if (!var7.matches()) {
               throw new RuntimeException("Match failed: " + var1);
            }

            var4 = var7.group(1);
         }

         String[] var15;
         if (var2 != null) {
            var2 = var2.trim();
            var15 = var2.split(":");
            String var16 = "0";
            String var8 = "0";
            if (var15.length == 1) {
               var16 = var15[0];
            } else {
               if (var15.length != 2) {
                  throw new RuntimeException("Unknown time format: " + var1);
               }

               var8 = var15[0];
               var16 = var15[1];
            }

            this.field_2298 = (float)(Integer.parseInt(var16) + Integer.parseInt(var8) * 60);
         }

         if (var3 != null) {
            var3 = var3.trim();
            this.field_2300 = var3;
            this.field_2302 = true;
         }

         int var9;
         String var10;
         String[] var11;
         String var12;
         String var13;
         String[] var17;
         int var18;
         if (var4 != null) {
            var15 = var4.split(",");
            var17 = var15;
            var18 = var15.length;

            for(var9 = 0; var9 < var18; ++var9) {
               var10 = var17[var9];
               var11 = var10.split(":");
               var12 = var11[0].trim();
               var13 = null;
               if (var11.length > 1) {
                  var13 = var11[1].trim();
               }

               if ("lockSpawn".equalsIgnoreCase(var12)) {
                  this.field_2296 = true;
               } else if ("unlockSpawn".equalsIgnoreCase(var12)) {
                  this.field_2297 = true;
               } else if ("noTimer".equalsIgnoreCase(var12)) {
                  this.field_2301 = true;
               } else if (!"paused".equalsIgnoreCase(var12) && !"win".equalsIgnoreCase(var12) && !"".equalsIgnoreCase(var12)) {
                  throw new RuntimeException("Unknown option '" + var12 + "' in: " + var1);
               }
            }
         }

         if (var5 != null) {
            var5 = var5.trim();
            if (var5.startsWith("-")) {
               var5 = var5.substring(1);
            }

            var15 = var5.split(",");
            var17 = var15;
            var18 = var15.length;

            for(var9 = 0; var9 < var18; ++var9) {
               var10 = var17[var9];
               var10 = var10.trim();
               var11 = var10.split(" ");
               if (var11.length != 2) {
                  throw new RuntimeException("Unknown unit format '" + var10 + "' in: " + var1);
               }

               var13 = var11[0].trim();
               var12 = var11[1].trim();
               class_258 var14 = new class_258(this.field_2303);
               var14.field_2286 = Integer.parseInt(var13);
               var14.field_2285 = class_469.method_3052(var12);
               if (var14.field_2285 == null) {
                  throw new RuntimeException("Could not find unit '" + var12 + "' in: " + var1);
               }

               this.field_2295.add(var14);
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a () void
   public void method_1827() {
      class_236.method_1591("Activating wave");
      if (!this.field_2303.field_66) {
         this.field_2303.method_167();
      }

      PointF var1 = this.field_2303.field_64;
      Iterator var2 = this.field_2295.iterator();

      while(var2.hasNext()) {
         class_258 var3 = (class_258)var2.next();
         var3.method_1825(var1.field_2406, var1.field_2407);
      }

      if (!this.field_2303.field_65) {
         this.field_2303.method_167();
      }

      if (this.field_2296) {
         this.field_2303.field_65 = true;
      }

      if (this.field_2297) {
         this.field_2303.field_65 = false;
      }

   }
}
