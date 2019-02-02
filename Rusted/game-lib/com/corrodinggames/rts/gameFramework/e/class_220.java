package com.corrodinggames.rts.gameFramework.e;

import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.j.class_223;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.e.a
public class class_220 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.e.b
   public class_215 field_1763 = new class_215();
   // $FF: renamed from: b java.util.ArrayList
   ArrayList field_1764 = new ArrayList();
   // $FF: renamed from: c java.util.ArrayList
   ArrayList field_1765 = new ArrayList();

   // $FF: renamed from: a () void
   public void method_1436() {
      this.method_1443();
      this.method_1438();
   }

   // $FF: renamed from: b () void
   public void method_1437() {
      class_236 var1 = class_236.method_1549();
      String var2 = "";

      class_215 var4;
      String var5;
      String var6;
      for(Iterator var3 = this.field_1764.iterator(); var3.hasNext(); var2 = var2 + var5 + "|" + var4.field_1738 + "|" + var6) {
         var4 = (class_215)var3.next();
         var5 = var4.field_1737;
         var5 = var5.replace(",", " ");
         var5 = var5.replace("|", " ");
         if (var5.length() > 15) {
            var5 = var5.substring(12) + "...";
         }

         if (var2.length() != 0) {
            var2 = var2 + ",";
         }

         var6 = var4.field_1739 ? "disabled" : "enabled";
      }

      var1.field_1937.modSettings = var2;
   }

   // $FF: renamed from: c () void
   public void method_1438() {
      class_236.method_1591("Loading mod selection");
      class_236 var1 = class_236.method_1549();
      String var2 = var1.field_1937.modSettings;
      String[] var3 = var2.split(",");
      String[] var4 = var3;
      int var5 = var3.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         String[] var8 = var7.split("\\|");
         if (var8.length != 3) {
            class_236.method_1591("loadSelection: wrong count (" + var8.length + "):" + var7);
         } else {
            String var9 = var8[0];
            String var10 = var8[1];
            String var11 = var8[2];
            boolean var12;
            if (var11.equals("enabled")) {
               var12 = false;
            } else {
               if (!var11.equals("disabled")) {
                  class_236.method_1591("loadSelection: Unknown option:" + var7);
                  continue;
               }

               var12 = true;
            }

            class_215 var13 = this.method_1439(var10);
            if (var13 == null) {
               class_236.method_1591("loadSelection: Did not find mod in settings:" + var9);
            } else {
               var13.field_1739 = var12;
            }
         }
      }

   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.e.b
   public class_215 method_1439(String var1) {
      Iterator var2 = this.field_1764.iterator();

      class_215 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_215)var2.next();
      } while(!var3.field_1738.equals(var1));

      return var3;
   }

   // $FF: renamed from: b (java.lang.String) com.corrodinggames.rts.gameFramework.e.b
   public class_215 method_1440(String var1) {
      Iterator var2 = this.field_1764.iterator();

      class_215 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_215)var2.next();
      } while(!var3.field_1737.equals(var1));

      return var3;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean) com.corrodinggames.rts.gameFramework.e.b
   public class_215 method_1441(String var1, String var2, String var3, boolean var4, boolean var5, boolean var6) {
      class_215 var7 = this.method_1439(var3);
      if (var7 == null) {
         var7 = new class_215();
         var7.field_1737 = var1;
         var7.field_1738 = var3;
         var7.field_1742 = var2;
         var7.field_1739 = !var4;
      }

      var7.field_1741 = true;
      var7.field_1746 = var5;
      var7.field_1747 = var6;
      var7.method_1432();
      if (!this.field_1764.contains(var7)) {
         this.field_1764.add(var7);
      }

      return var7;
   }

   // $FF: renamed from: a (java.lang.String, boolean, boolean) void
   public void method_1442(String var1, boolean var2, boolean var3) {
      class_236.method_1591("loading mod custom units at:" + var1);
      String[] var4 = class_236.method_1638(var1, false);
      if (var4 == null) {
         class_236.method_1588("getAllModList: ERROR");
         class_236.method_1588("getAllModList: Failed to load:" + var1);
      } else {
         String[] var5 = var4;
         int var6 = var4.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            String var8 = var5[var7];
            String var9 = var1 + "/" + var8;
            if (class_236.method_1633(var9) || var8.endsWith(".ini")) {
               String var10 = class_296.method_2062(var8);
               boolean var11 = false;
               this.method_1441(var8, var9, var10, var2, var11, var3);
            }
         }

      }
   }

   // $FF: renamed from: d () java.util.ArrayList
   public ArrayList method_1443() {
      class_223 var1 = class_223.method_1462();
      if (var1 != null) {
         var1.method_1473();
      } else {
         class_236.method_1591("getAllModList: SteamEngine==null");
      }

      class_215 var3;
      for(Iterator var2 = this.field_1764.iterator(); var2.hasNext(); var3.field_1741 = false) {
         var3 = (class_215)var2.next();
      }

      String var6 = class_479.method_3147();
      if (!class_236.method_1633(var6)) {
         class_236.method_1591("Modded Custom '" + var6 + "' directory not found");
      } else {
         boolean var7 = false;
         this.method_1442(var6, true, var7);
      }

      String var8 = class_479.method_3145();
      if (!class_236.method_1633(var8)) {
         class_236.method_1591("Modded Custom '" + var8 + "' directory not found");
      } else {
         boolean var4 = true;
         this.method_1442(var8, false, var4);
      }

      String var9 = class_479.method_3146();
      if (!class_236.method_1633(var9)) {
         class_236.method_1591("Modded Custom '" + var9 + "' directory not found");
      } else {
         boolean var5 = true;
         this.method_1442(var9, true, var5);
      }

      return this.field_1764;
   }

   // $FF: renamed from: e () void
   public void method_1444() {
      class_236 var1 = class_236.method_1549();
      var1.method_1571();
      this.method_1445();
      var1.method_1572();
   }

   // $FF: renamed from: f () void
   public void method_1445() {
      class_236 var1 = class_236.method_1549();

      class_215 var3;
      for(Iterator var2 = this.field_1764.iterator(); var2.hasNext(); var3.field_1753 = 0) {
         var3 = (class_215)var2.next();
         var3.field_1754 = null;
         var3.field_1755 = null;
         var3.field_1751 = 0;
         var3.field_1752 = 0;
      }

      this.method_1443();
      class_479.method_3149();
      class_479.method_3148();
   }

   // $FF: renamed from: g () void
   public void method_1446() {
   }

   // $FF: renamed from: a (java.lang.String[], java.lang.String) java.lang.String[]
   public String[] method_1447(String[] var1, String var2) {
      class_236.method_1591("addExtraMapsForPath: " + var2);
      ArrayList var3 = new ArrayList();
      String[] var4;
      int var6;
      if (var1 != null) {
         var4 = var1;
         int var5 = var1.length;

         for(var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            var3.add(var7);
         }
      }

      if (class_236.method_1653() && "/SD/rusted_warfare_maps".equals(var2)) {
         var4 = class_236.method_1638("/SD/rustedWarfare/maps", true);
         if (var4 != null) {
            String[] var10 = var4;
            var6 = var4.length;

            for(int var12 = 0; var12 < var6; ++var12) {
               String var8 = var10[var12];
               var3.add("NEW_PATH|maps2/" + var8);
            }
         }
      }

      Iterator var9 = this.method_1448(var2).iterator();

      while(var9.hasNext()) {
         class_217 var11 = (class_217)var9.next();
         var3.add("MOD|" + var11.field_1759.field_1738 + "/" + var11.field_1758);
      }

      return var1 == null && var3.size() == 0 ? null : (String[])var3.toArray(new String[0]);
   }

   // $FF: renamed from: c (java.lang.String) java.util.ArrayList
   public ArrayList method_1448(String var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.field_1765.iterator();

      while(var3.hasNext()) {
         class_217 var4 = (class_217)var3.next();
         boolean var5 = false;
         if (var1.startsWith("mod/") && var1.startsWith("mod/" + var4.field_1759.field_1738)) {
            var5 = true;
         }

         if (!var4.field_1759.field_1739 && var1.startsWith("/SD/rusted_warfare_maps")) {
            var5 = true;
         }

         if (var5) {
            class_236.method_1591("Adding extra map:" + var4.field_1757);
            var2.add(var4);
         }
      }

      return var2;
   }

   // $FF: renamed from: h () void
   public void method_1449() {
      this.field_1765.clear();
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.e.b) void
   public void method_1450(String var1, class_215 var2) {
      class_217 var3 = new class_217(this);
      var3.field_1757 = var1;
      var3.field_1759 = var2;
      if (var2.field_1742 == null) {
         class_236.method_1587("Skipping:" + var1 + " as mod sourceFolder is null");
      } else {
         String var4 = var1;
         String var5 = var2.field_1742;
         if (var1.startsWith(var5)) {
            var4 = var1.substring(var5.length());
         } else {
            class_236.method_1587("Mod path:" + var2.field_1742 + " not in map path:" + var1);
         }

         var3.field_1758 = var4;
         var2.field_1748 = true;
         ++var2.field_1752;
         this.field_1765.add(var3);
      }
   }
}
