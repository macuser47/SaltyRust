package com.corrodinggames.rts.gameFramework.g;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_42;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.utility.class_178;
import com.corrodinggames.rts.gameFramework.utility.class_181;
import java.util.HashMap;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g.b
public final class class_240 {
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.g.d
   private final class_238 field_2128;
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ac
   class_503 field_2129;
   // $FF: renamed from: b byte[][]
   public byte[][] field_2130;
   // $FF: renamed from: c byte[][]
   public byte[][] field_2131;
   // $FF: renamed from: d byte[][]
   public byte[][] field_2132;
   // $FF: renamed from: e short[][]
   public short[][] field_2133;
   // $FF: renamed from: f java.util.HashMap
   public HashMap field_2134;
   // $FF: renamed from: g int
   public int field_2135;
   // $FF: renamed from: h byte[][]
   public byte[][] field_2136;
   // $FF: renamed from: i int
   public int field_2137 = -99;
   // $FF: renamed from: j android.graphics.Point
   Point field_2138 = new Point();

   strictfp class_240(class_238 var1, class_503 var2, int var3, int var4) {
      this.field_2128 = var1;
      this.field_2129 = var2;
      this.field_2130 = new byte[var3][var4];
      this.field_2128.field_2108.add(this);
      this.method_1725();
   }

