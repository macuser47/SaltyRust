package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_236;
import java.util.List;
import java.util.concurrent.Callable;

final class k$1 implements Callable {
   // $FF: renamed from: a java.lang.String
   // $FF: synthetic field
   final String field_4132;
   // $FF: renamed from: b java.util.List
   // $FF: synthetic field
   final List field_4133;

   k$1(String var1, List var2) {
      this.field_4132 = var1;
      this.field_4133 = var2;
   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.f.q
   public class_446 method_3079() {
      try {
         class_236.method_1591("Running doSingleRequest:" + this.field_4132);
         return class_444.method_2829(this.field_4133, this.field_4132);
      } catch (Exception var2) {
         class_236.method_1591("Error on doSingleRequest:" + this.field_4132);
         var2.printStackTrace();
         return null;
      }
   }

   // $FF: synthetic method
   public Object call() {
      return this.method_3079();
   }
}
