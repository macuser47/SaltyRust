package com.corrodinggames.librocket.scripts;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;

public class ScriptEngine$Action {
   public String script;
   public boolean tryToCatchCrash;
   public String caughtCrash;
   public boolean completed;

   public void run(ScriptEngine var1) {
      try {
         var1.processScript(this.script);
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

   public String waitForCompletionOrCrash() {
      for(int var1 = 0; var1 < 3000; ++var1) {
         if (this.completed) {
            return this.caughtCrash;
         }

         try {
            Thread.sleep(10L);
         } catch (InterruptedException var3) {
            var3.printStackTrace();
         }
      }

      return "Time Out";
   }
}
