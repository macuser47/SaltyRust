package com.corrodinggames.rts.gameFramework.c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_402;
import com.corrodinggames.rts.gameFramework.b.class_388;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_27;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.j
public class class_174 {
   // $FF: renamed from: a float
   float field_1513;
   // $FF: renamed from: b float
   float field_1514;
   // $FF: renamed from: c float
   public float field_1515 = 120.0F;
   // $FF: renamed from: d float
   public float field_1516 = 120.0F;
   // $FF: renamed from: e boolean
   public boolean field_1517;
   // $FF: renamed from: f boolean
   public boolean field_1518;
   // $FF: renamed from: g int
   public int field_1519;
   // $FF: renamed from: h int
   public int field_1520;
   // $FF: renamed from: i float
   public float field_1521;
   // $FF: renamed from: j float
   public float field_1522;
   // $FF: renamed from: k android.graphics.Paint
   Paint field_1523 = new Paint();
   // $FF: renamed from: l android.graphics.Paint
   Paint field_1524 = new Paint();
   // $FF: renamed from: m float
   float field_1525 = 0.0F;
   // $FF: renamed from: n android.graphics.Paint
   Paint field_1526 = new class_441();
   // $FF: renamed from: o android.graphics.Paint
   Paint field_1527 = new Paint();
   // $FF: renamed from: p android.graphics.Paint
   Paint field_1528 = new Paint();
   // $FF: renamed from: q android.graphics.Paint
   Paint field_1529 = new Paint();
   // $FF: renamed from: r android.graphics.Rect
   Rect field_1530 = new Rect();
   // $FF: renamed from: s android.graphics.Paint
   Paint field_1531 = new class_441();
   // $FF: renamed from: t android.graphics.Paint
   Paint field_1532 = new class_441();
   // $FF: renamed from: u android.graphics.Paint
   Paint field_1533 = new class_441();
   // $FF: renamed from: v android.graphics.Paint
   Paint field_1534 = new class_441();
   // $FF: renamed from: w android.graphics.Paint
   Paint field_1535 = new class_441();
   // $FF: renamed from: x android.graphics.Paint
   Paint field_1536 = new class_441();
   // $FF: renamed from: y android.graphics.Paint
   Paint field_1537 = new class_441();
   // $FF: renamed from: z android.graphics.Rect
   Rect field_1538 = new Rect();
   // $FF: renamed from: A com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1539;
   // $FF: renamed from: B com.corrodinggames.rts.gameFramework.h.l
   class_22 field_1540;
   // $FF: renamed from: C com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1541;
   // $FF: renamed from: D com.corrodinggames.rts.gameFramework.h.l
   class_22 field_1542;
   // $FF: renamed from: E com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_1543;
   // $FF: renamed from: F com.corrodinggames.rts.gameFramework.h.l
   class_22 field_1544;
   // $FF: renamed from: G float
   float field_1545 = 0.0F;
   // $FF: renamed from: H float
   float field_1546;
   // $FF: renamed from: I float
   float field_1547;
   // $FF: renamed from: J boolean
   public boolean field_1548 = false;
   // $FF: renamed from: K boolean
   public boolean field_1549 = false;
   // $FF: renamed from: L float
   public float field_1550 = 0.0F;
   // $FF: renamed from: M int
   int field_1551 = 30;
   // $FF: renamed from: N int
   int field_1552 = -1;
   // $FF: renamed from: O com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_1553;
   // $FF: renamed from: P com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_1554;
   // $FF: renamed from: Q android.graphics.Rect
   Rect field_1555 = new Rect();
   // $FF: renamed from: R com.corrodinggames.rts.gameFramework.h.p[]
   class_441[] field_1556;
   // $FF: renamed from: S com.corrodinggames.rts.gameFramework.h.p
   class_441 field_1557;
   // $FF: renamed from: T float
   float field_1558;
   // $FF: renamed from: U java.util.ArrayList
   public ArrayList field_1559 = new ArrayList();
   // $FF: renamed from: V java.util.ArrayList
   public ArrayList field_1560 = new ArrayList();
   // $FF: renamed from: ab java.util.ArrayList
   private ArrayList field_1561 = new ArrayList();
   // $FF: renamed from: W android.graphics.Rect
   Rect field_1562 = new Rect();
   // $FF: renamed from: X java.util.ArrayList
   static ArrayList field_1563 = new ArrayList();
   // $FF: renamed from: Y android.graphics.Point
   Point field_1564 = new Point();
   // $FF: renamed from: Z com.corrodinggames.rts.gameFramework.h.i
   class_27 field_1565 = new j$1(this);
   // $FF: renamed from: aa java.util.ArrayList
   ArrayList field_1566 = new ArrayList();

