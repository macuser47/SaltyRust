package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.f
public class class_157 extends class_156 implements Iterable, Iterator {
   // $FF: renamed from: f com.corrodinggames.rts.java.audio.a.g
   private class_158 field_1442 = new class_158();

   public class_157(class_161 var1) {
      super(var1);
   }

   // $FF: renamed from: a () com.corrodinggames.rts.java.audio.a.g
   public class_158 method_1172() {
      if (!this.a) {
         throw new NoSuchElementException();
      } else if (!this.e) {
         throw new class_145("#iterator() cannot be used nested.");
      } else {
         int[] var1 = this.b.field_1452;
         if (this.c == -1) {
            this.field_1442.field_1443 = 0;
            this.field_1442.field_1444 = this.b.field_1456;
         } else {
            this.field_1442.field_1443 = var1[this.c];
            this.field_1442.field_1444 = this.b.field_1453[this.c];
         }

         this.d = this.c;
         this.c();
         return this.field_1442;
      }
   }

   public boolean hasNext() {
      if (!this.e) {
         throw new class_145("#iterator() cannot be used nested.");
      } else {
         return this.a;
      }
   }

   public Iterator iterator() {
      return this;
   }

   public void remove() {
      super.remove();
   }

   // $FF: synthetic method
   public Object next() {
      return this.method_1172();
   }
}
