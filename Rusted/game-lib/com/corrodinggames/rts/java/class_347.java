package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.java.h
class class_347 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.java.Main
   // $FF: synthetic field
   final Main field_2745;

   class_347(Main var1) {
      this.field_2745 = var1;
   }

   public void run() {
      class_236.method_1649();

      while(this.field_2745.field_1822) {
         while(!this.field_2745.field_1852.isEmpty()) {
            class_348 var1 = (class_348)this.field_2745.field_1852.poll();
            this.field_2745.field_1825.method_2938(var1.field_2746);
         }

         synchronized(this.field_2745.field_1851) {
            if (this.field_2745.field_1852.isEmpty()) {
               try {
                  this.field_2745.field_1851.wait();
               } catch (InterruptedException var4) {
                  var4.printStackTrace();
               }
            }
         }
      }

   }
}
