package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.n
class class_200 implements Iterator {
   // $FF: renamed from: b int
   private int field_1668;
   // $FF: renamed from: c int
   private int field_1669;
   // $FF: renamed from: d int
   private int field_1670;
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.m
   // $FF: synthetic field
   final class_199 field_1671;

   private class_200(class_199 var1) {
      this.field_1671 = var1;
      this.field_1668 = this.field_1671.field_1666;
      this.field_1669 = -1;
      this.field_1670 = class_199.method_1322(this.field_1671);
   }

   public boolean hasNext() {
      return this.field_1668 != 0;
   }

   public Object next() {
      class_199 var1 = this.field_1671;
      int var2 = this.field_1668;
      if (class_199.method_1323(var1) != this.field_1670) {
         throw new ConcurrentModificationException();
      } else if (var2 == 0) {
         throw new NoSuchElementException();
      } else {
         this.field_1668 = var2 - 1;
         return var1.field_1667[this.field_1669 = var1.field_1666 - var2];
      }
   }

   public void remove() {
      Object[] var1 = this.field_1671.field_1667;
      int var2 = this.field_1669;
      if (class_199.method_1324(this.field_1671) != this.field_1670) {
         throw new ConcurrentModificationException();
      } else if (var2 < 0) {
         throw new IllegalStateException();
      } else {
         System.arraycopy(var1, var2 + 1, var1, var2, this.field_1668);
         var1[--this.field_1671.field_1666] = null;
         this.field_1669 = -1;
         this.field_1670 = class_199.method_1325(this.field_1671);
      }
   }

   // $FF: synthetic method
   class_200(class_199 var1, m$1 var2) {
      this(var1);
   }
}
