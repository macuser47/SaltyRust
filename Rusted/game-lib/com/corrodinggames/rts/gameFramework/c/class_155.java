package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_401;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.d
public class class_155 {
   // $FF: renamed from: a java.lang.String
   public String field_1433;
   // $FF: renamed from: b java.lang.String
   public String field_1434;
   // $FF: renamed from: c float
   public float field_1435;
   // $FF: renamed from: d float
   public float field_1436;

   public class_155(String var1, String var2) {
      this.field_1433 = var1;
      this.field_1434 = var2;
   }

   public class_155(String var1, float var2) {
      this.field_1433 = var1;
      this.field_1435 = var2;
      this.field_1434 = null;
   }

   // $FF: renamed from: a () java.util.ArrayList
   public static ArrayList method_1169() {
      class_236 var0 = class_236.method_1549();
      ArrayList var1 = new ArrayList();
      class_401 var2 = null;
      if (var0.field_1915 != null) {
         var2 = var0.field_1945.method_2518(var0.field_1915);
      }

      if (var2 != null) {
         class_155 var3 = new class_155("Game Time", class_296.method_2095((long)(var0.field_1921 / 1000)));
         var1.add(var3);
         var3 = new class_155("=============================", "");
         var1.add(var3);
         var3 = new class_155("Units Killed", (float)var2.field_3281);
         var1.add(var3);
         var3 = new class_155("Buildings Killed", (float)var2.field_3282);
         var1.add(var3);
         var3 = new class_155("Experimentals Killed", (float)var2.field_3283);
         var1.add(var3);
         var3 = new class_155("=============================", "");
         var1.add(var3);
         var3 = new class_155("Units Lost", (float)var2.field_3284);
         var1.add(var3);
         var3 = new class_155("Buildings Lost", (float)var2.field_3285);
         var1.add(var3);
         var3 = new class_155("Experimentals Lost", (float)var2.field_3286);
         var1.add(var3);
         var3 = new class_155("=============================", "");
         var1.add(var3);
      }

      return var1;
   }
}
