package com.corrodinggames.rts.gameFramework.g;

import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g.f
public final class class_245 implements Comparable {
   // $FF: renamed from: a short
   public short field_2175;
   // $FF: renamed from: b short
   public short field_2176;
   // $FF: renamed from: c int
   public int field_2177;

   // $FF: renamed from: a (short, short) void
   public final strictfp void method_1762(short var1, short var2) {
      this.field_2175 = var1;
      this.field_2176 = var2;
   }

   // $FF: renamed from: a (int, int, int) void
   public final strictfp void method_1763(int var1, int var2, int var3) {
      int var4 = var2 - this.field_2175;
      int var5 = var3 - this.field_2176;
      var4 = var4 > 0 ? var4 : -var4;
      var5 = var5 > 0 ? var5 : -var5;
      int var6 = var1 + (var4 + var5) * 10 + class_296.method_2045(var4, var5) * -6;
      this.field_2177 = var6;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.g.f) int
   public final strictfp int method_1764(class_245 var1) {
      if (this.field_2177 == var1.field_2177) {
         return this.field_2175 - var1.field_2175 != 0 ? this.field_2175 - var1.field_2175 : this.field_2176 - var1.field_2176;
      } else {
         return this.field_2177 - var1.field_2177;
      }
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_1764((class_245)var1);
   }
}
