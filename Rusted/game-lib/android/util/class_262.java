package android.util;

// $FF: renamed from: android.util.a
class class_262 {
   // $FF: renamed from: a boolean[]
   static final boolean[] field_2306 = new boolean[0];
   // $FF: renamed from: b int[]
   static final int[] field_2307 = new int[0];
   // $FF: renamed from: c long[]
   static final long[] field_2308 = new long[0];
   // $FF: renamed from: d java.lang.Object[]
   static final Object[] field_2309 = new Object[0];

   // $FF: renamed from: a (int[], int, int) int
   static int method_1828(int[] var0, int var1, int var2) {
      int var3 = 0;
      int var4 = var1 - 1;

      while(var3 <= var4) {
         int var5 = var3 + var4 >>> 1;
         int var6 = var0[var5];
         if (var6 < var2) {
            var3 = var5 + 1;
         } else {
            if (var6 <= var2) {
               return var5;
            }

            var4 = var5 - 1;
         }
      }

      return ~var3;
   }
}
