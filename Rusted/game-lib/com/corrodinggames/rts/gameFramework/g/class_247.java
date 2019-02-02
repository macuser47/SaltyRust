package com.corrodinggames.rts.gameFramework.g;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.util.Iterator;
import java.util.LinkedList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g.g
public final class class_247 implements Runnable {
   // $FF: renamed from: z com.corrodinggames.rts.gameFramework.g.d
   private final class_238 field_2182;
   // $FF: renamed from: a byte[][]
   public byte[][] field_2183;
   // $FF: renamed from: b byte[][]
   public byte[][] field_2184;
   // $FF: renamed from: c byte[][]
   public byte[][] field_2185;
   // $FF: renamed from: d short[][]
   public short[][] field_2186;
   // $FF: renamed from: e byte[][]
   public byte[][] field_2187;
   // $FF: renamed from: A com.corrodinggames.rts.gameFramework.g.c
   private class_242 field_2188;
   // $FF: renamed from: f short
   short field_2189;
   // $FF: renamed from: g short
   short field_2190;
   // $FF: renamed from: h int
   int field_2191 = 5;
   // $FF: renamed from: i int[][][]
   int[][][] field_2192;
   // $FF: renamed from: j byte[][][]
   byte[][][] field_2193;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.g.b
   class_240 field_2194;
   // $FF: renamed from: l com.corrodinggames.rts.gameFramework.g.e
   class_239 field_2195 = new class_239();
   // $FF: renamed from: m com.corrodinggames.rts.gameFramework.g.e
   class_239 field_2196 = new class_239();
   // $FF: renamed from: n com.corrodinggames.rts.gameFramework.g.h
   class_243 field_2197 = new class_243();
   // $FF: renamed from: o com.corrodinggames.rts.gameFramework.g.h
   class_243 field_2198 = new class_243();
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.g.h
   class_243 field_2199 = new class_243();
   // $FF: renamed from: q boolean
   volatile boolean field_2200 = true;
   // $FF: renamed from: r java.lang.Thread
   Thread field_2201;
   // $FF: renamed from: s java.lang.Object
   Object field_2202 = new Object();
   // $FF: renamed from: t com.corrodinggames.rts.gameFramework.g.h
   class_243 field_2203 = new class_243();
   // $FF: renamed from: u long
   long field_2204;
   // $FF: renamed from: v long
   long field_2205;
   // $FF: renamed from: w java.lang.Object
   Object field_2206 = new Object();
   // $FF: renamed from: x boolean
   boolean field_2207;
   // $FF: renamed from: y android.graphics.Paint
   Paint field_2208 = new Paint();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.c) void
   public strictfp void method_1765(class_242 var1) {
      if (!this.field_2200) {
         throw new RuntimeException("setupNewPath: last path not yet finished");
      } else {
         this.field_2200 = false;
         this.method_1772(var1.field_2155, var1);
         var1.field_2162 = true;
         this.field_2188 = var1;
      }
   }

   // $FF: renamed from: a () void
   public strictfp void method_1766() {
      if (this.field_2201 == null) {
         throw new RuntimeException("thread==null");
      } else {
         synchronized(this.field_2202) {
            this.field_2202.notifyAll();
         }
      }
   }

   public strictfp void run() {
      class_236.method_1649();

      while(true) {
         synchronized(this.field_2202) {
            if (this.field_2188 == null) {
               try {
                  this.field_2202.wait();
               } catch (InterruptedException var4) {
                  var4.printStackTrace();
               }
            }
         }

         if (this.field_2188 != null) {
            this.method_1767();
         }
      }
   }

   // $FF: renamed from: b () void
   public strictfp void method_1767() {
      LinkedList var1 = this.method_1777();
      synchronized(this.field_2182.field_2119) {
         this.field_2188.method_1738();
         this.field_2183 = (byte[][])null;
         this.field_2184 = (byte[][])null;
         this.field_2185 = (byte[][])null;
         this.field_2186 = (short[][])null;
         this.field_2187 = (byte[][])null;
         this.field_2188.method_1743(var1);
         this.field_2188 = null;
         this.field_2200 = true;
         this.field_2182.field_2119.notifyAll();
      }
   }

   strictfp class_247(class_238 var1) {
      this.field_2182 = var1;
   }

   // $FF: renamed from: c () void
   public strictfp synchronized void method_1768() {
      if (this.field_2201 != null) {
         throw new RuntimeException("thread!=null");
      } else {
         this.field_2201 = new Thread(this);
         this.field_2201.setPriority(10);
         this.field_2201.setDaemon(true);
         this.field_2201.start();
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b) void
   public strictfp void method_1769(class_408 var1) {
      this.field_2189 = var1.field_3337.field_3563;
      this.field_2190 = var1.field_3337.field_3564;
      this.field_2192 = new int[2][this.field_2189][this.field_2190];
      this.field_2193 = new byte[2][this.field_2189][this.field_2190];
      this.method_1770();
   }

   // $FF: renamed from: d () void
   public strictfp void method_1770() {
      int var1 = this.field_2189 * this.field_2190 * 42 + 1;
      this.field_2191 += var1;
      boolean var2 = false;
      if (this.field_2191 > Integer.MAX_VALUE - var1 || this.field_2191 < 0 || var2) {
         this.field_2191 = 5;

         for(int var3 = 0; var3 < 2; ++var3) {
            for(int var4 = 0; var4 < this.field_2189; ++var4) {
               for(int var5 = 0; var5 < this.field_2190; ++var5) {
                  this.field_2192[var3][var4][var5] = -1;
               }
            }
         }
      }

   }

   // $FF: renamed from: a (int, int) int
   public final strictfp int method_1771(int var1, int var2) {
      return this.field_2183[var1][var2] != -1 && this.field_2184[var1][var2] != -1 && this.field_2185[var1][var2] != -1 ? this.field_2183[var1][var2] + this.field_2184[var1][var2] + this.field_2185[var1][var2] * 10 : -1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, com.corrodinggames.rts.gameFramework.g.c) void
   public strictfp void method_1772(class_503 var1, class_242 var2) {
      if (var1 == null) {
         throw new RuntimeException("MovementType is null");
      } else {
         class_240 var3 = this.field_2182.method_1681(var1);
         if (var3 == null) {
            throw new RuntimeException("Could not get costs for:" + var1.toString());
         } else {
            this.field_2194 = var3;
            this.field_2183 = var2.field_2165;
            this.field_2184 = var2.field_2166;
            this.field_2185 = var2.field_2167;
            this.field_2186 = var2.field_2168;
            this.field_2187 = var2.field_2169;
            if (this.field_2183 == null) {
               throw new RuntimeException("linkToPath failed mapCosts_mapCosts is null");
            } else if (this.field_2184 == null) {
               throw new RuntimeException("linkToPath failed mapCosts_buildingCosts is null");
            } else if (this.field_2185 == null) {
               throw new RuntimeException("linkToPath failed mapCosts_objectCosts is null");
            }
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, short, short, java.lang.Float) void
   public strictfp void method_1773(class_503 var1, short var2, short var3, Float var4) {
      if (class_238.field_2093) {
         Log.method_1712("RustedWarfare", "path start is:" + var2 + "," + var3);
      }

      class_243 var5 = new class_243(var2, var3);
      var5.method_1751(this, (byte)0, this.field_2191);
      if (var4 == null) {
         var5.method_1757(this, (byte)0, (byte)0);
         var5.method_1756(this, (byte)0, true);
      } else {
         var5.method_1758(this, (byte)0, var4);
         var5.method_1756(this, (byte)0, true);
      }

      var5.method_1752(this, (byte)0, false);
   }

   // $FF: renamed from: a (short, short, short) void
   public strictfp void method_1774(short var1, short var2, short var3) {
      if (class_238.field_2093) {
         Log.method_1712("RustedWarfare", "path end is:" + var1 + "," + var2 + " size:" + var3);
      }

      class_243 var4 = new class_243(var1, var2);
      var4.method_1757(this, (byte)1, (byte)0);
      var4.method_1756(this, (byte)1, true);
      var4.method_1751(this, (byte)1, this.field_2191);
      var4.method_1752(this, (byte)1, false);
   }

   // $FF: renamed from: b (int, int) int
   static strictfp int method_1775(int var0, int var1) {
      if (var0 == var1) {
         return 0;
      } else {
         int var2 = Math.abs(var0 - var1);
         if (var2 > 4) {
            var2 = 8 - var2;
         }

         if (var2 == 1) {
            return 4;
         } else {
            return var2 == 2 ? 21 : 25;
         }
      }
   }

   // $FF: renamed from: c (int, int) int
   static strictfp int method_1776(int var0, int var1) {
      if (var0 == var1) {
         return 0;
      } else {
         int var2 = Math.abs(var0 - var1);
         if (var2 > 4) {
            var2 = 8 - var2;
         }

         if (var2 == 1) {
            return 4;
         } else if (var2 == 2) {
            return 21;
         } else if (var2 == 3) {
            return 4;
         } else if (var2 == 4) {
            return 0;
         } else {
            return var2 == 5 ? 0 : 25;
         }
      }
   }

   // $FF: renamed from: e () java.util.LinkedList
   public strictfp LinkedList method_1777() {
      if (class_238.field_2101 && !class_236.method_1549().field_1929) {
         Debug.startMethodTracing("pathTrace", 110000000);
      }

      int var1 = this.field_2188.field_2156 ? 2 : 1;
      int var2 = this.field_2188.field_2157;
      if (class_238.field_2093) {
         Log.method_1712("RustedWarfare", "starting path for:" + this.field_2194.field_2129.toString());
      }

      this.field_2204 = class_236.method_1596();
      short var3 = this.field_2188.field_2148;
      short var4 = this.field_2188.field_2149;
      boolean var5 = this.field_2188.field_2151;
      this.method_1770();
      this.method_1773(this.field_2188.field_2155, this.field_2188.field_2148, this.field_2188.field_2149, this.field_2188.field_2150);
      short var6 = this.field_2188.field_2152;
      short var7 = this.field_2188.field_2153;
      short var8 = this.field_2188.field_2154;
      LinkedList var9 = new LinkedList();
      if (var3 == var6 && var4 == var7) {
         if (class_238.field_2093) {
            Log.method_1712("RustedWarfare", "no point pathing when start=end");
         }

         var9.clear();
         var9.add(new class_243(var6, var7));
         return var9;
      } else if (this.field_2194.field_2129.equals(class_503.field_4617)) {
         if (class_238.field_2093) {
            Log.method_1712("RustedWarfare", "no point pathing for none");
         }

         var9.clear();
         return var9;
      } else {
         int var10 = 0;
         short var11 = var6;
         short var12 = var7;
         short var13 = var8;
         short var15;
         short var17;
         short var18;
         if (this.field_2186 != null) {
            short[][] var14 = this.field_2186;
            var15 = var14[var3][var4];
            boolean var16 = true;
            if (var15 == -1) {
               var16 = false;
            } else {
               for(var17 = (short)(var6 - var8); var17 <= var6 + var8; ++var17) {
                  for(var18 = (short)(var7 - var8); var18 <= var7 + var8; ++var18) {
                     if (var17 >= 0 && var17 < this.field_2189 && var18 >= 0 && var18 < this.field_2190 && var15 == var14[var17][var18]) {
                        var16 = false;
                     }
                  }
               }
            }

            if (var16) {
               if (class_238.field_2093) {
                  Log.method_1712("RustedWarfare", "end is blocked on isolated groups");
               }

               var17 = var6;
               var18 = var7;
               float var19 = -1.0F;

               short var20;
               short var21;
               float var22;
               for(var20 = (short)(var6 - 25); var20 <= var6 + 25; ++var20) {
                  for(var21 = (short)(var7 - 25); var21 <= var7 + 25; ++var21) {
                     if (var20 >= 0 && var20 < this.field_2189 && var21 >= 0 && var21 < this.field_2190 && (var15 == var14[var20][var21] || var14[var20][var21] == 0)) {
                        var22 = class_296.method_2026((float)var20, (float)var21, (float)var6, (float)var7);
                        if (var19 == -1.0F || var22 < var19) {
                           var19 = var22;
                           var17 = var20;
                           var18 = var21;
                           var13 = 0;
                        }
                     }
                  }
               }

               if (var19 == -1.0F) {
                  for(var20 = 0; var20 < this.field_2189; ++var20) {
                     for(var21 = 0; var21 < this.field_2190; ++var21) {
                        if (var15 == var14[var20][var21] || var14[var20][var21] == 0) {
                           var22 = class_296.method_2026((float)var20, (float)var21, (float)var6, (float)var7);
                           if (var19 == -1.0F || var22 < var19) {
                              var19 = var22;
                              var17 = var20;
                              var18 = var21;
                              var13 = 0;
                           }
                        }
                     }
                  }
               }

               var11 = var17;
               var12 = var18;
               if (class_238.field_2093) {
                  long var45 = System.currentTimeMillis() - this.field_2204;
                  Log.method_1712("RustedWarfare", "fakeNode search was:" + var45);
               }
            }
         }

         boolean var39 = true;

         short var41;
         label516:
         for(var15 = (short)(var11 - var13); var15 <= var11 + var13; ++var15) {
            for(var41 = (short)(var12 - var13); var41 <= var12 + var13; ++var41) {
               if (var15 >= 0 && var15 < this.field_2189 && var41 >= 0 && var41 < this.field_2190 && this.method_1771(var15, var41) != -1) {
                  var39 = false;
                  break label516;
               }
            }
         }

         short var43;
         if (var39) {
            var15 = var11;
            var41 = var12;
            float var42 = -1.0F;
            if (class_238.field_2093) {
               Log.method_1712("RustedWarfare", "end is blocked on non isolated groups");
            }

            float var46;
            for(var18 = (short)(var11 - 9); var18 <= var11 + 9; ++var18) {
               for(var43 = (short)(var12 - 9); var43 <= var12 + 9; ++var43) {
                  if (var18 >= 0 && var18 < this.field_2189 && var43 >= 0 && var43 < this.field_2190 && this.method_1771(var18, var43) != -1) {
                     var46 = class_296.method_2026((float)var18, (float)var43, (float)var11, (float)var12);
                     if (var42 == -1.0F || var46 < var42) {
                        var42 = var46;
                        var15 = var18;
                        var41 = var43;
                        var13 = 0;
                     }
                  }
               }
            }

            if (var42 == -1.0F) {
               for(var18 = 0; var18 < this.field_2189; ++var18) {
                  for(var43 = 0; var43 < this.field_2190; ++var43) {
                     if (this.method_1771(var18, var43) != -1) {
                        var46 = class_296.method_2026((float)var18, (float)var43, (float)var11, (float)var12);
                        if (var42 == -1.0F || var46 < var42) {
                           var42 = var46;
                           var15 = var18;
                           var41 = var43;
                           var13 = 0;
                        }
                     }
                  }
               }
            }

            var11 = var15;
            var12 = var41;
            if (class_238.field_2093) {
               long var44 = System.currentTimeMillis() - this.field_2204;
               Log.method_1712("RustedWarfare", "fakeNode search was:" + var44);
            }
         }

         if (class_238.field_2093 && (var11 != var6 || var12 != var7)) {
            Log.method_1712("RustedWarfare", "Moved end to fakeEndX:" + var11 + " fakeEndY:" + var12);
         }

         this.field_2195.method_1722(var11, var12);
         this.field_2195.method_1723(0, var3, var4);
         this.field_2196.method_1722(var3, var4);
         this.method_1774(var11, var12, var13);
         this.field_2196.method_1723(0, var11, var12);
         var39 = false;
         boolean var40 = false;
         var41 = -1;
         var17 = -1;
         var18 = -1;
         var43 = -1;
         int var47 = 400;
         int var48 = 0;

         label445:
         while(true) {
            if (!var39) {
               ++var48;
               if (this.field_2188.field_2163) {
                  var9.clear();
                  return var9;
               }

               ++var10;
               if (var47 > 0) {
                  --var47;
               } else {
                  var40 = !var40;
               }

               byte var49 = 0;
               if (var40) {
                  var49 = 1;
               }

               if (class_238.field_2097) {
                  this.method_1780();
               }

               class_239 var24;
               if (!var40) {
                  var24 = this.field_2195;
               } else {
                  var24 = this.field_2196;
               }

               class_245 var25 = var24.method_1724();
               if (var25 == null) {
                  if (var40) {
                     continue;
                  }

                  if (class_238.field_2093) {
                     Log.method_1712("RustedWarfare", "listNode==null for normal side ending path");
                  }
               } else {
                  class_243 var23 = this.field_2197.method_1748(var25);
                  int var26 = var23.method_1750(this, var49);
                  byte var27 = var23.method_1754(this, var49);
                  boolean var28 = var23.method_1755(this, var49);
                  boolean var29 = false;
                  if (!var40) {
                     if (var23.field_2170 == var11 && var23.field_2171 == var12) {
                        if (class_238.field_2093) {
                           Log.method_1712("RustedWarfare", "Over goal: fakeEnd");
                        }

                        var29 = true;
                     }

                     if (class_296.method_2043(var23.field_2170 - var6) <= var8 && class_296.method_2043(var23.field_2171 - var7) <= var8) {
                        if (class_238.field_2093) {
                           Log.method_1712("RustedWarfare", "Over goal: real end");
                        }

                        var29 = true;
                     }
                  }

                  boolean var30 = var23.method_1753(this, (byte)(1 - var49));
                  if (!var30 && !var29) {
                     var23.method_1752(this, var49, true);
                     boolean var59 = false;
                     boolean var32 = true;
                     byte var60;
                     byte var61;
                     if (var28) {
                        var60 = 0;
                        var61 = 7;
                     } else {
                        var60 = (byte)(var27 - 2);
                        var61 = (byte)(var27 + 2);
                     }

                     byte var33 = var60;

                     while(true) {
                        if (var33 > var61) {
                           continue label445;
                        }

                        this.field_2198.method_1747(var23);
                        byte var34 = var33;
                        if (var33 > 7) {
                           var34 = (byte)(var33 - 8);
                        }

                        if (var34 < 0) {
                           var34 = (byte)(var34 + 8);
                        }

                        if (var34 == 0) {
                           ++this.field_2198.field_2170;
                        }

                        if (var34 == 1) {
                           ++this.field_2198.field_2170;
                           ++this.field_2198.field_2171;
                        }

                        if (var34 == 2) {
                           ++this.field_2198.field_2171;
                        }

                        if (var34 == 3) {
                           ++this.field_2198.field_2171;
                           --this.field_2198.field_2170;
                        }

                        if (var34 == 4) {
                           --this.field_2198.field_2170;
                        }

                        if (var34 == 5) {
                           --this.field_2198.field_2170;
                           --this.field_2198.field_2171;
                        }

                        if (var34 == 6) {
                           --this.field_2198.field_2171;
                        }

                        if (var34 == 7) {
                           --this.field_2198.field_2171;
                           ++this.field_2198.field_2170;
                        }

                        if (this.field_2198.field_2170 >= 0 && this.field_2198.field_2170 < this.field_2189 && this.field_2198.field_2171 >= 0 && this.field_2198.field_2171 < this.field_2190) {
                           int var35 = this.field_2198.method_1749(this);
                           if (var35 != -1) {
                              int var36 = this.field_2198.method_1750(this, var49);
                              if (!this.field_2198.method_1753(this, var49)) {
                                 label659: {
                                    int var37;
                                    if (this.field_2198.field_2170 != var23.field_2170 && this.field_2198.field_2171 != var23.field_2171) {
                                       if (this.method_1771(this.field_2198.field_2170, var23.field_2171) == -1 || this.method_1771(var23.field_2170, this.field_2198.field_2171) == -1) {
                                          break label659;
                                       }

                                       var37 = var26 + 14 + var35 + 1;
                                    } else {
                                       var37 = var26 + 10 + var35 + 1;
                                    }

                                    if (var27 != var34) {
                                       if (!var28) {
                                          var37 += method_1775(var27, var34);
                                       } else if (!var40) {
                                          if (var5) {
                                             var37 += method_1776(var27, var34);
                                          } else {
                                             var37 += method_1775(var27, var34);
                                          }
                                       }
                                    }

                                    if (this.field_2187 != null) {
                                       var37 += (4 - this.field_2187[this.field_2198.field_2170][this.field_2198.field_2171]) * var1;
                                    }

                                    if (var2 > 0 && this.field_2187 != null) {
                                       byte var38 = this.field_2187[this.field_2198.field_2170][this.field_2198.field_2171];
                                       if (var38 <= var2) {
                                          var37 += 100;
                                       }
                                    }

                                    if (var36 < this.field_2191 || var37 < var36) {
                                       this.field_2198.method_1757(this, var49, var34);
                                       this.field_2198.method_1752(this, var49, false);
                                       this.field_2198.method_1751(this, var49, var37);
                                       var24.method_1723(var37 - this.field_2191, this.field_2198.field_2170, this.field_2198.field_2171);
                                    }
                                 }
                              }
                           }
                        }

                        ++var33;
                     }
                  }

                  this.field_2198.method_1747(var23);
                  if (!var30) {
                     if (class_238.field_2093) {
                        Log.method_1712("RustedWarfare", "Not closedOnOtherSide");
                     }

                     var41 = this.field_2197.field_2170;
                     var17 = this.field_2197.field_2171;
                     var39 = true;
                  } else {
                     class_243 var31 = this.field_2198.method_1760(this, var49);
                     if (var31 == null) {
                        Log.method_1712("RustedWarfare", "findPath: otherConnection==null");
                        Log.method_1712("RustedWarfare", "currentNode:" + this.field_2197.field_2170 + "," + this.field_2197.field_2171);
                        Log.method_1712("RustedWarfare", "currentNode cost normal:" + this.field_2197.method_1750(this, (byte)0));
                        Log.method_1712("RustedWarfare", "currentNode cost opposite:" + this.field_2197.method_1750(this, (byte)1));
                        var9.clear();
                        return var9;
                     }

                     if (!var40) {
                        if (class_238.field_2093) {
                           Log.method_1712("RustedWarfare", "closing path runFromOppositeSide=false");
                        }

                        var18 = this.field_2197.field_2170;
                        var43 = this.field_2197.field_2171;
                        var41 = var31.field_2170;
                        var17 = var31.field_2171;
                     } else {
                        if (class_238.field_2093) {
                           Log.method_1712("RustedWarfare", "closing path runFromOppositeSide=true");
                        }

                        var18 = var31.field_2170;
                        var43 = var31.field_2171;
                        var41 = this.field_2197.field_2170;
                        var17 = this.field_2197.field_2171;
                     }

                     var39 = true;
                  }
               }
            }

            long var50;
            if (class_238.field_2093) {
               Log.method_1712("RustedWarfare", "grid path finshed in :" + var48 + " ticks");
               var50 = System.currentTimeMillis() - this.field_2204;
               Log.method_1712("RustedWarfare", "grid path done in:" + var50);
            }

            var50 = System.currentTimeMillis();
            long var51;
            if (!var39) {
               if (class_238.field_2093) {
                  Log.method_1712("RustedWarfare", "could not find end node");
               }

               var51 = System.currentTimeMillis();
               float var53 = -1.0F;
               class_243 var54 = new class_243();

               for(short var55 = 0; var55 < this.field_2189; ++var55) {
                  for(short var57 = 0; var57 < this.field_2190; ++var57) {
                     var54.method_1746(var55, var57);
                     if (var54.method_1759(this, (byte)0)) {
                        float var58 = class_296.method_2026((float)var55, (float)var57, (float)var6, (float)var7);
                        if (var53 == -1.0F || var58 < var53) {
                           var53 = var58;
                           var41 = var55;
                           var17 = var57;
                        }
                     }
                  }
               }

               if (class_238.field_2093) {
                  long var56 = System.currentTimeMillis() - var51;
                  Log.method_1712("RustedWarfare", "got closest node in:" + var56);
               }
            }

            var9.clear();
            LinkedList var52;
            if (var41 != -1 && var17 != -1) {
               var52 = this.method_1778((byte)0, var41, var17);
               var9.addAll(this.method_1779(var52));
            }

            if (var18 != -1 && var43 != -1) {
               var52 = this.method_1778((byte)1, var18, var43);
               var9.addAll(var52);
            }

            if (var9.size() > 1) {
               var9.remove(0);
            }

            this.field_2205 = class_236.method_1596();
            if (class_238.field_2093 || class_238.field_2094) {
               var51 = this.field_2205 - this.field_2204;
               Log.method_1712("RustedWarfare", "path(" + this.field_2188.field_2145 + ") finished in:" + var51);
            }

            if (class_238.field_2101 && !class_236.method_1549().field_1929) {
               Debug.stopMethodTracing();
               class_238.field_2101 = false;
            }

            return var9;
         }
      }
   }

   // $FF: renamed from: a (byte, short, short) java.util.LinkedList
   public strictfp LinkedList method_1778(byte var1, short var2, short var3) {
      LinkedList var4 = new LinkedList();
      class_243 var5 = new class_243(var2, var3);
      var4.add(var5);

      while(true) {
         class_243 var6 = var5.method_1760(this, var1);
         if (var6 == null) {
            return var4;
         }

         var4.add(var5);
         var5 = var6;
      }
   }

   // $FF: renamed from: a (java.util.LinkedList) java.util.LinkedList
   public strictfp LinkedList method_1779(LinkedList var1) {
      LinkedList var2 = new LinkedList();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class_243 var4 = (class_243)var3.next();
         var2.addFirst(var4);
      }

      return var2;
   }

   // $FF: renamed from: f () void
   strictfp void method_1780() {
      if (!class_236.method_1549().field_1929) {
         synchronized(this.field_2206) {
            this.field_2207 = true;

            try {
               this.field_2206.wait();
            } catch (InterruptedException var4) {
               var4.printStackTrace();
            }

         }
      }
   }

   // $FF: renamed from: g () void
   strictfp void method_1781() {
      if (this.field_2207) {
         this.field_2207 = false;
         this.method_1782();
      }

      synchronized(this.field_2206) {
         this.field_2206.notifyAll();
      }
   }

   // $FF: renamed from: h () void
   strictfp void method_1782() {
      this.method_1783(this.field_2195);
      this.method_1783(this.field_2196);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.e) void
   strictfp void method_1783(class_239 var1) {
      class_236 var2 = class_236.method_1549();
      class_408 var3 = var2.field_1932;
      Rect var4 = new Rect();
      float var5 = var2.field_1965;
      float var6 = var2.field_1966;
      Iterator var7 = var1.field_2127.field_1869.iterator();

      int var9;
      while(var7.hasNext()) {
         class_245 var8 = (class_245)var7.next();
         if (var8 != null) {
            var9 = var8.field_2175 * var3.field_3330;
            int var10 = var8.field_2176 * var3.field_3331;
            var4.method_1911(var9, var10, var9 + var3.field_3330, var10 + var3.field_3331);
            var4.method_1913((int)(-var5), (int)(-var6));
            this.field_2208.method_2791(40, 255, 0, 0);
            var2.field_1935.method_79(var4, this.field_2208);
         }
      }

      class_245[] var13 = var1.field_2127.field_1868;
      int var14 = var13.length;

      for(var9 = 0; var9 < var14; ++var9) {
         class_245 var15 = var13[var9];
         if (var15 != null) {
            int var11 = var15.field_2175 * var3.field_3330;
            int var12 = var15.field_2176 * var3.field_3331;
            var4.method_1911(var11, var12, var11 + var3.field_3330, var12 + var3.field_3331);
            var4.method_1913((int)(-var5), (int)(-var6));
            this.field_2208.method_2791(40, 0, 255, 0);
            var2.field_1935.method_79(var4, this.field_2208);
         }
      }

   }
}
