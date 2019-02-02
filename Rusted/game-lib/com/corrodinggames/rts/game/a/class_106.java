package com.corrodinggames.rts.game.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.b.class_416;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.game.units.d.class_55;
import com.corrodinggames.rts.game.units.d.class_8;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.a.h
public class class_106 extends class_100 {
   // $FF: renamed from: a float
   float field_1193;
   // $FF: renamed from: b com.corrodinggames.rts.game.a.i
   class_143 field_1194;
   // $FF: renamed from: c com.corrodinggames.rts.game.a.j
   class_147 field_1195;
   // $FF: renamed from: d float
   float field_1196 = -1.0F;
   // $FF: renamed from: e float
   float field_1197;
   // $FF: renamed from: f float
   float field_1198;
   // $FF: renamed from: g float
   float field_1199 = 100.0F;
   // $FF: renamed from: h float
   float field_1200 = 50.0F;
   // $FF: renamed from: i float
   float field_1201 = 50.0F;
   // $FF: renamed from: j float
   float field_1202;
   // $FF: renamed from: k float
   float field_1203;
   // $FF: renamed from: l float
   float field_1204;
   // $FF: renamed from: m boolean
   boolean field_1205;
   // $FF: renamed from: n boolean
   boolean field_1206;
   // $FF: renamed from: o java.util.ArrayList
   ArrayList field_1207 = new ArrayList();
   // $FF: renamed from: p boolean
   boolean field_1208;
   // $FF: renamed from: q boolean
   boolean field_1209;
   // $FF: renamed from: r float
   float field_1210 = 0.0F;
   // $FF: renamed from: s android.graphics.PointF
   PointF field_1211 = new PointF();
   // $FF: renamed from: t android.graphics.PointF
   PointF field_1212 = new PointF();
   // $FF: renamed from: u int
   int field_1213;
   // $FF: renamed from: v com.corrodinggames.rts.game.units.ap
   class_24 field_1214;
   // $FF: renamed from: w int
   int field_1215;
   // $FF: renamed from: x int
   int field_1216;
   // $FF: renamed from: y java.lang.String
   String field_1217;
   // $FF: renamed from: z int
   int field_1218;
   // $FF: renamed from: A int
   int field_1219;
   // $FF: renamed from: B boolean
   boolean field_1220 = false;
   // $FF: renamed from: C int
   int field_1221;
   // $FF: renamed from: D java.util.ArrayList
   ArrayList field_1222 = new ArrayList();

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2553(this.field_1194);
      var1.method_2553(this.field_1195);
      var1.method_2542(this.field_1196);
      var1.method_2542(this.field_1197);
      var1.method_2542(this.field_1198);
      var1.method_2542(this.field_1199);
      var1.method_2542(this.field_1200);
      var1.method_2542(this.field_1201);
      var1.method_2542(this.field_1202);
      var1.method_2542(this.field_1203);
      var1.method_2539(3);
      var1.method_2542(this.field_1210);
      var1.method_2542(this.field_1204);
      var1.method_2540(this.field_1205);
      var1.method_2540(this.field_1206);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_836(class_463 var1) {
      this.field_1194 = (class_143)var1.method_3022(i.class);
      this.field_1195 = (class_147)var1.method_3022(j.class);
      this.field_1196 = var1.method_3012();
      this.field_1197 = var1.method_3012();
      this.field_1198 = var1.method_3012();
      this.field_1199 = var1.method_3012();
      this.field_1200 = var1.method_3012();
      this.field_1201 = var1.method_3012();
      this.field_1202 = var1.method_3012();
      this.field_1203 = var1.method_3012();
      byte var2 = var1.method_3009();
      if (var2 >= 1) {
         this.field_1210 = var1.method_3012();
      }

      if (var2 >= 2) {
         this.field_1204 = var1.method_3012();
      }

      if (var2 >= 3) {
         this.field_1205 = var1.method_3010();
         this.field_1206 = var1.method_3010();
      }

      super.method_836(var1);
   }

