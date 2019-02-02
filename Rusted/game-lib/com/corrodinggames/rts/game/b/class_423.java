package com.corrodinggames.rts.game.b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import com.corrodinggames.rts.game.class_36;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.class_402;
import com.corrodinggames.rts.gameFramework.h.class_22;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.b.c
public class class_423 {
   // $FF: renamed from: a int
   int field_3533 = 7;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_3534 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.l
   public class_22 field_3535 = null;
   // $FF: renamed from: d com.corrodinggames.rts.game.b.d[][]
   class_422[][] field_3536 = (class_422[][])null;
   // $FF: renamed from: e android.graphics.Paint
   public Paint field_3537 = new class_441();
   // $FF: renamed from: f int
   int field_3538;
   // $FF: renamed from: g int
   int field_3539;
   // $FF: renamed from: h int
   int field_3540;
   // $FF: renamed from: i int
   int field_3541;
   // $FF: renamed from: j int
   int field_3542;
   // $FF: renamed from: k int
   int field_3543;
   // $FF: renamed from: l float
   float field_3544 = 1.0F;
   // $FF: renamed from: m boolean
   boolean field_3545;
   // $FF: renamed from: n android.graphics.Rect
   Rect field_3546 = new Rect();
   // $FF: renamed from: o int
   int field_3547 = 0;

   // $FF: renamed from: a () void
   public strictfp void method_2681() {
      class_236 var1 = class_236.method_1549();
      class_408 var2 = var1.field_1932;
      this.field_3544 = var1.field_1988;
      this.field_3541 = (int)((float)this.field_3540 / this.field_3544);
      this.field_3543 = (int)((float)this.field_3542 / this.field_3544);
      this.field_3541 = (int)((float)this.field_3540 / this.field_3544);
      this.field_3543 = (int)((float)this.field_3542 / this.field_3544);
      this.field_3538 = var1.field_1963 - this.field_3541 / 2;
      this.field_3539 = var1.field_1964 - this.field_3541 / 2;
      this.field_3538 = (int)((float)this.field_3538 * var2.field_3334) * var2.field_3330;
      this.field_3539 = (int)((float)this.field_3539 * var2.field_3334) * var2.field_3330;

      for(int var3 = 0; var3 < this.field_3533; ++var3) {
         for(int var4 = 0; var4 < this.field_3533; ++var4) {
            class_422 var5 = this.field_3536[var3][var4];
            var5.field_3525 = true;
            var5.field_3528 = false;
         }
      }

   }

   // $FF: renamed from: b () void
   public strictfp void method_2682() {
      class_422 var3;
      for(int var1 = 0; var1 < this.field_3533; ++var1) {
         for(int var2 = 0; var2 < this.field_3533; var3.field_3524 = var2++) {
            var3 = this.field_3536[var1][var2];
            var3.field_3523 = var1;
         }
      }

   }

   // $FF: renamed from: a (int) void
   public strictfp void method_2683(int var1) {
      class_422[] var2 = new class_422[this.field_3533];
      int var3;
      int var4;
      if (var1 > 0) {
         for(var3 = 0; var3 < this.field_3533; ++var3) {
            var2[var3] = this.field_3536[var3][0];
         }

         for(var3 = 1; var3 < this.field_3533; ++var3) {
            for(var4 = 0; var4 < this.field_3533; ++var4) {
               this.field_3536[var4][var3 - 1] = this.field_3536[var4][var3];
            }
         }

         for(var3 = 0; var3 < this.field_3533; ++var3) {
            this.field_3536[var3][this.field_3533 - 1] = var2[var3];
         }

         for(var3 = 0; var3 < this.field_3533; ++var3) {
            this.field_3536[var3][this.field_3533 - 1].field_3525 = true;
         }
      } else {
         for(var3 = 0; var3 < this.field_3533; ++var3) {
            var2[var3] = this.field_3536[var3][this.field_3533 - 1];
         }

         for(var3 = this.field_3533 - 2; var3 >= 0; --var3) {
            for(var4 = 0; var4 < this.field_3533; ++var4) {
               this.field_3536[var4][var3 + 1] = this.field_3536[var4][var3];
            }
         }

         for(var3 = 0; var3 < this.field_3533; ++var3) {
            this.field_3536[var3][0] = var2[var3];
         }

         for(var3 = 0; var3 < this.field_3533; ++var3) {
            this.field_3536[var3][0].field_3525 = true;
         }
      }

      this.method_2682();
   }

