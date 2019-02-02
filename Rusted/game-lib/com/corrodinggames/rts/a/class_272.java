package com.corrodinggames.rts.a;

import android.view.ContextMenu;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import com.corrodinggames.rts.gameFramework.class_236;
import java.util.ArrayList;
import java.util.Collections;

// $FF: renamed from: com.corrodinggames.rts.a.h
public class class_272 extends class_266 {
   // $FF: renamed from: b () void
   public void method_1871() {
      super.b();
      class_353.method_2299(this, true);
   }

   // $FF: renamed from: j () java.lang.String[]
   public static String[] method_1889() {
      String[] var0 = class_236.method_1638("/SD/rustedWarfare/saves/", false);
      if (var0 == null) {
         return null;
      } else {
         ArrayList var1 = new ArrayList();
         String[] var2 = var0;
         int var3 = var0.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            if (!var5.endsWith(".map")) {
               var1.add(var5);
            }
         }

         Collections.sort(var1, new class_351());
         return (String[])var1.toArray(new String[0]);
      }
   }

   public void onCreateContextMenu(ContextMenu var1, View var2, ContextMenuInfo var3) {
      super.onCreateContextMenu(var1, var2, var3);
      Button var4 = (Button)var2;
      var1.setHeaderTitle(var4.getText());
      var1.add(0, var2.getId(), 0, "Rename");
      var1.add(1, var2.getId(), 0, "Delete");
   }
}
