package com.corrodinggames.rts.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// $FF: renamed from: com.corrodinggames.rts.b.b
public class class_500 implements Runnable {
   // $FF: renamed from: a java.net.Socket
   Socket field_4583;
   // $FF: renamed from: b com.corrodinggames.rts.b.a
   // $FF: synthetic field
   final class_499 field_4584;

   public strictfp class_500(class_499 var1, Socket var2) {
      this.field_4584 = var1;
      this.field_4583 = var2;
   }

   public strictfp void run() {
      try {
         PrintWriter var1 = new PrintWriter(this.field_4583.getOutputStream(), true);
         BufferedReader var2 = new BufferedReader(new InputStreamReader(this.field_4583.getInputStream()));

         while(this.field_4584.field_4580) {
            String var3 = var2.readLine();
            if (var3 == null) {
               break;
            }

            String var4 = class_499.method_3224(var3);
            var1.print(var4);
            var1.flush();
         }
      } catch (IOException var13) {
         var13.printStackTrace();
      } finally {
         try {
            this.field_4583.close();
         } catch (IOException var12) {
            var12.printStackTrace();
         }

      }

   }
}
