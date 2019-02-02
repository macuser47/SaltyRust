package android.net.http;

import android.os.Looper;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

final class AndroidHttpClient$1 implements HttpRequestInterceptor {
   public void process(HttpRequest var1, HttpContext var2) {
      if (Looper.method_3229() != null && Looper.method_3229() == Looper.method_3227()) {
         throw new RuntimeException("This thread forbids HTTP requests");
      }
   }
}
