package android.net.http;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

class AndroidHttpClient$2 extends DefaultHttpClient {
   // $FF: renamed from: a android.net.http.AndroidHttpClient
   // $FF: synthetic field
   final AndroidHttpClient field_1855;

   AndroidHttpClient$2(AndroidHttpClient var1, ClientConnectionManager var2, HttpParams var3) {
      super(var2, var3);
      this.field_1855 = var1;
   }

   protected BasicHttpProcessor createHttpProcessor() {
      BasicHttpProcessor var1 = super.createHttpProcessor();
      var1.addRequestInterceptor(AndroidHttpClient.method_2772());
      var1.addRequestInterceptor(new class_514(this.field_1855, (AndroidHttpClient$1)null));
      return var1;
   }

   protected HttpContext createHttpContext() {
      BasicHttpContext var1 = new BasicHttpContext();
      var1.setAttribute("http.authscheme-registry", this.getAuthSchemes());
      var1.setAttribute("http.cookiespec-registry", this.getCookieSpecs());
      var1.setAttribute("http.auth.credentials-provider", this.getCredentialsProvider());
      return var1;
   }
}
