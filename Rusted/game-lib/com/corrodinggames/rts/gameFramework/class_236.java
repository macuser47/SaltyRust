package com.corrodinggames.rts.gameFramework;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.KeyEvent;
import com.corrodinggames.rts.a.class_11;
import com.corrodinggames.rts.a.class_271;
import com.corrodinggames.rts.a.class_353;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_504;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_391;
import com.corrodinggames.rts.gameFramework.c.class_174;
import com.corrodinggames.rts.gameFramework.c.class_98;
import com.corrodinggames.rts.gameFramework.e.class_215;
import com.corrodinggames.rts.gameFramework.e.class_220;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.g.class_238;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.i.class_33;
import com.corrodinggames.rts.gameFramework.utility.class_195;
import com.corrodinggames.rts.gameFramework.utility.class_227;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.k
public abstract class class_236 {
   // $FF: renamed from: ac com.corrodinggames.rts.gameFramework.k
   protected static class_236 field_1879 = null;
   // $FF: renamed from: ad android.content.Context
   public Context field_1880 = null;
   // $FF: renamed from: ae android.content.Context
   public Context field_1881;
   // $FF: renamed from: af com.corrodinggames.rts.a.d
   public class_11 field_1882;
   // $FF: renamed from: ag com.corrodinggames.rts.a.d
   public class_11 field_1883;
   // $FF: renamed from: ah boolean
   public boolean field_1884;
   // $FF: renamed from: ai boolean
   public boolean field_1885 = false;
   // $FF: renamed from: aj boolean
   public static boolean field_1886 = true;
   // $FF: renamed from: ak boolean
   public static boolean field_1887 = false;
   // $FF: renamed from: al boolean
   public static boolean field_1888 = false;
   // $FF: renamed from: am boolean
   public static boolean field_1889;
   // $FF: renamed from: an boolean
   public static boolean field_1890;
   // $FF: renamed from: ao boolean
   public static boolean field_1891;
   // $FF: renamed from: ap boolean
   public static boolean field_1892;
   // $FF: renamed from: aq boolean
   public static boolean field_1893 = false;
   // $FF: renamed from: ar boolean
   public static boolean field_1894 = false;
   // $FF: renamed from: as boolean
   public static boolean field_1895;
   // $FF: renamed from: at java.lang.String
   public static String field_1896 = null;
   // $FF: renamed from: au boolean
   public static boolean field_1897;
   // $FF: renamed from: av boolean
   public static boolean field_1898 = false;
   // $FF: renamed from: aw boolean
   public static boolean field_1899 = false;
   // $FF: renamed from: ax boolean
   public static boolean field_1900 = false;
   // $FF: renamed from: ay boolean
   public static boolean field_1901 = false;
   // $FF: renamed from: az boolean
   public static boolean field_1902 = true;
   // $FF: renamed from: aA boolean
   public static boolean field_1903 = true;
   // $FF: renamed from: aB boolean
   public static boolean field_1904 = false;
   // $FF: renamed from: aC boolean
   public static boolean field_1905 = false;
   // $FF: renamed from: aD java.lang.Class
   public static Class field_1906;
   // $FF: renamed from: aE boolean
   public boolean field_1907 = false;
   // $FF: renamed from: aF boolean
   public boolean field_1908;
   // $FF: renamed from: aG boolean
   public boolean field_1909 = false;
   // $FF: renamed from: aH boolean
   public boolean field_1910 = false;
   // $FF: renamed from: aI boolean
   public boolean field_1911 = false;
   // $FF: renamed from: aJ boolean
   public boolean field_1912 = false;
   // $FF: renamed from: aK boolean
   public boolean field_1913;
   // $FF: renamed from: aL boolean
   public boolean field_1914 = false;
   // $FF: renamed from: aM com.corrodinggames.rts.game.k
   public class_107 field_1915;
   // $FF: renamed from: aN float
   public float field_1916 = 1.0F;
   // $FF: renamed from: aO float
   public float field_1917 = -1.0F;
   // $FF: renamed from: aP boolean
   public boolean field_1918;
   // $FF: renamed from: aQ boolean
   public boolean field_1919;
   // $FF: renamed from: aR int
   public int field_1920 = 0;
   // $FF: renamed from: aS int
   public int field_1921;
   // $FF: renamed from: aT int
   public int field_1922;
   // $FF: renamed from: aU int
   public int field_1923;
   // $FF: renamed from: aV int
   public int field_1924;
   // $FF: renamed from: aW boolean
   public boolean field_1925;
   // $FF: renamed from: aX boolean
   public boolean field_1926 = false;
   // $FF: renamed from: aY boolean
   public volatile boolean field_1927 = false;
   // $FF: renamed from: aZ boolean
   public volatile boolean field_1928 = false;
   // $FF: renamed from: ba boolean
   public volatile boolean field_1929 = false;
   // $FF: renamed from: bb boolean
   public volatile boolean field_1930 = false;
   // $FF: renamed from: bc com.corrodinggames.rts.gameFramework.utility.i
   public class_195 field_1931;
   // $FF: renamed from: bd com.corrodinggames.rts.game.b.b
   public class_408 field_1932;
   // $FF: renamed from: be com.corrodinggames.rts.gameFramework.a.e
   public class_525 field_1933;
   // $FF: renamed from: bf com.corrodinggames.rts.gameFramework.aj
   public class_439 field_1934;
   // $FF: renamed from: bg com.corrodinggames.rts.gameFramework.h.l
   public class_22 field_1935;
   // $FF: renamed from: bh com.corrodinggames.rts.gameFramework.a
   public class_249 field_1936;
   // $FF: renamed from: bi com.corrodinggames.rts.gameFramework.SettingsEngine
   public SettingsEngine field_1937;
   // $FF: renamed from: bj com.corrodinggames.rts.gameFramework.b.c
   public class_391 field_1938;
   // $FF: renamed from: bk com.corrodinggames.rts.gameFramework.c.e
   public class_98 field_1939;
   // $FF: renamed from: bl com.corrodinggames.rts.gameFramework.aa
   public class_426 field_1940;
   // $FF: renamed from: bm com.corrodinggames.rts.gameFramework.g.d
   public class_238 field_1941;
   // $FF: renamed from: bn com.corrodinggames.rts.gameFramework.y
   public class_31 field_1942;
   // $FF: renamed from: bo com.corrodinggames.rts.gameFramework.c.j
   public class_174 field_1943;
   // $FF: renamed from: bp com.corrodinggames.rts.gameFramework.f.x
   public class_454 field_1944;
   // $FF: renamed from: bq com.corrodinggames.rts.gameFramework.bd
   public class_400 field_1945;
   // $FF: renamed from: br com.corrodinggames.rts.gameFramework.e.a
   public class_220 field_1946;
   // $FF: renamed from: bs com.corrodinggames.rts.gameFramework.w
   public class_287 field_1947;
   // $FF: renamed from: bt com.corrodinggames.rts.gameFramework.ax
   public class_417 field_1948;
   // $FF: renamed from: bu com.corrodinggames.rts.game.units.af
   public class_504 field_1949;
   // $FF: renamed from: bv com.corrodinggames.rts.gameFramework.bg
   public class_402 field_1950;
   // $FF: renamed from: bw com.corrodinggames.rts.gameFramework.i.c
   public class_33 field_1951;
   // $FF: renamed from: bx com.corrodinggames.rts.gameFramework.c
   public class_314 field_1952;
   // $FF: renamed from: by boolean
   public boolean field_1953 = false;
   // $FF: renamed from: bz float
   public float field_1954;
   // $FF: renamed from: bA float
   public float field_1955;
   // $FF: renamed from: bB float
   public float field_1956;
   // $FF: renamed from: bC float
   public float field_1957;
   // $FF: renamed from: bD float
   public float field_1958 = 1.0F;
   // $FF: renamed from: bE float
   public float field_1959;
   // $FF: renamed from: bF float
   public float field_1960;
   // $FF: renamed from: bG float
   public float field_1961;
   // $FF: renamed from: bH boolean
   public boolean field_1962;
   // $FF: renamed from: bI int
   public int field_1963;
   // $FF: renamed from: bJ int
   public int field_1964;
   // $FF: renamed from: bK float
   public float field_1965;
   // $FF: renamed from: bL float
   public float field_1966;
   // $FF: renamed from: bM float
   public float field_1967;
   // $FF: renamed from: bN float
   public float field_1968;
   // $FF: renamed from: bO float
   public float field_1969;
   // $FF: renamed from: bP float
   public float field_1970;
   // $FF: renamed from: bQ float
   public float field_1971;
   // $FF: renamed from: bR float
   public float field_1972;
   // $FF: renamed from: bS float
   public float field_1973;
   // $FF: renamed from: bT float
   public float field_1974;
   // $FF: renamed from: bU float
   public float field_1975;
   // $FF: renamed from: bV float
   public float field_1976;
   // $FF: renamed from: bW android.graphics.Rect
   public Rect field_1977 = new Rect();
   // $FF: renamed from: bX android.graphics.Rect
   public Rect field_1978 = new Rect();
   // $FF: renamed from: bY android.graphics.RectF
   public RectF field_1979 = new RectF();
   // $FF: renamed from: bZ android.graphics.Rect
   public Rect field_1980 = new Rect();
   // $FF: renamed from: ca android.graphics.RectF
   public RectF field_1981 = new RectF();
   // $FF: renamed from: cb android.graphics.Rect
   public Rect field_1982 = new Rect();
   // $FF: renamed from: cc boolean
   public boolean field_1983;
   // $FF: renamed from: cd boolean
   public boolean field_1984;
   // $FF: renamed from: ce float
   public float field_1985;
   // $FF: renamed from: cf float
   public float field_1986 = 1.0F;
   // $FF: renamed from: cg boolean
   public boolean field_1987 = false;
   // $FF: renamed from: ch float
   public float field_1988 = 1.0F;
   // $FF: renamed from: ci float
   public float field_1989 = 1.0F;
   // $FF: renamed from: cj boolean
   public boolean field_1990;
   // $FF: renamed from: ck float
   public float field_1991;
   // $FF: renamed from: cl float
   public float field_1992;
   // $FF: renamed from: cm boolean
   public boolean field_1993 = true;
   // $FF: renamed from: cn boolean
   public boolean field_1994 = true;
   // $FF: renamed from: co boolean
   public boolean field_1995 = true;
   // $FF: renamed from: cp boolean
   public boolean field_1996 = true;
   // $FF: renamed from: cq float
   public float field_1997 = 0.0F;
   // $FF: renamed from: cr float
   public float field_1998 = 0.0F;
   // $FF: renamed from: cs boolean
   public boolean field_1999 = false;
   // $FF: renamed from: ct com.corrodinggames.rts.gameFramework.x
   protected class_288 field_2000 = null;
   // $FF: renamed from: cu java.lang.String
   public String field_2001;
   // $FF: renamed from: cv com.corrodinggames.rts.gameFramework.f.h
   public class_463 field_2002;
   // $FF: renamed from: cw android.graphics.Paint
   public Paint field_2003;
   // $FF: renamed from: cx android.graphics.Paint
   public Paint field_2004;
   // $FF: renamed from: cy android.graphics.Paint
   public Paint field_2005;
   // $FF: renamed from: cz boolean
   public boolean field_2006 = false;
   // $FF: renamed from: cA boolean
   public boolean field_2007 = false;
   // $FF: renamed from: cB float
   public float field_2008 = 0.0F;
   // $FF: renamed from: cC boolean
   public boolean field_2009 = false;
   // $FF: renamed from: cD boolean
   public boolean field_2010 = false;
   // $FF: renamed from: cE boolean
   public boolean field_2011 = false;
   // $FF: renamed from: cF int
   public int field_2012;
   // $FF: renamed from: cG float
   public float field_2013 = 0.0F;
   // $FF: renamed from: cH com.corrodinggames.rts.gameFramework.o
   public static class_293 field_2014 = new class_294();
   // $FF: renamed from: cI java.lang.String
   public static String field_2015;
   // $FF: renamed from: cJ float
   float field_2016;
   // $FF: renamed from: cK boolean
   boolean field_2017 = false;
   // $FF: renamed from: cL java.util.ArrayList
   ArrayList field_2018 = new ArrayList();
   // $FF: renamed from: cM android.os.Handler
   final Handler field_2019 = new Handler(Looper.method_3227());
   // $FF: renamed from: cN java.lang.String
   public String field_2020;
   // $FF: renamed from: a java.lang.Runnable
   private Runnable field_2021 = new k$1(this);
   // $FF: renamed from: cO java.lang.String
   public String field_2022;
   // $FF: renamed from: cP java.lang.String
   public String field_2023;
   // $FF: renamed from: b java.lang.Runnable
   private Runnable field_2024 = new k$2(this);
   // $FF: renamed from: cQ com.corrodinggames.rts.gameFramework.n
   public class_329 field_2025 = null;
   // $FF: renamed from: cR java.lang.String
   String field_2026 = null;
   // $FF: renamed from: cS java.lang.Object
   Object field_2027 = new Object();
   // $FF: renamed from: cT java.lang.String
   String field_2028;
   // $FF: renamed from: cU java.lang.String
   String field_2029;
   // $FF: renamed from: cV boolean[]
   public boolean[] field_2030 = new boolean[10];
   // $FF: renamed from: cW java.util.concurrent.ConcurrentLinkedQueue
   protected ConcurrentLinkedQueue field_2031 = new ConcurrentLinkedQueue();
   // $FF: renamed from: c boolean[]
   private boolean[] field_2032 = new boolean[KeyEvent.method_2007() + 1];
   // $FF: renamed from: d boolean[]
   private boolean[] field_2033 = new boolean[KeyEvent.method_2007() + 1];
   // $FF: renamed from: e int
   private int field_2034;
   // $FF: renamed from: cX boolean
   static boolean field_2035;
   // $FF: renamed from: cY byte[]
   static byte[] field_2036;
   // $FF: renamed from: cZ com.corrodinggames.rts.gameFramework.utility.d
   static class_227 field_2037;
   // $FF: renamed from: da boolean
   static boolean field_2038;

