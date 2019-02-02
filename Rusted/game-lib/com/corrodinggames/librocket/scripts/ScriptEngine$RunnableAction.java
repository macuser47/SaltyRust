package com.corrodinggames.librocket.scripts;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;

public class ScriptEngine$RunnableAction extends ScriptEngine$Action {
   Runnable runnable;

   ScriptEngine$RunnableAction(Runnable var1) {
      this.runnable = var1;
   }

   public void run(ScriptEngine var1) {
      try {
         this.runnable.run();
      } catch (Exception var6) {
         if (!this.tryToCatchCrash) {
            throw new RuntimeException(var6);
         }

         class_236.method_1589("caught script crash", var6);
         this.caughtCrash = class_296.method_2088(var6);
      } finally {
         this.completed = true;
      }

   }
}
