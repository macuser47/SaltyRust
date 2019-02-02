package com.corrodinggames.rts.gameFramework;

import android.os.Environment;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_110;
import com.corrodinggames.rts.game.class_111;
import com.corrodinggames.rts.game.class_36;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.custom.class_362;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.gameFramework.b.class_35;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_406;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.i.class_33;
import com.corrodinggames.rts.gameFramework.utility.class_199;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.w
public class class_287 {
   // $FF: renamed from: a java.lang.String
   String field_2438 = "saves/";
   // $FF: renamed from: b java.lang.String
   static String field_2439 = "/rustedWarfare/";
   // $FF: renamed from: c boolean
   public static boolean field_2440 = false;
   // $FF: renamed from: d boolean
   final boolean field_2441;

   public strictfp class_287() {
      if (!class_236.field_1886) {
      }

      this.field_2441 = false;
   }

   // $FF: renamed from: a (java.lang.String, boolean) java.io.File
   public strictfp File method_1984(String var1, boolean var2) {
      return method_1986(var1, this.field_2438, var2);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   public static strictfp String method_1985(String var0, String var1) {
      String var2 = null;
      if (class_236.field_1899) {
         var2 = var1 + var0;
      } else {
         var2 = Environment.getExternalStorageDirectory() + field_2439 + var1 + var0;
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, boolean) java.io.File
   public static strictfp File method_1986(String var0, String var1, boolean var2) {
      String var3 = method_1985(var0, var1);
      File var4 = new File(var3);
      if (var2) {
         File var5 = var4.getParentFile();
         var5.mkdirs();
         if (!var5.isDirectory()) {
            class_236.method_1588("getRWFile: Could not create parent directory");
         }
      }

      return var4;
   }

   // $FF: renamed from: a (java.lang.String) void
   public strictfp void method_1987(String var1) {
      class_236 var2 = class_236.method_1549();

      try {
         InputStream var3 = class_408.method_2591(var2.method_1643());
         if (var3 == null) {
            class_236.method_1592("GameSaver", "No map to save");
            return;
         }

         File var4 = this.method_1984(var1 + ".map", true);
         FileOutputStream var5 = new FileOutputStream(var4);
         byte[] var6 = new byte[10000];

         for(int var7 = var3.read(var6); var7 != -1; var7 = var3.read(var6)) {
            var5.write(var6, 0, var7);
         }

         var3.close();
         var5.close();
      } catch (IOException var8) {
         class_236.method_1592("GameSaver", "Failed to save map");
         var8.printStackTrace();
         class_236.method_1549().method_1608("Failed to save map", 1);
      } catch (NullPointerException var9) {
         class_236.method_1592("GameSaver", "Failed to save map");
         var9.printStackTrace();
         class_236.method_1549().method_1608("Failed to save map", 1);
      }

   }

   // $FF: renamed from: b (java.lang.String) void
   public strictfp void method_1988(String var1) {
      class_236 var2 = class_236.method_1549();
      this.method_1987(var1);
      String var3 = "SD card";

      try {
         File var4 = this.method_1984(var1, true);
         var3 = var4.getAbsolutePath();
         FileOutputStream var20 = new FileOutputStream(var4);
         BufferedOutputStream var6 = new BufferedOutputStream(var20);
         if (!field_2440) {
            DataOutputStream var7 = new DataOutputStream(var6);
            class_404 var8 = new class_404(var7);

            try {
               this.method_1989(var8);
            } finally {
               var7.close();
               var6.close();
               var20.close();
            }
         } else {
            PrintStream var21 = new PrintStream(var6);
            class_406 var22 = new class_406(var21);

            try {
               this.method_1989(var22);
            } finally {
               var21.close();
               var6.close();
               var20.close();
            }

            class_236.method_1652("DEBUG plain text save created");
         }
      } catch (Exception var19) {
         var19.printStackTrace();
         String var5 = "Error saving game to " + var3 + ", please check permissions and email the logs.";
         var2.method_1608(var5, 1);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_1989(class_404 var1) {
      class_236 var2 = class_236.method_1549();
      long var3 = System.currentTimeMillis();
      class_236.method_1592("GameSaver", "saveCurrentMap took:" + (System.currentTimeMillis() - var3));
      long var5 = System.currentTimeMillis();

      try {
         var1.method_2545("rustedWarfareSave");
         int var7 = var2.method_1561(true);
         var1.method_2541(var7);
         var1.method_2541(68);
         var1.method_2540(var2.field_1885);
         var1.method_2566("saveCompression", true);
         var1.method_2565("customUnitsBlock");
         class_479.method_3130(var1);
         var1.method_2567("customUnitsBlock");
         var1.method_2565("gameSetup");
         var1.method_2540(var2.field_1944.field_3809);
         if (var2.field_1944.field_3809) {
            var2.field_1944.method_2848(var1);
         }

         var1.method_2567("gameSetup");
         var1.method_2545(var2.field_2001);
         var1.method_2541(var2.field_1921);
         var1.method_2542(var2.field_1967 + var2.field_1975);
         var1.method_2542(var2.field_1968 + var2.field_1976);
         var1.method_2542(var2.field_1986);
         var1.method_2541(var2.field_1942.field_14);
         var1.method_2541(0);
         var1.method_2562();
         var2.field_1932.method_2623(var1);
         var1.method_2540(var2.field_1951 != null);
         if (var2.field_1951 != null) {
            var2.field_1951.method_148(var1);
         }

         var1.method_2562();
         int var8 = -1;
         if (var2.field_1915 != null) {
            var8 = var2.field_1915.field_1227;
         }

         var1.method_2541(var8);
         var1.method_2541(10);

         int var9;
         class_107 var10;
         for(var9 = 0; var9 < 10; ++var9) {
            var10 = class_107.method_954(var9);
            var1.method_2540(var10 instanceof class_112);
            var1.method_2540(var10 instanceof class_111);
            var1.method_2540(var10 != null);
            if (var10 != null) {
               var10.method_911(var1);
            }
         }

         var2.field_1939.method_714();
         var1.method_2563("Section: unit shells");
         var1.method_2541(class_34.field_79.size());

         Iterator var13;
         class_34 var14;
         String var15;
         for(var13 = class_34.field_79.iterator(); var13.hasNext(); var1.method_2543(var14.field_67)) {
            var14 = (class_34)var13.next();
            if (var14 == null) {
               throw new RuntimeException("Found null in fastGameObjectList");
            }

            if (var14 instanceof class_39) {
               class_39 var11 = (class_39)var14;
               if (var11.method_295() instanceof class_469) {
                  var1.method_2539(1);
                  var1.method_2553((class_469)var11.method_295());
               } else {
                  if (!(var11.method_295() instanceof class_479)) {
                     throw new IOException("Unhandled getUnitType on save:" + var11.method_295().getClass().toString());
                  }

                  var1.method_2539(3);
                  var1.method_2545(((class_479)var11.method_295()).field_4204);
               }
            } else {
               var1.method_2539(2);
               if (var14 instanceof class_36) {
                  var1.method_2539(1);
               } else if (var14 instanceof class_97) {
                  var1.method_2539(2);
               } else {
                  if (!(var14 instanceof class_35)) {
                     var15 = null;
                     if (var14.getClass() != null) {
                        var15 = var14.getClass().toString();
                     }

                     throw new IOException("Unhandled class on save: " + var15);
                  }

                  var1.method_2539(3);
               }
            }
         }

         var1.method_2563("Section: CurrentUnitId");
         var1.method_2543(var2.field_1944.method_2881());
         var2.field_1942.method_148(var1);
         var2.field_1939.method_148(var1);
         var2.field_1945.method_2514(var1);

         for(var9 = 0; var9 < 10; ++var9) {
            var10 = class_107.method_954(var9);
            if (var10 != null) {
               var10.method_148(var1);
            }
         }

         var1.method_2562();
         var13 = class_34.field_79.iterator();

         while(var13.hasNext()) {
            var14 = (class_34)var13.next();
            if (var1.method_2564()) {
               var15 = var14.getClass().getSimpleName();
               if (var14 instanceof class_39) {
                  var15 = ((class_39)var14).method_295().method_141();
               }

               var1.method_2563("Saving unit:" + var15 + " (id" + var14.field_67 + ")");
            }

            var14.method_148(var1);
            var1.method_2562();
         }

         var1.method_2567("saveCompression");
         var1.method_2562();
         var1.method_2545("<SAVE END>");
      } catch (Exception var12) {
         var12.printStackTrace();
         var2.method_1608("Error saving game to SD card, please email the logs.", 1);
      }

      class_236.method_1592("GameSaver", "saveGame took:" + (System.currentTimeMillis() - var5));
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   public strictfp String method_1990(String var1) {
      if (var1 == null) {
         return null;
      } else if (var1.equals("maps/normal/l010;mission_1__-__Dividing_River.tmx")) {
         return "maps/normal/l010;[demo]mission_1__-__Dividing_River.tmx";
      } else {
         return var1.equals("maps/normal/l030;mission_3__-__Crossfire.tmx") ? "maps/normal/l030;[demo]mission_3__-__Crossfire.tmx" : var1;
      }
   }

   // $FF: renamed from: b (java.lang.String, boolean) boolean
   public strictfp boolean method_1991(String var1, boolean var2) {
      class_236 var3 = class_236.method_1549();

      try {
         File var4 = this.method_1984(var1, false);
         if (var4.isDirectory()) {
            var3.method_1608("Could not load, is a directory", 1);
            return false;
         } else {
            FileInputStream var5 = new FileInputStream(var4);
            BufferedInputStream var6 = new BufferedInputStream(var5);
            DataInputStream var7 = new DataInputStream(var6);
            class_463 var8 = new class_463(var7);

            boolean var9;
            try {
               var9 = this.method_1993(var8, var2, false, false);
            } finally {
               var7.close();
               var6.close();
               var5.close();
            }

            return var9;
         }
      } catch (Exception var14) {
         throw new RuntimeException(var14);
      }
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_1992(String var1, class_404 var2) {
      try {
         File var3 = this.method_1984(var1, false);
         var2.method_2557(var3);
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h, boolean, boolean, boolean) boolean
   public strictfp synchronized boolean method_1993(class_463 var1, boolean var2, boolean var3, boolean var4) {
      class_236 var5 = class_236.method_1549();

      try {
         class_402 var6 = var5.field_1950;
         if (this.field_2441) {
            var6.method_2526(class_192.field_1640);
         }

         String var7 = var1.method_3015();
         if (!var7.equals("rustedWarfareSave")) {
            throw new IOException("Header is not correct:" + var7.substring(0, Math.min(var7.length(), 50)));
         } else {
            var1.method_3011();
            int var8 = var1.method_3011();
            class_236.method_1592("gameSaver", "Loading save from version: " + var8);
            var1.method_3005(var8);
            if (var8 > 68) {
               var5.method_1608("Cannot load: This save was made with a newer game", 1);
               return false;
            } else {
               if (var8 >= 5) {
                  var1.method_3010();
               }

               if (var8 >= 23) {
                  var6.method_2526(class_192.field_1643);
                  var1.method_3032("saveCompression", true);
                  var6.method_2527(class_192.field_1643);
               }

               if (var8 >= 54) {
                  var1.method_3030("customUnitsBlock");
                  if (var5.field_1948.method_2658() && !var4) {
                     class_236.method_1591("Loading mods from replay");

                     try {
                        class_479.method_3134(var1);
                        class_479.method_3135();
                     } catch (class_362 var28) {
                        class_236.method_1591("Replay load: Missing unit:" + var28.getMessage() + " d:" + var28.a);
                        var5.method_1607(var28.getMessage() + ", this is likely to cause the replay to desync (reverting to default units & mods)");
                        class_479.method_3137(true);
                     }
                  }

                  var1.method_3036("customUnitsBlock");
               }

               Integer var9 = null;
               Integer var10 = null;
               if (var5.field_1948.method_2658() && var4) {
                  var9 = var5.field_1923;
                  var10 = var5.field_1924;
               }

               if (var8 >= 56) {
                  var1.method_3030("gameSetup");
                  boolean var11 = var1.method_3010();
                  if (var5.field_1948.method_2658() && !var4 && var11) {
                     var5.field_1948.field_3470 = true;
                     var5.field_1944.method_2849(var1);
                     var9 = var5.field_1923;
                     var10 = var5.field_1924;
                  }

                  var1.method_3036("gameSetup");
               }

               var5.field_2002 = null;
               var5.field_2001 = this.method_1990(var1.method_3015());
               if (var5.field_1944.field_3809 && !var5.field_1944.field_3810 && var4 && var5.field_1944.field_3866 != null) {
                  var5.field_2001 = "";
                  var5.field_2002 = var5.field_1944.field_3866;
               }

               var6.method_2526(class_192.field_1641);
               if (var4) {
                  var5.method_1569(true, true, class_289.field_2446);
                  var5.field_2011 = true;
               } else {
                  var5.method_1570(true, class_289.field_2446);
               }

               if (var9 != null) {
                  var5.field_1923 = var9;
               }

               if (var10 != null) {
                  var10 = var5.field_1924;
               }

               synchronized(var5) {
                  var6.method_2527(class_192.field_1641);
                  var5.field_1921 = var1.method_3011();
                  float var12 = var1.method_3012();
                  float var13 = var1.method_3012();
                  float var14 = var1.method_3012();
                  if (!var4) {
                     var5.method_1582(var12, var13);
                     var5.field_1986 = var14;
                  }

                  if (var8 >= 18) {
                     var5.field_1942.field_14 = var1.method_3011();
                  }

                  var1.method_3011();
                  if (var8 >= 19) {
                     var1.method_3028("end of setup");
                  }

                  var5.field_1932.method_2624(var1);
                  boolean var15 = var1.method_3010();
                  if (var15) {
                     if (var5.field_1951 == null) {
                        class_236.method_1592("gameSaver", "making new mission engine on load, this shouldn't happen");
                        var5.field_1951 = new class_33();
                        var5.field_1951.method_159();
                     }

                     var5.field_1951.method_155(var1);
                  }

                  if (var8 >= 19) {
                     var1.method_3028("start of teams");
                  }

                  class_236.method_1592("gameSaver", "loading teams");
                  class_107[] var16 = new class_107[10];
                  int var17 = -1;
                  if (var8 >= 36) {
                     var17 = var1.method_3011();
                  }

                  int var18 = 8;
                  int var19;
                  if (var8 >= 49) {
                     var18 = var1.method_3011();

                     for(var19 = 0; var19 < 10; ++var19) {
                        if (var19 >= var18) {
                           class_107 var20 = class_107.method_954(var19);
                           if (var20 != null) {
                              var20.method_936();
                           }
                        }
                     }
                  }

                  class_107 var24;
                  for(var19 = 0; var19 < var18; ++var19) {
                     Object var31 = class_107.method_954(var19);
                     boolean var21 = var1.method_3010();
                     boolean var22 = false;
                     if (var8 >= 7) {
                        var22 = var1.method_3010();
                     }

                     boolean var23 = var1.method_3010();
                     if (var23) {
                        if (var21) {
                           if (var31 == null || !(var31 instanceof class_112)) {
                              if (var2 && !var4 && var31 != null) {
                                 class_236.method_1588("Would replace team:" + var19 + " with AI, writing to dummy AI");
                                 var31 = new class_112(var19, false);
                                 var16[var19] = (class_107)var31;
                              } else {
                                 var31 = new class_112(var19);
                              }
                           }
                        } else if (var22) {
                           if (var31 == null || !(var31 instanceof class_111)) {
                              if (var2) {
                                 class_236.method_1588("Replacing team:" + var19 + " with NetworkedPlayer");
                              }

                              var31 = new class_111(var19);
                           }
                        } else if (var31 == null || !(var31 instanceof class_110)) {
                           if (var2) {
                              class_236.method_1588("Replacing team:" + var19 + " with Player");
                           }

                           var31 = new class_110(var19);
                        }

                        if (var8 >= 2) {
                           ((class_107)var31).method_912(var1);
                        } else {
                           ((class_107)var31).method_914(var1);
                        }
                     } else {
                        var24 = class_107.method_954(var19);
                        if (var24 != null) {
                           var24.method_936();
                        }
                     }
                  }

                  var5.field_1944.method_2961();
                  if (var5.field_1948.method_2658()) {
                     var5.field_1915 = class_107.field_1224;
                  } else if (var5.field_1944.field_3809) {
                     if (var5.field_1944.field_3806 != null) {
                        var19 = var5.field_1944.field_3806.field_1227;
                        if (var19 != -2) {
                           var5.field_1915 = class_107.method_954(var19);
                        }
                     }
                  } else if (var17 != -1 && var17 != -2) {
                     var5.field_1915 = class_107.method_954(var17);
                  } else {
                     for(var19 = 0; var19 < 10; ++var19) {
                        if (class_107.method_954(var19) instanceof class_110) {
                           var5.field_1915 = class_107.method_954(var19);
                        }
                     }
                  }

                  class_199 var32 = class_34.method_189();
                  Iterator var36 = var32.iterator();

                  while(var36.hasNext()) {
                     class_34 var33 = (class_34)var36.next();
                     var33.method_184();
                  }

                  boolean var34 = false;
                  int var37 = var1.method_3011();

                  int var35;
                  for(var35 = 0; var35 < var37; ++var35) {
                     Object var38 = null;
                     byte var40 = var1.method_3009();
                     if (var40 == 1) {
                        class_469 var43 = (class_469)var1.method_3022(ao.class);
                        var38 = var43.method_128();
                     } else if (var40 == 3) {
                        String var44 = var1.method_3015();
                        class_479 var25 = class_479.method_3171(var44);
                        if (var25 == null) {
                           String var26 = "Could not find custom unit:" + var44;
                           class_236.method_1591(var26);
                           if (!var34) {
                              var34 = true;
                              class_454.method_2887(var26);
                           }

                           var25 = class_479.field_4185;
                           if (var25 == null) {
                              throw new RuntimeException("Could not find custom unit:" + var44 + " and missingPlaceHolder is null");
                           }
                        }

                        class_24 var50 = class_479.method_3170(var25);
                        if (var50 != null) {
                           if (var50 instanceof class_479) {
                              var25 = (class_479)var50;
                           } else {
                              class_236.method_1588("replacement not a custom unit:" + var50.method_141());
                           }
                        }

                        var38 = var25.method_128();
                     } else {
                        if (var40 != 2) {
                           throw new IOException("Unhandled basic type on load:" + var40);
                        }

                        byte var46 = var1.method_3009();
                        if (var46 == 1) {
                           var38 = new class_36();
                        } else if (var46 == 2) {
                           var38 = new class_97();
                        } else {
                           if (var46 != 3) {
                              throw new IOException("Unhandled gameType on load:" + var46);
                           }

                           var38 = new class_35(var5.field_1938);
                        }
                     }

                     ((class_34)var38).field_67 = var1.method_3013();
                     class_34.method_190();
                  }

                  if (var8 >= 3) {
                     var5.field_1944.method_2882(var1.method_3013());
                  } else {
                     var5.field_1944.method_2882(100000L);
                  }

                  if (var8 >= 24) {
                     var5.field_1942.method_150(var1);
                  }

                  if (var8 >= 4) {
                     var5.field_1939.method_774(var1, var4);
                  }

                  if (var8 >= 57) {
                     var5.field_1945.method_2515(var1, var4);
                  }

                  if (var8 >= 7) {
                     for(var35 = 0; var35 < var18; ++var35) {
                        class_107 var47 = class_107.method_954(var35);
                        if (var16[var35] != null) {
                           var47 = var16[var35];
                        }

                        if (var47 != null) {
                           var47.method_914(var1);
                        }
                     }
                  } else if (var8 >= 2) {
                  }

                  if (var8 >= 10) {
                     var1.method_3028("Pre-unit data");
                  }

                  var6.method_2526(class_192.field_1642);
                  class_199 var39 = class_34.method_189();
                  Iterator var51 = var39.iterator();

                  while(var51.hasNext()) {
                     class_34 var41 = (class_34)var51.next();
                     var41.method_175(var1);
                     if (var8 >= 10) {
                        var1.method_3028("post unit: " + var41.getClass().toString() + " with id:" + var41.field_67);
                     }
                  }

                  var6.method_2527(class_192.field_1642);
                  if (var8 >= 23) {
                     var1.method_3036("saveCompression");
                  }

                  if (var8 >= 19) {
                     var1.method_3028("End of Save");
                     var1.method_3015();
                  }

                  int var52 = 0;
                  Iterator var42 = class_34.field_79.iterator();

                  while(var42.hasNext()) {
                     class_34 var48 = (class_34)var42.next();
                     Iterator var53 = class_34.field_79.iterator();

                     while(var53.hasNext()) {
                        class_34 var54 = (class_34)var53.next();
                        if (var48 != var54 && var48.field_67 == var54.field_67) {
                           ++var52;
                           var54.field_67 = var5.field_1944.method_2880();
                        }
                     }
                  }

                  class_236.method_1591("Unit.fastLiveUnitList before:" + class_39.field_126.size());
                  var42 = class_39.field_126.iterator();

                  while(var42.hasNext()) {
                     class_39 var49 = (class_39)var42.next();
                     if (var49.field_141) {
                        var42.remove();
                     }
                  }

                  class_236.method_1591("Unit.fastLiveUnitList after:" + class_39.field_126.size());
                  if (var52 > 0) {
                     if (var8 <= 2) {
                        var5.method_1608("Warning: " + var52 + " errors were found in this save, this is due to a bug in the old version", 1);
                     } else {
                        var5.method_1608("Warning: " + var52 + " errors were found in this save", 1);
                     }
                  }

                  var5.field_1941.method_1689((class_44)null);
                  var5.field_1941.method_1690();

                  for(int var45 = 0; var45 < 10; ++var45) {
                     var24 = class_107.method_954(var45);
                     if (var24 != null && var24 instanceof class_112) {
                        class_112 var55 = (class_112)var24;
                        var55.method_1003();
                     }
                  }

                  class_236.method_1591("--- Save file load complete ---");
                  class_236.method_1591("GameObject.fastGameObjectList:" + class_34.field_79.size());
                  class_236.method_1591("Unit.fastLiveUnitList:" + class_39.field_126.size());
                  if (!var4) {
                     var5.field_1948.method_2654(var4);
                  }

                  if (this.field_2441) {
                     var6.method_2527(class_192.field_1640);
                     var6.method_2532(true, true);
                  }

                  return true;
               }
            }
         }
      } catch (Exception var30) {
         throw new RuntimeException(var30);
      }
   }
}
