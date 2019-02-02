package com.corrodinggames.rts.game;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.a.class_11;
import com.corrodinggames.rts.a.class_273;
import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.b.class_424;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_42;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_504;
import com.corrodinggames.rts.game.units.p;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.game.units.d.class_55;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.class_192;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_249;
import com.corrodinggames.rts.gameFramework.class_287;
import com.corrodinggames.rts.gameFramework.class_289;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_305;
import com.corrodinggames.rts.gameFramework.class_31;
import com.corrodinggames.rts.gameFramework.class_314;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.class_398;
import com.corrodinggames.rts.gameFramework.class_399;
import com.corrodinggames.rts.gameFramework.class_400;
import com.corrodinggames.rts.gameFramework.class_402;
import com.corrodinggames.rts.gameFramework.class_417;
import com.corrodinggames.rts.gameFramework.class_426;
import com.corrodinggames.rts.gameFramework.class_439;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_35;
import com.corrodinggames.rts.gameFramework.b.class_388;
import com.corrodinggames.rts.gameFramework.b.class_389;
import com.corrodinggames.rts.gameFramework.b.class_391;
import com.corrodinggames.rts.gameFramework.c.class_174;
import com.corrodinggames.rts.gameFramework.c.class_98;
import com.corrodinggames.rts.gameFramework.d.class_432;
import com.corrodinggames.rts.gameFramework.e.class_220;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.g.class_238;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_23;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_464;
import com.corrodinggames.rts.gameFramework.h.class_467;
import com.corrodinggames.rts.gameFramework.h.class_474;
import com.corrodinggames.rts.gameFramework.j.class_223;
import com.corrodinggames.rts.gameFramework.utility.class_195;
import com.corrodinggames.rts.gameFramework.utility.class_197;
import com.corrodinggames.rts.gameFramework.utility.class_198;
import com.corrodinggames.rts.gameFramework.utility.class_199;
import com.corrodinggames.rts.gameFramework.utility.class_203;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;

// $FF: renamed from: com.corrodinggames.rts.game.g
public class class_237 extends class_236 {
   // $FF: renamed from: a int
   int field_2039;
   // $FF: renamed from: b float
   public float field_2040 = 1.0F;
   // $FF: renamed from: c java.lang.String
   public static String field_2041 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.h
   public class_23 field_2042;
   // $FF: renamed from: e com.corrodinggames.rts.game.h[]
   class_241[] field_2043 = new class_241[6];
   // $FF: renamed from: f int
   int field_2044;
   // $FF: renamed from: g java.lang.String
   String field_2045;
   // $FF: renamed from: h boolean
   public boolean field_2046 = false;
   // $FF: renamed from: i int
   public int field_2047 = 0;
   // $FF: renamed from: j java.util.concurrent.ConcurrentLinkedQueue
   public ConcurrentLinkedQueue field_2048 = new ConcurrentLinkedQueue();
   // $FF: renamed from: k android.graphics.Paint
   Paint field_2049;
   // $FF: renamed from: l android.graphics.Paint
   Paint field_2050;
   // $FF: renamed from: m android.graphics.Paint
   Paint field_2051;
   // $FF: renamed from: n android.graphics.Paint
   Paint field_2052;
   // $FF: renamed from: o android.graphics.Paint
   Paint field_2053;
   // $FF: renamed from: p int
   int field_2054 = 0;
   // $FF: renamed from: q int
   int field_2055 = 0;
   // $FF: renamed from: r int
   int field_2056 = 0;
   // $FF: renamed from: s float
   float field_2057 = 16.0F;
   // $FF: renamed from: t java.lang.String
   public String field_2058 = "0fps";
   // $FF: renamed from: u java.lang.Object
   public Object field_2059 = new Object();
   // $FF: renamed from: v java.lang.Object
   public Object field_2060 = new Object();
   // $FF: renamed from: w android.graphics.Rect
   Rect field_2061 = new Rect();
   // $FF: renamed from: x java.util.ArrayList
   public ArrayList field_2062 = new ArrayList();
   // $FF: renamed from: y android.graphics.Paint
   Paint field_2063;
   // $FF: renamed from: z android.graphics.Paint
   Paint field_2064;
   // $FF: renamed from: A android.graphics.Paint
   Paint field_2065;
   // $FF: renamed from: B android.graphics.Paint
   public Paint field_2066 = new Paint();
   // $FF: renamed from: C com.corrodinggames.rts.gameFramework.bc
   public class_399 field_2067;
   // $FF: renamed from: D com.corrodinggames.rts.gameFramework.bb
   public class_398 field_2068;
   // $FF: renamed from: E com.corrodinggames.rts.gameFramework.b.b
   public class_389 field_2069 = new class_389();
   // $FF: renamed from: F com.corrodinggames.rts.game.a
   class_233 field_2070;
   // $FF: renamed from: G float
   float field_2071 = 0.0F;
   // $FF: renamed from: H float
   public float field_2072 = 1.0F;
   // $FF: renamed from: I float
   public float field_2073;
   // $FF: renamed from: J float
   public float field_2074;
   // $FF: renamed from: K com.corrodinggames.rts.gameFramework.h.e
   class_306 field_2075;
   // $FF: renamed from: L com.corrodinggames.rts.gameFramework.h.e
   class_306 field_2076;
   // $FF: renamed from: M com.corrodinggames.rts.gameFramework.h.e
   class_306 field_2077;
   // $FF: renamed from: N float
   float field_2078 = 0.0F;
   // $FF: renamed from: O android.graphics.Rect
   Rect field_2079 = new Rect();
   // $FF: renamed from: P android.graphics.RectF
   RectF field_2080 = new RectF();
   // $FF: renamed from: Q com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_2081 = null;
   // $FF: renamed from: R com.corrodinggames.rts.gameFramework.utility.q
   class_203 field_2082 = new class_203("allOnScreenObjects");
   // $FF: renamed from: S android.graphics.Matrix
   Matrix field_2083 = new Matrix();
   // $FF: renamed from: T java.util.ArrayList
   public ArrayList field_2084 = new ArrayList();
   // $FF: renamed from: U java.util.ArrayList
   public ArrayList field_2085 = new ArrayList();
   // $FF: renamed from: V java.util.Timer
   Timer field_2086;
   // $FF: renamed from: W boolean
   boolean field_2087;
   // $FF: renamed from: X java.lang.Object
   Object field_2088 = new Object();
   // $FF: renamed from: Y com.corrodinggames.rts.game.units.aa
   class_39 field_2089;
   // $FF: renamed from: Z com.corrodinggames.rts.game.units.aa
   class_39 field_2090;
   // $FF: renamed from: aa float
   float field_2091;
   // $FF: renamed from: ab boolean
   boolean field_2092;

   public strictfp class_237(Context var1) {
      super(var1);
   }

   // $FF: renamed from: a () boolean
   public strictfp boolean method_1557() {
      if (this.bk.field_955) {
         return true;
      } else {
         return this.cQ != null && this.cQ.method_2216();
      }
   }

   // $FF: renamed from: a (boolean) boolean
   public strictfp boolean method_1558(boolean var1) {
      if (!var1 || this.bt.method_2658()) {
         if (this.bk.field_955) {
            return true;
         }

         if (this.aK) {
            return true;
         }

         if (this.ah && !this.ba) {
            return true;
         }

         if (this.aY && this.cQ != null && this.cQ.method_2216()) {
            return true;
         }
      }

      if (var1 && !this.bp.field_3887) {
         return true;
      } else {
         return this.bp.method_2898();
      }
   }

   // $FF: renamed from: b () int
   public strictfp int method_1658() {
      return this.field_2056;
   }

