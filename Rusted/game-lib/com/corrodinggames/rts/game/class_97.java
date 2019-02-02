package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.units.aa;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_46;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.custom.class_364;
import com.corrodinggames.rts.game.units.custom.class_476;
import com.corrodinggames.rts.game.units.custom.class_478;
import com.corrodinggames.rts.game.units.custom.class_493;
import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.class_37;
import com.corrodinggames.rts.gameFramework.a.class_525;
import com.corrodinggames.rts.gameFramework.b.class_35;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_461;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.h.class_441;
import com.corrodinggames.rts.gameFramework.utility.class_193;
import com.corrodinggames.rts.gameFramework.utility.class_199;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.f
public class class_97 extends class_37 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.utility.k
   public static class_193 field_833 = new class_193();
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_834 = null;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_835 = null;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.e
   static class_306 field_836 = null;
   // $FF: renamed from: e android.graphics.Rect
   static Rect field_837 = new Rect();
   // $FF: renamed from: f android.graphics.RectF
   static RectF field_838 = new RectF();
   // $FF: renamed from: g float
   public float field_839;
   // $FF: renamed from: h float
   public float field_840;
   // $FF: renamed from: i com.corrodinggames.rts.game.units.aa
   public class_39 field_841;
   // $FF: renamed from: j com.corrodinggames.rts.game.units.aa
   public class_39 field_842;
   // $FF: renamed from: k boolean
   public boolean field_843;
   // $FF: renamed from: l float
   public float field_844;
   // $FF: renamed from: m float
   public float field_845;
   // $FF: renamed from: n com.corrodinggames.rts.game.f
   public class_97 field_846;
   // $FF: renamed from: o float
   public float field_847 = -1.0F;
   // $FF: renamed from: p float
   public float field_848 = 0.1F;
   // $FF: renamed from: q float
   public float field_849;
   // $FF: renamed from: r float
   public float field_850 = 2.0F;
   // $FF: renamed from: s float
   public float field_851 = -1.0F;
   // $FF: renamed from: t boolean
   public boolean field_852 = true;
   // $FF: renamed from: u boolean
   public boolean field_853;
   // $FF: renamed from: v boolean
   public boolean field_854;
   // $FF: renamed from: w boolean
   public boolean field_855;
   // $FF: renamed from: x boolean
   public boolean field_856;
   // $FF: renamed from: y boolean
   public boolean field_857;
   // $FF: renamed from: z float
   public float field_858;
   // $FF: renamed from: A boolean
   public boolean field_859;
   // $FF: renamed from: B float
   public float field_860 = 1.0F;
   // $FF: renamed from: C float
   public float field_861;
   // $FF: renamed from: D float
   public float field_862;
   // $FF: renamed from: E float
   public float field_863;
   // $FF: renamed from: F boolean
   public boolean field_864;
   // $FF: renamed from: G float
   public float field_865;
   // $FF: renamed from: H float[]
   public float[] field_866;
   // $FF: renamed from: I short
   public short field_867 = -1;
   // $FF: renamed from: J short
   public short field_868 = -1;
   // $FF: renamed from: K short
   public short field_869 = 0;
   // $FF: renamed from: L com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_870;
   // $FF: renamed from: M com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_871;
   // $FF: renamed from: N boolean
   public boolean field_872 = true;
   // $FF: renamed from: O boolean
   public boolean field_873;
   // $FF: renamed from: P float
   public float field_874;
   // $FF: renamed from: Q boolean
   public boolean field_875 = false;
   // $FF: renamed from: R float
   public float field_876 = 0.0F;
   // $FF: renamed from: S float
   public float field_877 = 0.0F;
   // $FF: renamed from: T float
   public float field_878;
   // $FF: renamed from: U float
   public float field_879;
   // $FF: renamed from: V boolean
   public boolean field_880;
   // $FF: renamed from: W boolean
   public boolean field_881 = false;
   // $FF: renamed from: X boolean
   public boolean field_882 = false;
   // $FF: renamed from: Y boolean
   public boolean field_883 = false;
   // $FF: renamed from: Z boolean
   public boolean field_884 = true;
   // $FF: renamed from: aa boolean
   public boolean field_885;
   // $FF: renamed from: ab float
   public float field_886;
   // $FF: renamed from: ac float
   public float field_887;
   // $FF: renamed from: ad float
   public float field_888 = 1.0F;
   // $FF: renamed from: ae float
   public float field_889 = 1.0F;
   // $FF: renamed from: af float
   public float field_890 = 1.0F;
   // $FF: renamed from: ag float
   public float field_891 = 1.0F;
   // $FF: renamed from: ah float
   public float field_892;
   // $FF: renamed from: ai boolean
   public boolean field_893;
   // $FF: renamed from: aj com.corrodinggames.rts.gameFramework.utility.k
   public class_193 field_894 = new class_193();
   // $FF: renamed from: ak int
   public int field_895 = Color.method_3077(255, 255, 255, 255);
   // $FF: renamed from: al boolean
   public boolean field_896;
   // $FF: renamed from: am boolean
   public boolean field_897;
   // $FF: renamed from: an float
   public float field_898;
   // $FF: renamed from: ao float
   public float field_899;
   // $FF: renamed from: ap boolean
   public boolean field_900;
   // $FF: renamed from: aq boolean
   public boolean field_901;
   // $FF: renamed from: ar int
   public int field_902 = 0;
   // $FF: renamed from: as float
   public float field_903;
   // $FF: renamed from: at float
   public float field_904;
   // $FF: renamed from: au com.corrodinggames.rts.game.units.custom.u
   public class_493 field_905;
   // $FF: renamed from: av com.corrodinggames.rts.game.units.custom.u
   public class_493 field_906;
   // $FF: renamed from: aw com.corrodinggames.rts.game.units.custom.ak
   public class_364 field_907;
   // $FF: renamed from: ax int
   public int field_908;
   // $FF: renamed from: ay boolean
   public boolean field_909;
   // $FF: renamed from: az com.corrodinggames.rts.game.units.custom.d
   public class_478 field_910;
   // $FF: renamed from: aA boolean
   public boolean field_911;
   // $FF: renamed from: aB float
   public float field_912 = 120.0F;
   // $FF: renamed from: aC float
   public float field_913 = 15.0F;
   // $FF: renamed from: aD boolean
   public boolean field_914;
   // $FF: renamed from: aE boolean
   public boolean field_915;
   // $FF: renamed from: aF float
   public float field_916 = 40.0F;
   // $FF: renamed from: aG float
   public float field_917 = 60.0F;
   // $FF: renamed from: aH boolean
   public boolean field_918 = false;
   // $FF: renamed from: aI float
   public float field_919 = 2.0F;
   // $FF: renamed from: aJ boolean
   public boolean field_920;
   // $FF: renamed from: aK float
   public float field_921 = 7.0F;
   // $FF: renamed from: aL com.corrodinggames.rts.game.units.custom.u
   public class_493 field_922;
   // $FF: renamed from: aM float
   public float field_923;
   // $FF: renamed from: aN float
   public float field_924;
   // $FF: renamed from: aO boolean
   public boolean field_925;
   // $FF: renamed from: aP boolean
   public boolean field_926 = true;
   // $FF: renamed from: bf boolean
   private boolean field_927;
   // $FF: renamed from: aQ boolean
   public boolean field_928;
   // $FF: renamed from: aR float
   public float field_929 = 0.0F;
   // $FF: renamed from: aS boolean
   public boolean field_930;
   // $FF: renamed from: aT float
   float field_931;
   // $FF: renamed from: aU float
   float field_932;
   // $FF: renamed from: aV float
   float field_933;
   // $FF: renamed from: aW boolean
   public boolean field_934;
   // $FF: renamed from: aX boolean
   public boolean field_935;
   // $FF: renamed from: aY android.graphics.Paint
   public static Paint field_936 = new Paint();
   // $FF: renamed from: aZ android.graphics.Paint
   public static Paint field_937 = new class_441();
   // $FF: renamed from: ba android.graphics.Paint
   public static Paint field_938 = new Paint();
   // $FF: renamed from: bb android.graphics.Paint
   public static Paint field_939 = new Paint();
   // $FF: renamed from: bc android.graphics.Paint
   public static Paint field_940 = new Paint();
   // $FF: renamed from: bd android.graphics.Paint
   public static Paint field_941 = new Paint();
   // $FF: renamed from: be android.graphics.Paint
   public static Paint field_942 = new Paint();

   public strictfp class_97() {
      field_833.add(this);
   }

   // $FF: renamed from: a () void
   public strictfp void method_184() {
      field_833.remove(this);
      super.a();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, float, float) void
   public strictfp void method_693(class_39 var1, float var2, float var3, float var4) {
      this.field_841 = var1;
      this.dh = var2;
      this.di = var3;
      this.dj = var4;
      this.field_927 = false;
   }

   // $FF: renamed from: b () void
   public strictfp void method_694() {
      if (this.field_856) {
         class_236 var1 = class_236.method_1549();
         class_390 var2 = var1.field_1938.method_2480(this.dh, this.di, this.dj, 0);
         if (var2 != null) {
            var2.field_3145 = 0.7F;
            var2.field_3144 = 2.1F;
            var2.field_3179 = 2;
            var2.field_3160 = 90.0F;
            var2.field_3161 = var2.field_3160;
         }

         var1.field_1933.method_3323(class_525.field_4757, 0.8F, this.dh, this.di);
      }

      this.method_184();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_148(class_404 var1) {
      var1.method_2542(this.field_839);
      var1.method_2550(this.field_841);
      var1.method_2550(this.field_842);
      var1.method_2542(this.field_849);
      var1.method_2541(99);
      var1.method_2540(this.field_853);
      var1.method_2540(this.field_854);
      var1.method_2540(this.field_872);
      var1.method_2540(this.field_873);
      var1.method_2542(this.field_874);
      var1.method_2542(this.field_878);
      var1.method_2542(this.field_879);
      var1.method_2541(this.field_895);
      var1.method_2540(this.field_915);
      var1.method_2542(this.field_916);
      var1.method_2542(this.field_917);
      var1.method_2540(this.field_918);
      var1.method_2542(this.field_919);
      var1.method_2540(this.field_920);
      var1.method_2542(this.field_923);
      var1.method_2540(this.field_925);
      var1.method_2540(this.field_926);
      var1.method_2540(this.field_927);
      var1.method_2540(this.field_928);
      var1.method_2540(this.field_864);
      var1.method_2561(this.field_867);
      var1.method_2542(this.field_847);
      var1.method_2542(this.field_848);
      var1.method_2540(this.field_896);
      var1.method_2540(this.field_897);
      var1.method_2542(this.field_898);
      var1.method_2542(this.field_899);
      var1.method_2540(this.field_900);
      var1.method_2540(this.field_901);
      var1.method_2540(this.field_911);
      var1.method_2542(this.field_912);
      var1.method_2542(this.field_913);
      var1.method_2540(this.field_857);
      var1.method_2542(this.field_858);
      var1.method_2542(this.field_861);
      var1.method_2542(this.field_862);
      var1.method_2542(this.field_863);
      var1.method_2540(this.field_843);
      var1.method_2542(this.field_844);
      var1.method_2542(this.field_845);
      var1.method_2540(this.field_855);
      var1.method_2540(this.field_856);
      var1.method_2546(this.field_846);
      var1.method_2542(this.field_931);
      var1.method_2542(this.field_932);
      var1.method_2542(this.field_933);
      var1.method_2540(this.field_875);
      var1.method_2542(this.field_876);
      var1.method_2542(this.field_877);
      var1.method_2540(this.field_930);
      var1.method_2561(this.field_869);
      var1.method_2540(this.field_893);
      var1.method_2548(this.field_894);
      var1.method_2561(this.field_868);
      var1.method_2542(this.field_850);
      var1.method_2540(this.field_880);
      var1.method_2540(this.field_883);
      var1.method_2540(this.field_859);
      var1.method_2542(this.field_860);
      var1.method_2540(this.field_884);
      var1.method_2540(this.field_914);
      var1.method_2540(this.field_852);
      var1.method_2542(this.field_851);
      var1.method_2542(this.field_924);
      var1.method_2542(this.field_840);
      var1.method_2540(this.field_934);
      var1.method_2540(this.field_885);
      var1.method_2542(this.field_886);
      var1.method_2542(this.field_887);
      var1.method_2542(this.field_888);
      var1.method_2542(this.field_889);
      var1.method_2541(this.field_902);
      var1.method_2542(this.field_903);
      var1.method_2542(this.field_904);
      var1.method_2554((class_24)null);
      var1.method_2541(this.field_908);
      var1.method_2540(this.field_909);
      class_476.method_3111(this.field_910, var1);
      var1.method_2542(this.field_890);
      var1.method_2542(this.field_891);
      var1.method_2540(this.field_881);
      var1.method_2540(this.field_882);
      class_364.method_2318(var1, this.field_907);
      var1.method_2542(this.field_892);
      super.method_148(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_175(class_463 var1) {
      this.field_839 = var1.method_3012();
      this.field_841 = var1.method_3019();
      this.field_842 = var1.method_3020(class_461.field_3958);
      this.field_849 = var1.method_3012();
      this.field_850 = (float)var1.method_3011();
      this.field_853 = var1.method_3010();
      this.field_854 = var1.method_3010();
      this.field_872 = var1.method_3010();
      this.field_873 = var1.method_3010();
      this.field_874 = var1.method_3012();
      this.field_878 = var1.method_3012();
      this.field_879 = var1.method_3012();
      this.field_895 = var1.method_3011();
      this.field_915 = var1.method_3010();
      this.field_916 = var1.method_3012();
      this.field_917 = var1.method_3012();
      this.field_918 = var1.method_3010();
      this.field_919 = var1.method_3012();
      this.field_920 = var1.method_3010();
      this.field_923 = var1.method_3012();
      this.field_925 = var1.method_3010();
      this.field_926 = var1.method_3010();
      this.field_927 = var1.method_3010();
      if (var1.method_3006() >= 7) {
         this.field_928 = var1.method_3010();
      }

      if (var1.method_3006() >= 13) {
         this.field_864 = var1.method_3010();
         this.field_867 = var1.method_3027();
      }

      if (var1.method_3006() >= 16) {
         this.field_847 = var1.method_3012();
         this.field_848 = var1.method_3012();
      }

      if (var1.method_3006() >= 17) {
         this.field_896 = var1.method_3010();
         this.field_897 = var1.method_3010();
         this.field_898 = var1.method_3012();
         this.field_899 = var1.method_3012();
         this.field_900 = var1.method_3010();
         this.field_901 = var1.method_3010();
      }

      if (var1.method_3006() >= 18) {
         this.field_911 = var1.method_3010();
         this.field_912 = var1.method_3012();
         this.field_913 = var1.method_3012();
      }

      if (var1.method_3006() >= 28) {
         this.field_857 = var1.method_3010();
         this.field_858 = var1.method_3012();
         this.field_861 = var1.method_3012();
         this.field_862 = var1.method_3012();
         this.field_863 = var1.method_3012();
      }

      if (var1.method_3006() >= 29) {
         this.field_843 = var1.method_3010();
         this.field_844 = var1.method_3012();
         this.field_845 = var1.method_3012();
         this.field_855 = var1.method_3010();
         this.field_856 = var1.method_3010();
         this.field_846 = (class_97)var1.method_3017(f.class);
         this.field_931 = var1.method_3012();
         this.field_932 = var1.method_3012();
         this.field_933 = var1.method_3012();
         this.field_875 = var1.method_3010();
         this.field_876 = var1.method_3012();
         this.field_877 = var1.method_3012();
         this.field_930 = var1.method_3010();
         this.field_869 = var1.method_3027();
         this.field_893 = var1.method_3010();
         var1.method_3018(this.field_894, aa.class);
         this.field_868 = var1.method_3027();
      }

      if (var1.method_3006() >= 35) {
         this.field_850 = var1.method_3012();
         this.field_880 = var1.method_3010();
         this.field_883 = var1.method_3010();
         this.field_859 = var1.method_3010();
      }

      if (var1.method_3006() >= 38) {
         this.field_860 = var1.method_3012();
      }

      if (var1.method_3006() >= 39) {
         this.field_884 = var1.method_3010();
      }

      if (var1.method_3006() >= 41) {
         this.field_914 = var1.method_3010();
      }

      if (var1.method_3006() >= 43) {
         this.field_852 = var1.method_3010();
         this.field_851 = var1.method_3012();
      }

      if (var1.method_3006() >= 44) {
         this.field_924 = var1.method_3012();
      }

      if (var1.method_3006() >= 47) {
         this.field_840 = var1.method_3012();
      }

      if (var1.method_3006() >= 48) {
         this.field_934 = var1.method_3010();
      }

      if (var1.method_3006() >= 59) {
         this.field_885 = var1.method_3010();
         this.field_886 = var1.method_3012();
         this.field_887 = var1.method_3012();
         this.field_888 = var1.method_3012();
      }

      if (var1.method_3006() >= 60) {
         this.field_889 = var1.method_3012();
         this.field_902 = var1.method_3011();
         this.field_903 = var1.method_3012();
         this.field_904 = var1.method_3012();
      }

      if (var1.method_3006() >= 62) {
         var1.method_3023();
         this.field_908 = var1.method_3011();
         this.field_909 = var1.method_3010();
      }

      if (var1.method_3006() >= 63) {
         this.field_910 = class_476.method_3112(var1);
      }

      if (var1.method_3006() >= 64) {
         this.field_890 = var1.method_3012();
         this.field_891 = var1.method_3012();
      }

      if (var1.method_3006() >= 66) {
         this.field_881 = var1.method_3010();
         this.field_882 = var1.method_3010();
      }

      if (var1.method_3006() >= 67) {
         this.field_907 = class_364.method_2317(var1, true);
      }

      if (var1.method_3006() >= 68) {
         this.field_892 = var1.method_3012();
      }

      super.method_175(var1);
   }

   // $FF: renamed from: c () void
   public static strictfp void method_695() {
      class_236 var0 = class_236.method_1549();
      field_834 = var0.field_1935.method_60(R$drawable.projectiles);
      field_835 = var0.field_1935.method_60(R$drawable.projectiles2);
      field_836 = var0.field_1935.method_60(R$drawable.projectiles_large);
   }

   // $FF: renamed from: d () void
   public strictfp void method_696() {
      this.field_928 = true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, float, float) com.corrodinggames.rts.game.f
   public static strictfp class_97 method_697(class_39 var0, float var1, float var2) {
      class_97 var3 = new class_97();
      var3.field_841 = var0;
      var3.dh = var1;
      var3.di = var2;
      var3.field_895 = Color.method_3077(255, 100, 30, 30);
      var3.dg = var0.dg + 1;
      var3.df = 4;
      return var3;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa, float, float, float) com.corrodinggames.rts.game.f
   public static strictfp class_97 method_698(class_39 var0, float var1, float var2, float var3) {
      class_97 var4 = method_697(var0, var1, var2);
      var4.dj = var3;
      return var4;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public strictfp void method_699(class_39 var1) {
      if (this.field_886 != 0.0F || this.field_887 != 0.0F) {
         float var2 = class_296.method_2026(this.field_931, this.field_932, var1.dh, var1.di);
         float var3;
         if (var2 > 100.0F) {
            var3 = class_296.method_2031(this.field_931, this.field_932, var1.dh, var1.di);
         } else {
            var3 = this.field_898;
         }

         float var4 = this.field_887;
         var4 += this.field_886 / var1.method_220();
         var1.field_150 += class_296.method_2099(var3) * var4;
         var1.field_151 += class_296.method_2098(var3) * var4;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, com.corrodinggames.rts.game.units.aa, float, com.corrodinggames.rts.game.f) void
   public static strictfp void method_700(class_39 var0, class_39 var1, float var2, class_97 var3) {
      class_236 var4 = class_236.method_1549();
      if (var4.field_1919 && var2 > 0.0F) {
         var2 = 0.0F;
      }

      if (var1 != null && !var1.field_141) {
         float var5;
         if (var2 < 0.0F) {
            var1.method_245(var0, -var2, var3);
         } else {
            if (var3 != null) {
               if (var3.field_888 != 1.0F && var1.method_212()) {
                  var2 *= var3.field_888;
               }

               if (var3.field_889 != 1.0F && var1.method_280()) {
                  var2 *= var3.field_889;
               }
            }

            var5 = var1.method_246(var0, var2, var3);
            var4.field_1945.method_2519(var0, var1, var5);
            if (var0 != null) {
               var0.field_187 += var5;
            }

            if (var1.field_141) {
               ++var1.field_186;
            }
         }

         if (var3 != null && !var1.field_141) {
            var5 = var1.method_224();
            if (var5 != -1.0F) {
               float var6 = 100.0F;
               float var7 = class_296.method_2031(var3.dh, var3.di, var1.dh, var1.di);
               var6 /= var5;
               var1.field_150 += class_296.method_2099(var7) * var6;
               var1.field_151 += class_296.method_2098(var7) * var6;
            }
         }
      }

   }

   // $FF: renamed from: e () float
   public strictfp float method_701() {
      float var1 = 1.0F;
      if (this.field_861 < this.field_858) {
         var1 = this.field_861 / this.field_858;
      }

      return var1;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_176(float var1) {
      class_236 var2 = class_236.method_1549();
      if (this.field_928) {
         this.method_184();
      }

      if (this.field_842 == null && !this.field_901) {
         this.method_184();
      } else {
         if (this.field_840 > 0.0F) {
            this.field_840 = class_296.method_2020(this.field_840, var1);
            if (this.field_840 != 0.0F) {
               return;
            }
         }

         this.field_839 = class_296.method_2020(this.field_839, var1);
         boolean var3 = false;
         if (this.field_914) {
            if (this.field_842 == null) {
               var3 = true;
            } else if (this.field_842.field_141) {
               var3 = true;
            }
         }

         if (this.field_911) {
            var3 = true;
         }

         float var4;
         float var5;
         float var6;
         float var7;
         float var8;
         if (var3) {
            if (this.field_841 == null) {
               class_236.method_1588("Projectile: cannot Retarget: source==null");
            } else {
               var4 = this.dh + class_296.method_2099(this.field_898) * this.field_913;
               var5 = this.di + class_296.method_2098(this.field_898) * this.field_913;
               var6 = this.field_912;
               var7 = var6 * var6;
               var8 = -1.0F;
               class_39[] var9 = class_39.field_126.method_1326();
               class_44 var10 = null;
               class_39 var11 = null;
               if (this.field_841 instanceof class_44) {
                  var10 = (class_44)this.field_841;
                  var11 = var10.method_371();
               }

               int var12 = 0;

               for(int var13 = class_39.field_126.size(); var12 < var13; ++var12) {
                  class_39 var14 = var9[var12];
                  if (this.field_841.field_143 != var14.field_143 && var14.dh + var6 > var4 && var14.dh - var6 < var4 && var14.di + var6 > var5 && var14.di - var6 < var5) {
                     boolean var15 = true;
                     if (var10 != null) {
                        var15 = var10.method_393(var14, true);
                     }

                     if (var15) {
                        float var16 = class_296.method_2026(var4, var5, var14.dh, var14.di);
                        boolean var17 = false;
                        if (var8 == -1.0F || var16 < var8) {
                           var17 = true;
                        }

                        if (var11 == var14) {
                           var17 = true;
                        }

                        if (var17 && var16 < var7) {
                           var8 = var16;
                           this.field_842 = var14;
                        }
                     }
                  }
               }
            }
         }

         if (this.field_857 && this.field_842 != null) {
            this.field_862 = class_296.method_2098(this.field_861 * 1.0F % 360.0F) * this.field_842.field_157 * 0.4F;
            this.field_863 = class_296.method_2098(this.field_861 * 1.5F % 360.0F) * this.field_842.field_157 * 0.4F;
            var4 = this.field_842.dh + this.field_862;
            var5 = this.field_842.di + this.field_863;
            if (this.de) {
               this.field_923 += var1;
               this.field_924 += var1;
               if (this.field_923 > 11.0F) {
                  this.field_923 = class_296.method_2033(1.0F, 4.0F);
                  boolean var25 = false;
                  class_390 var26 = var2.field_1938.method_2488(var4, var5, this.field_842.dj, class_393.field_3201, var25, class_395.field_3222);
                  if (var26 != null) {
                     var26.field_3178 = 0;
                     var26.field_3176 = 0;
                     var26.field_3179 = 2;
                     var26.field_3135 = true;
                     var26.field_3143 = 0.5F;
                     var26.field_3161 = 60.0F;
                     var26.field_3160 = 60.0F;
                     var26.field_3145 = 0.7F;
                     var26.field_3144 = 0.3F;
                     var26.field_3180 = false;
                     var26.field_3154 = class_296.method_2033(-0.3F, 0.3F);
                     var26.field_3155 = -0.9F + class_296.method_2033(-0.3F, 0.3F);
                  }
               }

               if (this.field_924 > 75.0F) {
                  this.field_924 = class_296.method_2033(1.0F, 20.0F);
                  var2.field_1938.method_2463(var4, var5, this.field_842.dj);
               }
            }
         }

         var8 = 5.0F;
         boolean var27 = false;
         boolean var28 = false;
         float var29;
         float var30;
         float var31;
         if (!this.field_901) {
            var29 = this.field_842.dh + this.field_862;
            var30 = this.field_842.di + this.field_863;
            var31 = this.field_842.dj;
            var4 = class_296.method_2031(this.dh, this.di, var29, var30);
            var5 = class_296.method_2026(this.dh, this.di, var29, var30);
            var7 = var31;
            var6 = var31 - this.dj;
            var8 = this.field_842.field_157;
            var27 = this.field_842 instanceof class_47;
            var28 = this.field_842.field_170 > 10.0F + this.field_874;
         } else {
            var5 = 999.0F;
            var6 = 0.0F;
            var4 = this.field_898;
            var7 = 0.0F;
            if (this.field_843) {
               var29 = this.field_844 + this.field_862;
               var30 = this.field_845 + this.field_863;
               var31 = 0.0F;
               var4 = class_296.method_2031(this.dh, this.di, var29, var30);
               var5 = class_296.method_2026(this.dh, this.di, var29, var30);
               var7 = var31;
               var6 = var31 - this.dj;
            }

            if (this.field_846 != null) {
               var29 = this.field_846.dh + this.field_862;
               var30 = this.field_846.di + this.field_863;
               var31 = this.field_846.dj;
               var4 = class_296.method_2031(this.dh, this.di, var29, var30);
               var5 = class_296.method_2026(this.dh, this.di, var29, var30);
               var7 = var31;
               var6 = var31 - this.dj;
            }

            if (this.field_842 != null) {
               var29 = this.field_842.dh + this.field_862;
               var30 = this.field_842.di + this.field_863;
               var31 = this.field_842.dj;
               var4 = class_296.method_2031(this.dh, this.di, var29, var30);
               var5 = class_296.method_2026(this.dh, this.di, var29, var30);
               var7 = var31;
               var6 = var31 - this.dj;
               var8 = this.field_842.field_157;
               var27 = this.field_842 instanceof class_47;
               var28 = this.field_842.field_170 > 10.0F + this.field_874;
            }
         }

         boolean var32 = false;
         boolean var33 = false;
         var31 = var4;
         float var34;
         if (!this.field_853) {
            if (!this.field_915 || this.field_916 < this.dj || this.field_918) {
               var34 = this.field_849 * var1;
               var32 = true;
               if (var5 < var34 * var34) {
                  var34 = class_296.method_2019(var5);
                  var5 = 0.0F;
               }

               this.dh += class_296.method_2099(var4) * var34;
               this.di += class_296.method_2098(var4) * var34;
            }

            if (this.field_915) {
               if (this.field_919 < 0.0F) {
                  var34 = this.field_849 * var1;
                  var32 = true;
               } else {
                  var34 = this.field_919 * var1;
               }

               if (!this.field_918) {
                  this.dj = class_296.method_2021(this.dj, this.field_917, var34);
                  if (this.dj < this.field_916) {
                     var31 = -90.0F;
                  }

                  if (this.dj >= this.field_917) {
                     this.field_918 = true;
                  }
               } else if (var5 < 400.0F) {
                  this.dj = class_296.method_2021(this.dj, var7, var34);
                  if (class_296.method_2042(this.dj - var7) > 0.5F) {
                     var31 = 90.0F;
                     var33 = true;
                  }
               }
            } else {
               float var35 = this.field_849 * var1;
               var32 = true;
               if (var6 != 0.0F) {
                  if ((double)var5 > 0.1D) {
                     var35 = class_296.method_2042(var6) / class_296.method_2019(var5) * this.field_849 * var1;
                     var35 = class_296.method_2022(var35, this.field_849 * var1);
                  }

                  this.dj += class_296.method_2022(var6, var35);
                  var6 = var7 - this.dj;
               }
            }
         }

         if (var32 && this.field_847 > 0.0F) {
            this.field_849 = class_296.method_2021(this.field_849, this.field_847, this.field_848 * var1);
         }

         boolean var37;
         if ((this.field_920 || this.field_922 != null) && this.de && !this.field_927) {
            this.field_923 += var1;
            if (this.field_923 > this.field_921) {
               this.field_923 = 0.0F;
               var37 = false;
               if (this.field_856) {
                  var37 = true;
               }

               if (this.field_922 != null) {
                  this.field_922.method_3215(this.dh, this.di, this.dj, this.field_929, this);
               }

               if (this.field_920) {
                  class_390 var38 = var2.field_1938.method_2488(this.dh, this.di, this.dj, class_393.field_3201, var37, class_395.field_3222);
                  if (var38 != null) {
                     if (this.dj >= 0.0F) {
                        var38.field_3178 = 0;
                        var38.field_3176 = 0;
                        var38.field_3179 = 2;
                        var38.field_3135 = true;
                        var38.field_3143 = 0.5F;
                        var38.field_3160 = 70.0F;
                        var38.field_3161 = var38.field_3160;
                        var38.field_3180 = true;
                        if (var33) {
                           var38.field_3180 = false;
                        }

                        var38.field_3155 = 0.1F;
                        var38.field_3136 = true;
                        var38.field_3137 = 5.0F;
                        var38.field_3145 = 0.5F;
                        var38.field_3144 = 1.2F;
                        var38.field_3162 = class_296.method_2033(-180.0F, 180.0F);
                        if (this.field_856) {
                           var38.field_3145 = 0.5F;
                           var38.field_3144 = 2.1F;
                        }
                     } else {
                        var38.field_3178 = 9;
                        var38.field_3176 = 1;
                        var38.field_3179 = 1;
                        var38.field_3135 = true;
                        var38.field_3143 = 0.5F;
                        var38.field_3161 = 60.0F;
                        var38.field_3160 = 60.0F;
                        var38.field_3155 = 0.1F;
                     }
                  }
               }
            }
         }

         if (!this.field_927) {
            var37 = false;
            class_39 var39 = null;
            boolean var36 = false;
            float var40 = 6.0F;
            if (var27) {
               var40 = var8 * 0.8F;
               if (var40 < 6.0F) {
                  var40 = 6.0F;
               }
            }

            if (var28) {
               var40 = var8 * 1.1F;
            }

            if (var5 < var40 * var40 && Math.abs(var6) < 3.0F) {
               var37 = true;
               var39 = this.field_842;
            }

            if (this.field_853) {
               var37 = true;
               var39 = this.field_842;
            }

            if (this.field_885 && this.field_839 == 0.0F) {
               var37 = true;
            }

            int var20;
            if (this.field_896) {
               float var18 = this.field_899 + 50.0F;
               class_39[] var19 = class_39.field_126.method_1326();
               var20 = 0;

               for(int var21 = class_39.field_126.size(); var20 < var21; ++var20) {
                  class_39 var22 = var19[var20];
                  if (var22.dh + var18 > this.dh && var22.dh - var18 < this.dh && var22.di + var18 > this.di && var22.di - var18 < this.di && var22.field_140 && !var22.method_280() && var22.field_182 == null) {
                     float var23 = class_296.method_2026(this.dh, this.di, var22.dh, var22.di);
                     float var24 = this.field_899 + var22.field_157;
                     if (var23 < var24 * var24) {
                        var37 = true;
                        var39 = var22;
                     }
                  }
               }
            }

            if (this.field_897) {
               var2.field_1932.method_2578(this.dh, this.di);
               int var41 = var2.field_1932.field_3355;
               int var44 = var2.field_1932.field_3356;
               if (var2.field_1941.method_1682(class_503.field_4622, var41, var44)) {
                  var37 = true;
                  var36 = true;
               }
            }

            if (this.field_901) {
            }

            if (this.field_934 && (this.field_915 && var33 && this.dj < 30.0F || var37) && this.field_841 != null) {
               this.field_934 = false;
               class_46 var42 = new class_46(false);
               var42.dh = this.dh;
               var42.di = this.di;
               var42.a(this.field_841.field_143);
               var42.field_346 = 15;
               var42.field_347 = 360.0F;
            }

            if (var37) {
               this.field_927 = true;
               this.field_931 = this.dh;
               this.field_932 = this.di;
               this.field_933 = this.dj;
               if (this.field_853) {
                  if (this.field_901) {
                     this.field_931 = this.field_844;
                     this.field_932 = this.field_845;
                     this.field_933 = 0.0F;
                  }

                  if (this.field_842 != null) {
                     this.field_931 = this.field_842.dh + this.field_862;
                     this.field_932 = this.field_842.di + this.field_863;
                     this.field_933 = this.field_842.dj;
                  }
               }

               if (!this.field_854 && !this.field_864) {
                  this.field_872 = false;
               }

               boolean var43 = false;
               if (this.field_842 != null) {
                  var43 = this.field_842.field_170 > 10.0F;
               }

               if (!var43) {
                  if (this.field_905 != null) {
                     this.field_905.method_3215(this.field_931, this.field_932, this.field_933, this.field_929, this.field_842);
                  }
               } else if (this.field_906 != null) {
                  this.field_906.method_3215(this.field_931, this.field_932, this.field_933, this.field_929, this.field_842);
               }

               if (this.field_907 != null && this.field_841 != null) {
                  this.field_907.method_2315(this.field_931, this.field_932, 0.0F, 0.0F, this.field_841.field_143, false);
               }

               if (this.field_908 > 0 && this.field_841 != null && this.field_841 instanceof class_66) {
                  class_66 var45 = (class_66)this.field_841;

                  for(var20 = 0; var20 < this.field_908; ++var20) {
                     if (var45.field_551 != null && var45.field_551.size() > 0) {
                        class_39 var48 = (class_39)var45.field_551.remove(var45.field_551.size() - 1);
                        var48.field_182 = null;
                        var48.dh = this.field_931;
                        var48.di = this.field_932;
                        var48.field_154 = this.field_898;
                        if (var48 instanceof class_44) {
                           class_44 var52 = (class_44)var48;
                           var52.method_407();
                        }
                     }
                  }
               }

               if (this.field_909 && this.field_841 != null) {
                  this.field_841.dh = this.field_931;
                  this.field_841.di = this.field_932;
               }

               if (!var36 && var39 != null) {
                  if (this.field_857) {
                     this.field_927 = false;
                     float var46 = this.field_874 / 60.0F * var1 * this.method_701();
                     if (this.field_879 == 0.0F) {
                        this.method_699(var39);
                     }

                     method_700(this.field_841, var39, var46, this);
                  } else {
                     if (this.field_879 == 0.0F) {
                        this.method_699(var39);
                     }

                     method_700(this.field_841, var39, this.field_874, this);
                  }
               }

               if (this.field_846 != null) {
                  this.field_846.method_694();
                  this.method_184();
               }

               if (!this.field_857) {
                  boolean var47 = true;
                  class_390 var49;
                  if (this.field_842 != null && this.field_842.field_170 > 10.0F) {
                     var47 = false;
                     if (this.field_906 == null) {
                        var49 = var2.field_1938.method_2480(this.field_931, this.field_932, this.field_933, -1127220);
                        if (var49 != null) {
                           var49.field_3160 = 10.0F;
                           var49.field_3144 = 0.5F;
                           if (this.field_925) {
                              var49.field_3160 = 25.0F;
                              var49.field_3144 = 1.0F;
                           }

                           var49.field_3179 = 2;
                           var49.field_3161 = var49.field_3160;
                        }
                     }
                  }

                  if (this.field_859) {
                     var47 = false;
                     class_35 var50 = class_35.method_195(this.dh, this.di);
                     var50.field_80 = 21.0F;
                  }

                  if (var47) {
                     float var53;
                     if (!this.field_925) {
                        if (this.field_905 == null) {
                           var2.field_1938.method_2464(this.field_931, this.field_932, this.field_933);
                        }
                     } else if (this.field_905 == null) {
                        if (this.field_879 > 10.0F) {
                           var49 = var2.field_1938.method_2480(this.field_931, this.field_932, this.field_933, 0);
                           if (var49 != null) {
                              var49.field_3144 = this.field_879 / 25.0F;
                              if (this.field_933 > 5.0F) {
                                 var49.field_3179 = 2;
                              }
                           }
                        }

                        var2.field_1938.method_2463(this.field_931, this.field_932, this.field_933);
                        if (this.field_926 && !this.field_856) {
                           var53 = 1.0F + class_296.method_2033(-0.06F, 0.06F);
                           var2.field_1933.method_3324(class_525.field_4755, 0.5F, var53, this.field_931, this.field_932);
                        }
                     }

                     if (this.field_856 && this.field_905 == null) {
                        var53 = 0.7F;
                        var2.field_1933.method_3324(class_525.field_4770, 1.6F, var53, this.field_931, this.field_932);
                        var2.field_1938.method_2485(class_395.field_3225);
                        class_390 var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(255, 255, 255, 255));
                        if (var51 != null) {
                           var51.field_3145 = 14.0F;
                           var51.field_3144 = 8.0F;
                           var51.field_3143 = 0.9F;
                           var51.field_3160 = 35.0F;
                           var51.field_3161 = var51.field_3160;
                           var51.field_3135 = true;
                        }

                        var2.field_1938.method_2485(class_395.field_3225);
                        var51 = var2.field_1938.method_2479(this.field_931, this.field_932, this.field_933, -1127220);
                        if (var51 != null) {
                           var51.field_3145 = 1.5F;
                           var51.field_3144 = 3.0F;
                           var51.field_3179 = 2;
                           var51.field_3160 = 20.0F;
                           var51.field_3161 = var51.field_3160;
                           var51.field_3159 = 0.0F;
                        }

                        var2.field_1938.method_2485(class_395.field_3225);
                        var51 = var2.field_1938.method_2479(this.field_931, this.field_932, this.field_933, -1127220);
                        if (var51 != null) {
                           var51.field_3145 = 0.2F;
                           var51.field_3144 = 5.0F;
                           var51.field_3179 = 2;
                           var51.field_3160 = 65.0F;
                           var51.field_3161 = var51.field_3160;
                           var51.field_3159 = 0.0F;
                        }

                        var2.field_1938.method_2485(class_395.field_3225);
                        var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(255, 255, 255, 255));
                        if (var51 != null) {
                           var51.field_3145 = 3.0F;
                           var51.field_3144 = 6.0F;
                           var51.field_3143 = 0.9F;
                           var51.field_3160 = 290.0F;
                           var51.field_3161 = var51.field_3160;
                        }

                        var2.field_1938.method_2485(class_395.field_3225);
                        var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(255, 255, 244, 230));
                        if (var51 != null) {
                           var51.field_3145 = 2.0F;
                           var51.field_3144 = 6.0F;
                           var51.field_3143 = 0.5F;
                           var51.field_3160 = 370.0F;
                           var51.field_3161 = var51.field_3160;
                           var51.field_3159 = 10.0F;
                        }

                        int var54;
                        for(var54 = 0; var54 < 1; ++var54) {
                           var2.field_1938.method_2485(class_395.field_3225);
                           var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(255, 255, 244, 230));
                           if (var51 != null) {
                              var51.field_3145 = 0.2F;
                              var51.field_3144 = 9.0F;
                              var51.field_3143 = 0.7F;
                              var51.field_3160 = 210.0F;
                              var51.field_3161 = var51.field_3160;
                              var51.field_3159 = (float)(20 + var54 * 110);
                           }
                        }

                        var2.field_1938.method_2485(class_395.field_3225);
                        var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(255, 255, 255, 255));
                        if (var51 != null) {
                           var51.field_3145 = 3.0F;
                           var51.field_3144 = 4.0F;
                           var51.field_3143 = 0.2F;
                           var51.field_3160 = 870.0F;
                           var51.field_3161 = var51.field_3160;
                           var51.field_3135 = true;
                           var51.field_3159 = 70.0F;
                        }

                        var2.field_1938.method_2485(class_395.field_3225);
                        var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(255, 206, 255, 239));
                        if (var51 != null) {
                           var51.field_3145 = 4.0F;
                           var51.field_3144 = 1.0F;
                           var51.field_3143 = 0.9F;
                           var51.field_3160 = 320.0F;
                           var51.field_3161 = var51.field_3160;
                        }

                        var2.field_1938.method_2485(class_395.field_3225);
                        var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(255, 255, 242, 129));
                        if (var51 != null) {
                           var51.field_3145 = 2.0F;
                           var51.field_3144 = 1.0F;
                           var51.field_3143 = 1.0F;
                           var51.field_3160 = 340.0F;
                           var51.field_3161 = var51.field_3160;
                           var51.field_3136 = true;
                           var51.field_3137 = 20.0F;
                        }

                        var2.field_1938.method_2485(class_395.field_3225);
                        var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(245, 255, 182, 110));
                        if (var51 != null) {
                           var51.field_3145 = 1.5F;
                           var51.field_3144 = 1.5F;
                           var51.field_3143 = 0.3F;
                           var51.field_3160 = 1340.0F;
                           var51.field_3161 = var51.field_3160;
                           var51.field_3136 = true;
                           var51.field_3137 = 40.0F;
                           var51.field_3159 = 140.0F;
                        }

                        for(var54 = 0; var54 < 4; ++var54) {
                           var2.field_1938.method_2485(class_395.field_3225);
                           var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(225, 255, 242, 129));
                           if (var51 != null) {
                              var51.field_3145 = 1.5F;
                              var51.field_3144 = 1.4F;
                              var51.field_3143 = 1.3F;
                              var51.field_3160 = 340.0F;
                              var51.field_3161 = var51.field_3160;
                              var51.field_3155 = -0.29F;
                              var51.field_3136 = true;
                              var51.field_3137 = 50.0F;
                              var51.field_3159 = (float)(30 + var54 * 40);
                           }
                        }

                        for(var54 = 0; var54 < 2; ++var54) {
                           var2.field_1938.method_2485(class_395.field_3225);
                           var51 = var2.field_1938.method_2474(this.field_931, this.field_932, this.dj, Color.method_3077(185, 255, 242, 129));
                           if (var51 != null) {
                              var51.field_3145 = 1.3F;
                              var51.field_3144 = 1.0F;
                              var51.field_3143 = 1.0F;
                              var51.field_3160 = 340.0F;
                              var51.field_3161 = var51.field_3160;
                              var51.field_3155 = -0.14F;
                              var51.field_3136 = true;
                              var51.field_3137 = 50.0F;
                              var51.field_3159 = (float)(70 + var54 * 70);
                           }
                        }

                        for(var54 = 0; var54 < 4; ++var54) {
                           var2.field_1938.method_2485(class_395.field_3225);
                           var51 = var2.field_1938.method_2474(this.field_931, this.field_932 - 30.0F, this.dj, -16711936);
                           if (var51 != null) {
                              var51.field_3145 = 1.5F;
                              var51.field_3144 = 2.6F;
                              var51.field_3143 = 1.3F;
                              var51.field_3160 = 510.0F;
                              var51.field_3161 = var51.field_3160;
                              var51.field_3155 = -0.2F;
                              var51.field_3136 = true;
                              var51.field_3137 = 50.0F;
                              var51.field_3142 = null;
                              var51.field_3141 = Color.method_3077(175, 235, 235, 235);
                              var51.field_3159 = (float)(20 + var54 * 40);
                           }
                        }

                        for(var54 = 0; var54 < 2; ++var54) {
                           var2.field_1938.method_2485(class_395.field_3225);
                           var51 = var2.field_1938.method_2474(this.field_931, this.field_932 - 30.0F, this.dj, -16711936);
                           if (var51 != null) {
                              var51.field_3145 = 1.5F;
                              var51.field_3144 = 3.8F;
                              var51.field_3143 = 0.8F;
                              var51.field_3160 = 590.0F;
                              var51.field_3161 = var51.field_3160;
                              var51.field_3155 = -0.2F;
                              var51.field_3136 = true;
                              var51.field_3137 = 50.0F;
                              var51.field_3142 = null;
                              var51.field_3141 = Color.method_3077(105, 115, 115, 115);
                              var51.field_3159 = (float)(20 + var54 * 40);
                           }
                        }

                        for(var54 = 0; var54 < 1; ++var54) {
                           class_35 var55 = class_35.method_194(this.field_931 + class_296.method_2015(-10.0F, 10.0F, (int)this.da), this.field_932 + class_296.method_2015(-10.0F, 10.0F, (int)this.da + var54));
                           if (var55 != null) {
                              var55.field_96 = (float)(200 + var54 * 70);
                              var55.field_80 = (float)(980 + var54 * 800);
                           }
                        }

                        if (!class_205.method_1373(this.field_931, this.field_932)) {
                           class_36.method_200(this.field_931, this.field_932, class_244.field_2173);
                        }
                     }
                  }
               }
            }
         }

         if (this.field_927 && !this.field_875) {
            this.field_876 = class_296.method_2020(this.field_876, var1);
            if (this.field_893) {
               var34 = 1.0F - this.field_876 / this.field_877;
               this.method_702(var34);
            }

            if (this.field_876 == 0.0F) {
               this.field_875 = true;
               this.method_702(1.0F);
               if (!this.field_854 && !this.field_864) {
                  this.method_184();
               }
            }
         }

         this.field_861 += var1;
         if (this.field_839 == 0.0F && (!this.field_927 || this.field_875)) {
            this.method_184();
         }

         if (!this.field_930) {
            this.field_929 = var31;
            this.field_930 = true;
         }

         var34 = class_296.method_2030(this.field_929, var31, 12.0F * var1);
         this.field_929 += var34;
      }
   }

   // $FF: renamed from: b (float) void
   public strictfp void method_702(float var1) {
      boolean var2 = false;
      if (this.field_878 != 0.0F && this.field_879 > 0.0F) {
         var2 = true;
      }

      if ((this.field_886 != 0.0F || this.field_887 != 0.0F) && this.field_879 > 0.0F) {
         var2 = true;
      }

      if (var2) {
         float var3 = this.field_879 * var1;
         class_199 var4 = class_34.method_189();
         Iterator var5 = var4.iterator();

         while(true) {
            class_39 var7;
            float var8;
            while(true) {
               do {
                  do {
                     do {
                        do {
                           do {
                              do {
                                 do {
                                    do {
                                       do {
                                          do {
                                             class_34 var6;
                                             do {
                                                if (!var5.hasNext()) {
                                                   return;
                                                }

                                                var6 = (class_34)var5.next();
                                             } while(!(var6 instanceof class_39));

                                             var7 = (class_39)var6;
                                          } while(var7.field_141);
                                       } while(this.field_931 + var3 <= var7.dh);
                                    } while(this.field_931 - var3 >= var7.dh);
                                 } while(this.field_932 + var3 <= var7.di);
                              } while(this.field_932 - var3 >= var7.di);
                           } while(var7.field_182 != null);

                           var8 = class_296.method_2027(this.field_931, this.field_932, var7.dh, var7.di);
                        } while(var8 > var3);
                     } while(this.field_894.contains(var7));
                  } while(this.field_841 != null && (var7.field_143 != this.field_841.field_143 && this.field_841.field_143.method_944(var7.field_143) || this.field_880 && !this.field_841.field_143.method_943(var7.field_143) || this.field_881 && this.field_841.field_143.method_943(var7.field_143)));
               } while(var7.dj < -5.0F && this.field_933 >= -2.0F && !this.field_882);

               if (this.field_884) {
                  boolean var9 = this.field_933 >= 5.0F;
                  if (var7.method_280() == var9) {
                     break;
                  }
               } else if (this.field_883 || !var7.method_280()) {
                  break;
               }
            }

            float var11 = 1.0F - var8 / this.field_879;
            var11 = (float)((double)var11 + 0.1D);
            if (var11 > 1.0F) {
               var11 = 1.0F;
            }

            float var10 = var11 * this.field_878;
            this.method_699(var7);
            method_700(this.field_841, var7, var10, this);
            this.field_894.add(var7);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.k) boolean
   public strictfp boolean method_183(class_236 var1) {
      if (var1.field_1980.method_1914((int)this.dh, (int)this.di)) {
         return true;
      } else {
         return (this.field_854 || this.field_857) && this.field_842 != null && var1.field_1980.method_1914((int)this.field_842.dh, (int)this.field_842.di);
      }
   }

   // $FF: renamed from: c (float) boolean
   public strictfp boolean method_181(float var1) {
      if (!this.field_872) {
         return false;
      } else if (this.field_840 > 0.0F) {
         return false;
      } else {
         class_236 var2 = class_236.method_1549();
         float var3 = this.dh - var2.field_1965;
         float var4 = this.di - var2.field_1966;
         float var5;
         float var6;
         float var7;
         if (this.field_842 != null) {
            var5 = this.field_842.dh;
            var6 = this.field_842.di;
            var7 = this.field_842.dj;
         } else {
            var5 = this.field_844;
            var6 = this.field_845;
            var7 = 0.0F;
         }

         if (!this.field_935 && !this.field_856) {
            boolean var8 = false;
            if (this.field_853) {
               if (this.field_842 != null) {
                  if (!var2.field_1932.method_2577(this.field_842.dh, this.field_842.di, var2.field_1915)) {
                     var8 = true;
                  }
               } else if (this.field_843 && !var2.field_1932.method_2577(this.field_844, this.field_845, var2.field_1915)) {
                  var8 = true;
               }
            }

            if (!var2.field_1932.method_2577(this.dh, this.di, var2.field_1915) && !var8) {
               return false;
            }

            this.field_935 = true;
         }

         float var9;
         float var24;
         if (this.field_857) {
            field_940.method_2790((int)(60.0F + this.method_701() * 60.0F));
            var24 = var5 - var2.field_1965 + this.field_862;
            var9 = var6 - var7 - var2.field_1966 + this.field_863;
            field_940.method_2793(6.0F);
            var2.field_1935.method_96(this.dh - var2.field_1965, this.di - var2.field_1966 - this.dj, var24, var9, field_940);
            field_940.method_2793(3.0F);
            var2.field_1935.method_96(this.dh - var2.field_1965, this.di - var2.field_1966 - this.dj, var24, var9, field_940);
            var2.field_1935.method_85(var24, var9, 8.0F, field_940);
            var2.field_1935.method_85(var24, var9, 5.0F, field_940);
         } else if (this.field_854) {
            var24 = var5 - var2.field_1965 + this.field_862;
            var9 = var6 - var7 - var2.field_1966 + this.field_863;
            field_938.method_2788(this.field_895);
            field_939.method_2788(this.field_895);
            field_939.method_2790((int)((float)field_939.method_2789() * 0.5F));
            var2.field_1935.method_96(this.dh - var2.field_1965, this.di - var2.field_1966 - this.dj, var24, var9, field_939);
            var2.field_1935.method_96(this.dh - var2.field_1965, this.di - var2.field_1966 - this.dj, var24, var9, field_938);
            var2.field_1935.method_85(var24, var9, 5.0F, field_938);
         } else {
            int var13;
            if (this.field_864) {
               this.field_865 = class_296.method_2020(this.field_865, var1);
               if (this.field_866 == null) {
                  this.field_866 = new float[20];
                  this.field_865 = 0.0F;
               }

               if (this.field_865 == 0.0F) {
                  this.field_865 = 4.0F;

                  for(int var26 = 0; var26 < this.field_866.length; ++var26) {
                     this.field_866[var26] = class_296.method_2033(-10.0F, 10.0F);
                  }
               }

               var24 = this.dh - var2.field_1965;
               var9 = this.di - var2.field_1966 - this.dj;
               float var10 = var5 - var2.field_1965;
               float var11 = var6 - var7 - var2.field_1966;
               float var12 = class_296.method_2027(var24, var9, var10, var11);
               var13 = this.field_866.length;
               if (var12 < 200.0F) {
                  var13 = class_296.method_2044(0, var13 - 5);
               } else if (var12 < 100.0F) {
                  var13 = class_296.method_2044(0, var13 - 10);
               }

               float var14 = var12 / (float)(var13 - 1);
               float var15 = class_296.method_2031(var24, var9, var10, var11);
               float var16 = var24;
               float var17 = var9;
               float var18 = class_296.method_2099(var15);
               float var19 = class_296.method_2098(var15);

               for(int var20 = 0; var20 < var13; ++var20) {
                  float var21 = this.field_866[var20];
                  float var22 = var24 + var18 * (float)var20 * var14;
                  float var23 = var9 + var19 * (float)var20 * var14;
                  if (var20 != var13 - 1) {
                     var22 -= var19 * var21;
                     var23 += var18 * var21;
                  }

                  var2.field_1935.method_96(var16, var17, var22, var23, field_941);
                  var16 = var22;
                  var17 = var23;
               }
            } else if (this.field_867 != -1) {
               class_306 var28 = field_834;
               int var25 = 20;
               int var27 = 20;
               if (this.field_869 == 1) {
                  var28 = field_836;
                  var25 = 60;
                  var27 = 60;
               }

               if (this.field_869 == 2) {
                  var28 = field_835;
                  var25 = 20;
                  var27 = 20;
               }

               if (this.field_868 != -1 && this.field_852) {
                  class_306 var29 = var28;
                  int var30 = var25;
                  var13 = var27;
                  if (this.field_871 != null) {
                     var29 = this.field_870;
                     var30 = this.field_870.field_2531;
                     var13 = this.field_870.field_2532;
                  }

                  class_205.method_1361(var29, var3, var4, 0.0F, this.field_929, this.field_850, field_937, var30, var13, this.field_868);
               }

               if (this.field_870 != null) {
                  var28 = this.field_870;
                  var25 = this.field_870.field_2531;
                  var27 = this.field_870.field_2532;
               }

               field_936.method_2788(this.field_895);
               class_205.method_1361(var28, var3, var4, this.dj, this.field_929, this.field_850, field_936, var25, var27, this.field_867);
            } else {
               field_936.method_2788(this.field_895);
               if (this.dj > 0.0F && this.field_852) {
                  var2.field_1935.method_85(var3, var4, this.field_850, field_937);
               }

               var2.field_1935.method_85(var3, var4 - this.dj, this.field_850, field_936);
               if (this.field_851 > 0.0F) {
                  field_936.method_2790(field_936.method_2789() / 3);
                  var2.field_1935.method_85(var3, var4 - this.dj, this.field_851, field_936);
               }
            }
         }

         return true;
      }
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_177(float var1, boolean var2) {
   }

   // $FF: renamed from: d (float) void
   public strictfp void method_178(float var1) {
   }

   // $FF: renamed from: e (float) void
   public strictfp void method_179(float var1) {
   }

   // $FF: renamed from: f (float) boolean
   public strictfp boolean method_182(float var1) {
      return false;
   }

   static {
      field_937.method_2788(-16777216);
      field_937.method_2790(108);
      field_938.method_2791(80, 255, 0, 0);
      field_938.method_2781(true);
      field_938.method_2793(5.0F);
      field_939.method_2791(30, 255, 0, 0);
      field_939.method_2781(true);
      field_939.method_2793(8.0F);
      field_940.method_2791(80, 128, 166, 255);
      field_940.method_2781(true);
      field_940.method_2793(5.0F);
      field_941.method_2791(150, 224, 239, 255);
      field_941.method_2781(true);
      field_941.method_2793(3.0F);
      field_942.method_2791(110, 224, 239, 255);
      field_942.method_2781(true);
      field_942.method_2793(8.0F);
   }
}