   // $FF: renamed from: a (int, int, float, com.corrodinggames.rts.game.units.aa) void
   public void method_1224(int var1, int var2, float var3, class_39 var4) {
      boolean var5 = var4 instanceof class_47;
      Iterator var6 = this.field_1559.iterator();

      class_171 var7;
      do {
         if (!var6.hasNext()) {
            class_171 var8 = new class_171(this, var3, var1, var2, var5);
            this.field_1559.add(var8);
            return;
         }

         var7 = (class_171)var6.next();
      } while(var7.field_1489 != var5 || class_296.method_2043(var1 - var7.field_1490) >= 40 || class_296.method_2043(var2 - var7.field_1491) >= 40);

      var7.field_1492 += var3;
   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_1225(Context var1) {
      this.field_1524.method_2786(Paint$Style.field_4586);
      this.field_1524.method_2793(1.0F);
      this.field_1526.method_2791(255, 255, 255, 255);
      this.field_1526.method_2786(Paint$Style.field_4586);
      this.field_1526.method_2793(1.0F);
      this.field_1556 = new class_441[11];

      for(int var2 = 0; var2 <= 10; ++var2) {
         this.field_1556[var2] = new class_441();
         this.field_1556[var2].b(-16777216);
         this.field_1556[var2].a(Paint$Style.field_4585);
         this.field_1556[var2].c(var2 * 25);
      }

      this.field_1557 = new class_441();
      this.field_1557.b(-16777216);
      this.field_1557.a(Paint$Style.field_4585);
      this.field_1527.method_2791(255, 255, 0, 0);
      this.field_1527.method_2786(Paint$Style.field_4586);
      this.field_1527.method_2793(2.0F);
      this.field_1528.method_2791(155, 255, 0, 0);
      this.field_1528.method_2786(Paint$Style.field_4586);
      this.field_1528.method_2793(2.0F);
      this.field_1529.method_2791(200, 12, 227, 219);
      this.field_1529.method_2786(Paint$Style.field_4586);
      this.field_1529.method_2793(2.0F);
      this.field_1531.method_2788(-16711936);
      this.field_1532.method_2788(-256);
      this.field_1533.method_2788(-65536);
      this.field_1534.method_2788(method_1226(this.field_1531.method_2787()));
      this.field_1535.method_2788(method_1226(this.field_1532.method_2787()));
      this.field_1536.method_2788(method_1226(this.field_1533.method_2787()));
      this.field_1537.method_2791(210, 255, 255, 255);
   }

   // $FF: renamed from: a (int) int
   public static int method_1226(int var0) {
      int var1 = Color.method_3077(Color.method_3072(var0), (int)((float)Color.method_3073(var0) * 0.5F), (int)((float)Color.method_3074(var0) * 0.5F), (int)((float)Color.method_3075(var0) * 0.5F));
      return var1;
   }

   // $FF: renamed from: a () void
   public void method_1227() {
      class_236 var1 = class_236.method_1549();
      this.field_1513 = (float)((int)(var1.field_1956 - (this.field_1515 + 0.0F)));
      this.field_1514 = 0.0F;
   }

   // $FF: renamed from: b () int
   public int method_1228() {
      return (int)(this.field_1514 + this.field_1516);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b) void
   public void method_1229(class_408 var1) {
      this.field_1519 = 1;
      this.field_1520 = 1;
      this.field_1521 = 1.0F;
      this.field_1522 = 1.0F;
      this.field_1518 = false;
      this.field_1517 = false;
      this.field_1566.clear();
   }

   // $FF: renamed from: c () void
   public void method_1230() {
      if (this.field_1543 != null) {
         this.field_1543.method_2130();
         this.field_1543 = null;
      }

      if (this.field_1539 != null) {
         this.field_1539.method_2130();
         this.field_1539 = null;
      }

      if (this.field_1553 != null) {
         this.field_1553.method_2130();
         this.field_1553 = null;
      }

      if (this.field_1554 != null) {
         this.field_1554.method_2130();
         this.field_1554 = null;
      }

      this.field_1544 = null;
      this.field_1517 = false;
   }

   // $FF: renamed from: d () float
   public float method_1231() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1961;
   }

