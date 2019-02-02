package com.a.a.a;

// $FF: renamed from: com.a.a.a.a
public class class_248 {
   // $FF: renamed from: a java.lang.Object[]
   private static Object[] field_2222 = new Object[0];
   // $FF: renamed from: b java.lang.Object[]
   private static Object[] field_2223 = new Object[73];

   // $FF: renamed from: a (int) int
   public static int method_1784(int var0) {
      for(int var1 = 4; var1 < 32; ++var1) {
         if (var0 <= (1 << var1) - 12) {
            return (1 << var1) - 12;
         }
      }

      return var0;
   }

   // $FF: renamed from: b (int) int
   public static int method_1785(int var0) {
      return method_1784(var0 * 2) / 2;
   }

   // $FF: renamed from: c (int) int
   public static int method_1786(int var0) {
      return method_1784(var0 * 4) / 4;
   }
}