   // $FF: renamed from: b (int) void
   public strictfp void method_2684(int var1) {
      class_422[] var2 = new class_422[this.field_3533];
      int var3;
      int var4;
      if (var1 > 0) {
         for(var3 = 0; var3 < this.field_3533; ++var3) {
            var2[var3] = this.field_3536[0][var3];
         }

         for(var3 = 1; var3 < this.field_3533; ++var3) {
            for(var4 = 0; var4 < this.field_3533; ++var4) {
               this.field_3536[var3 - 1][var4] = this.field_3536[var3][var4];
            }
         }

         for(var3 = 0; var3 < this.field_3533; ++var3) {
            this.field_3536[this.field_3533 - 1][var3] = var2[var3];
         }

         for(var3 = 0; var3 < this.field_3533; ++var3) {
            this.field_3536[this.field_3533 - 1][var3].field_3525 = true;
         }
      } else {
         for(var3 = 0; var3 < this.field_3533; ++var3) {
            var2[var3] = this.field_3536[this.field_3533 - 1][var3];
         }

         for(var3 = this.field_3533 - 2; var3 >= 0; --var3) {
            for(var4 = 0; var4 < this.field_3533; ++var4) {
               this.field_3536[var3 + 1][var4] = this.field_3536[var3][var4];
            }
         }

         for(var3 = 0; var3 < this.field_3533; ++var3) {
            this.field_3536[0][var3] = var2[var3];
         }

         for(var3 = 0; var3 < this.field_3533; ++var3) {
            this.field_3536[0][var3].field_3525 = true;
         }
      }

      this.method_2682();
   }

