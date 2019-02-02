package com.corrodinggames.rts.b;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

final class a$1 implements Runnable {
   public strictfp void run() {
      String var2;
      for(Iterator var1 = class_499.field_4582.iterator(); var1.hasNext(); class_236.method_1591("End of:" + var2)) {
         var2 = (String)var1.next();
         class_236.method_1591("Running debug script:" + var2);

         try {
            FileReader var3 = new FileReader(var2);
            BufferedReader var4 = new BufferedReader(var3);

            while(true) {
               String var5 = var4.readLine();
               if (var5 == null) {
                  var4.close();
                  var3.close();
                  break;
               }

               var5 = var5.trim();
               if (!var5.equals("") && !var5.startsWith("#")) {
                  class_236.method_1591("Running: " + var5);
                  String var6 = class_499.method_3224("script " + var5);
                  class_236.method_1591("got: " + var6.trim());
               }
            }
         } catch (IOException var7) {
            throw new RuntimeException(var7);
         }
      }

   }
}
