package android.os;

import android.os.Parcelable.Creator;

final class Message$1 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) android.os.Message
   public Message method_1954(Parcel var1) {
      Message var2 = Message.method_1942();
      Message.method_1953(var2, var1);
      return var2;
   }

   // $FF: renamed from: a (int) android.os.Message[]
   public Message[] method_1955(int var1) {
      return new Message[var1];
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1955(var1);
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1954(var1);
   }
}
