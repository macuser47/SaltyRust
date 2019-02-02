package com.corrodinggames.rts.gameFramework.f;

import android.os.Build.VERSION;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.j.class_223;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.s
class class_450 implements Runnable {
   // $FF: renamed from: a java.lang.String
   String field_3769;
   // $FF: renamed from: b java.lang.String
   String field_3770;

   public void run() {
      long var1 = class_236.method_1596();
      class_236 var3 = class_236.method_1549();
      class_236.method_1592("SendErrorReport", "Starting");
      boolean var15 = false;

      label128: {
         float var19;
         label129: {
            label130: {
               try {
                  var15 = true;
                  ArrayList var4 = new ArrayList(2);
                  class_444.method_2836(var4, "action", "error_report");
                  class_444.method_2836(var4, "game_version", Integer.toString(var3.method_1561(false)));
                  class_444.method_2836(var4, "game_version_internal", Integer.toString(var3.method_1561(true)));
                  class_444.method_2836(var4, "game_version_string", var3.method_1566());
                  class_444.method_2836(var4, "package_name", var3.method_1564());
                  class_444.method_2836(var4, "installation_source", var3.method_1565());
                  String var5 = "" + VERSION.SDK_INT;
                  if (class_236.method_1654()) {
                     var5 = "s:0;";
                     if (class_223.method_1462().method_1467()) {
                        var5 = "s:1;";
                     }
                  }

                  String var6;
                  if (class_236.method_1654()) {
                     var6 = System.getProperty("os.name") + " - " + System.getProperty("os.version");
                     class_444.method_2836(var4, "system_version", var6);
                  }

                  class_444.method_2836(var4, "sdk_version", var5);
                  class_444.method_2836(var4, "device_model", var3.method_1567());
                  class_444.method_2836(var4, "build_version", var3.method_1568());
                  class_444.method_2836(var4, "release_version", class_296.method_2056(class_236.field_1886));
                  class_444.method_2836(var4, "dedicated_server", class_296.method_2056(class_236.field_1899));
                  var6 = "NA";
                  if (var3.field_1944 != null) {
                     var6 = var3.field_1944.field_3882;
                  }

                  class_444.method_2836(var4, "private_token", var6);
                  class_444.method_2836(var4, "private_token_2", class_296.method_2061(class_296.method_2061(var6)));
                  class_444.method_2836(var4, "message", this.field_3769);
                  class_444.method_2836(var4, "stacktrace", this.field_3770);
                  class_236.method_1592("SendErrorReport", "making request");
                  BufferedReader var7 = class_444.method_2828(var4);
                  String var8 = var7.readLine();
                  if (var8 == null || !var8.contains("CORRODINGGAMES")) {
                     class_236.method_1592("StartCreateOnMasterServer", "Error bad header returned from the master server: " + var8);
                     var15 = false;
                     break label128;
                  }

                  class_236.method_1592("SendErrorReport", "Send trace successfully");
                  var15 = false;
                  break label130;
               } catch (IOException var16) {
                  var16.printStackTrace();
                  var15 = false;
                  break label129;
               } catch (Exception var17) {
                  var17.printStackTrace();
                  var15 = false;
               } finally {
                  if (var15) {
                     float var11 = (float)(class_236.method_1596() - var1) / 1000000.0F;
                     class_236.method_1592("SendErrorReport", "took: " + var11 + " seconds");
                  }
               }

               var19 = (float)(class_236.method_1596() - var1) / 1000000.0F;
               class_236.method_1592("SendErrorReport", "took: " + var19 + " seconds");
               return;
            }

            var19 = (float)(class_236.method_1596() - var1) / 1000000.0F;
            class_236.method_1592("SendErrorReport", "took: " + var19 + " seconds");
            return;
         }

         var19 = (float)(class_236.method_1596() - var1) / 1000000.0F;
         class_236.method_1592("SendErrorReport", "took: " + var19 + " seconds");
         return;
      }

      float var9 = (float)(class_236.method_1596() - var1) / 1000000.0F;
      class_236.method_1592("SendErrorReport", "took: " + var9 + " seconds");
   }
}
