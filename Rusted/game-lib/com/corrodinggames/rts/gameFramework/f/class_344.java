package com.corrodinggames.rts.gameFramework.f;

import android.net.http.AndroidHttpClient;
import com.corrodinggames.rts.gameFramework.class_236;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.o
public class class_344 {
   // $FF: renamed from: a java.util.concurrent.locks.ReentrantLock
   ReentrantLock field_2740 = new ReentrantLock();

   // $FF: renamed from: a () org.apache.http.client.HttpClient
   public HttpClient method_2271() {
      return this.method_2273(30000, false);
   }

   // $FF: renamed from: b () org.apache.http.client.HttpClient
   public HttpClient method_2272() {
      return this.method_2273(30000, true);
   }

   // $FF: renamed from: a (int, boolean) org.apache.http.client.HttpClient
   public HttpClient method_2273(int var1, boolean var2) {
      boolean var3 = false;

      try {
         var3 = this.field_2740.tryLock(300L, TimeUnit.MILLISECONDS);
      } catch (InterruptedException var9) {
         var9.printStackTrace();
      }

      Object var4;
      try {
         if (!var3) {
            class_236.method_1592("LoadFromMasterServer", "Could not get getNewHttpClient lock! another thread maybe stuck in getNewHttpClient!");
         }

         if (!var2) {
            var4 = AndroidHttpClient.method_2768((String)null);
         } else {
            var4 = new DefaultHttpClient();
         }

         HttpParams var5 = ((HttpClient)var4).getParams();
         HttpConnectionParams.setConnectionTimeout(var5, var1);
         HttpConnectionParams.setSoTimeout(var5, 20000);
      } finally {
         if (var3) {
            this.field_2740.unlock();
         }

      }

      return (HttpClient)var4;
   }

   // $FF: renamed from: a (org.apache.http.client.HttpClient) void
   public void method_2274(HttpClient var1) {
      if (var1 instanceof AndroidHttpClient) {
         AndroidHttpClient var2 = (AndroidHttpClient)var1;
         var2.method_2769();
      }

   }
}
