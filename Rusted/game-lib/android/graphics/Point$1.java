package android.graphics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class Point$1 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.graphics.Point
   public Point method_3038(Parcel var1) {
      Point var2 = new Point();
      var2.method_3292(var1);
      return var2;
   }

   // $FF: renamed from: a (int) android.graphics.Point[]
   public Point[] method_3039(int var1) {
      return new Point[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_3039(var1);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_3038(var1);
   }
}