   // $FF: renamed from: a (android.content.Context) void
   public strictfp synchronized void method_1555(Context var1) {
      Log.method_1712("RustedWarfare", "--- ----------------- ----");
      Log.method_1712("RustedWarfare", "--- GameEngine:init() ----");
      Log.method_1712("RustedWarfare", "--- ----------------- ----");
      if (this.aE) {
         Log.method_1712("RustedWarfare", "GameEngine init has already been called");
      } else if (s() && this.getClass().equals(g.class)) {
         throw new RuntimeException("inSpace but class is:" + this.getClass());
      } else {
         System.gc();
         this.g("Asset Index");
         this.bc = new class_195(var1);
         long var2 = class_402.method_2522();
         this.bv = new class_402(this);
         this.bv.method_2526(class_192.field_1644);
         if (aw) {
            this.bz = 1.0F;
         } else {
            this.bz = var1.method_1854().getDisplayMetrics().density;
            class_236.method_1591("densityScaleRaw: " + this.bz);
         }

         this.bz *= this.field_2040;
         class_236.method_1591("densityScaleRaw*densityScaleMultiplier: " + this.bz);
         this.ci = 1.0F;
         if ((double)class_296.method_2042(this.bz - 1.0F) > 0.1D) {
            this.ci = this.bz;
            if (this.ci > 2.0F) {
               this.ci = 2.0F;
            }

            if (this.ci < 0.5F) {
               this.ci = 0.5F;
            }

            this.ch = this.cf * this.ci;
         }

         if (class_236.method_1547(var1)) {
            this.ai = true;
         }

         this.field_2070 = new class_234();
         this.aJ = false;
         this.g("InputController");
         this.bl = new class_426();
         this.bl.method_2712();
         this.g("SettingsEngine");
         this.bi = SettingsEngine.getInstance(var1);
         this.bA = this.I();
         class_236.method_1591("densityScale(): " + this.bA);
         long var4 = class_402.method_2522();
         class_432.method_2733();
         class_402.method_2525("Locale.init took:", var4);
         this.field_2049 = new Paint();
         this.field_2050 = new Paint();
         this.field_2050.method_2791(255, 255, 255, 255);
         this.field_2050.method_2781(true);
         this.a(this.field_2050, 16.0F);
         this.field_2051 = new Paint();
         this.field_2051.method_2791(255, 255, 255, 255);
         this.field_2051.method_2781(true);
         this.a(this.field_2051, 16.0F);
         this.field_2052 = new Paint();
         this.field_2052.method_2791(100, 255, 0, 0);
         this.a(this.field_2052, 16.0F);
         this.field_2053 = new Paint();
         this.field_2053.method_2791(100, 0, 255, 0);
         this.a(this.field_2053, 16.0F);
         this.cw = new Paint();
         this.cx = new Paint();
         this.cx.method_2801(Paint$Align.field_2227);
         this.cx.method_2781(true);
         this.cx.method_2799(Typeface.method_1917(Typeface.field_2362, 0));
         this.a(this.cx, 16.0F);
         this.cy = new Paint();
         this.cy.method_2791(255, 230, 255, 230);
         this.cy.method_2781(true);
         this.cy.method_2801(Paint$Align.field_2227);
         this.a(this.cy, 18.0F);
         this.field_2063 = new Paint();
         this.field_2063.method_2788(-1);
         this.field_2063.method_2790(100);
         this.field_2064 = new Paint();
         this.field_2064.method_2788(-7829368);
         this.field_2064.method_2790(240);
         this.field_2064.method_2786(Paint$Style.field_4586);
         this.field_2064.method_2793(1.0F);
         long var6 = class_402.method_2522();
         this.g("AudioEngine");
         class_525.method_3319();
         this.be = new class_525();
         this.be.method_3320(var1);
         class_402.method_2525("AudioEngine took:", var6);
         this.g("MusicController");
         this.bf = new class_439();
         this.bf.method_2753(var1);
         if (ax) {
            d("init(): using GraphicsSlick2d");

            try {
               this.bg = (class_22)aD.newInstance();
            } catch (InstantiationException var16) {
               throw new RuntimeException(var16);
            } catch (IllegalAccessException var17) {
               throw new RuntimeException(var17);
            }
         } else if (aw) {
            this.bg = new class_467();
         } else {
            this.bg = new class_464();
         }

         this.g("graphics.init");
         this.bg.method_56(var1);
         class_305.method_2109();
         this.g("Fonts");
         this.K();
         this.g("effects.init");
         this.bj = new class_391();
         this.bj.method_2489(var1);
         this.g("minimapHandler");
         this.bo = new class_174();
         this.bo.method_1225(var1);
         this.g("PathEngine");
         this.bm = new class_238();
         this.g("GroupController");
         this.bn = new class_31();
         this.g("CollisionEngine");
         this.bh = new class_249();
         this.g("InterfaceEngine");
         this.bk = new class_98();
         this.bk.method_711(var1);
         this.field_2068 = class_398.method_2511(var1);
         this.g("NetworkEngine");
         this.bp = new class_454();
         this.bp.method_2891();
         this.g("StatsHandler");
         this.bq = new class_400();
         this.g("ModEngine");
         this.br = new class_220();
         this.br.method_1436();
         this.g("CommandController");
         this.bx = new class_314();
         this.g("GameSaver");
         this.bs = new class_287();
         this.g("ReplayEngine");
         this.bt = new class_417();
         this.bt.method_2641(var1);
         this.g("UnitGeoIndex");
         this.bu = new class_504();
         this.g("Precalculating map fog");
         class_408.method_2571();
         this.g("ScorchMark.load");
         class_36.method_198();
         this.g("Projectile.load");
         class_97.method_695();
         this.g("Emitter.load");
         class_35.method_191();
         this.g("Unit.loadAllUnits");
         long var8 = class_402.method_2522();
         class_39.method_211();
         class_402.method_2525("loadAllUnits took:", var8);
         this.g("Loading custom unit data");
         long var10 = class_402.method_2522();
         class_479.method_3149();
         this.g("getAllUnitsChecksum");
         class_402.method_2525("CustomUnits took:", var10);
         long var12 = class_402.method_2522();
         this.field_2039 = class_39.method_219();
         class_402.method_2525("allUnitsChecksum took:", var12);
         this.field_2065 = new Paint();
         this.field_2065.method_2791(50, 255, 255, 255);
         this.v();
         System.gc();
         this.aE = true;
         class_236.method_1591("Init completed");
         class_402.method_2525("Loading took:", var2);
         this.bv.method_2527(class_192.field_1644);
         this.bv.method_2532(true, true);
         long var14 = class_402.method_2522();
         this.g("Loading map data");
         if (!class_236.field_1889) {
            this.method_1572();
         }

         class_402.method_2525("loadAMenuMap took:", var14);
         Y();
         this.g("init complete");
         if (ao) {
            class_469.method_3058();
            System.exit(0);
         }

         this.aF = true;
      }
   }

   // $FF: renamed from: c () void
   public strictfp void method_1571() {
      this.A();
      this.method_1662();
   }

   // $FF: renamed from: d () void
   public strictfp void method_1662() {
      this.method_1664(false);
      this.aZ = false;
      this.ba = false;
      this.aY = false;
      this.aK = false;
      this.bk.field_955 = false;
   }

   // $FF: renamed from: a (boolean, com.corrodinggames.rts.gameFramework.r) void
   public strictfp synchronized void method_1570(boolean var1, class_289 var2) {
      this.A();
      this.method_1569(var1, false, var2);
   }

