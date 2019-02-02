package a.a;

import a.a.a.class_183;

// $FF: renamed from: a.a.m
class class_379 extends Thread {
   // $FF: renamed from: a a.a.f
   // $FF: synthetic field
   final class_371 field_3044;

   public class_379(class_371 var1) {
      super("ReliableSocket-ShutdownHook");
      this.field_3044 = var1;
   }

   public void run() {
      try {
         switch(class_371.method_2370(this.field_3044)) {
         case 0:
            return;
         default:
            class_371.method_2371(this.field_3044, new class_183(class_371.method_2364(this.field_3044).method_2373()));
         }
      } catch (Throwable var2) {
      }

   }
}