   // $FF: renamed from: b (android.content.Context) boolean
   public static strictfp boolean method_1547(Context var0) {
      String var1 = null;
      if (field_1899) {
         var1 = "dedicatedServer";
      } else {
         var1 = var0.method_1856().method_1857();
      }

      Log.method_1712("RustedWarfare", "packageName:" + var1);
      return var1.contains("rtsdemo");
   }

   // $FF: renamed from: q () boolean
   public strictfp boolean method_1548() {
      return this.field_1984 || this.field_1985 > 0.0F;
   }

   // $FF: renamed from: r () com.corrodinggames.rts.gameFramework.k
   public static final strictfp class_236 method_1549() {
      return field_1879;
   }

   // $FF: renamed from: s () boolean
   public static final strictfp boolean method_1550() {
      return field_1904;
   }

   // $FF: renamed from: t () boolean
   public static final strictfp boolean method_1551() {
      return field_1905;
   }

   // $FF: renamed from: c (android.content.Context) void
   public strictfp void method_1552(Context var1) {
      class_353.method_2297(var1);
      this.field_1880 = var1;
   }

   // $FF: renamed from: a (android.content.Context, com.corrodinggames.rts.gameFramework.n) com.corrodinggames.rts.gameFramework.k
   public static strictfp synchronized class_236 method_1553(Context var0, class_329 var1) {
      if (field_1879 != null) {
         if (var1 != null) {
            field_1879.field_2025 = var1;
         }

         field_1879.method_1552(var0);
         return field_1879;
      } else {
         field_1879 = field_2014.method_1996(var0);
         method_1591("Created new gameEngine of:" + field_1879.getClass().getName());
         if (var1 != null) {
            field_1879.field_2025 = var1;
         }

         field_1879.method_1555(var0);
         return field_1879;
      }
   }

