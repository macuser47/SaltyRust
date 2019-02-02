package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.r
abstract class class_167 implements Iterable, Iterator {
   // $FF: renamed from: b boolean
   public boolean field_1480;
   // $FF: renamed from: c com.corrodinggames.rts.java.audio.a.o
   final class_173 field_1481;
   // $FF: renamed from: d int
   int field_1482;
   // $FF: renamed from: e int
   int field_1483;
   // $FF: renamed from: f boolean
   boolean field_1484 = true;

   public class_167(class_173 var1) {
      this.field_1481 = var1;
      this.method_1203();
   }

   // $FF: renamed from: c () void
   public void method_1203() {
      this.field_1483 = -1;
      this.field_1482 = -1;
      this.method_1204();
   }

   // $FF: renamed from: d () void
   void method_1204() {
      this.field_1480 = false;
      Object[] var1 = this.field_1481.field_1501;
      int var2 = this.field_1481.field_1503 + this.field_1481.field_1504;

      while(++this.field_1482 < var2) {
         if (var1[this.field_1482] != null) {
            this.field_1480 = true;
            break;
         }
      }

   }

   public void remove() {
      if (this.field_1483 < 0) {
         throw new IllegalStateException("next must be called before remove.");
      } else {
         if (this.field_1483 >= this.field_1481.field_1503) {
            this.field_1481.method_1215(this.field_1483);
            this.field_1482 = this.field_1483 - 1;
            this.method_1204();
         } else {
            this.field_1481.field_1501[this.field_1483] = null;
            this.field_1481.field_1502[this.field_1483] = null;
         }

         this.field_1483 = -1;
         --this.field_1481.field_1500;
      }
   }
}
