package com.corrodinggames.rts.gameFramework;

import java.util.Locale;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.g
public final class class_298 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.h
   protected static class_303 field_2503;

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.h
   public static strictfp class_303 method_2103() {
      if (field_2503 == null) {
         String var0 = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
         if (var0.indexOf("mac") < 0 && var0.indexOf("darwin") < 0) {
            if (var0.indexOf("win") >= 0) {
               field_2503 = class_303.field_2513;
            } else if (var0.indexOf("nux") >= 0) {
               field_2503 = class_303.field_2515;
            } else {
               field_2503 = class_303.field_2516;
            }
         } else {
            field_2503 = class_303.field_2514;
         }
      }

      return field_2503;
   }
}
