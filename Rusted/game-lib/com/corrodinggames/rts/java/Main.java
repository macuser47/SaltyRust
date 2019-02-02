package com.corrodinggames.rts.java;

import android.app.Activity;
import android.content.ServerContext;
import com.corrodinggames.librocket.class_264;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.a.class_271;
import com.corrodinggames.rts.b.class_499;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_110;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_289;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_312;
import com.corrodinggames.rts.gameFramework.class_329;
import com.corrodinggames.rts.gameFramework.class_402;
import com.corrodinggames.rts.gameFramework.class_426;
import com.corrodinggames.rts.gameFramework.class_439;
import com.corrodinggames.rts.gameFramework.a.class_326;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.f.class_231;
import com.corrodinggames.rts.gameFramework.f.class_396;
import com.corrodinggames.rts.gameFramework.f.class_444;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_458;
import com.corrodinggames.rts.gameFramework.j.class_223;
import com.corrodinggames.rts.gameFramework.utility.class_179;
import com.corrodinggames.rts.java.a.class_224;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Input;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;

public class Main extends class_231 {
   // $FF: renamed from: a com.corrodinggames.rts.java.c
   public class_338 field_1819;
   // $FF: renamed from: b java.lang.String
   public String field_1820 = "#27";
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.utility.ab
   class_179 field_1821 = new class_179();
   // $FF: renamed from: d boolean
   boolean field_1822 = true;
   // $FF: renamed from: e boolean
   boolean field_1823 = false;
   // $FF: renamed from: f boolean
   boolean field_1824 = false;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.f.x
   public class_454 field_1825;
   // $FF: renamed from: h java.lang.String
   String field_1826 = null;
   // $FF: renamed from: i java.lang.String
   String field_1827 = null;
   // $FF: renamed from: j java.lang.String
   String field_1828 = null;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.f.c
   class_458 field_1829;
   // $FF: renamed from: l boolean
   boolean field_1830 = false;
   // $FF: renamed from: m int
   int field_1831;
   // $FF: renamed from: n int
   int field_1832;
   // $FF: renamed from: o boolean
   boolean field_1833;
   // $FF: renamed from: p int
   int field_1834;
   // $FF: renamed from: q int
   int field_1835;
   // $FF: renamed from: r boolean
   public boolean field_1836;
   // $FF: renamed from: s com.corrodinggames.rts.gameFramework.f.c
   class_458 field_1837;
   // $FF: renamed from: t com.corrodinggames.rts.java.v
   public class_332 field_1838;
   // $FF: renamed from: u com.corrodinggames.rts.java.a
   class_341 field_1839;
   // $FF: renamed from: v java.lang.String[]
   String[] field_1840;
   // $FF: renamed from: w com.corrodinggames.rts.java.Main
   static Main field_1841;
   // $FF: renamed from: x int
   int field_1842;
   // $FF: renamed from: y java.lang.Thread
   Thread field_1843;
   // $FF: renamed from: z java.lang.Thread
   Thread field_1844;
   // $FF: renamed from: A java.lang.Thread
   Thread field_1845;
   // $FF: renamed from: B long
   long field_1846 = System.nanoTime();
   // $FF: renamed from: C com.corrodinggames.librocket.a
   class_264 field_1847;
   // $FF: renamed from: D com.corrodinggames.rts.gameFramework.n
   class_329 field_1848 = new class_330(this);
   // $FF: renamed from: E java.lang.Thread
   Thread field_1849;
   // $FF: renamed from: F boolean
   boolean field_1850 = true;
   // $FF: renamed from: G java.lang.Object
   Object field_1851 = new Object();
   // $FF: renamed from: H java.util.concurrent.ConcurrentLinkedQueue
   public ConcurrentLinkedQueue field_1852 = new ConcurrentLinkedQueue();
   // $FF: renamed from: I boolean
   public boolean field_1853;
   // $FF: renamed from: J int
   public int field_1854;

   public static void main(String[] var0) {
      field_1841 = new Main();
      field_1841.method_1508(var0);
      Main$1 var1 = new Main$1();
      field_1841.field_1845 = new Thread(var1);
      field_1841.field_1845.setDaemon(true);
      field_1841.field_1845.start();
   }

   // $FF: renamed from: a (java.lang.String) void
   public static void method_1503(String var0) {
      class_236.method_1591(var0);
   }

   // $FF: renamed from: f () void
   public void method_1504() {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(System.in));

