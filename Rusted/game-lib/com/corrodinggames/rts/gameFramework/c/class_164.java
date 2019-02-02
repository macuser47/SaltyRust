package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.i
class class_164 {
   // $FF: renamed from: a java.lang.String
   String field_1470;
   // $FF: renamed from: b java.lang.String
   String field_1471;
   // $FF: renamed from: c long
   long field_1472;
   // $FF: renamed from: d java.lang.String
   String field_1473;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.c.h
   // $FF: synthetic field
   final class_162 field_1474;

   class_164(class_162 var1) {
      this.field_1474 = var1;
   }

   // $FF: renamed from: a () boolean
   public boolean method_1198() {
      short var1 = 14000;
      class_236 var2 = class_236.method_1549();
      if (var2.method_1557()) {
         return true;
      } else {
         return this.field_1472 + (long)var1 > System.currentTimeMillis();
      }
   }
}
