package com.corrodinggames.rts.gameFramework.utility;

import android.content.Context;
import android.content.res.AssetManager;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.i
public final class class_195 {
   // $FF: renamed from: c java.util.ArrayList
   private ArrayList field_1653;
   // $FF: renamed from: a android.content.Context
   public Context field_1654;
   // $FF: renamed from: b boolean
   boolean field_1655 = true;

   public class_195(Context var1) {
      this.field_1654 = var1;
      this.method_1306();
   }

   // $FF: renamed from: a () void
   public void method_1306() {
      i$1 var1 = new i$1(this);
      var1.start();
   }

   // $FF: renamed from: b () void
   public void method_1307() {
      synchronized(this) {
         if (this.field_1653 == null) {
            AssetManager var2 = this.field_1654.method_1853();
            ArrayList var3 = new ArrayList();

            try {
               class_236.method_1591("------- createIndex -------");
               var3.addAll(this.method_1308(var2, "", 1));
            } catch (IOException var6) {
               throw new RuntimeException(var6);
            }

            this.field_1653 = var3;
         }
      }
   }

   // $FF: renamed from: a (android.content.res.AssetManager, java.lang.String, int) java.util.ArrayList
   public ArrayList method_1308(AssetManager var1, String var2, int var3) {
      ArrayList var4 = new ArrayList();
      String[] var5 = var1.method_3282(var2);
      if (var2.length() > 0) {
         var2 = var2 + "/";
      }

      if (var3 > 140) {
         throw new RuntimeException("dirLevel>140 for: " + var2);
      } else {
         class_236.method_1591("c:" + var2);
         String[] var6 = var5;
         int var7 = var5.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            String var10 = var2 + var9;
            boolean var11 = false;
            if (!var9.contains(".")) {
               var11 = true;
            }

            if (!var9.equals(".") && !var9.equals("..") && !var9.equals("")) {
               var4.add(var10);
               if (var11) {
                  var4.addAll(this.method_1308(var1, var10, var3 + 1));
               }
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: c () java.util.ArrayList
   public ArrayList method_1309() {
      if (this.field_1653 != null) {
         if (this.field_1655) {
            class_236.method_1591("assetIndex: getFile was not blocked on load");
            this.field_1655 = false;
         }

         return this.field_1653;
      } else {
         long var1 = class_236.method_1596();
         this.method_1307();
         if (this.field_1655) {
            class_236.method_1591("assetIndex: getFile is BLOCKED on load");
            this.field_1655 = false;
         }

         return this.field_1653;
      }
   }

   // $FF: renamed from: a (java.lang.String) boolean
   public boolean method_1310(String var1) {
      if (var1.endsWith(File.separator)) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      var1 = var1.replace("//", "/");
      Iterator var2 = this.method_1309().iterator();

      String var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (String)var2.next();
      } while(!var3.equals(var1));

      return true;
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String[]
   public String[] method_1311(String var1) {
      ArrayList var2 = new ArrayList();
      String var3 = var1;
      if (var1.endsWith(File.separator)) {
         var3 = var1.substring(0, var1.length() - 1);
      }

      int var4 = 0;
      Iterator var5 = this.method_1309().iterator();

      while(var5.hasNext()) {
         String var6 = (String)var5.next();
         if (var6.startsWith(var3)) {
            String var7 = var6.substring(var3.length());
            if (var7.length() != 0 && var7.charAt(0) == File.separatorChar && var7.indexOf(File.separator, 1) == -1) {
               ++var4;
               String var8 = var6.substring((var3 + "/").length());
               var2.add(var8);
            }
         }
      }

      return (String[])var2.toArray(new String[0]);
   }
}
