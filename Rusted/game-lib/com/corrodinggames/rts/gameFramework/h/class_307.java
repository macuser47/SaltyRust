package com.corrodinggames.rts.gameFramework.h;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_246;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_402;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.h.f
public class class_307 extends class_306 {
   // $FF: renamed from: p boolean
   boolean field_2538 = false;
   // $FF: renamed from: t com.corrodinggames.rts.gameFramework.h.e
   private class_306 field_2539;
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.h.e
   private class_306 field_2540;
   // $FF: renamed from: q int
   int field_2541;
   // $FF: renamed from: r int
   int field_2542;
   // $FF: renamed from: s com.corrodinggames.rts.game.l
   class_246 field_2543;

   public class_307(class_306 var1, int var2, class_246 var3, int var4) {
      this.field_2539 = var1;
      this.field_2541 = var2;
      this.field_2543 = var3;
      this.field_2542 = var4;
      this.field_2539.method_2120(this);
      this.g = null;
   }

   // $FF: renamed from: b (boolean) void
   public void method_2137(boolean var1) {
      if (var1) {
         class_236.method_1591("Loading in lazy loaded bitmap:" + this.field_2539.method_2113() + " team:" + this.field_2542);
      }

      long var2 = class_402.method_2522();
      this.field_2539.method_2123();
      this.field_2540 = this.field_2539.method_2121();
      this.field_2540.method_2124();
      class_306[] var4 = new class_306[]{this.field_2540};
      int[] var5 = new int[]{this.field_2541};
      if (this.field_2543 == class_246.field_2179) {
         class_107.method_953(this.field_2539, var4, var5);
      } else {
         class_107.method_952(this.field_2539, var4, var5);
      }

      this.field_2540.method_2131();
      this.field_2539 = null;
      double var6 = (double)class_402.method_2523(var2);
      if (var6 > 1.0D) {
         class_236.method_1591("Colouring took:" + class_402.method_2528(var6));
      }

   }

   // $FF: renamed from: c () android.graphics.Bitmap
   public Bitmap method_2114() {
      if (!this.field_2538) {
         this.method_2137(true);
         this.field_2538 = true;
      }

      return this.field_2540.field_2529;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public class_306 method_2115() {
      if (!this.field_2538) {
         this.method_2137(true);
         this.field_2538 = true;
      }

      if (this.field_2540 == null) {
         throw new RuntimeException("coloredBitmap==null");
      } else {
         return this.field_2540;
      }
   }

   // $FF: renamed from: s () void
   public void method_2136() {
      if (!this.field_2538) {
         this.method_2137(false);
         this.field_2538 = true;
      }

   }

   // $FF: renamed from: q () int
   public int method_2134() {
      return !this.field_2538 ? 0 : super.method_2134();
   }
}
