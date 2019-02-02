package com.corrodinggames.librocket.scripts;

class Root$1 implements Runnable {
   // $FF: synthetic field
   final Root this$0;

   Root$1(Root var1) {
      this.this$0 = var1;
   }

   public void run() {
      ScriptEngine.getInstance().addScriptToQueue("joinServerCallback();");
   }
}
