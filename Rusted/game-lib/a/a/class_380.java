package a.a;

import a.a.a.class_182;
import java.io.IOException;
import java.util.Iterator;

// $FF: renamed from: a.a.l
class class_380 implements Runnable {
   // $FF: renamed from: a a.a.f
   // $FF: synthetic field
   final class_371 field_3045;

   private class_380(class_371 var1) {
      this.field_3045 = var1;
   }

   public void run() {
      synchronized(class_371.method_2363(this.field_3045)) {
         Iterator var2 = class_371.method_2363(this.field_3045).iterator();

         while(var2.hasNext()) {
            class_182 var3 = (class_182)var2.next();

            try {
               class_371.method_2367(this.field_3045, var3);
            } catch (IOException var6) {
               var6.printStackTrace();
            }
         }

      }
   }

   // $FF: synthetic method
   class_380(class_371 var1, f$1 var2) {
      this(var1);
   }
}
