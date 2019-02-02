package android.graphics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class RectF$1 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.graphics.RectF
   public RectF method_3080(Parcel var1) {
      RectF var2 = new RectF();
      var2.method_1979(var1);
      return var2;
   }

   // $FF: renamed from: a (int) android.graphics.RectF[]
   public RectF[] method_3081(int var1) {
      return new RectF[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_3081(var1);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_3080(var1);
   }
}
