package android.graphics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class Bitmap$1 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.graphics.Bitmap
   public Bitmap method_1413(Parcel var1) {
      Bitmap var2 = Bitmap.method_3316(var1);
      if (var2 == null) {
         throw new RuntimeException("Failed to unparcel Bitmap");
      } else {
         return var2;
      }
   }

   // $FF: renamed from: a (int) android.graphics.Bitmap[]
   public Bitmap[] method_1414(int var1) {
      return new Bitmap[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1414(var1);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1413(var1);
   }
}
