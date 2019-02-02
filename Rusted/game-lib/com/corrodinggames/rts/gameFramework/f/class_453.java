package com.corrodinggames.rts.gameFramework.f;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.z
public class class_453 implements Cloneable {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.f.aa
   public class_396 field_3775;
   // $FF: renamed from: b java.lang.String
   public String field_3776;
   // $FF: renamed from: c int
   public int field_3777;
   // $FF: renamed from: d int
   public int field_3778;
   // $FF: renamed from: e boolean
   public boolean field_3779;
   // $FF: renamed from: f int
   public int field_3780;
   // $FF: renamed from: g int
   public int field_3781;
   // $FF: renamed from: h float
   public float field_3782;
   // $FF: renamed from: i boolean
   public boolean field_3783;
   // $FF: renamed from: j boolean
   public boolean field_3784;
   // $FF: renamed from: k boolean
   public boolean field_3785;

   public strictfp class_453() {
      this.field_3775 = class_396.field_3237;
      this.field_3776 = "[z;p10]Crossing Large (10p).tmx";
      this.field_3777 = 0;
      this.field_3778 = 2;
      this.field_3779 = true;
      this.field_3780 = 1;
      this.field_3781 = 1;
      this.field_3782 = 1.0F;
      this.field_3783 = false;
      this.field_3784 = false;
   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.f.z
   public strictfp class_453 method_2844() {
      try {
         return (class_453)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new RuntimeException(var2);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_2845(class_404 var1) {
      var1.method_2539(0);
      var1.method_2541(this.field_3778);
      var1.method_2541(this.field_3777);
      var1.method_2540(this.field_3779);
      var1.method_2541(this.field_3780);
      var1.method_2541(this.field_3781);
      var1.method_2542(this.field_3782);
      var1.method_2540(this.field_3783);
      var1.method_2540(this.field_3784);
      var1.method_2540(this.field_3785);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_2846(class_463 var1) {
      var1.method_3009();
      this.field_3778 = var1.method_3011();
      this.field_3777 = var1.method_3011();
      this.field_3779 = var1.method_3010();
      this.field_3780 = var1.method_3011();
      this.field_3781 = var1.method_3011();
      this.field_3782 = var1.method_3012();
      this.field_3783 = var1.method_3010();
      this.field_3784 = var1.method_3010();
      this.field_3785 = var1.method_3010();
   }

   // $FF: synthetic method
   public Object clone() {
      return this.method_2844();
   }
}
