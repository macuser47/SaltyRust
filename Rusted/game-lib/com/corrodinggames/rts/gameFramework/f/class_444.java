package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.a.class_268;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.k
public class class_444 {
   // $FF: renamed from: a java.lang.String[]
   public static final String[] field_3754 = new String[]{"http://gs1.corrodinggames.com/masterserver/1.2", "http://gs4.corrodinggames.net/masterserver/1.2"};
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.f.o
   public static class_344 field_3755 = new class_344();
   // $FF: renamed from: c int
   static int field_3756;
   // $FF: renamed from: d java.lang.Object
   public static Object field_3757 = new Object();

   // $FF: renamed from: a (java.util.List, com.corrodinggames.rts.gameFramework.f.p) void
   static void method_2827(List var0, class_230 var1) {
      int var2 = 0;
      String[] var3 = field_3754;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         ++var2;
         class_447 var7 = new class_447(var0, var1, var6, var2);
         (new Thread(var7)).start();
         class_236.method_1592("LoadFromMasterServer", var2 + ": Started RequestsParallelRunnable thread");
      }

   }

   // $FF: renamed from: a (java.util.List) java.io.BufferedReader
   public static BufferedReader method_2828(List var0) {
      ExecutorService var1 = Executors.newFixedThreadPool(field_3754.length);

      BufferedReader var22;
      try {
         ExecutorCompletionService var2 = new ExecutorCompletionService(var1);
         ArrayList var3 = new ArrayList();
         String[] var4 = field_3754;
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            k$1 var9 = new k$1(var7, var0);
            Future var10 = var2.submit(var9);
            var3.add(var10);
         }

         int var18 = field_3754.length;
         class_446 var19 = null;
         class_446 var20 = null;

         for(int var21 = 0; var21 < var18; ++var21) {
            try {
               Future var8 = var2.poll(10L, TimeUnit.SECONDS);
               if (var8 == null) {
                  class_236.method_1588("MULTI_MASTERSERVERS: poll timed out");
                  break;
               }

               class_446 var23 = (class_446)var8.get();
               if (var23 != null) {
                  var19 = var23;
                  if (var23.field_3764) {
                     var20 = var23;
                     break;
                  }
               }
            } catch (ExecutionException var15) {
               var15.printStackTrace();
               if (var15.getCause() != null) {
                  var15.getCause().printStackTrace();
               }
            } catch (InterruptedException var16) {
            }
         }

         if (var20 == null) {
            class_236.method_1588("No valid result found on any masterserver");
            var20 = var19;
         }

         if (var20 == null) {
            throw new IOException("No results found");
         }

         var22 = var20.field_3763;
      } finally {
         var1.shutdown();
      }

      return var22;
   }

   // $FF: renamed from: a (java.util.List, java.lang.String) com.corrodinggames.rts.gameFramework.f.q
   public static class_446 method_2829(List var0, String var1) {
      HttpPost var2 = new HttpPost(var1 + "/interface");
      var2.setEntity(new UrlEncodedFormEntity(var0));
      HttpClient var3 = field_3755.method_2271();

      HttpResponse var4;
      try {
         var4 = var3.execute(var2);
      } catch (NullPointerException var15) {
         class_236.method_1588("doRequest: httpclient.execute threw NullPointerException, running workaround");
         var3 = field_3755.method_2272();
         var4 = var3.execute(var2);
      }

      HttpEntity var5 = var4.getEntity();
      InputStream var6 = var5.getContent();
      ByteArrayOutputStream var7 = new ByteArrayOutputStream();
      byte[] var9 = new byte[16384];

      int var8;
      while((var8 = var6.read(var9, 0, var9.length)) != -1) {
         var7.write(var9, 0, var8);
      }

      var7.flush();
      var6.close();
      var5.consumeContent();
      byte[] var10 = var7.toByteArray();
      byte[] var11 = "CORRODINGGAMES".getBytes("ISO-8859-1");
      class_446 var12 = new class_446();
      var12.field_3764 = method_2830(var10, 0, var11);
      ByteArrayInputStream var13 = new ByteArrayInputStream(var10);
      BufferedReader var14 = new BufferedReader(new InputStreamReader(var13));
      field_3755.method_2274(var3);
      var12.field_3763 = var14;
      return var12;
   }

   // $FF: renamed from: a (byte[], int, byte[]) boolean
   public static boolean method_2830(byte[] var0, int var1, byte[] var2) {
      if (var2.length > var0.length - var1) {
         return false;
      } else {
         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var0[var1 + var3] != var2[var3]) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.f.g
   public static class_462 method_2831(String var0) {
      class_236 var1 = class_236.method_1549();
      if (var0 == null) {
         throw new IOException("findOrCreateServer id cannot be null");
      } else {
         Iterator var2 = var1.field_1944.field_3888.iterator();

         class_462 var3;
         do {
            if (!var2.hasNext()) {
               return null;
            }

            var3 = (class_462)var2.next();
         } while(!var0.equals(var3.field_3962));

         return var3;
      }
   }

   // $FF: renamed from: b (java.lang.String) com.corrodinggames.rts.gameFramework.f.g
   public static class_462 method_2832(String var0) {
      class_236 var1 = class_236.method_1549();
      if (var0 == null) {
         throw new IOException("findOrCreateServer id cannot be null");
      } else {
         class_462 var2 = method_2831(var0);
         if (var2 != null) {
            return var2;
         } else {
            class_462 var3 = new class_462();
            var3.field_3962 = var0;
            var3.field_3961 = false;
            var3.field_3972 = var1.field_1944.method_2868();
            return var3;
         }
      }
   }

   // $FF: renamed from: a (java.lang.Runnable) void
   public static void method_2833(Runnable var0) {
      class_236.method_1592("LoadFromMasterServer", "Load requested");
      class_443 var1 = new class_443(var0);
      Thread var2 = new Thread(var1);
      var2.start();
   }

   // $FF: renamed from: a (int, int) void
   static void method_2834(int var0, int var1) {
      class_236 var2 = class_236.method_1549();
      boolean var3 = false;
      synchronized(field_3757) {
         Iterator var5 = var2.field_1944.field_3888.iterator();

         while(true) {
            if (!var5.hasNext()) {
               break;
            }

            class_462 var6 = (class_462)var5.next();
            if (var6.field_3973 < var0) {
               class_236.method_1592("LoadFromMasterServer", var1 + ": Removing stale server with id:" + var6.field_3962);
               var5.remove();
               var3 = true;
            }
         }
      }

      if (var3) {
         class_268.method_1875();
      }

   }

   // $FF: renamed from: a () void
   public static void method_2835() {
      class_236.method_1592("GetOwnInfoRunnable", "getOwnInfoFromMasterServer");
      class_442 var0 = new class_442();
      Thread var1 = new Thread(var0);
      var1.start();
   }

   // $FF: renamed from: a (java.util.List, java.lang.String, java.lang.String) void
   static void method_2836(List var0, String var1, String var2) {
      var0.add(new BasicNameValuePair(var1, var2));
   }

   // $FF: renamed from: b (java.util.List) void
   static void method_2837(List var0) {
      class_236 var1 = class_236.method_1549();
      method_2836(var0, "password_required", class_296.method_2056(var1.field_1944.field_3796 != null));
      method_2836(var0, "created_by", var1.field_1944.field_3804);
      method_2836(var0, "private_ip", var1.field_1944.method_2948());
      method_2836(var0, "port_number", Integer.toString(var1.field_1944.field_3795));
      if (var1.field_1944.field_3801 != null) {
         method_2836(var0, "game_map", var1.field_1944.field_3801);
      } else {
         method_2836(var0, "game_map", var1.field_1944.field_3863.field_3776);
      }

      class_396 var2 = var1.field_1944.field_3863.field_3775;
      if (var2 == null) {
         var2 = class_396.field_3237;
      }

      method_2836(var0, "game_mode", var2.name());
      if (!var1.field_1944.field_3802) {
         method_2836(var0, "game_status", var1.field_1944.field_3887 ? "ingame" : "battleroom");
      } else {
         method_2836(var0, "game_status", "chat");
      }

      method_2836(var0, "player_count", Integer.toString(var1.field_1944.method_2884()));
      String var3 = Integer.toString(10);
      if (var1.field_1944.field_3802) {
      }

      method_2836(var0, "max_player_count", var3);
   }

   // $FF: renamed from: b () void
   public static void method_2838() {
      class_236.method_1592("StartCreateOnMasterServer", "Create requested");
      class_451 var0 = new class_451();
      Thread var1 = new Thread(var0);
      var1.start();
   }

   // $FF: renamed from: c () void
   public static void method_2839() {
      class_449 var0 = new class_449();
      Thread var1 = new Thread(var0);
      var1.start();
   }

   // $FF: renamed from: d () void
   public static void method_2840() {
      class_236.method_1592("startRemoveOnMasterServer", "Remove requested");
      class_448 var0 = new class_448();
      Thread var1 = new Thread(var0);
      var1.start();
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public static void method_2841(String var0, String var1) {
      class_236.method_1592("startErrorReport", "ErrorReport requested");
      class_450 var2 = new class_450();
      var2.field_3770 = var1;
      var2.field_3769 = var0;
      Thread var3 = new Thread(var2);
      var3.start();
   }
}
