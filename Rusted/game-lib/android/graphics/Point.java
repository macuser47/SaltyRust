package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Point implements Parcelable {
   // $FF: renamed from: a int
   public int field_4722;
   // $FF: renamed from: b int
   public int field_4723;
   // $FF: renamed from: c android.os.Parcelable.Creator
   public static final Creator field_4724 = new Point$1();

   public Point() {
   }

   public Point(int var1, int var2) {
      this.field_4722 = var1;
      this.field_4723 = var2;
   }

   // $FF: renamed from: a (int, int) void
   public void method_3291(int var1, int var2) {
      this.field_4722 = var1;
      this.field_4723 = var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Point var2 = (Point)var1;
         if (this.field_4722 != var2.field_4722) {
            return false;
         } else {
            return this.field_4723 == var2.field_4723;
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = this.field_4722;
      var1 = 31 * var1 + this.field_4723;
      return var1;
   }

   public String toString() {
      return "Point(" + this.field_4722 + ", " + this.field_4723 + ")";
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.field_4722);
      var1.writeInt(this.field_4723);
   }

   // $FF: renamed from: a (android.os.Parcel) void
   public void method_3292(Parcel var1) {
      this.field_4722 = var1.readInt();
      this.field_4723 = var1.readInt();
   }
}