   public class_106(class_112 var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   // $FF: renamed from: a () android.graphics.PointF
   public PointF method_873() {
      class_236 var1 = class_236.method_1549();
      PointF var2 = null;
      int var3 = (int)(this.I * var1.field_1932.field_3334);
      var1.field_1932.method_2578(this.G, this.H);
      int var4 = var1.field_1932.field_3355;
      int var5 = var1.field_1932.field_3356;

      for(int var6 = var4 - var3; var6 <= var4 + var3; ++var6) {
         for(int var7 = var5 - var3; var7 <= var5 + var3; ++var7) {
            if (var1.field_1932.method_2584(var6, var7)) {
               class_416 var8 = var1.field_1932.method_2587(var6, var7);
               if (var8 != null && var8.field_3428) {
                  class_39 var9 = class_47.method_513(var6, var7);
                  boolean var10 = false;
                  if (var9 == null) {
                     var10 = true;
                  }

                  if (var9 != null && var9 instanceof class_44) {
                     class_44 var11 = (class_44)var9;
                     if (!var11.o().method_138()) {
                        var10 = true;
                     }
                  }

                  if (var10) {
                     var1.field_1932.method_2579(var6, var7);
                     if (var2 == null || class_296.method_2036(0, 100) < 50) {
                        this.field_1211.method_1960((float)(var1.field_1932.field_3355 + var1.field_1932.field_3332), (float)(var1.field_1932.field_3356 + var1.field_1932.field_3333));
                        var2 = this.field_1211;
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: b () void
   public void method_874() {
      this.field_1207.clear();
      class_39[] var1 = class_39.field_126.method_1326();
      int var2 = 0;

      for(int var3 = class_39.field_126.size(); var2 < var3; ++var2) {
         class_39 var4 = var1[var2];
         if (var4.field_143 == this.F && !var4.field_141 && !var4.method_318() && this.method_885(var4)) {
            class_24 var5 = var4.field_216;
            if (!this.field_1207.contains(var5)) {
               this.field_1207.add(var5);
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) boolean
   public boolean method_875(class_24 var1) {
      class_236 var2 = class_236.method_1549();
      if ((!var2.field_1885 || var1.method_126()) && !var1.method_127()) {
         Iterator var3 = this.field_1207.iterator();

         class_39 var5;
         do {
            if (!var3.hasNext()) {
               return false;
            }

            class_24 var4 = (class_24)var3.next();
            var5 = class_39.method_216(var4);
         } while(!(var5 instanceof class_44) || !((class_44)var5).method_390(var1));

         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: c () com.corrodinggames.rts.game.units.ap
   public class_24 method_876() {
      class_236 var1 = class_236.method_1549();
      int var2 = this.method_877(this.F.field_1311);
      class_24 var3 = null;
      float var4 = -1.0F;
      Iterator var5 = class_469.field_4085.iterator();

      while(true) {
         class_24 var6;
         float var12;
         do {
            do {
               do {
                  do {
                     if (!var5.hasNext()) {
                        this.field_1198 = var4;
                        return var3;
                     }

                     var6 = (class_24)var5.next();
                  } while(!var6.method_134());
               } while(!this.method_875(var6));

               int var7 = this.F.method_991(var6, class_142.field_1374);
               int var8 = this.method_878(var6);
               if (var6 instanceof class_479) {
                  class_479 var9 = (class_479)var6;
                  class_24 var11;
                  if (var9.field_4403.size() != 0) {
                     for(Iterator var10 = var9.field_4403.iterator(); var10.hasNext(); var8 += this.method_878(var11)) {
                        var11 = (class_24)var10.next();
                        var7 += this.F.method_991(var11, class_142.field_1374);
                     }
                  }
               }

               var12 = -2.0F;
               if (var6.method_138() && this.method_873() != null && class_296.method_2036(0, 100) < 90) {
                  if (var8 == 0) {
                     if (this.F.f < 5000) {
                        var12 = 0.98F;
                     } else {
                        var12 = 0.58F;
                     }
                  }

                  if (var8 == 1) {
                     var12 = 0.55F;
                  }

                  if (var8 == 2) {
                     var12 = 0.4F;
                  }

                  if (var8 >= 3) {
                     var12 = 0.25F / (float)var8;
                  }

                  if (var7 >= 3) {
                     var12 = (float)((double)var12 * 0.6D);
                  }
               }

               if (var6 == class_469.field_4034 && (var7 < 5 || var2 == 0)) {
                  if (var7 == 0) {
                     var12 = 0.8F;
                  } else if (var8 < 2) {
                     var12 = 0.46F / (float)(var7 + var8 * 2);
                  }
               }

               if (var6 == class_469.field_4036 && this.F.method_967() && (var7 < 5 || var2 == 0)) {
                  if (var7 == 0) {
                     var12 = 0.3F;
                  } else if (var8 < 1) {
                     var12 = 0.1F / (float)(var7 + var8 * 2);
                  }
               }

               if (var6 == class_469.field_4035 && (var7 < 5 || var2 == 0)) {
                  if (var7 == 0) {
                     var12 = 0.48F;
                  } else if (var8 < 2) {
                     var12 = 0.29F / (float)(var7 + var8);
                  }
               }

               if (var6 == class_469.field_4038) {
                  if (var8 == 0) {
                     var12 = 0.47F;
                  } else if (var8 < 3) {
                     var12 = 0.35F / (float)var8;
                  } else if (var8 < 4) {
                     var12 = 0.025F / (float)var8;
                  }
               }

               if (var6 == class_469.field_4057 && var8 == 0) {
                  var12 = 0.018F;
               }

               if (var6 == class_469.field_4060 && var8 == 0) {
                  var12 = 0.02F;
               }

               if (var6 == class_469.field_4039) {
                  if (var8 == 0) {
                     var12 = 0.42F;
                  } else if (this.F.method_965()) {
                     if (var8 < 4) {
                        var12 = 0.3F / (float)var8;
                     }
                  } else if (var8 < 3) {
                     var12 = 0.3F / (float)var8;
                  } else if (var8 < 4) {
                     var12 = 0.02F / (float)var8;
                  }
               }

               if (var6 == class_469.field_4068 && this.F.f > 2000 && var8 < 6) {
                  if (var7 == 0) {
                     var12 = 0.11F;
                  } else {
                     var12 = 0.07F / (0.2F * (float)var7 + (float)var8);
                  }
               }

               if (var6 == class_469.field_4062 && (!var1.method_1656() || !var1.field_1944.field_3863.field_3783) && this.F.f > 2200 && var7 < 4) {
                  if (var7 == 0) {
                     var12 = 0.06F;
                  } else if (var8 < 1) {
                     var12 = 0.05F / (float)(var7 + var8 * 2);
                  }
               }

               if (var6 instanceof class_479) {
                  class_479 var13 = (class_479)var6;
                  if (!var13.field_4395 && (var7 < var13.field_4396 || var13.field_4396 == -1) && (var8 < var13.field_4397 || var13.field_4397 == -1)) {
                     var12 = var13.field_4398;
                     if (var8 == 0) {
                        var12 += var13.field_4399;
                     }

                     if (var7 == 0) {
                        var12 += var13.field_4400;
                     }

                     if (var6.method_138() && this.method_873() == null) {
                        var12 = -2.0F;
                     }
                  }
               }

               if (this.F.method_965() && var6 == class_469.field_4065 && this.F.f > 15000 && var7 == 0) {
                  var12 = 0.04F;
               }
            } while(var12 < 0.0F);
         } while(var12 <= var4 && (double)class_296.method_2033(0.0F, 1.0F) >= 0.01D);

         var4 = var12;
         var3 = var6;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.a.d) int
   public int method_877(class_150 var1) {
      int var2 = 0;

      class_149 var4;
      for(Iterator var3 = var1.field_1398.iterator(); var3.hasNext(); var2 += this.method_878(var4.field_1394)) {
         var4 = (class_149)var3.next();
      }

      return var2;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ap) int
   public int method_878(class_24 var1) {
      int var2 = 0;
      class_39[] var3 = class_39.field_126.method_1326();
      int var4 = 0;

      for(int var5 = class_39.field_126.size(); var4 < var5; ++var4) {
         class_39 var6 = var3[var4];
         if (var6.field_143 == this.F && var6.field_216 == var1 && this.method_885(var6)) {
            ++var2;
         }
      }

      return var2;
   }

   // $FF: renamed from: d () int
   public int method_879() {
      int var1 = 0;
      class_39[] var2 = class_39.field_126.method_1326();
      int var3 = 0;

      for(int var4 = class_39.field_126.size(); var3 < var4; ++var3) {
         class_39 var5 = var2[var3];
         if (var5.field_143 == this.F && var5 instanceof class_44) {
            class_44 var6 = (class_44)var5;
            if (this.method_887(var6, false) && !var6.ba && var6.field_311 == null && this.F.method_995(var6)) {
               ++var1;
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: e () int
   public int method_880() {
      int var1 = 0;
      class_39[] var2 = class_39.field_126.method_1326();
      int var3 = 0;

      for(int var4 = class_39.field_126.size(); var3 < var4; ++var3) {
         class_39 var5 = var2[var3];
         if (var5.field_143 == this.F && this.b(var5) && var5.method_228()) {
            if (var5.method_283()) {
               ++var1;
            }

            if (var5 instanceof class_8) {
               class_8 var6 = (class_8)var5;
               var1 += var6.method_11(class_469.field_4040);
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: f () boolean
   public boolean method_881() {
      int var1 = this.method_883();
      return var1 != 0;
   }

   // $FF: renamed from: g () com.corrodinggames.rts.game.units.aa
   public class_39 method_882() {
      float var1 = this.I + 120.0F;
      class_39[] var2 = class_39.field_126.method_1326();
      int var3 = 0;

      for(int var4 = class_39.field_126.size(); var3 < var4; ++var3) {
         class_39 var5 = var2[var3];
         if (var5.dh + var1 > this.G && var5.dh - var1 < this.G && var5.di + var1 > this.H && var5.di - var1 < this.H && var5.field_143 != this.F && this.a(var5, 120.0F) && var5.field_143.method_943(this.F)) {
            return var5;
         }
      }

      return null;
   }

   // $FF: renamed from: h () int
   public int method_883() {
      int var1 = 0;
      float var2 = this.I + 60.0F;
      class_39[] var3 = class_39.field_126.method_1326();
      int var4 = 0;

      for(int var5 = class_39.field_126.size(); var4 < var5; ++var4) {
         class_39 var6 = var3[var4];
         if (var6.dh + var2 > this.G && var6.dh - var2 < this.G && var6.di + var2 > this.H && var6.di - var2 < this.H && var6.field_143 != this.F && this.a(var6, 60.0F) && var6.field_143.method_943(this.F) && var6.method_312()) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: renamed from: i () void
   public void method_884() {
      class_236 var1 = class_236.method_1549();
      class_39 var2 = this.method_882();
      if (var2 != null) {
         class_324 var3 = var1.field_1952.method_2159(this.F);
         class_39[] var4 = class_39.field_126.method_1326();
         int var5 = 0;

         for(int var6 = class_39.field_126.size(); var5 < var6; ++var5) {
            class_39 var7 = var4[var5];
            if (var7 instanceof class_44) {
               class_44 var8 = (class_44)var7;
               if (var7.field_143 == this.F && this.F.method_996(var7, var2) && var8.method_399()) {
                  if (!var7.field_133) {
                     if (class_112.method_987(var7, this.G, this.H, 800.0F)) {
                        var3.method_2184(var8);
                     }
                  } else if (class_112.method_987(var7, this.G, this.H, 540.0F)) {
                     var3.method_2184(var8);
                  }
               }
            }
         }

         var3.method_2188(var2);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_885(class_39 var1) {
      return this.method_886(var1, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_886(class_39 var1, boolean var2) {
      return var1 instanceof class_44 && ((class_44)var1).field_312 == this && (!var2 || this.b(var1));
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, boolean) boolean
   public boolean method_887(class_44 var1, boolean var2) {
      return var1.field_312 == this && (!var2 || this.b(var1));
   }

   // $FF: renamed from: j () int
   public int method_888() {
      int var1 = 0;
      class_39[] var2 = class_39.field_126.method_1326();
      int var3 = 0;

      for(int var4 = class_39.field_126.size(); var3 < var4; ++var3) {
         class_39 var5 = var2[var3];
         if (var5.field_143 == this.F && var5 instanceof class_44 && this.method_887((class_44)var5, false) && var5.method_212()) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: renamed from: l () int
   public int method_889() {
      int var1 = 0;
      class_39[] var2 = class_39.field_126.method_1326();
      int var3 = 0;

      for(int var4 = class_39.field_126.size(); var3 < var4; ++var3) {
         class_39 var5 = var2[var3];
         if (this.F != var5.field_143 && var5.field_143.method_943(this.F) && var5 instanceof class_44 && this.b(var5)) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: renamed from: t () com.corrodinggames.rts.game.units.p
   private class_44 method_890() {
      return this.method_893((class_24)null, (PointF)null, true);
   }

   // $FF: renamed from: u () com.corrodinggames.rts.game.units.p
   private class_44 method_891() {
      return this.method_892((class_24)null);
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.ap) com.corrodinggames.rts.game.units.p
   private class_44 method_892(class_24 var1) {
      return this.method_893(var1, (PointF)null, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, android.graphics.PointF, boolean) com.corrodinggames.rts.game.units.p
   private class_44 method_893(class_24 var1, PointF var2, boolean var3) {
      this.field_1213 = 0;
      float var4 = Float.MAX_VALUE;
      class_44 var5 = null;
      class_236 var6 = class_236.method_1549();
      if (var1 == null || (!var6.field_1885 || var1.method_126()) && !var1.method_127()) {
         class_39[] var7 = class_39.field_126.method_1326();
         int var8 = 0;

         for(int var9 = class_39.field_126.size(); var8 < var9; ++var8) {
            class_39 var10 = var7[var8];
            if (var10.field_143 == this.F && this.method_885(var10) && var10.field_182 == null && var10.method_283() && var10 instanceof class_44 && this.F.method_1005(var10)) {
               class_44 var11 = (class_44)var10;
               if (var11.method_399() && (!var3 || var11.method_431())) {
                  ++this.field_1213;
                  if (var1 == null || var11.method_390(var1)) {
                     boolean var12 = false;
                     float var13 = -1.0F;
                     if (var2 != null) {
                        var13 = class_296.method_2026(var2.field_2406, var2.field_2407, var10.dh, var10.di);
                     }

                     if (var5 == null) {
                        var12 = true;
                     } else {
                        if (var2 != null && var13 < var4) {
                           var12 = true;
                        }

                        if ((double)class_296.method_2033(0.0F, 1.0F) < 0.2D) {
                           var12 = true;
                        }
                     }

                     if (var12) {
                        var5 = (class_44)var10;
                        if (var2 != null) {
                           var4 = var13;
                        }
                     }
                  }
               }
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.ap) boolean
   private boolean method_894(class_24 var1) {
      class_236 var2 = class_236.method_1549();
      PointF var3;
      if (var1.method_138()) {
         var3 = this.method_873();
      } else {
         var3 = this.c(var1);
      }

      if (var3 == null) {
         return false;
      } else {
         class_44 var4 = this.method_893(var1, var3, false);
         if (var4 == null) {
            return false;
         } else {
            if (var1 == class_469.field_4036) {
               int var10000 = class_205.method_1370(var3.field_2406, var3.field_2407, class_503.field_4621);
               this.F.getClass();
               if (var10000 < 3000) {
                  return false;
               }
            }

            int var5 = 1;
            class_121 var6 = var4.method_387(var1);
            if (var6 != null) {
               var5 = var6.method_1057();
            } else {
               class_236.method_1588("buildBuilding: could not find getBuildUnitAction for builder this shouldn't happen:" + var1.method_141());
            }

            class_324 var7 = var2.field_1952.method_2159(this.F);
            var7.method_2184(var4);
            var7.method_2191(var3.field_2406, var3.field_2407, var1, var5);
            return true;
         }
      }
   }

   // $FF: renamed from: v () boolean
   private boolean method_895() {
      class_39[] var1 = class_39.field_126.method_1326();
      int var2 = 0;

      for(int var3 = class_39.field_126.size(); var2 < var3; ++var2) {
         class_39 var4 = var1[var2];
         if (var4.field_143 == this.F && this.method_885(var4) && var4.method_228() && !var4.method_318() && var4 instanceof class_44) {
            class_44 var5 = (class_44)var4;
            if (var5.method_388()) {
               return true;
            }
         }
      }

      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, boolean, boolean) com.corrodinggames.rts.game.units.p
   private class_44 method_896(class_24 var1, boolean var2, boolean var3) {
      class_39[] var4 = class_39.field_126.method_1326();
      int var5 = 0;

      for(int var6 = class_39.field_126.size(); var5 < var6; ++var5) {
         class_39 var7 = var4[var5];
         if (var7.field_143 == this.F && this.method_885(var7) && var7.method_228() && !var7.method_318() && var7 instanceof class_8 && var7 instanceof class_44) {
            class_44 var8 = (class_44)var7;
            class_8 var9 = (class_8)var7;
            String var10 = var7.method_274(var1);
            if (!class_121.method_1038(var10) && (var9.method_14() || !var2) && (!(var7 instanceof class_55) || var1.method_136() || this.method_905() <= 2 || this.field_1208 || !var2) && (!var3 || var8.field_313)) {
               return var8;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.a.d, boolean) boolean
   private boolean method_897(class_150 var1, boolean var2) {
      ArrayList var3 = var1.method_1145();
      Iterator var4 = var3.iterator();

      class_149 var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (class_149)var4.next();
      } while(!this.method_898(var5.field_1394, var2));

      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, boolean) boolean
   private boolean method_898(class_24 var1, boolean var2) {
      class_44 var3 = this.method_896(var1, true, var2);
      if (var3 == null) {
      }

      if (var3 == null) {
         return false;
      } else {
         class_236 var4 = class_236.method_1549();
         String var5 = var3.f(var1);
         if (class_121.method_1038(var5)) {
            class_236.method_1592("AI", "buildUnit: action is -1!");
            return false;
         } else {
            class_121 var6 = var3.b(var5);
            if (var6 == null) {
               class_236.method_1592("AI", "buildUnit: specialAction should not be null for id:" + var5);
            } else if (var6.method_1049() || var6.method_1048() && var4.field_1885) {
               return false;
            }

            class_324 var7 = var4.field_1952.method_2159(this.F);
            var7.method_2184(var3);
            var7.method_2198(var5);
            return true;
         }
      }
   }

   // $FF: renamed from: m () com.corrodinggames.rts.game.a.h
   class_106 method_899() {
      float var1 = -1.0F;
      class_106 var2 = null;
      Iterator var3 = this.F.field_1300.iterator();

      while(true) {
         class_106 var5;
         float var6;
         do {
            do {
               do {
                  class_100 var4;
                  do {
                     if (!var3.hasNext()) {
                        return var2;
                     }

                     var4 = (class_100)var3.next();
                  } while(!(var4 instanceof class_106));

                  var5 = (class_106)var4;
               } while(var5 == this);
            } while(var5.method_880() <= 1);

            var6 = var5.a(this);
         } while(var2 != null && var6 >= var1);

         var1 = var6;
         var2 = var5;
      }
   }

   // $FF: renamed from: n () void
   public void method_900() {
      class_236 var1 = class_236.method_1549();
      class_106 var2 = this.method_899();
      if (var2 != null && var2.method_880() > 1) {
         class_44 var3 = var2.method_890();
         if (var3 != null) {
            PointF var4 = this.s();
            if (class_205.method_1367(var3, var4.field_2406, var4.field_2407)) {
               boolean var5 = this.F.method_972(var3, var4.field_2406, var4.field_2407);
               if (var5 || this.F.field_1271 != 0) {
                  class_324 var6 = var1.field_1952.method_2159(this.F);
                  var6.method_2184(var3);
                  var6.method_2186(var4.field_2406, var4.field_2407);
                  this.field_1199 = (float)class_296.method_2036(1600, 2000);
                  if (!var5) {
                     boolean var7 = true;
                     if (var3.field_311 != null) {
                        if (!var3.field_311.method_847()) {
                           var3.field_311.method_853(var3);
                        } else {
                           var7 = false;
                           if (!var3.field_311.field_1145.contains(var3)) {
                              var3.field_311.field_1145.add(var3);
                           }
                        }
                     }

                     if (var7) {
                        class_105 var8 = new class_105(this.F);
                        var8.method_872(var3);
                        var8.G = var4.field_2406;
                        var8.H = var4.field_2407;
                     }

                     this.field_1199 = (float)class_296.method_2036(10000, 12000);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: w () com.corrodinggames.rts.game.units.aa
   private class_39 method_901() {
      class_39[] var1 = class_39.field_126.method_1326();
      int var2 = 0;

      for(int var3 = class_39.field_126.size(); var2 < var3; ++var2) {
         class_39 var4 = var1[var2];
         if (var4.field_143 == this.F && this.method_886(var4, true) && var4.method_212() && (var4.field_167 < var4.field_168 - 1.0F || var4.field_160 < 1.0F)) {
            return var4;
         }
      }

      return null;
   }

   // $FF: renamed from: o () void
   public void method_902() {
      class_236 var1 = class_236.method_1549();
      class_39 var2 = this.method_901();
      if (var2 != null) {
         this.field_1212.method_1960(var2.dh, var2.di);
         class_44 var3 = this.method_893((class_24)null, this.field_1212, true);
         if (var3 != null && var3.method_386(var2)) {
            class_324 var4 = var1.field_1952.method_2159(this.F);
            var4.method_2184(var3);
            var4.method_2192(var2);
         }
      }

   }

   // $FF: renamed from: a (float) void
   public void method_903(float var1) {
      this.method_906(var1);
      int var2 = this.method_880();
      int var3 = this.field_1221;
      this.method_874();
      this.field_1205 = this.method_895();
      if (this.field_1205) {
         this.field_1206 = true;
      }

      if (var2 >= 1) {
         this.method_902();
      }

      byte var4 = 2;
      if (this.F.method_965()) {
         var4 = 3;
      }

      int var5;
      if (var2 < var4 && this.field_1200 == 0.0F) {
         this.field_1200 = 300.0F;
         var5 = this.F.method_990(this.F.field_1309, class_142.field_1374);
         if (!this.field_1208 || var5 <= 2) {
            boolean var6 = true;
            boolean var7 = class_296.method_2036(0, 100) < 5;
            if (!var7 && this.method_897(this.F.field_1309, var6)) {
               this.field_1220 = false;
               this.field_1200 = 900.0F;
            } else {
               if (!var7) {
                  this.field_1220 = true;
               }

               if (!this.field_1208 && this.field_1210 == 0.0F && var2 < 1 && this.field_1199 == 0.0F) {
                  this.method_900();
               }
            }
         }
      }

      var5 = this.method_889();
      if (var2 == 0 && var3 == 0) {
         this.field_1202 += var1;
         if (var5 > 2) {
            this.field_1202 += 2.0F * var1;
         }

         if (var5 > 5) {
            this.field_1202 += 4.0F * var1;
         }
      } else {
         this.field_1202 = class_296.method_2020(this.field_1202, var1);
      }

      if (this.field_1202 > 9000.0F) {
         this.k();
      }

      if (this.field_1194 == class_143.field_1377 && (var2 != 0 && var3 != 0 || var3 > 5 && var5 == 0)) {
         this.field_1203 += var1;
         if (this.field_1203 > 2000.0F) {
            this.field_1194 = class_143.field_1379;
         }
      }

      this.method_904();
   }

   // $FF: renamed from: p () void
   public void method_904() {
      if (this.field_1194 == null) {
         class_236.method_1587("fixOverlaps: this.state==null");
         class_236.method_1587("id:" + this.E);
         class_236.method_1587("x:" + this.G);
         class_236.method_1587("y:" + this.H);
         class_236.method_1587("radius:" + this.I);
         if (this.F != null) {
            class_236.method_1587("team:" + this.F.d);
         }

      } else {
         Iterator var1 = this.F.field_1299.iterator();

         while(var1.hasNext()) {
            class_100 var2 = (class_100)var1.next();
            if (var2 instanceof class_106 && var2 != this) {
               class_106 var3 = (class_106)var2;
               float var4 = class_296.method_2026(this.G, this.H, var3.G, var3.H);
               if (var4 < 400.0F) {
                  if (var3.field_1194 == null) {
                     class_236.method_1587("fixOverlaps: targetBase.state==null");
                  } else if (var3.field_1194.method_1128() < this.field_1194.method_1128()) {
                     var3.k();
                  } else {
                     this.k();
                  }
               }
            }
         }

      }
   }

   // $FF: renamed from: q () int
   public int method_905() {
      return this.field_1221;
   }

   // $FF: renamed from: b (float) void
   public void method_906(float var1) {
      this.field_1221 = this.method_888();
   }

   // $FF: renamed from: c (float) void
   public void method_907(float var1) {
      this.field_1208 = this.method_881();
      this.field_1209 = this.field_1208;
      if (this.field_1208) {
         this.field_1210 += var1;
      } else {
         this.field_1210 = 0.0F;
      }

      if (this.field_1210 > 6000.0F) {
         this.field_1208 = false;
      }

      this.field_1204 = class_296.method_2020(this.field_1204, var1);
      this.field_1197 = class_296.method_2020(this.field_1197, var1);
      this.field_1199 = class_296.method_2020(this.field_1199, var1);
      this.field_1200 = class_296.method_2020(this.field_1200, var1);
      this.field_1201 = class_296.method_2020(this.field_1201, var1);
      if (this.field_1208 && this.field_1201 == 0.0F) {
         this.field_1201 = (float)(100 + this.E % 15);
         this.method_884();
      }

      if (this.field_1197 <= 0.0F) {
         this.field_1197 = (float)(270 + this.E % 15);
         if (this.F.method_965()) {
            this.field_1197 = (float)(190 + this.E % 15);
         }

         if ((double)this.field_1198 < 0.2D) {
            this.field_1197 += 180.0F;
         }

         if ((double)this.field_1198 < 0.08D) {
            this.field_1197 += 180.0F;
         }

         class_24 var2 = null;
         if (this.method_891() != null) {
            var2 = this.method_876();
         }

         if (var2 != null && ((double)this.field_1198 > 0.8D || this.F.e(1300)) && ((double)this.field_1198 > 0.4D || this.F.e(1700)) && ((double)this.field_1198 > 0.2D || this.F.e(2100)) && ((double)this.field_1198 > 0.1D || this.F.e(2800)) && ((double)this.field_1198 > 0.05D || this.F.e(3100)) && ((double)this.field_1198 > 0.01D || this.F.e(4800))) {
            this.field_1214 = var2;
            ++this.field_1215;
            if (!this.method_894(var2)) {
               this.field_1197 -= 120.0F;
               ++this.field_1216;
            }
         }
      }

      float var4 = (float)this.method_905();
      var4 /= 3.0F;
      if (var4 < 1.0F) {
         var4 = 1.0F;
      }

      if (this.field_1208) {
         this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.015D);
      }

      if ((double)this.field_1198 < 0.6D) {
         if (this.F.field_1291 < 2) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 7.0E-4D * (double)var4);
         } else if (this.F.e(1200)) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 1.0E-4D * (double)var4);
         }

         if (this.F.e(1600)) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.001D);
         }

         if (this.F.e(2200)) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.001D);
         }

         if (this.F.e(2600)) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.001D);
         }

         if (this.F.e(8000)) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.005D);
         }

         if (this.F.e(9000)) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.01D);
         }

         if (this.F.e(10100)) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.01D);
         }

         if (this.F.e(30000)) {
            this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.05D);
         }
      }

      if (this.F.e(5000)) {
         this.field_1196 = (float)((double)this.field_1196 + (double)var1 * 0.001D);
      }

      if (!this.F.e(800) && !this.field_1208 && this.field_1196 > 1.2F) {
         this.field_1196 = 1.2F;
      }

      if (this.field_1196 > 3.5F) {
         this.field_1196 = 3.5F;
      }

      for(int var3 = 0; var3 < 12; ++var3) {
         this.method_909();
         if (this.field_1196 < 3.0F) {
            break;
         }
      }

   }

   // $FF: renamed from: a (java.util.ArrayList, com.corrodinggames.rts.game.a.d, com.corrodinggames.rts.game.units.ac, int) void
   public void method_908(ArrayList var1, class_150 var2, class_503 var3, int var4) {
      this.field_1222.clear();

      for(int var5 = 0; var5 < var4; ++var5) {
         class_24 var6 = var2.method_1147(var3);
         if (var6 != null && !this.field_1222.contains(var6)) {
            this.field_1222.add(var6);
         }
      }

      var1.addAll(this.field_1222);
   }

   // $FF: renamed from: r () void
   public void method_909() {
      int var1 = this.method_879();
      byte var2 = 12;
      byte var3 = 50;
      if (this.F.method_965()) {
         var3 = 65;
         var2 = 16;
      }

      ArrayList var4 = new ArrayList();
      boolean var5 = this.F.method_968();
      boolean var6 = this.F.method_969();
      float var7 = 0.4F;
      float var8 = 0.3F;
      float var9 = 0.2F;
      if (!this.F.field_1294) {
         var7 = 0.1F;
         var8 = 0.5F;
         var9 = 0.4F;
      }

      if (!this.F.field_1295) {
         var7 = 0.2F;
         var8 = 0.1F;
         var9 = 0.7F;
      }

      float var11 = class_296.method_2033(0.0F, 1.0F);
      class_503 var10;
      if (var11 < var7) {
         var10 = class_503.field_4618;
      } else if (var11 < var7 + var8) {
         var10 = class_503.field_4622;
      } else {
         var10 = class_503.field_4620;
      }

      if (this.F.e(1300) && this.field_1196 >= 1.0F || this.F.e(300) && this.field_1196 >= 3.0F) {
         int var12;
         if (this.F.method_967() && this.F.field_1292 < var2) {
            var12 = class_296.method_2035(100);
            if (var12 < 35) {
               this.method_908(var4, this.F.field_1304, class_503.field_4621, 2);
            }
         }

         if (var1 < 3 && this.F.field_1290 < var3) {
            if (var10 == class_503.field_4618) {
               this.method_908(var4, this.F.field_1304, class_503.field_4618, 4);
            } else if (var10 == class_503.field_4622) {
               this.method_908(var4, this.F.field_1304, class_503.field_4622, 4);
            } else {
               this.method_908(var4, this.F.field_1304, class_503.field_4620, 4);
            }
         }

         if (this.field_1196 >= 1.0F && var5 && this.field_1204 == 0.0F) {
            var12 = this.F.method_990(this.F.field_1307, class_142.field_1374);
            int var13 = this.F.method_990(this.F.field_1308, class_142.field_1374);
            int var14 = var12 + var13;
            int var15 = this.F.method_993();
            if ((this.F.e(1700) || var15 > 10 || this.F.field_1298 == 0 && var15 >= 1 && var12 == 0) && (var14 < 3 || var15 > 20 && var14 < 5)) {
               if (var6 && var14 < 2) {
                  this.method_908(var4, this.F.field_1306, (class_503)null, 2);
               } else {
                  this.method_908(var4, this.F.field_1306, class_503.field_4620, 2);
               }
            }
         }
      } else {
         this.field_1217 = "Didn't meet allowedUnits";
      }

      while(var4.size() != 0) {
         class_24 var16 = (class_24)var4.remove(var4.size() - 1);
         class_39 var17 = class_39.method_216(var16);
         boolean var18 = true;
         if (this.field_1208 && class_296.method_2035(100) < 10) {
            class_39 var19 = this.method_882();
            if (var19 != null) {
               if (!this.F.method_996(var17, var19)) {
                  var18 = false;
               } else {
                  this.field_1217 = "Unit was not attacking";
               }
            }
         }

         if (var18) {
            boolean var20 = false;
            if (this.method_898(var16, var20)) {
               ++this.field_1218;
               this.field_1217 = "Queued:" + var16.method_141();
               this.F.field_1313.method_1125(var16);
               --this.field_1196;
               if (var17.method_278()) {
                  this.field_1204 = 1000.0F;
                  ++this.F.field_1298;
               }
               break;
            }

            this.field_1217 = "Failed to queue:" + var16.method_141();
            ++this.field_1219;
         }
      }

   }
}
