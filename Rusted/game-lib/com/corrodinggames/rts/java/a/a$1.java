package com.corrodinggames.rts.java.a;

import com.corrodinggames.librocket.class_263;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;

class a$1 implements Runnable {
   // $FF: renamed from: a com.corrodinggames.rts.java.a.a
   // $FF: synthetic field
   final class_222 field_4736;

   a$1(class_222 var1) {
      this.field_4736 = var1;
   }

   public void run() {
      Root var1 = ScriptEngine.getInstance().getRoot();
      class_263 var2 = new class_263("Join", this.field_4736);
      var1.showPopupWithButtons("Invite", "'" + this.field_4736.field_1771 + "' has invited you to join a game", true, var2, (class_263)null);
   }
}
