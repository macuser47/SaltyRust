package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.class_39;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.s
public final class class_201 extends AbstractList implements Serializable, Cloneable, RandomAccess {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.aa[]
   public static final class_39[] field_1672 = new class_39[0];
   // $FF: renamed from: b int
   public int field_1673;
   // $FF: renamed from: c com.corrodinggames.rts.game.units.aa[]
   transient class_39[] field_1674;

   public class_201() {
      this.field_1674 = field_1672;
   }

   // $FF: renamed from: a () com.corrodinggames.rts.game.units.aa[]
   public class_39[] method_1326() {
      return this.field_1674;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1327(class_39 var1) {
      class_39[] var2 = this.field_1674;
      int var3 = this.field_1673;
      if (var3 == var2.length) {
         class_39[] var4 = new class_39[var3 + (var3 < 6 ? 12 : var3 >> 1)];
         System.arraycopy(var2, 0, var4, 0, var3);
         var2 = var4;
         this.field_1674 = var4;
      }

      var2[var3] = var1;
      this.field_1673 = var3 + 1;
      ++this.modCount;
      return true;
   }

   // $FF: renamed from: a (int, com.corrodinggames.rts.game.units.aa) void
   public void method_1328(int var1, class_39 var2) {
      class_39[] var3 = this.field_1674;
      int var4 = this.field_1673;
      if (var1 > var4 || var1 < 0) {
         method_1330(var1, var4);
      }

      if (var4 < var3.length) {
         System.arraycopy(var3, var1, var3, var1 + 1, var4 - var1);
      } else {
         class_39[] var5 = new class_39[method_1329(var4)];
         System.arraycopy(var3, 0, var5, 0, var1);
         System.arraycopy(var3, var1, var5, var1 + 1, var4 - var1);
         var3 = var5;
         this.field_1674 = var5;
      }

      var3[var1] = var2;
      this.field_1673 = var4 + 1;
      ++this.modCount;
   }

   // $FF: renamed from: c (int) int
   private static int method_1329(int var0) {
      int var1 = var0 < 6 ? 12 : var0 >> 1;
      return var0 + var1;
   }

   public boolean addAll(Collection var1) {
      class_39[] var2 = (class_39[])((class_39[])var1.toArray());
      int var3 = var2.length;
      if (var3 == 0) {
         return false;
      } else {
         class_39[] var4 = this.field_1674;
         int var5 = this.field_1673;
         int var6 = var5 + var3;
         if (var6 > var4.length) {
            int var7 = method_1329(var6 - 1);
            class_39[] var8 = new class_39[var7];
            System.arraycopy(var4, 0, var8, 0, var5);
            var4 = var8;
            this.field_1674 = var8;
         }

         System.arraycopy(var2, 0, var4, var5, var3);
         this.field_1673 = var6;
         ++this.modCount;
         return true;
      }
   }

   public boolean addAll(int var1, Collection var2) {
      int var3 = this.field_1673;
      if (var1 > var3 || var1 < 0) {
         method_1330(var1, var3);
      }

      class_39[] var4 = (class_39[])((class_39[])var2.toArray());
      int var5 = var4.length;
      if (var5 == 0) {
         return false;
      } else {
         class_39[] var6 = this.field_1674;
         int var7 = var3 + var5;
         if (var7 <= var6.length) {
            System.arraycopy(var6, var1, var6, var1 + var5, var3 - var1);
         } else {
            int var8 = method_1329(var7 - 1);
            class_39[] var9 = new class_39[var8];
            System.arraycopy(var6, 0, var9, 0, var1);
            System.arraycopy(var6, var1, var9, var1 + var5, var3 - var1);
            var6 = var9;
            this.field_1674 = var9;
         }

         System.arraycopy(var4, 0, var6, var1, var5);
         this.field_1673 = var7;
         ++this.modCount;
         return true;
      }
   }

   // $FF: renamed from: a (int, int) java.lang.IndexOutOfBoundsException
   static IndexOutOfBoundsException method_1330(int var0, int var1) {
      throw new IndexOutOfBoundsException("Invalid index " + var0 + ", size is " + var1);
   }

   public void clear() {
      if (this.field_1673 != 0) {
         Arrays.fill(this.field_1674, 0, this.field_1673, (Object)null);
         this.field_1673 = 0;
         ++this.modCount;
      }

   }

   public Object clone() {
      try {
         class_201 var1 = (class_201)super.clone();
         var1.field_1674 = (class_39[])this.field_1674.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError();
      }
   }

   // $FF: renamed from: a (int) com.corrodinggames.rts.game.units.aa
   public class_39 method_1331(int var1) {
      if (var1 >= this.field_1673) {
         method_1330(var1, this.field_1673);
      }

      return this.field_1674[var1];
   }

   public final int size() {
      return this.field_1673;
   }

   public final boolean isEmpty() {
      return this.field_1673 == 0;
   }

   public boolean contains(Object var1) {
      class_39[] var2 = this.field_1674;
      int var3 = this.field_1673;
      int var4;
      if (var1 != null) {
         for(var4 = 0; var4 < var3; ++var4) {
            if (var1.equals(var2[var4])) {
               return true;
            }
         }
      } else {
         for(var4 = 0; var4 < var3; ++var4) {
            if (var2[var4] == null) {
               return true;
            }
         }
      }

      return false;
   }

   public int indexOf(Object var1) {
      class_39[] var2 = this.field_1674;
      int var3 = this.field_1673;
      int var4;
      if (var1 != null) {
         for(var4 = 0; var4 < var3; ++var4) {
            if (var1.equals(var2[var4])) {
               return var4;
            }
         }
      } else {
         for(var4 = 0; var4 < var3; ++var4) {
            if (var2[var4] == null) {
               return var4;
            }
         }
      }

      return -1;
   }

   public int lastIndexOf(Object var1) {
      class_39[] var2 = this.field_1674;
      int var3;
      if (var1 != null) {
         for(var3 = this.field_1673 - 1; var3 >= 0; --var3) {
            if (var1.equals(var2[var3])) {
               return var3;
            }
         }
      } else {
         for(var3 = this.field_1673 - 1; var3 >= 0; --var3) {
            if (var2[var3] == null) {
               return var3;
            }
         }
      }

      return -1;
   }

   // $FF: renamed from: b (int) com.corrodinggames.rts.game.units.aa
   public class_39 method_1332(int var1) {
      class_39[] var2 = this.field_1674;
      int var3 = this.field_1673;
      if (var1 >= var3) {
         method_1330(var1, var3);
      }

      class_39 var4 = (class_39)var2[var1];
      int var10001 = var1 + 1;
      --var3;
      System.arraycopy(var2, var10001, var2, var1, var3 - var1);
      var2[var3] = null;
      this.field_1673 = var3;
      ++this.modCount;
      return var4;
   }

   public boolean remove(Object var1) {
      class_39[] var2 = this.field_1674;
      int var3 = this.field_1673;
      int var10001;
      int var4;
      if (var1 != null) {
         for(var4 = 0; var4 < var3; ++var4) {
            if (var1.equals(var2[var4])) {
               var10001 = var4 + 1;
               --var3;
               System.arraycopy(var2, var10001, var2, var4, var3 - var4);
               var2[var3] = null;
               this.field_1673 = var3;
               ++this.modCount;
               return true;
            }
         }
      } else {
         for(var4 = 0; var4 < var3; ++var4) {
            if (var2[var4] == null) {
               var10001 = var4 + 1;
               --var3;
               System.arraycopy(var2, var10001, var2, var4, var3 - var4);
               var2[var3] = null;
               this.field_1673 = var3;
               ++this.modCount;
               return true;
            }
         }
      }

      return false;
   }

   protected void removeRange(int var1, int var2) {
      if (var1 != var2) {
         class_39[] var3 = this.field_1674;
         int var4 = this.field_1673;
         if (var1 >= var4) {
            throw new IndexOutOfBoundsException("fromIndex " + var1 + " >= size " + this.field_1673);
         } else if (var2 > var4) {
            throw new IndexOutOfBoundsException("toIndex " + var2 + " > size " + this.field_1673);
         } else if (var1 > var2) {
            throw new IndexOutOfBoundsException("fromIndex " + var1 + " > toIndex " + var2);
         } else {
            System.arraycopy(var3, var2, var3, var1, var4 - var2);
            int var5 = var2 - var1;
            Arrays.fill(var3, var4 - var5, var4, (Object)null);
            this.field_1673 = var4 - var5;
            ++this.modCount;
         }
      }
   }

   // $FF: renamed from: b (int, com.corrodinggames.rts.game.units.aa) com.corrodinggames.rts.game.units.aa
   public class_39 method_1333(int var1, class_39 var2) {
      class_39[] var3 = this.field_1674;
      if (var1 >= this.field_1673) {
         method_1330(var1, this.field_1673);
      }

      class_39 var4 = (class_39)var3[var1];
      var3[var1] = var2;
      return var4;
   }

   public Object[] toArray() {
      int var1 = this.field_1673;
      Object[] var2 = new Object[var1];
      System.arraycopy(this.field_1674, 0, var2, 0, var1);
      return var2;
   }

   public Object[] toArray(Object[] var1) {
      int var2 = this.field_1673;
      if (var1.length < var2) {
         Object[] var3 = (Object[])((Object[])Array.newInstance(var1.getClass().getComponentType(), var2));
         var1 = var3;
      }

      System.arraycopy(this.field_1674, 0, var1, 0, var2);
      if (var1.length > var2) {
         var1[var2] = null;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class_202(this, (s$1)null);
   }

   public int hashCode() {
      class_39[] var1 = this.field_1674;
      int var2 = 1;
      int var3 = 0;

      for(int var4 = this.field_1673; var3 < var4; ++var3) {
         class_39 var5 = var1[var3];
         var2 = 31 * var2 + (var5 == null ? 0 : var5.hashCode());
      }

      return var2;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof List)) {
         return false;
      } else {
         List var2 = (List)var1;
         int var3 = this.field_1673;
         if (var2.size() != var3) {
            return false;
         } else {
            class_39[] var4 = this.field_1674;
            if (!(var2 instanceof RandomAccess)) {
               Iterator var9 = var2.iterator();

               for(int var10 = 0; var10 < var3; ++var10) {
                  class_39 var11 = var4[var10];
                  Object var8 = var9.next();
                  if (var11 == null) {
                     if (var8 != null) {
                        return false;
                     }
                  } else if (!var11.equals(var8)) {
                     return false;
                  }
               }

               return true;
            } else {
               int var5 = 0;

               while(true) {
                  if (var5 >= var3) {
                     return true;
                  }

                  class_39 var6 = var4[var5];
                  Object var7 = var2.get(var5);
                  if (var6 == null) {
                     if (var7 != null) {
                        break;
                     }
                  } else if (!var6.equals(var7)) {
                     break;
                  }

                  ++var5;
               }

               return false;
            }
         }
      }
   }

   // $FF: synthetic method
   public Object remove(int var1) {
      return this.method_1332(var1);
   }

   // $FF: synthetic method
   public void add(int var1, Object var2) {
      this.method_1328(var1, (class_39)var2);
   }

   // $FF: synthetic method
   public Object set(int var1, Object var2) {
      return this.method_1333(var1, (class_39)var2);
   }

   // $FF: synthetic method
   public Object get(int var1) {
      return this.method_1331(var1);
   }

   // $FF: synthetic method
   public boolean add(Object var1) {
      return this.method_1327((class_39)var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.s) int
   // $FF: synthetic method
   static int method_1334(class_201 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.utility.s) int
   // $FF: synthetic method
   static int method_1335(class_201 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.utility.s) int
   // $FF: synthetic method
   static int method_1336(class_201 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.gameFramework.utility.s) int
   // $FF: synthetic method
   static int method_1337(class_201 var0) {
      return ++var0.modCount;
   }
}
