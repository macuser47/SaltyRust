package a.a;

import a.a.a.class_182;
import a.a.a.class_189;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketAddress;

// $FF: renamed from: a.a.c
class class_375 extends Thread {
   // $FF: renamed from: a a.a.b
   // $FF: synthetic field
   final class_376 field_3021;

   public class_375(class_376 var1) {
      super("ReliableServerSocket");
      this.field_3021 = var1;
      this.setDaemon(true);
   }

   public void run() {
      byte[] var1 = new byte['\uffff'];

      while(true) {
         DatagramPacket var2 = new DatagramPacket(var1, var1.length);
         class_372 var3 = null;

         try {
            class_376.method_2391(this.field_3021).receive(var2);
            SocketAddress var4 = var2.getSocketAddress();
            synchronized(class_376.method_2392(this.field_3021)) {
               class_374 var6 = (class_374)class_376.method_2393(this.field_3021).get(var4);
               if (var6 != null) {
                  var6.method_2387(var2.getData(), var2.getLength());
                  continue;
               }
            }

            class_182 var5 = class_182.method_1278(var2.getData(), 0, var2.getLength());
            synchronized(class_376.method_2392(this.field_3021)) {
               if (!this.field_3021.isClosed() && var5 instanceof class_189 && !class_376.method_2392(this.field_3021).containsKey(var4)) {
                  class_376.method_2394(this.field_3021, var4);
               }

               var3 = (class_372)class_376.method_2392(this.field_3021).get(var4);
            }

            if (var3 != null) {
               var3.method_2372(var5);
            }
            continue;
         } catch (IOException var11) {
            if (!this.field_3021.isClosed()) {
               var11.printStackTrace();
               continue;
            }
         } catch (IllegalArgumentException var12) {
            if (!this.field_3021.isClosed()) {
               var12.printStackTrace();
               continue;
            }
         }

         return;
      }
   }
}
