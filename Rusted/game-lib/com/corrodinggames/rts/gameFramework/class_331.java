package com.corrodinggames.rts.gameFramework;

import java.util.Enumeration;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.j
class class_331 extends Thread {
   // $FF: renamed from: a boolean
   boolean field_2635 = true;

   public void run() {
      label39:
      while(true) {
         if (this.field_2635) {
            try {
               Thread.sleep(1000L);
            } catch (InterruptedException var9) {
            }

            int var1 = 0;
            Enumeration var2 = class_305.field_2519.keys();

            while(true) {
               if (!var2.hasMoreElements()) {
                  continue label39;
               }

               String var3 = (String)var2.nextElement();
               long var4 = class_305.method_2111(var3);
               Long var6 = (Long)class_305.field_2519.get(var3);
               if (var6 == null) {
                  class_236.method_1591("FileChangeEngine: old lastModified null for " + var3);
               } else if (var6 != var4) {
                  class_236.method_1591("FileChangeEngine: Detected change to:" + var3 + " now " + var4);
               }

               class_305.field_2519.put(var3, var4);
               ++var1;
               if (var1 > 10) {
                  var1 = 0;

                  try {
                     Thread.sleep(2L);
                  } catch (InterruptedException var8) {
                  }
               }
            }
         }

         return;
      }
   }
}
