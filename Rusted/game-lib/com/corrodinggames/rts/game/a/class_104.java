package com.corrodinggames.rts.game.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.f.class_67;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.a.f
public class class_104 extends class_102 {
   // $FF: renamed from: a boolean
   boolean field_1165;
   // $FF: renamed from: b boolean
   boolean field_1166;
   // $FF: renamed from: c boolean
   boolean field_1167;
   // $FF: renamed from: d boolean
   boolean field_1168;
   // $FF: renamed from: e boolean
   boolean field_1169;
   // $FF: renamed from: f com.corrodinggames.rts.game.units.p
   class_44 field_1170;
   // $FF: renamed from: g boolean
   boolean field_1171;
   // $FF: renamed from: h int
   int field_1172;
   // $FF: renamed from: i int
   int field_1173;
   // $FF: renamed from: j com.corrodinggames.rts.game.a.h
   class_106 field_1174;
   // $FF: renamed from: k float
   float field_1175;
   // $FF: renamed from: l float
   float field_1176;
   // $FF: renamed from: m float
   float field_1177;
   // $FF: renamed from: n float
   float field_1178;
   // $FF: renamed from: o float
   float field_1179;
   // $FF: renamed from: p boolean
   boolean field_1180;
   // $FF: renamed from: q boolean
   boolean field_1181;
   // $FF: renamed from: r boolean
   boolean field_1182;
   // $FF: renamed from: s float
   float field_1183;
   // $FF: renamed from: t float
   float field_1184;
   // $FF: renamed from: u boolean
   boolean field_1185;
   // $FF: renamed from: v com.corrodinggames.rts.game.units.aa
   class_39 field_1186;
   // $FF: renamed from: w float
   float field_1187;
   // $FF: renamed from: x float
   float field_1188;
   // $FF: renamed from: y float
   float field_1189;
   // $FF: renamed from: z int
   int field_1190;
   // $FF: renamed from: A boolean
   boolean field_1191;

   // $FF: renamed from: a () boolean
   public boolean method_847() {
      return this.field_1165;
   }

