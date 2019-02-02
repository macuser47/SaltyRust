package com.corrodinggames.rts.java;

import android.app.Activity;
import com.corrodinggames.librocket.class_264;
import com.corrodinggames.rts.gameFramework.class_236;

// $FF: renamed from: com.corrodinggames.rts.java.g
public class class_346 {
   // $FF: renamed from: a com.corrodinggames.rts.java.g
   private static class_346 field_2741;
   // $FF: renamed from: b com.corrodinggames.librocket.a
   private class_264 field_2742;
   // $FF: renamed from: c com.corrodinggames.rts.java.Main
   private Main field_2743;
   // $FF: renamed from: d com.corrodinggames.rts.java.c
   private class_338 field_2744;

   // $FF: renamed from: a () com.corrodinggames.rts.java.g
   public static class_346 method_2275() {
      return field_2741;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.java.Main, com.corrodinggames.librocket.a, com.corrodinggames.rts.java.c) com.corrodinggames.rts.java.g
   public static synchronized class_346 method_2276(Main var0, class_264 var1, class_338 var2) {
      if (field_2741 != null) {
         throw new RuntimeException("JavaGuiEngine already exists");
      } else {
         class_346 var3 = new class_346();
         var3.method_2277(var0, var1, var2);
         field_2741 = var3;
         return var3;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.java.Main, com.corrodinggames.librocket.a, com.corrodinggames.rts.java.c) void
   public void method_2277(Main var1, class_264 var2, class_338 var3) {
      this.field_2743 = var1;
      this.field_2742 = var2;
      this.field_2744 = var3;
   }

   // $FF: renamed from: b () void
   public void method_2278() {
      class_236 var1 = class_236.method_1549();
      if (var1 != null) {
         var1.method_1559((Activity)null, this.field_2744, true);
      } else {
         class_236.method_1591("showMainMenu: game is null");
      }

      this.field_2742.setDocument("mainMenu.rml");
   }

   // $FF: renamed from: c () void
   public void method_2279() {
      this.field_2742.setDocument("settings.rml");
   }
}
