package android.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class KeyEvent$1 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.view.KeyEvent
   public KeyEvent method_3040(Parcel var1) {
      var1.readInt();
      return KeyEvent.method_2011(var1);
   }

   // $FF: renamed from: a (int) android.view.KeyEvent[]
   public KeyEvent[] method_3041(int var1) {
      return new KeyEvent[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_3041(var1);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_3040(var1);
   }
}
