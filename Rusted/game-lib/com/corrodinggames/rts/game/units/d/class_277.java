package com.corrodinggames.rts.game.units.d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_134;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_30;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.utility.class_193;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.d.j
public class class_277 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.p
   class_44 field_2370;
   // $FF: renamed from: b android.graphics.PointF
   public PointF field_2371 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.utility.k
   class_193 field_2372 = new class_193();
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.utility.k
   class_193 field_2373 = new class_193();
   // $FF: renamed from: e float
   public float field_2374;
   // $FF: renamed from: f com.corrodinggames.rts.game.units.d.i
   class_32 field_2375;

   public strictfp class_277(class_44 var1) {
      this.field_2370 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_1920(class_404 var1) {
      var1.method_2542(this.field_2374);
      var1.method_2541(this.field_2372.size());
      Iterator var2 = this.field_2372.iterator();

      while(var2.hasNext()) {
         class_30 var3 = (class_30)var2.next();
         var3.method_148(var1);
      }

      var1.method_2540(this.field_2371 != null);
      if (this.field_2371 != null) {
         var1.method_2542(this.field_2371.field_2406);
         var1.method_2542(this.field_2371.field_2407);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_1921(class_463 var1) {
      this.field_2374 = var1.method_3012();
      int var2 = var1.method_3011();
      this.field_2372.clear();

      for(int var3 = 0; var3 < var2; ++var3) {
         class_32 var4 = new class_32();
         var4.method_154(var1);
         if (class_121.method_1039(var4.field_23)) {
            class_121 var5 = this.field_2370.b(var4.field_23);
            if (var5 == null) {
               class_236.method_1592("Factory", this.field_2370.o() + " no longer has the action:" + var4.field_23);
            } else {
               this.field_2372.add(var4);
            }
         } else {
            class_236.method_1592("Factory", "buildQueue has uIndex of -1, skipping");
         }
      }

      if (var1.method_3006() >= 5) {
         boolean var6 = var1.method_3010();
         if (var6) {
            if (this.field_2371 == null) {
               this.field_2371 = new PointF();
            }

            this.field_2371.field_2406 = var1.method_3012();
            this.field_2371.field_2407 = var1.method_3012();
         } else {
            this.field_2371 = null;
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.d.i, float, boolean, float) com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_1922(class_32 var1, float var2, boolean var3, float var4) {
      class_121 var5 = this.field_2370.b(var1.field_23);
      if (var5 == null) {
         class_454.method_2889("specialAction=null on completeQueueItem for item.uIndex:" + var1.field_23 + " id:" + this.field_2370.da, true);
         return null;
      } else {
         class_24 var6 = var5.method_1055();
         if (var6 == null) {
            class_454.method_2889("unitType=null on completeQueueItem for item.uIndex:" + var1.field_23 + " id:" + this.field_2370.da, false);
            return null;
         } else {
            return this.method_1923(var6, var2, var3, var4);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, float, boolean, float) com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_1923(class_24 var1, float var2, boolean var3, float var4) {
      class_39 var5 = null;
      var5 = var1.method_128();
      var5.dh = this.field_2370.dh;
      var5.di = this.field_2370.di + 5.0F;
      var5.field_154 = 90.0F + var4;
      var5.method_258(this.field_2370.bk);
      if (var5.method_314()) {
         var5.method_258(class_107.field_1224);
      }

      var5.field_159 = 30.0F;
      if (this.field_2370 instanceof class_56) {
         var5.field_159 += 40.0F;
      }

      if (var5 instanceof class_44) {
         class_44 var6 = (class_44)var5;
         var6.method_362(90.0F);
         if ((double)var6.method_458() < 0.75D) {
            var5.field_159 += 30.0F;
         }

         if ((double)var6.method_458() < 0.55D) {
            var5.field_159 += 20.0F;
         }

         float var7 = var3 ? 0.0F : 1.0F;
         float var9 = this.field_2370.dh + class_296.method_2099(var5.field_154) * var2;
         float var10 = this.field_2370.di + class_296.method_2098(var5.field_154) * var2;
         if (this.field_2371 != null) {
            var6.method_397(var9, var10);
            var6.method_397(this.field_2371.field_2406 + var7, this.field_2371.field_2407);
         } else {
            var9 -= class_296.method_2098(var5.field_154) * var7;
            var10 += class_296.method_2099(var5.field_154) * var7;
            var6.method_397(var9, var10);
         }
      }

      class_236 var11 = class_236.method_1549();
      if (var5.field_143 == var11.field_1915) {
         var11.field_1939.field_948.method_1020(var5);
      }

      return var5;
   }

   // $FF: renamed from: a () boolean
   public strictfp boolean method_1924() {
      return this.field_2372.size() == 0;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.p, boolean) com.corrodinggames.rts.game.units.d.i
   public strictfp class_32 method_1925(class_134 var1, boolean var2) {
      return this.method_1926(var1, var2, (PointF)null, (class_39)null);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.p, boolean, android.graphics.PointF, com.corrodinggames.rts.game.units.aa) com.corrodinggames.rts.game.units.d.i
   public strictfp class_32 method_1926(class_134 var1, boolean var2, PointF var3, class_39 var4) {
      class_32 var5 = new class_32();
      var5.field_23 = var1.v();
      var5.field_16 = var5.field_23;
      var5.field_21 = var3;
      var5.field_22 = var4;
      if (var5.field_16 == null) {
         throw new RuntimeException("item.type==null??");
      } else {
         var5.field_17 = 1;
         var5.field_18 = var1.method_1100();
         var5.field_19 = var1.c();
         var5.field_20 = var1.g();
         var5.field_25 = var1.z();
         if (!var2) {
            if (!var5.field_25) {
               this.field_2372.add(var5);
            } else {
               int var6 = 0;

               for(int var7 = 0; var7 < this.field_2372.size() && ((class_32)this.field_2372.get(var7)).field_25; ++var7) {
                  var6 = var7 + 1;
               }

               if (var6 == 0 && this.field_2372.size() != 0) {
               }

               this.field_2372.add(var6, var5);
            }

            this.field_2370.bk.method_922(true);
         } else {
            this.field_2373.add(var5);
         }

         return var5;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.p, boolean) com.corrodinggames.rts.game.units.d.i
   public strictfp class_32 method_1927(class_134 var1, boolean var2) {
      if (var2) {
         if (this.method_1934(var1.v(), true) > 0) {
            class_32 var6 = this.method_1925(var1, true);
            var6.field_24 = true;
            return var6;
         } else {
            return null;
         }
      } else {
         class_193 var3 = this.field_2372;
         ListIterator var4 = var3.listIterator(var3.size());

         class_32 var5;
         do {
            if (!var4.hasPrevious()) {
               return null;
            }

            var5 = (class_32)var4.previous();
         } while(!var5.field_16.equals(var1.v()));

         var4.remove();
         this.field_2370.bk.method_922(true);
         return var5;
      }
   }

   // $FF: renamed from: b () com.corrodinggames.rts.game.units.d.i
   public strictfp class_32 method_1928() {
      return this.field_2375;
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.a.l
   public strictfp class_121 method_1929() {
      if (this.field_2375 != null) {
         class_121 var1 = this.field_2370.b(this.field_2375.field_16);
         return var1;
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_1930(float var1) {
      if (!this.method_1924()) {
         class_32 var2 = (class_32)this.method_1940().get(0);
         if (this.field_2375 != var2) {
            if (this.field_2375 != null) {
               this.field_2374 = var2.field_26;
            }

            this.field_2375 = var2;
         }

         this.field_2374 += var2.field_18 * this.field_2370.bH() * var1;
         var2.field_26 = this.field_2374;
         if (this.field_2374 > 1.0F) {
            if (var2.field_20 && ((class_8)this.field_2370).method_9()) {
               this.field_2374 = 1.0F;
            } else {
               this.field_2374 = 0.0F;
               --var2.field_17;
               if (var2.field_17 <= 0) {
                  List var3 = this.method_1940();
                  if (var3.size() == 0) {
                     class_236.method_1588("-------------buildQueue empty for:" + var2.field_23);
                     class_236.method_1588("-------------");
                  } else {
                     var3.remove(0);
                  }
               }

               ((class_8)this.field_2370).method_10(var2);
            }
         }
      } else {
         this.field_2375 = null;
         this.field_2374 = 0.0F;
      }

   }

   // $FF: renamed from: d () void
   public strictfp void method_1931() {
      Iterator var1 = this.field_2372.iterator();

      while(var1.hasNext()) {
         class_32 var2 = (class_32)var1.next();
         class_121 var3 = this.field_2370.b(var2.field_23);
         if (var3 == null) {
            class_107 var10000 = this.field_2370.bk;
            var10000.field_1229 += var2.field_19;
            var1.remove();
         }
      }

   }

   // $FF: renamed from: e () void
   public strictfp void method_1932() {
      Iterator var1 = this.field_2372.iterator();

      while(var1.hasNext()) {
         class_32 var2 = (class_32)var1.next();
         class_107 var10000 = this.field_2370.bk;
         var10000.field_1229 += var2.field_19;
         var1.remove();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) int
   public strictfp int method_1933(class_24 var1) {
      int var2 = 0;
      int var3 = this.field_2372.field_1647;
      if (var3 != 0) {
         Object[] var4 = this.field_2372.method_1298();

         for(int var5 = 0; var5 < var3; ++var5) {
            class_32 var6 = (class_32)var4[var5];
            if (var6.field_20) {
               class_121 var7 = this.field_2370.c(var6.field_23);
               if (var7 == null) {
                  boolean var8 = this.field_2370.b(var6.field_23) != null;
                  class_236.method_1588("getAllUnitsOfTypeInQueue specialAction==null for:" + var6.field_23 + " parent:" + this.field_2370.o().method_141() + " foundWithoutDedup:" + var8);
               } else if (var7.method_1055() == var1) {
                  var2 += var6.field_17;
               }
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.String, boolean) int
   public strictfp int method_1934(String var1, boolean var2) {
      return this.method_1935(var1, var2, false);
   }

   // $FF: renamed from: a (java.lang.String, boolean, boolean) int
   public strictfp int method_1935(String var1, boolean var2, boolean var3) {
      int var4 = 0;
      Iterator var5;
      class_32 var6;
      if (this.field_2372.field_1647 != 0) {
         var5 = this.field_2372.iterator();

         label64:
         while(true) {
            do {
               do {
                  if (!var5.hasNext()) {
                     break label64;
                  }

                  var6 = (class_32)var5.next();
               } while(!var6.field_16.equals(var1) && !class_121.field_1347.equals(var1));
            } while(var3 && !var6.field_20);

            var4 += var6.field_17;
         }
      }

      if (var2 && this.field_2373.field_1647 != 0) {
         var5 = this.field_2373.iterator();

         while(true) {
            do {
               do {
                  if (!var5.hasNext()) {
                     return var4;
                  }

                  var6 = (class_32)var5.next();
               } while(!var6.field_16.equals(var1) && !class_121.field_1347.equals(var1));
            } while(var3 && !var6.field_20);

            if (!var6.field_24) {
               var4 += var6.field_17;
            } else {
               var4 -= var6.field_17;
            }
         }
      } else {
         return var4;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ap) java.lang.String
   public strictfp String method_1936(class_24 var1) {
      ArrayList var2 = this.field_2370.E();
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         class_121 var5 = (class_121)var2.get(var3);
         if (var5 != null && var5 instanceof class_134) {
            class_134 var6 = (class_134)var5;
            if (var6.i() == var1) {
               return var6.v();
            }
         }
      }

      return class_121.field_1347;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean, android.graphics.PointF, com.corrodinggames.rts.game.units.aa) com.corrodinggames.rts.game.units.d.i
   public strictfp class_32 method_1937(class_121 var1, boolean var2, PointF var3, class_39 var4) {
      if (var1 instanceof class_134) {
         class_134 var5 = (class_134)var1;
         if (!var2) {
            if (var1.method_1050(this.field_2370, false) && (!var5.g() || this.field_2370.bk.method_924() < this.field_2370.bk.method_925()) && this.field_2370.bk.method_940(var5.c())) {
               return this.method_1926(var5, false, var3, var4);
            }
         } else {
            class_32 var6 = this.method_1927(var5, false);
            if (var6 != null) {
               class_107 var10000 = this.field_2370.bk;
               var10000.field_1229 += var5.c();
               return var6;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_1938(class_121 var1, boolean var2) {
      if (var1 instanceof class_134) {
         class_134 var3 = (class_134)var1;
         if (!var2) {
            if (var1.method_1050(this.field_2370, true) && (!var3.g() || this.field_2370.bk.method_924() < this.field_2370.bk.method_925()) && this.field_2370.bk.method_941(var3.c())) {
               this.method_1925(var3, true);
            }
         } else if (this.method_1927(var3, true) != null) {
            class_107 var10000 = this.field_2370.bk;
            var10000.field_1230 += var3.c();
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l) void
   public strictfp void method_1939(class_121 var1) {
      if (this.field_2373.size() != 0) {
         class_32 var2 = null;
         Iterator var3 = this.field_2373.iterator();

         while(var3.hasNext()) {
            class_32 var4 = (class_32)var3.next();
            if (var4.field_16.equals(var1.method_1043())) {
               var2 = var4;
            }
         }

         if (var2 != null) {
            class_107 var10000;
            if (!var2.field_24) {
               var10000 = this.field_2370.bk;
               var10000.field_1230 += var2.field_19;
            } else {
               var10000 = this.field_2370.bk;
               var10000.field_1230 -= var2.field_19;
            }

            this.field_2373.remove(var2);
         }
      }

   }

   // $FF: renamed from: f () java.util.List
   public strictfp List method_1940() {
      return this.field_2372;
   }

   // $FF: renamed from: g () com.corrodinggames.rts.gameFramework.utility.k
   public strictfp class_193 method_1941() {
      return this.field_2372;
   }
}
