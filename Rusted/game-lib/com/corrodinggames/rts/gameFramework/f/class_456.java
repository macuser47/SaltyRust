package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.b
public class class_456 {
   // $FF: renamed from: a int
   int field_3910;
   // $FF: renamed from: b java.lang.String
   String field_3911;
   // $FF: renamed from: c java.lang.String
   String field_3912;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.f.c
   class_458 field_3913;
   // $FF: renamed from: e long
   long field_3914;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.f.a
   // $FF: synthetic field
   final class_455 field_3915;

   class_456(class_455 var1, int var2, String var3, String var4, class_458 var5) {
      this.field_3915 = var1;
      this.field_3910 = var2;
      this.field_3911 = var3;
      this.field_3912 = var4;
      this.field_3913 = var5;
      this.field_3914 = System.nanoTime();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_2979() {
      String var1;
      if (this.field_3911 != null) {
         var1 = this.field_3911 + ": " + this.field_3912;
      } else {
         var1 = this.field_3912;
      }

      return var1;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_2980() {
      String var1 = "";
      if (this.field_3911 != null) {
         int var2 = -1;
         if (this.field_3910 != -1) {
            var2 = class_107.method_946(this.field_3910);
         }

         var1 = "<strong> <font color='" + class_296.method_2076(var2) + "'>" + this.field_3915.method_2973(this.field_3911) + ": </font></strong>";
      }

      String[] var8 = this.field_3912.split("\n");
      boolean var3 = true;
      String[] var4 = var8;
      int var5 = var8.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         var1 = var1 + this.field_3915.method_2973(var7);
         if (var3) {
            var3 = false;
         } else {
            var1 = var1 + "<br/>";
         }
      }

      return var1;
   }
}
