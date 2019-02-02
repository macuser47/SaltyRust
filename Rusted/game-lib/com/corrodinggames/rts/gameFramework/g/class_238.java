package com.corrodinggames.rts.gameFramework.g;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g.d
public final class class_238 {
   // $FF: renamed from: a boolean
   static boolean field_2093 = false;
   // $FF: renamed from: b boolean
   static boolean field_2094 = false;
   // $FF: renamed from: c boolean
   static boolean field_2095;
   // $FF: renamed from: d boolean
   static boolean field_2096;
   // $FF: renamed from: e boolean
   static boolean field_2097;
   // $FF: renamed from: f boolean
   static boolean field_2098;
   // $FF: renamed from: g boolean
   static boolean field_2099;
   // $FF: renamed from: h java.util.ArrayList
   static ArrayList field_2100;
   // $FF: renamed from: i boolean
   static boolean field_2101;
   // $FF: renamed from: j boolean
   public static final boolean field_2102;
   // $FF: renamed from: k boolean
   public boolean field_2103 = true;
   // $FF: renamed from: l com.corrodinggames.rts.gameFramework.g.g
   class_247 field_2104 = new class_247(this);
   // $FF: renamed from: m com.corrodinggames.rts.game.b.b
   class_408 field_2105;
   // $FF: renamed from: n short
   short field_2106;
   // $FF: renamed from: o short
   short field_2107;
   // $FF: renamed from: p java.util.ArrayList
   ArrayList field_2108 = new ArrayList();
   // $FF: renamed from: q android.graphics.Paint
   public Paint field_2109 = new Paint();
   // $FF: renamed from: r com.corrodinggames.rts.gameFramework.g.b
   public class_240 field_2110;
   // $FF: renamed from: s com.corrodinggames.rts.gameFramework.g.b
   public class_240 field_2111;
   // $FF: renamed from: t com.corrodinggames.rts.gameFramework.g.b
   public class_240 field_2112;
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.g.b
   public class_240 field_2113;
   // $FF: renamed from: v com.corrodinggames.rts.gameFramework.g.b
   public class_240 field_2114;
   // $FF: renamed from: w com.corrodinggames.rts.gameFramework.g.b
   public class_240 field_2115;
   // $FF: renamed from: x com.corrodinggames.rts.gameFramework.g.b
   public class_240 field_2116;
   // $FF: renamed from: y com.corrodinggames.rts.gameFramework.g.b
   public class_240 field_2117;
   // $FF: renamed from: z android.graphics.Paint
   Paint field_2118 = new Paint();
   // $FF: renamed from: A java.lang.Object
   Object field_2119 = new Object();
   // $FF: renamed from: B java.util.ArrayList
   ArrayList field_2120 = new ArrayList();
   // $FF: renamed from: C java.util.LinkedList
   LinkedList field_2121 = new LinkedList();
   // $FF: renamed from: D java.util.LinkedList
   LinkedList field_2122 = new LinkedList();
   // $FF: renamed from: E java.lang.Object
   Object field_2123 = new Object();

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac) com.corrodinggames.rts.gameFramework.g.b
   public strictfp class_240 method_1681(class_503 var1) {
      Iterator var2 = this.field_2108.iterator();

      class_240 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_240)var2.next();
      } while(var3.field_2129 != var1);

      return var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, int, int) boolean
   public strictfp boolean method_1682(class_503 var1, int var2, int var3) {
      class_240 var4 = this.method_1681(var1);
      return this.method_1684(var4, var2, var3);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ac, int, int) boolean
   public strictfp boolean method_1683(class_503 var1, int var2, int var3) {
      class_240 var4 = this.method_1681(var1);
      return this.method_1685(var4, var2, var3, true);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.b, int, int) boolean
   public strictfp boolean method_1684(class_240 var1, int var2, int var3) {
      return this.method_1685(var1, var2, var3, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.b, int, int, boolean) boolean
   public strictfp boolean method_1685(class_240 var1, int var2, int var3, boolean var4) {
      if (!this.field_2105.method_2584(var2, var3)) {
         return true;
      } else if (var1.field_2129 == class_503.field_4620) {
         return false;
      } else if (!var4 && var1.field_2131[var2][var3] == -1) {
         return true;
      } else {
         return var1.field_2130[var2][var3] == -1 || var1.field_2132[var2][var3] == -1;
      }
   }

   // $FF: renamed from: a (int, int) boolean
   public strictfp boolean method_1686(int var1, int var2) {
      if (!this.field_2105.method_2584(var1, var2)) {
         return true;
      } else if (this.field_2115.field_2130[var1][var2] != -1) {
         return false;
      } else {
         return this.field_2117.field_2130[var1][var2] != -1;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b) void
   public strictfp synchronized void method_1687(class_408 var1) {
      this.method_1692();
      class_236.method_1591("PathEngine: Setting up map costs");
      this.field_2105 = var1;
      this.field_2106 = var1.field_3337.field_3563;
      this.field_2107 = var1.field_3337.field_3564;
      this.field_2108.clear();
      this.field_2110 = new class_240(this, class_503.field_4617, this.field_2106, this.field_2107);
      this.field_2111 = new class_240(this, class_503.field_4618, this.field_2106, this.field_2107);
      this.field_2111.method_1728();
      this.field_2111.method_1726((class_44)null);
      this.field_2112 = new class_240(this, class_503.field_4619, this.field_2106, this.field_2107);
      this.field_2113 = new class_240(this, class_503.field_4621, this.field_2106, this.field_2107);
      this.field_2113.method_1728();
      this.field_2113.method_1726((class_44)null);
      this.field_2114 = new class_240(this, class_503.field_4620, this.field_2106, this.field_2107);
      this.field_2115 = new class_240(this, class_503.field_4622, this.field_2106, this.field_2107);
      this.field_2115.method_1728();
      this.field_2116 = new class_240(this, class_503.field_4623, this.field_2106, this.field_2107);
      this.field_2116.method_1728();
      this.field_2117 = new class_240(this, class_503.field_4624, this.field_2106, this.field_2107);
      this.field_2117.method_1728();
      Iterator var2 = this.field_2120.iterator();

      while(var2.hasNext()) {
         class_247 var3 = (class_247)var2.next();
         var3.method_1769(var1);
      }

      this.field_2104.method_1769(var1);
      class_236.method_1591("PathEngine: Ready");
   }

   // $FF: renamed from: a () void
   public strictfp void method_1688() {
      class_236 var1 = class_236.method_1549();
      class_240 var2 = this.field_2117;
      Rect var3 = new Rect();
      float var4 = var1.field_1965;
      float var5 = var1.field_1966;
      float var6 = var1.field_1969;
      float var7 = var1.field_1970;
      class_416[][] var8 = var1.field_1932.field_3337.method_2699();
      int var9 = (int)(var4 * this.field_2105.field_3334 - 1.0F);
      if (var9 < 0) {
         var9 = 0;
      }

      int var10 = (int)(var5 * this.field_2105.field_3335 - 1.0F);
      if (var10 < 0) {
         var10 = 0;
      }

      int var11 = (int)((var4 + var6) * this.field_2105.field_3334 + 1.0F);
      if (var11 > this.field_2106 - 1) {
         var11 = this.field_2106 - 1;
      }

      int var12 = (int)((var5 + var7) * this.field_2105.field_3335 + 1.0F);
      if (var12 > this.field_2107 - 1) {
         var12 = this.field_2107 - 1;
      }

      for(int var13 = var9; var13 < var11 + 1; ++var13) {
         for(int var14 = var10; var14 < var12 + 1; ++var14) {
            class_416 var15 = var8[var13][var14];
            if (var15 != null) {
               int var16 = var13 * this.field_2105.field_3330;
               int var17 = var14 * this.field_2105.field_3331;
               var3.method_1911(var16, var17, var16 + this.field_2105.field_3330, var17 + this.field_2105.field_3331);
               var3.method_1913((int)(-var4), (int)(-var5));
               byte var18;
               int var21;
               if (class_296.method_2051()) {
                  var18 = var2.field_2130[var13][var14];
                  byte var19 = var2.field_2131[var13][var14];
                  byte var20 = var2.field_2132[var13][var14];
                  if (var18 == -1) {
                     var21 = 255;
                  } else {
                     var21 = var18 * 2;
                  }

                  int var22;
                  if (var19 == -1) {
                     var22 = 255;
                  } else {
                     var22 = var19 * 2;
                  }

                  int var23;
                  if (var20 == -1) {
                     var23 = 255;
                  } else {
                     var23 = var20 * 2;
                  }

                  this.field_2118.method_2791(128, var21, var22, var23);
                  var1.field_1935.method_79(var3, this.field_2118);
               }

               var18 = var2.field_2132[var13][var14];
               if (var18 == -1) {
                  var21 = 255;
               } else {
                  var21 = var18 * 2;
               }

               if (var21 != 0) {
                  this.field_2118.method_2791(128, 0, 0, var21);
                  var1.field_1935.method_79(var3, this.field_2118);
               }
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   public strictfp void method_1689(class_44 var1) {
      if (var1 != null) {
         class_107.method_957(var1);
      }

      Iterator var2 = this.field_2108.iterator();

      while(var2.hasNext()) {
         class_240 var3 = (class_240)var2.next();
         var3.method_1732();
      }

      this.field_2111.method_1726(var1);
   }

   // $FF: renamed from: b () void
   public strictfp void method_1690() {
      Iterator var1 = this.field_2108.iterator();

      while(var1.hasNext()) {
         class_240 var2 = (class_240)var1.next();
         var2.method_1733();
      }

   }

   public strictfp class_238() {
      this.field_2120.add(new class_247(this));
      int var1 = class_296.method_2065();
      if (var1 > 1) {
         class_236.method_1592("PathEngine", "We have " + var1 + " cores, creating extra solvers");
         this.field_2120.add(new class_247(this));
      } else {
         class_236.method_1592("PathEngine", "We only have one core, using single solver");
      }

      Iterator var2 = this.field_2120.iterator();

      while(var2.hasNext()) {
         class_247 var3 = (class_247)var2.next();
         var3.method_1768();
      }

   }

   // $FF: renamed from: c () void
   public strictfp void method_1691() {
      class_242 var2;
      for(Iterator var1 = this.field_2121.iterator(); var1.hasNext(); var2.field_2163 = true) {
         var2 = (class_242)var1.next();
      }

      this.field_2121.clear();
      this.method_1703();
   }

   // $FF: renamed from: d () void
   public strictfp void method_1692() {
      Iterator var1 = this.field_2121.iterator();

      while(var1.hasNext()) {
         class_242 var2 = (class_242)var1.next();
         this.method_1706(var2);
      }

      this.field_2121.clear();
      this.method_1703();
   }

   // $FF: renamed from: a (boolean) com.corrodinggames.rts.gameFramework.g.c
   public strictfp class_242 method_1693(boolean var1) {
      class_242 var2 = new class_242(this, var1);
      return var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.c, boolean) void
   public strictfp void method_1694(class_242 var1, boolean var2) {
      class_236 var3 = class_236.method_1549();
      if (field_2094) {
         class_236.method_1592("PathEngine", "Started new path(" + var1.field_2145 + ") at frame:" + var3.field_1920);
      }

      class_240 var4 = this.method_1681(var1.field_2155);
      if (!var2) {
         if (var4.field_2137 + 50 < var3.field_1920) {
            var4.field_2137 = var3.field_1920 - 40;
            var4.method_1733();
         }
      } else if (var4.field_2137 + 30 < var3.field_1920) {
         var4.field_2137 = var3.field_1920;
         var4.method_1733();
      }

      var1.method_1737();
      var1.field_2160 = 200.0F;
      if (class_296.method_2043(var1.field_2148 - var1.field_2152) < 1000 && class_296.method_2043(var1.field_2149 - var1.field_2153) < 1000) {
         var1.field_2160 = 100.0F;
      }

      if (class_296.method_2043(var1.field_2148 - var1.field_2152) < 400 && class_296.method_2043(var1.field_2149 - var1.field_2153) < 400) {
         var1.field_2160 = 50.0F;
      }

      if (class_296.method_2043(var1.field_2148 - var1.field_2152) < 200 && class_296.method_2043(var1.field_2149 - var1.field_2153) < 200) {
         var1.field_2160 = 24.0F;
      }

      if (class_296.method_2043(var1.field_2148 - var1.field_2152) < 50 && class_296.method_2043(var1.field_2149 - var1.field_2153) < 50) {
         var1.field_2160 = 16.0F;
      }

      if (class_296.method_2043(var1.field_2148 - var1.field_2152) < 15 && class_296.method_2043(var1.field_2149 - var1.field_2153) < 15) {
         var1.field_2160 = 12.0F;
      }

      if (!var3.field_1944.field_3809 && !var3.field_1948.method_2657()) {
         var1.field_2160 = 180.0F;
      }

      if (var1.field_2158) {
         var1.field_2160 *= 2.0F;
         var1.field_2160 += 50.0F;
      }

      var1.field_2159 = var1.field_2160;
      if (!this.field_2103) {
         this.field_2104.method_1765(var1);
         this.field_2104.method_1767();
         this.field_2121.add(var1);
      } else {
         this.method_1702(var1);
         this.field_2121.add(var1);
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_1695(float var1) {
      this.method_1704();
   }

   // $FF: renamed from: b (float) void
   public strictfp void method_1696(float var1) {
      this.method_1704();
      this.method_1700(var1);
   }

   // $FF: renamed from: c (float) void
   public strictfp void method_1697(float var1) {
      Iterator var2;
      if (field_2097) {
         var2 = this.field_2120.iterator();

         while(var2.hasNext()) {
            class_247 var3 = (class_247)var2.next();
            var3.method_1781();
         }
      }

      if (field_2099) {
         var2 = field_2100.iterator();

         while(var2.hasNext()) {
            class_242 var4 = (class_242)var2.next();
            var4.method_1745();
            var4.method_1744();
         }
      }

      if (field_2098) {
         this.method_1688();
      }

   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_1698() {
      Iterator var1 = this.field_2121.iterator();

      class_242 var2;
      do {
         if (!var1.hasNext()) {
            return false;
         }

         var2 = (class_242)var1.next();
      } while(var2.field_2160 > 0.0F || var2.method_1742());

      return true;
   }

   // $FF: renamed from: f () java.lang.String
   public strictfp String method_1699() {
      Iterator var1 = this.field_2121.iterator();
      String var2 = null;
      int var3 = 0;

      while(var1.hasNext()) {
         class_242 var4 = (class_242)var1.next();
         if (var4.field_2160 <= 0.0F && !var4.method_1742()) {
            if (var2 == null) {
               float var5 = class_296.method_2027((float)var4.field_2148, (float)var4.field_2149, (float)var4.field_2152, (float)var4.field_2153);
               var2 = "[distance:" + var5 + ", allowedDelay:" + var4.field_2159 + " lowPriority:" + var4.field_2158 + "]";
            }

            ++var3;
         }
      }

      String var6 = "(total:" + var3 + ") ";
      if (var2 != null) {
         var6 = var6 + var2;
      }

      return var6;
   }

   // $FF: renamed from: d (float) void
   private strictfp void method_1700(float var1) {
      Iterator var2 = this.field_2121.iterator();

      while(var2.hasNext()) {
         class_242 var3 = (class_242)var2.next();
         if (var3.field_2160 <= 0.0F) {
            var3.field_2160 = 0.0F;
            var3.field_2161 = true;
            if (field_2099) {
               field_2100.add(var3);
               if (field_2100.size() > 10) {
                  field_2100.remove(0);
               }
            }

            if (!field_2097 && !var3.method_1742()) {
               if (class_236.method_1549().method_1656()) {
                  class_236.method_1592("PathEngine", "updateUnfinishedPaths: path wasn't solved, isGoingToBlockThisFrame did not protect");
               }

               this.method_1706(var3);
            }

            if (var3.method_1742()) {
               var2.remove();
            }
         } else {
            var3.field_2160 -= var1;
         }
      }

   }

   // $FF: renamed from: g () com.corrodinggames.rts.gameFramework.g.c
   private strictfp class_242 method_1701() {
      class_242 var1 = null;
      Iterator var2 = this.field_2122.iterator();

      while(true) {
         class_242 var3;
         do {
            if (!var2.hasNext()) {
               if (var1 == null) {
                  throw new RuntimeException("Failed to find any paths");
               }

               if (!this.field_2122.remove(var1)) {
                  throw new RuntimeException("Failed remove found path");
               }

               return var1;
            }

            var3 = (class_242)var2.next();
         } while(var1 != null && var1.field_2160 <= var3.field_2160);

         var1 = var3;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.g.c) void
   private strictfp void method_1702(class_242 var1) {
      synchronized(this.field_2123) {
         this.field_2122.add(var1);
      }
   }

   // $FF: renamed from: h () void
   private strictfp void method_1703() {
      synchronized(this.field_2123) {
         this.field_2122.clear();
      }
   }

   // $FF: renamed from: i () void
   private strictfp void method_1704() {
      LinkedList var1 = this.field_2122;
      if (var1.size() > 0) {
         synchronized(this.field_2123) {
            while(var1.size() > 0) {
               class_247 var3 = this.method_1705();
               if (var3 == null) {
                  break;
               }

               class_242 var4 = this.method_1701();
               if (!var4.field_2162) {
                  this.method_1707(var3, var4);
               }
            }
         }
      }

   }

   // $FF: renamed from: j () com.corrodinggames.rts.gameFramework.g.g
   private strictfp class_247 method_1705() {
      Iterator var1 = this.field_2120.iterator();

      class_247 var2;
      do {
         if (!var1.hasNext()) {
            return null;
         }

         var2 = (class_247)var1.next();
      } while(!var2.field_2200);

      return var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.c) void
   public strictfp void method_1706(class_242 var1) {
      if (!var1.field_2162) {
         while(true) {
            synchronized(this.field_2119) {
               class_247 var3 = this.method_1705();
               if (var3 != null) {
                  this.method_1707(var3, var1);
                  break;
               }

               try {
                  this.field_2119.wait(2000L);
               } catch (InterruptedException var9) {
               }
            }
         }
      }

      boolean var2 = false;
      long var12 = class_236.method_1596();

      while(true) {
         synchronized(this.field_2119) {
            if (var1.method_1742()) {
               break;
            }

            var2 = true;
            this.method_1704();

            try {
               this.field_2119.wait(2000L);
            } catch (InterruptedException var8) {
            }
         }
      }

      if (var2 && field_2095) {
         class_236.method_1592("PathEngine", "We were blocked path(" + var1.field_2145 + ") for:" + (class_236.method_1596() - var12));
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.g, com.corrodinggames.rts.gameFramework.g.c) void
   private strictfp void method_1707(class_247 var1, class_242 var2) {
      synchronized(var2) {
         if (!var2.field_2162) {
            var1.method_1765(var2);
            var1.method_1766();
         }

      }
   }

   static {
      field_2095 = !class_236.field_1886;
      field_2096 = false;
      field_2097 = false;
      field_2098 = false;
      field_2099 = false;
      field_2100 = new ArrayList();
      field_2101 = false;
      field_2102 = false;
   }
}
