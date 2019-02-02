package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.j
public class class_152 extends class_151 implements Iterable, Iterator {
   // $FF: renamed from: f com.corrodinggames.rts.java.audio.a.k
   private class_153 field_1415 = new class_153();

   public class_152(class_154 var1) {
      super(var1);
   }

   // $FF: renamed from: a () com.corrodinggames.rts.java.audio.a.k
   public class_153 method_1152() {
      if (!this.a) {
         throw new NoSuchElementException();
      } else if (!this.e) {
         throw new class_145("#iterator() cannot be used nested.");
      } else {
         long[] var1 = this.b.field_1419;
         if (this.c == -1) {
            this.field_1415.field_1416 = 0L;
            this.field_1415.field_1417 = this.b.field_1423;
         } else {
            this.field_1415.field_1416 = var1[this.c];
            this.field_1415.field_1417 = this.b.field_1420[this.c];
         }

         this.d = this.c;
         this.c();
         return this.field_1415;
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
      return this.method_1152();
   }
}
