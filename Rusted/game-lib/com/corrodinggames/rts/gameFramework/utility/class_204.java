package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.class_34;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.r
class class_204 implements Iterator {
   // $FF: renamed from: b int
   private int field_1683;
   // $FF: renamed from: c int
   private int field_1684;
   // $FF: renamed from: d int
   private int field_1685;
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.q
   // $FF: synthetic field
   final class_203 field_1686;

   private class_204(class_203 var1) {
      this.field_1686 = var1;
      this.field_1683 = this.field_1686.field_1680;
      this.field_1684 = -1;
      this.field_1685 = class_203.method_1348(this.field_1686);
   }

   public boolean hasNext() {
      return this.field_1683 != 0;
   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.u
   public class_34 method_1354() {
      class_203 var1 = this.field_1686;
      int var2 = this.field_1683;
      if (class_203.method_1349(var1) != this.field_1685) {
         throw new ConcurrentModificationException("on:" + this.field_1686.field_1682 + " (modCount:" + class_203.method_1350(this.field_1686) + " expectedModCount:" + this.field_1685 + ")");
      } else if (var2 == 0) {
         throw new NoSuchElementException();
      } else {
         this.field_1683 = var2 - 1;
         return var1.field_1681[this.field_1684 = var1.field_1680 - var2];
      }
   }

   public void remove() {
      class_34[] var1 = this.field_1686.field_1681;
      int var2 = this.field_1684;
      if (class_203.method_1351(this.field_1686) != this.field_1685) {
         throw new ConcurrentModificationException("on:" + this.field_1686.field_1682 + " (modCount:" + class_203.method_1352(this.field_1686) + " expectedModCount:" + this.field_1685 + ")");
      } else if (var2 < 0) {
         throw new IllegalStateException();
      } else {
         System.arraycopy(var1, var2 + 1, var1, var2, this.field_1683);
         var1[--this.field_1686.field_1680] = null;
         this.field_1684 = -1;
         this.field_1685 = class_203.method_1353(this.field_1686);
      }
   }

   // $FF: synthetic method
   public Object next() {
      return this.method_1354();
   }

   // $FF: synthetic method
   class_204(class_203 var1, q$1 var2) {
      this(var1);
   }
}
