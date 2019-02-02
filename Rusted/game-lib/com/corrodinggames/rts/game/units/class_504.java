package com.corrodinggames.rts.game.units;

import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.utility.class_201;

// $FF: renamed from: com.corrodinggames.rts.game.units.af
public class class_504 {
   // $FF: renamed from: a int
   int field_4626;
   // $FF: renamed from: b int
   int field_4627;
   // $FF: renamed from: c float
   float field_4628;
   // $FF: renamed from: d float
   float field_4629;
   // $FF: renamed from: e com.corrodinggames.rts.game.units.ag[][]
   public class_507[][] field_4630 = (class_507[][])null;
   // $FF: renamed from: f com.corrodinggames.rts.game.units.ai
   class_511 field_4631 = new class_511();
   // $FF: renamed from: g com.corrodinggames.rts.game.units.ak
   class_509 field_4632 = new class_509();
   // $FF: renamed from: h com.corrodinggames.rts.game.units.al
   class_510 field_4633 = new class_510();
   // $FF: renamed from: i android.graphics.Rect
   Rect field_4634 = new Rect();
   // $FF: renamed from: j int
   final int field_4635 = 32;
   // $FF: renamed from: k boolean
   public final boolean field_4636 = false;

   // $FF: renamed from: a (float, float, float, com.corrodinggames.rts.game.units.p, float, com.corrodinggames.rts.game.units.am) void
   public void method_3233(float var1, float var2, float var3, class_44 var4, float var5, class_251 var6) {
      float var7 = var1 - var3;
      float var8 = var2 - var3;
      float var9 = var1 + var3;
      float var10 = var2 + var3;
      this.field_4632.method_3249(var7, var8, var9, var10);
      this.method_3235(this.field_4632.field_4649, this.field_4632, var4, var5, var6);
   }

   // $FF: renamed from: a (float, float, float, com.corrodinggames.rts.game.units.p, float, com.corrodinggames.rts.game.units.an) void
   public final void method_3234(float var1, float var2, float var3, class_44 var4, float var5, class_250 var6) {
      float var7 = var1 - var3;
      float var8 = var1 + var3;
      float var9 = var2 - var3;
      float var10 = var2 + var3;
      float var11 = 50.0F;
      this.field_4634.field_2352 = this.method_3236(var7 - 50.0F);
      this.field_4634.field_2354 = this.method_3236(var8 + 50.0F);
      this.field_4634.field_2353 = this.method_3237(var9 - 50.0F);
      this.field_4634.field_2355 = this.method_3237(var10 + 50.0F);

      for(int var12 = this.field_4634.field_2352; var12 <= this.field_4634.field_2354; ++var12) {
         for(int var13 = this.field_4634.field_2353; var13 <= this.field_4634.field_2355; ++var13) {
            class_201 var14 = this.field_4630[var12][var13].field_4647.field_4646;
            class_39[] var15 = var14.method_1326();
            int var16 = 0;

            for(int var17 = var14.field_1673; var16 < var17; ++var16) {
               class_39 var18 = var15[var16];
               float var19 = var18.dh;
               float var20 = var18.di;
               float var21 = var18.field_157;
               if (var7 - var21 <= var19 && var19 <= var8 + var21 && var9 - var21 <= var20 && var20 <= var10 + var21) {
                  var6.method_1803(var4, var5, var18);
               }
            }
         }
      }

   }

