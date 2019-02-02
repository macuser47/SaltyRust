package com.corrodinggames.rts.a;

// $FF: renamed from: com.corrodinggames.rts.a.k
public class class_352 {
   // $FF: renamed from: a int
   private int field_2770;
   // $FF: renamed from: b float[]
   private float[] field_2771 = new float[10];
   // $FF: renamed from: c float[]
   private float[] field_2772 = new float[10];
   // $FF: renamed from: d float[]
   private float[] field_2773 = new float[10];
   // $FF: renamed from: e int[]
   private int[] field_2774 = new int[10];
   // $FF: renamed from: f float
   private float field_2775;
   // $FF: renamed from: g float
   private float field_2776;
   // $FF: renamed from: h float
   private float field_2777;
   // $FF: renamed from: i float
   private float field_2778;
   // $FF: renamed from: j float
   private float field_2779;
   // $FF: renamed from: k boolean
   private boolean field_2780;
   // $FF: renamed from: l boolean
   private boolean field_2781;
   // $FF: renamed from: m boolean
   private boolean field_2782;
   // $FF: renamed from: n int
   private int field_2783;
   // $FF: renamed from: o boolean
   private boolean field_2784;
   // $FF: renamed from: p boolean
   private boolean field_2785;
   // $FF: renamed from: q boolean
   private boolean field_2786;
   // $FF: renamed from: r int
   private int field_2787;

   public class_352() {
      int var1;
      for(var1 = 0; var1 < this.field_2771.length; ++var1) {
         this.field_2771[var1] = 40.0F;
      }

      for(var1 = 0; var1 < this.field_2772.length; ++var1) {
         this.field_2772[var1] = 40.0F;
      }

   }

   // $FF: renamed from: a () int
   public int method_2283() {
      return this.field_2783;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2284() {
      return this.field_2782;
   }

   // $FF: renamed from: c () void
   public void method_2285() {
      this.field_2782 = this.field_2780;
      this.field_2783 = this.field_2770;
   }

   // $FF: renamed from: a (float, float) void
   public void method_2286(float var1, float var2) {
      this.field_2771[0] = var1;
      this.field_2772[0] = var2;
      this.field_2775 = this.field_2771[0];
      this.field_2776 = this.field_2772[0];
      this.field_2778 = this.field_2779 = 0.0F;
   }

   // $FF: renamed from: a (float, float, boolean, int) void
   public void method_2287(float var1, float var2, boolean var3, int var4) {
      this.field_2787 = 0;
      this.field_2770 = var3 ? 1 : 0;
      if (var4 != -1) {
         class_350.method_2280()[0] = var4;
      }

      this.field_2771[0] = var1;
      this.field_2772[0] = var2;
      this.field_2773[0] = 0.0F;
      this.field_2774[0] = 0;
      this.field_2780 = var3;
      this.field_2781 = false;
      if (this.field_2780) {
         this.field_2782 = this.field_2780;
      }

      if (this.field_2770 > 0) {
         this.field_2783 = this.field_2770;
      }

      this.field_2775 = this.field_2771[0];
      this.field_2776 = this.field_2772[0];
      this.field_2777 = this.field_2773[0];
      this.field_2778 = this.field_2779 = 0.0F;
      this.field_2784 = this.field_2785 = this.field_2786 = false;
   }

   // $FF: renamed from: d () float[]
   public float[] method_2288() {
      return this.field_2771;
   }

   // $FF: renamed from: e () int[]
   public int[] method_2289() {
      return class_350.method_2280();
   }

   // $FF: renamed from: f () float[]
   public float[] method_2290() {
      return this.field_2772;
   }
}
