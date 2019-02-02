package com.corrodinggames.rts.gameFramework.a;

import android.util.Log;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.a.b
public class class_301 extends class_299 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.a.a
   class_327 field_2508;
   // $FF: renamed from: b int
   int field_2509;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.a.a
   // $FF: synthetic field
   final class_327 field_2510;

   public class_301(class_327 var1, String var2, class_325 var3) {
      super(var1, var2, var3);
      this.field_2510 = var1;
      this.field_2509 = -1;
   }

   // $FF: renamed from: a (float, float, int, int, float) void
   public void method_2104(float var1, float var2, int var3, int var4, float var5) {
      class_523 var6 = (class_523)this.field_2510.field_2623.method_1254();
      if (var6 != null) {
         var6.field_4743 = var1;
         var6.field_4744 = var2;
         var6.field_4745 = var3;
         var6.field_4746 = var4;
         var6.field_4747 = var5;
         var6.field_4742 = this;
         this.field_2510.field_2621.offer(var6);
      }
   }

   // $FF: renamed from: b (float, float, int, int, float) void
   public void method_2105(float var1, float var2, int var3, int var4, float var5) {
      if (this.field_2509 == 0) {
         Log.method_1712("RustedWarfare", "Sound not loaded");
      } else {
         this.field_2508.field_2626.play(this.field_2509, var1, var2, var3, var4, var5);
      }
   }
}
