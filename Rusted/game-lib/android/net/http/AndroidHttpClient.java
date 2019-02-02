package android.net.http;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

public final class AndroidHttpClient implements HttpClient {
   // $FF: renamed from: a long
   public static long field_3718 = 256L;
   // $FF: renamed from: b java.lang.String[]
   private static String[] field_3719 = new String[]{"text/", "application/xml", "application/json"};
   // $FF: renamed from: c org.apache.http.HttpRequestInterceptor
   private static final HttpRequestInterceptor field_3720 = new AndroidHttpClient$1();
   // $FF: renamed from: d org.apache.http.client.HttpClient
   private final HttpClient field_3721;
   // $FF: renamed from: e java.lang.RuntimeException
   private RuntimeException field_3722 = new IllegalStateException("AndroidHttpClient created and never closed");
   // $FF: renamed from: f android.net.http.b
   private volatile class_515 field_3723;

   // $FF: renamed from: a (java.lang.String, android.content.Context) android.net.http.AndroidHttpClient
   public static AndroidHttpClient method_2767(String var0, Context var1) {
      BasicHttpParams var2 = new BasicHttpParams();
      HttpConnectionParams.setStaleCheckingEnabled(var2, false);
      HttpConnectionParams.setConnectionTimeout(var2, 60000);
      HttpConnectionParams.setSoTimeout(var2, 60000);
      HttpConnectionParams.setSocketBufferSize(var2, 8192);
      HttpClientParams.setRedirecting(var2, false);
      SSLSessionCache var3 = var1 == null ? null : new SSLSessionCache(var1);
      HttpProtocolParams.setUserAgent(var2, var0);
      SchemeRegistry var4 = new SchemeRegistry();
      var4.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      var4.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(60000, var3), 443));
      ThreadSafeClientConnManager var5 = new ThreadSafeClientConnManager(var2, var4);
      return new AndroidHttpClient(var5, var2);
   }

   // $FF: renamed from: a (java.lang.String) android.net.http.AndroidHttpClient
   public static AndroidHttpClient method_2768(String var0) {
      return method_2767(var0, (Context)null);
   }

   private AndroidHttpClient(ClientConnectionManager var1, HttpParams var2) {
      this.field_3721 = new AndroidHttpClient$2(this, var1, var2);
   }

   protected void finalize() {
      super.finalize();
      if (this.field_3722 != null) {
         Log.method_1713("AndroidHttpClient", "Leak found", this.field_3722);
         this.field_3722 = null;
      }

   }

   // $FF: renamed from: a () void
   public void method_2769() {
      if (this.field_3722 != null) {
         this.getConnectionManager().shutdown();
         this.field_3722 = null;
      }

   }

   public HttpParams getParams() {
      return this.field_3721.getParams();
   }

   public ClientConnectionManager getConnectionManager() {
      return this.field_3721.getConnectionManager();
   }

   public HttpResponse execute(HttpUriRequest var1) {
      return this.field_3721.execute(var1);
   }

   public HttpResponse execute(HttpUriRequest var1, HttpContext var2) {
      return this.field_3721.execute(var1, var2);
   }

   public HttpResponse execute(HttpHost var1, HttpRequest var2) {
      return this.field_3721.execute(var1, var2);
   }

   public HttpResponse execute(HttpHost var1, HttpRequest var2, HttpContext var3) {
      return this.field_3721.execute(var1, var2, var3);
   }

   public Object execute(HttpUriRequest var1, ResponseHandler var2) {
      return this.field_3721.execute(var1, var2);
   }

   public Object execute(HttpUriRequest var1, ResponseHandler var2, HttpContext var3) {
      return this.field_3721.execute(var1, var2, var3);
   }

   public Object execute(HttpHost var1, HttpRequest var2, ResponseHandler var3) {
      return this.field_3721.execute(var1, var2, var3);
   }

   public Object execute(HttpHost var1, HttpRequest var2, ResponseHandler var3, HttpContext var4) {
      return this.field_3721.execute(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (org.apache.http.client.methods.HttpUriRequest, boolean) java.lang.String
   private static String method_2770(HttpUriRequest var0, boolean var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("curl ");
      var2.append("-X ");
      var2.append(var0.getMethod());
      var2.append(" ");
      Header[] var3 = var0.getAllHeaders();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Header var6 = var3[var5];
         if (var1 || !var6.getName().equals("Authorization") && !var6.getName().equals("Cookie")) {
            var2.append("--header \"");
            var2.append(var6.toString().trim());
            var2.append("\" ");
         }
      }

      URI var8 = var0.getURI();
      if (var0 instanceof RequestWrapper) {
         HttpRequest var9 = ((RequestWrapper)var0).getOriginal();
         if (var9 instanceof HttpUriRequest) {
            var8 = ((HttpUriRequest)var9).getURI();
         }
      }

      var2.append("\"");
      var2.append(var8);
      var2.append("\"");
      if (var0 instanceof HttpEntityEnclosingRequest) {
         HttpEntityEnclosingRequest var10 = (HttpEntityEnclosingRequest)var0;
         HttpEntity var11 = var10.getEntity();
         if (var11 != null && var11.isRepeatable()) {
            if (var11.getContentLength() < 1024L) {
               ByteArrayOutputStream var12 = new ByteArrayOutputStream();
               var11.writeTo(var12);
               String var7;
               if (method_2771(var0)) {
                  var7 = Base64.encodeToString(var12.toByteArray(), 2);
                  var2.insert(0, "echo '" + var7 + "' | base64 -d > /tmp/$$.bin; ");
                  var2.append(" --data-binary @/tmp/$$.bin");
               } else {
                  var7 = var12.toString();
                  var2.append(" --data-ascii \"").append(var7).append("\"");
               }
            } else {
               var2.append(" [TOO MUCH DATA TO INCLUDE]");
            }
         }
      }

      return var2.toString();
   }

   // $FF: renamed from: a (org.apache.http.client.methods.HttpUriRequest) boolean
   private static boolean method_2771(HttpUriRequest var0) {
      Header[] var1 = var0.getHeaders("content-encoding");
      Header[] var2;
      int var3;
      int var4;
      Header var5;
      if (var1 != null) {
         var2 = var1;
         var3 = var1.length;

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var2[var4];
            if ("gzip".equalsIgnoreCase(var5.getValue())) {
               return true;
            }
         }
      }

      var1 = var0.getHeaders("content-type");
      if (var1 != null) {
         var2 = var1;
         var3 = var1.length;

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var2[var4];
            String[] var6 = field_3719;
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               String var9 = var6[var8];
               if (var5.getValue().startsWith(var9)) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   // $FF: renamed from: b () org.apache.http.HttpRequestInterceptor
   // $FF: synthetic method
   static HttpRequestInterceptor method_2772() {
      return field_3720;
   }

   // $FF: renamed from: a (android.net.http.AndroidHttpClient) android.net.http.b
   // $FF: synthetic method
   static class_515 method_2773(AndroidHttpClient var0) {
      return var0.field_3723;
   }

   // $FF: renamed from: a (org.apache.http.client.methods.HttpUriRequest, boolean) java.lang.String
   // $FF: synthetic method
   static String method_2774(HttpUriRequest var0, boolean var1) {
      return method_2770(var0, var1);
   }
}
