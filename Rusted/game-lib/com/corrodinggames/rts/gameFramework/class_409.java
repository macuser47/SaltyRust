package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.aq
enum class_409 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.aq
   field_3381,
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.aq
   field_3382,
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.aq
   field_3383;

   // $FF: renamed from: d java.lang.String[]
   String[] field_3384;

   private class_409() {
   }

   // $FF: renamed from: a () void
   void method_2628() {
      this.field_3384 = class_236.method_1638(this.method_2631(), false);
      class_236 var1 = class_236.method_1549();
      ArrayList var2 = new ArrayList();
      String[] var3 = this.field_3384;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         if (class_439.method_2755(this.method_2632(var6), true) != null) {
            class_236.method_1591("Loaded track:" + var6);
            var2.add(var6);
         } else {
            class_236.method_1588("Skipping track:" + var6);
         }

         var1.method_1605("music", false);
      }

      this.field_3384 = (String[])var2.toArray(new String[0]);
   }

   // $FF: renamed from: b () java.lang.String[]
   String[] method_2629() {
      return this.field_3384;
   }

   // $FF: renamed from: c () void
   static void method_2630() {
      field_3381.method_2628();
      field_3382.method_2628();
      field_3383.method_2628();
   }

   // $FF: renamed from: d () java.lang.String
   abstract String method_2631();

   // $FF: renamed from: a (java.lang.String) java.lang.String
   String method_2632(String var1) {
      return this.method_2631() + "/" + var1;
   }

   // $FF: synthetic method
   class_409(aj$1 var3) {
      this();
   }
}
