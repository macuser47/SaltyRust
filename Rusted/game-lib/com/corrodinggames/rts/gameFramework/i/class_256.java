package com.corrodinggames.rts.gameFramework.i;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.i.b
public enum class_256 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.i.b
   field_2267,
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.i.b
   field_2268,
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.i.b
   field_2269,
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.i.b
   field_2270,
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.i.b
   field_2271,
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.i.b
   field_2272;

   private class_256() {
   }

   // $FF: renamed from: a () java.lang.String
   public abstract String method_1811();

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.i.b
   public static class_256 method_1812(String var0) {
      class_256[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         class_256 var4 = var1[var3];
         if (var4.method_1811().equalsIgnoreCase(var0)) {
            return var4;
         }
      }

      return null;
   }

   // $FF: synthetic method
   class_256(b$1 var3) {
      this();
   }
}