   // $FF: renamed from: a (android.graphics.RectF, com.corrodinggames.rts.game.units.aj, com.corrodinggames.rts.game.units.p, float, com.corrodinggames.rts.game.units.am) void
   public void method_3235(RectF var1, class_508 var2, class_44 var3, float var4, class_251 var5) {
      this.field_4634.field_2352 = this.method_3236(var1.field_2416);
      this.field_4634.field_2354 = this.method_3236(var1.field_2418);
      this.field_4634.field_2353 = this.method_3237(var1.field_2417);
      this.field_4634.field_2355 = this.method_3237(var1.field_2419);
      class_107 var6 = null;
      int var7 = var5.method_1804(var3);
      if (var7 != -2) {
         var6 = class_107.method_954(var7);
      }

      class_107 var8 = var5.method_1805(var3);
      var5.method_1806(var3, var4);
      int var9;
      if (var8 == null) {
         for(var9 = this.field_4634.field_2352; var9 <= this.field_4634.field_2354; ++var9) {
            for(int var10 = this.field_4634.field_2353; var10 <= this.field_4634.field_2355; ++var10) {
               class_201 var11 = this.field_4630[var9][var10].field_4647.field_4646;
               class_39[] var12 = var11.method_1326();
               int var13 = 0;

               for(int var14 = var11.field_1673; var13 < var14; ++var13) {
                  class_39 var15 = var12[var13];
                  if (var15.field_143 != var6 && var2.method_3248(var15)) {
                     var5.a(var3, var4, var15);
                  }
               }
            }
         }
      } else {
         for(var9 = 0; var9 < 10; ++var9) {
            class_107 var18 = class_107.method_954(var9);
            if (var18 != null && var8 != var18 && var8.method_943(var18)) {
               for(int var19 = this.field_4634.field_2352; var19 <= this.field_4634.field_2354; ++var19) {
                  for(int var20 = this.field_4634.field_2353; var20 <= this.field_4634.field_2355; ++var20) {
                     class_201 var21 = this.field_4630[var19][var20].field_4648[var9].field_4646;
                     if (var21.field_1673 > 0) {
                        class_39[] var22 = var21.method_1326();
                        int var23 = 0;

                        for(int var16 = var21.field_1673; var23 < var16; ++var23) {
                           class_39 var17 = var22[var23];
                           if (var2.method_3248(var17)) {
                              var5.a(var3, var4, var17);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: a (float) int
   public final int method_3236(float var1) {
      int var2 = (int)(var1 * this.field_4628);
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= 32) {
         var2 = 31;
      }

      return var2;
   }

   // $FF: renamed from: b (float) int
   public final int method_3237(float var1) {
      int var2 = (int)(var1 * this.field_4629);
      if (var2 < 0) {
         var2 = 0;
      }

      if (var2 >= 32) {
         var2 = 31;
      }

      return var2;
   }

   // $FF: renamed from: a () void
   public void method_3238() {
      class_39[] var1 = class_39.field_126.method_1326();
      int var2 = 0;

      for(int var3 = class_39.field_126.size(); var2 < var3; ++var2) {
         class_39 var4 = var1[var2];
         this.method_3239(var4);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public void method_3239(class_39 var1) {
      if (this.field_4630 == null) {
         class_236.method_1588("updateUnitGeoIndex: areaList not active");
         var1.field_202 = -1;
         var1.field_203 = -1;
      } else if (var1.field_141) {
         if (var1.field_202 != -1 && var1.field_203 != -1) {
            this.field_4630[var1.field_202][var1.field_203].method_3247(var1);
            var1.field_202 = -1;
            var1.field_203 = -1;
         }

      } else {
         int var2 = this.method_3236(var1.dh);
         int var3 = this.method_3237(var1.di);
         if (var1.field_202 != var2 || var1.field_203 != var3) {
            if (var1.field_202 != -1 && var1.field_203 != -1) {
               this.field_4630[var1.field_202][var1.field_203].method_3247(var1);
            }

            var1.field_202 = var2;
            var1.field_203 = var3;
            int var4 = -2;
            if (var1.field_143 != null) {
               var4 = var1.field_143.field_1227;
            }

            var1.field_204 = var4;
            this.field_4630[var1.field_202][var1.field_203].method_3246(var1);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b) void
   public void method_3240(class_408 var1) {
      this.field_4630 = new class_507[32][32];

      for(int var2 = 0; var2 < 32; ++var2) {
         for(int var3 = 0; var3 < 32; ++var3) {
            this.field_4630[var2][var3] = new class_507();
         }
      }

      this.field_4626 = var1.field_3342 * var1.field_3330 / 32;
      this.field_4627 = var1.field_3343 * var1.field_3331 / 32;
      this.field_4628 = 1.0F / (float)this.field_4626;
      this.field_4629 = 1.0F / (float)this.field_4627;
   }

   // $FF: renamed from: b () void
   public void method_3241() {
      this.field_4630 = (class_507[][])null;
   }

   // $FF: renamed from: c (float) void
   public void method_3242(float var1) {
   }
}
