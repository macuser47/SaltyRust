package com.corrodinggames.rts.gameFramework.c;

import android.graphics.Point;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.g
public class class_169 {
   // $FF: renamed from: a android.graphics.Point
   static Point field_1486 = new Point();

   // $FF: renamed from: a (int, int, int) android.graphics.Point
   public static Point method_1207(int var0, int var1, int var2) {
      class_236 var3 = class_236.method_1549();
      int var4 = var2;
      var3.field_1932.method_2578((float)var0, (float)var1);
      int var5 = var3.field_1932.field_3355;
      int var6 = var3.field_1932.field_3356;
      Point var7 = null;
      float var8 = -1.0F;

      for(int var9 = var5 - var2; var9 <= var5 + var4; ++var9) {
         for(int var10 = var6 - var4; var10 <= var6 + var4; ++var10) {
            if (var3.field_1932.method_2584(var9, var10)) {
               class_416 var11 = var3.field_1932.method_2587(var9, var10);
               if (var11 != null && var11.field_3428) {
                  class_39 var12 = class_47.method_513(var9, var10);
                  if (var12 != null && !var12.method_243()) {
                     var12 = null;
                  }

                  if (var12 == null) {
                     float var13 = class_296.method_2026((float)var5, (float)var6, (float)var9, (float)var10);
                     if (var8 == -1.0F || var8 > var13) {
                        var3.field_1932.method_2579(var9, var10);
                        field_1486.method_3291(var3.field_1932.field_3355, var3.field_1932.field_3356);
                        var7 = field_1486;
                        var8 = var13;
                     }
                  }
               }
            }
         }
      }

      return var7;
   }
}
