package com.corrodinggames.rts.gameFramework.c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_284;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_42;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_501;
import com.corrodinggames.rts.game.units.class_512;
import com.corrodinggames.rts.game.units.class_81;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_122;
import com.corrodinggames.rts.game.units.a.class_123;
import com.corrodinggames.rts.game.units.a.class_124;
import com.corrodinggames.rts.game.units.a.class_126;
import com.corrodinggames.rts.game.units.a.class_127;
import com.corrodinggames.rts.game.units.a.class_516;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.d.class_8;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_30;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.class_426;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_388;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.d.class_432;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.utility.class_201;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.e
public final class class_98 extends class_30 {
   // $FF: renamed from: a boolean
   public static boolean field_943 = false;
   // $FF: renamed from: b float
   public final float field_944 = 0.7F;
   // $FF: renamed from: c com.corrodinggames.rts.game.units.g
   class_81 field_945;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.c.a
   public class_99 field_946;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.c.h
   public class_162 field_947;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.c.u
   public class_114 field_948;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.a.c
   class_123 field_949 = new class_123();
   // $FF: renamed from: h com.corrodinggames.rts.game.units.a.d
   class_124 field_950 = new class_124();
   // $FF: renamed from: i com.corrodinggames.rts.game.units.a.f
   class_126 field_951 = new class_126();
   // $FF: renamed from: j com.corrodinggames.rts.game.units.a.b
   class_122 field_952 = new class_122();
   // $FF: renamed from: k com.corrodinggames.rts.game.units.a.g
   public class_127 field_953 = new class_127();
   // $FF: renamed from: l boolean
   boolean field_954 = false;
   // $FF: renamed from: m boolean
   public boolean field_955 = false;
   // $FF: renamed from: n double
   double field_956;
   // $FF: renamed from: o float
   float field_957 = 0.0F;
   // $FF: renamed from: p float
   float field_958 = 0.0F;
   // $FF: renamed from: q float
   float field_959 = 0.0F;
   // $FF: renamed from: r float
   float field_960 = 40.0F;
   // $FF: renamed from: s float
   float field_961 = 40.0F;
   // $FF: renamed from: t int
   int field_962 = 0;
   // $FF: renamed from: u boolean
   boolean field_963;
   // $FF: renamed from: v boolean
   boolean field_964 = false;
   // $FF: renamed from: w boolean
   boolean field_965 = false;
   // $FF: renamed from: x boolean
   boolean field_966 = false;
   // $FF: renamed from: y boolean
   boolean field_967 = false;
   // $FF: renamed from: z boolean
   boolean field_968 = false;
   // $FF: renamed from: A float
   float field_969 = 0.0F;
   // $FF: renamed from: B float
   float field_970 = 0.0F;
   // $FF: renamed from: C float
   float field_971 = 0.0F;
   // $FF: renamed from: D float
   float field_972 = 0.0F;
   // $FF: renamed from: E float
   float field_973 = 0.0F;
   // $FF: renamed from: F float
   float field_974 = 0.0F;
   // $FF: renamed from: G boolean
   boolean field_975 = false;
   // $FF: renamed from: H boolean
   boolean field_976 = false;
   // $FF: renamed from: I boolean
   boolean field_977 = false;
   // $FF: renamed from: J com.corrodinggames.rts.game.units.aa
   public class_39 field_978;
   // $FF: renamed from: K float
   public float field_979;
   // $FF: renamed from: L int
   public int field_980;
   // $FF: renamed from: M float
   public float field_981;
   // $FF: renamed from: N com.corrodinggames.rts.game.units.aa
   public class_39 field_982;
   // $FF: renamed from: O boolean
   public final boolean field_983 = true;
   // $FF: renamed from: P com.corrodinggames.rts.game.units.a.l
   public class_121 field_984;
   // $FF: renamed from: Q int
   public int field_985;
   // $FF: renamed from: R boolean
   public boolean field_986;
   // $FF: renamed from: S float
   public float field_987;
   // $FF: renamed from: T float
   public float field_988;
   // $FF: renamed from: U float
   public float field_989;
   // $FF: renamed from: V boolean
   public boolean field_990;
   // $FF: renamed from: W float
   public float field_991;
   // $FF: renamed from: X float
   public float field_992;
   // $FF: renamed from: Y float
   public float field_993;
   // $FF: renamed from: Z float
   public float field_994;
   // $FF: renamed from: aa float
   public float field_995;
   // $FF: renamed from: ab float
   public float field_996;
   // $FF: renamed from: ac boolean
   public boolean field_997;
   // $FF: renamed from: ad float
   public float field_998;
   // $FF: renamed from: ae float
   public float field_999;
   // $FF: renamed from: af int
   public int field_1000;
   // $FF: renamed from: ag android.graphics.Paint
   public Paint field_1001;
   // $FF: renamed from: ah android.graphics.Paint
   public Paint field_1002;
   // $FF: renamed from: ai android.graphics.Paint
   public Paint field_1003;
   // $FF: renamed from: aj android.graphics.Paint
   public Paint field_1004;
   // $FF: renamed from: ak android.graphics.Paint
   public Paint field_1005;
   // $FF: renamed from: al android.graphics.Paint
   public Paint field_1006;
   // $FF: renamed from: am android.graphics.Paint
   public Paint field_1007;
   // $FF: renamed from: an android.graphics.Paint
   public Paint field_1008;
   // $FF: renamed from: ao android.graphics.Paint
   public Paint field_1009;
   // $FF: renamed from: ap android.graphics.Paint
   public Paint field_1010;
   // $FF: renamed from: aq android.graphics.Paint
   public Paint field_1011;
   // $FF: renamed from: ar android.graphics.Paint
   public Paint field_1012;
   // $FF: renamed from: as android.graphics.Paint
   public Paint field_1013;
   // $FF: renamed from: at android.graphics.Paint
   Paint field_1014;
   // $FF: renamed from: au android.graphics.Paint
   Paint field_1015;
   // $FF: renamed from: av android.graphics.Paint
   Paint field_1016;
   // $FF: renamed from: aw android.graphics.Paint
   Paint field_1017;
   // $FF: renamed from: ax android.graphics.Paint
   Paint field_1018;
   // $FF: renamed from: ay android.graphics.Paint
   Paint field_1019;
   // $FF: renamed from: az com.corrodinggames.rts.gameFramework.h.p
   class_441 field_1020;
   // $FF: renamed from: aA com.corrodinggames.rts.gameFramework.h.p
   class_441 field_1021;
   // $FF: renamed from: aB com.corrodinggames.rts.gameFramework.h.p
   class_441 field_1022;
   // $FF: renamed from: aC float
   public float field_1023 = 0.0F;
   // $FF: renamed from: aD float
   public float field_1024 = 0.0F;
   // $FF: renamed from: aE float
   public float field_1025 = 0.0F;
   // $FF: renamed from: aF int
   int field_1026;
   // $FF: renamed from: aG float
   public float field_1027 = 0.0F;
   // $FF: renamed from: aH boolean
   public boolean field_1028;
   // $FF: renamed from: aI com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1029 = null;
   // $FF: renamed from: aJ com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1030 = null;
   // $FF: renamed from: aK com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1031 = null;
   // $FF: renamed from: aL android.graphics.Paint
   Paint field_1032;
   // $FF: renamed from: aM com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1033 = null;
   // $FF: renamed from: aN com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1034 = null;
   // $FF: renamed from: aO com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_1035 = null;
   // $FF: renamed from: aP com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_1036 = null;
   // $FF: renamed from: aQ com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1037 = null;
   // $FF: renamed from: aR com.corrodinggames.rts.gameFramework.h.e
   class_306 field_1038 = null;
   // $FF: renamed from: aS android.graphics.Rect
   Rect field_1039 = new Rect();
   // $FF: renamed from: aT android.graphics.Rect
   Rect field_1040 = new Rect();
   // $FF: renamed from: aU android.graphics.Rect
   Rect field_1041 = new Rect();
   // $FF: renamed from: aV android.graphics.Rect
   Rect field_1042 = new Rect();
   // $FF: renamed from: aW android.graphics.Rect
   Rect field_1043 = new Rect();
   // $FF: renamed from: aX android.graphics.Paint
   Paint field_1044 = new Paint();
   // $FF: renamed from: aY android.graphics.Paint
   Paint field_1045 = new Paint();
   // $FF: renamed from: aZ android.graphics.Paint
   Paint field_1046 = new Paint();
   // $FF: renamed from: ba android.graphics.Paint
   Paint field_1047 = new Paint();
   // $FF: renamed from: bb java.lang.String
   String field_1048;
   // $FF: renamed from: bc java.lang.String
   String field_1049;
   // $FF: renamed from: bd java.util.ArrayList
   public ArrayList field_1050 = new ArrayList();
   // $FF: renamed from: be boolean
   public boolean field_1051 = false;
   // $FF: renamed from: bf boolean
   public static boolean field_1052 = false;
   // $FF: renamed from: bg boolean
   public static boolean field_1053 = false;
   // $FF: renamed from: bh boolean
   public static boolean field_1054 = false;
   // $FF: renamed from: bi long
   long field_1055;
   // $FF: renamed from: bj com.corrodinggames.rts.gameFramework.utility.s
   public class_201 field_1056 = new class_201();
   // $FF: renamed from: bk android.graphics.Paint
   Paint field_1057 = new Paint();
   // $FF: renamed from: bl android.graphics.Rect
   Rect field_1058 = new Rect();

   // $FF: renamed from: a () boolean
   public boolean method_703() {
      if (class_236.field_1900) {
         return false;
      } else {
         class_236 var1 = class_236.method_1549();
         return var1.field_1937.useCircleSelect;
      }
   }

