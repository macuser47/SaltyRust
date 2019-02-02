package com.corrodinggames.rts.java.audio.a;

import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.java.audio.a.o
public class class_173 implements Iterable {
   // $FF: renamed from: a int
   public int field_1500;
   // $FF: renamed from: b java.lang.Object[]
   Object[] field_1501;
   // $FF: renamed from: c java.lang.Object[]
   Object[] field_1502;
   // $FF: renamed from: d int
   int field_1503;
   // $FF: renamed from: e int
   int field_1504;
   // $FF: renamed from: f float
   private float field_1505;
   // $FF: renamed from: g int
   private int field_1506;
   // $FF: renamed from: h int
   private int field_1507;
   // $FF: renamed from: i int
   private int field_1508;
   // $FF: renamed from: j int
   private int field_1509;
   // $FF: renamed from: k int
   private int field_1510;
   // $FF: renamed from: l com.corrodinggames.rts.java.audio.a.p
   private class_168 field_1511;
   // $FF: renamed from: m com.corrodinggames.rts.java.audio.a.p
   private class_168 field_1512;

   public class_173() {
      this(51, 0.8F);
   }

   public class_173(int var1, float var2) {
      if (var1 < 0) {
         throw new IllegalArgumentException("initialCapacity must be >= 0: " + var1);
      } else {
         var1 = class_177.method_1248((int)Math.ceil((double)((float)var1 / var2)));
         if (var1 > 1073741824) {
            throw new IllegalArgumentException("initialCapacity is too large: " + var1);
         } else {
            this.field_1503 = var1;
            if (var2 <= 0.0F) {
               throw new IllegalArgumentException("loadFactor must be > 0: " + var2);
            } else {
               this.field_1505 = var2;
               this.field_1508 = (int)((float)this.field_1503 * var2);
               this.field_1507 = this.field_1503 - 1;
               this.field_1506 = 31 - Integer.numberOfTrailingZeros(this.field_1503);
               this.field_1509 = Math.max(3, (int)Math.ceil(Math.log((double)this.field_1503)) * 2);
               this.field_1510 = Math.max(Math.min(this.field_1503, 8), (int)Math.sqrt((double)this.field_1503) / 8);
               this.field_1501 = (Object[])(new Object[this.field_1503 + this.field_1509]);
               this.field_1502 = (Object[])(new Object[this.field_1501.length]);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.Object, java.lang.Object) java.lang.Object
   public Object method_1208(Object var1, Object var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("key cannot be null.");
      } else {
         return this.method_1209(var1, var2);
      }
   }

   // $FF: renamed from: b (java.lang.Object, java.lang.Object) java.lang.Object
   private Object method_1209(Object var1, Object var2) {
      Object[] var3 = this.field_1501;
      int var4 = var1.hashCode();
      int var5 = var4 & this.field_1507;
      Object var6 = var3[var5];
      if (var1.equals(var6)) {
         Object var14 = this.field_1502[var5];
         this.field_1502[var5] = var2;
         return var14;
      } else {
         int var7 = this.method_1219(var4);
         Object var8 = var3[var7];
         if (var1.equals(var8)) {
            Object var15 = this.field_1502[var7];
            this.field_1502[var7] = var2;
            return var15;
         } else {
            int var9 = this.method_1220(var4);
            Object var10 = var3[var9];
            if (var1.equals(var10)) {
               Object var16 = this.field_1502[var9];
               this.field_1502[var9] = var2;
               return var16;
            } else {
               int var11 = this.field_1503;

               for(int var12 = var11 + this.field_1504; var11 < var12; ++var11) {
                  if (var1.equals(var3[var11])) {
                     Object var13 = this.field_1502[var11];
                     this.field_1502[var11] = var2;
                     return var13;
                  }
               }

               if (var6 == null) {
                  var3[var5] = var1;
                  this.field_1502[var5] = var2;
                  if (this.field_1500++ >= this.field_1508) {
                     this.method_1218(this.field_1503 << 1);
                  }

                  return null;
               } else if (var8 == null) {
                  var3[var7] = var1;
                  this.field_1502[var7] = var2;
                  if (this.field_1500++ >= this.field_1508) {
                     this.method_1218(this.field_1503 << 1);
                  }

                  return null;
               } else if (var10 == null) {
                  var3[var9] = var1;
                  this.field_1502[var9] = var2;
                  if (this.field_1500++ >= this.field_1508) {
                     this.method_1218(this.field_1503 << 1);
                  }

                  return null;
               } else {
                  this.method_1211(var1, var2, var5, var6, var7, var8, var9, var10);
                  return null;
               }
            }
         }
      }
   }

   // $FF: renamed from: c (java.lang.Object, java.lang.Object) void
   private void method_1210(Object var1, Object var2) {
      int var3 = var1.hashCode();
      int var4 = var3 & this.field_1507;
      Object var5 = this.field_1501[var4];
      if (var5 == null) {
         this.field_1501[var4] = var1;
         this.field_1502[var4] = var2;
         if (this.field_1500++ >= this.field_1508) {
            this.method_1218(this.field_1503 << 1);
         }

      } else {
         int var6 = this.method_1219(var3);
         Object var7 = this.field_1501[var6];
         if (var7 == null) {
            this.field_1501[var6] = var1;
            this.field_1502[var6] = var2;
            if (this.field_1500++ >= this.field_1508) {
               this.method_1218(this.field_1503 << 1);
            }

         } else {
            int var8 = this.method_1220(var3);
            Object var9 = this.field_1501[var8];
            if (var9 == null) {
               this.field_1501[var8] = var1;
               this.field_1502[var8] = var2;
               if (this.field_1500++ >= this.field_1508) {
                  this.method_1218(this.field_1503 << 1);
               }

            } else {
               this.method_1211(var1, var2, var4, var5, var6, var7, var8, var9);
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.Object, java.lang.Object, int, java.lang.Object, int, java.lang.Object, int, java.lang.Object) void
   private void method_1211(Object var1, Object var2, int var3, Object var4, int var5, Object var6, int var7, Object var8) {
      Object[] var9 = this.field_1501;
      Object[] var10 = this.field_1502;
      int var11 = this.field_1507;
      int var14 = 0;
      int var15 = this.field_1510;

      while(true) {
         Object var12;
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

         int var16 = var12.hashCode();
         var3 = var16 & var11;
         var4 = var9[var3];
         if (var4 == null) {
            var9[var3] = var12;
            var10[var3] = var13;
            if (this.field_1500++ >= this.field_1508) {
               this.method_1218(this.field_1503 << 1);
            }

            return;
         }

         var5 = this.method_1219(var16);
         var6 = var9[var5];
         if (var6 == null) {
            var9[var5] = var12;
            var10[var5] = var13;
            if (this.field_1500++ >= this.field_1508) {
               this.method_1218(this.field_1503 << 1);
            }

            return;
         }

         var7 = this.method_1220(var16);
         var8 = var9[var7];
         if (var8 == null) {
            var9[var7] = var12;
            var10[var7] = var13;
            if (this.field_1500++ >= this.field_1508) {
               this.method_1218(this.field_1503 << 1);
            }

            return;
         }

         ++var14;
         if (var14 == var15) {
            this.method_1212(var12, var13);
            return;
         }

         var1 = var12;
         var2 = var13;
      }
   }

   // $FF: renamed from: d (java.lang.Object, java.lang.Object) void
   private void method_1212(Object var1, Object var2) {
      if (this.field_1504 == this.field_1509) {
         this.method_1218(this.field_1503 << 1);
         this.method_1209(var1, var2);
      } else {
         int var3 = this.field_1503 + this.field_1504;
         this.field_1501[var3] = var1;
         this.field_1502[var3] = var2;
         ++this.field_1504;
         ++this.field_1500;
      }
   }

   // $FF: renamed from: a (java.lang.Object) java.lang.Object
   public Object method_1213(Object var1) {
      int var2 = var1.hashCode();
      int var3 = var2 & this.field_1507;
      if (!var1.equals(this.field_1501[var3])) {
         var3 = this.method_1219(var2);
         if (!var1.equals(this.field_1501[var3])) {
            var3 = this.method_1220(var2);
            if (!var1.equals(this.field_1501[var3])) {
               return this.method_1214(var1, (Object)null);
            }
         }
      }

      return this.field_1502[var3];
   }

   // $FF: renamed from: e (java.lang.Object, java.lang.Object) java.lang.Object
   private Object method_1214(Object var1, Object var2) {
      Object[] var3 = this.field_1501;
      int var4 = this.field_1503;

      for(int var5 = var4 + this.field_1504; var4 < var5; ++var4) {
         if (var1.equals(var3[var4])) {
            return this.field_1502[var4];
         }
      }

      return var2;
   }

   // $FF: renamed from: a (int) void
   void method_1215(int var1) {
      --this.field_1504;
      int var2 = this.field_1503 + this.field_1504;
      if (var1 < var2) {
         this.field_1501[var1] = this.field_1501[var2];
         this.field_1502[var1] = this.field_1502[var2];
         this.field_1502[var2] = null;
      } else {
         this.field_1502[var1] = null;
      }

   }

   // $FF: renamed from: b (java.lang.Object) boolean
   public boolean method_1216(Object var1) {
      int var2 = var1.hashCode();
      int var3 = var2 & this.field_1507;
      if (!var1.equals(this.field_1501[var3])) {
         var3 = this.method_1219(var2);
         if (!var1.equals(this.field_1501[var3])) {
            var3 = this.method_1220(var2);
            if (!var1.equals(this.field_1501[var3])) {
               return this.method_1217(var1);
            }
         }
      }

      return true;
   }

   // $FF: renamed from: c (java.lang.Object) boolean
   private boolean method_1217(Object var1) {
      Object[] var2 = this.field_1501;
      int var3 = this.field_1503;

      for(int var4 = var3 + this.field_1504; var3 < var4; ++var3) {
         if (var1.equals(var2[var3])) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: b (int) void
   private void method_1218(int var1) {
      int var2 = this.field_1503 + this.field_1504;
      this.field_1503 = var1;
      this.field_1508 = (int)((float)var1 * this.field_1505);
      this.field_1507 = var1 - 1;
      this.field_1506 = 31 - Integer.numberOfTrailingZeros(var1);
      this.field_1509 = Math.max(3, (int)Math.ceil(Math.log((double)var1)) * 2);
      this.field_1510 = Math.max(Math.min(var1, 8), (int)Math.sqrt((double)var1) / 8);
      Object[] var3 = this.field_1501;
      Object[] var4 = this.field_1502;
      this.field_1501 = (Object[])(new Object[var1 + this.field_1509]);
      this.field_1502 = (Object[])(new Object[var1 + this.field_1509]);
      int var5 = this.field_1500;
      this.field_1500 = 0;
      this.field_1504 = 0;
      if (var5 > 0) {
         for(int var6 = 0; var6 < var2; ++var6) {
            Object var7 = var3[var6];
            if (var7 != null) {
               this.method_1210(var7, var4[var6]);
            }
         }
      }

   }

   // $FF: renamed from: c (int) int
   private int method_1219(int var1) {
      var1 *= -1262997959;
      return (var1 ^ var1 >>> this.field_1506) & this.field_1507;
   }

   // $FF: renamed from: d (int) int
   private int method_1220(int var1) {
      var1 *= -825114047;
      return (var1 ^ var1 >>> this.field_1506) & this.field_1507;
   }

   public int hashCode() {
      int var1 = 0;
      Object[] var2 = this.field_1501;
      Object[] var3 = this.field_1502;
      int var4 = 0;

      for(int var5 = this.field_1503 + this.field_1504; var4 < var5; ++var4) {
         Object var6 = var2[var4];
         if (var6 != null) {
            var1 += var6.hashCode() * 31;
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
      } else if (!(var1 instanceof class_173)) {
         return false;
      } else {
         class_173 var2 = (class_173)var1;
         if (var2.field_1500 != this.field_1500) {
            return false;
         } else {
            Object[] var3 = this.field_1501;
            Object[] var4 = this.field_1502;
            int var5 = 0;

            for(int var6 = this.field_1503 + this.field_1504; var5 < var6; ++var5) {
               Object var7 = var3[var5];
               if (var7 != null) {
                  Object var8 = var4[var5];
                  if (var8 == null) {
                     if (!var2.method_1216(var7) || var2.method_1213(var7) != null) {
                        return false;
                     }
                  } else if (!var8.equals(var2.method_1213(var7))) {
                     return false;
                  }
               }
            }

            return true;
         }
      }
   }

   public String toString() {
      return this.method_1221(", ", true);
   }

   // $FF: renamed from: a (java.lang.String, boolean) java.lang.String
   private String method_1221(String var1, boolean var2) {
      if (this.field_1500 == 0) {
         return var2 ? "{}" : "";
      } else {
         StringBuilder var3 = new StringBuilder(32);
         if (var2) {
            var3.append('{');
         }

         Object[] var4 = this.field_1501;
         Object[] var5 = this.field_1502;
         int var6 = var4.length;

         Object var7;
         while(var6-- > 0) {
            var7 = var4[var6];
            if (var7 != null) {
               var3.append(var7);
               var3.append('=');
               var3.append(var5[var6]);
               break;
            }
         }

         while(var6-- > 0) {
            var7 = var4[var6];
            if (var7 != null) {
               var3.append(var1);
               var3.append(var7);
               var3.append('=');
               var3.append(var5[var6]);
            }
         }

         if (var2) {
            var3.append('}');
         }

         return var3.toString();
      }
   }

   // $FF: renamed from: a () com.corrodinggames.rts.java.audio.a.p
   public class_168 method_1222() {
      return this.method_1223();
   }

   // $FF: renamed from: b () com.corrodinggames.rts.java.audio.a.p
   public class_168 method_1223() {
      if (this.field_1511 == null) {
         this.field_1511 = new class_168(this);
         this.field_1512 = new class_168(this);
      }

      if (!this.field_1511.f) {
         this.field_1511.method_1203();
         this.field_1511.f = true;
         this.field_1512.f = false;
         return this.field_1511;
      } else {
         this.field_1512.method_1203();
         this.field_1512.f = true;
         this.field_1511.f = false;
         return this.field_1512;
      }
   }

   // $FF: synthetic method
   public Iterator iterator() {
      return this.method_1222();
   }
}
