package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.class_34;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.q
public final class class_203 extends AbstractList implements Serializable, Cloneable, RandomAccess {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.u[]
   public static final class_34[] field_1679 = new class_34[0];
   // $FF: renamed from: b int
   int field_1680;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.u[]
   transient class_34[] field_1681;
   // $FF: renamed from: d java.lang.String
   String field_1682;

   public class_203(String var1) {
      this.field_1681 = field_1679;
      this.field_1682 = var1;
   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.u[]
   public class_34[] method_1339() {
      return this.field_1681;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.u) boolean
   public boolean method_1340(class_34 var1) {
      class_34[] var2 = this.field_1681;
      int var3 = this.field_1680;
      if (var3 == var2.length) {
         class_34[] var4 = new class_34[var3 + (var3 < 6 ? 12 : var3 >> 1)];
         System.arraycopy(var2, 0, var4, 0, var3);
         var2 = var4;
         this.field_1681 = var4;
      }

      var2[var3] = var1;
      this.field_1680 = var3 + 1;
      ++this.modCount;
      return true;
   }

   // $FF: renamed from: a (int, com.corrodinggames.rts.gameFramework.u) void
   public void method_1341(int var1, class_34 var2) {
      class_34[] var3 = this.field_1681;
      int var4 = this.field_1680;
      if (var1 > var4 || var1 < 0) {
         method_1343(var1, var4);
      }

      if (var4 < var3.length) {
         System.arraycopy(var3, var1, var3, var1 + 1, var4 - var1);
      } else {
         class_34[] var5 = new class_34[method_1342(var4)];
         System.arraycopy(var3, 0, var5, 0, var1);
         System.arraycopy(var3, var1, var5, var1 + 1, var4 - var1);
         var3 = var5;
         this.field_1681 = var5;
      }

      var3[var1] = var2;
      this.field_1680 = var4 + 1;
      ++this.modCount;
   }

   // $FF: renamed from: c (int) int
   private static int method_1342(int var0) {
      int var1 = var0 < 6 ? 12 : var0 >> 1;
      return var0 + var1;
   }

   public boolean addAll(Collection var1) {
      class_34[] var2 = (class_34[])((class_34[])var1.toArray());
      int var3 = var2.length;
      if (var3 == 0) {
         return false;
      } else {
         class_34[] var4 = this.field_1681;
         int var5 = this.field_1680;
         int var6 = var5 + var3;
         if (var6 > var4.length) {
            int var7 = method_1342(var6 - 1);
            class_34[] var8 = new class_34[var7];
            System.arraycopy(var4, 0, var8, 0, var5);
            var4 = var8;
            this.field_1681 = var8;
         }

         System.arraycopy(var2, 0, var4, var5, var3);
         this.field_1680 = var6;
         ++this.modCount;
         return true;
      }
   }

   public boolean addAll(int var1, Collection var2) {
      int var3 = this.field_1680;
      if (var1 > var3 || var1 < 0) {
         method_1343(var1, var3);
      }

      class_34[] var4 = (class_34[])((class_34[])var2.toArray());
      int var5 = var4.length;
      if (var5 == 0) {
         return false;
      } else {
         class_34[] var6 = this.field_1681;
         int var7 = var3 + var5;
         if (var7 <= var6.length) {
            System.arraycopy(var6, var1, var6, var1 + var5, var3 - var1);
         } else {
            int var8 = method_1342(var7 - 1);
            class_34[] var9 = new class_34[var8];
            System.arraycopy(var6, 0, var9, 0, var1);
            System.arraycopy(var6, var1, var9, var1 + var5, var3 - var1);
            var6 = var9;
            this.field_1681 = var9;
         }

         System.arraycopy(var4, 0, var6, var1, var5);
         this.field_1680 = var7;
         ++this.modCount;
         return true;
      }
   }

   // $FF: renamed from: a (int, int) java.lang.IndexOutOfBoundsException
   static IndexOutOfBoundsException method_1343(int var0, int var1) {
      throw new IndexOutOfBoundsException("Invalid index " + var0 + ", size is " + var1);
   }

   public void clear() {
      if (this.field_1680 != 0) {
         Arrays.fill(this.field_1681, 0, this.field_1680, (Object)null);
         this.field_1680 = 0;
         ++this.modCount;
      }

   }

   // $FF: renamed from: b () void
   public void method_1344() {
      if (this.field_1680 != 0) {
         this.field_1680 = 0;
         ++this.modCount;
      }

   }

   public Object clone() {
      try {
         class_203 var1 = (class_203)super.clone();
         var1.field_1681 = (class_34[])this.field_1681.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError();
      }
   }

   // $FF: renamed from: a (int) com.corrodinggames.rts.gameFramework.u
   public class_34 method_1345(int var1) {
      if (var1 >= this.field_1680) {
         method_1343(var1, this.field_1680);
      }

      return this.field_1681[var1];
   }

   public int size() {
      return this.field_1680;
   }

   public boolean isEmpty() {
      return this.field_1680 == 0;
   }

   public boolean contains(Object var1) {
      class_34[] var2 = this.field_1681;
      int var3 = this.field_1680;
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
      class_34[] var2 = this.field_1681;
      int var3 = this.field_1680;
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
      class_34[] var2 = this.field_1681;
      int var3;
      if (var1 != null) {
         for(var3 = this.field_1680 - 1; var3 >= 0; --var3) {
            if (var1.equals(var2[var3])) {
               return var3;
            }
         }
      } else {
         for(var3 = this.field_1680 - 1; var3 >= 0; --var3) {
            if (var2[var3] == null) {
               return var3;
            }
         }
      }

      return -1;
   }

   // $FF: renamed from: b (int) com.corrodinggames.rts.gameFramework.u
   public class_34 method_1346(int var1) {
      class_34[] var2 = this.field_1681;
      int var3 = this.field_1680;
      if (var1 >= var3) {
         method_1343(var1, var3);
      }

      class_34 var4 = (class_34)var2[var1];
      int var10001 = var1 + 1;
      --var3;
      System.arraycopy(var2, var10001, var2, var1, var3 - var1);
      var2[var3] = null;
      this.field_1680 = var3;
      ++this.modCount;
      return var4;
   }

   public boolean remove(Object var1) {
      class_34[] var2 = this.field_1681;
      int var3 = this.field_1680;
      int var10001;
      int var4;
      if (var1 != null) {
         for(var4 = 0; var4 < var3; ++var4) {
            if (var1.equals(var2[var4])) {
               var10001 = var4 + 1;
               --var3;
               System.arraycopy(var2, var10001, var2, var4, var3 - var4);
               var2[var3] = null;
               this.field_1680 = var3;
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
               this.field_1680 = var3;
               ++this.modCount;
               return true;
            }
         }
      }

      return false;
   }

   protected void removeRange(int var1, int var2) {
      if (var1 != var2) {
         class_34[] var3 = this.field_1681;
         int var4 = this.field_1680;
         if (var1 >= var4) {
            throw new IndexOutOfBoundsException("fromIndex " + var1 + " >= size " + this.field_1680);
         } else if (var2 > var4) {
            throw new IndexOutOfBoundsException("toIndex " + var2 + " > size " + this.field_1680);
         } else if (var1 > var2) {
            throw new IndexOutOfBoundsException("fromIndex " + var1 + " > toIndex " + var2);
         } else {
            System.arraycopy(var3, var2, var3, var1, var4 - var2);
            int var5 = var2 - var1;
            Arrays.fill(var3, var4 - var5, var4, (Object)null);
            this.field_1680 = var4 - var5;
            ++this.modCount;
         }
      }
   }

   // $FF: renamed from: b (int, com.corrodinggames.rts.gameFramework.u) com.corrodinggames.rts.gameFramework.u
   public class_34 method_1347(int var1, class_34 var2) {
      class_34[] var3 = this.field_1681;
      if (var1 >= this.field_1680) {
         method_1343(var1, this.field_1680);
      }

      class_34 var4 = (class_34)var3[var1];
      var3[var1] = var2;
      return var4;
   }

   public Object[] toArray() {
      int var1 = this.field_1680;
      Object[] var2 = new Object[var1];
      System.arraycopy(this.field_1681, 0, var2, 0, var1);
      return var2;
   }

   public Object[] toArray(Object[] var1) {
      int var2 = this.field_1680;
      if (var1.length < var2) {
         Object[] var3 = (Object[])((Object[])Array.newInstance(var1.getClass().getComponentType(), var2));
         var1 = var3;
      }

      System.arraycopy(this.field_1681, 0, var1, 0, var2);
      if (var1.length > var2) {
         var1[var2] = null;
      }

      return var1;
   }

   public Iterator iterator() {
      return new class_204(this, (q$1)null);
   }

   public int hashCode() {
      class_34[] var1 = this.field_1681;
      int var2 = 1;
      int var3 = 0;

      for(int var4 = this.field_1680; var3 < var4; ++var3) {
         class_34 var5 = var1[var3];
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
         int var3 = this.field_1680;
         if (var2.size() != var3) {
            return false;
         } else {
            class_34[] var4 = this.field_1681;
            if (!(var2 instanceof RandomAccess)) {
               Iterator var9 = var2.iterator();

               for(int var10 = 0; var10 < var3; ++var10) {
                  class_34 var11 = var4[var10];
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

                  class_34 var6 = var4[var5];
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
      return this.method_1346(var1);
   }

   // $FF: synthetic method
   public void add(int var1, Object var2) {
      this.method_1341(var1, (class_34)var2);
   }

   // $FF: synthetic method
   public Object set(int var1, Object var2) {
      return this.method_1347(var1, (class_34)var2);
   }

   // $FF: synthetic method
   public Object get(int var1) {
      return this.method_1345(var1);
   }

   // $FF: synthetic method
   public boolean add(Object var1) {
      return this.method_1340((class_34)var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.q) int
   // $FF: synthetic method
   static int method_1348(class_203 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.utility.q) int
   // $FF: synthetic method
   static int method_1349(class_203 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.utility.q) int
   // $FF: synthetic method
   static int method_1350(class_203 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.gameFramework.utility.q) int
   // $FF: synthetic method
   static int method_1351(class_203 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: e (com.corrodinggames.rts.gameFramework.utility.q) int
   // $FF: synthetic method
   static int method_1352(class_203 var0) {
      return var0.modCount;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.gameFramework.utility.q) int
   // $FF: synthetic method
   static int method_1353(class_203 var0) {
      return ++var0.modCount;
   }
}
