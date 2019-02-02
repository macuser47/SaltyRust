package com.corrodinggames.rts.gameFramework;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.ay
class class_419 implements Runnable {
   // $FF: renamed from: a boolean
   volatile boolean field_3479;
   // $FF: renamed from: b int
   volatile int field_3480;
   // $FF: renamed from: c int
   int field_3481;
   // $FF: renamed from: d int
   int field_3482;
   // $FF: renamed from: e int
   int field_3483;
   // $FF: renamed from: f int
   int field_3484;
   // $FF: renamed from: g int
   int field_3485;
   // $FF: renamed from: h boolean
   boolean field_3486;
   // $FF: renamed from: i java.util.concurrent.ConcurrentLinkedQueue
   public ConcurrentLinkedQueue field_3487;
   // $FF: renamed from: j long
   public long field_3488;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.ax
   // $FF: synthetic field
   final class_417 field_3489;

   strictfp class_419(class_417 var1) {
      this.field_3489 = var1;
      this.field_3479 = true;
      this.field_3486 = false;
      this.field_3487 = new ConcurrentLinkedQueue();
      this.field_3488 = 0L;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.ba) void
   public strictfp synchronized void method_2661(class_397 var1) {
      if (this.field_3486) {
         class_236.method_1591("Replay:addCommand skipped due to stopped recording");
      }

      this.field_3487.add(var1);
      this.field_3484 = var1.field_3246;
      if (var1.field_3250 != null) {
         ++this.field_3489.field_3456;
      }

      if (var1.field_3251 != null) {
         ++this.field_3489.field_3457;
      }

      this.notifyAll();
   }

   // $FF: renamed from: a () void
   public strictfp synchronized void method_2662() {
      this.field_3479 = false;
      class_236 var1 = class_236.method_1549();
      class_236.method_1591("Replay: stop requested at:" + var1.field_1920);
      if (!class_417.method_2659(this.field_3489)) {
         class_236.method_1591("Replay stop: warning: active==false");
      }

      if (this.field_3489.field_3450) {
         class_236.method_1591("Replay stop: warning: replaying==true");
      }

      this.field_3480 = var1.field_1920;
      this.field_3481 = var1.field_1921;
      this.field_3482 = this.field_3489.field_3456;
      this.field_3483 = this.field_3489.field_3457;
      if (this.field_3480 < this.field_3484) {
         class_236.method_1591("Replay: stoppedFrame<lastCommandFrame: " + this.field_3480 + "<" + this.field_3484);
         this.field_3480 = this.field_3484;
      }

      this.field_3488 = 0L;
      this.notifyAll();
   }

   // $FF: renamed from: b () void
   private strictfp synchronized void method_2663() {
      try {
         if (this.field_3479) {
            this.wait();
         }
      } catch (InterruptedException var2) {
      }

   }

   public strictfp void run() {
      class_236.method_1649();

      while(this.field_3479) {
         if (this.field_3487.size() > 0) {
            class_397 var1 = (class_397)this.field_3487.remove();

            try {
               if (var1.field_3250 != null) {
                  this.field_3489.field_3465.method_2565("rc");
                  this.field_3489.field_3465.method_2541(var1.field_3246);
                  var1.field_3250.method_2182(this.field_3489.field_3465);
                  this.field_3489.field_3465.method_2567("rc");
                  this.field_3485 = var1.field_3246;
               } else if (var1.field_3248 != null) {
                  this.field_3489.field_3465.method_2565("cs");
                  this.field_3489.field_3465.method_2541(var1.field_3246);
                  this.field_3489.field_3465.method_2543(var1.field_3248);
                  this.field_3489.field_3465.method_2567("cs");
               } else if (var1.field_3249 != null) {
                  this.field_3489.field_3465.method_2565("wait");
                  this.field_3489.field_3465.method_2541(var1.field_3246);
                  this.field_3489.field_3465.method_2567("wait");
                  this.field_3489.field_3465.method_2565("es");
                  this.field_3489.field_3465.method_2541(var1.field_3246);
                  this.field_3489.field_3465.method_2560(var1.field_3249);
                  this.field_3489.field_3465.method_2567("es");
               } else if (var1.field_3251 != null) {
                  this.field_3489.field_3465.method_2565("wait");
                  this.field_3489.field_3465.method_2541(var1.field_3246);
                  this.field_3489.field_3465.method_2567("wait");
                  this.field_3489.field_3465.method_2565("resync");
                  this.field_3489.field_3465.method_2541(var1.field_3246);
                  this.field_3489.field_3465.method_2541(var1.field_3253);
                  this.field_3489.field_3465.method_2541(var1.field_3254);
                  this.field_3489.field_3465.method_2542(var1.field_3255);
                  this.field_3489.field_3465.method_2542(var1.field_3256);
                  this.field_3489.field_3465.method_2560(var1.field_3251);
                  this.field_3489.field_3465.method_2567("resync");
               } else {
                  if (var1.field_3252 == null) {
                     throw new RuntimeException("Unknown saved command");
                  }

                  this.field_3489.field_3465.method_2565("chat");
                  this.field_3489.field_3465.method_2541(var1.field_3246);
                  this.field_3489.field_3465.method_2541(var1.field_3252.field_3512);
                  this.field_3489.field_3465.method_2544(var1.field_3252.field_3513);
                  this.field_3489.field_3465.method_2544(var1.field_3252.field_3514);
                  this.field_3489.field_3465.method_2567("chat");
               }

               if (this.field_3488 == 0L || this.field_3488 + 3000L < System.currentTimeMillis()) {
                  this.field_3488 = System.currentTimeMillis();
                  this.field_3489.field_3465.method_2533();
               }
            } catch (IOException var5) {
               class_236 var3 = class_236.method_1549();
               class_236.method_1589("Replay error", var5);
               var3.field_1939.field_947.method_1196("", "IO error recording replay, disabling record");
               class_417.method_2660(this.field_3489, false);
               this.field_3486 = true;
               return;
            }
         }

         if (this.field_3487.size() == 0) {
            this.method_2663();
         }
      }

      try {
         this.field_3489.field_3465.method_2565("wait");
         this.field_3489.field_3465.method_2541(this.field_3480);
         this.field_3489.field_3465.method_2567("wait");
         this.field_3489.field_3465.method_2565("end");
         this.field_3489.field_3465.method_2567("end");
         this.field_3489.field_3465.method_2565("endReplayMetaData");
         this.field_3489.field_3465.method_2539(0);
         this.field_3489.field_3465.method_2541(this.field_3480);
         this.field_3489.field_3465.method_2541(this.field_3481);
         this.field_3489.field_3465.method_2541(this.field_3482);
         this.field_3489.field_3465.method_2541(this.field_3483);
         this.field_3489.field_3465.method_2545("{frames:" + this.field_3480 + ",time:" + this.field_3481 + ",commandCount:" + this.field_3482 + ",resyncCount:" + this.field_3483 + "}");
         this.field_3489.field_3465.method_2567("endReplayMetaData");
         this.field_3489.field_3465.method_2533();
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }

      class_236.method_1591("replay: Background writer stopping");
      class_236.method_1591("replay: Remainding commands: " + this.field_3487.size());
      class_236.method_1591("replay: last command: " + this.field_3484);
      class_236.method_1591("replay: last command write: " + this.field_3485);
      class_236.method_1591("replay: Commands issued: " + this.field_3482);
      this.field_3486 = true;
   }
}
