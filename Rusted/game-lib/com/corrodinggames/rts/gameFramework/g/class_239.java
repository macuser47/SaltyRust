package com.corrodinggames.rts.gameFramework.g;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.utility.class_193;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g.e
public class class_239 {
   // $FF: renamed from: a int
   int field_2124;
   // $FF: renamed from: b int
   int field_2125;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.utility.k
   class_193 field_2126;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.g.a
   class_235 field_2127 = new class_235();

   strictfp class_239() {
      short var1 = 500;
      this.field_2126 = new class_193(var1);

      for(int var2 = 0; var2 < var1; ++var2) {
         this.field_2126.add(new class_245());
      }

   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.g.f
   strictfp class_245 method_1719() {
      if (this.field_2126.isEmpty()) {
         this.field_2126.add(new class_245());
      }

      return (class_245)this.field_2126.method_1301();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.f) void
   strictfp void method_1720(class_245 var1) {
      if (var1 != null) {
         this.field_2126.add(var1);
      }

   }

   // $FF: renamed from: b () void
   strictfp void method_1721() {
      if (this.field_2126.size() > 5000) {
         class_236.method_1591("PathOpenList: resetPool:memoryPool over 5000 clearing");
         this.field_2126.clear();
      }

      this.field_2127.method_1545();
   }

   // $FF: renamed from: a (int, int) void
   public strictfp void method_1722(int var1, int var2) {
      this.method_1721();
      this.field_2124 = var1;
      this.field_2125 = var2;
   }

   // $FF: renamed from: a (int, short, short) void
   public final strictfp void method_1723(int var1, short var2, short var3) {
      class_245 var4 = this.method_1719();
      var4.method_1762(var2, var3);
      var4.method_1763(var1, this.field_2124, this.field_2125);
      this.field_2127.method_1542(var4);
   }

   // $FF: renamed from: c () com.corrodinggames.rts.gameFramework.g.f
   public final strictfp class_245 method_1724() {
      class_245 var1 = this.field_2127.method_1543();
      if (var1 != null) {
         this.method_1720(var1);
      }

      return var1;
   }
}
