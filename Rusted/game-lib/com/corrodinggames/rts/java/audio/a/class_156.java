package com.corrodinggames.rts.java.audio.a;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.h
class class_156 {
   // $FF: renamed from: a boolean
   public boolean field_1437;
   // $FF: renamed from: b com.corrodinggames.rts.java.audio.a.e
   final class_161 field_1438;
   // $FF: renamed from: c int
   int field_1439;
   // $FF: renamed from: d int
   int field_1440;
   // $FF: renamed from: e boolean
   boolean field_1441 = true;

   public class_156(class_161 var1) {
      this.field_1438 = var1;
      this.method_1170();
   }

   // $FF: renamed from: b () void
   public void method_1170() {
      this.field_1440 = -2;
      this.field_1439 = -1;
      if (this.field_1438.field_1457) {
         this.field_1437 = true;
      } else {
         this.method_1171();
      }

   }

   // $FF: renamed from: c () void
   void method_1171() {
      this.field_1437 = false;
      int[] var1 = this.field_1438.field_1452;
      int var2 = this.field_1438.field_1454 + this.field_1438.field_1455;

      while(++this.field_1439 < var2) {
         if (var1[this.field_1439] != 0) {
            this.field_1437 = true;
            break;
         }
      }

   }

   public void remove() {
      if (this.field_1440 == -1 && this.field_1438.field_1457) {
         this.field_1438.field_1456 = null;
         this.field_1438.field_1457 = false;
      } else {
         if (this.field_1440 < 0) {
            throw new IllegalStateException("next must be called before remove.");
         }

         if (this.field_1440 >= this.field_1438.field_1454) {
            this.field_1438.method_1185(this.field_1440);
            this.field_1439 = this.field_1440 - 1;
            this.method_1171();
         } else {
            this.field_1438.field_1452[this.field_1440] = 0;
            this.field_1438.field_1453[this.field_1440] = null;
         }
      }

      this.field_1440 = -2;
      --this.field_1438.field_1451;
   }
}
