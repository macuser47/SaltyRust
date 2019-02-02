package android.os;

import android.util.Log;

public class Handler {
   // $FF: renamed from: a android.os.MessageQueue
   final MessageQueue field_1860;
   // $FF: renamed from: b android.os.Looper
   final Looper field_1861;
   // $FF: renamed from: c android.os.Handler$Callback
   final Handler$Callback field_1862;
   // $FF: renamed from: d boolean
   final boolean field_1863;

   // $FF: renamed from: a (android.os.Message) void
   public void method_1528(Message var1) {
   }

   // $FF: renamed from: b (android.os.Message) void
   public void method_1529(Message var1) {
      if (var1.field_2386 != null) {
         method_1537(var1);
      } else {
         if (this.field_1862 != null && this.field_1862.method_53(var1)) {
            return;
         }

         this.method_1528(var1);
      }

   }

   public Handler() {
      this((Handler$Callback)null, false);
   }

   public Handler(Looper var1) {
      this(var1, (Handler$Callback)null, false);
   }

   public Handler(Handler$Callback var1, boolean var2) {
      this.field_1861 = Looper.method_3229();
      if (this.field_1861 == null) {
         throw new RuntimeException("Can't create handler inside thread that has not called Looper.prepare()");
      } else {
         this.field_1860 = this.field_1861.field_4592;
         this.field_1862 = var1;
         this.field_1863 = var2;
      }
   }

   public Handler(Looper var1, Handler$Callback var2, boolean var3) {
      this.field_1861 = var1;
      this.field_1860 = var1.field_4592;
      this.field_1862 = var2;
      this.field_1863 = var3;
   }

   // $FF: renamed from: a () android.os.Message
   public final Message method_1530() {
      return Message.method_1943(this);
   }

   // $FF: renamed from: a (java.lang.Runnable) boolean
   public final boolean method_1531(Runnable var1) {
      return this.method_1533(method_1536(var1), 0L);
   }

   // $FF: renamed from: c (android.os.Message) boolean
   public final boolean method_1532(Message var1) {
      return this.method_1533(var1, 0L);
   }

   // $FF: renamed from: a (android.os.Message, long) boolean
   public final boolean method_1533(Message var1, long var2) {
      if (var2 < 0L) {
         var2 = 0L;
      }

      return this.method_1534(var1, SystemClock.method_3231() + var2);
   }

   // $FF: renamed from: b (android.os.Message, long) boolean
   public boolean method_1534(Message var1, long var2) {
      MessageQueue var4 = this.field_1860;
      if (var4 == null) {
         RuntimeException var5 = new RuntimeException(this + " sendMessageAtTime() called with no mQueue");
         Log.method_1711("Looper", var5.getMessage(), var5);
         return false;
      } else {
         return this.method_1535(var4, var1, var2);
      }
   }

   // $FF: renamed from: a (android.os.MessageQueue, android.os.Message, long) boolean
   private boolean method_1535(MessageQueue var1, Message var2, long var3) {
      var2.field_2385 = this;
      if (this.field_1863) {
         var2.method_1948(true);
      }

      return var1.method_2505(var2, var3);
   }

   public String toString() {
      return "Handler (" + this.getClass().getName() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
   }

   // $FF: renamed from: b (java.lang.Runnable) android.os.Message
   private static Message method_1536(Runnable var0) {
      Message var1 = Message.method_1942();
      var1.field_2386 = var0;
      return var1;
   }

   // $FF: renamed from: d (android.os.Message) void
   private static void method_1537(Message var0) {
      var0.field_2386.run();
   }
}
