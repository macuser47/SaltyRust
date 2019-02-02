package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.class_39;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.t
class class_202 implements Iterator {
   // $FF: renamed from: b int
   private int field_1675;
   // $FF: renamed from: c int
   private int field_1676;
   // $FF: renamed from: d int
   private int field_1677;
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.s
   // $FF: synthetic field
   final class_201 field_1678;

   private class_202(class_201 var1) {
      this.field_1678 = var1;
      this.field_1675 = this.field_1678.field_1673;
      this.field_1676 = -1;
      this.field_1677 = class_201.method_1334(this.field_1678);
   }

   public boolean hasNext() {
      return this.field_1675 != 0;
   }

   // $FF: renamed from: a () com.corrodinggames.rts.game.units.aa
   public class_39 method_1338() {
      class_201 var1 = this.field_1678;
      int var2 = this.field_1675;
      if (class_201.method_1335(var1) != this.field_1677) {
         throw new ConcurrentModificationException();
      } else if (var2 == 0) {
         throw new NoSuchElementException();
      } else {
         this.field_1675 = var2 - 1;
         return var1.field_1674[this.field_1676 = var1.field_1673 - var2];
      }
   }

   public void remove() {
      class_39[] var1 = this.field_1678.field_1674;
      int var2 = this.field_1676;
      if (class_201.method_1336(this.field_1678) != this.field_1677) {
         throw new ConcurrentModificationException();
      } else if (var2 < 0) {
         throw new IllegalStateException();
      } else {
         System.arraycopy(var1, var2 + 1, var1, var2, this.field_1675);
         var1[--this.field_1678.field_1673] = null;
         this.field_1676 = -1;
         this.field_1677 = class_201.method_1337(this.field_1678);
      }
   }

   // $FF: synthetic method
   public Object next() {
      return this.method_1338();
   }

   // $FF: synthetic method
   class_202(class_201 var1, s$1 var2) {
      this(var1);
   }
}
