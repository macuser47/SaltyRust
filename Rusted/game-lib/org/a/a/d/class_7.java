package org.a.a.d;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.a.a.a.class_6;
import org.a.a.c.class_20;
import org.a.a.e.class_21;

// $FF: renamed from: org.a.a.d.d
public interface class_7 extends class_6, c {
   // $FF: renamed from: a () org.a.a.c.d
   class_20 method_2();

   // $FF: renamed from: b () org.a.a.e.d
   class_21 method_5();

   // $FF: renamed from: a (int) org.a.a.e.d
   class_21 method_6(int var1);

   // $FF: renamed from: a (int, int) org.a.a.d.d
   class_7 method_7(int var1, int var2);

   // $FF: renamed from: b (int) java.lang.Short
   @Deprecated
   Short method_8(int var1);

   // $FF: synthetic method
   default Iterator iterator() {
      return this.method_2();
   }

   // $FF: synthetic method
   default List subList(int var1, int var2) {
      return this.method_7(var1, var2);
   }

   // $FF: synthetic method
   default ListIterator listIterator(int var1) {
      return this.method_6(var1);
   }

   // $FF: synthetic method
   default ListIterator listIterator() {
      return this.method_5();
   }

   // $FF: synthetic method
   @Deprecated
   default Object remove(int var1) {
      return this.method_8(var1);
   }
}
