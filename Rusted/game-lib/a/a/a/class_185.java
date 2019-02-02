package a.a.a;

// $FF: renamed from: a.a.a.b
public class class_185 extends class_182 {
   // $FF: renamed from: a byte[]
   private byte[] field_1591;

   protected class_185() {
   }

   public class_185(int var1, int var2, byte[] var3, int var4, int var5) {
      this.a(64, var1, 6);
      this.a(var2);
      this.field_1591 = new byte[var5];
      System.arraycopy(var3, var4, this.field_1591, 0, var5);
   }

   // $FF: renamed from: b () int
   public int method_1272() {
      return this.field_1591.length + super.method_1272();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1270() {
      return "DAT";
   }

   // $FF: renamed from: c () byte[]
   public byte[] method_1281() {
      return this.field_1591;
   }

   // $FF: renamed from: d () byte[]
   public byte[] method_1277() {
      byte[] var1 = super.method_1277();
      System.arraycopy(this.field_1591, 0, var1, 6, this.field_1591.length);
      return var1;
   }

   // $FF: renamed from: a (byte[], int, int) void
   public void method_1280(byte[] var1, int var2, int var3) {
      super.method_1280(var1, var2, var3);
      this.field_1591 = new byte[var3 - 6];
      System.arraycopy(var1, var2 + 6, this.field_1591, 0, this.field_1591.length);
   }
}
