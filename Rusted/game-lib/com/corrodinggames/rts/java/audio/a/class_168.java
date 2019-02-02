package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.p
public class class_168 extends class_167 {
   // $FF: renamed from: a com.corrodinggames.rts.java.audio.a.q
   class_170 field_1485 = new class_170();

   public class_168(class_173 var1) {
      super(var1);
   }

   // $FF: renamed from: a () com.corrodinggames.rts.java.audio.a.q
   public class_170 method_1205() {
      if (!this.b) {
         throw new NoSuchElementException();
      } else if (!this.f) {
         throw new class_145("#iterator() cannot be used nested.");
      } else {
         Object[] var1 = this.c.field_1501;
         this.field_1485.field_1487 = var1[this.d];
         this.field_1485.field_1488 = this.c.field_1502[this.d];
         this.e = this.d;
         this.d();
         return this.field_1485;
      }
   }

   public boolean hasNext() {
      if (!this.f) {
         throw new class_145("#iterator() cannot be used nested.");
      } else {
         return this.b;
      }
   }

   // $FF: renamed from: b () com.corrodinggames.rts.java.audio.a.p
   public class_168 method_1206() {
      return this;
   }

   // $FF: synthetic method
   public Iterator iterator() {
      return this.method_1206();
   }

   // $FF: synthetic method
   public Object next() {
      return this.method_1205();
   }
}
