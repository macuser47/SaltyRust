package a.a.a;

// $FF: renamed from: a.a.a.c
public class class_187 extends class_186 {
   // $FF: renamed from: a int[]
   private int[] field_1592;

   protected class_187() {
   }

   public class_187(int var1, int var2, int[] var3) {
      this.a(32, var1, 6 + var3.length);
      this.a(var2);
      this.field_1592 = var3;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1270() {
      return "EAK";
   }

   // $FF: renamed from: c () int[]
   public int[] method_1282() {
      return this.field_1592;
   }

   // $FF: renamed from: d () byte[]
   public byte[] method_1277() {
      byte[] var1 = super.d();

      for(int var2 = 0; var2 < this.field_1592.length; ++var2) {
         var1[4 + var2] = (byte)(this.field_1592[var2] & 255);
      }

      return var1;
   }

   // $FF: renamed from: a (byte[], int, int) void
   protected void method_1280(byte[] var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.field_1592 = new int[var3 - 6];

      for(int var4 = 0; var4 < this.field_1592.length; ++var4) {
         this.field_1592[var4] = var1[var2 + 4 + var4] & 255;
      }

   }
}
