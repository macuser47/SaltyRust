package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.m
public final class class_199 extends AbstractList implements Serializable, Cloneable, RandomAccess {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.k
   public class_193 field_1664 = new class_193();
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.utility.k
   public class_193 field_1665 = new class_193();
   // $FF: renamed from: c int
   public int field_1666;
   // $FF: renamed from: d java.lang.Object[]
   transient Object[] field_1667;

   // $FF: renamed from: a (java.lang.Object) void
   public synchronized void method_1316(Object var1) {
      class_198 var2;
      if (this.field_1665.field_1647 != 0) {
         var2 = (class_198)this.field_1665.method_1301();
      } else {
         var2 = new class_198();
      }

      var2.field_1662 = class_197.field_1659;
      var2.field_1663 = var1;
      this.field_1664.add(var2);
   }

   // $FF: renamed from: b (java.lang.Object) void
   public synchronized void method_1317(Object var1) {
      class_198 var2;
      if (this.field_1665.field_1647 != 0) {
         var2 = (class_198)this.field_1665.method_1301();
      } else {
         var2 = new class_198();
      }

      var2.field_1662 = class_197.field_1660;
      var2.field_1663 = var1;
      this.field_1664.add(var2);
   }

   // $FF: renamed from: a () void
   public synchronized void method_1318() {
      if (this.field_1664.field_1647 != 0) {
         class_198 var2;
         for(Iterator var1 = this.field_1664.iterator(); var1.hasNext(); var2.field_1663 = null) {
            var2 = (class_198)var1.next();
            if (var2.field_1662 == class_197.field_1659) {
               this.add(var2.field_1663);
            } else {
               if (var2.field_1662 != class_197.field_1660) {
                  throw new RuntimeException("Unknown operationType:" + var2.field_1662);
               }

               this.remove(var2.field_1663);
            }
         }

         if (this.field_1664.size() < 100) {
            this.field_1665.addAll(this.field_1664);
         }

         this.field_1664.clear();
      }

   }

   public class_199() {
      this.field_1667 = class_208.field_1706;
   }

   // $FF: renamed from: b () java.lang.Object[]
   public Object[] method_1319() {
      return this.field_1667;
   }

   public boolean add(Object var1) {
      Object[] var2 = this.field_1667;
      int var3 = this.field_1666;
      if (var3 == var2.length) {
         Object[] var4 = new Object[var3 + (var3 < 6 ? 12 : var3 >> 1)];
         System.arraycopy(var2, 0, var4, 0, var3);
         var2 = var4;
         this.field_1667 = var4;
      }

      var2[var3] = var1;
      this.field_1666 = var3 + 1;
      ++this.modCount;
      return true;
   }

   public void add(int var1, Object var2) {
      Object[] var3 = this.field_1667;
      int var4 = this.field_1666;
      if (var1 > var4 || var1 < 0) {
         method_1321(var1, var4);
      }

      if (var4 < var3.length) {
         System.arraycopy(var3, var1, var3, var1 + 1, var4 - var1);
      } else {
         Object[] var5 = new Object[method_1320(var4)];
         System.arraycopy(var3, 0, var5, 0, var1);
         System.arraycopy(var3, var1, var5, var1 + 1, var4 - var1);
         var3 = var5;
         this.field_1667 = var5;
      }

      var3[var1] = var2;
      this.field_1666 = var4 + 1;
      ++this.modCount;
   }

   // $FF: renamed from: a (int) int
   private static int method_1320(int var0) {
      int var1 = var0 < 6 ? 12 : var0 >> 1;
      return var0 + var1;
   }

   public boolean addAll(Collection var1) {
      Object[] var2 = var1.toArray();
      int var3 = var2.length;
      if (var3 == 0) {
         return false;
      } else {
         Object[] var4 = this.field_1667;
         int var5 = this.field_1666;
         int var6 = var5 + var3;
         if (var6 > var4.length) {
            int var7 = method_1320(var6 - 1);
            Object[] var8 = new Object[var7];
            System.arraycopy(var4, 0, var8, 0, var5);
            var4 = var8;
            this.field_1667 = var8;
         }

         System.arraycopy(var2, 0, var4, var5, var3);
         this.field_1666 = var6;
         ++this.modCount;
         return true;
      }
   }

   public boolean addAll(int var1, Collection var2) {
      int var3 = this.field_1666;
      if (var1 > var3 || var1 < 0) {
         method_1321(var1, var3);
      }

      Object[] var4 = var2.toArray();
      int var5 = var4.length;
      if (var5 == 0) {
         return false;
      } else {
         Object[] var6 = this.field_1667;
         int var7 = var3 + var5;
         if (var7 <= var6.length) {
            System.arraycopy(var6, var1, var6, var1 + var5, var3 - var1);
         } else {
            int var8 = method_1320(var7 - 1);
            Object[] var9 = new Object[var8];
            System.arraycopy(var6, 0, var9, 0, var1);
            System.arraycopy(var6, var1, var9, var1 + var5, var3 - var1);
            var6 = var9;
            this.field_1667 = var9;
         }

         System.arraycopy(var4, 0, var6, var1, var5);
         this.field_1666 = var7;
         ++this.modCount;
         return true;
      }
   }

   // $FF: renamed from: a (int, int) java.lang.IndexOutOfBoundsException
   static IndexOutOfBoundsException method_1321(int var0, int var1) {
      throw new IndexOutOfBoundsException("Invalid index " + var0 + ", size is " + var1);
   }

