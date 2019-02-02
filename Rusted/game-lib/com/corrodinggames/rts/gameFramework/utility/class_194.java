package com.corrodinggames.rts.gameFramework.utility;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.l
class class_194 implements Iterator {
   // $FF: renamed from: b int
   private int field_1649;
   // $FF: renamed from: c int
   private int field_1650;
   // $FF: renamed from: d int
   private int field_1651;
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.k
   // $FF: synthetic field
   final class_193 field_1652;

   private class_194(class_193 var1) {
      this.field_1652 = var1;
      this.field_1649 = this.field_1652.field_1647;
      this.field_1650 = -1;
      this.field_1651 = class_193.method_1302(this.field_1652);
   }

   public boolean hasNext() {
      return this.field_1649 != 0;
   }

   public Object next() {
      class_193 var1 = this.field_1652;
      int var2 = this.field_1649;
      if (class_193.method_1303(var1) != this.field_1651) {
         throw new ConcurrentModificationException();
      } else if (var2 == 0) {
         throw new NoSuchElementException();
      } else {
         this.field_1649 = var2 - 1;
         return var1.field_1648[this.field_1650 = var1.field_1647 - var2];
      }
   }

   public void remove() {
      Object[] var1 = this.field_1652.field_1648;
      int var2 = this.field_1650;
      if (class_193.method_1304(this.field_1652) != this.field_1651) {
         throw new ConcurrentModificationException();
      } else if (var2 < 0) {
         throw new IllegalStateException();
      } else {
         System.arraycopy(var1, var2 + 1, var1, var2, this.field_1649);
         var1[--this.field_1652.field_1647] = null;
         this.field_1650 = -1;
         this.field_1651 = class_193.method_1305(this.field_1652);
      }
   }

   // $FF: synthetic method
   class_194(class_193 var1, k$1 var2) {
      this(var1);
   }
}
