package android.util;

import com.a.a.a.class_248;

public class SparseArray implements Cloneable {
   // $FF: renamed from: a java.lang.Object
   private static final Object field_3063 = new Object();
   // $FF: renamed from: b boolean
   private boolean field_3064;
   // $FF: renamed from: c int[]
   private int[] field_3065;
   // $FF: renamed from: d java.lang.Object[]
   private Object[] field_3066;
   // $FF: renamed from: e int
   private int field_3067;

   public SparseArray() {
      this(10);
   }

   public SparseArray(int var1) {
      this.field_3064 = false;
      if (var1 == 0) {
         this.field_3065 = class_262.field_2307;
         this.field_3066 = class_262.field_2309;
      } else {
         var1 = class_248.method_1786(var1);
         this.field_3065 = new int[var1];
         this.field_3066 = new Object[var1];
      }

      this.field_3067 = 0;
   }

   // $FF: renamed from: a () android.util.SparseArray
   public SparseArray method_2426() {
      SparseArray var1 = null;

      try {
         var1 = (SparseArray)super.clone();
         var1.field_3065 = (int[])this.field_3065.clone();
         var1.field_3066 = (Object[])this.field_3066.clone();
      } catch (CloneNotSupportedException var3) {
      }

      return var1;
   }

   // $FF: renamed from: a (int) java.lang.Object
   public Object method_2427(int var1) {
      return this.method_2428(var1, (Object)null);
   }

   // $FF: renamed from: a (int, java.lang.Object) java.lang.Object
   public Object method_2428(int var1, Object var2) {
      int var3 = class_262.method_1828(this.field_3065, this.field_3067, var1);
      return var3 >= 0 && this.field_3066[var3] != field_3063 ? this.field_3066[var3] : var2;
   }

   // $FF: renamed from: c () void
   private void method_2429() {
      int var1 = this.field_3067;
      int var2 = 0;
      int[] var3 = this.field_3065;
      Object[] var4 = this.field_3066;

      for(int var5 = 0; var5 < var1; ++var5) {
         Object var6 = var4[var5];
         if (var6 != field_3063) {
            if (var5 != var2) {
               var3[var2] = var3[var5];
               var4[var2] = var6;
               var4[var5] = null;
            }

            ++var2;
         }
      }

      this.field_3064 = false;
      this.field_3067 = var2;
   }

   // $FF: renamed from: b (int, java.lang.Object) void
   public void method_2430(int var1, Object var2) {
      int var3 = class_262.method_1828(this.field_3065, this.field_3067, var1);
      if (var3 >= 0) {
         this.field_3066[var3] = var2;
      } else {
         var3 = ~var3;
         if (var3 < this.field_3067 && this.field_3066[var3] == field_3063) {
            this.field_3065[var3] = var1;
            this.field_3066[var3] = var2;
            return;
         }

         if (this.field_3064 && this.field_3067 >= this.field_3065.length) {
            this.method_2429();
            var3 = ~class_262.method_1828(this.field_3065, this.field_3067, var1);
         }

         if (this.field_3067 >= this.field_3065.length) {
            int var4 = class_248.method_1786(this.field_3067 + 1);
            int[] var5 = new int[var4];
            Object[] var6 = new Object[var4];
            System.arraycopy(this.field_3065, 0, var5, 0, this.field_3065.length);
            System.arraycopy(this.field_3066, 0, var6, 0, this.field_3066.length);
            this.field_3065 = var5;
            this.field_3066 = var6;
         }

         if (this.field_3067 - var3 != 0) {
            System.arraycopy(this.field_3065, var3, this.field_3065, var3 + 1, this.field_3067 - var3);
            System.arraycopy(this.field_3066, var3, this.field_3066, var3 + 1, this.field_3067 - var3);
         }

         this.field_3065[var3] = var1;
         this.field_3066[var3] = var2;
         ++this.field_3067;
      }

   }

   // $FF: renamed from: b () int
   public int method_2431() {
      if (this.field_3064) {
         this.method_2429();
      }

      return this.field_3067;
   }

   // $FF: renamed from: b (int) int
   public int method_2432(int var1) {
      if (this.field_3064) {
         this.method_2429();
      }

      return this.field_3065[var1];
   }

   // $FF: renamed from: c (int) java.lang.Object
   public Object method_2433(int var1) {
      if (this.field_3064) {
         this.method_2429();
      }

      return this.field_3066[var1];
   }

   // $FF: renamed from: c (int, java.lang.Object) void
   public void method_2434(int var1, Object var2) {
      if (this.field_3067 != 0 && var1 <= this.field_3065[this.field_3067 - 1]) {
         this.method_2430(var1, var2);
      } else {
         if (this.field_3064 && this.field_3067 >= this.field_3065.length) {
            this.method_2429();
         }

         int var3 = this.field_3067;
         if (var3 >= this.field_3065.length) {
            int var4 = class_248.method_1786(var3 + 1);
            int[] var5 = new int[var4];
            Object[] var6 = new Object[var4];
            System.arraycopy(this.field_3065, 0, var5, 0, this.field_3065.length);
            System.arraycopy(this.field_3066, 0, var6, 0, this.field_3066.length);
            this.field_3065 = var5;
            this.field_3066 = var6;
         }

         this.field_3065[var3] = var1;
         this.field_3066[var3] = var2;
         this.field_3067 = var3 + 1;
      }
   }

   public String toString() {
      if (this.method_2431() <= 0) {
         return "{}";
      } else {
         StringBuilder var1 = new StringBuilder(this.field_3067 * 28);
         var1.append('{');

         for(int var2 = 0; var2 < this.field_3067; ++var2) {
            if (var2 > 0) {
               var1.append(", ");
            }

            int var3 = this.method_2432(var2);
            var1.append(var3);
            var1.append('=');
            Object var4 = this.method_2433(var2);
            if (var4 != this) {
               var1.append(var4);
            } else {
               var1.append("(this Map)");
            }
         }

         var1.append('}');
         return var1.toString();
      }
   }

   // $FF: synthetic method
   public Object clone() {
      return this.method_2426();
   }
}