   // $FF: renamed from: a (int, int) com.corrodinggames.rts.game.b.d
   public strictfp class_422 method_2685(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_3533) {
         if (var2 >= 0 && var2 < this.field_3533) {
            return this.field_3536 == null ? null : this.field_3536[var1][var2];
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (int, int, boolean) void
   public strictfp void method_2686(int var1, int var2, boolean var3) {
      class_236 var4 = class_236.method_1549();
      class_408 var5 = var4.field_1932;
      int var6 = var1 * var5.field_3330;
      int var7 = var2 * var5.field_3331;
      int var8 = var6 - this.field_3538;
      int var9 = var7 - this.field_3539;
      this.method_2688(var8 - var5.field_3330, var9 - var5.field_3331, 3 * var5.field_3330, 3 * var5.field_3331, var3);
   }

   // $FF: renamed from: c () void
   public strictfp void method_2687() {
      if (this.field_3536 != null) {
         for(int var1 = 0; var1 < this.field_3533; ++var1) {
            for(int var2 = 0; var2 < this.field_3533; ++var2) {
               class_422 var3 = this.field_3536[var1][var2];
               var3.field_3525 = true;
            }
         }
      }

   }

   // $FF: renamed from: a (int, int, int, int, boolean) void
   public strictfp void method_2688(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = (int)((float)var1 / (float)this.field_3543);
      int var7 = (int)((float)var2 / (float)this.field_3543);
      class_422 var8 = this.method_2685(var6, var7);
      if (var8 != null) {
         if (var5) {
            var8.field_3526 = true;
         } else {
            var8.field_3525 = true;
         }

         boolean var9 = false;
         boolean var10 = false;
         if (var1 + var3 >= var8.field_3523 * this.field_3543 + this.field_3541) {
            var9 = true;
         }

         if (var2 + var4 >= var8.field_3524 * this.field_3543 + this.field_3541) {
            var10 = true;
         }

         class_422 var11;
         if (var9) {
            var11 = this.method_2685(var6 + 1, var7);
            if (var11 != null) {
               if (var5) {
                  var11.field_3526 = true;
               } else {
                  var11.field_3525 = true;
               }
            }
         }

         if (var10) {
            var11 = this.method_2685(var6, var7 + 1);
            if (var11 != null) {
               if (var5) {
                  var11.field_3526 = true;
               } else {
                  var11.field_3525 = true;
               }
            }
         }

         if (var9 && var10) {
            var11 = this.method_2685(var6 + 1, var7 + 1);
            if (var11 != null) {
               if (var5) {
                  var11.field_3526 = true;
               } else {
                  var11.field_3525 = true;
               }
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.i) void
   public strictfp void method_2689(class_36 var1) {
      for(int var2 = 0; var2 < this.field_3533; ++var2) {
         for(int var3 = 0; var3 < this.field_3533; ++var3) {
            if (this.field_3536 != null) {
               class_422 var4 = this.field_3536[var2][var3];
               boolean var5 = this.field_3544 != 1.0F;
               if (var5) {
                  var4.field_3515.method_89();
                  var4.field_3515.method_92(this.field_3544, this.field_3544);
               }

               var1.method_203(var4.field_3515, (float)var4.method_2679(), (float)var4.method_2680());
               if (var5) {
                  var4.field_3515.method_90();
               }
            }
         }
      }

   }

   // $FF: renamed from: a (int, int, com.corrodinggames.rts.gameFramework.h.l) void
   public strictfp void method_2690(int var1, int var2, class_22 var3) {
      class_422 var4 = this.field_3536[var1][var2];
      boolean var5 = this.field_3544 != 1.0F;
      if (var5) {
         var3.method_89();
         var3.method_92(this.field_3544, this.field_3544);
      }

      Rect var6 = var4.method_2678();
      class_296.method_2053(var6, 95.0F);
      class_34[] var7 = class_34.field_79.method_1339();
      int var8 = class_34.field_79.size();

      for(int var9 = 0; var9 < var8; ++var9) {
         class_34 var10 = var7[var9];
         if (var10 instanceof class_36) {
            class_36 var11 = (class_36)var10;
            if (var6.method_1914((int)var11.dh, (int)var11.di)) {
               var11.method_203(var3, (float)var4.method_2679(), (float)var4.method_2680());
            }
         }
      }

      if (var5) {
         var3.method_90();
      }

   }

   // $FF: renamed from: b (int, int) void
   public strictfp void method_2691(int var1, int var2) {
      class_422 var3 = this.field_3536[var1][var2];
      this.method_2692(var1, var2, var3.field_3515);
   }

   // $FF: renamed from: b (int, int, com.corrodinggames.rts.gameFramework.h.l) void
   public strictfp void method_2692(int var1, int var2, class_22 var3) {
      class_236 var4 = class_236.method_1549();
      class_408 var5 = var4.field_1932;
      if (var4.field_1939.method_773()) {
         int var6 = this.field_3538 + var1 * this.field_3543;
         int var7 = this.field_3539 + var2 * this.field_3543;
         int var10 = this.field_3541;
         int var11 = this.field_3541;
         short var12 = var5.field_3337.field_3563;
         short var13 = var5.field_3337.field_3564;
         int var14 = (int)((float)var6 * var5.field_3334);
         if (var14 < 0) {
            var14 = 0;
         }

         int var15 = (int)((float)var7 * var5.field_3335);
         if (var15 < 0) {
            var15 = 0;
         }

         int var16 = (int)((float)(var6 + var10) * var5.field_3334);
         if (var16 > var12 - 1) {
            var16 = var12 - 1;
         }

         int var17 = (int)((float)(var7 + var11) * var5.field_3335);
         if (var17 > var13 - 1) {
            var17 = var13 - 1;
         }

         if ((double)this.field_3544 < 0.4D) {
            return;
         }

         boolean var18 = this.field_3544 != 1.0F;
         if (var18) {
            var3.method_87();
            var3.method_92(this.field_3544, this.field_3544);
         }

         var5.method_2601(var14, var15, var16, var17, var6, var7, var3, false, -2);
         if (var18) {
            var3.method_88();
         }
      }

   }

   // $FF: renamed from: c (int, int) void
   public strictfp void method_2693(int var1, int var2) {
      class_422 var3 = class_408.field_3374.field_3536[var1][var2];
      class_236 var4 = class_236.method_1549();
      class_408 var5 = var4.field_1932;
      var3.field_3528 = true;
      this.field_3535.method_75(-16777216);
      class_306 var6 = var4.field_1943.field_1543;
      if (var6 != null) {
         Rect var7 = new Rect();
         RectF var8 = new RectF();
         float var9 = (float)(this.field_3538 + var1 * this.field_3543) / (float)(var5.field_3330 * var5.field_3342);
         float var10 = (float)(this.field_3539 + var2 * this.field_3543) / (float)(var5.field_3331 * var5.field_3343);
         float var11 = (float)(this.field_3538 + (var1 + 1) * this.field_3543) / (float)(var5.field_3330 * var5.field_3342);
         float var12 = (float)(this.field_3539 + (var2 + 1) * this.field_3543) / (float)(var5.field_3331 * var5.field_3343);
         var7.method_1911((int)(var9 * (float)var6.field_2531), (int)(var10 * (float)var6.field_2532), (int)(var11 * (float)var6.field_2531), (int)(var12 * (float)var6.field_2532));
         var8.method_1969(0.0F, 0.0F, (float)this.field_3540, (float)this.field_3540);
         this.field_3535.method_68(var6, var7, var8, this.field_3537);
      }

      this.field_3535.method_99();
      if (class_236.field_1900) {
         var3.field_3515.method_76(0, Mode.CLEAR);
      }

      var3.field_3515.method_71(this.field_3534, 0.0F, 0.0F, (Paint)null);
      var3.field_3518.method_2131();
   }

   // $FF: renamed from: d (int, int) void
   public strictfp void method_2694(int var1, int var2) {
      class_422 var3 = class_408.field_3374.field_3536[var1][var2];
      class_236 var4 = class_236.method_1549();
      class_408 var5 = var4.field_1932;
      boolean var6 = false;
      if (var4.field_1937.renderFancyWater) {
         var6 = true;
      }

      if (class_236.method_1550() || class_236.method_1551()) {
         var6 = true;
      }

      if (var6) {
         class_408.field_3374.field_3535.method_76(0, Mode.CLEAR);
      } else {
         boolean var7 = false;
         if (class_236.method_1550()) {
            var7 = true;
         }

         if (class_236.field_1900) {
            var7 = true;
         }

         if (var5.field_3344) {
            var7 = true;
         }

         if (var7) {
            this.field_3535.method_75(-16777216);
         }
      }

      if (class_236.field_1900) {
         this.field_3535.method_76(0, Mode.CLEAR);
      }

      int var15 = this.field_3538 + var1 * this.field_3543;
      int var8 = this.field_3539 + var2 * this.field_3543;
      boolean var9 = true;
      boolean var10 = false;
      boolean var11 = true;
      boolean var12 = false;
      var5.field_3337.method_2701(this.field_3535, (float)var15, (float)var8, (float)var15, (float)var8, (float)this.field_3541, (float)this.field_3541, this.field_3544, this.field_3544, var5.field_3344, false, false);
      if (var5.field_3338 != null) {
         var5.field_3338.method_2701(this.field_3535, (float)var15, (float)var8, (float)var15, (float)var8, (float)this.field_3541, (float)this.field_3541, this.field_3544, this.field_3544, var5.field_3344, false, false);
      }

      Iterator var13 = var5.field_3340.iterator();

      while(var13.hasNext()) {
         class_425 var14 = (class_425)var13.next();
         if (var14.field_3562) {
            var14.method_2701(this.field_3535, (float)var15, (float)var8, (float)var15, (float)var8, (float)this.field_3541, (float)this.field_3541, this.field_3544, this.field_3544, var5.field_3344, false, false);
         }
      }

      this.method_2690(var1, var2, this.field_3535);
      if (var5.field_3344) {
         var5.field_3337.method_2701(this.field_3535, (float)var15, (float)var8, (float)var15, (float)var8, (float)this.field_3541, (float)this.field_3541, this.field_3544, this.field_3544, var5.field_3344, true, true);
      }

      if (var4.field_1939.method_773()) {
         this.method_2692(var1, var2, this.field_3535);
      }

      var3.field_3525 = false;
      var3.field_3526 = false;
      var3.field_3527 = 0;
      var3.field_3528 = false;
      this.field_3535.method_99();
      if (var6 || class_236.field_1900) {
         var3.field_3515.method_76(0, Mode.CLEAR);
      }

      var3.field_3515.method_71(this.field_3534, 0.0F, 0.0F, (Paint)null);
      var3.field_3518.method_2131();
      if (class_408.field_3322) {
         var3.field_3515.method_78("" + var3.field_3517, 40.0F, 40.0F, class_408.field_3324);
      }

      ++var3.field_3517;
   }

   // $FF: renamed from: d () void
   public strictfp void method_2695() {
      if (!class_236.field_1899 || class_236.field_1900) {
         class_236 var1 = class_236.method_1549();
         class_408 var2 = var1.field_1932;
         int var3 = Math.max((int)var1.field_1972, (int)var1.field_1974) + 3;
         if (this.field_3536 != null && this.field_3540 * this.field_3533 < var3 + this.field_3540 + 1) {
            class_236.method_1592("map", "screen must have changed size, layerBufferSize too small at " + this.field_3533 + ", adding to LayerBitmapBuffer");
            class_236.method_1592("map", "new viewpoint:" + var1.field_1972 + ", " + var1.field_1974);
            this.method_2696(this.field_3533 + 1);
         }

         if (this.field_3536 == null) {
            long var4 = System.nanoTime();
            if (class_236.field_1900) {
               var3 = Math.max(1000, var3);
               this.field_3533 = 4;
               this.field_3540 = var3 / (this.field_3533 - 1) + 9;
            } else {
               var3 = Math.max(600, var3);
               this.field_3540 = var3 / (this.field_3533 - 2) + 7;
            }

            this.field_3536 = new class_422[this.field_3533][this.field_3533];
            this.field_3540 = (int)((float)this.field_3540 * var2.field_3334 + 0.5F) * var2.field_3330;
            class_236.method_1591("layerBufferSize:" + this.field_3540);
            this.field_3542 = this.field_3540;
            this.field_3540 += 4;
            if (this.field_3540 * this.field_3533 < var3 + this.field_3540 + 1) {
               class_236.method_1588("layerBufferSize is too small");
               class_236.method_1588("layerBufferCount:" + this.field_3533);
               class_236.method_1588("(layerBufferSize*(layerBufferCount):" + this.field_3540 * this.field_3533);
               class_236.method_1588("longest+layerBufferSize+1:" + (var3 + this.field_3540 + 1));
               this.field_3540 += 100;
            }

            boolean var6 = false;
            if (var1.field_1937.renderFancyWater) {
               var6 = true;
            }

            if (class_236.method_1550() || class_236.method_1551()) {
               var6 = true;
            }

            if (var6) {
               this.field_3534 = var1.field_1935.method_63(this.field_3540, this.field_3540, true);
            } else {
               this.field_3534 = var1.field_1935.method_63(this.field_3540, this.field_3540, false);
            }

            this.field_3535 = var1.field_1935.method_54(this.field_3534);
            this.method_2697();
            long var7 = System.nanoTime();
            class_236.method_1591("----- layerBuffers create in:" + (double)(var7 - var4) / 1000000.0D + " ms");
         }

      }
   }

   // $FF: renamed from: c (int) void
   public strictfp void method_2696(int var1) {
      if (var1 < this.field_3533) {
         class_236.method_1595("newLayerBufferCount:" + var1);
      } else {
         class_422[][] var2 = new class_422[var1][var1];

         for(int var3 = 0; var3 < this.field_3533; ++var3) {
            for(int var4 = 0; var4 < this.field_3533; ++var4) {
               var2[var3][var4] = this.field_3536[var3][var4];
            }
         }

         this.field_3536 = var2;
         this.field_3533 = var1;
         this.method_2697();
      }
   }

   // $FF: renamed from: e () void
   public strictfp void method_2697() {
      class_236 var1 = class_236.method_1549();

      for(int var2 = 0; var2 < this.field_3533; ++var2) {
         for(int var3 = 0; var3 < this.field_3533; ++var3) {
            class_422 var4 = this.field_3536[var2][var3];
            if (var4 == null) {
               var4 = new class_422(this, var2, var3);
               var4.field_3516 = this.field_3547++;
               this.field_3536[var2][var3] = var4;
               if (var1.field_1937.renderFancyWater) {
                  var4.field_3518 = var1.field_1935.method_63(this.field_3540, this.field_3540, true);
               } else {
                  var4.field_3518 = var1.field_1935.method_63(this.field_3540, this.field_3540, false);
               }

               var4.field_3515 = var1.field_1935.method_54(var4.field_3518);
               if (class_408.field_3348) {
                  var4.method_2677();
               }

               System.gc();
            }
         }
      }

      this.method_2681();
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_2698(float var1) {
      class_236 var2 = class_236.method_1549();
      class_408 var3 = var2.field_1932;
      Long var4 = null;
      boolean var5 = false;
      boolean var6 = false;
      float var7 = var2.field_1988 / this.field_3544;
      if (class_296.method_2042(var7 - 1.0F) < 0.01F) {
         var7 = 1.0F;
      }

      float var8;
      if ((double)var2.field_1988 > 0.6D) {
         var8 = 0.3F;
         if (class_236.method_1654()) {
            var8 = 0.1F;
         }

         if (var2.field_1988 - this.field_3544 > var8) {
            var6 = true;
         }
      }

      float var9;
      if (var7 != 1.0F) {
         int var29 = 10;
         var9 = 0.03F;
         if (var2.field_1988 < 0.3F) {
            var29 = 20;
            var9 = 0.06F;
         }

         if (var2.field_1988 > 1.5F) {
            var29 = 7;
         }

         if (!class_236.method_1654()) {
            var29 += 10;
         }

         if (class_296.method_2042(var3.field_3373 - var2.field_1988) < var9) {
            if (var2.field_1988 < 0.2F) {
               if (var2.field_1987) {
                  var3.field_3372 += 2.0F;
               } else if (class_296.method_2042(var2.field_1988 - this.field_3544) > 0.05F) {
                  ++var3.field_3372;
               }
            } else {
               ++var3.field_3372;
            }
         } else {
            var3.field_3372 = 0.0F;
            var3.field_3373 = var2.field_1988;
         }

         if (var3.field_3372 > (float)var29) {
            var3.field_3372 = 0.0F;
            var6 = true;
         }
      }

      if ((float)var2.field_1963 + var2.field_1969 + 4.0F > (float)(this.field_3538 + this.field_3533 * this.field_3543)) {
         this.field_3538 += this.field_3543;
         this.method_2684(1);
      }

      if (var2.field_1963 - 1 < this.field_3538) {
         this.field_3538 -= this.field_3543;
         this.method_2684(-1);
      }

      if ((float)var2.field_1964 + var2.field_1970 + 4.0F > (float)(this.field_3539 + this.field_3533 * this.field_3543)) {
         this.field_3539 += this.field_3543;
         this.method_2683(1);
      }

      if (var2.field_1964 - 1 < this.field_3539) {
         this.field_3539 -= this.field_3543;
         this.method_2683(-1);
      }

      if ((float)var2.field_1963 + var2.field_1969 + 4.0F > (float)(this.field_3538 + this.field_3533 * this.field_3543)) {
         var6 = true;
      }

      if (var2.field_1963 - 1 < this.field_3538) {
         var6 = true;
      }

      if ((float)var2.field_1964 + var2.field_1970 + 4.0F > (float)(this.field_3539 + this.field_3533 * this.field_3543)) {
         var6 = true;
      }

      if (var2.field_1964 - 1 < this.field_3539) {
         var6 = true;
      }

      if (var6) {
         this.method_2681();
      }

      var7 = var2.field_1988 / this.field_3544;
      if (class_296.method_2042(var7 - 1.0F) < 1.0E-4F) {
         var7 = 1.0F;
      }

      var8 = var2.field_1972 / var7 + 2.0F;
      var9 = var2.field_1974 / var7 + 2.0F;
      if (var7 != 1.0F) {
         var2.field_1935.method_89();
         var2.field_1935.method_92(var7, var7);
         var3.field_3377.method_1912(var2.field_1977);
         var3.field_3377.field_2354 = (int)((float)var3.field_3377.field_2352 + (float)var3.field_3377.method_1904() / var7) + 2;
         var3.field_3377.field_2355 = (int)((float)var3.field_3377.field_2353 + (float)var3.field_3377.method_1905() / var7) + 2;
         var2.field_1935.method_83(var3.field_3377);
      }

      float var10 = ((float)this.field_3538 - var2.field_1965) * this.field_3544;
      float var11 = ((float)this.field_3539 - var2.field_1966) * this.field_3544;
      int var12 = 0;
      if (class_236.method_1654()) {
         this.field_3537.method_2781(true);
      }

      for(int var13 = 0; var13 < this.field_3533; ++var13) {
         for(int var14 = 0; var14 < this.field_3533; ++var14) {
            class_422 var15 = this.field_3536[var13][var14];
            int var16 = (int)(var10 + (float)(var13 * this.field_3543) * this.field_3544);
            int var17 = (int)(var11 + (float)(var14 * this.field_3543) * this.field_3544);
            if (var15.field_3526 && !this.field_3545) {
               ++var15.field_3527;
            }

            var15.field_3530.method_1911(var16 + 1, var17 + 1, var16 + this.field_3540 - 2, var17 + this.field_3540 - 2);
            if ((float)var15.field_3530.field_2352 <= var8 && (float)var15.field_3530.field_2353 <= var9) {
               if ((float)var15.field_3530.field_2354 > var8) {
                  var15.field_3530.field_2354 = (int)var8;
               }

               if ((float)var15.field_3530.field_2355 > var9) {
                  var15.field_3530.field_2355 = (int)var9;
               }

               int var18 = (int)((0.0F - var2.field_1965) * this.field_3544);
               int var19 = (int)((0.0F - var2.field_1966) * this.field_3544);
               int var20 = (int)((var3.method_2612() - var2.field_1965) * this.field_3544);
               int var21 = (int)((var3.method_2613() - var2.field_1966) * this.field_3544);
               if (var15.field_3530.field_2352 < var18) {
                  var15.field_3530.field_2352 = var18;
               }

               if (var15.field_3530.field_2353 < var19) {
                  var15.field_3530.field_2353 = var19;
               }

               if (var15.field_3530.field_2354 > var20) {
                  var15.field_3530.field_2354 = var20;
               }

               if (var15.field_3530.field_2355 > var21) {
                  var15.field_3530.field_2355 = var21;
               }

               if (!var15.field_3530.method_1903()) {
                  boolean var22 = false;
                  boolean var23 = true;
                  if (var15.field_3525) {
                     var22 = true;
                     var23 = false;
                  }

                  if (var15.field_3526) {
                     int var24 = 10;
                     if (var12 > 3) {
                        var24 += 2;
                     }

                     if (var12 > 6) {
                        var24 += 2;
                     }

                     if (var15.field_3527 > var24) {
                        var15.field_3527 = 0;
                        var22 = true;
                        ++var12;
                     }
                  }

                  if (var22) {
                     var5 = true;
                     boolean var30 = false;
                     long var25 = class_402.method_2522();
                     if (var4 == null) {
                        var4 = var25;
                     } else {
                        short var27 = 200;
                        if (this.field_3545) {
                           var27 = 30;
                        }

                        if (class_402.method_2524(var4, var25) > (double)var27) {
                           var30 = true;
                           this.field_3545 = true;
                        }
                     }

                     if (var30 && var15.field_3525 && !var15.field_3528) {
                        this.method_2693(var13, var14);
                     }

                     if (!var30) {
                        if (class_408.field_3348 && var23) {
                           if (var15.field_3519 != null && var15.field_3519.field_2531 != var15.field_3518.field_2531) {
                              class_236.method_1591("wrong sized fadeOutBitmap width:" + var15.field_3519.field_2531 + " vs " + var15.field_3518.field_2531);
                              var15.field_3519.method_2130();
                              var15.field_3519 = null;
                           }

                           if (var15.field_3519 == null) {
                              var15.method_2677();
                              if (var15.field_3519 == null) {
                                 throw new RuntimeException("fadeOutBitmap null after clone");
                              }
                           }

                           if (var15.field_3521 > 0.0F) {
                           }

                           class_306 var31 = var15.field_3518;
                           var15.field_3518 = var15.field_3519;
                           var15.field_3519 = var31;
                           class_22 var28 = var15.field_3515;
                           var15.field_3515 = var15.field_3520;
                           var15.field_3520 = var28;
                           var15.field_3521 = 1.0F;
                        } else {
                           var15.field_3521 = 0.0F;
                        }

                        this.method_2694(var13, var14);
                        if (class_408.field_3320) {
                           class_402.method_2525("re-drawTile", var25);
                        }
                     }
                  }

                  var15.field_3529.method_1912(var15.field_3530);
                  var15.field_3529.method_1913(-var16, -var17);
                  if (var15.field_3521 > 0.0F) {
                     var15.field_3522.method_2781(true);
                     var15.field_3522.method_2790((int)((1.0F - var15.field_3521) * 255.0F));
                     var15.field_3521 -= 0.1F * var1;
                     var2.field_1935.method_67(var15.field_3519, var15.field_3529, var15.field_3530, this.field_3537);
                     var2.field_1935.method_67(var15.field_3518, var15.field_3529, var15.field_3530, var15.field_3522);
                  } else {
                     var2.field_1935.method_67(var15.field_3518, var15.field_3529, var15.field_3530, this.field_3537);
                  }
               }
            }
         }
      }

      if (var7 != 1.0F) {
         var2.field_1935.method_90();
      }

      if (!var5) {
         this.field_3545 = false;
      }

   }
}
