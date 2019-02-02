package android.graphics;

import java.util.HashMap;
import java.util.Locale;

public class Color {
   // $FF: renamed from: a java.util.HashMap
   private static final HashMap field_4131 = new HashMap();

   // $FF: renamed from: a (int) int
   public static int method_3072(int var0) {
      return var0 >>> 24;
   }

   // $FF: renamed from: b (int) int
   public static int method_3073(int var0) {
      return var0 >> 16 & 255;
   }

   // $FF: renamed from: c (int) int
   public static int method_3074(int var0) {
      return var0 >> 8 & 255;
   }

   // $FF: renamed from: d (int) int
   public static int method_3075(int var0) {
      return var0 & 255;
   }

   // $FF: renamed from: a (int, int, int) int
   public static int method_3076(int var0, int var1, int var2) {
      return -16777216 | var0 << 16 | var1 << 8 | var2;
   }

   // $FF: renamed from: a (int, int, int, int) int
   public static int method_3077(int var0, int var1, int var2, int var3) {
      return var0 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   // $FF: renamed from: a (java.lang.String) int
   public static int method_3078(String var0) {
      if (var0.charAt(0) == '#') {
         long var3 = Long.parseLong(var0.substring(1), 16);
         if (var0.length() == 7) {
            var3 |= -16777216L;
         } else if (var0.length() != 9) {
            throw new IllegalArgumentException("Unknown color");
         }

         return (int)var3;
      } else {
         Integer var1 = (Integer)field_4131.get(var0.toLowerCase(Locale.ROOT));
         if (var1 != null) {
            return var1;
         } else {
            throw new IllegalArgumentException("Unknown color");
         }
      }
   }

   static {
      field_4131.put("black", -16777216);
      field_4131.put("darkgray", -12303292);
      field_4131.put("gray", -7829368);
      field_4131.put("lightgray", -3355444);
      field_4131.put("white", -1);
      field_4131.put("red", -65536);
      field_4131.put("green", -16711936);
      field_4131.put("blue", -16776961);
      field_4131.put("yellow", -256);
      field_4131.put("cyan", -16711681);
      field_4131.put("magenta", -65281);
      field_4131.put("aqua", -16711681);
      field_4131.put("fuchsia", -65281);
      field_4131.put("darkgrey", -12303292);
      field_4131.put("grey", -7829368);
      field_4131.put("lightgrey", -3355444);
      field_4131.put("lime", -16711936);
      field_4131.put("maroon", -8388608);
      field_4131.put("navy", -16777088);
      field_4131.put("olive", -8355840);
      field_4131.put("purple", -8388480);
      field_4131.put("silver", -4144960);
      field_4131.put("teal", -16744320);
   }
}
