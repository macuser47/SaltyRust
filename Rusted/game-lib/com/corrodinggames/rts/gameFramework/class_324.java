package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.a;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_281;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_501;
import com.corrodinggames.rts.game.units.class_512;
import com.corrodinggames.rts.game.units.class_82;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.d.class_8;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.e
public class class_324 {
   // $FF: renamed from: a boolean
   public boolean field_2596;
   // $FF: renamed from: b int
   public int field_2597;
   // $FF: renamed from: c boolean
   public boolean field_2598;
   // $FF: renamed from: d boolean
   public boolean field_2599;
   // $FF: renamed from: e boolean
   public boolean field_2600;
   // $FF: renamed from: f com.corrodinggames.rts.game.k
   public class_107 field_2601;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.ar
   public class_512 field_2602;
   // $FF: renamed from: h java.lang.String
   public String field_2603;
   // $FF: renamed from: i android.graphics.PointF
   public PointF field_2604;
   // $FF: renamed from: j com.corrodinggames.rts.game.units.aa
   public class_39 field_2605;
   // $FF: renamed from: k com.corrodinggames.rts.game.units.a
   public class_281 field_2606;
   // $FF: renamed from: w android.graphics.PointF
   private PointF field_2607;
   // $FF: renamed from: l boolean
   public boolean field_2608;
   // $FF: renamed from: m com.corrodinggames.rts.game.k
   public class_107 field_2609;
   // $FF: renamed from: n short
   public short field_2610;
   // $FF: renamed from: o boolean
   public boolean field_2611;
   // $FF: renamed from: p float
   public float field_2612;
   // $FF: renamed from: q float
   public float field_2613;
   // $FF: renamed from: r int
   public int field_2614;
   // $FF: renamed from: x java.util.ArrayList
   private ArrayList field_2615;
   // $FF: renamed from: s java.util.ArrayList
   ArrayList field_2616;
   // $FF: renamed from: t java.util.ArrayList
   ArrayList field_2617;
   // $FF: renamed from: u boolean
   public boolean field_2618;
   // $FF: renamed from: v com.corrodinggames.rts.gameFramework.c
   // $FF: synthetic field
   final class_314 field_2619;

   public strictfp class_324(class_314 var1) {
      this.field_2619 = var1;
      this.field_2598 = false;
      this.field_2599 = false;
      this.field_2600 = false;
      this.field_2603 = class_121.field_1347;
      this.field_2608 = false;
      this.field_2615 = new ArrayList();
      this.field_2616 = new ArrayList();
      this.field_2617 = new ArrayList();
      this.field_2618 = false;
   }

   // $FF: renamed from: a () boolean
   public strictfp boolean method_2175() {
      Iterator var1 = this.field_2617.iterator();

      class_319 var2;
      do {
         if (!var1.hasNext()) {
            return true;
         }

         var2 = (class_319)var1.next();
      } while(var2.field_2577.method_1741() != null);

      return false;
   }

