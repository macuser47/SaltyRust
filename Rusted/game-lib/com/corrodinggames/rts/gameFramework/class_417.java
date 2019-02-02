package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.os.Environment;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_434;
import com.corrodinggames.rts.gameFramework.f.class_463;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.ax
public class class_417 {
   // $FF: renamed from: a java.lang.String
   String field_3432 = "/rustedWarfare/replays/";
   // $FF: renamed from: b boolean
   public static boolean field_3433 = true;
   // $FF: renamed from: c boolean
   public static boolean field_3434 = true;
   // $FF: renamed from: d boolean
   public static boolean field_3435 = true;
   // $FF: renamed from: e boolean
   public static boolean field_3436 = true;
   // $FF: renamed from: f int
   int field_3437;
   // $FF: renamed from: g int
   int field_3438;
   // $FF: renamed from: h boolean
   boolean field_3439;
   // $FF: renamed from: i int
   int field_3440;
   // $FF: renamed from: j boolean
   boolean field_3441;
   // $FF: renamed from: k boolean
   public boolean field_3442 = false;
   // $FF: renamed from: l int
   public int field_3443;
   // $FF: renamed from: m int
   public int field_3444;
   // $FF: renamed from: n int
   public int field_3445;
   // $FF: renamed from: o java.lang.String
   public String field_3446;
   // $FF: renamed from: p boolean
   boolean field_3447;
   // $FF: renamed from: M boolean
   private volatile boolean field_3448;
   // $FF: renamed from: q java.lang.String
   String field_3449;
   // $FF: renamed from: r boolean
   boolean field_3450;
   // $FF: renamed from: s int
   public int field_3451 = 1;
   // $FF: renamed from: t com.corrodinggames.rts.gameFramework.ba
   class_397 field_3452;
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.ba
   class_397 field_3453;
   // $FF: renamed from: v int
   int field_3454;
   // $FF: renamed from: w int
   int field_3455;
   // $FF: renamed from: x int
   int field_3456;
   // $FF: renamed from: y int
   int field_3457;
   // $FF: renamed from: z java.io.FileInputStream
   FileInputStream field_3458;
   // $FF: renamed from: A java.io.BufferedInputStream
   BufferedInputStream field_3459;
   // $FF: renamed from: B java.io.DataInputStream
   DataInputStream field_3460;
   // $FF: renamed from: C com.corrodinggames.rts.gameFramework.f.h
   class_463 field_3461;
   // $FF: renamed from: D java.io.FileOutputStream
   FileOutputStream field_3462;
   // $FF: renamed from: E java.io.BufferedOutputStream
   BufferedOutputStream field_3463;
   // $FF: renamed from: F java.io.DataOutputStream
   DataOutputStream field_3464;
   // $FF: renamed from: G com.corrodinggames.rts.gameFramework.f.af
   class_404 field_3465;
   // $FF: renamed from: H com.corrodinggames.rts.gameFramework.ay
   class_419 field_3466;
   // $FF: renamed from: I java.lang.Thread
   Thread field_3467;
   // $FF: renamed from: J java.lang.Object
   Object field_3468 = new Object();
   // $FF: renamed from: K boolean
   public boolean field_3469 = false;
   // $FF: renamed from: L boolean
   public boolean field_3470;

   // $FF: renamed from: a (java.lang.String, boolean) java.io.File
   public strictfp File method_2640(String var1, boolean var2) {
      String var3;
      if (!class_236.field_1899) {
         var3 = Environment.getExternalStorageDirectory() + this.field_3432;
      } else {
         var3 = "replays/";
      }

      File var4 = new File(var3 + var1);
      if (var2) {
         var4.getParentFile().mkdirs();
         if (!var4.canWrite()) {
         }
      }

      return var4;
   }

   // $FF: renamed from: a (android.content.Context) void
   public strictfp void method_2641(Context var1) {
   }

