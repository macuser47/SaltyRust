package com.corrodinggames.rts.game.a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_280;
import com.corrodinggames.rts.game.units.class_281;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_501;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.class_512;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_516;
import com.corrodinggames.rts.game.units.b.class_75;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.d.class_53;
import com.corrodinggames.rts.game.units.d.class_55;
import com.corrodinggames.rts.game.units.d.class_59;
import com.corrodinggames.rts.game.units.d.class_62;
import com.corrodinggames.rts.game.units.d.class_8;
import com.corrodinggames.rts.game.units.f.class_72;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.g.class_238;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

// $FF: renamed from: com.corrodinggames.rts.game.a.a
public final class class_112 extends class_107 {
   // $FF: renamed from: I int
   final int field_1258;
   // $FF: renamed from: J int
   int field_1259;
   // $FF: renamed from: K int
   int field_1260;
   // $FF: renamed from: L int
   int field_1261;
   // $FF: renamed from: M int
   int field_1262;
   // $FF: renamed from: N int
   int field_1263;
   // $FF: renamed from: O int
   int field_1264;
   // $FF: renamed from: P int
   int field_1265;
   // $FF: renamed from: Q int
   int field_1266;
   // $FF: renamed from: R int
   int field_1267;
   // $FF: renamed from: S int
   int field_1268;
   // $FF: renamed from: T int
   int field_1269;
   // $FF: renamed from: U int
   int field_1270;
   // $FF: renamed from: V int
   int field_1271;
   // $FF: renamed from: W int
   int field_1272;
   // $FF: renamed from: X int
   public int field_1273;
   // $FF: renamed from: Y boolean
   boolean field_1274;
   // $FF: renamed from: Z int
   int field_1275;
   // $FF: renamed from: aa float
   float field_1276;
   // $FF: renamed from: ab float
   float field_1277;
   // $FF: renamed from: ac float
   float field_1278;
   // $FF: renamed from: ad float
   float field_1279;
   // $FF: renamed from: ae float
   float field_1280;
   // $FF: renamed from: af float
   float field_1281;
   // $FF: renamed from: ag float
   float field_1282;
   // $FF: renamed from: ah float
   float field_1283;
   // $FF: renamed from: ai float
   float field_1284;
   // $FF: renamed from: aj float
   float field_1285;
   // $FF: renamed from: ak int
   int field_1286;
   // $FF: renamed from: al float
   float field_1287;
   // $FF: renamed from: am boolean
   public boolean field_1288;
   // $FF: renamed from: an boolean
   public boolean field_1289;
   // $FF: renamed from: ao int
   int field_1290;
   // $FF: renamed from: ap int
   int field_1291;
   // $FF: renamed from: aq int
   int field_1292;
   // $FF: renamed from: ar boolean
   boolean field_1293;
   // $FF: renamed from: as boolean
   boolean field_1294;
   // $FF: renamed from: at boolean
   boolean field_1295;
   // $FF: renamed from: au boolean
   boolean field_1296;
   // $FF: renamed from: av boolean
   boolean field_1297;
   // $FF: renamed from: aw int
   int field_1298;
   // $FF: renamed from: ax java.util.concurrent.ConcurrentLinkedQueue
   ConcurrentLinkedQueue field_1299;
   // $FF: renamed from: ay java.util.ArrayList
   ArrayList field_1300;
   // $FF: renamed from: az android.graphics.PointF
   PointF field_1301;
   // $FF: renamed from: aA android.graphics.Paint
   Paint field_1302;
   // $FF: renamed from: aB java.util.ArrayList
   ArrayList field_1303;
   // $FF: renamed from: aC com.corrodinggames.rts.game.a.d
   class_150 field_1304;
   // $FF: renamed from: aD com.corrodinggames.rts.game.a.d
   class_150 field_1305;
   // $FF: renamed from: aE com.corrodinggames.rts.game.a.d
   class_150 field_1306;
   // $FF: renamed from: aF com.corrodinggames.rts.game.a.d
   class_150 field_1307;
   // $FF: renamed from: aG com.corrodinggames.rts.game.a.d
   class_150 field_1308;
   // $FF: renamed from: aH com.corrodinggames.rts.game.a.d
   class_150 field_1309;
   // $FF: renamed from: aI com.corrodinggames.rts.game.a.d
   class_150 field_1310;
   // $FF: renamed from: aJ com.corrodinggames.rts.game.a.d
   class_150 field_1311;
   // $FF: renamed from: aK com.corrodinggames.rts.game.a.d
   class_150 field_1312;
   // $FF: renamed from: aL com.corrodinggames.rts.game.a.c
   public class_141 field_1313;
   // $FF: renamed from: aM int
   int field_1314;
   // $FF: renamed from: aN float
   public float field_1315;
   // $FF: renamed from: aO java.util.ArrayList
   ArrayList field_1316;

   // $FF: renamed from: r () boolean
   public boolean method_965() {
      return this.method_966() == 3;
   }

   // $FF: renamed from: s () int
   public int method_966() {
      return this.field_1314;
   }

   // $FF: renamed from: t () boolean
   public boolean method_967() {
      class_238 var1 = class_236.method_1549().field_1941;
      return var1.field_2113.field_2135 > 3000;
   }

   // $FF: renamed from: u () boolean
   public boolean method_968() {
      if (this.method_967()) {
         return true;
      } else if (this.field_1294 && this.field_1295) {
         if (!this.field_1296) {
            return true;
         } else {
            return !this.field_1297;
         }
      } else {
         return true;
      }
   }

   // $FF: renamed from: v () boolean
   public boolean method_969() {
      if (!this.field_1297) {
         return false;
      } else {
         return this.method_968() && this.field_1295;
      }
   }

