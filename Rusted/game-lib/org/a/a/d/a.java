package org.a.a.d;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.a.a.c.class_16;
import org.a.a.e.class_17;

public interface a extends org.a.a.a.a, c {
   class_16 a();

   class_17 b();

   class_17 a(int var1);

   a a(int var1, int var2);

   @Deprecated
   Float b(int var1);

   // $FF: synthetic method
   default Iterator iterator() {
      return this.a();
   }

   // $FF: synthetic method
   default List subList(int var1, int var2) {
      return this.a(var1, var2);
   }

   // $FF: synthetic method
   default ListIterator listIterator(int var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   default ListIterator listIterator() {
      return this.b();
   }

   // $FF: synthetic method
   @Deprecated
   default Object remove(int var1) {
      return this.b(var1);
   }
}