   // $FF: renamed from: a () void
   public strictfp void method_2642() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1916 != 0.0F) {
         var1.field_1916 = 0.0F;
      } else {
         var1.field_1916 = 1.0F;
      }

   }

   // $FF: renamed from: b () void
   public strictfp void method_2643() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1916 == 1.0F) {
         var1.field_1916 = 2.0F;
      } else if (var1.field_1916 == 2.0F) {
         var1.field_1916 = 4.0F;
      } else if (var1.field_1916 == 4.0F) {
         var1.field_1916 = 8.0F;
      } else if (var1.field_1916 == 8.0F) {
         var1.field_1916 = 16.0F;
      } else if (var1.field_1916 == 16.0F) {
         var1.field_1916 = 32.0F;
      } else if (var1.field_1916 == 32.0F) {
         var1.field_1916 = 64.0F;
      } else if (var1.field_1916 == 64.0F) {
         var1.field_1916 = 1.0F;
      } else {
         var1.field_1916 = 1.0F;
      }

   }

   // $FF: renamed from: a (int, java.lang.String, java.lang.String, int) void
   public strictfp void method_2644(int var1, String var2, String var3, int var4) {
      class_419 var5 = this.field_3466;
      if (this.field_3448 && !this.field_3450) {
         if (var3.startsWith("-t ")) {
         }

         class_397 var6 = new class_397();
         var6.field_3246 = var4;
         var6.field_3252 = new class_421();
         var6.field_3252.field_3512 = var1;
         var6.field_3252.field_3513 = var2;
         var6.field_3252.field_3514 = var3;
         if (var5 == null) {
            class_236.method_1595("Failed to record chat message, replay might have already stopped");
            return;
         }

         var5.method_2661(var6);
      }

   }

   // $FF: renamed from: a (byte[], int, int, int, float, float) void
   public strictfp void method_2645(byte[] var1, int var2, int var3, int var4, float var5, float var6) {
      class_419 var7 = this.field_3466;
      if (this.field_3448 && !this.field_3450) {
         class_397 var8 = new class_397();
         var8.field_3246 = var2;
         var8.field_3251 = var1;
         var8.field_3253 = var3;
         var8.field_3254 = var4;
         var8.field_3255 = var5;
         var8.field_3256 = var6;
         if (var7 == null) {
            class_236.method_1595("Failed to save resync, replay might have already stopped");
            return;
         }

         var7.method_2661(var8);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.e, int) void
   public strictfp void method_2646(class_324 var1, int var2) {
      class_419 var3 = this.field_3466;
      if (this.field_3448 && !this.field_3450) {
         if (var3 == null) {
            class_236.method_1595("Failed to record command, replay might have already stopped");
            return;
         }

         class_397 var4 = new class_397();
         var4.field_3250 = var1.method_2180();
         var4.field_3246 = var2;
         var3.method_2661(var4);
         ++this.field_3438;
         if (this.field_3438 > 5) {
            this.field_3438 = 0;
            class_236 var6 = class_236.method_1549();
            class_397 var5 = new class_397();
            var5.field_3248 = this.method_2649();
            var5.field_3246 = var6.field_1920;
            var3.method_2661(var5);
         }
      }

   }

   // $FF: renamed from: c () void
   public strictfp void method_2647() {
      if (this.field_3448 && !this.field_3450) {
         class_236 var1 = class_236.method_1549();
         class_397 var2 = new class_397();
         class_404 var3 = new class_404();

         try {
            var3.method_2539(0);
            var3.method_2541(var1.field_1944.field_3839.size());
            Iterator var4 = var1.field_1944.field_3839.iterator();

            while(var4.hasNext()) {
               class_434 var5 = (class_434)var4.next();
               var3.method_2543(var5.field_3657);
            }
         } catch (IOException var6) {
            throw new RuntimeException(var6);
         }

         var2.field_3249 = var3.method_2538();
         var2.field_3246 = var1.field_1920;
         this.field_3466.method_2661(var2);
      }

   }

   // $FF: renamed from: d () void
   public strictfp void method_2648() {
      synchronized(this.field_3468) {
         try {
            if (this.field_3466 != null) {
               this.field_3466.method_2662();

               try {
                  this.field_3467.join();
               } catch (InterruptedException var20) {
                  var20.printStackTrace();
               }

               this.field_3448 = false;
               this.field_3466 = null;
               this.field_3467 = null;
            }

            if (this.field_3462 != null) {
               this.field_3464.flush();
               this.field_3464.close();
               this.field_3463.flush();
               this.field_3463.close();
               this.field_3462.flush();
               this.field_3462.close();
            }
         } catch (IOException var21) {
            var21.printStackTrace();
         } finally {
            this.field_3462 = null;
            this.field_3463 = null;
            this.field_3464 = null;
            this.field_3465 = null;
         }

         this.field_3447 = false;
         this.field_3448 = false;
         this.field_3450 = false;
         this.field_3449 = null;
         this.field_3437 = 0;
         this.field_3438 = 0;
         this.field_3439 = false;
         this.field_3440 = 0;
         this.field_3441 = false;
         this.field_3454 = 0;
         this.field_3451 = 1;
         this.field_3455 = 0;
         this.field_3456 = 0;
         this.field_3457 = 0;
         this.field_3443 = -1;
         this.field_3444 = 0;
         this.field_3445 = -1;
         this.field_3446 = null;

         try {
            if (this.field_3458 != null) {
               this.field_3460.close();
               this.field_3459.close();
               this.field_3458.close();
            }
         } catch (IOException var18) {
            var18.printStackTrace();
         } finally {
            this.field_3458 = null;
            this.field_3459 = null;
            this.field_3460 = null;
            this.field_3461 = null;
         }

      }
   }

   // $FF: renamed from: e () long
   public strictfp long method_2649() {
      long var1 = 0L;
      Iterator var3 = class_34.field_79.iterator();

      while(var3.hasNext()) {
         class_34 var4 = (class_34)var3.next();
         if (var4 instanceof class_44) {
            class_44 var5 = (class_44)var4;
            var1 = (long)((float)var1 + var5.dh * 1000.0F);
            var1 = (long)((float)var1 + var5.di * 1000.0F);
            var1 = (long)((float)var1 + var5.bI * 1.0F);
            var1 += var5.da;
         }
      }

      return var1;
   }

   // $FF: renamed from: f () void
   public strictfp void method_2650() {
      if (!this.field_3469) {
         this.method_2648();
      }

   }

   // $FF: renamed from: a (java.lang.String) boolean
   public strictfp boolean method_2651(String var1) {
      File var2 = this.method_2640(var1, false);
      return this.method_2653(var1, var2);
   }

   // $FF: renamed from: i () void
   private strictfp void method_2652() {
      for(int var1 = 0; var1 < 10; ++var1) {
         class_107 var2 = class_107.method_954(var1);
         if (var2 != null && var2 instanceof class_112) {
            ((class_112)var2).field_1288 = true;
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, java.io.File) boolean
   public strictfp boolean method_2653(String var1, File var2) {
      if (this.field_3448) {
         if (this.field_3450) {
            class_236.method_1588("startReplayingFile: A replay is already playing");
         } else {
            class_236.method_1588("startReplayingFile: A replay is already saving");
         }
      }

      this.method_2648();
      class_236 var3 = class_236.method_1549();
      var3.method_1571();
      var3.field_1944.method_2869();
      this.field_3452 = null;
      this.field_3447 = false;
      this.field_3448 = true;
      this.field_3450 = true;
      this.field_3449 = var1;

      try {
         this.field_3458 = new FileInputStream(var2);
         this.field_3459 = new BufferedInputStream(this.field_3458);
         this.field_3460 = new DataInputStream(this.field_3459);
         this.field_3461 = new class_463(this.field_3460);
         String var4 = this.field_3461.method_3015();
         if (!var4.equals("rustedWarfareReplay")) {
            throw new IOException("Header is not correct:" + var4);
         } else {
            int var5 = this.field_3461.method_3011();
            int var6 = this.field_3461.method_3011();
            class_236.method_1592("gameSaver", "Loading save from version: " + var6);
            this.field_3461.method_3005(var6);
            String var7 = this.field_3461.method_3015();
            if ((var6 != 68 || var5 != var3.method_1561(true)) && !this.field_3442) {
               String var8 = "Cannot load replay: This replay was recording with a different version: " + var7;
               if (class_236.method_1654()) {
                  var8 = var8 + " (You can use the beta tab in steam to switch to old versions)";
               }

               var3.method_1608(var8, 1);
               class_236.method_1592("gameSaver", "Replay version: " + var6 + " (" + var5 + ")");
               class_236.method_1592("gameSaver", "GameSaver.thisSaveVersion: 68 (" + var3.method_1561(true) + ")");
               if (!class_236.field_1892) {
                  this.field_3448 = false;
                  return false;
               }
            }

            this.field_3445 = var6;
            this.field_3446 = var7;
            this.field_3461.method_3010();
            this.field_3461.method_3030("gamesave");
            this.field_3470 = false;
            this.field_3469 = true;
            class_236.method_1591("Loading replay initial save");
            var3.field_1947.method_1993(this.field_3461, false, false, false);
            this.field_3469 = false;
            this.field_3461.method_3036("gamesave");
            if (!this.field_3470) {
               class_236.method_1591("ReplayEngine: --- No game setup read ----");
               var3.field_1944.field_3863.field_3783 = true;
               var3.field_1924 = var3.field_1937.teamUnitCapHostedGame;
               var3.field_1923 = var3.field_1924;
            }

            this.method_2652();

            for(int var12 = 0; var12 < 10; ++var12) {
               class_107 var9 = class_107.method_954(var12);
               if (var9 != null && var9.field_1233 != null) {
                  String var10 = "Player '" + var9.field_1233 + "' playing as " + var9.method_947().toLowerCase() + " (team:" + var9.field_1231 + ")";
                  var3.field_1939.field_947.method_1196("", var10);
               }
            }

            return true;
         }
      } catch (IOException var11) {
         throw new RuntimeException(var11);
      }
   }

   // $FF: renamed from: a (boolean) void
   public strictfp void method_2654(boolean var1) {
      if (class_236.field_1900) {
         if (!class_236.field_1903) {
            return;
         }
      } else if (!class_236.field_1902) {
         return;
      }

      class_236 var2 = class_236.method_1549();
      if (var2.field_1944.field_3809 && !var1 && !this.field_3469 && var2.field_1937.saveMultiplayerReplays) {
         String var3 = var2.method_1644() + " [v" + var2.method_1566() + "] (" + class_296.method_2017("d MMM yyyy HH.mm.ss") + ").replay";
         this.method_2655(var3);
      }

   }

   // $FF: renamed from: b (java.lang.String) void
   public strictfp void method_2655(String var1) {
      class_236.method_1592("replay", "Recording replay to: " + var1);
      if (this.field_3448) {
         if (this.field_3450) {
            class_236.method_1588("startSaving: A replay is already playing");
         } else {
            class_236.method_1588("startSaving: A replay is already saving");
         }
      }

      this.method_2648();
      class_236 var2 = class_236.method_1549();
      this.field_3447 = false;
      this.field_3448 = true;
      this.field_3450 = false;
      this.field_3449 = var1;

      try {
         File var3 = this.method_2640(var1, true);
         this.field_3462 = new FileOutputStream(var3);
         this.field_3463 = new BufferedOutputStream(this.field_3462);
         this.field_3464 = new DataOutputStream(this.field_3463);
         this.field_3465 = new class_404(this.field_3464);
         this.field_3465.method_2545("rustedWarfareReplay");
         int var4 = var2.method_1561(true);
         this.field_3465.method_2541(var4);
         this.field_3465.method_2541(68);
         this.field_3465.method_2545(var2.method_1566());
         this.field_3465.method_2540(var2.field_1885);
         this.field_3465.method_2565("gamesave");
         var2.field_1947.method_1989(this.field_3465);
         this.field_3465.method_2567("gamesave");
         this.field_3464.flush();
         this.field_3466 = new class_419(this);
         this.field_3467 = new Thread(this.field_3466);
         this.field_3467.start();
      } catch (IOException var5) {
         class_236.method_1589("Failed to start recording replay", var5);
         class_236.method_1549().method_1607("Failed to start recording replay: " + var5.getMessage());
         this.method_2648();
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_2656(float var1) {
      class_236 var2 = class_236.method_1549();
      if (!this.field_3447) {
         if (this.field_3448 && this.field_3450) {
            while(true) {
               while(true) {
                  if (this.field_3452 == null) {
                     try {
                        String var3 = this.field_3461.method_3031();
                        class_397 var14;
                        if ("rc".equals(var3)) {
                           ++this.field_3454;
                           var14 = new class_397();
                           var14.field_3246 = this.field_3461.method_3011();
                           class_324 var17 = var2.field_1952.method_2158();
                           var17.method_2183(this.field_3461);
                           var17.field_2596 = true;
                           var14.field_3250 = var17;
                           this.field_3461.method_3036("rc");
                           this.field_3452 = var14;
                           ++this.field_3444;
                           this.field_3443 = var14.field_3246;
                           if (field_3434) {
                              class_236.method_1592("replay:updateGameFrame", "Command: " + var17.field_2601.field_1233 + " count:" + var17.method_2178() + " id:" + this.field_3454);
                              if (var17.field_2602 != null) {
                                 class_236.method_1592("replay:updateGameFrame", "Waypoint: " + var17.field_2602.method_3255().name());
                                 if (var17.field_2602.method_3251() != null) {
                                    class_236.method_1592("replay:updateGameFrame", "Build Type: " + var17.field_2602.method_3251().method_141());
                                 }
                              }

                              if (class_121.method_1039(var17.field_2603)) {
                                 class_236.method_1592("replay:updateGameFrame", "SpecialAction: " + var17.field_2603);
                              }

                              if (var17.field_2606 != null) {
                                 class_236.method_1592("replay:updateGameFrame", "SetAttackMode: " + var17.field_2606);
                              }

                              if (var17.field_2600) {
                                 class_236.method_1592("replay:updateGameFrame", "stopOrUndo is set");
                              }

                              if (var17.field_2611 && var17.field_2612 != 0.0F) {
                                 class_236.method_1592("replay:updateGameFrame", "changeStepRate:" + var17.field_2612);
                              }

                              class_236.method_1592("replay:updateGameFrame", "------");
                           }
                        } else if ("wait".equals(var3)) {
                           var14 = new class_397();
                           var14.field_3246 = this.field_3461.method_3011();
                           var14.field_3247 = true;
                           this.field_3452 = var14;
                           this.field_3461.method_3036("wait");
                        } else {
                           int var4;
                           if ("cs".equals(var3)) {
                              var4 = this.field_3461.method_3011();
                              long var16 = this.field_3461.method_3013();
                              if (!this.field_3442) {
                                 if (var2.field_1920 != var4) {
                                    class_236.method_1592("replay:updateGameFrame", "expected:" + var4 + " got:" + var2.field_1920);
                                 }

                                 if (this.method_2649() != var16) {
                                    class_236.method_1592("replay:updateGameFrame", "checksums don't match!!");
                                    class_236.method_1592("replay:updateGameFrame", "game frameNumber:" + var2.field_1920);
                                    class_236.method_1592("replay:updateGameFrame", "Replay checksum:" + var16);
                                    class_236.method_1592("replay:updateGameFrame", "Game checksum  :" + this.method_2649());
                                    ++this.field_3440;
                                    if (!this.field_3439) {
                                       this.field_3439 = true;
                                       var2.field_1939.field_947.method_1196("", "Error: This replay might be out of sync");
                                    }
                                 } else {
                                    class_236.method_1592("replay:updateGameFrame", "checksums are matching frameNumber:" + var2.field_1920);
                                 }
                              }

                              this.field_3461.method_3036("cs");
                           } else {
                              int var6;
                              if (!"es".equals(var3)) {
                                 if ("resync".equals(var3)) {
                                    var4 = this.field_3461.method_3011();
                                    class_236.method_1591("Loading resync from replay");
                                    if (var2.field_1920 != var4) {
                                       class_236.method_1592("replay:resync", "expected:" + var4 + " got:" + var2.field_1920);
                                    }

                                    int var15 = this.field_3461.method_3011();
                                    var6 = this.field_3461.method_3011();
                                    float var19 = this.field_3461.method_3012();
                                    float var20 = this.field_3461.method_3012();
                                    class_463 var21 = new class_463(this.field_3461.method_3025());
                                    var2.field_1947.method_1993(var21, true, true, true);
                                    this.method_2652();
                                    var2.field_1920 = var15;
                                    var2.field_1921 = var6;
                                    var2.field_1944.field_3815 = var19;
                                    var2.field_1944.field_3816 = var20;
                                    this.field_3461.method_3036("resync");
                                 } else if ("chat".equals(var3)) {
                                    var14 = new class_397();
                                    var14.field_3246 = this.field_3461.method_3011();
                                    var14.field_3252 = new class_421();
                                    var14.field_3252.field_3512 = this.field_3461.method_3011();
                                    var14.field_3252.field_3513 = this.field_3461.method_3014();
                                    var14.field_3252.field_3514 = this.field_3461.method_3014();
                                    this.field_3452 = var14;
                                    this.field_3461.method_3036("chat");
                                 } else {
                                    if ("end".equals(var3)) {
                                       class_236.method_1592("replay:updateGameFrame", "end of replay block found");
                                       var2.field_1939.field_947.method_1196("", "Replay has ended");
                                       this.field_3447 = true;
                                       var2.field_1916 = 0.25F;
                                       this.field_3461.method_3036("end");
                                       class_236.method_1591("number of replay commands issued:" + this.field_3455);
                                       return;
                                    }

                                    class_236.method_1592("updateGameFrame", "Unknown command block:" + var3);
                                 }
                              } else {
                                 var4 = this.field_3461.method_3011();
                                 if (!this.field_3442) {
                                    if (var2.field_1920 != var4) {
                                       class_236.method_1592("replay:updateGameFrame", "expected:" + var4 + " got:" + var2.field_1920);
                                    }

                                    class_236.method_1591("replay: -long checksum-");
                                    var2.field_1944.method_2893();
                                    class_463 var5 = new class_463(this.field_3461.method_3025());
                                    var5.method_3009();
                                    var6 = var5.method_3011();
                                    Iterator var7 = var2.field_1944.field_3839.iterator();

                                    while(var7.hasNext()) {
                                       class_434 var8 = (class_434)var7.next();
                                       long var9 = var5.method_3013();
                                       if (!this.field_3441 && var9 == var8.field_3657) {
                                          class_236.method_1591(var8.field_3656 + " Checksum match [" + var4 + "]. " + var9 + " == " + var8.field_3657);
                                       }

                                       if (var9 != var8.field_3657) {
                                          if (this.field_3440 < 100) {
                                             class_236.method_1591(var8.field_3656 + " Checksum [" + var4 + "]. Got:" + var9 + " expected:" + var8.field_3657);
                                          }

                                          ++this.field_3440;
                                       }
                                    }
                                 }

                                 this.field_3441 = true;
                                 this.field_3461.method_3036("es");
                              }
                           }
                        }
                     } catch (IOException var11) {
                        class_236.method_1592("updateGameFrame", "IOException, read of replay?");
                        var11.printStackTrace();
                        this.field_3448 = false;
                        return;
                     }
                  }

                  if (this.field_3452 != null) {
                     if (this.field_3442) {
                        this.field_3452 = null;
                        continue;
                     }

                     if (field_3433 && this.field_3452 != null && this.field_3453 != this.field_3452) {
                        this.field_3453 = this.field_3452;
                        class_236.method_1591("replay: upcoming in " + (this.field_3452.field_3246 - var2.field_1920) + " command:" + (this.field_3452.field_3250 != null));
                     }

                     if (this.field_3452.field_3247 && this.field_3455 == 0) {
                        class_236.method_1591("updateGameFrame: replay: Skipping wait on first resync without commands to avoid delay");
                        this.field_3452 = null;
                        continue;
                     }

                     if (var2.field_1920 >= this.field_3452.field_3246) {
                        if (this.field_3452.field_3250 != null) {
                           if (var2.field_1920 > this.field_3452.field_3246) {
                              class_236.method_1588("updateGameFrame: replay incorrect frameNumber, skipping command:" + var2.field_1920 + " vs " + this.field_3452.field_3246);
                           } else {
                              class_107 var12;
                              if (field_3435) {
                                 var12 = this.field_3452.field_3250.field_2609;
                                 if (var12 == null) {
                                    class_236.method_1591("Precommand Team: commandingPlayer==null");
                                 } else {
                                    class_236.method_1591("Precommand Team id:" + this.field_3452.field_3250.field_2609.field_1227 + " credits:" + this.field_3452.field_3250.field_2609.field_1229 + " count:" + this.field_3452.field_3250.field_2609.method_924() + " max:" + this.field_3452.field_3250.field_2609.method_925());
                                 }
                              }

                              this.field_3452.field_3250.method_2204();
                              if (field_3435) {
                                 var12 = this.field_3452.field_3250.field_2609;
                                 if (var12 != null) {
                                    class_236.method_1591("Postcommand credits:" + this.field_3452.field_3250.field_2609.field_1229 + " count:" + this.field_3452.field_3250.field_2609.method_924() + " max:" + this.field_3452.field_3250.field_2609.method_925());
                                 }
                              }

                              ++this.field_3455;
                           }
                        } else if (this.field_3452.field_3252 != null) {
                           class_421 var13 = this.field_3452.field_3252;
                           boolean var18 = false;
                           if (var13.field_3514 == null) {
                              var18 = true;
                           } else {
                              if (var13.field_3514.startsWith("-i ")) {
                                 var18 = true;
                              }

                              if (var13.field_3514.equals("<All players ready>")) {
                                 var18 = true;
                              }

                              if (var13.field_3514.equals("--too many desync errors, suppressing output--")) {
                                 var18 = true;
                              }

                              if (var13.field_3514.startsWith("desync:")) {
                                 var18 = true;
                              }
                           }

                           if (!var2.field_1937.replaysShowRecordedChat) {
                              var18 = true;
                           }

                           if (var18) {
                              class_236.method_1592("replay:updateGameFrame", "Skipping message: " + var13.field_3513 + ":" + var13.field_3514);
                           } else {
                              class_236.method_1592("replay:updateGameFrame", "message: " + var13.field_3513 + ":" + var13.field_3514);
                              var2.field_1939.field_947.method_1196(var13.field_3513, var13.field_3514);
                           }
                        } else if (this.field_3452.field_3247) {
                           if (field_3434) {
                           }
                        } else {
                           class_236.method_1592("updateGameFrame", "error: lastReadCommand null action");
                        }

                        this.field_3452 = null;
                        continue;
                     }
                  }

                  if (this.field_3452 != null) {
                     return;
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: g () boolean
   public strictfp boolean method_2657() {
      return this.field_3448;
   }

   // $FF: renamed from: h () boolean
   public strictfp boolean method_2658() {
      return this.field_3448 && this.field_3450;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.ax) boolean
   // $FF: synthetic method
   static boolean method_2659(class_417 var0) {
      return var0.field_3448;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.ax, boolean) boolean
   // $FF: synthetic method
   static boolean method_2660(class_417 var0, boolean var1) {
      return var0.field_3448 = var1;
   }
}