   public strictfp class_236(Context var1) {
      Log.method_1712("RustedWarfare", "GameEngine:GameEngine()");
      if (field_1879 != null) {
         throw new RuntimeException("gameEngine already created");
      } else {
         this.method_1552(var1);
         field_1879 = this;
      }
   }

   protected strictfp void finalize() {
      Log.method_1712("RustedWarfare", "GameEngine:finalize()");
      super.finalize();
   }

   // $FF: renamed from: u () boolean
   public strictfp boolean method_1554() {
      return true;
   }

   // $FF: renamed from: a (android.content.Context) void
   public abstract void method_1555(Context var1);

   // $FF: renamed from: v () void
   public strictfp void method_1556() {
   }

   // $FF: renamed from: a () boolean
   public abstract boolean method_1557();

   // $FF: renamed from: a (boolean) boolean
   public abstract boolean method_1558(boolean var1);

   // $FF: renamed from: a (android.app.Activity, com.corrodinggames.rts.a.d, boolean) void
   public abstract void method_1559(Activity var1, class_11 var2, boolean var3);

   // $FF: renamed from: a (int, int) void
   public abstract void method_1560(int var1, int var2);

   // $FF: renamed from: c (boolean) int
   public abstract int method_1561(boolean var1);

   // $FF: renamed from: j () boolean
   public abstract boolean method_1562();

   // $FF: renamed from: k () boolean
   public abstract boolean method_1563();

   // $FF: renamed from: h () java.lang.String
   public abstract String method_1564();

   // $FF: renamed from: i () java.lang.String
   public abstract String method_1565();

   // $FF: renamed from: l () java.lang.String
   public abstract String method_1566();

   // $FF: renamed from: w () java.lang.String
   public strictfp String method_1567() {
      if (method_1654()) {
         return "PC";
      } else {
         return field_1899 ? "SERVER" : Build.MODEL;
      }
   }

   // $FF: renamed from: x () java.lang.String
   public strictfp String method_1568() {
      return field_2015;
   }

