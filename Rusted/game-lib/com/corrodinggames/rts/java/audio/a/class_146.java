package com.corrodinggames.rts.java.audio.a;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.b
public class class_146 {
   // $FF: renamed from: a float[]
   public float[] field_1384;
   // $FF: renamed from: b int
   public int field_1385;
   // $FF: renamed from: c boolean
   public boolean field_1386;

   public class_146() {
      this(true, 16);
   }

   public class_146(int var1) {
      this(true, var1);
   }

   public class_146(boolean var1, int var2) {
      this.field_1386 = var1;
      this.field_1384 = new float[var2];
   }

   // $FF: renamed from: a (float) void
   public void method_1133(float var1) {
      float[] var2 = this.field_1384;
      if (this.field_1385 == var2.length) {
         var2 = this.method_1139(Math.max(8, (int)((float)this.field_1385 * 1.75F)));
      }

      var2[this.field_1385++] = var1;
   }

   // $FF: renamed from: a (int, float) void
   public void method_1134(int var1, float var2) {
      if (var1 >= this.field_1385) {
         throw new IndexOutOfBoundsException("index can't be >= size: " + var1 + " >= " + this.field_1385);
      } else {
         this.field_1384[var1] = var2;
      }
   }

   // $FF: renamed from: b (int, float) void
   public void method_1135(int var1, float var2) {
      if (var1 > this.field_1385) {
         throw new IndexOutOfBoundsException("index can't be > size: " + var1 + " > " + this.field_1385);
      } else {
         float[] var3 = this.field_1384;
         if (this.field_1385 == var3.length) {
            var3 = this.method_1139(Math.max(8, (int)((float)this.field_1385 * 1.75F)));
         }

         if (this.field_1386) {
            System.arraycopy(var3, var1, var3, var1 + 1, this.field_1385 - var1);
         } else {
            var3[this.field_1385] = var3[var1];
         }

         ++this.field_1385;
         var3[var1] = var2;
      }
   }

   // $FF: renamed from: a () float
   public float method_1136() {
      return this.field_1384[--this.field_1385];
   }

   // $FF: renamed from: b () float
   public float method_1137() {
      if (this.field_1385 == 0) {
         throw new IllegalStateException("Array is empty.");
      } else {
         return this.field_1384[0];
      }
   }

   // $FF: renamed from: c () void
   public void method_1138() {
      this.field_1385 = 0;
   }

   // $FF: renamed from: a (int) float[]
   protected float[] method_1139(int var1) {
      float[] var2 = new float[var1];
      float[] var3 = this.field_1384;
      System.arraycopy(var3, 0, var2, 0, Math.min(this.field_1385, var2.length));
      this.field_1384 = var2;
      return var2;
   }

   public int hashCode() {
      if (!this.field_1386) {
         return super.hashCode();
      } else {
         float[] var1 = this.field_1384;
         int var2 = 1;
         int var3 = 0;

         for(int var4 = this.field_1385; var3 < var4; ++var3) {
            var2 = var2 * 31 + Float.floatToIntBits(var1[var3]);
         }

         return var2;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!this.field_1386) {
         return false;
      } else if (!(var1 instanceof class_146)) {
         return false;
      } else {
         class_146 var2 = (class_146)var1;
         if (!var2.field_1386) {
            return false;
         } else {
            int var3 = this.field_1385;
            if (var3 != var2.field_1385) {
               return false;
            } else {
               float[] var4 = this.field_1384;
               float[] var5 = var2.field_1384;

               for(int var6 = 0; var6 < var3; ++var6) {
                  if (var4[var6] != var5[var6]) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public String toString() {
      if (this.field_1385 == 0) {
         return "[]";
      } else {
         float[] var1 = this.field_1384;
         StringBuilder var2 = new StringBuilder(32);
         var2.append('[');
         var2.append(var1[0]);

         for(int var3 = 1; var3 < this.field_1385; ++var3) {
            var2.append(", ");
            var2.append(var1[var3]);
         }

         var2.append(']');
         return var2.toString();
      }
   }
}
