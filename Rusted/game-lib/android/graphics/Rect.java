package android.graphics;

public final class Rect {
   // $FF: renamed from: a int
   public int field_2352;
   // $FF: renamed from: b int
   public int field_2353;
   // $FF: renamed from: c int
   public int field_2354;
   // $FF: renamed from: d int
   public int field_2355;

   public Rect() {
   }

   public Rect(int var1, int var2, int var3, int var4) {
      this.field_2352 = var1;
      this.field_2353 = var2;
      this.field_2354 = var3;
      this.field_2355 = var4;
   }

   public Rect(Rect var1) {
      this.field_2352 = var1.field_2352;
      this.field_2353 = var1.field_2353;
      this.field_2354 = var1.field_2354;
      this.field_2355 = var1.field_2355;
   }

   public boolean equals(Object var1) {
      Rect var2 = (Rect)var1;
      if (var2 == null) {
         return false;
      } else {
         return this.field_2352 == var2.field_2352 && this.field_2353 == var2.field_2353 && this.field_2354 == var2.field_2354 && this.field_2355 == var2.field_2355;
      }
   }

   public String toString() {
      return "Rect(" + this.field_2352 + ", " + this.field_2353 + ", " + this.field_2354 + ", " + this.field_2355 + ")";
   }

   // $FF: renamed from: a () boolean
   public final boolean method_1903() {
      return this.field_2352 >= this.field_2354 || this.field_2353 >= this.field_2355;
   }

   // $FF: renamed from: b () int
   public final int method_1904() {
      return this.field_2354 - this.field_2352;
   }

   // $FF: renamed from: c () int
   public final int method_1905() {
      return this.field_2355 - this.field_2353;
   }

   // $FF: renamed from: d () int
   public final int method_1906() {
      return this.field_2352 + this.field_2354 >> 1;
   }

   // $FF: renamed from: e () int
   public final int method_1907() {
      return this.field_2353 + this.field_2355 >> 1;
   }

   // $FF: renamed from: f () float
   public final float method_1908() {
      return (float)(this.field_2352 + this.field_2354) * 0.5F;
   }

   // $FF: renamed from: g () float
   public final float method_1909() {
      return (float)(this.field_2353 + this.field_2355) * 0.5F;
   }

   // $FF: renamed from: h () void
   public void method_1910() {
      this.field_2352 = this.field_2354 = this.field_2353 = this.field_2355 = 0;
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_1911(int var1, int var2, int var3, int var4) {
      this.field_2352 = var1;
      this.field_2353 = var2;
      this.field_2354 = var3;
      this.field_2355 = var4;
   }

   // $FF: renamed from: a (android.graphics.Rect) void
   public void method_1912(Rect var1) {
      this.field_2352 = var1.field_2352;
      this.field_2353 = var1.field_2353;
      this.field_2354 = var1.field_2354;
      this.field_2355 = var1.field_2355;
   }

   // $FF: renamed from: a (int, int) void
   public void method_1913(int var1, int var2) {
      this.field_2352 += var1;
      this.field_2353 += var2;
      this.field_2354 += var1;
      this.field_2355 += var2;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_1914(int var1, int var2) {
      return this.field_2352 < this.field_2354 && this.field_2353 < this.field_2355 && var1 >= this.field_2352 && var1 < this.field_2354 && var2 >= this.field_2353 && var2 < this.field_2355;
   }
}
