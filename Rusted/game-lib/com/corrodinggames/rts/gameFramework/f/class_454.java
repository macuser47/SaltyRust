package com.corrodinggames.rts.gameFramework.f;

import a.a.class_371;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.a.a;
import com.corrodinggames.rts.a.class_268;
import com.corrodinggames.rts.a.class_270;
import com.corrodinggames.rts.a.class_271;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_110;
import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_512;
import com.corrodinggames.rts.game.units.custom.class_362;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.d.class_55;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.j.class_223;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Timer;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.x
public final class class_454 {
   // $FF: renamed from: a boolean
   public static final boolean field_3786 = false;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.f.w
   public class_231 field_3787 = new class_231();
   // $FF: renamed from: c int
   public int field_3788;
   // $FF: renamed from: d boolean
   public boolean field_3789;
   // $FF: renamed from: e int
   public int field_3790 = 25;
   // $FF: renamed from: f boolean
   public boolean field_3791;
   // $FF: renamed from: g float
   public float field_3792;
   // $FF: renamed from: h float
   public float field_3793;
   // $FF: renamed from: i boolean
   public boolean field_3794 = false;
   // $FF: renamed from: j int
   public int field_3795;
   // $FF: renamed from: k java.lang.String
   public String field_3796;
   // $FF: renamed from: l boolean
   public boolean field_3797;
   // $FF: renamed from: m boolean
   public boolean field_3798;
   // $FF: renamed from: n boolean
   public boolean field_3799;
   // $FF: renamed from: o int
   public int field_3800 = 5005;
   // $FF: renamed from: p java.lang.String
   public String field_3801;
   // $FF: renamed from: q boolean
   public boolean field_3802 = false;
   // $FF: renamed from: r long
   public long field_3803;
   // $FF: renamed from: s java.lang.String
   public String field_3804;
   // $FF: renamed from: bj boolean
   private boolean field_3805;
   // $FF: renamed from: t com.corrodinggames.rts.game.k
   public class_107 field_3806;
   // $FF: renamed from: u boolean
   public boolean field_3807;
   // $FF: renamed from: bk boolean
   private boolean field_3808 = false;
   // $FF: renamed from: v boolean
   public volatile boolean field_3809 = false;
   // $FF: renamed from: w boolean
   public boolean field_3810;                               //SERVER FLAG - True if server, false else
   // $FF: renamed from: x boolean
   public boolean field_3811 = false;
   // $FF: renamed from: y boolean
   public boolean field_3812;
   // $FF: renamed from: z boolean
   public boolean field_3813;
   // $FF: renamed from: A int
   public int field_3814 = 0;
   // $FF: renamed from: B float
   public volatile float field_3815 = 1.0F;
   // $FF: renamed from: C float
   public volatile float field_3816 = 1.0F;
   // $FF: renamed from: D java.lang.Float
   public Float field_3817;
   // $FF: renamed from: E int
   public int field_3818;
   // $FF: renamed from: F int
   public int field_3819;
   // $FF: renamed from: G int
   public int field_3820;
   // $FF: renamed from: H int
   public int field_3821;
   // $FF: renamed from: I java.lang.String
   public String field_3822;
   // $FF: renamed from: J int
   public int field_3823 = -1;
   // $FF: renamed from: K int
   public int field_3824 = 0;
   // $FF: renamed from: L boolean
   public boolean field_3825;
   // $FF: renamed from: M float
   public float field_3826;
   // $FF: renamed from: N boolean
   boolean field_3827;
   // $FF: renamed from: O float
   public float field_3828;
   // $FF: renamed from: P boolean
   public boolean field_3829;
   // $FF: renamed from: Q boolean
   public boolean field_3830;
   // $FF: renamed from: R float
   public float field_3831;
   // $FF: renamed from: S boolean
   public boolean field_3832;
   // $FF: renamed from: T boolean
   public boolean field_3833;
   // $FF: renamed from: U int
   public int field_3834 = -1;
   // $FF: renamed from: V int
   public int field_3835 = 300;
   // $FF: renamed from: W boolean
   public boolean field_3836;
   // $FF: renamed from: X boolean
   public boolean field_3837;
   // $FF: renamed from: Y long
   public long field_3838;
   // $FF: renamed from: Z java.util.ArrayList
   public ArrayList field_3839 = new ArrayList();
   // $FF: renamed from: aa com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3840 = new class_434(this, "Unit Pos");
   // $FF: renamed from: ab com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3841 = new class_434(this, "Unit Dir", false);
   // $FF: renamed from: ac com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3842 = new class_434(this, "Unit Hp");
   // $FF: renamed from: ad com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3843 = new class_434(this, "Unit Id");
   // $FF: renamed from: ae com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3844 = new class_434(this, "Waypoints");
   // $FF: renamed from: af com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3845 = new class_434(this, "Waypoints Pos");
   // $FF: renamed from: ag com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3846 = new class_434(this, "Team Credits");
   // $FF: renamed from: ah com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3847 = new class_434(this, "UnitPaths");
   // $FF: renamed from: ai com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3848 = new class_434(this, "Unit Count");
   // $FF: renamed from: aj com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3849 = new class_434(this, "Team Info", false);
   // $FF: renamed from: ak com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3850 = new class_434(this, "Team 1 Credits", false);
   // $FF: renamed from: al com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3851 = new class_434(this, "Team 2 Credits", false);
   // $FF: renamed from: am com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3852 = new class_434(this, "Team 3 Credits", false);
   // $FF: renamed from: an com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3853 = new class_434(this, "Command center2", false);
   // $FF: renamed from: ao com.corrodinggames.rts.gameFramework.f.ab
   public class_434 field_3854 = new class_434(this, "Command center3", false);
   // $FF: renamed from: ap boolean
   public boolean field_3855;
   // $FF: renamed from: aq boolean
   public boolean field_3856 = true;
   // $FF: renamed from: ar int
   public int field_3857;
   // $FF: renamed from: as int
   public int field_3858;
   // $FF: renamed from: at float
   float field_3859 = 0.0F;
   // $FF: renamed from: au boolean
   public boolean field_3860;
   // $FF: renamed from: av int
   public int field_3861 = 5;
   // $FF: renamed from: aw int
   public int field_3862 = 5;
   // $FF: renamed from: ax com.corrodinggames.rts.gameFramework.f.z
   public class_453 field_3863 = new class_453();
   // $FF: renamed from: ay java.lang.String
   public String field_3864 = null;
   // $FF: renamed from: az com.corrodinggames.rts.gameFramework.f.h
   public class_463 field_3865;
   // $FF: renamed from: aA com.corrodinggames.rts.gameFramework.f.h
   public class_463 field_3866;
   // $FF: renamed from: aB com.corrodinggames.rts.gameFramework.f.a
   public class_455 field_3867 = new class_455();
   // $FF: renamed from: aC java.lang.Thread
   Thread field_3868;
   // $FF: renamed from: aD com.corrodinggames.rts.gameFramework.f.ad
   class_438 field_3869;
   // $FF: renamed from: aE java.lang.Thread
   Thread field_3870;
   // $FF: renamed from: aF com.corrodinggames.rts.gameFramework.f.ad
   class_438 field_3871;
   // $FF: renamed from: aG java.util.Timer
   Timer field_3872;
   // $FF: renamed from: aH com.corrodinggames.rts.gameFramework.f.ai
   class_414 field_3873;
   // $FF: renamed from: aI java.lang.Thread
   Thread field_3874;
   // $FF: renamed from: aJ com.corrodinggames.rts.gameFramework.f.y
   class_452 field_3875;
   // $FF: renamed from: aK com.corrodinggames.rts.gameFramework.f.c
   class_458 field_3876;
   // $FF: renamed from: aL java.util.concurrent.ConcurrentLinkedQueue
   public ConcurrentLinkedQueue field_3877 = new ConcurrentLinkedQueue();
   // $FF: renamed from: aM java.util.concurrent.ConcurrentLinkedQueue
   ConcurrentLinkedQueue field_3878 = new ConcurrentLinkedQueue();
   // $FF: renamed from: aN boolean
   boolean field_3879;
   // $FF: renamed from: aO int
   volatile int field_3880 = 1;
   // $FF: renamed from: aP java.lang.Object
   Object field_3881 = new Object();
   // $FF: renamed from: aQ java.lang.String
   String field_3882;
   // $FF: renamed from: aR java.lang.String
   String field_3883;
   // $FF: renamed from: aS java.lang.String
   public String field_3884;
   // $FF: renamed from: aT java.lang.Boolean
   public Boolean field_3885;
   // $FF: renamed from: aU java.lang.Boolean
   public Boolean field_3886;
   // $FF: renamed from: aV boolean
   public boolean field_3887;
   // $FF: renamed from: aW java.util.concurrent.ConcurrentLinkedQueue
   public ConcurrentLinkedQueue field_3888 = new ConcurrentLinkedQueue();
   // $FF: renamed from: aX com.corrodinggames.rts.game.e
   public class_110 field_3889;
   // $FF: renamed from: aY com.corrodinggames.rts.game.e
   public class_110 field_3890;
   // $FF: renamed from: aZ java.lang.Object
   public final Object field_3891 = new Object();
   // $FF: renamed from: ba boolean
   public boolean field_3892 = false;
   // $FF: renamed from: bb float
   float field_3893;
   // $FF: renamed from: bc float
   float field_3894;
   // $FF: renamed from: bd int
   int field_3895;
   // $FF: renamed from: be int
   int field_3896;
   // $FF: renamed from: bf boolean
   boolean field_3897 = false;
   // $FF: renamed from: bg java.net.Socket
   public Socket field_3898 = null;
   // $FF: renamed from: bh boolean
   boolean field_3899 = false;
   // $FF: renamed from: bi java.util.Timer
   Timer field_3900;

