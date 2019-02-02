package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.g
public class class_181 extends AbstractCollection implements Serializable, Cloneable {
   // $FF: renamed from: b java.lang.Object[]
   private transient Object[] field_1582 = (Object[])(new Object[16]);
   // $FF: renamed from: c int
   private transient int field_1583;
   // $FF: renamed from: d int
   private transient int field_1584;
   // $FF: renamed from: a boolean
   // $FF: synthetic field
   static final boolean field_1585 = !g.class.desiredAssertionStatus();

   // $FF: renamed from: e () void
   private void method_1256() {
      if (!field_1585 && this.field_1583 != this.field_1584) {
         throw new AssertionError();
      } else {
         int var1 = this.field_1583;
         int var2 = this.field_1582.length;
         int var3 = var2 - var1;
         int var4 = var2 << 1;
         if (var4 < 0) {
            throw new IllegalStateException("Sorry, deque too big");
         } else {
            Object[] var5 = new Object[var4];
            System.arraycopy(this.field_1582, var1, var5, 0, var3);
            System.arraycopy(this.field_1582, 0, var5, var3, var1);
            this.field_1582 = (Object[])var5;
            this.field_1583 = 0;
            this.field_1584 = var2;
         }
      }
   }

   // $FF: renamed from: a (java.lang.Object[]) java.lang.Object[]
   private Object[] method_1257(Object[] var1) {
      if (this.field_1583 < this.field_1584) {
         System.arraycopy(this.field_1582, this.field_1583, var1, 0, this.size());
      } else if (this.field_1583 > this.field_1584) {
         int var2 = this.field_1582.length - this.field_1583;
         System.arraycopy(this.field_1582, this.field_1583, var1, 0, var2);
         System.arraycopy(this.field_1582, 0, var1, var2, this.field_1584);
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.Object) void
   public void method_1258(Object var1) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field_1582[this.field_1584] = var1;
         if ((this.field_1584 = this.field_1584 + 1 & this.field_1582.length - 1) == this.field_1583) {
            this.method_1256();
         }

      }
   }

   // $FF: renamed from: a () java.lang.Object
   public Object method_1259() {
      Object var1 = this.method_1260();
      if (var1 == null) {
         throw new NoSuchElementException();
      } else {
         return var1;
      }
   }

   // $FF: renamed from: b () java.lang.Object
   public Object method_1260() {
      int var1 = this.field_1583;
      Object var2 = this.field_1582[var1];
      if (var2 == null) {
         return null;
      } else {
         this.field_1582[var1] = null;
         this.field_1583 = var1 + 1 & this.field_1582.length - 1;
         return var2;
      }
   }

   // $FF: renamed from: b (java.lang.Object) boolean
   public boolean method_1261(Object var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = this.field_1582.length - 1;

         Object var4;
         for(int var3 = this.field_1583; (var4 = this.field_1582[var3]) != null; var3 = var3 + 1 & var2) {
            if (var1.equals(var4)) {
               this.method_1264(var3);
               return true;
            }
         }

         return false;
      }
   }

   public boolean add(Object var1) {
      this.method_1258(var1);
      return true;
   }

   // $FF: renamed from: c () java.lang.Object
   public Object method_1262() {
      return this.method_1259();
   }

   // $FF: renamed from: f () void
   private void method_1263() {
      if (!field_1585 && this.field_1582[this.field_1584] != null) {
         throw new AssertionError();
      } else {
         if (!field_1585) {
            label36: {
               if (this.field_1583 == this.field_1584) {
                  if (this.field_1582[this.field_1583] == null) {
                     break label36;
                  }
               } else if (this.field_1582[this.field_1583] != null && this.field_1582[this.field_1584 - 1 & this.field_1582.length - 1] != null) {
                  break label36;
               }

               throw new AssertionError();
            }
         }

         if (!field_1585 && this.field_1582[this.field_1583 - 1 & this.field_1582.length - 1] != null) {
            throw new AssertionError();
         }
      }
   }

   // $FF: renamed from: a (int) boolean
   private boolean method_1264(int var1) {
      this.method_1263();
      Object[] var2 = this.field_1582;
      int var3 = var2.length - 1;
      int var4 = this.field_1583;
      int var5 = this.field_1584;
      int var6 = var1 - var4 & var3;
      int var7 = var5 - var1 & var3;
      if (var6 >= (var5 - var4 & var3)) {
         throw new ConcurrentModificationException();
      } else if (var6 < var7) {
         if (var4 <= var1) {
            System.arraycopy(var2, var4, var2, var4 + 1, var6);
         } else {
            System.arraycopy(var2, 0, var2, 1, var1);
            var2[0] = var2[var3];
            System.arraycopy(var2, var4, var2, var4 + 1, var3 - var4);
         }

         var2[var4] = null;
         this.field_1583 = var4 + 1 & var3;
         return false;
      } else {
         if (var1 < var5) {
            System.arraycopy(var2, var1 + 1, var2, var1, var7);
            this.field_1584 = var5 - 1;
         } else {
            System.arraycopy(var2, var1 + 1, var2, var1, var3 - var1);
            var2[var3] = var2[0];
            System.arraycopy(var2, 1, var2, 0, var5);
            this.field_1584 = var5 - 1 & var3;
         }

         return true;
      }
   }

   public int size() {
      return this.field_1584 - this.field_1583 & this.field_1582.length - 1;
   }

   public boolean isEmpty() {
      return this.field_1583 == this.field_1584;
   }

   public Iterator iterator() {
      return new class_190(this, (g$1)null);
   }

   public boolean contains(Object var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = this.field_1582.length - 1;

         Object var4;
         for(int var3 = this.field_1583; (var4 = this.field_1582[var3]) != null; var3 = var3 + 1 & var2) {
            if (var1.equals(var4)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean remove(Object var1) {
      return this.method_1261(var1);
   }

   public void clear() {
      int var1 = this.field_1583;
      int var2 = this.field_1584;
      if (var1 != var2) {
         this.field_1583 = this.field_1584 = 0;
         int var3 = var1;
         int var4 = this.field_1582.length - 1;

         do {
            this.field_1582[var3] = null;
            var3 = var3 + 1 & var4;
         } while(var3 != var2);
      }

   }

   public Object[] toArray() {
      return this.method_1257(new Object[this.size()]);
   }

   public Object[] toArray(Object[] var1) {
      int var2 = this.size();
      if (var1.length < var2) {
         var1 = (Object[])((Object[])Array.newInstance(var1.getClass().getComponentType(), var2));
      }

      this.method_1257(var1);
      if (var1.length > var2) {
         var1[var2] = null;
      }

      return var1;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.utility.g
   public class_181 method_1265() {
      try {
         class_181 var1 = (class_181)super.clone();
         var1.field_1582 = (Object[])this.field_1582.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError();
      }
   }

   // $FF: synthetic method
   public Object clone() {
      return this.method_1265();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.g) int
   // $FF: synthetic method
   static int method_1266(class_181 var0) {
      return var0.field_1583;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.utility.g) int
   // $FF: synthetic method
   static int method_1267(class_181 var0) {
      return var0.field_1584;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.utility.g) java.lang.Object[]
   // $FF: synthetic method
   static Object[] method_1268(class_181 var0) {
      return var0.field_1582;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.g, int) boolean
   // $FF: synthetic method
   static boolean method_1269(class_181 var0, int var1) {
      return var0.method_1264(var1);
   }
}
