package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.graphics.PointF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_125;
import com.corrodinggames.rts.game.units.a.class_131;
import com.corrodinggames.rts.game.units.a.class_392;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.d.class_61;
import com.corrodinggames.rts.game.units.d.class_8;
import com.corrodinggames.rts.game.units.e.class_79;
import com.corrodinggames.rts.game.units.e.class_84;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.h.class_306;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.g
public class class_81 extends class_79 implements class_9 {
   // $FF: renamed from: a android.graphics.PointF[]
   PointF[] field_688 = new PointF[6];
   // $FF: renamed from: b android.graphics.PointF[]
   PointF[] field_689;
   // $FF: renamed from: c android.graphics.Paint
   static Paint field_690;
   // $FF: renamed from: d android.graphics.Paint
   static Paint field_691;
   // $FF: renamed from: e android.graphics.Paint
   static Paint field_692;
   // $FF: renamed from: f com.corrodinggames.rts.game.units.a.l
   static class_121 field_693;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.a.l
   static class_121 field_694;
   // $FF: renamed from: h com.corrodinggames.rts.game.units.a.l
   static class_121 field_695;
   // $FF: renamed from: i com.corrodinggames.rts.game.units.a.l
   static class_121 field_696;
   // $FF: renamed from: j com.corrodinggames.rts.game.units.a.l
   static class_121 field_697;
   // $FF: renamed from: k com.corrodinggames.rts.game.units.a.l
   static class_121 field_698;
   // $FF: renamed from: l com.corrodinggames.rts.game.units.a.l
   static class_121 field_699;
   // $FF: renamed from: m com.corrodinggames.rts.game.units.a.l
   static class_121 field_700;
   // $FF: renamed from: n com.corrodinggames.rts.game.units.a.l
   static class_121 field_701;
   // $FF: renamed from: o com.corrodinggames.rts.game.units.a.l
   static class_121 field_702;
   // $FF: renamed from: p com.corrodinggames.rts.game.units.a.l
   static class_121 field_703;
   // $FF: renamed from: q com.corrodinggames.rts.game.units.a.l
   static class_121 field_704;
   // $FF: renamed from: r com.corrodinggames.rts.game.units.a.l
   static class_121 field_705;
   // $FF: renamed from: s com.corrodinggames.rts.game.units.a.l
   static class_121 field_706;
   // $FF: renamed from: t com.corrodinggames.rts.game.units.a.l
   static class_121 field_707;
   // $FF: renamed from: u com.corrodinggames.rts.game.units.a.l
   static class_121 field_708;
   // $FF: renamed from: v com.corrodinggames.rts.game.units.a.l
   static class_121 field_709;
   // $FF: renamed from: w com.corrodinggames.rts.game.units.a.l
   static class_121 field_710;
   // $FF: renamed from: x com.corrodinggames.rts.game.units.a.l
   static class_121 field_711;
   // $FF: renamed from: y com.corrodinggames.rts.game.units.a.l
   static class_121 field_712;
   // $FF: renamed from: z com.corrodinggames.rts.game.units.a.l
   static class_121 field_713;
   // $FF: renamed from: A com.corrodinggames.rts.game.units.a.l
   static class_121 field_714;
   // $FF: renamed from: B com.corrodinggames.rts.game.units.a.l
   static class_121 field_715;
   // $FF: renamed from: C java.util.ArrayList
   static ArrayList field_716;
   // $FF: renamed from: D com.corrodinggames.rts.game.units.k
   class_279 field_717;
   // $FF: renamed from: E com.corrodinggames.rts.game.units.a.a
   static class_392 field_718;

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.ao
   public strictfp class_469 method_646() {
      return class_469.field_4040;
   }

   // $FF: renamed from: b () android.graphics.PointF[]
   public strictfp PointF[] method_18() {
      return this.field_688;
   }