   // $FF: renamed from: a (boolean, boolean, com.corrodinggames.rts.gameFramework.r) void
   public abstract void method_1569(boolean var1, boolean var2, class_289 var3);

   // $FF: renamed from: a (boolean, com.corrodinggames.rts.gameFramework.r) void
   public abstract void method_1570(boolean var1, class_289 var2);

   // $FF: renamed from: c () void
   public abstract void method_1571();

   // $FF: renamed from: n () void
   public abstract void method_1572();

   // $FF: renamed from: a (float, int) void
   public abstract void method_1573(float var1, int var2);

   // $FF: renamed from: b (float, int) void
   public abstract void method_1574(float var1, int var2);

   // $FF: renamed from: y () boolean
   public strictfp boolean method_1575() {
      return this.field_1929;
   }

   // $FF: renamed from: z () void
   public strictfp synchronized void method_1576() {
      method_1591("--- setRunning ---");
      if (!method_1654()) {
         this.field_1934.method_2765();
      }

      if (!field_1900 && !field_1901 && this.field_2000 == null) {
         this.field_2000 = new class_288();
         this.field_2000.method_1994(true);
         this.field_2000.start();
      }

   }

   // $FF: renamed from: A () void
   public strictfp synchronized void method_1577() {
      method_1591("--- setStopped ---");
      if (this.field_2000 == null) {
         Log.method_1712("RustedWarfare", "gameThread already null");
      } else {
         if (!method_1654()) {
            this.field_1934.method_2763();
         }

         this.field_2000.method_1994(false);
         boolean var1 = true;

         while(var1) {
            try {
               this.field_2000.join();
               var1 = false;
            } catch (InterruptedException var3) {
            }
         }

         Log.method_1712("RustedWarfare", "thread stop");
         this.field_2000 = null;
         if (this.field_1882 != null) {
            this.field_1882.method_38();
         }

         if (this.field_1926) {
            Debug.stopMethodTracing();
         }

      }
   }

   // $FF: renamed from: B () boolean
   public strictfp boolean method_1578() {
      return this.field_1944 == null ? false : this.field_1944.field_3809;
   }

   // $FF: renamed from: C () boolean
   public strictfp boolean method_1579() {
      if (this.field_1944 == null) {
         return true;
      } else if (this.field_1944.field_3811) {
         return true;
      } else {
         return !this.field_1944.field_3809 && !this.field_1948.method_2658();
      }
   }

   // $FF: renamed from: D () void
   public strictfp void method_1580() {
      this.field_1962 = false;
      if (this.field_1967 < 0.0F) {
         this.field_1967 = 0.0F;
         this.field_1962 = true;
      }

      if (this.field_1968 < 0.0F) {
         this.field_1968 = 0.0F;
         this.field_1962 = true;
      }

      if (this.field_1967 > this.field_1932.method_2612() - this.field_1971) {
         this.field_1967 = this.field_1932.method_2612() - this.field_1971;
         this.field_1962 = true;
      }

      if (this.field_1968 > this.field_1932.method_2613() - this.field_1970) {
         this.field_1968 = this.field_1932.method_2613() - this.field_1970;
         this.field_1962 = true;
      }

      if (this.field_1971 > this.field_1932.method_2612()) {
         this.field_1967 = this.field_1932.method_2612() / 2.0F - this.field_1971 / 2.0F;
         this.field_1962 = true;
      }

      if (this.field_1970 > this.field_1932.method_2613()) {
         this.field_1968 = this.field_1932.method_2613() / 2.0F - this.field_1970 / 2.0F;
         this.field_1962 = true;
      }

      this.method_1581(this.field_1967, this.field_1968);
   }

   // $FF: renamed from: a (float, float) void
   public strictfp void method_1581(float var1, float var2) {
      this.field_1967 = var1;
      this.field_1968 = var2;
      this.field_1963 = (int)this.field_1967;
      this.field_1964 = (int)this.field_1968;
      this.field_1965 = (float)((int)(this.field_1967 * this.field_1988)) / this.field_1988;
      this.field_1966 = (float)((int)(this.field_1968 * this.field_1988)) / this.field_1988;
      short var3 = 90;
      if (method_1550()) {
         var3 = 210;
      }

      this.field_1980.method_1911((int)(this.field_1967 - (float)var3), (int)(this.field_1968 - (float)var3), (int)(this.field_1967 + this.field_1969 + (float)var3), (int)(this.field_1968 + this.field_1970 + (float)var3));
      this.field_1982.method_1911((int)this.field_1967, (int)this.field_1968, (int)(this.field_1967 + this.field_1969), (int)(this.field_1968 + this.field_1970));
      short var4 = 300;
      this.field_1981.method_1969((float)((int)(this.field_1967 - (float)var4)), (float)((int)(this.field_1968 - (float)var4)), (float)((int)(this.field_1967 + this.field_1969 + (float)var4)), (float)((int)(this.field_1968 + this.field_1970 + (float)var4)));
   }

   // $FF: renamed from: b (float, float) void
   public strictfp void method_1582(float var1, float var2) {
      this.method_1581(var1 - this.field_1971 / 2.0F, var2 - this.field_1970 / 2.0F);
   }

   // $FF: renamed from: d (android.content.Context) boolean
   public static strictfp boolean method_1583(Context var0) {
      if (field_1899) {
         return false;
      } else {
         if (Build.MODEL.equals("GT-I9100") || Build.MODEL.equals("GT-I9300")) {
            try {
               WifiManager var1 = (WifiManager)var0.method_1862("wifi");
               WifiInfo var2 = var1.getConnectionInfo();
               if (var2 != null && "BlueStacks".equals(var2.getSSID())) {
                  return true;
               }
            } catch (Exception var3) {
               var3.printStackTrace();
            }
         }

         return false;
      }
   }

   // $FF: renamed from: E () void
   public strictfp void method_1584() {
      if (this.field_1988 != 1.0F) {
         this.field_1935.method_92(this.field_1988, this.field_1988);
      }

   }

