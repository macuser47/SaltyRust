package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.d
final class class_459 implements Runnable {
   // $FF: renamed from: a java.lang.Boolean
   Boolean field_3953;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.f.c
   // $FF: synthetic field
   final class_458 field_3954;

   private strictfp class_459(class_458 var1) {
      this.field_3954 = var1;
      this.field_3953 = true;
   }

   public strictfp void run() {
      class_236.method_1649();
      Thread.currentThread().setName("ReceiveWorker-" + this.field_3954.method_2992());

      try {
         this.method_3002();
      } catch (EOFException var2) {
         this.field_3954.method_2994("network:ReceiveWorker: EOF reading packet", var2);
      } catch (IOException var3) {
         if (!this.field_3954.field_3923) {
            var3.printStackTrace();
         }

         this.field_3954.method_2996("network:ReceiveWorker: " + var3.getMessage());
      } catch (OutOfMemoryError var4) {
         var4.printStackTrace();
         this.field_3954.method_2996("network:ReceiveWorker OutOfMemoryError: " + var4.getMessage());
      }

      class_458.method_3000(this.field_3954, true, false);
   }

   // $FF: renamed from: a () void
   strictfp void method_3002() {
      InputStream var1 = this.field_3954.field_3926.getInputStream();
      DataInputStream var2 = new DataInputStream(var1);

      while(this.field_3953 && !this.field_3954.field_3923 && !this.field_3954.field_3926.isClosed()) {
         int var3 = var2.readInt();
         int var4 = var2.readInt();
         if (var3 > 20000000) {
            this.field_3954.method_2995("readData(): new packet of type:" + var4 + " has size of:" + var3);
         }

         if (var3 > 50000000) {
            this.field_3954.method_2995("Requested packet too large rejecting");
            return;
         }

         if (var3 < 0) {
            this.field_3954.method_2995("Requested packet negative size:" + var3 + " rejecting");
            return;
         }

         class_413 var5 = new class_413(var4);
         var5.field_3412 = new byte[var3];
         this.field_3954.field_3952 = 0;
         this.field_3954.field_3951 = var3;
         int var6 = 0;

         for(var5.field_3410 = this.field_3954; var6 < var3 && !this.field_3954.field_3923; this.field_3954.field_3952 = var6) {
            int var7 = var2.read(var5.field_3412, var6, var3 - var6);
            if (var7 == -1) {
               this.field_3954.method_2995("we got to the end of the stream?!?");
               return;
            }

            var6 += var7;
         }

         this.field_3954.field_3951 = 0;
         this.field_3954.field_3952 = 0;
         if (!this.field_3954.field_3923) {
            if (var5.field_3411 > 100) {
               class_458.method_3001(this.field_3954).method_2902(var5);
            } else {
               class_458.method_3001(this.field_3954).field_3878.add(var5);
            }
         }
      }

   }

   // $FF: synthetic method
   class_459(class_458 var1, c$1 var2) {
      this(var1);
   }
}
