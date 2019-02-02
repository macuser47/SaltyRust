package android.util;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Log {
   private Log() {
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) int
   public static int method_1708(String var0, String var1) {
      return method_1717(0, 2, var0, var1);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) int
   public static int method_1709(String var0, String var1) {
      return method_1717(0, 3, var0, var1);
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String) int
   public static int method_1710(String var0, String var1) {
      return method_1717(0, 5, var0, var1);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.Throwable) int
   public static int method_1711(String var0, String var1, Throwable var2) {
      return method_1717(0, 5, var0, var1 + '\n' + method_1716(var2));
   }

   public static native boolean isLoggable(String var0, int var1);

   // $FF: renamed from: d (java.lang.String, java.lang.String) int
   public static int method_1712(String var0, String var1) {
      return method_1717(0, 6, var0, var1);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String, java.lang.Throwable) int
   public static int method_1713(String var0, String var1, Throwable var2) {
      return method_1717(0, 6, var0, var1 + '\n' + method_1716(var2));
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String, java.lang.Throwable) int
   public static int method_1714(String var0, String var1, Throwable var2) {
      return method_1715(0, var0, var1, var2, false);
   }

   // $FF: renamed from: a (int, java.lang.String, java.lang.String, java.lang.Throwable, boolean) int
   static int method_1715(int var0, String var1, String var2, Throwable var3, boolean var4) {
      throw new RuntimeException("removed");
   }

   // $FF: renamed from: a (java.lang.Throwable) java.lang.String
   public static String method_1716(Throwable var0) {
      StringWriter var1 = new StringWriter();
      StackTraceElement[] var2 = (new Throwable()).getStackTrace();
      StackTraceElement[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         StackTraceElement var6 = var3[var5];
         var1.write(var6.toString() + "\n");
      }

      return var1.toString();
   }

   // $FF: renamed from: a (int, int, java.lang.String, java.lang.String) int
   public static int method_1717(int var0, int var1, String var2, String var3) {
      method_1718(var0, var2, var3);
      return 0;
   }

   // $FF: renamed from: a (int, java.lang.String, java.lang.String) int
   public static int method_1718(int var0, String var1, String var2) {
      String var3 = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")).format(new Date());
      System.out.println(var3 + ": " + var2);
      return 0;
   }
}
