package com.corrodinggames.rts.java.audio.a;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.d
public class class_144 {
   // $FF: renamed from: a int[]
   public int[] field_1381;
   // $FF: renamed from: b int
   public int field_1382;
   // $FF: renamed from: c boolean
   public boolean field_1383;

   public class_144() {
      this(true, 16);
   }

   public class_144(boolean var1, int var2) {
      this.field_1383 = var1;
      this.field_1381 = new int[var2];
   }

   public class_144(class_144 var1) {
      this.field_1383 = var1.field_1383;
      this.field_1382 = var1.field_1382;
      this.field_1381 = new int[this.field_1382];
      System.arraycopy(var1.field_1381, 0, this.field_1381, 0, this.field_1382);
   }

   // $FF: renamed from: a (int) void
   public void method_1129(int var1) {
      int[] var2 = this.field_1381;
      if (this.field_1382 == var2.length) {
         var2 = this.method_1132(Math.max(8, (int)((float)this.field_1382 * 1.75F)));
      }

      var2[this.field_1382++] = var1;
   }

   // $FF: renamed from: b (int) int
   public int method_1130(int var1) {
      if (var1 >= this.field_1382) {
         throw new IndexOutOfBoundsException("index can't be >= size: " + var1 + " >= " + this.field_1382);
      } else {
         return this.field_1381[var1];
      }
   }

   // $FF: renamed from: c (int) int
   public int method_1131(int var1) {
      if (var1 >= this.field_1382) {
         throw new IndexOutOfBoundsException("index can't be >= size: " + var1 + " >= " + this.field_1382);
      } else {
         int[] var2 = this.field_1381;
         int var3 = var2[var1];
         --this.field_1382;
         if (this.field_1383) {
            System.arraycopy(var2, var1 + 1, var2, var1, this.field_1382 - var1);
         } else {
            var2[var1] = var2[this.field_1382];
         }

         return var3;
      }
   }

   // $FF: renamed from: d (int) int[]
   protected int[] method_1132(int var1) {
      int[] var2 = new int[var1];
      int[] var3 = this.field_1381;
      System.arraycopy(var3, 0, var2, 0, Math.min(this.field_1382, var2.length));
      this.field_1381 = var2;
      return var2;
   }

   public int hashCode() {
      if (!this.field_1383) {
         return super.hashCode();
      } else {
         int[] var1 = this.field_1381;
         int var2 = 1;
         int var3 = 0;

         for(int var4 = this.field_1382; var3 < var4; ++var3) {
            var2 = var2 * 31 + var1[var3];
         }

         return var2;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!this.field_1383) {
         return false;
      } else if (!(var1 instanceof class_144)) {
         return false;
      } else {
         class_144 var2 = (class_144)var1;
         if (!var2.field_1383) {
            return false;
         } else {
            int var3 = this.field_1382;
            if (var3 != var2.field_1382) {
               return false;
            } else {
               int[] var4 = this.field_1381;
               int[] var5 = var2.field_1381;

               for(int var6 = 0; var6 < var3; ++var6) {
                  if (this.field_1381[var6] != var2.field_1381[var6]) {
                     return false;
                  }
               }

               return true;
            }
         }
      }
   }

   public String toString() {
      if (this.field_1382 == 0) {
         return "[]";
      } else {
         int[] var1 = this.field_1381;
         StringBuilder var2 = new StringBuilder(32);
         var2.append('[');
         var2.append(var1[0]);

         for(int var3 = 1; var3 < this.field_1382; ++var3) {
            var2.append(", ");
            var2.append(var1[var3]);
         }

         var2.append(']');
         return var2.toString();
      }
   }
}
