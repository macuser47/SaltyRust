package android.graphics;

import com.a.a.a.class_248;

public class TemporaryBuffer {
   // $FF: renamed from: a char[]
   private static char[] field_2697 = null;

   // $FF: renamed from: a (int) char[]
   public static char[] method_2243(int var0) {
      Class var2 = TemporaryBuffer.class;
      char[] var1;
      synchronized(TemporaryBuffer.class) {
         var1 = field_2697;
         field_2697 = null;
      }

      if (var1 == null || var1.length < var0) {
         var1 = new char[class_248.method_1785(var0)];
      }

      return var1;
   }

   // $FF: renamed from: a (char[]) void
   public static void method_2244(char[] var0) {
      if (var0.length <= 1000) {
         Class var1 = TemporaryBuffer.class;
         synchronized(TemporaryBuffer.class) {
            field_2697 = var0;
         }
      }
   }
}
