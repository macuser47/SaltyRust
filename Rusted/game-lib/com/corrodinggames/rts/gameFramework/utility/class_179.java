package com.corrodinggames.rts.gameFramework.utility;

import java.util.concurrent.ConcurrentLinkedQueue;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.ab
public class class_179 {
   // $FF: renamed from: a java.util.concurrent.ConcurrentLinkedQueue
   ConcurrentLinkedQueue field_1578 = new ConcurrentLinkedQueue();

   // $FF: renamed from: a (java.lang.Runnable) void
   public void method_1252(Runnable var1) {
      this.field_1578.add(var1);
   }

   // $FF: renamed from: a () void
   public void method_1253() {
      while(true) {
         Runnable var1 = (Runnable)this.field_1578.poll();
         if (var1 == null) {
            return;
         }

         var1.run();
      }
   }
}
