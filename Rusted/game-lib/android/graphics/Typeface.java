package android.graphics;

import android.util.SparseArray;

public class Typeface {
   // $FF: renamed from: a android.graphics.Typeface
   public static final Typeface field_2360 = method_1916((String)null, 0);
   // $FF: renamed from: b android.graphics.Typeface
   public static final Typeface field_2361 = method_1916((String)null, 1);
   // $FF: renamed from: c android.graphics.Typeface
   public static final Typeface field_2362 = method_1916("sans-serif", 0);
   // $FF: renamed from: d android.graphics.Typeface
   public static final Typeface field_2363 = method_1916("serif", 0);
   // $FF: renamed from: e android.graphics.Typeface
   public static final Typeface field_2364 = method_1916("monospace", 0);
   // $FF: renamed from: f android.graphics.Typeface[]
   static Typeface[] field_2365;
   // $FF: renamed from: i android.util.SparseArray
   private static final SparseArray field_2366 = new SparseArray(3);
   // $FF: renamed from: g int
   int field_2367;
   // $FF: renamed from: j int
   private int field_2368 = 0;
   // $FF: renamed from: h java.lang.String
   String field_2369;

   // $FF: renamed from: a () boolean
   public final boolean method_1915() {
      return (this.field_2368 & 1) != 0;
   }

   // $FF: renamed from: a (java.lang.String, int) android.graphics.Typeface
   public static Typeface method_1916(String var0, int var1) {
      Typeface var2 = new Typeface(0);
      var2.field_2368 = var1;
      var2.field_2369 = var0;
      return var2;
   }

   // $FF: renamed from: a (android.graphics.Typeface, int) android.graphics.Typeface
   public static Typeface method_1917(Typeface var0, int var1) {
      int var2 = 0;
      if (var0 != null) {
         if (var0.field_2368 == var1) {
            return var0;
         }

         var2 = var0.field_2367;
      }

      SparseArray var4 = (SparseArray)field_2366.method_2427(var2);
      Typeface var3;
      if (var4 != null) {
         var3 = (Typeface)var4.method_2427(var1);
         if (var3 != null) {
            return var3;
         }
      }

      var3 = new Typeface(0);
      var3.field_2368 = var1;
      var3.field_2369 = var0.field_2369;
      if (var4 == null) {
         var4 = new SparseArray(4);
         field_2366.method_2430(var2, var4);
      }

      var4.method_2430(var1, var3);
      return var3;
   }

   private Typeface(int var1) {
      this.field_2367 = var1;
      this.field_2368 = method_1919(var1);
   }

   protected void finalize() {
      try {
         method_1918(this.field_2367);
      } finally {
         super.finalize();
      }

   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Typeface var2 = (Typeface)var1;
         return this.field_2368 == var2.field_2368 && this.field_2367 == var2.field_2367;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = this.field_2367;
      var1 = 31 * var1 + this.field_2368;
      return var1;
   }

   // $FF: renamed from: a (int) void
   private static void method_1918(int var0) {
   }

   // $FF: renamed from: b (int) int
   private static int method_1919(int var0) {
      return 0;
   }

   static {
      field_2365 = new Typeface[]{field_2360, field_2361, method_1916((String)null, 2), method_1916((String)null, 3)};
   }
}
