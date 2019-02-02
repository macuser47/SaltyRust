package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_97;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.b.class_73;
import com.corrodinggames.rts.game.units.custom.class_478;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.game.units.e.class_79;
import com.corrodinggames.rts.game.units.e.class_87;
import com.corrodinggames.rts.game.units.f.class_67;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_38;
import com.corrodinggames.rts.gameFramework.b.class_35;
import com.corrodinggames.rts.gameFramework.b.class_388;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.utility.class_201;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.aa
public abstract class class_39 extends class_38 {
   // $FF: renamed from: aM float
   public float field_119;
   // $FF: renamed from: aN int
   public int field_120 = -9999;
   // $FF: renamed from: aO com.corrodinggames.rts.game.units.aa
   public class_39 field_121 = null;
   // $FF: renamed from: aP int
   public int field_122 = -9999;
   // $FF: renamed from: aQ int
   public int field_123 = -9999;
   // $FF: renamed from: aR int
   public int field_124 = -9999;
   // $FF: renamed from: aS com.corrodinggames.rts.gameFramework.utility.s
   public static class_201 field_125 = new class_201();
   // $FF: renamed from: aT com.corrodinggames.rts.gameFramework.utility.s
   public static class_201 field_126 = new class_201();
   // $FF: renamed from: aU java.util.HashMap
   public static HashMap field_127 = new HashMap();
   // $FF: renamed from: aV java.util.HashMap
   public static HashMap field_128 = new HashMap();
   // $FF: renamed from: aW java.util.HashMap
   public static HashMap field_129 = new HashMap();
   // $FF: renamed from: aX android.graphics.Paint
   public static Paint field_130 = new class_441();
   // $FF: renamed from: aY android.graphics.Paint
   public static Paint field_131;
   // $FF: renamed from: aZ android.graphics.LightingColorFilter
   static LightingColorFilter field_132;
   // $FF: renamed from: ba boolean
   public boolean field_133 = false;
   // $FF: renamed from: bb boolean
   public boolean field_134 = false;
   // $FF: renamed from: bc boolean
   public boolean field_135 = false;
   // $FF: renamed from: bd boolean
   public boolean field_136 = false;
   // $FF: renamed from: be com.corrodinggames.rts.game.units.aa
   public class_39 field_137 = null;
   // $FF: renamed from: bf com.corrodinggames.rts.game.units.aa
   public class_39 field_138;
   // $FF: renamed from: bg float
   public float field_139;
   // $FF: renamed from: bh boolean
   public boolean field_140 = true;
   // $FF: renamed from: bi boolean
   public boolean field_141 = false;
   // $FF: renamed from: bj long
   public long field_142 = 0L;
   // $FF: renamed from: bk com.corrodinggames.rts.game.k
   public class_107 field_143;
   // $FF: renamed from: bl float
   public float field_144 = 0.0F;
   // $FF: renamed from: bm float
   public float field_145 = 0.0F;
   // $FF: renamed from: bn float
   public float field_146 = 0.0F;
   // $FF: renamed from: bo float
   public float field_147 = 0.0F;
   // $FF: renamed from: bp boolean
   public boolean field_148;
   // $FF: renamed from: bq boolean
   public boolean field_149 = false;
   // $FF: renamed from: br float
   public float field_150 = 0.0F;
   // $FF: renamed from: bs float
   public float field_151 = 0.0F;
   // $FF: renamed from: bt float
   public float field_152 = 0.0F;
   // $FF: renamed from: bu float
   public float field_153 = 0.0F;
   // $FF: renamed from: bv float
   public float field_154;
   // $FF: renamed from: bw float
   public float field_155;
   // $FF: renamed from: bx boolean
   public boolean field_156;
   // $FF: renamed from: by float
   public float field_157;
   // $FF: renamed from: bz float
   public float field_158;
   // $FF: renamed from: bA float
   public float field_159;
   // $FF: renamed from: bB float
   public float field_160 = 1.0F;
   // $FF: renamed from: bC boolean
   public boolean field_161 = false;
   // $FF: renamed from: bD boolean
   public boolean field_162 = false;
   // $FF: renamed from: bE boolean
   public boolean field_163 = false;
   // $FF: renamed from: bF boolean
   public boolean field_164 = false;
   // $FF: renamed from: bG boolean
   public boolean field_165 = false;
   // $FF: renamed from: bH boolean
   public boolean field_166 = false;
   // $FF: renamed from: bI float
   public float field_167;
   // $FF: renamed from: bJ float
   public float field_168;
   // $FF: renamed from: bK float
   public float field_169;
   // $FF: renamed from: bL float
   public float field_170;
   // $FF: renamed from: bM float
   public float field_171;
   // $FF: renamed from: bN float
   public float field_172;
   // $FF: renamed from: bO float
   public float field_173;
   // $FF: renamed from: bP float
   public float field_174;
   // $FF: renamed from: bQ int
   public int field_175;
   // $FF: renamed from: bR int
   public int field_176;
   // $FF: renamed from: bS boolean
   public boolean field_177;
   // $FF: renamed from: bT float
   public float field_178 = 0.0F;
   // $FF: renamed from: bU boolean
   public boolean field_179 = true;
   // $FF: renamed from: bV com.corrodinggames.rts.game.units.ad[]
   public class_502[] field_180;
   // $FF: renamed from: bW boolean
   public boolean field_181;
   // $FF: renamed from: bX com.corrodinggames.rts.game.units.aa
   public class_39 field_182 = null;
   // $FF: renamed from: bY boolean
   public boolean field_183;
   // $FF: renamed from: bZ int
   public int field_184;
   // $FF: renamed from: ca int
   public int field_185;
   // $FF: renamed from: cb int
   public int field_186;
   // $FF: renamed from: cc float
   public float field_187;
   // $FF: renamed from: cd android.graphics.Paint
   public static final Paint field_188;
   // $FF: renamed from: ce android.graphics.Paint
   public static final Paint field_189;
   // $FF: renamed from: cf android.graphics.Paint
   public static final Paint field_190;
   // $FF: renamed from: cg android.graphics.Paint
   public static final Paint field_191;
   // $FF: renamed from: ch android.graphics.Paint
   public static final Paint field_192;
   // $FF: renamed from: ci android.graphics.Paint
   public static final Paint field_193;
   // $FF: renamed from: cj android.graphics.Paint
   public static final Paint field_194;
   // $FF: renamed from: ck android.graphics.Paint
   public static final Paint field_195;
   // $FF: renamed from: cl android.graphics.Paint
   public static final Paint field_196;
   // $FF: renamed from: cm android.graphics.Paint
   public static final Paint field_197;
   // $FF: renamed from: cn android.graphics.Paint
   public static final Paint field_198;
   // $FF: renamed from: co android.graphics.Paint
   public static final Paint field_199;
   // $FF: renamed from: cp android.graphics.Paint
   public static final Paint field_200;
   // $FF: renamed from: cq android.graphics.Paint
   public static Paint field_201;
   // $FF: renamed from: cr int
   public int field_202 = -1;
   // $FF: renamed from: cs int
   public int field_203 = -1;
   // $FF: renamed from: ct int
   public int field_204 = -2;
   // $FF: renamed from: cu float
   public float field_205;
   // $FF: renamed from: cv float
   public float field_206;
   // $FF: renamed from: cw float
   public float field_207 = 70.0F;
   // $FF: renamed from: cx android.graphics.RectF
   RectF field_208 = new RectF();
   // $FF: renamed from: cy android.graphics.Paint
   static Paint field_209;
   // $FF: renamed from: cz android.graphics.Paint
   static Paint field_210;
   // $FF: renamed from: cA android.graphics.RectF
   protected static RectF field_211;
   // $FF: renamed from: cB android.graphics.Rect
   protected static Rect field_212;
   // $FF: renamed from: cC android.graphics.Rect
   static Rect field_213;
   // $FF: renamed from: cD java.util.ArrayList
   static final ArrayList field_214;
   // $FF: renamed from: cE java.util.ArrayList
   static ArrayList field_215;
   // $FF: renamed from: cF com.corrodinggames.rts.game.units.ap
   public class_24 field_216;
   // $FF: renamed from: cG android.graphics.RectF
   static RectF field_217;
   // $FF: renamed from: cH android.graphics.Rect
   static Rect field_218;
   // $FF: renamed from: cI android.graphics.PointF
   static PointF field_219;
   // $FF: renamed from: cJ android.graphics.PointF
   static PointF field_220;
   // $FF: renamed from: cK com.corrodinggames.rts.game.units.ab[]
   class_517[] field_221;
   // $FF: renamed from: cL android.graphics.PointF
   static PointF field_222;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2540(this.field_133);
      var1.method_2550(this.field_137);
      var1.method_2550(this.field_138);
      var1.method_2542(this.field_139);
      var1.method_2540(this.field_140);
      var1.method_2540(this.field_141);
      var1.method_2543(this.field_142);
      var1.method_2556(this.field_143);
      var1.method_2542(this.field_144);
      var1.method_2542(this.field_145);
      var1.method_2542(this.field_150);
      var1.method_2542(this.field_151);
      var1.method_2542(this.field_153);
      var1.method_2542(this.field_154);
      var1.method_2542(this.field_157);
      var1.method_2542(this.field_158);
      var1.method_2542(this.field_159);
      var1.method_2542(this.field_160);
      var1.method_2540(this.field_162);
      var1.method_2540(this.field_165);
      var1.method_2542(this.field_167);
      var1.method_2542(this.field_168);
      var1.method_2540(this.field_179);
      var1.method_2542(this.field_180[0].field_4608);
      var1.method_2542(this.field_180[0].field_4610);
      var1.method_2550(this.field_182);
      var1.method_2539(16);
      var1.method_2541(this.field_186);
      var1.method_2542(this.field_187);
      var1.method_2542(this.field_152);
      var1.method_2542(this.field_155);
      int var2 = this.method_317();
      var1.method_2541(var2);

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         class_502 var4 = this.field_180[var3];
         var1.method_2542(var4.field_4608);
         var1.method_2542(var4.field_4609);
         var1.method_2542(var4.field_4610);
         var1.method_2542(var4.field_4611);
         var1.method_2542(var4.field_4612);
         var1.method_2542(var4.field_4614);
         var1.method_2542(var4.field_4615);
         class_39 var5 = var4.field_4616;
         if (var5 != null && var5.field_141) {
            var5 = null;
         }

