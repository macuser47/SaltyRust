package org.a.a.d;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.a.a.c.class_18;
import org.a.a.e.class_19;

public interface b extends org.a.a.a.b, c {
   class_18 a();

   class_19 b();

   class_19 a(int var1);

   b a(int var1, int var2);

   @Deprecated
   Integer b(int var1);

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
