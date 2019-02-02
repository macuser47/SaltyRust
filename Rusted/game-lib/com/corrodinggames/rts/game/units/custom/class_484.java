package com.corrodinggames.rts.game.units.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.j
final class class_484 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.custom.k
   class_483 field_4479;
   // $FF: renamed from: b int
   int field_4480;
   // $FF: renamed from: c java.lang.String
   String field_4481;
   // $FF: renamed from: d float
   float field_4482;
   // $FF: renamed from: e com.corrodinggames.rts.game.units.custom.i[]
   public class_481[] field_4483;
   // $FF: renamed from: f java.util.ArrayList
   private ArrayList field_4484 = new ArrayList();

   // $FF: renamed from: a (float, float) void
   public strictfp void method_3195(float var1, float var2) {
      class_481 var3;
      if (this.field_4484.size() == 0 && var1 > 0.0F && var2 != 0.0F) {
         var3 = new class_481();
         var3.field_4450 = 0.0F;
         var3.field_4451 = 0.0F;
         this.field_4484.add(var3);
      }

      var3 = new class_481();
      var3.field_4450 = var1;
      var3.field_4451 = var2;
      this.field_4484.add(var3);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_3196(float var1) {
      class_481 var3;
      for(Iterator var2 = this.field_4484.iterator(); var2.hasNext(); var3.field_4450 *= var1) {
         var3 = (class_481)var2.next();
      }

   }

   // $FF: renamed from: a () void
   public strictfp void method_3197() {
      Collections.sort(this.field_4484);
      class_481 var1 = null;

      class_481 var3;
      for(Iterator var2 = this.field_4484.iterator(); var2.hasNext(); this.field_4482 = var3.field_4450) {
         var3 = (class_481)var2.next();
         if (var1 != null) {
            var3.field_4452 = 1.0F / (var3.field_4450 - var1.field_4450);
            var3.field_4453 = var3.field_4451 - var1.field_4451;
         }

         var1 = var3;
      }

      this.field_4483 = (class_481[])this.field_4484.toArray(new class_481[0]);
      this.field_4484 = null;
   }

   // $FF: renamed from: b (float) float
   public strictfp float method_3198(float var1) {
      if (this.field_4483.length != 1 && var1 > this.field_4483[0].field_4450) {
         if (var1 >= this.field_4482) {
            return this.field_4483[this.field_4483.length - 1].field_4451;
         } else {
            int var2 = 1;

            do {
               if (var1 <= this.field_4483[var2].field_4450) {
                  class_481 var3 = this.field_4483[var2 - 1];
                  class_481 var4 = this.field_4483[var2];
                  float var5 = (var1 - var3.field_4450) * var4.field_4452;
                  float var6 = var3.field_4451 + var4.field_4453 * var5;
                  return var6;
               }

               ++var2;
            } while(var2 < this.field_4483.length);

            return this.field_4483[this.field_4483.length - 1].field_4451;
         }
      } else {
         return this.field_4483[0].field_4451;
      }
   }
}
