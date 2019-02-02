package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.i
public class class_154 implements Iterable {
   // $FF: renamed from: a int
   public int field_1418;
   // $FF: renamed from: b long[]
   long[] field_1419;
   // $FF: renamed from: c java.lang.Object[]
   Object[] field_1420;
   // $FF: renamed from: d int
   int field_1421;
   // $FF: renamed from: e int
   int field_1422;
   // $FF: renamed from: f java.lang.Object
   Object field_1423;
   // $FF: renamed from: g boolean
   boolean field_1424;
   // $FF: renamed from: h float
   private float field_1425;
   // $FF: renamed from: i int
   private int field_1426;
   // $FF: renamed from: j int
   private int field_1427;
   // $FF: renamed from: k int
   private int field_1428;
   // $FF: renamed from: l int
   private int field_1429;
   // $FF: renamed from: m int
   private int field_1430;
   // $FF: renamed from: n com.corrodinggames.rts.java.audio.a.j
   private class_152 field_1431;
   // $FF: renamed from: o com.corrodinggames.rts.java.audio.a.j
   private class_152 field_1432;

   public class_154() {
      this(51, 0.8F);
   }

   public class_154(int var1, float var2) {
      if (var1 < 0) {
         throw new IllegalArgumentException("initialCapacity must be >= 0: " + var1);
      } else {
         var1 = class_177.method_1248((int)Math.ceil((double)((float)var1 / var2)));
         if (var1 > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + var1);
         } else {
            this.field_1421 = var1;
            if (var2 <= 0.0F) {
               throw new IllegalArgumentException("loadFactor must be > 0: " + var2);
            } else {
               this.field_1425 = var2;
               this.field_1428 = (int)((float)this.field_1421 * var2);
               this.field_1427 = this.field_1421 - 1;
               this.field_1426 = 63 - Long.numberOfTrailingZeros((long)this.field_1421);
               this.field_1429 = Math.max(3, (int)Math.ceil(Math.log((double)this.field_1421)) * 2);
               this.field_1430 = Math.max(Math.min(this.field_1421, 8), (int)Math.sqrt((double)this.field_1421) / 8);
               this.field_1419 = new long[this.field_1421 + this.field_1429];
               this.field_1420 = (Object[])(new Object[this.field_1419.length]);
            }
         }
      }
   }

   // $FF: renamed from: a (long, java.lang.Object) java.lang.Object
   public Object method_1153(long var1, Object var3) {
      if (var1 == 0L) {
         Object var17 = this.field_1423;
         this.field_1423 = var3;
         if (!this.field_1424) {
            this.field_1424 = true;
            ++this.field_1418;
         }

         return var17;
      } else {
         long[] var4 = this.field_1419;
         int var5 = (int)(var1 & (long)this.field_1427);
         long var6 = var4[var5];
         if (var6 == var1) {
            Object var18 = this.field_1420[var5];
            this.field_1420[var5] = var3;
            return var18;
         } else {
            int var8 = this.method_1166(var1);
            long var9 = var4[var8];
            if (var9 == var1) {
               Object var19 = this.field_1420[var8];
               this.field_1420[var8] = var3;
               return var19;
            } else {
               int var11 = this.method_1167(var1);
               long var12 = var4[var11];
               if (var12 == var1) {
                  Object var20 = this.field_1420[var11];
                  this.field_1420[var11] = var3;
                  return var20;
               } else {
                  int var14 = this.field_1421;

                  for(int var15 = var14 + this.field_1422; var14 < var15; ++var14) {
                     if (var4[var14] == var1) {
                        Object var16 = this.field_1420[var14];
                        this.field_1420[var14] = var3;
                        return var16;
                     }
                  }

                  if (var6 == 0L) {
                     var4[var5] = var1;
                     this.field_1420[var5] = var3;
                     if (this.field_1418++ >= this.field_1428) {
                        this.method_1165(this.field_1421 << 1);
                     }

                     return null;
                  } else if (var9 == 0L) {
                     var4[var8] = var1;
                     this.field_1420[var8] = var3;
                     if (this.field_1418++ >= this.field_1428) {
                        this.method_1165(this.field_1421 << 1);
                     }

                     return null;
                  } else if (var12 == 0L) {
                     var4[var11] = var1;
                     this.field_1420[var11] = var3;
                     if (this.field_1418++ >= this.field_1428) {
                        this.method_1165(this.field_1421 << 1);
                     }

                     return null;
                  } else {
                     this.method_1155(var1, var3, var5, var6, var8, var9, var11, var12);
                     return null;
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: b (long, java.lang.Object) void
   private void method_1154(long var1, Object var3) {
      if (var1 == 0L) {
         this.field_1423 = var3;
         this.field_1424 = true;
      } else {
         int var4 = (int)(var1 & (long)this.field_1427);
         long var5 = this.field_1419[var4];
         if (var5 == 0L) {
            this.field_1419[var4] = var1;
            this.field_1420[var4] = var3;
            if (this.field_1418++ >= this.field_1428) {
               this.method_1165(this.field_1421 << 1);
            }

         } else {
            int var7 = this.method_1166(var1);
            long var8 = this.field_1419[var7];
            if (var8 == 0L) {
               this.field_1419[var7] = var1;
               this.field_1420[var7] = var3;
               if (this.field_1418++ >= this.field_1428) {
                  this.method_1165(this.field_1421 << 1);
               }

            } else {
               int var10 = this.method_1167(var1);
               long var11 = this.field_1419[var10];
               if (var11 == 0L) {
                  this.field_1419[var10] = var1;
                  this.field_1420[var10] = var3;
                  if (this.field_1418++ >= this.field_1428) {
                     this.method_1165(this.field_1421 << 1);
                  }

               } else {
                  this.method_1155(var1, var3, var4, var5, var7, var8, var10, var11);
               }
            }
         }
      }
   }

   // $FF: renamed from: a (long, java.lang.Object, int, long, int, long, int, long) void
   private void method_1155(long var1, Object var3, int var4, long var5, int var7, long var8, int var10, long var11) {
      long[] var13 = this.field_1419;
      Object[] var14 = this.field_1420;
      int var15 = this.field_1427;
      int var19 = 0;
      int var20 = this.field_1430;

      while(true) {
         long var16;
         Object var18;
         switch(class_177.method_1247(2)) {
         case 0:
            var16 = var5;
            var18 = var14[var4];
            var13[var4] = var1;
            var14[var4] = var3;
            break;
         case 1:
            var16 = var8;
            var18 = var14[var7];
            var13[var7] = var1;
            var14[var7] = var3;
            break;
         default:
            var16 = var11;
            var18 = var14[var10];
            var13[var10] = var1;
            var14[var10] = var3;
         }

         var4 = (int)(var16 & (long)var15);
         var5 = var13[var4];
         if (var5 == 0L) {
            var13[var4] = var16;
            var14[var4] = var18;
            if (this.field_1418++ >= this.field_1428) {
               this.method_1165(this.field_1421 << 1);
            }

            return;
         }

         var7 = this.method_1166(var16);
         var8 = var13[var7];
         if (var8 == 0L) {
            var13[var7] = var16;
            var14[var7] = var18;
            if (this.field_1418++ >= this.field_1428) {
               this.method_1165(this.field_1421 << 1);
            }

            return;
         }

         var10 = this.method_1167(var16);
         var11 = var13[var10];
         if (var11 == 0L) {
            var13[var10] = var16;
            var14[var10] = var18;
            if (this.field_1418++ >= this.field_1428) {
               this.method_1165(this.field_1421 << 1);
            }

            return;
         }

         ++var19;
         if (var19 == var20) {
            this.method_1156(var16, var18);
            return;
         }

         var1 = var16;
         var3 = var18;
      }
   }

   // $FF: renamed from: c (long, java.lang.Object) void
   private void method_1156(long var1, Object var3) {
      if (this.field_1422 == this.field_1429) {
         this.method_1165(this.field_1421 << 1);
         this.method_1153(var1, var3);
      } else {
         int var4 = this.field_1421 + this.field_1422;
         this.field_1419[var4] = var1;
         this.field_1420[var4] = var3;
         ++this.field_1422;
         ++this.field_1418;
      }
   }

   // $FF: renamed from: a (long) java.lang.Object
   public Object method_1157(long var1) {
      if (var1 == 0L) {
         return !this.field_1424 ? null : this.field_1423;
      } else {
         int var3 = (int)(var1 & (long)this.field_1427);
         if (this.field_1419[var3] != var1) {
            var3 = this.method_1166(var1);
            if (this.field_1419[var3] != var1) {
               var3 = this.method_1167(var1);
               if (this.field_1419[var3] != var1) {
                  return this.method_1158(var1, (Object)null);
               }
            }
         }

         return this.field_1420[var3];
      }
   }

   // $FF: renamed from: d (long, java.lang.Object) java.lang.Object
   private Object method_1158(long var1, Object var3) {
      long[] var4 = this.field_1419;
      int var5 = this.field_1421;

      for(int var6 = var5 + this.field_1422; var5 < var6; ++var5) {
         if (var4[var5] == var1) {
            return this.field_1420[var5];
         }
      }

      return var3;
   }

   // $FF: renamed from: b (long) java.lang.Object
   public Object method_1159(long var1) {
      if (var1 == 0L) {
         if (!this.field_1424) {
            return null;
         } else {
            Object var5 = this.field_1423;
            this.field_1423 = null;
            this.field_1424 = false;
            --this.field_1418;
            return var5;
         }
      } else {
         int var3 = (int)(var1 & (long)this.field_1427);
         Object var4;
         if (this.field_1419[var3] == var1) {
            this.field_1419[var3] = 0L;
            var4 = this.field_1420[var3];
            this.field_1420[var3] = null;
            --this.field_1418;
            return var4;
         } else {
            var3 = this.method_1166(var1);
            if (this.field_1419[var3] == var1) {
               this.field_1419[var3] = 0L;
               var4 = this.field_1420[var3];
               this.field_1420[var3] = null;
               --this.field_1418;
               return var4;
            } else {
               var3 = this.method_1167(var1);
               if (this.field_1419[var3] == var1) {
                  this.field_1419[var3] = 0L;
                  var4 = this.field_1420[var3];
                  this.field_1420[var3] = null;
                  --this.field_1418;
                  return var4;
               } else {
                  return this.method_1160(var1);
               }
            }
         }
      }
   }

   // $FF: renamed from: c (long) java.lang.Object
   Object method_1160(long var1) {
      long[] var3 = this.field_1419;
      int var4 = this.field_1421;

      for(int var5 = var4 + this.field_1422; var4 < var5; ++var4) {
         if (var3[var4] == var1) {
            Object var6 = this.field_1420[var4];
            this.method_1161(var4);
            --this.field_1418;
            return var6;
         }
      }

      return null;
   }

   // $FF: renamed from: a (int) void
   void method_1161(int var1) {
      --this.field_1422;
      int var2 = this.field_1421 + this.field_1422;
      if (var1 < var2) {
         this.field_1419[var1] = this.field_1419[var2];
         this.field_1420[var1] = this.field_1420[var2];
         this.field_1420[var2] = null;
      } else {
         this.field_1420[var1] = null;
      }

   }

   // $FF: renamed from: a () void
   public void method_1162() {
      if (this.field_1418 != 0) {
         long[] var1 = this.field_1419;
         Object[] var2 = this.field_1420;

         for(int var3 = this.field_1421 + this.field_1422; var3-- > 0; var2[var3] = null) {
            var1[var3] = 0L;
         }

         this.field_1418 = 0;
         this.field_1422 = 0;
         this.field_1423 = null;
         this.field_1424 = false;
      }
   }

   // $FF: renamed from: d (long) boolean
   public boolean method_1163(long var1) {
      if (var1 == 0L) {
         return this.field_1424;
      } else {
         int var3 = (int)(var1 & (long)this.field_1427);
         if (this.field_1419[var3] != var1) {
            var3 = this.method_1166(var1);
            if (this.field_1419[var3] != var1) {
               var3 = this.method_1167(var1);
               if (this.field_1419[var3] != var1) {
                  return this.method_1164(var1);
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: e (long) boolean
   private boolean method_1164(long var1) {
      long[] var3 = this.field_1419;
      int var4 = this.field_1421;

      for(int var5 = var4 + this.field_1422; var4 < var5; ++var4) {
         if (var3[var4] == var1) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: b (int) void
   private void method_1165(int var1) {
      int var2 = this.field_1421 + this.field_1422;
      this.field_1421 = var1;
      this.field_1428 = (int)((float)var1 * this.field_1425);
      this.field_1427 = var1 - 1;
      this.field_1426 = 63 - Long.numberOfTrailingZeros((long)var1);
      this.field_1429 = Math.max(3, (int)Math.ceil(Math.log((double)var1)) * 2);
      this.field_1430 = Math.max(Math.min(var1, 8), (int)Math.sqrt((double)var1) / 8);
      long[] var3 = this.field_1419;
      Object[] var4 = this.field_1420;
      this.field_1419 = new long[var1 + this.field_1429];
      this.field_1420 = (Object[])(new Object[var1 + this.field_1429]);
      int var5 = this.field_1418;
      this.field_1418 = this.field_1424 ? 1 : 0;
      this.field_1422 = 0;
      if (var5 > 0) {
         for(int var6 = 0; var6 < var2; ++var6) {
            long var7 = var3[var6];
            if (var7 != 0L) {
               this.method_1154(var7, var4[var6]);
            }
         }
      }

   }

   // $FF: renamed from: f (long) int
   private int method_1166(long var1) {
      var1 *= -1262997959L;
      return (int)((var1 ^ var1 >>> this.field_1426) & (long)this.field_1427);
   }

   // $FF: renamed from: g (long) int
   private int method_1167(long var1) {
      var1 *= -825114047L;
      return (int)((var1 ^ var1 >>> this.field_1426) & (long)this.field_1427);
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field_1424 && this.field_1423 != null) {
         var1 += this.field_1423.hashCode();
      }

      long[] var2 = this.field_1419;
      Object[] var3 = this.field_1420;
      int var4 = 0;

      for(int var5 = this.field_1421 + this.field_1422; var4 < var5; ++var4) {
         long var6 = var2[var4];
         if (var6 != 0L) {
            var1 += (int)(var6 ^ var6 >>> 32) * 31;
            Object var8 = var3[var4];
            if (var8 != null) {
               var1 += var8.hashCode();
            }
         }
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class_154)) {
         return false;
      } else {
         class_154 var2 = (class_154)var1;
         if (var2.field_1418 != this.field_1418) {
            return false;
         } else if (var2.field_1424 != this.field_1424) {
            return false;
         } else {
            if (this.field_1424) {
               if (var2.field_1423 == null) {
                  if (this.field_1423 != null) {
                     return false;
                  }
               } else if (!var2.field_1423.equals(this.field_1423)) {
                  return false;
               }
            }

            long[] var3 = this.field_1419;
            Object[] var4 = this.field_1420;
            int var5 = 0;

            for(int var6 = this.field_1421 + this.field_1422; var5 < var6; ++var5) {
               long var7 = var3[var5];
               if (var7 != 0L) {
                  Object var9 = var4[var5];
                  if (var9 == null) {
                     if (!var2.method_1163(var7) || var2.method_1157(var7) != null) {
                        return false;
                     }
                  } else if (!var9.equals(var2.method_1157(var7))) {
                     return false;
                  }
               }
            }

            return true;
         }
      }
   }

   public String toString() {
      if (this.field_1418 == 0) {
         return "[]";
      } else {
         StringBuilder var1 = new StringBuilder(32);
         var1.append('[');
         long[] var2 = this.field_1419;
         Object[] var3 = this.field_1420;
         int var4 = var2.length;

         long var5;
         while(var4-- > 0) {
            var5 = var2[var4];
            if (var5 != 0L) {
               var1.append(var5);
               var1.append('=');
               var1.append(var3[var4]);
               break;
            }
         }

         while(var4-- > 0) {
            var5 = var2[var4];
            if (var5 != 0L) {
               var1.append(", ");
               var1.append(var5);
               var1.append('=');
               var1.append(var3[var4]);
            }
         }

         var1.append(']');
         return var1.toString();
      }
   }

   public Iterator iterator() {
      return this.method_1168();
   }

   // $FF: renamed from: b () com.corrodinggames.rts.java.audio.a.j
   public class_152 method_1168() {
      if (this.field_1431 == null) {
         this.field_1431 = new class_152(this);
         this.field_1432 = new class_152(this);
      }

      if (!this.field_1431.e) {
         this.field_1431.method_1150();
         this.field_1431.e = true;
         this.field_1432.e = false;
         return this.field_1431;
      } else {
         this.field_1432.method_1150();
         this.field_1432.e = true;
         this.field_1431.e = false;
         return this.field_1432;
      }
   }
}
