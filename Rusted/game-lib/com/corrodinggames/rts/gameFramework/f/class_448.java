package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.u
class class_448 implements Runnable {
   public void run() {
      class_236.method_1649();
      class_236 var1 = class_236.method_1549();
      class_236.method_1592("startRemoveOnMasterServer", "Starting remove");

      try {
         ArrayList var2 = new ArrayList(2);
         class_444.method_2836(var2, "action", "remove");
         String var3 = var1.field_1944.field_3883;
         if (var3 == null) {
            class_236.method_1592("startRemoveOnMasterServer", "No game id");
            return;
         }

         class_444.method_2836(var2, "id", var3);
         class_444.method_2836(var2, "private_token", var1.field_1944.field_3882);
         BufferedReader var4 = class_444.method_2828(var2);
         String var5 = var4.readLine();
         if (var5 == null || !var5.contains("CORRODINGGAMES")) {
            class_236.method_1592("startRemoveOnMasterServer", "Error bad header returned from the master server: " + var5);
            return;
         }

         String var6 = var4.readLine();
         class_236.method_1592("startRemoveOnMasterServer", "Remove server response was:" + var6);
         class_236.method_1592("startRemoveOnMasterServer", "Completed load from master server without error");
      } catch (IOException var7) {
         class_236.method_1592("startRemoveOnMasterServer", "Remove failed");
         var7.printStackTrace();
      }

   }
}
