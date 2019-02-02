package com.corrodinggames.rts.gameFramework.utility;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.c
class class_226 extends Throwable {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.b
   // $FF: synthetic field
   final class_229 field_1793;

   private class_226(class_229 var1, class_226 var2) {
      super(class_229.method_1486(var1), var2);
      this.field_1793 = var1;
   }

   public Throwable fillInStackTrace() {
      this.setStackTrace(class_229.method_1487(this.field_1793));
      return this;
   }

   // $FF: synthetic method
   class_226(class_229 var1, class_226 var2, a$1 var3) {
      this(var1, var2);
   }
}
