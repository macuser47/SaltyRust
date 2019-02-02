package a.a;

class f$1 extends Thread {
   // $FF: renamed from: a a.a.f
   // $FF: synthetic field
   final class_371 field_2209;

   f$1(class_371 var1) {
      this.field_2209 = var1;
   }

   public void run() {
      class_371.method_2351(this.field_2209).destroy();
      class_371.method_2352(this.field_2209).destroy();

      try {
         Thread.sleep((long)(class_371.method_2353(this.field_2209).method_2403() * 2));
      } catch (InterruptedException var2) {
         var2.printStackTrace();
      }

      class_371.method_2354(this.field_2209).destroy();
      class_371.method_2355(this.field_2209).destroy();
      this.field_2209.method_2346();
      class_371.method_2356(this.field_2209);
   }
}