   // $FF: renamed from: c () android.graphics.PointF[]
   public strictfp PointF[] method_19() {
      return this.field_689;
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return this.bk.field_1227 == -1 ? null : cO[this.bk.method_963()];
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_386(class_39 var1) {
      return true;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_346() {
      return this.bi ? class_84.field_733 : class_84.field_735[this.bk.method_963()];
   }

   // $FF: renamed from: k () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_347() {
      return null;
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_348(int var1) {
      return null;
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      this.G = class_84.field_733;
      this.I(0);
      this.bh = false;
      var1.field_1933.method_3323(class_525.field_4756, 0.8F, this.dh, this.di);
      this.aQ();
      return true;
   }

   public strictfp class_81(boolean var1) {
      super(var1);
      this.field_689 = new PointF[this.field_688.length];
      field_690 = new Paint();
      field_690.method_2791(40, 0, 255, 0);
      field_690.method_2781(true);
      field_690.method_2793(2.0F);
      field_690.method_2794(Paint$Cap.field_1808);
      field_691 = new Paint();
      field_691.method_2776(field_690);
      field_691.method_2791(55, 255, 60, 60);
      field_692 = new Paint();
      field_692.method_2791(60, 255, 255, 255);
      this.field_717 = class_279.field_2393;
      this.J(20);
      this.K(20);
      this.by = 10.0F;
      this.dh = -1000.0F;
      this.di = -1000.0F;
      this.bz = this.by;
      this.bJ = 170000.0F;
      this.bI = this.bJ;
      this.G = class_84.field_733;

      for(int var2 = 0; var2 < this.field_688.length; ++var2) {
         this.field_688[var2] = new PointF();
         this.field_689[var2] = new PointF();
      }

   }

   // $FF: renamed from: a (float, com.corrodinggames.rts.game.units.d) void
   public static strictfp void method_647(float var0, class_9 var1) {
      class_44 var2 = (class_44)var1;
      PointF[] var3 = var1.method_18();
      PointF[] var4 = var1.method_19();
      class_39 var5 = var2.method_365();
      var2.field_329 = var5 != null;
      int var6;
      PointF var7;
      PointF var8;
      if (var5 != null) {
         for(var6 = 0; var6 < var3.length; ++var6) {
            var7 = var3[var6];
            var8 = var4[var6];
            var7.field_2406 = class_296.method_2021(var7.field_2406, var8.field_2406, 0.1F * var0);
            var7.field_2407 = class_296.method_2021(var7.field_2407, var8.field_2407, 0.1F * var0);
            var7.field_2406 += (var8.field_2406 - var7.field_2406) * 0.04F * var0;
            var7.field_2407 += (var8.field_2407 - var7.field_2407) * 0.04F * var0;
            float var9 = var5.field_157 * 0.75F;
            if (class_296.method_2042(var7.field_2406 - var8.field_2406) < 1.0F) {
               var8.field_2406 = class_296.method_2034(-var9, var9);
            }

            if (class_296.method_2042(var7.field_2407 - var8.field_2407) < 1.0F) {
               var8.field_2407 = class_296.method_2034(-var9, var9);
            }
         }
      } else if (var3[0].field_2406 != 0.0F || var3[0].field_2407 != 0.0F) {
         for(var6 = 0; var6 < var3.length; ++var6) {
            var7 = var3[var6];
            var8 = var4[var6];
            var7.field_2406 = 0.0F;
            var7.field_2407 = 0.0F;
            var8.field_2406 = 0.0F;
            var8.field_2407 = 0.0F;
         }
      }

   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      if (var1 < 0.3F) {
         var1 = 0.3F;
      }

      super.a(var1);
      if (!this.bi) {
         method_647(var1, this);
      }

      this.bI = this.bJ;
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
      if (!this.bi) {
      }

   }

   // $FF: renamed from: e (int) float
   public strictfp float method_445(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: f (int) float
   public strictfp float method_448(int var1) {
      return 0.0F;
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!super.c(var1)) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         if (!this.bi) {
            float var3 = this.bV[0].field_4612 / this.method_445(0);
            if (var3 != 0.0F) {
               PointF var4 = this.w(0);
               var2.field_1935.method_89();
               var2.field_1935.method_94(var4.field_2406 - var2.field_1965, var4.field_2407 - var2.field_1966);
               var2.field_1935.method_92(var3, var3);
               if (this.N()) {
                  var2.field_1935.method_69(class_84.field_737, 0.0F, 0.0F, (Paint)null);
               } else {
                  var2.field_1935.method_69(class_84.field_736, 0.0F, 0.0F, (Paint)null);
               }

               var2.field_1935.method_90();
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, int) void
   public strictfp void method_471(class_39 var1, int var2) {
   }

   // $FF: renamed from: a_ () boolean
   public strictfp boolean method_433() {
      return false;
   }

   // $FF: renamed from: r () int
   public strictfp int method_290() {
      return 850000;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_291(class_39 var1) {
      return 1.0E7F;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_292(class_39 var1) {
      return 1.0E7F;
   }

   // $FF: renamed from: m () float
   public strictfp float method_439() {
      return 30.0F;
   }

   // $FF: renamed from: b (int) float
   public strictfp float method_441(int var1) {
      return 100.0F;
   }

   // $FF: renamed from: s () float
   public strictfp float method_458() {
      return 0.0F;
   }

   // $FF: renamed from: t () float
   public strictfp float method_451() {
      return 9.8F;
   }

   // $FF: renamed from: u () float
   public strictfp float method_452() {
      return 9.35F;
   }

   // $FF: renamed from: c (int) float
   public strictfp float method_453(int var1) {
      return 99.0F;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_312() {
      return false;
   }

   // $FF: renamed from: v () float
   public strictfp float method_466() {
      return 0.04F;
   }

   // $FF: renamed from: w () float
   public strictfp float method_467() {
      return 0.1F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
      if (var1 instanceof class_138) {
         class_138 var3 = (class_138)var1;
         boolean var4 = true;
         if (var2) {
            var4 = !var4;
         }

         if (var3.field_1367) {
            var4 = !var4;
         }

         class_107 var5;
         int var6;
         if (var4) {
            var5 = null;

            for(var6 = this.bk.field_1227 + 1; var6 < 10; ++var6) {
               var5 = class_107.method_954(var6);
               if (var5 != null) {
                  break;
               }
            }

            if (var5 == null) {
               for(var6 = 0; var6 < 10; ++var6) {
                  var5 = class_107.method_954(var6);
                  if (var5 != null) {
                     break;
                  }
               }
            }

            if (var5 != null) {
               this.a(var5);
            }
         } else {
            var5 = null;

            for(var6 = this.bk.field_1227 - 1; var6 >= 0; --var6) {
               var5 = class_107.method_954(var6);
               if (var5 != null) {
                  break;
               }
            }

            if (var5 == null) {
               for(var6 = 9; var6 >= 0; --var6) {
                  var5 = class_107.method_954(var6);
                  if (var5 != null) {
                     break;
                  }
               }
            }

            if (var5 != null) {
               this.a(var5);
            }
         }
      }

      if (var1 instanceof class_139) {
         this.bk.method_932(10000);
      }

      if (var1 instanceof class_140) {
         ((class_140)var1).method_1121();
      }

   }

   // $FF: renamed from: D () com.corrodinggames.rts.game.units.g
   static strictfp class_81 method_648() {
      class_236 var0 = class_236.method_1549();
      return var0.field_1939.method_715();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean, android.graphics.PointF, com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_263(class_121 var1, boolean var2, PointF var3, class_39 var4) {
      class_236 var5 = class_236.method_1549();
      if (var1 instanceof class_125) {
         var1 = ((class_125)var1).method_1083();
      }

      if (var1 == field_707) {
         if (var2) {
            return;
         }

         class_236.method_1591("Reload units requested");
         var5.field_1946.method_1445();
         var5.field_1939.method_705("All custom unit files reloaded");
      }

      int var6 = 0;
      Iterator var7;
      class_34 var8;
      if (var1 != field_709 && var1 != field_710 && var1 != field_708) {
         if (var1 == field_712) {
            if (var2) {
               return;
            }

            class_97 var13 = class_61.method_572(this, var3.field_2406, var3.field_2407, var3.field_2406, var3.field_2407);
            if (var13 != null) {
               var13.dj = 100.0F;
               var13.field_841 = null;
            }
         }

         if (var1 == field_711) {
            if (!var2) {
               var7 = class_34.method_189().iterator();

               while(var7.hasNext()) {
                  var8 = (class_34)var7.next();
                  if (var8 instanceof class_44 && var8 instanceof class_8 && class_296.method_2026(var8.field_74, var8.field_75, var3.field_2406, var3.field_2407) < 2500.0F) {
                     class_8 var16 = (class_8)var8;
                     var16.method_16();
                  }
               }

            }
         } else {
            if (var1 == field_713) {
               class_107 var14 = this.bk;
               if (var14 instanceof class_112) {
                  class_112 var15 = (class_112)var14;
                  if (var15.field_1315 > 0.0F) {
                     var15.field_1315 = 0.0F;
                  } else {
                     var15.field_1315 = 10800.0F;
                  }
               }
            }

            if (var1 == field_714) {
               if (var5.field_1916 != 0.0F) {
                  var5.field_1916 = 0.0F;
               } else {
                  var5.field_1916 = 1.0F;
               }
            }

            if (var1 == field_715) {
               if (var5.field_1916 == 1.0F) {
                  var5.field_1916 = 0.1F;
               } else {
                  var5.field_1916 = 1.0F;
               }
            }

            super.a(var1, var2, var3, var4);
         }
      } else if (!var2) {
         var7 = class_34.method_189().iterator();

         while(var7.hasNext()) {
            var8 = (class_34)var7.next();
            if (var8 instanceof class_39 && class_296.method_2026(var8.field_74, var8.field_75, var3.field_2406, var3.field_2407) < 2500.0F) {
               ++var6;
               class_39 var9;
               if (var1 == field_709) {
                  var9 = (class_39)var8;
                  var9.method_252();
                  if (var9 instanceof class_44) {
                     var5.field_1941.method_1689((class_44)var9);
                  }
               } else if (var1 == field_710) {
                  ((class_39)var8).field_167 = -1.0F;
               } else if (var1 == field_708) {
                  if (var6 > 4) {
                     break;
                  }

                  var9 = (class_39)var8;
                  if (!var9.method_212() && !(var9 instanceof class_42) && !var9.field_141) {
                     class_24 var10 = var9.method_295();

                     for(int var11 = -25; var11 < 25; ++var11) {
                        class_39 var12 = var10.method_128();
                        var12.dh = var9.dh + (float)var11 * 0.5F + 1.0F;
                        var12.di = var9.di + (float)var11 * 0.5F + 1.0F;
                        var12.method_258(var9.field_143);
                        var12.field_154 = (float)class_296.method_2014(var9, -180, 180, 25 + var11);
                        if (var12 instanceof class_44) {
                           ((class_44)var12).field_310 = true;
                        }
                     }
                  }
               }
            }
         }

      }
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public static strictfp void method_649(ArrayList var0, int var1) {
      if (var1 == 1) {
         field_716 = new ArrayList();
         field_716.add(new class_138(true, false));
         field_716.add(new class_138(true, true));
         field_716.add(new class_138(false, false));
         field_716.add(new class_140(true, false));
         class_140 var2 = new class_140(true, true);
         field_716.add(var2);
         field_716.add(new class_140(false, false));
         ArrayList var3 = new ArrayList();
         var3.add(new class_139());
         var3.add(field_707);
         var3.add(field_709);
         var3.add(field_708);
         var3.add(field_710);
         var3.add(field_712);
         var3.add(field_711);
         var3.add(field_713);
         var3.add(field_714);
         var3.add(field_715);
         Iterator var4 = var3.iterator();

         while(var4.hasNext()) {
            class_121 var5 = (class_121)var4.next();
            class_125 var6 = new class_125(var5, field_718);
            field_716.add(var6);
         }

         ArrayList var12 = new ArrayList();
         var12.addAll(class_469.field_4085);
         Collections.sort(var12, new g$2());
         Iterator var13 = var12.iterator();

         while(true) {
            class_479 var8;
            class_24 var14;
            do {
               class_39 var7;
               do {
                  do {
                     do {
                        do {
                           do {
                              do {
                                 do {
                                    do {
                                       if (!var13.hasNext()) {
                                          return;
                                       }

                                       var14 = (class_24)var13.next();
                                    } while(var14 == class_469.field_4067);
                                 } while(var14.method_141().equals("test_tank"));
                              } while(var14.method_141().equals("missing"));
                           } while(var14 == class_469.field_4054);
                        } while(var14 == class_469.field_4049);
                     } while(var14 == class_469.field_4076);
                  } while(var14 == class_469.field_4066);

                  var7 = class_39.method_217(var14);
               } while(!(var7 instanceof class_44));

               if (!(var14 instanceof class_479)) {
                  break;
               }

               var8 = (class_479)var14;
            } while(!var8.field_4217);

            class_131 var15 = new class_131(var14, 1, (Integer)null);
            class_125 var16 = new class_125(var15, field_718);
            boolean var9 = false;
            Iterator var10 = field_716.iterator();

            while(var10.hasNext()) {
               class_121 var11 = (class_121)var10.next();
               if (var11.equals(var16)) {
                  var9 = true;
               }
            }

            if (!var9) {
               field_716.add(var16);
            }
         }
      }
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      class_236 var1 = class_236.method_1549();
      return field_716;
   }

   // $FF: renamed from: x () boolean
   public strictfp boolean method_456() {
      return true;
   }

   // $FF: renamed from: g (int) float
   public strictfp float method_474(int var1) {
      return 10.0F;
   }

   // $FF: renamed from: y () boolean
   public strictfp boolean method_426() {
      return class_236.method_1549().field_1937.renderExtraShadows && !this.bi;
   }

   // $FF: renamed from: z () float
   public strictfp float method_428() {
      return 1.0F;
   }

   // $FF: renamed from: A () float
   public strictfp float method_429() {
      return 1.0F;
   }

   // $FF: renamed from: B () boolean
   public strictfp boolean method_318() {
      return true;
   }

   // $FF: renamed from: C () boolean
   public strictfp boolean method_431() {
      return false;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_319(class_39 var1) {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public strictfp float method_246(class_39 var1, float var2, class_97 var3) {
      var2 = 0.0F;
      return super.a(var1, var2, var3);
   }

   // $FF: renamed from: F () void
   public strictfp void method_236() {
   }

   // $FF: renamed from: G () boolean
   public strictfp boolean method_286() {
      return true;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_295() {
      return this.method_646();
   }

   static {
      field_693 = new class_131(class_469.field_4033);
      field_694 = new class_131(class_469.field_4038);
      field_695 = new class_131(class_469.field_4039);
      field_696 = new class_131(class_469.field_4034);
      field_697 = new class_131(class_469.field_4035);
      field_698 = new class_131(class_469.field_4036);
      field_699 = new class_131(class_469.field_4057);
      field_700 = new class_131(class_469.field_4060);
      field_701 = new class_131(class_469.field_4065);
      field_702 = new class_131(class_469.field_4067);
      field_703 = new class_131(class_469.field_4068);
      field_704 = new class_131(class_469.field_4072);
      field_705 = new class_131(class_469.field_4061);
      field_706 = new class_131(class_469.field_4062);
      field_707 = new g$1("reloadUnits");
      field_708 = new g$4("unitClone");
      field_709 = new g$5("removeUnits");
      field_710 = new g$6("killUnits");
      field_711 = new g$7("finishQueue");
      field_712 = new g$8("nukeAt");
      field_713 = new g$9("freezeAI");
      field_714 = new g$10("pauseGame");
      field_715 = new g$11("slowGame");
      field_718 = new g$3();
   }
}