      while(this.field_1822) {
         try {
            String var2 = var1.readLine();
            if (var2 == null) {
               try {
                  Thread.sleep(200L);
               } catch (InterruptedException var5) {
                  var5.printStackTrace();
               }
            } else {
               this.method_1520((class_458)null, "ADMIN", var2, true);
            }
         } catch (IOException var7) {
            if (this.field_1842 < 3) {
               class_236.method_1591("Error while reading stdin: " + var7.toString());
               ++this.field_1842;
               if (this.field_1842 == 3) {
                  class_236.method_1591("Too many stdin errors, ignoring");
               }
            }

            try {
               Thread.sleep(700L);
            } catch (InterruptedException var6) {
               var6.printStackTrace();
            }
         }
      }

   }

   // $FF: renamed from: g () void
   public void method_1505() {
      if (!this.field_1830 && !this.field_1824) {
         this.field_1830 = true;
         this.field_1831 = 6000;
         this.field_1832 = 6000;
      }

   }

   // $FF: renamed from: h () void
   public void method_1506() {
      if (this.field_1830 && !this.field_1824) {
         this.field_1830 = false;
      }

   }

   // $FF: renamed from: i () void
   public void method_1507() {
      Semaphore var1 = new Semaphore(0);
      Thread var2 = new Thread(new Main$2(this, var1));
      var2.setDaemon(true);
      var2.start();

      try {
         var1.acquire();
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }

   // $FF: renamed from: a (java.lang.String[]) void
   public synchronized void method_1508(String[] var1) {
      this.field_1840 = var1;
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      Integer var7 = null;
      Integer var8 = null;
      class_236.method_1591("Reading args");
      String var9 = null;
      String var10 = null;

      int var11;
      String var12;
      for(var11 = 0; var11 < var1.length; ++var11) {
         var12 = var1[var11].trim().toLowerCase(Locale.ENGLISH);
         if (var9 != null) {
            if (var9.equals("+connect_lobby")) {
               method_1503("connect lobby:" + var12);
               class_236.field_1896 = var12;
               var9 = null;
            } else if (var9.equals("-width")) {
               var7 = Integer.parseInt(var12);
               var9 = null;
            } else if (var9.equals("-height")) {
               var8 = Integer.parseInt(var12);
               var9 = null;
            } else {
               method_1503("Unknown two_part_arg: " + var9);
               var9 = null;
            }
         } else {
            String var13;
            if (var12.equals("-debug")) {
               ++var11;
               if (var11 >= var1.length) {
                  method_1503("-debug requires parameters");
                  System.exit(1);
               }

               var13 = var1[var11];
               int var24 = Integer.parseInt(var13.split(":")[0]);
               String var15 = var13.split(":")[1];
               class_499.method_3223(var24, var15);
            } else if (var12.equals("-debugscript")) {
               ++var11;
               if (var11 >= var1.length) {
                  method_1503("-debug requires parameters");
                  System.exit(1);
               }

               var13 = var1[var11];
               class_499.method_3221(var13);
            } else if (var12.equals("-log")) {
               ++var11;
               if (var11 >= var1.length) {
                  method_1503("-log requires parameters");
                  System.exit(1);
               }

               var13 = var1[var11];

               try {
                  PrintStream var14 = new PrintStream(var13);
                  System.setOut(var14);
                  System.setErr(var14);
                  class_236.method_1591("File logging started");
               } catch (FileNotFoundException var20) {
                  class_236.method_1587("Cannot open log file:" + var13);
                  var20.printStackTrace();
               }
            } else if (var12.equals("-nodisplay")) {
               var2 = true;
            } else if (var12.equals("-noresources")) {
               class_236.field_1890 = true;
            } else if (var12.equals("-nosound")) {
               var3 = true;
            } else if (var12.equals("-nomusic")) {
               var4 = true;
            } else if (var12.equals("-allowsoftwarerender")) {
               var5 = true;
            } else if (var12.equals("-fullscreen")) {
               var6 = true;
            } else if (var12.equals("-nobackground")) {
               class_236.field_1889 = true;
            } else if (var12.equals("-nomods")) {
               class_236.field_1895 = true;
            } else if (var12.equals("-printunits")) {
               class_236.field_1891 = true;
            } else if (var12.equals("-oldreplays")) {
               class_236.field_1892 = true;
            } else if (var12.equals("-sandbox")) {
               class_236.field_1894 = true;
            } else if (var12.equals("-steam")) {
               class_236.field_1893 = true;
            } else if (!var12.equals("-width") && !var12.equals("-height")) {
               if (var12.startsWith("+")) {
                  if (var12.equals("+connect_lobby")) {
                     var9 = var12;
                  } else {
                     method_1503("Unknown steam option: " + var12);
                  }
               } else if (var12.trim().length() != 0) {
                  method_1503("Unknown option: " + var12);
                  var10 = "Unknown option: " + var12;
               }
            } else {
               var9 = var12;
            }
         }
      }

      class_236.method_1591("Game arguments:");

      for(var11 = 0; var11 < var1.length; ++var11) {
         var12 = var1[var11].trim().toLowerCase(Locale.ENGLISH);
         method_1503("arg: " + var12);
      }

      if (var10 != null) {
         if (class_236.field_1893) {
            method_1503("Unknown options but running anyway due to being in steam");
         } else {
            method_1503("Exiting due to unknown option: " + var10);
            System.exit(1);
         }
      }

      class_236.method_1649();
      class_236.method_1591("OS name: " + System.getProperty("os.name"));
      class_236.method_1591("OS version: " + System.getProperty("os.version"));
      class_236.method_1591("LWJGL version: " + Sys.getVersion());
      class_236.method_1591("Build Number: " + this.field_1820);
      class_236.method_1591("Game Version: 1.13");
      class_236.method_1591("Game Code: 123");
      class_236.method_1591("Is 64bit: " + Sys.is64Bit());
      class_236.method_1591("JVM maxMemory:" + Runtime.getRuntime().maxMemory());
      class_236.method_1591("JVM totalMemory:" + Runtime.getRuntime().totalMemory());
      class_236.method_1591("JVM freeMemory:" + Runtime.getRuntime().freeMemory());
      if (class_236.field_1893) {
         class_223.field_1776 = new class_224();
         class_236.method_1591("Early steam init");
         class_223.method_1462().method_1463();
         class_236.method_1591("Early steam init done.");
      } else {
         class_236.method_1591("steam not requested");
      }

      this.method_1507();
      String var22 = "Rusted Warfare";
      if (var2) {
         var22 = "";
      }

      Input.disableControllers();
      this.field_1838 = new class_332(var22);
      this.field_1838.field_2637 = this;
      this.field_1838.field_2644 = var2;
      this.field_1838.field_2645 = var3;
      this.field_1838.field_2646 = var4;
      DisplayMode var21 = Display.getDisplayMode();
      float var23 = (float)var21.getHeight();
      float var25 = (float)var21.getWidth();
      class_236.method_1591("screenHeight:" + var23);
      class_236.method_1591("screenWidth:" + var25);
      int var27 = 1000;
      int var16 = 733;
      if (var23 > 800.0F) {
         var27 = 1000;
         var16 = 800;
      }

      if (var23 > 900.0F) {
         var27 = 1600;
         var16 = 900;
      }

      if (var2) {
         var27 = 10;
         var16 = 10;
      }

      if (var7 != null) {
         class_236.method_1591("Overriding width to:" + var7);
         var27 = var7;
      }

      if (var8 != null) {
         class_236.method_1591("Overriding height to:" + var8);
         var16 = var8;
      }

      if (var5) {
         class_236.method_1591("allowSoftwareOpenGL is now on");
         System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
      }

      this.field_1838.field_2647 = false;
      boolean var17 = var6;

      try {
         if (this.field_1838.field_2647) {
            this.field_1838.method_2230(var27 * 2, var16 * 2);
            this.field_1839 = new class_341(new ScalableGame(this.field_1838, var27, var16), var27, var16, var17);
         } else {
            this.field_1839 = new class_341(this.field_1838, var27, var16, var17);
         }
      } catch (SlickException var19) {
         throw new RuntimeException(var19);
      }

      this.field_1838.field_2638 = this.field_1839;
      Display.setResizable(true);
      class_342 var26 = new class_342(this);
      this.field_1849 = new Thread(var26);
      this.field_1849.setDaemon(false);
      this.field_1849.start();
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_1509(String var1) {
      this.field_1848.method_2214(var1, true);
   }

   // $FF: renamed from: j () void
   public synchronized void method_1510() {
      this.method_1509("displayModes");
      this.method_1509("starting controllers");
      this.field_1846 = System.nanoTime();
      class_347 var1 = new class_347(this);
      this.field_1843 = new Thread(var1);
      this.field_1843.setDaemon(true);
      this.field_1843.start();
      class_236.field_1899 = true;
      class_236.field_1901 = true;
      if (!class_236.field_1890) {
         class_236.field_1900 = true;
         class_236.field_1906 = d.class;
      }

      if (this.field_1838 != null && this.field_1838.field_2645) {
         class_236.method_1588("Disabling sound with NullSoundFactory");
         class_525.field_4749 = new class_326();
         class_439.field_3678 = new class_312();
      } else {
         byte var2 = 20;
         OpenALAudio var3 = new OpenALAudio(var2, 9, 512);
         class_236.method_1591("openALAudio hasDevice:" + var3.hasDevice());
         class_525.field_4749 = new class_328(var3);
         if (this.field_1838.field_2646) {
            class_236.method_1591("Music disabled");
            class_439.field_3678 = new class_312();
         } else {
            class_439.field_3678 = new class_313(var3);
         }
      }

      class_444.field_3755 = new class_345();
      class_426.field_3575 = new class_334();
      long var10 = class_402.method_2522();
      this.method_1509("loading libRocket");
      class_236.method_1591("start libRocket setup");
      this.field_1847 = new class_264(this);
      this.field_1847.debug = false;
      this.field_1847.setup();
      this.method_1509("libRocket - fonts");
      this.field_1847.loadFont("font/Delicious-Roman.otf");
      this.field_1847.loadFont("font/Delicious-Italic.otf");
      this.field_1847.loadFont("font/Delicious-Bold.otf");
      this.field_1847.loadFont("font/Delicious-BoldItalic.otf");
      this.field_1847.loadFont("font/Roboto-Regular.ttf");
      this.field_1847.loadFont("font/Roboto-Bold.ttf");
      class_236.method_1591("NotoSansCJKsc start");
      this.field_1847.loadFont("font/NotoSansCJKsc-Regular.otf", "notoSans");
      this.field_1847.loadFont("font/DroidSansFallback.ttf", "fallback");
      class_236.method_1591("NotoSansCJKsc end");
      class_236.method_1591("end libRocket setup");
      this.method_1509("GuiEngine");
      this.field_1819 = new class_338();
      class_346 var4 = class_346.method_2276(field_1841, this.field_1847, this.field_1819);
      class_402.method_2525("libRocket setup took:", var10);
      class_236.field_2015 = this.field_1820;
      ServerContext var5 = new ServerContext();
      this.method_1509("GameEngine");
      class_236 var6 = class_236.method_1553(var5, this.field_1848);
      this.method_1509("GameEngine ready");
      class_236.method_1591("version: " + var6.method_1566() + " " + var6.method_1561(false) + ":" + this.field_1820);
      var6.method_1571();
      var4.method_2278();
      class_499.method_3222();
      this.field_1825 = var6.field_1944;
      var6.field_1937.showZoomButton = false;
      var6.field_1937.showUnitGroups = false;
      this.field_1838.method_2221(this.field_1819);
      this.field_1838.method_2230(1000, 800);
      class_343 var7 = new class_343(this);
      this.field_1844 = new Thread(var7);
      this.field_1844.setDaemon(true);
      this.field_1844.start();
      long var8 = System.nanoTime();
      class_236.method_1591("-----------------------------");
      class_236.method_1591("----- Game init finished in:" + (double)(var8 - this.field_1846) / 1000000.0D + " ms");
      var6.field_1944.field_3787 = this;
      var6.field_1944.field_3804 = "unset";
      if (!class_236.field_1889) {
         this.method_1515();
      }

   }

   // $FF: renamed from: c (java.lang.String) void
   public synchronized void method_1511(String var1) {
      this.method_1518(true);
      class_236 var2 = class_236.method_1549();
      this.field_1836 = false;
      boolean var4 = false;
      byte var5 = 8;
      byte var6 = 0;
      boolean var7 = true;
      boolean var8 = false;
      class_271.method_1888(var1, var4, var5, var6, var7, var8);
      this.method_1513();
   }

   // $FF: renamed from: a (boolean) void
   public synchronized void method_1512(boolean var1) {
      this.field_1836 = var1;
      this.method_1513();
   }

   // $FF: renamed from: k () void
   public synchronized void method_1513() {
      class_236 var1 = class_236.method_1549();
      if (var1 == null) {
         class_236.method_1588("Main::resumeGame(): game==null");
      } else {
         var1.field_1925 = true;
         var1.method_1559((Activity)null, this.field_1819, this.field_1836);
      }
   }

   // $FF: renamed from: b () void
   public void method_1499() {
      Main$3 var1 = new Main$3(this);
      this.field_1821.method_1252(var1);
   }

   // $FF: renamed from: a (float) void
   public void method_1514(float var1) {
      this.field_1821.method_1253();
   }

   // $FF: renamed from: l () void
   public synchronized void method_1515() {
      class_236 var1 = class_236.method_1549();
      var1.field_1937.nextBackgroundMap = 1;
      var1.field_1929 = true;
      var1.field_1884 = true;
      this.field_1836 = true;
      if (!class_236.field_1889) {
         var1.method_1572();
      }

      var1.field_1925 = true;
      var1.method_1559((Activity)null, this.field_1819, this.field_1836);
   }

   // $FF: renamed from: m () void
   public synchronized void method_1516() {
      if (!this.field_1823) {
         method_1503("Cannot start game: Server is not ready");
      } else if (this.field_1824) {
         method_1503("Cannot start game: already running");
      } else {
         this.field_1824 = true;
         class_236 var1 = class_236.method_1549();
         var1.field_1944.method_2945();
         boolean var2 = false;
         if (var2) {
            var1.field_1948.method_2651("replay_2015-09-12_03.04.15_Shore to Shore (6p)");
         } else if (var1.field_1944.field_3863.field_3775 == class_396.field_3239) {
            var1.field_1947.method_1991(var1.field_1944.field_3863.field_3776, true);
         } else {
            var1.method_1570(true, class_289.field_2445);
         }

         long var3 = System.nanoTime();
         class_236.method_1591("-----------------------------");
         class_236.method_1591("----- Game load finished in:" + (double)(var3 - this.field_1846) / 1000000.0D + " ms");
         var1.field_1925 = true;
         var1.method_1559((Activity)null, this.field_1819, this.field_1836);
      }
   }

   // $FF: renamed from: b (boolean) void
   public void method_1517(boolean var1) {
      this.field_1822 = false;
      this.field_1824 = false;
      this.field_1823 = false;
      class_236 var2 = class_236.method_1549();
      if (!var1) {
         var2.field_1944.method_2874();
      } else {
         var2.field_1944.method_2873("shutdownServer");
      }

      try {
         if (this.field_1843 != null) {
            this.field_1843.interrupt();
         }

         if (this.field_1844 != null) {
            this.field_1844.interrupt();
         }

         try {
            Thread.sleep(100L);
         } catch (InterruptedException var4) {
            var4.printStackTrace();
         }

         System.exit(0);
      } catch (SecurityException var5) {
         var5.printStackTrace();
      }

   }

   // $FF: renamed from: c (boolean) void
   public synchronized void method_1518(boolean var1) {
      if (!this.field_1824) {
         method_1503("endGame: Game not started, but ending anyway");
      }

      this.field_1824 = false;
      this.field_1823 = false;
      class_236 var2 = class_236.method_1549();
      if (!var1) {
         class_236.method_1591("endGame: queDisconnectAndWait");
         var2.field_1944.method_2874();
      } else {
         class_236.method_1591("endGame: network disconnect");
         var2.field_1944.method_2873("shutdownServer");
      }

   }

   Main() {
      this.field_1826 = "Java client";
      this.field_1828 = "";
      this.field_1828 = this.field_1828 + "---  Admin   --- \n";
      this.field_1828 = this.field_1828 + "-say <message> \n";
      this.field_1828 = this.field_1828 + "-players \n";
      this.field_1828 = this.field_1828 + "-end \n";
      this.field_1828 = this.field_1828 + "-stats \n";
      this.field_1828 = this.field_1828 + "--- End Admin --- \n";
      this.field_1827 = "";
      this.field_1827 = this.field_1827 + "=== HELP === \n";
      this.field_1827 = this.field_1827 + "-start : starts the game \n";
      this.field_1827 = this.field_1827 + "-resume : starts the game from last save \n";
      this.field_1827 = this.field_1827 + "-maps : List all maps loaded on this server \n";
      this.field_1827 = this.field_1827 + "-map <mapNumber> \n";
      this.field_1827 = this.field_1827 + "-give <slotId> : Give server control to this player \n";
      this.field_1827 = this.field_1827 + "-afk : Take server control from an idle player \n";
      this.field_1827 = this.field_1827 + "-who : Find out who is in control of this server \n";
      this.field_1827 = this.field_1827 + "-kick <slotId> <message> \n";
      this.field_1827 = this.field_1827 + "-addAI <slot> <team> \n";
      this.field_1827 = this.field_1827 + "-fog <off|basic|los> \n";
      this.field_1827 = this.field_1827 + "-move <from slotId> <to slotId> \n";
      this.field_1827 = this.field_1827 + "-team <slotId> <new TeamId> \n";
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, java.lang.String, java.lang.String) boolean
   public synchronized boolean method_1489(class_458 var1, String var2, String var3) {
      return true;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.c, java.lang.String, java.lang.String) void
   public synchronized void method_1490(class_458 var1, String var2, String var3) {
      this.method_1520(var1, var2, var3, false);
   }

   // $FF: renamed from: n () java.util.ArrayList
   public static ArrayList method_1519() {
      ArrayList var0 = new ArrayList();
      String[] var1 = class_236.method_1638("maps/skirmish", true);
      class_296.method_2068(var0, var1);
      return var0;
   }

   // $FF: renamed from: c () void
   public void method_1500() {
      class_236 var1 = class_236.method_1549();
      if (!var1.field_1944.field_3887) {
         ScriptEngine var2 = ScriptEngine.getInstance();
         if (var2 != null) {
            var2.addScriptToQueue("mp.refreshUI()");
         }
      }

   }

   // $FF: renamed from: a (int, java.lang.String, java.lang.String, com.corrodinggames.rts.gameFramework.f.c) void
   public synchronized void method_1491(int var1, String var2, String var3, class_458 var4) {
      if (this.field_1847 != null && this.field_1847.field_2314 != null) {
         this.field_1847.field_2314.addRunnableToQueue(new Main$4(this, var1, var2, var3, var4));
      } else {
         class_236.method_1594();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, java.lang.String, java.lang.String, boolean) void
   public synchronized void method_1520(class_458 var1, String var2, String var3, boolean var4) {
      if (!var4) {
         method_1503(var2 + ": " + var3);
      }

      if (!this.field_1850) {
         String var5 = null;
         String var6 = null;
         String[] var7 = null;
         String var8;
         if (var3.startsWith("-") && var3.length() >= 2) {
            var8 = var3.substring(1).trim();
            int var9 = var8.indexOf(" ");
            if (var9 == -1) {
               var9 = var8.length();
            }

            var5 = var8.substring(0, var9).toLowerCase(Locale.ENGLISH);
            if (var9 != -1 && var8.length() >= var9 + 1) {
               var6 = var8.substring(var9 + 1);
               var7 = var6.split(" ");
            }
         }

         if (this.field_1833 && this.field_1829 == var1) {
            this.field_1833 = false;
            this.method_1523("AFK Countdown stopped");
         }

         if (var5 != null) {
            if ("help".equals(var5)) {
               var8 = "";
               var8 = var8 + this.field_1827;
               if (!var4) {
                  this.method_1523(var8);
               } else {
                  var8 = this.field_1828 + var8;
                  method_1503(var8);
               }

            } else if ("stop".equals(var5)) {
               if (this.field_1824) {
                  this.method_1523("Cannot stop countdown, game already running");
               } else if (!this.field_1830) {
                  this.method_1523("Cannot stop countdown, game not starting");
               } else {
                  this.method_1506();
                  this.method_1523("Countdown stopped");
               }
            } else {
               int var10;
               Iterator var11;
               ArrayList var17;
               if (!"maps".equals(var5)) {
                  if ("who".equals(var5)) {
                     var8 = "No player";
                     if (this.field_1829 != null && this.field_1829.field_3937 != null) {
                        var8 = this.field_1829.field_3937.j;
                     }

                     this.method_1523("'" + var8 + "' is currently in control of this server");
                  } else if ("afk".equals(var5)) {
                     if (var4) {
                        method_1503("Players only");
                     } else if (this.field_1833) {
                        this.method_1523("AFK countdown already in progress");
                     } else if (this.field_1829 == var1) {
                        this.method_1523("You are already in control of this server");
                     } else {
                        this.field_1837 = var1;
                        this.field_1833 = true;
                        this.field_1834 = 30000;
                        this.field_1835 = this.field_1834;
                        var8 = "Controlling player";
                        if (this.field_1829 != null && this.field_1829.field_3937 != null) {
                           var8 = this.field_1829.field_3937.j;
                        }

                        this.method_1523("AFK timer started, '" + var8 + "' has 30 seconds to send any chat message");
                     }
                  } else if ("stats".equals(var5)) {
                     if (var4) {
                        var8 = "";
                        var8 = var8 + "Running:" + this.field_1824 + "\n";
                        class_236 var20 = class_236.method_1549();

                        for(var10 = 0; var10 < 10; ++var10) {
                           class_107 var23 = class_107.method_954(var10);
                           if (var23 != null) {
                              var8 = var8 + "Slot " + var10 + ": " + var23.field_1233 + "\n";
                           }
                        }

                        if (this.field_1824) {
                           var8 = var8 + "Game time:" + var20.field_1921 + "\n";
                           var8 = var8 + "Unit count:" + class_39.field_126.size() + "\n";
                        }

                        method_1503(var8);
                     }
                  } else if ("say".equals(var5)) {
                     if (var4) {
                        this.method_1523(var6);
                     }
                  } else if ("end".equals(var5)) {
                     if (var4) {
                        this.method_1518(false);
                     }
                  } else if ("shutdown".equals(var5)) {
                     if (var4) {
                        this.method_1517(false);
                     }
                  } else if ("start".equals(var5)) {
                     if (this.method_1522(var1, var2, var4)) {
                        if (this.field_1824) {
                           this.method_1523("Cannot start game, game already running");
                        } else {
                           var8 = "";
                           var8 = var8 + "Starting game..";
                           this.method_1523(var8);
                           this.method_1505();
                        }
                     }
                  } else if ("fog".equals(var5)) {
                     if (this.method_1522(var1, var2, var4)) {
                        if (this.field_1824) {
                           this.method_1523("Cannot change fog, game already running");
                        } else {
                           if ("off".equalsIgnoreCase(var6)) {
                              this.field_1825.field_3863.field_3778 = 0;
                           } else if ("basic".equalsIgnoreCase(var6)) {
                              this.field_1825.field_3863.field_3778 = 1;
                           } else {
                              if (!"los".equalsIgnoreCase(var6)) {
                                 this.method_1523("Unknown fog type:'" + var6 + "' options are: 'off', 'basic' or 'los'");
                                 return;
                              }

                              this.field_1825.field_3863.field_3778 = 2;
                           }

                           this.field_1825.method_2909();
                           this.method_1523("Fog type changed");
                        }
                     }
                  } else {
                     class_107 var15;
                     if ("kick".equals(var5)) {
                        if (this.method_1522(var1, var2, var4)) {
                           if (this.field_1824) {
                              this.method_1523("Cannot kick, game already running");
                           } else if (var6 == null) {
                              this.method_1523("-kick requires a slotId");
                           } else {
                              var15 = this.method_1521(var6);
                              if (var15 != null) {
                                 if (var1 == this.field_1829) {
                                    this.method_1523("You cannot kick yourself");
                                 } else {
                                    this.field_1825.method_2959(var15);
                                    this.method_1523("Player kicked");
                                 }
                              }
                           }
                        }
                     } else if ("move".equals(var5)) {
                        if (this.method_1522(var1, var2, var4)) {
                           if (this.field_1824) {
                              this.method_1523("Cannot move, game already running");
                           } else if (var7.length < 1) {
                              this.method_1523("-move requires a source slotId");
                           } else if (var7.length < 2) {
                              this.method_1523("-move requires a target slotId");
                           } else {
                              var15 = this.method_1521(var7[0]);
                              if (var15 != null) {
                                 this.method_1523("Player moved");
                              }
                           }
                        }
                     } else if ("team".equals(var5)) {
                        if (this.method_1522(var1, var2, var4)) {
                           if (this.field_1824) {
                              this.method_1523("Cannot change team, game already running");
                           } else {
                              this.method_1523("Player's team changed");
                           }
                        }
                     } else {
                        if ("addai".equals(var5)) {
                           this.field_1825.method_2960();
                        }

                        if ("map".equals(var5)) {
                           if (this.method_1522(var1, var2, var4)) {
                              if (var6 == null) {
                                 this.method_1523("-map requires a map number");
                              } else {
                                 var8 = null;

                                 Integer var16;
                                 try {
                                    var16 = Integer.valueOf(var6);
                                 } catch (NumberFormatException var14) {
                                    this.method_1523("-map requires a number");
                                    return;
                                 }

                                 var17 = method_1519();
                                 var16 = var16 - 1;
                                 if (var16 >= 0 && var16 < var17.size()) {
                                    String var21 = (String)var17.get(var16);
                                    String var22 = class_271.method_1887(var21);
                                    class_236 var25 = class_236.method_1549();
                                    this.field_1825.field_3863.field_3775 = class_396.field_3237;
                                    this.field_1825.field_3863.field_3776 = var21;
                                    if (this.field_1825.field_3863.field_3775 == class_396.field_3237) {
                                       this.field_1825.field_3864 = "maps/skirmish/" + this.field_1825.field_3863.field_3776;
                                    } else if (this.field_1825.field_3863.field_3775 == class_396.field_3238) {
                                       this.field_1825.field_3864 = "/SD/rusted_warfare_maps/" + this.field_1825.field_3863.field_3776;
                                    } else if (this.field_1825.field_3863.field_3775 == class_396.field_3239) {
                                       this.field_1825.field_3864 = null;
                                    }

                                    var25.field_2001 = var25.field_1944.field_3864;
                                    if (this.field_1825.field_3799) {
                                       class_444.method_2839();
                                    }

                                    this.field_1825.method_2904();
                                    this.method_1523("Level switched to '" + var22 + "'");
                                 } else {
                                    this.method_1523("Level number out of range");
                                 }
                              }
                           }
                        } else if ("give".equals(var5)) {
                           if (this.method_1522(var1, var2, var4)) {
                              if (var6 == null) {
                                 this.method_1523("-give requires a slotId");
                              } else {
                                 var15 = this.method_1521(var6);
                                 if (var15 != null) {
                                    if (!(var15 instanceof class_110)) {
                                       this.method_1523("'" + var15.field_1233 + "' is not a player");
                                    } else {
                                       class_110 var18 = (class_110)var15;
                                       class_458 var19 = null;
                                       var11 = this.field_1825.field_3877.iterator();

                                       while(var11.hasNext()) {
                                          class_458 var24 = (class_458)var11.next();
                                          if (var1.field_3932 && var1.method_2999() && var24.field_3937 == var18) {
                                             var19 = var24;
                                          }
                                       }

                                       if (var19 == null) {
                                          this.method_1523("Cannot find an active connection for: '" + var15.field_1233 + "'");
                                       } else {
                                          this.field_1829 = var19;
                                          this.method_1523("Control given to '" + var15.field_1233 + "'");
                                       }
                                    }
                                 }
                              }
                           }
                        } else {
                           if (!var4) {
                              if (var5 != null) {
                                 this.method_1523("Unknown command, type -help for a list of commands");
                              }
                           } else {
                              method_1503("Unknown command:" + var3);
                           }

                        }
                     }
                  }
               } else {
                  var8 = "Maps:\n";
                  var17 = method_1519();
                  var10 = 0;

                  String var13;
                  for(var11 = var17.iterator(); var11.hasNext(); var8 = var8 + "#" + var10 + ": " + var13 + "\n") {
                     String var12 = (String)var11.next();
                     ++var10;
                     var13 = class_271.method_1887(var12);
                  }

                  this.method_1523(var8);
               }
            }
         }
      }
   }

   // $FF: renamed from: d (java.lang.String) com.corrodinggames.rts.game.k
   public class_107 method_1521(String var1) {
      Integer var2 = null;

      try {
         var2 = Integer.valueOf(var1);
      } catch (NumberFormatException var4) {
         this.method_1523("slotId must be a number");
         return null;
      }

      if (var2 - 1 < 10 && var2 > 0) {
         class_107 var3 = class_107.method_954(var2 - 1);
         if (var3 == null) {
            this.method_1523("No player in that slot");
            return null;
         } else {
            return var3;
         }
      } else {
         this.method_1523("Slot out of range");
         return null;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, java.lang.String, boolean) boolean
   public boolean method_1522(class_458 var1, String var2, boolean var3) {
      if (var3) {
         return true;
      } else if (this.field_1829 != var1) {
         this.method_1523("'" + var2 + "' is not in control of this server. -afk and -give commands can be used to transfer control.");
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, java.lang.String) java.lang.String
   public String method_1492(class_458 var1, String var2) {
      return null;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.f.c, java.lang.String, java.lang.String) void
   public synchronized void method_1493(class_458 var1, String var2, String var3) {
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.c, java.lang.String) void
   public synchronized void method_1494(class_458 var1, String var2) {
   }

   // $FF: renamed from: e (java.lang.String) void
   public synchronized void method_1523(String var1) {
      this.method_1524(var1, (class_458)null);
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.f.c) void
   public synchronized void method_1524(String var1, class_458 var2) {
      String var3 = "all";
      if (var2 != null) {
         var3 = var2.toString();
         if (var2.field_3937 != null) {
            var3 = var2.field_3937.j;
         }
      }

      method_1503(var3 + ":" + var1);
      class_348 var4 = new class_348(this);
      var4.field_2746 = var1;
      var4.field_2747 = var2;
      synchronized(this.field_1851) {
         this.field_1852.add(var4);
         this.field_1851.notifyAll();
      }
   }

   // $FF: renamed from: a (int) void
   public void method_1525(int var1) {
      this.method_1526(var1);
      if (this.field_1830 && !this.field_1824) {
         this.field_1831 -= var1;
         if (this.field_1831 + 1000 < this.field_1832 && this.field_1832 > 0) {
            this.field_1832 -= 1000;
            this.method_1523("Game Starting " + this.field_1832 / 1000 + "...");
         }

         if (this.field_1831 <= -500) {
            this.field_1830 = false;
            this.method_1516();
         }
      }

   }

   // $FF: renamed from: b (int) void
   public synchronized void method_1526(int var1) {
      if (this.field_1833 && !this.field_1824) {
         this.field_1834 -= var1;
         String var2 = "Controlling player";
         if (this.field_1829 != null && this.field_1829.field_3937 != null) {
            var2 = this.field_1829.field_3937.j;
         }

         if (this.field_1837 == null || !this.field_1837.method_2999()) {
            this.method_1523("Requester left, AFK countdown stopped");
            this.field_1833 = false;
            return;
         }

         if (this.field_1834 < 20000 && this.field_1835 > 20000) {
            this.field_1835 = 20000;
            this.method_1523("'" + var2 + "' has 20 seconds to send any chat message");
         }

         if (this.field_1834 < 10000 && this.field_1835 > 10000) {
            this.field_1835 = 10000;
            this.method_1523("'" + var2 + "' has 10 seconds to send any chat message");
         }

         if (this.field_1834 < 0) {
            this.field_1833 = false;
            String var3 = "Requester";
            if (this.field_1837.field_3937 != null) {
               var3 = this.field_1837.field_3937.j;
            }

            this.field_1829 = this.field_1837;
            this.method_1523("'" + var2 + "' is afk, control switched to: '" + var3 + "'");
         }
      }

   }

   // $FF: renamed from: o () void
   public void method_1527() {
      class_236 var1 = class_236.method_1549();
      this.field_1838.method_2231();
   }

   // $FF: renamed from: e () void
   public void method_1502() {
      class_236 var1 = class_236.method_1549();
      if (!var1.field_1944.field_3887) {
         ScriptEngine var2 = ScriptEngine.getInstance();
         if (var2 != null) {
            var2.addScriptToQueue("mp.closeBattleroomIfOpen()");
         }
      }

   }

   // $FF: renamed from: d () void
   public void method_1501() {
      class_236 var1 = class_236.method_1549();
      ScriptEngine var2 = ScriptEngine.getInstance();
      if (var2 != null) {
         var2.addScriptToQueue("mp.askPassword()");
      }

   }
}