   // $FF: renamed from: b () float
   float method_704() {
      return Math.min(this.field_957 * 2.5F, 290.0F) + 10.0F;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_705(String var1) {
      this.field_946.method_802(var1);
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_706(String var1) {
      this.field_946.method_803(var1);
   }

   // $FF: renamed from: c () void
   public void method_707() {
      this.field_976 = false;
      this.field_977 = false;
      this.field_965 = false;
   }

   // $FF: renamed from: a (float, float) boolean
   public boolean method_708(float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      if (field_1052 && !this.field_946.field_1116) {
         return var3.field_1943.method_1240(var1, var2) == null;
      } else {
         return var1 < var3.field_1956 - var3.field_1961;
      }
   }

   // $FF: renamed from: d () void
   public void method_709() {
      if (this.field_946 != null) {
         this.field_946.method_794();
      }

   }

   // $FF: renamed from: e () void
   public void method_710() {
      class_236 var1 = class_236.method_1549();
      this.field_946.method_825();
      this.method_724();
      this.field_955 = false;
      this.field_1050.clear();
      var1.field_1916 = 1.0F;
      var1.field_1919 = false;
      var1.field_1918 = false;
      if (var1.method_1578() && var1.method_1579()) {
         var1.field_1918 = var1.field_1944.field_3798;
      }

   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_711(Context var1) {
      class_236 var2 = class_236.method_1549();
      if (class_236.method_1550()) {
         this.field_1051 = true;
      }

      if (class_236.method_1654()) {
         field_1052 = true;
         field_943 = true;
         field_1053 = true;
         field_1054 = true;
      }

      this.field_1048 = class_432.method_2744("gui.notAvailableInDemoText");
      this.field_1049 = "Locked";
      this.field_946 = new class_99(var2, this);
      this.method_709();
      this.field_947 = new class_162(var2, this);
      this.field_948 = new class_114(var2);
      this.field_1029 = var2.field_1935.method_60(R$drawable.button_no);
      this.field_1030 = var2.field_1935.method_60(R$drawable.button_yes);
      this.field_1031 = var2.field_1935.method_60(R$drawable.button_more);
      this.field_1032 = new Paint();
      this.field_1032.method_2784(true);
      this.field_1033 = var2.field_1935.method_60(R$drawable.button_add);
      this.field_1034 = var2.field_1935.method_60(R$drawable.button_subtract);
      this.field_1035 = var2.field_1935.method_60(R$drawable.icon_rally);
      this.field_1036 = var2.field_1935.method_60(R$drawable.icon_upgrade);
      this.field_1037 = var2.field_1935.method_61(R$drawable.metal_dark, false);
      this.field_1038 = var2.field_1935.method_61(R$drawable.touch_indicator, false);
      this.field_1046 = new class_441();
      this.field_1046.method_2791(145, 0, 175, 0);
      this.field_1046.method_2793(6.0F);
      class_441.method_2826(this.field_1046);
      this.field_1001 = new Paint();
      this.field_1002 = new class_441();
      this.field_1002.method_2791(255, 0, 240, 0);
      this.field_1002.method_2781(true);
      this.field_1002.method_2783(true);
      this.field_1002.method_2799(Typeface.method_1917(Typeface.field_2362, 1));
      var2.method_1603(this.field_1002, 20.0F);
      this.field_1002.method_2801(Paint$Align.field_2226);
      this.field_1005 = new class_441();
      this.field_1005.method_2791(255, 0, 240, 0);
      this.field_1005.method_2781(true);
      this.field_1005.method_2783(true);
      this.field_1005.method_2799(Typeface.method_1917(Typeface.field_2362, 1));
      var2.method_1603(this.field_1005, 18.0F);
      this.field_1005.method_2801(Paint$Align.field_2226);
      this.field_1003 = new class_441();
      this.field_1003.method_2776(this.field_1002);
      this.field_1003.method_2791(255, 240, 240, 0);
      this.field_1004 = new class_441();
      this.field_1004.method_2788(Color.method_3077(100, 0, 0, 0));
      this.field_1004.method_2786(Paint$Style.field_4587);
      this.field_1006 = new class_441();
      this.field_1006.method_2791(100, 30, 240, 30);
      this.field_1006.method_2801(Paint$Align.field_2226);
      this.field_1006.method_2783(true);
      this.field_1006.method_2781(true);
      var2.method_1603(this.field_1006, 12.0F);
      class_441.method_2826(this.field_1006);
      this.field_1007 = new class_441();
      if (this.field_1051) {
         this.field_1007.method_2791(255, 240, 240, 240);
      } else {
         this.field_1007.method_2791(255, 30, 240, 30);
      }

      this.field_1007.method_2801(Paint$Align.field_2227);
      this.field_1007.method_2783(true);
      this.field_1007.method_2781(true);
      var2.method_1603(this.field_1007, 12.0F);
      class_441.method_2826(this.field_1007);
      class_236.method_1591("smallTextPaint size: " + this.field_1007.method_2803());
      this.field_1008 = new class_441();
      if (this.field_1051) {
         this.field_1008.method_2791(255, 240, 240, 240);
      } else {
         this.field_1008.method_2791(255, 30, 240, 30);
      }

      this.field_1008.method_2801(Paint$Align.field_2227);
      this.field_1008.method_2783(true);
      this.field_1008.method_2781(true);
      var2.method_1603(this.field_1008, 20.0F);
      class_441.method_2826(this.field_1008);
      this.field_1009 = new class_441();
      this.field_1009.method_2791(255, 30, 240, 30);
      this.field_1009.method_2801(Paint$Align.field_2227);
      this.field_1009.method_2783(true);
      this.field_1009.method_2781(true);
      var2.method_1603(this.field_1009, 20.0F);
      class_441.method_2826(this.field_1009);
      this.field_1013 = new class_441();
      this.field_1013.method_2791(150, 20, 20, 20);
      var2.method_1602(this.field_1013);
      class_441.method_2826(this.field_1013);
      this.field_1010 = new class_441();
      this.field_1010.method_2776(this.field_1008);
      this.field_1010.method_2791(255, 128, 0, 0);
      var2.method_1603(this.field_1010, 14.0F);
      this.field_1010.method_2801(Paint$Align.field_2227);
      class_441.method_2826(this.field_1010);
      this.field_1011 = new class_441();
      this.field_1011.method_2776(this.field_1010);
      this.field_1011.method_2791(255, 220, 222, 49);
      this.field_1012 = new class_441();
      this.field_1012.method_2776(this.field_1008);
      var2.method_1603(this.field_1012, 12.0F);
      this.field_1012.method_2791(125, 230, 230, 230);
      this.field_1012.method_2801(Paint$Align.field_2227);
      class_441.method_2826(this.field_1012);
      this.field_1020 = new class_441();
      this.field_1020.b(-16777216);
      this.field_1020.a(Paint$Align.field_2227);
      this.field_1020.a(true);
      this.field_1020.c(true);
      this.field_1020.method_2799(Typeface.method_1917(Typeface.field_2362, 0));
      var2.method_1603(this.field_1020, 14.0F);
      this.field_1021 = new class_441();
      this.field_1021.a(this.field_1020);
      this.field_1021.method_2799(Typeface.method_1917(Typeface.field_2362, 1));
      var2.method_1603(this.field_1021, 16.0F);
      this.field_1022 = new class_441();
      this.field_1022.a(this.field_1021);
      this.field_1022.b(Color.method_3076(232, 63, 80));
      var2.method_1603(this.field_1022, 16.0F);
      this.field_1014 = new class_441();
      this.field_1014.method_2788(-16777216);
      this.field_1014.method_2801(Paint$Align.field_2227);
      this.field_1014.method_2781(true);
      this.field_1014.method_2783(true);
      this.field_1014.method_2799(Typeface.method_1917(Typeface.field_2362, 0));
      var2.method_1603(this.field_1014, 20.0F);
      this.field_1015 = new class_441();
      this.field_1015.method_2788(-1);
      this.field_1015.method_2790(160);
      if (class_236.field_1900) {
         this.field_1015.method_2790(140);
      }

      var2.method_1602(this.field_1015);
      this.field_1016 = new class_441();
      this.field_1016.method_2788(-16777216);
      this.field_1016.method_2790(210);
      var2.method_1602(this.field_1016);
      this.field_1019 = new class_441();
      this.field_1019.method_2788(-7829368);
      this.field_1019.method_2790(240);
      this.field_1019.method_2786(Paint$Style.field_4586);
      this.field_1019.method_2793(1.0F);
      var2.method_1602(this.field_1019);
      this.field_1017 = new class_441();
      this.field_1017.method_2788(-16711936);
      this.field_1017.method_2790(80);
      this.field_1017.method_2786(Paint$Style.field_4586);
      this.field_1017.method_2793(4.0F);
      var2.method_1602(this.field_1017);
      this.field_1018 = new class_441();
      this.field_1018.method_2788(-16711936);
      this.field_1018.method_2790(120);
      this.field_1018.method_2786(Paint$Style.field_4586);
      this.field_1018.method_2793(8.0F);
      var2.method_1602(this.field_1018);
   }

   // $FF: renamed from: f () void
   public void method_712() {
      this.field_947.method_1194();
      this.field_948.method_1019();
   }

   // $FF: renamed from: a (float) void
   public void method_713(float var1) {
      class_236 var2 = class_236.method_1549();
      this.field_956 += (double)var1;
      this.field_1023 = class_296.method_2020(this.field_1023, var1);
      this.field_1024 = class_296.method_2020(this.field_1024, var1);
      this.field_1027 = class_296.method_2020(this.field_1027, 0.08F * var1);
      this.field_1025 = class_296.method_2020(this.field_1025, var1);
      var2.field_2013 = 5.0F * this.field_1027;
      float var3 = 1.0F * var1;
      float var4;
      float var5;
      if (!this.field_965) {
         var4 = this.field_973 * var1;
         var5 = this.field_974 * var1;
         var4 = class_296.method_2047(80.0F, var4);
         var5 = class_296.method_2047(80.0F, var5);
         var2.field_1967 += var4;
         var2.field_1968 += var5;
      } else {
         var3 *= 4.0F;
      }

      var4 = class_296.method_2027(0.0F, 0.0F, this.field_973, this.field_974);
      var5 = class_296.method_2031(0.0F, 0.0F, this.field_973, this.field_974);
      if (var4 > 30.0F) {
         var4 = 30.0F;
      }

      var4 = class_296.method_2020(var4, var3);
      this.field_973 = class_296.method_2099(var5) * var4;
      this.field_974 = class_296.method_2098(var5) * var4;
      this.field_1028 = false;
      this.field_965 = var2.method_1612() && var2.field_2030[0] && this.field_1023 == 0.0F;
      if (this.field_1024 != 0.0F) {
         if (!this.field_965) {
            this.field_1024 = 0.0F;
         }

         this.field_965 = false;
         this.field_964 = false;
      }

      boolean var6 = false;
      if (this.field_1025 > 0.0F) {
         var6 = true;
      }

      if (var2.method_1612() && var2.method_1614() > 1) {
         var6 = true;
         this.field_1025 = 4.0F;
      }

      if (var6) {
         this.field_965 = false;
         this.field_964 = false;
         this.field_975 = false;
         this.field_957 = 0.0F;
      }

      this.field_968 = var2.method_1615() > var2.field_1972;
      this.field_976 = !this.field_965 && this.field_964;
      this.field_977 = this.field_965 && !this.field_964;
      if (class_236.field_1900 && var2.field_1937.mouseSupport) {
         this.field_960 = var2.method_1615();
         this.field_961 = var2.method_1616();
      }

      if (this.field_965) {
         this.field_957 += var1;
         this.field_958 = var2.method_1617(0);
         this.field_959 = var2.method_1618(0);
         this.field_960 = this.field_958;
         this.field_961 = this.field_959;
         this.field_962 = var2.method_1619(0);
         this.field_963 = this.method_708(this.field_958, this.field_959);
         if (!this.field_964) {
            this.field_975 = false;
            this.field_969 = this.field_958;
            this.field_970 = this.field_959;
            this.field_971 = this.field_958;
            this.field_972 = this.field_959;
            this.field_966 = var2.field_1943.method_1240(this.field_958, this.field_959) != null;
            this.field_967 = false;
            if (!this.field_966) {
               this.field_967 = this.field_958 > var2.field_1972;
            }
         }

         this.field_964 = true;
      }

      float var7;
      float var8;
      boolean var9;
      if (this.field_965 && (this.field_957 <= 20.0F || !this.method_703())) {
         var7 = class_296.method_2026(this.field_969, this.field_970, this.field_958, this.field_959);
         if (!this.field_966) {
            var8 = 20.0F * var2.field_1955;
            if (class_236.field_1900 && var2.field_1937.mouseSupport && var2.method_1620(3)) {
               var8 = 0.0F;
            }

            if (!this.field_975 && var7 > var8 * var8) {
               var9 = false;
               byte var10 = 1;
               if (var2.field_1937.mouseOrders == 2) {
                  var10 = 2;
               }

               if ((!var2.field_1937.mouseSupport || this.field_962 != var10) && !this.method_718(var2)) {
                  var9 = true;
               }

               if (var9) {
                  this.field_975 = true;
               }

               this.field_971 = this.field_958;
               this.field_972 = this.field_959;
            }
         }
      }

      if (class_236.field_1900 && !var2.field_1884 && var2.field_1882 != null && (var2.field_1882.method_29() || class_236.field_1897) && (!this.field_965 || this.field_946.field_1061)) {
         var7 = 24.0F * var2.field_1937.edgeScrollSpeed / var2.field_1988;
         var8 = var2.field_1967;
         float var18 = var2.field_1968;
         float var22 = 0.0F;
         float var11 = 0.0F;
         if (this.field_960 <= 1.0F) {
            var22 -= var7 * var1;
         }

         if (this.field_960 >= var2.field_1956 - 1.0F) {
            var22 += var7 * var1;
         }

         if (this.field_961 <= 1.0F) {
            var11 -= var7 * var1;
         }

         if (this.field_961 >= var2.field_1957 - 1.0F) {
            var11 += var7 * var1;
         }

         var2.field_1967 += var22;
         var2.field_1968 += var11;
         var2.method_1580();
         RectF var10000 = this.field_946.field_1081;
         var10000.field_2416 -= (var2.field_1967 - var8) * var2.field_1988;
         var10000 = this.field_946.field_1081;
         var10000.field_2417 -= (var2.field_1968 - var18) * var2.field_1988;
      }

      class_426 var16 = var2.field_1940;
      if (var2.field_1937.keyboardSupport) {
         if (var2.method_1554()) {
            var8 = 12.0F * var2.field_1937.scrollSpeed;
            if (var16.field_3589.method_2716()) {
               var2.field_1967 -= var8 * var1;
            }

            if (var16.field_3590.method_2716()) {
               var2.field_1967 += var8 * var1;
            }

            if (var16.field_3587.method_2716()) {
               var2.field_1968 -= var8 * var1;
            }

            if (var16.field_3588.method_2716()) {
               var2.field_1968 += var8 * var1;
            }

            if (var16.field_3591.method_2716()) {
               var2.field_1986 += 0.1F;
            }

            if (var16.field_3592.method_2716()) {
               var2.field_1986 -= 0.1F;
            }
         }

         if (var16.field_3598.method_2715()) {
            this.method_724();
            this.method_762();
         }

         if (var16.field_3599.method_2715()) {
            this.field_948.method_1026();
         }

         Iterator var17;
         class_34 var19;
         class_44 var24;
         if (var16.field_3600.method_2715()) {
            this.method_724();
            this.method_762();
            var17 = class_34.field_79.iterator();

            while(var17.hasNext()) {
               var19 = (class_34)var17.next();
               if (var19 instanceof class_44) {
                  var24 = (class_44)var19;
                  if (!var24.bi && var24.bk == var2.field_1915 && var24.l() && !var24.method_284() && var24.method_432()) {
                     this.method_763(var24);
                  }
               }
            }
         }

         if (var16.field_3601.method_2715()) {
            this.method_724();
            this.method_762();
            var17 = class_34.field_79.iterator();

            while(var17.hasNext()) {
               var19 = (class_34)var17.next();
               if (var19 instanceof class_44) {
                  var24 = (class_44)var19;
                  if (var24.bk == var2.field_1915 && var24.o() == class_469.field_4037) {
                     this.method_763(var24);
                     var2.method_1582(var24.dh, var24.di);
                  }
               }
            }
         }

         if (var16.field_3602.method_2715()) {
            class_116.method_1029(this.field_1050, class_116.field_1331, class_116.field_1332);
         }

         if (var16.field_3603.method_2715()) {
            class_116.method_1029(this.field_1050, class_116.field_1333, (class_116)null);
         }

         if (var16.field_3604.method_2715()) {
            class_116.method_1029(this.field_1050, class_116.field_1334, (class_116)null);
         }

         if (var16.field_3605.method_2715()) {
            class_116.method_1029(this.field_1050, class_116.field_1335, (class_116)null);
         }

         if (var16.field_3606.method_2715()) {
            class_116.method_1029(this.field_1050, class_116.field_1336, (class_116)null);
         }

         if (var16.field_3597.method_2715()) {
            this.field_946.method_831(12);
         }

         if (var16.field_3613.method_2715() && this.method_767() && this.method_768()) {
            this.method_724();
            this.field_982 = null;
            this.field_984 = this.field_949;
            return;
         }

         if (var16.field_3615.method_2715() && this.method_766()) {
            this.method_724();
            this.field_982 = null;
            this.field_984 = this.field_950;
            return;
         }

         if (var16.field_3616.method_2715() && this.method_768()) {
            this.method_724();
            this.field_982 = null;
            this.field_984 = this.field_951;
            return;
         }

         if (var16.field_3614.method_2715()) {
            this.method_746();
         }

         if (var16.field_3595.method_2715()) {
            this.method_778();
         }

         if (var16.field_3593.method_2715() && var2.method_1578()) {
            class_236.method_1591("showing send chat");
            this.field_946.method_831(13);
         }

         if (var16.field_3594.method_2715() && var2.method_1578()) {
            class_236.method_1591("showing send team chat");
            this.field_946.method_831(16);
         }

         if (var2.method_1579() || var2.field_1948.method_2658()) {
            if (var16.field_3611.method_2715()) {
               if (var2.field_1916 != 0.0F) {
                  if (!var2.field_1948.method_2658()) {
                     class_454.method_2890((String)null, "Game paused");
                  }

                  var2.field_1916 = 0.0F;
               } else {
                  var2.field_1916 = 1.0F;
               }
            }

            boolean var20 = var16.field_3609.method_2715();
            var9 = var16.field_3610.method_2715();
            if (var20 || var9) {
               boolean var25;
               if (var20) {
                  var25 = var2.field_1916 > 1.0F;
                  if (var2.field_1916 < 2.0F) {
                     var2.field_1916 = (float)((double)var2.field_1916 - 0.25D);
                  } else if (var2.field_1916 < 6.0F) {
                     var2.field_1916 = (float)((double)var2.field_1916 - 0.5D);
                  } else if (var2.field_1916 < 16.0F) {
                     var2.field_1916 -= 2.0F;
                  } else {
                     var2.field_1916 -= 4.0F;
                  }

                  if (var2.field_1916 < 0.0F) {
                     var2.field_1916 = 0.0F;
                  }

                  if (var25 && var2.field_1916 < 1.0F) {
                     var2.field_1916 = 1.0F;
                  }
               } else if (var9) {
                  var25 = var2.field_1916 < 1.0F;
                  if (var2.field_1916 < 2.0F) {
                     var2.field_1916 = (float)((double)var2.field_1916 + 0.25D);
                  } else if (var2.field_1916 < 6.0F) {
                     var2.field_1916 = (float)((double)var2.field_1916 + 0.5D);
                  } else if (var2.field_1916 < 16.0F) {
                     var2.field_1916 += 2.0F;
                  } else {
                     var2.field_1916 += 4.0F;
                  }

                  if (var2.field_1948.method_2658()) {
                     if (var2.field_1916 > 64.0F) {
                        var2.field_1916 = 64.0F;
                     }
                  } else if (var2.field_1916 > 5.0F) {
                     var2.field_1916 = 5.0F;
                  }

                  if (var25 && var2.field_1916 > 1.0F) {
                     var2.field_1916 = 1.0F;
                  }
               }

               if (!var2.field_1948.method_2658()) {
                  class_454.method_2890((String)null, "Game speed now: " + var2.field_1916);
               }
            }
         }

         var2.field_1985 = class_296.method_2020(var2.field_1985, var1);
         if (var16.field_3623.method_2715()) {
            var2.field_1985 = 180.0F;
         }

         if (var2.method_1579()) {
            if (var2.field_1918) {
               if (var16.field_3620.method_2715()) {
                  var2.field_1913 = !var2.field_1913;
               }

               if (var16.field_3621.method_2715()) {
                  if (var2.field_1916 == 1.0F) {
                     var2.field_1916 = 0.1F;
                  } else {
                     var2.field_1916 = 1.0F;
                  }
               }

               if (var16.field_3622.method_2715()) {
                  var2.field_1984 = !var2.field_1984;
               }

               if (var16.field_3624.method_2715()) {
                  var2.field_1919 = !var2.field_1919;
               }
            }

            if (var16.field_3619.method_2715()) {
               var2.field_1918 = !var2.field_1918;
               if (var2.field_1918) {
                  this.method_762();
               }
            }
         }
      }

      if (var2.field_1918 && !var2.method_1579()) {
         var2.field_1918 = false;
      }

      if (var2.field_1918) {
         if (this.field_945 != null && (this.field_945.dc || this.field_945.bi)) {
            this.field_945 = null;
         }

         if (this.field_945 == null) {
            this.field_945 = new class_81(false);
            this.field_945.a(var2.field_1915);
         }

         if (this.method_734() == 0) {
            this.method_762();
            this.method_763(this.field_945);
         }

         if (var2.field_1937.liveReloading && var2.field_1920 % 100 == 0) {
            class_479.method_3133();
         }
      } else {
         this.method_714();
      }

      if (this.field_975) {
         if (this.field_967) {
            this.field_946.field_1115 = this.field_972 - this.field_959;
         } else {
            byte var21 = 1;
            if (var2.field_1937.mouseOrders == 2) {
               var21 = 2;
            }

            if ((!var2.field_1937.mouseSupport || this.field_962 != var21) && !this.method_718(var2)) {
               SettingsEngine var23 = var2.field_1937;
               double var26 = (double)(this.field_971 - this.field_958);
               double var12 = (double)(this.field_972 - this.field_959);
               float var14 = class_296.method_2027(0.0F, 0.0F, (float)var26, (float)var12);
               var26 = var26 * (double)var23.scrollSpeed / (double)var2.field_1988;
               var12 = var12 * (double)var23.scrollSpeed / (double)var2.field_1988;
               if (var1 != 0.0F && (double)var14 > 50.0D * (double)var1) {
                  float var15 = 0.7F;
                  if (class_236.method_1654()) {
                     var15 = 1.7F;
                  }

                  this.field_973 = (float)(var26 * (double)var15);
                  this.field_974 = (float)(var12 * (double)var15);
               }

               var2.field_1967 = (float)((double)var2.field_1967 + var26 * 2.0D);
               var2.field_1968 = (float)((double)var2.field_1968 + var12 * 2.0D);
            }
         }

         this.field_971 = this.field_958;
         this.field_972 = this.field_959;
      }

   }

   // $FF: renamed from: g () void
   public void method_714() {
      if (this.field_945 != null) {
         this.method_765(this.field_945);
         this.field_945.bw();
         this.field_945 = null;
      }

   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.g
   public class_81 method_715() {
      return this.field_945;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k) boolean
   public boolean method_716(class_236 var1) {
      return !var1.field_1937.keyboardSupport ? false : var1.method_1628(59, 60);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.k) boolean
   public boolean method_717(class_236 var1) {
      return !var1.field_1937.keyboardSupport ? false : var1.method_1628(113, 114);
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.k) boolean
   public boolean method_718(class_236 var1) {
      return !var1.field_1937.keyboardSupport ? false : var1.method_1628(57, 58);
   }

   // $FF: renamed from: b (float) void
   public void method_719(float var1) {
      class_236 var2 = class_236.method_1549();
      this.field_981 += 0.2F * var1;
      if (this.field_981 > 360.0F) {
         this.field_981 -= 360.0F;
      }

      this.field_1041.method_1911((int)(var2.field_1956 - var2.field_1961), 0, (int)var2.field_1956, (int)var2.field_1957);
      if (!field_1052) {
         if (this.field_1051) {
            this.field_1044.method_2775();
            this.field_1044.method_2788(Color.method_3077(255, 33, 40, 52));
            this.field_1044.method_2786(Paint$Style.field_4585);
            var2.field_1935.method_79(this.field_1041, this.field_1044);
         } else {
            var2.field_1935.method_72(this.field_1037, this.field_1041, (Paint)null);
         }

         this.field_1044.method_2775();
         this.field_1044.method_2788(Color.method_3077(255, 0, 0, 0));
         this.field_1044.method_2786(Paint$Style.field_4586);
         var2.field_1935.method_79(this.field_1041, this.field_1044);
      }

      class_44 var3 = this.method_737();
      if (var3 != null && var2.field_1915 != var3.field_143 && this.method_769(var3)) {
         this.method_720(var2, var3.field_143, true);
      }

      if (var2.field_1915 != null && var2.field_1915 != class_107.field_1224) {
         this.method_720(var2, var2.field_1915, false);
      }

      if (var2.field_1918) {
         String var4 = "";
         if (var2.field_1918) {
            var4 = var4 + "Editor Active\n";
         }

         if (var2.field_1916 != 1.0F) {
            var4 = var4 + "Game Speed: " + var2.field_1916 + "x\n";
         }

         if (var2.field_1919) {
            var4 = var4 + "Invincible Units\n";
         }

         this.field_1044.method_2775();
         this.field_1044.method_2788(Color.method_3077(0, 0, 0, 0));
         this.field_1044.method_2786(Paint$Style.field_4585);
         var2.field_1935.method_77(var4, 70.0F * var2.field_1955, 40.0F, this.field_1005, this.field_1044, 6.0F);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k, com.corrodinggames.rts.game.k, boolean) void
   public void method_720(class_236 var1, class_107 var2, boolean var3) {
      String var4 = "$" + String.valueOf(var2.field_1229 + var2.field_1230);
      int var5 = var2.method_923();
      if (var5 >= 0) {
         var4 = var4 + "(+" + var5 + ")";
      } else {
         var4 = var4 + "(" + var5 + ")";
      }

      byte var6 = 6;
      int var7 = (int)(var1.field_1956 - var1.field_1961);
      int var8 = 0;
      Paint var9 = this.field_1002;
      if (var3) {
         var9 = this.field_1003;
      }

      float var10 = (float)var1.field_1935.method_102(var4, var9);
      float var11 = (float)var1.field_1935.method_101(var4, var9);
      if (var3) {
         var8 = (int)((float)var8 + var11 + 3.0F);
      }

      var1.field_1935.method_77(var4, (float)var7 - var10 - (float)var6, (float)(var8 + var6), var9, this.field_1004, (float)var6);
   }

   // $FF: renamed from: a (boolean) boolean
   public boolean method_721(boolean var1) {
      return this.method_723(var1, false, false);
   }

   // $FF: renamed from: a (boolean, boolean) boolean
   public boolean method_722(boolean var1, boolean var2) {
      return this.method_723(var1, true, var2);
   }

   // $FF: renamed from: a (boolean, boolean, boolean) boolean
   public boolean method_723(boolean var1, boolean var2, boolean var3) {
      class_236 var4 = class_236.method_1549();
      if (class_236.method_1654()) {
         return false;
      } else {
         float var5 = var4.field_1955 * 0.6F;
         int var6 = (int)(100.0F * var5);
         int var7 = (int)(10.0F * var5);
         int var8 = (int)var4.field_1957 - (int)(10.0F * var5) - var6;
         int var9;
         if (var3) {
            var9 = (int)(10.0F * var5) + var6;
            var9 += (int)(10.0F * var5) + var6;
            this.field_1042.method_1911(var7 + var9, var8, var7 + var9 + var6, var8 + var6);
            var4.field_1935.method_70(this.field_1031, (float)this.field_1042.field_2352, (float)this.field_1042.field_2353, this.field_1032, 0.0F, var5);
         } else if (var1) {
            this.field_1042.method_1911(var7, var8, var7 + var6, var8 + var6);
            var4.field_1935.method_70(this.field_1030, (float)this.field_1042.field_2352, (float)this.field_1042.field_2353, this.field_1032, 0.0F, var5);
         } else {
            var9 = (int)(10.0F * var5) + var6;
            this.field_1042.method_1911(var7 + var9, var8, var7 + var9 + var6, var8 + var6);
            var4.field_1935.method_70(this.field_1029, (float)this.field_1042.field_2352, (float)this.field_1042.field_2353, this.field_1032, 0.0F, var5);
         }

         return this.field_976 && !this.field_975 && this.field_1042.method_1914((int)this.field_958, (int)this.field_959);
      }
   }

   // $FF: renamed from: i () boolean
   public boolean method_724() {
      class_236 var1 = class_236.method_1549();
      if (this.field_984 != null) {
         if (this.field_984.method_1059() == class_516.field_4684) {
            this.field_984 = null;
            this.field_986 = false;
            this.field_990 = false;
            this.field_982 = null;
            this.field_997 = false;
            ++this.field_985;
         } else {
            this.field_984 = null;
         }

         this.field_1000 = 0;
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: c (float) void
   public void method_725(float var1) {
      class_236 var2 = class_236.method_1549();
      Point var3 = var2.field_1943.method_1240(this.field_958, this.field_959);
      float var4;
      float var5;
      if (var3 != null) {
         var4 = (float)var3.field_4722;
         var5 = (float)var3.field_4723;
      } else {
         var4 = this.field_958 / var2.field_1988 + var2.field_1965;
         var5 = this.field_959 / var2.field_1988 + var2.field_1966;
      }

      this.field_987 = class_296.method_2020(this.field_987, var1);
      this.field_1041.method_1911((int)(var2.field_1956 - var2.field_1961), 0, (int)var2.field_1956, (int)var2.field_1957);
      if (!field_1052 && (this.field_976 || this.field_965) && this.field_1041.method_1914((int)this.field_958, (int)this.field_959)) {
         this.field_1028 = true;
      }

      this.field_946.method_799(var1);
      this.field_946.method_800(var1);
      this.field_979 += var1;
      if (!var2.method_1548()) {
         int var6 = this.field_946.method_818(var1);
         this.field_946.method_820(var1, var6);
         this.field_946.method_833(var1);
         this.field_947.method_1197(var1);
         this.field_948.method_1024(var1);
         this.field_946.method_804(var1);
         this.field_946.method_828(var1);
         this.field_946.method_830(var1, true);
      }

      this.method_726(var4, var5, var3);
      boolean var13 = false;
      if (!this.field_975) {
         boolean var7 = true;
         boolean var8 = true;
         boolean var9 = true;
         if (class_236.field_1900 && var2.field_1937.mouseSupport) {
            if (var2.field_1937.mouseOrders == 0) {
               var7 = true;
            } else {
               var7 = false;
               var8 = false;
               var9 = false;
               if (var2.field_1937.mouseOrders == 1) {
                  if (var2.method_1620(1)) {
                     var8 = true;
                  }

                  if (var2.method_1620(2)) {
                     var9 = true;
                  }
               } else {
                  if (var2.method_1620(2)) {
                     var8 = true;
                  }

                  if (var2.method_1620(1)) {
                     var9 = true;
                  }
               }
            }
         }

         if (this.field_965 && var3 != null && this.field_966) {
            boolean var12 = false;
            if (!var7 && !var9) {
               var12 = true;
            }

            if (this.method_734() == 0 || !this.method_768()) {
               var12 = true;
            }

            if (var7 && this.field_957 > 20.0F) {
               var12 = true;
            }

            if (var12) {
               var2.method_1582(var4, var5);
               var13 = true;
            }
         }

         if ((this.field_963 || var3 != null && (var7 || var9)) && !var13 && this.field_984 == null && this.field_976) {
            if (this.field_957 > 30.0F) {
               if (this.method_703() && var3 == null) {
                  float var17 = this.method_704();
                  var17 /= var2.field_1988;
                  this.method_762();
                  this.method_760(var4, var5, var17);
                  this.method_772();
               }
            } else {
               class_39 var18 = null;
               if (var3 == null) {
                  var18 = this.method_759(var4, var5);
               }

               if (!var7) {
                  if (var8) {
                     this.method_732(var18);
                  }

                  if (var9) {
                     if (var18 == null) {
                        this.method_744(var4, var5, var3);
                     } else if (!this.method_733(var18, false)) {
                     }
                  }
               } else if (var18 == null) {
                  this.method_744(var4, var5, var3);
               } else if (!this.method_733(var18, true)) {
                  this.method_732(var18);
               }
            }
         }
      }

      if (this.field_984 == null && this.field_965 && !this.field_975 && !this.field_966 && !this.field_1028) {
         this.field_1001.method_2786(Paint$Style.field_4585);
         this.field_1001.method_2793(1.0F);
         if (this.field_957 > 20.0F && this.method_703()) {
            float var14 = this.method_704();
            this.field_1001.method_2791(100, 0, 255, 0);
            var2.field_1935.method_85(this.field_958, this.field_959, var14, this.field_1001);
            this.field_1001.method_2786(Paint$Style.field_4586);
            this.field_1001.method_2793(1.0F);
            this.field_1001.method_2791(200, 0, 255, 0);
            var2.field_1935.method_85(this.field_958, this.field_959, var14, this.field_1001);
         }
      }

      if (var2.field_1909 && var2.method_1612() && var2.method_1614() > 0) {
         Paint var15 = new Paint();
         var15.method_2790(100);

         for(int var16 = 0; var16 < var2.method_1614(); ++var16) {
            var2.field_1935.method_87();
            var2.field_1935.method_93(0.7F, 0.7F, var2.method_1617(var16), var2.method_1618(var16));
            var2.field_1935.method_69(this.field_1038, var2.method_1617(var16), var2.method_1618(var16), var15);
            var2.field_1935.method_88();
         }
      }

      if (!this.field_965) {
         this.field_957 = 0.0F;
         this.field_975 = false;
      }

      this.field_964 = this.field_965;
      var2.method_1613();
   }

   // $FF: renamed from: a (float, float, android.graphics.Point) void
   public void method_726(float var1, float var2, Point var3) {
      class_236 var4 = class_236.method_1549();
      if (this.field_984 != null) {
         class_39 var5;
         if (this.field_984.method_1059() == class_516.field_4687) {
            this.method_781(this.field_984, false, (class_39)null, false);
            if (!this.method_721(false) && !this.method_729()) {
               if (this.field_976 && !this.field_975 && !this.method_728()) {
                  var5 = this.method_759(var1, var2);
                  if (var5 != null && this.field_984.method_1068(var5)) {
                     this.method_748(var5);
                  }

                  this.field_976 = false;
                  this.method_724();
               }
            } else {
               this.method_724();
               this.field_976 = false;
            }
         } else if (this.field_984.method_1059() == class_516.field_4688) {
            this.method_781(this.field_984, false, (class_39)null, false);
            if (!this.method_721(false) && !this.method_729()) {
               if (this.field_976 && !this.field_975 && !this.method_728()) {
                  var5 = this.method_759(var1, var2);
                  if (var5 != null && this.field_984.method_1068(var5)) {
                     this.method_754(var5);
                  }

                  this.field_976 = false;
                  this.method_724();
               }
            } else {
               this.method_724();
               this.field_976 = false;
            }
         } else if (this.field_984.method_1059() == class_516.field_4686) {
            this.method_781(this.field_984, false, (class_39)null, false);
            if (!this.method_721(false) && !this.method_729()) {
               if (this.field_976 && !this.field_975 && !this.method_728()) {
                  this.method_749(var1, var2);
                  this.method_724();
                  this.field_976 = false;
               }
            } else {
               this.method_724();
               this.field_976 = false;
            }
         } else if (this.field_984.method_1059() == class_516.field_4689) {
            this.method_781(this.field_984, false, (class_39)null, false);
            var5 = this.field_946.method_811();
            if (var5 != null && var5 instanceof class_44) {
               var4.field_1935.method_87();
               var4.method_1584();
               ((class_44)var5).method_500(this.field_984);
               var4.field_1935.method_88();
            }

            if (!this.method_721(false) && !this.method_729()) {
               if (this.field_976 && !this.field_975 && !this.method_728() && var3 == null) {
                  boolean var6 = false;
                  if (this.method_739(this.field_984, var1, var2)) {
                     var6 = true;
                  }

                  if (!var6) {
                     this.method_747(this.field_984, var1, var2);
                     if (!this.method_716(var4)) {
                        this.method_724();
                        this.field_976 = false;
                     }
                  }
               }
            } else {
               this.method_724();
               this.field_976 = false;
            }
         } else if (this.field_984.method_1059() == class_516.field_4690) {
            this.method_781(this.field_984, false, (class_39)null, false);
            if (!this.method_721(false) && !this.method_729()) {
               if (this.field_976 && !this.field_975 && !this.method_728()) {
                  this.method_745(var1, var2, var3);
                  if (!this.method_716(var4)) {
                     this.method_724();
                     this.field_976 = false;
                  }
               }
            } else {
               this.method_724();
               this.field_976 = false;
            }
         } else if (this.field_984.method_1059() == class_516.field_4694) {
            this.method_781(this.field_984, false, (class_39)null, false);
            if (!this.method_721(false) && !this.method_729()) {
               if (this.field_976 && !this.field_975 && !this.method_728()) {
                  var5 = this.method_759(var1, var2);
                  if (var5 != null && this.field_984.method_1068(var5)) {
                     this.method_755(var5);
                  }

                  this.field_976 = false;
                  this.method_724();
               }
            } else {
               this.method_724();
               this.field_976 = false;
            }
         } else if (this.field_984.method_1059() == class_516.field_4695) {
            this.method_781(this.field_984, false, (class_39)null, false);
            if (!this.method_721(false) && !this.method_729()) {
               if (this.field_976 && !this.field_975 && !this.method_728()) {
                  this.method_756(var1, var2, var3, this.field_1000 == 0);
                  ++this.field_1000;
               }
            } else {
               this.method_724();
               this.field_976 = false;
            }
         } else if (this.field_984.method_1059() == class_516.field_4692) {
            this.method_781(this.field_984, false, (class_39)null, false);
            if (!this.method_721(false) && !this.method_729()) {
               if (this.field_976 && !this.field_975 && !this.method_728() && var3 == null) {
                  this.method_750(var1, var2, var3);
                  this.method_724();
                  this.field_976 = false;
               }
            } else {
               this.method_724();
               this.field_976 = false;
            }
         } else if (this.field_984.method_1055() != null && this.field_984.method_1059() == class_516.field_4684) {
            this.method_727(var1, var2, var3);
         }
      }

   }

   // $FF: renamed from: b (float, float, android.graphics.Point) void
   public void method_727(float var1, float var2, Point var3) {
      class_236 var4 = class_236.method_1549();
      class_39 var5 = this.field_946.method_811();
      boolean var6 = false;
      if (var5 != null) {
         var6 = this.field_984.method_1050(var5, true) && !class_99.method_805(this.field_984);
         if (!this.field_984.method_1051(var5)) {
            var6 = false;
         }
      }

      this.method_781(this.field_984, false, (class_39)null, !var6);
      float var7 = this.field_960 / var4.field_1988;
      float var8 = this.field_961 / var4.field_1988;
      float var9 = var7;
      float var10 = var8;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      if (class_236.field_1900 && var4.field_1937.mouseSupport) {
         var11 = true;
      }

      if (var11) {
         if (this.method_730()) {
            if (!this.field_997) {
               this.field_997 = true;
               this.field_995 = var7 + var4.field_1965;
               this.field_996 = var8 + var4.field_1966;
            }
         } else {
            this.field_997 = false;
         }

         if (this.field_997) {
            float var14 = var7 - (this.field_995 - var4.field_1965);
            float var15 = var8 - (this.field_996 - var4.field_1966);
            if (class_296.method_2042(var14) > 4.0F || class_296.method_2042(var15) > 4.0F) {
               var12 = true;
            }
         }
      }

      boolean var51 = false;
      boolean var52 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = true;
      boolean var19 = false;
      if (class_236.field_1900 && var4.field_1937.mouseSupport) {
         var19 = true;
      }

      if (this.field_986 && !var19) {
         if (var6) {
            if (!this.field_990 && this.method_722(true, false)) {
               this.field_976 = false;
               var51 = true;
            }

            if (this.method_722(true, true)) {
               this.field_976 = false;
               var16 = true;
            }
         }

         if (this.method_722(false, false)) {
            this.field_976 = false;
            var52 = true;
         }
      }

      boolean var20 = false;
      if (class_236.field_1900 && var4.field_1937.mouseSupport) {
         var20 = true;
      }

      if (this.field_976 && !this.field_975) {
         var20 = true;
      }

      float var21;
      float var22;
      if (class_236.method_1653()) {
         var13 = true;
         if (var4.method_1614() == 2) {
            var20 = true;
            var9 = var4.method_1617(0) / var4.field_1988;
            var10 = var4.method_1618(0) / var4.field_1988;
            var21 = var4.method_1617(1) / var4.field_1988;
            var22 = var4.method_1618(1) / var4.field_1988;
            this.field_997 = true;
            this.field_995 = var21;
            this.field_996 = var22;
         } else if (this.field_976 && !this.field_975) {
            this.field_997 = false;
         }

         if (this.field_997) {
            var12 = true;
         }
      }

      if (var20) {
         this.field_986 = true;
         this.field_988 = var9;
         this.field_989 = var10;
         if (!this.method_708(var4.method_1615(), var4.method_1616())) {
            this.field_986 = false;
            var18 = false;
         }
      }

      var21 = this.field_995;
      var22 = this.field_996;
      if (var13) {
         var21 += var4.field_1965;
         var22 += var4.field_1966;
      }

      class_24 var23 = this.field_984.method_1055();
      int var24 = this.field_984.method_1057();
      boolean var25 = false;
      if (class_236.field_1900 && var4.field_1937.mouseSupport && !var4.field_1977.method_1914((int)this.field_960, (int)this.field_961)) {
         var25 = true;
      }

      class_39 var26 = class_39.method_217(var23);
      if ((var26 == null || !(var26 instanceof class_44)) && class_479.field_4185 != null) {
         var26 = class_39.method_217(class_479.field_4185);
      }

      if (this.field_986 && !var25) {
         class_44 var27 = (class_44)var26;
         var4.field_1932.method_2581(this.field_988 + var4.field_1965, this.field_989 + var4.field_1966);
         var27.dh = (float)var4.field_1932.field_3355;
         var27.di = (float)var4.field_1932.field_3356;
         if (var23.method_138()) {
            var12 = false;
            Point var28 = class_169.method_1207((int)var27.dh, (int)var27.di, 3);
            if (var28 != null) {
               var27.dh = (float)var28.field_4722;
               var27.di = (float)var28.field_4723;
            }
         }

         if (!var27.aZ()) {
            var27.bv = 0.0F;
         } else {
            var27.bv = -90.0F;
         }

         var27.dh += var27.bW();
         var27.di += var27.bX();
         var27.method_258(this.field_982.field_143);
         var27.method_356(var24);
         var27.bD = true;
         boolean var53 = var27.method_493();
         if (class_388.method_2441(var4.field_1915, var27, this.field_985)) {
            var53 = false;
         }

         if (var12) {
         }

         if (var6) {
            if (!var12) {
               this.method_776(var27, var27.dh, var27.di, true);
            } else {
               if (!class_236.method_1654() && (!class_236.method_1653() || var4.method_1614() != 2)) {
                  var4.field_1935.method_96((var27.dh - var4.field_1965) * var4.field_1988, (var27.di - var4.field_1966) * var4.field_1988, (var21 - var4.field_1965) * var4.field_1988, (var22 - var4.field_1966) * var4.field_1988, this.field_1046);
               } else {
                  var4.field_1935.method_96(var9 * var4.field_1988, var10 * var4.field_1988, (var21 - var4.field_1965) * var4.field_1988, (var22 - var4.field_1966) * var4.field_1988, this.field_1046);
               }

               boolean var29 = true;
               var53 = true;
               this.method_775(var27, var21, var22, var27.dh, var27.di, var29, (ArrayList)null);
            }
         }

         var27.method_356(1);
         if (var18 && this.method_731()) {
            this.field_976 = false;
            if (this.method_716(var4)) {
               var16 = true;
               var17 = true;
            } else {
               var51 = true;
            }
         }

         if (this.method_729()) {
            this.field_976 = false;
            var52 = true;
         }

         if (this.field_976 && !this.field_975) {
            float var31 = this.field_998;
            float var32 = this.field_999;
            float var33 = 15.0F;
            if (Math.abs(var31 - var9) < var33 && Math.abs(var32 - var10) < var33 && this.field_987 != 0.0F) {
               this.field_976 = false;
               var51 = true;
            }

            this.field_987 = 80.0F;
            this.field_998 = var9;
            this.field_999 = var10;
         }

         if ((var51 || var16) && var6) {
            if (!var53) {
               var4.field_1933.method_3322(class_525.field_4753, 0.8F);
            } else {
               float var54 = var27.dh;
               float var30 = var27.di;
               ArrayList var55 = new ArrayList();
               if (var12) {
                  boolean var56 = false;
                  this.method_775(var27, var21, var22, var27.dh, var27.di, var56, var55);
               } else {
                  var55.add(new PointF(var54, var30));
               }

               int var57 = 0;
               boolean var58 = true;

               for(Iterator var34 = var55.iterator(); var34.hasNext(); ++var57) {
                  PointF var35 = (PointF)var34.next();
                  class_324 var36 = this.method_752();
                  if (var58) {
                     var58 = false;
                     if (var16) {
                        if (!var36.field_2598) {
                           var36.field_2599 = true;
                        }

                        this.field_990 = true;
                     }
                  } else {
                     var36.field_2598 = true;
                  }

                  this.method_735(var36);
                  var36.method_2191(var35.field_2406, var35.field_2407, var23, var24);
                  class_44 var37 = this.method_737();
                  if (var37 != null) {
                     class_388 var38 = new class_388();
                     var38.field_3086 = var23;
                     var38.field_3089 = var35.field_2406;
                     var38.field_3090 = var35.field_2407;
                     var38.field_3096 = true;
                     var38.field_3097 = var37;
                     var38.field_3087 = var4.field_1915;
                     var38.field_3088 = var24;
                     var38.field_3092 = var4.field_1915;
                     var38.field_3099 = this.field_985;
                     var38.field_3100 = 1.0F + 0.15F * (float)var57;
                  }
               }

               this.field_1023 = 5.0F;
               if (class_236.method_1654()) {
                  this.field_1023 = 1.0F;
               }

               this.field_997 = false;
               if (!var16) {
                  this.field_984 = null;
                  this.field_986 = false;
                  this.field_990 = false;
                  this.field_982 = null;
                  this.method_762();
                  ++this.field_985;
               } else if (!var17) {
                  float var59 = var27.dh;
                  float var60 = var27.di;
                  boolean var61 = false;
                  if (class_296.method_2042(var59 - this.field_991) < (float)(var27.bs().method_1904() * var4.field_1932.field_3330) * 2.0F + (float)(3 * var4.field_1932.field_3330) && class_296.method_2042(var60 - this.field_992) < (float)(var27.bs().method_1905() * var4.field_1932.field_3331) * 2.0F + (float)(3 * var4.field_1932.field_3331)) {
                     this.field_993 = var59 - this.field_991;
                     this.field_994 = var60 - this.field_992;
                     if (class_296.method_2042(this.field_993) > class_296.method_2042(this.field_994)) {
                        this.field_994 = 0.0F;
                     } else {
                        this.field_993 = 0.0F;
                     }
                  }

                  if (var27.bs().method_1905() > var27.bs().method_1904() + 1) {
                     this.field_994 = 0.0F;
                  }

                  this.field_991 = var59;
                  this.field_992 = var60;
                  float var62 = 0.0F;
                  float var63 = 0.0F;
                  if (this.field_994 < 0.0F) {
                     var62 = -1.0F;
                  }

                  if (this.field_993 < 0.0F) {
                     var63 = -1.0F;
                  }

                  if (this.field_994 > 0.0F) {
                     var62 = 1.0F;
                  }

                  if (this.field_993 > 0.0F) {
                     var63 = 1.0F;
                  }

                  if (var63 == 0.0F && var62 == 0.0F) {
                     var63 = 1.0F;
                  }

                  ArrayList var39 = new ArrayList();
                  float var40 = var59 + 200.0F * var63;
                  float var41 = var60 + 200.0F * var62;
                  float var42 = -var27.bW() + 1.0F;
                  float var43 = -var27.bX() + 1.0F;
                  boolean var44 = false;
                  this.method_775(var27, var59 + var42, var60 + var43, var40 + var42, var41 + var43, var44, var39);
                  if (var39.size() > 0) {
                     var27.dh = ((PointF)var39.get(0)).field_2406;
                     var27.di = ((PointF)var39.get(0)).field_2407;
                     var61 = true;
                  }

                  if (!var61) {
                     var40 = var59 + 200.0F * -var63;
                     var41 = var60 + 200.0F * -var62;
                     this.method_775(var27, var59 + var42, var60 + var43, var40 + var42, var41 + var43, var44, var39);
                     if (var39.size() > 0) {
                        var27.dh = ((PointF)var39.get(0)).field_2406;
                        var27.di = ((PointF)var39.get(0)).field_2407;
                        var61 = true;
                     }
                  }

                  if (!var61) {
                     var27.dh += (float)(3 * var4.field_1932.field_3330);
                     var27.di += (float)var4.field_1932.field_3330;
                  }

                  if (var61) {
                     float var45 = var27.dh - var59;
                     float var46 = var27.di - var60;
                     float var47 = var4.field_1967;
                     float var48 = var4.field_1968;
                     var4.method_1581(var4.field_1967 + var45, var4.field_1968 + var46);
                     var4.method_1580();
                     float var49 = var47 + var45 - var4.field_1967;
                     float var50 = var48 + var46 - var4.field_1968;
                     if (class_296.method_2042(var49) > 1.0F) {
                        this.field_988 += var49;
                     }

                     if (class_296.method_2042(var50) > 1.0F) {
                        this.field_989 += var50;
                     }
                  }
               }
            }
         }

         if (var52) {
            this.method_724();
            if (this.field_990) {
               this.method_762();
            }
         }
      }

   }

   // $FF: renamed from: j () boolean
   public boolean method_728() {
      class_236 var1 = class_236.method_1549();
      return class_236.field_1900 && var1.field_1937.mouseSupport && !this.method_729() && !this.method_731();
   }

   // $FF: renamed from: k () boolean
   public boolean method_729() {
      class_236 var1 = class_236.method_1549();
      if (class_236.field_1900 && var1.field_1937.mouseSupport && this.field_976 && !this.field_975 && !this.field_1028) {
         byte var2 = 1;
         byte var3 = 2;
         if (var1.field_1937.mousePlacement == 2) {
            var2 = 2;
            var3 = 1;
         }

         if (var1.method_1620(var2)) {
         }

         if (var1.method_1620(var3)) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: l () boolean
   public boolean method_730() {
      class_236 var1 = class_236.method_1549();
      if (class_236.field_1900 && var1.field_1937.mouseSupport && (this.field_976 || this.field_965)) {
         byte var2 = 1;
         byte var3 = 2;
         if (var1.field_1937.mousePlacement == 2) {
            var2 = 2;
            var3 = 1;
         }

         if (var1.method_1620(var2)) {
            return true;
         }

         if (var1.method_1620(var3)) {
         }
      }

      return false;
   }

   // $FF: renamed from: m () boolean
   public boolean method_731() {
      return this.field_976 && !this.field_975 && !this.field_1028 ? this.method_730() : false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public void method_732(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      if (var1 != null && this.field_978 == var1 && this.field_979 < 40.0F && !this.method_717(var2)) {
         if (!this.method_716(var2)) {
            this.method_762();
         }

         this.method_761(var1);
      } else if (var1 != null) {
         if (!this.method_716(var2) && !this.method_717(var2)) {
            this.method_762();
         }

         this.method_764(var1, this.method_717(var2));
         this.field_978 = var1;
         this.field_979 = 0.0F;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_733(class_39 var1, boolean var2) {
      class_236 var3 = class_236.method_1549();
      class_107 var4 = this.method_736();
      if (var4.method_943(var1.field_143) && this.method_767()) {
         this.method_753(var1);
         return true;
      } else {
         boolean var5;
         if (var4.method_944(var1.field_143) && (var1.field_167 < var1.field_168 || var1.field_160 < 1.0F) && this.method_734() != 0) {
            var5 = true;
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            if (var1.method_278() && this.method_770(var1)) {
               var6 = true;
            }

            Iterator var9 = class_34.field_79.iterator();

            while(var9.hasNext()) {
               class_34 var10 = (class_34)var9.next();
               if (var10 instanceof class_44) {
                  class_44 var11 = (class_44)var10;
                  if (var11.bS) {
                     if (!this.method_769(var11)) {
                        var5 = false;
                        break;
                     }

                     if (!var11.method_386(var1)) {
                        var5 = false;
                        break;
                     }

                     if (var11.method_432()) {
                        var8 = true;
                     }

                     class_512 var12 = var11.method_400();
                     if (var12 != null && var12.method_3255() == class_501.field_4598) {
                        var7 = true;
                     }
                  }
               }
            }

            if (var5 && (!var7 || !var6)) {
               if (var8) {
                  this.method_754(var1);
               } else {
                  this.method_754(var1);
               }

               return true;
            }
         }

         if (var1.method_316() > 0.0F && this.method_734() != 0) {
            var5 = true;
            Iterator var13 = class_34.field_79.iterator();

            while(var13.hasNext()) {
               class_34 var14 = (class_34)var13.next();
               if (var14 instanceof class_44) {
                  class_44 var15 = (class_44)var14;
                  if (var15.bS) {
                     if (!this.method_769(var15)) {
                        var5 = false;
                        break;
                     }

                     if (!var15.method_391()) {
                        var5 = false;
                        break;
                     }
                  }
               }
            }

            if (var5) {
               this.method_748(var1);
               return true;
            }
         }

         if (var1.field_143 == var4) {
            if (var1.method_278() && this.method_770(var1)) {
               this.method_757(var1);
               return true;
            }

            if (class_236.method_1654() && this.method_771(var1)) {
               this.method_758(var1);
               return true;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: n () int
   public int method_734() {
      return this.field_1026;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.e) void
   void method_735(class_324 var1) {
      Iterator var2 = class_34.field_79.iterator();

      while(var2.hasNext()) {
         class_34 var3 = (class_34)var2.next();
         if (var3 instanceof class_44) {
            class_44 var4 = (class_44)var3;
            if (var4.bS && this.method_769(var4)) {
               var1.method_2184(var4);
            }
         }
      }

   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.k
   public class_107 method_736() {
      class_236 var1 = class_236.method_1549();
      Iterator var2 = this.field_1056.iterator();

      class_39 var3;
      class_44 var4;
      while(var2.hasNext()) {
         var3 = (class_39)var2.next();
         if (var3 instanceof class_44) {
            var4 = (class_44)var3;
            if (var4.bk == var1.field_1915) {
               return var4.bk;
            }
         }
      }

      var2 = this.field_1056.iterator();

      while(var2.hasNext()) {
         var3 = (class_39)var2.next();
         if (var3 instanceof class_44) {
            var4 = (class_44)var3;
            if (this.method_769(var4)) {
               return var4.bk;
            }
         }
      }

      return var1.field_1915;
   }

   // $FF: renamed from: p () com.corrodinggames.rts.game.units.p
   public class_44 method_737() {
      Iterator var1 = this.field_1056.iterator();

      while(var1.hasNext()) {
         class_39 var2 = (class_39)var1.next();
         if (var2 instanceof class_44) {
            class_44 var3 = (class_44)var2;
            if (this.method_769(var3)) {
               return var3;
            }
         }
      }

      return null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.e, java.lang.String, boolean) void
   void method_738(class_324 var1, String var2, boolean var3) {
      class_44 var4 = null;
      int var5 = -99;
      Iterator var6 = class_34.field_79.iterator();

      while(var6.hasNext()) {
         class_34 var7 = (class_34)var6.next();
         if (var7 instanceof class_44) {
            class_44 var8 = (class_44)var7;
            if (var8.bS && this.method_769(var8)) {
               class_121 var9 = var8.b(var2);
               if (var9 != null && var9.method_1051(var8) && (var9.method_1050(var8, true) || var3)) {
                  int var10 = 0;
                  if (var8 instanceof class_8) {
                     boolean var11 = true;
                     var10 = ((class_8)var8).method_13(var2, true);
                     if (var4 != null) {
                        if (!var3) {
                           if (var10 >= var5) {
                              break;
                           }
                        } else if (var10 <= var5) {
                           break;
                        }
                     }
                  }

                  var4 = var8;
                  var5 = var10;
               }
            }
         }
      }

      if (var4 != null) {
         var1.method_2184(var4);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, float, float) boolean
   boolean method_739(class_121 var1, float var2, float var3) {
      boolean var4 = false;
      Iterator var5 = class_34.field_79.iterator();

      while(var5.hasNext()) {
         class_34 var6 = (class_34)var5.next();
         if (var6 instanceof class_44) {
            class_44 var7 = (class_44)var6;
            if (var7.bS && this.method_769(var7)) {
               class_121 var8 = var7.b(var1.method_1043());
               if (var8 != null && var8.method_1051(var7) && var8.method_1050(var7, true)) {
                  if (var7.method_501(this.field_984, var2, var3)) {
                     return false;
                  }

                  var4 = true;
               }
            }
         }
      }

      if (!var4) {
         return false;
      } else {
         return true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.e, java.lang.String) void
   void method_740(class_324 var1, String var2) {
      Iterator var3 = class_34.field_79.iterator();

      while(var3.hasNext()) {
         class_34 var4 = (class_34)var3.next();
         if (var4 instanceof class_44) {
            class_44 var5 = (class_44)var4;
            if (var5.bS && this.method_769(var5)) {
               class_121 var6 = var5.b(var2);
               if (var6 != null && var6.method_1051(var5)) {
                  var1.method_2184(var5);
               }
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l) boolean
   public boolean method_741(class_121 var1) {
      Iterator var2 = class_34.field_79.iterator();

      while(var2.hasNext()) {
         class_34 var3 = (class_34)var2.next();
         if (var3 instanceof class_44) {
            class_44 var4 = (class_44)var3;
            if (var4.bS && this.method_769(var4) && var1.method_1051(var4)) {
               return true;
            }
         }
      }

      return false;
   }

   // $FF: renamed from: q () boolean
   public boolean method_742() {
      if (this.field_1026 == 0) {
         return false;
      } else {
         Iterator var1 = class_34.field_79.iterator();

         boolean var5;
         do {
            class_44 var3;
            do {
               class_34 var2;
               do {
                  if (!var1.hasNext()) {
                     return true;
                  }

                  var2 = (class_34)var1.next();
               } while(!(var2 instanceof class_44));

               var3 = (class_44)var2;
            } while(!var3.bS);

            ArrayList var4 = var3.E();
            var5 = false;
            if (var4 != null) {
               Iterator var6 = var4.iterator();

               while(var6.hasNext()) {
                  class_121 var7 = (class_121)var6.next();
                  if (var7.method_1059() == class_516.field_4686) {
                     var5 = true;
                  }
               }
            }
         } while(var5);

         return false;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.u) boolean
   public boolean method_743(class_284 var1) {
      Iterator var2 = class_34.field_79.iterator();

      while(var2.hasNext()) {
         class_34 var3 = (class_34)var2.next();
         if (var3 instanceof class_44) {
            class_44 var4 = (class_44)var3;
            if (var4.bS && this.method_769(var4) && var4.method_499(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   // $FF: renamed from: c (float, float, android.graphics.Point) void
   public void method_744(float var1, float var2, Point var3) {
      class_236 var4 = class_236.method_1549();
      if (!this.method_768()) {
         if (var4.field_1937.quickRally && this.method_742()) {
            this.method_749(var1, var2);
         }
      } else {
         class_324 var5 = this.method_752();
         var5.method_2186(var1, var2);
         this.method_735(var5);
         if (!this.method_743(class_284.field_2431)) {
            var4.field_1933.method_3322(class_525.field_4751, 0.2F);
         }

         class_390 var6 = var4.field_1938.method_2488(var1, var2, 0.0F, class_393.field_3201, true, class_395.field_3225);
         if (var6 != null) {
            var6.field_3176 = 8;
            var6.field_3160 = 30.0F;
            var6.field_3161 = var6.field_3160;
            var6.field_3135 = true;
            var6.field_3143 = 2.0F;
            var6.field_3145 = 1.26F;
            var6.field_3144 = 1.12F;
            var6.field_3146 = true;
         }

         if (var3 != null) {
            Point var7 = var4.field_1943.method_1239((float)var3.field_4722, (float)var3.field_4723);
            class_390 var8 = var4.field_1938.method_2488((float)var7.field_4722, (float)var7.field_4723, 0.0F, class_393.field_3201, true, class_395.field_3225);
            if (var8 != null) {
               var8.field_3132 = true;
               var8.field_3176 = 8;
               var8.field_3160 = 35.0F;
               var8.field_3161 = var6.field_3160;
               var8.field_3135 = true;
               var8.field_3143 = 2.0F;
               var8.field_3145 = 1.3F;
               var8.field_3144 = 0.6F;
            }
         }

      }
   }

   // $FF: renamed from: d (float, float, android.graphics.Point) void
   public void method_745(float var1, float var2, Point var3) {
      class_236 var4 = class_236.method_1549();
      class_324 var5 = this.method_752();
      var5.method_2187(var1, var2);
      this.method_735(var5);
      if (!this.method_743(class_284.field_2431)) {
         var4.field_1933.method_3322(class_525.field_4751, 0.2F);
      }

      class_390 var6 = var4.field_1938.method_2488(var1, var2, 0.0F, class_393.field_3201, true, class_395.field_3225);
      if (var6 != null) {
         var6.field_3176 = 9;
         var6.field_3160 = 30.0F;
         var6.field_3161 = var6.field_3160;
         var6.field_3135 = true;
         var6.field_3143 = 2.0F;
         var6.field_3163 = 1.0F;
         var6.field_3145 = 1.3299999F;
         var6.field_3144 = 1.05F;
         var6.field_3146 = true;
      }

      if (var3 != null) {
         Point var7 = var4.field_1943.method_1239((float)var3.field_4722, (float)var3.field_4723);
         class_390 var8 = var4.field_1938.method_2488((float)var7.field_4722, (float)var7.field_4723, 0.0F, class_393.field_3201, true, class_395.field_3225);
         if (var8 != null) {
            var8.field_3132 = true;
            var8.field_3176 = 9;
            var8.field_3160 = 35.0F;
            var8.field_3161 = var6.field_3160;
            var8.field_3135 = true;
            var8.field_3143 = 2.0F;
            var8.field_3145 = 1.3F;
            var8.field_3144 = 0.6F;
         }
      }

   }

   // $FF: renamed from: r () void
   public void method_746() {
      class_236 var1 = class_236.method_1549();
      class_324 var2 = this.method_752();
      var2.method_2185();
      this.method_735(var2);
      var1.field_1933.method_3322(class_525.field_4751, 0.2F);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.l, float, float) void
   public void method_747(class_121 var1, float var2, float var3) {
      class_236 var4 = class_236.method_1549();
      PointF var5 = new PointF(var2, var3);
      class_324 var6 = this.method_752();
      if (!var1.method_1074()) {
         this.method_740(var6, var1.method_1043());
      } else {
         this.method_738(var6, var1.method_1043(), false);
      }

      var6.method_2199(var1.method_1043(), var5, (class_39)null);
      var4.field_1933.method_3322(class_525.field_4751, 0.2F);
      class_390 var7 = var4.field_1938.method_2488(var2, var3, 0.0F, class_393.field_3201, true, class_395.field_3225);
      if (var7 != null) {
         var7.field_3176 = 9;
         var7.field_3160 = 60.0F;
         var7.field_3161 = var7.field_3160;
         var7.field_3135 = true;
         var7.field_3143 = 2.0F;
         var7.field_3145 = 2.6599998F;
         var7.field_3144 = 1.4F;
         var7.field_3146 = true;
         var7.field_3163 = 1.5F;
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) void
   public void method_748(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      class_324 var3 = this.method_752();
      this.method_735(var3);
      var3.method_2195(var1);
      var2.field_1933.method_3322(class_525.field_4751, 0.2F);
      class_390 var4 = var2.field_1938.method_2488(var1.dh, var1.di, var1.dj, class_393.field_3201, true, class_395.field_3225);
      if (var4 != null) {
         var4.field_3176 = 12;
         var4.field_3160 = 25.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3135 = true;
         var4.field_3143 = 2.0F;
         var4.field_3146 = true;
         var4.field_3145 = 0.84000003F;
         var4.field_3144 = 1.26F;
      }

   }

   // $FF: renamed from: b (float, float) void
   public void method_749(float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      class_324 var4 = var3.field_1952.method_2159(var3.field_1915);
      this.method_735(var4);
      PointF var5 = new PointF(var1, var2);
      var4.method_2201(var5);
      var3.field_1933.method_3322(class_525.field_4751, 0.2F);
      class_390 var6 = var3.field_1938.method_2488(var1, var2, 0.0F, class_393.field_3201, true, class_395.field_3225);
      if (var6 != null) {
         var6.field_3176 = 8;
         var6.field_3160 = 65.0F;
         var6.field_3161 = var6.field_3160;
         var6.field_3135 = true;
         var6.field_3143 = 2.0F;
         var6.field_3146 = true;
         var6.field_3163 = 2.0F;
         var6.field_3145 = 1.4F;
         var6.field_3144 = 1.05F;
      }

   }

   // $FF: renamed from: e (float, float, android.graphics.Point) void
   public void method_750(float var1, float var2, Point var3) {
      class_236 var4 = class_236.method_1549();
      class_324 var5 = this.method_752();
      PointF var6 = new PointF(var1, var2);
      var5.method_2199(this.field_953.v(), var6, (class_39)null);
      if (this.field_1055 == 0L || this.field_1055 + 20000L < System.currentTimeMillis()) {
         this.field_1055 = System.currentTimeMillis();
         String var7 = "<MAP PING>";
         var4.field_1944.method_2938("-t " + var7);
      }

   }

   // $FF: renamed from: a (float, float, com.corrodinggames.rts.game.k) void
   public void method_751(float var1, float var2, class_107 var3) {
      class_236 var4 = class_236.method_1549();
      class_390 var5 = var4.field_1938.method_2488(var1, var2, 0.0F, class_393.field_3201, true, class_395.field_3225);
      if (var5 != null) {
         var5.field_3178 = 9;
         var5.field_3176 = 2;
         var5.field_3160 = 490.0F;
         var5.field_3161 = var5.field_3160;
         var5.field_3135 = true;
         var5.field_3143 = 1.2F;
         var5.field_3157 = 12.0F;
         var5.field_3158 = 60.0F;
         var5.field_3148 -= var5.field_3157;
         var5.field_3145 = 2.8F;
         var5.field_3144 = 2.8F;
         var5.field_3146 = true;
         if (var3 != null) {
            var5.field_3141 = var3.method_945();
         }
      }

      Point var6 = var4.field_1943.method_1239(var1, var2);
      class_390 var7 = var4.field_1938.method_2488((float)var6.field_4722, (float)var6.field_4723, 0.0F, class_393.field_3201, true, class_395.field_3225);
      if (var7 != null) {
         var7.field_3132 = true;
         var7.field_3178 = 9;
         var7.field_3176 = 2;
         var7.field_3160 = 470.0F;
         var7.field_3161 = var5.field_3160;
         var7.field_3135 = true;
         var7.field_3143 = 1.2F;
         var7.field_3157 = 3.0F;
         var7.field_3158 = 60.0F;
         if (var3 != null) {
            var7.field_3141 = var3.method_945();
         }

         var7.field_3145 = 1.0F;
         var7.field_3144 = 1.0F;
      }

   }

   // $FF: renamed from: s () com.corrodinggames.rts.gameFramework.e
   public class_324 method_752() {
      class_236 var1 = class_236.method_1549();
      class_324 var2 = var1.field_1952.method_2159(var1.field_1915);
      if (this.method_716(var1)) {
         var2.field_2598 = true;
      }

      return var2;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) void
   public void method_753(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      class_324 var3 = this.method_752();
      var3.method_2188(var1);
      this.method_735(var3);
      if (!this.method_743(class_284.field_2430)) {
         var2.field_1933.method_3322(class_525.field_4750, 0.2F);
      }

      class_390 var4 = var2.field_1938.method_2488(var1.dh, var1.di, var1.dj, class_393.field_3201, true, class_395.field_3225);
      if (var4 != null) {
         var4.field_3154 = var1.field_150;
         var4.field_3155 = var1.field_151;
         var4.field_3176 = 9;
         var4.field_3160 = 25.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3135 = true;
         var4.field_3143 = 2.0F;
         var4.field_3146 = true;
         var4.field_3163 = 2.0F;
         var4.field_3145 = 1.3299999F;
         var4.field_3144 = 0.84000003F;
      }

   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) void
   public void method_754(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      class_324 var3 = this.method_752();
      this.method_735(var3);
      var3.method_2192(var1);
      var2.field_1933.method_3322(class_525.field_4750, 0.2F);
      class_390 var4 = var2.field_1938.method_2488(var1.dh, var1.di, var1.dj, class_393.field_3201, true, class_395.field_3225);
      if (var4 != null) {
         var4.field_3176 = 10;
         var4.field_3160 = 30.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3135 = true;
         var4.field_3143 = 2.0F;
         var4.field_3146 = true;
         var4.field_3145 = 1.05F;
         var4.field_3144 = 1.3299999F;
      }

   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.aa) void
   public void method_755(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      class_324 var3 = this.method_752();
      this.method_735(var3);
      var3.method_2193(var1);
      var2.field_1933.method_3322(class_525.field_4750, 0.2F);
      class_390 var4 = var2.field_1938.method_2488(var1.dh, var1.di, var1.dj, class_393.field_3201, true, class_395.field_3225);
      if (var4 != null) {
         var4.field_3176 = 10;
         var4.field_3160 = 30.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3135 = true;
         var4.field_3143 = 2.0F;
         var4.field_3146 = true;
         var4.field_3163 = 20.0F;
         var4.field_3145 = 1.05F;
         var4.field_3144 = 1.3299999F;
      }

   }

   // $FF: renamed from: a (float, float, android.graphics.Point, boolean) void
   public void method_756(float var1, float var2, Point var3, boolean var4) {
      class_236 var5 = class_236.method_1549();
      class_324 var6 = this.method_752();
      this.method_735(var6);
      var6.method_2194(var1, var2);
      if (!var4) {
         var6.field_2598 = true;
      }

      var5.field_1933.method_3322(class_525.field_4751, 0.2F);
      class_390 var7 = var5.field_1938.method_2488(var1, var2, 0.0F, class_393.field_3201, true, class_395.field_3225);
      if (var7 != null) {
         var7.field_3176 = 9;
         var7.field_3160 = 30.0F;
         var7.field_3161 = var7.field_3160;
         var7.field_3135 = true;
         var7.field_3143 = 2.0F;
         var7.field_3163 = 40.0F;
         var7.field_3145 = 1.3299999F;
         var7.field_3144 = 1.05F;
         var7.field_3146 = true;
      }

      if (var3 != null) {
         Point var8 = var5.field_1943.method_1239((float)var3.field_4722, (float)var3.field_4723);
         class_390 var9 = var5.field_1938.method_2488((float)var8.field_4722, (float)var8.field_4723, 0.0F, class_393.field_3201, true, class_395.field_3225);
         if (var9 != null) {
            var9.field_3132 = true;
            var9.field_3176 = 9;
            var9.field_3160 = 35.0F;
            var9.field_3161 = var7.field_3160;
            var9.field_3135 = true;
            var9.field_3143 = 2.0F;
            var9.field_3145 = 1.3F;
            var9.field_3144 = 0.6F;
         }
      }

   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.aa) void
   public void method_757(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      class_324 var3 = this.method_752();
      this.method_735(var3);
      var3.method_2196(var1);
      var2.field_1933.method_3322(class_525.field_4750, 0.2F);
      class_390 var4 = var2.field_1938.method_2488(var1.dh, var1.di, var1.dj, class_393.field_3201, true, class_395.field_3225);
      if (var4 != null) {
         var4.field_3176 = 11;
         var4.field_3160 = 25.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3135 = true;
         var4.field_3143 = 2.0F;
         var4.field_3146 = true;
         var4.field_3145 = 1.26F;
         var4.field_3144 = 1.12F;
      }

   }

   // $FF: renamed from: g (com.corrodinggames.rts.game.units.aa) void
   public void method_758(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      class_324 var3 = this.method_752();
      this.method_735(var3);
      var3.method_2197(var1);
      var2.field_1933.method_3322(class_525.field_4750, 0.2F);
      class_390 var4 = var2.field_1938.method_2488(var1.dh, var1.di, var1.dj, class_393.field_3201, true, class_395.field_3225);
      if (var4 != null) {
         var4.field_3176 = 11;
         var4.field_3160 = 25.0F;
         var4.field_3161 = var4.field_3160;
         var4.field_3135 = true;
         var4.field_3143 = 2.0F;
         var4.field_3146 = true;
         var4.field_3145 = 1.26F;
         var4.field_3144 = 1.12F;
      }

   }

   // $FF: renamed from: c (float, float) com.corrodinggames.rts.game.units.aa
   public class_39 method_759(float var1, float var2) {
      class_236 var3 = class_236.method_1549();
      class_39 var4 = null;
      float var5 = -1.0F;
      float var6 = 10.0F / var3.field_1988;
      Iterator var7 = class_39.field_126.iterator();

      while(true) {
         class_39 var8;
         float var9;
         float var10;
         do {
            do {
               do {
                  do {
                     do {
                        if (!var7.hasNext()) {
                           if (var4 != null && var4.field_143 != var3.field_1915 && !var4.method_243()) {
                              return null;
                           }

                           return var4;
                        }

                        var8 = (class_39)var7.next();
                     } while(var8 instanceof class_42);
                  } while(var8.field_141);
               } while(var8.field_182 != null);

               var9 = class_296.method_2026(var1, var2, var8.dh, var8.di - var8.dj);
               var10 = var8.field_157 + var6;
            } while(var9 >= var10 * var10);
         } while(var4 != null && var9 >= var5);

         var4 = var8;
         var5 = var9;
      }
   }

   // $FF: renamed from: a (float, float, float) void
   public void method_760(float var1, float var2, float var3) {
      class_236 var4 = class_236.method_1549();
      Iterator var5 = class_34.field_79.iterator();

      while(var5.hasNext()) {
         class_34 var6 = (class_34)var5.next();
         if (var6 instanceof class_39) {
            class_39 var7 = (class_39)var6;
            if (!var7.field_141 && var7.field_182 == null && var7.field_143 == var4.field_1915) {
               float var8 = class_296.method_2026(var1, var2, var7.dh, var7.di - var7.dj);
               if (var8 < var3 * var3) {
                  this.method_763(var7);
               }
            }
         }
      }

   }

   // $FF: renamed from: h (com.corrodinggames.rts.game.units.aa) void
   public void method_761(class_39 var1) {
      this.field_978 = null;
      Iterator var2 = class_34.field_79.iterator();

      while(var2.hasNext()) {
         class_34 var3 = (class_34)var2.next();
         if (var3 instanceof class_39) {
            class_39 var4 = (class_39)var3;
            if (!var4.field_141 && var4.field_182 == null && var4.field_143 == var1.field_143 && var4.method_288() && class_205.method_1374(var4, var1)) {
               this.method_763(var4);
            }
         }
      }

   }

   // $FF: renamed from: t () void
   public void method_762() {
      this.field_978 = null;
      Iterator var1 = class_34.field_79.iterator();

      while(var1.hasNext()) {
         class_34 var2 = (class_34)var1.next();
         if (var2 instanceof class_39) {
            class_39 var3 = (class_39)var2;
            var3.field_177 = false;
         }
      }

      this.field_1026 = 0;
      ++this.field_980;
      this.field_1056.clear();
   }

   // $FF: renamed from: i (com.corrodinggames.rts.game.units.aa) void
   public void method_763(class_39 var1) {
      if (!var1.field_177) {
         var1.field_177 = true;
         ++this.field_1026;
         this.field_1027 = 1.0F;
         ++this.field_980;
         this.field_1056.method_1327(var1);
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, boolean) void
   public void method_764(class_39 var1, boolean var2) {
      if (!var2) {
         this.method_763(var1);
      } else {
         if (var1.field_177) {
            this.method_765(var1);
         } else {
            this.method_763(var1);
         }

      }
   }

   // $FF: renamed from: j (com.corrodinggames.rts.game.units.aa) void
   public void method_765(class_39 var1) {
      if (var1.field_177) {
         var1.field_177 = false;
         --this.field_1026;
         this.field_1056.remove(var1);
      }

   }

   // $FF: renamed from: u () boolean
   public boolean method_766() {
      if (this.method_734() == 0) {
         return false;
      } else {
         Iterator var1 = class_39.field_126.iterator();

         while(var1.hasNext()) {
            class_39 var2 = (class_39)var1.next();
            if (var2 instanceof class_44) {
               class_44 var3 = (class_44)var2;
               if (var3.bS && this.method_769(var3)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: renamed from: v () boolean
   public boolean method_767() {
      if (this.method_734() == 0) {
         return false;
      } else {
         Iterator var1 = class_39.field_126.iterator();

         while(var1.hasNext()) {
            class_39 var2 = (class_39)var1.next();
            if (var2 instanceof class_44) {
               class_44 var3 = (class_44)var2;
               if (var3.bS && this.method_769(var3) && var3.l()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: renamed from: w () boolean
   public boolean method_768() {
      if (this.method_734() == 0) {
         return false;
      } else {
         Iterator var1 = class_39.field_126.iterator();

         while(var1.hasNext()) {
            class_39 var2 = (class_39)var1.next();
            if (var2 instanceof class_44) {
               class_44 var3 = (class_44)var2;
               if (var3.bS && var3.method_432() && this.method_769(var3)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: renamed from: k (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_769(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      if (var1.field_143 == var2.field_1915) {
         return true;
      } else if (var1.field_143 != null && var1.field_143.method_919(var2.field_1915)) {
         return true;
      } else {
         return var2.field_1918 || var2.field_1948.method_2658();
      }
   }

   // $FF: renamed from: l (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_770(class_39 var1) {
      if (this.method_734() == 0) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         Iterator var3 = class_34.field_79.iterator();

         while(var3.hasNext()) {
            class_34 var4 = (class_34)var3.next();
            if (var4 instanceof class_44) {
               class_44 var5 = (class_44)var4;
               if (var5.bS && var5 != var1 && this.method_769(var5) && var1.method_276(var5)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: renamed from: m (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_771(class_39 var1) {
      if (this.method_734() == 0) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         Iterator var3 = class_34.field_79.iterator();

         while(var3.hasNext()) {
            class_34 var4 = (class_34)var3.next();
            if (var4 instanceof class_44) {
               class_44 var5 = (class_44)var4;
               if (var5.bS && var5 != var1 && this.method_769(var5) && var5.o(var1)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: renamed from: x () void
   public void method_772() {
      boolean var1 = false;
   }

   // $FF: renamed from: y () boolean
   public boolean method_773() {
      return false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      this.field_946.method_148(var1);
      var1.method_2539(1);
      var1.method_2541(this.field_985);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h, boolean) void
   public void method_774(class_463 var1, boolean var2) {
      this.field_946.method_834(var1, var2);
      byte var3 = var1.method_3009();
      if (var3 >= 1) {
         this.field_985 = var1.method_3011();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float, float, float, float, boolean, java.util.ArrayList) void
   public void method_775(class_44 var1, float var2, float var3, float var4, float var5, boolean var6, ArrayList var7) {
      class_236 var8 = class_236.method_1549();
      float var9 = var1.dh;
      float var10 = var1.di;
      class_44 var11 = null;
      class_39 var12 = class_39.method_218(var1.o());
      if (!(var12 instanceof class_44)) {
         class_236.method_1591("buildingBlockoutUnit not OrderableUnit is: " + var12.getClass().getName());
      } else {
         var11 = (class_44)var12;
      }

      boolean var13 = false;
      var8.field_1932.method_2581(var2, var3);
      var2 = (float)var8.field_1932.field_3355;
      var3 = (float)var8.field_1932.field_3356;
      var2 += var1.bW();
      var3 += var1.bX();
      var4 += var1.bW();
      var5 += var1.bX();
      float var14 = class_296.method_2027(var2, var3, var4, var5);
      float var15 = class_296.method_2031(var2, var3, var4, var5);
      int var16 = 0;

      for(float var17 = 0.0F; var17 <= var14; var17 += (float)var8.field_1932.field_3332) {
         float var18 = var2 + class_296.method_2099(var15) * var17;
         float var19 = var3 + class_296.method_2098(var15) * var17;
         var18 -= var1.bW();
         var19 -= var1.bX();
         var8.field_1932.method_2581(var18, var19);
         var18 = (float)var8.field_1932.field_3355;
         var19 = (float)var8.field_1932.field_3356;
         var18 += var1.bW();
         var19 += var1.bX();
         var1.dh = var18;
         var1.di = var19;
         boolean var20 = false;
         if ((!var13 || var11 == null || !class_388.method_2442(var1, var11) && !var1.method_495(var11)) && !var20) {
            boolean var21 = this.method_776(var1, var18, var19, var6);
            if (var7 != null && var21) {
               var7.add(new PointF(var18, var19));
            }

            if (var21) {
               ++var16;
               if (var16 >= 29) {
                  return;
               }
            }

            var13 = true;
            if (var11 != null) {
               var11.dh = var18;
               var11.di = var19;
            }
         }
      }

      var1.dh = var9;
      var1.di = var10;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p, float, float, boolean) boolean
   public boolean method_776(class_44 var1, float var2, float var3, boolean var4) {
      class_236 var5 = class_236.method_1549();
      float var6 = var1.dh;
      float var7 = var1.di;
      var1.dh = var2;
      var1.di = var3;
      boolean var8 = var1.method_493();
      if (class_388.method_2441(var5.field_1915, var1, this.field_985)) {
         var8 = false;
      }

      var1.bG = var8;
      var1.bH = !var8;
      if (var4) {
         var5.field_1935.method_89();
         var5.method_1584();
         var1.method_178(0.0F);
         var1.method_181(0.0F);
         var1.a(0.0F, false);
         float var9 = var1.method_439();
         if (var9 > 30.0F) {
            class_205.method_1357(var1, var9, true, true);
         }

         var1.bq();
         var1.method_494(-1);
         var5.field_1935.method_90();
      }

      var1.dh = var6;
      var1.di = var7;
      return var8;
   }

   // $FF: renamed from: z () void
   public void method_777() {
      this.field_946.method_835();
   }

   // $FF: renamed from: A () void
   public void method_778() {
      this.method_724();
      this.field_982 = null;
      this.field_984 = this.field_953;
   }

   // $FF: renamed from: a (java.util.ArrayList, android.graphics.Rect, android.graphics.Paint, android.graphics.Paint) void
   public void method_779(ArrayList var1, Rect var2, Paint var3, Paint var4) {
      String var5 = "";

      String var7;
      for(Iterator var6 = var1.iterator(); var6.hasNext(); var5 = var5 + var7 + "\n") {
         var7 = (String)var6.next();
      }

      this.method_780(var5, var2, var3, var4);
   }

   // $FF: renamed from: a (java.lang.String, android.graphics.Rect, android.graphics.Paint, android.graphics.Paint) void
   public void method_780(String var1, Rect var2, Paint var3, Paint var4) {
      class_236 var5 = class_236.method_1549();
      String[] var6 = var1.split("\n");
      int var7 = 0;
      String[] var8 = var6;
      int var9 = var6.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         String var11 = var8[var10];
         Paint var12;
         if (var7 == 0) {
            var12 = var3;
         } else {
            var12 = var4;
         }

         int var13 = class_160.method_1175(var12);
         var5.field_1935.method_78(var11, (float)var2.method_1906(), (float)(var2.field_2353 + var13 / 2 + var7 * var13), var12);
         ++var7;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean, com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_781(class_121 var1, boolean var2, class_39 var3, boolean var4) {
      return this.method_782(var1, var2, var3, var4, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean, com.corrodinggames.rts.game.units.aa, boolean, boolean) boolean
   public boolean method_782(class_121 var1, boolean var2, class_39 var3, boolean var4, boolean var5) {
      class_236 var6 = class_236.method_1549();
      String var7 = var1.method_1063();
      boolean var8 = true;
      if (class_236.field_1900) {
         var8 = false;
      }

      if (var7 != null) {
         boolean var9 = false;
         if (class_99.method_805(var1)) {
            var9 = true;
            var7 = this.field_1048;
         }

         if (var1.method_1049()) {
            var9 = true;
            var7 = this.field_1049;
         }

         byte var10 = 20;
         this.field_1039.field_2352 = var10;
         int var11 = (int)(var6.field_1956 - var6.field_1961 - (float)var10);
         this.field_1039.field_2354 = var11;
         boolean var13 = var6.field_1937.showActionInfoHoverNearMouse;
         int var12;
         if (var2) {
            var12 = (int)(var6.field_1960 - 40.0F);
         } else {
            var12 = 60;
         }

         if (class_236.field_1900 && var13) {
            var12 = (int)(var6.method_1616() - 40.0F);
         }

         this.field_1039.field_2353 = var12;
         this.field_1039.field_2355 = this.field_1039.field_2353;
         boolean var14 = true;
         boolean var15 = true;
         if (class_236.field_1900) {
            if (!var13) {
               var14 = false;
               var15 = false;
            } else if (!var5) {
               var15 = false;
               var14 = false;
            }
         } else if (!var2) {
            var15 = false;
         }

         ArrayList var16 = class_160.method_1176(var7, this.field_1039, this.field_1021, this.field_1020, var14);
         Rect var10000;
         if (var14) {
            var10000 = this.field_1039;
            var10000.field_2352 = (int)((float)var10000.field_2352 - 7.0F * var6.field_1955);
            var10000 = this.field_1039;
            var10000.field_2354 = (int)((float)var10000.field_2354 + 7.0F * var6.field_1955);
         }

         int var17;
         if (var15) {
            var17 = (int)((float)var11 - 7.0F * var6.field_1955 - (float)this.field_1039.field_2354);
            this.field_1039.method_1913(var17, 0);
         }

         this.field_1040.method_1912(this.field_1039);
         var10000 = this.field_1040;
         var10000.field_2353 -= 20;
         var10000 = this.field_1040;
         var10000.field_2355 += 15;
         var17 = -1;
         if (var3 != null) {
            var17 = var1.method_1047(var3, true);
         }

         if (var3 != null && var8 && var17 != -1) {
            var10000 = this.field_1040;
            var10000.field_2355 = (int)((float)var10000.field_2355 + 45.0F * var6.field_1955);
         }

         if ((float)this.field_1040.field_2355 > var6.field_1957) {
            int var18 = (int)(var6.field_1957 - (float)this.field_1040.field_2355);
            this.field_1039.method_1913(0, var18);
            this.field_1040.method_1913(0, var18);
         }

         class_24 var27 = var1.method_1055();
         if (!var1.method_1054()) {
            var27 = null;
         }

         if (var27 != null && var3 != null) {
            var10000 = this.field_1040;
            var10000.field_2353 = (int)((float)var10000.field_2353 - 40.0F * var6.field_1955);
         }

         float var19;
         int var20;
         if (class_236.field_1900 && !var2 && (!var13 || !var5)) {
            var19 = var6.field_1957 - 30.0F;
            var20 = (int)(var19 - (float)this.field_1040.field_2355);
            this.field_1040.method_1913(0, var20);
            this.field_1039.method_1913(0, var20);
         }

         if ((float)this.field_1040.field_2355 > var6.field_1957 - 20.0F) {
            var19 = var6.field_1957 - 20.0F;
            var20 = (int)(var19 - (float)this.field_1040.field_2355);
            this.field_1040.method_1913(0, var20);
            this.field_1039.method_1913(0, var20);
         }

         var6.field_1935.method_79(this.field_1040, this.field_1019);
         var6.field_1935.method_79(this.field_1040, this.field_1015);
         float var29;
         if (!var9 && var27 != null && var3 != null) {
            var19 = 30.0F * var6.field_1955;
            var29 = 100.0F * var6.field_1955;
            class_469.method_3061(var27, (float)this.field_1040.method_1906(), (float)this.field_1040.field_2353 + 22.0F * var6.field_1955, this.field_981, 0.0F, var3.field_143, var19, var29, false, false, var1.method_1057());
         }

         class_441 var28 = this.field_1021;
         if (var4) {
            var28 = this.field_1022;
         }

         this.method_779(var16, this.field_1039, var28, this.field_1020);
         if (var3 != null && var17 != -1 && var8) {
            var29 = var6.field_1955 * 0.5F;
            int var21 = (int)(60.0F * var29);
            if (!var9) {
               var6.field_1935.method_78("" + var17, (float)this.field_1040.method_1906(), (float)(this.field_1040.field_2355 - var21) + 10.0F * var6.field_1955, this.field_1014);
            }

            boolean var22 = false;
            boolean var23 = false;
            int var25;
            if (!var9) {
               int var24 = (int)((float)(this.field_1040.method_1906() - var21) - 40.0F * var29);
               var25 = (int)((float)this.field_1040.field_2355 - 65.0F * var29);
               this.field_1042.method_1911(var24, var25, var24 + var21, var25 + var21);
               var6.field_1935.method_70(this.field_1033, (float)this.field_1042.field_2352, (float)this.field_1042.field_2353, this.field_1032, 0.0F, var29);
               if (this.field_976 && !this.field_975 && this.field_1042.method_1914((int)this.field_958, (int)this.field_959)) {
                  this.field_976 = false;
                  var22 = true;
               }

               var24 = (int)((float)this.field_1040.method_1906() + 40.0F * var29);
               var25 = (int)((float)this.field_1040.field_2355 - 65.0F * var29);
               this.field_1042.method_1911(var24, var25, var24 + var21, var25 + var21);
               var6.field_1935.method_70(this.field_1034, (float)this.field_1042.field_2352, (float)this.field_1042.field_2353, this.field_1032, 0.0F, var29);
               if (this.field_976 && !this.field_975 && this.field_1042.method_1914((int)this.field_958, (int)this.field_959)) {
                  this.field_976 = false;
                  var23 = true;
               }
            }

            byte var30 = 1;
            if ((var22 || var23) && var1.method_1058()) {
               if (this.method_716(var6)) {
                  var30 = 5;
               }

               if (this.method_717(var6)) {
                  var30 = 10;
               }
            }

            class_324 var26;
            if (var22) {
               if (var1.method_1058() && var6.field_1915.method_925() <= var6.field_1915.method_924()) {
                  this.field_946.method_802(this.field_946.field_1112);
               }

               var6.field_1933.method_3322(class_525.field_4752, 0.8F);

               for(var25 = 0; var25 < var30; ++var25) {
                  var26 = var6.field_1952.method_2159(var6.field_1915);
                  if (this.method_716(var6)) {
                     var26.field_2598 = true;
                  }

                  this.method_740(var26, var1.method_1043());
                  var26.method_2198(var1.method_1043());
               }
            }

            if (var23) {
               var6.field_1933.method_3322(class_525.field_4752, 0.5F);

               for(var25 = 0; var25 < var30; ++var25) {
                  var26 = var6.field_1952.method_2159(var6.field_1915);
                  this.method_740(var26, var1.method_1043());
                  var26.field_2600 = true;
                  var26.method_2198(var1.method_1043());
               }
            }

            if (!var22 && !var23 && this.field_976 && !this.field_975 && !this.field_1040.method_1914((int)this.field_958, (int)this.field_959)) {
               return true;
            }
         }
      }

      return false;
   }

   // $FF: renamed from: a (android.graphics.Rect, android.graphics.Paint, android.graphics.Paint) void
   public void method_783(Rect var1, Paint var2, Paint var3) {
      class_236 var4 = class_236.method_1549();
      if (field_1052) {
         var4.field_1935.method_73(this.field_1037, var1, var3, var1.field_2352, var1.field_2353, 0, 0);
         if (var2 != null) {
            int var5 = var2.method_2789() + 0;
            if (var5 > 255) {
               var5 = 255;
            }

            var2.method_2790(var5);
         }
      }

      if (var2 != null) {
         var4.field_1935.method_79(var1, var2);
      }

   }

   // $FF: renamed from: a (android.graphics.Rect, int) void
   public void method_784(Rect var1, int var2) {
      class_236 var3 = class_236.method_1549();
      this.field_1047.method_2788(Color.method_3077(255, 0, 0, 0));
      if (field_1052) {
         this.field_1047.method_2788(Color.method_3077(100, 0, 0, 0));
      }

      this.field_1047.method_2786(Paint$Style.field_4586);
      this.field_1047.method_2793(1.0F);
      var3.field_1935.method_79(var1, this.field_1047);
      if (this.field_1051) {
         this.field_1047.method_2788(Color.method_3077(255, 116, 136, 160));
         byte var4 = 1;
         this.field_1047.method_2793((float)var4);
         this.field_1043.method_1912(var1);
         Rect var10000 = this.field_1043;
         var10000.field_2355 -= var4;
         var10000 = this.field_1043;
         var10000.field_2353 += var4;
         var10000 = this.field_1043;
         var10000.field_2352 += var4;
         var10000 = this.field_1043;
         var10000.field_2354 -= var4;
         var3.field_1935.method_79(this.field_1043, this.field_1047);
      }

   }

   // $FF: renamed from: a (int, int, int, int, java.lang.String, int, android.graphics.Paint) void
   public void method_785(int var1, int var2, int var3, int var4, String var5, int var6, Paint var7) {
      class_236 var8 = class_236.method_1549();
      this.field_1041.method_1911(var1, var2, var1 + var3, var2 + var4);
      this.field_1047.method_2788(var6);
      this.field_1047.method_2786(Paint$Style.field_4585);
      var8.field_1935.method_79(this.field_1041, this.field_1047);
      this.method_784(this.field_1041, var6);
      this.method_786(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: b (int, int, int, int, java.lang.String, int, android.graphics.Paint) void
   public void method_786(int var1, int var2, int var3, int var4, String var5, int var6, Paint var7) {
      class_236 var8 = class_236.method_1549();
      this.field_1041.method_1911(var1, var2, var1 + var3, var2 + var4);
      var8.field_1935.method_78(var5, (float)this.field_1041.method_1906(), (float)this.field_1041.method_1907() - (var7.method_2805() + var7.method_2806()) / 2.0F, var7);
   }

   // $FF: renamed from: B () boolean
   public boolean method_787() {
      return !this.field_975;
   }

   // $FF: renamed from: a (int, int, int, int, java.lang.String, com.corrodinggames.rts.gameFramework.c.f, boolean) boolean
   public boolean method_788(int var1, int var2, int var3, int var4, String var5, class_166 var6, boolean var7) {
      return this.method_789(var1, var2, var3, var4, var5, var6, var7, Color.method_3077(140, 100, 100, 100));
   }

   // $FF: renamed from: a (int, int, int, int, java.lang.String, com.corrodinggames.rts.gameFramework.c.f, boolean, int) boolean
   public boolean method_789(int var1, int var2, int var3, int var4, String var5, class_166 var6, boolean var7, int var8) {
      return this.method_790(var1, var2, var3, var4, var5, var6, var7, var8, this.field_1007);
   }

   // $FF: renamed from: a (int, int, int, int, java.lang.String, com.corrodinggames.rts.gameFramework.c.f, boolean, int, android.graphics.Paint) boolean
   public boolean method_790(int var1, int var2, int var3, int var4, String var5, class_166 var6, boolean var7, int var8, Paint var9) {
      this.method_785(var1, var2, var3, var4, var5, var8, var9);
      return this.method_792(var1, var2, var3, var4, var6, var7);
   }

   // $FF: renamed from: a (float, float, float, float) void
   public void method_791(float var1, float var2, float var3, float var4) {
      this.field_1058.method_1911((int)var1, (int)var2, (int)(var1 + var3), (int)(var2 + var4));
      if (this.field_1058.method_1914((int)this.field_958, (int)this.field_959)) {
         this.field_968 = true;
         if (this.field_977) {
            this.field_967 = true;
         }
      }

   }

   // $FF: renamed from: a (int, int, int, int, com.corrodinggames.rts.gameFramework.c.f, boolean) boolean
   public boolean method_792(int var1, int var2, int var3, int var4, class_166 var5, boolean var6) {
      this.method_791((float)var1, (float)var2, (float)var3, (float)var4);
      this.field_1041.method_1911(var1, var2, var1 + var3, var2 + var4);
      return (var6 && this.field_965 || this.field_976) && this.field_1041.method_1914((int)this.field_958, (int)this.field_959);
   }

   // $FF: renamed from: a (int, int, int, int, com.corrodinggames.rts.gameFramework.c.f) boolean
   public boolean method_793(int var1, int var2, int var3, int var4, class_166 var5) {
      this.field_1041.method_1911(var1, var2, var1 + var3, var2 + var4);
      return this.field_977 && this.field_1041.method_1914((int)this.field_958, (int)this.field_959);
   }
}
