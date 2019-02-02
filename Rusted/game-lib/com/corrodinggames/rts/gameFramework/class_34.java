package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.aa;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.p;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.utility.class_199;
import com.corrodinggames.rts.gameFramework.utility.class_203;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.u
public abstract class class_34 extends class_30 {
   // $FF: renamed from: da long
   public long field_67;
   // $FF: renamed from: db com.corrodinggames.rts.gameFramework.v
   public static class_286 field_68 = new class_286();
   // $FF: renamed from: dc boolean
   public boolean field_69;
   // $FF: renamed from: dd boolean
   public boolean field_70;
   // $FF: renamed from: de boolean
   public boolean field_71;
   // $FF: renamed from: df int
   public int field_72;
   // $FF: renamed from: dg int
   public int field_73;
   // $FF: renamed from: dh float
   public float field_74;
   // $FF: renamed from: di float
   public float field_75;
   // $FF: renamed from: dj float
   public float field_76;
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.m
   private static class_199 field_77 = new class_199();
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.utility.m
   private static class_199 field_78 = new class_199();
   // $FF: renamed from: dk com.corrodinggames.rts.gameFramework.utility.q
   public static class_203 field_79 = new class_203("fastGameObjectList");

   // $FF: renamed from: I (int) void
   public strictfp void method_174(int var1) {
      this.field_72 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2540(this.field_69);
      var1.method_2540(this.field_70);
      var1.method_2541(this.field_72);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_69 = var1.method_3010();
      this.field_70 = var1.method_3010();
      this.field_72 = var1.method_3011();
   }

   public strictfp class_34() {
      this(false);
   }

   public strictfp class_34(boolean var1) {
      this.field_69 = false;
      this.field_70 = false;
      this.field_72 = 2;
      this.field_73 = 0;
      this.field_76 = 0.0F;
      if (!var1) {
         class_236 var2 = class_236.method_1549();
         if (this.field_67 != 0L) {
            throw new RuntimeException("ID for GameObject is already set at:" + this.field_67);
         }

         this.field_67 = var2.field_1944.method_2880();
         field_77.method_1316(this);
         field_78.method_1316(this);
         field_79.method_1340(this);
      }

   }

   // $FF: renamed from: a (float) void
   public abstract void method_176(float var1);

   // $FF: renamed from: a (float, boolean) void
   public abstract void method_177(float var1, boolean var2);

   // $FF: renamed from: d (float) void
   public abstract void method_178(float var1);

   // $FF: renamed from: e (float) void
   public abstract void method_179(float var1);

   // $FF: renamed from: m (float) void
   public strictfp void method_180(float var1) {
   }

   // $FF: renamed from: c (float) boolean
   public abstract boolean method_181(float var1);

   // $FF: renamed from: f (float) boolean
   public abstract boolean method_182(float var1);

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k) boolean
   public strictfp boolean method_183(class_236 var1) {
      return true;
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      field_77.method_1317(this);
      field_78.method_1317(this);
      field_79.remove(this);
      this.field_69 = true;
   }

   // $FF: renamed from: a (long, java.lang.Class, boolean) com.corrodinggames.rts.gameFramework.u
   public static strictfp class_34 method_185(long var0, Class var2, boolean var3) {
      if (var0 == -1L) {
         return null;
      } else {
         class_34[] var4 = field_79.method_1339();
         int var5 = 0;

         for(int var6 = field_79.size(); var5 < var6; ++var5) {
            class_34 var7 = var4[var5];
            if (var7.field_67 == var0) {
               if (var2.isInstance(var7)) {
                  return var7;
               }

               class_454.method_2887("object id:" + var0 + " was found, but with type " + var7.getClass().getName() + " instead of " + var2.getName());
            }
         }

         if (!var3) {
            class_454.method_2887("getFromId:" + var0 + " was not found");
         }

         return null;
      }
   }

   // $FF: renamed from: a (long, boolean) com.corrodinggames.rts.game.units.aa
   public static strictfp class_39 method_186(long var0, boolean var2) {
      return (class_39)method_185(var0, aa.class, var2);
   }

   // $FF: renamed from: b (long, boolean) com.corrodinggames.rts.game.units.p
   public static strictfp class_44 method_187(long var0, boolean var2) {
      return (class_44)method_185(var0, p.class, var2);
   }

   // $FF: renamed from: ct () com.corrodinggames.rts.gameFramework.utility.m
   public static strictfp class_199 method_188() {
      field_77.method_1318();
      return field_77;
   }

   // $FF: renamed from: cu () com.corrodinggames.rts.gameFramework.utility.m
   public static strictfp class_199 method_189() {
      field_78.method_1318();
      return field_78;
   }

   // $FF: renamed from: cv () void
   public static strictfp void method_190() {
      field_77.method_1318();
      field_78.method_1318();
   }
}
