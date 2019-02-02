package android.os;

import android.os.Parcelable.Creator;

public final class Message implements Parcelable {
   // $FF: renamed from: a int
   public int field_2376;
   // $FF: renamed from: b int
   public int field_2377;
   // $FF: renamed from: c int
   public int field_2378;
   // $FF: renamed from: d java.lang.Object
   public Object field_2379;
   // $FF: renamed from: e android.os.Messenger
   public Messenger field_2380;
   // $FF: renamed from: f int
   public int field_2381 = -1;
   // $FF: renamed from: g int
   int field_2382;
   // $FF: renamed from: h long
   long field_2383;
   // $FF: renamed from: i android.os.Bundle
   Bundle field_2384;
   // $FF: renamed from: j android.os.Handler
   Handler field_2385;
   // $FF: renamed from: k java.lang.Runnable
   Runnable field_2386;
   // $FF: renamed from: l android.os.Message
   Message field_2387;
   // $FF: renamed from: n java.lang.Object
   private static final Object field_2388 = new Object();
   // $FF: renamed from: o android.os.Message
   private static Message field_2389;
   // $FF: renamed from: p int
   private static int field_2390 = 0;
   // $FF: renamed from: q boolean
   private static boolean field_2391 = true;
   // $FF: renamed from: m android.os.Parcelable.Creator
   public static final Creator field_2392 = new Message$1();

   // $FF: renamed from: a () android.os.Message
   public static Message method_1942() {
      synchronized(field_2388) {
         if (field_2389 != null) {
            Message var1 = field_2389;
            field_2389 = var1.field_2387;
            var1.field_2387 = null;
            var1.field_2382 = 0;
            --field_2390;
            return var1;
         }
      }

      return new Message();
   }

   // $FF: renamed from: a (android.os.Handler) android.os.Message
   public static Message method_1943(Handler var0) {
      Message var1 = method_1942();
      var1.field_2385 = var0;
      return var1;
   }

   // $FF: renamed from: b () void
   public void method_1944() {
      if (this.method_1949()) {
         if (field_2391) {
            throw new IllegalStateException("This message cannot be recycled because it is still in use.");
         }
      } else {
         this.method_1945();
      }
   }

   // $FF: renamed from: c () void
   void method_1945() {
      this.field_2382 = 1;
      this.field_2376 = 0;
      this.field_2377 = 0;
      this.field_2378 = 0;
      this.field_2379 = null;
      this.field_2380 = null;
      this.field_2381 = -1;
      this.field_2383 = 0L;
      this.field_2385 = null;
      this.field_2386 = null;
      this.field_2384 = null;
      synchronized(field_2388) {
         if (field_2390 < 50) {
            this.field_2387 = field_2389;
            field_2389 = this;
            ++field_2390;
         }

      }
   }

   // $FF: renamed from: d () android.os.Bundle
   public Bundle method_1946() {
      if (this.field_2384 == null) {
         this.field_2384 = new Bundle();
      }

      return this.field_2384;
   }

   // $FF: renamed from: e () boolean
   public boolean method_1947() {
      return (this.field_2382 & 2) != 0;
   }

   // $FF: renamed from: a (boolean) void
   public void method_1948(boolean var1) {
      if (var1) {
         this.field_2382 |= 2;
      } else {
         this.field_2382 &= -3;
      }

   }

   // $FF: renamed from: f () boolean
   boolean method_1949() {
      return (this.field_2382 & 1) == 1;
   }

   // $FF: renamed from: g () void
   void method_1950() {
      this.field_2382 |= 1;
   }

   public String toString() {
      return this.method_1951(SystemClock.method_3231());
   }

   // $FF: renamed from: a (long) java.lang.String
   String method_1951(long var1) {
      StringBuilder var3 = new StringBuilder();
      var3.append("{ when=");
      var3.append("corrodinggames-unsupported");
      if (this.field_2385 != null) {
         if (this.field_2386 != null) {
            var3.append(" callback=");
            var3.append(this.field_2386.getClass().getName());
         } else {
            var3.append(" what=");
            var3.append(this.field_2376);
         }

         if (this.field_2377 != 0) {
            var3.append(" arg1=");
            var3.append(this.field_2377);
         }

         if (this.field_2378 != 0) {
            var3.append(" arg2=");
            var3.append(this.field_2378);
         }

         if (this.field_2379 != null) {
            var3.append(" obj=");
            var3.append(this.field_2379);
         }

         var3.append(" target=");
         var3.append(this.field_2385.getClass().getName());
      } else {
         var3.append(" barrier=");
         var3.append(this.field_2377);
      }

      var3.append(" }");
      return var3.toString();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (this.field_2386 != null) {
         throw new RuntimeException("Can't marshal callbacks across processes.");
      } else {
         var1.writeInt(this.field_2376);
         var1.writeInt(this.field_2377);
         var1.writeInt(this.field_2378);
         if (this.field_2379 != null) {
            try {
               Parcelable var3 = (Parcelable)this.field_2379;
               var1.writeInt(1);
               var1.writeParcelable(var3, var2);
            } catch (ClassCastException var4) {
               throw new RuntimeException("Can't marshal non-Parcelable objects across processes.");
            }
         } else {
            var1.writeInt(0);
         }

         var1.writeLong(this.field_2383);
         var1.writeBundle(this.field_2384);
         Messenger.writeMessengerOrNullToParcel(this.field_2380, var1);
         var1.writeInt(this.field_2381);
      }
   }

   // $FF: renamed from: a (android.os.Parcel) void
   private void method_1952(Parcel var1) {
      this.field_2376 = var1.readInt();
      this.field_2377 = var1.readInt();
      this.field_2378 = var1.readInt();
      if (var1.readInt() != 0) {
         this.field_2379 = var1.readParcelable(this.getClass().getClassLoader());
      }

      this.field_2383 = var1.readLong();
      this.field_2384 = var1.readBundle();
      this.field_2380 = Messenger.readMessengerOrNullFromParcel(var1);
      this.field_2381 = var1.readInt();
   }

   // $FF: renamed from: a (android.os.Message, android.os.Parcel) void
   // $FF: synthetic method
   static void method_1953(Message var0, Parcel var1) {
      var0.method_1952(var1);
   }
}
