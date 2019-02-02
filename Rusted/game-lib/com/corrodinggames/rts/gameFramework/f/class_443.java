package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.util.ArrayList;
import java.util.Timer;
import org.apache.http.message.BasicNameValuePair;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.n
class class_443 implements Runnable {
   // $FF: renamed from: a java.lang.Runnable
   Runnable field_3753;

   class_443(Runnable var1) {
      this.field_3753 = var1;
   }

   public void run() {
      class_236.method_1649();
      class_236 var1 = class_236.method_1549();
      class_236.method_1592("LoadFromMasterServer", "Starting load");
      int var2 = class_444.field_3756++;

      try {
         Timer var3 = new Timer();
         var3.schedule(new class_445(var2), 5000L);
         ArrayList var4 = new ArrayList(2);
         var4.add(new BasicNameValuePair("action", "list"));
         class_444.method_2827(var4, new n$1(this, var2));
      } catch (Exception var5) {
         var5.printStackTrace();
         var1.method_1608("Error getting game list from server", 1);
      }

   }
}
