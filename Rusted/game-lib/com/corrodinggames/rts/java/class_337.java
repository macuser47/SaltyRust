package com.corrodinggames.rts.java;

import org.lwjgl.opengl.Display;

// $FF: renamed from: com.corrodinggames.rts.java.b
public class class_337 extends Thread {
   // $FF: renamed from: a com.corrodinggames.rts.java.a
   // $FF: synthetic field
   final class_341 field_2689;

   public class_337(class_341 var1) {
      this.field_2689 = var1;
   }

   public void run() {
      while(true) {
         try {
            Thread.sleep(1L);
         } catch (InterruptedException var2) {
         }

         Display.processMessages();
      }
   }
}