   public synchronized void clear() {
      this.field_1664.clear();
      if (this.field_1666 != 0) {
         Arrays.fill(this.field_1667, 0, this.field_1666, (Object)null);
         this.field_1666 = 0;
         ++this.modCount;
      }

   }

   public Object clone() {
      try {
         class_199 var1 = (class_199)super.clone();
         var1.field_1667 = (Object[])this.field_1667.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError();
      }
   }

   public Object get(int var1) {
      if (var1 >= this.field_1666) {
         method_1321(var1, this.field_1666);
      }

      return this.field_1667[var1];
   }

   public int size() {
      return this.field_1666;
   }

   public boolean isEmpty() {
      return this.field_1666 == 0;
   }

   public boolean contains(Object var1) {
      Object[] var2 = this.field_1667;
      int var3 = this.field_1666;
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
      Object[] var2 = this.field_1667;
      int var3 = this.field_1666;
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
      Object[] var2 = this.field_1667;
      int var3;
      if (var1 != null) {
         for(var3 = this.field_1666 - 1; var3 >= 0; --var3) {
            if (var1.equals(var2[var3])) {
               return var3;
            }
         }
      } else {
         for(var3 = this.field_1666 - 1; var3 >= 0; --var3) {
            if (var2[var3] == null) {
               return var3;
            }
         }
      }

      return -1;
   }

   public Object remove(int var1) {
      Object[] var2 = this.field_1667;
      int var3 = this.field_1666;
      if (var1 >= var3) {
         method_1321(var1, var3);
      }

      Object var4 = var2[var1];
      int var10001 = var1 + 1;
      --var3;
      System.arraycopy(var2, var10001, var2, var1, var3 - var1);
      var2[var3] = null;
      this.field_1666 = var3;
      ++this.modCount;
      return var4;
   }

   public boolean remove(Object var1) {
      Object[] var2 = this.field_1667;
      int var3 = this.field_1666;
      int var10001;
      int var4;
      if (var1 != null) {
         for(var4 = 0; var4 < var3; ++var4) {
            if (var1.equals(var2[var4])) {
               var10001 = var4 + 1;
               --var3;
               System.arraycopy(var2, var10001, var2, var4, var3 - var4);
               var2[var3] = null;
               this.field_1666 = var3;
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
               this.field_1666 = var3;
               ++this.modCount;
               return true;
            }
         }
      }

      return false;
   }

   protected void removeRange(int var1, int var2) {
      if (var1 != var2) {
         Object[] var3 = this.field_1667;
         int var4 = this.field_1666;
         if (var1 >= var4) {
            throw new IndexOutOfBoundsException("fromIndex " + var1 + " >= size " + this.field_1666);
         } else if (var2 > var4) {
            throw new IndexOutOfBoundsException("toIndex " + var2 + " > size " + this.field_1666);
         } else if (var1 > var2) {
            throw new IndexOutOfBoundsException("fromIndex " + var1 + " > toIndex " + var2);
         } else {
            System.arraycopy(var3, var2, var3, var1, var4 - var2);
            int var5 = var2 - var1;
            Arrays.fill(var3, var4 - var5, var4, (Object)null);
            this.field_1666 = var4 - var5;
            ++this.modCount;
         }
      }
   }

   public Object set(int var1, Object var2) {
      Object[] var3 = this.field_1667;
      if (var1 >= this.field_1666) {
         method_1321(var1, this.field_1666);
      }

      Object var4 = var3[var1];
      var3[var1] = var2;
      return var4;
   }

   public Object[] toArray() {
      int var1 = this.field_1666;
      Object[] var2 = new Object[var1];
      System.arraycopy(this.field_1667, 0, var2, 0, var1);
      return var2;
   }

   public Object[] toArray(Object[] var1) {
      int var2 = this.field_1666;
      if (var1.length < var2) {
         Object[] var3 = (Object[])((Object[])Array.newInstance(var1.getClass().getComponentType(), var2));
         var1 = var3;
      }

      System.arraycopy(this.field_1667, 0, var1, 0, var2);
      if (var1.length > var2) {
         var1[var2] = null;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class_200(this, (m$1)null);
   }

   public int hashCode() {
      Object[] var1 = this.field_1667;
      int var2 = 1;
      int var3 = 0;

      for(int var4 = this.field_1666; var3 < var4; ++var3) {
         Object var5 = var1[var3];
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
         int var3 = this.field_1666;
         if (var2.size() != var3) {
            return false;
         } else {
            Object[] var4 = this.field_1667;
            Object var7;
            if (!(var2 instanceof RandomAccess)) {
               Iterator var9 = var2.iterator();

               for(int var10 = 0; var10 < var3; ++var10) {
                  var7 = var4[var10];
                  Object var8 = var9.next();
                  if (var7 == null) {
                     if (var8 != null) {
                        return false;
                     }
                  } else if (!var7.equals(var8)) {
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

                  Object var6 = var4[var5];
                  var7 = var2.get(var5);
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

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.m) int
   // $FF: synthetic method
   static int method_1322(class_199 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.utility.m) int
   // $FF: synthetic method
   static int method_1323(class_199 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.utility.m) int
   // $FF: synthetic method
   static int method_1324(class_199 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.gameFramework.utility.m) int
   // $FF: synthetic method
   static int method_1325(class_199 var0) {
      return ++var0.modCount;
   }
}
