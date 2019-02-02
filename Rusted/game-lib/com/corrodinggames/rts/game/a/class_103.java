package com.corrodinggames.rts.game.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.class_10;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.a.m
public class class_103 extends class_102 {
   // $FF: renamed from: a boolean
   boolean field_1146;
   // $FF: renamed from: b int
   int field_1147;
   // $FF: renamed from: c int
   int field_1148;
   // $FF: renamed from: d com.corrodinggames.rts.game.a.h
   class_106 field_1149;
   // $FF: renamed from: e float
   float field_1150 = 100.0F;
   // $FF: renamed from: f float
   float field_1151 = 4000.0F;
   // $FF: renamed from: g float
   float field_1152 = 100.0F;
   // $FF: renamed from: h float
   float field_1153;
   // $FF: renamed from: i float
   float field_1154;
   // $FF: renamed from: j float
   float field_1155;
   // $FF: renamed from: k float
   float field_1156;
   // $FF: renamed from: l int
   int field_1157;
   // $FF: renamed from: m com.corrodinggames.rts.game.a.g
   class_102 field_1158;
   // $FF: renamed from: n com.corrodinggames.rts.game.units.p
   class_44 field_1159;
   // $FF: renamed from: o float
   float field_1160 = 0.0F;
   // $FF: renamed from: p boolean
   boolean field_1161 = false;
   // $FF: renamed from: q boolean
   boolean field_1162;
   // $FF: renamed from: r float
   float field_1163;
   // $FF: renamed from: s float
   float field_1164;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2540(this.field_1146);
      var1.method_2541(this.field_1147);
      var1.method_2541(this.field_1148);
      int var2 = this.B.size();
      var1.method_2541(var2);
      Iterator var3 = this.B.iterator();

      while(var3.hasNext()) {
         class_44 var4 = (class_44)var3.next();
         var1.method_2551(var4);
      }

      var1.method_2539(5);
      var1.method_2541(this.F.method_975(this.field_1158));
      var1.method_2540(this.field_1162);
      var1.method_2551(this.field_1159);
      var1.method_2542(this.field_1160);
      var1.method_2540(this.field_1161);
      var1.method_2542(this.field_1163);
      var1.method_2542(this.field_1164);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_836(class_463 var1) {
      this.field_1146 = var1.method_3010();
      this.field_1147 = var1.method_3011();
      this.field_1148 = var1.method_3011();
      this.l();
      int var2 = var1.method_3011();

      for(int var3 = 0; var3 < var2; ++var3) {
         class_44 var4 = var1.method_3021();
         if (var4 != null) {
            if (!this.F.method_994(var4)) {
               class_236.method_1588("TransporterGroup:readIn: Unit is not transporterUnit");
            } else {
               this.a(var4);
            }
         }
      }

      byte var5 = var1.method_3009();
      if (var5 >= 1) {
         this.field_1158 = (class_102)this.F.method_974(var1.method_3011());
      }

      if (var5 >= 2) {
         this.field_1162 = var1.method_3010();
      }

      if (var5 >= 3) {
         this.field_1159 = var1.method_3021();
      }

      if (var5 >= 4) {
         this.field_1160 = var1.method_3012();
         this.field_1161 = var1.method_3010();
      }

      if (var5 >= 5) {
         this.field_1163 = var1.method_3012();
         this.field_1164 = var1.method_3012();
      }

      super.a(var1);
   }

   public class_103(class_112 var1) {
      super(var1);
   }