   // $FF: renamed from: F () void
   public strictfp void method_1585() {
      if (this.field_1988 != 1.0F) {
         this.field_1935.method_92(1.0F / this.field_1988, 1.0F / this.field_1988);
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.Exception) void
   public static strictfp void method_1586(String var0, Exception var1) {
      method_1591(var0);
      var1.printStackTrace();
   }

   // $FF: renamed from: a (java.lang.String) void
   public static strictfp void method_1587(String var0) {
      method_1591("--- ERROR: " + var0);
   }

   // $FF: renamed from: b (java.lang.String) void
   public static strictfp void method_1588(String var0) {
      method_1591(var0);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Throwable) void
   public static strictfp void method_1589(String var0, Throwable var1) {
      method_1591(var0);
      method_1591("" + var1.toString());
      method_1591("cause:" + var1.getCause());
      var1.printStackTrace();
   }

   // $FF: renamed from: c (java.lang.String) void
   public static strictfp void method_1590(String var0) {
      if (field_1900) {
         Log.method_1709("RustedWarfare", var0);
      } else {
         Log.method_1709("RustedWarfare", var0);
      }
   }

   // $FF: renamed from: d (java.lang.String) void
   public static strictfp void method_1591(String var0) {
      method_1590(var0);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public static strictfp void method_1592(String var0, String var1) {
      method_1590(var0 + ":" + var1);
   }

   // $FF: renamed from: e (java.lang.String) void
   public static strictfp synchronized void method_1593(String var0) {
      method_1590(var0 + " (at " + System.nanoTime() + ")");
   }

   // $FF: renamed from: G () void
   public static strictfp void method_1594() {
      StackTraceElement[] var0 = (new Throwable()).getStackTrace();
      StackTraceElement[] var1 = var0;
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         StackTraceElement var4 = var1[var3];
         method_1591(var4.toString());
      }

   }

   // $FF: renamed from: f (java.lang.String) void
   public static strictfp void method_1595(String var0) {
      method_1588(var0);
      method_1594();
   }

   // $FF: renamed from: H () long
   public static strictfp long method_1596() {
      return System.currentTimeMillis();
   }

   // $FF: renamed from: I () float
   public strictfp float method_1597() {
      float var1 = this.field_1954;
      if (this.field_1937 != null) {
         var1 *= this.field_1937.renderDensity;
         if (this.field_1937.renderDoubleScale) {
            return var1 / 2.0F;
         }
      }

      return var1;
   }

   // $FF: renamed from: e (float) int
   public strictfp int method_1598(float var1) {
      int var2 = (int)(var1 * this.field_1955 + 0.5F);
      return var2;
   }

   // $FF: renamed from: a (int) int
   public strictfp int method_1599(int var1) {
      return (int)((float)var1 * this.field_1955 + 0.5F);
   }

   // $FF: renamed from: J () void
   public strictfp void method_1600() {
      if (this.field_2016 != this.field_1955) {
         Iterator var1 = this.field_2018.iterator();

         while(var1.hasNext()) {
            class_336 var2 = (class_336)var1.next();
            var2.method_2242();
         }

         this.field_2016 = this.field_1955;
      }

   }

   // $FF: renamed from: K () void
   protected strictfp void method_1601() {
      Iterator var1 = this.field_2018.iterator();

      while(var1.hasNext()) {
         class_336 var2 = (class_336)var1.next();
         this.field_1935.method_98(var2.field_2687);
      }

      this.field_2017 = true;
   }

   // $FF: renamed from: a (android.graphics.Paint) void
   public strictfp void method_1602(Paint var1) {
      this.method_1603(var1, 16.0F);
   }

   // $FF: renamed from: a (android.graphics.Paint, float) void
   public strictfp void method_1603(Paint var1, float var2) {
      class_336 var3 = new class_336(this);
      var3.field_2686 = var2;
      var3.field_2687 = var1;
      var3.method_2242();
      this.field_2018.add(var3);
      if (this.field_2017) {
         this.field_1935.method_98(var3.field_2687);
      }

   }

   // $FF: renamed from: g (java.lang.String) void
   public strictfp void method_1604(String var1) {
      this.method_1605(var1, true);
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public strictfp void method_1605(String var1, boolean var2) {
      this.field_2026 = var1;
      if (this.field_2025 != null) {
         this.field_2025.method_2214(var1, var2);
      }

   }

   // $FF: renamed from: L () void
   public strictfp void method_1606() {
      this.field_2026 = null;
   }

   // $FF: renamed from: h (java.lang.String) void
   public strictfp void method_1607(String var1) {
      this.method_1608(var1, 1);
   }

   // $FF: renamed from: a (java.lang.String, int) void
   public strictfp void method_1608(String var1, int var2) {
      if (field_1899) {
         method_1591("alert:" + var1);
      } else {
         this.field_2020 = var1;
         this.field_2019.method_1531(this.field_2021);
      }

      if (this.field_2025 != null) {
         this.field_2025.method_2212(var1, var2);
      }

   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public strictfp void method_1609(String var1, String var2) {
      if (this.field_2025 != null) {
         this.field_2025.method_2213(var1, var2);
      }

      if (field_1899) {
         if (this.field_2025 == null) {
            method_1588("showMessageBox: not showing due to non-android:" + var2);
         }

      } else {
         this.field_1913 = true;
         this.field_2022 = var1;
         this.field_2023 = var2;
         this.field_2019.method_1531(this.field_2024);
      }
   }

   // $FF: renamed from: M () void
   public strictfp void method_1610() {
      synchronized(this.field_2027) {
         if (this.field_2028 != null) {
            this.method_1609(this.field_2029, this.field_2028);
            this.field_2028 = null;
            this.field_2029 = null;
         }

      }
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String) void
   public strictfp void method_1611(String var1, String var2) {
      this.field_2029 = var1;
      this.field_2028 = var2;
      if (field_1900) {
         this.method_1610();
      } else {
         k$3 var3 = new k$3(this);
         var3.start();
      }
   }

   // $FF: renamed from: N () boolean
   public strictfp boolean method_1612() {
      if (this.field_1884) {
         return false;
      } else {
         return this.field_1882.method_35() == null ? false : this.field_1882.method_35().method_2284();
      }
   }

   // $FF: renamed from: O () void
   public strictfp void method_1613() {
      if (this.field_1882.method_35() != null) {
         this.field_1882.method_35().method_2285();
      }
   }

   // $FF: renamed from: P () int
   public strictfp int method_1614() {
      return this.field_1884 ? 0 : this.field_1882.method_35().method_2283();
   }

   // $FF: renamed from: Q () float
   public strictfp float method_1615() {
      return this.method_1617(0);
   }

   // $FF: renamed from: R () float
   public strictfp float method_1616() {
      return this.method_1618(0);
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_1617(int var1) {
      return this.field_1937.renderDoubleScale ? this.field_1882.method_35().method_2288()[var1] / 2.0F : this.field_1882.method_35().method_2288()[var1];
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_1618(int var1) {
      return this.field_1937.renderDoubleScale ? this.field_1882.method_35().method_2290()[var1] / 2.0F : this.field_1882.method_35().method_2290()[var1];
   }

   // $FF: renamed from: d (int) int
   public strictfp int method_1619(int var1) {
      return this.field_1882.method_35().method_2289()[var1];
   }

   // $FF: renamed from: e (int) boolean
   public strictfp boolean method_1620(int var1) {
      if (var1 != 1 && var1 != 2 && var1 != 3) {
         throw new RuntimeException("Unknown mouseButton:" + var1);
      } else {
         int var2 = this.method_1621(var1);
         return var2 != -1;
      }
   }

   // $FF: renamed from: f (int) int
   public strictfp int method_1621(int var1) {
      if (var1 == 0) {
         throw new RuntimeException("finding state of 0 doesn't make sense");
      } else {
         int[] var2 = this.field_1882.method_35().method_2289();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] == var1) {
               return var3;
            }
         }

         return -1;
      }
   }

   // $FF: renamed from: g (int) boolean
   public strictfp boolean method_1622(int var1) {
      if (var1 < this.field_2032.length && var1 >= 0) {
         if (this.field_2032[var1] && this.field_2033[var1]) {
            this.field_2033[var1] = false;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: h (int) boolean
   public strictfp boolean method_1623(int var1) {
      return var1 < this.field_2032.length && var1 >= 0 ? this.field_2032[var1] : false;
   }

   // $FF: renamed from: a (int, boolean) boolean
   public strictfp boolean method_1624(int var1, boolean var2) {
      boolean var3 = true;
      boolean var4 = true;
      int var5 = this.method_1627();
      if ((var1 & 2) != 0) {
         if ((var5 & 2) == 0) {
            var3 = false;
         }
      } else if ((var5 & 2) != 0) {
         var4 = false;
      }

      if ((var1 & 1) != 0) {
         if ((var5 & 1) == 0) {
            var3 = false;
         }
      } else if ((var5 & 1) != 0) {
         var4 = false;
      }

      if ((var1 & 4) != 0) {
         if ((var5 & 4) == 0) {
            var3 = false;
         }
      } else if ((var5 & 4) != 0) {
         var4 = false;
      }

      if (var2) {
         return var3;
      } else {
         return var3 && var4;
      }
   }

   // $FF: renamed from: i (int) boolean
   public strictfp boolean method_1625(int var1) {
      boolean var2 = true;
      if (var1 != 59 && var1 != 60) {
         if (var1 != 113 && var1 != 113) {
            return var1 == 57 || var1 == 58;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   // $FF: renamed from: j (int) java.lang.String
   public static strictfp String method_1626(int var0) {
      String var1 = "";
      if ((var0 & 2) != 0) {
         var1 = var1 + "shift+";
      }

      if ((var0 & 1) != 0) {
         var1 = var1 + "ctrl+";
      }

      if ((var0 & 4) != 0) {
         var1 = var1 + "alt+";
      }

      return var1;
   }

   // $FF: renamed from: S () int
   public strictfp int method_1627() {
      int var1 = 0;
      if (this.method_1623(59) || this.method_1623(60)) {
         var1 += 2;
      }

      if (this.method_1623(113) || this.method_1623(114)) {
         ++var1;
      }

      if (this.method_1623(57) || this.method_1623(58)) {
         var1 += 4;
      }

      return var1;
   }

   // $FF: renamed from: b (int, int) boolean
   public strictfp boolean method_1628(int var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      if (var1 >= 0 && var1 < this.field_2032.length) {
         var3 = this.field_2032[var1];
      }

      if (var2 >= 0 && var2 < this.field_2032.length) {
         var4 = this.field_2032[var2];
      }

      return var3 || var4;
   }

   // $FF: renamed from: b (int, boolean) void
   public strictfp void method_1629(int var1, boolean var2) {
      if (var1 >= 0 && var1 < this.field_2032.length) {
         this.field_2032[var1] = var2;
         if (var2) {
            this.field_2033[var1] = var2;
         }
      } else {
         method_1591("setKeyState: Key out of range:" + var1);
      }

   }

   // $FF: renamed from: k (int) void
   public strictfp void method_1630(int var1) {
      this.field_2031.add(new class_292(this, var1));
   }

   // $FF: renamed from: T () int
   public strictfp int method_1631() {
      return this.field_2034;
   }

   // $FF: renamed from: U () void
   protected strictfp void method_1632() {
      this.field_2034 = 0;

      while(true) {
         while(true) {
            while(true) {
               class_290 var1 = (class_290)this.field_2031.poll();
               if (var1 == null) {
                  return;
               }

               if (var1 instanceof class_291) {
                  class_291 var3 = (class_291)var1;
                  if (var3.field_2450 < this.field_2032.length && var3.field_2450 >= 0) {
                     this.field_2032[var3.field_2450] = !var3.field_2451;
                     this.field_2033[var3.field_2450] = !var3.field_2451;
                  } else {
                     method_1592("updateKeyState", "keyCode (" + var3.field_2450 + ") is out of range");
                  }
               } else if (var1 instanceof class_292) {
                  class_292 var2 = (class_292)var1;
                  this.field_2034 += var2.field_2452;
               }
            }
         }
      }
   }

   // $FF: renamed from: i (java.lang.String) boolean
   public static strictfp boolean method_1633(String var0) {
      String var1 = method_1637(var0);
      if (method_1635(var0)) {
         if (!method_1549().field_1931.method_1310(var1)) {
            method_1591("isDirectory: asset file doesn't exist:" + var1);
            return false;
         } else {
            String var3 = class_296.method_2092(var0);
            return !var3.contains(".");
         }
      } else {
         File var2 = new File(var1);
         if (!var2.exists()) {
            method_1591("isDirectory: file doesn't exist:" + var1);
            return false;
         } else {
            return var2.isDirectory();
         }
      }
   }

   // $FF: renamed from: j (java.lang.String) boolean
   public static strictfp boolean method_1634(String var0) {
      String var1 = method_1637(var0);
      if (method_1635(var0)) {
         return method_1549().field_1931.method_1310(var1);
      } else {
         File var2 = new File(var1);
         return var2 != null && var2.exists();
      }
   }

   // $FF: renamed from: k (java.lang.String) boolean
   public static strictfp boolean method_1635(String var0) {
      if (field_1899) {
         return false;
      } else {
         return !var0.startsWith("/SD/");
      }
   }

   // $FF: renamed from: l (java.lang.String) boolean
   public static strictfp boolean method_1636(String var0) {
      if (!var0.startsWith("/") && !var0.startsWith("\\")) {
         var0 = var0.split("\\\\")[0];
         return var0.endsWith(":");
      } else {
         return true;
      }
   }

   // $FF: renamed from: m (java.lang.String) java.lang.String
   public static strictfp String method_1637(String var0) {
      class_236 var1 = method_1549();
      String[] var2;
      String var3;
      boolean var4;
      int var5;
      String var6;
      String var7;
      if (var0.contains("MOD|")) {
         var2 = var0.split("/");
         if (var2.length >= 2) {
            var3 = var2[var2.length - 1];
            var4 = false;

            for(var5 = var2.length - 2; var5 >= 0; --var5) {
               var6 = var2[var5];
               if (var6.startsWith("MOD|")) {
                  var7 = var6.substring("MOD|".length());
                  class_215 var8 = var1.field_1946.method_1439(var7);
                  if (var8 != null) {
                     var3 = var8.field_1742 + File.separator + var3;
                     method_1591("Path changed to mod path:" + var3);
                     var4 = true;
                     break;
                  }

                  method_1591("Failed to find mod with hash:" + var7);
               }

               var3 = var6 + File.separator + var3;
            }

            if (var4) {
               return method_1637(var3);
            }
         }
      }

      if (var0.contains("NEW_PATH|")) {
         var2 = var0.split("/");
         if (var2.length >= 2) {
            var3 = var2[var2.length - 1];
            var4 = false;

            for(var5 = var2.length - 2; var5 >= 0; --var5) {
               var6 = var2[var5];
               if (var6.startsWith("NEW_PATH|")) {
                  var7 = var6.substring("NEW_PATH|".length());
                  if (var7.equals("maps2")) {
                     var3 = "/SD/rustedWarfare/maps" + File.separator + var3;
                     method_1591("Path changed to maps2 path:" + var3);
                     var4 = true;
                     break;
                  }
               }

               var3 = var6 + File.separator + var3;
            }

            if (var4) {
               return method_1637(var3);
            }
         }
      }

      if (field_1899) {
         if (var0.startsWith("/SD/rusted_warfare_maps")) {
            var0 = "/SD/mods/maps" + var0.substring("/SD/rusted_warfare_maps".length());
            method_1591("convertAbstractPath: Changing to:" + var0);
         }

         if (!var0.startsWith("/SD/") && !var0.startsWith("\\SD\\")) {
            return method_1636(var0) ? var0 : "assets/" + var0;
         } else {
            String var9 = var0.substring("/SD/".length());
            var3 = "rustedWarfare/";
            if (var9.startsWith(var3)) {
               var9 = var9.substring(var3.length());
            }

            return var9;
         }
      } else {
         return var0.startsWith("/SD/") ? Environment.getExternalStorageDirectory() + "/" + var0.substring("/SD/".length()) : var0;
      }
   }

   // $FF: renamed from: b (java.lang.String, boolean) java.lang.String[]
   public static strictfp String[] method_1638(String var0, boolean var1) {
      String var3 = method_1637(var0);
      String[] var2;
      if (method_1635(var0)) {
         var2 = method_1549().field_1931.method_1311(var3);
      } else {
         File var4 = new File(var3);
         if (var4 == null || !var4.exists()) {
            method_1588("listDir: path doesn't exist:" + var3);
            return null;
         }

         var2 = var4.list();
      }

      if (var2 == null) {
         method_1591("listDir baseList==null:" + var0 + " (non folder?)");
         return null;
      } else {
         ArrayList var9 = new ArrayList();
         String[] var5;
         int var6;
         int var7;
         String var8;
         if (var1) {
            var5 = var2;
            var6 = var2.length;

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var5[var7];
               if (var8.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                  var9.add(var8);
               }
            }
         } else {
            var5 = var2;
            var6 = var2.length;

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var5[var7];
               var9.add(var8);
            }
         }

         if (field_1899) {
            Collections.sort(var9);
         }

         return (String[])var9.toArray(new String[0]);
      }
   }

   // $FF: renamed from: n (java.lang.String) java.lang.String
   public static strictfp String method_1639(String var0) {
      int var1 = var0.lastIndexOf("/");
      if (var1 == -1) {
         var1 = var0.length();
      }

      return var0.substring(0, var1);
   }

   // $FF: renamed from: o (java.lang.String) java.lang.String
   public static strictfp String method_1640(String var0) {
      int var1 = var0.lastIndexOf("/");
      if (var1 == -1) {
         var1 = 0;
      } else {
         ++var1;
      }

      return var0.substring(var1);
   }

   // $FF: renamed from: p (java.lang.String) java.lang.Integer
   public static strictfp Integer method_1641(String var0) {
      String var1 = method_1640(var0);
      method_1591("getMapLevel for :" + var0 + " file:" + var1);
      Pattern var2 = Pattern.compile("^l(\\d*);.*");
      Matcher var3 = var2.matcher(var1);
      if (var3.matches()) {
         method_1591("getMapLevel:" + var0 + ":" + Integer.parseInt(var3.group(1)));
         return Integer.parseInt(var3.group(1));
      } else {
         return null;
      }
   }

   // $FF: renamed from: q (java.lang.String) java.lang.String
   public static strictfp String method_1642(String var0) {
      class_236 var1 = method_1549();
      Integer var2 = method_1641(var0);
      if (var2 == null) {
         return null;
      } else {
         int var3 = var0.lastIndexOf("/");
         if (var3 == -1) {
            var3 = var0.length();
         }

         String var4 = var0.substring(0, var3);
         String[] var5 = method_1638(var4, true);
         String[] var6 = var5;
         int var7 = var5.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            Integer var10 = method_1641(var9);
            if (var10 != null && var10 > var2 && (!var1.field_1885 || class_271.method_1886(var9, var4 + "/" + var9))) {
               return var4 + "/" + var9;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: V () java.lang.String
   public strictfp String method_1643() {
      return this.field_2001;
   }

   // $FF: renamed from: W () java.lang.String
   public strictfp String method_1644() {
      return class_271.method_1887(class_271.method_1885(this.field_2001));
   }

   // $FF: renamed from: X () java.lang.String
   public strictfp String method_1645() {
      return class_271.method_1885(this.field_2001);
   }

   // $FF: renamed from: a (java.lang.Throwable) java.lang.String
   static strictfp String method_1646(Throwable var0) {
      StringWriter var1 = new StringWriter();
      PrintWriter var2 = new PrintWriter(var1);
      var0.printStackTrace(var2);
      String var3 = var1.toString();
      var2.close();
      return var3;
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.String
   public static strictfp String method_1647(Throwable var0) {
      String var1 = var0.getMessage();
      if (var1 == null) {
         var1 = var0.getClass().getName();
      } else {
         var1 = var1.replace("java.lang.RuntimeException: ", "");
         var1 = var1.replace("java.lang.RuntimeException: ", "");
      }

      Throwable var2;
      Throwable var3;
      for(var2 = var0; var2 != null; var2 = var3) {
         var3 = var2.getCause();
         if (var3 == null || var3 == var0 || var3 == var2) {
            break;
         }
      }

      var3 = null;
      if (var2 != null && var2 != var0) {
         String var5 = var2.getMessage();
         if (var5 == null) {
            var5 = var2.getClass().getName();
         }

         if (!var5.equals(var1)) {
            var1 = var1 + " caused by (" + var5 + ")";
         }
      }

      return var1;
   }

   // $FF: renamed from: Y () void
   public static strictfp void method_1648() {
      if (field_1887) {
         if (!field_1899) {
            if (field_2037 != null) {
               method_1588("setupANRWatchDog: activeANRWatchDog!=null");
            } else {
               field_2037 = new class_227(4000);
               field_2037.method_1480(new k$4());
               field_2037.start();
               method_1588("setupANRWatchDog: running");
            }
         }
      }
   }

   // $FF: renamed from: Z () void
   public static strictfp void method_1649() {
      if (field_2036 == null && method_1654()) {
         field_2036 = new byte[2500000];
         field_2036[0] = 2;
         field_2036[field_2036.length - 1] = 5;
      }

      UncaughtExceptionHandler var0 = Thread.getDefaultUncaughtExceptionHandler();
      if (!(var0 instanceof class_335)) {
         Thread.setDefaultUncaughtExceptionHandler(new class_335(var0));
      }

   }

   // $FF: renamed from: p () int
   public abstract int method_1650();

   // $FF: renamed from: aa () boolean
   public strictfp boolean method_1651() {
      return true;
   }

   // $FF: renamed from: r (java.lang.String) void
   public static strictfp void method_1652(String var0) {
      class_236 var1 = method_1549();
      if (var1 != null) {
         method_1588("reportProblem: " + var0);
         var1.method_1608(var0, 1);
      }

   }

   // $FF: renamed from: ab () boolean
   public static strictfp boolean method_1653() {
      return !field_1899;
   }

   // $FF: renamed from: ac () boolean
   public static strictfp boolean method_1654() {
      return field_1900;
   }

   // $FF: renamed from: ad () boolean
   public static strictfp boolean method_1655() {
      return field_1899 && !field_1900;
   }

   // $FF: renamed from: ae () boolean
   public strictfp boolean method_1656() {
      return this.field_1944.field_3809 || this.field_1948.method_2658();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float) void
   public strictfp void method_1657(class_39 var1, float var2) {
      this.field_1943.method_1224((int)var1.dh, (int)var1.di, var2, var1);
      this.field_1939.field_948.method_1022(var1);
   }

   // $FF: renamed from: b () int
   public abstract int method_1658();

   // $FF: renamed from: af () void
   public static strictfp void method_1659() {
      System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
      long var0 = Runtime.getRuntime().maxMemory();
      System.out.println("Maximum memory (bytes): " + (var0 == Long.MAX_VALUE ? "no limit" : var0));
      System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
   }

   // $FF: renamed from: ag () android.content.Context
   public strictfp Context method_1660() {
      return this.field_1880;
   }

   // $FF: renamed from: d (java.lang.String, java.lang.String) void
   public static strictfp void method_1661(String var0, String var1) {
      class_236 var2 = method_1549();
      if (var2 != null) {
         if (var2.field_1939 != null && var2.field_1939.field_947 != null) {
            var2.field_1939.field_947.method_1196(var0, var1);
         } else {
            method_1595("addMessage: interfaceEngine/messageInterface==null");
         }

      }
   }

   static {
      field_2015 = VERSION.RELEASE;
      field_2035 = false;
      field_2038 = false;
   }
}