   // $FF: renamed from: e () void
   public void method_1232() {
      boolean var1 = true;
      long var2 = class_402.method_2522();
      class_236.method_1591("--setting up minimap--");
      class_236 var4 = class_236.method_1549();
      this.field_1515 = this.method_1231();
      this.field_1516 = this.field_1515;
      this.method_1227();
      this.field_1519 = var4.field_1932.field_3337.field_3563 * var4.field_1932.field_3330;
      this.field_1520 = var4.field_1932.field_3337.field_3564 * var4.field_1932.field_3331;
      this.field_1521 = 1.0F / (float)this.field_1519;
      this.field_1522 = 1.0F / (float)this.field_1520;
      this.field_1518 = true;
      if (this.field_1539 == null) {
         this.field_1539 = var4.field_1935.method_63((int)this.field_1515, (int)this.field_1516, false);
         this.field_1540 = var4.field_1935.method_54(this.field_1539);
      }

      if (this.field_1543 == null) {
         this.field_1543 = var4.field_1935.method_63((int)this.field_1515, (int)this.field_1516, false);
         this.field_1544 = var4.field_1935.method_54(this.field_1543);
      }

      if (this.field_1541 == null) {
         this.field_1541 = var4.field_1935.method_63((int)this.field_1515, (int)this.field_1516, false);
         this.field_1542 = var4.field_1935.method_54(this.field_1541);
      }

      this.field_1559.clear();
      this.field_1560.clear();
      this.field_1561.clear();
      Iterator var5 = var4.field_1932.field_3341.iterator();

      while(var5.hasNext()) {
         Point var6 = (Point)var5.next();
         this.field_1561.add(new class_29(this, var6.field_4722, var6.field_4723));
      }

      this.field_1540.method_75(-16777216);
      this.field_1544.method_75(-16777216);
      boolean var18 = false;
      boolean var19 = false;
      boolean var7 = false;
      if (!var1) {
         Rect var8 = new Rect(0, 0, (int)this.field_1515, (int)this.field_1516);
         var4.field_1932.field_3337.method_2701(this.field_1540, 0.0F, 0.0F, 0.0F, 0.0F, (float)this.field_1519, (float)this.field_1520, this.field_1515 / (float)this.field_1519, this.field_1516 / (float)this.field_1520, false, false, false);
         Paint var9 = new Paint();
         var9.method_2791(50, 0, 0, 0);
         this.field_1540.method_79(var8, var9);
      } else {
         byte var20 = 2;

         for(int var22 = 0; var22 < var20; ++var22) {
            for(int var10 = 0; var10 < var20; ++var10) {
               this.field_1542.method_75(-16777216);
               int var11 = (int)this.field_1515 / var20;
               int var12 = (int)this.field_1516 / var20;
               int var13 = this.field_1519 / var20;
               int var14 = this.field_1520 / var20;
               var4.field_1932.field_3337.method_2701(this.field_1542, (float)(var13 * var22), (float)(var14 * var10), (float)(var13 * var22), (float)(var14 * var10), (float)var13, (float)var14, this.field_1515 / (float)var13, this.field_1516 / (float)var14, false, false, false);
               Rect var15 = new Rect(0, 0, (int)this.field_1515, (int)this.field_1516);
               Rect var16 = new Rect(var11 * var22, var12 * var10, var11 * (var22 + 1), var12 * (var10 + 1));
               Paint var17 = new Paint();
               var17.method_2781(true);
               var17.method_2784(true);
               var17.method_2782(true);
               this.field_1544.method_67(this.field_1541, var15, var16, var17);
            }
         }

         Rect var23 = new Rect(0, 0, (int)this.field_1515, (int)this.field_1516);
         Paint var24 = new Paint();
         var24.method_2781(true);
         var24.method_2784(true);
         var24.method_2782(true);
         var24.method_2791(200, 255, 255, 255);
         this.field_1540.method_67(this.field_1543, var23, var23, var24);
      }

      this.field_1542.method_75(-16777216);
      this.field_1544.method_75(-16777216);
      this.field_1546 = 50.0F;
      this.method_1233(0.0F, 1.0F);
      this.field_1517 = true;
      double var21 = (double)class_402.method_2523(var2);
      class_236.method_1591("Minimap map render took:" + class_402.method_2528(var21));
   }

