package com.corrodinggames.rts.java.audio.a;

import java.util.Random;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.m
public final class class_177 {
   // $FF: renamed from: a java.util.Random
   public static Random field_1574 = new Random();

   // $FF: renamed from: a (float) float
   public static float method_1245(float var0) {
      return class_175.field_1567[(int)(var0 * 2607.5945F) & 16383];
   }

   // $FF: renamed from: b (float) float
   public static float method_1246(float var0) {
      return class_175.field_1567[(int)((var0 + 1.5707964F) * 2607.5945F) & 16383];
   }

   // $FF: renamed from: a (int) int
   public static int method_1247(int var0) {
      return field_1574.nextInt(var0 + 1);
   }

   // $FF: renamed from: b (int) int
   public static int method_1248(int var0) {
      if (var0 == 0) {
         return 1;
      } else {
         --var0;
         var0 |= var0 >> 1;
         var0 |= var0 >> 2;
         var0 |= var0 >> 4;
         var0 |= var0 >> 8;
         var0 |= var0 >> 16;
         return var0 + 1;
      }
   }

   // $FF: renamed from: a (float, float, float) float
   public static float method_1249(float var0, float var1, float var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }
}
