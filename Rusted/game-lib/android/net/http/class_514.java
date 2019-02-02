package android.net.http;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

// $FF: renamed from: android.net.http.a
class class_514 implements HttpRequestInterceptor {
   // $FF: renamed from: a android.net.http.AndroidHttpClient
   // $FF: synthetic field
   final AndroidHttpClient field_4680;

   private class_514(AndroidHttpClient var1) {
      this.field_4680 = var1;
   }

   public void process(HttpRequest var1, HttpContext var2) {
      class_515 var3 = AndroidHttpClient.method_2773(this.field_4680);
      if (var3 != null && class_515.method_3276(var3) && var1 instanceof HttpUriRequest) {
         class_515.method_3277(var3, AndroidHttpClient.method_2774((HttpUriRequest)var1, false));
      }

   }

   // $FF: synthetic method
   class_514(AndroidHttpClient var1, AndroidHttpClient$1 var2) {
      this(var1);
   }
}
