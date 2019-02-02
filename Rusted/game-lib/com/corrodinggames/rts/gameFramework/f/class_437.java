package com.corrodinggames.rts.gameFramework.f;

import java.io.IOException;
import java.net.Socket;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.ac
public class class_437 implements Runnable {
   // $FF: renamed from: a java.lang.String
   String field_3660;
   // $FF: renamed from: b boolean
   boolean field_3661;
   // $FF: renamed from: c boolean
   boolean field_3662;
   // $FF: renamed from: d java.lang.Thread
   Thread field_3663;
   // $FF: renamed from: e java.lang.String
   public String field_3664;
   // $FF: renamed from: f java.lang.Runnable
   Runnable field_3665;
   // $FF: renamed from: g java.net.Socket
   public Socket field_3666;
   // $FF: renamed from: h boolean
   boolean field_3667 = false;

   public strictfp class_437(String var1, boolean var2, Runnable var3) {
      this.field_3660 = var1;
      this.field_3661 = var2;
      this.field_3665 = var3;
   }

   // $FF: renamed from: a () boolean
   public strictfp boolean method_2746() {
      if (!this.field_3662) {
         return false;
      } else {
         this.field_3667 = true;
         return true;
      }
   }

   // $FF: renamed from: b () void
   public strictfp void method_2747() {
      this.field_3662 = true;
      this.field_3663 = new Thread(this);
      this.field_3663.start();
   }

   public strictfp void run() {
      try {
         this.field_3666 = class_454.method_2915(this.field_3660, this.field_3661);
         return;
      } catch (IOException var12) {
         String var2 = var12.getMessage();
         this.field_3664 = var2;
         var12.printStackTrace();
      } finally {
         this.field_3662 = false;
         if (this.field_3667) {
            if (this.field_3666 != null) {
               try {
                  this.field_3666.close();
                  this.field_3666 = null;
                  this.field_3664 = "cancelled";
               } catch (IOException var11) {
                  var11.printStackTrace();
               }
            }
         } else {
            this.field_3665.run();
         }

      }

   }
}
