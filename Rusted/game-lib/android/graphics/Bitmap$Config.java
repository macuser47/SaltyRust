package android.graphics;

public enum Bitmap$Config {
   // $FF: renamed from: a android.graphics.Bitmap$Config
   field_3072(2),
   // $FF: renamed from: b android.graphics.Bitmap$Config
   field_3073(4),
   // $FF: renamed from: c android.graphics.Bitmap$Config
   @Deprecated
   field_3074(5),
   // $FF: renamed from: d android.graphics.Bitmap$Config
   field_3075(6);

   // $FF: renamed from: e int
   final int field_3076;
   // $FF: renamed from: f android.graphics.Bitmap$Config[]
   private static Bitmap$Config[] field_3077 = new Bitmap$Config[]{null, null, field_3072, null, field_3073, field_3074, field_3075};

   private Bitmap$Config(int var3) {
      this.field_3076 = var3;
   }

   // $FF: renamed from: a (int) android.graphics.Bitmap$Config
   static Bitmap$Config method_2436(int var0) {
      return field_3077[var0];
   }
}
