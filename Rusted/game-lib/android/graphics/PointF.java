package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

public class PointF implements Parcelable {
   // $FF: renamed from: a float
   public float field_2406;
   // $FF: renamed from: b float
   public float field_2407;

   public PointF() {
   }

   public PointF(float var1, float var2) {
      this.field_2406 = var1;
      this.field_2407 = var2;
   }

   // $FF: renamed from: a (float, float) void
   public final void method_1960(float var1, float var2) {
      this.field_2406 = var1;
      this.field_2407 = var2;
   }

   // $FF: renamed from: a (android.graphics.PointF) void
   public final void method_1961(PointF var1) {
      this.field_2406 = var1.field_2406;
      this.field_2407 = var1.field_2407;
   }

   // $FF: renamed from: b (float, float) void
   public final void method_1962(float var1, float var2) {
      this.field_2406 += var1;
      this.field_2407 += var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeFloat(this.field_2406);
      var1.writeFloat(this.field_2407);
   }
}