   // $FF: renamed from: a (boolean, boolean, com.corrodinggames.rts.gameFramework.r) void
   public strictfp void method_1569(boolean var1, boolean var2, class_289 var3) {
      this.method_1664(var2);
      this.aJ = false;
      System.gc();
      this.bb = true;
      this.aZ = false;
      this.aK = false;
      this.aY = false;
      this.aS = 0;
      this.by = false;
      this.aR = 0;
      class_296.method_2012();
      this.bp.method_2872();
      this.cz = false;
      this.cA = false;
      this.cB = 0.0F;
      this.cD = false;
      this.field_2047 = 0;
      if (!var2) {
         this.cf = 1.0F;
      }

      this.cG = 0.0F;
      if (!this.bt.method_2658()) {
         if (!this.bp.field_3809) {
            class_479.method_3137(true);
         } else {
            class_479.method_3135();
         }
      }

      int var4;
      if (!this.bp.field_3809) {
         if (var1) {
            this.aM = new class_110(0);

            for(var4 = 1; var4 < 8; ++var4) {
               new class_112(var4);
            }

            this.bp.method_2961();
         }
      } else {
         this.aM = this.bp.field_3806;
         if (this.aM == null) {
            throw new RuntimeException("cannot find player's team");
         }
      }

      this.bw = null;
      this.bd = new class_408();

      try {
         if (this.cv != null) {
            InputStream var23 = this.cv.method_3029();

            try {
               var23.reset();
            } catch (IOException var21) {
               var21.printStackTrace();
            }

            this.bd.method_2597(var23);
         } else {
            this.bd.method_2596(this.V());
         }
      } catch (class_424 var22) {
         var22.printStackTrace();
         this.a("Error loading map: " + var22.getMessage(), 1);
         if (av) {
            class_236.method_1591("Crashing on allowed map error because automated testing is active");
            throw var22;
         }

         if (this.af != null) {
            class_273 var5 = this.af.method_34();
            if (var5 != null) {
               var5.method_1897();
            }
         }

         this.bb = false;
         return;
      }

      if (!this.bd.field_3358) {
         d("map did not load, returning");
         this.bb = false;
      } else {
         this.aV = this.bi.teamUnitCapSinglePlayer;
         if (this.aV < 1) {
            this.aV = 1;
         }

         this.aU = this.aV;
         this.bd.field_3346 = false;
         int var25;
         if (this.bp.field_3809) {
            if (!this.bp.field_3811) {
               this.aU = this.bp.field_3861;
               this.aV = this.bp.field_3862;
            }

            class_236.method_1591("Unit cap is now: " + this.aV);
            if (this.bp.field_3863.field_3778 == 0) {
               this.bd.field_3344 = false;
               this.bd.field_3345 = false;
            } else if (this.bp.field_3863.field_3778 == 1) {
               this.bd.field_3344 = true;
               this.bd.field_3345 = false;
            } else if (this.bp.field_3863.field_3778 == 2) {
               this.bd.field_3344 = true;
               this.bd.field_3345 = true;
            }

            this.bd.field_3346 = this.bp.field_3863.field_3779;
            byte var24 = 10;
            if (this.bp.field_3863.field_3779) {
               var24 = 10;
            }

            if (class_408.field_3347) {
            }

            for(var25 = 0; var25 < 10; ++var25) {
               class_107 var6 = class_107.method_954(var25);
               if (var6 != null) {
                  for(int var7 = 0; var7 < this.bd.field_3342; ++var7) {
                     for(int var8 = 0; var8 < this.bd.field_3343; ++var8) {
                        var6.field_1242[var7][var8] = var24;
                     }
                  }
               }
            }

            var25 = this.bp.method_2863();

            label349:
            for(int var26 = 0; var26 < 10; ++var26) {
               class_107 var31 = class_107.method_954(var26);
               if (var31 != null) {
                  var31.field_1229 = var25;
                  if (var31.field_1234) {
                     var31.field_1235 = this.bp.field_3863.field_3780;
                  }

                  var31.field_1238 = this.bp.field_3863.field_3785;
                  boolean var33 = false;
                  boolean var9 = false;
                  if (this.bp.field_3863.field_3781 != 1) {
                     boolean var10 = true;
                     boolean var11 = true;
                     Float var12 = null;
                     Float var13 = null;
                     Float var14 = null;
                     Float var15 = null;
                     if (this.bp.field_3863.field_3781 == 5 || this.bp.field_3863.field_3781 == 4 || this.bp.field_3863.field_3781 > 10) {
                        var11 = false;
                     }

                     if (this.bp.field_3863.field_3781 == 5 || this.bp.field_3863.field_3781 == 4 || this.bp.field_3863.field_3781 == 3 || this.bp.field_3863.field_3781 > 10) {
                        var10 = false;
                     }

                     Iterator var16 = class_39.cu().iterator();

                     while(true) {
                        while(true) {
                           class_39 var18;
                           do {
                              do {
                                 class_34 var17;
                                 do {
                                    if (!var16.hasNext()) {
                                       if (var12 == null) {
                                          var12 = var14;
                                          var13 = var15;
                                       }

                                       if (var12 == null) {
                                          class_236.method_1591("placementLocation==null for team:" + var31.field_1227);
                                          continue label349;
                                       }

                                       float var35 = var12;
                                       float var36 = var13;
                                       class_39 var19;
                                       int var37;
                                       if (this.bp.field_3863.field_3781 != 2) {
                                          if (this.bp.field_3863.field_3781 != 3 && this.bp.field_3863.field_3781 != 4) {
                                             if (this.bp.field_3863.field_3781 == 5) {
                                                class_24 var39 = class_469.method_3052("experimentalSpider");
                                                if (var39 == null) {
                                                   class_454.method_2887("Could not find: experimentalSpider on network.setup.startingUnits==5");
                                                } else {
                                                   var19 = var39.method_128();
                                                   var19.method_258(var31);
                                                   var19.dh = var35;
                                                   var19.di = var36;
                                                   var19.field_154 = 90.0F;
                                                   var19.dj = 2.0F;
                                                   var19.method_328();
                                                   if (var19 instanceof class_66) {
                                                      ((class_66)var19).method_601();
                                                   }
                                                }
                                             } else if (this.bp.field_3863.field_3781 > 10) {
                                                class_479 var40 = class_479.method_3187(this.bp.field_3863.field_3781);
                                                if (var40 == null) {
                                                   class_454.method_2887("Could not find starting unit on network.setup.startingUnits==" + this.bp.field_3863.field_3781);
                                                } else {
                                                   var19 = var40.method_128();
                                                   var19.method_258(var31);
                                                   var19.dh = var35;
                                                   var19.di = var36;
                                                   if (!var19.method_212()) {
                                                      var19.field_154 = 90.0F;
                                                   }

                                                   if (var40.field_4372) {
                                                      var19.method_328();
                                                      if (var19 instanceof class_66) {
                                                         ((class_66)var19).method_601();
                                                      }
                                                   }
                                                }
                                             }
                                             continue label349;
                                          }

                                          var37 = 0;

                                          while(true) {
                                             if (var37 > 2) {
                                                continue label349;
                                             }

                                             class_24 var38 = class_469.method_3052("combatEngineer");
                                             if (var38 == null) {
                                                class_454.method_2887("Could not find: combatEngineer on network.setup.startingUnits==3");
                                             } else {
                                                class_39 var20 = var38.method_128();
                                                var20.method_258(var31);
                                                var20.dh = var35 - 50.0F + (float)(var37 * 50);
                                                var20.di = var36 + 50.0F;
                                             }

                                             ++var37;
                                          }
                                       }

                                       for(var37 = 0; var37 <= 2; ++var37) {
                                          if (var37 != 1) {
                                             var19 = class_469.field_4040.method_128();
                                             var19.method_258(var31);
                                             var19.dh = var35 - 50.0F + (float)(var37 * 50);
                                             var19.di = var36;
                                          }
                                       }

                                       var37 = 0;

                                       while(true) {
                                          if (var37 > 2) {
                                             continue label349;
                                          }

                                          var19 = class_469.field_4055.method_128();
                                          var19.method_258(var31);
                                          var19.dh = var35 - 50.0F + (float)(var37 * 50);
                                          var19.di = var36 + 50.0F;
                                          ++var37;
                                       }
                                    }

                                    var17 = (class_34)var16.next();
                                 } while(!(var17 instanceof class_39));

                                 var18 = (class_39)var17;
                              } while(var18.field_141);
                           } while(var18.field_143 != var31);

                           if (var18.field_135 && !var33) {
                              var33 = true;
                              var12 = var18.dh;
                              var13 = var18.di;
                              if (!var10) {
                                 var18.method_252();
                                 continue;
                              }
                           }

                           if (var18.field_136 && !var9) {
                              var9 = true;
                              var14 = var18.dh;
                              var15 = var18.di;
                              if (!var11) {
                                 var18.method_252();
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (!var2 && (this.bw == null || !this.bw.field_40)) {
            this.a(0.0F, 0.0F);
            var4 = 0;
            var25 = 0;
            boolean var28 = false;
            Iterator var32 = class_39.field_126.iterator();

            class_39 var34;
            while(var32.hasNext()) {
               var34 = (class_39)var32.next();
               if (var34 instanceof class_42) {
                  ++var25;
               } else {
                  ++var4;
               }

               if (var34.field_143 == this.aM && var34 instanceof class_55) {
                  this.b(var34.dh, var34.di);
                  var28 = true;
               }
            }

            if (!var28) {
               var32 = class_39.field_126.iterator();

               while(var32.hasNext()) {
                  var34 = (class_39)var32.next();
                  if (var34.field_143 == this.aM) {
                     this.b(var34.dh, var34.di);
                  }
               }
            }

            d("there are " + var4 + " units on this map and " + var25 + " trees");
         }

         this.field_2067 = class_398.method_2511(this.ad).method_2513(this.V());
         this.bm.method_1687(this.bd);
         this.bo.method_1229(this.bd);
         this.bx.method_2157();
         this.bn.method_149();
         if (!var2) {
            class_388.method_2437();
            this.bk.method_710();
         }

         if (!var2) {
            this.bk.method_762();
            if (!this.ba && !this.aP) {
               this.method_1663();
            }
         } else {
            this.bk.method_762();
         }

         this.bu.method_3240(this.bd);
         if (!var2) {
            this.bf.method_2754();
         }

         this.bq.method_2516();
         Iterator var27 = class_39.field_126.iterator();

         while(var27.hasNext()) {
            class_39 var29 = (class_39)var27.next();
            if (var29 instanceof class_44) {
               class_44 var30 = (class_44)var29;
               var30.method_491(false);
            }
         }

         this.field_2067.field_3267 = true;
         this.field_2068.method_2507(this.ad);
         this.aZ = true;
         this.ba = false;
         this.bb = false;
         if (var3 != class_289.field_2444 && !this.bi.hasPlayedGameOrSeenHelp) {
            this.bi.hasPlayedGameOrSeenHelp = true;
            this.bi.save();
         }

         System.gc();
         if (!class_236.field_1899) {
            Log.method_1708("RustedWarfare", "getNativeHeapSize" + String.valueOf(Debug.getNativeHeapSize()));
            Log.method_1708("RustedWarfare", "getNativeHeapAllocatedSize" + String.valueOf(Debug.getNativeHeapAllocatedSize()));
            Log.method_1708("RustedWarfare", "getNativeHeapFreeSize" + String.valueOf(Debug.getNativeHeapFreeSize()));
            Log.method_1708("RustedWarfare", "Runtime.getRuntime().maxMemory()" + String.valueOf(Runtime.getRuntime().maxMemory()));
         }

         if (this.ct != null) {
            this.ct.method_1995();
         }

         this.field_2071 = 0.0F;
         if (this.bp.field_3811 && this.bp.field_3809) {
            class_236.method_1591("Disabling network for singleplayer");
            this.bp.field_3809 = false;
         }

         if (!aw || ax) {
            if (var3 == class_289.field_2446) {
               class_236.method_1591("No starting reply on save load");
            } else {
               this.bt.method_2654(var2);
            }
         }

         if (class_238.field_2102) {
         }

      }
   }

   // $FF: renamed from: ah () void
   private strictfp void method_1663() {
      this.bk.method_762();
      Iterator var1 = class_39.field_126.iterator();

      class_39 var2;
      do {
         if (!var1.hasNext()) {
            class_236.method_1591("selectAnyOnScreenBuilder: no builder found");
            return;
         }

         var2 = (class_39)var1.next();
      } while(var2.field_143 != this.aM || !(var2 instanceof class_44) || !var2.method_284() || !var2.method_288() || !var2.method_228());

      class_236.method_1591("selectAnyOnScreenBuilder: found builder");
      this.bk.method_763(var2);
   }

   // $FF: renamed from: b (boolean) void
   public strictfp void method_1664(boolean var1) {
      synchronized(this.field_2059) {
         if (this.af != null) {
            this.af.method_38();
         }

         this.aL = false;
         if (!var1) {
            this.bt.method_2650();
         }

         this.bm.method_1691();
         class_199 var3 = class_34.method_189();
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            class_34 var5 = (class_34)var4.next();
            var5.method_184();
         }

         class_34.method_189();
         class_34.method_188();
         int var8 = var3.size();
         if (var8 != 0) {
            class_236.method_1588("SHOULD_NOT_HAPPEN: we still had " + var8 + " objects in gameObjectListForLogic after removeAll");
         }

         this.field_2082.clear();
         if (!ac()) {
            this.bf.method_2763();
         }

         this.bj.method_2494();
         if (this.bd != null) {
            this.bd.method_2607();
            this.bd = null;
         }

         if (this.bw != null) {
            this.bw = null;
         }

         if (this.bu != null) {
            this.bu.method_3241();
         }

         this.field_2089 = null;
         this.field_2090 = null;
         this.field_2047 = 0;
      }
   }

   // $FF: renamed from: a (float, int) void
   public strictfp void method_1573(float var1, int var2) {
      synchronized(this.field_2059) {
         this.method_1574(var1, var2);
      }
   }

   // $FF: renamed from: b (float, int) void
   public strictfp void method_1574(float var1, int var2) {
      this.bv.method_2526(class_192.field_1616);
      this.af = this.ag;
      if (this.af.method_25()) {
         this.bv.method_2526(class_192.field_1617);

         while(this.field_2048.peek() != null) {
            Runnable var3 = (Runnable)this.field_2048.poll();
            var3.run();
         }

         if (!this.aZ) {
            if (!this.ah) {
               Log.method_1712("RustedWarfare", "game running without a loaded level!!!");
               this.method_1665();

               try {
                  Thread.sleep(10L);
               } catch (InterruptedException var24) {
                  var24.printStackTrace();
               }

            }
         } else {
            this.aL = true;
            float var27 = this.cf * this.ci;
            float var4;
            if (var27 != this.ch) {
               var4 = this.ck / this.ch + this.bM;
               float var5 = this.cl / this.ch + this.bN;
               this.ch = var27;
               this.method_1674();
               if (this.cj) {
                  float var6 = this.ck / this.ch + this.bM;
                  float var7 = this.cl / this.ch + this.bN;
                  this.a(this.bM - (var6 - var4), this.bN - (var7 - var5));
                  this.cj = false;
               }
            }

            if (this.cc != this.cd) {
               this.method_1674();
            }

            if (var1 > 3.0F) {
               var1 = 3.0F;
            }

            if (var1 < 0.0F) {
               var1 = 0.0F;
            }

            if (this.aO >= 0.0F) {
               var1 = this.aO;
            }

            this.aT = (int)((float)this.aT + var1 * 16.666666F);
            this.method_1677(var1);
            this.field_2054 += var2;
            ++this.field_2055;
            if (this.field_2055 >= 40) {
               if (this.field_2054 == 0) {
                  this.field_2054 = 1;
               }

               this.field_2056 = (int)((float)(this.field_2055 * 1000 / this.field_2054) + 0.5F);
               this.field_2057 = (float)this.field_2054 / (float)this.field_2055;
               this.field_2054 = 0;
               this.field_2055 = 0;
               if (this.bi.showFps) {
                  this.field_2058 = this.field_2056 + "fps";
               }
            }

            this.U();

            for(int var28 = 0; var28 < this.cV.length; ++var28) {
               this.cV[var28] = true;
            }

            this.cq = class_296.method_2020(this.cq, 0.1F * var1);
            this.cr = class_296.method_2020(this.cr, 0.1F * var1);
            this.cq = class_296.method_2022(this.cq, 5.0F);
            this.cr = class_296.method_2022(this.cr, 5.0F);
            this.bk.method_713(var1);
            this.D();
            this.bd.method_2602();
            if (this.bp.field_3809) {
               var4 = var1;
               if (this.bt.field_3451 != 1) {
                  var4 = var1 * (float)this.bt.field_3451;
               }

               this.bp.method_2896(var4);
               if (!this.method_1558(true) && !this.bp.field_3825) {
                  this.field_2071 += var4;

                  while(this.field_2071 > this.bp.field_3815) {
                     if (this.bp.method_2898()) {
                        this.bp.field_3825 = true;
                        break;
                     }

                     this.field_2071 -= this.bp.field_3815;
                     this.bp.method_2899(this.bp.field_3815, false);
                     if (this.bp.field_3825) {
                        break;
                     }

                     this.method_1666(this.bp.field_3815);
                  }

                  if (!this.bp.field_3810) {
                     if (this.bp.field_3832 || this.bp.field_3830) {
                        if (this.bp.field_3832 && this.bp.field_3830 && this.aR < this.bp.field_3824 - this.bp.field_3820 - 5) {
                           this.bp.method_2885("nearly within frame range");
                           this.bp.field_3832 = false;
                        }

                        if (this.aR > this.bp.field_3824 - 6) {
                           this.bp.method_2885("we have back within frame range");
                           this.bp.field_3832 = false;
                           this.bp.field_3830 = false;
                        }
                     }

                     if (!this.bp.field_3830 && this.aR < this.bp.field_3824 - this.bp.field_3820 - 10) {
                        this.bp.method_2885("we are slightly out of frame range, speeding up");
                        this.bp.field_3830 = true;
                     }

                     if (!this.bp.field_3832 && this.aR < this.bp.field_3824 - this.bp.field_3820 - 30) {
                        this.bp.method_2885("we are out of frame range, fast forwarding");
                        this.bp.field_3832 = true;
                     }

                     if (!this.bp.field_3832 && this.bp.field_3830) {
                        class_454 var10000 = this.bp;
                        var10000.field_3831 += var1;
                        if (this.bp.field_3831 > this.bp.field_3815 * 3.0F) {
                           this.bp.field_3831 = 0.0F;
                           this.bp.method_2899(this.bp.field_3815, true);
                           if (!this.bp.field_3825) {
                              this.method_1666(this.bp.field_3815);
                           }
                        }
                     }

                     if (this.bp.field_3832) {
                        this.bp.method_2899(this.bp.field_3815, true);
                        if (!this.bp.field_3825) {
                           this.method_1666(this.bp.field_3815);
                        }
                     }

                     if (this.aR < this.bp.field_3824 - 90) {
                        this.bp.method_2899(this.bp.field_3815, true);
                        if (!this.bp.field_3825) {
                           this.method_1666(this.bp.field_3815);
                        }
                     }

                     if (this.aR < this.bp.field_3824 - 120) {
                        this.bp.method_2899(this.bp.field_3815, true);
                        if (!this.bp.field_3825) {
                           this.method_1666(this.bp.field_3815);
                        }
                     }

                     if (this.aR < this.bp.field_3824 - 600) {
                        this.bp.method_2899(this.bp.field_3815, true);
                        if (!this.bp.field_3825) {
                           this.method_1666(this.bp.field_3815);
                        }
                     }
                  }
               }
            } else if (this.bt.method_2657()) {
               var4 = var1;
               if (this.bt.field_3451 != 1) {
                  var4 = var1 * (float)this.bt.field_3451;
               }

               if (this.aN != 1.0F) {
                  var4 *= this.aN;
               }

               if (!this.method_1558(false)) {
                  this.field_2071 += var4;

                  while(this.field_2071 > this.bp.field_3815) {
                     this.field_2071 -= this.bp.field_3815;
                     if (this.bp.method_2898()) {
                        break;
                     }

                     this.method_1666(this.bp.field_3815);
                  }
               }

               if (this.field_2071 > 100.0F) {
                  this.field_2071 = 100.0F;
               }

               if (this.field_2071 < 0.0F) {
                  this.field_2071 = 0.0F;
               }
            } else if (!this.method_1558(false)) {
               this.method_1666(var1);
            }

            this.bm.method_1695(var1);
            this.bf.method_2759(var1);
            this.bl.method_2713();
            class_223.method_1462().method_1464(var1);
            this.bv.method_2527(class_192.field_1617);
            this.bv.method_2526(class_192.field_1618);
            if (!this.cE) {
               if (this.bg.method_55()) {
                  this.method_1667((class_23)null, var1);
               } else if (this.af.method_42()) {
                  class_23 var32 = this.af.method_39(true);
                  this.method_1667(var32, var1);
               } else {
                  class_11 var34 = this.af;
                  this.af.method_36(var1, var2);
                  if (var34.method_26() && !var34.method_28()) {
                     synchronized(var34.method_30()) {
                        if (var34.method_26() && !var34.method_28()) {
                           this.bv.method_2526(class_192.field_1638);
                           class_23 var30 = var34.method_39(true);
                           this.bv.method_2527(class_192.field_1638);

                           try {
                              if (!var34.method_28()) {
                                 if (var30 != null) {
                                    if (var30.method_104()) {
                                       class_236.method_1591("gameengine draw: bufferedCanvas drawn on");
                                    }

                                    var30.method_103(true);
                                 }

                                 if (var30 == null) {
                                    class_236.method_1593("GameEngine gameViewCanvas is null after lockCanvas - " + var34.hashCode());
                                 }

                                 if (!this.aJ) {
                                    this.field_2042 = null;
                                 } else {
                                    if (this.field_2042 == null) {
                                       a("recorder", "Now recording at:" + this.af.method_31() + "," + this.af.method_32());

                                       for(int var31 = 0; var31 < this.field_2043.length; ++var31) {
                                          this.field_2043[var31] = new class_241(this);
                                          this.field_2043[var31].field_2139 = Bitmap.method_3301(this.af.method_31(), this.af.method_32(), Bitmap$Config.field_3073);
                                          this.field_2043[var31].field_2139.method_3297(0);
                                       }

                                       this.field_2042 = new class_474(new Canvas());
                                       this.field_2044 = 0;
                                       this.field_2045 = "/sdcard/rustedWarfare_recordings/" + System.currentTimeMillis() + "/";
                                       File var35 = new File(this.field_2045);
                                       var35.mkdirs();
                                    }

                                    long var37 = System.currentTimeMillis();
                                    class_241 var9 = this.field_2043[this.field_2044];
                                    if (var9.field_2142 != null && var9.field_2142.isAlive()) {
                                       var9.field_2142.setPriority(10);
                                    }

                                    var9.method_1734();
                                    long var10 = System.currentTimeMillis();
                                    a("screenshot", "bitmapFree took:" + (var10 - var37));
                                    this.field_2042.method_123(this.field_2043[this.field_2044].field_2139);
                                    var30 = this.field_2042;
                                 }

                                 this.method_1667(var30, var1);
                                 if (this.aJ) {
                                    class_241 var38 = this.field_2043[this.field_2044];
                                    if (var38 != null) {
                                       var38.field_2140 = this.aR;
                                       var38.field_2142 = new Thread(var38);
                                       var38.field_2142.start();
                                       var30.method_107(var38.field_2139, 0.0F, 0.0F, (Paint)null);
                                       ++this.field_2044;
                                       if (this.field_2044 >= this.field_2043.length) {
                                          this.field_2044 = 0;
                                       }
                                    }
                                 }

                                 this.bg.method_58((class_23)null);
                              }
                           } finally {
                              if (var30 != null) {
                                 try {
                                    var34.method_40(var30, true);
                                 } catch (IllegalArgumentException var22) {
                                    var22.printStackTrace();
                                    class_236.method_1593("GameEngine catch currentGameView - " + var34.hashCode());
                                    class_236.method_1593("GameEngine catch currentGameView.gameThreadSync - " + var34.method_30().hashCode());
                                    var34.method_33();
                                 } catch (IllegalStateException var23) {
                                    var23.printStackTrace();
                                    class_236.method_1593("GameEngine catch currentGameView - " + var34.hashCode());
                                    class_236.method_1593("GameEngine catch currentGameView.gameThreadSync - " + var34.method_30().hashCode());
                                 }
                              }

                           }
                        }
                     }
                  }

                  this.af.method_37(var1, var2);
               }
            }

            this.cE = false;
            this.L();
            this.bv.method_2527(class_192.field_1618);
            if (this.cD) {
               this.cD = false;
               Integer var36 = p(this.cu);
               String var29 = null;
               if (var36 != null) {
                  var29 = q(this.cu);
               }

               if (this.bp.field_3809) {
                  var29 = null;
                  (new g$a(this)).start();
               }

               if (var29 != null) {
                  class_236.method_1591("gotoNextLevel: Loading next level: " + var29);
                  this.cu = var29;
                  this.method_1569(true, false, class_289.field_2445);
               } else {
                  class_236.method_1591("gotoNextLevel: No next level, finishing");
                  this.aZ = false;
                  class_273 var33 = this.af.method_34();
                  if (var33 != null) {
                     var33.method_1871();
                     var33.method_1897();
                  } else {
                     class_236.method_1591("gotoNextLevel: Error getInGameActivity==null");
                  }
               }
            }

            if (!this.ah && this.aX && !this.field_2046) {
               d("starting method trace");
               Debug.startMethodTracing("lukeTrace", 110000000);
               this.field_2046 = true;
            }

            this.aY = true;
            this.bv.method_2527(class_192.field_1616);
            this.bv.method_2530();
         }
      }
   }

   // $FF: renamed from: e () void
   public strictfp void method_1665() {
      class_273 var1 = this.af.method_34();
      if (var1 != null) {
         if (!var1.c()) {
            var1.method_1871();
         } else {
            class_236.method_1588("stopAndClose: inGameActivity is isFinishing");
         }
      } else {
         class_236.method_1588("stopAndClose: Error getInGameActivity==null");
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_1666(float var1) {
      if (this.ae() && var1 < 0.1F) {
         class_454.method_2887("updateAllGame1: deltaSpeed:" + var1 + " frame:" + this.aR);
      }

      if (this.aN != 1.0F && !this.bp.field_3809 && !this.bt.method_2657()) {
         var1 *= this.aN;
      }

      var1 *= this.field_2072;
      this.field_2073 = var1 + 2.0F;
      this.field_2074 = var1;
      this.bp.method_2897(var1);
      this.aS = (int)((float)this.aS + var1 * 16.666666F);
      this.bx.method_2160();
      this.bt.method_2656(var1);
      ++this.aR;
      class_107.method_961(var1);
      if (this.bd != null) {
         this.bd.method_2606(var1);
      }

      if (this.ae() && var1 < 0.1F) {
         class_454.method_2887("updateAllGame2: deltaSpeed:" + var1 + " frame:" + this.aR);
      }

      class_34.method_189();
      class_199 var2 = class_34.method_188();
      Object[] var3 = var2.method_1319();
      int var4 = var2.size();
      boolean var5 = this.ae();

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         class_34 var7 = (class_34)var3[var6];
         if (var5 && var1 != this.field_2074) {
            class_454.method_2888("JIT bug detected, attempting to correct. before object:" + var7.field_67 + " frame:" + this.aR + " deltaSpeed:" + var1);
            var1 = this.field_2074;
         }

         var7.method_176(var1);
      }

      if (this.ae() && var1 < 0.1F) {
         class_454.method_2887("updateAllGame3: deltaSpeed:" + var1 + " frame:" + this.aR);
      }

      var6 = var2.field_1664.size();

      int var13;
      for(var13 = 0; var13 < var6; ++var13) {
         class_198 var8 = (class_198)var2.field_1664.get(var13);
         if (var8.field_1662 == class_197.field_1659) {
            ((class_34)var8.field_1663).method_176(var1);
         }
      }

      this.bv.method_2526(class_192.field_1628);
      this.bu.method_3238();
      this.bv.method_2527(class_192.field_1628);
      class_44.method_354(var1);
      ++this.field_2047;
      if (this.field_2047 >= 1000) {
         this.field_2047 = 0;
         var13 = 0;
         Iterator var14 = class_39.field_125.iterator();

         while(var14.hasNext()) {
            class_39 var9 = (class_39)var14.next();
            if (var9.field_141 && !(var9 instanceof class_42)) {
               ++var13;
            }
         }

         boolean var15 = true;
         if (var13 > 70) {
            class_199 var16 = class_34.method_189();
            Iterator var10 = var16.iterator();

            while(var10.hasNext()) {
               class_34 var11 = (class_34)var10.next();
               if (var11 instanceof class_39) {
                  class_39 var12 = (class_39)var11;
                  if (var12.field_141 && !(var12 instanceof class_42) && var12.field_142 < (long)(this.aS - 30000) && var13 > 70) {
                     var12.method_184();
                     --var13;
                  }
               }
            }
         }
      }

      this.bv.method_2526(class_192.field_1627);
      class_107.method_960(var1);
      this.bv.method_2527(class_192.field_1627);
      class_388.method_2438(var1);
      this.bj.method_2491(var1);
      this.field_2069.method_2450(var1);
      if (this.bw != null) {
         this.bw.method_169(var1);
      }

      this.bv.method_2526(class_192.field_1630);
      this.bn.method_151(var1);
      this.bv.method_2527(class_192.field_1630);
      this.bv.method_2526(class_192.field_1629);
      this.bo.method_1238(var1);
      this.bv.method_2527(class_192.field_1629);
      this.bm.method_1696(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.h, float) void
   public strictfp void method_1667(class_23 var1, float var2) {
      synchronized(this.field_2060) {
         this.method_1668(var1, var2);
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.h.h, float) void
   public strictfp void method_1668(class_23 var1, float var2) {
      if (var1 == null) {
         a("drawAll", "canvas is null, not may not be available yet");
      } else if (!an) {
         this.bg.method_58(var1);
         this.bg.method_59(this.af.method_27());
         float var3 = this.bD;
         if (var3 != 1.0F) {
            this.bg.method_87();
            this.bg.method_92(var3, var3);
         }

         if (this.cD) {
            this.bg.method_75(Color.method_3076(0, 0, 0));
            this.bg.method_78("Loading..", this.bE, this.bF, this.cy);
         } else {
            this.bv.method_2526(class_192.field_1619);
            this.method_1672(var1, var2);
            this.bv.method_2527(class_192.field_1619);
            if (!this.q()) {
               this.bv.method_2526(class_192.field_1621);
               this.method_1673(var1, var2);
               this.bv.method_2527(class_192.field_1621);
            }

            if (this.bi.showFps && this.ce == 0.0F) {
               this.bg.method_78(this.field_2058, 100.0F, 35.0F, this.field_2050);
            }

            if (field_2041 != null) {
               this.bg.method_78(field_2041, 100.0F, 85.0F, this.field_2050);
            }

            this.bg.method_81();
            if (!this.ah && (this.bg.method_57() != null || class_236.field_1900)) {
               this.bk.method_725(var2);
            }

            if (var3 != 1.0F) {
               var1.method_118();
            }

         }
      }
   }

   // $FF: renamed from: f () boolean
   public strictfp boolean method_1669() {
      if (!this.bi.showUnitIcons) {
         return false;
      } else if ((double)this.ch < 0.7D && this.bQ >= this.bd.method_2612() - 5.0F && this.bP >= this.bd.method_2613() - 5.0F) {
         return true;
      } else if (s()) {
         return (double)this.ch < 0.1D;
      } else if (ac()) {
         return (double)this.ch < 0.27D;
      } else {
         return (double)this.ch < 0.4D;
      }
   }

   // $FF: renamed from: b (float) void
   public strictfp void method_1670(float var1) {
      boolean var2 = false;
      if (this.bX.field_2352 < 0 || this.bX.field_2353 < 0 || (float)this.bX.field_2354 > this.bd.method_2612() || (float)this.bX.field_2355 > this.bd.method_2613()) {
         var2 = true;
      }

      if (var2) {
         this.bg.method_75(Color.method_3076(0, 0, 0));
      }

   }

   // $FF: renamed from: c (float) void
   public strictfp void method_1671(float var1) {
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.h.h, float) void
   public strictfp void method_1672(class_23 var1, float var2) {
      this.bv.method_2526(class_192.field_1623);
      this.field_2082.method_1344();
      this.cF = 0;
      class_34[] var3 = class_39.dk.method_1339();
      int var4 = class_34.field_79.size();

      for(int var5 = 0; var5 < var4; ++var5) {
         class_34 var6 = var3[var5];
         var6.field_71 = var6.method_183(this);
         if (var6.field_71) {
            this.field_2082.method_1340(var6);
         }
      }

      this.bv.method_2527(class_192.field_1623);
      this.bv.method_2526(class_192.field_1624);
      if (!this.method_1669()) {
         Collections.sort(this.field_2082, class_34.field_68);
      }

      this.bv.method_2527(class_192.field_1624);
      this.bv.method_2526(class_192.field_1632);
      this.bv.method_2526(class_192.field_1634);
      this.bg.method_87();
      this.bg.method_83(this.bW);
      this.bv.method_2527(class_192.field_1634);
      this.bv.method_2526(class_192.field_1633);
      this.method_1670(var2);
      this.bv.method_2527(class_192.field_1633);
      if (this.bi.renderFancyWater) {
         if (this.field_2075 == null) {
            this.field_2075 = this.bg.method_60(R$drawable.water_cloud);
         }

         if (this.field_2076 == null) {
            this.field_2076 = this.bg.method_60(R$drawable.water_layer1);
         }

         if (this.field_2077 == null) {
            this.field_2077 = this.bg.method_60(R$drawable.water_layer2);
         }

         this.field_2079.method_1912(this.bW);
         this.field_2078 += 0.05F * var2;
         if (this.field_2078 > 100.0F) {
            this.field_2078 -= 100.0F;
         }

         this.bg.method_73(this.field_2075, this.field_2079, (Paint)null, this.bI / 6, this.bJ / 6, 1, 1);
         this.field_2079.method_1912(this.bX);
         this.field_2080.method_1971(this.bX);
         this.bg.method_87();
         this.E();
         this.bg.method_74(this.field_2077, this.field_2080, (Paint)null, (float)this.bI + this.field_2078, (float)this.bJ + this.field_2078, 0, 0);
         this.bg.method_74(this.field_2076, this.field_2080, (Paint)null, (float)this.bI, (float)this.bJ, 0, 0);
         this.bg.method_88();
      }

      this.bv.method_2526(class_192.field_1635);
      if (this.bd != null && this.aa()) {
         this.bd.method_2605(var2);
      }

      this.bv.method_2527(class_192.field_1635);
      this.E();
      this.bg.method_83(this.bX);
      boolean var11 = this.method_1669();
      this.bm.method_1697(var2);
      this.bv.method_2527(class_192.field_1632);
      class_34[] var12 = this.field_2082.method_1339();
      int var7 = this.field_2082.size();
      this.cm = true;
      this.cn = true;
      this.co = true;
      this.cp = true;
      if ((double)this.ch < 0.45D) {
         this.co = false;
         this.cm = false;
      }

      if ((double)this.ch < 0.3D) {
         this.cp = false;
         this.cn = false;
      }

      int var8;
      class_34 var9;
      if (!var11) {
         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var12[var8];
            if (var9.field_72 == 0) {
               var9.method_181(var2);
            }
         }
      }

      class_388.method_2439(var2);
      this.bv.method_2526(class_192.field_1622);
      this.bj.method_2492(var2, 1);
      this.bv.method_2527(class_192.field_1622);
      this.bv.method_2526(class_192.field_1631);
      class_34 var10;
      int var13;
      if (var11) {
         if (this.bk.method_734() == 0) {
            class_39.field_130.method_2791(255, 195, 195, 195);
            class_39.field_131.method_2791(255, 255, 255, 255);
         } else {
            class_39.field_130.method_2791(175, 175, 175, 175);
            class_39.field_131.method_2791(255, 255, 255, 255);
         }

         for(var8 = -1; var8 <= 5; ++var8) {
            for(var13 = 0; var13 < var7; ++var13) {
               var10 = var12[var13];
               if (var10.field_72 == var8) {
                  if (!var10.method_182(var2)) {
                     var10.method_181(var2);
                  }

                  var10.method_180(var2);
               }
            }
         }

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var12[var8];
            var9.method_177(var2, true);
            var9.method_180(var2);
         }
      } else {
         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var12[var8];
            var9.method_178(var2);
         }

         for(var8 = 0; var8 < var4; ++var8) {
            var9 = var3[var8];
            if (var9.field_71 || var9 instanceof class_39 && ((class_39)var9).field_177) {
               var9.method_179(var2);
               if (!var9.field_71) {
                  var9.method_180(var2);
               }
            }
         }

         for(var8 = -1; var8 <= 5; ++var8) {
            if (var8 != 0 && var8 != 10) {
               for(var13 = 0; var13 < var7; ++var13) {
                  var10 = var12[var13];
                  if (var10.field_72 == var8) {
                     var10.method_181(var2);
                  }
               }
            }
         }

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var12[var8];
            var9.method_177(var2, false);
            var9.method_180(var2);
         }

         class_107.method_962(var2);
      }

      this.co = true;
      this.cp = true;
      this.bv.method_2527(class_192.field_1631);
      this.bv.method_2526(class_192.field_1622);
      this.bj.method_2492(var2, 2);
      this.bv.method_2527(class_192.field_1622);

      for(var8 = 0; var8 < var7; ++var8) {
         var9 = var12[var8];
         if (var9.field_72 == 10) {
            var9.method_181(var2);
         }
      }

      this.field_2069.method_2451(var2);
      this.method_1671(var2);
      class_205.method_1377(var2);
      this.bu.method_3242(var2);
      this.bv.method_2526(class_192.field_1620);
      this.bg.method_88();
      this.bv.method_2527(class_192.field_1620);
   }

   // $FF: renamed from: d (com.corrodinggames.rts.gameFramework.h.h, float) void
   public strictfp void method_1673(class_23 var1, float var2) {
      this.bk.method_719(var2);
      this.bo.method_1243(var2);
      this.bj.method_2493(var2);
      if (this.bw != null) {
         this.bw.method_164(var2);
      }

      if (this.bi.showFps && this.ce == 0.0F) {
         this.bv.method_2531();
      }

      if (this.by) {
         this.bg.method_78("Look Mode", this.bE, this.bF, this.cy);
      }

      if (this.aI) {
         int var3 = 20;

         for(int var4 = 0; var4 < 10; ++var4) {
            class_107 var5 = class_107.method_954(var4);
            if (var5 != null && var5 instanceof class_112) {
               class_112 var6 = (class_112)var5;
               this.bg.method_78(var6.d + "| c:" + var6.f, 20.0F, (float)var3, this.cw);
               var3 += 20;
            }
         }
      }

   }

   // $FF: renamed from: g () void
   public strictfp void method_1674() {
      this.bA = this.I();
      this.J();
      this.bE = this.bB / 2.0F;
      this.bF = this.bC / 2.0F;
      this.bG = (float)((int)(this.bC / 3.0F));
      int var1 = (int)(250.0F * this.bA);
      this.bG = class_296.method_2023(this.bG, 60.0F, (float)var1);
      float var2 = this.bM + this.bU;
      float var3 = this.bN + this.bV;
      if (this.cd) {
         this.bR = this.bB;
         this.bS = this.bB;
      } else {
         this.bS = this.bB - this.bG + 1.0F;
         if (class_98.field_1052) {
            this.bR = this.bB;
         } else {
            this.bR = this.bS;
         }
      }

      if (this.bR < 1.0F) {
         this.bR = 1.0F;
      }

      if (this.bS < 1.0F) {
         this.bS = 1.0F;
      }

      if (this.cc != this.cd) {
         if (!this.cd) {
            var2 -= this.bG / 2.0F / this.ch;
         } else {
            var2 += this.bG / 2.0F / this.ch;
         }
      }

      this.cc = this.cd;
      this.bT = this.bC;
      this.bO = this.bR / this.ch;
      this.bP = this.bT / this.ch;
      this.bQ = this.bS / this.ch;
      this.bU = this.bO / 2.0F;
      this.bV = this.bP / 2.0F;
      this.bW.method_1911(0, 0, (int)this.bR, (int)this.bT);
      this.bX.method_1911(0, 0, (int)this.bO + 1, (int)this.bP + 1);
      this.bY.method_1969(0.0F, 0.0F, this.bO + 1.0F, this.bP + 1.0F);
      this.a(var2 - this.bU, var3 - this.bV);
   }

   // $FF: renamed from: a (int, int) void
   public strictfp void method_1560(int var1, int var2) {
      this.method_1675(var1, var2, 1.0F);
   }

   // $FF: renamed from: a (int, int, float) void
   public strictfp void method_1675(int var1, int var2, float var3) {
      this.bB = (float)var1;
      this.bC = (float)var2;
      this.bD = var3;
      this.method_1674();
   }

   // $FF: renamed from: h () java.lang.String
   public strictfp String method_1564() {
      if (class_236.field_1900) {
         return "com.corrodinggames.rts.java";
      } else if (aw) {
         return "com.corrodinggames.rts.server";
      } else {
         return this.ad == null ? "<null context>" : this.ad.method_1857();
      }
   }

   // $FF: renamed from: i () java.lang.String
   public strictfp String method_1565() {
      if (class_236.field_1900) {
         return "java";
      } else if (aw) {
         return "dedicatedServer";
      } else if (this.ad == null) {
         return "<null context>";
      } else {
         PackageManager var1 = this.ad.method_1855();
         String var2 = var1.getInstallerPackageName(this.method_1564());
         return var2;
      }
   }

   // $FF: renamed from: j () boolean
   public strictfp boolean method_1562() {
      return this.method_1566().contains("p");
   }

   // $FF: renamed from: c (boolean) int
   public strictfp int method_1561(boolean var1) {
      if (!aw && !var1) {
         try {
            PackageInfo var2 = this.ad.method_1855().getPackageInfo(this.ad.method_1857(), 0);
            int var3 = var2.versionCode;
            return var3;
         } catch (NameNotFoundException var4) {
            throw new RuntimeException(var4);
         }
      } else {
         return 123;
      }
   }

   // $FF: renamed from: k () boolean
   public strictfp boolean method_1563() {
      return p.class.getSimpleName().equals("OrderableUnit");
   }

   // $FF: renamed from: l () java.lang.String
   public strictfp String method_1566() {
      return "1.13";
   }

   // $FF: renamed from: m () void
   public strictfp synchronized void method_1676() {
      this.field_2087 = false;
      if (this.field_2086 != null) {
         this.field_2086.cancel();
         this.field_2086 = null;
      }

   }

   // $FF: renamed from: a (android.app.Activity, com.corrodinggames.rts.a.d, boolean) void
   public strictfp synchronized void method_1559(Activity var1, class_11 var2, boolean var3) {
      synchronized(this.field_2088) {
         if (!aw) {
            var2.method_24();
         }

         this.ae = var1;
         this.ah = var3;
         this.cd = this.ah;
         if (var3 && !this.aZ && !this.bb && !class_236.field_1889) {
            this.method_1572();
         }

         if (this.af == null) {
            this.af = var2;
         }

         this.ag = var2;
         if (var2 != null) {
            var2.method_41();
         }

         if (this.bk != null) {
            this.bk.method_709();
         }

         this.method_1676();
         this.z();
      }
   }

   // $FF: renamed from: n () void
   public strictfp synchronized void method_1572() {
      boolean var1 = true;
      int var2 = this.bi.nextBackgroundMap++;
      if (this.bi.nextBackgroundMap > 2) {
         this.bi.nextBackgroundMap = 1;
      }

      this.bi.save();
      var2 = class_296.method_2024(var2, 1, 2);
      this.cv = null;
      this.cu = "maps/menu_background/menu" + var2 + ".tmx";

      for(int var3 = 0; var3 < 10; ++var3) {
         class_112 var4 = new class_112(var3);
         if (var3 == 0) {
            this.aM = var4;
         }
      }

      this.method_1570(false, class_289.field_2444);
      this.ba = true;
   }

   // $FF: renamed from: d (float) void
   strictfp void method_1677(float var1) {
      if (this.ah && !this.ba) {
         if (this.field_2090 == null) {
            this.field_2090 = this.method_1679();
            if (this.field_2089 == this.field_2090) {
               this.field_2090 = null;
            }
         }

         if (this.field_2089 == null) {
            this.field_2089 = this.field_2090;
            this.field_2090 = null;
         }

         if (this.field_2091 != 0.0F && this.field_2090 != null) {
            this.method_1680(var1, this.field_2090.dh, this.field_2090.di, this.field_2091 * 0.5F);
         }

         if (this.field_2089 != null) {
            boolean var2 = this.method_1680(var1, this.field_2089.dh, this.field_2089.di, (1.0F - this.field_2091) * 0.5F);
            float var3 = class_296.method_2026(this.bM + this.bU, this.bN + this.bV, this.field_2089.dh, this.field_2089.di);
            if (var3 < 6400.0F) {
               var2 = true;
            }

            if (var2) {
               this.field_2092 = true;
            }
         }

         if (this.field_2092) {
            this.field_2091 += 0.01F * var1;
            if (this.field_2091 >= 1.0F) {
               this.field_2091 = 0.0F;
               this.field_2089 = null;
               this.field_2092 = false;
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) com.corrodinggames.rts.game.units.aa
   strictfp class_39 method_1678(class_107 var1) {
      int var2 = 0;
      Iterator var3 = class_39.field_126.iterator();

      while(true) {
         class_39 var4;
         do {
            do {
               if (!var3.hasNext()) {
                  if (var2 > 0) {
                     int var7 = class_296.method_2036(0, var2 - 1);
                     int var8 = 0;
                     Iterator var5 = class_39.field_126.iterator();

                     while(true) {
                        class_39 var6;
                        do {
                           do {
                              if (!var5.hasNext()) {
                                 return null;
                              }

                              var6 = (class_39)var5.next();
                           } while(var6.method_318());
                        } while(var6.field_143 != var1 && var1 != null);

                        if (var8 == var7) {
                           return var6;
                        }

                        ++var8;
                     }
                  }

                  return null;
               }

               var4 = (class_39)var3.next();
            } while(var4.method_318());
         } while(var4.field_143 != var1 && var1 != null);

         ++var2;
      }
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.aa
   strictfp class_39 method_1679() {
      class_39 var1 = this.method_1678(this.aM);
      return var1 != null ? var1 : this.method_1678((class_107)null);
   }

   // $FF: renamed from: a (float, float, float, float) boolean
   strictfp boolean method_1680(float var1, float var2, float var3, float var4) {
      float var5 = class_296.method_2031(this.bM + this.bU, this.bN + this.bV, var2, var3);
      float var6 = class_296.method_2026(this.bM + this.bU, this.bN + this.bV, var2, var3);
      float var7 = var4 * var1;
      float var8 = 15.0F;
      if (var8 < var7 + 1.0F) {
         var8 = var7 + 1.0F;
      }

      if (var6 >= var8 * var8 && !this.bH) {
         this.bM += class_296.method_2099(var5) * var7;
         this.bN += class_296.method_2098(var5) * var7;
         this.a(this.bM, this.bN);
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: p () int
   public strictfp int method_1650() {
      return this.field_2039;
   }
}