   // $FF: renamed from: a (float, float) void
   void method_1233(float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      this.field_1562.method_1911(0, (int)(var1 * this.field_1516), (int)this.field_1515, (int)(var2 * this.field_1516));
      this.field_1542.method_67(this.field_1539, this.field_1562, this.field_1562, (Paint)null);
      class_408 var4 = var3.field_1932;
      if (var4.field_3344) {
         boolean var5 = var4.field_3346;
         class_441 var6 = this.field_1556[5];
         class_441 var7 = this.field_1556[10];
         this.field_1557.c(255);
         float var8;
         if (var5) {
            var7 = this.field_1556[7];
            var8 = 1.0F - (1.0F - (float)var6.method_2789() / 255.0F) * (1.0F - (float)var7.method_2789() / 255.0F);
            this.field_1557.c((int)(var8 * 255.0F));
         }

         var8 = this.field_1515 / (float)var4.field_3342;
         float var9 = this.field_1516 / (float)var4.field_3343;
         byte var10 = 0;
         byte var11 = 0;
         int var12 = (int)(var1 * (float)var4.field_3343) - 1;
         int var13 = (int)(var2 * (float)var4.field_3343) + 1;
         if (var12 < 0) {
            var12 = 0;
         }

         if (var13 < 0) {
            var13 = 0;
         }

         if (var12 > var3.field_1932.field_3343) {
            var12 = var4.field_3343;
         }

         if (var13 > var3.field_1932.field_3343) {
            var13 = var4.field_3343;
         }

         byte[][] var14 = var3.field_1915.field_1242;
         if (var14 != null) {
            for(int var15 = var12; var15 < var13; ++var15) {
               for(int var16 = 0; var16 < var4.field_3342; ++var16) {
                  byte var17 = var14[var16][var15];
                  if (var17 != 0) {
                     int var18 = var16;

                     int var19;
                     for(var19 = var16; var19 < var4.field_3342 - 1 && var14[var19][var15] == var17; ++var19) {
                     }

                     var16 = var19;
                     this.field_1555.method_1911(var10 + (int)((float)var18 * var8), var11 + (int)((float)var15 * var9), var10 + (int)((float)(var19 + 1) * var8), var11 + (int)((float)(var15 + 1) * var9));
                     class_441 var20;
                     if (var17 == 10) {
                        var20 = this.field_1557;
                     } else {
                        var20 = var6;
                     }

                     this.field_1542.method_79(this.field_1555, var20);
                  }
               }
            }
         }
      }

      this.field_1544.method_67(this.field_1541, this.field_1562, this.field_1562, (Paint)null);
   }