   // $FF: renamed from: b () boolean
   public boolean method_848() {
      return !this.field_1171;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.a.a, com.corrodinggames.rts.game.units.p) com.corrodinggames.rts.game.a.f
   public static class_104 method_862(class_112 var0, class_44 var1) {
      class_104 var2 = new class_104(var0, false);
      var2.field_1165 = true;
      var2.field_1166 = true;
      var2.field_1167 = true;
      var2.field_1168 = true;
      var2.field_1170 = var1;
      var2.a(var1);
      var2.field_1190 = 0;
      var2.method_871();
      return var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2540(this.field_1171);
      var1.method_2541(this.field_1172);
      var1.method_2541(this.field_1173);
      int var2 = this.B.size();
      var1.method_2541(var2);
      Iterator var3 = this.B.iterator();

      class_44 var4;
      while(var3.hasNext()) {
         var4 = (class_44)var3.next();
         var1.method_2551(var4);
      }

      var1.method_2539(7);
      var1.method_2540(false);
      var1.method_2540(this.field_1182);
      var1.method_2542(this.field_1178);
      var1.method_2541(this.C.size());
      var3 = this.C.iterator();

      while(var3.hasNext()) {
         var4 = (class_44)var3.next();
         var1.method_2551(var4);
      }

      var1.method_2540(this.field_1191);
      var1.method_2540(this.field_1165);
      var1.method_2540(this.field_1166);
      var1.method_2540(this.field_1167);
      var1.method_2540(this.field_1168);
      var1.method_2540(this.field_1169);
      var1.method_2551(this.field_1170);
      var1.method_2541(this.field_1190);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_836(class_463 var1) {
      this.field_1171 = var1.method_3010();
      this.field_1172 = var1.method_3011();
      this.field_1173 = var1.method_3011();
      this.l();
      int var2 = var1.method_3011();

      for(int var3 = 0; var3 < var2; ++var3) {
         class_44 var4 = var1.method_3021();
         if (var4 != null) {
            this.a(var4);
         }
      }

      byte var7 = var1.method_3009();
      if (var7 >= 1) {
         var1.method_3010();
      }

      if (var7 >= 2) {
         this.field_1182 = var1.method_3010();
      }

      if (var7 >= 3) {
         this.field_1178 = var1.method_3012();
      }

      if (var7 >= 4) {
         this.C.clear();
         int var8 = var1.method_3011();

         for(int var5 = 0; var5 < var8; ++var5) {
            class_44 var6 = var1.method_3021();
            if (var6 != null) {
               this.C.add(var6);
            }
         }
      }

      if (var7 >= 5) {
         this.field_1191 = var1.method_3010();
      }

      if (var7 >= 6) {
         this.field_1165 = var1.method_3010();
         this.field_1166 = var1.method_3010();
         this.field_1167 = var1.method_3010();
         this.field_1168 = var1.method_3010();
         this.field_1169 = var1.method_3010();
         this.field_1170 = var1.method_3021();
      }

      if (var7 >= 7) {
         this.field_1190 = var1.method_3011();
      }

      if (!this.field_1191) {
         Iterator var9 = this.B.iterator();

         while(var9.hasNext()) {
            class_44 var10 = (class_44)var9.next();
            if (var10 instanceof class_67) {
               if (var10 != null && var10.field_311 == this) {
                  var10.field_311 = null;
               }

               if (var10 != null) {
                  this.C.remove(var10);
               }

               var9.remove();
            }
         }
      }

      super.a(var1);
   }

   public class_104(class_112 var1) {
      super(var1);
      this.field_1171 = true;
      this.field_1175 = 1000.0F;
      this.field_1176 = 100.0F;
      this.field_1177 = 4000.0F;
      this.field_1178 = 0.0F;
      this.field_1179 = 1000.0F;
      this.field_1180 = false;
      this.field_1181 = false;
      this.field_1182 = false;
      this.field_1183 = 0.0F;
      this.field_1184 = 0.0F;
   }

   public class_104(class_112 var1, boolean var2) {
      this(var1);
      this.field_1171 = var2;
   }

   // $FF: renamed from: c () void
   public void method_863() {
      Iterator var1 = class_39.field_126.iterator();

      while(true) {
         class_44 var3;
         do {
            while(true) {
               class_39 var2;
               do {
                  do {
                     do {
                        do {
                           do {
                              do {
                                 do {
                                    if (!var1.hasNext()) {
                                       return;
                                    }

                                    var2 = (class_39)var1.next();
                                 } while(var2.field_141);
                              } while(var2.field_143 != this.F);
                           } while(this.field_1190 <= this.B.size());
                        } while(!(var2 instanceof class_44));

                        var3 = (class_44)var2;
                     } while(var3.ba);
                  } while(var3.field_311 != null);
               } while(!this.F.method_995(var3));

               if (this.field_1191) {
                  if (var2.method_279() == class_503.field_4618) {
                     continue;
                  }
               } else if (var2.method_279() == class_503.field_4621) {
                  continue;
               }
               break;
            }
         } while(!this.F.method_972(var3, this.G, this.H) && (this.method_848() || class_296.method_2036(0, 100) > 2));

         this.a(var3);
      }
   }

   // $FF: renamed from: d () boolean
   public boolean method_864() {
      return this.field_1190 <= this.B.size();
   }

   // $FF: renamed from: a (float) void
   public void method_855(float var1) {
      class_236 var2 = class_236.method_1549();
      this.field_1187 += var1;
      this.i();
      if (this.method_864()) {
         this.field_1175 = class_296.method_2020(this.field_1175, var1);
      }

      this.field_1188 = class_296.method_2020(this.field_1188, var1);
      this.field_1189 = class_296.method_2020(this.field_1189, var1);
      this.field_1179 = class_296.method_2020(this.field_1179, var1);
      if (!this.field_1185 && !this.field_1181 && !this.method_864() && this.field_1188 == 0.0F) {
         this.field_1188 = (float)(200 + class_296.method_2035(200));
         this.method_863();
      }

      if (!this.field_1185 || this.field_1180) {
         if (!this.field_1180) {
            this.field_1177 = class_296.method_2020(this.field_1177, var1);
            if (this.field_1177 == 0.0F && this.field_1174 != null) {
               PointF var3 = this.field_1174.s();
               if (!this.method_868(var3.field_2406, var3.field_2407)) {
                  this.field_1177 = 100.0F;
               } else {
                  this.field_1177 = 4000.0F;
                  this.G = var3.field_2406;
                  this.H = var3.field_2407;
               }
            }
         }

         if (this.field_1189 == 0.0F) {
            this.field_1189 = 800.0F;
            class_324 var7 = var2.field_1952.method_2159(this.F);
            Iterator var4 = this.B.iterator();

            while(var4.hasNext()) {
               class_44 var5 = (class_44)var4.next();
               boolean var6 = true;
               if (this.c(var5) < 28900.0F) {
                  var6 = false;
               }

               if (!this.field_1169 && var5.method_283() && !var5.method_399()) {
                  var6 = false;
               }

               if (var6) {
                  var7.method_2184(var5);
               }
            }

            if (this.field_1169) {
               var7.method_2186(this.G, this.H);
            } else {
               var7.method_2187(this.G, this.H);
            }
         }
      }

      if (this.field_1171) {
         this.method_866(var1);
      } else {
         this.method_865(var1);
      }

      if (this.field_1190 == 0 && this.B.size() == 0) {
         this.k();
      }

      if (this.field_1166 && (this.field_1170 == null || this.field_1170.bi)) {
         this.k();
      }

   }

   // $FF: renamed from: b (float) void
   public void method_865(float var1) {
      if (this.field_1174 == null || this.field_1174.J) {
         this.method_871();
      }

      if (this.field_1166 && this.field_1170 != null) {
         if (!this.field_1169) {
            if ((double)(this.field_1170.bI / this.field_1170.bJ) < 0.35D) {
               this.field_1169 = true;
               if (this.field_1189 > 100.0F) {
                  this.field_1189 = 100.0F;
               }
            }

            if (this.field_1186 == null) {
               this.method_871();
            }
         } else {
            if ((double)(this.field_1170.bI / this.field_1170.bJ) > 0.5D) {
               this.field_1169 = false;
            }

            boolean var2 = false;
            if (this.field_1174 != null && !this.field_1174.field_1209) {
               var2 = true;
            }

            if (!var2) {
               boolean var3 = true;
               class_106 var4 = this.F.method_986(this.field_1170.h(), this.field_1170.dh, this.field_1170.di, var3);
               if (var4 != null) {
                  this.field_1174 = var4;
               }

               if (this.field_1174 != null) {
                  PointF var5 = this.field_1174.s();
                  this.G = var5.field_2406;
                  this.H = var5.field_2407;
                  if (this.field_1189 > 100.0F) {
                     this.field_1189 = 100.0F;
                  }
               }
            }
         }
      }

      if (this.field_1174 != null) {
         for(int var6 = 0; var6 < 2; ++var6) {
            if (this.field_1179 == 0.0F) {
               class_39 var7 = this.field_1174.method_882();
               if (var7 == null) {
                  break;
               }

               if (this.method_870(var7.dh, var7.di)) {
                  this.field_1186 = var7;
                  this.field_1179 = 500.0F;
                  this.field_1177 = 2000.0F;
                  if (!this.field_1169) {
                     this.G = var7.dh;
                     this.H = var7.di;
                  }

                  if (this.field_1189 > 100.0F) {
                     this.field_1189 = 100.0F;
                  }
               }
            }
         }

         if (this.field_1179 == 0.0F) {
            this.field_1169 = false;
            this.field_1186 = null;
         }
      }

   }

   // $FF: renamed from: c (float) void
   public void method_866(float var1) {
      class_236 var2 = class_236.method_1549();
      if (!this.field_1185) {
         if (this.field_1175 == 0.0F) {
            this.field_1185 = true;
            this.field_1180 = true;
         }
      } else {
         if (this.field_1186 == null || !this.field_1186.method_228() || this.field_1186.field_141 || !this.field_1181) {
            this.field_1186 = this.F.method_1007();
         }

         if (this.field_1186 != null) {
            Iterator var4;
            class_44 var5;
            if (this.field_1180) {
               this.field_1184 += var1;
               if (!this.field_1181) {
                  this.field_1183 = class_296.method_2020(this.field_1183, var1);
                  if (this.field_1183 == 0.0F) {
                     this.field_1183 = 20.0F;
                     this.method_867();
                  }
               } else {
                  boolean var3 = false;
                  var4 = this.B.iterator();

                  while(var4.hasNext()) {
                     var5 = (class_44)var4.next();
                     if (this.c(var5) > 28900.0F) {
                        var3 = true;
                     }
                  }

                  if (!var3) {
                     this.field_1180 = false;
                  }

                  var4 = this.B.iterator();

                  while(var4.hasNext()) {
                     var5 = (class_44)var4.next();
                     if (var5.aN > var2.field_1921 - 1000) {
                        this.field_1180 = false;
                     }
                  }
               }

               if (this.field_1184 > 17000.0F) {
                  this.field_1180 = false;
               }
            } else {
               this.field_1178 += var1;
               if (this.field_1189 == 0.0F) {
                  this.field_1189 = 800.0F;
                  class_324 var6 = var2.field_1952.method_2159(this.F);
                  var4 = this.B.iterator();

                  while(var4.hasNext()) {
                     var5 = (class_44)var4.next();
                     var6.method_2184(var5);
                  }

                  boolean var7 = true;
                  if (this.field_1186 != null && class_296.method_2036(0, 100) < 80) {
                     var6.method_2189(this.field_1186.dh, this.field_1186.di, var7);
                  } else {
                     var6.method_2190(this.field_1186, var7);
                  }
               }
            }
         }
      }

      if (this.field_1185) {
         if (this.B.size() == 0) {
            this.k();
         }

         if (this.field_1178 > 1000.0F && this.B.size() < 3) {
            this.k();
         }

         if (this.field_1178 > 11000.0F) {
            this.k();
         }
      }

   }

   // $FF: renamed from: e () void
   public void method_867() {
      float var1 = this.field_1186.dh;
      float var2 = this.field_1186.di;
      float var3 = class_296.method_2031(var1, var2, this.G, this.H);
      float var4 = class_296.method_2027(var1, var2, this.G, this.H);
      if (class_296.method_2036(0, 100) < 80) {
         var3 += (float)class_296.method_2036(-110, 110);
      }

      int var5 = (int)((double)var4 * 0.6D);
      if (var5 < 720) {
         var5 = 720;
      }

      float var6 = (float)class_296.method_2036(50, var5);
      if (class_296.method_2036(0, 100) < 80 && var6 < 450.0F) {
         var6 = (float)class_296.method_2036(450, var5);
      }

      var1 += class_296.method_2099(var3) * var6;
      var2 += class_296.method_2098(var3) * var6;
      boolean var7 = true;
      if (!this.method_868(var1, var2)) {
         var7 = false;
      }

      boolean var8 = false;
      boolean var9 = false;
      Iterator var10 = this.B.iterator();

      class_44 var11;
      while(var10.hasNext()) {
         var11 = (class_44)var10.next();
         if (var11.h() == class_503.field_4618) {
            var8 = true;
         }

         if (var11.h() == class_503.field_4621) {
            var9 = true;
         }
      }

      if (var8) {
         if (this.F.field_1271 == 0 && !this.method_869(var1, var2)) {
            var7 = false;
         }

         if (!this.F.method_971(var1, var2, this.field_1186.dh, this.field_1186.di, class_503.field_4618) && class_296.method_2036(0, 100) < 98) {
            var7 = false;
         }
      }

      if (var9) {
         if (!this.method_869(var1, var2)) {
            var7 = false;
         }

         if (!this.F.method_971(var1, var2, this.field_1186.dh, this.field_1186.di, class_503.field_4621)) {
            var7 = false;
         }
      }

      if (var7) {
         this.G = var1;
         this.H = var2;
         this.field_1189 = 0.0F;
         this.field_1181 = true;
         this.C.clear();
         var10 = this.B.iterator();

         while(var10.hasNext()) {
            var11 = (class_44)var10.next();
            if (var11.h() != class_503.field_4621 && !this.F.method_972(var11, this.G, this.H)) {
               this.C.add(var11);
            }
         }
      }

   }

   // $FF: renamed from: a (float, float) boolean
   public boolean method_868(float var1, float var2) {
      if (this.field_1191) {
         return !class_205.method_1368(var1, var2, class_503.field_4621);
      } else {
         return !class_205.method_1368(var1, var2, class_503.field_4618);
      }
   }

   // $FF: renamed from: b (float, float) boolean
   public boolean method_869(float var1, float var2) {
      Iterator var3 = this.B.iterator();

      class_44 var4;
      do {
         if (!var3.hasNext()) {
            return true;
         }

         var4 = (class_44)var3.next();
      } while(this.F.method_972(var4, var1, var2));

      return false;
   }

   // $FF: renamed from: c (float, float) boolean
   public boolean method_870(float var1, float var2) {
      Iterator var3 = this.B.iterator();

      class_44 var4;
      do {
         if (!var3.hasNext()) {
            return false;
         }

         var4 = (class_44)var3.next();
      } while(!this.F.method_972(var4, var1, var2));

      return true;
   }

   // $FF: renamed from: f () void
   public void method_871() {
      boolean var1 = true;
      PointF var2 = null;
      if (this.field_1166 && this.field_1170 != null) {
         this.G = this.field_1170.dh;
         this.H = this.field_1170.di;
         this.field_1174 = this.F.method_985(this.field_1170.dh, this.field_1170.di);
      } else {
         if (var1) {
            label80:
            for(int var3 = 0; var3 < 7; ++var3) {
               boolean var4 = var3 > 3;
               if (var2 == null) {
                  Iterator var5 = this.F.field_1300.iterator();

                  while(true) {
                     class_106 var7;
                     do {
                        do {
                           do {
                              class_100 var6;
                              do {
                                 if (!var5.hasNext()) {
                                    continue label80;
                                 }

                                 var6 = (class_100)var5.next();
                              } while(!(var6 instanceof class_106));

                              var7 = (class_106)var6;
                           } while(var7.field_1194 != class_143.field_1379);
                        } while(var7.method_905() <= 2 && !var4);
                     } while(var2 != null && class_296.method_2035(this.F.field_1263 + 2) != 0);

                     for(int var8 = 0; var8 < 10; ++var8) {
                        if (var2 == null) {
                           PointF var9 = var7.s();
                           if (this.method_868(var9.field_2406, var9.field_2407)) {
                              var2 = var9;
                           }
                        }
                     }

                     this.field_1174 = var7;
                  }
               }
            }
         }

         if (var2 == null) {
            var2 = this.F.method_979();
            this.field_1174 = null;
         }

         this.G = var2.field_2406;
         this.H = var2.field_2407;
      }
   }
}
