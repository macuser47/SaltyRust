package a.a;

import a.a.a.class_184;
import java.io.IOException;

// $FF: renamed from: a.a.j
class class_369 implements Runnable {
   // $FF: renamed from: a a.a.f
   // $FF: synthetic field
   final class_371 field_2977;

   private class_369(class_371 var1) {
      this.field_2977 = var1;
   }

   public void run() {
      synchronized(class_371.method_2363(this.field_2977)) {
         if (class_371.method_2363(this.field_2977).isEmpty()) {
            try {
               class_371.method_2365(this.field_2977, new class_184(class_371.method_2364(this.field_2977).method_2373()));
            } catch (IOException var4) {
               if (class_371.method_2366()) {
                  var4.printStackTrace();
               }
            }
         }

      }
   }

   // $FF: synthetic method
   class_369(class_371 var1, f$1 var2) {
      this(var1);
   }
}