   // $FF: renamed from: a (float, float, com.corrodinggames.rts.game.a.n, com.corrodinggames.rts.game.units.ac) boolean
   public boolean method_970(float var1, float var2, class_100 var3, class_503 var4) {
      if (this.method_971(var1, var2, var3.field_1140, var3.field_1141, var4)) {
         return true;
      } else {
         for(float var5 = -180.0F; var5 < 180.0F; var5 += 90.0F) {
            float var6 = var3.field_1140 + class_296.method_2099(var5) * var3.field_1142 * 0.4F;
            float var7 = var3.field_1141 + class_296.method_2098(var5) * var3.field_1142 * 0.4F;
            if (this.method_971(var1, var2, var6, var7, var4)) {
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: a (float, float, float, float, com.corrodinggames.rts.game.units.ac) boolean
   public boolean method_971(float var1, float var2, float var3, float var4, class_503 var5) {
      if (var5 != class_503.field_4620 && var5 != class_503.field_4617) {
         short var6 = class_205.method_1369(var1, var2, var5);
         short var7 = class_205.method_1369(var3, var4, var5);
         if (var6 == -3 || var7 == -3) {
            String var8 = "null";
            if (var5 != null) {
               var8 = var5.name();
            }

            this.method_978("pathPossible: no isolatedGroups found! (" + var8 + ")");
            class_236.method_1594();
         }

         if (var6 != -1 && var7 != -1) {
            if (var6 == -2) {
               return false;
            } else if (var7 == -2) {
               return false;
            } else {
               return var6 == var7;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, float) boolean
   public boolean method_972(class_39 var1, float var2, float var3) {
      return this.method_971(var1.dh, var1.di, var2, var3, var1.method_279());
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2540(this.field_1274);
      var1.method_2542(this.field_1276);
      var1.method_2542(this.field_1277);
      var1.method_2542(this.field_1278);
      var1.method_2542(this.field_1279);
      var1.method_2542(this.field_1284);
      var1.method_2541(this.field_1286);
      var1.method_2542(this.field_1287);
      var1.method_2540(this.field_1288);
      var1.method_2541(this.field_1290);
      var1.method_2541(this.field_1299.size());
      Iterator var2 = this.field_1299.iterator();

      class_100 var3;
      while(var2.hasNext()) {
         var3 = (class_100)var2.next();
         boolean var4 = true;
         byte var5;
         if (var3 instanceof class_106) {
            var5 = 1;
         } else if (var3 instanceof class_104) {
            var5 = 2;
         } else if (var3 instanceof class_103) {
            var5 = 3;
         } else if (var3 instanceof class_101) {
            var5 = 4;
         } else {
            if (!(var3 instanceof class_105)) {
               throw new RuntimeException("zone not instance not supported:" + var3.getClass().getName());
            }

            var5 = 5;
         }

         var1.method_2539(var5);
         var1.method_2541(var3.field_1138);
      }

      var2 = this.field_1299.iterator();

      while(var2.hasNext()) {
         var3 = (class_100)var2.next();
         var1.method_2541(var3.field_1138);
         var3.method_148(var1);
      }

      var1.method_2539(6);
      var1.method_2541(this.field_1273);
      var1.method_2540(this.field_1293);
      var1.method_2540(this.field_1294);
      var1.method_2540(this.field_1295);
      var1.method_2540(this.field_1296);
      var1.method_2540(this.field_1297);
      var1.method_2542(this.field_1285);
      var1.method_2541(this.field_1298);
      var1.method_2541(this.field_1259);
      var1.method_2541(this.field_1260);
      var1.method_2541(this.field_1261);
      super.method_148(var1);
   }

   // $FF: renamed from: k (int) com.corrodinggames.rts.game.a.n
   public class_100 method_973(int var1) {
      if (var1 == 1) {
         return new class_106(this, -1.0F, -1.0F);
      } else if (var1 == 2) {
         return new class_104(this);
      } else if (var1 == 3) {
         return new class_103(this);
      } else if (var1 == 4) {
         return new class_101(this);
      } else if (var1 == 5) {
         return new class_105(this);
      } else if (var1 == 0) {
         class_236.method_1588("Found zone type 0, loading PlainZone instead");
         return new class_101(this);
      } else {
         throw new RuntimeException("Unknown zone type:" + var1);
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_914(class_463 var1) {
      this.field_1274 = var1.method_3010();
      this.field_1276 = var1.method_3012();
      this.field_1277 = var1.method_3012();
      this.field_1278 = var1.method_3012();
      this.field_1279 = var1.method_3012();
      this.field_1284 = var1.method_3012();
      this.field_1286 = var1.method_3011();
      this.field_1287 = var1.method_3012();
      this.field_1288 = var1.method_3010();
      this.field_1290 = var1.method_3011();
      int var2 = var1.method_3011();
      this.field_1299.clear();
      boolean var3 = false;
      int var4;
      if (var1.method_3006() >= 20) {
         var3 = true;

         for(var4 = 0; var4 < var2; ++var4) {
            byte var5 = var1.method_3009();
            class_100 var6 = this.method_973(var5);
            var6.field_1138 = var1.method_3011();
         }
      }

      for(var4 = 0; var4 < var2; ++var4) {
         class_100 var8;
         if (!var3) {
            byte var9 = var1.method_3009();
            var8 = this.method_973(var9);
         } else {
            var8 = this.method_974(var1.method_3011());
         }

         var8.method_836(var1);
      }

      byte var7 = var1.method_3009();
      if (var7 >= 1) {
         this.field_1273 = var1.method_3011();
      }

      this.field_1300.clear();
      this.field_1300.addAll(this.field_1299);
      if (var7 >= 2) {
         this.field_1293 = var1.method_3010();
         this.field_1294 = var1.method_3010();
         this.field_1295 = var1.method_3010();
      }

      if (var7 >= 3) {
         this.field_1296 = var1.method_3010();
         this.field_1297 = var1.method_3010();
      }

      if (var7 >= 4) {
         this.field_1285 = var1.method_3012();
      }

      if (var7 >= 5) {
         this.field_1298 = var1.method_3011();
      }

      if (var7 >= 6) {
         this.field_1259 = var1.method_3011();
         this.field_1260 = var1.method_3011();
         this.field_1261 = var1.method_3011();
      }

      super.method_914(var1);
      this.method_976();
   }

   // $FF: renamed from: l (int) com.corrodinggames.rts.game.a.n
   public class_100 method_974(int var1) {
      Iterator var2 = this.field_1299.iterator();

      class_100 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_100)var2.next();
      } while(var3.field_1138 != var1);

      return var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.a.n) int
   public int method_975(class_100 var1) {
      return var1 == null ? -1 : var1.field_1138;
   }

   // $FF: renamed from: w () void
   void method_976() {
      this.field_1264 = 0;
      this.field_1267 = 0;
      this.field_1268 = 0;
      this.field_1269 = 0;
      this.field_1265 = 0;
      this.field_1266 = 0;
      this.field_1270 = 0;
      this.field_1271 = 0;
      this.field_1262 = 0;
      this.field_1263 = 0;
      this.field_1272 = 0;
      Iterator var1 = this.field_1300.iterator();

      while(true) {
         class_100 var2;
         while(true) {
            if (!var1.hasNext()) {
               return;
            }

            var2 = (class_100)var1.next();
            if (var2 instanceof class_106) {
               class_106 var3 = (class_106)var2;
               ++this.field_1262;
               if (var3.method_905() >= 2) {
                  ++this.field_1263;
               }

               if (var3.field_1205) {
                  ++this.field_1272;
               }
            }

            if (!(var2 instanceof class_104)) {
               break;
            }

            class_104 var4 = (class_104)var2;
            if (!var4.field_1165) {
               if (var4.field_1171) {
                  ++this.field_1264;
                  if (!var4.field_1185 && !var4.method_864()) {
                     if (!var4.field_1191) {
                        ++this.field_1265;
                     } else {
                        ++this.field_1266;
                     }
                  }
               } else {
                  ++this.field_1267;
                  if (var4.method_864()) {
                     ++this.field_1268;
                  }

                  this.field_1269 += var4.g();
               }
               break;
            }
         }

         if (var2 instanceof class_103) {
            class_102 var5 = (class_102)var2;
            ++this.field_1270;
            if (var5.method_846() > 0) {
               ++this.field_1271;
            }
         }
      }
   }

   public class_112(int var1) {
      this(var1, true);
   }

   public class_112(int var1, boolean var2) {
      super(var1, var2);
      this.field_1258 = 3000;
      this.field_1282 = 0.0F;
      this.field_1283 = 0.0F;
      this.field_1293 = true;
      this.field_1299 = new ConcurrentLinkedQueue();
      this.field_1300 = new ArrayList();
      this.field_1301 = new PointF();
      this.field_1303 = new ArrayList();
      this.field_1304 = new a$1(this, "attackingUnits");
      this.field_1305 = new a$2(this, "buildingUnits");
      this.field_1306 = new a$3(this, "transportUnits");
      this.field_1307 = new a$4(this, "transportUnitsFlying");
      this.field_1308 = new a$5(this, "transportUnitsNonFlying");
      this.field_1309 = new a$6(this, "builderUnits");
      this.field_1310 = new a$7(this, "extractorUnits");
      this.field_1311 = new a$8(this, "buildingFactories");
      this.field_1312 = new a$9(this, "buildingFactoriesForBuilders");
      this.field_1313 = new class_141();
      this.field_1315 = 0.0F;
      this.field_1316 = new ArrayList();
      this.method_977();
   }

   // $FF: renamed from: D () void
   private void method_977() {
      class_236 var1 = class_236.method_1549();
      this.field_1276 = (float)(100 + this.d * 9);
      this.field_1278 = (float)(202 + this.d * 19);
      this.field_1280 = (float)(50 + this.d * 2);
      this.field_1287 = (float)(4200 + this.d * 5);
      this.field_1284 = (float)(3500 + this.d * 5);
      this.field_1285 = (float)(7500 + this.d * 5);
      this.field_1302 = new Paint();
      this.field_1302.method_2788(Color.method_3076(0, 255, 0));
      this.field_1302.method_2786(Paint$Style.field_4586);
      var1.method_1603(this.field_1302, 10.0F);
      Iterator var2 = this.field_1303.iterator();

      while(var2.hasNext()) {
         class_150 var3 = (class_150)var2.next();
         var3.method_1146();
      }

   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_978(String var1) {
      class_236.method_1592("ai_debug(" + this.d + ")", var1);
   }

   // $FF: renamed from: x () android.graphics.PointF
   public PointF method_979() {
      class_236 var1 = class_236.method_1549();
      var1.field_1932.method_2579(class_296.method_2036(0, var1.field_1932.field_3342), class_296.method_2036(0, var1.field_1932.field_3343));
      this.field_1301.method_1960((float)var1.field_1932.field_3355, (float)var1.field_1932.field_3356);
      return this.field_1301;
   }

   // $FF: renamed from: y () android.graphics.PointF
   public PointF method_980() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1932.field_3341.size() == 0) {
         return null;
      } else {
         int var2 = class_296.method_2035(var1.field_1932.field_3341.size());
         Point var3 = (Point)var1.field_1932.field_3341.get(var2);
         var1.field_1932.method_2579(var3.field_4722, var3.field_4723);
         this.field_1301.method_1960((float)var1.field_1932.field_3355, (float)var1.field_1932.field_3356);
         return this.field_1301;
      }
   }

   // $FF: renamed from: a (float, float) android.graphics.PointF
   public PointF method_981(float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      float var4 = -1.0F;
      PointF var5 = new PointF();

      for(int var6 = 0; var6 < var3.field_1932.field_3341.size(); ++var6) {
         Point var7 = (Point)var3.field_1932.field_3341.get(var6);
         var3.field_1932.method_2579(var7.field_4722, var7.field_4723);
         this.field_1301.method_1960((float)var3.field_1932.field_3355, (float)var3.field_1932.field_3356);
         PointF var8 = this.field_1301;
         float var9 = class_296.method_2026(var8.field_2406, var8.field_2407, var1, var2);
         if (var9 < var4 || var4 == -1.0F) {
            var4 = var9;
            var5.method_1961(var8);
         }
      }

      if (var4 == -1.0F) {
         return null;
      } else {
         return var5;
      }
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) com.corrodinggames.rts.game.a.h
   class_106 method_982(class_39 var1) {
      Iterator var2 = this.field_1300.iterator();

      while(var2.hasNext()) {
         class_100 var3 = (class_100)var2.next();
         if (var3 instanceof class_106) {
            class_106 var4 = (class_106)var3;
            if (var4.b(var1)) {
               return var4;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: b (float, float) com.corrodinggames.rts.game.a.h
   class_106 method_983(float var1, float var2) {
      Iterator var3 = this.field_1300.iterator();

      while(var3.hasNext()) {
         class_100 var4 = (class_100)var3.next();
         if (var4 instanceof class_106) {
            class_106 var5 = (class_106)var4;
            if (var5.d(var1, var2)) {
               return var5;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) com.corrodinggames.rts.game.a.h
   class_106 method_984(class_39 var1) {
      return this.method_985(var1.dh, var1.di);
   }

   // $FF: renamed from: c (float, float) com.corrodinggames.rts.game.a.h
   class_106 method_985(float var1, float var2) {
      float var3 = -1.0F;
      class_106 var4 = null;
      Iterator var5 = this.field_1300.iterator();

      while(true) {
         class_106 var7;
         float var8;
         do {
            class_100 var6;
            do {
               if (!var5.hasNext()) {
                  return var4;
               }

               var6 = (class_100)var5.next();
            } while(!(var6 instanceof class_106));

            var7 = (class_106)var6;
            var8 = var7.e(var1, var2);
         } while(var4 != null && var8 >= var3);

         var3 = var8;
         var4 = var7;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, float, float, boolean) com.corrodinggames.rts.game.a.h
   class_106 method_986(class_503 var1, float var2, float var3, boolean var4) {
      float var5 = -1.0F;
      class_106 var6 = null;
      Iterator var7 = this.field_1300.iterator();

      while(true) {
         class_106 var9;
         float var10;
         do {
            do {
               do {
                  class_100 var8;
                  do {
                     if (!var7.hasNext()) {
                        return var6;
                     }

                     var8 = (class_100)var7.next();
                  } while(!(var8 instanceof class_106));

                  var9 = (class_106)var8;
                  var10 = var9.e(var2, var3);
               } while(!this.method_970(var2, var3, var9, var1));
            } while(var4 && var9.field_1209);
         } while(var6 != null && var10 >= var5);

         var5 = var10;
         var6 = var9;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, float, float) boolean
   public static boolean method_987(class_39 var0, float var1, float var2, float var3) {
      float var4 = class_296.method_2026(var0.dh, var0.di, var1, var2);
      return var4 < var3 * var3;
   }

   // $FF: renamed from: a (android.graphics.PointF) boolean
   private boolean method_988(PointF var1) {
      if (method_1008(this, var1.field_2406, var1.field_2407, 290.0F) != null) {
         return false;
      } else {
         class_106 var2 = this.method_985(var1.field_2406, var1.field_2407);
         if (var2 != null && var2.e(var1.field_2406, var1.field_2407) < 490000.0F) {
            return false;
         } else {
            PointF var3 = this.method_981(var1.field_2406, var1.field_2407);
            float var4;
            if (var3 != null) {
               var4 = class_296.method_2026(var1.field_2406, var1.field_2407, var3.field_2406, var3.field_2407);
               if (var4 < 160000.0F) {
                  return false;
               }
            }

            var4 = 60.0F;
            return !class_205.method_1373(var1.field_2406, var1.field_2407) && !class_205.method_1373(var1.field_2406 + var4, var1.field_2407) && !class_205.method_1373(var1.field_2406, var1.field_2407 + var4) && !class_205.method_1373(var1.field_2406 - var4, var1.field_2407) && !class_205.method_1373(var1.field_2406, var1.field_2407 + var4);
         }
      }
   }

   // $FF: renamed from: b (android.graphics.PointF) boolean
   private boolean method_989(PointF var1) {
      Iterator var2 = class_39.field_126.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         if (var3.field_143 != this && var3 instanceof class_55) {
            if (var3.field_143.method_943(this) && method_987(var3, var1.field_2406, var1.field_2407, 300.0F)) {
               return false;
            }

            if (var3.field_143.method_944(this) && method_987(var3, var1.field_2406, var1.field_2407, 320.0F)) {
               return false;
            }
         }
      }

      if (method_1010(this, var1.field_2406, var1.field_2407, 360.0F) >= 4) {
         return false;
      } else {
         boolean var4 = true;
         if (method_1009(this, var1.field_2406, var1.field_2407, 360.0F, var4) >= 2) {
            return false;
         } else {
            return true;
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.a.d, com.corrodinggames.rts.game.a.b) int
   public int method_990(class_150 var1, class_142 var2) {
      int var3 = 0;

      class_149 var5;
      for(Iterator var4 = var1.field_1398.iterator(); var4.hasNext(); var3 += this.method_991(var5.field_1394, var2)) {
         var5 = (class_149)var4.next();
      }

      return var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, com.corrodinggames.rts.game.a.b) int
   public int method_991(class_24 var1, class_142 var2) {
      return this.method_992(var1, true, var2);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, boolean, com.corrodinggames.rts.game.a.b) int
   public int method_992(class_24 var1, boolean var2, class_142 var3) {
      boolean var4 = var1.method_134();
      Integer var5 = this.field_1313.method_1122(var4, var1, var2);
      if (var5 != null) {
         return var5;
      } else {
         int var6 = 0;
         if (var4) {
            var2 = false;
         }

         class_39[] var7 = class_39.field_126.method_1326();
         int var8 = 0;

         for(int var9 = class_39.field_126.size(); var8 < var9; ++var8) {
            class_39 var10 = var7[var8];
            if (var10.field_143 == this && (var3 == class_142.field_1374 || !var10.field_133)) {
               if (var10.field_216 == var1) {
                  ++var6;
               }

               if (var2 && var10 instanceof class_8) {
                  class_8 var11 = (class_8)var10;
                  var6 += var11.method_11(var1);
               }
            }
         }

         this.field_1313.method_1123(var4, var1, var2, var6);
         return var6;
      }
   }

   // $FF: renamed from: z () int
   public int method_993() {
      int var1 = 0;
      Iterator var2 = this.field_1300.iterator();

      while(var2.hasNext()) {
         class_100 var3 = (class_100)var2.next();
         if (var3 instanceof class_104) {
            class_104 var4 = (class_104)var3;
            var1 += var4.C.size();
         }
      }

      return var1;
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_994(class_39 var1) {
      if (var1 instanceof class_44) {
         class_44 var2 = (class_44)var1;
         if (var2.bD()) {
            class_24 var3 = var2.o();
            if (var3 instanceof class_479) {
               class_479 var4 = (class_479)var3;
               if (!var4.field_4393) {
                  return false;
               }
            }

            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_995(class_39 var1) {
      if (var1 instanceof class_44) {
         class_44 var2 = (class_44)var1;
         if (!var2.aZ() && var2.l() && !var2.bD() && !var2.method_283()) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_996(class_39 var1, class_39 var2) {
      class_44 var3;
      if (this.z) {
         if (var1 instanceof class_44) {
            var3 = (class_44)var1;
            if (var3.method_399() && var3.method_385(var2)) {
               return true;
            }
         }

         return false;
      } else {
         if (this.method_995(var1) && var1 instanceof class_44) {
            var3 = (class_44)var1;
            if (var3.method_385(var2)) {
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: f (float) void
   public void method_997(float var1) {
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.k) com.corrodinggames.rts.game.units.aa
   public class_39 method_998(class_107 var1) {
      Iterator var2 = class_39.field_126.iterator();

      class_39 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_39)var2.next();
      } while(var3.field_143 != var1 || !(var3 instanceof class_55));

      return var3;
   }

   // $FF: renamed from: a (float) void
   public void method_928(float var1) {
      class_236 var2 = class_236.method_1549();
      if (!this.field_1288 && !this.field_1289) {
         if (var2.field_1944.field_3809) {
            if (!var2.field_1944.field_3810) {
               return;
            }

            if (var2.field_1948.method_2658()) {
               return;
            }
         }

         if (this.field_1315 > 0.0F) {
            this.field_1315 -= var1;
         } else {
            this.field_1314 = this.j();
            if (this.field_1293) {
               this.field_1293 = false;
               this.field_1294 = true;
               this.field_1295 = true;
               this.field_1296 = true;
               this.field_1297 = true;
               class_39 var3 = this.method_998(this);
               if (var3 == null) {
                  this.method_978("firstRun: no command center found");
               }

               if (var3 != null) {
                  for(int var4 = 0; var4 < 10; ++var4) {
                     class_107 var5 = class_107.method_954(var4);
                     if (var5 != null && var5 != this) {
                        class_39 var6 = this.method_998(var5);
                        if (var6 != null) {
                           if (!this.method_971(var3.dh, var3.di, var6.dh, var6.di, class_503.field_4618)) {
                              this.field_1294 = false;
                           }

                           if (!this.method_971(var3.dh, var3.di, var6.dh, var6.di, class_503.field_4622)) {
                              this.field_1295 = false;
                           }
                        }
                     }
                  }

                  Iterator var9 = var2.field_1932.field_3341.iterator();

                  while(var9.hasNext()) {
                     Point var11 = (Point)var9.next();
                     PointF var13 = var2.field_1932.method_2580(var11);
                     if (!this.method_971(var3.dh, var3.di, var13.field_2406, var13.field_2407 + (float)var2.field_1932.field_3331, class_503.field_4618)) {
                        this.field_1296 = false;
                     }

                     if (!this.method_971(var3.dh, var3.di, var13.field_2406, var13.field_2407 + (float)var2.field_1932.field_3331, class_503.field_4622)) {
                        this.field_1297 = false;
                     }
                  }
               }
            }

            this.field_1280 += var1;
            this.field_1281 += var1;
            if (this.field_1280 > 50.0F) {
               this.field_1280 -= 50.0F;
               if (this.field_1280 > 50.0F) {
                  this.field_1280 = 50.0F;
               }

               if (this.field_1280 < -1.0F) {
                  this.field_1280 = -1.0F;
               }

               int var8 = 0;
               boolean var10 = false;
               Iterator var12 = this.field_1299.iterator();

               while(var12.hasNext()) {
                  class_100 var14 = (class_100)var12.next();
                  if (var14 instanceof class_106) {
                     class_106 var7 = (class_106)var14;
                     var7.field_1193 += this.field_1281;
                     if (this.field_1275 == var8) {
                        var10 = true;
                        var7.method_907(var7.field_1193);
                        var7.method_903(var7.field_1193);
                        var7.field_1193 = 0.0F;
                     }

                     ++var8;
                  }
               }

               ++this.field_1275;
               if (!var10) {
                  this.field_1275 = 0;
               }

               this.field_1281 = 0.0F;
            }

            this.field_1276 += var1;
            this.field_1277 += var1;
            if (this.field_1276 > 80.0F) {
               this.method_1004(this.field_1277);
               this.field_1276 -= 80.0F;
               if (this.field_1276 > 80.0F) {
                  this.field_1276 = 80.0F;
               }

               if (this.field_1276 < -1.0F) {
                  this.field_1276 = -1.0F;
               }

               this.field_1277 = 0.0F;
            }

            this.field_1278 += var1;
            this.field_1279 += var1;
            if (this.field_1278 > 250.0F) {
               this.method_1002(this.field_1279);
               this.field_1278 -= 250.0F;
               if (this.field_1278 > 250.0F) {
                  this.field_1278 = 250.0F;
               }

               if (this.field_1278 < -1.0F) {
                  this.field_1278 = -1.0F;
               }

               this.field_1279 = 0.0F;
            }

         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, java.lang.String) void
   public void method_999(class_44 var1, String var2) {
      class_236 var3 = class_236.method_1549();
      class_324 var4 = var3.field_1952.method_2159(this);
      var4.method_2184(var1);
      var4.method_2198(var2);
   }

   // $FF: renamed from: g (float) void
   public void method_1000(float var1) {
      Iterator var2 = class_39.field_126.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         if (var3.field_143 == this && var3 instanceof class_44) {
            class_44 var4 = (class_44)var3;
            boolean var5;
            class_39 var6;
            boolean var7;
            if (var4 instanceof class_72) {
               var5 = false;
               var6 = var4.method_371();
               if (var6 != null && var4.method_378(var6)) {
                  var5 = !var6.method_304();
               }

               var7 = !var4.H();
               if (var5 && var5 != var7) {
                  this.method_999(var4, class_72.field_608.method_1043());
               }

               if (!var5 && var5 != var7) {
                  this.method_999(var4, class_72.field_609.method_1043());
               }
            }

            if (var4 instanceof class_75) {
               var5 = true;
               var6 = var4.method_371();
               if (var6 != null && var4.method_378(var6)) {
                  var5 = !var6.method_282();
               }

               var7 = !var4.H();
               if (var5 && var5 != var7) {
                  this.method_999(var4, class_75.field_642.method_1043());
               }

               if (!var5 && var5 != var7) {
                  this.method_999(var4, class_75.field_643.method_1043());
               }
            }

            if (var4.method_462() == class_280.field_2404 && var4.method_399() && var4.method_371() != null) {
               class_236 var9 = class_236.method_1549();
               class_324 var8 = var9.field_1952.method_2159(this);
               var8.method_2184(var4);
               var8.method_2188(var4.method_371());
            }
         }
      }

   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.p) com.corrodinggames.rts.game.units.a
   public class_281 method_1001(class_44 var1) {
      if (var1.method_432()) {
         boolean var2 = true;
         if (var1.method_283()) {
            var2 = false;
         }

         if (var1.bD()) {
            var2 = false;
         }

         if (var2) {
            return class_281.field_2408;
         }
      }

      return class_281.field_2409;
   }

   // $FF: renamed from: h (float) void
   public void method_1002(float var1) {
      class_236 var2 = class_236.method_1549();
      this.field_1313.method_1127();
      int var3 = 0;
      class_39[] var4 = class_39.field_126.method_1326();
      int var5 = 0;

      int var6;
      class_39 var7;
      class_44 var8;
      for(var6 = class_39.field_126.size(); var5 < var6; ++var5) {
         var7 = var4[var5];
         if (var7.field_143 == this && !var7.method_318()) {
            ++var3;
            if (var7 instanceof class_44) {
               var8 = (class_44)var7;
               if (var7.field_182 == null) {
                  class_106 var9 = var8.field_312;
                  var8.field_312 = this.method_984(var8);
                  if (var8.field_312 != null && var9 != var8.field_312 && var8.aZ()) {
                     var8.field_313 = this.method_971(var7.dh, var7.di, var8.field_312.G, var8.field_312.H, class_503.field_4618);
                     if (!var8.field_313 && var8.o().method_138()) {
                        var8.field_313 = this.method_971(var7.dh, var7.di + 15.0F, var8.field_312.G, var8.field_312.H, class_503.field_4618);
                     }
                  }
               }
            }
         }
      }

      this.method_1000(var1);
      Iterator var22 = class_39.field_126.iterator();

      class_39 var25;
      while(var22.hasNext()) {
         var25 = (class_39)var22.next();
         if (var25.field_143 == this && var25 instanceof class_44) {
            class_44 var27 = (class_44)var25;
            class_281 var31 = this.method_1001(var27);
            if (var27.field_268 != var31) {
               class_324 var33 = var2.field_1952.method_2159(this);
               var33.method_2184(var27);
               var33.method_2200(var31);
            }

            if (var27.method_283() && var27.ca() && var27.field_311 == null) {
               class_104.method_862(this, var27);
            }
         }
      }

      if (var3 == 0 && !this.z) {
         this.field_1289 = true;
      }

      this.field_1285 = class_296.method_2020(this.field_1285, var1);
      this.field_1284 = class_296.method_2020(this.field_1284, var1);
      if (this.method_965()) {
         this.field_1284 = class_296.method_2020(this.field_1284, 4.0F * var1);
      }

      if (this.field_1284 == 0.0F) {
         PointF var23 = this.method_980();
         if (var23 != null) {
            var23.field_2407 += (float)var2.field_1932.field_3331;
            if (this.method_983(var23.field_2406, var23.field_2407) == null && this.method_989(var23)) {
               this.field_1284 = 2000.0F;
               class_106 var26 = new class_106(this, var23.field_2406, var23.field_2407);
               var26.I = 360.0F;
               var26.field_1194 = class_143.field_1377;
               var26.field_1195 = class_147.field_1388;
               ++this.field_1261;
            }
         }
      }

      int var24;
      if (this.field_1285 == 0.0F) {
         this.field_1285 = 100.0F;
         var24 = 0;
         Iterator var28 = this.field_1300.iterator();

         class_106 var32;
         while(var28.hasNext()) {
            class_100 var29 = (class_100)var28.next();
            if (var29 instanceof class_106) {
               var32 = (class_106)var29;
               if (var32.field_1195 == class_147.field_1389) {
                  ++var24;
               }
            }
         }

         if (var24 < 3) {
            var25 = this.method_1006();
            if (var25 != null) {
               PointF var30 = new PointF();
               var30.field_2406 = var25.dh;
               var30.field_2407 = var25.di;
               if (var30 != null && this.method_983(var30.field_2406, var30.field_2407) == null && this.method_988(var30)) {
                  this.field_1285 = 5000.0F;
                  var32 = new class_106(this, var30.field_2406, var30.field_2407);
                  var32.I = 310.0F;
                  var32.field_1194 = class_143.field_1377;
                  var32.field_1195 = class_147.field_1389;
                  this.method_978("making new outpost on attacking unit:(" + var30.field_2406 + "," + var30.field_2407 + ")");
                  ++this.field_1261;
               }
            }
         }
      }

      this.field_1292 = 0;
      this.field_1290 = 0;
      this.field_1291 = 0;
      var4 = class_39.field_126.method_1326();
      var5 = 0;

      for(var6 = class_39.field_126.size(); var5 < var6; ++var5) {
         var7 = var4[var5];
         if (var7.field_143 == this && var7 instanceof class_44) {
            var8 = (class_44)var7;
            if (!var7.method_212()) {
               if (var8.field_311 != null && var8.field_311.method_848()) {
                  ++this.field_1291;
               } else if (this.method_995(var8) && !var8.ba) {
                  if (var8.h() == class_503.field_4621) {
                     ++this.field_1292;
                  } else {
                     ++this.field_1290;
                  }
               }
            }
         }
      }

      this.field_1282 = class_296.method_2020(this.field_1282, var1);
      this.field_1283 += var1;
      if (this.field_1282 == 0.0F) {
         var24 = 0;
         var5 = 0;
         var6 = 0;
         int var34 = 0;
         Iterator var35 = class_39.field_126.iterator();

         while(true) {
            class_39 var36;
            do {
               do {
                  if (!var35.hasNext()) {
                     if (this.e(4100) || this.field_1283 > 2400.0F || this.field_1272 == 0) {
                        boolean var37 = false;
                        if (this.e(30000)) {
                           var37 = true;
                        }

                        Iterator var38 = class_39.field_126.iterator();

                        while(var38.hasNext()) {
                           class_39 var40 = (class_39)var38.next();
                           if (var40.field_143 == this && var40 instanceof class_44) {
                              class_44 var11 = (class_44)var40;
                              String var12 = var11.by();
                              if (class_121.method_1039(var12)) {
                                 float var14 = var11.bz();
                                 boolean var13;
                                 if (var14 < 0.0F) {
                                    var14 = 6.0F;
                                    var13 = false;
                                 } else {
                                    var13 = true;
                                 }

                                 if (var14 != 0.0F) {
                                    boolean var15 = false;
                                    int var16 = class_296.method_2035(100);
                                    float var17 = 100.0F - var14;
                                    if (var37) {
                                       var17 -= 4.0F;
                                    }

                                    if (!var13) {
                                       if (var40.method_295().method_138() && var34 > 0) {
                                          var17 = 50.0F;
                                       }

                                       if (var5 > 0 && var24 == 0) {
                                          var17 = 99.0F;
                                          if (var40 instanceof class_53) {
                                             var17 = 40.0F;
                                          }
                                       }
                                    }

                                    if (var17 < 10.0F) {
                                       var17 = 10.0F;
                                    }

                                    var15 = (float)var16 > var17;
                                    if (var15) {
                                       boolean var18 = var11.bA();
                                       if (var18) {
                                       }

                                       if (class_296.method_2035(100) > 50) {
                                          var11.a(this.field_1316);
                                          if (this.field_1316.size() != 0) {
                                             var12 = (String)this.field_1316.get((new Random()).nextInt(this.field_1316.size()));
                                          }
                                       }

                                       boolean var19 = false;
                                       class_121 var20 = var11.b(var12);
                                       if (var20 != null) {
                                          if (var20.method_1061(var11)) {
                                             var19 = true;
                                          }

                                          if (var20.method_1059() == class_516.field_4689) {
                                             var19 = true;
                                          }
                                       } else {
                                          var19 = true;
                                       }

                                       if (!var19) {
                                          class_324 var21 = var2.field_1952.method_2159(this);
                                          var21.method_2184(var11);
                                          var21.method_2198(var12);
                                          this.field_1282 = 900.0F;
                                          this.field_1283 = 0.0F;
                                          if (!var37) {
                                             return;
                                          }

                                          if (this.e(40000)) {
                                             if (class_296.method_2035(100) > 95) {
                                                return;
                                             }
                                          } else if (class_296.method_2035(100) > 80) {
                                             return;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     return;
                  }

                  var36 = (class_39)var35.next();
               } while(var36.field_143 != this);
            } while(!var36.method_228());

            if ((var36 instanceof class_59 || var36 instanceof class_53 || var36 instanceof class_62) && var36 instanceof class_53) {
               ++var5;
               class_53 var10 = (class_53)var36;
               if (var10.method_261() > 1) {
                  ++var24;
               }
            }

            if (var36.method_295().method_138()) {
               ++var6;
               String var39 = var36.method_269();
               if (class_121.method_1039(var39)) {
                  ++var34;
               }
            }
         }
      }
   }

   // $FF: renamed from: A () void
   public void method_1003() {
      class_236.method_1591("initFromSave:zones");
      Iterator var1 = this.field_1299.iterator();

      class_100 var2;
      while(var1.hasNext()) {
         var2 = (class_100)var1.next();
         if (var2 instanceof class_106) {
            ((class_106)var2).method_904();
         }
      }

      class_236.method_1591("initFromSave:end zones");
      var1 = this.field_1299.iterator();

      Iterator var3;
      class_100 var4;
      while(var1.hasNext()) {
         var2 = (class_100)var1.next();
         var3 = this.field_1299.iterator();

         while(var3.hasNext()) {
            var4 = (class_100)var3.next();
            if (var2 != var4 && var2.field_1138 == var4.field_1138) {
               class_236.method_1587("Id overlap on:" + var2.field_1138);
               class_236.method_1587("zone x:" + var2.field_1140);
               class_236.method_1587("zone y:" + var2.field_1141);
               class_236.method_1587("zone radius:" + var2.field_1142);
               class_236.method_1587("zone type:" + var2.getClass().getName());
            }
         }
      }

      class_236.method_1591("num zones:" + this.field_1299.size());
      class_236.method_1591("num fastZones:" + this.field_1300.size());
      int var8 = 0;
      Iterator var9 = this.field_1299.iterator();

      while(var9.hasNext()) {
         class_100 var11 = (class_100)var9.next();
         if (var11 instanceof class_106) {
            ++var8;
         }
      }

      class_236.method_1591("baseCount:" + var8);
      int var10 = 0;
      var3 = this.field_1299.iterator();

      while(true) {
         do {
            if (!var3.hasNext()) {
               class_236.method_1591("baseOverlapCount:" + var10);
               return;
            }

            var4 = (class_100)var3.next();
         } while(!(var4 instanceof class_106));

         Iterator var5 = this.field_1299.iterator();

         while(var5.hasNext()) {
            class_100 var6 = (class_100)var5.next();
            if (var6 instanceof class_106 && var4 != var6) {
               float var7 = class_296.method_2026(var4.field_1140, var4.field_1141, var6.field_1140, var6.field_1141);
               if (var7 < 400.0F) {
                  ++var10;
               }
            }
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   public void method_956(class_44 var1) {
      if (var1.bk == this) {
         this.field_1313.method_1126(var1);
      }

   }

   // $FF: renamed from: i (float) void
   public void method_1004(float var1) {
      class_236 var2 = class_236.method_1549();
      this.field_1313.method_1124();
      Iterator var3 = this.field_1299.iterator();

      class_100 var4;
      class_102 var5;
      while(var3.hasNext()) {
         var4 = (class_100)var3.next();
         if (var4 instanceof class_102) {
            var5 = (class_102)var4;
            var5.method_855(var1);
         }
      }

      this.field_1287 = class_296.method_2020(this.field_1287, var1);
      int var15 = 0;
      Iterator var16 = this.field_1300.iterator();

      while(var16.hasNext()) {
         class_100 var17 = (class_100)var16.next();
         if (var17 instanceof class_106) {
            ++var15;
         }
      }

      if (var15 < 1) {
         var16 = class_39.field_126.iterator();

         class_106 var6;
         class_39 var18;
         while(var16.hasNext()) {
            var18 = (class_39)var16.next();
            if (var18.field_143 == this && var18 instanceof class_55) {
               var6 = new class_106(this, var18.dh, var18.di);
               var6.I = 420.0F;
               var6.field_1194 = class_143.field_1379;
               var6.field_1195 = class_147.field_1387;
               ++var15;
               break;
            }
         }

         if (var15 < 1) {
            var16 = class_39.field_126.iterator();

            while(var16.hasNext()) {
               var18 = (class_39)var16.next();
               if (var18.field_143 == this && this.field_1309.method_1142(var18.method_295())) {
                  var6 = new class_106(this, var18.dh, var18.di);
                  var6.I = 420.0F;
                  var6.field_1194 = class_143.field_1379;
                  var6.field_1195 = class_147.field_1387;
                  ++var15;
                  break;
               }
            }
         }

         if (var15 < 1) {
            var16 = class_39.field_125.iterator();

            label255:
            while(true) {
               do {
                  do {
                     if (!var16.hasNext()) {
                        break label255;
                     }

                     var18 = (class_39)var16.next();
                  } while(var18.field_143 != this);
               } while(!(var18 instanceof class_44));

               class_44 var21 = (class_44)var18;
               boolean var7 = false;
               Iterator var8 = this.field_1309.field_1398.iterator();

               while(var8.hasNext()) {
                  class_149 var9 = (class_149)var8.next();
                  if (var21.method_390(var9.field_1394)) {
                     var7 = true;
                     break;
                  }
               }

               if (var7) {
                  class_106 var26 = new class_106(this, var18.dh, var18.di);
                  var26.I = 420.0F;
                  var26.field_1194 = class_143.field_1379;
                  var26.field_1195 = class_147.field_1387;
                  ++var15;
                  break;
               }
            }
         }

         for(int var19 = 0; var19 < var2.field_1932.field_3341.size(); ++var19) {
            Point var20 = (Point)var2.field_1932.field_3341.get(var19);
            var2.field_1932.method_2579(var20.field_4722, var20.field_4723);
            this.field_1301.method_1960((float)var2.field_1932.field_3355, (float)var2.field_1932.field_3356);
            PointF var22 = this.field_1301;
            var22.field_2407 += (float)var2.field_1932.field_3331;
            if (this.method_983(var22.field_2406, var22.field_2407) == null && this.method_989(var22) && this.method_1011(this.field_1310, var22.field_2406, var22.field_2407, 200) >= 1) {
               class_106 var24 = new class_106(this, var22.field_2406, var22.field_2407);
               var24.I = 360.0F;
               var24.field_1194 = class_143.field_1377;
               var24.field_1195 = class_147.field_1388;
               this.method_978("marking existing base on res pool:(" + var22.field_2406 + "," + var22.field_2407 + ")");
            }
         }
      }

      var4 = null;
      var5 = null;
      class_39[] var23 = class_39.field_126.method_1326();
      int var25 = 0;

      class_44 var10;
      int var27;
      class_39 var28;
      for(var27 = class_39.field_126.size(); var25 < var27; ++var25) {
         var28 = var23[var25];
         if (var28.field_143 == this && var28.field_182 == null && var28 instanceof class_44 && var28.method_283() && this.method_1005(var28)) {
            var10 = (class_44)var28;
            class_106 var11 = this.method_982(var10);
            if (var11 != null) {
               if (var10.method_399()) {
                  ;
               }
            } else if (var10.method_399()) {
               class_106 var12 = this.method_984(var10);
               if (var12 != null) {
                  PointF var13 = var12.s();
                  class_324 var14 = var2.field_1952.method_2159(this);
                  var14.method_2184(var10);
                  var14.method_2186(var13.field_2406, var13.field_2407);
               }
            }
         }
      }

      var25 = 0;

      for(var27 = class_39.field_126.size(); var25 < var27; ++var25) {
         var28 = var23[var25];
         if (var28.field_143 == this && var28 instanceof class_44) {
            var10 = (class_44)var28;
            if (var10.field_275 > 2400.0F && this.method_1005(var10)) {
               if (var10.field_329 && var10.field_275 < 24000.0F) {
                  continue;
               }

               class_324 var35 = var2.field_1952.method_2159(this);
               var35.method_2184(var10);
               var35.method_2185();
            }

            if (var10.method_283() && this.method_1005(var10)) {
               class_512 var36 = var10.method_400();
               if (var36 != null && var36.method_3255() == class_501.field_4597 && var10.field_275 > 700.0F) {
                  class_324 var38 = var2.field_1952.method_2159(this);
                  var38.method_2184(var10);
                  var38.method_2185();
               }
            }
         }
      }

      if (!this.z) {
         this.method_976();
         byte var30 = 1;
         if (this.field_1263 > 6) {
            var30 = 2;
         }

         if (this.field_1263 > 11) {
            var30 = 3;
         }

         class_104 var29;
         if (this.field_1267 < var30) {
            var29 = new class_104(this, false);
            var29.field_1190 = 8;
            if (this.method_965()) {
               var29.field_1190 = 12;
            }

            var29.method_871();
            ++this.field_1260;
         }

         if ((this.field_1268 >= var30 || this.field_1269 > 6) && this.field_1265 < 1) {
            var29 = new class_104(this, true);
            if (this.field_1259 < 2) {
               var29.field_1190 = 3;
            } else if (this.field_1259 < 5) {
               var29.field_1190 = 5;
            } else {
               var29.field_1190 = 7;
               if (this.method_965()) {
                  if (this.field_1259 < 25) {
                     var29.field_1190 = 14;
                  } else {
                     var29.field_1190 = 18;
                  }
               }
            }

            var29.method_871();
            ++this.field_1259;
         }

         if (this.method_967() && this.field_1266 < 1) {
            var29 = new class_104(this, true);
            var29.field_1191 = true;
            var29.field_1190 = 5;
            if (this.method_965()) {
               var29.field_1190 = 10;
            }

            var29.method_871();
         }

         if (this.method_968() && this.field_1270 < 3) {
            class_103 var32 = new class_103(this);
            var32.field_1157 = 1;
            var32.method_861();
         }
      }

      if (this.z) {
         if (this.field_1287 > 30.0F) {
            this.field_1287 = 30.0F;
         }

         if (this.field_1287 == 0.0F) {
            ++this.field_1286;
            if (this.field_1286 == 1) {
               this.field_1287 = 1000.0F;
            } else if (this.field_1286 == 2) {
               this.field_1287 = 3000.0F;
               class_39 var34 = this.method_1007();
               if (var34 != null) {
                  if (this.z) {
                     var27 = 0;
                  } else {
                     var27 = 2;
                     if (this.field_1290 < 4) {
                        var27 = 5;
                     }
                  }

                  class_324 var31 = var2.field_1952.method_2159(this);
                  int var33 = 0;

                  for(int var37 = class_39.field_126.size(); var33 < var37; ++var33) {
                     class_39 var39 = var23[var33];
                     if (var39.field_143 == this && var39 instanceof class_44) {
                        class_44 var40 = (class_44)var39;
                        if (!var40.ba && this.method_996(var40, var34)) {
                           if (var27 <= 0) {
                              var31.method_2184(var40);
                           } else {
                              --var27;
                           }
                        }
                     }
                  }

                  var31.method_2187(var34.dh, var34.di);
               }
            } else {
               this.field_1286 = 0;
            }
         }
      }

   }

   // $FF: renamed from: g (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1005(class_39 var1) {
      return !var1.method_318();
   }

   // $FF: renamed from: B () com.corrodinggames.rts.game.units.aa
   public class_39 method_1006() {
      class_39 var1 = null;
      int var2 = 0;
      class_39[] var3 = class_39.field_126.method_1326();
      int var4 = 0;

      int var5;
      for(var5 = class_39.field_126.size(); var4 < var5; ++var4) {
         class_39 var6 = var3[var4];
         if (!var6.field_141 && var6.field_182 == null && this == var6.field_143 && this.method_995(var6)) {
            ++var2;
         }
      }

      var4 = (int)(Math.random() * (double)var2);
      var5 = 0;
      Iterator var8 = class_39.field_126.iterator();

      while(var8.hasNext()) {
         class_39 var7 = (class_39)var8.next();
         if (!var7.field_141 && var7.field_182 == null && this == var7.field_143 && this.method_995(var7)) {
            if (var5 == var4) {
               var1 = var7;
               break;
            }

            ++var5;
         }
      }

      return var1;
   }

   // $FF: renamed from: C () com.corrodinggames.rts.game.units.aa
   public class_39 method_1007() {
      class_39 var1 = null;
      int var2 = 0;
      class_39[] var3 = class_39.field_126.method_1326();
      int var4 = 0;

      int var5;
      for(var5 = class_39.field_126.size(); var4 < var5; ++var4) {
         class_39 var6 = var3[var4];
         if (!var6.field_141 && var6.field_182 == null && this.c(var6.field_143)) {
            ++var2;
         }
      }

      var4 = (int)(Math.random() * (double)var2);
      var5 = 0;
      Iterator var8 = class_39.field_126.iterator();

      while(var8.hasNext()) {
         class_39 var7 = (class_39)var8.next();
         if (!var7.field_141 && var7.field_182 == null && this.c(var7.field_143)) {
            if (var5 == var4) {
               var1 = var7;
               break;
            }

            ++var5;
         }
      }

      return var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, float, float, float) com.corrodinggames.rts.game.units.aa
   public static class_39 method_1008(class_107 var0, float var1, float var2, float var3) {
      float var4 = var3;
      class_39[] var5 = class_39.field_126.method_1326();
      int var6 = 0;

      for(int var7 = class_39.field_126.size(); var6 < var7; ++var6) {
         class_39 var8 = var5[var6];
         if (var8.dh + var4 > var1 && var8.dh - var4 < var1 && var8.di + var4 > var2 && var8.di - var4 < var2 && var8.field_143 != var0 && method_987(var8, var1, var2, var3) && var8.field_143.method_943(var0)) {
            return var8;
         }
      }

      return null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, float, float, float, boolean) int
   public static int method_1009(class_107 var0, float var1, float var2, float var3, boolean var4) {
      int var5 = 0;
      float var6 = var3;
      class_39[] var7 = class_39.field_126.method_1326();
      int var8 = 0;

      for(int var9 = class_39.field_126.size(); var8 < var9; ++var8) {
         class_39 var10 = var7[var8];
         if (var10.dh + var6 > var1 && var10.dh - var6 < var1 && var10.di + var6 > var2 && var10.di - var6 < var2 && var10.field_143 != var0 && method_987(var10, var1, var2, var3) && var10.field_143.method_944(var0) && (!var4 || var10.method_212())) {
            ++var5;
         }
      }

      return var5;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.k, float, float, float) int
   public static int method_1010(class_107 var0, float var1, float var2, float var3) {
      int var4 = 0;
      float var5 = var3;
      class_39[] var6 = class_39.field_126.method_1326();
      int var7 = 0;

      for(int var8 = class_39.field_126.size(); var7 < var8; ++var7) {
         class_39 var9 = var6[var7];
         if (var9.dh + var5 > var1 && var9.dh - var5 < var1 && var9.di + var5 > var2 && var9.di - var5 < var2 && var9.field_143 != var0 && method_987(var9, var1, var2, var3) && var9.field_143.method_943(var0)) {
            ++var4;
         }
      }

      return var4;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.a.d, float, float, int) int
   public int method_1011(class_150 var1, float var2, float var3, int var4) {
      int var5 = 0;

      class_149 var7;
      for(Iterator var6 = var1.field_1398.iterator(); var6.hasNext(); var5 += this.method_1012(var7.field_1394, var2, var3, var4)) {
         var7 = (class_149)var6.next();
      }

      return var5;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, float, float, int) int
   public int method_1012(class_24 var1, float var2, float var3, int var4) {
      int var5 = 0;
      class_39[] var6 = class_39.field_126.method_1326();
      int var7 = 0;

      for(int var8 = class_39.field_126.size(); var7 < var8; ++var7) {
         class_39 var9 = var6[var7];
         if (var9.field_143 == this && var9.field_216 == var1 && method_987(var9, var2, var3, (float)var4)) {
            ++var5;
         }
      }

      return var5;
   }

   // $FF: renamed from: q () void
   public void method_964() {
      if (this.w != 0 && this.field_1289) {
         class_236.method_1591("waking up AI");
         this.field_1289 = false;
      }

   }
}
