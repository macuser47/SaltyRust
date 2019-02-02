package com.corrodinggames.rts.gameFramework.utility;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.d
public class class_227 extends Thread {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.e
   private static final class_0 field_1794 = new d$1();
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.utility.f
   private static final class_1 field_1795 = new d$2();
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.utility.e
   private class_0 field_1796;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.utility.f
   private class_1 field_1797;
   // $FF: renamed from: e android.os.Handler
   private final Handler field_1798;
   // $FF: renamed from: f int
   private final int field_1799;
   // $FF: renamed from: g java.lang.String
   private String field_1800;
   // $FF: renamed from: h boolean
   private boolean field_1801;
   // $FF: renamed from: i boolean
   private boolean field_1802;
   // $FF: renamed from: j int
   private volatile int field_1803;
   // $FF: renamed from: k java.lang.Runnable
   private final Runnable field_1804;

   public class_227() {
      this(5000);
   }

   public class_227(int var1) {
      this.field_1796 = field_1794;
      this.field_1797 = field_1795;
      this.field_1798 = new Handler(Looper.method_3227());
      this.field_1800 = "";
      this.field_1801 = false;
      this.field_1802 = false;
      this.field_1803 = 0;
      this.field_1804 = new d$3(this);
      this.field_1799 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.e) com.corrodinggames.rts.gameFramework.utility.d
   public class_227 method_1480(class_0 var1) {
      if (var1 == null) {
         this.field_1796 = field_1794;
      } else {
         this.field_1796 = var1;
      }

      return this;
   }

   public void run() {
      this.setName("|ANR-WatchDog|");
      int var2 = -1;

      while(true) {
         if (!this.isInterrupted()) {
            int var1 = this.field_1803;
            this.field_1798.method_1531(this.field_1804);

            try {
               Thread.sleep((long)this.field_1799);
            } catch (InterruptedException var4) {
               this.field_1797.method_1(var4);
               return;
            }

            if (this.field_1803 != var1) {
               continue;
            }

            if (!this.field_1802 && Debug.isDebuggerConnected()) {
               if (this.field_1803 != var2) {
                  Log.method_1710("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
               }

               var2 = this.field_1803;
               continue;
            }

            class_228 var3;
            if (this.field_1800 != null) {
               var3 = class_228.method_1483(this.field_1800, this.field_1801);
            } else {
               var3 = class_228.method_1484();
            }

            this.field_1796.method_0(var3);
            return;
         }

         return;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.d, int) int
   // $FF: synthetic method
   static int method_1481(class_227 var0, int var1) {
      return var0.field_1803 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.d) int
   // $FF: synthetic method
   static int method_1482(class_227 var0) {
      return var0.field_1803;
   }
}
