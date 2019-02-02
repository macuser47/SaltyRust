package com.corrodinggames.rts.java.audio.a;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.l
class class_151 {
   // $FF: renamed from: a boolean
   public boolean field_1410;
   // $FF: renamed from: b com.corrodinggames.rts.java.audio.a.i
   final class_154 field_1411;
   // $FF: renamed from: c int
   int field_1412;
   // $FF: renamed from: d int
   int field_1413;
   // $FF: renamed from: e boolean
   boolean field_1414 = true;

   public class_151(class_154 var1) {
      this.field_1411 = var1;
      this.method_1150();
   }

   // $FF: renamed from: b () void
   public void method_1150() {
      this.field_1413 = -2;
      this.field_1412 = -1;
      if (this.field_1411.field_1424) {
         this.field_1410 = true;
      } else {
         this.method_1151();
      }

   }

   // $FF: renamed from: c () void
   void method_1151() {
      this.field_1410 = false;
      long[] var1 = this.field_1411.field_1419;
      int var2 = this.field_1411.field_1421 + this.field_1411.field_1422;

      while(++this.field_1412 < var2) {
         if (var1[this.field_1412] != 0L) {
            this.field_1410 = true;
            break;
         }
      }

   }

   public void remove() {
      if (this.field_1413 == -1 && this.field_1411.field_1424) {
         this.field_1411.field_1423 = null;
         this.field_1411.field_1424 = false;
      } else {
         if (this.field_1413 < 0) {
            throw new IllegalStateException("next must be called before remove.");
         }

         if (this.field_1413 >= this.field_1411.field_1421) {
            this.field_1411.method_1161(this.field_1413);
            this.field_1412 = this.field_1413 - 1;
            this.method_1151();
         } else {
            this.field_1411.field_1419[this.field_1413] = 0L;
            this.field_1411.field_1420[this.field_1413] = null;
         }
      }

      this.field_1413 = -2;
      --this.field_1411.field_1418;
   }
}
