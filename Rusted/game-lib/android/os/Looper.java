package android.os;

import android.util.Printer;

public final class Looper {
   // $FF: renamed from: a java.lang.ThreadLocal
   static final ThreadLocal field_4590 = new ThreadLocal();
   // $FF: renamed from: d android.os.Looper
   private static Looper field_4591;
   // $FF: renamed from: b android.os.MessageQueue
   final MessageQueue field_4592;
   // $FF: renamed from: c java.lang.Thread
   final Thread field_4593;
   // $FF: renamed from: e android.util.Printer
   private Printer field_4594;

   // $FF: renamed from: a (boolean) void
   private static void method_3225(boolean var0) {
      if (field_4590.get() != null) {
         throw new RuntimeException("Only one Looper may be created per thread");
      } else {
         field_4590.set(new Looper(var0));
      }
   }

   // $FF: renamed from: a () void
   public static void method_3226() {
      method_3225(false);
      Class var0 = Looper.class;
      synchronized(Looper.class) {
         if (field_4591 != null) {
            throw new IllegalStateException("The main Looper has already been prepared.");
         } else {
            field_4591 = method_3229();
         }
      }
   }

   // $FF: renamed from: b () android.os.Looper
   public static Looper method_3227() {
      Class var0 = Looper.class;
      synchronized(Looper.class) {
         return field_4591;
      }
   }

   // $FF: renamed from: c () void
   public static void method_3228() {
      Looper var0 = method_3229();
      if (var0 == null) {
         throw new RuntimeException("No Looper; Looper.prepare() wasn't called on this thread.");
      } else {
         MessageQueue var1 = var0.field_4592;

         while(true) {
            Message var2 = var1.method_2504();
            if (var2 == null) {
               return;
            }

            Printer var3 = var0.field_4594;
            if (var3 != null) {
               var3.println(">>>>> Dispatching to " + var2.field_2385 + " " + var2.field_2386 + ": " + var2.field_2376);
            }

            var2.field_2385.method_1529(var2);
            if (var3 != null) {
               var3.println("<<<<< Finished to " + var2.field_2385 + " " + var2.field_2386);
            }

            var2.method_1945();
         }
      }
   }

   // $FF: renamed from: d () android.os.Looper
   public static Looper method_3229() {
      return (Looper)field_4590.get();
   }

   private Looper(boolean var1) {
      this.field_4592 = new MessageQueue(var1);
      this.field_4593 = Thread.currentThread();
   }

   // $FF: renamed from: e () java.lang.Thread
   public Thread method_3230() {
      return this.field_4593;
   }

   public String toString() {
      return "Looper (" + this.field_4593.getName() + ", tid " + this.field_4593.getId() + ") {" + Integer.toHexString(System.identityHashCode(this)) + "}";
   }
}
