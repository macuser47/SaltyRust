package com.corrodinggames.rts.gameFramework.c;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import android.view.Menu;
import android.view.MenuItem;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.a.class_11;
import com.corrodinggames.rts.a.class_273;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_285;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_43;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_122;
import com.corrodinggames.rts.game.units.a.class_128;
import com.corrodinggames.rts.game.units.a.class_129;
import com.corrodinggames.rts.game.units.a.class_132;
import com.corrodinggames.rts.game.units.a.class_133;
import com.corrodinggames.rts.game.units.a.class_134;
import com.corrodinggames.rts.game.units.a.class_516;
import com.corrodinggames.rts.game.units.a.class_518;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_30;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.class_427;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.d.class_432;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.h.class_468;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.a
public class class_99 extends class_30 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.c.e
   class_98 field_1059;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.k
   class_236 field_1060;
   // $FF: renamed from: c boolean
   public boolean field_1061 = false;
   // $FF: renamed from: d boolean
   public boolean field_1062 = false;
   // $FF: renamed from: e android.graphics.Paint
   Paint field_1063 = new Paint();
   // $FF: renamed from: f android.graphics.Paint
   Paint field_1064 = new Paint();
   // $FF: renamed from: g android.graphics.Paint
   Paint field_1065 = new Paint();
   // $FF: renamed from: h android.graphics.Paint
   Paint field_1066 = new Paint();
   // $FF: renamed from: i android.graphics.Paint
   Paint field_1067 = new Paint();
   // $FF: renamed from: j android.graphics.Paint
   Paint field_1068 = new Paint();
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.h.p
   class_441 field_1069;
   // $FF: renamed from: l android.graphics.Paint
   Paint field_1070 = new Paint();
   // $FF: renamed from: m android.graphics.Paint
   Paint field_1071;
   // $FF: renamed from: n android.graphics.Paint
   Paint field_1072;
   // $FF: renamed from: o android.graphics.Paint
   Paint field_1073;
   // $FF: renamed from: p android.graphics.Paint
   Paint field_1074;
   // $FF: renamed from: q android.graphics.Paint
   Paint field_1075;
   // $FF: renamed from: r android.graphics.Paint
   Paint field_1076;
   // $FF: renamed from: s android.graphics.Rect
   Rect field_1077 = new Rect();
   // $FF: renamed from: t android.graphics.RectF
   RectF field_1078 = new RectF();
   // $FF: renamed from: u android.graphics.Rect
   Rect field_1079 = new Rect();
   // $FF: renamed from: v android.graphics.RectF
   RectF field_1080 = new RectF();
   // $FF: renamed from: w android.graphics.RectF
   RectF field_1081 = new RectF();
   // $FF: renamed from: x android.graphics.Rect
   Rect field_1082 = new Rect();
   // $FF: renamed from: y android.graphics.Rect
   Rect field_1083 = new Rect();
   // $FF: renamed from: z boolean
   boolean field_1084;
   // $FF: renamed from: A float
   float field_1085;
   // $FF: renamed from: B float
   float field_1086;
   // $FF: renamed from: C float
   float field_1087;
   // $FF: renamed from: D int
   int field_1088;
   // $FF: renamed from: E boolean
   boolean field_1089;
   // $FF: renamed from: F float
   float field_1090;
   // $FF: renamed from: G float
   float field_1091;
   // $FF: renamed from: H float
   float field_1092;
   // $FF: renamed from: I float
   float field_1093;
   // $FF: renamed from: J float
   float field_1094;
   // $FF: renamed from: K float
   float field_1095;
   // $FF: renamed from: L float
   float field_1096;
   // $FF: renamed from: M float
   float field_1097;
   // $FF: renamed from: N com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1098 = null;
   // $FF: renamed from: O com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1099 = null;
   // $FF: renamed from: P com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1100 = null;
   // $FF: renamed from: Q com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1101 = null;
   // $FF: renamed from: R com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1102 = null;
   // $FF: renamed from: S android.graphics.Paint
   static Paint field_1103 = new Paint();
   // $FF: renamed from: T android.graphics.PorterDuffColorFilter
   static PorterDuffColorFilter field_1104;
   // $FF: renamed from: U com.corrodinggames.rts.game.units.aa
   class_39 field_1105;
   // $FF: renamed from: V com.corrodinggames.rts.game.units.a.l
   class_121 field_1106;
   // $FF: renamed from: W java.lang.String
   String field_1107;
   // $FF: renamed from: X java.lang.String
   String field_1108;
   // $FF: renamed from: Y java.lang.String
   String field_1109;
   // $FF: renamed from: Z java.lang.String
   String field_1110;
   // $FF: renamed from: aa java.lang.String
   String field_1111;
   // $FF: renamed from: ab java.lang.String
   public String field_1112;
   // $FF: renamed from: ac java.lang.String
   String field_1113 = null;
   // $FF: renamed from: ad float
   float field_1114 = 0.0F;
   // $FF: renamed from: ae float
   public float field_1115;
   // $FF: renamed from: af boolean
   public boolean field_1116;
   // $FF: renamed from: ag java.util.ArrayList
   ArrayList field_1117 = new ArrayList();
   // $FF: renamed from: ah com.corrodinggames.rts.game.units.a.r
   class_132 field_1118 = new class_132(false);
   // $FF: renamed from: ai com.corrodinggames.rts.game.units.a.r
   class_132 field_1119 = new class_132(true);
   // $FF: renamed from: aj com.corrodinggames.rts.game.units.a.b
   class_122 field_1120 = new class_122();
   // $FF: renamed from: ak java.util.ArrayList
   ArrayList field_1121 = new ArrayList();
   // $FF: renamed from: al java.util.ArrayList
   ArrayList field_1122 = new ArrayList();
   // $FF: renamed from: am java.util.ArrayList
   ArrayList field_1123 = new ArrayList();
   // $FF: renamed from: an android.graphics.RectF
   RectF field_1124 = new RectF();
   // $FF: renamed from: ao java.util.HashMap
   HashMap field_1125 = new HashMap();
   // $FF: renamed from: ap java.util.ArrayList
   ArrayList field_1126 = new ArrayList();
   // $FF: renamed from: aq android.graphics.Rect
   Rect field_1127 = new Rect();
   // $FF: renamed from: ar float
   float field_1128;
   // $FF: renamed from: as java.util.ArrayList
   ArrayList field_1129 = new ArrayList();
   // $FF: renamed from: at boolean
   boolean field_1130 = false;
   // $FF: renamed from: au java.lang.String
   static String field_1131;
   // $FF: renamed from: av java.lang.String
   static String field_1132;
   // $FF: renamed from: aw java.lang.String
   static String field_1133;
   // $FF: renamed from: ax boolean
   boolean field_1134 = false;
   // $FF: renamed from: ay float
   float field_1135 = 0.0F;
   // $FF: renamed from: az com.corrodinggames.rts.gameFramework.c.q
   class_26 field_1136 = new class_26();
   // $FF: renamed from: aA java.util.ArrayList
   ArrayList field_1137 = null;

   class_99(class_236 var1, class_98 var2) {
      this.field_1059 = var2;
      this.field_1060 = var1;
      this.method_795();
   }

   // $FF: renamed from: a () void
   public void method_794() {
      this.field_1107 = class_432.method_2744("gui.unselectall");
      this.field_1108 = class_432.method_2744("gui.common.allyUnit");
      this.field_1109 = class_432.method_2744("gui.common.enemyUnit");
      this.field_1110 = class_432.method_2744("gui.common.neutralUnit");
      this.field_1111 = class_432.method_2744("gui.infoText.ownedBy");
      this.field_1112 = class_432.method_2744("gui.infoText.unitCapReached");
   }

   // $FF: renamed from: b () void
   public void method_795() {
      this.method_794();
      this.field_1098 = this.field_1060.field_1935.method_60(R$drawable.zoom_button);
      this.field_1099 = this.field_1060.field_1935.method_60(R$drawable.lock_icon_menu);
      this.field_1100 = this.field_1060.field_1935.method_60(R$drawable.pause);
      this.field_1101 = this.field_1060.field_1935.method_60(R$drawable.replay_pause);
      this.field_1102 = this.field_1060.field_1935.method_60(R$drawable.fast);
      field_1103.method_2791(255, 30, 30, 30);
      field_1103.method_2796(field_1104);
      field_1103.method_2784(true);
      this.field_1071 = new Paint();
      this.field_1071.method_2781(true);
      this.field_1071.method_2801(Paint$Align.field_2227);
      this.field_1071.method_2791(255, 0, 255, 0);
      this.field_1060.method_1603(this.field_1071, 32.0F);
      this.field_1072 = new Paint();
      this.field_1072.method_2781(true);
      this.field_1072.method_2801(Paint$Align.field_2227);
      this.field_1072.method_2791(255, 255, 0, 0);
      this.field_1060.method_1603(this.field_1072, 32.0F);
      this.field_1073 = new Paint();
      this.field_1073.method_2781(true);
      this.field_1073.method_2801(Paint$Align.field_2226);
      this.field_1073.method_2791(255, 0, 255, 0);
      this.field_1060.method_1603(this.field_1073, 16.0F);
      this.field_1074 = new Paint();
      this.field_1074.method_2781(true);
      this.field_1074.method_2801(Paint$Align.field_2228);
      this.field_1074.method_2791(255, 0, 255, 0);
      this.field_1060.method_1603(this.field_1074, 16.0F);
      this.field_1075 = new Paint();
      this.field_1075.method_2791(255, 255, 255, 255);
      this.field_1075.method_2801(Paint$Align.field_2226);
      this.field_1075.method_2783(true);
      this.field_1075.method_2781(true);
      this.field_1076 = new Paint();
      this.field_1076.method_2791(255, 255, 255, 255);
      this.field_1076.method_2801(Paint$Align.field_2226);
      this.field_1076.method_2783(true);
      this.field_1076.method_2781(true);
      this.field_1069 = new class_441();
      this.field_1069.b(Color.method_3077(190, 255, 255, 255));
      this.field_1069.method_2824();
      this.field_1126.clear();

      for(int var1 = 0; var1 < 10; ++var1) {
         this.field_1126.add(new class_113(this, var1 < 3));
      }

      this.method_827();
   }

   // $FF: renamed from: n () float
   private float method_796() {
      float var1 = 4.0F / this.field_1060.field_1989;
      if (var1 > 4.0F) {
         var1 = 4.0F;
      }

      return var1;
   }

   // $FF: renamed from: o () float
   private float method_797() {
      return this.method_798() / this.field_1060.field_1989;
   }

   // $FF: renamed from: p () float
   private float method_798() {
      return this.field_1060.field_1972 / this.field_1060.field_1932.method_2612() < this.field_1060.field_1974 / this.field_1060.field_1932.method_2613() ? this.field_1060.field_1972 / this.field_1060.field_1932.method_2612() : this.field_1060.field_1974 / this.field_1060.field_1932.method_2613();
   }

   // $FF: renamed from: a (float) void
   void method_799(float var1) {
      float var2;
      float var5;
      float var6;
      float var7;
      float var8;
      float var9;
      if (this.field_1060.field_1937.showZoomButton) {
         var2 = this.field_1060.field_1955 * 0.7F;
         int var3 = (int)(50.0F * var2);
         int var4 = (int)this.field_1060.field_1960;
         if (this.field_1084) {
            this.field_1077.method_1911(var3 - 4, (int)((float)var4 - 50.0F * this.field_1060.field_1955), var3 + 4, (int)((float)var4 + 50.0F * this.field_1060.field_1955));
            this.field_1065.method_2775();
            this.field_1065.method_2788(Color.method_3077(255, 0, 0, 0));
            this.field_1060.field_1935.method_79(this.field_1077, this.field_1065);
         }

         var5 = (float)var4;
         if (this.field_1060.field_1986 > 1.0F) {
            var5 -= (this.field_1060.field_1986 - 1.0F) * 3.0F * this.field_1060.field_1955;
         } else {
            var5 += (1.0F / this.field_1060.field_1986 - 1.0F) * 6.0F * this.field_1060.field_1955;
         }

         var6 = 48.0F * var2;
         var7 = 54.0F * var2;
         var8 = var6 / 2.0F;
         var9 = var7 / 2.0F;
         if (var5 < var9) {
            var5 = var9;
         }

         if (var5 > this.field_1060.field_1957 - var9) {
            var5 = (float)((int)(this.field_1060.field_1957 - var9));
         }

         this.field_1077.method_1911((int)((float)var3 - var8), (int)(var5 - var9), (int)((float)var3 + var8), (int)(var5 + var9));
         if (!this.field_1084) {
            field_1103.method_2791(140, 215, 215, 215);
         } else {
            field_1103.method_2791(255, 255, 255, 255);
         }

         this.field_1060.field_1935.method_70(this.field_1098, (float)this.field_1077.field_2352, (float)this.field_1077.field_2353, field_1103, 0.0F, var2);
         boolean var10 = this.field_1084;
         if (!this.field_1084 && this.field_1059.method_793(this.field_1077.field_2352, this.field_1077.field_2353, this.field_1077.method_1904(), this.field_1077.method_1905(), class_166.field_1477)) {
            this.field_1084 = true;
            this.field_1085 = this.field_1059.field_959;
         }

         if (!this.field_1059.field_965) {
            this.field_1084 = false;
         }

         if (this.field_1084) {
            this.field_1086 += var1;
            this.field_1059.method_707();
            float var11 = this.field_1059.field_959 - this.field_1085;
            if (var11 > 90.0F) {
               var11 = 90.0F;
            }

            if (var11 < -90.0F) {
               var11 = -90.0F;
            }

            if (var11 > 2.0F) {
               this.field_1060.field_1986 -= 5.0E-4F * class_296.method_2042(var11) * var1;
               this.field_1060.field_1987 = false;
               if (this.field_1060.field_1986 < this.method_797()) {
                  this.field_1060.field_1986 = this.method_797();
                  this.field_1060.field_1987 = true;
               }
            } else if (var11 < -2.0F) {
               this.field_1060.field_1986 += 5.0E-4F * class_296.method_2042(var11) * var1;
               this.field_1060.field_1987 = false;
               if (this.field_1060.field_1986 > this.method_796()) {
                  this.field_1060.field_1986 = this.method_796();
                  this.field_1060.field_1987 = true;
               }
            }
         } else {
            if (var10 && this.field_1086 < 12.0F) {
               if ((double)this.field_1060.field_1986 > 1.1D) {
                  this.field_1060.field_1986 = 1.0F;
               } else if ((double)this.field_1060.field_1986 < 0.9D) {
                  this.field_1060.field_1986 = 2.0F;
               } else {
                  this.field_1060.field_1986 = this.method_797();
                  this.field_1060.field_1987 = true;
                  if ((double)this.field_1060.field_1986 > 0.9D) {
                     this.field_1060.field_1986 = 2.0F;
                  }
               }
            }

            this.field_1086 = 0.0F;
         }
      }

      float var13;
      class_236 var10000;
      if (this.field_1060.field_1937.mouseSupport) {
         if (this.field_1059.method_708(this.field_1060.method_1615(), this.field_1060.method_1616()) && !this.field_1059.field_968) {
            int var12 = this.field_1060.method_1631();
            if (var12 != 0) {
               this.field_1087 += (float)var12 / 120.0F * 0.18F;
            }

            if (this.field_1087 > 1.0F) {
               this.field_1087 = 1.0F;
            }

            if (this.field_1087 < -1.0F) {
               this.field_1087 = -1.0F;
            }
         }

         if (this.field_1087 != 0.0F) {
            var2 = 8.0E-4F * var1;
            if (this.field_1087 < 0.0F) {
               var2 = -var2;
            }

            var2 += this.field_1087 * 0.18F * var1;
            var13 = this.field_1087;
            this.field_1087 = class_296.method_2020(this.field_1087, class_296.method_2042(var2));
            if (this.field_1087 == 0.0F) {
               var2 = var13;
            }

            if (this.field_1060.field_1986 < 1.0F) {
               var2 *= this.field_1060.field_1986;
            }

            var10000 = this.field_1060;
            var10000.field_1986 += var2;
            this.field_1060.field_1990 = true;
            this.field_1060.field_1991 = this.field_1060.method_1615();
            this.field_1060.field_1992 = this.field_1060.method_1616();
            if (var2 != 0.0F) {
               this.field_1060.field_1987 = false;
            }
         }
      }

      if (this.field_1060.field_1937.gestureZoom && this.field_1060.method_1612() && this.field_1060.method_1614() >= 3) {
         this.field_1097 = 10.0F;
      }

      if (this.field_1097 > 0.0F) {
         this.field_1097 = class_296.method_2020(this.field_1097, var1);
         boolean var15 = this.field_1060.method_1612() && this.field_1060.method_1614() >= 3;
         this.field_1059.field_1023 = 3.0F;
         var13 = 0.0F;
         float var14 = 0.0F;
         var5 = 0.0F;
         if (!var15) {
            var13 = this.field_1093;
            var14 = this.field_1094;
            var5 = this.field_1095;
         } else {
            int var16;
            for(var16 = 0; var16 < this.field_1060.method_1614(); ++var16) {
               var13 += this.field_1060.method_1617(var16);
               var14 += this.field_1060.method_1618(var16);
            }

            var13 /= (float)this.field_1060.method_1614();
            var14 /= (float)this.field_1060.method_1614();
            var5 = 0.0F;

            for(var16 = 0; var16 < this.field_1060.method_1614(); ++var16) {
               var7 = this.field_1060.method_1617(var16);
               var8 = this.field_1060.method_1618(var16);
               var5 += class_296.method_2027(var13, var14, var7, var8);
            }
         }

         if (!this.field_1089) {
            this.field_1089 = true;
            this.field_1090 = var13;
            this.field_1091 = var14;
            this.field_1092 = var5;
            this.field_1096 = this.field_1060.field_1986;
            this.field_1093 = var13;
            this.field_1094 = var14;
            this.field_1095 = var5;
         }

         var10000 = this.field_1060;
         var10000.field_1986 += (this.field_1094 - var14) / 250.0F / this.field_1060.field_1955;
         this.field_1060.field_1987 = false;
         var6 = this.field_1095 - var5;
         boolean var17 = false;
         if (var17) {
            var10000 = this.field_1060;
            var10000.field_1986 -= var6 / 350.0F / this.field_1060.field_1955;
            this.field_1060.field_1987 = false;
         }

         this.field_1093 = var13;
         this.field_1094 = var14;
         this.field_1095 = var5;

         for(int var18 = 0; var18 < this.field_1060.method_1614(); ++var18) {
            var9 = this.field_1060.method_1617(var18);
            float var19 = this.field_1060.method_1618(var18);
            this.field_1060.field_1935.method_96(var13, var14, var9, var19, this.field_1059.field_1017);
         }

         var8 = 6.0F;
         this.field_1060.field_1935.method_96(var13, var14, var13, this.field_1091, this.field_1059.field_1018);
         this.field_1060.field_1935.method_85(var13, var14, var8, this.field_1059.field_1017);
      } else {
         this.field_1089 = false;
      }

      if (this.field_1060.field_1986 > this.method_796()) {
         this.field_1060.field_1986 = this.method_796();
         this.field_1060.field_1987 = true;
      }

      if (this.field_1060.field_1986 < this.method_797()) {
         this.field_1060.field_1986 = this.method_797();
         this.field_1060.field_1987 = true;
      }

   }

   // $FF: renamed from: b (float) void
   void method_800(float var1) {
      boolean var2 = false;
      byte var3 = 7;
      if (class_236.method_1654()) {
         var3 = 14;
      }

      boolean var4;
      if (this.field_1060.method_1612() && this.field_1059.field_984 == null) {
         var4 = this.field_1059.method_718(this.field_1060);
         byte var5 = 1;
         if (this.field_1060.field_1937.mouseOrders == 2) {
            var5 = 2;
         }

         int var6 = this.field_1060.method_1621(var5);
         if (var4 || this.field_1060.field_1937.mouseSupport && var6 != -1 && !this.field_1059.field_966 && !this.field_1059.field_967) {
            float var7 = this.field_1060.method_1617(0);
            float var8 = this.field_1060.method_1618(0);
            if (var6 != -1) {
               var7 = this.field_1060.method_1617(var6);
               var8 = this.field_1060.method_1618(var6);
            }

            if (!this.field_1061) {
               this.field_1081.field_2416 = (float)((int)var7);
               this.field_1081.field_2417 = (float)((int)var8);
            }

            this.field_1081.field_2418 = (float)((int)var7);
            this.field_1081.field_2419 = (float)((int)var8);
            this.field_1062 = true;
            this.field_1061 = true;
            var2 = true;
         } else if (this.field_1060.method_1614() == 2 && this.field_1097 == 0.0F) {
            this.field_1081.field_2416 = (float)((int)this.field_1060.method_1617(0));
            this.field_1081.field_2417 = (float)((int)this.field_1060.method_1618(0));
            this.field_1081.field_2418 = (float)((int)this.field_1060.method_1617(1));
            this.field_1081.field_2419 = (float)((int)this.field_1060.method_1618(1));
            this.field_1062 = false;
            this.field_1061 = true;
            var2 = true;
         }

         if (var2 && (Math.abs(this.field_1081.field_2416 - this.field_1081.field_2418) > (float)var3 || Math.abs(this.field_1081.field_2417 - this.field_1081.field_2419) > (float)var3)) {
            this.field_1082.field_2355 = (int)this.field_1081.field_2419;
            this.field_1082.field_2353 = (int)this.field_1081.field_2417;
            this.field_1082.field_2352 = (int)this.field_1081.field_2416;
            this.field_1082.field_2354 = (int)this.field_1081.field_2418;
            class_296.method_2037(this.field_1082);
            this.field_1063.method_2788(Color.method_3077(255, 0, 255, 0));
            this.field_1063.method_2786(Paint$Style.field_4586);
            this.field_1063.method_2793(1.0F);
            this.field_1060.field_1935.method_79(this.field_1082, this.field_1063);
         }
      }

      if (this.field_1061 && !var2) {
         this.field_1062 = false;
         this.field_1061 = false;
         class_296.method_2038(this.field_1081);
         if (Math.abs(this.field_1081.field_2416 - this.field_1081.field_2418) > (float)var3 || Math.abs(this.field_1081.field_2417 - this.field_1081.field_2419) > (float)var3) {
            RectF var10000 = this.field_1081;
            var10000.field_2419 /= this.field_1060.field_1988;
            var10000 = this.field_1081;
            var10000.field_2417 /= this.field_1060.field_1988;
            var10000 = this.field_1081;
            var10000.field_2416 /= this.field_1060.field_1988;
            var10000 = this.field_1081;
            var10000.field_2418 /= this.field_1060.field_1988;
            this.field_1081.method_1972((float)this.field_1060.field_1963, (float)this.field_1060.field_1964);
            this.field_1059.field_1023 = 4.0F;
            this.field_1059.field_1024 = 40.0F;
            this.field_1059.field_976 = false;
            if (!this.field_1059.method_716(this.field_1060) && !this.field_1059.method_717(this.field_1060)) {
               this.field_1059.method_762();
            }

            var4 = true;
            Iterator var9;
            class_34 var10;
            class_43 var11;
            if (this.field_1060.field_1937.smartSelection_v2) {
               var9 = class_34.field_79.iterator();

               while(var9.hasNext()) {
                  var10 = (class_34)var9.next();
                  if (var10 instanceof class_43) {
                     var11 = (class_43)var10;
                     if (!var11.aZ() && this.method_801(var11)) {
                        var4 = false;
                        break;
                     }
                  }
               }
            }

            var9 = class_34.field_79.iterator();

            while(true) {
               do {
                  do {
                     if (!var9.hasNext()) {
                        this.field_1059.method_772();
                        return;
                     }

                     var10 = (class_34)var9.next();
                  } while(!(var10 instanceof class_43));

                  var11 = (class_43)var10;
               } while(!var4 && var11.aZ());

               if (this.method_801(var11)) {
                  this.field_1059.method_764(var11, this.field_1059.method_717(this.field_1060));
               }
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.c) boolean
   private boolean method_801(class_43 var1) {
      return !var1.bi && var1.bX == null && this.field_1059.method_769(var1) && this.field_1081.method_1973((float)((int)var1.dh), (float)((int)(var1.di - var1.dj)));
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_802(String var1) {
      this.field_1113 = var1;
      this.field_1114 = 100.0F;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_803(String var1) {
      this.field_1113 = var1;
      this.field_1114 = 5.0F;
   }

   // $FF: renamed from: c (float) void
   public void method_804(float var1) {
      if (this.field_1114 > 0.0F && this.field_1113 != null) {
         this.field_1114 = class_296.method_2020(this.field_1114, var1);
         this.field_1060.field_1935.method_77(this.field_1113, this.field_1060.field_1959, this.field_1060.field_1960, this.field_1059.field_1008, this.field_1059.field_1013, 8.0F);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l) boolean
   public static boolean method_805(class_121 var0) {
      class_236 var1 = class_236.method_1549();
      return var1.field_1885 && var0.method_1048();
   }

   // $FF: renamed from: c () void
   public void method_806() {
      this.field_1088 = 0;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, int, java.util.ArrayList) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_807(class_121 var1, int var2, ArrayList var3) {
      class_236 var4 = class_236.method_1549();
      if (!class_236.field_1900) {
         return null;
      } else if (var1 instanceof class_128) {
         return null;
      } else if (var1 instanceof class_129) {
         return null;
      } else if (var1 instanceof class_122) {
         return null;
      } else if (var1.method_1060() == class_518.field_4701) {
         return var4.field_1940.field_3618;
      } else if (var1.method_1059() == class_516.field_4695) {
         return var4.field_1940.field_3616;
      } else if (var1.method_1059() == class_516.field_4694) {
         return var4.field_1940.field_3615;
      } else if (var1.method_1059() == class_516.field_4692) {
         return var4.field_1940.field_3595;
      } else {
         if (var1.method_1060() == class_518.field_4702) {
            int var5 = 0;
            Iterator var6 = var3.iterator();

            while(var6.hasNext()) {
               class_121 var7 = (class_121)var6.next();
               if (var7 != var1 && var7.method_1060() == class_518.field_4702 && this.field_1059.method_741(var7)) {
                  ++var5;
               }
            }

            if (var5 == 0) {
               return var4.field_1940.field_3617;
            }
         }

         if (var1.method_1060() != class_518.field_4706 && var1.method_1060() != class_518.field_4707) {
            class_427 var8 = null;
            class_427[] var9 = var4.field_1940.field_3626;
            if (this.field_1088 < var9.length) {
               var8 = var9[this.field_1088];
               ++this.field_1088;
            }

            return var8;
         } else {
            return null;
         }
      }
   }

   // $FF: renamed from: d () java.util.ArrayList
   public ArrayList method_808() {
      this.field_1121.clear();
      class_39[] var1 = this.field_1059.field_1056.method_1326();
      int var2 = 0;

      for(int var3 = this.field_1059.field_1056.size(); var2 < var3; ++var2) {
         class_39 var4 = var1[var2];
         class_24 var5 = var4.method_295();
         if (!this.field_1121.contains(var5)) {
            this.field_1121.add(var5);
         }
      }

      return this.field_1121;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, java.util.ArrayList) java.util.ArrayList
   public ArrayList method_809(class_39 var1, ArrayList var2) {
      int var3 = 0;
      this.field_1117.clear();
      int var4 = this.field_1059.method_734();
      if (var4 == 0) {
         return this.field_1117;
      } else {
         if (class_98.field_1052 && var1 != null) {
            this.field_1117.add(this.field_1118);
            this.field_1117.add(this.field_1119);
         }

         if (var1 == null) {
         }

         int var6;
         if (var1 != null) {
            var3 = this.field_1117.size();
            if (var1.field_177 && this.field_1059.method_769(var1)) {
               ArrayList var5 = var1.method_260();
               if (var5 != null) {
                  this.field_1117.addAll(var5);
               }
            }

            int var14 = 0;

            for(var6 = var2.size(); var14 < var6; ++var14) {
               class_39 var7 = (class_39)var2.get(var14);
               if (this.field_1059.method_769(var7) && (var7.method_295() != var1.method_295() || var7.method_261() != var1.method_261())) {
                  ArrayList var8 = var7.method_260();
                  if (var8 != null) {
                     Iterator var9 = var8.iterator();

                     while(var9.hasNext()) {
                        class_121 var10 = (class_121)var9.next();
                        boolean var11 = false;
                        Iterator var12 = this.field_1117.iterator();

                        while(var12.hasNext()) {
                           class_121 var13 = (class_121)var12.next();
                           if (var13.method_1043().equals(var10.method_1043())) {
                              var11 = true;
                           }
                        }

                        if (!var11) {
                           this.field_1117.add(var10);
                        }
                     }
                  }
               }
            }
         }

         boolean var15 = false;
         var6 = 0;

         for(int var17 = var2.size(); var6 < var17; ++var6) {
            class_39 var20 = (class_39)var2.get(var6);
            if (this.field_1059.method_769(var20) && var20 instanceof class_44) {
               class_44 var22 = (class_44)var20;
               if (!var22.method_432()) {
                  var15 = true;
               }
            }
         }

         if (!var15) {
            class_39 var16 = this.method_810();
            if (var16 != null && this.field_1059.method_769(var16)) {
               this.field_1117.add(var3, this.field_1059.field_950);
               this.field_1117.add(var3, this.field_1059.field_951);
            }
         }

         boolean var18 = false;
         if (class_98.field_1052 && (this.field_1060.field_1937.showSelectedUnitsList || var4 == 1)) {
            var18 = true;
         }

         if (class_236.method_1653() && var4 > 0) {
            var18 = true;
         }

         if (var18) {
            ArrayList var19 = this.method_808();
            this.field_1122.clear();
            Iterator var21 = var19.iterator();

            while(var21.hasNext()) {
               class_24 var23 = (class_24)var21.next();
               class_133 var25 = var23.method_129();
               var25.method_1091();
               this.field_1122.add(var25);
            }

            Collections.sort(this.field_1122);
            if (class_98.field_1052) {
               Collections.reverse(this.field_1122);
            }

            var21 = this.field_1122.iterator();

            while(var21.hasNext()) {
               class_133 var24 = (class_133)var21.next();
               if (class_98.field_1052) {
                  this.field_1117.add(0, var24);
               } else {
                  this.field_1117.add(var24);
               }
            }
         }

         return this.field_1117;
      }
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.aa
   class_39 method_810() {
      return this.field_1059.field_1056.size() > 0 ? this.field_1059.field_1056.method_1331(0) : null;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.aa
   class_39 method_811() {
      class_39 var1 = null;
      if (this.field_1059.field_1026 > 0) {
         class_39[] var2 = this.field_1059.field_1056.method_1326();
         int var3 = 0;

         for(int var4 = this.field_1059.field_1056.size(); var3 < var4; ++var3) {
            class_39 var5 = var2[var3];
            if (var5.field_177) {
               if (var1 == null) {
                  var1 = var5;
               } else {
                  if (!this.method_812(var1, var5)) {
                     var1 = null;
                     break;
                  }

                  if (var1.method_261() > var5.method_261()) {
                     var1 = var5;
                  }
               }
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_812(class_39 var1, class_39 var2) {
      class_24 var3 = var1.method_295();
      class_24 var4 = var2.method_295();
      if (var3 == var4) {
         return true;
      } else {
         if (var3 instanceof class_479 && var4 instanceof class_479) {
            class_479 var5 = (class_479)var3;
            if (var5.field_4403.contains(var4)) {
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: g () java.util.ArrayList
   ArrayList method_813() {
      this.field_1123.clear();
      class_39[] var1 = this.field_1059.field_1056.method_1326();
      int var2 = 0;

      for(int var3 = this.field_1059.field_1056.size(); var2 < var3; ++var2) {
         class_39 var4 = var1[var2];
         if (var4 instanceof class_44) {
            this.field_1123.add((class_44)var4);
         }
      }

      return this.field_1123;
   }

   // $FF: renamed from: h () float
   float method_814() {
      float var1 = this.field_1060.field_1957 / 14.0F / this.field_1060.field_1955;
      var1 = class_296.method_2023(var1, 25.0F * this.field_1060.field_1955, 40.0F * this.field_1060.field_1955);
      return var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, java.util.ArrayList) boolean
   private boolean method_815(class_121 var1, ArrayList var2) {
      if (var1.method_1067()) {
         return true;
      } else {
         Iterator var3 = var2.iterator();

         class_44 var4;
         class_121 var5;
         do {
            if (!var3.hasNext()) {
               return false;
            }

            var4 = (class_44)var3.next();
            var5 = var4.c(var1.method_1043());
         } while(var5 == null || !var5.method_1051(var4) || !this.field_1059.method_769(var4));

         return true;
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.l, java.util.ArrayList) boolean
   private boolean method_816(class_121 var1, ArrayList var2) {
      if (var1.method_1067()) {
         return true;
      } else {
         Iterator var3 = var2.iterator();

         class_44 var4;
         class_121 var5;
         do {
            if (!var3.hasNext()) {
               return false;
            }

            var4 = (class_44)var3.next();
            var5 = var4.c(var1.method_1043());
         } while(var5 == null || !var5.method_1050(var4, true));

         return true;
      }
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.a.l, java.util.ArrayList) float
   private float method_817(class_121 var1, ArrayList var2) {
      int var3 = 0;
      float var4 = -1.0F;
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         class_44 var6 = (class_44)var5.next();
         class_121 var7 = var6.c(var1.method_1043());
         if (var7 != null) {
            float var8 = var7.method_1076(var6);
            if (var8 > var4) {
               var4 = var8;
               ++var3;
            }
         }
      }

      return var4;
   }

   // $FF: renamed from: d (float) int
   int method_818(float var1) {
      this.field_1116 = false;
      byte var2 = 1;
      if (class_236.method_1654()) {
         var2 = 2;
      }

      boolean var3 = false;
      int var4 = 0;
      ArrayList var5 = this.method_813();
      class_39 var6 = this.method_811();
      ArrayList var7 = this.method_809(var6, var5);
      this.field_1059.field_954 = false;
      if (var7.contains(this.field_1059.field_950)) {
         this.field_1059.field_954 = true;
      }

      if (var6 == null) {
         var6 = this.method_810();
      }

      boolean var8 = true;
      if (var6 != null) {
         int var9 = var7.size();
         if (var9 > 0) {
            ArrayList var10 = var7;
            float var11 = 2.0F;
            float var12 = this.method_814();
            float var13 = 2.0F;
            float var14 = var12 + var13;
            float var15 = this.field_1060.field_1943.field_1515;
            float var16 = (float)(this.field_1060.field_1943.method_1228() + 2);
            if (class_98.field_1052) {
               var12 += 15.0F * this.field_1060.field_1955;
               var14 += 15.0F * this.field_1060.field_1955;
               var11 = 5.0F;
               var14 += 2.0F;
               var13 += 2.0F;
               var16 += 3.0F;
            }

            float var18;
            if (!class_98.field_943) {
               boolean var17 = true;
               if (this.field_1059.field_945 != null && this.field_1059.field_1026 == 1 && this.field_1059.field_945.bS) {
                  var17 = false;
               }

               if (var17) {
                  var18 = this.method_819();
                  var16 += var18;
                  var16 += 2.0F;
               }
            }

            int var61 = 0;
            var18 = 0.0F;
            float var19 = 0.0F;
            float var20 = 0.0F;
            Iterator var21 = var7.iterator();

            float var23;
            float var25;
            while(var21.hasNext()) {
               class_121 var22 = (class_121)var21.next();
               if (this.method_815(var22, var5)) {
                  ++var61;
                  var23 = var14 * var22.method_1071();
                  int var24 = var2;
                  if (var22.method_1072() > 0) {
                     var24 = var22.method_1072();
                  }

                  var25 = var15 / (float)var24;
                  if (var19 + var25 - 0.1F >= var15) {
                     var20 += var18;
                     var18 = 0.0F;
                     var19 = 0.0F;
                  }

                  if (var18 < var23) {
                     var18 = var23;
                  }

                  var19 += var25;
               }
            }

            if (var19 > 0.0F) {
               var20 += var18;
            }

            float var62 = var16 + var20;
            float var63 = var16;
            if (this.field_1060.field_1937.showUnitGroups) {
               var23 = this.field_1060.field_1974 - 42.0F * this.field_1060.field_1955;
            } else {
               var23 = this.field_1060.field_1974;
            }

            var16 -= var6.field_119;
            float var64 = 1.0F;
            var25 = 0.0F;
            boolean var26 = var62 - var6.field_119 > var23 + 5.0F;
            boolean var27 = var6.field_119 > 5.0F;
            this.field_1116 = var26 || var27;
            if (this.field_1060.field_1937.mouseSupport && !this.field_1059.method_708(this.field_1060.method_1615(), this.field_1060.method_1616())) {
               int var28 = this.field_1060.method_1631();
               if (var28 != 0) {
                  var25 = -((float)var28 / 120.0F);
               }
            }

            float var65;
            if (var26) {
               var65 = 0.5F;
               var64 = Math.max(1.0F, 0.1F * Math.abs(var62 - var6.field_119 - var23));
               this.field_1077.field_2352 = (int)(this.field_1060.field_1956 - var15 + 2.0F);
               this.field_1077.field_2354 = (int)(this.field_1060.field_1956 - 2.0F);
               this.field_1077.field_2353 = (int)(var23 - var12 * var65);
               this.field_1077.field_2355 = (int)((float)this.field_1077.field_2353 + var12 * var65);
               if (this.field_1059.method_790(this.field_1077.field_2352, this.field_1077.field_2353, this.field_1077.method_1904(), this.field_1077.method_1905(), "\\/", class_166.field_1476, false, Color.method_3077(80, 100, 150, 100), this.field_1059.field_1008) && this.field_1059.method_787()) {
                  this.field_1115 += 3.0F * var14;
                  this.field_1059.field_976 = false;
               }

               if (var25 > 0.0F) {
                  this.field_1115 = (float)((double)this.field_1115 + 0.5D * (double)var14);
               }

               var23 -= var14 * var65 + 2.0F;
            }

            if (var27) {
               var65 = 0.5F;
               var64 = Math.max(1.0F, 0.1F * Math.abs(var6.field_119));
               this.field_1077.field_2352 = (int)(this.field_1060.field_1956 - var15 + 2.0F);
               this.field_1077.field_2354 = (int)(this.field_1060.field_1956 - 2.0F);
               this.field_1077.field_2353 = (int)var63;
               this.field_1077.field_2355 = (int)((float)this.field_1077.field_2353 + var12 * var65);
               if (this.field_1059.method_790(this.field_1077.field_2352, this.field_1077.field_2353, this.field_1077.method_1904(), this.field_1077.method_1905(), "/\\", class_166.field_1476, false, Color.method_3077(80, 100, 150, 100), this.field_1059.field_1008) && this.field_1059.method_787()) {
                  this.field_1115 -= 3.0F * var14;
                  this.field_1059.field_976 = false;
               }

               if (var25 < 0.0F) {
                  this.field_1115 = (float)((double)this.field_1115 - 0.5D * (double)var14);
               }

               var63 += var14 * var65 + 2.0F;
            }

            this.field_1060.field_1935.method_87();
            this.field_1124.method_1969(0.0F, var63 - 1.0F, this.field_1060.field_1956, var23 + 1.0F);
            this.field_1060.field_1935.method_84(this.field_1124);
            var6.field_119 += this.field_1115;
            this.field_1115 = 0.0F;
            var65 = 0.0F;
            int var29 = (int)(var62 - var23);
            if (var29 > 0) {
               if (var6.field_119 > (float)var29 + var65) {
                  var6.field_119 = (float)var29 + var65;
               }

               if (var6.field_119 < 0.0F - var65) {
                  var6.field_119 = 0.0F - var65;
               }
            } else {
               var6.field_119 = 0.0F;
            }

            var3 = true;
            int var30 = -1;
            float var31 = var16;
            var18 = 0.0F;
            var19 = 0.0F;
            this.method_806();
            Iterator var32 = var7.iterator();

            label555:
            while(true) {
               class_121 var33;
               do {
                  if (!var32.hasNext()) {
                     this.field_1060.field_1935.method_88();
                     this.field_1124.method_1968();
                     break label555;
                  }

                  var33 = (class_121)var32.next();
               } while(!this.method_815(var33, var5));

               ++var4;
               boolean var34 = this.method_816(var33, var5);
               ++var30;
               float var35 = var12 * var33.method_1071();
               int var36 = var2;
               if (var33.method_1072() > 0) {
                  var36 = var33.method_1072();
               }

               float var37 = var15 / (float)var36;
               if (var19 + var37 - 0.1F > var15) {
                  var31 += var18 + var13;
                  var18 = 0.0F;
                  var19 = 0.0F;
               }

               if (var18 < var35) {
                  var18 = var35;
               }

               this.field_1077.field_2352 = (int)(this.field_1060.field_1956 - var15 + var11);
               this.field_1077.field_2354 = (int)((float)this.field_1077.field_2352 + var37 - var11 * 2.0F);
               this.field_1077.field_2353 = (int)var31;
               this.field_1077.field_2355 = (int)((float)this.field_1077.field_2353 + var35);
               this.field_1077.method_1913((int)var19, 0);
               boolean var38 = true;
               this.field_1078.method_1971(this.field_1077);
               if (!this.field_1078.method_1975(this.field_1124)) {
                  var38 = false;
               }

               var19 += var37;
               boolean var40 = method_805(var33);
               Paint var41 = this.field_1066;
               if (var34) {
                  var41.method_2788(Color.method_3077(70, 100, 100, 100));
               } else {
                  var41.method_2788(Color.method_3077(50, 170, 100, 100));
               }

               if (var40) {
                  var41.method_2788(Color.method_3077(100, 180, 100, 100));
               }

               boolean var42 = false;
               boolean var43 = false;
               if (this.field_1105 == var6 && this.field_1106 == var33) {
                  var42 = true;
               }

               if (this.field_1059.field_984 == var33) {
                  var42 = true;
                  var43 = true;
               }

               if (var42) {
                  var41.method_2788(Color.method_3077(80, 100, 100, 200));
               }

               if (var43) {
                  var41.method_2788(Color.method_3077(80, 200, 100, 100));
               }

               Object var44;
               if (var33.method_1069()) {
                  var44 = this.field_1067;
                  var41.method_2790((int)((float)var41.method_2789() * 0.7F));
                  ((Paint)var44).method_2790((int)((float)((Paint)var44).method_2789() * 0.7F));
               } else {
                  var44 = this.field_1069;
               }

               if (var38 && var33.method_1060() != class_518.field_4707) {
                  this.field_1059.method_783(this.field_1077, var41, (Paint)var44);
                  float var45 = this.method_817(var33, var5);
                  if (var45 >= 0.0F) {
                     this.field_1068.method_2791(80, 0, 0, 100);
                     this.field_1083.method_1912(this.field_1077);
                     Rect var10000 = this.field_1083;
                     var10000.field_2354 = (int)((float)var10000.field_2354 - (1.0F - var45) * (float)this.field_1083.method_1904());
                     this.field_1060.field_1935.method_79(this.field_1083, this.field_1068);
                  }

                  if (var42) {
                     this.field_1059.method_784(this.field_1077, Color.method_3077(255, 100, 0, 0));
                  } else {
                     this.field_1059.method_784(this.field_1077, Color.method_3077(255, 0, 0, 0));
                  }
               }

               class_427 var66 = this.method_807(var33, var30, var10);
               if (var66 != null && var38) {
                  String var46 = var66.method_2717();
                  this.field_1060.field_1935.method_78(var46, (float)(this.field_1077.field_2352 + 3), (float)(this.field_1077.field_2353 + 14), this.field_1059.field_1006);
               }

               boolean var67 = false;
               class_24 var47 = var33.method_1055();
               class_306 var48 = var33.method_1066();
               float var49;
               int var50;
               float var72;
               if (var48 != null) {
                  var49 = (float)this.field_1077.method_1905() * 0.7F / (float)var48.method_2127();
                  var50 = (int)((float)this.field_1077.method_1906() - (float)var48.field_2533 * var49);
                  int var51 = (int)((float)this.field_1077.method_1907() - (float)var48.field_2534 * var49);
                  this.field_1070.method_2791(100, 255, 255, 255);
                  this.field_1060.field_1935.method_70(var48, (float)var50, (float)var51, this.field_1070, 0.0F, var49);
                  var67 = true;
               } else if (var47 != null) {
                  var49 = (float)this.field_1077.method_1906();
                  float var70 = (float)this.field_1077.method_1907();
                  var72 = (float)this.field_1077.method_1905() * 0.7F;
                  float var52 = (float)this.field_1077.method_1905() * 0.95F;
                  if (class_98.field_1052) {
                     var72 = (float)this.field_1077.method_1905() * 0.4F;
                     var52 = (float)this.field_1077.method_1905() * 0.85F;
                  }

                  this.field_1080.method_1971(this.field_1077);
                  if (this.field_1080.method_1975(this.field_1124)) {
                     this.field_1060.field_1935.method_87();
                     this.field_1060.field_1935.method_84(this.field_1080);
                     class_469.method_3061(var47, var49, var70, 0.0F, 0.0F, var6.field_143, var72, var52, false, false, var33.method_1057());
                     this.field_1060.field_1935.method_88();
                  }

                  var67 = true;
               }

               if (var38) {
                  String var68 = var33.method_1062();
                  if (var40) {
                     this.field_1060.field_1935.method_69(this.field_1099, (float)(this.field_1077.field_2352 + 25), this.field_1077.method_1909(), (Paint)null);
                  }

                  this.field_1065.method_2776(this.field_1059.field_1007);
                  if (!var34) {
                     this.field_1065.method_2788(Color.method_3077(255, 0, 100, 0));
                  }

                  if (var33.method_1060() == class_518.field_4701) {
                     this.field_1065.method_2791(255, 255, 255, 255);
                  } else if (var33.method_1060() != class_518.field_4702 && var33.method_1060() != class_518.field_4705) {
                     if (var33.method_1060() == class_518.field_4703) {
                        class_24 var71 = var33.method_1055();
                        if (var71 != null && var71.method_133() > 1) {
                           if (!var34) {
                              this.field_1065.method_2791(255, 117, 120, 15);
                           } else {
                              this.field_1065.method_2791(255, 235, 240, 30);
                           }
                        }
                     } else if (var33.method_1060() == class_518.field_4706 || var33.method_1060() == class_518.field_4707) {
                        this.field_1065.method_2791(155, 255, 255, 255);
                     }
                  } else if (!var34) {
                     this.field_1065.method_2791(255, 19, 101, 94);
                  } else {
                     this.field_1065.method_2791(255, 39, 202, 189);
                  }

                  var50 = this.field_1060.field_1935.method_101(var68, this.field_1065);
                  var72 = this.field_1077.method_1909() + (float)(var50 / 2);
                  if (var33.method_1060() == class_518.field_4706 || var33.method_1060() == class_518.field_4707) {
                     var72 = this.field_1077.method_1909();
                  }

                  if (var67 && !var68.contains("\n")) {
                     var72 = (float)(this.field_1077.field_2355 - 6);
                  }

                  if (var33.method_1060() != class_518.field_4706 && var33.method_1060() != class_518.field_4707) {
                     this.field_1060.field_1935.method_78(var68, this.field_1077.method_1908(), var72, this.field_1065);
                  } else {
                     class_468.method_3048(var68, this.field_1077.method_1908(), var72, this.field_1065);
                  }
               }

               boolean var69 = false;
               boolean var73 = false;
               boolean var75 = false;
               if (var66 != null && var66.method_2715()) {
                  var69 = true;
                  var75 = true;
               }

               this.field_1059.method_791((float)this.field_1077.field_2352, (float)this.field_1077.field_2353, (float)this.field_1077.method_1904(), (float)this.field_1077.method_1905());
               if (!this.field_1062 && this.field_1077.method_1914((int)this.field_1059.field_960, (int)this.field_1059.field_961) && this.field_1124.method_1973((float)((int)this.field_1059.field_960), (float)((int)this.field_1059.field_961))) {
                  if (class_236.method_1654()) {
                     var73 = true;
                  }

                  if ((this.field_1059.field_976 || this.field_1059.field_965) && this.field_1059.field_976 && this.field_1059.method_787()) {
                     this.field_1059.field_976 = false;
                     var69 = true;
                  }
               }

               if (class_236.method_1654() && this.field_1059.field_984 == null) {
                  if (var73) {
                     this.field_1105 = var6;
                     this.field_1106 = var33;
                  } else if (this.field_1106 == var33) {
                     this.field_1105 = null;
                     this.field_1106 = null;
                  }
               }

               boolean var74 = false;
               if (var69 && !var75 && this.field_1060.field_1937.mouseSupport && this.field_1060.method_1620(2)) {
                  var74 = true;
               }

               if (var69) {
                  if (var33.method_1064(var6, var74)) {
                     var69 = false;
                  }

                  if (this.field_1060.field_1948.method_2658()) {
                     var69 = false;
                  }
               }

               if (var69) {
                  boolean var53;
                  if (var33.method_1059() != class_516.field_4683 && var33.method_1059() != class_516.field_4685) {
                     if (var33.method_1059() != class_516.field_4695 && var33.method_1059() != class_516.field_4694 && var33.method_1059() != class_516.field_4692) {
                        if (var33.method_1059() != class_516.field_4686 && var33.method_1059() != class_516.field_4687 && var33.method_1059() != class_516.field_4688 && var33.method_1059() != class_516.field_4689) {
                           if (var33.method_1059() == class_516.field_4684) {
                              if (method_805(var33)) {
                                 this.field_1060.field_1933.method_3322(class_525.field_4753, 0.8F);
                              } else if (!var34) {
                                 this.field_1060.field_1933.method_3322(class_525.field_4753, 0.8F);
                              } else {
                                 this.field_1060.field_1933.method_3322(class_525.field_4752, 0.8F);
                              }

                              this.field_1105 = null;
                              this.field_1106 = null;
                              this.field_1059.field_982 = var6;
                              this.field_1059.field_984 = var33;
                              this.field_1059.field_987 = 0.0F;
                              this.field_1059.field_998 = -99.0F;
                              this.field_1059.field_999 = -99.0F;
                              if (!this.field_1059.field_986) {
                                 this.field_1059.field_988 = this.field_1060.field_1975;
                                 this.field_1059.field_989 = this.field_1060.field_1976;
                              }

                              this.field_1059.field_986 = true;
                              this.field_1059.field_990 = false;
                              this.field_1060.field_1932.method_2598();
                           } else if (var33.method_1059() == class_516.field_4693) {
                              var33.method_1070(var6);
                           } else if (var33.method_1059() != class_516.field_4691) {
                              throw new RuntimeException("unknown gui action:" + var33.method_1059());
                           }
                        } else {
                           var53 = false;
                           boolean var76 = false;
                           if (var33.method_1059() == class_516.field_4689) {
                              var76 = true;
                           }

                           if (var74 && var76) {
                              var53 = true;
                           }

                           if (var53) {
                              class_324 var77 = this.field_1059.method_752();
                              if (!var33.method_1074()) {
                                 this.field_1059.method_740(var77, var33.method_1043());
                              } else {
                                 this.field_1059.method_738(var77, var33.method_1043(), var53);
                              }

                              var77.field_2600 = true;
                              var77.method_2198(var33.method_1043());
                           } else if (!var34) {
                              this.field_1060.field_1933.method_3322(class_525.field_4753, 0.8F);
                           } else {
                              this.field_1105 = null;
                              this.field_1106 = null;
                              this.field_1059.field_984 = var33;
                           }
                        }
                     } else if (var74) {
                        if (var33 != null && var33.equals(this.field_1059.field_984)) {
                           this.field_1059.method_724();
                        }
                     } else if (!var34) {
                        this.field_1060.field_1933.method_3322(class_525.field_4753, 0.8F);
                     } else {
                        this.field_1105 = null;
                        this.field_1106 = null;
                        this.field_1059.field_984 = var33;
                     }
                  } else {
                     this.field_1059.field_984 = null;
                     var53 = false;
                     if (var75) {
                        var53 = true;
                     } else if (!var33.method_1052()) {
                        var53 = true;
                     } else {
                        if (this.field_1105 == var6 && this.field_1106 == var33) {
                           var53 = true;
                        }

                        this.field_1105 = var6;
                        this.field_1106 = var33;
                     }

                     if (var53) {
                        byte var54 = 1;
                        if (var33.method_1058()) {
                           if (this.field_1059.method_716(this.field_1060)) {
                              var54 = 5;
                           }

                           if (this.field_1059.method_717(this.field_1060)) {
                              var54 = 10;
                           }
                        }

                        boolean var55 = false;
                        if (!var75) {
                           boolean var56 = false;
                           if (var6 != null && var33.method_1047(var6, false) != -1) {
                              var56 = true;
                           }

                           if (var74 && var56) {
                              var55 = true;
                           }
                        }

                        if (method_805(var33)) {
                           this.field_1060.field_1933.method_3322(class_525.field_4753, 0.8F);
                        } else if (!var34 && !var55) {
                           this.field_1060.field_1933.method_3322(class_525.field_4753, 0.8F);
                        } else {
                           if (var33.method_1058() && !var55 && this.field_1060.field_1915.method_925() <= this.field_1060.field_1915.method_924()) {
                              this.method_802(this.field_1112);
                           }

                           this.field_1060.field_1933.method_3322(class_525.field_4752, 0.8F);

                           for(int var78 = 0; var78 < var54; ++var78) {
                              class_324 var57 = this.field_1059.method_752();
                              if (!var33.method_1074()) {
                                 this.field_1059.method_740(var57, var33.method_1043());
                              } else {
                                 this.field_1059.method_738(var57, var33.method_1043(), var55);
                              }

                              if (var55) {
                                 var57.field_2600 = true;
                              }

                              var57.method_2198(var33.method_1043());
                           }
                        }
                     }
                  }
               }

               if (this.field_1106 == var33) {
                  var8 = var34;
               }
            }
         }
      }

      if (var6 != null && var6 == this.field_1105) {
         if (this.field_1106 != null) {
            boolean var58 = true;
            if (class_236.field_1900) {
               var58 = false;
            }

            boolean var59 = false;
            if (this.field_1106.method_1052()) {
               var59 = true;
            }

            if (class_236.method_1654() && this.field_1106.method_1053()) {
               var59 = true;
            }

            if (var59) {
               boolean var60 = true;
               if (!var8) {
                  var60 = false;
               }

               if (this.field_1059.method_782(this.field_1106, var58, this.field_1105, !var60, true)) {
                  this.field_1105 = null;
               }
            }
         }
      } else {
         this.field_1105 = null;
      }

      return var4;
   }

   // $FF: renamed from: i () float
   float method_819() {
      float var1 = this.field_1060.field_1957 / 14.0F / this.field_1060.field_1955;
      var1 = class_296.method_2023(var1, 25.0F * this.field_1060.field_1955, 40.0F * this.field_1060.field_1955);
      var1 = (float)((double)var1 * 0.7D);
      return var1;
   }

   // $FF: renamed from: a (float, int) void
   void method_820(float var1, int var2) {
      boolean var3 = true;
      if (var2 == 0) {
         var3 = true;
      }

      if (class_98.field_943) {
         var3 = false;
      }

      if (this.field_1059.field_1026 > 0) {
         if (this.field_1059.field_945 != null && this.field_1059.field_1026 == 1 && this.field_1059.field_945.bS) {
            var3 = false;
         }

         if (var3) {
            float var4 = this.method_819();
            if (this.field_1059.method_788((int)(this.field_1060.field_1956 - this.field_1060.field_1943.field_1515 + 2.0F), this.field_1060.field_1943.method_1228() + 2, (int)(this.field_1060.field_1943.field_1515 - 4.0F), (int)var4, this.field_1107, class_166.field_1478, false)) {
               this.field_1059.method_724();
               this.field_1059.method_762();
            }
         }

         class_107 var18 = null;
         boolean var5 = false;
         this.field_1125.clear();
         class_39 var6 = null;
         class_39[] var7 = this.field_1059.field_1056.method_1326();
         int var8 = 0;

         int var9;
         for(var9 = this.field_1059.field_1056.size(); var8 < var9; ++var8) {
            class_39 var10 = var7[var8];
            if (var10.field_177) {
               var6 = var10;
               if (this.field_1059.method_769(var10)) {
                  class_24 var11 = var10.method_295();
                  Integer var12 = (Integer)this.field_1125.get(var11);
                  if (var12 == null) {
                     this.field_1125.put(var11, 1);
                  } else {
                     this.field_1125.put(var11, var12 + 1);
                  }

                  var5 = true;
               } else {
                  var18 = var10.field_143;
               }
            }
         }

         boolean var19 = this.field_1060.field_1918;
         if (var18 != null && this.field_1060.field_1915 != null && var18.method_919(this.field_1060.field_1915)) {
            var19 = true;
         }

         var9 = (int)this.method_814();
         int var20 = var9 + 2;
         int var21 = (int)(10.0F * this.field_1060.field_1955);
         float var22 = (float)(this.field_1060.field_1943.method_1228() + var9 + 30);
         float var14 = this.field_1060.field_1956 - this.field_1060.field_1961 + (float)var21;
         float var13 = var22 + 5.0F;
         if (var6 != null) {
            var13 += (float)var20;
            var13 += (float)(var20 * var2);
            if (this.field_1059.field_954) {
               var13 -= (float)(2 * var20) * 0.4F;
            }
         }

         this.field_1077.method_1911((int)var14, (int)var13, (int)(var14 + this.field_1060.field_1961 - (float)(var21 * 2)), (int)(var13 + (float)var9));
         boolean var15 = false;
         if (!class_98.field_1053) {
            if (var2 < 3 && !var5 && var18 != null) {
               Paint var16 = this.field_1059.field_1010;
               if (this.field_1060.field_1915.method_944(var18)) {
                  var16 = this.field_1059.field_1011;
               }

               String var17 = this.method_821(var18);
               this.field_1059.method_780(var17, this.field_1077, var16, var16);
               var15 = true;
            }

            if (this.field_1059.method_734() == 1 && var6 != null && (var6.method_275() <= 3 || var18 != null && !var19)) {
               String var23 = this.method_822(var6, false);
               if (var15) {
                  var23 = "\n" + var23;
                  var23 = "\n" + var23;
                  var23 = "\n" + var23;
               }

               Paint var24 = this.field_1065;
               var24.method_2775();
               var24.method_2788(Color.method_3077(50, 100, 100, 100));
               this.field_1059.method_780(var23, this.field_1077, this.field_1059.field_1012, this.field_1059.field_1012);
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) java.lang.String
   public String method_821(class_107 var1) {
      String var2 = "";
      if (this.field_1060.field_1915.method_944(var1)) {
         var2 = var2 + this.field_1108;
      } else if (this.field_1060.field_1915.method_943(var1)) {
         var2 = var2 + this.field_1109;
      } else if (var1 == class_107.field_1224) {
         var2 = var2 + this.field_1110;
      } else {
         var2 = var2 + "Team - " + (var1.field_1231 + 1);
      }

      var2 = var2 + "\n";
      if (var1.field_1233 != null) {
         var2 = var2 + var1.field_1233;
      }

      if (!var1.field_1234 && this.field_1060.method_1578() && var1.method_926() == -1) {
         var2 = var2 + "\n";
         var2 = var2 + "(disconnected)";
      }

      return var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) java.lang.String
   public String method_822(class_39 var1, boolean var2) {
      String var3 = "";
      if (var2) {
         var3 = var3 + var1.method_295().method_139() + "\n";
      }

      if (var1.method_316() > 0.0F) {
         var3 = var3 + "$" + (int)(var1.field_167 / var1.field_168 * (float)var1.method_309()) + "\n";
      } else {
         var3 = var3 + (int)Math.ceil((double)var1.field_167) + "/" + (int)var1.field_168 + "\n";
      }

      if (var1.field_173 != 0.0F) {
         var3 = var3 + "(" + (int)var1.field_170 + "/" + (int)var1.field_173 + ")\n";
      }

      float var4 = var1.method_294();
      if (var4 != 0.0F) {
         var3 = var3 + "+$" + class_296.method_2058(var4, 1) + "\n";
      }

      var3 = class_296.method_2090(var3);
      return var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) java.lang.String
   public static String method_823(class_121 var0, boolean var1) {
      String var2;
      if (var1) {
         var2 = "\n";
      } else {
         var2 = " | ";
      }

      String var3 = "";
      if (var0 instanceof class_134) {
         class_134 var4 = (class_134)var0;
         float var5 = var4.method_1100();
         if (var5 < 1.0F) {
            class_236 var6 = class_236.method_1549();
            float var7 = -1.0F;
            class_39[] var8 = var6.field_1939.field_1056.method_1326();
            int var9 = 0;

            for(int var10 = var6.field_1939.field_1056.size(); var9 < var10; ++var9) {
               class_39 var11 = var8[var9];
               float var12 = var11.method_293();
               if (var7 == -1.0F || var12 < var7) {
                  var7 = var12;
               }
            }

            if (var7 == -1.0F) {
               var7 = 1.0F;
            }

            float var13 = 1.0F / (var4.method_1100() * var7 * 60.0F);
            var3 = var3 + class_296.method_2059(var13) + var2;
         }
      }

      var3 = class_296.method_2091(var3, var2);
      return var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean, boolean, boolean) java.lang.String
   public static String method_824(class_39 var0, boolean var1, boolean var2, boolean var3) {
      String var4;
      if (var2) {
         var4 = "\n";
      } else {
         var4 = " | ";
      }

      String var5 = "";
      if (var1) {
         var5 = var5 + var0.method_295().method_139() + var4;
      }

      if (!var3) {
         var5 = var5 + "HP: " + (int)Math.ceil((double)var0.field_167) + "/" + (int)var0.field_168 + var4;
      } else {
         var5 = var5 + "HP: " + (int)var0.field_168 + var4;
      }

      if (var0.field_173 != 0.0F) {
         if (!var3) {
            var5 = var5 + "Shield: " + (int)var0.field_170 + "/" + (int)var0.field_173 + var4;
         } else {
            var5 = var5 + "Shield: " + (int)var0.field_173 + var4;
         }
      }

      float var6;
      if (var0 instanceof class_66) {
         var6 = ((class_66)var0).field_549.field_4285;
         if (var6 >= 1.0F) {
            var5 = var5 + "Armour: " + (int)var6 + var4;
         }
      }

      var6 = var0.method_294();
      if (var6 != 0.0F) {
         var5 = var5 + "Income: +$" + class_296.method_2058(var6, 1) + var4;
      }

      if (var0 instanceof class_44) {
         class_44 var7 = (class_44)var0;
         if (var7.method_461() != 0.0F && !var3) {
            var5 = var5 + "Energy: " + class_296.method_2057(var0.field_174) + "/" + class_296.method_2057(var7.method_461()) + var4;
         }

         float var8 = var7.method_458();
         if (!var7.method_432()) {
            var8 = 0.0F;
         }

         if (var8 != 0.0F) {
            var5 = var5 + "Speed: " + class_296.method_2057(var8) + var4;
         }

         if (var7.l()) {
            ArrayList var9 = var7.method_443();
            if (var9.size() > 0) {
               var5 = var5 + "Attack: ";
               boolean var10 = true;

               class_285 var12;
               for(Iterator var11 = var9.iterator(); var11.hasNext(); var5 = var5 + "/" + class_296.method_2057(var12.method_1982()) + "s") {
                  var12 = (class_285)var11.next();
                  if (!var10) {
                     var5 = var5 + ", ";
                  }

                  var10 = false;
                  var5 = var5 + class_296.method_2057(var12.field_2434);
                  if (var12.field_2437 > 1) {
                     var5 = var5 + "x" + var12.field_2437;
                  }
               }

               var5 = var5 + var4;
            }
         }

         float var13 = var7.method_439();
         if (!var7.l()) {
            var13 = 0.0F;
         }

         if (var13 != 0.0F) {
            var5 = var5 + "Range: " + class_296.method_2057(var13) + var4;
         }

         if (var3 && var7.bx()) {
            var5 = var5 + "Upgradable" + var4;
         }
      }

      var5 = class_296.method_2091(var5, var4);
      return var5;
   }

   // $FF: renamed from: j () void
   void method_825() {
      Iterator var1 = this.field_1126.iterator();

      while(var1.hasNext()) {
         class_113 var2 = (class_113)var1.next();
         var2.method_1014();
      }

      this.field_1113 = null;
      this.field_1114 = 0.0F;
   }

   // $FF: renamed from: a (int, int, int, java.lang.String, java.lang.String, android.graphics.Paint, float) void
   void method_826(int var1, int var2, int var3, String var4, String var5, Paint var6, float var7) {
      int var8 = var3 * 2;
      int var9 = (int)(40.0F * this.field_1060.field_1955);
      int var10 = var1 + var3 / 2;
      int var11 = (int)((float)(var2 - var9) - 30.0F * this.field_1060.field_1955);
      this.field_1127.method_1911(var10 - var8 / 2, var11, var8, var9);
      this.field_1059.method_785(this.field_1127.field_2352, this.field_1127.field_2353, this.field_1127.field_2354, this.field_1127.field_2355, "", Color.method_3077(80, 100, 100, 100), this.field_1059.field_1007);
      this.field_1077.method_1911(this.field_1127.field_2352, this.field_1127.field_2353, this.field_1127.field_2354, this.field_1127.field_2355);
      Rect var10000 = this.field_1077;
      var10000.field_2354 = (int)((float)var10000.field_2354 * var7);
      this.field_1060.field_1935.method_82(this.field_1077, var6);
      this.field_1060.field_1935.method_78(var4, (float)var10, (float)var11 + (this.field_1059.field_1007.method_2803() + 5.0F) * 1.0F, this.field_1059.field_1007);
      this.field_1060.field_1935.method_78(var5, (float)var10, (float)var11 + (this.field_1059.field_1007.method_2803() + 5.0F) * 2.0F, this.field_1059.field_1007);
   }

   // $FF: renamed from: k () void
   void method_827() {
      this.field_1129.clear();
      this.field_1129.add(new a$1(this, "Finish game"));
      this.field_1129.add(new a$2(this, "Keep playing"));
   }

   // $FF: renamed from: e (float) void
   void method_828(float var1) {
      boolean var2 = false;
      if (this.field_1060.field_2006 && !this.field_1060.field_2007) {
         var2 = true;
      }

      if (!this.field_1060.field_2006) {
         this.field_1130 = false;
      } else if (!this.field_1130) {
         this.field_1130 = true;
         if (!this.field_1060.field_1885 && this.field_1060.field_1937.numberOfWins >= 5 && !this.field_1060.field_1937.rateGameShown && class_236.field_1888) {
            this.field_1134 = true;
            this.field_1060.field_1937.rateGameShown = true;
            this.field_1060.field_1937.save();
         }
      }

      if (var2 && !this.field_1059.field_955) {
         int var3 = this.field_1060.method_1599(210);
         this.field_1077.field_2352 = (int)(this.field_1060.field_1972 / 2.0F - (float)(var3 / 2));
         this.field_1077.field_2354 = (int)(this.field_1060.field_1972 / 2.0F + (float)(var3 / 2));
         int var4 = this.field_1060.method_1599(30);
         int var5 = var4 + this.field_1060.method_1599(30);
         int var6 = this.field_1129.size();
         int var7 = this.field_1060.method_1599(40) + var5 * var6;
         float var8 = this.field_1060.field_1960 - (float)(var7 / 2);
         if (var8 > 50.0F) {
            var8 /= 2.0F;
         }

         if (var8 < 0.0F) {
            var8 = 0.0F;
         }

         this.field_1077.field_2353 = (int)var8;
         this.field_1077.field_2355 = this.field_1077.field_2353 + var7;
         this.field_1060.field_1935.method_72(this.field_1059.field_1037, this.field_1077, (Paint)null);
         this.field_1060.field_1935.method_79(this.field_1077, this.field_1059.field_1019);
         Rect var9 = new Rect(this.field_1077);
         int var10 = this.field_1077.field_2353 + this.field_1060.method_1599(20);
         int var11 = this.field_1060.method_1599(140);
         int var12 = (int)(this.field_1060.field_1972 / 2.0F - (float)(var11 / 2));
         int var14 = Color.method_3077(140, 100, 100, 100);
         int var15 = var12 + var11 / 2;
         Paint var17 = this.field_1071;
         String var18 = "Victory!";
         var17.method_2815(var18, 0, var18.length(), this.field_1079);
         this.field_1060.field_1935.method_78(var18, (float)var15, (float)var10 - (var17.method_2805() + var17.method_2806()) / 2.0F, var17);
         int var13 = var10 + this.field_1079.method_1905();
         int var16 = var9.field_2355 + 30;
         String var19 = "123|";
         this.field_1073.method_2815(var19, 0, var19.length(), this.field_1079);
         float var20 = (float)(this.field_1079.method_1905() + 6);
         float var21 = 1.5F;

         for(Iterator var22 = this.field_1137.iterator(); var22.hasNext(); var16 = (int)((float)var16 + var20)) {
            class_155 var23 = (class_155)var22.next();
            if (var23.field_1436 != 1.0F && var21 > 0.0F) {
               var23.field_1436 = class_296.method_2021(var23.field_1436, 1.0F, 0.01F * var21 * var1);
               var21 -= 1.0F - var23.field_1436;
            }

            float var24 = var23.field_1436 - 0.5F;
            var24 = class_296.method_2023(var24, 0.0F, 1.0F);
            String var25 = "";
            if (var23.field_1434 != null) {
               var25 = var23.field_1434;
            } else {
               var25 = "" + (int)(var23.field_1435 * var24);
               if (var24 <= 0.0F) {
                  var25 = " ";
               }
            }

            String var26 = var23.field_1433;
            float var27 = var23.field_1436 * 2.2F;
            var27 = class_296.method_2023(var27, 0.0F, 1.0F);
            int var28 = 0;
            if (var27 > 0.0F) {
               var28 = (int)((float)var26.length() * var27);
            }

            var28 = class_296.method_2024(var28, 0, var26.length());
            String var29 = "";
            if (var28 > 0 && var28 < var26.length() - 1) {
               var29 = "_";
            }

            var26 = var26.substring(0, var28) + var29 + class_296.method_2069(" ", var26.length() + var29.length() - var28);
            this.field_1060.field_1935.method_78(var26, (float)var15 - 8.0F * this.field_1073.method_2803(), (float)var16, this.field_1073);
            this.field_1060.field_1935.method_78(var25, (float)var15 + 8.0F * this.field_1073.method_2803(), (float)var16, this.field_1074);
         }

         for(int var30 = 0; var30 < this.field_1129.size(); ++var30) {
            class_159 var31 = (class_159)this.field_1129.get(var30);
            if (this.field_1059.method_790(var12, var13, var11, var4, var31.method_1173(), class_166.field_1476, false, var14, this.field_1059.field_1008)) {
               this.field_1134 = false;
               var31.method_1174();
            }

            var13 += var5;
         }

         if (this.field_1134) {
            this.method_829(var1);
         }
      }

   }

   // $FF: renamed from: f (float) void
   void method_829(float var1) {
      int var2 = this.field_1060.method_1599(180);
      int var3 = (int)(this.field_1060.field_1972 / 2.0F - (float)(var2 / 2));
      int var4 = this.field_1060.method_1599(120);
      int var5 = (int)(this.field_1060.field_1974 - (float)var4);
      this.field_1077.method_1911(var3, var5, var2, var4);
      this.field_1060.field_1935.method_79(this.field_1077, this.field_1059.field_1019);
      int var6 = var3 + var2 / 2;
      Paint var8 = this.field_1071;
      String var9 = field_1131;
      var8.method_2815(var9, 0, var9.length(), this.field_1079);
      this.field_1060.field_1935.method_78(var9, (float)var6, (float)var5 - (var8.method_2805() + var8.method_2806()) / 2.0F, var8);
      int var10 = var5 + this.field_1079.method_1905();
      int var11 = this.field_1060.method_1599(70);
      int var12 = this.field_1060.method_1599(30);
      int var14 = var3 + var2 / 2 - this.field_1060.method_1599(10) - var11;
      int var15 = Color.method_3077(140, 100, 100, 100);
      String var13 = field_1132;
      if (this.field_1059.method_790(var14, var10, var11, var12, var13, class_166.field_1476, false, var15, this.field_1059.field_1008)) {
         this.field_1134 = false;
         class_11 var16 = this.field_1060.field_1882;
         if (var16 == null) {
            class_236.method_1588("showRateNow: gameView==null");
            return;
         }

         class_273 var17 = var16.method_34();
         if (var17 == null) {
            class_236.method_1588("showRateNow: inGameActivity==null");
            return;
         }

         var17.method_1895();
      }

      var14 = var3 + var2 / 2 + this.field_1060.method_1599(10);
      var13 = field_1133;
      if (this.field_1059.method_790(var14, var10, var11, var12, var13, class_166.field_1476, false, var15, this.field_1059.field_1008)) {
         this.field_1134 = false;
      }

   }

   // $FF: renamed from: a (float, boolean) void
   void method_830(float var1, boolean var2) {
      float var3 = this.field_1060.field_1955 * 0.7F;
      int var4 = this.field_1100.method_2128();
      int var5 = 18 + (int)((float)var4 * var3) / 2;
      int var6 = 18 + (int)((float)var4 * var3) / 2;
      if (this.field_1060.method_1622(111)) {
         boolean var7 = false;
         if (!this.field_1059.field_955) {
            var7 = this.field_1059.method_724();
         }

         if (!var7) {
            this.field_1059.field_955 = !this.field_1059.field_955;
         }
      }

      if (this.field_1059.field_955) {
         this.field_1128 += 0.008F * var1;
         if (this.field_1128 > 1.0F) {
            this.field_1128 = 0.0F;
         }

         float var21 = class_296.method_2098(this.field_1128 * 180.0F);
         this.field_1064.method_2790(150 + (int)(100.0F * var21));
      } else {
         this.field_1128 = 0.0F;
         this.field_1064.method_2790(80);
      }

      int var22 = (int)((float)var4 * var3);
      this.field_1079.method_1911(var5, var6, var5 + var22, var6 + var22);
      this.field_1079.method_1913(-(var22 / 2), -(var22 / 2));
      if (var2) {
         this.field_1060.field_1935.method_70(this.field_1100, (float)this.field_1079.field_2352, (float)this.field_1079.field_2353, this.field_1064, 0.0F, var3);
      }

      if (this.field_1059.field_976 && !this.field_1059.field_975 && this.field_1079.method_1914((int)this.field_1059.field_958, (int)this.field_1059.field_959)) {
         this.field_1059.field_976 = false;
         this.field_1059.field_955 = !this.field_1059.field_955;
      }

      if (this.field_1060.field_1948.method_2658()) {
         this.field_1064.method_2790(80);
         if (this.field_1060.field_1948.field_3451 != 1) {
            this.field_1064.method_2790(200);
         }

         var4 = this.field_1102.field_2532;
         var22 = (int)((float)var4 * this.field_1060.field_1955 * 1.6F);
         var5 = (int)(this.field_1060.field_1972 / 2.0F);
         var6 = 7 + (int)this.field_1059.field_1009.method_2803();
         String var8 = class_296.method_2095((long)(this.field_1060.field_1921 / 1000));
         this.field_1060.field_1935.method_78(var8, (float)var5, (float)var6, this.field_1059.field_1009);
         var6 += var22 / 2 + 10;
         var5 += var22 / 2 + 5;
         this.field_1079.method_1911(var5, var6, var5 + var22, var6 + var22);
         this.field_1079.method_1913(-this.field_1079.method_1904() / 2, -this.field_1079.method_1905() / 2);
         if (var2) {
            this.field_1060.field_1935.method_70(this.field_1102, (float)this.field_1079.field_2352, (float)this.field_1079.field_2353, this.field_1064, 0.0F, (float)(var22 / var4));
         }

         if (this.field_1059.field_976 && !this.field_1059.field_975 && this.field_1079.method_1914((int)this.field_1059.field_958, (int)this.field_1059.field_959)) {
            this.field_1059.field_976 = false;
            this.field_1060.field_1948.method_2643();
         }

         if (this.field_1060.field_1916 != 1.0F && var2) {
            this.field_1060.field_1935.method_78("x" + this.field_1060.field_1916, (float)(this.field_1079.method_1906() + var22 / 2), (float)this.field_1079.method_1907(), this.field_1059.field_1007);
         }

         class_306 var9 = this.field_1101;
         var4 = var9.field_2532;
         var22 = (int)((float)var4 * this.field_1060.field_1955 * 1.6F);
         var5 -= var22 + 5;
         this.field_1079.method_1911(var5, var6, var5 + var22, var6 + var22);
         this.field_1079.method_1913(-this.field_1079.method_1904() / 2, -this.field_1079.method_1905() / 2);
         if (var2) {
            this.field_1060.field_1935.method_70(var9, (float)this.field_1079.field_2352, (float)this.field_1079.field_2353, this.field_1064, 0.0F, (float)(var22 / var4));
         }

         if (this.field_1059.field_976 && !this.field_1059.field_975 && this.field_1079.method_1914((int)this.field_1059.field_958, (int)this.field_1059.field_959)) {
            this.field_1059.field_976 = false;
            this.field_1060.field_1948.method_2642();
         }
      }

      if (this.field_1059.field_955) {
         int var23 = this.field_1060.method_1599(180);
         this.field_1077.field_2352 = (int)(this.field_1060.field_1972 / 2.0F - (float)(var23 / 2));
         this.field_1077.field_2354 = (int)(this.field_1060.field_1972 / 2.0F + (float)(var23 / 2));
         int var24 = this.field_1060.method_1599(30);
         int var10 = var24 + this.field_1060.method_1599(30);
         Menu var11 = this.method_832();
         int var12 = 1 + var11.size();
         int var13 = this.field_1060.method_1599(40) + var10 * var12;
         this.field_1077.field_2353 = (int)(this.field_1060.field_1960 - (float)(var13 / 2));
         this.field_1077.field_2355 = (int)(this.field_1060.field_1960 + (float)(var13 / 2));
         if (var2) {
            this.field_1060.field_1935.method_72(this.field_1059.field_1037, this.field_1077, (Paint)null);
            this.field_1060.field_1935.method_79(this.field_1077, this.field_1059.field_1019);
         }

         int var14 = this.field_1077.field_2353 + this.field_1060.method_1599(40);
         int var15 = this.field_1060.method_1599(140);
         int var16 = (int)(this.field_1060.field_1972 / 2.0F - (float)(var15 / 2));
         int var18 = Color.method_3077(140, 100, 100, 100);
         if (this.field_1059.method_790(var16, var14, var15, var24, class_432.method_2744("menus.ingame.resume"), class_166.field_1476, false, var18, this.field_1059.field_1008)) {
            this.field_1059.field_976 = false;
            this.field_1059.field_1024 = 40.0F;
            this.field_1059.field_955 = false;
         }

         int var17 = var14 + var10;

         for(int var19 = 0; var19 < var11.size(); ++var19) {
            MenuItem var20 = var11.getItem(var19);
            if (this.field_1059.method_790(var16, var17, var15, var24, var20.getTitle().toString(), class_166.field_1476, false, var18, this.field_1059.field_1008)) {
               this.method_831(var20.getItemId());
               this.field_1059.field_976 = false;
               this.field_1059.field_1024 = 40.0F;
            }

            var17 += var10;
         }
      }

   }

   // $FF: renamed from: a (int) void
   void method_831(int var1) {
      class_11 var2 = this.field_1060.field_1882;
      if (var2 == null) {
         class_236.method_1588("selectMenuOption: gameView==null");
      } else {
         class_273 var3 = var2.method_34();
         if (var3 == null) {
            class_236.method_1588("selectMenuOption: inGameActivity==null");
         } else {
            var3.method_1890(var1);
         }
      }
   }

   // $FF: renamed from: l () android.view.Menu
   Menu method_832() {
      this.field_1136.clear();
      class_11 var1 = this.field_1060.field_1882;
      if (var1 == null) {
         class_236.method_1588("selectMenuOption: gameView==null");
         return this.field_1136;
      } else {
         class_273 var2 = var1.method_34();
         if (var2 == null) {
            class_236.method_1588("selectMenuOption: inGameActivity==null");
            return this.field_1136;
         } else {
            var2.method_1874(this.field_1136);
            return this.field_1136;
         }
      }
   }

   // $FF: renamed from: g (float) void
   void method_833(float var1) {
      float var2 = 40.0F * this.field_1060.field_1955;
      int var3 = (int)(this.field_1060.field_1974 - var2);
      int var4 = var3;
      int var5 = (int)(this.field_1060.field_1956 - this.field_1060.field_1961 + 10.0F);
      int var6 = (int)(this.field_1060.field_1961 - 20.0F) / 3;
      int var7 = var6 - 5;
      boolean var8 = true;
      boolean var9 = true;

      for(int var10 = 0; var10 < this.field_1126.size(); ++var10) {
         class_113 var11 = (class_113)this.field_1126.get(var10);
         var11.method_1017();
         if (this.field_1060.field_1937.keyboardSupport && var10 < this.field_1060.field_1940.field_3628.length) {
            if (this.field_1060.field_1940.field_3630[var10].method_2715()) {
               var11.method_1014();
               var11.method_1015();
            }

            if (this.field_1060.field_1940.field_3629[var10].method_2715()) {
               this.field_1059.method_724();
               var11.method_1013();
            }

            if (this.field_1060.field_1940.field_3628[var10].method_2715()) {
               this.field_1059.method_724();
               this.field_1059.method_762();
               var11.method_1013();
            }
         }

         if (this.field_1060.field_1937.showUnitGroups && var10 < 3) {
            String var12;
            if (var11.field_1318.size() == 0) {
               if (this.field_1059.field_1051) {
                  var12 = "Empty";
               } else {
                  var12 = "(" + (var10 + 1) + ")";
               }
            } else {
               var12 = "" + var11.field_1318.size();
            }

            boolean var13 = false;
            var11.field_1321 = class_296.method_2020(var11.field_1321, 0.01F * var1);
            var11.field_1322 = class_296.method_2020(var11.field_1322, 0.01F * var1);
            var11.field_1323 = class_296.method_2020(var11.field_1323, 0.01F * var1);
            int var14 = Color.method_3077(50, (int)(100.0F + var11.field_1323 * 100.0F), (int)(100.0F + var11.field_1322 * 100.0F), (int)(100.0F + var11.field_1321 * 100.0F));
            if (this.field_1059.method_789(var5, var4, var7, (int)(30.0F * this.field_1060.field_1955), var12, class_166.field_1476, true, var14) && this.field_1059.field_984 == null) {
               var13 = true;
               var11.field_1319 += var1;
               float var15 = 1.0F;
               this.field_1065.method_2775();
               this.field_1065.method_2788(Color.method_3077(120, 200, 0, 0));
               if (var11.field_1319 < 50.0F) {
                  var15 = var11.field_1319 / 50.0F;
                  this.field_1065.method_2788(Color.method_3077((int)(150.0F + var15 * 40.0F), 0, 200, 0));
                  this.method_826(var5, var4, var7, "Select Group", "(Hold to add)", this.field_1065, var15);
               } else if (var11.field_1319 < 100.0F) {
                  var15 = (var11.field_1319 - 50.0F) / 50.0F;
                  this.field_1065.method_2788(Color.method_3077((int)(150.0F + var15 * 40.0F), 200, 0, 0));
                  this.method_826(var5, var4, var7, "Add to Group", "(Hold to replace)", this.field_1065, var15);
               } else {
                  this.method_826(var5, var4, var7, "Replace Group", "", this.field_1065, 0.0F);
               }

               int var16 = (int)(30.0F * this.field_1060.field_1955);
               this.field_1077.method_1911(var5, (int)((float)(var4 + var16) - (float)var16 * var15), var5 + var7, var4 + var16);
               this.field_1060.field_1935.method_79(this.field_1077, this.field_1065);
            }

            if (!var13) {
               if (var11.field_1319 != 0.0F && !this.field_1059.field_965) {
                  if (var11.field_1319 > 100.0F) {
                     var11.method_1014();
                     var11.method_1015();
                     var11.field_1323 = 1.0F;
                  } else if (var11.field_1319 > 50.0F) {
                     var11.method_1015();
                     this.field_1059.method_724();
                     this.field_1059.method_762();
                     var11.method_1013();
                     var11.field_1322 = 1.0F;
                  } else if (var11.field_1318.size() != 0) {
                     this.field_1059.method_724();
                     this.field_1059.method_762();
                     var11.method_1013();
                     var11.field_1321 = 1.0F;
                  } else {
                     var11.method_1014();
                     var11.method_1015();
                     var11.field_1322 = 1.0F;
                  }
               }

               if (!var13) {
                  var11.field_1319 = 0.0F;
               }
            }

            var5 += var6;
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      int var2 = this.field_1126.size();
      var1.method_2541(var2);
      Iterator var3 = this.field_1126.iterator();

      while(var3.hasNext()) {
         class_113 var4 = (class_113)var3.next();
         var4.method_148(var1);
      }

      var1.method_2539(0);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h, boolean) void
   public void method_834(class_463 var1, boolean var2) {
      if (!var2) {
         this.field_1126.clear();
      }

      int var3 = var1.method_3011();

      for(int var4 = 0; var4 < var3; ++var4) {
         class_113 var5 = new class_113(this, var4 < 3);
         var5.method_1016(var1);
         if (!var2) {
            this.field_1126.add(var5);
         }
      }

      var1.method_3009();
   }

   // $FF: renamed from: m () void
   public void method_835() {
      this.field_1137 = class_155.method_1169();
   }

   static {
      field_1104 = new PorterDuffColorFilter(Color.method_3076(200, 255, 200), Mode.MULTIPLY);
      field_1131 = class_432.method_2744("gui.rategame.text");
      field_1132 = class_432.method_2744("gui.rategame.yes");
      field_1133 = class_432.method_2744("gui.rategame.no");
   }
}
