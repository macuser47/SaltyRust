package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.d.class_8;
import com.corrodinggames.rts.gameFramework.class_192;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_30;
import com.corrodinggames.rts.gameFramework.class_402;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_307;
import com.corrodinggames.rts.gameFramework.h.class_441;
import java.util.ArrayList;
import java.util.Collections;

// $FF: renamed from: com.corrodinggames.rts.game.k
public abstract class class_107 extends class_30 implements Comparable {
   // $FF: renamed from: a java.util.ArrayList
   static ArrayList field_1223 = new ArrayList();
   // $FF: renamed from: b com.corrodinggames.rts.game.k
   public static class_107 field_1224 = new class_109(-1);
   // $FF: renamed from: I com.corrodinggames.rts.game.k[]
   private static class_107[] field_1225 = new class_107[10];
   // $FF: renamed from: c com.corrodinggames.rts.game.k
   public static class_107 field_1226 = new class_108(-99);
   // $FF: renamed from: d int
   public int field_1227;
   // $FF: renamed from: e java.lang.String
   public final String field_1228;
   // $FF: renamed from: f int
   public int field_1229;
   // $FF: renamed from: g int
   public int field_1230;
   // $FF: renamed from: h int
   public int field_1231;
   // $FF: renamed from: i boolean
   public boolean field_1232;
   // $FF: renamed from: j java.lang.String
   public String field_1233;
   // $FF: renamed from: k boolean
   public boolean field_1234;
   // $FF: renamed from: l int
   public int field_1235;
   // $FF: renamed from: m boolean
   public boolean field_1236;
   // $FF: renamed from: n boolean
   public boolean field_1237;
   // $FF: renamed from: o boolean
   public boolean field_1238;
   // $FF: renamed from: p boolean
   public boolean field_1239;
   // $FF: renamed from: q int
   public int field_1240;
   // $FF: renamed from: r int
   public int field_1241;
   // $FF: renamed from: s byte[][]
   public byte[][] field_1242;
   // $FF: renamed from: t boolean[][]
   public boolean[][] field_1243;
   // $FF: renamed from: u java.lang.String
   public String field_1244;
   // $FF: renamed from: v int
   public int field_1245;
   // $FF: renamed from: w int
   public int field_1246;
   // $FF: renamed from: x boolean
   public boolean field_1247;
   // $FF: renamed from: y int
   public int field_1248;
   // $FF: renamed from: z boolean
   public boolean field_1249;
   // $FF: renamed from: A byte
   public byte field_1250;
   // $FF: renamed from: B int
   public int field_1251;
   // $FF: renamed from: C long
   public long field_1252;
   // $FF: renamed from: D int
   public int field_1253;
   // $FF: renamed from: E android.graphics.Paint
   public Paint field_1254;
   // $FF: renamed from: F android.graphics.Paint
   public Paint field_1255;
   // $FF: renamed from: G int
   protected final int field_1256;
   // $FF: renamed from: H int
   static int field_1257 = -99;

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) int
   public strictfp int method_910(class_107 var1) {
      int var2 = this.field_1253 - var1.field_1253;
      if (var2 != 0) {
         return var2;
      } else {
         int var3 = this.field_1227 - var1.field_1227;
         if (var3 != 0) {
            return var3;
         } else {
            return this.field_1233 != null && var1.field_1233 != null ? this.field_1233.compareTo(var1.field_1233) : 0;
         }
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_911(class_404 var1) {
      var1.method_2539(this.field_1227);
      var1.method_2541(this.field_1229);
      var1.method_2541(this.field_1231);
      var1.method_2544(this.field_1233);
      var1.method_2540(this.field_1249);
      if (var1.method_2568() > 26) {
         var1.method_2541(this.method_926());
         var1.method_2563("lastPingTimeReceivedAt");
         var1.method_2543(this.field_1252);
      }

      if (var1.method_2568() >= 55) {
         var1.method_2540(this.field_1234);
         var1.method_2541(this.field_1235);
      }

      if (var1.method_2568() >= 91) {
         var1.method_2541(this.field_1253);
         var1.method_2539(0);
      }

      if (var1.method_2568() >= 97) {
         var1.method_2540(this.field_1238);
         var1.method_2540(this.field_1239);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_912(class_463 var1) {
      this.method_913(var1, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h, boolean) void
   public strictfp void method_913(class_463 var1, boolean var2) {
      if (!var2) {
         this.method_937(var1.method_3009());
         this.field_1229 = var1.method_3011();
         this.field_1231 = var1.method_3011();
         this.field_1233 = var1.method_3014();
         this.field_1249 = var1.method_3010();
      } else {
         var1.method_3009();
         var1.method_3011();
         var1.method_3011();
         var1.method_3014();
         var1.method_3010();
      }

      if (var1.method_3006() >= 14) {
         this.field_1251 = var1.method_3011();
         var1.method_3013();
         this.field_1252 = System.currentTimeMillis();
      }

      if (var1.method_3006() >= 34 && var1.method_3008() >= 55) {
         boolean var5 = var1.method_3010();
         int var4 = var1.method_3011();
         if (!var2) {
            this.field_1234 = var5;
            this.field_1235 = var4;
         }
      } else {
         class_236 var3 = class_236.method_1549();
         if (var3.field_1944.field_3809) {
            class_454.method_2887("AI was skipping in networked game, steam version:" + var1.method_3008());
         }
      }

      if (var1.method_3006() >= 50 && var1.method_3008() >= 91) {
         this.field_1253 = var1.method_3011();
         var1.method_3009();
      }

      if (var1.method_3006() >= 52 && var1.method_3008() >= 97) {
         this.field_1238 = var1.method_3010();
         this.field_1239 = var1.method_3010();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2563("Writing team: " + this.field_1233);
      this.method_911(var1);
      if (var1.method_2568() >= 44) {
         var1.method_2539(1);
         var1.method_2540(this.field_1237);
         var1.method_2540(this.field_1236);
         boolean var2 = true;
         var1.method_2540(var2);
         if (var2) {
            this.method_915(var1);
         }
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_914(class_463 var1) {
      this.method_912(var1);
      if (var1.method_3006() >= 26) {
         byte var2 = var1.method_3009();
         this.field_1237 = var1.method_3010();
         if (var2 >= 1) {
            this.field_1236 = var1.method_3010();
         }

         boolean var3 = var1.method_3010();
         if (var3) {
            this.method_916(var1);
         }
      }

   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_915(class_404 var1) {
      class_236 var2 = class_236.method_1549();
      var1.method_2563("-- Saving fog --");
      var1.method_2540(this.field_1242 != null);
      if (this.field_1242 != null) {
         var1.method_2541(this.field_1240);
         var1.method_2541(this.field_1241);

         for(int var3 = 0; var3 < this.field_1240; ++var3) {
            for(int var4 = 0; var4 < this.field_1241; ++var4) {
               var1.method_2539(this.field_1242[var3][var4]);
            }
         }
      }

      var1.method_2563("--End fog--");
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_916(class_463 var1) {
      class_236 var2 = class_236.method_1549();
      boolean var3 = var1.method_3010();
      if (var3) {
         this.field_1240 = var1.method_3011();
         this.field_1241 = var1.method_3011();
         boolean var4 = true;
         int var5 = this.field_1240;
         int var6 = this.field_1241;
         if (var2.field_1932 != null) {
            var5 = var2.field_1932.field_3342;
            var6 = var2.field_1932.field_3343;
            if (this.field_1240 != var5 || this.field_1241 != var6) {
               class_236.method_1588("Map size does not match fog size: " + this.field_1240 + "!=" + var5 + "|" + this.field_1241 + "!=" + var6);
            }
         }

         if (var4) {
            this.field_1242 = new byte[var5][var6];
            this.field_1243 = new boolean[var5][var6];
         } else {
            this.field_1242 = (byte[][])null;
            this.field_1243 = (boolean[][])null;
         }

         for(int var7 = 0; var7 < this.field_1240; ++var7) {
            for(int var8 = 0; var8 < this.field_1241; ++var8) {
               if (var4) {
                  this.field_1242[var7][var8] = var1.method_3009();
               } else {
                  var1.method_3009();
               }
            }
         }
      } else {
         this.field_1242 = (byte[][])null;
         this.field_1243 = (boolean[][])null;
      }

   }

   // $FF: renamed from: a () void
   public strictfp void method_917() {
      if (this.field_1242 != null) {
         for(int var1 = 0; var1 < this.field_1240; ++var1) {
            for(int var2 = 0; var2 < this.field_1241; ++var2) {
               this.field_1242[var1][var2] = 0;
            }
         }
      }

      class_236 var3 = class_236.method_1549();
      if (var3.field_1915 == this) {
         var3.field_1943.field_1548 = true;
         if (var3.field_1932 != null) {
            var3.field_1932.method_2616();
            var3.field_1932.method_2604();
         }
      }

   }

   // $FF: renamed from: b () java.util.ArrayList
   public static strictfp ArrayList method_918() {
      field_1223.clear();
      class_107[] var0 = field_1225;
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         class_107 var3 = var0[var2];
         if (var3 != null) {
            field_1223.add(var3);
         }
      }

      Collections.sort(field_1223);
      return field_1223;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.k) boolean
   public strictfp boolean method_919(class_107 var1) {
      return this.method_920() && var1 != null && this.method_944(var1);
   }

   // $FF: renamed from: c () boolean
   public strictfp boolean method_920() {
      return this.field_1238 || this.field_1239;
   }

   // $FF: renamed from: d () boolean
   public strictfp boolean method_921() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1915 == this;
   }

   // $FF: renamed from: a (boolean) void
   public strictfp void method_922(boolean var1) {
      class_236 var2 = class_236.method_1549();
      if (var1 || this.field_1247) {
         int var3 = 0;
         int var4 = var2.field_1923;
         float var5 = 0.0F;
         class_39[] var6 = class_39.field_126.method_1326();
         int var7 = 0;

         for(int var8 = class_39.field_126.size(); var7 < var8; ++var7) {
            class_39 var9 = var6[var7];
            if (var9.field_143 == this) {
               if (!var9.method_212()) {
                  ++var3;
               }

               if (var9 instanceof class_8) {
                  class_8 var10 = (class_8)var9;
                  var3 += var10.method_12(false);
               }

               float var11 = var9.method_294();
               if (var11 != 0.0F && var9.field_160 >= 1.0F) {
                  var5 += var11;
               }
            }
         }

         if (var4 > var2.field_1924) {
            var4 = var2.field_1924;
         }

         this.field_1246 = var3;
         this.field_1245 = var4;
         this.field_1247 = false;
         this.field_1248 = (int)var5;
         this.method_964();
      }
   }

   // $FF: renamed from: e () int
   public strictfp int method_923() {
      int var1 = this.field_1248;
      class_236 var2 = class_236.method_1549();
      if (var2.method_1656()) {
         var1 = (int)((float)var1 * var2.field_1944.field_3863.field_3782);
      }

      return var1;
   }

   // $FF: renamed from: f () int
   public strictfp int method_924() {
      return this.field_1246;
   }

   // $FF: renamed from: g () int
   public strictfp int method_925() {
      return this.field_1245;
   }

   // $FF: renamed from: h () int
   public strictfp int method_926() {
      if (this.field_1252 == -1L) {
         return -2;
      } else {
         return this.field_1252 < System.currentTimeMillis() - 5000L ? -1 : this.field_1251;
      }
   }

   // $FF: renamed from: i () boolean
   public strictfp boolean method_927() {
      return this.field_1252 != -1L && this.field_1252 < System.currentTimeMillis() - 15000L;
   }

   // $FF: renamed from: a (float) void
   public abstract void method_928(float var1);

   // $FF: renamed from: j () int
   public final strictfp int method_929() {
      class_236 var1 = class_236.method_1549();
      if ((var1.field_1944.field_3809 || var1.field_1948.method_2657()) && !var1.field_1944.field_3811) {
         return this.field_1235;
      } else {
         int var2 = class_236.method_1549().field_1937.aiDifficulty;
         return var2;
      }
   }

   // $FF: renamed from: a (int) void
   public final strictfp void method_930(int var1) {
      class_236 var2 = class_236.method_1549();
      if (!this.field_1234) {
         this.method_931(var1);
      } else {
         int var3 = this.method_929();
         float var4 = 1.0F;
         if (var3 > 0) {
            var4 += (float)var3 * 0.4F;
         } else {
            var4 += (float)var3 * 0.3F;
         }

         if (var3 == 3) {
            var4 += 2.0F;
         }

         if (var4 < 0.1F) {
            var4 = 0.1F;
         }

         this.method_931((int)(var4 * (float)var1));
      }
   }

   // $FF: renamed from: b (int) void
   public final strictfp void method_931(int var1) {
      class_236 var2 = class_236.method_1549();
      if (var2.method_1656()) {
         var1 = (int)((float)var1 * var2.field_1944.field_3863.field_3782);
      }

      this.method_932(var1);
   }

   // $FF: renamed from: c (int) void
   public final strictfp void method_932(int var1) {
      this.field_1229 += var1;
      if (this.field_1229 > 999999999) {
         this.field_1229 = 999999999;
      }

   }

   // $FF: renamed from: k () void
   public static strictfp void method_933() {
      for(int var0 = 0; var0 < field_1225.length; ++var0) {
         field_1225[var0] = null;
      }

   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.game.e
   public static strictfp class_110 method_934(String var0) {
      if (var0 != null && !var0.equals("")) {
         for(int var1 = 0; var1 < field_1225.length; ++var1) {
            if (field_1225[var1] != null) {
               class_107 var2 = field_1225[var1];
               if (var0.equals(var2.field_1244)) {
                  if (var2 instanceof class_110) {
                     return (class_110)var2;
                  }

                  class_236.method_1588("Player:" + var1 + " with matching clientId is not an instanceof player");
               }
            }
         }

         return null;
      } else {
         class_236.method_1588("findExistingPlayer: No clientId id");
         return null;
      }
   }

   // $FF: renamed from: l () int
   public static strictfp int method_935() {
      for(int var0 = 0; var0 < field_1225.length; ++var0) {
         if (field_1225[var0] == null) {
            return var0;
         }
      }

      return -1;
   }

   // $FF: renamed from: m () void
   public strictfp void method_936() {
      for(int var1 = 0; var1 < field_1225.length; ++var1) {
         if (field_1225[var1] == this) {
            field_1225[var1] = null;
         }
      }

   }

   public strictfp class_107() {
      this.field_1227 = -1;
      this.field_1228 = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
      this.field_1229 = 4000;
      this.field_1230 = 0;
      this.field_1232 = false;
      this.field_1247 = true;
      this.field_1251 = -1;
      this.field_1252 = -1L;
      this.field_1253 = 0;
      this.field_1254 = new class_441();
      this.field_1255 = new class_441();
      this.field_1256 = 3;
      this.field_1234 = this instanceof class_112;
   }

   public strictfp class_107(int var1) {
      this(var1, true);
   }

   public strictfp class_107(int var1, boolean var2) {
      this();
      this.method_938(var1, var2);
   }

   // $FF: renamed from: d (int) void
   public strictfp void method_937(int var1) {
      this.method_938(var1, true);
   }

   // $FF: renamed from: a (int, boolean) void
   public strictfp void method_938(int var1, boolean var2) {
      if (this.field_1227 != var1) {
         if (this.field_1227 != -2 && var2) {
            this.method_936();
         }

         this.field_1227 = var1;
         this.field_1231 = var1;
         if (var1 != -2 && var2) {
            field_1225[var1] = this;
         }

         int var3 = this.method_945();
         this.field_1254.method_2788(var3);
         int var4 = Color.method_3077(Color.method_3072(var3), (int)((float)Color.method_3073(var3) * 0.5F), (int)((float)Color.method_3074(var3) * 0.5F), (int)((float)Color.method_3075(var3) * 0.5F));
         this.field_1255.method_2788(var4);
      }

   }

   // $FF: renamed from: e (int) boolean
   public strictfp boolean method_939(int var1) {
      return this.field_1229 >= var1 || var1 == 0;
   }

   // $FF: renamed from: f (int) boolean
   public strictfp boolean method_940(int var1) {
      if (this.method_939(var1)) {
         this.field_1229 -= var1;
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: g (int) boolean
   public strictfp boolean method_941(int var1) {
      if (this.method_942(var1)) {
         this.field_1230 -= var1;
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: h (int) boolean
   public strictfp boolean method_942(int var1) {
      return this.field_1229 + this.field_1230 >= var1 || var1 == 0;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.k) boolean
   public final strictfp boolean method_943(class_107 var1) {
      if (var1 != field_1224 && this != field_1224) {
         return this.field_1231 != var1.field_1231;
      } else {
         return false;
      }
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.k) boolean
   public final strictfp boolean method_944(class_107 var1) {
      if (var1 == field_1224 && this == field_1224) {
         return true;
      } else if (var1 != field_1224 && this != field_1224) {
         return this.field_1231 == var1.field_1231;
      } else {
         return false;
      }
   }

   // $FF: renamed from: n () int
   public strictfp int method_945() {
      return method_946(this.field_1227);
   }

   // $FF: renamed from: i (int) int
   public static strictfp int method_946(int var0) {
      if (var0 == 0) {
         return -16711936;
      } else if (var0 == 1) {
         return -3137517;
      } else if (var0 == 2) {
         return -16489485;
      } else if (var0 == 3) {
         return -192;
      } else if (var0 == 4) {
         return -16711681;
      } else if (var0 == 5) {
         return -3081993;
      } else if (var0 == 6) {
         return -16777216;
      } else if (var0 == 7) {
         return -65302;
      } else if (var0 == 8) {
         return -33000;
      } else if (var0 == 9) {
         return -7116604;
      } else {
         return var0 == -2 ? Color.method_3077(255, 41, 225, 149) : -7829368;
      }
   }

   // $FF: renamed from: o () java.lang.String
   public strictfp String method_947() {
      int var1 = this.field_1227;
      if (var1 == 0) {
         return "GREEN";
      } else if (var1 == 1) {
         return "RED";
      } else if (var1 == 2) {
         return "BLUE";
      } else if (var1 == 3) {
         return "YELLOW";
      } else if (var1 == 4) {
         return "CYAN";
      } else if (var1 == 5) {
         return "WHITE";
      } else if (var1 == 6) {
         return "BLACK";
      } else if (var1 == 7) {
         return "PINK";
      } else if (var1 == 8) {
         return "ORANGE";
      } else {
         return var1 == 9 ? "PURPLE" : "GRAY";
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e) com.corrodinggames.rts.gameFramework.h.e[]
   public static strictfp class_306[] method_948(class_306 var0) {
      return method_949(var0, class_246.field_2178, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, com.corrodinggames.rts.game.l, boolean) com.corrodinggames.rts.gameFramework.h.e[]
   public static strictfp class_306[] method_949(class_306 var0, class_246 var1, boolean var2) {
      return !var2 ? method_951(var0, var1) : method_950(var0, var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, com.corrodinggames.rts.game.l) com.corrodinggames.rts.gameFramework.h.e[]
   public static strictfp class_306[] method_950(class_306 var0, class_246 var1) {
      class_306[] var2 = new class_306[10];
      if (class_236.field_1899 && !class_236.field_1900) {
         for(int var6 = 0; var6 < var2.length; ++var6) {
            var2[var6] = var0;
         }

         return var2;
      } else if (var0.field_2521 != null) {
         return var0.field_2521;
      } else {
         class_402 var3 = class_236.method_1549().field_1950;
         var3.method_2526(class_192.field_1645);

         for(int var4 = 0; var4 < var2.length; ++var4) {
            int var5 = method_946(var4);
            if (var4 == 0) {
               var2[var4] = var0;
            } else {
               var2[var4] = new class_307(var0, var5, var1, var4);
            }
         }

         var3.method_2527(class_192.field_1645);
         var0.field_2521 = var2;
         return var2;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.h.e, com.corrodinggames.rts.game.l) com.corrodinggames.rts.gameFramework.h.e[]
   public static strictfp class_306[] method_951(class_306 var0, class_246 var1) {
      class_306[] var2 = new class_306[10];
      if (class_236.field_1899 && !class_236.field_1900) {
         for(int var6 = 0; var6 < var2.length; ++var6) {
            var2[var6] = var0;
         }

         return var2;
      } else if (var0.field_2521 != null) {
         return var0.field_2521;
      } else {
         class_402 var3 = class_236.method_1549().field_1950;
         var3.method_2526(class_192.field_1645);
         int[] var4 = new int[10];

         int var5;
         for(var5 = 0; var5 < var4.length; ++var5) {
            var4[var5] = method_946(var5);
         }

         for(var5 = 0; var5 < var2.length; ++var5) {
            if (var5 != 0) {
               var2[var5] = var0.method_2121();
               var2[var5].method_2124();
            }
         }

         var0.method_2124();
         if (var1 == class_246.field_2179) {
            method_953(var0, var2, var4);
         } else {
            method_952(var0, var2, var4);
         }

         for(var5 = 0; var5 < var2.length; ++var5) {
            if (var2[var5] != null) {
               var2[var5].method_2131();
            }
         }

         var0.method_2132();
         var2[0] = var0;
         var3.method_2527(class_192.field_1645);
         var0.field_2521 = var2;
         return var2;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, com.corrodinggames.rts.gameFramework.h.e[], int[]) void
   public static strictfp void method_952(class_306 var0, class_306[] var1, int[] var2) {
      int var3 = var0.method_2128();
      int var4 = var0.method_2127();
      int[] var5 = new int[var2.length];
      int[] var6 = new int[var2.length];
      int[] var7 = new int[var2.length];

      int var8;
      for(var8 = 0; var8 < var2.length; ++var8) {
         var5[var8] = Color.method_3073(var2[var8]);
         var6[var8] = Color.method_3074(var2[var8]);
         var7[var8] = Color.method_3075(var2[var8]);
      }

      for(var8 = 0; var8 < var3; ++var8) {
         for(int var9 = 0; var9 < var4; ++var9) {
            int var10 = var0.method_2125(var8, var9);
            int var11 = Color.method_3072(var10);
            int var12;
            if (var11 == 0) {
               if (Color.method_3073(var10) > 0 || Color.method_3074(var10) > 0 || Color.method_3075(var10) > 0) {
                  for(var12 = 0; var12 < var1.length; ++var12) {
                     if (var1[var12] != null) {
                        var1[var12].method_2126(var8, var9, Color.method_3077(0, 0, 0, 0));
                     }
                  }
               }
            } else {
               var12 = Color.method_3074(var10);
               if (var12 > 0) {
                  int var13 = Color.method_3073(var10);
                  int var14 = Color.method_3075(var10);
                  float var15;
                  int var17;
                  int var18;
                  int var19;
                  if (var12 > 0 && var13 == 0 && var14 == 0) {
                     var15 = (float)var12 / 255.0F;

                     for(int var21 = 0; var21 < var1.length; ++var21) {
                        var17 = (int)((float)var5[var21] * var15);
                        var18 = (int)((float)var6[var21] * var15);
                        var19 = (int)((float)var7[var21] * var15);
                        if (var1[var21] != null) {
                           var1[var21].method_2126(var8, var9, Color.method_3077(var11, var17, var18, var19));
                        }
                     }
                  } else if (var12 > 0 && var12 != var13 && var13 == var14) {
                     var15 = (float)var13 / 255.0F;
                     float var16 = (float)var12 / 255.0F - var15;

                     for(var17 = 0; var17 < var1.length; ++var17) {
                        var18 = (int)(var15 * 255.0F + (float)var5[var17] * var16);
                        var19 = (int)(var15 * 255.0F + (float)var6[var17] * var16);
                        int var20 = (int)(var15 * 255.0F + (float)var7[var17] * var16);
                        var18 = class_296.method_2024(var18, 0, 255);
                        var19 = class_296.method_2024(var19, 0, 255);
                        var20 = class_296.method_2024(var20, 0, 255);
                        if (var1[var17] != null) {
                           var1[var17].method_2126(var8, var9, Color.method_3077(var11, var18, var19, var20));
                        }
                     }
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.h.e, com.corrodinggames.rts.gameFramework.h.e[], int[]) void
   public static strictfp void method_953(class_306 var0, class_306[] var1, int[] var2) {
      int var3 = var0.method_2128();
      int var4 = var0.method_2127();
      int[] var5 = new int[var2.length];
      int[] var6 = new int[var2.length];
      int[] var7 = new int[var2.length];

      int var8;
      for(var8 = 0; var8 < var2.length; ++var8) {
         var5[var8] = Color.method_3073(var2[var8]);
         var6[var8] = Color.method_3074(var2[var8]);
         var7[var8] = Color.method_3075(var2[var8]);
      }

      for(var8 = 0; var8 < var3; ++var8) {
         for(int var9 = 0; var9 < var4; ++var9) {
            int var10 = var0.method_2125(var8, var9);
            int var11 = Color.method_3072(var10);
            if (var11 > 0) {
               int var12 = Color.method_3073(var10);
               int var13 = Color.method_3074(var10);
               int var14 = Color.method_3075(var10);
               float var15 = 0.15F;

               for(int var16 = 0; var16 < var1.length; ++var16) {
                  int var17 = (int)((float)var12 + (float)var5[var16] * var15);
                  int var18 = (int)((float)var13 + (float)var6[var16] * var15);
                  int var19 = (int)((float)var14 + (float)var7[var16] * var15);
                  var17 = class_296.method_2024(var17, 0, 255);
                  var18 = class_296.method_2024(var18, 0, 255);
                  var19 = class_296.method_2024(var19, 0, 255);
                  if (var1[var16] != null) {
                     var1[var16].method_2126(var8, var9, Color.method_3077(var11, var17, var18, var19));
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: j (int) com.corrodinggames.rts.game.k
   public static strictfp class_107 method_954(int var0) {
      if (var0 == -1) {
         return field_1224;
      } else if (var0 >= field_1225.length) {
         class_236.method_1595("team index too high: " + var0);
         return null;
      } else if (var0 < 0) {
         class_236.method_1595("team index too low: " + var0);
         return null;
      } else {
         return field_1225[var0];
      }
   }

   // $FF: renamed from: b (float) void
   public strictfp void method_955(float var1) {
      class_236 var2 = class_236.method_1549();
      if (!this.field_1237 && !var2.field_1948.method_2658()) {
         boolean var3 = false;
         boolean var4 = false;
         boolean var5 = false;
         boolean var6 = var2.field_1944.field_3863.field_3785;
         class_39[] var7 = class_39.field_126.method_1326();
         int var8 = 0;

         for(int var9 = class_39.field_126.size(); var8 < var9; ++var8) {
            class_39 var10 = var7[var8];
            if (var10.field_143 == this) {
               if (var10.field_160 >= 1.0F && !var10.method_318()) {
                  var3 = true;
                  if (!this.field_1236 && (var10.method_213() || var10.method_284())) {
                     var4 = true;
                     break;
                  }
               }
            } else if (var6 && var10.field_143 != null && var10.field_143.method_944(this) && var10.field_160 >= 1.0F && !var10.method_318()) {
               var5 = true;
            }
         }

         if (!var3 && !var5) {
            this.field_1237 = true;
            this.method_917();
            var2.field_1944.method_2966(this);
         }

         if (!var4 && !this.field_1236 && !this.field_1237) {
            this.field_1236 = true;
            var2.field_1944.method_2965(this);
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   public strictfp void method_956(class_44 var1) {
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.p) void
   public static strictfp void method_957(class_44 var0) {
      class_107[] var1 = field_1225;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         class_107 var4 = var1[var3];
         if (var4 != null) {
            var4.method_956(var0);
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_958(class_39 var1) {
      if (var1.field_143 == this) {
         this.field_1247 = true;
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) void
   public static strictfp void method_959(class_39 var0) {
      class_107[] var1 = field_1225;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         class_107 var4 = var1[var3];
         if (var4 != null) {
            var4.method_958(var0);
         }
      }

   }

   // $FF: renamed from: c (float) void
   public static strictfp void method_960(float var0) {
      field_1224.method_928(var0);
      class_107[] var1 = field_1225;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         class_107 var4 = var1[var3];
         if (var4 != null) {
            var4.method_928(var0);
            var4.method_955(var0);
         }
      }

      class_236 var5 = class_236.method_1549();
      if (var5.method_1579() && var5.field_1937.aiDifficulty != field_1257) {
         var5.field_1944.method_2961();
         field_1257 = var5.field_1937.aiDifficulty;
      }

   }

   // $FF: renamed from: d (float) void
   public static strictfp void method_961(float var0) {
      field_1224.method_922(false);
      class_107[] var1 = field_1225;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         class_107 var4 = var1[var3];
         if (var4 != null) {
            var4.method_922(false);
         }
      }

   }

   // $FF: renamed from: e (float) void
   public static strictfp void method_962(float var0) {
      class_107[] var1 = field_1225;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         class_107 var4 = var1[var3];
         if (var4 != null && var4 instanceof class_112) {
            class_112 var5 = (class_112)var4;
            var5.method_997(var0);
         }
      }

   }

   // $FF: renamed from: p () int
   public strictfp int method_963() {
      return this.field_1227 == -1 ? 5 : this.field_1227;
   }

   // $FF: renamed from: q () void
   public strictfp void method_964() {
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_910((class_107)var1);
   }
}
