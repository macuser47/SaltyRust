package android.graphics;

public class Matrix {
   // $FF: renamed from: a android.graphics.Matrix
   public static Matrix field_2224 = new Matrix$1();
   // $FF: renamed from: b int
   public int field_2225 = method_1793(0);

   public boolean equals(Object var1) {
      return !(var1 instanceof Matrix) ? false : method_1799(this.field_2225, ((Matrix)var1).field_2225);
   }

   public int hashCode() {
      return 44;
   }

   // $FF: renamed from: a () void
   public void method_1787() {
      method_1794(this.field_2225);
   }

   // $FF: renamed from: a (float, float, float) void
   public void method_1788(float var1, float var2, float var3) {
      method_1795(this.field_2225, var1, var2, var3);
   }

   // $FF: renamed from: a (float, float) boolean
   public boolean method_1789(float var1, float var2) {
      return method_1796(this.field_2225, var1, var2);
   }

   // $FF: renamed from: b (float, float) boolean
   public boolean method_1790(float var1, float var2) {
      return method_1797(this.field_2225, var1, var2);
   }

   // $FF: renamed from: a (float[]) void
   public void method_1791(float[] var1) {
      if (var1.length < 9) {
         throw new ArrayIndexOutOfBoundsException();
      } else {
         method_1798(this.field_2225, var1);
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append("Matrix{");
      this.method_1792(var1);
      var1.append('}');
      return var1.toString();
   }

   // $FF: renamed from: a (java.lang.StringBuilder) void
   public void method_1792(StringBuilder var1) {
      float[] var2 = new float[9];
      this.method_1791(var2);
      var1.append('[');
      var1.append(var2[0]);
      var1.append(", ");
      var1.append(var2[1]);
      var1.append(", ");
      var1.append(var2[2]);
      var1.append("][");
      var1.append(var2[3]);
      var1.append(", ");
      var1.append(var2[4]);
      var1.append(", ");
      var1.append(var2[5]);
      var1.append("][");
      var1.append(var2[6]);
      var1.append(", ");
      var1.append(var2[7]);
      var1.append(", ");
      var1.append(var2[8]);
      var1.append(']');
   }

   protected void finalize() {
      try {
         method_1800(this.field_2225);
      } finally {
         super.finalize();
      }

   }

   // $FF: renamed from: a (int) int
   private static int method_1793(int var0) {
      return 0;
   }

   // $FF: renamed from: b (int) void
   private static void method_1794(int var0) {
   }

   // $FF: renamed from: a (int, float, float, float) void
   private static void method_1795(int var0, float var1, float var2, float var3) {
   }

   // $FF: renamed from: a (int, float, float) boolean
   private static boolean method_1796(int var0, float var1, float var2) {
      return false;
   }

   // $FF: renamed from: b (int, float, float) boolean
   private static boolean method_1797(int var0, float var1, float var2) {
      return false;
   }

   // $FF: renamed from: a (int, float[]) void
   private static void method_1798(int var0, float[] var1) {
   }

   // $FF: renamed from: a (int, int) boolean
   private static boolean method_1799(int var0, int var1) {
      return false;
   }

   // $FF: renamed from: c (int) void
   private static void method_1800(int var0) {
   }
}