   // $FF: renamed from: a () void
   strictfp void method_1725() {
      this.method_1731();
      this.method_1732();
      this.method_1733();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   strictfp void method_1726(class_44 var1) {
      class_408 var2 = this.field_2128.field_2105;
      byte[][] var3 = this.field_2136;
      if (this.field_2136 == null) {
         var1 = null;
      }

      this.field_2136 = new byte[this.field_2128.field_2106][this.field_2128.field_2107];
      short var4 = 0;
      short var5 = 0;
      short var6 = this.field_2128.field_2106;
      short var7 = this.field_2128.field_2107;
      short var8;
      short var9;
      if (var1 != null) {
         if (var3 != null) {
            class_296.method_2066(var3, this.field_2136);
         }

         var2.method_2578(var1.dh, var1.di);
         var8 = (short)var2.field_3355;
         var9 = (short)var2.field_3356;
         var4 = (short)(var8 - 10);
         var5 = (short)(var9 - 10);
         var6 = (short)(var8 + 10);
         var7 = (short)(var9 + 10);
      }

      if (var4 < 0) {
         var4 = 0;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      if (var6 > this.field_2128.field_2106) {
         var6 = this.field_2128.field_2106;
      }

      if (var7 > this.field_2128.field_2107) {
         var7 = this.field_2128.field_2107;
      }

      for(var8 = var4; var8 < var6; ++var8) {
         for(var9 = var5; var9 < var7; ++var9) {
            this.field_2136[var8][var9] = this.method_1727(var2, var8, var9);
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b, short, short) byte
   final strictfp byte method_1727(class_408 var1, short var2, short var3) {
      if (this.field_2130[var2][var3] == -1) {
         return 0;
      } else {
         int var4 = var2 - 4;
         int var5 = var3 - 4;
         int var6 = var2 + 4;
         int var7 = var3 + 4;
         int var8 = 4;

         for(int var9 = var4; var9 <= var6; ++var9) {
            for(int var10 = var5; var10 <= var7; ++var10) {
               boolean var11 = false;
               if (var1.method_2584(var9, var10)) {
                  if (this.field_2130[var9][var10] == -1) {
                     var11 = true;
                  }

                  if (this.field_2131[var9][var10] == -1) {
                     var11 = true;
                  }
               } else {
                  var11 = true;
               }

               if (var11) {
                  int var12 = class_296.method_2028(var2, var3, var9, var10);
                  if (var12 < var8) {
                     var8 = var12;
                  }
               }
            }
         }

         return (byte)var8;
      }
   }

   // $FF: renamed from: b () void
   strictfp void method_1728() {
      this.field_2133 = new short[this.field_2128.field_2106][this.field_2128.field_2107];
      this.field_2134 = new HashMap();
      short var1 = 1;

      for(short var2 = 0; var2 < this.field_2128.field_2106; ++var2) {
         for(short var3 = 0; var3 < this.field_2128.field_2107; ++var3) {
            if (this.field_2133[var2][var3] == 0) {
               if (var1 <= 0) {
                  Log.method_1712("RustedWarfare", "warning buildIsolatedGroups looped, ending");
                  return;
               }

               int var4 = this.method_1729(var2, var3, var1);
               if (var4 > 0) {
                  this.field_2134.put(var1, var4);
                  if (this.field_2135 < var4) {
                     this.field_2135 = var4;
                  }

                  ++var1;
               }
            }
         }
      }

   }

   // $FF: renamed from: a (short, short, short) int
   strictfp int method_1729(short var1, short var2, short var3) {
      if (this.field_2130[var1][var2] == -1) {
         this.field_2133[var1][var2] = -1;
         return 0;
      } else if (var3 == 0) {
         throw new RuntimeException("id cannot be 0 is will cause can endless loop");
      } else {
         int var4 = 0;
         class_181 var5 = new class_181();
         class_178 var6 = new class_178(var1, var2);
         var5.add(var6);

         while(!var5.isEmpty()) {
            class_178 var7 = (class_178)var5.method_1262();
            if (this.field_2128.field_2105.method_2584(var7.field_1576, var7.field_1577) && this.field_2133[var7.field_1576][var7.field_1577] == 0 && this.field_2130[var7.field_1576][var7.field_1577] != -1) {
               this.field_2133[var7.field_1576][var7.field_1577] = var3;
               ++var4;
               var5.add(new class_178((short)(var7.field_1576 - 1), var7.field_1577));
               var5.add(new class_178((short)(var7.field_1576 + 1), var7.field_1577));
               var5.add(new class_178(var7.field_1576, (short)(var7.field_1577 - 1)));
               var5.add(new class_178(var7.field_1576, (short)(var7.field_1577 + 1)));
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: c () boolean
   strictfp boolean method_1730() {
      return !this.field_2129.equals(class_503.field_4620) && !this.field_2129.equals(class_503.field_4617);
   }

   // $FF: renamed from: d () void
   strictfp void method_1731() {
      class_416[][] var1 = this.field_2128.field_2105.field_3337.method_2699();
      boolean var2 = this.method_1730();
      if (var2) {
         boolean var3 = this.field_2129.equals(class_503.field_4621) || this.field_2129.equals(class_503.field_4622) || this.field_2129.equals(class_503.field_4624);
         boolean var4 = this.field_2129.equals(class_503.field_4622) || this.field_2129.equals(class_503.field_4623) || this.field_2129.equals(class_503.field_4624);
         boolean var5 = this.field_2129.equals(class_503.field_4623) || this.field_2129.equals(class_503.field_4624);
         boolean var6 = false;

         for(int var7 = 0; var7 < this.field_2128.field_2106; ++var7) {
            for(int var8 = 0; var8 < this.field_2128.field_2107; ++var8) {
               this.field_2130[var7][var8] = 0;
               class_416 var9 = var1[var7][var8];
               if (var9 != null) {
                  if (var9.field_3425 && !var3) {
                     this.field_2130[var7][var8] = -1;
                  }

                  if (var9.field_3427 && !var4) {
                     this.field_2130[var7][var8] = -1;
                  }

                  if (var9.field_3430 && !var5) {
                     this.field_2130[var7][var8] = -1;
                  }

                  if (var9.field_3426 && !var6) {
                     this.field_2130[var7][var8] = -1;
                  }

                  if (this.field_2129.equals(class_503.field_4621) && !var9.field_3425) {
                     this.field_2130[var7][var8] = -1;
                  }
               }

               class_416 var10 = this.field_2128.field_2105.method_2587(var7, var8);
               if (var10 != null) {
                  if (this.field_2129.equals(class_503.field_4618) && var10.field_3428) {
                     this.field_2130[var7][var8] = -1;
                  }

                  if (var10.field_3430 && !var5) {
                     this.field_2130[var7][var8] = -1;
                  }

                  if (this.field_2130[var7][var8] == 0) {
                     this.field_2130[var7][var8] = var10.field_3429;
                  }
               }

               if (var9 != null && this.field_2130[var7][var8] == 0) {
                  this.field_2130[var7][var8] = var9.field_3429;
               }
            }
         }

      }
   }

   // $FF: renamed from: e () void
   public strictfp void method_1732() {
      long var1 = class_236.method_1596();
      this.field_2131 = new byte[this.field_2128.field_2106][this.field_2128.field_2107];
      if (!this.field_2129.equals(class_503.field_4620)) {
         class_39[] var3 = class_39.field_126.method_1326();
         int var4 = 0;

         for(int var5 = class_39.field_126.size(); var4 < var5; ++var4) {
            class_39 var6 = var3[var4];
            if (var6.method_212() && !var6.field_141) {
               Point var7 = var6.method_326(this.field_2128.field_2105, this.field_2138);
               int var8 = var7.field_4722;
               int var9 = var7.field_4723;
               Rect var10;
               if (this.field_2129.equals(class_503.field_4619)) {
                  var10 = var6.method_239();
               } else {
                  var10 = var6.method_238();
               }

               for(int var11 = var8 + var10.field_2352; var11 <= var8 + var10.field_2354; ++var11) {
                  for(int var12 = var9 + var10.field_2353; var12 <= var9 + var10.field_2355; ++var12) {
                     if (this.field_2128.field_2105.method_2584(var11, var12)) {
                        this.field_2131[var11][var12] = -1;
                     }
                  }
               }
            }
         }

         if (class_238.field_2094) {
            class_236.method_1592("PathEngine", "updateBuildingCosts took:" + (class_236.method_1596() - var1));
         }

      }
   }

   // $FF: renamed from: f () void
   public strictfp void method_1733() {
      long var1 = class_236.method_1596();
      this.field_2132 = new byte[this.field_2128.field_2106][this.field_2128.field_2107];
      if (!this.field_2129.equals(class_503.field_4620)) {
         class_39[] var3 = class_39.field_126.method_1326();
         int var4 = 0;

         for(int var5 = class_39.field_126.size(); var4 < var5; ++var4) {
            class_39 var6 = var3[var4];
            if (!var6.method_212() && !var6.field_179 && !(var6 instanceof class_42) && !var6.field_141 && !var6.method_280() && var6.field_182 == null && !var6.method_282()) {
               byte var7 = 2;
               this.field_2128.field_2105.method_2578(var6.dh, var6.di);
               int var8 = this.field_2128.field_2105.field_3355;
               int var9 = this.field_2128.field_2105.field_3356;
               float var10 = var6.field_157 + 5.0F;
               float var11 = var6.field_157 + 10.0F;

               for(int var12 = var8 - var7; var12 <= var8 + var7; ++var12) {
                  for(int var13 = var9 - var7; var13 <= var9 + var7; ++var13) {
                     if (this.field_2128.field_2105.method_2584(var12, var13)) {
                        this.field_2128.field_2105.method_2579(var12, var13);
                        float var14 = (float)(this.field_2128.field_2105.field_3355 + this.field_2128.field_2105.field_3332);
                        float var15 = (float)(this.field_2128.field_2105.field_3356 + this.field_2128.field_2105.field_3333);
                        float var16 = class_296.method_2026(var14, var15, var6.dh, var6.di);
                        byte var17 = 6;
                        if (var6 instanceof class_42) {
                           var17 = 3;
                        }

                        byte[] var10000;
                        if (var16 < var10 * var10) {
                           var10000 = this.field_2132[var12];
                           var10000[var13] += var17;
                        } else if (var16 < var11 * var11) {
                           var10000 = this.field_2132[var12];
                           var10000[var13] = (byte)(var10000[var13] + var17 / 3);
                        }

                        if (this.field_2132[var12][var13] < -1) {
                           this.field_2132[var12][var13] = 127;
                        }
                     }
                  }
               }
            }
         }

         if (class_238.field_2094) {
            class_236.method_1592("PathEngine", "updateUnitCosts took:" + (class_236.method_1596() - var1));
         }

      }
   }
}