   // $FF: renamed from: a () void
   public strictfp void method_2847() {
      class_434 var2;
      for(Iterator var1 = this.field_3839.iterator(); var1.hasNext(); var2.field_3657 = 0L) {
         var2 = (class_434)var1.next();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public strictfp void method_2848(class_404 var1) {
      class_236 var2 = class_236.method_1549();
      var1.method_2539(0);
      this.field_3863.method_2845(var1);
      var1.method_2541(var2.field_1923);
      var1.method_2541(var2.field_1924);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public strictfp void method_2849(class_463 var1) {
      class_236 var2 = class_236.method_1549();
      var1.method_3009();
      this.field_3863.method_2846(var1);
      var2.field_1923 = var1.method_3011();
      var2.field_1924 = var1.method_3011();
   }

   // $FF: renamed from: b () com.corrodinggames.rts.gameFramework.f.z
   public strictfp class_453 method_2850() {
      class_453 var1;
      if (this.field_3810) {
         var1 = this.field_3863;
      } else if (this.field_3813) {
         var1 = this.field_3863.method_2844();
      } else {
         var1 = null;
         class_236.method_1592("getChangeableSetup", "Clicked but not server or proxy controller");
      }

      return var1;
   }

   // $FF: renamed from: c () void
   public strictfp void method_2851() {
      if (this.field_3811) {
         class_236.method_1549().field_1937.aiDifficulty = this.field_3863.field_3780;
      }

      if (this.field_3887) {
         class_236.method_1595("updateAIDifficulty with gameHasBeenStarted=true");
      } else {
         for(int var1 = 0; var1 < 10; ++var1) {
            class_107 var2 = class_107.method_954(var1);
            if (var2 != null && var2.field_1234) {
               var2.field_1235 = this.field_3863.field_3780;
            }
         }
      }

      this.method_2961();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.z) void
   public strictfp void method_2852(class_453 var1) {
      if (this.field_3810) {
         this.method_2851();
         this.method_2909();
         this.method_2904();
         class_270.method_1881();
      } else if (this.field_3813) {
         this.method_2853(var1);
      } else {
         class_236.method_1591("applyChangedSetup but not server or proxy controller");
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.z) void
   private strictfp void method_2853(class_453 var1) {
      class_236 var2 = class_236.method_1549();
      class_236.method_1591("applyProxyControl");
      class_453 var3 = this.field_3863;
      String var4;
      if (!var3.field_3776.equals(var1.field_3776)) {
         var4 = class_271.method_1887(var1.field_3776);
         var2.field_1944.method_2937("-map '" + var4 + "'");
      }

      if (var3.field_3779 != var1.field_3779) {
         var4 = !var1.field_3779 ? "true" : "false";
         var2.field_1944.method_2937("-revealedmap " + var4);
      }

      if (var3.field_3778 != var1.field_3778) {
         var4 = var2.field_1944.method_2855(var1.field_3778);
         var2.field_1944.method_2937("-fog " + var4);
      }

      if (var3.field_3777 != var1.field_3777) {
         int var5 = var2.field_1944.method_2864(var1.field_3777);
         var2.field_1944.method_2937("-credits " + var5);
      }

      if (var3.field_3782 != var1.field_3782) {
         var2.field_1944.method_2937("-income " + (int)var1.field_3782);
      }

      if (var3.field_3783 != var1.field_3783) {
         var4 = !var1.field_3783 ? "true" : "false";
         var2.field_1944.method_2937("-nukes " + var4);
      }

      if (var3.field_3780 != var1.field_3780) {
         var2.field_1944.method_2937("-ai " + var1.field_3780);
      }

      if (var3.field_3781 != var1.field_3781) {
         var2.field_1944.method_2937("-startingunits " + var1.field_3781);
      }

      if (var3.field_3785 != var1.field_3785) {
         var4 = var1.field_3785 ? "true" : "false";
         var2.field_1944.method_2937("-sharedControl " + var4);
      }

   }

   // $FF: renamed from: d () java.lang.String
   public strictfp String method_2854() {
      if (this.field_3863.field_3778 == 0) {
         return "No fog";
      } else if (this.field_3863.field_3778 == 1) {
         return "Basic fog";
      } else {
         return this.field_3863.field_3778 == 2 ? "Line of Sight" : "Unknown";
      }
   }

   // $FF: renamed from: a (int) java.lang.String
   public strictfp String method_2855(int var1) {
      if (var1 == 0) {
         return "off";
      } else if (var1 == 1) {
         return "basic";
      } else {
         return var1 == 2 ? "los" : "Unknown";
      }
   }

   // $FF: renamed from: e () java.lang.String
   public strictfp String method_2856() {
      return this.method_2858(this.field_3863.field_3780);
   }

   // $FF: renamed from: b (int) java.lang.String
   public strictfp String method_2857(int var1) {
      return this.method_2858(var1);
   }

   // $FF: renamed from: c (int) java.lang.String
   public strictfp String method_2858(int var1) {
      if (var1 == -2) {
         return "Very Easy";
      } else if (var1 == -1) {
         return "Easy";
      } else if (var1 == 0) {
         return "Medium";
      } else if (var1 == 1) {
         return "Hard";
      } else if (var1 == 2) {
         return "Very Hard";
      } else {
         return var1 == 3 ? "Impossible" : "Unknown";
      }
   }

   // $FF: renamed from: f () java.lang.String
   public strictfp String method_2859() {
      return this.method_2861(this.field_3863.field_3781);
   }

   // $FF: renamed from: g () java.util.ArrayList
   public strictfp ArrayList method_2860() {
      ArrayList var1 = new ArrayList();

      for(int var2 = 1; var2 <= 4; ++var2) {
         var1.add(var2);
      }

      var1.addAll(class_479.method_3188());
      return var1;
   }

   // $FF: renamed from: d (int) java.lang.String
   public strictfp String method_2861(int var1) {
      if (var1 == 1) {
         return "Normal (1 builder)";
      } else if (var1 == 2) {
         return "Small Army";
      } else if (var1 == 3) {
         return "3 Engineers";
      } else if (var1 == 4) {
         return "3 Engineers (No Command Center)";
      } else if (var1 == 5) {
         return "Experimental Spider";
      } else {
         class_479 var2 = class_479.method_3187(var1);
         return var2 != null ? var2.method_139() : "Unknown";
      }
   }

   // $FF: renamed from: h () java.lang.String
   public strictfp String method_2862() {
      return this.field_3863.field_3777 == 0 ? "Default" : "$" + this.method_2863();
   }

   // $FF: renamed from: i () int
   public final strictfp int method_2863() {
      return this.method_2864(this.field_3863.field_3777);
   }

   // $FF: renamed from: e (int) int
   public strictfp int method_2864(int var1) {
      if (var1 == 0) {
         return 4000;
      } else if (var1 == 1) {
         return 0;
      } else if (var1 == 2) {
         return 1000;
      } else if (var1 == 3) {
         return 2000;
      } else if (var1 == 4) {
         return 5000;
      } else if (var1 == 5) {
         return 10000;
      } else if (var1 == 6) {
         return 50000;
      } else if (var1 == 7) {
         return 100000;
      } else {
         return var1 == 8 ? 200000 : 999;
      }
   }

   // $FF: renamed from: j () boolean
   public strictfp boolean method_2865() {
      return this.field_3887;
   }

   // $FF: renamed from: a (boolean, java.lang.String, java.lang.Boolean) void
   public strictfp synchronized void method_2866(boolean var1, String var2, Boolean var3) {
      this.field_3886 = var1;
      this.field_3884 = var2;
      this.field_3885 = var3;
      class_270.method_1881();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.g) void
   strictfp void method_2867(class_462 var1) {
      Iterator var2 = this.field_3888.iterator();

      while(var2.hasNext()) {
         class_462 var3 = (class_462)var2.next();
         if (var3.field_3961 && var3.field_3963.equals(var1.field_3963) && var3.field_3965 == var1.field_3965) {
            var3.field_3972 = this.method_2868();
         }
      }

      var1.field_3972 = this.method_2868();
      this.field_3888.add(var1);
      class_268.method_1875();
   }

   // $FF: renamed from: k () long
   public strictfp long method_2868() {
      return System.currentTimeMillis();
   }

   public strictfp class_454() {
      class_236 var1 = class_236.method_1549();
      this.field_3788 = var1.method_1561(true);
      this.field_3882 = class_296.method_2054(40);
      this.field_3876 = new class_458(this, (Socket)null);
      this.field_3876.field_3932 = true;
      this.field_3889 = new class_110(-2, false);
      this.field_3889.j = "SPECTATOR";
      this.field_3890 = new class_110(-1, false);
      this.field_3890.j = "ADMIN";
   }

   // $FF: renamed from: l () void
   public strictfp void method_2869() {
      this.method_2871(false);
   }

   // $FF: renamed from: m () void
   public strictfp void method_2870() {
      this.method_2871(true);
   }

   // $FF: renamed from: a (boolean) void
   public strictfp void method_2871(boolean var1) {
      this.field_3809 = false;
      this.field_3810 = false;
      this.field_3811 = false;
      this.field_3813 = false;
      this.field_3812 = false;
      this.field_3860 = false;
      this.field_3807 = false;
      this.field_3808 = false;
      this.field_3805 = false;
      this.field_3806 = null;
      this.field_3798 = false;
      this.field_3824 = 0;
      this.field_3814 = 0;
      this.field_3803 = 0L;
      this.field_3815 = 1.0F;
      this.field_3826 = 10.0F;
      this.field_3820 = 10;
      this.field_3821 = 0;
      this.field_3822 = null;
      this.field_3825 = false;
      this.field_3827 = false;
      this.field_3828 = 0.0F;
      this.field_3829 = false;
      this.field_3830 = false;
      this.field_3832 = false;
      this.field_3887 = false;
      this.field_3833 = false;
      this.field_3834 = -1;
      this.field_3838 = 0L;
      this.method_2847();
      this.field_3855 = false;
      this.field_3856 = true;
      this.field_3857 = 0;
      this.field_3858 = 0;
      this.field_3859 = 0.0F;
      this.field_3795 = 0;
      this.field_3791 = false;
      this.field_3792 = 0.0F;
      this.field_3793 = 0.0F;
      this.field_3899 = false;
      this.field_3893 = 0.0F;
      this.field_3894 = 0.0F;
      this.field_3895 = 0;
      this.field_3896 = -1000;
      this.field_3866 = null;
      this.field_3862 = class_236.method_1549().field_1937.teamUnitCapHostedGame;
      if (this.field_3862 < 1) {
         this.field_3862 = 1;
      }

      this.field_3861 = this.field_3862;
      this.field_3863.field_3781 = 1;
      this.field_3863.field_3782 = 1.0F;
      this.field_3863.field_3783 = false;
      this.field_3863.field_3784 = false;
      this.field_3867.method_2978();
      class_236.method_1549().field_1939.method_712();
      if (!var1) {
         class_107.method_933();
      }

      class_479.method_3137(this.field_3797);
   }

   // $FF: renamed from: n () void
   public strictfp void method_2872() {
   }

   // $FF: renamed from: a (java.lang.String) void
   public strictfp synchronized void method_2873(String var1) {
      class_236 var2 = class_236.method_1549();
      if (this.field_3810) {
         this.method_2967();
         class_444.method_2840();
         if (this.field_3869 != null) {
            this.field_3869.method_2750();

            try {
               if (this.field_3868 != null) {
                  this.field_3868.join();
               }
            } catch (InterruptedException var9) {
            }

            this.field_3869 = null;
            this.field_3868 = null;
         }

         if (this.field_3871 != null) {
            this.field_3871.method_2750();

            try {
               if (this.field_3870 != null) {
                  this.field_3870.join();
               }
            } catch (InterruptedException var8) {
            }

            this.field_3871 = null;
            this.field_3870 = null;
         }

         if (this.field_3872 != null) {
            this.field_3872.cancel();
            this.field_3872 = null;
            this.field_3873 = null;
         }

         if (this.field_3875 != null) {
            this.field_3875.method_2843();
            this.field_3875 = null;
            this.field_3874 = null;
         }
      }

      this.method_2879(var1);
      class_223.method_1462().method_1472();
      synchronized(this.field_3891) {
         this.field_3809 = false;
         this.field_3810 = false;

         try {
            this.wait(50L);
         } catch (InterruptedException var6) {
            var6.printStackTrace();
         }

         this.field_3887 = false;
         var2.field_1948.method_2648();
         var2.method_1571();
         this.method_2954();
         this.field_3892 = false;
         this.field_3891.notifyAll();
      }
   }

   // $FF: renamed from: o () void
   public strictfp void method_2874() {
      synchronized(this.field_3891) {
         if (this.field_3809) {
            this.field_3892 = true;

            try {
               this.field_3891.wait();
            } catch (InterruptedException var4) {
               var4.printStackTrace();
            }

         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp void method_2875(class_458 var1) {
      this.field_3877.remove(var1);
   }

   // $FF: renamed from: Z () void
   private strictfp synchronized void method_2876() {
      Iterator var1 = this.field_3877.iterator();

      while(var1.hasNext()) {
         class_458 var2 = (class_458)var1.next();
         if (var2.field_3923) {
            var1.remove();
         }
      }

   }

   // $FF: renamed from: a (byte[], com.corrodinggames.rts.gameFramework.f.c) void
   strictfp void method_2877(byte[] var1, class_458 var2) {
      if (!class_236.field_1899) {
         Log.method_1712("RustedWarfare", "Ignoring incoming resync tagged as debug only");
      } else {
         if (var2.field_3933) {
            Log.method_1712("RustedWarfare", "Ignoring desync client save, as past desync was already saved");
            return;
         }

         var2.field_3933 = true;
         Log.method_1712("RustedWarfare", "Saving client save for debugging");
         String var3 = "desyncs/";
         String var4 = "desync_" + class_296.method_2017("d MMM yyyy HH.mm.ss") + "_" + var2.field_3925;
         File var5 = new File(var3 + var4);
         var5.getParentFile().mkdirs();

         try {
            FileOutputStream var6 = new FileOutputStream(var5);
            var6.write(var1);
            var6.close();
         } catch (IOException var8) {
            var8.printStackTrace();
         }
      }

   }

   // $FF: renamed from: c (float) void
   private strictfp synchronized void method_2878(float var1) {
      class_236 var2 = class_236.method_1549();
      boolean var3 = false;
      boolean var4 = false;
      this.field_3893 += var1;
      Iterator var5 = this.field_3877.iterator();

      while(var5.hasNext()) {
         class_458 var6 = (class_458)var5.next();
         if (var6.field_3935) {
            var3 = true;
         }

         if (var6.field_3934) {
            var4 = true;
         }
      }

      if (var4) {
         this.field_3894 += var1;
         if (this.field_3895 == 0) {
            if (this.field_3894 > 60.0F) {
               var3 = true;
            }
         } else if (this.field_3895 == 1) {
            if (this.field_3894 > 3600.0F) {
               var3 = true;
            }
         } else if (this.field_3895 == 2 && this.field_3894 > 14400.0F) {
            var3 = true;
         }
      }

      if (var3) {
         String var8 = "";
         Iterator var9 = this.field_3877.iterator();

         while(true) {
            class_458 var7;
            do {
               if (!var9.hasNext()) {
                  this.method_2936("Resyncing game for " + var8 + "...");
                  this.field_3893 = 0.0F;
                  this.field_3894 = 0.0F;
                  ++this.field_3895;
                  this.field_3896 = var2.field_1920;

                  for(var9 = this.field_3877.iterator(); var9.hasNext(); var7.field_3934 = false) {
                     var7 = (class_458)var9.next();
                     var7.field_3935 = false;
                  }

                  this.method_2944(this.field_3794, false, true);
                  return;
               }

               var7 = (class_458)var9.next();
            } while(!var7.field_3935 && !var7.field_3934);

            if (!var8.equals("")) {
               var8 = var8 + ", ";
            }

            var8 = var8 + var7.method_2991();
         }
      }
   }

   // $FF: renamed from: j (java.lang.String) void
   private strictfp void method_2879(String var1) {
      Iterator var2 = this.field_3877.iterator();

      while(var2.hasNext()) {
         class_458 var3 = (class_458)var2.next();
         var3.method_2989(var1);
      }

      this.field_3877.clear();
      this.field_3878.clear();
      this.field_3880 = 1;
      this.field_3879 = false;
   }

   // $FF: renamed from: p () long
   public strictfp long method_2880() {
      boolean var1 = false;
      if (var1) {
         class_236.method_1591("New id set:" + this.field_3803 + 1);
         class_236.method_1594();
      }

      return (long)(this.field_3803++);
   }

   // $FF: renamed from: q () long
   public strictfp long method_2881() {
      return this.field_3803;
   }

   // $FF: renamed from: a (long) void
   public strictfp void method_2882(long var1) {
      this.field_3803 = var1;
   }

   // $FF: renamed from: b (boolean) boolean
   public strictfp boolean method_2883(boolean var1) {
      Iterator var2 = this.field_3877.iterator();

      class_458 var3;
      do {
         if (!var2.hasNext()) {
            return true;
         }

         var3 = (class_458)var2.next();
      } while(!var3.field_3932 || !var3.method_2999() || var3.field_3941);

      if (var1) {
         this.method_2936("Still waiting on: " + var3.method_2991());
      }

      return false;
   }

   // $FF: renamed from: r () int
   public strictfp int method_2884() {
      int var1 = 0;
      Iterator var2 = this.field_3877.iterator();

      while(var2.hasNext()) {
         class_458 var3 = (class_458)var2.next();
         if (var3.field_3932 && var3.method_2999()) {
            ++var1;
         }
      }

      if (!class_236.field_1899) {
         ++var1;
      }

      return var1;
   }

   // $FF: renamed from: b (java.lang.String) void
   public strictfp void method_2885(String var1) {
      Log.method_1709("RustedWarfare", "network:" + var1);
   }

   // $FF: renamed from: c (java.lang.String) void
   public strictfp void method_2886(String var1) {
      Log.method_1712("RustedWarfare", "reportProblem:" + var1);
      if (this.field_3887) {
         this.method_2943((class_458)null, -1, (String)null, var1);
      } else {
         this.method_2943((class_458)null, -1, (String)null, var1);
      }

   }

   // $FF: renamed from: d (java.lang.String) void
   public static strictfp void method_2887(String var0) {
      method_2889(var0, false);
   }

   // $FF: renamed from: e (java.lang.String) void
   public static strictfp void method_2888(String var0) {
      method_2889(var0, true);
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public static strictfp void method_2889(String var0, boolean var1) {
      class_236 var2 = class_236.method_1549();
      class_454 var3 = var2.field_1944;
      String var4 = "desync:" + var0;
      class_236.method_1588(var4);
      class_236.method_1594();
      ++var3.field_3857;
      if (var3.field_3856) {
         if (var3.field_3857 > 2) {
            var1 = true;
         }

         String var5;
         if (var3.field_3857 > 10) {
            var5 = "<suppressing desync errors>";
            var3.field_3856 = false;
            var1 = true;
         } else {
            var5 = var4;
         }

         if (var1) {
            var5 = "-i " + var5;
         }

         var3.method_2938(var5);
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public static strictfp void method_2890(String var0, String var1) {
      class_236 var2 = class_236.method_1549();
      var2.field_1948.method_2644(-1, var0, var1, var2.field_1920);
      if (var2.field_1939 != null && var2.field_1939.field_947 != null) {
         var2.field_1939.field_947.method_1196(var0, var1);
      } else {
         class_236.method_1595("interfaceEngine/messageInterface==null");
      }

   }

   // $FF: renamed from: s () void
   public strictfp void method_2891() {
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.e) void
   public strictfp void method_2892(class_324 var1) {
      class_236 var2 = class_236.method_1549();
      var1.field_2597 = this.field_3824;
      var1.method_2181();
      var2.field_1952.field_2569.add(var1);
   }

   // $FF: renamed from: t () void
   public strictfp void method_2893() {
      class_236 var1 = class_236.method_1549();
      this.field_3834 = var1.field_1920;
      this.field_3838 = 0L;
      this.method_2847();
      Iterator var2 = class_34.field_79.iterator();

      class_434 var10000;
      while(var2.hasNext()) {
         class_34 var3 = (class_34)var2.next();
         if (var3 instanceof class_44) {
            class_44 var4 = (class_44)var3;
            this.field_3838 = (long)((float)this.field_3838 + var4.dh * 1000.0F);
            this.field_3838 = (long)((float)this.field_3838 + var4.di * 1000.0F);
            this.field_3838 = (long)((float)this.field_3838 + var4.bI * 1.0F);
            this.field_3838 += var4.da;
            var10000 = this.field_3840;
            var10000.field_3657 += (long)Float.floatToRawIntBits(var4.dh);
            var10000 = this.field_3840;
            var10000.field_3657 += (long)Float.floatToRawIntBits(var4.di);
            var10000 = this.field_3841;
            var10000.field_3657 += (long)Float.floatToRawIntBits(var4.bv);
            var10000 = this.field_3842;
            var10000.field_3657 = (long)((float)var10000.field_3657 + var4.bI);
            var10000 = this.field_3843;
            var10000.field_3657 += var4.da;
            if (var3 instanceof class_55) {
               class_55 var5 = (class_55)var4;
               var10000 = this.field_3853;
               var10000.field_3657 = (long)((float)var10000.field_3657 + var5.field_436 * 2.0F);
               var10000 = this.field_3854;
               var10000.field_3657 += (long)var5.field_438;
            }

            class_512 var8 = var4.method_400();
            if (var8 != null) {
               var10000 = this.field_3844;
               var10000.field_3657 += var8.method_3272();
               var10000 = this.field_3845;
               var10000.field_3657 = (long)((float)var10000.field_3657 + var8.method_3258() * 1000.0F);
            }

            var10000 = this.field_3847;
            var10000.field_3657 += var4.method_420();
         }
      }

      for(int var6 = 0; var6 < 10; ++var6) {
         class_107 var7 = class_107.method_954(var6);
         if (var7 != null) {
            var10000 = this.field_3846;
            var10000.field_3657 += (long)var7.field_1229;
            if (var6 == 0) {
               var10000 = this.field_3850;
               var10000.field_3657 += (long)var7.field_1229;
            }

            if (var6 == 1) {
               var10000 = this.field_3851;
               var10000.field_3657 += (long)var7.field_1229;
            }

            if (var6 == 2) {
               var10000 = this.field_3852;
               var10000.field_3657 += (long)var7.field_1229;
            }

            var10000 = this.field_3848;
            var10000.field_3657 += (long)var7.method_924();
            var10000 = this.field_3849;
            var10000.field_3657 += (long)(var6 + var7.field_1235 * 100 + var7.field_1231 * 1000 + (var7.field_1234 ? var6 : 0) * 10000);
         }
      }

      this.field_3855 = false;
   }

   // $FF: renamed from: u () void
   public strictfp void method_2894() {
      Iterator var1 = this.field_3877.iterator();

      while(var1.hasNext()) {
         class_458 var2 = (class_458)var1.next();
         if (var2.field_3932 && var2.method_2984() != -2 && var2.method_2984() <= 500 && var2.method_2984() < 0) {
         }
      }

   }

   // $FF: renamed from: v () void
   public strictfp void method_2895() {
      class_236 var1 = class_236.method_1549();
      String var2 = "";

      for(int var3 = 0; var3 < 10; ++var3) {
         class_107 var4 = class_107.method_954(var3);
         if (var4 != null) {
            String var5 = "unnamed";
            String var6 = "";
            if (var4.field_1233 != null) {
               var5 = var4.field_1233;
            }

            int var7 = var4.method_926();
            if (var7 != -2) {
               var6 = " (" + Integer.toString(var7) + ")";
            }

            String var8 = "•";
            var2 = var2 + var8 + var4.method_947().toLowerCase() + " [team:" + var4.field_1231 + "] - " + var5 + var6 + "\n";
         }
      }

      class_236.method_1591("showPlayerListPopup(): Showing playlist messagebox.");
      var1.method_1609("Players", var2);
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_2896(float var1) {
      class_236 var2 = class_236.method_1549();
      this.field_3859 += var1;
      if (this.field_3859 > 60.0F) {
         this.method_2894();
         this.field_3859 = 0.0F;
      }

      if (!this.field_3810 && !this.field_3808) {
         this.method_2935();
         this.field_3808 = true;
      }

      boolean var3;
      boolean var5;
      if (this.field_3810) {
         if (!this.field_3827) {
            if (this.method_2883(false)) {
               this.field_3826 = class_296.method_2020(this.field_3826, var1);
               if (this.field_3826 == 0.0F) {
                  this.field_3827 = true;
                  method_2890("", "<All players ready>");
                  this.field_3787.method_1496();
               }
            } else {
               this.field_3828 += var1;
               if (this.field_3828 > 300.0F && !this.field_3829) {
                  this.field_3829 = true;
                  this.method_2883(true);
               }

               if (this.field_3828 > 1200.0F) {
                  this.method_2883(true);
                  this.field_3827 = true;
                  method_2890("", "Starting game without all players ready!");
               }
            }
         }

         if (this.field_3827) {
            var3 = false;
            if (this.field_3837) {
               var3 = true;
            }

            if (var2.field_1920 >= this.field_3824 - this.field_3821 & !var3) {
               int var4 = this.field_3824 + this.field_3820;
               ++this.field_3818;
               var5 = false;

               for(int var6 = 0; var6 < 10; ++var6) {
                  class_107 var7 = class_107.method_954(var6);
                  if (var7 != null && var7.field_1250 != 0 && !var7.method_927() && var7.field_1250 < 40) {
                     var5 = true;
                  }
               }

               if (var2.method_1658() != 0 && var2.method_1658() < 40 && !class_236.method_1655()) {
                  var5 = true;
               }

               if (var5) {
                  ++this.field_3819;
               }

               if (this.field_3818 > 8) {
                  float var19 = 1.0F;
                  if (this.field_3819 > 4) {
                     var19 = 2.0F;
                  }

                  if (this.field_3817 != null) {
                     var19 = this.field_3817;
                  }

                  if (var19 != this.field_3815) {
                     class_236.method_1591("Changing step rate to " + var19);
                     class_324 var21 = var2.field_1952.method_2158();
                     var21.field_2601 = class_107.field_1224;
                     var21.field_2611 = true;
                     var21.field_2612 = var19;
                     this.method_2892(var21);
                  }

                  this.field_3818 = 0;
                  this.field_3819 = 0;
               }

               class_404 var24 = new class_404();

               try {
                  var24.method_2541(var4);
                  int var22 = 0;
                  Iterator var8 = var2.field_1952.field_2569.iterator();

                  class_324 var9;
                  while(var8.hasNext()) {
                     var9 = (class_324)var8.next();
                     if (var9.field_2597 == this.field_3824) {
                        ++var22;
                     }
                  }

                  var24.method_2541(var22);
                  var8 = var2.field_1952.field_2569.iterator();

                  while(var8.hasNext()) {
                     var9 = (class_324)var8.next();
                     if (var9.field_2597 == this.field_3824) {
                        var9.method_2182(var24);
                     }
                  }
               } catch (IOException var12) {
                  throw new RuntimeException(var12);
               }

               class_413 var26 = var24.method_2535(10);
               var26.field_3414 = true;
               this.method_2920(var26);
               this.field_3824 = var4;
            }
         }
      }

      Iterator var13;
      class_324 var14;
      if (!var2.field_1952.field_2571.isEmpty()) {
         var13 = var2.field_1952.field_2571.iterator();

         while(var13.hasNext()) {
            var14 = (class_324)var13.next();
            var5 = false;
            if (var5) {
               var2.field_1952.field_2570.add(var14);
               var13.remove();
            } else {
               if (!var14.field_2618) {
                  var14.method_2176();
               }

               if (var14.method_2175()) {
                  var2.field_1952.field_2570.add(var14);
                  var13.remove();
               }
            }
         }
      }

      if (!this.field_3810) {
         if (!var2.field_1952.field_2570.isEmpty()) {
            var13 = var2.field_1952.field_2570.iterator();

            while(var13.hasNext()) {
               var14 = (class_324)var13.next();
               if (!var14.method_2179()) {
                  var14.method_2203();
                  class_404 var18 = new class_404();

                  try {
                     var14.method_2182(var18);
                  } catch (IOException var10) {
                     throw new RuntimeException(var10);
                  }

                  this.method_2920(var18.method_2535(20));
               }
            }

            var2.field_1952.field_2570.clear();
         }
      } else if (!var2.field_1952.field_2570.isEmpty()) {
         var13 = var2.field_1952.field_2570.iterator();

         while(var13.hasNext()) {
            var14 = (class_324)var13.next();
            if (!var14.method_2179()) {
               if (!var14.method_2206()) {
                  method_2887("Skipped command issued from server");
               } else {
                  var14.method_2203();
                  this.method_2892(var14);
               }
            }
         }

         var2.field_1952.field_2570.clear();
      }

      String var20;
      while(!this.field_3878.isEmpty()) {
         class_413 var15 = (class_413)this.field_3878.remove();

         try {
            this.method_2900(var15);
         } catch (IOException var11) {
            var20 = "None";
            class_458 var25 = var15.field_3410;
            if (var25 != null) {
               var20 = var25.method_2992();
               String var27 = var11.getMessage();
               if (var27 == null) {
                  var27 = "IO error";
               }

               var25.method_2989(var27);
               method_2887("IO error on processGamePacket for " + var25.method_2991());
            }

            class_236.method_1589("Error on processGamePacket ip:" + var20, var11);
         }
      }

      if (this.field_3810) {
         if (!this.field_3809) {
            class_236.method_1591("Skipping server updates, not networked");
         } else {
            this.method_2876();
            if (!this.field_3836) {
               this.method_2878(var1);
            }
         }
      }

      if (!this.field_3810 && this.field_3809) {
         var3 = false;
         Iterator var16 = this.field_3877.iterator();

         while(var16.hasNext()) {
            class_458 var23 = (class_458)var16.next();
            if (var23.field_3932 && !var23.field_3923) {
               var3 = true;
            }
         }

         if (!var3 && this.method_2865()) {
            var2.field_1939.method_705("Server Disconnected");
            class_270.method_1881();
         }

         if (var3 && this.field_3825 && !this.field_3810) {
            class_458 var17 = this.method_2919();
            if (var17 != null && var17.field_3951 > 20000) {
               var20 = "Receiving network data: " + var17.field_3952 + "/" + var17.field_3951;
               class_236.method_1591(var20);
               var2.field_1939.method_706(var20);
            }
         }
      }

      if (var2.field_1920 < this.field_3824) {
         this.field_3825 = false;
      }

      if (this.field_3892) {
         this.method_2873("queDisconnect");
      }

   }

   // $FF: renamed from: b (float) void
   public strictfp void method_2897(float var1) {
      if (this.field_3809) {
         class_236 var2 = class_236.method_1549();
         if (this.field_3834 + this.field_3835 < var2.field_1920 || this.field_3834 == -1) {
            this.method_2893();
            var2.field_1948.method_2647();
         }

         if (this.field_3810 && !this.field_3855 && this.field_3834 + this.field_3835 / 2 < var2.field_1920 && this.field_3834 != -1) {
            try {
               class_404 var3 = new class_404();
               var3.method_2541(this.field_3834);
               var3.method_2543(this.field_3838);
               var3.method_2541(this.field_3839.size());
               Iterator var4 = this.field_3839.iterator();

               while(var4.hasNext()) {
                  class_434 var5 = (class_434)var4.next();
                  var3.method_2543(var5.field_3657);
               }

               class_413 var7 = var3.method_2535(30);
               this.method_2923(var7);
               if (this.field_3789) {
                  class_236.method_1591("Sent checksum to client [" + this.field_3834 + "]");
               }

               this.field_3855 = true;
            } catch (IOException var6) {
               throw new RuntimeException(var6);
            }
         }

      }
   }

   // $FF: renamed from: w () boolean
   public strictfp boolean method_2898() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1941.method_1698()) {
         if (!this.field_3897) {
            class_236.method_1591("shouldGameBePaused: isGoingToBlockThisFrame()==true: " + var1.field_1941.method_1699());
         }

         this.field_3897 = true;
         return true;
      } else {
         if (this.field_3897) {
            class_236.method_1591("shouldGameBePaused: isGoingToBlockThisFrame()==false");
         }

         this.field_3897 = false;
         return false;
      }
   }

   // $FF: renamed from: a (float, boolean) void
   public strictfp void method_2899(float var1, boolean var2) {
      class_236 var3 = class_236.method_1549();
      if (var3.field_1920 >= this.field_3824) {
         if (var3.field_1920 > this.field_3824) {
            throw new RuntimeException("game frame:" + var3.field_1920 + " is greater then nest step:" + this.field_3824);
         }

         this.field_3825 = true;
      }

      if (var2 && this.method_2898()) {
         this.field_3825 = true;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.ah) void
   public strictfp void method_2900(class_413 var1) {
      class_236 var2 = class_236.method_1549();
      if (this.method_2901(var1)) {
         this.method_2885("filtered packet (type:" + var1.field_3411 + ")");
      } else {
         class_463 var3;
         int var4;
         int var5;
         boolean var9;
         class_458 var19;
         class_463 var20;
         int var23;
         switch(var1.field_3411) {
         case 10:
            if (this.field_3810) {
               this.method_2885("we are a server! we don't follow orders");
            } else {
               var3 = new class_463(var1);
               var4 = var3.method_3011();
               var5 = var3.method_3011();

               for(var23 = 0; var23 < var5; ++var23) {
                  class_324 var27 = var2.field_1952.method_2158();
                  var27.field_2597 = this.field_3824;
                  var27.method_2183(var3);
                  this.method_2892(var27);
               }

               if (var4 < this.field_3824) {
                  String var28 = "New nextBlockingFrame:" + var4 + " is smaller than current step:" + this.field_3824;
                  method_2887(var28);
               }

               this.field_3824 = var4;
            }
            break;
         case 20:
            if (!this.field_3810) {
               this.method_2885("we are not a server! skipping");
            } else {
               var3 = new class_463(var1);
               class_458 var21 = var1.field_3410;
               class_110 var22 = var21.field_3937;
               if (var22 == null) {
                  this.method_2885("Player is null for message ADDCLIENTCOMMAND, skipping");
               } else {
                  this.method_2885("got command from: " + var22.j);
                  class_324 var25 = var2.field_1952.method_2158();
                  var25.method_2183(var3);
                  var25.field_2609 = var22;
                  if (var25.field_2611) {
                     this.method_2885("Got system action from client, ignoring");
                     var25.field_2611 = false;
                  }

                  if (var25.method_2177() == null) {
                     method_2887("Invalid command from '" + var22.j + "', no team found");
                  } else if (!var25.method_2206()) {
                     method_2887("Ignored command from '" + var22.j + "', check failed");
                  } else {
                     this.method_2892(var25);
                  }
               }
            }
            break;
         case 30:
            var19 = var1.field_3410;
            var20 = new class_463(var1);
            var5 = var20.method_3011();
            long var24 = var20.method_3013();
            if (this.field_3833) {
               this.method_2885("PACKET_SYNCCHECKSUM: skipping frame:" + var5 + ", we were told to wait for resync");
            } else {
               class_404 var30 = new class_404();
               var30.method_2539(0);
               var30.method_2541(var5);
               var30.method_2541(this.field_3834);
               if (this.field_3834 == var5 && this.field_3838 != 0L) {
                  var30.method_2540(true);
                  Log.method_1712("RustedWarfare", "Running checksum");
                  var30.method_2543(var24);
                  var30.method_2543(this.field_3838);
                  var9 = false;
                  if (var24 != this.field_3838) {
                     method_2887("Checksum doesn't match. Got:" + var24 + " expected:" + this.field_3838);
                     var9 = true;
                  } else {
                     ++this.field_3858;
                  }

                  int var32 = var20.method_3011();
                  if (var32 != this.field_3839.size()) {
                     Log.method_1712("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                  }

                  var30.method_2565("checkList");
                  var30.method_2541(var32);
                  var30.method_2541(this.field_3839.size());
                  Iterator var34 = this.field_3839.iterator();

                  while(var34.hasNext()) {
                     class_434 var36 = (class_434)var34.next();
                     long var38 = var20.method_3013();
                     var30.method_2543(var38);
                     var30.method_2543(var36.field_3657);
                     if (var38 != var36.field_3657 && var36.field_3658) {
                        method_2887("[" + var5 + "] check(" + var36.field_3656 + "): " + var38 + "!=" + var36.field_3657);
                        var9 = true;
                     }
                  }

                  var30.method_2567("checkList");
                  var30.method_2540(var9);
               } else {
                  var30.method_2540(false);
                  Log.method_1712("RustedWarfare", "got remoteSyncFrame for:" + var5 + " needed:" + this.field_3834 + " lastSyncCheckSum:" + this.field_3838);
               }

               if (!this.field_3810) {
                  class_413 var33 = var30.method_2535(31);
                  this.method_2924(var19, var33);
               }
            }
            break;
         case 31:
            if (!this.field_3810) {
               this.method_2885("we are not a server, but got PACKET_SYNCCHECKSUM_STATUS");
            } else {
               var19 = var1.field_3410;
               var20 = new class_463(var1);
               var20.method_3009();
               var5 = var20.method_3011();
               var23 = var20.method_3011();
               boolean var26 = var20.method_3010();
               if (var26) {
                  long var29 = var20.method_3013();
                  long var31 = var20.method_3013();
                  var20.method_3030("checkList");
                  var20.method_3011();
                  int var35 = var20.method_3011();
                  if (var35 != this.field_3839.size()) {
                     Log.method_1712("RustedWarfare", "checkSumSize!=syncCheckList.size()");
                  }

                  Iterator var13 = this.field_3839.iterator();

                  while(var13.hasNext()) {
                     class_434 var14 = (class_434)var13.next();
                     long var15 = var20.method_3013();
                     long var17 = var20.method_3013();
                     if (var15 != var17) {
                        class_236.method_1588(var14.field_3656 + " Checksum [" + var5 + "]. server:" + var15 + " client:" + var17);
                     }
                  }

                  var20.method_3036("checkList");
                  boolean var37 = var20.method_3010();
                  if (this.field_3896 >= var5) {
                     this.method_2885("Not marking desync, already resynced before frame: " + this.field_3896 + "<=" + var5);
                  } else {
                     if (!var19.field_3934) {
                        ++var19.field_3936;
                     }

                     var19.field_3934 = var37;
                     if (!var37) {
                        if (this.field_3789) {
                           class_236.method_1591("checksum: client checksum match [" + var5 + "]");
                        }
                     } else {
                        class_236.method_1591("client:" + var19.method_2991() + " desync [" + var5 + "]");
                        if (this.field_3836 && !this.field_3837) {
                           method_2887("pauseOnDesync is active, pausing");
                           this.field_3837 = true;
                        }
                     }
                  }
               } else if (this.field_3789) {
                  class_236.method_1591("checksum for:" + var19.method_2991() + " frameMatch==false client:" + var23 + " server:[" + var5 + "]");
               }
            }
            break;
         case 35:
            var3 = new class_463(var1);
            var3.method_3009();
            var4 = var3.method_3011();
            var5 = var3.method_3011();
            float var6 = var3.method_3012();
            float var7 = var3.method_3012();
            class_458 var8 = var1.field_3410;
            var9 = var3.method_3010();
            boolean var10 = var3.method_3010();
            byte[] var11;
            if (var10) {
               if (!this.field_3810) {
                  this.method_2885("we are not a server, but got a debug game save! skipping");
               } else {
                  var11 = var3.method_3034("gameSave");
                  this.method_2877(var11, var8);
               }
            } else {
               class_236.method_1591("Reloading from network save");
               if (var9 && !this.field_3810) {
                  this.method_2944(false, true, false);
               }

               var11 = var3.method_3034("gameSave");
               if (this.field_3794) {
                  this.method_2877(var11, var8);
               }

               var2.field_1948.method_2645(var11, var2.field_1920, var4, var5, var6, var7);
               class_463 var12 = new class_463(var11);
               var2.field_1947.method_1993(var12, true, true, true);
               var2.field_1920 = var4;
               var2.field_1921 = var5;
               this.field_3824 = var4 + 1;
               this.field_3833 = false;
               this.field_3834 = this.field_3824 + 1;
               this.field_3815 = var6;
               this.field_3816 = var7;
            }
            break;
         default:
            this.method_2885("we did not handle packet:" + var1.field_3411);
         }

      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.ah) boolean
   public strictfp synchronized boolean method_2901(class_413 var1) {
      if (this.field_3810) {
         class_458 var2 = var1.field_3410;
         if (var2 == null) {
            return false;
         }

         if (!var2.field_3932 && var1.field_3411 != 105 && var1.field_3411 != 110 && var1.field_3411 != 111 && var1.field_3411 != 108 && var1.field_3411 != 160) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.f.ah) void
   public strictfp synchronized void method_2902(class_413 var1) {
      class_236 var2 = class_236.method_1549();
      if (this.method_2901(var1)) {
         this.method_2885("filtered packet (type:" + var1.field_3411 + ")");
      } else {
         class_463 var3;
         class_458 var4;
         String var5;
         int var6;
         int var7;
         int var8;
         String var9;
         int var11;
         class_458 var23;
         String var24;
         class_463 var25;
         byte var26;
         String var30;
         switch(var1.field_3411) {
         case 105:
            this.method_2885("got PACKET_GET_SERVER_INFO");
            if (!this.field_3810) {
               this.method_2885("we are not a server! skipping");
            }
            break;
         case 106:
            if (this.field_3810) {
               this.method_2885("we are a server! we don't follow orders");
            } else {
               var3 = new class_463(var1);
               var4 = var1.field_3410;
               var3.method_3015();
               var3.method_3011();
               this.field_3863.field_3775 = (class_396)var3.method_3022(aa.class);
               this.field_3863.field_3776 = var3.method_3015();
               this.field_3863.field_3777 = var3.method_3011();
               this.field_3863.field_3778 = var3.method_3011();
               this.field_3863.field_3779 = var3.method_3010();
               this.field_3863.field_3780 = var3.method_3011();
               var26 = var3.method_3009();
               this.field_3812 = var3.method_3010();
               this.field_3813 = var3.method_3010();
               this.field_3860 = true;
               if (var26 >= 1) {
                  this.field_3861 = var3.method_3011();
                  this.field_3862 = var3.method_3011();
               }

               if (var26 >= 2) {
                  this.field_3863.field_3781 = var3.method_3011();
                  this.field_3863.field_3782 = var3.method_3012();
                  this.field_3863.field_3783 = var3.method_3010();
                  this.field_3863.field_3784 = var3.method_3010();
               }

               if (var26 >= 3) {
                  boolean var36 = var3.method_3010();
                  if (var36) {
                     try {
                        class_479.method_3134(var3);
                     } catch (class_362 var22) {
                        this.method_2873("Missing unit:" + var22.getMessage() + " d:" + var22.a);
                        this.method_2903("Server sync mismatch", var22.getMessage());
                        if (!class_236.method_1654()) {
                           var2.method_1607(var22.getMessage());
                        }

                        var2.method_1611("Server sync mismatch", var22.getMessage());
                        break;
                     }
                  }
               }

               if (var26 >= 4) {
                  this.field_3863.field_3785 = var3.method_3010();
               }

               class_270.method_1881();
            }
            break;
         case 107:
         case 114:
         case 116:
         case 117:
         case 118:
         case 119:
         case 121:
         case 122:
         case 123:
         case 124:
         case 125:
         case 126:
         case 127:
         case 128:
         case 129:
         case 130:
         case 131:
         case 132:
         case 133:
         case 134:
         case 135:
         case 136:
         case 137:
         case 138:
         case 139:
         case 142:
         case 143:
         case 144:
         case 145:
         case 146:
         case 147:
         case 148:
         case 149:
         case 151:
         case 152:
         case 153:
         case 154:
         case 155:
         case 156:
         case 157:
         case 158:
         case 159:
         default:
            this.method_2885("we did not handle packet:" + var1.field_3411);
            break;
         case 108:
            var23 = var1.field_3410;
            var25 = new class_463(var1);
            long var33 = var25.method_3013();
            var25.method_3009();
            class_404 var40 = new class_404();
            var40.method_2543(var33);
            var40.method_2539(1);
            var8 = var2.method_1658();
            if (var8 > 130) {
               var8 = 130;
            }

            var40.method_2539(var8);
            class_413 var46 = var40.method_2535(109);
            this.method_2924(var23, var46);
            break;
         case 109:
            if (!this.field_3810) {
               this.method_2885("we are not a server! skipping");
            } else {
               long var28 = System.currentTimeMillis();
               class_458 var32 = var1.field_3410;
               class_463 var35 = new class_463(var1);
               long var39 = var35.method_3013();
               byte var45 = var35.method_3009();
               byte var42 = 0;
               if (var45 >= 1) {
                  var42 = var35.method_3009();
               }

               var11 = (int)(var28 - var39);
               var32.field_3938 = var11;
               var32.field_3939 = var28;
               if (var32.field_3937 != null) {
                  var32.field_3937.B = var11;
                  var32.field_3937.C = var28;
                  var32.field_3937.A = var42;
               }

               if (!this.field_3887) {
                  class_270.method_1881();
               }
            }
            break;
         case 110:
            this.method_2885("got REGISTER_CONNECTION");
            if (!this.field_3810) {
               this.method_2885("we are not a server! skipping");
            } else {
               var3 = new class_463(var1);
               var4 = var1.field_3410;
               var5 = var3.method_3015();
               var6 = var3.method_3011();
               var7 = var3.method_3011();
               var8 = var3.method_3011();
               var9 = var3.method_3015();
               String var41 = var3.method_3014();
               String var44 = null;
               var9 = var9.replace("\n", ".");
               var9 = var9.replace("\r", ".");
               var9 = var9.replace("\t", ".");
               var9 = var9.replace("\u0000", ".");
               var4.field_3942 = var7;
               if (var6 >= 1) {
                  var4.field_3949 = var3.method_3015();
               }

               if (var6 >= 2) {
                  var44 = var3.method_3015();
               }

               int var12 = -1;
               if (var6 >= 3) {
                  var12 = var3.method_3011();
               }

               String var13 = "MISSING";
               if (var6 >= 4) {
                  var13 = var3.method_3015();
               }

               class_110 var14 = null;
               if (var44 != null) {
                  var14 = class_107.method_934(var44);
               }

               String var15 = this.field_3787.method_1495(var4, var9, var7, var8, var4.field_3949, var14);
               if (var15 != null) {
                  this.method_2906(var4, var15);
                  var4.method_2989("kicked");
               } else if (var7 < this.field_3788 && !this.field_3802) {
                  this.method_2906(var4, "Game is out of date, please update");
                  var4.method_2989("kicked");
               } else if (var7 > this.field_3788 && !this.field_3802) {
                  this.method_2906(var4, "Your client is newer then the server");
                  var4.method_2989("kicked");
               } else if (var9.length() > 25) {
                  this.method_2906(var4, "Your username is too long");
                  var4.method_2989("kicked");
               } else if (!this.field_3802 && var12 != var2.method_1650()) {
                  class_236.method_1591("New Player kicked: Unit checksum mismatch: clientUnitsChecksum=" + var12 + " game.getAllUnitsChecksum():" + var2.method_1650());
                  this.method_2906(var4, "Your units are different to the server's units. Game can not be synchronized");
                  var4.method_2989("kicked");
               } else {
                  String var16;
                  if (!this.field_3802) {
                     var16 = this.method_2934(var4.field_3950);
                     if (!var16.equals(var13)) {
                        class_236.method_1591("New Player kicked: Integrity Check Failed: expectedResponse=" + var16 + " clientResponse=" + var13);
                        this.method_2906(var4, "Your 'Rusted Warfare' client is different to the server. Game can not be synchronized. (Are you running a mod?)");
                        var4.method_2989("kicked");
                        break;
                     }
                  }

                  if (this.field_3887 && var14 == null) {
                     this.method_2906(var4, "A game has already been started on this server");
                     var4.method_2989("kicked");
                  } else {
                     if (this.field_3796 != null && var14 == null) {
                        var16 = class_296.method_2062(this.field_3796);
                        if (!var16.equals(var41)) {
                           class_236.method_1592("processSystemPacket", "Player tried to join but had an incorrect password");
                           this.method_2907(var4);
                           break;
                        }
                     }

                     if (var4.field_3937 == null) {
                        int var47;
                        if (var14 == null) {
                           var47 = class_107.method_935();
                        } else {
                           var47 = var14.d;
                        }

                        if (var47 == -1 && !this.field_3802) {
                           this.method_2906(var4, "No free slots on server");
                           var4.method_2989("no free slots");
                        } else {
                           String var17 = this.field_3787.method_1492(var4, var9);
                           if (var17 != null) {
                              this.method_2906(var4, var17);
                              var4.method_2989("kicked");
                           } else {
                              String var18 = null;
                              if (var14 != null) {
                                 var4.field_3937 = var14;
                                 method_2890("", "'" + var4.field_3937.j + "' reconnected.");
                                 var4.field_3935 = true;
                                 var18 = var14.j;
                              } else if (this.field_3802 && var47 == -1) {
                                 var4.field_3937 = new class_110(-2);
                              } else {
                                 var4.field_3937 = new class_110(var47);
                                 var4.field_3937.h = var47 % 2;
                              }

                              var4.field_3937.j = var9;
                              var4.field_3937.u = var44;
                              var4.field_3942 = var7;
                              class_236.method_1592("processSystemPacket", "networkVersion is:" + var4.field_3942);
                              var4.field_3932 = true;
                              class_270.method_1881();
                              this.method_2910(var4);
                              this.method_2905(var4);
                              this.field_3787.method_1493(var4, var9, var18);
                              if (var14 != null && this.field_3887) {
                                 boolean var19 = true;
                                 this.method_2946(var4, var19);
                              }
                           }
                        }
                     } else {
                        class_236.method_1592("processSystemPacket", "This connection already has a player");
                     }
                  }
               }
            }
            break;
         case 111:
            var3 = new class_463(var1);
            var4 = var1.field_3410;
            var5 = null;

            try {
               var5 = var3.method_3015();
            } catch (IOException var20) {
               class_236.method_1589("Error reading disconnect reason", var20);
            }

            this.method_2885("Got a disconnect packet:" + var5);
            if (var4 != null) {
               var4.method_2993(false, false);
            }
            break;
         case 112:
            if (!this.field_3810) {
               this.method_2885("we are not a server! skipping");
            } else {
               var23 = var1.field_3410;
               var25 = new class_463(var1);
               var23.field_3940 = var25.method_3010();
               var23.field_3941 = var25.method_3010();
            }
            break;
         case 113:
            class_270.method_1882();
            break;
         case 115:
            if (this.field_3810) {
               this.method_2885("we are a server! we don't follow orders");
            } else {
               var3 = new class_463(var1);
               var3.method_3007(var1.field_3410.field_3942);
               var4 = var1.field_3410;
               int var29 = var3.method_3011();
               Object var31 = null;
               var7 = 8;
               if (var3.method_3008() >= 90) {
                  var7 = var3.method_3011();
                  var3.method_3030("teams");
                  if (var7 > 10) {
                     throw new IOException("Cannot load:" + var7 + " teams");
                  }
               } else if (this.field_3887) {
                  method_2887("Warning old team system used in started game, stream version:" + var3.method_3008());
               }

               for(var8 = 0; var8 < var7; ++var8) {
                  Object var37 = class_107.method_954(var8);
                  boolean var10 = var3.method_3010();
                  if (!var10) {
                     if (var37 != null) {
                        if (this.field_3887) {
                           method_2887("Warning team:" + var8 + " removed while game is running");
                        }

                        ((class_107)var37).method_936();
                     }
                  } else {
                     var11 = var3.method_3011();
                     if (var37 == null) {
                        if (this.field_3887) {
                           method_2887("Warning team:" + var8 + " added while game is running");
                        }

                        if (!this.field_3810 && var37 instanceof class_112) {
                           method_2887("Warning we are a client with an AI team");
                        }

                        var37 = new class_110(var8);
                     }

                     ((class_107)var37).method_913(var3, this.field_3887);
                  }

                  if (var37 != null && ((class_107)var37).field_1227 == var29) {
                     var31 = var37;
                  }
               }

               if (var3.method_3008() >= 90) {
                  var3.method_3036("teams");
               }

               this.field_3806 = (class_107)var31;
               this.field_3863.field_3778 = var3.method_3011();
               this.field_3863.field_3777 = var3.method_3011();
               this.field_3863.field_3779 = var3.method_3010();
               this.field_3863.field_3780 = var3.method_3011();
               byte var38 = var3.method_3009();
               this.field_3861 = var3.method_3011();
               this.field_3862 = var3.method_3011();
               if (var38 >= 2) {
                  this.field_3863.field_3781 = var3.method_3011();
                  this.field_3863.field_3782 = var3.method_3012();
                  this.field_3863.field_3783 = var3.method_3010();
                  this.field_3863.field_3784 = var3.method_3010();
               }

               if (var38 >= 3) {
                  boolean var43 = var3.method_3010();
                  if (var43) {
                     try {
                        class_479.method_3134(var3);
                     } catch (class_362 var21) {
                        this.method_2873("Missing unit:" + var21.getMessage() + " d:" + var21.a);
                        this.method_2903("Connection Failed", var21.getMessage());
                        if (!class_236.method_1654()) {
                           var2.method_1607(var21.getMessage());
                        }

                        var2.method_1611("Connection Failed", var21.getMessage());
                        break;
                     }
                  }
               }

               if (var38 >= 4) {
                  this.field_3863.field_3785 = var3.method_3010();
               }

               class_270.method_1881();
            }
            break;
         case 120:
            if (this.field_3810) {
               this.method_2885("error, we are a server but got: PACKET_START_GAME");
            } else {
               var3 = new class_463(var1);
               var3.method_3009();
               this.field_3864 = null;
               this.field_3863.field_3775 = (class_396)var3.method_3022(aa.class);
               if (this.field_3863.field_3775 == class_396.field_3239) {
                  this.field_3865 = var3.method_3026();
               } else if (this.field_3863.field_3775 == class_396.field_3238) {
                  this.field_3866 = var3.method_3026();
               } else {
                  this.field_3864 = var3.method_3015();
               }

               this.method_2947();
            }
            break;
         case 140:
            if (!this.field_3810) {
               this.method_2885("we are not a server! skipping");
            } else {
               var23 = var1.field_3410;
               var25 = new class_463(var1);
               class_110 var27 = var23.field_3937;
               if (var27 == null) {
                  this.method_2885("player is null for message, skipping");
               } else {
                  var30 = var25.method_3015();
                  var25.method_3009();
                  if (this.field_3787.method_1489(var23, var27.j, var30)) {
                     if (this.field_3867.method_2975(var23, 60000) > this.field_3790) {
                        if (class_296.method_2084(var23.field_3929, System.nanoTime()) > 60000L) {
                           var23.field_3929 = System.nanoTime();
                           this.method_2936("Anti-spam: Too many messages from '" + var23.method_2991() + "'");
                        }

                        if (this.field_3789) {
                           class_236.method_1591("extraDebug:" + var30);
                        }
                     } else {
                        this.method_2939(var23, var27, var27.j, var30);
                        this.field_3787.method_1490(var23, var27.j, var30);
                        this.method_2972(var23, var27, var27.j, var30);
                     }
                  }
               }
            }
            break;
         case 141:
            if (this.field_3810) {
               this.method_2885("error, we are a server but got: PACKET_RECEIVE_CHAT_FROM_SERVER");
            } else {
               var3 = new class_463(var1);
               var24 = var3.method_3015();
               var26 = var3.method_3009();
               var30 = var3.method_3014();
               var3.method_3011();
               var7 = -1;
               if (var26 >= 3) {
                  var7 = var3.method_3011();
               }

               this.method_2943((class_458)null, var7, var30, var24);
            }
            break;
         case 150:
            if (this.field_3810) {
               this.method_2885("error, we are a server but got: PACKET_SEND_KICK");
            } else {
               var3 = new class_463(var1);
               var24 = var3.method_3015();
               this.method_2885("we got kicked, reason:" + var24);
               this.method_2873("I was kicked");
               this.method_2903("Kicked", "Kicked: " + var24);
               var2.method_1611("Kicked", "Kicked: " + var24);
               var2.method_1607("Kicked: " + var24);
            }
            break;
         case 160:
            var3 = new class_463(var1);
            var4 = var1.field_3410;
            var5 = var3.method_3015();
            var6 = var3.method_3011();
            var7 = var3.method_3011();
            boolean var34 = true;
            if (var6 >= 1) {
               var8 = var3.method_3011();
            }

            if (var4.field_3931) {
               class_236.method_1591("steam: request info packet");
            }

            this.method_2932(var4);
            break;
         case 161:
            if (this.field_3810) {
               this.method_2885("we are a server! we don't PREREGISTER_INFO");
            } else {
               var3 = new class_463(var1);
               var4 = var1.field_3410;
               if (var4.field_3931) {
                  class_236.method_1591("steam: got info packet");
               }

               var5 = var3.method_3015();
               var6 = var3.method_3011();
               var7 = var3.method_3011();
               var8 = var3.method_3011();
               var9 = var3.method_3015();
               this.field_3822 = var3.method_3015();
               var4.field_3942 = var7;
               if (var6 >= 1) {
                  this.field_3823 = var3.method_3011();
               }

               if (this.field_3899) {
                  this.method_2885("PACKET_SEND_PREREGISTER_INFO: Register connection has already been sent!");
               } else {
                  this.method_2933(var4);
               }
            }
         }

      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public strictfp void method_2903(String var1, String var2) {
      class_270.method_1880(var1, var2);
      this.field_3787.method_1502();
   }

   // $FF: renamed from: x () void
   public strictfp synchronized void method_2904() {
      Iterator var1 = this.field_3877.iterator();

      while(var1.hasNext()) {
         class_458 var2 = (class_458)var1.next();
         if (var2.field_3932) {
            this.method_2905(var2);
         }
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp synchronized void method_2905(class_458 var1) {
      if (!this.field_3810) {
         this.method_2885("sendServerInfo: we are not a server!");
      } else {
         class_404 var2 = new class_404();

         try {
            var2.method_2545("com.corrodinggames.rts");
            var2.method_2541(this.field_3788);
            var2.method_2553(this.field_3863.field_3775);
            if (this.field_3802) {
               var2.method_2545("<CHAT ONLY>");
            } else {
               var2.method_2545(this.field_3863.field_3776 == null ? "<NULL>" : this.field_3863.field_3776);
            }

            var2.method_2541(this.field_3863.field_3777);
            var2.method_2541(this.field_3863.field_3778);
            var2.method_2540(this.field_3863.field_3779);
            var2.method_2541(this.field_3863.field_3780);
            var2.method_2539(4);
            var2.method_2540(this.field_3787.method_1497(var1));
            boolean var3 = this.field_3787.method_1498(var1);
            var2.method_2540(var3);
            var2.method_2541(this.field_3861);
            var2.method_2541(this.field_3862);
            var2.method_2541(this.field_3863.field_3781);
            var2.method_2542(this.field_3863.field_3782);
            var2.method_2540(this.field_3863.field_3783);
            var2.method_2540(this.field_3863.field_3784);
            if (this.field_3802) {
               var2.method_2540(false);
            } else {
               var2.method_2540(true);
               class_479.method_3130(var2);
            }

            var2.method_2540(this.field_3863.field_3785);
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }

         this.method_2924(var1, var2.method_2535(106));
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, java.lang.String) void
   public strictfp synchronized void method_2906(class_458 var1, String var2) {
      if (!this.field_3810) {
         this.method_2885("sendKick: we are not a server!");
      } else {
         this.method_2885("kicking client reason:" + var2);
         class_404 var3 = new class_404();

         try {
            var3.method_2545(var2);
         } catch (IOException var5) {
            throw new RuntimeException(var5);
         }

         this.method_2924(var1, var3.method_2535(150));
      }
   }

   // $FF: renamed from: c (com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp synchronized void method_2907(class_458 var1) {
      if (!this.field_3810) {
         this.method_2885("sendIncorrectPassword: we are not a server!");
      } else {
         this.method_2885("sendIncorrectPassword");
         class_404 var2 = new class_404();

         try {
            var2.method_2541(0);
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }

         this.method_2924(var1, var2.method_2535(113));
      }
   }

   // $FF: renamed from: y () void
   public strictfp void method_2908() {
      if (this.field_3810) {
         if (this.field_3806 != null) {
            this.field_3806.field_1251 = 0;
            this.field_3806.field_1252 = System.currentTimeMillis();
         }

         for(int var1 = 0; var1 < 10; ++var1) {
            class_107 var2 = class_107.method_954(var1);
            if (var2 != null) {
               if (this.field_3802) {
                  var2.field_1253 = 0;
               } else {
                  var2.field_1253 = var2.field_1231;
               }

               if (!this.field_3887) {
               }

               if (this.field_3887 && !var2.field_1234) {
                  boolean var3 = false;
                  if (var2.method_927()) {
                     var3 = true;
                  }

                  if (var2.field_1239 != var3) {
                     if (var3 && !var2.field_1237 && !var2.field_1236 && !var2.field_1238) {
                        this.method_2939((class_458)null, var2, var2.field_1233, "-t [Sharing control due to disconnect]");
                     }

                     var2.field_1239 = var3;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: z () void
   public strictfp void method_2909() {
      this.method_2910((class_458)null);
   }

   // $FF: renamed from: d (com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp void method_2910(class_458 var1) {
      if (!this.field_3810) {
         this.method_2885("sendUpdatePlayer: we are not a server!");
      } else {
         this.method_2908();
         Iterator var2 = this.field_3877.iterator();

         while(true) {
            class_458 var3;
            do {
               if (!var2.hasNext()) {
                  return;
               }

               var3 = (class_458)var2.next();
            } while(!var3.field_3932);

            class_404 var4 = new class_404(var3.field_3942);

            try {
               var4.method_2541(var3.method_2985());
               byte var5 = 10;
               if (var4.method_2568() >= 90) {
                  var4.method_2541(var5);
                  var4.method_2565("teams");
               } else {
                  var5 = 8;
                  this.method_2885("sendUpdatePlayer: warning saving with lower team count");
               }

               for(int var6 = 0; var6 < var5; ++var6) {
                  class_107 var7 = class_107.method_954(var6);
                  var4.method_2540(var7 != null);
                  if (var7 != null) {
                     byte var8 = 0;
                     if (var7 instanceof class_112) {
                        var8 = 1;
                     }

                     var4.method_2541(var8);
                     var7.method_911(var4);
                  }
               }

               if (var4.method_2568() >= 90) {
                  var4.method_2567("teams");
               }

               var4.method_2541(this.field_3863.field_3778);
               var4.method_2541(this.field_3863.field_3777);
               var4.method_2540(this.field_3863.field_3779);
               var4.method_2541(this.field_3863.field_3780);
               var4.method_2539(4);
               var4.method_2541(this.field_3861);
               var4.method_2541(this.field_3862);
               var4.method_2541(this.field_3863.field_3781);
               var4.method_2542(this.field_3863.field_3782);
               var4.method_2540(this.field_3863.field_3783);
               var4.method_2540(this.field_3863.field_3784);
               var4.method_2540(false);
               var4.method_2540(this.field_3863.field_3785);
            } catch (IOException var9) {
               throw new RuntimeException(var9);
            }

            short var10 = -1;
            if (var1 == var3 && var3.field_3942 <= 26) {
               var10 = 1000;
            }

            this.method_2924(var3, var4.method_2536(115, var10));
         }
      }
   }

   // $FF: renamed from: A () boolean
   public strictfp synchronized boolean method_2911() {
      if (this.field_3809) {
         this.method_2873("Started singleplayer");
      }

      class_236 var1 = class_236.method_1549();
      this.method_2870();
      this.field_3809 = true;
      this.field_3810 = true;
      this.field_3811 = true;
      this.field_3863.field_3775 = class_396.field_3237;
      this.field_3863.field_3776 = var1.method_1645();
      this.method_2928();
      int var2 = class_107.method_935();
      if (var2 == -1) {
         throw new RuntimeException("playerId is -1 for server player");
      } else {
         this.field_3806 = var1.field_1915;
         class_270.method_1881();
         this.field_3795 = var1.field_1937.networkPort;
         this.method_2885("singleplayer server started");
         return true;
      }
   }

   // $FF: renamed from: c (boolean) boolean
   public strictfp synchronized boolean method_2912(boolean var1) {
      if (this.field_3809) {
         throw new RuntimeException("networking already started");
      } else {
         this.method_2869();
         this.field_3809 = true;
         this.field_3810 = true;
         this.method_2928();
         class_236 var2 = class_236.method_1549();
         class_110 var4 = null;
         int var3;
         if (!var1) {
            var3 = class_107.method_935();
            if (var3 == -1) {
               throw new RuntimeException("playerId is -1 for server player");
            }
         } else {
            var4 = this.field_3890;
            var3 = this.field_3890.d;
         }

         if (var4 == null) {
            var4 = new class_110(var3);
            var4.j = this.field_3804;
            var2.field_1915 = var4;
         }

         this.field_3806 = var4;
         class_270.method_1881();
         this.field_3795 = var2.field_1937.networkPort;
         class_223.method_1462().method_1471();
         this.field_3869 = new class_438(this);

         try {
            this.field_3869.method_2749(false);
         } catch (IOException var8) {
            var8.printStackTrace();
            var2.method_1608("Could not open tcp port:" + this.field_3795 + ", check this port is not in use or change the port in the game settings", 1);
            this.method_2873("Could not open tcp port");
            return false;
         }

         this.field_3868 = new Thread(this.field_3869);
         this.field_3868.setDaemon(true);
         this.field_3868.start();
         boolean var5 = true;
         if (var5) {
            this.field_3871 = new class_438(this);

            try {
               this.field_3871.method_2749(true);
            } catch (IOException var7) {
               var7.printStackTrace();
               var2.method_1608("Could not open udp port:" + this.field_3795 + ", check this port is not in use or change the port in the game settings", 1);
               this.method_2873("Could not open udp port");
               return false;
            }

            this.field_3870 = new Thread(this.field_3871);
            this.field_3870.start();
         }

         this.field_3873 = new class_414(this);
         this.field_3872 = new Timer();
         this.field_3872.schedule(this.field_3873, 1000L, 1000L);
         this.method_2954();
         if (this.field_3799) {
            class_444.method_2838();
         }

         this.field_3886 = null;
         class_444.method_2835();
         this.method_2885("server started");
         return true;
      }
   }

   // $FF: renamed from: B () boolean
   public strictfp boolean method_2913() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1937.udpInMultiplayer;
   }

   // $FF: renamed from: a (java.lang.String, boolean, java.lang.Runnable) com.corrodinggames.rts.gameFramework.f.ac
   public strictfp class_437 method_2914(String var1, boolean var2, Runnable var3) {
      class_437 var4 = new class_437(var1, var2, var3);
      var4.method_2747();
      return var4;
   }

   // $FF: renamed from: b (java.lang.String, boolean) java.net.Socket
   public static strictfp Socket method_2915(String var0, boolean var1) {
      class_236 var2 = class_236.method_1549();
      boolean var3 = false;
      var0 = var0.trim();
      String[] var4 = var0.split(":");
      String var5 = var4[0];
      int var6 = 5123;
      if (var4.length > 1) {
         String var7 = var4[1];

         try {
            var6 = Integer.parseInt(var7);
         } catch (NumberFormatException var13) {
            String var9 = "Bad port number:" + var7;
            var13.printStackTrace();
            throw new IOException(var9);
         }
      }

      if (!var1 && var2.field_1944.method_2913()) {
         var3 = true;
      }

      short var8 = 7000;
      Object var16;
      if (!var3) {
         var16 = new Socket();
         class_236.method_1591("connecting to Server.. (tcp)");
      } else {
         var16 = new class_371();
         class_236.method_1591("connecting to Server.. (udp)");
         var8 = 5000;
      }

      ((Socket)var16).setTcpNoDelay(true);

      String var11;
      InetSocketAddress var17;
      try {
         var17 = new InetSocketAddress(InetAddress.getByName(var5), var6);
      } catch (IllegalArgumentException var12) {
         var11 = "Incorrect server format";
         class_236.method_1588("IllegalArgumentException.." + var11);
         var12.printStackTrace();
         throw new IllegalArgumentException(var11);
      }

      try {
         ((Socket)var16).connect(var17, var8);
         return (Socket)var16;
      } catch (UnknownHostException var14) {
         var11 = "Failed to connect to host";
         if (var3) {
            var11 = var11 + " (udp)";
         }

         class_236.method_1591("UnknownHostException.." + var11);
         var14.printStackTrace();
         throw new IOException(var11);
      } catch (IOException var15) {
         var11 = "Failed to connect to host";
         if (var3) {
            var11 = var11 + " (udp)";
         }

         class_236.method_1591("IOException.." + var11);
         var15.printStackTrace();
         throw new IOException(var11);
      }
   }

   // $FF: renamed from: a (java.net.Socket) boolean
   public strictfp synchronized boolean method_2916(Socket var1) {
      if (this.field_3809) {
         this.method_2873("starting new");
      }

      this.method_2869();
      class_236 var2 = class_236.method_1549();
      this.field_3795 = var1.getPort();
      this.field_3809 = true;
      this.field_3810 = false;
      this.method_2885("connected to Server..");
      class_458 var3 = new class_458(this, var1);
      var3.field_3932 = true;
      var3.method_2986();
      this.field_3877.add(var3);
      this.method_2931(var3);
      this.method_2954();
      this.field_3898 = var1;
      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) com.corrodinggames.rts.gameFramework.f.c
   public strictfp class_458 method_2917(class_107 var1) {
      Iterator var2 = this.field_3877.iterator();

      class_458 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_458)var2.next();
      } while(var3.field_3937 != var1);

      return var3;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.k) com.corrodinggames.rts.gameFramework.f.c
   public strictfp class_458 method_2918(class_107 var1) {
      Iterator var2 = this.field_3877.iterator();

      class_458 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_458)var2.next();
      } while(var3.field_3923 || var3.field_3937 != var1);

      return var3;
   }

   // $FF: renamed from: C () com.corrodinggames.rts.gameFramework.f.c
   public strictfp class_458 method_2919() {
      if (this.field_3810) {
         return null;
      } else {
         Iterator var1 = this.field_3877.iterator();

         class_458 var2;
         do {
            if (!var1.hasNext()) {
               return null;
            }

            var2 = (class_458)var1.next();
         } while(var2.field_3923);

         return var2;
      }
   }

   // $FF: renamed from: d (com.corrodinggames.rts.gameFramework.f.ah) void
   public strictfp void method_2920(class_413 var1) {
      if (!this.field_3809) {
         class_236.method_1591("Skipping sendPacketToAll, not networked");
      } else {
         this.method_2921(var1);
      }
   }

   // $FF: renamed from: g (com.corrodinggames.rts.gameFramework.f.ah) void
   private strictfp void method_2921(class_413 var1) {
      Iterator var2 = this.field_3877.iterator();

      while(var2.hasNext()) {
         class_458 var3 = (class_458)var2.next();
         if (var3.field_3932 && !var3.field_3923) {
            var3.method_2998(var1);
         }
      }

   }

   // $FF: renamed from: e (com.corrodinggames.rts.gameFramework.f.ah) void
   public strictfp void method_2922(class_413 var1) {
      if (!this.field_3809) {
         class_236.method_1591("Skipping sendPacketToServer, not networked");
      } else if (this.field_3810) {
         throw new RuntimeException("We are a server");
      } else {
         this.method_2920(var1);
      }
   }

   // $FF: renamed from: f (com.corrodinggames.rts.gameFramework.f.ah) void
   public strictfp void method_2923(class_413 var1) {
      if (!this.field_3809) {
         class_236.method_1591("Skipping sendPacketToClients, not networked");
      } else if (!this.field_3810) {
         throw new RuntimeException("We are not a server");
      } else {
         this.method_2920(var1);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, com.corrodinggames.rts.gameFramework.f.ah) void
   public strictfp void method_2924(class_458 var1, class_413 var2) {
      if (!this.field_3809) {
         class_236.method_1591("Skipping sendPacketOnConnection, not networked");
      } else {
         var1.method_2998(var2);
      }
   }

   // $FF: renamed from: D () void
   public strictfp void method_2925() {
      if (this.field_3810) {
         this.method_2885("registerConnection: We are a server");
      }

      Iterator var1 = this.field_3877.iterator();

      while(var1.hasNext()) {
         class_458 var2 = (class_458)var1.next();
         this.method_2933(var2);
      }

   }

   // $FF: renamed from: E () void
   public strictfp void method_2926() {
      class_236 var1 = class_236.method_1549();
      var1.field_1937.networkClientId = null;
      if (this.field_3822 == null) {
         class_236.method_1591("generateNewClientId: serverUUID==null");
         this.field_3822 = "x";
      }

      this.method_2927();
      var1.field_1937.save();
   }

   // $FF: renamed from: F () java.lang.String
   public strictfp String method_2927() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1937.networkClientId == null) {
         var1.field_1937.networkClientId = UUID.randomUUID().toString();
         var1.field_1937.save();
      }

      String var2 = var1.field_1937.networkClientId;
      if (this.field_3822 == null) {
         throw new RuntimeException("getOwnClientIdHashed: serverUUID==null");
      } else {
         String var3 = class_296.method_2062(var2 + this.field_3822);
         return var3;
      }
   }

   // $FF: renamed from: G () void
   public strictfp void method_2928() {
      class_236 var1 = class_236.method_1549();
      var1.field_1937.networkServerId = UUID.randomUUID().toString();
      var1.field_1937.save();
   }

   // $FF: renamed from: H () java.lang.String
   public strictfp String method_2929() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1937.networkServerId == null) {
         this.method_2928();
      }

      return var1.field_1937.networkServerId;
   }

   // $FF: renamed from: I () java.lang.String
   public strictfp String method_2930() {
      class_236 var1 = class_236.method_1549();
      return this.field_3810 ? var1.field_1937.networkServerId : this.field_3822;
   }

   // $FF: renamed from: e (com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp void method_2931(class_458 var1) {
      class_404 var2 = new class_404();

      try {
         byte var3 = 1;
         byte var4 = 1;
         if (class_236.method_1654()) {
            var4 = 2;
         }

         var2.method_2545("com.corrodinggames.rts");
         var2.method_2541(var3);
         var2.method_2541(this.field_3788);
         var2.method_2541(var4);
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      this.method_2924(var1, var2.method_2535(160));
   }

   // $FF: renamed from: f (com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp void method_2932(class_458 var1) {
      class_404 var2 = new class_404();

      try {
         class_236 var3 = class_236.method_1549();
         var2.method_2545("com.corrodinggames.rts");
         var2.method_2541(1);
         var2.method_2541(this.field_3788);
         var2.method_2541(var3.method_1561(true));
         var2.method_2545(var3.method_1564());
         var2.method_2545(this.method_2929());
         var2.method_2541(var1.field_3950);
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }

      this.method_2924(var1, var2.method_2535(161));
   }

   // $FF: renamed from: g (com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp void method_2933(class_458 var1) {
      class_404 var2 = new class_404();

      try {
         var2.method_2545("com.corrodinggames.rts");
         var2.method_2541(4);
         var2.method_2541(this.field_3788);
         class_236 var3 = class_236.method_1549();
         var2.method_2541(var3.method_1561(true));
         var2.method_2545(this.field_3804);
         String var4 = null;
         if (this.field_3796 != null) {
            var4 = class_296.method_2062(this.field_3796);
         }

         var2.method_2544(var4);
         var2.method_2545(var3.method_1564());
         var2.method_2545(this.method_2927());
         var2.method_2541(var3.method_1650());
         var2.method_2545(this.method_2934(this.field_3823));
      } catch (IOException var5) {
         throw new RuntimeException(var5);
      }

      this.method_2924(var1, var2.method_2535(110));
      this.field_3899 = true;
   }

   // $FF: renamed from: f (int) java.lang.String
   public strictfp String method_2934(int var1) {
      String var2 = "";
      var2 = var2 + "c:" + var1;
      var2 = var2 + "m:" + (var1 * 87 + 24);
      var2 = var2 + "0:" + this.method_2864(0) * 11 * var1;
      var2 = var2 + "1:" + (this.method_2864(1) * 12 + var1);
      var2 = var2 + "2:" + this.method_2864(2) * 13 * var1;
      var2 = var2 + "3:" + (this.method_2864(3) * 14 + var1);
      var2 = var2 + "4:" + this.method_2864(4) * 15 * var1;
      var2 = var2 + "5:" + (this.method_2864(5) * 16 + var1);
      var2 = var2 + "6:" + this.method_2864(6) * 17 * var1;
      var2 = var2 + "t1:" + class_107.field_1226.field_1229 * 11 * var1;
      int var3 = 5 * var1;
      if (this.method_2863() != this.method_2864(this.field_3863.field_3777)) {
         var3 = 7 * var1;
      }

      var2 = var2 + "d:" + var3;
      return var2;
   }

   // $FF: renamed from: J () void
   public strictfp void method_2935() {
      if (this.field_3810) {
         throw new RuntimeException("We are a server");
      } else {
         class_236 var1 = class_236.method_1549();
         class_404 var2 = new class_404();

         try {
            var2.method_2540(this.field_3805);
            var2.method_2540(var1.field_1914);
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }

         this.method_2922(var2.method_2535(112));
      }
   }

   // $FF: renamed from: f (java.lang.String) void
   public strictfp void method_2936(String var1) {
      if (!this.field_3810) {
         this.method_2885("cannot send sendSystemMessage:" + var1 + ", we are not a server");
      } else {
         class_236.method_1591("sendSystemMessage:" + var1);
         this.method_2939((class_458)null, (class_107)null, (String)null, var1);
      }
   }

   // $FF: renamed from: g (java.lang.String) void
   public strictfp void method_2937(String var1) {
      this.method_2938(var1);
   }

   // $FF: renamed from: h (java.lang.String) void
   public strictfp void method_2938(String var1) {
      if (!this.field_3809) {
         class_236.method_1591("sendChatMessage: not networked:" + var1);
         this.method_2943((class_458)null, -1, (String)null, var1);
      } else if (this.field_3810) {
         this.method_2939((class_458)null, this.field_3806, this.field_3804, var1);
         this.method_2972((class_458)null, this.field_3806, this.field_3804, var1);
      } else {
         try {
            class_404 var2 = new class_404();
            var2.method_2545(var1);
            var2.method_2539(0);
            this.method_2922(var2.method_2535(140));
         } catch (IOException var3) {
            throw new RuntimeException(var3);
         }
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, com.corrodinggames.rts.game.k, java.lang.String, java.lang.String) void
   public strictfp void method_2939(class_458 var1, class_107 var2, String var3, String var4) {
      this.method_2940(var1, var2, var3, var4, (class_458)null);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, com.corrodinggames.rts.game.k, java.lang.String, java.lang.String, com.corrodinggames.rts.gameFramework.f.c) void
   public strictfp void method_2940(class_458 var1, class_107 var2, String var3, String var4, class_458 var5) {
      try {
         boolean var6 = false;
         boolean var7 = false;
         if (var2 != null && "t".equalsIgnoreCase(method_2941(var4))) {
            var6 = true;
            var4 = var4.substring("-t".length());
            var4 = "[TEAM] " + var4;
         }

         if (var2 != null && "i".equalsIgnoreCase(method_2941(var4))) {
            var7 = true;
            var4 = var4.substring("-i".length());
            var4 = "[INFO] " + var4;
         }

         class_404 var8 = new class_404();
         var8.method_2545(var4);
         var8.method_2539(3);
         var8.method_2544(var3);
         var8.method_2555(var1);
         int var9 = -1;
         if (var2 != null) {
            var9 = var2.field_1227;
         }

         var8.method_2541(var9);
         class_413 var10 = var8.method_2535(141);
         if (var6) {
            Iterator var11 = this.field_3877.iterator();

            while(var11.hasNext()) {
               class_458 var12 = (class_458)var11.next();
               if (var12.field_3932 && !var12.field_3923) {
                  class_110 var13 = var12.field_3937;
                  if (var13 != null && var13.d(var2)) {
                     var12.method_2998(var10);
                  }
               }
            }

            class_107 var15 = this.field_3806;
            if (var15 != null && var15.method_944(var2)) {
               this.method_2943(var1, var9, var3, var4);
            }
         } else if (var7) {
            class_236.method_1588("info message:" + method_2942(var3, var4));
         } else {
            if (var5 != null) {
               this.method_2924(var5, var10);
            } else {
               this.method_2923(var10);
            }

            this.method_2943(var1, var9, var3, var4);
         }

      } catch (IOException var14) {
         throw new RuntimeException(var14);
      }
   }

   // $FF: renamed from: i (java.lang.String) java.lang.String
   public static strictfp String method_2941(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String var1 = var0.trim();
         if ((var1.startsWith("-") || var1.startsWith(".") || var1.startsWith("_")) && var1.length() >= 2) {
            String var2 = var1.substring(1).trim();
            int var3 = var2.indexOf(" ");
            if (var3 == -1) {
               var3 = var2.length();
            }

            return var2.substring(0, var3).toLowerCase(Locale.ENGLISH);
         } else {
            return null;
         }
      }
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String) java.lang.String
   public static strictfp String method_2942(String var0, String var1) {
      return var0 != null ? var0 + ": " + var1 : var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, int, java.lang.String, java.lang.String) void
   private strictfp void method_2943(class_458 var1, int var2, String var3, String var4) {
      if (this.field_3809 || !var4.startsWith("-i ")) {
         if (var3 != null) {
            this.method_2953("New Message", var3 + ": " + var4);
         }

         class_458 var5 = null;
         if (this.field_3810) {
            var5 = var1;
         }

         this.field_3867.method_2974(var2, var3, var4, var5);
         this.field_3787.method_1491(var2, var3, var4, var1);
         boolean var6 = false;
         if (this.field_3887) {
            var6 = true;
         }

         if (!this.field_3809) {
            var6 = true;
         }

         if (var6) {
            method_2890(var3, var4);
         } else {
            String var7 = method_2942(var3, var4);
            if (!class_236.field_1899) {
               class_270.method_1879(var7);
            }
         }

      }
   }

   // $FF: renamed from: a (boolean, boolean, boolean) void
   public strictfp void method_2944(boolean var1, boolean var2, boolean var3) {
      class_236 var4 = class_236.method_1549();

      try {
         class_404 var5 = new class_404();
         var5.method_2539(0);
         var5.method_2541(var4.field_1920);
         var5.method_2541(var4.field_1921);
         var5.method_2542(this.field_3815);
         var5.method_2542(1.0F);
         var5.method_2540(var1);
         var5.method_2540(var2);
         var5.method_2565("gameSave");
         var4.field_1947.method_1989(var5);
         var5.method_2567("gameSave");
         if (var1) {
         }

         class_413 var6 = var5.method_2535(35);
         this.method_2920(var6);
         if (var3) {
            if (!this.field_3810) {
               throw new RuntimeException("sendResyncSave: reloadCreatedSave: We are not a server");
            }

            var6.field_3410 = this.field_3876;
            this.method_2900(var6);
         }

      } catch (IOException var7) {
         throw new RuntimeException(var7);
      }
   }

   // $FF: renamed from: K () void
   public strictfp void method_2945() {
      this.method_2909();
      this.method_2904();
      this.method_2946((class_458)null, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, boolean) void
   public strictfp void method_2946(class_458 var1, boolean var2) {
      if (!this.field_3810) {
         throw new RuntimeException("We are not a server");
      } else {
         class_236 var3 = class_236.method_1549();

         try {
            class_404 var4 = new class_404();
            var4.method_2539(0);
            var4.method_2553(this.field_3863.field_3775);
            if (this.field_3863.field_3775 == class_396.field_3239) {
               var3.field_1947.method_1992(this.field_3863.field_3776, var4);
            } else if (this.field_3863.field_3775 == class_396.field_3238) {
               class_408.method_2589(this.field_3864, var4);
            } else {
               var4.method_2545(this.field_3864);
            }

            var4.method_2540(var2);
            class_413 var5 = var4.method_2535(120);
            if (var1 == null) {
               this.method_2923(var5);
            } else {
               this.method_2924(var1, var5);
            }
         } catch (IOException var6) {
            throw new RuntimeException(var6);
         }

         if (!this.field_3887) {
            this.method_2947();
         }

      }
   }

   // $FF: renamed from: aa () void
   private strictfp void method_2947() {
      this.field_3887 = true;
      class_236.method_1591("Starting new network game (" + this.method_2930() + ")");
      if (this.field_3799 && this.field_3810) {
         class_444.method_2839();
      }

      if (!class_236.field_1899) {
         class_270.method_1883();
      }

      this.field_3787.method_1499();
   }

   // $FF: renamed from: L () java.lang.String
   public strictfp String method_2948() {
      ArrayList var1 = this.method_2950();
      return var1 != null && var1.size() != 0 ? (String)var1.get(0) : null;
   }

   // $FF: renamed from: M () java.lang.String
   public strictfp String method_2949() {
      ArrayList var1 = this.method_2950();
      if (var1 != null && var1.size() != 0) {
         String var2 = "";
         boolean var3 = true;

         String var5;
         for(Iterator var4 = var1.iterator(); var4.hasNext(); var2 = var2 + var5) {
            var5 = (String)var4.next();
            if (var3) {
               var3 = false;
            } else {
               var2 = var2 + ", ";
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   // $FF: renamed from: N () java.util.ArrayList
   public strictfp ArrayList method_2950() {
      ArrayList var1 = this.method_2951(true);
      return var1 != null && var1.size() > 0 ? var1 : this.method_2951(false);
   }

   // $FF: renamed from: d (boolean) java.util.ArrayList
   public strictfp ArrayList method_2951(boolean var1) {
      ArrayList var2 = new ArrayList();

      try {
         Enumeration var3 = NetworkInterface.getNetworkInterfaces();

         while(var3.hasMoreElements()) {
            NetworkInterface var4 = (NetworkInterface)var3.nextElement();
            Enumeration var5 = var4.getInetAddresses();

            while(var5.hasMoreElements()) {
               InetAddress var6 = (InetAddress)var5.nextElement();
               if (!var6.isLoopbackAddress()) {
                  String var7 = var6.getHostAddress().toString();
                  if (!var7.contains("%")) {
                     if (!var1) {
                        var2.add(var7);
                     } else if (var7.contains(".")) {
                        var2.add(var7);
                     }
                  }
               }
            }
         }
      } catch (SocketException var8) {
         Log.method_1712("RustedWarfare", var8.toString());
      }

      return var2;
   }

   // $FF: renamed from: O () java.net.InetAddress
   strictfp InetAddress method_2952() {
      try {
         class_236 var1 = class_236.method_1549();
         WifiManager var2 = (WifiManager)var1.field_1880.method_1862("wifi");
         DhcpInfo var3 = var2.getDhcpInfo();
         int var4 = var3.ipAddress & var3.netmask | ~var3.netmask;
         byte[] var5 = new byte[4];

         for(int var6 = 0; var6 < 4; ++var6) {
            var5[var6] = (byte)(var4 >> var6 * 8 & 255);
         }

         return InetAddress.getByAddress(var5);
      } catch (UnknownHostException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   // $FF: renamed from: d (java.lang.String, java.lang.String) void
   public strictfp void method_2953(String var1, String var2) {
      if (!class_236.field_1899) {
         class_236 var3 = class_236.method_1549();
         if (!this.field_3811 && !var3.field_1948.method_2658()) {
            if (class_270.method_1878()) {
               this.method_2956(2);
            } else {
               NotificationManager var4 = (NotificationManager)var3.field_1880.method_1862("notification");
               Notification var5 = new Notification(R$drawable.icon, var1 + ": " + var2, System.currentTimeMillis());
               Intent var6 = new Intent(var3.field_1880, a.class);
               PendingIntent var7 = PendingIntent.getActivity(var3.field_1880, 0, var6, 2);
               var5.flags += 16;
               var5.setLatestEventInfo(var3.field_1880, "Rusted Warfare", var1 + ": " + var2, var7);
               var4.notify(2, var5);
            }
         }
      }
   }

   // $FF: renamed from: P () void
   public strictfp void method_2954() {
      if (this.field_3809) {
         this.method_2955();
      } else {
         this.method_2956(1);
      }

   }

   // $FF: renamed from: ab () void
   private strictfp void method_2955() {
      if (!class_236.field_1899) {
         class_236 var1 = class_236.method_1549();
         NotificationManager var2 = (NotificationManager)var1.field_1880.method_1862("notification");
         Notification var3 = new Notification(R$drawable.icon, "Multiplayer game running", System.currentTimeMillis());
         Intent var4 = new Intent(var1.field_1880, a.class);
         PendingIntent var5 = PendingIntent.getActivity(var1.field_1880, 0, var4, 2);
         var3.flags = 2;
         var3.setLatestEventInfo(var1.field_1880, "Rusted Warfare", "A multiplayer game is in progress", var5);
         var2.notify(1, var3);
      }
   }

   // $FF: renamed from: g (int) void
   private strictfp void method_2956(int var1) {
      if (!class_236.field_1899) {
         class_236 var2 = class_236.method_1549();
         NotificationManager var3 = (NotificationManager)var2.field_1880.method_1862("notification");
         var3.cancel(var1);
      }
   }

   // $FF: renamed from: Q () int
   public strictfp int method_2957() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         class_107 var3 = class_107.method_954(var2);
         if (var3 != null && !var3.field_1234) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: renamed from: R () int
   public strictfp int method_2958() {
      int var1 = 0;

      for(int var2 = 0; var2 < 10; ++var2) {
         class_107 var3 = class_107.method_954(var2);
         if (var3 != null) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.k) void
   public strictfp void method_2959(class_107 var1) {
      if (var1 instanceof class_112) {
         var1.method_936();
      } else {
         if (this.field_3806 == var1) {
            class_236.method_1592("kickTeamAndAttachedPlayer", "Cannot kick self");
            return;
         }

         class_458 var2 = this.method_2917(var1);
         if (var2 == null) {
            method_2887("Kick player: cannot find connection for team");
         } else {
            this.method_2906(var2, "Kicked by host");
            var2.method_2989("Kicked by host");
         }

         var1.method_936();
      }

      this.method_2910((class_458)null);
      class_270.method_1881();
   }

   // $FF: renamed from: S () void
   public strictfp void method_2960() {
      class_236 var1 = class_236.method_1549();
      if (!this.field_3810) {
         class_236.method_1592("addAIToGame", "We are not a server");
      } else {
         int var2 = class_107.method_935();
         if (var2 == -1) {
            var1.method_1608("No free slots for AI", 1);
         }

         class_112 var3 = new class_112(var2);
         var3.j = "AI";
         var3.h = var2 % 2;
         var3.l = this.field_3863.field_3780;
         this.method_2961();
         var1.field_1944.method_2910((class_458)null);
         class_270.method_1881();
      }
   }

   // $FF: renamed from: T () boolean
   public strictfp boolean method_2961() {
      if (!this.field_3810 && this.field_3809) {
         class_236.method_1592("updateNamesOfAI", "We are not a server");
         return false;
      } else {
         boolean var1 = false;

         for(int var2 = 0; var2 < 10; ++var2) {
            class_107 var3 = class_107.method_954(var2);
            if (var3 != null && var3.field_1234) {
               String var4 = "AI - " + this.method_2857(var3.method_929());
               if (!var4.equals(var3.field_1233)) {
                  var3.field_1233 = var4;
                  var1 = true;
               }
            }
         }

         return var1;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k, int) void
   public strictfp void method_2962(class_107 var1, int var2) {
      if (var1.field_1227 != var2) {
         int var3 = var1.field_1227;
         int var4 = var1.field_1231;
         class_107 var5 = class_107.method_954(var2);
         var1.method_937(var2);
         if (var5 != null) {
            var5.method_937(var3);
            var5.field_1231 = var4;
         }
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.k, int) void
   public strictfp void method_2963(class_107 var1, int var2) {
      this.method_2937("-move " + (var1.field_1227 + 1) + " " + (var2 + 1));
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.k, int) void
   public strictfp void method_2964(class_107 var1, int var2) {
      this.method_2937("-team " + (var1.field_1227 + 1) + " " + (var2 + 1));
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.k) void
   public strictfp void method_2965(class_107 var1) {
      class_236 var2 = class_236.method_1549();
      String var3 = var1.field_1233;
      if (var3 == null) {
         var3 = "Player - " + (var1.field_1227 + 1) + "";
      }

      String var4 = var3 + " was defeated";
      if (!var2.method_1578() && var2.field_1920 < 60) {
         class_236.method_1591("Not showing defeated message: " + var4);
      } else {
         this.method_2936(var4);
      }
   }

   // $FF: renamed from: e (com.corrodinggames.rts.game.k) void
   public strictfp void method_2966(class_107 var1) {
      class_236 var2 = class_236.method_1549();
      String var3 = var1.field_1233;
      if (var3 == null) {
         var3 = "Player - " + (var1.field_1227 + 1) + "";
      }

      String var4 = var3 + " has been wiped out";
      if (!var2.method_1578() && var2.field_1920 < 60) {
         class_236.method_1591("Not showing defeated message: " + var4);
      } else {
         this.method_2936(var4);
      }
   }

   // $FF: renamed from: U () void
   public strictfp synchronized void method_2967() {
      if (this.field_3900 != null) {
         this.field_3900.cancel();
         this.field_3900 = null;
      }

   }

   // $FF: renamed from: V () void
   public strictfp synchronized void method_2968() {
      if (this.field_3799 && this.field_3810 && this.field_3900 == null) {
         this.field_3900 = new Timer();
         x$1 var1 = new x$1(this);
         this.field_3900.schedule(var1, 60000L, 60000L);
      }

   }

   // $FF: renamed from: W () java.lang.String
   public strictfp String method_2969() {
      class_236 var1 = class_236.method_1549();
      String var2 = "";
      if (var1.field_1944.field_3810 && !var1.field_1944.field_3811) {
         String var3 = var1.field_1944.method_2949();
         if (var3 != null) {
            String var4 = "Your local IP address is: " + var3 + " using port: " + var1.field_1944.field_3795;
            if (var1.field_1944.field_3886 != null) {
               if (!var1.field_1944.field_3886) {
                  var4 = var4 + "\nUnable to get a public IP address, check your internet connection";
               } else if (var1.field_1944.field_3884 != null) {
                  if (class_236.method_1654()) {
                     if (var1.field_1944.field_3885 != null) {
                        var4 = var4 + "\nYour public address is " + (var1.field_1944.field_3885 ? "<Open>" : "<CLOSED>") + " to the internet";
                     }
                  } else {
                     var4 = var4 + "\nYour public IP address is:" + var1.field_1944.field_3884;
                     if (var1.field_1944.field_3885 != null) {
                        var4 = var4 + " and is " + (var1.field_1944.field_3885 ? "<Open>" : "<CLOSED>") + " to the internet";
                     }
                  }
               }
            } else {
               var4 = var4 + "\nRetrieving your public IP...";
            }

            var2 = var2 + var4;
         } else {
            var2 = var2 + "You do not have a network connection";
         }
      }

      if (var1.method_1579()) {
         if (this.field_3798) {
            var2 = var2 + "\nSandBox Mode!\nPlace any unit, Control all teams, Special powers";
         } else {
            var2 = var2 + "\nLocal skirmish";
         }
      }

      if (!var1.field_1944.field_3810 || class_236.method_1654()) {
         if (var2.length() != 0) {
            var2 = var2 + "\n\n";
         }

         if (var1.field_1944.field_3860 || var1.field_1944.field_3810) {
            if (var1.field_1944.field_3863.field_3775 != null) {
               var2 = var2 + "Game Mode: " + var1.field_1944.field_3863.field_3775.method_2506();
            }

            if (var1.field_1944.field_3863.field_3776 != null) {
               var2 = var2 + "\nMap: " + class_271.method_1887(var1.field_1944.field_3863.field_3776);
            }

            var2 = var2 + "\nStarting Credits: " + var1.field_1944.method_2862();
            var2 = var2 + "\nFog: " + var1.field_1944.method_2854();
            var2 = var2 + "\nAI Difficulty: " + var1.field_1944.method_2856();
            if (var1.field_1944.field_3863.field_3781 != 1) {
               var2 = var2 + "\nStarting Units: " + var1.field_1944.method_2859();
            }

            if (var1.field_1944.field_3863.field_3782 != 1.0F) {
               var2 = var2 + "\n" + (int)var1.field_1944.field_3863.field_3782 + "X income";
            }

            if (var1.field_1944.field_3863.field_3783) {
               var2 = var2 + "\nNo nukes";
            }

            if (var1.field_1944.field_3863.field_3785) {
               var2 = var2 + "\nShared control: On";
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: X () java.lang.String
   public strictfp String method_2970() {
      class_236 var1 = class_236.method_1549();
      if (var1.field_1944.field_3863.field_3776 == null) {
         return null;
      } else if (var1.field_1944.field_3863.field_3775 == null) {
         return null;
      } else if (var1.field_1944.field_3863.field_3775 == class_396.field_3237) {
         return "maps/skirmish/" + var1.field_1944.field_3863.field_3776;
      } else if (var1.field_1944.field_3863.field_3775 == class_396.field_3238) {
         return "/SD/rusted_warfare_maps/" + var1.field_1944.field_3863.field_3776;
      } else {
         class_236.method_1591("getNetworkMapPath: unhandled type:" + var1.field_1944.field_3863.field_3775);
         return null;
      }
   }

   // $FF: renamed from: Y () boolean
   public strictfp boolean method_2971() {
      return this.field_3810 || this.field_3813;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.gameFramework.f.c, com.corrodinggames.rts.game.k, java.lang.String, java.lang.String) void
   public strictfp void method_2972(class_458 var1, class_107 var2, String var3, String var4) {
      String var5 = null;
      String var6 = "";
      String[] var7 = new String[0];
      String var8 = var4.trim();
      if ((var8.startsWith("-") || var8.startsWith(".") || var8.startsWith("_")) && var8.length() >= 2) {
         String var9 = var8.substring(1).trim();
         int var10 = var9.indexOf(" ");
         if (var10 == -1) {
            var10 = var9.length();
         }

         var5 = var9.substring(0, var10).toLowerCase(Locale.ENGLISH);
         if (var10 != -1 && var9.length() >= var10 + 1) {
            var6 = var9.substring(var10 + 1);
            var7 = var6.split(" ");
         }
      }

      if ("share".equals(var5)) {
         if (var2 == null) {
            this.method_2936("[Could not find player]");
         } else if (!this.field_3863.field_3785) {
            this.method_2936("[Shared control is not enabled in this game]");
         } else if (!"true".equalsIgnoreCase(var6) && !"on".equalsIgnoreCase(var6)) {
            if (!"false".equalsIgnoreCase(var6) && !"off".equalsIgnoreCase(var6)) {
               this.method_2936("[Expected true or false]");
            } else {
               if (var2.field_1238) {
                  var2.field_1238 = false;
                  this.method_2936("[shared control now off for " + var3 + "]");
               } else {
                  this.method_2936("[shared control already off for " + var3 + "]");
               }

            }
         } else {
            if (!var2.field_1238) {
               var2.field_1238 = true;
               this.method_2936("[shared control now on for " + var3 + "]");
            } else {
               this.method_2936("[shared control already on for " + var3 + "]");
            }

         }
      }
   }
}
