package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.f.class_344;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

// $FF: renamed from: com.corrodinggames.rts.java.m
public class class_345 extends class_344 {
   // $FF: renamed from: a (int, boolean) org.apache.http.client.HttpClient
   public HttpClient method_2273(int var1, boolean var2) {
      Builder var3 = RequestConfig.custom();
      var3 = var3.setConnectTimeout(var1);
      var3 = var3.setConnectionRequestTimeout(var1);
      HttpClientBuilder var4 = HttpClientBuilder.create();
      var4.setDefaultRequestConfig(var3.build());
      CloseableHttpClient var5 = var4.build();
      return var5;
   }

   // $FF: renamed from: a (org.apache.http.client.HttpClient) void
   public void method_2274(HttpClient var1) {
   }
}