   // $FF: renamed from: b () void
   public strictfp void method_2176() {
      class_236 var1 = class_236.method_1549();
      this.field_2618 = true;
      class_295 var2 = var1.field_1942.method_153();
      Iterator var3 = this.field_2616.iterator();

      while(var3.hasNext()) {
         class_44 var4 = (class_44)var3.next();
         var2.field_2454.add(var4);
      }

      if (this.field_2602 != null) {
         float var15 = this.field_2602.method_3258();
         float var16 = this.field_2602.method_3259();
         if (this.field_2602.method_3255() == class_501.field_4595 || this.field_2602.method_3255() == class_501.field_4602 || this.field_2602.method_3255() == class_501.field_4596) {
            ArrayList var5 = var2.method_2003(var15, var16, this.field_2602.field_4675);
            Iterator var6 = var5.iterator();

            while(true) {
               class_44 var7;
               do {
                  do {
                     do {
                        if (!var6.hasNext()) {
                           return;
                        }

                        var7 = (class_44)var6.next();
                     } while(var7.method_416());
                  } while(!var7.method_431());
               } while(this.field_2598 && var7.method_400() != null);

               int var10 = 0;
               if (this.field_2602.method_3255() == class_501.field_4596) {
                  var10 = var7.method_438(this.field_2602.method_3260());
               }

               boolean var11 = true;
               class_319 var12 = new class_319();
               var12.field_2578 = var7.da;
               var12.field_2579 = var7.dh;
               var12.field_2580 = var7.di;
               var12.field_2581 = var15;
               var12.field_2582 = var16;
               var12.field_2583 = var1.field_1920;
               var12.field_2584 = var7.h();
               boolean var13 = false;
               boolean var14 = false;
               var12.field_2577 = var7.method_418(var15, var16, var10, var11, var13, var14);
               var12.field_2577.field_2160 = 120.0F;
               var12.field_2577.field_2159 = var12.field_2577.field_2160;
               var12.field_2577.field_2161 = true;
               this.field_2617.add(var12);
            }
         }
      }
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.k
   public strictfp class_107 method_2177() {
      return this.field_2601;
   }

   // $FF: renamed from: d () int
   public strictfp int method_2178() {
      return this.field_2615.size() + this.field_2616.size();
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_2179() {
      if (class_121.method_1039(this.field_2603)) {
         return false;
      } else {
         return this.method_2178() == 0;
      }
   }

   // $FF: renamed from: f () com.corrodinggames.rts.gameFramework.e
   public strictfp synchronized class_324 method_2180() {
      try {
         class_404 var1 = new class_404();
         this.method_2182(var1);
         class_463 var2 = new class_463(var1.method_2538());
         class_324 var3 = new class_324(this.field_2619);
         var3.field_2597 = this.field_2597;
         var3.method_2183(var2);
         return var3;
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }
   }

   // $FF: renamed from: g () void
   public strictfp void method_2181() {
      if (this.field_2602 != null) {
         Iterator var1 = this.field_2616.iterator();

         while(var1.hasNext()) {
            class_44 var2 = (class_44)var1.next();
            this.field_2615.add(var2.da);
         }

         this.field_2616.clear();
         this.field_2602.method_3273();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp synchronized void method_2182(class_404 var1) {
      var1.method_2565("c");
      var1.method_2539(this.field_2601.field_1227);
      var1.method_2540(this.field_2602 != null);
      if (this.field_2602 != null) {
         this.field_2602.method_3252(var1);
      }

      var1.method_2540(this.field_2598);
      var1.method_2540(this.field_2600);
      var1.method_2541(-1);
      var1.method_2553(this.field_2606);
      var1.method_2540(this.field_2607 != null);
      if (this.field_2607 != null) {
         var1.method_2542(this.field_2607.field_2406);
         var1.method_2542(this.field_2607.field_2407);
      }

      var1.method_2540(this.field_2608);
      var1.method_2541(this.field_2616.size() + this.field_2615.size());
      Iterator var2 = this.field_2616.iterator();

      while(var2.hasNext()) {
         class_44 var3 = (class_44)var2.next();
         var1.method_2543(var3.da);
      }

      var2 = this.field_2615.iterator();

      while(var2.hasNext()) {
         long var6 = (Long)var2.next();
         var1.method_2543(var6);
      }

      var1.method_2540(this.field_2609 != null);
      if (this.field_2609 != null) {
         var1.method_2556(this.field_2609);
      }

      var1.method_2540(this.field_2604 != null);
      if (this.field_2604 != null) {
         var1.method_2542(this.field_2604.field_2406);
         var1.method_2542(this.field_2604.field_2407);
      }

      var1.method_2550(this.field_2605);
      var1.method_2545(this.field_2603);
      var1.method_2540(this.field_2599);
      var1.method_2561(this.field_2610);
      var1.method_2540(this.field_2611);
      if (this.field_2611) {
         var1.method_2539(0);
         var1.method_2542(this.field_2612);
         var1.method_2542(this.field_2613);
         var1.method_2541(this.field_2614);
      }

      var1.method_2541(this.field_2617.size());

      for(int var5 = 0; var5 < this.field_2617.size(); ++var5) {
         class_319 var7 = (class_319)this.field_2617.get(var5);
         var7.method_2163(var1);
      }

      var1.method_2567("c");
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_2183(class_463 var1) {
      var1.method_3030("c");
      this.field_2601 = class_107.method_954(var1.method_3009());
      if (this.field_2601 == null) {
         throw new IOException("team==null");
      } else {
         boolean var2 = var1.method_3010();
         if (var2) {
            this.field_2602 = new class_512();
            this.field_2602.method_3253(var1);
         }

         this.field_2598 = var1.method_3010();
         this.field_2600 = var1.method_3010();
         this.field_2603 = class_121.method_1041(String.valueOf(var1.method_3011()));
         this.field_2606 = (class_281)var1.method_3022(a.class);
         boolean var3 = var1.method_3010();
         if (var3) {
            this.field_2607 = new PointF();
            this.field_2607.field_2406 = var1.method_3012();
            this.field_2607.field_2407 = var1.method_3012();
         }

         this.field_2608 = var1.method_3010();
         int var4 = var1.method_3011();

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            this.field_2615.add(var1.method_3016());
         }

         if (var1.method_3006() >= 16) {
            this.field_2609 = null;
            if (var1.method_3010()) {
               this.field_2609 = var1.method_3024();
            }
         }

         if (var1.method_3006() >= 29) {
            boolean var8 = var1.method_3010();
            if (var8) {
               this.field_2604 = new PointF();
               this.field_2604.field_2406 = var1.method_3012();
               this.field_2604.field_2407 = var1.method_3012();
            }

            this.field_2605 = var1.method_3019();
         }

         if (var1.method_3006() >= 33) {
            this.field_2603 = class_121.method_1041(var1.method_3015());
         }

         if (var1.method_3006() >= 37) {
            this.field_2599 = var1.method_3010();
         }

         if (var1.method_3006() >= 52) {
            this.field_2610 = var1.method_3027();
         }

         if (var1.method_3006() >= 53) {
            this.field_2611 = var1.method_3010();
            if (this.field_2611) {
               var1.method_3009();
               this.field_2612 = var1.method_3012();
               this.field_2613 = var1.method_3012();
               this.field_2614 = var1.method_3011();
            }

            var5 = var1.method_3011();
            this.field_2617.clear();

            for(int var6 = 0; var6 < var5; ++var6) {
               class_319 var7 = new class_319();
               var7.method_2164(var1);
               this.field_2617.add(var7);
            }
         }

         var1.method_3036("c");
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   public strictfp void method_2184(class_44 var1) {
      if (var1 == null) {
         throw new RuntimeException("unit cannot be null");
      } else {
         if (var1.bk != this.field_2601) {
         }

         if (this.field_2601.field_1234 && var1.bk != this.field_2601) {
            class_236.method_1592("CommandController", "Warning AI: " + this.field_2601.field_1227 + " gave an order to unit with team:" + var1.bk.field_1227);
         }

         this.field_2616.add(var1);
      }
   }

   // $FF: renamed from: h () void
   public strictfp void method_2185() {
      this.field_2608 = true;
   }

   // $FF: renamed from: a (float, float) void
   public strictfp void method_2186(float var1, float var2) {
      this.field_2602 = new class_512();
      this.field_2602.method_3261(var1, var2);
   }

   // $FF: renamed from: b (float, float) void
   public strictfp void method_2187(float var1, float var2) {
      this.field_2602 = new class_512();
      this.field_2602.method_3262(var1, var2);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2188(class_39 var1) {
      this.field_2602 = new class_512();
      this.field_2602.method_3263(var1);
   }

   // $FF: renamed from: a (float, float, boolean) void
   public strictfp void method_2189(float var1, float var2, boolean var3) {
      this.field_2602 = new class_512();
      this.field_2602.method_3262(var1, var2);
      this.field_2602.field_4675 = var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) void
   public strictfp void method_2190(class_39 var1, boolean var2) {
      this.field_2602 = new class_512();
      this.field_2602.method_3263(var1);
      this.field_2602.field_4675 = var2;
   }

   // $FF: renamed from: a (float, float, com.corrodinggames.rts.game.units.ap, int) void
   public strictfp void method_2191(float var1, float var2, class_24 var3, int var4) {
      this.field_2602 = new class_512();
      this.field_2602.method_3264(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2192(class_39 var1) {
      this.field_2602 = new class_512();
      this.field_2602.method_3265(var1);
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2193(class_39 var1) {
      this.field_2602 = new class_512();
      this.field_2602.method_3266(var1);
   }

   // $FF: renamed from: c (float, float) void
   public strictfp void method_2194(float var1, float var2) {
      this.field_2602 = new class_512();
      this.field_2602.method_3267(var1, var2);
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2195(class_39 var1) {
      this.field_2602 = new class_512();
      this.field_2602.method_3268(var1);
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2196(class_39 var1) {
      this.field_2602 = new class_512();
      this.field_2602.method_3269(var1);
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2197(class_39 var1) {
      this.field_2602 = new class_512();
      this.field_2602.method_3270(var1);
   }

   // $FF: renamed from: a (java.lang.String) void
   public strictfp void method_2198(String var1) {
      this.field_2603 = var1;
   }

   // $FF: renamed from: a (java.lang.String, android.graphics.PointF, com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_2199(String var1, PointF var2, class_39 var3) {
      this.field_2603 = var1;
      this.field_2604 = var2;
      this.field_2605 = var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a) void
   public strictfp void method_2200(class_281 var1) {
      this.field_2606 = var1;
   }

   // $FF: renamed from: a (android.graphics.PointF) void
   public strictfp void method_2201(PointF var1) {
      this.field_2607 = var1;
   }

   // $FF: renamed from: i () void
   public strictfp synchronized void method_2202() {
      Iterator var1 = this.field_2615.iterator();

      while(var1.hasNext()) {
         Long var2 = (Long)var1.next();
         class_44 var3 = class_34.method_187(var2, true);
         if (var3 != null) {
            this.field_2616.add(var3);
         }
      }

      this.field_2615.clear();
      var1 = this.field_2616.iterator();

      while(var1.hasNext()) {
         class_44 var4 = (class_44)var1.next();
         if (var4.bi) {
            var1.remove();
         }
      }

   }

   // $FF: renamed from: j () void
   public strictfp void method_2203() {
      if (class_121.method_1039(this.field_2603)) {
         Iterator var1 = this.field_2616.iterator();

         while(var1.hasNext()) {
            class_44 var2 = (class_44)var1.next();
            var2.b(var2.b(this.field_2603), this.field_2600);
         }
      }

   }

   // $FF: renamed from: k () void
   public strictfp void method_2204() {
      class_236 var1 = class_236.method_1549();
      if (!var1.field_1948.method_2658() || this.field_2596) {
         this.method_2202();
         if (this.field_2611) {
            if (this.field_2612 != 0.0F) {
               class_236.method_1591("issueCommand: changeStepRate:" + this.field_2612);
               var1.field_1944.field_3815 = this.field_2612;
            } else if (this.field_2614 != 0) {
               class_236.method_1591("debugAction:" + this.field_2614);
               if (this.field_2614 == 1) {
                  class_236.method_1591("new DebugDesyncDetector");
                  class_82 var7 = new class_82(false);
                  var7.method_259(0);
               } else {
                  class_236.method_1591("issueCommand: unknown debug action:" + this.field_2614);
               }
            } else {
               class_236.method_1591("issueCommand: Null System action");
            }
         } else {
            Iterator var2;
            class_44 var3;
            if (this.field_2609 != null) {
               var2 = this.field_2616.iterator();

               while(var2.hasNext()) {
                  var3 = (class_44)var2.next();
                  if (var3.bk != this.field_2609 && !this.method_2205(this.field_2609, var3.bk)) {
                     class_454.method_2889("Player " + this.field_2609.field_1233 + " cannot control unit: " + var3.da, true);
                     var2.remove();
                  }
               }
            }

            if (this.field_2608) {
               var2 = this.field_2616.iterator();

               while(var2.hasNext()) {
                  var3 = (class_44)var2.next();
                  var3.method_407();
               }
            }

            if (this.field_2602 != null) {
               this.field_2602.method_3254();
               class_295 var6 = var1.field_1942.method_152();
               var6.field_2460 = this.field_2617;
               Iterator var9 = this.field_2616.iterator();

               while(var9.hasNext()) {
                  class_44 var10 = (class_44)var9.next();
                  if (this.field_2599) {
                     var10.method_408();
                  } else if (!this.field_2598) {
                     var10.method_407();
                  }

                  class_512 var5 = var10.method_398(this.field_2602);
                  var6.method_1997(var10, var5);
               }

               var6.method_2001();
            } else {
               if (class_121.method_1039(this.field_2603)) {
                  var2 = this.field_2616.iterator();

                  while(var2.hasNext()) {
                     var3 = (class_44)var2.next();
                     class_121 var4 = var3.b(this.field_2603);
                     if (var4 == null) {
                        class_236.method_1591("Could not find specialAction:" + this.field_2603 + " on " + var3.o().method_141());
                     } else if (!var4.method_1051(var3)) {
                        class_236.method_1591("!isAvailable specialAction:" + this.field_2603 + " on " + var3.o().method_141() + " (action being skipped)");
                     } else {
                        var3.b(var4);
                        var3.a(var4, this.field_2600, this.field_2604, this.field_2605);
                     }
                  }

                  if (this.field_2603.equals(var1.field_1939.field_953.v())) {
                     if (var1.field_1915 != null && this.field_2601 != null) {
                        if (this.field_2601.method_944(var1.field_1915)) {
                           var1.field_1939.method_751(this.field_2604.field_2406, this.field_2604.field_2407, this.field_2601);
                        }
                     } else {
                        class_236.method_1591("PingMapAction failed: game.playerTeam==null or this.team==null");
                     }
                  }
               }

               if (this.field_2606 != null) {
                  for(var2 = this.field_2616.iterator(); var2.hasNext(); var3.field_268 = this.field_2606) {
                     var3 = (class_44)var2.next();
                  }
               }

               if (this.field_2607 != null) {
                  var2 = this.field_2616.iterator();

                  while(var2.hasNext()) {
                     var3 = (class_44)var2.next();
                     if (var3 instanceof class_8) {
                        class_8 var8 = (class_8)var3;
                        var8.method_15(this.field_2607);
                     }
                  }
               }

            }
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, com.corrodinggames.rts.game.k) boolean
   public strictfp boolean method_2205(class_107 var1, class_107 var2) {
      if (var1 != null && var2 != null) {
         if (!var2.method_944(var1)) {
            return false;
         } else {
            return (this.field_2610 & 1 << var2.field_1227) != 0;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_2206() {
      this.field_2610 = 0;

      for(int var1 = 0; var1 < 10; ++var1) {
         class_107 var2 = class_107.method_954(var1);
         if (var2 != null && var2.method_920()) {
            this.field_2610 = (short)(this.field_2610 | 1 << var1);
         }
      }

      return true;
   }
}
