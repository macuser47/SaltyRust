package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.h
class class_190 implements Iterator {
   // $FF: renamed from: b int
   private int field_1604;
   // $FF: renamed from: c int
   private int field_1605;
   // $FF: renamed from: d int
   private int field_1606;
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.g
   // $FF: synthetic field
   final class_181 field_1607;

   private class_190(class_181 var1) {
      this.field_1607 = var1;
      this.field_1604 = class_181.method_1266(this.field_1607);
      this.field_1605 = class_181.method_1267(this.field_1607);
      this.field_1606 = -1;
   }

   public boolean hasNext() {
      return this.field_1604 != this.field_1605;
   }

   public Object next() {
      if (this.field_1604 == this.field_1605) {
         throw new NoSuchElementException();
      } else {
         Object var1 = class_181.method_1268(this.field_1607)[this.field_1604];
         if (class_181.method_1267(this.field_1607) == this.field_1605 && var1 != null) {
            this.field_1606 = this.field_1604;
            this.field_1604 = this.field_1604 + 1 & class_181.method_1268(this.field_1607).length - 1;
            return var1;
         } else {
            throw new ConcurrentModificationException();
         }
      }
   }

   public void remove() {
      if (this.field_1606 < 0) {
         throw new IllegalStateException();
      } else {
         if (class_181.method_1269(this.field_1607, this.field_1606)) {
            this.field_1604 = this.field_1604 - 1 & class_181.method_1268(this.field_1607).length - 1;
            this.field_1605 = class_181.method_1267(this.field_1607);
         }

         this.field_1606 = -1;
      }
   }

   // $FF: synthetic method
   class_190(class_181 var1, g$1 var2) {
      this(var1);
   }
}
