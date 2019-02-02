package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.v
class class_449 implements Runnable {
   public void run() {
      class_236.method_1649();
      class_236 var1 = class_236.method_1549();

      try {
         ArrayList var2 = new ArrayList(2);
         class_444.method_2836(var2, "action", "update");
         String var3 = var1.field_1944.field_3883;
         if (var3 == null) {
            class_236.method_1592("startUpdateOnMasterServer", "No game id");
            return;
         }

         class_444.method_2836(var2, "id", var3);
         class_444.method_2836(var2, "private_token", var1.field_1944.field_3882);
         if (class_236.field_1899) {
            class_444.method_2836(var2, "check_port", "false");
         }

         class_444.method_2837(var2);
         BufferedReader var4 = class_444.method_2828(var2);
         String var5 = var4.readLine();
         if (var5 == null || !var5.contains("CORRODINGGAMES")) {
            class_236.method_1592("startUpdateOnMasterServer", "Error bad header returned from the master server: " + var5);
            return;
         }

         String var6 = var4.readLine();
         if (!"GAME UPDATED".equals(var6)) {
            class_236.method_1592("startUpdateOnMasterServer", "Update server response was:" + var6);
         }
      } catch (IOException var7) {
         var7.printStackTrace();
      }

   }
}