   // $FF: renamed from: a (int, android.graphics.Paint) com.corrodinggames.rts.gameFramework.c.n
   static class_28 method_1234(int var0, Paint var1) {
      synchronized(field_1563) {
         class_28 var3 = null;
         Iterator var4 = field_1563.iterator();

         while(true) {
            class_28 var5;
            do {
               do {
                  if (!var4.hasNext()) {
                     if (var3 != null) {
                        field_1563.remove(var3);
                        var3.field_6 = var1;
                        return var3;
                     }

                     return new class_28(var0 + 15, var1);
                  }

                  var5 = (class_28)var4.next();
               } while(var5.field_7 < var0);
            } while(var3 != null && var5.field_7 >= var3.field_7);

            var3 = var5;
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.c.n) void
   static void method_1235(class_28 var0) {
      var0.field_6 = null;
      var0.field_5 = 0;
      synchronized(field_1563) {
         if (field_1563.size() < 20) {
            field_1563.add(var0);
         } else {
            Iterator var2 = field_1563.iterator();

            class_28 var3;
            do {
               if (!var2.hasNext()) {
                  return;
               }

               var3 = (class_28)var2.next();
            } while(var3.field_7 >= var0.field_7);

            var2.remove();
            field_1563.add(var0);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.l, int, int, float, float) void
   void method_1236(class_22 var1, int var2, int var3, float var4, float var5) {
      class_236 var6 = class_236.method_1549();
      boolean var11 = true;
      byte var7;
      byte var8;
      byte var9;
      byte var10;
      byte var23;
      if (this.field_1515 < 50.0F) {
         var8 = 0;
         var7 = 0;
         var10 = 1;
         var9 = 1;
         var23 = 1;
      } else if (this.field_1515 < 120.0F) {
         var8 = 0;
         var7 = 0;
         var10 = 2;
         var9 = 2;
         var23 = 2;
      } else {
         var8 = -1;
         var7 = -1;
         var10 = 2;
         var9 = 2;
         var23 = 3;
      }

      int var10000 = var7 + var2;
      var10000 = var10 + var2;
      var10000 = var9 + var3;
      var10000 = var8 + var3;

      for(int var12 = -1; var12 < 10; ++var12) {
         class_107 var13 = class_107.method_954(var12);
         if (var13 != null) {
            Paint var14 = var13.field_1254;
            if (var6.field_1937.useMinimapAllyColors) {
               if (var6.field_1915 == var13) {
                  var14 = this.field_1531;
               } else if (var6.field_1915.method_944(var13)) {
                  var14 = this.field_1532;
               } else if (var6.field_1915.method_943(var13)) {
                  var14 = this.field_1533;
               }
            }

            int var15 = 0;
            class_39[] var16 = class_39.field_126.method_1326();
            int var17 = 0;

            int var18;
            for(var18 = class_39.field_126.size(); var17 < var18; ++var17) {
               class_39 var19 = var16[var17];
               if (var19.field_143 == var13 && var19.field_183) {
                  ++var15;
               }
            }

            int var28;
            if (var15 > 0) {
               var14.method_2793((float)var23);
               class_28 var24 = method_1234(var15, var14);
               class_39[] var26 = class_39.field_126.method_1326();
               var18 = 0;

               for(var28 = class_39.field_126.size(); var18 < var28; ++var18) {
                  class_39 var20 = var26[var18];
                  if (var20.field_143 == var13 && var20.field_183) {
                     var24.method_147((float)var20.field_184, (float)var20.field_185);
                  }
               }

               if (var24.field_5 != 0) {
                  var6.field_1935.method_95(var24);
               }
            }

            Paint var25 = var13.field_1255;
            if (var6.field_1937.useMinimapAllyColors) {
               if (var6.field_1915 == var13) {
                  var25 = this.field_1534;
               } else if (var6.field_1915.method_944(var13)) {
                  var25 = this.field_1535;
               } else if (var6.field_1915.method_943(var13)) {
                  var25 = this.field_1536;
               }
            }

            var17 = 0;
            Object[] var27 = class_388.field_3103.method_1319();
            var28 = 0;

            int var30;
            for(var30 = class_388.field_3103.size(); var28 < var30; ++var28) {
               class_388 var21 = (class_388)var27[var28];
               if (var21.field_3087 == var13 && var21.field_3093) {
                  ++var17;
               }
            }

            if (var17 > 0) {
               var25.method_2793((float)var23);
               class_28 var29 = method_1234(var17, var25);
               Object[] var31 = class_388.field_3103.method_1319();
               var30 = 0;

               for(int var32 = class_388.field_3103.size(); var30 < var32; ++var30) {
                  class_388 var22 = (class_388)var31[var30];
                  if (var22.field_3087 == var13 && var22.field_3093) {
                     var29.method_147((float)var22.field_3094, (float)var22.field_3095);
                  }
               }

               if (var29.field_5 != 0) {
                  var6.field_1935.method_95(var29);
               }
            }
         }
      }

   }

   // $FF: renamed from: a (int, int, com.corrodinggames.rts.gameFramework.c.m) void
   public void method_1237(int var1, int var2, class_172 var3) {
      class_176 var4 = new class_176(this);
      var4.field_1568 = var1;
      var4.field_1569 = var2;
      var4.field_1572 = var3;
      var4.field_1570 = 0.9F;
      var4.field_1571 = 0.9F;
      this.field_1560.add(var4);
   }

   // $FF: renamed from: a (float) void
   public void method_1238(float var1) {
      if (!class_236.field_1899 || class_236.field_1900) {
         class_236 var2 = class_236.method_1549();
         this.field_1545 = class_296.method_2020(this.field_1545, var1);
         if (this.field_1545 == 0.0F) {
            this.field_1545 = 15.0F;
            class_39[] var3 = class_39.field_126.method_1326();
            int var4 = 0;

            int var5;
            for(var5 = class_39.field_126.size(); var4 < var5; ++var4) {
               class_39 var6 = var3[var4];
               if (!var6.field_141 && var6.field_182 == null && var6.method_243() && var6.method_242() && !var6.method_318()) {
                  Point var7 = this.method_1239(var6.dh, var6.di);
                  var6.field_184 = var7.field_4722;
                  var6.field_185 = var7.field_4723;
                  var6.field_183 = true;
               } else {
                  var6.field_183 = false;
               }
            }

            Object[] var10 = class_388.field_3103.method_1319();
            var5 = 0;

            Point var8;
            for(int var13 = class_388.field_3103.size(); var5 < var13; ++var5) {
               class_388 var18 = (class_388)var10[var5];
               if (!var18.field_3096) {
                  var8 = this.method_1239(var18.field_3089, var18.field_3090);
                  var18.field_3094 = var8.field_4722;
                  var18.field_3095 = var8.field_4723;
                  var18.field_3093 = true;
               }
            }

            class_107 var12 = var2.field_1915;
            Iterator var15 = this.field_1561.iterator();

            while(var15.hasNext()) {
               class_29 var19 = (class_29)var15.next();
               var19.field_12 = false;
               if (var2.field_1932.method_2627(var12, var19.field_8, var19.field_9)) {
                  var19.field_12 = true;
                  var8 = this.method_1239((float)(var19.field_8 * var2.field_1932.field_3330), (float)(var19.field_9 * var2.field_1932.field_3331));
                  var19.field_10 = var8.field_4722;
                  var19.field_11 = var8.field_4723;
               }
            }
         }

         this.field_1558 += var1;
         if (this.field_1558 > 15.0F) {
            class_171 var9 = null;
            Iterator var11 = this.field_1559.iterator();

            while(var11.hasNext()) {
               class_171 var14 = (class_171)var11.next();
               if (var14.field_1493 != 0.0F) {
                  var14.field_1492 = 0.0F;
               } else if (var14.field_1492 > 15.0F) {
                  var14.field_1492 = 0.0F;
                  var14.field_1493 = 600.0F;
                  class_176 var17 = new class_176(this);
                  var17.field_1568 = var14.field_1490;
                  var17.field_1569 = var14.field_1491;
                  if (var14.field_1489) {
                     var17.field_1572 = class_172.field_1495;
                  } else {
                     var17.field_1572 = class_172.field_1496;
                     var17.field_1570 = 0.4F;
                     var17.field_1571 = 0.8F;
                  }

                  this.field_1560.add(var17);
               }

               var14.field_1492 = class_296.method_2020(var14.field_1492, 2.0F * this.field_1558);
               var14.field_1493 = class_296.method_2020(var14.field_1493, this.field_1558);
               if (var14.field_1492 == 0.0F && var14.field_1493 == 0.0F) {
                  var9 = var14;
               }
            }

            if (var9 != null) {
               this.field_1559.remove(var9);
            }

            var11 = this.field_1560.iterator();

            while(var11.hasNext()) {
               class_176 var16 = (class_176)var11.next();
               if (var16.field_1572 != class_172.field_1498 && var2.field_1982.method_1914(var16.field_1568, var16.field_1569)) {
                  var16.field_1570 = 0.0F;
                  var16.field_1571 = 0.0F;
               }
            }

            this.field_1558 = 0.0F;
         }

      }
   }

   // $FF: renamed from: b (float, float) android.graphics.Point
   public Point method_1239(float var1, float var2) {
      if (!this.field_1518) {
         this.field_1564.method_3291(-1, -1);
         return this.field_1564;
      } else {
         int var3 = (int)(var1 * this.field_1521 * this.field_1515 + this.field_1513);
         int var4 = (int)(var2 * this.field_1522 * this.field_1516 + this.field_1514);
         this.field_1564.method_3291(var3, var4);
         return this.field_1564;
      }
   }

   // $FF: renamed from: c (float, float) android.graphics.Point
   public Point method_1240(float var1, float var2) {
      if (var1 >= this.field_1513 && var2 >= this.field_1514 && var1 <= this.field_1513 + this.field_1515 && var2 <= this.field_1514 + this.field_1516) {
         int var3 = (int)((var1 - this.field_1513) / this.field_1515 * (float)this.field_1519);
         int var4 = (int)((var2 - this.field_1514) / this.field_1516 * (float)this.field_1520);
         this.field_1564.method_3291(var3, var4);
         return this.field_1564;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (float) float
   public float method_1241(float var1) {
      if (var1 < this.field_1513) {
         return this.field_1513;
      } else {
         return var1 > this.field_1513 + this.field_1515 ? this.field_1513 + this.field_1515 : var1;
      }
   }

   // $FF: renamed from: c (float) float
   public float method_1242(float var1) {
      if (var1 < this.field_1514) {
         return this.field_1514;
      } else {
         return var1 > this.field_1514 + this.field_1516 ? this.field_1514 + this.field_1516 : var1;
      }
   }

   // $FF: renamed from: d (float) void
   public void method_1243(float var1) {
      class_236 var2 = class_236.method_1549();
      this.method_1227();
      if (this.field_1543 != null && !class_296.method_2049(this.field_1515, this.method_1231(), 5.0F)) {
         class_236.method_1592("minimap", "minimap size has changed, reseting");
         this.method_1230();
      }

      if (!this.field_1517 || this.field_1543 == null) {
         this.method_1232();
      }

      if (var2.field_1932.field_3344) {
         if (this.field_1548 && !this.field_1549) {
            this.field_1546 = class_296.method_2020(this.field_1546, 1.0F);
            if (this.field_1546 == 0.0F) {
               this.field_1546 = 40.0F;
               this.field_1548 = false;
               this.field_1550 = 0.0F;
               this.field_1549 = true;
            }
         }

         if (this.field_1549) {
            this.field_1547 = class_296.method_2020(this.field_1547, 1.0F);
            if (this.field_1547 == 0.0F) {
               this.field_1547 = 3.0F;
               if (this.field_1543 != null) {
                  float var3 = this.field_1550 - 0.005F;
                  this.field_1550 = (float)((double)this.field_1550 + 0.04D);
                  if (var3 < 0.0F) {
                     var3 = 0.0F;
                  }

                  if (this.field_1550 >= 1.0F) {
                     this.field_1550 = 1.0F;
                     this.field_1549 = false;
                  }

                  this.method_1233(var3, this.field_1550);
               }
            }
         }
      }

      var2.field_1935.method_71(this.field_1543, this.field_1513, this.field_1514, this.field_1523);
      this.field_1530.method_1911((int)this.field_1513, (int)this.field_1514, (int)(this.field_1513 + this.field_1515), (int)((double)(this.field_1514 + this.field_1516) - 0.4D));
      boolean var14 = false;
      boolean var4 = false;
      boolean var5 = false;
      Iterator var6 = class_97.field_833.iterator();

      class_97 var7;
      while(var6.hasNext()) {
         var7 = (class_97)var6.next();
         if (var7.field_856) {
            var5 = true;
            var4 = true;
         }
      }

      var6 = this.field_1560.iterator();

      class_176 var16;
      while(var6.hasNext()) {
         var16 = (class_176)var6.next();
         if (var16.field_1572 != class_172.field_1496) {
            var14 = true;
            if (var16.field_1572 != class_172.field_1498) {
               var4 = true;
            }
         }
      }

      if (!var14 && !var5) {
         this.field_1524.method_2791(255, 100, 100, 100);
         this.field_1524.method_2793(1.0F);
         if (class_98.field_1052) {
            this.field_1524.method_2791(115, 0, 0, 0);
            this.field_1524.method_2793(2.0F);
         }
      } else {
         this.field_1525 += 5.0F * var1;
         if (this.field_1525 > 180.0F) {
            this.field_1525 -= 180.0F;
         }

         float var15 = class_296.method_2098(this.field_1525);
         if (var5) {
            this.field_1524.method_2791(255, 0, (int)(0.0F + var15 * 230.0F), 0);
         } else if (!var4) {
            this.field_1524.method_2791(255, 12, (int)(0.0F + var15 * 220.0F), (int)(0.0F + var15 * 220.0F));
         } else {
            this.field_1524.method_2791(255, (int)(0.0F + var15 * 230.0F), 0, 0);
         }

         this.field_1524.method_2793(2.0F);
      }

      var2.field_1935.method_79(this.field_1530, this.field_1524);
      var6 = this.field_1561.iterator();

      while(var6.hasNext()) {
         class_29 var17 = (class_29)var6.next();
         if (var17.field_12) {
            this.field_1555.method_1911(var17.field_10, var17.field_11, var17.field_10 + 2, var17.field_11 + 2);
            var2.field_1935.method_79(this.field_1555, this.field_1537);
         }
      }

      this.method_1236(var2.field_1935, 0, 0, 0.0F, 1.0F);
      if (this.field_1566.size() != 0) {
         var6 = this.field_1566.iterator();

         while(var6.hasNext()) {
            class_25 var18 = (class_25)var6.next();
            if (var18.field_0.field_141) {
               var6.remove();
            } else {
               class_39 var8 = var18.field_0;
               Point var9 = this.method_1239(var8.dh, var8.di);
               var2.field_1935.method_85((float)var9.field_4722, (float)var9.field_4723, 4.0F, var8.field_143.field_1254);
            }
         }
      }

      var6 = class_97.field_833.iterator();

      while(true) {
         Point var20;
         float var21;
         do {
            if (!var6.hasNext()) {
               Point var19 = this.method_1239(var2.field_1965, var2.field_1966);
               this.field_1538.field_2352 = var19.field_4722;
               this.field_1538.field_2353 = var19.field_4723;
               var19 = this.method_1239(var2.field_1965 + var2.field_1969, var2.field_1966 + var2.field_1970);
               this.field_1538.field_2354 = var19.field_4722;
               this.field_1538.field_2355 = var19.field_4723;
               if (this.field_1538.field_2352 < this.field_1530.field_2352) {
                  this.field_1538.field_2352 = this.field_1530.field_2352;
               }

               if (this.field_1538.field_2354 > this.field_1530.field_2354) {
                  this.field_1538.field_2354 = this.field_1530.field_2354;
               }

               if (this.field_1538.field_2353 < this.field_1530.field_2353) {
                  this.field_1538.field_2353 = this.field_1530.field_2353;
               }

               if (this.field_1538.field_2355 > this.field_1530.field_2355) {
                  this.field_1538.field_2355 = this.field_1530.field_2355;
               }

               var2.field_1935.method_79(this.field_1538, this.field_1526);
               var6 = this.field_1560.iterator();

               while(var6.hasNext()) {
                  var16 = (class_176)var6.next();
                  var20 = this.method_1239((float)var16.field_1568, (float)var16.field_1569);
                  var21 = var16.field_1570;
                  float var10 = 0.05F;
                  Paint var11 = this.field_1527;
                  if (var16.field_1572 == class_172.field_1496) {
                     var11 = this.field_1528;
                     var10 = 0.02F;
                  }

                  if (var16.field_1572 == class_172.field_1498) {
                     var11 = this.field_1529;
                  }

                  var21 = class_296.method_2023(var21, var10, 1.0F);
                  if (var16.field_1572 == class_172.field_1496) {
                     float var12 = this.field_1515 * var21;
                     float var13 = this.field_1516 * var21;
                     var2.field_1935.method_96(this.method_1241((float)var20.field_4722 - var12), this.method_1242((float)var20.field_4723 - var13), this.method_1241((float)var20.field_4722 + var12), this.method_1242((float)var20.field_4723 + var13), var11);
                     var2.field_1935.method_96(this.method_1241((float)var20.field_4722 + var12), this.method_1242((float)var20.field_4723 - var13), this.method_1241((float)var20.field_4722 - var12), this.method_1242((float)var20.field_4723 + var13), var11);
                  } else {
                     var2.field_1935.method_96(this.method_1241((float)var20.field_4722 - this.field_1515 * var21), this.method_1242((float)var20.field_4723), this.method_1241((float)var20.field_4722 + this.field_1515 * var21), this.method_1242((float)var20.field_4723), var11);
                     var2.field_1935.method_96(this.method_1241((float)var20.field_4722), this.method_1242((float)var20.field_4723 - this.field_1516 * var21), this.method_1241((float)var20.field_4722), this.method_1242((float)var20.field_4723 + this.field_1516 * var21), var11);
                  }

                  var16.field_1570 = class_296.method_2020(var16.field_1570, 0.04F * var1);
                  if (var16.field_1570 == 0.0F) {
                     var16.field_1571 = class_296.method_2020(var16.field_1571, 0.005F * var1);
                     if (var16.field_1571 == 0.0F) {
                        var6.remove();
                     }
                  }
               }

               return;
            }

            var7 = (class_97)var6.next();
         } while(!var7.field_856 && (var7.field_846 == null || !var7.field_846.field_856));

         if (var7.field_841 != null) {
            var20 = this.method_1239(var7.dh, var7.di);
            var21 = 2.0F;
            if (var7.field_856) {
               var21 = 4.0F;
            }

            var2.field_1935.method_85((float)var20.field_4722, (float)var20.field_4723, var21, var7.field_841.field_143.field_1254);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public void method_1244(class_39 var1) {
      class_25 var2 = new class_25(this);
      var2.field_0 = var1;
      this.field_1566.add(var2);
   }
}
