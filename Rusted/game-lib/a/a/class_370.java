package a.a;

// $FF: renamed from: a.a.e
class class_370 implements class_12 {
   // $FF: renamed from: a a.a.b
   // $FF: synthetic field
   final class_376 field_2978;

   private class_370(class_376 var1) {
      this.field_2978 = var1;
   }

   // $FF: renamed from: a (a.a.f) void
   public void method_43(class_371 var1) {
      if (var1 instanceof class_372) {
         synchronized(class_376.method_2395(this.field_2978)) {
            while(class_376.method_2395(this.field_2978).size() > 50) {
               try {
                  class_376.method_2395(this.field_2978).wait();
               } catch (InterruptedException var5) {
                  var5.printStackTrace();
               }
            }

            class_376.method_2395(this.field_2978).add((class_372)var1);
            class_376.method_2395(this.field_2978).notify();
         }
      }

   }

   // $FF: renamed from: b (a.a.f) void
   public void method_44(class_371 var1) {
   }

   // $FF: renamed from: c (a.a.f) void
   public void method_45(class_371 var1) {
      if (var1 instanceof class_372) {
         class_376.method_2396(this.field_2978, var1.getRemoteSocketAddress());
      }

   }

   // $FF: renamed from: d (a.a.f) void
   public void method_46(class_371 var1) {
      if (var1 instanceof class_372) {
         class_376.method_2396(this.field_2978, var1.getRemoteSocketAddress());
      }

   }

   // $FF: renamed from: e (a.a.f) void
   public void method_47(class_371 var1) {
   }

   // $FF: synthetic method
   class_370(class_376 var1, b$1 var2) {
      this(var1);
   }
}
