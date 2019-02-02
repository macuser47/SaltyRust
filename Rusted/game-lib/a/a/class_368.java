package a.a;

import a.a.a.class_182;
import a.a.a.class_186;
import a.a.a.class_187;
import a.a.a.class_189;
import java.io.IOException;

// $FF: renamed from: a.a.k
class class_368 extends Thread {
   // $FF: renamed from: a a.a.f
   // $FF: synthetic field
   final class_371 field_2976;

   public class_368(class_371 var1) {
      super("ReliableSocket");
      this.field_2976 = var1;
      this.setDaemon(true);
   }

   public void run() {
      while(true) {
         try {
            class_182 var1;
            if ((var1 = class_371.method_2358(this.field_2976)) != null) {
               if (var1 instanceof class_189) {
                  class_371.method_2359(this.field_2976, (class_189)var1);
               } else if (var1 instanceof class_187) {
                  class_371.method_2360(this.field_2976, (class_187)var1);
               } else if (!(var1 instanceof class_186)) {
                  class_371.method_2361(this.field_2976, var1);
               }

               class_371.method_2362(this.field_2976, var1);
               continue;
            }
         } catch (IOException var3) {
            var3.printStackTrace();
         }

         return;
      }
   }
}
