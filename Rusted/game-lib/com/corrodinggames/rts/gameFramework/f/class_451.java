package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.t
class class_451 implements Runnable {
   public void run() {
      class_236.method_1649();
      long var1 = class_236.method_1596();
      class_236 var3 = class_236.method_1549();
      class_236.method_1592("StartCreateOnMasterServer", "Starting create");
      boolean var16 = false;

      float var20;
      label101: {
         label113: {
            try {
               var16 = true;
               ArrayList var4 = new ArrayList(2);
               class_444.method_2836(var4, "action", "add");
               class_444.method_2836(var4, "user_id", "u_" + class_296.method_2055());
               class_444.method_2836(var4, "game_name", "Unnamed");
               class_444.method_2836(var4, "game_version", Integer.toString(var3.method_1561(true)));
               if (!var3.field_1944.field_3802) {
                  class_444.method_2836(var4, "game_version_string", var3.method_1566());
               } else {
                  class_444.method_2836(var4, "game_version_string", "ANY");
               }

               class_444.method_2836(var4, "private_token", var3.field_1944.field_3882);
               class_444.method_2836(var4, "private_token_2", class_296.method_2061(class_296.method_2061(var3.field_1944.field_3882)));
               class_444.method_2837(var4);
               BufferedReader var5 = class_444.method_2828(var4);
               String var6 = var5.readLine();
               if (var6 != null && var6.contains("CORRODINGGAMES")) {
                  String var7 = var5.readLine();
                  String[] var8 = var7.split(",");
                  if (var8.length < 1) {
                     class_236.method_1592("StartCreateOnMasterServer", "columns.length too short at:" + var8.length);
                  }

                  String var9 = var8[0];

                  try {
                     class_236.method_1592("StartCreateOnMasterServer", "Created server is:" + var9);
                     var3.field_1944.field_3883 = var9;
                  } catch (NumberFormatException var17) {
                     class_236.method_1592("StartCreateOnMasterServer", "failed to load server");
                     var17.printStackTrace();
                  }

                  class_236.method_1592("StartCreateOnMasterServer", "Completed create from master server without error");
                  var16 = false;
                  break label101;
               }

               class_236.method_1592("StartCreateOnMasterServer", "Error bad header returned from the master server: " + var6);
               var16 = false;
               break label113;
            } catch (IOException var18) {
               var18.printStackTrace();
               var16 = false;
            } finally {
               if (var16) {
                  float var12 = (float)(class_236.method_1596() - var1) / 1000000.0F;
                  class_236.method_1592("StartCreateOnMasterServer", "create took: " + var12 + " seconds");
               }
            }

            var20 = (float)(class_236.method_1596() - var1) / 1000000.0F;
            class_236.method_1592("StartCreateOnMasterServer", "create took: " + var20 + " seconds");
            return;
         }

         float var21 = (float)(class_236.method_1596() - var1) / 1000000.0F;
         class_236.method_1592("StartCreateOnMasterServer", "create took: " + var21 + " seconds");
         return;
      }

      var20 = (float)(class_236.method_1596() - var1) / 1000000.0F;
      class_236.method_1592("StartCreateOnMasterServer", "create took: " + var20 + " seconds");
   }
}
