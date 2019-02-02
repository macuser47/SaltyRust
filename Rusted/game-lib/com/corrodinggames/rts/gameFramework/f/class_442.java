package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.a.class_268;
import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.m
class class_442 implements Runnable {
   public void run() {
      class_236.method_1649();
      class_236 var1 = class_236.method_1549();
      class_236.method_1592("GetOwnInfoRunnable", "Starting getOwnInfoFromMasterServer");

      try {
         ArrayList var2 = new ArrayList(2);
         var2.add(new BasicNameValuePair("action", "self_info"));
         class_444.method_2836(var2, "port", Integer.toString(var1.field_1944.field_3795));
         BufferedReader var3 = class_444.method_2828(var2);
         String var4 = var3.readLine();
         if (var4 == null || !var4.contains("CORRODINGGAMES")) {
            class_236.method_1592("GetOwnInfoRunnable", "Error bad header returned from the master server: " + var4);
            return;
         }

         String var5;
         while((var5 = var3.readLine()) != null) {
            String[] var6 = var5.split(",");
            if (var6.length <= 1) {
               class_236.method_1592("GetOwnInfoRunnable", "columns.length too short at:" + var6.length);
            } else {
               String var7 = var6[0];
               String var8 = var6[1];

               try {
                  class_236.method_1592("GetOwnInfoRunnable", "got info");
                  var1.field_1944.method_2866(true, var7, Boolean.parseBoolean(var8));
               } catch (NumberFormatException var10) {
                  class_236.method_1592("GetOwnInfoRunnable", "failed to load server");
                  var10.printStackTrace();
               }
            }
         }

         class_268.method_1875();
         class_236.method_1592("GetOwnInfoRunnable", "Completed load from master server without error");
      } catch (ClientProtocolException var11) {
         var1.field_1944.method_2866(false, (String)null, (Boolean)null);
         var11.printStackTrace();
      } catch (IOException var12) {
         var1.field_1944.method_2866(false, (String)null, (Boolean)null);
         var12.printStackTrace();
      } catch (Exception var13) {
         var1.field_1944.method_2866(false, (String)null, (Boolean)null);
         class_236.method_1586("GetOwnInfoRunnable Failed", var13);
      }

   }
}