         var1.method_2550(var5);
         var1.method_2540(this.field_181);
      }

      var1.method_2541(this.field_120);
      var1.method_2542(this.field_170);
      var1.method_2542(this.field_171);
      var1.method_2542(this.field_172);
      var1.method_2542(this.field_173);
      var1.method_2540(this.field_163);
      var1.method_2540(this.field_164);
      var1.method_2540(this.field_166);
      var1.method_2540(this.field_134);
      var1.method_2542(this.field_174);
      var1.method_2540(this.field_156);
      var1.method_2540(this.field_221 != null);
      if (this.field_221 != null) {
         var1.method_2541(this.field_221.length);

         for(var3 = 0; var3 < this.field_221.length; ++var3) {
            class_517 var6 = this.field_221[var3];
            var1.method_2540(var6.field_4697);
            var1.method_2541(var6.field_4698);
         }
      }

      var1.method_2542(this.field_169);
      var1.method_2549(this.field_121);
      var1.method_2541(this.field_175);
      var1.method_2541(this.field_176);
      var1.method_2541(this.field_122);
      var1.method_2541(this.field_123);
      var1.method_2541(this.field_124);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_133 = var1.method_3010();
      this.field_137 = var1.method_3019();
      this.field_138 = var1.method_3019();
      this.field_139 = var1.method_3012();
      this.field_140 = var1.method_3010();
      this.field_141 = var1.method_3010();
      this.field_142 = var1.method_3013();
      this.method_258(var1.method_3024());
      this.field_144 = var1.method_3012();
      this.field_145 = var1.method_3012();
      this.field_150 = var1.method_3012();
      this.field_151 = var1.method_3012();
      this.field_153 = var1.method_3012();
      this.field_154 = var1.method_3012();
      float var2 = var1.method_3012();
      float var3 = var1.method_3012();
      this.field_159 = var1.method_3012();
      this.field_160 = var1.method_3012();
      this.field_162 = var1.method_3010();
      this.field_165 = var1.method_3010();
      this.field_167 = var1.method_3012();
      this.field_168 = var1.method_3012();
      this.field_179 = var1.method_3010();
      this.field_180[0].field_4608 = var1.method_3012();
      this.field_180[0].field_4610 = var1.method_3012();
      this.field_182 = var1.method_3019();
      byte var4 = var1.method_3009();
      if (var4 >= 1) {
         this.field_186 = var1.method_3011();
         this.field_187 = var1.method_3012();
      }

      int var6;
      if (var4 >= 2) {
         this.field_152 = var1.method_3012();
         this.field_155 = var1.method_3012();
         int var5 = var1.method_3011();
         this.method_226(var5);

         for(var6 = 0; var6 < var5; ++var6) {
            class_502 var7 = this.field_180[var6];
            var7.field_4608 = var1.method_3012();
            var7.field_4609 = var1.method_3012();
            var7.field_4610 = var1.method_3012();
            var7.field_4611 = var1.method_3012();
            var7.field_4612 = var1.method_3012();
            if (var4 >= 8) {
               var7.field_4614 = var1.method_3012();
               var7.field_4615 = var1.method_3012();
               var7.field_4616 = var1.method_3019();
            }

            if (var4 >= 12) {
               this.field_181 = var1.method_3010();
            }
         }
      }

      if (var4 >= 3) {
         this.field_120 = var1.method_3011();
      }

      if (var4 >= 4) {
         this.field_170 = var1.method_3012();
         this.field_171 = var1.method_3012();
         this.field_172 = var1.method_3012();
         this.field_173 = var1.method_3012();
      }

      if (var4 >= 5) {
         this.field_163 = var1.method_3010();
         this.field_164 = var1.method_3010();
      }

      if (var4 >= 6) {
         this.field_166 = var1.method_3010();
      }

      if (var4 >= 7) {
         this.field_134 = var1.method_3010();
      }

      if (var4 >= 9) {
         this.field_174 = var1.method_3012();
      }

      if (var4 >= 10) {
         this.field_156 = var1.method_3010();
      }

      if (var4 >= 11) {
         boolean var8 = var1.method_3010();
         if (var8) {
            this.field_221 = new class_517[var1.method_3011()];

            for(var6 = 0; var6 < this.field_221.length; ++var6) {
               this.field_221[var6] = new class_517();
               class_517 var10 = this.field_221[var6];
               var10.field_4697 = var1.method_3010();
               var10.field_4698 = var1.method_3011();
            }
         }
      }

      if (var4 >= 13) {
         this.field_169 = var1.method_3012();
      }

      if (var4 >= 14) {
         this.field_121 = var1.method_3019();
      }

      if (var4 >= 15) {
         this.field_175 = var1.method_3011();
         this.field_176 = var1.method_3011();
      }

      if (var4 >= 16) {
         this.field_122 = var1.method_3011();
         this.field_123 = var1.method_3011();
         this.field_124 = var1.method_3011();
      }

      if (this.field_141) {
         class_236 var9 = class_236.method_1549();
         field_126.remove(this);
         var9.field_1949.method_3239(this);
      }

      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e) com.corrodinggames.rts.gameFramework.h.e
   public static strictfp class_306 method_209(class_306 var0) {
      return method_210(var0, var0.method_2128(), var0.method_2127());
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, int, int) com.corrodinggames.rts.gameFramework.h.e
   public static strictfp class_306 method_210(class_306 var0, int var1, int var2) {
      class_306 var3 = var0.method_2122(var1, var2, false);
      var3.method_2124();
      int var4 = var3.method_2128();
      int var5 = var3.method_2127();

      for(int var6 = 0; var6 < var4; ++var6) {
         for(int var7 = 0; var7 < var5; ++var7) {
            int var8 = var0.method_2125(var6, var7);
            var3.method_2126(var6, var7, Color.method_3077(Color.method_3072(var8), 0, 0, 0));
         }
      }

      var3.method_2131();
      return var3;
   }

   // $FF: renamed from: aY () void
   public static strictfp void method_211() {
      class_79.method_643();
      class_47.method_509();
      class_87.method_665();
      class_67.method_609();
      class_73.method_623();
      Iterator var0 = EnumSet.allOf(ao.class).iterator();

      while(var0.hasNext()) {
         class_469 var1 = (class_469)var0.next();
         var1.method_3050();
      }

      class_469.method_3059();
   }

   // $FF: renamed from: aZ () boolean
   public strictfp boolean method_212() {
      return false;
   }

   // $FF: renamed from: ba () boolean
   public strictfp boolean method_213() {
      return false;
   }

   // $FF: renamed from: bb () java.util.HashMap
   public static strictfp HashMap method_214() {
      HashMap var0 = new HashMap();
      Iterator var1 = EnumSet.allOf(ao.class).iterator();

      class_39 var3;
      while(var1.hasNext()) {
         class_469 var2 = (class_469)var1.next();
         var3 = var2.method_3049(true);
         var3.method_184();
         var3.field_162 = true;
         var0.put(var2, var3);
      }

      var1 = class_479.field_4187.iterator();

      while(var1.hasNext()) {
         class_479 var4 = (class_479)var1.next();
         var3 = var4.method_3181(true);
         var3.method_184();
         var3.field_162 = true;
         var0.put(var4, var3);
      }

      return var0;
   }

   // $FF: renamed from: bc () void
   public static strictfp void method_215() {
      field_128 = method_214();
      field_129 = method_214();
      field_127 = method_214();
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.ap) com.corrodinggames.rts.game.units.aa
   public static strictfp class_39 method_216(class_24 var0) {
      class_39 var1 = (class_39)field_127.get(var0);
      return var1;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.ap) com.corrodinggames.rts.game.units.aa
   public static strictfp class_39 method_217(class_24 var0) {
      class_39 var1 = (class_39)field_128.get(var0);
      if (var1 == null) {
         var1 = (class_39)field_128.get(class_479.field_4185);
         if (var1 == null) {
            class_236.method_1591("name: " + class_479.field_4185.field_4204);
            class_236.method_1591("contains:" + field_128.containsKey(class_479.field_4185));
            Iterator var2 = field_128.keySet().iterator();

            while(var2.hasNext()) {
               class_24 var3 = (class_24)var2.next();
               class_236.method_1591("has:" + var3.method_141());
            }

            class_236.method_1591("Could not find:" + var0.method_141() + " and missing place holder could not be found");
         }
      }

      return var1;
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.units.ap) com.corrodinggames.rts.game.units.aa
   public static strictfp class_39 method_218(class_24 var0) {
      class_39 var1 = (class_39)field_129.get(var0);
      if (var1 == null) {
         var1 = (class_39)field_129.get(class_479.field_4185);
      }

      return var1;
   }

   // $FF: renamed from: bd () int
   public static strictfp int method_219() {
      int var0 = 0;

      class_39 var3;
      for(Iterator var1 = EnumSet.allOf(ao.class).iterator(); var1.hasNext(); var0 = var0 * 31 + var3.method_308()) {
         class_469 var2 = (class_469)var1.next();
         var3 = method_216(var2);
      }

      return var0;
   }

   protected strictfp class_39(boolean var1) {
      super(var1);
      this.method_225();
      if (!var1) {
         field_125.method_1327(this);
         field_126.method_1327(this);
      }

      this.field_122 = class_236.method_1549().field_1921;
      this.field_216 = this.method_295();
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      if (field_125.remove(this)) {
         class_107.method_959(this);
      }

      field_126.remove(this);
      class_236 var1 = class_236.method_1549();
      var1.field_1939.method_765(this);
      super.method_184();
   }

   // $FF: renamed from: be () float
   public strictfp float method_220() {
      return 3000.0F;
   }

   // $FF: renamed from: m (com.corrodinggames.rts.game.units.aa) int
   public strictfp int method_221(class_39 var1) {
      return 0;
   }

   // $FF: renamed from: bf () boolean
   public strictfp boolean method_222() {
      return false;
   }

   // $FF: renamed from: bg () boolean
   public strictfp boolean method_223() {
      return false;
   }

   // $FF: renamed from: bh () float
   public strictfp float method_224() {
      return -1.0F;
   }

   // $FF: renamed from: bi () void
   public strictfp void method_225() {
      this.method_226(1);
   }

   // $FF: renamed from: F (int) void
   public strictfp void method_226(int var1) {
      int var2 = this.method_317();
      if (var2 < var1) {
         var2 = var1;
      }

      int var3;
      if (this.field_180 == null) {
         var3 = 0;
         this.field_180 = new class_502[var2];
      } else {
         if (this.field_180.length >= var2) {
            return;
         }

         var3 = this.field_180.length;
         this.field_180 = (class_502[])Arrays.copyOf(this.field_180, var2);
      }

      for(int var4 = var3; var4 < this.field_180.length; ++var4) {
         this.field_180[var4] = new class_502();
      }

   }

   // $FF: renamed from: d (boolean) float
   public strictfp float method_227(boolean var1) {
      return this.field_154 + 90.0F;
   }

   // $FF: renamed from: bj () boolean
   public final strictfp boolean method_228() {
      if (this.field_182 != null) {
         return false;
      } else {
         return this.field_160 >= 1.0F;
      }
   }

   // $FF: renamed from: q () float
   public strictfp float method_229() {
      return this.field_167 < this.field_168 ? this.field_167 / this.field_168 : -1.0F;
   }

   // $FF: renamed from: bk () float
   public strictfp float method_230() {
      return this.field_160 < 1.0F ? this.field_160 : -1.0F;
   }

   // $FF: renamed from: bl () float
   public strictfp float method_231() {
      return -1.0F;
   }

   // $FF: renamed from: bm () boolean
   public strictfp boolean method_232() {
      return false;
   }

   // $FF: renamed from: bn () int
   public strictfp int method_233() {
      return -1;
   }

   // $FF: renamed from: bo () int
   public strictfp int method_234() {
      return -1;
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
      if (!this.field_141 && this.field_182 == null) {
         class_236 var3 = class_236.method_1549();
         if (class_44.field_258 && this instanceof class_44) {
            class_44 var4 = (class_44)this;
            var4.method_425(var1);
         }

         if (!var2) {
            boolean var22 = false;
            int var5 = this.method_233();
            if (this.method_230() >= 0.0F) {
               var22 = true;
            }

            if (this.method_231() >= 0.0F) {
               var22 = true;
            }

            if (this.field_177 || var3.field_1937.showHp) {
               if (this.method_229() >= 0.0F) {
                  var22 = true;
               }

               if (var5 >= 0) {
                  var22 = true;
               }
            }

            if (var22) {
               float var6 = this.dh - var3.field_1965;
               float var7 = this.di - var3.field_1966 - this.dj;
               float var8 = this.field_157 + 4.0F;
               boolean var9 = true;
               boolean var10 = true;
               byte var11 = 4;
               float var12 = 2.0F * this.field_157;
               if (var3.field_1988 < 1.0F) {
                  var3.field_1935.method_89();
                  var3.method_1585();
                  var6 *= var3.field_1988;
                  var7 *= var3.field_1988;
                  var8 *= var3.field_1988;
               }

               float var13 = 3.0F;
               int var14;
               if (this.field_177 || var3.field_1937.showHp) {
                  if (this.method_229() >= 0.0F) {
                     this.field_208.method_1969(var6 - this.field_157, var7 + var8, var6 - this.field_157 + var12 * this.method_229(), var7 + var8 + (float)var11);
                     var3.field_1935.method_80(this.field_208, class_205.method_1375(200, 0, 150, 0, Paint$Style.field_4585));
                     this.field_208.method_1969(var6 - this.field_157, var7 + var8, var6 - this.field_157 + var12, var7 + var8 + (float)var11);
                     var3.field_1935.method_80(this.field_208, class_205.method_1375(120, 0, 230, 0, Paint$Style.field_4586));
                  }

                  if (var5 >= 0) {
                     var14 = this.method_234();
                     float var15 = var12;
                     if (var14 > 10) {
                        var15 = var12 + 20.0F;
                     }

                     float var16 = var6 - var15 / 2.0F;
                     float var17 = (float)((int)(var15 / (float)var14));
                     float var18 = var17 - 2.0F;
                     float var19 = 3.0F;

                     for(int var20 = 1; var20 <= var14; ++var20) {
                        float var21 = var16 + (float)(var20 - 1) * var17;
                        this.field_208.method_1969(var21, var7 + var8 + var13, var21 + var18, var7 + var8 + var13 + 3.0F);
                        if (var5 >= var20) {
                           var3.field_1935.method_80(this.field_208, class_205.method_1375(240, 0, 0, 255, Paint$Style.field_4585));
                        }

                        var3.field_1935.method_80(this.field_208, class_205.method_1375(110, 0, 0, 210, Paint$Style.field_4586));
                     }

                     var13 += 5.0F;
                  }
               }

               if (this.method_231() >= 0.0F) {
                  byte var23 = var11;
                  var11 = 2;
                  int var24 = var11 + 1;
                  boolean var25 = this.method_232();
                  this.field_208.method_1969(var6 - this.field_157, var7 + var8 + (float)var24 + var13, var6 - this.field_157 + var12 * this.method_231(), var7 + var8 + (float)var24 + (float)var11 + var13);
                  int var26;
                  if (var25) {
                     var26 = class_296.method_2083(185, 103, 117, 119);
                  } else {
                     var26 = class_296.method_2083(200, 23, 179, 207);
                  }

                  var3.field_1935.method_80(this.field_208, class_205.method_1376(var26, Paint$Style.field_4585));
                  this.field_208.method_1969(var6 - this.field_157, var7 + var8 + (float)var24 + var13, var6 - this.field_157 + var12, var7 + var8 + (float)var24 + (float)var11 + var13);
                  if (var25) {
                     var26 = class_296.method_2083(105, 123, 182, 193);
                  } else {
                     var26 = class_296.method_2083(120, 45, 211, 241);
                  }

                  var3.field_1935.method_80(this.field_208, class_205.method_1376(var26, Paint$Style.field_4586));
                  var13 += (float)var11;
                  var11 = var23;
               }

               if (this.method_230() >= 0.0F) {
                  var14 = var11 + 1;
                  this.field_208.method_1969(var6 - this.field_157, var7 + var8 + (float)var14 + var13, var6 - this.field_157 + var12 * this.method_230(), var7 + var8 + (float)var14 + (float)var11 + var13);
                  var3.field_1935.method_80(this.field_208, class_205.method_1375(200, 0, 0, 150, Paint$Style.field_4585));
                  this.field_208.method_1969(var6 - this.field_157, var7 + var8 + (float)var14 + var13, var6 - this.field_157 + var12, var7 + var8 + (float)var14 + (float)var11 + var13);
                  var3.field_1935.method_80(this.field_208, class_205.method_1375(120, 0, 0, 230, Paint$Style.field_4586));
                  float var10000 = var13 + (float)var11;
               }

               if (var3.field_1988 < 1.0F) {
                  var3.field_1935.method_90();
               }

            }
         }
      }
   }

   // $FF: renamed from: d (float) void
   public strictfp void method_178(float var1) {
   }

   // $FF: renamed from: m (float) void
   public strictfp void method_180(float var1) {
      if (!this.field_141 && this.field_182 == null) {
         if (this.field_177) {
            class_236 var2 = class_236.method_1549();
            if (this.field_143 == var2.field_1915 || var2.field_1939.method_769(this)) {
               if (var2.field_1937.showUnitWaypoints && var2.field_2012 <= 40) {
                  ++var2.field_2012;
                  this.method_236();
               }

               this.method_235();
            }

            if (var2.field_1939.method_734() == 1) {
               this.method_237();
            }
         }

      }
   }

   // $FF: renamed from: bp () void
   public strictfp void method_235() {
   }

   // $FF: renamed from: F () void
   public strictfp void method_236() {
      class_236 var1 = class_236.method_1549();
      class_512 var2 = null;
      class_512 var3 = null;
      if (this instanceof class_44) {
         class_44 var4 = (class_44)this;
         int var5 = var4.method_402();
         float var6 = this.dh;
         float var7 = this.di;

         for(int var8 = 0; var8 < var5; ++var8) {
            class_512 var9 = var4.method_401(var8);
            if (var9 != null) {
               field_209.method_2793(2.0F);
               if (var9.method_3255() == class_501.field_4596) {
                  field_209.method_2788(Color.method_3077(180, 180, 0, 0));
               } else if (var9.method_3255() == class_501.field_4602) {
                  field_209.method_2788(Color.method_3077(180, 180, 180, 0));
               } else if (var9.method_3255() == class_501.field_4597) {
                  field_209.method_2788(Color.method_3077(180, 0, 0, 180));
               } else if (var9.method_3255() == class_501.field_4598) {
                  field_209.method_2788(Color.method_3077(180, 0, 0, 180));
               } else if (var9.method_3255() != class_501.field_4599 && var9.method_3255() != class_501.field_4603) {
                  if (var9.method_3255() == class_501.field_4601) {
                     field_209.method_2788(Color.method_3077(180, 180, 0, 42));
                  } else if (var9.method_3255() != class_501.field_4605 && var9.method_3255() != class_501.field_4606) {
                     if (var9.method_3255() == class_501.field_4604) {
                        field_209.method_2788(Color.method_3077(180, 0, 210, 210));
                        if (var2 == null) {
                           var2 = var9;
                        } else {
                           var3 = var9;
                        }
                     } else {
                        field_209.method_2788(Color.method_3077(180, 0, 180, 0));
                     }
                  } else {
                     field_209.method_2788(Color.method_3077(180, 97, 20, 229));
                  }
               } else {
                  field_209.method_2788(Color.method_3077(180, 0, 180, 180));
               }

               float var10 = var9.method_3258();
               float var11 = var9.method_3259();
               class_39 var12 = var9.method_3260();
               if (var12 != null && var9.method_3257() && !var12.method_212() && !var12.method_244(var1.field_1915)) {
                  float var13 = 400.0F;
                  float var14 = class_296.method_2031(var6, var7, var10, var11);
                  var10 = var6 + class_296.method_2099(var14) * var13;
                  var11 = var7 + class_296.method_2098(var14) * var13;
               }

               var1.field_1935.method_96(var6 - var1.field_1965, var7 - var1.field_1966, var10 - var1.field_1965, var11 - var1.field_1966, field_209);
               var6 = var10;
               var7 = var11;
            }
         }
      }

      if (var2 != null && var3 != null && var2 != var3) {
         field_209.method_2788(Color.method_3077(50, 0, 210, 210));
         float var15 = var3.method_3258();
         float var16 = var3.method_3259();
         var1.field_1935.method_96(var15 - var1.field_1965, var16 - var1.field_1966, var2.method_3258() - var1.field_1965, var2.method_3259() - var1.field_1966, field_209);
      }

   }

   // $FF: renamed from: bq () void
   public strictfp void method_237() {
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
      boolean var2 = false;
      if (this.field_178 != 0.0F) {
         this.field_178 = class_296.method_2020(this.field_178, var1);
         if (this.field_178 % 15.0F < 7.0F) {
            var2 = true;
         }
      }

      if (this.field_177 || var2) {
         class_236 var3 = class_236.method_1549();
         float var4 = this.dh - var3.field_1965;
         float var5 = this.di - var3.field_1966 - this.dj;
         Paint var6;
         if (var3.field_1915 == this.field_143) {
            var6 = field_188;
         } else if (var3.field_1915.method_943(this.field_143)) {
            var6 = field_190;
         } else {
            var6 = field_192;
         }

         if (var2) {
            var6 = field_191;
         }

         if (this.method_212()) {
            if (var6 == field_188) {
               var6 = field_189;
            }

            Rect var7 = this.method_238();
            if (var7 != null) {
               this.field_208.method_1971(var7);
               RectF var10000 = this.field_208;
               var10000.field_2417 *= (float)var3.field_1932.field_3331;
               var10000 = this.field_208;
               var10000.field_2419 *= (float)var3.field_1932.field_3331;
               var10000 = this.field_208;
               var10000.field_2416 *= (float)var3.field_1932.field_3330;
               var10000 = this.field_208;
               var10000.field_2418 *= (float)var3.field_1932.field_3330;
               float var8 = this.method_325();
               this.field_208.method_1972(-(this.method_323() - (float)var3.field_1932.field_3332), -(this.method_324() - (float)var3.field_1932.field_3333));
               class_296.method_2052(this.field_208, var8);
               this.field_208.method_1972(var4, var5);
               float var9 = 11.0F;
               var3.field_1935.method_96(this.field_208.field_2416 - var9, this.field_208.field_2417, this.field_208.field_2418 + var9, this.field_208.field_2417, var6);
               var3.field_1935.method_96(this.field_208.field_2416 - var9, this.field_208.field_2419, this.field_208.field_2418 + var9, this.field_208.field_2419, var6);
               var3.field_1935.method_96(this.field_208.field_2416, this.field_208.field_2417 - var9, this.field_208.field_2416, this.field_208.field_2419 + var9, var6);
               var3.field_1935.method_96(this.field_208.field_2418, this.field_208.field_2417 - var9, this.field_208.field_2418, this.field_208.field_2419 + var9, var6);
            }
         } else {
            var3.field_1935.method_85(var4, var5, this.field_158 + var3.field_2013, var6);
         }
      }

   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      return true;
   }

   // $FF: renamed from: br () android.graphics.Rect
   public strictfp Rect method_238() {
      return field_213;
   }

   // $FF: renamed from: bs () android.graphics.Rect
   public strictfp Rect method_239() {
      return field_213;
   }

   // $FF: renamed from: p () com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_240() {
      return null;
   }

   // $FF: renamed from: f (float) boolean
   public strictfp boolean method_182(float var1) {
      class_306 var2 = this.method_240();
      if (var2 == null) {
         return false;
      } else if (this.field_141) {
         return true;
      } else {
         class_236 var3 = class_236.method_1549();
         var3.field_1935.method_90();
         float var4 = (float)((int)(this.dh - var3.field_1965));
         float var5 = (float)((int)(this.di - var3.field_1966));
         var4 *= var3.field_1988;
         var5 *= var3.field_1988;
         Paint var6 = null;
         if (this.field_177) {
            var6 = field_131;
         } else {
            var6 = field_130;
         }

         var3.field_1935.method_69(var2, var4, var5, var6);
         var3.field_1935.method_89();
         var3.method_1584();
         return true;
      }
   }

   // $FF: renamed from: bt () boolean
   public final strictfp boolean method_241() {
      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k) boolean
   public strictfp boolean method_183(class_236 var1) {
      if (!var1.field_1980.method_1914((int)this.dh, (int)this.di)) {
         return false;
      } else if (this.field_182 != null) {
         return false;
      } else {
         return this.method_244(var1.field_1915);
      }
   }

   // $FF: renamed from: c_ () boolean
   public strictfp boolean method_242() {
      return true;
   }

   // $FF: renamed from: bu () boolean
   public final strictfp boolean method_243() {
      class_236 var1 = class_236.method_1549();
      return this.method_244(var1.field_1915);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.k) boolean
   public strictfp boolean method_244(class_107 var1) {
      class_236 var2 = class_236.method_1549();
      class_408 var3 = var2.field_1932;
      if (this.field_143 != var1 && var3.field_3344 && var1.field_1242 != null) {
         var3.method_2578(this.dh, this.di);
         int var4 = var3.field_3355;
         int var5 = var3.field_3356;
         if (var3.method_2584(var4, var5) && var1.field_1242[var4][var5] >= 5) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      if (!this.field_141) {
         if (this.field_169 > 0.0F) {
            if (this.field_169 > this.field_168 * 2.0F) {
               this.field_169 = this.field_168 * 2.0F;
            }

            this.field_169 = class_296.method_2020(this.field_169, var1);
         }

         if (this.field_167 < this.field_168 / 3.0F && this.dj > -1.0F && !this.method_222()) {
            class_236 var2 = class_236.method_1549();
            this.field_205 += var1;
            this.field_206 += var1;
            this.field_207 += var1;
            class_390 var3;
            if (this.field_205 > 10.0F && this.field_206 < 300.0F) {
               this.field_205 = 0.0F;
               if (this.de && var2.field_1994) {
                  var3 = var2.field_1938.method_2488(this.dh, this.di, this.dj, class_393.field_3201, false, class_395.field_3221);
                  if (var3 != null) {
                     class_35.method_193(var3, true);
                     var3.field_3147 = this.dh;
                     var3.field_3148 = this.di;
                     var3.field_3149 = this.dj;
                     var3.field_3154 += class_296.method_2033(-0.1F, 0.1F) + this.field_150;
                     var3.field_3155 += class_296.method_2033(-0.1F, 0.1F) + this.field_151;
                     var3.field_3147 += class_296.method_2033(-4.0F, 4.0F);
                     var3.field_3148 += class_296.method_2033(-4.0F, 4.0F);
                  }
               }
            }

            if (this.field_207 > 30.0F && this.field_206 < 600.0F) {
               this.field_207 = 0.0F;
               var2.field_1938.method_2486();
               var3 = var2.field_1938.method_2488(this.dh, this.di, this.dj, class_393.field_3201, false, class_395.field_3221);
               if (var3 != null) {
                  class_35.method_192(var3, true);
                  var3.field_3147 = this.dh;
                  var3.field_3148 = this.di;
                  var3.field_3149 = this.dj;
                  var3.field_3154 += class_296.method_2033(-0.1F, 0.1F);
                  var3.field_3155 += class_296.method_2033(-0.1F, 0.1F);
                  var3.field_3147 += class_296.method_2033(-4.0F, 4.0F);
                  var3.field_3148 += class_296.method_2033(-4.0F, 4.0F);
               }
            }
         } else if (this.field_206 != 0.0F) {
            this.field_206 = 0.0F;
         }

         if (this.field_167 <= 0.0F) {
            this.method_248();
         }
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public strictfp float method_245(class_39 var1, float var2, class_97 var3) {
      float var4 = var2;
      float var5 = 1.0F;
      float var6 = 1.0F;
      if (var3 != null) {
         var5 = var3.field_890;
         var6 = var3.field_891;
      }

      float var7;
      if (this.field_170 < this.field_173) {
         var7 = this.field_173 - this.field_170;
         float var8 = var2 * var5;
         if (var7 > var8) {
            this.field_170 += var8;
            var4 = var2 - var8 * var6;
         } else {
            this.field_170 = this.field_173;
            var4 = var2 - var8 * var6;
         }
      }

      if (var4 > 0.0F && this.field_167 < this.field_168) {
         var7 = this.field_168 - this.field_167;
         if (var7 > var4) {
            this.field_167 += var4;
            var4 = 0.0F;
         } else {
            this.field_167 = this.field_168;
            float var10000 = var4 - var7;
         }
      }

      return 0.0F;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) float
   public strictfp float method_246(class_39 var1, float var2, class_97 var3) {
      class_236 var4 = class_236.method_1549();
      if (this.field_160 < 1.0F) {
         var2 *= 1.75F;
      }

      float var5 = 1.0F;
      float var6 = 1.0F;
      if (var3 != null) {
         var5 = var3.field_890;
         var6 = var3.field_891;
      }

      float var7 = var2;
      float var8 = 0.0F;
      if (this.field_172 == 0.0F && this.field_170 > 0.0F) {
         float var9 = var2 * var5;
         if (this.field_170 < var9) {
            var7 = var2 - this.field_170 * var6;
            var8 += this.field_170;
            this.field_171 += this.field_170;
            this.field_170 = 0.0F;
         } else {
            this.field_170 -= var9;
            this.field_171 += var9;
            var8 += var9;
            var7 = var2 - var2 * var6;
         }
      }

      if (var7 > 0.0F) {
         if (this.field_167 < var7) {
            float var10000 = var7 - this.field_167;
            var8 += this.field_167;
            this.field_167 = 0.0F;
         } else {
            this.field_167 -= var7;
            var8 += var7;
            var7 = 0.0F;
         }
      }

      this.field_120 = var4.field_1921;
      if (var1 != null) {
         this.field_121 = var1;
      } else {
         this.field_121 = null;
      }

      this.method_248();
      return var8;
   }

   // $FF: renamed from: n (float) com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_247(float var1) {
      class_236 var2 = class_236.method_1549();
      return (float)var2.field_1921 - var1 * 1000.0F < (float)this.field_120 ? this.field_121 : null;
   }

   // $FF: renamed from: bv () void
   public strictfp void method_248() {
      if (!this.field_141 && this.field_167 <= 0.0F) {
         this.method_253();
      }

   }

   // $FF: renamed from: n () void
   public strictfp void method_249() {
   }

   // $FF: renamed from: e () boolean
   public strictfp boolean method_250() {
      class_236 var1 = class_236.method_1549();
      var1.field_1938.method_2463(this.dh, this.di, this.dj);
      return false;
   }

   // $FF: renamed from: aV () void
   public strictfp void method_251() {
      class_236 var1 = class_236.method_1549();
      var1.field_1939.method_765(this);
      this.field_141 = true;
      this.field_142 = (long)var1.field_1921;
      if (this.field_180 != null) {
         int var2 = this.method_317();

         for(int var3 = 0; var3 < var2; ++var3) {
            this.field_180[var3].field_4616 = null;
         }
      }

      if (field_126.remove(this)) {
         this.field_143.method_922(true);
      }

      var1.field_1949.method_3239(this);
   }

   // $FF: renamed from: bw () void
   public strictfp void method_252() {
      this.method_251();
      this.method_184();
   }

   // $FF: renamed from: aW () void
   public strictfp void method_253() {
      this.method_251();
      if (!this.method_250()) {
         this.method_184();
      }

   }

   // $FF: renamed from: a (android.graphics.RectF) boolean
   public strictfp boolean method_254(RectF var1) {
      return this.dh + this.field_157 > var1.field_2416 && this.dh - this.field_157 < var1.field_2418 && this.di + this.field_157 > var1.field_2417 && this.di - this.field_157 < var1.field_2419;
   }

   // $FF: renamed from: b (float, float, float) boolean
   public strictfp boolean method_255(float var1, float var2, float var3) {
      float var4 = class_296.method_2026(this.dh, this.di, var1, var2);
      float var5 = this.field_157 + var3;
      return var4 < var5 * var5;
   }

   // $FF: renamed from: a (android.graphics.Point) boolean
   public strictfp boolean method_256(Point var1) {
      float var2 = class_296.method_2026(this.dh, this.di, (float)var1.field_4722, (float)var1.field_4723);
      float var3 = this.field_157;
      return var2 < var3 * var3;
   }

   // $FF: renamed from: n (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_257(class_39 var1) {
      float var2 = class_296.method_2026(this.dh, this.di, var1.dh, var1.di);
      float var3 = this.field_157 + var1.field_157;
      return var2 < var3 * var3;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) void
   public strictfp void method_258(class_107 var1) {
      if (var1 == null) {
         throw new RuntimeException("Could not set team to null");
      } else {
         this.field_143 = var1;
      }
   }

   // $FF: renamed from: G (int) void
   public final strictfp void method_259(int var1) {
      this.field_143 = class_107.method_954(var1);
      if (this.field_143 == null) {
         throw new RuntimeException("Could not find team with id: " + var1);
      } else {
         this.method_258(this.field_143);
      }
   }

   // $FF: renamed from: E () java.util.ArrayList
   public strictfp ArrayList method_260() {
      return field_214;
   }

   // $FF: renamed from: K () int
   public strictfp int method_261() {
      return 1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_262(class_121 var1, boolean var2) {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a.l, boolean, android.graphics.PointF, com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_263(class_121 var1, boolean var2, PointF var3, class_39 var4) {
      this.method_262(var1, var2);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.l, boolean) void
   public strictfp void method_264(class_121 var1, boolean var2) {
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.a.l) void
   public strictfp void method_265(class_121 var1) {
   }

   // $FF: renamed from: b (java.lang.String) com.corrodinggames.rts.game.units.a.l
   public final strictfp class_121 method_266(String var1) {
      Iterator var2 = this.method_260().iterator();

      class_121 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_121)var2.next();
      } while(!var3.method_1043().equals(var1));

      return var3;
   }

   // $FF: renamed from: c (java.lang.String) com.corrodinggames.rts.game.units.a.l
   public final strictfp class_121 method_267(String var1) {
      ArrayList var2 = this.method_260();
      int var3 = 0;

      for(int var4 = var2.size(); var3 < var4; ++var3) {
         class_121 var5 = (class_121)var2.get(var3);
         if (var5.method_1043() == var1) {
            return var5;
         }
      }

      return null;
   }

   // $FF: renamed from: bx () boolean
   public strictfp boolean method_268() {
      if (this.method_212()) {
         return !class_121.method_1038(this.method_269());
      } else {
         return false;
      }
   }

   // $FF: renamed from: by () java.lang.String
   public strictfp String method_269() {
      return class_121.field_1347;
   }

   // $FF: renamed from: bz () float
   public strictfp float method_270() {
      return -1.0F;
   }

   // $FF: renamed from: bA () boolean
   public strictfp boolean method_271() {
      return false;
   }

   // $FF: renamed from: a (java.util.ArrayList) void
   public strictfp void method_272(ArrayList var1) {
      var1.clear();
   }

   // $FF: renamed from: bB () java.lang.String
   public strictfp String method_273() {
      return class_121.field_1347;
   }

   // $FF: renamed from: f (com.corrodinggames.rts.game.units.ap) java.lang.String
   public strictfp String method_274(class_24 var1) {
      return class_121.field_1347;
   }

   // $FF: renamed from: bC () int
   public final strictfp int method_275() {
      int var1 = 0;
      Iterator var2 = this.method_260().iterator();

      while(true) {
         class_121 var3;
         do {
            if (!var2.hasNext()) {
               return var1;
            }

            var3 = (class_121)var2.next();
         } while(!var3.method_1051(this) && !var3.method_1067());

         ++var1;
      }
   }

   // $FF: renamed from: o (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_276(class_39 var1) {
      return false;
   }

   // $FF: renamed from: p (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_277(class_39 var1) {
      return false;
   }

   // $FF: renamed from: bD () boolean
   public strictfp boolean method_278() {
      return false;
   }

   // $FF: renamed from: h () com.corrodinggames.rts.game.units.ac
   public abstract class_503 method_279();

   // $FF: renamed from: i () boolean
   public abstract boolean method_280();

   // $FF: renamed from: bE () boolean
   public strictfp boolean method_281() {
      return this.method_280();
   }

   // $FF: renamed from: H () boolean
   public abstract boolean method_282();

   // $FF: renamed from: X () boolean
   public abstract boolean method_283();

   // $FF: renamed from: Y () boolean
   public abstract boolean method_284();

   // $FF: renamed from: bF () boolean
   public strictfp boolean method_285() {
      return false;
   }

   // $FF: renamed from: G () boolean
   public strictfp boolean method_286() {
      return false;
   }

   // $FF: renamed from: bG () int
   public strictfp int method_287() {
      return 1;
   }

   // $FF: renamed from: o_ () boolean
   public abstract boolean method_288();

   // $FF: renamed from: q (com.corrodinggames.rts.game.units.aa) int
   public strictfp int method_289(class_39 var1) {
      return 0;
   }

   // $FF: renamed from: r () int
   public strictfp int method_290() {
      return 85;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_291(class_39 var1) {
      return 1.0F;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa) float
   public strictfp float method_292(class_39 var1) {
      return 0.2F;
   }

   // $FF: renamed from: bH () float
   public strictfp float method_293() {
      return 1.0F;
   }

   // $FF: renamed from: bI () float
   public strictfp float method_294() {
      return 0.0F;
   }

   // $FF: renamed from: o () com.corrodinggames.rts.game.units.ap
   public abstract class_24 method_295();

   // $FF: renamed from: bJ () float
   public strictfp float method_296() {
      return 1.0F;
   }

   // $FF: renamed from: bK () android.graphics.RectF
   public strictfp RectF method_297() {
      class_236 var1 = class_236.method_1549();
      float var2 = this.method_296();
      field_217.method_1969(this.dh - (float)this.dn * var2 - var1.field_1965, this.di - (float)this.do * var2 - var1.field_1966, this.dh + (float)this.dn * var2 - var1.field_1965, this.di + (float)this.do * var2 - var1.field_1966);
      return field_217;
   }

   // $FF: renamed from: bL () android.graphics.RectF
   public strictfp RectF method_298() {
      class_236 var1 = class_236.method_1549();
      field_217.method_1969(this.dh - (float)this.dn - var1.field_1965, this.di - (float)this.do - var1.field_1966, this.dh + (float)this.dn - var1.field_1965, this.di + (float)this.do - var1.field_1966);
      return field_217;
   }

   // $FF: renamed from: a_ (boolean) android.graphics.Rect
   public strictfp Rect method_299(boolean var1) {
      byte var2 = 0;
      byte var3 = 0;
      field_218.method_1911(var2, var3, var2 + this.dl, var3 + this.dm);
      return field_218;
   }

   // $FF: renamed from: a (boolean, int) android.graphics.Rect
   public strictfp Rect method_300(boolean var1, int var2) {
      byte var3 = 0;
      byte var4 = 0;
      int var5 = var3 + var2 * this.dl;
      field_218.method_1911(var5, var4, var5 + this.dl, var4 + this.dm);
      return field_218;
   }

   // $FF: renamed from: a (boolean, int, int) android.graphics.Rect
   public strictfp Rect method_301(boolean var1, int var2, int var3) {
      int var4 = var2 * this.dl;
      int var5 = var3 * this.dm;
      field_218.method_1911(var4, var5, var4 + this.dl, var5 + this.dm);
      return field_218;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float) boolean
   public strictfp boolean method_302(class_39 var1, float var2) {
      return false;
   }

   // $FF: renamed from: a (java.lang.String) void
   public strictfp void method_303(String var1) {
   }

   // $FF: renamed from: bM () boolean
   public final strictfp boolean method_304() {
      return this.method_306() && this.dj <= 2.0F;
   }

   // $FF: renamed from: bN () boolean
   public strictfp boolean method_305() {
      return class_205.method_1371(this.dh, this.di);
   }

   // $FF: renamed from: bO () boolean
   public strictfp boolean method_306() {
      return class_205.method_1372(this.dh, this.di);
   }

   // $FF: renamed from: bP () boolean
   public strictfp boolean method_307() {
      return class_205.method_1373(this.dh, this.di);
   }

   // $FF: renamed from: aX () int
   public strictfp int method_308() {
      byte var1 = 0;
      int var2 = var1 * 31 + (int)this.method_220();
      var2 = var2 * 31 + (int)this.field_168;
      return var2;
   }

   // $FF: renamed from: bQ () int
   public strictfp int method_309() {
      return this.method_295().method_131(this.method_261());
   }

   // $FF: renamed from: a (float, float, float, float, float) android.graphics.PointF
   public strictfp PointF method_310(float var1, float var2, float var3, float var4, float var5) {
      float var6 = 0.0F;
      float var9;
      if ((double)var3 > 0.1D && this.field_179) {
         for(int var7 = 0; var7 < 3; ++var7) {
            PointF var8 = this.method_311(var6);
            var9 = class_296.method_2027(var1, var2, var8.field_2406, var8.field_2407);
            var6 = var9 / var3;
         }
      }

      if (var6 > var4) {
         var6 = var4;
      }

      PointF var10 = this.method_311(var6);
      float var11 = class_296.method_2026(var1, var2, var10.field_2406, var10.field_2407);
      if (var5 * var5 < var11) {
         var9 = class_296.method_2031(var1, var2, var10.field_2406, var10.field_2407);
         var10.field_2406 = var1 + class_296.method_2099(var9) * var5;
         var10.field_2407 = var2 + class_296.method_2098(var9) * var5;
      }

      field_219.method_1961(var10);
      return field_219;
   }

   // $FF: renamed from: k (float) android.graphics.PointF
   strictfp PointF method_311(float var1) {
      field_220.method_1960(this.dh + this.field_150 * var1, this.di + this.field_151 * var1);
      return field_220;
   }

   // $FF: renamed from: l () boolean
   public abstract boolean method_312();

   // $FF: renamed from: bR () boolean
   public strictfp boolean method_313() {
      return false;
   }

   // $FF: renamed from: bS () boolean
   public strictfp boolean method_314() {
      return false;
   }

   // $FF: renamed from: bT () void
   public strictfp void method_315() {
   }

   // $FF: renamed from: g () float
   public strictfp float method_316() {
      return 0.0F;
   }

   // $FF: renamed from: aL () int
   public strictfp int method_317() {
      return 1;
   }

   // $FF: renamed from: B () boolean
   public strictfp boolean method_318() {
      return false;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.aa) boolean
   public strictfp boolean method_319(class_39 var1) {
      return true;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.k) void
   public strictfp void method_320(class_107 var1) {
      if (this.field_221 == null || this.field_221.length != 10) {
         this.field_221 = new class_517[10];

         for(int var2 = 0; var2 < this.field_221.length; ++var2) {
            this.field_221[var2] = new class_517();
         }
      }

      class_517 var4 = this.field_221[var1.field_1227];
      boolean var3;
      if (this.field_141) {
         if (var4.field_4697) {
            var3 = this.method_244(var1);
            if (var3) {
               var4.field_4697 = false;
            }
         }
      } else {
         var3 = this.method_244(var1);
         if (var3) {
            var4.field_4697 = true;
            var4.field_4698 = this.method_261();
         }
      }

   }

   // $FF: renamed from: bU () void
   public strictfp void method_321() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1915 != null && this.field_143 != var1.field_1915 && var1.field_1915.field_1227 >= 0) {
         class_517 var2 = this.field_221[var1.field_1915.field_1227];
         if (var2.field_4699 != null && var2.field_4699.field_3085) {
            var2.field_4699 = null;
         }

         if (var2.field_4699 == null && var2.field_4697) {
            boolean var3 = this.method_244(var1.field_1915);
            if (!var3) {
               class_388 var4 = new class_388();
               var2.field_4699 = var4;
               var4.field_3086 = this.method_295();
               var4.field_3089 = this.dh;
               var4.field_3090 = this.di;
               var4.field_3096 = false;
               var4.field_3087 = this.field_143;
               var4.field_3088 = var2.field_4698;
               var4.field_3092 = var1.field_1915;
               var4.field_3102 = this;
            }
         }
      }

   }

   // $FF: renamed from: bV () android.graphics.PointF
   public strictfp PointF method_322() {
      field_222.method_1960(0.0F, 0.0F);
      return field_222;
   }

   // $FF: renamed from: bW () float
   public strictfp float method_323() {
      return (float)class_236.method_1549().field_1932.field_3332;
   }

   // $FF: renamed from: bX () float
   public strictfp float method_324() {
      return (float)class_236.method_1549().field_1932.field_3333;
   }

   // $FF: renamed from: bY () float
   public strictfp float method_325() {
      class_236 var1 = class_236.method_1549();
      return (float)(var1.field_1932.field_3332 + 2) + var1.field_2013;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b, android.graphics.Point) android.graphics.Point
   public strictfp Point method_326(class_408 var1, Point var2) {
      var2.field_4722 = (int)((this.dh - this.method_323() + 1.0F) * var1.field_3334);
      var2.field_4723 = (int)((this.di - this.method_324() + 1.0F) * var1.field_3335);
      return var2;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.b.b, android.graphics.RectF) android.graphics.RectF
   public strictfp RectF method_327(class_408 var1, RectF var2) {
      int var3 = (int)((this.dh - this.method_323() + 1.0F) * var1.field_3334);
      int var4 = (int)((this.di - this.method_324() + 1.0F) * var1.field_3335);
      var1.method_2579(var3, var4);
      float var5 = (float)var1.field_3355;
      float var6 = (float)var1.field_3356;
      Rect var7 = this.method_239();
      var2.method_1969(var5 + (float)(var7.field_2352 * var1.field_3330), var6 + (float)(var7.field_2353 * var1.field_3331), var5 + (float)((var7.field_2354 + 1) * var1.field_3330), var6 + (float)((var7.field_2355 + 1) * var1.field_3331));
      return var2;
   }

   // $FF: renamed from: bZ () void
   public strictfp void method_328() {
   }

   // $FF: renamed from: ca () boolean
   public strictfp boolean method_329() {
      return false;
   }

   // $FF: renamed from: cb () boolean
   public strictfp boolean method_330() {
      return false;
   }

   // $FF: renamed from: cc () com.corrodinggames.rts.game.units.custom.d
   public strictfp class_478 method_331() {
      return null;
   }

   static {
      field_130.method_2781(true);
      field_130.method_2791(255, 195, 195, 195);
      field_131 = new class_441();
      field_131.method_2781(true);
      field_132 = new LightingColorFilter(Color.method_3076(255, 255, 255), Color.method_3076(100, 100, 100));
      field_131.method_2791(255, 255, 255, 255);
      field_131.method_2796(field_132);
      field_188 = new class_441();
      field_189 = new class_441();
      field_190 = new class_441();
      field_191 = new class_441();
      field_192 = new class_441();
      field_193 = new Paint();
      field_194 = new Paint();
      field_195 = new Paint();
      field_196 = new class_441();
      field_197 = new class_441();
      field_198 = new class_441();
      field_199 = new class_441();
      field_200 = new Paint();
      field_188.method_2791(180, 0, 255, 0);
      field_188.method_2786(Paint$Style.field_4586);
      field_188.method_2793(2.0F);
      field_189.method_2791(130, 0, 255, 0);
      field_189.method_2786(Paint$Style.field_4586);
      field_189.method_2793(2.0F);
      field_193.method_2791(70, 0, 255, 0);
      field_193.method_2786(Paint$Style.field_4586);
      field_193.method_2793(1.0F);
      field_190.method_2791(180, 255, 0, 0);
      field_190.method_2786(Paint$Style.field_4586);
      field_190.method_2793(2.0F);
      field_194.method_2791(70, 255, 0, 0);
      field_194.method_2786(Paint$Style.field_4586);
      field_194.method_2793(1.0F);
      field_192.method_2791(180, 255, 255, 0);
      field_192.method_2786(Paint$Style.field_4586);
      field_192.method_2793(2.0F);
      field_195.method_2791(70, 255, 255, 0);
      field_195.method_2786(Paint$Style.field_4586);
      field_195.method_2793(1.0F);
      field_191.method_2791(180, 255, 255, 255);
      field_191.method_2786(Paint$Style.field_4586);
      field_191.method_2793(2.0F);
      field_196.method_2791(90, 235, 235, 235);
      field_196.method_2786(Paint$Style.field_4586);
      field_196.method_2793(1.0F);
      field_197.method_2791(100, 235, 235, 235);
      field_197.method_2786(Paint$Style.field_4586);
      field_197.method_2793(2.0F);
      field_198.method_2791(90, 235, 0, 0);
      field_198.method_2786(Paint$Style.field_4586);
      field_198.method_2793(1.0F);
      field_199.method_2786(Paint$Style.field_4586);
      field_200.method_2786(Paint$Style.field_4586);
      field_201 = new Paint();
      field_209 = new Paint();
      field_210 = new Paint();
      field_211 = new RectF();
      field_212 = new Rect();
      field_213 = new Rect();
      field_214 = new ArrayList();
      field_215 = new ArrayList();
      field_217 = new RectF();
      field_218 = new Rect();
      field_219 = new PointF();
      field_220 = new PointF();
      field_222 = new PointF();
   }
}
