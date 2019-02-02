package com.corrodinggames.rts.b;

import com.corrodinggames.librocket.scripts.ScriptEngine;

final class a$2 extends class_276 {
   // $FF: renamed from: a com.corrodinggames.librocket.scripts.ScriptEngine
   // $FF: synthetic field
   final ScriptEngine field_2357;
   // $FF: renamed from: b java.lang.String
   // $FF: synthetic field
   final String field_2358;

   strictfp a$2(ScriptEngine var1, String var2) {
      this.field_2357 = var1;
      this.field_2358 = var2;
   }

   public strictfp void run() {
      this.c = this.field_2357.processArg(this.field_2358);
   }
}