   // $FF: renamed from: c () void
   public void method_856() {
      Iterator var1 = class_39.field_126.iterator();

      while(var1.hasNext()) {
         class_39 var2 = (class_39)var1.next();
         if (!var2.field_141 && var2.field_143 == this.F && this.field_1157 > this.B.size() && var2 instanceof class_44) {
            class_44 var3 = (class_44)var2;
            if (!var3.bb && var3.field_311 == null && this.F.method_994(var3)) {
               this.a(var3);
            }
         }
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_857() {
      return this.field_1158 != null;
   }

   // $FF: renamed from: a (float) void
   public void method_855(float var1) {
      class_236 var2 = class_236.method_1549();
      this.field_1153 += var1;
      this.i();
      if (this.field_1157 <= this.B.size()) {
      }

      this.field_1154 = class_296.method_2020(this.field_1154, var1);
      this.field_1155 = class_296.method_2020(this.field_1155, var1);
      this.field_1156 = class_296.method_2020(this.field_1156, var1);
      if (!this.method_857() && !this.field_1162 && this.field_1157 > this.B.size() && this.field_1154 == 0.0F) {
         this.field_1154 = 300.0F;
         this.method_856();
      }

      Iterator var4;
      class_44 var5;
      class_10 var6;
      if (!this.method_857() && this.B.size() != 0) {
         if (!this.method_857()) {
            this.field_1151 = class_296.method_2020(this.field_1151, var1);
            if (this.field_1151 == 0.0F) {
               this.field_1151 = 4000.0F;
               if (this.field_1149 != null) {
                  PointF var3 = this.field_1149.s();
                  this.G = var3.field_2406;
                  this.H = var3.field_2407;
               }
            }
         }

         if (this.field_1155 == 0.0F) {
            this.field_1155 = 400.0F;
            class_324 var10 = var2.field_1952.method_2159(this.F);
            var4 = this.B.iterator();

            while(true) {
               while(var4.hasNext()) {
                  var5 = (class_44)var4.next();
                  if (this.c(var5) > 28900.0F && !var5.method_403()) {
                     var10.method_2184(var5);
                  } else {
                     var6 = (class_10)var5;
                     if (var6.method_20() != 0) {
                        String var7 = var5.bB();
                        class_324 var8 = var2.field_1952.method_2159(this.F);
                        var8.method_2184(var5);
                        var8.method_2198(var7);
                     }
                  }
               }

               var10.method_2186(this.G, this.H);
               break;
            }
         }

         if (this.field_1158 == null) {
            this.field_1152 = class_296.method_2020(this.field_1152, var1);
            if (this.field_1152 == 0.0F) {
               this.field_1152 = 100.0F;
               if (class_296.method_2036(0, 100) < 80) {
                  this.method_859(var1, true);
               }

               if (this.field_1158 == null) {
                  this.method_859(var1, false);
               }
            }
         }
      }

      if (this.field_1158 != null && this.field_1158.J) {
         this.field_1158 = null;
      }

      class_324 var9;
      Iterator var17;
      class_44 var21;
      if (!this.field_1162) {
         if (this.field_1158 != null) {
            ArrayList var11 = this.field_1158.field_1145;
            if (this.field_1159 != null && (this.field_1159.bi || this.field_1159.bX != null)) {
               var11.remove(this.field_1159);
               this.field_1159 = null;
            }

            if (this.field_1159 == null) {
               var4 = var11.iterator();

               label203:
               while(true) {
                  while(true) {
                     do {
                        if (!var4.hasNext()) {
                           if (this.field_1159 == null) {
                              this.field_1162 = true;
                              this.field_1155 = 0.0F;
                              this.field_1156 = 0.0F;
                              this.field_1163 = this.field_1158.G;
                              this.field_1164 = this.field_1158.H;
                           }
                           break label203;
                        }

                        var5 = (class_44)var4.next();
                     } while(var5.bX != null);

                     var17 = this.B.iterator();

                     while(var17.hasNext()) {
                        var21 = (class_44)var17.next();
                        if (var21.o(var5)) {
                           this.field_1159 = var5;
                           break;
                        }
                     }
                  }
               }
            }

            if (this.field_1159 != null) {
               Iterator var15;
               class_44 var18;
               if (this.field_1155 == 0.0F) {
                  this.field_1155 = 400.0F;
                  class_324 var13 = var2.field_1952.method_2159(this.F);
                  var15 = this.B.iterator();

                  while(var15.hasNext()) {
                     var18 = (class_44)var15.next();
                     var13.method_2184(var18);
                  }

                  var13.method_2186(this.field_1159.dh, this.field_1159.di);
               }

               if (this.field_1156 == 0.0F) {
                  this.field_1156 = 80.0F;
                  var4 = var11.iterator();

                  while(true) {
                     while(var4.hasNext()) {
                        var5 = (class_44)var4.next();
                        var17 = this.B.iterator();

                        while(var17.hasNext()) {
                           var21 = (class_44)var17.next();
                           if (var21.o(var5)) {
                              float var26 = class_296.method_2026(var21.dh, var21.di, var5.dh, var5.di);
                              if (var26 < 14400.0F) {
                                 var9 = var2.field_1952.method_2159(this.F);
                                 var9.method_2184(var5);
                                 var9.method_2196(var21);
                                 break;
                              }
                           }
                        }
                     }

                     boolean var14 = false;
                     var15 = this.B.iterator();

                     while(var15.hasNext()) {
                        var18 = (class_44)var15.next();
                        if (var18.o(this.field_1159)) {
                           var14 = true;
                        }
                     }

                     if (!var14) {
                        this.field_1159 = null;
                     }
                     break;
                  }
               }
            }
         }
      } else if (this.field_1158 == null) {
         this.method_858();
      } else {
         if (this.field_1155 == 0.0F) {
            this.field_1155 = 400.0F;
            float var12 = this.field_1158.G + class_296.method_2033(-40.0F, 40.0F);
            float var16 = this.field_1158.H + class_296.method_2033(-40.0F, 40.0F);
            if (this.field_1160 > 600.0F) {
               var12 += class_296.method_2033(-300.0F, 300.0F);
               var16 += class_296.method_2033(-300.0F, 300.0F);
            }

            if (this.field_1160 > 1200.0F) {
               var12 += class_296.method_2033(-300.0F, 300.0F);
               var16 += class_296.method_2033(-300.0F, 300.0F);
            }

            if (class_205.method_1368(var12, var16, class_503.field_4618)) {
               var12 += class_296.method_2033(-100.0F, 100.0F);
               var16 += class_296.method_2033(-100.0F, 100.0F);
            }

            if (class_205.method_1368(var12, var16, class_503.field_4618)) {
               var12 += class_296.method_2033(-200.0F, 200.0F);
               var16 += class_296.method_2033(-200.0F, 200.0F);
            }

            if (class_205.method_1368(var12, var16, class_503.field_4618)) {
               var12 += class_296.method_2033(-200.0F, 200.0F);
               var16 += class_296.method_2033(-200.0F, 200.0F);
            }

            if (class_205.method_1368(var12, var16, class_503.field_4618)) {
               this.field_1155 = 30.0F;
            } else {
               this.field_1163 = var12;
               this.field_1164 = var16;
               class_324 var19 = var2.field_1952.method_2159(this.F);
               var17 = this.B.iterator();

               while(var17.hasNext()) {
                  var21 = (class_44)var17.next();
                  class_10 var27 = (class_10)var21;
                  if (var27.method_20() != 0) {
                     float var28 = class_296.method_2026(var21.dh, var21.di, this.field_1163, this.field_1164);
                     if (var28 > 1600.0F) {
                        var19.method_2184(var21);
                     }
                  } else {
                     var9 = var2.field_1952.method_2159(this.F);
                     var9.method_2184(var21);
                     var9.method_2186(this.G, this.H);
                  }
               }

               var19.method_2186(this.field_1163, this.field_1164);
            }
         }

         if (this.field_1156 == 0.0F) {
            this.field_1156 = 100.0F;
            Iterator var22 = this.B.iterator();

            while(var22.hasNext()) {
               class_44 var29 = (class_44)var22.next();
               float var20 = class_296.method_2026(var29.dh, var29.di, this.field_1163, this.field_1164);
               if (var20 < 6400.0F) {
                  this.field_1161 = true;
                  String var24 = var29.bB();
                  class_324 var25 = var2.field_1952.method_2159(this.F);
                  var25.method_2184(var29);
                  var25.method_2198(var24);
               }
            }
         }

         if (this.field_1161) {
            this.field_1158.method_851();
            this.field_1160 += var1;
         }

         boolean var23 = false;
         var4 = this.B.iterator();

         while(var4.hasNext()) {
            var5 = (class_44)var4.next();
            if (!var5.bi) {
               var6 = (class_10)var5;
               if (var6.method_20() != 0) {
                  var23 = true;
               }
            }
         }

         if (!var23 || this.field_1160 > 1700.0F) {
            this.method_858();
         }
      }

      if (this.field_1153 > 1500.0F && this.B.size() == 0) {
         this.k();
      }

   }

   // $FF: renamed from: e () void
   public void method_858() {
      this.field_1162 = false;
      this.field_1158 = null;
      this.field_1160 = 0.0F;
      this.field_1155 = 0.0F;
      this.field_1156 = 0.0F;
      this.field_1161 = false;
      this.method_861();
   }

   // $FF: renamed from: a (float, boolean) void
   public void method_859(float var1, boolean var2) {
      Iterator var3 = this.F.field_1300.iterator();

      class_102 var5;
      do {
         class_100 var4;
         do {
            do {
               do {
                  if (!var3.hasNext()) {
                     return;
                  }

                  var4 = (class_100)var3.next();
               } while(!(var4 instanceof class_102));
            } while(var4 instanceof class_103);
         } while(var2 && !(var4 instanceof class_105));

         var5 = (class_102)var4;
      } while(var5.field_1145.size() == 0 || var5.method_849());

      this.field_1158 = var5;
      this.field_1159 = null;
   }

   // $FF: renamed from: a (boolean) com.corrodinggames.rts.game.a.h
   public class_106 method_860(boolean var1) {
      class_106 var2 = null;
      Iterator var3 = this.F.field_1300.iterator();

      while(true) {
         class_106 var5;
         do {
            class_100 var4;
            do {
               if (!var3.hasNext()) {
                  return var2;
               }

               var4 = (class_100)var3.next();
            } while(!(var4 instanceof class_106));

            var5 = (class_106)var4;
         } while(var5.field_1208 && var1);

         if (var5.field_1194 == class_143.field_1379) {
            var2 = var5;
            if (class_296.method_2035(3) == 0) {
               return var5;
            }
         }
      }
   }

   // $FF: renamed from: f () void
   public void method_861() {
      boolean var1 = true;
      PointF var2 = null;
      if (var1) {
         this.field_1149 = this.method_860(true);
         if (this.field_1149 == null) {
            this.field_1149 = this.method_860(false);
         }

         if (this.field_1149 != null) {
            var2 = this.field_1149.s();
         }
      }

      if (var2 == null) {
         var2 = this.F.method_979();
         this.field_1149 = null;
      }

      this.G = var2.field_2406;
      this.H = var2.field_2407;
   }
}
