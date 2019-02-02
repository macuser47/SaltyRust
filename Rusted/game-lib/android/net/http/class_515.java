package android.net.http;

import android.util.Log;

// $FF: renamed from: android.net.http.b
class class_515 {
   // $FF: renamed from: a java.lang.String
   private final String field_4681;
   // $FF: renamed from: b int
   private final int field_4682;

   // $FF: renamed from: a () boolean
   private boolean method_3274() {
      return Log.isLoggable(this.field_4681, this.field_4682);
   }

   // $FF: renamed from: a (java.lang.String) void
   private void method_3275(String var1) {
      Log.method_1718(this.field_4682, this.field_4681, var1);
   }

   // $FF: renamed from: a (android.net.http.b) boolean
   // $FF: synthetic method
   static boolean method_3276(class_515 var0) {
      return var0.method_3274();
   }

   // $FF: renamed from: a (android.net.http.b, java.lang.String) void
   // $FF: synthetic method
   static void method_3277(class_515 var0, String var1) {
      var0.method_3275(var1);
   }
}
