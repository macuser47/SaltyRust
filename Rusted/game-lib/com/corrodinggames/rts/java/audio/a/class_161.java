package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.e
public class class_161 implements Iterable {
   // $FF: renamed from: a int
   public int field_1451;
   // $FF: renamed from: b int[]
   int[] field_1452;
   // $FF: renamed from: c java.lang.Object[]
   Object[] field_1453;
   // $FF: renamed from: d int
   int field_1454;
   // $FF: renamed from: e int
   int field_1455;
   // $FF: renamed from: f java.lang.Object
   Object field_1456;
   // $FF: renamed from: g boolean
   boolean field_1457;
   // $FF: renamed from: h float
   private float field_1458;
   // $FF: renamed from: i int
   private int field_1459;
   // $FF: renamed from: j int
   private int field_1460;
   // $FF: renamed from: k int
   private int field_1461;
   // $FF: renamed from: l int
   private int field_1462;
   // $FF: renamed from: m int
   private int field_1463;
   // $FF: renamed from: n com.corrodinggames.rts.java.audio.a.f
   private class_157 field_1464;
   // $FF: renamed from: o com.corrodinggames.rts.java.audio.a.f
   private class_157 field_1465;

   public class_161() {
      this(51, 0.8F);
   }

   public class_161(int var1, float var2) {
      if (var1 < 0) {
         throw new IllegalArgumentException("initialCapacity must be >= 0: " + var1);
      } else {
         var1 = class_177.method_1248((int)Math.ceil((double)((float)var1 / var2)));
         if (var1 > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + var1);
         } else {
            this.field_1454 = var1;
            if (var2 <= 0.0F) {
               throw new IllegalArgumentException("loadFactor must be > 0: " + var2);
            } else {
               this.field_1458 = var2;
               this.field_1461 = (int)((float)this.field_1454 * var2);
               this.field_1460 = this.field_1454 - 1;
               this.field_1459 = 31 - Integer.numberOfTrailingZeros(this.field_1454);
               this.field_1462 = Math.max(3, (int)Math.ceil(Math.log((double)this.field_1454)) * 2);
               this.field_1463 = Math.max(Math.min(this.field_1454, 8), (int)Math.sqrt((double)this.field_1454) / 8);
               this.field_1452 = new int[this.field_1454 + this.field_1462];
               this.field_1453 = (Object[])(new Object[this.field_1452.length]);
            }
         }
      }
   }

   // $FF: renamed from: a (int, java.lang.Object) java.lang.Object
   public Object method_1177(int var1, Object var2) {
      if (var1 == 0) {
         Object var13 = this.field_1456;
         this.field_1456 = var2;
         if (!this.field_1457) {
            this.field_1457 = true;
            ++this.field_1451;
         }

         return var13;
      } else {
         int[] var3 = this.field_1452;
         int var4 = var1 & this.field_1460;
         int var5 = var3[var4];
         if (var5 == var1) {
            Object var14 = this.field_1453[var4];
            this.field_1453[var4] = var2;
            return var14;
         } else {
            int var6 = this.method_1190(var1);
            int var7 = var3[var6];
            if (var7 == var1) {
               Object var15 = this.field_1453[var6];
               this.field_1453[var6] = var2;
               return var15;
            } else {
               int var8 = this.method_1191(var1);
               int var9 = var3[var8];
               if (var9 == var1) {
                  Object var16 = this.field_1453[var8];
                  this.field_1453[var8] = var2;
                  return var16;
               } else {
                  int var10 = this.field_1454;

                  for(int var11 = var10 + this.field_1455; var10 < var11; ++var10) {
                     if (var3[var10] == var1) {
                        Object var12 = this.field_1453[var10];
                        this.field_1453[var10] = var2;
                        return var12;
                     }
                  }

                  if (var5 == 0) {
                     var3[var4] = var1;
                     this.field_1453[var4] = var2;
                     if (this.field_1451++ >= this.field_1461) {
                        this.method_1189(this.field_1454 << 1);
                     }

                     return null;
                  } else if (var7 == 0) {
                     var3[var6] = var1;
                     this.field_1453[var6] = var2;
                     if (this.field_1451++ >= this.field_1461) {
                        this.method_1189(this.field_1454 << 1);
                     }

                     return null;
                  } else if (var9 == 0) {
                     var3[var8] = var1;
                     this.field_1453[var8] = var2;
                     if (this.field_1451++ >= this.field_1461) {
                        this.method_1189(this.field_1454 << 1);
                     }

                     return null;
                  } else {
                     this.method_1179(var1, var2, var4, var5, var6, var7, var8, var9);
                     return null;
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: b (int, java.lang.Object) void
   private void method_1178(int var1, Object var2) {
      if (var1 == 0) {
         this.field_1456 = var2;
         this.field_1457 = true;
      } else {
         int var3 = var1 & this.field_1460;
         int var4 = this.field_1452[var3];
         if (var4 == 0) {
            this.field_1452[var3] = var1;
            this.field_1453[var3] = var2;
            if (this.field_1451++ >= this.field_1461) {
               this.method_1189(this.field_1454 << 1);
            }

         } else {
            int var5 = this.method_1190(var1);
            int var6 = this.field_1452[var5];
            if (var6 == 0) {
               this.field_1452[var5] = var1;
               this.field_1453[var5] = var2;
               if (this.field_1451++ >= this.field_1461) {
                  this.method_1189(this.field_1454 << 1);
               }

            } else {
               int var7 = this.method_1191(var1);
               int var8 = this.field_1452[var7];
               if (var8 == 0) {
                  this.field_1452[var7] = var1;
                  this.field_1453[var7] = var2;
                  if (this.field_1451++ >= this.field_1461) {
                     this.method_1189(this.field_1454 << 1);
                  }

               } else {
                  this.method_1179(var1, var2, var3, var4, var5, var6, var7, var8);
               }
            }
         }
      }
   }

   // $FF: renamed from: a (int, java.lang.Object, int, int, int, int, int, int) void
   private void method_1179(int var1, Object var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = this.field_1452;
      Object[] var10 = this.field_1453;
      int var11 = this.field_1460;
      int var14 = 0;
      int var15 = this.field_1463;

      while(true) {
         int var12;
         Object var13;
         switch(class_177.method_1247(2)) {
         case 0:
            var12 = var4;
            var13 = var10[var3];
            var9[var3] = var1;
            var10[var3] = var2;
            break;
         case 1:
            var12 = var6;
            var13 = var10[var5];
            var9[var5] = var1;
            var10[var5] = var2;
            break;
         default:
            var12 = var8;
            var13 = var10[var7];
            var9[var7] = var1;
            var10[var7] = var2;
         }

         var3 = var12 & var11;
         var4 = var9[var3];
         if (var4 == 0) {
            var9[var3] = var12;
            var10[var3] = var13;
            if (this.field_1451++ >= this.field_1461) {
               this.method_1189(this.field_1454 << 1);
            }

            return;
         }

         var5 = this.method_1190(var12);
         var6 = var9[var5];
         if (var6 == 0) {
            var9[var5] = var12;
            var10[var5] = var13;
            if (this.field_1451++ >= this.field_1461) {
               this.method_1189(this.field_1454 << 1);
            }

            return;
         }

         var7 = this.method_1191(var12);
         var8 = var9[var7];
         if (var8 == 0) {
            var9[var7] = var12;
            var10[var7] = var13;
            if (this.field_1451++ >= this.field_1461) {
               this.method_1189(this.field_1454 << 1);
            }

            return;
         }

         ++var14;
         if (var14 == var15) {
            this.method_1180(var12, var13);
            return;
         }

         var1 = var12;
         var2 = var13;
      }
   }

   // $FF: renamed from: c (int, java.lang.Object) void
   private void method_1180(int var1, Object var2) {
      if (this.field_1455 == this.field_1462) {
         this.method_1189(this.field_1454 << 1);
         this.method_1177(var1, var2);
      } else {
         int var3 = this.field_1454 + this.field_1455;
         this.field_1452[var3] = var1;
         this.field_1453[var3] = var2;
         ++this.field_1455;
         ++this.field_1451;
      }
   }

   // $FF: renamed from: a (int) java.lang.Object
   public Object method_1181(int var1) {
      if (var1 == 0) {
         return !this.field_1457 ? null : this.field_1456;
      } else {
         int var2 = var1 & this.field_1460;
         if (this.field_1452[var2] != var1) {
            var2 = this.method_1190(var1);
            if (this.field_1452[var2] != var1) {
               var2 = this.method_1191(var1);
               if (this.field_1452[var2] != var1) {
                  return this.method_1182(var1, (Object)null);
               }
            }
         }

         return this.field_1453[var2];
      }
   }

   // $FF: renamed from: d (int, java.lang.Object) java.lang.Object
   private Object method_1182(int var1, Object var2) {
      int[] var3 = this.field_1452;
      int var4 = this.field_1454;

      for(int var5 = var4 + this.field_1455; var4 < var5; ++var4) {
         if (var3[var4] == var1) {
            return this.field_1453[var4];
         }
      }

      return var2;
   }

   // $FF: renamed from: b (int) java.lang.Object
   public Object method_1183(int var1) {
      if (var1 == 0) {
         if (!this.field_1457) {
            return null;
         } else {
            Object var4 = this.field_1456;
            this.field_1456 = null;
            this.field_1457 = false;
            --this.field_1451;
            return var4;
         }
      } else {
         int var2 = var1 & this.field_1460;
         Object var3;
         if (this.field_1452[var2] == var1) {
            this.field_1452[var2] = 0;
            var3 = this.field_1453[var2];
            this.field_1453[var2] = null;
            --this.field_1451;
            return var3;
         } else {
            var2 = this.method_1190(var1);
            if (this.field_1452[var2] == var1) {
               this.field_1452[var2] = 0;
               var3 = this.field_1453[var2];
               this.field_1453[var2] = null;
               --this.field_1451;
               return var3;
            } else {
               var2 = this.method_1191(var1);
               if (this.field_1452[var2] == var1) {
                  this.field_1452[var2] = 0;
                  var3 = this.field_1453[var2];
                  this.field_1453[var2] = null;
                  --this.field_1451;
                  return var3;
               } else {
                  return this.method_1184(var1);
               }
            }
         }
      }
   }

   // $FF: renamed from: c (int) java.lang.Object
   Object method_1184(int var1) {
      int[] var2 = this.field_1452;
      int var3 = this.field_1454;

      for(int var4 = var3 + this.field_1455; var3 < var4; ++var3) {
         if (var2[var3] == var1) {
            Object var5 = this.field_1453[var3];
            this.method_1185(var3);
            --this.field_1451;
            return var5;
         }
      }

      return null;
   }

   // $FF: renamed from: d (int) void
   void method_1185(int var1) {
      --this.field_1455;
      int var2 = this.field_1454 + this.field_1455;
      if (var1 < var2) {
         this.field_1452[var1] = this.field_1452[var2];
         this.field_1453[var1] = this.field_1453[var2];
         this.field_1453[var2] = null;
      } else {
         this.field_1453[var1] = null;
      }

   }

   // $FF: renamed from: a () void
   public void method_1186() {
      if (this.field_1451 != 0) {
         int[] var1 = this.field_1452;
         Object[] var2 = this.field_1453;

         for(int var3 = this.field_1454 + this.field_1455; var3-- > 0; var2[var3] = null) {
            var1[var3] = 0;
         }

         this.field_1451 = 0;
         this.field_1455 = 0;
         this.field_1456 = null;
         this.field_1457 = false;
      }
   }

   // $FF: renamed from: e (int) boolean
   public boolean method_1187(int var1) {
      if (var1 == 0) {
         return this.field_1457;
      } else {
         int var2 = var1 & this.field_1460;
         if (this.field_1452[var2] != var1) {
            var2 = this.method_1190(var1);
            if (this.field_1452[var2] != var1) {
               var2 = this.method_1191(var1);
               if (this.field_1452[var2] != var1) {
                  return this.method_1188(var1);
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: f (int) boolean
   private boolean method_1188(int var1) {
      int[] var2 = this.field_1452;
      int var3 = this.field_1454;

      for(int var4 = var3 + this.field_1455; var3 < var4; ++var3) {
         if (var2[var3] == var1) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: g (int) void
   private void method_1189(int var1) {
      int var2 = this.field_1454 + this.field_1455;
      this.field_1454 = var1;
      this.field_1461 = (int)((float)var1 * this.field_1458);
      this.field_1460 = var1 - 1;
      this.field_1459 = 31 - Integer.numberOfTrailingZeros(var1);
      this.field_1462 = Math.max(3, (int)Math.ceil(Math.log((double)var1)) * 2);
      this.field_1463 = Math.max(Math.min(var1, 8), (int)Math.sqrt((double)var1) / 8);
      int[] var3 = this.field_1452;
      Object[] var4 = this.field_1453;
      this.field_1452 = new int[var1 + this.field_1462];
      this.field_1453 = (Object[])(new Object[var1 + this.field_1462]);
      int var5 = this.field_1451;
      this.field_1451 = this.field_1457 ? 1 : 0;
      this.field_1455 = 0;
      if (var5 > 0) {
         for(int var6 = 0; var6 < var2; ++var6) {
            int var7 = var3[var6];
            if (var7 != 0) {
               this.method_1178(var7, var4[var6]);
            }
         }
      }

   }

   // $FF: renamed from: h (int) int
   private int method_1190(int var1) {
      var1 *= -1262997959;
      return (var1 ^ var1 >>> this.field_1459) & this.field_1460;
   }

   // $FF: renamed from: i (int) int
   private int method_1191(int var1) {
      var1 *= -825114047;
      return (var1 ^ var1 >>> this.field_1459) & this.field_1460;
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field_1457 && this.field_1456 != null) {
         var1 += this.field_1456.hashCode();
      }

      int[] var2 = this.field_1452;
      Object[] var3 = this.field_1453;
      int var4 = 0;

      for(int var5 = this.field_1454 + this.field_1455; var4 < var5; ++var4) {
         int var6 = var2[var4];
         if (var6 != 0) {
            var1 += var6 * 31;
            Object var7 = var3[var4];
            if (var7 != null) {
               var1 += var7.hashCode();
            }
         }
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class_161)) {
         return false;
      } else {
         class_161 var2 = (class_161)var1;
         if (var2.field_1451 != this.field_1451) {
            return false;
         } else if (var2.field_1457 != this.field_1457) {
            return false;
         } else {
            if (this.field_1457) {
               if (var2.field_1456 == null) {
                  if (this.field_1456 != null) {
                     return false;
                  }
               } else if (!var2.field_1456.equals(this.field_1456)) {
                  return false;
               }
            }

            int[] var3 = this.field_1452;
            Object[] var4 = this.field_1453;
            int var5 = 0;

            for(int var6 = this.field_1454 + this.field_1455; var5 < var6; ++var5) {
               int var7 = var3[var5];
               if (var7 != 0) {
                  Object var8 = var4[var5];
                  if (var8 == null) {
                     if (!var2.method_1187(var7) || var2.method_1181(var7) != null) {
                        return false;
                     }
                  } else if (!var8.equals(var2.method_1181(var7))) {
                     return false;
                  }
               }
            }

            return true;
         }
      }
   }

   public String toString() {
      if (this.field_1451 == 0) {
         return "[]";
      } else {
         StringBuilder var1 = new StringBuilder(32);
         var1.append('[');
         int[] var2 = this.field_1452;
         Object[] var3 = this.field_1453;
         int var4 = var2.length;
         int var5;
         if (this.field_1457) {
            var1.append("0=");
            var1.append(this.field_1456);
         } else {
            while(var4-- > 0) {
               var5 = var2[var4];
               if (var5 != 0) {
                  var1.append(var5);
                  var1.append('=');
                  var1.append(var3[var4]);
                  break;
               }
            }
         }

         while(var4-- > 0) {
            var5 = var2[var4];
            if (var5 != 0) {
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
      return this.method_1192();
   }

   // $FF: renamed from: b () com.corrodinggames.rts.java.audio.a.f
   public class_157 method_1192() {
      if (this.field_1464 == null) {
         this.field_1464 = new class_157(this);
         this.field_1465 = new class_157(this);
      }

      if (!this.field_1464.e) {
         this.field_1464.method_1170();
         this.field_1464.e = true;
         this.field_1465.e = false;
         return this.field_1464;
      } else {
         this.field_1465.method_1170();
         this.field_1465.e = true;
         this.field_1464.e = false;
         return this.field_1465;
      }
   }
}
