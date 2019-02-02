package android.graphics;

final class Matrix$1 extends Matrix {
   // $FF: renamed from: b () void
   void method_1801() {
      throw new IllegalStateException("Matrix can not be modified");
   }

   // $FF: renamed from: a () void
   public void method_1787() {
      this.method_1801();
   }

   // $FF: renamed from: a (float, float, float) void
   public void method_1788(float var1, float var2, float var3) {
      this.method_1801();
   }

   // $FF: renamed from: a (float, float) boolean
   public boolean method_1789(float var1, float var2) {
      this.method_1801();
      return false;
   }

   // $FF: renamed from: b (float, float) boolean
   public boolean method_1790(float var1, float var2) {
      this.method_1801();
      return false;
   }
}
