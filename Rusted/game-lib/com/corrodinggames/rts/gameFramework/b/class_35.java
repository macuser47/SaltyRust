package com.corrodinggames.rts.gameFramework.b;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.b.f
public class class_35 extends class_34 {
   // $FF: renamed from: a float
   public float field_80;
   // $FF: renamed from: b boolean
   public boolean field_81 = true;
   // $FF: renamed from: c float
   float field_82;
   // $FF: renamed from: d float
   float field_83;
   // $FF: renamed from: e float
   float field_84;
   // $FF: renamed from: f float
   float field_85;
   // $FF: renamed from: g float
   float field_86;
   // $FF: renamed from: h float
   float field_87;
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.b.e
   class_390 field_88;
   // $FF: renamed from: j int
   public int field_89 = 0;
   // $FF: renamed from: k float
   float field_90;
   // $FF: renamed from: l float
   float field_91;
   // $FF: renamed from: m float
   float field_92;
   // $FF: renamed from: n float
   float field_93;
   // $FF: renamed from: o float
   float field_94;
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.b.h
   class_395 field_95;
   // $FF: renamed from: q float
   public float field_96;
   // $FF: renamed from: r boolean
   public boolean field_97 = false;
   // $FF: renamed from: s com.corrodinggames.rts.gameFramework.b.e
   static class_390 field_98;
   // $FF: renamed from: t com.corrodinggames.rts.gameFramework.b.e
   static class_390 field_99;
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.b.c
   private final class_391 field_100;

   // $FF: renamed from: b () void
   public static strictfp void method_191() {
      class_391 var0 = class_236.method_1549().field_1938;
      class_390 var1 = new class_390(var0);
      method_192(var1, false);
      field_98 = var1;
      var1 = new class_390(var0);
      method_193(var1, false);
      field_99 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.dh);
      var1.method_2542(this.di);
      var1.method_2542(this.field_80);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.dh = var1.method_3012();
      this.di = var1.method_3012();
      this.field_80 = var1.method_3012();
      this.field_81 = false;
      super.method_175(var1);
   }

   public strictfp class_35(class_391 var1) {
      this.field_100 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.b.e, boolean) void
   public static strictfp void method_192(class_390 var0, boolean var1) {
      var0.method_2454();
      var0.field_3178 = 5;
      if (var1) {
         var0.field_3176 = class_296.method_2036(0, 1);
      } else {
         var0.field_3176 = 0;
      }

      var0.field_3162 = 0.0F;
      var0.field_3175 = true;
      var0.field_3154 = 0.1F;
      var0.field_3156 = 0.5F;
      var0.field_3138 = true;
      var0.field_3160 = 300.0F;
      var0.field_3161 = var0.field_3160;
      var0.field_3135 = true;
      var0.field_3136 = true;
      var0.field_3137 = 40.0F;
      var0.field_3180 = false;
      var0.field_3179 = 2;
      var0.field_3145 = 0.4F;
      var0.field_3144 = 1.5F;
      var0.field_3124 = class_390.field_3128;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.b.e, boolean) void
   public static strictfp void method_193(class_390 var0, boolean var1) {
      var0.method_2454();
      var0.field_3178 = 7;
      if (var1) {
         var0.field_3176 = class_296.method_2036(0, 3);
      } else {
         var0.field_3176 = 0;
      }

      var0.field_3162 = 0.0F;
      var0.field_3175 = true;
      var0.field_3154 = 0.0F;
      var0.field_3156 = 0.2F;
      var0.field_3138 = true;
      var0.field_3160 = 50.0F;
      var0.field_3161 = var0.field_3160;
      var0.field_3135 = true;
      var0.field_3136 = true;
      var0.field_3137 = 10.0F;
      var0.field_3180 = false;
      var0.field_3179 = 2;
      var0.field_3124 = class_390.field_3131;
   }

   // $FF: renamed from: a (float, float) com.corrodinggames.rts.gameFramework.b.f
   public static strictfp class_35 method_194(float var0, float var1) {
      class_35 var2 = method_196(var0, var1, field_98);
      var2.field_80 = 280.0F;
      var2.field_85 = 10.0F;
      var2.field_82 = 10.0F;
      var2.field_90 = 0.03F;
      var2.field_91 = 0.03F;
      var2.field_93 = 6.0F;
      var2.field_94 = 6.0F;
      var2.field_95 = class_395.field_3221;
      return var2;
   }

   // $FF: renamed from: b (float, float) com.corrodinggames.rts.gameFramework.b.f
   public static strictfp class_35 method_195(float var0, float var1) {
      class_35 var2 = method_196(var0, var1, field_99);
      var2.field_80 = 330.0F;
      var2.field_85 = 10.0F;
      var2.field_82 = 10.0F;
      var2.field_90 = 0.1F;
      var2.field_91 = 0.03F;
      var2.field_93 = 4.0F;
      var2.field_94 = 4.0F;
      var2.field_95 = class_395.field_3221;
      return var2;
   }

   // $FF: renamed from: a (float, float, com.corrodinggames.rts.gameFramework.b.e) com.corrodinggames.rts.gameFramework.b.f
   public static strictfp class_35 method_196(float var0, float var1, class_390 var2) {
      class_391 var3 = class_236.method_1549().field_1938;
      class_35 var4 = new class_35(var3);
      var4.dh = var0;
      var4.di = var1;
      var4.field_80 = 100.0F;
      var4.field_85 = 10.0F;
      var4.field_88 = var2;
      if (var2 == null) {
         var4.field_88 = new class_390(var3);
         class_236.method_1588("Error: Emitter create srcEffect==null");
      }

      return var4;
   }

   // $FF: renamed from: c () boolean
   public strictfp boolean method_197() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1981.method_1973(this.dh, this.di);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      this.field_96 = class_296.method_2020(this.field_96, var1);
      if (this.field_96 <= 0.0F) {
         if (this.field_81) {
            this.field_82 += var1;
            boolean var2 = false;
            if (this.field_82 > this.field_85) {
               this.field_83 += var1;
               if (this.field_83 > this.field_86) {
                  this.field_83 = 0.0F;
                  ++this.field_84;
                  if (this.field_84 > this.field_87) {
                     this.field_82 = 0.0F;
                     this.field_84 = 0.0F;
                  }

                  if (this.field_97 || this.method_197()) {
                     class_390 var3 = this.field_100.method_2488(this.dh, this.di, 0.0F, class_393.field_3201, false, this.field_95);
                     if (var3 != null) {
                        var3.method_2455(this.field_88);
                        var3.field_3154 += class_296.method_2033(-this.field_90, this.field_90);
                        var3.field_3155 += class_296.method_2033(-this.field_91, this.field_91);
                        var3.field_3156 += class_296.method_2033(-this.field_92, this.field_92);
                        var3.field_3147 = this.dh;
                        var3.field_3148 = this.di;
                        var3.field_3147 += class_296.method_2033(-this.field_93, this.field_93);
                        var3.field_3148 += class_296.method_2033(-this.field_94, this.field_94);
                        if (this.field_89 != 0) {
                           var3.field_3141 = this.field_89;
                        }
                     }
                  }
               }
            }
         }

         this.field_80 -= var1;
         if (this.field_80 < 0.0F) {
            this.a();
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k) boolean
   public strictfp boolean method_183(class_236 var1) {
      return false;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return false;
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
   }

   // $FF: renamed from: d (float) void
   public strictfp void method_178(float var1) {
   }

   // $FF: renamed from: f (float) boolean
   public strictfp boolean method_182(float var1) {
      return false;
   }
}
