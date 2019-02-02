package com.corrodinggames.rts.gameFramework;

import android.os.Process;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.x
public class class_288 extends Thread {
   // $FF: renamed from: a boolean
   public boolean field_2442 = true;
   // $FF: renamed from: b long
   long field_2443;

   // $FF: renamed from: a (boolean) void
   public strictfp synchronized void method_1994(boolean var1) {
      this.field_2442 = var1;
   }

   public strictfp void run() {
      class_236.method_1649();
      if (!class_236.field_1899) {
         Process.setThreadPriority(-4);
      }

      float var1 = 1.0F;
      this.method_1995();
      long var2 = this.field_2443;
      class_236 var4 = class_236.method_1549();

      while(true) {
         long var10;
         do {
            if (!this.field_2442) {
               return;
            }

            long var5 = System.nanoTime();
            var2 = this.field_2443;
            this.method_1995();
            var1 = (float)(this.field_2443 - var2) * 0.060000002F;
            int var7 = (int)(this.field_2443 - var2);
            var4.method_1573(var1, var7);
            if (!var4.field_1937.batterySaving) {
            }

            long var8;
            if (var4.field_1937.batterySaving) {
               var8 = 32258064L;
            } else {
               var8 = 16393442L;
            }

            var10 = (long)Math.round((float)(var8 - (System.nanoTime() - var5)));
         } while(var10 <= 0L);

         long var12 = System.nanoTime();

         while(true) {
            long var14 = System.nanoTime() - var12;
            if (var14 > var10 || var14 < 0L) {
               break;
            }

            long var16 = (long)((double)(var10 - var14) / 1000000.0D);
            if (var16 <= 1L) {
               break;
            }

            try {
               Thread.sleep(var16);
            } catch (Exception var19) {
            }
         }
      }
   }

   // $FF: renamed from: a () void
   public strictfp void method_1995() {
      this.field_2443 = System.currentTimeMillis();
   }
}
