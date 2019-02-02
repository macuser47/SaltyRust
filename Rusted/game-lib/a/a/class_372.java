package a.a;

import a.a.a.class_182;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.ArrayList;

// $FF: renamed from: a.a.d
class class_372 extends class_371 {
   // $FF: renamed from: f java.util.ArrayList
   private ArrayList field_3013;
   // $FF: renamed from: a a.a.b
   // $FF: synthetic field
   final class_376 field_3014;

   public class_372(class_376 var1, DatagramSocket var2, SocketAddress var3) {
      super(var2);
      this.field_3014 = var1;
      this.c = var3;
   }

   // $FF: renamed from: a (java.net.DatagramSocket, a.a.q) void
   protected void method_2321(DatagramSocket var1, class_377 var2) {
      this.field_3013 = new ArrayList();
      super.method_2321(var1, var2);
   }

   // $FF: renamed from: a () a.a.a.h
   protected class_182 method_2345() {
      synchronized(this.field_3013) {
         while(this.field_3013.isEmpty()) {
            try {
               this.field_3013.wait();
            } catch (InterruptedException var4) {
               var4.printStackTrace();
            }
         }

         return (class_182)this.field_3013.remove(0);
      }
   }

   // $FF: renamed from: a (a.a.a.h) void
   protected void method_2372(class_182 var1) {
      synchronized(this.field_3013) {
         this.field_3013.add(var1);
         this.field_3013.notify();
      }
   }

   // $FF: renamed from: b () void
   protected void method_2346() {
      synchronized(this.field_3013) {
         this.field_3013.clear();
         this.field_3013.add((Object)null);
         this.field_3013.notify();
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   protected void method_2348(String var1) {
      System.out.println(this.getPort() + ": " + var1);
   }
}
