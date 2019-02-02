package com.corrodinggames.rts.game.units.custom;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.class_246;
import com.corrodinggames.rts.game.b.class_408;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_280;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.game.units.class_513;
import com.corrodinggames.rts.game.units.a.class_121;
import com.corrodinggames.rts.game.units.a.class_128;
import com.corrodinggames.rts.game.units.a.class_129;
import com.corrodinggames.rts.game.units.a.class_130;
import com.corrodinggames.rts.game.units.a.class_131;
import com.corrodinggames.rts.game.units.a.class_133;
import com.corrodinggames.rts.game.units.a.class_135;
import com.corrodinggames.rts.game.units.a.class_516;
import com.corrodinggames.rts.game.units.a.class_518;
import com.corrodinggames.rts.game.units.a.m;
import com.corrodinggames.rts.game.units.b.class_73;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.d.class_47;
import com.corrodinggames.rts.game.units.e.class_79;
import com.corrodinggames.rts.game.units.e.class_84;
import com.corrodinggames.rts.game.units.e.class_87;
import com.corrodinggames.rts.game.units.e.class_88;
import com.corrodinggames.rts.game.units.e.class_91;
import com.corrodinggames.rts.game.units.f.class_67;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_305;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.a.class_299;
import com.corrodinggames.rts.gameFramework.d.class_432;
import com.corrodinggames.rts.gameFramework.e.class_215;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import com.corrodinggames.rts.gameFramework.h.class_306;
import com.corrodinggames.rts.gameFramework.utility.class_196;
import com.corrodinggames.rts.gameFramework.utility.class_210;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.g
public final class class_479 implements class_24 {
   // $FF: renamed from: a int
   public int field_4166 = 1;
   // $FF: renamed from: b int
   public int field_4167 = -1;
   // $FF: renamed from: c int
   public int field_4168 = -1;
   // $FF: renamed from: d boolean
   public boolean field_4169;
   // $FF: renamed from: e com.corrodinggames.rts.game.l
   public class_246 field_4170;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_4171 = null;
   // $FF: renamed from: g int
   public int field_4172;
   // $FF: renamed from: h int
   public int field_4173;
   // $FF: renamed from: i int
   public int field_4174;
   // $FF: renamed from: j int
   public int field_4175;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_4176 = null;
   // $FF: renamed from: l com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_4177 = null;
   // $FF: renamed from: m com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_4178 = null;
   // $FF: renamed from: n com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_4179 = null;
   // $FF: renamed from: o com.corrodinggames.rts.gameFramework.h.e[]
   public class_306[] field_4180 = new class_306[10];
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.h.e[]
   public class_306[] field_4181;
   // $FF: renamed from: q com.corrodinggames.rts.gameFramework.h.e[]
   public class_306[] field_4182 = null;
   // $FF: renamed from: r com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_4183 = null;
   // $FF: renamed from: s boolean
   public boolean field_4184;
   // $FF: renamed from: t com.corrodinggames.rts.game.units.custom.g
   public static class_479 field_4185;
   // $FF: renamed from: u java.util.ArrayList
   public static ArrayList field_4186 = new ArrayList();
   // $FF: renamed from: v java.util.ArrayList
   public static ArrayList field_4187 = new ArrayList();
   // $FF: renamed from: w java.util.ArrayList
   public static ArrayList field_4188 = null;
   // $FF: renamed from: x java.util.HashMap
   public static HashMap field_4189 = new HashMap();
   // $FF: renamed from: y java.util.ArrayList
   public static ArrayList field_4190 = new ArrayList();
   // $FF: renamed from: z com.corrodinggames.rts.gameFramework.e.b
   static class_215 field_4191 = null;
   // $FF: renamed from: A int
   static int field_4192;
   // $FF: renamed from: B int
   static int field_4193;
   // $FF: renamed from: C com.corrodinggames.rts.gameFramework.e.b
   static class_215 field_4194;
   // $FF: renamed from: D boolean
   static boolean field_4195;
   // $FF: renamed from: E java.lang.String
   static String field_4196 = null;
   // $FF: renamed from: F java.util.HashMap
   public static HashMap field_4197 = new HashMap();
   // $FF: renamed from: G java.util.HashMap
   public static HashMap field_4198 = new HashMap();
   // $FF: renamed from: H int
   static int field_4199;
   // $FF: renamed from: I int
   static int field_4200;
   // $FF: renamed from: J boolean
   static boolean field_4201;
   // $FF: renamed from: K java.util.ArrayList
   public ArrayList field_4202 = new ArrayList();
   // $FF: renamed from: L java.util.ArrayList
   public ArrayList field_4203 = new ArrayList();
   // $FF: renamed from: M java.lang.String
   public String field_4204;
   // $FF: renamed from: N int
   public int field_4205;
   // $FF: renamed from: O boolean
   public boolean field_4206 = true;
   // $FF: renamed from: P java.util.ArrayList
   public ArrayList field_4207 = new ArrayList();
   // $FF: renamed from: Q com.corrodinggames.rts.game.units.custom.d
   public class_478 field_4208;
   // $FF: renamed from: R java.lang.String
   public String field_4209;
   // $FF: renamed from: S long
   public long field_4210;
   // $FF: renamed from: T java.lang.String
   public String field_4211;
   // $FF: renamed from: U java.lang.String
   public String field_4212;
   // $FF: renamed from: V com.corrodinggames.rts.gameFramework.e.b
   public class_215 field_4213;
   // $FF: renamed from: W com.corrodinggames.rts.game.units.custom.ac
   public class_355 field_4214;
   // $FF: renamed from: X com.corrodinggames.rts.game.units.custom.ac
   public class_355 field_4215;
   // $FF: renamed from: Y java.lang.String
   public String field_4216;
   // $FF: renamed from: Z boolean
   public boolean field_4217;
   // $FF: renamed from: aa float
   public float field_4218 = 1.0F;
   // $FF: renamed from: ab boolean
   public boolean field_4219;
   // $FF: renamed from: ac boolean
   public boolean field_4220;
   // $FF: renamed from: ad boolean
   public boolean field_4221;
   // $FF: renamed from: ae boolean
   public boolean field_4222;
   // $FF: renamed from: af boolean
   public boolean field_4223;
   // $FF: renamed from: ag boolean
   public boolean field_4224;
   // $FF: renamed from: ah java.util.ArrayList
   public ArrayList field_4225 = new ArrayList();
   // $FF: renamed from: ai int
   public int field_4226;
   // $FF: renamed from: aj float
   public float field_4227;
   // $FF: renamed from: ak float
   public float field_4228;
   // $FF: renamed from: al float
   public float field_4229;
   // $FF: renamed from: am boolean
   public boolean field_4230;
   // $FF: renamed from: an float
   public float field_4231;
   // $FF: renamed from: ao float
   public float field_4232;
   // $FF: renamed from: ap boolean
   public boolean field_4233;
   // $FF: renamed from: aq boolean
   public boolean field_4234;
   // $FF: renamed from: ar boolean
   public boolean field_4235;
   // $FF: renamed from: as int
   public int field_4236;
   // $FF: renamed from: at boolean
   public boolean field_4237;
   // $FF: renamed from: au float
   public float field_4238;
   // $FF: renamed from: av float
   public float field_4239;
   // $FF: renamed from: aw int
   public int field_4240;
   // $FF: renamed from: ax boolean
   public boolean field_4241;
   // $FF: renamed from: ay boolean
   public boolean field_4242;
   // $FF: renamed from: az boolean
   public boolean field_4243;
   // $FF: renamed from: aA com.corrodinggames.rts.game.units.custom.u
   public class_493 field_4244;
   // $FF: renamed from: aB com.corrodinggames.rts.game.units.custom.u
   public class_493 field_4245;
   // $FF: renamed from: aC int
   public int field_4246 = -1;
   // $FF: renamed from: aD com.corrodinggames.rts.game.units.custom.ak
   public class_364 field_4247;
   // $FF: renamed from: aE boolean
   public boolean field_4248;
   // $FF: renamed from: aF boolean
   public boolean field_4249;
   // $FF: renamed from: aG boolean
   public boolean field_4250;
   // $FF: renamed from: aH float
   public float field_4251 = 1.0F;
   // $FF: renamed from: aI float
   public float field_4252 = 1.0F;
   // $FF: renamed from: aJ boolean
   boolean field_4253;
   // $FF: renamed from: aK boolean
   boolean field_4254;
   // $FF: renamed from: aL boolean
   boolean field_4255;
   // $FF: renamed from: aM boolean
   boolean field_4256;
   // $FF: renamed from: aN boolean
   boolean field_4257;
   // $FF: renamed from: aO com.corrodinggames.rts.game.units.custom.u
   class_493 field_4258;
   // $FF: renamed from: aP com.corrodinggames.rts.game.units.custom.u
   class_493 field_4259;
   // $FF: renamed from: aQ boolean
   boolean field_4260;
   // $FF: renamed from: aR float
   float field_4261;
   // $FF: renamed from: aS boolean
   boolean field_4262;
   // $FF: renamed from: aT float
   float field_4263;
   // $FF: renamed from: aU com.corrodinggames.rts.game.units.custom.u
   class_493 field_4264;
   // $FF: renamed from: aV com.corrodinggames.rts.game.units.custom.u
   class_493 field_4265;
   // $FF: renamed from: aW int
   public int field_4266;
   // $FF: renamed from: aX boolean
   public boolean field_4267;
   // $FF: renamed from: aY boolean
   public boolean field_4268;
   // $FF: renamed from: aZ boolean
   public boolean field_4269;
   // $FF: renamed from: ba int
   public int field_4270;
   // $FF: renamed from: bb float
   public float field_4271 = 0.001F;
   // $FF: renamed from: bc int
   public int field_4272;
   // $FF: renamed from: bd boolean
   public boolean field_4273;
   // $FF: renamed from: be int
   public int field_4274;
   // $FF: renamed from: bf int
   public int field_4275;
   // $FF: renamed from: bg boolean
   public boolean field_4276;
   // $FF: renamed from: bh boolean
   public boolean field_4277;
   // $FF: renamed from: bi float
   public float field_4278;
   // $FF: renamed from: bj int
   public int field_4279 = -2;
   // $FF: renamed from: bk float
   public float field_4280;
   // $FF: renamed from: bl float
   public float field_4281;
   // $FF: renamed from: bm int
   public int field_4282;
   // $FF: renamed from: bn int
   public int field_4283;
   // $FF: renamed from: bo boolean
   public boolean field_4284;
   // $FF: renamed from: bp float
   public float field_4285;
   // $FF: renamed from: bq float
   public float field_4286;
   // $FF: renamed from: br float
   public float field_4287;
   // $FF: renamed from: bs float
   public float field_4288;
   // $FF: renamed from: bt boolean
   public boolean field_4289;
   // $FF: renamed from: bu float
   public float field_4290;
   // $FF: renamed from: bv boolean
   public boolean field_4291;
   // $FF: renamed from: bw float
   public float field_4292;
   // $FF: renamed from: bx com.corrodinggames.rts.game.units.custom.ac
   public class_355 field_4293;
   // $FF: renamed from: by boolean
   public boolean field_4294;
   // $FF: renamed from: bz float
   public float field_4295;
   // $FF: renamed from: bA int
   public int field_4296;
   // $FF: renamed from: bB android.graphics.Rect
   public Rect field_4297 = new Rect();
   // $FF: renamed from: bC android.graphics.Rect
   public Rect field_4298 = new Rect();
   // $FF: renamed from: bD float
   public float field_4299;
   // $FF: renamed from: bE float
   public float field_4300;
   // $FF: renamed from: bF boolean
   public boolean field_4301;
   // $FF: renamed from: bG int
   public int field_4302;
   // $FF: renamed from: bH int
   public int field_4303;
   // $FF: renamed from: bI int
   public int field_4304;
   // $FF: renamed from: bJ int
   public int field_4305;
   // $FF: renamed from: bK float
   public float field_4306;
   // $FF: renamed from: bL float
   public float field_4307;
   // $FF: renamed from: bM java.lang.Float
   public Float field_4308;
   // $FF: renamed from: bN float
   public float field_4309;
   // $FF: renamed from: bO java.lang.Float
   public Float field_4310;
   // $FF: renamed from: bP com.corrodinggames.rts.game.units.custom.ag
   public class_359 field_4311;
   // $FF: renamed from: bQ com.corrodinggames.rts.game.units.custom.ag
   public class_359 field_4312;
   // $FF: renamed from: bR com.corrodinggames.rts.game.units.custom.ag
   public class_359 field_4313;
   // $FF: renamed from: bS java.util.ArrayList
   ArrayList field_4314 = new ArrayList();
   // $FF: renamed from: bT com.corrodinggames.rts.game.units.custom.m
   class_485 field_4315 = new class_485("moving");
   // $FF: renamed from: bU com.corrodinggames.rts.game.units.custom.m
   class_485 field_4316 = new class_485("idle");
   // $FF: renamed from: bV com.corrodinggames.rts.game.units.custom.m
   class_485 field_4317 = new class_485("attack");
   // $FF: renamed from: bW com.corrodinggames.rts.game.units.custom.m
   class_485 field_4318;
   // $FF: renamed from: bX com.corrodinggames.rts.game.units.custom.m
   class_485 field_4319;
   // $FF: renamed from: bY com.corrodinggames.rts.game.units.custom.m
   class_485 field_4320;
   // $FF: renamed from: bZ boolean
   public boolean field_4321;
   // $FF: renamed from: ca boolean
   public boolean field_4322;
   // $FF: renamed from: cb boolean
   public boolean field_4323;
   // $FF: renamed from: cc boolean
   public boolean field_4324;
   // $FF: renamed from: cd com.corrodinggames.rts.game.units.custom.ai
   public class_365 field_4325;
   // $FF: renamed from: ce float
   public float field_4326;
   // $FF: renamed from: cf float
   public float field_4327;
   // $FF: renamed from: cg int
   public int field_4328;
   // $FF: renamed from: ch int
   public int field_4329;
   // $FF: renamed from: ci float
   public float field_4330;
   // $FF: renamed from: cj float
   public float field_4331;
   // $FF: renamed from: ck float
   public float field_4332;
   // $FF: renamed from: cl boolean
   public boolean field_4333;
   // $FF: renamed from: cm float
   public float field_4334;
   // $FF: renamed from: cn float
   public float field_4335;
   // $FF: renamed from: co float
   public float field_4336;
   // $FF: renamed from: cp float
   public float field_4337;
   // $FF: renamed from: cq boolean
   public boolean field_4338;
   // $FF: renamed from: cr boolean
   public boolean field_4339;
   // $FF: renamed from: cs float
   public float field_4340 = 0.0F;
   // $FF: renamed from: ct float
   public float field_4341;
   // $FF: renamed from: cu float
   public float field_4342;
   // $FF: renamed from: cv float
   public float field_4343;
   // $FF: renamed from: cw boolean
   public boolean field_4344;
   // $FF: renamed from: cx boolean
   public boolean field_4345;
   // $FF: renamed from: cy int
   public int field_4346;
   // $FF: renamed from: cz float
   public float field_4347;
   // $FF: renamed from: cA float
   public float field_4348;
   // $FF: renamed from: cB com.corrodinggames.rts.game.units.b
   public class_280 field_4349;
   // $FF: renamed from: cC float
   public float field_4350;
   // $FF: renamed from: cD float
   public float field_4351;
   // $FF: renamed from: cE boolean
   public boolean field_4352;
   // $FF: renamed from: cF boolean
   public boolean field_4353;
   // $FF: renamed from: cG boolean
   public boolean field_4354;
   // $FF: renamed from: cH boolean
   public boolean field_4355;
   // $FF: renamed from: cI float
   public float field_4356;
   // $FF: renamed from: cJ int
   public int field_4357 = -1;
   // $FF: renamed from: cK int
   public int field_4358 = -1;
   // $FF: renamed from: cL float
   public float field_4359;
   // $FF: renamed from: cM boolean
   public boolean field_4360;
   // $FF: renamed from: cN com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public LogicBoolean field_4361;
   // $FF: renamed from: cO com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public LogicBoolean field_4362;
   // $FF: renamed from: cP com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public LogicBoolean field_4363;
   // $FF: renamed from: cQ com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public LogicBoolean field_4364;
   // $FF: renamed from: cR boolean
   public boolean field_4365;
   // $FF: renamed from: cS float
   public float field_4366;
   // $FF: renamed from: cT int
   public int field_4367;
   // $FF: renamed from: cU boolean
   public boolean field_4368;
   // $FF: renamed from: cV boolean
   public boolean field_4369;
   // $FF: renamed from: cW boolean
   public boolean field_4370;
   // $FF: renamed from: cX boolean
   public boolean field_4371;
   // $FF: renamed from: cY boolean
   public boolean field_4372;
   // $FF: renamed from: cZ boolean
   public boolean field_4373 = false;
   // $FF: renamed from: da int
   public int field_4374 = 0;
   // $FF: renamed from: db com.corrodinggames.rts.game.units.custom.d
   public class_478 field_4375;
   // $FF: renamed from: dc java.util.ArrayList
   public ArrayList field_4376 = new ArrayList();
   // $FF: renamed from: dd boolean
   public boolean field_4377;
   // $FF: renamed from: de boolean
   public boolean field_4378;
   // $FF: renamed from: df com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public LogicBoolean field_4379;
   // $FF: renamed from: dg com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public LogicBoolean field_4380;
   // $FF: renamed from: dh float
   public float field_4381;
   // $FF: renamed from: di int
   public int field_4382 = 1;
   // $FF: renamed from: dj com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public static LogicBoolean field_4383 = LogicBoolean.create("if not self.isOverLiquid() and not self.isMoving()");
   // $FF: renamed from: dk com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public static LogicBoolean field_4384 = LogicBoolean.create("if not self.isOverLiquid()");
   // $FF: renamed from: dl com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public LogicBoolean field_4385;
   // $FF: renamed from: dm com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
   public LogicBoolean field_4386;
   // $FF: renamed from: dn com.corrodinggames.rts.game.units.ac
   public class_503 field_4387;
   // $FF: renamed from: do boolean
   public boolean field_4388;
   // $FF: renamed from: dp boolean
   public boolean field_4389;
   // $FF: renamed from: dq boolean
   public boolean field_4390;
   // $FF: renamed from: dr boolean
   public boolean field_4391;
   // $FF: renamed from: ds boolean
   public boolean field_4392;
   // $FF: renamed from: dt boolean
   public boolean field_4393;
   // $FF: renamed from: du boolean
   public boolean field_4394;
   // $FF: renamed from: dv boolean
   public boolean field_4395;
   // $FF: renamed from: dw int
   public int field_4396;
   // $FF: renamed from: dx int
   public int field_4397;
   // $FF: renamed from: dy float
   public float field_4398;
   // $FF: renamed from: dz float
   public float field_4399;
   // $FF: renamed from: dA float
   public float field_4400;
   // $FF: renamed from: dB java.lang.String
   public String field_4401;
   // $FF: renamed from: dC float
   public float field_4402 = -1.0F;
   // $FF: renamed from: dD java.util.ArrayList
   public ArrayList field_4403 = new ArrayList();
   // $FF: renamed from: dE boolean
   public boolean field_4404;
   // $FF: renamed from: dF com.corrodinggames.rts.game.units.custom.ai[]
   public class_365[] field_4405 = null;
   // $FF: renamed from: dG com.corrodinggames.rts.game.units.custom.af[]
   public class_363[] field_4406;
   // $FF: renamed from: dH java.util.ArrayList
   ArrayList field_4407 = new ArrayList();
   // $FF: renamed from: dI java.util.ArrayList
   ArrayList field_4408 = new ArrayList();
   // $FF: renamed from: dJ boolean
   boolean field_4409 = false;
   // $FF: renamed from: dK com.corrodinggames.rts.game.units.custom.ai
   class_365 field_4410 = null;
   // $FF: renamed from: dL com.corrodinggames.rts.game.units.custom.ab[]
   public class_358[] field_4411 = null;
   // $FF: renamed from: dM boolean
   public boolean field_4412 = false;
   // $FF: renamed from: dN boolean
   public boolean field_4413 = false;
   // $FF: renamed from: dO java.util.ArrayList
   ArrayList field_4414 = new ArrayList();
   // $FF: renamed from: dP java.util.ArrayList
   ArrayList field_4415 = new ArrayList();
   // $FF: renamed from: dQ java.util.ArrayList
   ArrayList field_4416 = new ArrayList();
   // $FF: renamed from: dR java.util.ArrayList
   ArrayList field_4417 = new ArrayList();
   // $FF: renamed from: dS boolean
   public boolean field_4418;
   // $FF: renamed from: dT int
   int field_4419 = -1;
   // $FF: renamed from: dU java.lang.String
   String field_4420;
   // $FF: renamed from: dV java.lang.String
   String field_4421;
   // $FF: renamed from: dW com.corrodinggames.rts.game.units.aq[]
   class_513[] field_4422;
   // $FF: renamed from: dX com.corrodinggames.rts.game.units.a.s
   class_133 field_4423 = new class_133(this);
   // $FF: renamed from: dY java.util.ArrayList
   ArrayList field_4424 = new ArrayList();
   // $FF: renamed from: dZ java.util.ArrayList
   ArrayList field_4425 = new ArrayList();
   // $FF: renamed from: ea com.corrodinggames.rts.game.units.custom.p[]
   class_492[] field_4426;

   // $FF: renamed from: b () java.lang.String
   public strictfp String method_3129() {
      return this.field_4213 != null ? this.field_4213.method_1422() : null;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public static strictfp void method_3130(class_404 var0) {
      var0.method_2565("customUnits");
      var0.method_2541(1);
      var0.method_2541(field_4187.size());
      Iterator var1 = field_4187.iterator();

      while(var1.hasNext()) {
         class_479 var2 = (class_479)var1.next();
         var0.method_2545(var2.field_4204);
         var0.method_2541(var2.field_4205);
         var0.method_2540(true);
         var0.method_2544(var2.method_3129());
         long var3 = 0L;
         if (var2.field_4213 != null && var2.field_4213.field_1740 != 0L) {
            var3 = var2.field_4213.field_1740;
         }

         var0.method_2543(var3);
         long var5 = 0L;
         var0.method_2543(var5);
      }

      var0.method_2567("customUnits");
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, com.corrodinggames.rts.game.units.custom.g) void
   public static strictfp void method_3131(class_24 var0, class_479 var1) {
      Iterator var2 = class_39.field_125.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         if (var3 instanceof class_66) {
            class_66 var4 = (class_66)var3;
            if (var4.field_549 == var0) {
               var4.method_589(var1, false);
               var4.I();
            }

            if (var4.field_550 == var0) {
               var4.field_550 = var1;
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g) com.corrodinggames.rts.game.units.custom.g
   public static strictfp class_479 method_3132(class_479 var0) {
      String var1 = var0.field_4211;
      class_236 var2 = class_236.method_1549();
      class_479 var3 = null;
      String var4 = null;
      if (var0.field_4213 != null) {
         var4 = var0.field_4213.field_1754;
      }

      field_4196 = null;

      try {
         var3 = method_3151(var1, var0.field_4213);
      } catch (RuntimeException var7) {
         var7.printStackTrace();
         if (field_4196 == null) {
            String var6 = "Error loading unit:" + var1 + "\n" + var7.getMessage();
            var2.method_1608(var6, 1);
         }
      }

      if (var3 == null && var0.field_4213 != null) {
         var0.field_4213.field_1754 = var4;
      }

      if (var3 != null) {
         field_4186.remove(var0);
         method_3131(var0, var3);
         if (field_4187.remove(var0)) {
            field_4187.add(var3);
         } else {
            class_236.method_1591("Changed unit was not enabled (original not found in customUnitTypes)");
         }
      }

      return var3;
   }

   // $FF: renamed from: o () void
   public static strictfp void method_3133() {
      class_236 var0 = class_236.method_1549();
      ArrayList var1 = new ArrayList(field_4186);
      boolean var2 = false;
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class_479 var4 = (class_479)var3.next();
         long var5 = var4.method_3183(false);
         if (var5 != var4.field_4210) {
            if (!var2) {
               class_236.method_1591("Detected unit changes");
            }

            class_479 var7 = method_3132(var4);
            if (var7 == null) {
               var4.field_4210 = var5;
            } else {
               var2 = true;
            }
         }
      }

      if (var2) {
         field_4188 = null;
         method_3139();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public static strictfp void method_3134(class_463 var0) {
      var0.method_3030("customUnits");

      try {
         ArrayList var1 = new ArrayList();
         int var2 = var0.method_3011();
         int var3 = var0.method_3011();

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var0.method_3015();
            int var6 = var0.method_3011();
            boolean var7 = var0.method_3010();
            String var8 = var0.method_3014();
            long var9 = var0.method_3013();
            long var11 = var0.method_3013();
            class_479 var13 = null;
            int var14 = -1;
            Iterator var15 = field_4186.iterator();

            while(var15.hasNext()) {
               class_479 var16 = (class_479)var15.next();
               if (var5.equals(var16.field_4204)) {
                  if (var6 == var16.field_4205) {
                     var13 = var16;
                  } else {
                     var14 = var16.field_4205;
                  }
               }
            }

            if (var13 == null) {
               String var20 = "from internal units";
               if (var8 != null) {
                  var20 = "from mod:'" + var8 + "'";
               }

               if (var14 == -1) {
                  throw new class_362("The server requires the unit:" + var5 + " that was not found " + var20, "");
               }

               throw new class_362("Found unit:" + var5 + " but it does not match the server's copy " + var20, "checksum c:" + var14 + " s:" + var6);
            }

            var1.add(var13);
         }

         field_4188 = var1;
      } finally {
         var0.method_3036("customUnits");
      }

   }

   // $FF: renamed from: p () void
   public static strictfp void method_3135() {
      if (field_4188 != null) {
         class_236.method_1591("applyPendingNetworkUnits: Applying new network units from server (" + field_4188.size() + " units)");
         field_4187 = field_4188;
         field_4188 = null;
         method_3139();
      } else {
         class_236.method_1591("applyPendingNetworkUnits: no server units list found");
      }

   }

   // $FF: renamed from: a (boolean) java.util.ArrayList
   public static strictfp ArrayList method_3136(boolean var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = field_4186.iterator();

      while(true) {
         class_479 var3;
         do {
            if (!var2.hasNext()) {
               return var1;
            }

            var3 = (class_479)var2.next();
         } while(var3.field_4213 != null && (!var3.field_4213.method_1428() || !var0));

         var1.add(var3);
      }
   }

   // $FF: renamed from: b (boolean) void
   public static strictfp void method_3137(boolean var0) {
      ArrayList var1 = method_3136(var0);
      field_4188 = null;
      field_4187 = var1;
      method_3139();
   }

   // $FF: renamed from: u () boolean
   public static strictfp boolean method_3138() {
      ArrayList var0 = field_4187;
      ArrayList var1 = method_3136(true);
      boolean var2 = true;
      field_4196 = null;
      field_4187 = var1;
      method_3144();
      if (field_4196 != null) {
         var2 = false;
      }

      field_4187 = var0;
      method_3144();
      return var2;
   }

   // $FF: renamed from: v () void
   public static strictfp void method_3139() {
      ArrayList var0 = new ArrayList();
      class_469[] var1 = class_469.values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         class_469 var4 = var1[var3];
         var0.add(var4);
      }

      Iterator var5 = field_4187.iterator();

      while(var5.hasNext()) {
         class_479 var6 = (class_479)var5.next();
         var0.add(var6);
      }

      class_469.field_4085 = var0;
      class_39.method_215();
      method_3144();
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.utility.j
   public static strictfp class_196 method_3140(String var0) {
      String var1 = "" + var0;
      return class_296.method_2080(var1);
   }

   // $FF: renamed from: a (java.util.ArrayList) void
   public static strictfp void method_3141(ArrayList var0) {
      Collections.sort(var0);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) void
   public strictfp void method_3142(class_24 var1) {
      if (!this.field_4403.contains(var1) && var1 != this) {
         this.field_4403.add(var1);
      }

      if (var1 instanceof class_479) {
         Iterator var2 = ((class_479)var1).field_4403.iterator();

         while(var2.hasNext()) {
            class_24 var3 = (class_24)var2.next();
            if (!this.field_4403.contains(var3) && var1 != this) {
               this.field_4403.add(var3);
            }
         }
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ap) void
   public static strictfp void method_3143(class_24 var0) {
      class_236 var1 = class_236.method_1549();

      try {
         var0.method_142();
         class_479 var2;
         class_489 var4;
         Iterator var16;
         if (var0 instanceof class_479) {
            var2 = (class_479)var0;
            if (var2.field_4401 != null) {
               class_24 var3 = class_469.method_3052(var2.field_4401);
               if (var3 == null) {
                  throw new class_361("Could not find [ai]upgradedFrom target:" + var2.field_4401);
               }

               var2.method_3142(var3);
            }

            var16 = var2.field_4424.iterator();

            while(var16.hasNext()) {
               var4 = (class_489)var16.next();
               var4.method_3208();
            }

            if (var2.field_4371) {
               field_4190.add(var2);
            }
         }

         Iterator var15 = field_4187.iterator();

         int var7;
         ArrayList var8;
         Object var9;
         boolean var10;
         Iterator var11;
         class_121 var12;
         label246:
         while(var15.hasNext()) {
            class_479 var17 = (class_479)var15.next();
            if (var0 instanceof class_479) {
               class_479 var18 = (class_479)var0;
               if (var17.field_4401 != null && var17.field_4401.equalsIgnoreCase(var18.method_141())) {
                  var18.method_3142(var17);
               }
            }

            Iterator var20 = var17.field_4416.iterator();

            while(true) {
               class_488 var5;
               do {
                  if (!var20.hasNext()) {
                     continue label246;
                  }

                  var5 = (class_488)var20.next();
               } while(!var5.field_4503.equalsIgnoreCase(var0.method_141()));

               int var6 = var17.field_4272;

               for(var7 = var6; var7 <= 3; ++var7) {
                  var8 = var0.method_143(var7);
                  if (!var17.field_4219 && !var5.field_4505) {
                     var9 = new class_135(var17, (Integer)null);
                  } else {
                     var9 = new class_131(var17);
                  }

                  if (var5.field_4504 != -999.0F) {
                     ((class_121)var9).field_1346 = var5.field_4504;
                  }

                  var10 = false;
                  var11 = var8.iterator();

                  while(var11.hasNext()) {
                     var12 = (class_121)var11.next();
                     if (((class_121)var9).equals(var12)) {
                        var10 = true;
                     }
                  }

                  if (!var10) {
                     var8.add(var9);
                  }

                  method_3141(var8);
               }
            }
         }

         if (var0 instanceof class_479) {
            var2 = (class_479)var0;
            var16 = var2.field_4417.iterator();

            label215:
            while(true) {
               while(true) {
                  if (!var16.hasNext()) {
                     break label215;
                  }

                  class_496 var21 = (class_496)var16.next();
                  int var25;
                  ArrayList var26;
                  if (var21.field_4531 != null && var21.field_4531.equalsIgnoreCase("setRally")) {
                     for(var25 = 1; var25 <= 3; ++var25) {
                        var26 = var0.method_143(var25);
                        class_130 var31 = new class_130();
                        if (var21.field_4534 != -999.0F) {
                           var31.field_1346 = var21.field_4534;
                        }

                        var26.add(var31);
                        var2.field_4301 = true;
                        method_3141(var26);
                     }
                  } else if (var21.field_4531 != null && var21.field_4531.equalsIgnoreCase("reclaim")) {
                     for(var25 = 1; var25 <= 3; ++var25) {
                        var26 = var0.method_143(var25);
                        class_128 var30 = new class_128(true);
                        if (var21.field_4534 != -999.0F) {
                           var30.field_1346 = var21.field_4534;
                        }

                        var26.add(var30);
                        method_3141(var26);
                     }
                  } else if (var21.field_4531 != null && var21.field_4531.equalsIgnoreCase("repair")) {
                     for(var25 = 1; var25 <= 3; ++var25) {
                        var26 = var0.method_143(var25);
                        class_129 var28 = new class_129();
                        if (var21.field_4534 != -999.0F) {
                           var28.field_1346 = var21.field_4534;
                        }

                        var26.add(var28);
                        method_3141(var26);
                     }
                  } else {
                     class_24 var23 = null;
                     if (var21.field_4531 != null) {
                        var23 = class_469.method_3052(var21.field_4531);
                        if (var23 == null) {
                           throw new class_361("Could not find canBuild target:" + var21.field_4531);
                        }
                     } else if (var21.field_4573 != class_497.field_4576) {
                        throw new class_361("'Target' required for action:" + var21.field_4526);
                     }

                     byte var24 = 1;

                     for(var7 = var24; var7 <= 3; ++var7) {
                        var8 = var0.method_143(var7);
                        if (var21.field_4573 == class_497.field_4575) {
                           if (!var23.method_134() && !var21.field_4571) {
                              var9 = new class_135(var23, (Integer)null);
                           } else {
                              var9 = new class_131(var23, var21.field_4570, (Integer)null);
                           }
                        } else {
                           if (var21.field_4573 != class_497.field_4576) {
                              throw new class_361("Could not find actionType:" + var21.field_4573);
                           }

                           var9 = new class_136(var21, method_3186(var23));
                        }

                        if (var21.field_4534 != -999.0F) {
                           ((class_121)var9).field_1346 = var21.field_4534;
                        }

                        var10 = false;
                        var11 = var8.iterator();

                        while(var11.hasNext()) {
                           var12 = (class_121)var11.next();
                           if (((class_121)var9).equals(var12)) {
                              var10 = true;
                           }
                        }

                        if (!var10) {
                           var8.add(var9);
                        }

                        method_3141(var8);
                     }
                  }
               }
            }
         }

         if (var0 instanceof class_479) {
            var2 = (class_479)var0;
            var2.field_4394 = false;

            for(int var19 = 1; var19 <= 3; ++var19) {
               ArrayList var22 = var0.method_143(var19);
               Iterator var29 = var22.iterator();

               while(var29.hasNext()) {
                  class_121 var27 = (class_121)var29.next();
                  if (!(var27 instanceof class_136) && var27.method_1055() != null) {
                     var2.field_4394 = true;
                  }
               }
            }

            var16 = var2.field_4424.iterator();

            while(var16.hasNext()) {
               var4 = (class_489)var16.next();
               var4.method_3209();
            }
         }
      } catch (class_361 var13) {
         method_3159(var0.method_141(), var13, var0);
      } catch (RuntimeException var14) {
         method_3159(var0.method_141(), var14, var0);
      }

   }

   // $FF: renamed from: w () void
   public static strictfp void method_3144() {
      field_4190.clear();
      field_4189.clear();
      Iterator var0 = field_4187.iterator();

      class_479 var1;
      while(var0.hasNext()) {
         var1 = (class_479)var0.next();
         var1.field_4403.clear();
      }

      var0 = field_4187.iterator();

      while(var0.hasNext()) {
         var1 = (class_479)var0.next();

         try {
            if (var1.field_4209 != null) {
               String[] var2 = var1.field_4209.split(",");
               String[] var3 = var2;
               int var4 = var2.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  String var6 = var3[var5];
                  var6 = var6.trim();
                  boolean var7 = false;
                  class_24 var8 = class_469.method_3053(var6, var7);
                  if (var8 == null) {
                     throw new class_361("Could not find overrideAndReplace target:" + var6);
                  }

                  class_236.method_1588("Replacing:" + var8.method_141() + " with " + var1.method_141());
                  field_4189.put(var8, var1);
               }
            }
         } catch (class_361 var9) {
            method_3159(var1.method_141(), var9, var1);
         }
      }

      class_469[] var10 = class_469.values();
      int var11 = var10.length;

      for(int var12 = 0; var12 < var11; ++var12) {
         class_469 var13 = var10[var12];
         method_3143(var13);
      }

      var0 = field_4187.iterator();

      while(var0.hasNext()) {
         var1 = (class_479)var0.next();
         method_3143(var1);
      }

      Collections.sort(field_4190, new class_487());
   }

   // $FF: renamed from: x () java.lang.String
   public static strictfp String method_3145() {
      return "builtin_mods";
   }

   // $FF: renamed from: y () java.lang.String
   public static strictfp String method_3146() {
      return "builtin_mods_enabled";
   }

   // $FF: renamed from: z () java.lang.String
   public static strictfp String method_3147() {
      String var0;
      if (class_236.field_1899) {
         var0 = "/SD/mods/units";
      } else {
         var0 = "/SD/rustedWarfare/units";
      }

      return var0;
   }

   // $FF: renamed from: A () void
   public static strictfp void method_3148() {
      Iterator var0 = class_34.method_189().iterator();

      while(true) {
         class_66 var2;
         class_479 var3;
         do {
            class_34 var1;
            do {
               if (!var0.hasNext()) {
                  return;
               }

               var1 = (class_34)var0.next();
            } while(!(var1 instanceof class_66));

            var2 = (class_66)var1;
            var3 = var2.field_549;
         } while(field_4186.contains(var3));

         class_479 var4 = null;
         Iterator var5;
         class_479 var6;
         if (var4 == null) {
            var5 = field_4186.iterator();

            while(var5.hasNext()) {
               var6 = (class_479)var5.next();
               if (var3.field_4211.equals(var6.field_4211)) {
                  var4 = var6;
                  break;
               }
            }
         }

         if (var4 == null) {
            var5 = field_4186.iterator();

            while(var5.hasNext()) {
               var6 = (class_479)var5.next();
               if (var3.field_4204.equals(var6.field_4204)) {
                  var4 = var6;
                  break;
               }
            }
         }

         if (var4 == null) {
            var4 = field_4185;
         }

         if (var4 != null) {
            var2.method_589(var4, false);
         }
      }
   }

   // $FF: renamed from: B () void
   public static strictfp void method_3149() {
      class_236 var0 = class_236.method_1549();
      ArrayList var1 = var0.field_1946.method_1443();
      field_4200 = 0;
      field_4199 = 0;
      field_4201 = false;
      Iterator var2 = field_4197.values().iterator();

      while(true) {
         class_306 var3;
         do {
            if (!var2.hasNext()) {
               field_4186.clear();
               field_4187.clear();
               field_4188 = null;
               field_4189.clear();
               var0.field_1946.method_1449();
               field_4192 = 0;
               field_4193 = 0;
               method_3150("units", 1, false, (class_215)null);
               if (!class_236.field_1895) {
                  method_3150(method_3145(), 1, true, (class_215)null);
                  method_3150(method_3146(), 1, true, (class_215)null);
                  String var8 = method_3147();
                  if (!class_236.method_1633(var8)) {
                     class_236.method_1591("Modded Custom '" + var8 + "' directory not found");
                  } else {
                     class_236.method_1591("loading mod custom units at:" + var8);
                     method_3150(var8, 1, true, (class_215)null);
                  }

                  Iterator var9 = var1.iterator();

                  while(var9.hasNext()) {
                     class_215 var10 = (class_215)var9.next();
                     if (var10.field_1746 && var10.field_1742 != null) {
                        class_236.method_1591("Loading workshop mod at:" + var10.method_1425());
                        method_3150(var10.method_1425(), 2, true, var10);
                     }
                  }
               }

               method_3137(true);
               class_236.method_1591("Done loading custom units. image cacheHits:" + field_4200 + " image cacheMisses:" + field_4199);
               return;
            }

            var3 = (class_306)var2.next();
            var3.field_2537 = false;
         } while(var3.field_2521 == null);

         class_306[] var4 = var3.field_2521;
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            class_306 var7 = var4[var6];
            var7.field_2537 = false;
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, int, boolean, com.corrodinggames.rts.gameFramework.e.b) void
   private static strictfp void method_3150(String var0, int var1, boolean var2, class_215 var3) {
      class_236 var4 = class_236.method_1549();
      String[] var5 = class_236.method_1638(var0, false);
      if (var5 == null) {
         class_236.method_1588("readAllCustomUnitConfigs: ERROR");
         class_236.method_1588("readAllCustomUnitConfigs: Failed to load:" + var0);
         if (var3 != null) {
            if (!var3.field_1750) {
               var3.field_1754 = "Failed to list directory, check file permissions";
            } else {
               var3.field_1755 = "Failed to list subdirectory: '" + var0 + "' check file permissions";
            }
         }

      } else {
         if (var3 != null) {
            var3.field_1750 = true;
         }

         String[] var6 = var5;
         int var7 = var5.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            if (!var9.equals("custom_units_here.txt") && !var9.equals("mods_here_will_be_enabled_by_default.txt")) {
               class_215 var10 = var3;
               if (var2 && var1 == 1 && var3 == null) {
                  var10 = var4.field_1946.method_1440(var9);
                  if (var10 == null) {
                     class_236.method_1588("readAllCustomUnitConfigs: Could not find linked mod:" + var9);
                     var10 = var4.field_1946.field_1763;
                  }
               }

               String var11;
               if (var9.toLowerCase(Locale.ENGLISH).endsWith(".ini")) {
                  var11 = var0 + "/" + var9;
                  if (field_4191 != var10 && var10 != null) {
                     field_4191 = var10;
                     class_236.method_1591("Loading units from mod: " + var10.field_1737);
                  }

                  if (var9.equalsIgnoreCase("desktop.ini")) {
                     class_236.method_1591("Skipping possible system file: " + var11);
                  } else {
                     method_3151(var11, var10);
                  }
               } else if (var9.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                  var11 = var0 + "/" + var9;
                  class_236.method_1591("Found map: " + var11);
                  if (var10 != null && var10.field_1749) {
                     var4.field_1946.method_1450(var11, var10);
                  } else {
                     class_236.method_1591("Skipping map due to mod settings");
                  }
               } else {
                  var11 = var0 + "/" + var9;
                  if (var1 < 10) {
                     if (class_236.method_1633(var11)) {
                        method_3150(var11, var1 + 1, var2, var10);
                     }
                  } else {
                     class_236.method_1591("Too many levels:" + var11);
                  }
               }
            }
         }

      }
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.e.b) com.corrodinggames.rts.game.units.custom.g
   public static strictfp class_479 method_3151(String var0, class_215 var1) {
      try {
         class_196 var2 = method_3140(var0);
         if (var2 == null) {
            throw new RuntimeException("Failed to open unit config file:" + var0);
         } else {
            BufferedInputStream var3 = new BufferedInputStream(var2);
            ++field_4192;
            if (var1 != null) {
               ++field_4193;
            }

            class_236 var4 = class_236.method_1549();
            String var5 = "core units";
            if (var1 != null) {
               var5 = var1.method_1422();
            }

            var4.method_1604("Loading units - " + field_4192 + " (" + var5 + ")");
            class_479 var6 = method_3158(var0, var3, var2.method_1314(), var1, var2);

            try {
               var3.close();
               var2.close();
            } catch (IOException var8) {
               var8.printStackTrace();
            }

            return var6;
         }
      } catch (RuntimeException var9) {
         method_3160(var0, var9, var1);
         return null;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.z, com.corrodinggames.rts.gameFramework.utility.z, java.lang.String, java.io.InputStream, int) void
   public static strictfp void method_3152(class_210 var0, class_210 var1, String var2, InputStream var3, int var4) {
      if (var4 > 6) {
         throw new class_361("copyFrom can only be 6 levels deep, maybe you have a loop?");
      } else {
         String var5 = var1.method_1393("core", "copyFrom", (String)null);
         if (var5 != null) {
            if (var5.contains("..")) {
               throw new class_361("'..' not supported in copyFrom");
            }

            String var6 = class_296.method_2078(var2) + "/" + var5;
            class_196 var7 = method_3140(var6);
            if (var7 == null) {
               throw new class_361("Could not find copyFrom target:" + var6);
            }

            BufferedInputStream var8 = new BufferedInputStream(var7);

            class_210 var9;
            try {
               var9 = new class_210(var8, var6);
            } catch (IOException var11) {
               var11.printStackTrace();
               throw new class_361("copyFrom conf failed", "IOException: " + var11.getMessage());
            }

            var0.method_1407(var9);
            method_3152(var0, var9, var6, var3, var4 + 1);
         }

      }
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public static strictfp String method_3153(String var0) {
      if (var0 == null) {
         return null;
      } else {
         var0 = var0.replace("\\n", "\n");
         return var0;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.utility.z, java.lang.String, java.lang.String, java.lang.String) com.corrodinggames.rts.game.units.custom.ac
   public static strictfp class_355 method_3154(class_210 var0, String var1, String var2, String var3) {
      String var4 = var0.method_1393(var1, var2, (String)null);
      if (var4 == null) {
         if (var3 == null) {
            return null;
         }

         var4 = var3;
      }

      var4 = method_3153(var4);
      class_355 var5 = new class_355();
      if (var4 != null && var4.startsWith("i:")) {
         var5.field_2794 = var4.substring("i:".length());
         var5.field_2794 = var5.field_2794.trim();
         class_432.method_2744(var5.field_2794);
         return var5;
      } else {
         ArrayList var6 = new ArrayList();
         class_356 var7 = new class_356();
         var7.field_2795 = null;
         var7.field_2796 = var4;
         var6.add(var7);
         String var8 = var2 + "_";
         ArrayList var9 = var0.method_1410(var1, var8);
         Iterator var10 = var9.iterator();

         while(var10.hasNext()) {
            String var11 = (String)var10.next();
            String var12 = var11.substring(var8.length());
            var12 = var12.toLowerCase(Locale.ROOT);
            String var13 = var0.method_1392(var1, var11);
            var13 = method_3153(var13);
            class_356 var14 = new class_356();
            var14.field_2795 = var12;
            var14.field_2796 = var13;
            var6.add(var14);
         }

         var5.field_2791 = (class_356[])var6.toArray(new class_356[0]);
         var5.method_2303();
         return var5;
      }
   }

   // $FF: renamed from: c (int) void
   public static strictfp void method_3155(int var0) {
      if (field_4194 != null) {
         class_215 var10000 = field_4194;
         var10000.field_1753 += var0;
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e) void
   public static strictfp void method_3156(class_306 var0) {
      if (var0 != null && !var0.field_2537) {
         var0.field_2537 = true;
         method_3155(var0.method_2134());
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e[]) void
   public static strictfp void method_3157(class_306[] var0) {
      if (var0 != null) {
         class_306[] var1 = var0;
         int var2 = var0.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            class_306 var4 = var1[var3];
            method_3156(var4);
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, java.io.InputStream, long, com.corrodinggames.rts.gameFramework.e.b, com.corrodinggames.rts.gameFramework.utility.j) com.corrodinggames.rts.game.units.custom.g
   public static strictfp class_479 method_3158(String var0, InputStream var1, long var2, class_215 var4, class_196 var5) {
      class_236 var6 = class_236.method_1549();

      try {
         class_210 var7;
         try {
            var7 = new class_210(var1, var0);
         } catch (IOException var74) {
            throw new RuntimeException(var74);
         }

         String var8 = "core";
         String var9 = "graphics";
         String var10 = "attack";
         String var11 = "movement";
         String var12 = "ai";
         var7.method_1393(var8, "class", "CustomUnitMetadata");
         class_479 var14 = new class_479();
         if (var7.method_1390(var8, "dont_load", false)) {
            return null;
         } else {
            method_3152(var7, var7, var0, var1, 0);
            var14.field_4213 = var4;
            field_4194 = var4;
            field_4195 = false;
            var14.field_4204 = var7.method_1392(var8, "name");
            var14.field_4205 = var7.method_1386();
            String var15 = var7.method_1393(var8, "altNames", (String)null);
            String var19;
            if (var15 != null && !var15.equalsIgnoreCase("NONE")) {
               String[] var16 = var15.split(",");
               int var17 = var16.length;

               for(int var18 = 0; var18 < var17; ++var18) {
                  var19 = var16[var18];
                  var19 = var19.trim();
                  var14.field_4207.add(var19);
               }
            }

            var14.field_4208 = class_476.method_3108(var7.method_1393(var8, "tags", (String)null));
            var14.field_4209 = var7.method_1393(var8, "overrideAndReplace", (String)null);
            if (var14.field_4209 != null && var14.field_4209.equalsIgnoreCase("NONE")) {
               var14.field_4209 = null;
            }

            var14.field_4211 = var0;
            var14.field_4212 = var5.method_1315();
            var14.field_4210 = var14.method_3183(true);
            var14.field_4218 = var7.method_1398(var8, "globalScale", 1.0F);
            if (var14.field_4204.equals("missing")) {
               if (var4 == null) {
                  class_236.method_1591("Setting missingPlaceHolder");
                  field_4185 = var14;
               } else {
                  class_236.method_1591("Not setting missingPlaceHolder, as we are in a mod");
               }
            }

            var14.field_4216 = var7.method_1393(var8, "displayLocaleKey", (String)null);
            var14.field_4214 = method_3154(var7, var8, "displayText", (String)null);
            var14.field_4215 = method_3154(var7, var8, "displayDescription", (String)null);
            var14.field_4368 = var7.method_1390(var8, "isBio", false);
            var14.field_4369 = var7.method_1390(var8, "isBug", false);
            var14.field_4371 = var7.method_1390(var8, "isPickableStartingUnit", false);
            var14.field_4372 = var7.method_1390(var8, "startFallingWhenStartingUnit", false);
            var14.field_4276 = var7.method_1390(var8, "stayNeutral", false);
            var14.field_4277 = var7.method_1390(var8, "createNeutral", false);
            var14.field_4217 = var7.method_1390(var8, "showInEditor", true);
            var14.field_4166 = var7.method_1397(var9, "total_frames", 1);
            if (var14.field_4166 < 1) {
               throw new class_361("TOTAL_FRAMES cannot be: " + var14.field_4166 + " (must be 1 or more)");
            } else {
               var14.field_4167 = var7.method_1397(var9, "frame_width", -1);
               var14.field_4168 = var7.method_1397(var9, "frame_height", -1);
               var14.field_4174 = var7.method_1397(var9, "image_offsetX", 0);
               var14.field_4175 = var7.method_1397(var9, "image_offsetY", 0);
               var14.field_4170 = class_246.field_2178;
               if (var7.method_1390(var9, "teamColorsUseHue", false)) {
                  var14.field_4170 = class_246.field_2179;
               }

               var14.field_4169 = var7.method_1390(var9, "imageSmoothing", false);
               String var77 = var7.method_1392(var9, "image");
               var14.field_4171 = var14.method_3162(var0, var77, var14.field_4169);
               if (var14.field_4171 == null) {
                  throw new class_361("Main unit image must be set on custom unit");
               } else {
                  var14.field_4172 = var14.field_4171.method_2128() / var14.field_4166;
                  var14.field_4173 = var14.field_4171.method_2127();
                  if (var14.field_4168 > 0) {
                     var14.field_4173 = var14.field_4168;
                  }

                  if (var14.field_4167 > 0) {
                     var14.field_4172 = var14.field_4167;
                  }

                  var14.field_4176 = var14.method_3162(var0, var7.method_1393(var9, "image_back", "NONE"), var14.field_4169);
                  var14.field_4177 = var14.method_3162(var0, var7.method_1393(var9, "image_wreak", "NONE"), var14.field_4169);
                  String var78 = var7.method_1393(var9, "image_turret", "NONE");
                  var14.field_4178 = var14.method_3162(var0, var78, var14.field_4169);
                  var14.field_4181 = class_79.field_678;
                  String var79 = var7.method_1393(var9, "image_shadow", "NONE");
                  if (var79.equalsIgnoreCase("AUTO")) {
                     var19 = "[autoShadow:" + var14.field_4172 + "," + var14.field_4173 + "]" + var14.field_4171.field_2524 + "-" + var14.field_4171.field_2525;
                     class_306 var20 = method_3165(var19);
                     if (var20 != null) {
                        var14.field_4179 = var20;
                     } else {
                        var14.field_4179 = class_39.method_210(var14.field_4171, var14.field_4172, var14.field_4173);
                        method_3156(var14.field_4179);
                        method_3164(var19, var14.field_4179);
                     }
                  } else {
                     var14.field_4179 = var14.method_3162(var0, var79, var14.field_4169);
                  }

                  var14.field_4180 = var14.method_3161(var14.field_4171, var14.field_4170);
                  var14.field_4184 = var7.method_1390(var9, "teamColorsOnTurret", false);
                  if (var14.field_4184 && var14.field_4178 != null) {
                     var14.field_4182 = var14.method_3161(var14.field_4178, var14.field_4170);
                  }

                  float var80 = var7.method_1398(var9, "scaleImagesTo", -1.0F);
                  if (var80 > 0.0F) {
                     var80 *= var14.field_4218;
                     var14.field_4251 = var80 / (float)var14.field_4172;
                  }

                  float var81 = var7.method_1398(var9, "imageScale", 1.0F);
                  if (var81 != 1.0F) {
                     var14.field_4251 *= var81;
                  }

                  float var21 = var7.method_1398(var9, "scaleTurretImagesTo", -1.0F);
                  if (var21 > 0.0F) {
                     var21 *= var14.field_4218;
                     if (var14.field_4178 == null) {
                        throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                     }

                     var14.field_4252 = var21 / (float)var14.field_4178.field_2531;
                  }

                  float var22 = var7.method_1398(var9, "turretImageScale", 1.0F);
                  if (var22 != 1.0F) {
                     var14.field_4252 *= var22;
                  }

                  var14.field_4183 = class_88.field_769;
                  var14.field_4266 = var7.method_1395(var8, "mass");
                  var14.field_4267 = var7.method_1390(var8, "availableInDemo", true);
                  var14.field_4268 = var7.method_1390(var8, "isLocked", false);
                  var14.field_4269 = var7.method_1390(var8, "isLockedIfGameModeNoNuke", false);
                  var14.field_4270 = var7.method_1395(var8, "price");
                  var14.field_4271 = var7.method_1403(var8, "buildSpeed", 1.0F);
                  var14.field_4272 = var7.method_1397(var8, "techLevel", 1);
                  if (var14.field_4272 > 3) {
                     throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
                  } else if (var14.field_4272 < 1) {
                     throw new RuntimeException("techLevel cannot be less than 1, it is:" + var14.field_4272);
                  } else {
                     var14.field_4273 = var7.method_1390(var8, "experimental", false);
                     var14.field_4274 = var7.method_1397(var8, "generation_credits", 0);
                     var14.field_4275 = var7.method_1397(var8, "generation_delay", 40);
                     var14.field_4278 = var7.method_1398(var8, "resourceRate", 0.0F);
                     var14.field_4311 = class_359.method_2309(var14, var7.method_1393(var8, "soundOnAttackOrder", (String)null));
                     var14.field_4312 = class_359.method_2309(var14, var7.method_1393(var8, "soundOnMoveOrder", (String)null));
                     var14.field_4313 = new class_359();
                     String var23 = var7.method_1393(var9, "drawLayer", (String)null);
                     if (var23 != null) {
                        if (var23.equals("experimentals")) {
                           var14.field_4279 = 4;
                        } else if (var23.equals("underwater")) {
                           var14.field_4279 = 1;
                        } else if (var23.equals("ground")) {
                           var14.field_4279 = 2;
                        } else if (var23.equals("ground2")) {
                           var14.field_4279 = 3;
                        } else if (var23.equals("air")) {
                           var14.field_4279 = 5;
                        } else if (var23.equals("top")) {
                           var14.field_4279 = 10;
                        } else {
                           if (!var23.equals("wreaks")) {
                              throw new RuntimeException("unknown drawLayer:" + var23);
                           }

                           var14.field_4279 = 0;
                        }
                     }

                     var14.field_4280 = var7.method_1398(var9, "shadowOffsetX", 0.0F);
                     var14.field_4281 = var7.method_1398(var9, "shadowOffsetY", 0.0F);
                     var14.field_4321 = var7.method_1390(var9, "rotate_with_direction", true);
                     var14.field_4322 = var7.method_1390(var9, "lock_body_rotation_with_main_turret", false);
                     var14.field_4323 = var7.method_1390(var9, "lock_shadow_rotation_with_main_turret", var14.field_4322);
                     var14.field_4324 = var7.method_1390(var9, "lock_leg_rotation_with_main_turret", false);
                     var14.field_4326 = var7.method_1398(var9, "whenBeingBuiltMakeTransparentTill", 1.0F);
                     var14.field_4327 = var7.method_1398(var9, "animation_direction_units", -1.0F);
                     var14.field_4328 = var7.method_1397(var9, "animation_direction_strideX", -1);
                     var14.field_4329 = var7.method_1397(var9, "animation_direction_strideY", -1);
                     var14.field_4330 = var7.method_1398(var9, "animation_direction_starting", 0.0F);
                     var14.field_4315.method_3202(var14, var7, var9, "animation_" + var14.field_4315.field_4485 + "_");
                     var14.field_4316.method_3202(var14, var7, var9, "animation_" + var14.field_4316.field_4485 + "_");
                     var14.field_4317.method_3202(var14, var7, var9, "animation_" + var14.field_4317.field_4485 + "_");
                     Iterator var24 = var7.method_1412("effect_").iterator();

                     String var25;
                     String var26;
                     while(var24.hasNext()) {
                        var25 = (String)var24.next();
                        var26 = var25.substring("effect_".length());
                        class_498 var27 = new class_498(var26);
                        var27.method_3219(var14, var7, var25);
                        var14.field_4415.add(var27);
                     }

                     var24 = var14.field_4415.iterator();

                     while(var24.hasNext()) {
                        class_498 var83 = (class_498)var24.next();
                        if (var83.alsoEmitEffects != null) {
                           var83.alsoEmitEffects.method_3214();
                        }

                        if (var83.ifSpawnFailsEmitEffects != null) {
                           var83.ifSpawnFailsEmitEffects.method_3214();
                        }
                     }

                     var14.field_4253 = var7.method_1390(var9, "splastEffect", false);
                     var14.field_4256 = var7.method_1390(var9, "dustEffect", false);
                     var14.field_4254 = var7.method_1390(var9, "splastEffectReverse", true);
                     var14.field_4257 = var7.method_1390(var9, "dustEffectReverse", true);
                     var14.field_4255 = var14.field_4256 || var14.field_4253;
                     String var82 = var7.method_1393(var9, "movementEffect", (String)null);
                     if (var82 != null) {
                        var14.field_4258 = var14.method_3177(var82, (class_493)null);
                        if (var14.field_4258 != null && var14.field_4258.method_3213()) {
                           var14.field_4255 = true;
                        }
                     }

                     var25 = var7.method_1393(var9, "movementEffectReverse", (String)null);
                     if (var25 != null) {
                        var14.field_4259 = var14.method_3177(var25, (class_493)null);
                        if (var14.field_4259 != null && var14.field_4259.method_3213()) {
                           var14.field_4255 = true;
                        }
                     }

                     var14.field_4261 = var7.method_1398(var9, "movementEffectRate", 11.0F);
                     var14.field_4260 = var7.method_1390(var9, "movementEffectReverseFlipEffects", false);
                     var14.field_4263 = var7.method_1398(var9, "repairEffectRate", 5.0F);
                     var26 = var7.method_1393(var9, "repairEffect", (String)null);
                     if (var26 != null) {
                        var14.field_4264 = var14.method_3177(var26, (class_493)null);
                        if (var14.field_4264 != null && var14.field_4264.method_3213()) {
                           var14.field_4262 = true;
                        }
                     }

                     String var84 = var7.method_1393(var9, "repairEffectAtTarget", (String)null);
                     if (var84 != null) {
                        var14.field_4265 = var14.method_3177(var84, (class_493)null);
                        if (var14.field_4265 != null && var14.field_4265.method_3213()) {
                           var14.field_4262 = true;
                        }
                     }

                     Iterator var28 = var7.method_1412("animation_").iterator();

                     String var30;
                     while(var28.hasNext()) {
                        String var29 = (String)var28.next();
                        var30 = var29.substring("animation_".length());
                        class_485 var31 = new class_485(var30);
                        var31.method_3202(var14, var7, var29, "");
                        var14.field_4314.add(var31);
                     }

                     var14.field_4315 = var14.method_3174(class_482.field_4459, var14.field_4315, true);
                     var14.field_4316 = var14.method_3174(class_482.field_4461, var14.field_4316, true);
                     var14.field_4317 = var14.method_3174(class_482.field_4460, var14.field_4317, true);
                     var14.field_4318 = var14.method_3175(class_482.field_4462);
                     var14.field_4319 = var14.method_3175(class_482.field_4463);
                     if (var14.field_4318 != null && var14.field_4319 != null) {
                        throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
                     } else {
                        var14.field_4320 = var14.method_3175(class_482.field_4464);
                        if (var14.field_4320 != null) {
                           var14.field_4230 = true;
                        }

                        var14.field_4282 = var7.method_1395(var8, "maxHp");
                        var14.field_4283 = var7.method_1397(var8, "maxShield", 0);
                        var14.field_4284 = var7.method_1390(var8, "startShieldAtZero", false);
                        var14.field_4287 = var7.method_1398(var8, "shieldRegen", 0.25F);
                        var14.field_4294 = var7.method_1390(var8, "shieldDisplayOnlyDeflection", false);
                        var14.field_4295 = var7.method_1398(var8, "shieldDeflectionDisplayRate", 4.0F);
                        var14.field_4285 = var7.method_1398(var8, "armour", 0.0F);
                        var14.field_4286 = var7.method_1398(var8, "armourMinDamageToKeep", 1.0F);
                        var14.field_4288 = var7.method_1398(var8, "energyMax", 0.0F);
                        var14.field_4289 = var7.method_1390(var8, "startEnergyAtZero", false);
                        var14.field_4290 = var7.method_1398(var8, "energyRegen", 0.0F);
                        var14.field_4292 = var7.method_1398(var8, "energyStartingPercentage", 1.0F);
                        var14.field_4291 = var7.method_1390(var8, "energyNeedsToRechargeToFull", false);
                        var14.field_4293 = method_3154(var7, var8, "energyDisplayName", (String)null);
                        var14.field_4296 = var7.method_1395(var8, "radius");
                        var14.field_4302 = var7.method_1397(var8, "displayRadius", var14.field_4296);
                        var14.field_4303 = var7.method_1397(var8, "shieldRenderRadius", var14.field_4296);
                        var14.field_4304 = var7.method_1397(var8, "buildingSelectionOffset", 0);
                        var14.field_4297 = var7.method_1408(var8, "footprint", var14.field_4297);
                        var14.field_4298 = var7.method_1408(var8, "constructionFootprint", var14.field_4298);
                        var14.field_4299 = var7.method_1398(var8, "buildingToFootprintOffsetX", (float)class_408.field_3328 / 2.0F);
                        var14.field_4300 = var7.method_1398(var8, "buildingToFootprintOffsetY", (float)class_408.field_3329 / 2.0F);
                        var14.field_4296 = (int)((float)var14.field_4296 * var14.field_4218);
                        var14.field_4302 = (int)((float)var14.field_4302 * var14.field_4218);
                        var14.field_4305 = var7.method_1397(var8, "fogOfWarSightRange", 15);
                        var14.field_4306 = var7.method_1398(var8, "exit_x", 0.0F);
                        var14.field_4307 = var7.method_1398(var8, "exit_y", 9.0F);
                        var14.field_4308 = var7.method_1398(var8, "exit_dirOffset", (Float)null);
                        var14.field_4309 = var7.method_1398(var8, "exit_heightOffset", 0.0F);
                        var14.field_4310 = var7.method_1398(var8, "exit_moveAwayAmount", 70.0F);
                        var14.field_4367 = var7.method_1397(var8, "softCollisionOnAll", 0);
                        var14.field_4373 = var7.method_1390(var8, "hideScorchMark", false);
                        var14.field_4219 = var7.method_1390(var8, "isBuilding", false);
                        var14.field_4220 = var7.method_1390(var8, "placeOnlyOnResPool", false);
                        var14.field_4221 = var7.method_1390(var8, "isUnrepairableUnit", false);
                        var14.field_4222 = var7.method_1390(var8, "canRepairBuildings", false);
                        var14.field_4223 = var7.method_1390(var8, "canRepairUnits", false);
                        var14.field_4224 = var7.method_1390(var8, "autoRepair", false);
                        var14.field_4226 = var7.method_1397(var8, "nanoRange", -1);
                        if (var14.field_4226 != -1) {
                           var14.field_4226 = (int)((float)var14.field_4226 * var14.field_4218);
                        }

                        var14.field_4227 = var7.method_1398(var8, "nanoRepairSpeed", 0.2F);
                        var14.field_4228 = var7.method_1398(var8, "nanoBuildSpeed", 1.0F);
                        var14.field_4229 = var7.method_1398(var8, "nanoFactorySpeed", 1.0F);
                        var14.field_4231 = var7.method_1398(var8, "selfRegenRate", 0.0F);
                        var14.field_4232 = var7.method_1398(var8, "selfBuildRate", 0.0F);
                        var14.field_4233 = var7.method_1390(var8, "dieOnConstruct", false);
                        var14.field_4235 = var7.method_1390(var8, "dieOnZeroEnergy", false);
                        byte var85 = 4;
                        if (var14.field_4266 > 30000) {
                           var85 = 8;
                        }

                        if (var14.field_4219) {
                           var85 = 7;
                        }

                        var14.field_4240 = var7.method_1397(var8, "numBitsOnDeath", Integer.valueOf(var85));
                        var14.field_4237 = var7.method_1390(var8, "nukeOnDeath", false);
                        var14.field_4238 = var7.method_1398(var8, "nukeOnDeathRange", 250.0F);
                        var14.field_4239 = var7.method_1398(var8, "nukeOnDeathDamage", 5400.0F);
                        var14.field_4241 = var7.method_1390(var8, "nukeOnDeathDisableWhenNoNuke", false);
                        var14.field_4236 = var7.method_1397(var8, "fireOnDeath", 0);
                        var14.field_4242 = var7.method_1390(var8, "explodeOnDeath", true);
                        boolean var86 = var7.method_1390(var8, "explodeOnDeathGroundCollosion", true);
                        var86 = var7.method_1390(var8, "explodeOnDeathGroundCollision", var86);
                        var14.field_4243 = var86;
                        var14.field_4245 = var14.method_3177(var7.method_1393(var8, "effectOnDeath", (String)null), (class_493)null);
                        var30 = var7.method_1393(var8, "effectOnDeathGroundCollosion", (String)null);
                        var30 = var7.method_1393(var8, "effectOnDeathGroundCollision", var30);
                        var14.field_4244 = var14.method_3177(var30, (class_493)null);
                        var14.field_4247 = class_364.method_2312(var14, var7, var8, "unitsSpawnedOnDeath");
                        var14.field_4248 = var7.method_1390(var8, "unitsSpawnedOnDeath_setToTeamOfLastAttacker", false);
                        var14.field_4390 = var7.method_1390(var8, "canReclaimResources", false);
                        var14.field_4374 = var7.method_1397(var8, "maxTransportingUnits", 0);
                        if (var14.field_4374 < 0) {
                           throw new RuntimeException("maxTransportingUnits cannot be < 0");
                        } else {
                           var14.field_4375 = class_476.method_3108(var7.method_1393(var8, "transportUnitsRequireTag", (String)null));
                           String var87 = var7.method_1393(var8, "transportUnitsRequireMovementType", (String)null);
                           int var33;
                           if (var87 != null) {
                              String[] var32 = var87.split(",");
                              var33 = var32.length;

                              for(int var34 = 0; var34 < var33; ++var34) {
                                 String var35 = var32[var34];
                                 var35 = var35.trim();
                                 var14.field_4376.add(class_503.method_3232(var35, "transportUnitsRequireMovementType"));
                              }
                           }

                           var14.field_4377 = var7.method_1390(var8, "transportUnitsBlockAirAndWaterUnits", var14.field_4376.size() == 0);
                           var14.field_4379 = LogicBoolean.create(var7.method_1393(var8, "transportUnitsKeepBuiltUnits", (String)null), LogicBoolean.falseBoolean);
                           var14.field_4380 = LogicBoolean.create(var7.method_1393(var8, "transportUnitsKillOnDeath", (String)null), LogicBoolean.trueBoolean);
                           var14.field_4381 = var7.method_1398(var8, "transportUnitsHealBy", 0.0F);
                           String var88 = var7.method_1393(var8, "transportUnitsCanUnloadUnits", (String)null);
                           if (var88 != null) {
                              var14.field_4385 = LogicBoolean.create(var88);
                              var14.field_4386 = var14.field_4385;
                           } else {
                              var14.field_4385 = field_4383;
                              var14.field_4386 = field_4384;
                           }

                           var14.field_4378 = var7.method_1390(var8, "transportUnitsAddUnloadOption", var14.field_4385 != LogicBoolean.falseBoolean);
                           var14.field_4382 = var7.method_1397(var8, "transportSlotsNeeded", 1);

                           String var89;
                           for(var33 = 0; var33 <= 29; ++var33) {
                              var89 = var7.method_1393(var8, "builtFrom_" + var33 + "_name", (String)null);
                              if (var89 != null) {
                                 class_488 var92 = new class_488();
                                 var92.field_4503 = var89;
                                 var92.field_4504 = var7.method_1398(var8, "builtFrom_" + var33 + "_pos", 999.0F);
                                 var92.field_4505 = var7.method_1390(var8, "builtFrom_" + var33 + "_forceNano", false);
                                 if (!"NONE".equalsIgnoreCase(var89)) {
                                    var14.field_4416.add(var92);
                                 }
                              }
                           }

                           for(var33 = 0; var33 <= 50; ++var33) {
                              var89 = var7.method_1393(var8, "canBuild_" + var33 + "_name", (String)null);
                              if (var89 != null) {
                                 String[] var93 = var89.split(",");
                                 String[] var36 = var93;
                                 int var37 = var93.length;

                                 for(int var38 = 0; var38 < var37; ++var38) {
                                    String var39 = var36[var38];
                                    var39 = var39.trim();
                                    class_496 var40 = new class_496();
                                    var40.field_4531 = var39;
                                    var40.field_4534 = var7.method_1398(var8, "canBuild_" + var33 + "_pos", 999.0F);
                                    var40.field_4570 = var7.method_1397(var8, "canBuild_" + var33 + "_tech", 1);
                                    var40.field_4571 = var7.method_1390(var8, "canBuild_" + var33 + "_forceNano", false);
                                    var40.field_4572 = var7.method_1393(var8, "canBuild_" + var33 + "_type", (String)null);
                                    var40.field_4573 = class_497.field_4575;
                                    if (!"NONE".equalsIgnoreCase(var39)) {
                                       var14.field_4417.add(var40);
                                    }
                                 }
                              }
                           }

                           String var90 = var7.method_1392(var11, "movementType");
                           var14.field_4387 = class_503.method_3232(var90, "movementType");
                           Boolean var91 = var7.method_1390(var12, "useAsBuilder", (Boolean)null);
                           Boolean var94 = var7.method_1390(var8, "isBuilder", (Boolean)null);
                           if (var94 == null) {
                              if (var91 == null) {
                                 var94 = false;
                              } else {
                                 var94 = var91;
                              }
                           } else if (var91 == null) {
                              var91 = var94;
                           }

                           if (var91 == null) {
                              var91 = false;
                           }

                           var14.field_4391 = var94;
                           var14.field_4392 = var91;
                           if (!var14.field_4391 && var14.field_4392) {
                              throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + var14.field_4392 + " [core]isBuilder:" + var14.field_4391);
                           } else {
                              Boolean var95 = var7.method_1390(var12, "useAsTransport", (Boolean)null);
                              if (var95 == null) {
                                 var95 = var14.field_4374 > 0 && !var14.field_4392;
                              }

                              var14.field_4393 = var95;
                              if (var14.field_4219) {
                                 var14.field_4181 = class_47.field_352;
                              } else if (var14.field_4387 == class_503.field_4620) {
                                 var14.field_4181 = class_73.field_617;
                              } else if (var14.field_4387 == class_503.field_4621) {
                                 var14.field_4181 = class_67.field_573;
                              } else if (var14.field_4387 == class_503.field_4622) {
                                 if (var14.field_4273) {
                                    var14.field_4181 = class_79.field_679;
                                 } else if (var14.method_135()) {
                                    var14.field_4181 = class_84.field_739;
                                 } else {
                                    var14.field_4181 = class_87.field_764;
                                 }
                              } else if (var14.field_4273) {
                                 var14.field_4181 = class_79.field_679;
                              } else if (var14.method_135()) {
                                 var14.field_4181 = class_84.field_739;
                              } else {
                                 var14.field_4181 = class_79.field_678;
                              }

                              var14.field_4388 = var7.method_1390(var11, "slowDeathFall", false);
                              var14.field_4389 = var7.method_1390(var11, "slowDeathFallSmoke", true);
                              var14.field_4335 = var7.method_1398(var11, "moveSpeed", 1.0F) * var14.field_4218;
                              var14.field_4336 = var7.method_1398(var11, "moveAccelerationSpeed", 1.0F) * var14.field_4218;
                              var14.field_4337 = var7.method_1398(var11, "moveDecelerationSpeed", 1.0F) * var14.field_4218;
                              var14.field_4356 = var7.method_1398(var11, "reverseSpeedPercentage", 0.6F);
                              String var96 = var7.method_1393(var11, "landOnGround", "false");
                              if (var96.equalsIgnoreCase("false")) {
                                 var14.field_4338 = false;
                              } else if (var96.equalsIgnoreCase("onlyIdle")) {
                                 var14.field_4338 = true;
                                 var14.field_4339 = true;
                              } else {
                                 if (!var96.equalsIgnoreCase("true")) {
                                    throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + var96);
                                 }

                                 var14.field_4338 = true;
                              }

                              float var97 = 0.0F;
                              float var98 = 0.0F;
                              if (var14.field_4387 == class_503.field_4620) {
                                 var97 = 35.0F;
                                 var98 = 1.5F;
                              }

                              var14.field_4340 = var7.method_1398(var11, "startingHeightOffset", 0.0F);
                              var14.field_4341 = var7.method_1398(var11, "targetHeight", var97);
                              var14.field_4342 = var7.method_1398(var11, "targetHeightDrift", var98);
                              var14.field_4343 = var7.method_1398(var11, "maxTurnSpeed", 1.0F);
                              var14.field_4359 = var7.method_1398(var11, "turnAcceleration", 1.0F);
                              var14.field_4344 = var7.method_1390(var11, "moveSlidingMode", false);
                              var14.field_4345 = var7.method_1390(var11, "moveIgnoringBody", false);
                              var14.field_4346 = var7.method_1397(var11, "moveSlidingDir", -1);
                              var14.field_4355 = var7.method_1390(var11, "joinsGroupFormations", true);
                              var14.field_4347 = var7.method_1398(var10, "turretSize", 1.0F) * var14.field_4218;
                              var14.field_4348 = var7.method_1398(var10, "turretTurnSpeed", 8.0F);
                              var14.field_4333 = var7.method_1390(var10, "turretRotateWithBody", true);
                              String var99 = var7.method_1393(var10, "attackMovement", "normal");
                              var14.field_4349 = class_280.field_2401;
                              if (var99.equalsIgnoreCase("normal")) {
                                 var14.field_4349 = class_280.field_2401;
                              }

                              if (var99.equalsIgnoreCase("strafing")) {
                                 var14.field_4349 = class_280.field_2402;
                              }

                              if (var99.equalsIgnoreCase("bomber")) {
                                 var14.field_4349 = class_280.field_2404;
                              }

                              var14.field_4352 = var7.method_1390(var10, "disablePassiveTargeting", false);
                              var14.field_4353 = var7.method_1390(var10, "stopTargetingAfterFiring", false);
                              var14.field_4354 = var7.method_1390(var10, "turretMultiTargeting", false);
                              var14.field_4350 = var7.method_1398(var10, "attackMovementSpeed", 1.0F);
                              var14.field_4351 = var7.method_1398(var10, "attackMovementSpread", 1.0F);
                              var14.field_4331 = var7.method_1398(var10, "maxAttackRange", 100.0F) * var14.field_4218;
                              var14.field_4334 = var7.method_1401(var10, "shootDelay", 50.0F);
                              var14.field_4370 = var7.method_1390(var10, "isMelee", false);
                              Iterator var41 = var7.method_1412("projectile_").iterator();

                              while(var41.hasNext()) {
                                 String var42 = (String)var41.next();
                                 String var43 = var42.substring("projectile_".length());
                                 if (var14.method_3190(var43) != null) {
                                    throw new RuntimeException("Two projectiles found with the same name:" + var43);
                                 }

                                 class_363 var44 = new class_363();
                                 var44.field_2847 = var43;
                                 class_363.method_2311(var44, var14, var7, var42);
                              }

                              int var100 = var14.field_4408.size();
                              if (var100 < 1) {
                                 var100 = 1;
                              }

                              var14.field_4406 = new class_363[var100];

                              int var101;
                              class_363 var102;
                              for(var101 = 0; var101 < var14.field_4408.size(); ++var101) {
                                 var102 = (class_363)var14.field_4408.get(var101);
                                 var102.field_2848 = var101;
                                 var14.field_4406[var101] = var102;
                              }

                              for(var101 = 0; var101 < var14.field_4406.length; ++var101) {
                                 var102 = var14.field_4406[var101];
                                 if (var102 != null) {
                                    var102.field_2862 *= var14.field_4218;
                                    var102.field_2884 *= var14.field_4218;
                                    var102.field_2888 *= var14.field_4218;
                                 }
                              }

                              if (var14.field_4406[0] == null) {
                                 class_363 var103 = new class_363();
                                 var103.field_2848 = 0;
                                 var103.field_2847 = "1";
                                 var103.field_2849 = 10;
                                 var14.field_4408.add(var103);
                                 var14.field_4406[0] = var103;
                              }

                              ArrayList var104 = var14.field_4407;
                              Iterator var105 = var7.method_1412("turret_").iterator();

                              String var45;
                              class_365 var46;
                              while(var105.hasNext()) {
                                 String var106 = (String)var105.next();
                                 var45 = var106.substring("turret_".length());
                                 if (var14.method_3189(var45) != null) {
                                    throw new RuntimeException("Two turrets found with the same name:" + var45);
                                 }

                                 var46 = new class_365();
                                 var46.field_2909 = var45;
                                 var46.field_2910 = var106;
                                 var104.add(var46);
                              }

                              var105 = var104.iterator();

                              class_365 var107;
                              while(var105.hasNext()) {
                                 var107 = (class_365)var105.next();
                                 class_365.method_2320(var107, var14, var7, var107.field_2910);
                              }

                              if (var104.size() == 0) {
                                 class_365 var108 = new class_365();
                                 var108.field_2914 = 0.0F;
                                 var108.field_2915 = 0.0F;
                                 var108.field_2909 = "1";
                                 var108.field_2919 = var14.field_4334;
                                 var104.add(var108);
                              }

                              int var109;
                              for(var109 = var104.size() - 1; var109 >= 0; --var109) {
                                 if (var104.get(var109) != null) {
                                    ((class_365)var104.get(var109)).field_2913 = var109;
                                 }
                              }

                              for(var109 = var104.size() - 1; var109 >= 0; --var109) {
                                 if (var104.get(var109) != null) {
                                    var107 = (class_365)var104.get(var109);
                                    if (var107.field_2931 != null) {
                                       var107.field_2929 = var107.field_2931.field_2913;
                                       if (var107.field_2931.field_2931 != null) {
                                          throw new RuntimeException(var107.field_2909 + ": Turret can not be attached to turret that is also attached to a turret");
                                       }
                                    }

                                    if (var107.field_2932 != null) {
                                       var107.field_2930 = var107.field_2932.field_2913;
                                    }

                                    if (var107.field_2950 < 0.0F) {
                                       var107.field_2950 = var107.field_2949;
                                    }
                                 }
                              }

                              if (var104.size() > 31) {
                                 throw new RuntimeException("Turret max count per unit is: 31");
                              } else {
                                 var14.field_4405 = (class_365[])var104.toArray(new class_365[0]);
                                 var14.field_4332 = var14.field_4331;
                                 boolean var112 = true;
                                 boolean var110 = false;
                                 Iterator var111 = var104.iterator();

                                 while(true) {
                                    while(true) {
                                       do {
                                          if (!var111.hasNext()) {
                                             if (var110 && var112) {
                                                throw new RuntimeException("limitingRange cannot be applied to all turrets at the same time, use maxAttackRange instead");
                                             }

                                             var45 = var7.method_1393(var10, "setMainTurretAs", (String)null);
                                             if (var45 != null) {
                                                var14.field_4325 = var14.method_3189(var45);
                                                if (var14.field_4325 == null) {
                                                   throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + var45);
                                                }
                                             } else {
                                                var14.field_4325 = var14.method_3189("1");
                                                if (var14.field_4325 == null) {
                                                   var14.field_4325 = var14.field_4405[0];
                                                }
                                             }

                                             for(int var113 = 0; var113 <= 50; ++var113) {
                                                method_3180(var14, var7, var8, "action_" + var113 + "_", "" + var113, false);
                                             }

                                             Iterator var114 = var7.method_1412("action_").iterator();

                                             while(var114.hasNext()) {
                                                String var116 = (String)var114.next();
                                                String var119 = var116.substring("action_".length());
                                                if (var14.method_3191(var119) != null) {
                                                   throw new RuntimeException("Two actions found with the same name:" + var119);
                                                }

                                                method_3180(var14, var7, var116, "", var119, true);
                                             }

                                             ArrayList var115 = new ArrayList();
                                             ArrayList var117 = new ArrayList();

                                             int var51;
                                             for(int var120 = 0; var120 <= 1; ++var120) {
                                                boolean var121 = var120 == 0;
                                                ArrayList var50 = var121 ? var115 : var117;

                                                for(var51 = 1; var51 < 13; ++var51) {
                                                   String var52 = var121 ? "leg_" + var51 : "arm_" + var51;
                                                   Float var53 = var7.method_1398(var52, "x", (Float)null);
                                                   Float var54 = var7.method_1398(var52, "y", (Float)null);
                                                   if (var53 != null && var54 != null) {
                                                      class_358 var55 = new class_358();
                                                      if (!var121) {
                                                         var55.field_2813 = true;
                                                      }

                                                      int var56 = var7.method_1397(var52, "copyFrom", 0);
                                                      if (var56 != 0) {
                                                         if (var56 - 1 >= var50.size()) {
                                                            throw new RuntimeException("copyFrom: Leg/Arm copy target not loaded yet: " + var56);
                                                         }

                                                         class_358 var57 = (class_358)var50.get(var56 - 1);
                                                         var55.method_2304(var57);
                                                      }

                                                      var55.field_2808 = var53;
                                                      var55.field_2809 = var54;
                                                      var55.field_2806 = var52.replace("_", "");
                                                      var55.field_2807 = var121;
                                                      Float var131 = var7.method_1398(var52, "attach_x", (Float)null);
                                                      if (var131 != null) {
                                                         var55.field_2811 = var131;
                                                      }

                                                      Float var58 = var7.method_1398(var52, "attach_y", (Float)null);
                                                      if (var58 != null) {
                                                         var55.field_2812 = var58;
                                                      }

                                                      var55.field_2810 = var7.method_1398(var52, "endDirOffset", 0.0F);
                                                      var55.field_2813 = var7.method_1390(var52, "lockMovement", var55.field_2813);
                                                      var55.field_2814 = var7.method_1398(var52, "estimatingPositionMultiplier", var55.field_2814);
                                                      var55.field_2817 = var7.method_1390(var52, "hidden", var55.field_2817);
                                                      Float var59 = var7.method_1398(var52, "moveSpeed", (Float)null);
                                                      if (var59 != null) {
                                                         var55.field_2818 = var59;
                                                      }

                                                      var55.field_2819 = var7.method_1401(var52, "moveWarmUp", var55.field_2819);
                                                      var55.field_2820 = var7.method_1398(var52, "rotateSpeed", var55.field_2820);
                                                      Float var60 = var7.method_1398(var52, "resetAngle", (Float)null);
                                                      if (var60 != null) {
                                                         var55.field_2822 = var60;
                                                      }

                                                      boolean var61 = var7.method_1390(var52, "image_end_teamColors", var55.field_2817);
                                                      class_306 var62 = var14.method_3162(var0, var7.method_1393(var52, "image_foot", (String)null), var14.field_4169);
                                                      if (var62 != null) {
                                                         var55.field_2824 = var62;
                                                         if (var61) {
                                                            var55.field_2825 = var14.method_3161(var55.field_2824, var14.field_4170);
                                                         } else {
                                                            var55.field_2825 = null;
                                                         }
                                                      }

                                                      class_306 var63 = var14.method_3162(var0, var7.method_1393(var52, "image_end", (String)null), var14.field_4169);
                                                      if (var63 != null) {
                                                         var55.field_2824 = var63;
                                                         if (var61) {
                                                            var55.field_2825 = var14.method_3161(var55.field_2824, var14.field_4170);
                                                         } else {
                                                            var55.field_2825 = null;
                                                         }
                                                      }

                                                      class_306 var64 = var14.method_3162(var0, var7.method_1393(var52, "image_foot_shadow", (String)null), var14.field_4169);
                                                      if (var64 != null) {
                                                         var55.field_2826 = var64;
                                                      }

                                                      class_306 var65 = var14.method_3162(var0, var7.method_1393(var52, "image_end_shadow", (String)null), var14.field_4169);
                                                      if (var65 != null) {
                                                         var55.field_2826 = var65;
                                                      }

                                                      class_306 var66 = var14.method_3162(var0, var7.method_1393(var52, "image_leg", (String)null), var14.field_4169);
                                                      if (var66 != null) {
                                                         var55.field_2823 = var66;
                                                      }

                                                      class_306 var67 = var14.method_3162(var0, var7.method_1393(var52, "image_middle", (String)null), var14.field_4169);
                                                      if (var67 != null) {
                                                         var55.field_2823 = var67;
                                                      }

                                                      Float var68 = var7.method_1398(var52, "heightSpeed", (Float)null);
                                                      if (var68 != null) {
                                                         var55.field_2821 = var68;
                                                      }

                                                      Boolean var69 = var7.method_1390(var52, "draw_foot_on_top", (Boolean)null);
                                                      if (var69 != null) {
                                                         var55.field_2827 = var69;
                                                      }

                                                      Boolean var70 = var7.method_1390(var52, "dust_effect", (Boolean)null);
                                                      if (var70 != null) {
                                                         var55.field_2828 = var70;
                                                      }

                                                      Float var71 = var7.method_1398(var52, "holdDisMin", (Float)null);
                                                      if (var71 != null) {
                                                         var55.field_2829 = var71;
                                                      }

                                                      var55.field_2830 = var7.method_1397(var52, "holdDisMin_maxMovingLegs", var55.field_2830);
                                                      var55.field_2831 = var7.method_1390(var52, "hold_moveOnlyIfFurthest", var55.field_2831);
                                                      var55.field_2815 = var7.method_1390(var52, "holdDisMin_checkNeighbours", var55.field_2815);
                                                      var55.field_2816 = var7.method_1390(var52, "favourOppositeSideNeighbours", var55.field_2816);
                                                      Float var72 = var7.method_1398(var52, "holdDisMax", (Float)null);
                                                      if (var72 != null) {
                                                         var55.field_2832 = var72;
                                                      }

                                                      Float var73 = var7.method_1398(var52, "hardLimit", (Float)null);
                                                      if (var73 != null) {
                                                         var55.field_2833 = var73;
                                                      }

                                                      var55.field_2834 = var7.method_1390(var52, "drawOverBody", var55.field_2834);
                                                      if (var55.field_2834) {
                                                         var14.field_4412 = true;
                                                      }

                                                      var55.field_2835 = var7.method_1390(var52, "drawUnderAllUnits", var55.field_2835);
                                                      if (var55.field_2835) {
                                                         var14.field_4413 = true;
                                                      }

                                                      if (var55.field_2835 && var55.field_2834) {
                                                         throw new RuntimeException("Both drawUnderAllUnits and drawOverBody can not be set true at the same time in leg/arm");
                                                      }

                                                      var55.field_2836 = var7.method_1398(var52, "drawDirOffset", var55.field_2836);
                                                      var55.field_2838 = var7.method_1398(var52, "spinRate", var55.field_2838);
                                                      var50.add(var55);
                                                   } else {
                                                      var50.add((Object)null);
                                                   }
                                                }
                                             }

                                             ArrayList var122 = new ArrayList();
                                             Iterator var123 = var115.iterator();

                                             class_358 var124;
                                             while(var123.hasNext()) {
                                                var124 = (class_358)var123.next();
                                                if (var124 != null) {
                                                   var122.add(var124);
                                                }
                                             }

                                             var123 = var117.iterator();

                                             while(var123.hasNext()) {
                                                var124 = (class_358)var123.next();
                                                if (var124 != null) {
                                                   var122.add(var124);
                                                }
                                             }

                                             for(int var125 = var122.size() - 1; var125 >= 0; var124.field_2805 = var125--) {
                                                var124 = (class_358)var122.get(var125);
                                             }

                                             var14.field_4411 = (class_358[])var122.toArray(new class_358[0]);
                                             var123 = var14.field_4314.iterator();

                                             while(var123.hasNext()) {
                                                class_485 var127 = (class_485)var123.next();
                                                var127.method_3199(var14);
                                             }

                                             var14.method_3176();
                                             String var126 = var7.method_1393(var8, "fireTurretXAtSelfOnDeath", (String)null);
                                             if (var126 != null && !"NONE".equalsIgnoreCase(var126)) {
                                                class_365 var128 = var14.method_3189(var126);
                                                if (var128 == null) {
                                                   throw new RuntimeException("Cannot find turret:" + var126 + " for [" + var8 + "]fireTurretXAtSelfOnDeath");
                                                }

                                                var14.field_4246 = var128.field_2913;
                                             }

                                             var14.field_4234 = var7.method_1390(var10, "dieOnAttack", false);
                                             var14.field_4360 = var7.method_1391(var10, "canAttack");
                                             var14.field_4361 = LogicBoolean.create(var7.method_1392(var10, "canAttackFlyingUnits"));
                                             var14.field_4362 = LogicBoolean.create(var7.method_1392(var10, "canAttackLandUnits"));
                                             var14.field_4363 = LogicBoolean.create(var7.method_1392(var10, "canAttackUnderwaterUnits"));
                                             var14.field_4364 = LogicBoolean.create(var7.method_1393(var10, "canAttackNotTouchingWaterUnits", (String)null), LogicBoolean.trueBoolean);
                                             var14.field_4365 = var7.method_1390(var10, "isFixedFiring", false);
                                             var14.field_4366 = var7.method_1398(var10, "aimOffsetSpread", 0.6F);
                                             var14.field_4395 = var7.method_1390(var12, "disableUse", false);
                                             var14.field_4396 = var7.method_1397(var12, "maxGlobal", -1);
                                             var14.field_4397 = var7.method_1397(var12, "maxEachBase", 2);
                                             var14.field_4398 = var7.method_1398(var12, "buildPriority", 0.05F);
                                             var14.field_4399 = var7.method_1398(var12, "nonInBaseExtraPriority", 0.04F);
                                             var14.field_4399 = var7.method_1398(var12, "noneInBaseExtraPriority", var14.field_4399);
                                             var14.field_4400 = var7.method_1398(var12, "nonGlobalExtraPriority", 0.0F);
                                             var14.field_4400 = var7.method_1398(var12, "noneGlobalExtraPriority", var14.field_4400);
                                             var14.field_4401 = var7.method_1393(var12, "upgradedFrom", (String)null);
                                             Float var129 = var7.method_1398(var12, "ai_upgradePriority", (Float)null);
                                             if (var129 != null && var129 != -1.0F) {
                                                if (var129 < 0.0F || var129 > 1.0F) {
                                                   throw new RuntimeException("[ai]ai_upgradePriority: " + var14.field_4402 + " must be between 0-1 or -1 for default");
                                                }

                                                var14.field_4402 = var129 * 100.0F;
                                             }

                                             if (var14.field_4360) {
                                                for(var51 = 0; var51 < var14.field_4405.length; ++var51) {
                                                   class_365 var130 = var14.field_4405[var51];
                                                   if (var130.field_2934 && var130.field_2964 == null) {
                                                      if (var130.field_2919 > 140.0F && (var14.field_4357 == -1 || var14.field_4405[var14.field_4357].field_2919 < var130.field_2919)) {
                                                         var14.field_4357 = var51;
                                                      }

                                                      if (var130.field_2920 > 80.0F) {
                                                         var14.field_4358 = var51;
                                                      }
                                                   }
                                                }
                                             }

                                             if (var14.field_4279 == -2) {
                                                if (var14.field_4387 == class_503.field_4620) {
                                                   var14.field_4279 = 5;
                                                } else if (var14.method_134()) {
                                                   if (var14.field_4176 != null) {
                                                      var14.field_4279 = 3;
                                                   } else {
                                                      var14.field_4279 = 2;
                                                   }
                                                } else if (var14.field_4341 < -2.0F) {
                                                   var14.field_4279 = 1;
                                                } else if (var14.field_4374 > 0) {
                                                   var14.field_4279 = 3;
                                                } else {
                                                   var14.field_4279 = 2;
                                                }
                                             }

                                             if (var14.field_4425.size() > 0) {
                                                var14.field_4426 = (class_492[])var14.field_4425.toArray(new class_492[0]);
                                             }

                                             var7.method_1385();
                                             if (var4 != null) {
                                                ++var4.field_1751;
                                             }

                                             field_4186.add(var14);
                                             return var14;
                                          }

                                          var46 = (class_365)var111.next();
                                          var46.field_2951 *= var14.field_4218;
                                          var46.field_2914 *= var14.field_4218;
                                          var46.field_2915 *= var14.field_4218;
                                          var46.field_2952 *= var14.field_4218;
                                       } while(!var46.field_2934);

                                       if (var46.field_2953 >= 99999.0F) {
                                          var112 = false;
                                       } else {
                                          var110 = true;
                                          if (var14.field_4332 > var46.field_2953) {
                                             var14.field_4332 = var46.field_2953;
                                          }

                                          if (class_296.method_2042(var46.field_2953 - var14.field_4331) > 5.0F) {
                                             boolean var47 = false;
                                             Iterator var48 = var14.field_4225.iterator();

                                             while(var48.hasNext()) {
                                                class_494 var49 = (class_494)var48.next();
                                                if (class_296.method_2042(var46.field_2953 - var49.field_4518) < 5.0F) {
                                                   var47 = true;
                                                }
                                             }

                                             if (!var47) {
                                                class_494 var118 = new class_494();
                                                var118.field_4518 = var46.field_2953;
                                                var14.field_4225.add(var118);
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var75) {
         method_3160(var0, var75, var4);
         return null;
      } catch (class_361 var76) {
         method_3160(var0, var76, var4);
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Exception, com.corrodinggames.rts.game.units.ap) void
   public static strictfp void method_3159(String var0, Exception var1, class_24 var2) {
      class_215 var3 = null;
      if (var2 instanceof class_479) {
         class_479 var4 = (class_479)var2;
         var3 = var4.field_4213;
      }

      method_3160(var0, var1, var3);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.Exception, com.corrodinggames.rts.gameFramework.e.b) void
   public static strictfp void method_3160(String var0, Exception var1, class_215 var2) {
      class_236 var3 = class_236.method_1549();
      class_236.method_1588("Error while loading unit:" + var0);
      var1.printStackTrace();
      String var4;
      if (var1 instanceof class_361) {
         var4 = var1.getMessage();
      } else {
         var4 = class_296.method_2089(var1);
      }

      var4 = var4.replace(var0 + ": ", "");
      var4 = var4.replace(var0, "");
      String var5;
      if (var2 != null) {
         var5 = var2.field_1742;
         class_236.method_1591("baseUnitPath:" + var5);
         class_236.method_1591("customUnit:" + var0);
         if (var0.startsWith(var5)) {
            var0 = var0.substring(var5.length());
            if (var0.startsWith("/")) {
               var0 = var0.substring(1);
            }

            if (var0.startsWith("\\")) {
               var0 = var0.substring(1);
            }
         }

         var0 = var0 + " (in mod " + var2.method_1422() + ")";
      }

      var5 = "Error loading unit: " + var0 + ": \n" + var4;
      if (var1 instanceof class_361) {
         class_361 var6 = (class_361)var1;
         if (var6.field_2845 != null || var6.field_2846 != null) {
            var5 = var5 + " (section:" + var6.field_2845 + ", key:" + var6.field_2846 + ")";
         }
      }

      boolean var9 = false;
      if (var2 != null) {
         var9 = var2.field_1739;
      }

      if (!var9) {
         var3.method_1608(var5, 1);
      } else {
         class_236.method_1588("Not showing error, mod disabled");
      }

      if (field_4196 != null) {
         field_4196 = var5;
      }

      if (var2 != null) {
         var2.field_1754 = var5;
      } else {
         try {
            Thread.sleep(2L);
         } catch (InterruptedException var8) {
         }

         throw new RuntimeException(var1);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.e, com.corrodinggames.rts.game.l) com.corrodinggames.rts.gameFramework.h.e[]
   public strictfp class_306[] method_3161(class_306 var1, class_246 var2) {
      boolean var3 = false;
      if ((this.field_4213 != null || this.field_4369) && !class_236.method_1549().field_1937.disableModLazyLoad) {
         var3 = true;
      }

      if (this.field_4276 && this.field_4277) {
         var3 = true;
      }

      class_306[] var4 = class_107.method_949(var1, var2, var3);

      for(int var5 = 0; var5 < var4.length; ++var5) {
         if (var3 && this.field_4213 != null && this.field_4369 && var5 == 1) {
            var4[var5].method_2136();
         }

         this.field_4203.add(var4[var5]);
      }

      method_3157(var4);
      return var4;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, boolean) com.corrodinggames.rts.gameFramework.h.e
   public strictfp class_306 method_3162(String var1, String var2, boolean var3) {
      class_306 var4 = method_3163(var1, var2, var3, this);
      if (!this.field_4202.contains(var4)) {
         this.field_4202.add(var4);
      }

      return var4;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, boolean, com.corrodinggames.rts.game.units.custom.g) com.corrodinggames.rts.gameFramework.h.e
   public static strictfp class_306 method_3163(String var0, String var1, boolean var2, class_479 var3) {
      if (var1 == null) {
         return null;
      } else if (var1.equalsIgnoreCase("NONE")) {
         return null;
      } else {
         boolean var4 = false;
         if (var1.startsWith("SHADOW:")) {
            var1 = var1.substring("SHADOW:".length());
            var4 = true;
         }

         if (var1.startsWith("SHARED:")) {
            var1 = var1.substring("SHARED:".length());
            var0 = "units/shared/common.ini";
         }

         if (var1.startsWith("SHADOW:")) {
            var1 = var1.substring("SHADOW:".length());
            var4 = true;
         }

         class_236 var5 = class_236.method_1549();
         String var7 = class_296.method_2078(var0) + "/";
         String var8 = "[" + var2 + "," + var4 + "]" + var7 + var1;
         class_306 var9 = method_3165(var8);
         if (var9 != null) {
            return var9;
         } else {
            class_196 var6;
            try {
               var6 = method_3168(var7, var1, var3);
            } catch (IOException var14) {
               throw new RuntimeException(var14);
            }

            if (var6 == null) {
               throw new RuntimeException("IO Error: Failed to open: " + class_236.method_1637(var7 + var1));
            } else {
               class_306 var10;
               try {
                  var10 = var5.field_1935.method_62(var6, true);
               } catch (RuntimeException var13) {
                  throw new RuntimeException("Error decode image from: " + class_236.method_1637(var7 + var1), var13);
               }

               try {
                  var6.close();
               } catch (Exception var12) {
                  var12.printStackTrace();
               }

               if (var10 == null) {
                  throw new RuntimeException("Failed to decode image: " + class_236.method_1637(var7 + var1));
               } else {
                  var10.method_2116(var2);
                  if (var4) {
                     var10 = class_39.method_210(var10, var10.field_2531, var10.field_2532);
                  }

                  method_3156(var10);
                  method_3164(var8, var10);
                  return var10;
               }
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.h.e) void
   public static strictfp void method_3164(String var0, class_306 var1) {
      field_4197.put(var0, var1);
   }

   // $FF: renamed from: c (java.lang.String) com.corrodinggames.rts.gameFramework.h.e
   public static strictfp class_306 method_3165(String var0) {
      class_306 var1 = (class_306)field_4197.get(var0);
      if (var1 != null) {
         ++field_4200;
         method_3156(var1);
         var1.method_2133();
         return var1;
      } else {
         if (field_4201) {
            class_236.method_1591("loadImageInConf: cache miss: " + var0);
         }

         ++field_4199;
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, com.corrodinggames.rts.game.units.custom.g) com.corrodinggames.rts.gameFramework.a.i
   public static strictfp class_299 method_3166(String var0, String var1, class_479 var2) {
      if (var1 == null) {
         return null;
      } else if (var1.equalsIgnoreCase("NONE")) {
         return null;
      } else {
         class_236 var3 = class_236.method_1549();
         if (!var1.contains(".")) {
            class_299 var14 = var3.field_1933.method_3321(var1);
            return var14;
         } else {
            if (var1.startsWith("SHARED:")) {
               var1 = var1.substring("SHARED:".length());
               var0 = "units/shared/common.ini";
            }

            boolean var4 = false;
            String var5 = class_296.method_2078(var0) + "/";
            String var6 = var5 + var1;
            class_299 var7 = (class_299)field_4198.get(var6);
            if (var7 != null) {
               return var7;
            } else if (!var1.toLowerCase().endsWith(".ogg") && !var1.toLowerCase().endsWith(".wav")) {
               throw new RuntimeException("Failed to open sound: " + var5 + "" + var1 + " only the ogg & wav sound formats are supported.");
            } else {
               class_196 var8;
               try {
                  var8 = method_3168(var5, var1, var2);
               } catch (IOException var13) {
                  throw new RuntimeException(var13);
               }

               if (var8 == null) {
                  String var15 = "IO Error: Failed to open: " + var5 + "" + var1;
                  throw new RuntimeException(var15);
               } else {
                  class_299 var9 = var3.field_1933.method_3325(var1, var8, var4);

                  try {
                     var8.close();
                  } catch (Exception var12) {
                     var12.printStackTrace();
                  }

                  if (var9 == null) {
                     boolean var10 = var1.toLowerCase().endsWith(".ogg");
                     String var11 = "Sound file found but failed to load: " + var6;
                     if (var10) {
                        var11 = var11 + " - Check if this file is truly a ogg";
                     }

                     throw new RuntimeException(var11);
                  } else {
                     field_4198.put(var6, var9);
                     return var9;
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, com.corrodinggames.rts.gameFramework.e.b) boolean
   public static strictfp boolean method_3167(String var0, String var1, class_215 var2) {
      if (var1 == null) {
         return true;
      } else if (!var1.contains("..")) {
         return true;
      } else if (class_236.method_1653()) {
         return true;
      } else {
         File var3 = new File(class_236.method_1637(var0 + var1));
         String var4 = var3.getCanonicalPath();
         String var5 = (new File(class_236.method_1637("units"))).getCanonicalPath();
         if (var4.startsWith(var5)) {
            return true;
         } else {
            String var6 = var2.method_1426();
            boolean var7 = var4.startsWith(var6);
            if (!var7) {
               class_236.method_1588("File: '" + var4 + "' is not within mod: '" + var6 + "'");
            }

            return var7;
         }
      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String, com.corrodinggames.rts.game.units.custom.g) com.corrodinggames.rts.gameFramework.utility.j
   public static strictfp class_196 method_3168(String var0, String var1, class_479 var2) {
      class_215 var3 = null;
      if (var2 != null) {
         var3 = var2.field_4213;
      } else {
         class_236.method_1595("findAssetSteam meta==null");
      }

      if (var3 != null && !method_3167(var0, var1, var3)) {
         throw new IOException("File is outside mod: " + var0 + var1);
      } else {
         return class_296.method_2080(var0 + var1);
      }
   }

   // $FF: renamed from: d (java.lang.String) com.corrodinggames.rts.game.units.ap
   public static strictfp class_24 method_3169(String var0) {
      Iterator var1 = field_4189.keySet().iterator();

      class_24 var2;
      do {
         if (!var1.hasNext()) {
            return null;
         }

         var2 = (class_24)var1.next();
      } while(!var2.method_141().equals(var0));

      return (class_24)field_4189.get(var2);
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.ap) com.corrodinggames.rts.game.units.ap
   public static strictfp class_24 method_3170(class_24 var0) {
      return (class_24)field_4189.get(var0);
   }

   // $FF: renamed from: e (java.lang.String) com.corrodinggames.rts.game.units.custom.g
   public static strictfp class_479 method_3171(String var0) {
      Iterator var1 = field_4187.iterator();

      class_479 var2;
      do {
         if (!var1.hasNext()) {
            var1 = field_4187.iterator();

            do {
               if (!var1.hasNext()) {
                  return null;
               }

               var2 = (class_479)var1.next();
            } while(!var2.field_4207.contains(var0));

            return var2;
         }

         var2 = (class_479)var1.next();
      } while(!var0.equals(var2.field_4204));

      return var2;
   }

   // $FF: renamed from: a (boolean, com.corrodinggames.rts.game.units.custom.g) com.corrodinggames.rts.game.units.custom.e
   public static strictfp class_66 method_3172(boolean var0, class_479 var1) {
      class_66 var2 = new class_66(var0, var1);
      return var2;
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.game.units.custom.l) com.corrodinggames.rts.game.units.custom.l
   public strictfp class_486 method_3173(String var1, class_486 var2) {
      class_486 var3;
      if (var1 != null) {
         var3 = new class_486(this);
         var3.field_4500 = var1;
         var3.method_3205();
         return var3;
      } else if (var2 != null) {
         var3 = new class_486(this);
         var3.field_4500 = var2.field_4500;
         var3.method_3205();
         return var3;
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.h, com.corrodinggames.rts.game.units.custom.m, boolean) com.corrodinggames.rts.game.units.custom.m
   strictfp class_485 method_3174(class_482 var1, class_485 var2, boolean var3) {
      class_485 var4 = this.method_3175(var1);
      if (var4 != null) {
         if (var3 && var2 != null && var2.method_3201()) {
            throw new class_361("Cannot define animation " + var1.name() + " on graphics and with onAction at same time");
         } else {
            return var4;
         }
      } else {
         return var2;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.h) com.corrodinggames.rts.game.units.custom.m
   strictfp class_485 method_3175(class_482 var1) {
      Iterator var2 = this.field_4314.iterator();

      class_485 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_485)var2.next();
      } while(!var3.method_3200(var1));

      return var3;
   }

   // $FF: renamed from: C () void
   public strictfp void method_3176() {
      for(int var1 = 0; var1 < this.field_4411.length; ++var1) {
         class_358 var2 = this.field_4411[var1];
         float var3 = -1.0F;
         class_358 var4 = null;
         float var5 = 1.0F;
         if (var2.field_2816) {
            var5 = 0.1F;
         }

         for(int var6 = 0; var6 < this.field_4411.length; ++var6) {
            class_358 var7 = this.field_4411[var6];
            if (var2 != var7 && !var7.field_2813) {
               float var8 = class_296.method_2026(var2.field_2808 * var5, var2.field_2809, var7.field_2808 * var5, var7.field_2809);
               if (var4 == null || var8 < var3) {
                  var3 = var8;
                  var4 = var7;
               }
            }
         }

         var3 = class_296.method_2019(var3) + 2.0F;
         var3 *= var3;
         ArrayList var10 = new ArrayList();

         int var11;
         for(var11 = 0; var11 < this.field_4411.length; ++var11) {
            class_358 var12 = this.field_4411[var11];
            if (var2 != var12 && !var12.field_2813) {
               float var9 = class_296.method_2026(var2.field_2808 * var5, var2.field_2809, var12.field_2808 * var5, var12.field_2809);
               if (var9 <= var3) {
                  var10.add(var12.field_2805);
               }
            }
         }

         var2.field_2837 = new int[var10.size()];

         for(var11 = 0; var11 < var10.size(); ++var11) {
            var2.field_2837[var11] = (Integer)var10.get(var11);
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.game.units.custom.u) com.corrodinggames.rts.game.units.custom.u
   public strictfp class_493 method_3177(String var1, class_493 var2) {
      if (var1 == null && var2 != null) {
         return var2;
      } else {
         class_493 var3 = new class_493(this, var1, (g$1)null);
         var3.method_3214();
         return var3;
      }
   }

   // $FF: renamed from: f (java.lang.String) com.corrodinggames.rts.game.units.custom.u
   public strictfp class_493 method_3178(String var1) {
      class_493 var2 = new class_493(this, var1, (g$1)null);
      return var2;
   }

   // $FF: renamed from: g (java.lang.String) com.corrodinggames.rts.game.units.custom.z
   public strictfp class_498 method_3179(String var1) {
      if (var1.toUpperCase().startsWith("CUSTOM:")) {
         var1 = var1.substring("CUSTOM:".length());
         Iterator var2 = this.field_4415.iterator();

         class_498 var3;
         do {
            if (!var2.hasNext()) {
               throw new class_361("Failed to find custom effect with the name:" + var1);
            }

            var3 = (class_498)var2.next();
         } while(!var1.equalsIgnoreCase(var3.name));

         return var3;
      } else if (var1.contains(":")) {
         throw new class_361("Unknown effect format:" + var1 + " expected built-in effect or CUSTOM:");
      } else if ("small".equalsIgnoreCase(var1)) {
         return new class_498(class_357.field_2797);
      } else if ("medium".equalsIgnoreCase(var1)) {
         return new class_498(class_357.field_2798);
      } else if ("large".equalsIgnoreCase(var1)) {
         return new class_498(class_357.field_2799);
      } else if ("smoke".equalsIgnoreCase(var1)) {
         return new class_498(class_357.field_2800);
      } else if ("shockwave".equalsIgnoreCase(var1)) {
         return new class_498(class_357.field_2801);
      } else if ("largeExplosion".equalsIgnoreCase(var1)) {
         return new class_498(class_357.field_2802);
      } else if ("smallExplosion".equalsIgnoreCase(var1)) {
         return new class_498(class_357.field_2803);
      } else {
         throw new class_361("Failed to find built-in effect with the name:" + var1);
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, com.corrodinggames.rts.gameFramework.utility.z, java.lang.String, java.lang.String, java.lang.String, boolean) void
   public static strictfp void method_3180(class_479 var0, class_210 var1, String var2, String var3, String var4, boolean var5) {
      String var6 = var1.method_1393(var2, var3 + "convertTo", (String)null);
      String var7 = var1.method_1393(var2, var3 + "whenBuilding_temporarilyConvertTo", (String)null);
      Float var8 = var1.method_1398(var2, var3 + "addEnergy", (Float)null);
      class_477 var9 = class_477.method_3115(var1, var2, var3 + "addResources", true);
      String var10 = var1.method_1393(var2, var3 + "fireTurretXAtGround", (String)null);
      LogicBoolean var11 = LogicBoolean.create(var1.method_1393(var2, var3 + "alsoTriggerOrQueueActionConditional", (String)null));
      String var12 = var1.method_1393(var2, var3 + "alsoTriggerAction", (String)null);
      String var13 = var1.method_1393(var2, var3 + "alsoQueueAction", (String)null);
      String var14 = var1.method_1393(var2, var3 + "spawnEffects", (String)null);
      String var15 = var1.method_1393(var2, var3 + "spawnEffectsOnQueue", (String)null);
      String var16 = var1.method_1393(var2, var3 + "playSoundAtUnit", (String)null);
      String var17 = var1.method_1393(var2, var3 + "playSoundGlobally", (String)null);
      String var18 = var1.method_1393(var2, var3 + "playSoundToPlayer", (String)null);
      String var19 = var1.method_1393(var2, var3 + "playSoundToPlayerOnQueue", (String)null);
      String var20 = var1.method_1393(var2, var3 + "addUnitsIntoTransport", (String)null);
      LogicBoolean var21 = LogicBoolean.create(var1.method_1393(var2, var3 + "resetCustomTimer", (String)null));
      boolean var22 = false;
      if (var5) {
         var22 = true;
      } else {
         if (var6 != null || var7 != null || var8 != null || var10 != null || var9.method_3127()) {
            var22 = true;
         }

         if (var12 != null || var13 != null || var14 != null || var20 != null) {
            var22 = true;
         }

         if (var16 != null || var17 != null || var18 != null || var19 != null) {
            var22 = true;
         }
      }

      if (var22) {
         if ("NONE".equalsIgnoreCase(var6)) {
            var6 = null;
         }

         if ("NONE".equalsIgnoreCase(var7)) {
            var7 = null;
         }

         if (var10 != null && var10.equalsIgnoreCase("NONE")) {
            var10 = null;
         }

         class_496 var23 = new class_496();
         var23.field_4524 = var0.field_4417.size();
         var23.field_4525 = var4;
         var23.field_4534 = var1.method_1398(var2, var3 + "pos", 999.0F);
         var23.field_4535 = class_477.method_3115(var1, var2, var3 + "price", true);
         var23.field_4541 = var1.method_1390(var2, var3 + "highPriorityQueue", false);
         var23.field_4542 = var1.method_1390(var2, var3 + "onlyOneUnitAtATime", false);
         var23.field_4543 = var1.method_1390(var2, var3 + "canPlayerCancel", true);
         if (!var23.field_4543) {
            var23.field_4530 = class_516.field_4683;
         } else {
            var23.field_4530 = class_516.field_4685;
         }

         var23.field_4536 = LogicBoolean.create(var1.method_1393(var2, var3 + "isActive", (String)null));
         var23.field_4537 = LogicBoolean.create(var1.method_1393(var2, var3 + "isVisible", (String)null));
         var23.field_4538 = LogicBoolean.create(var1.method_1393(var2, var3 + "isLocked", (String)null));
         var23.field_4539 = method_3154(var1, var2, var3 + "isLockedMessage", (String)null);
         if (var23.field_4538 == LogicBoolean.falseBoolean) {
            var23.field_4538 = null;
         }

         var23.field_4540 = LogicBoolean.create(var1.method_1393(var2, var3 + "ai_isDisabled", (String)null), LogicBoolean.falseBoolean);
         var23.field_4566 = (class_518)var1.method_1409(var2, var3 + "displayType", var23.field_4566, m.class);
         var23.field_4569 = var1.method_1390(var2, var3 + "displayRemainingStockpile", false);
         var23.field_4526 = var1.method_1393(var2, var3 + "text", var23.field_4526);
         var23.field_4527 = var23.field_4526;
         if (var23.field_4527 != null && var23.field_4527.startsWith("i:")) {
            var23.field_4527 = class_432.method_2744(var23.field_4527.substring(2));
         }

         var23.field_4528 = var1.method_1393(var2, var3 + "description", var23.field_4528);
         var23.field_4529 = var23.field_4528;
         if (var23.field_4529 != null) {
            if (var23.field_4529.startsWith("i:")) {
               var23.field_4529 = class_432.method_2744(var23.field_4529.substring(2));
            } else {
               var23.field_4529 = var23.field_4529.replace("\\n", "\n");
            }
         }

         var23.field_4546 = var1.method_1403(var2, var3 + "buildSpeed", var23.field_4546);
         var23.field_4547 = var1.method_1390(var2, var3 + "whenBuilding_cannotMove", var23.field_4547);
         var23.field_4548 = var0.method_3173(var1.method_1393(var2, var3 + "whenBuilding_playAnimation", (String)null), var23.field_4548);
         var23.field_4549 = var1.method_1398(var2, var3 + "whenBuilding_rotateTo", var23.field_4549);
         var23.field_4550 = var1.method_1390(var2, var3 + "whenBuilding_rotateTo_orBackwards", var23.field_4550);
         var23.field_4551 = var1.method_1390(var2, var3 + "whenBuilding_rotateTo_waitTillRotated", var23.field_4551);
         if (var23.field_4547 || var23.field_4548 != null || var23.field_4549 != null) {
            var0.field_4230 = true;
         }

         var23.field_4573 = class_497.field_4576;
         boolean var24 = false;
         if (var6 != null && !"NONE".equalsIgnoreCase(var6)) {
            var23.field_4531 = var6;
            var23.field_4545 = false;
            var24 = true;
         }

         if (var7 != null && !"NONE".equalsIgnoreCase(var7)) {
            var23.field_4532 = var0.method_3184(var7, var3 + "whenBuilding_temporarilyConvertTo", var2);
            var24 = true;
         }

         if (var8 != null) {
            var23.field_4552 = var8;
            var24 = true;
         }

         if (var9 != null && var9.method_3127()) {
            var23.field_4553 = var9;
            var24 = true;
         }

         var23.field_4555 = var1.method_1399(var2, var3 + "fireTurretXAtGround_withOffset", (PointF)null);
         String var25 = var1.method_1393(var2, var3 + "fireTurretXAtGround_withProjectile", (String)null);
         if (var25 != null) {
            var23.field_4556 = var0.method_3190(var25);
            if (var23.field_4556 == null) {
               throw new RuntimeException("Cannot find projectile:" + var25 + " for [" + var2 + "]" + var3 + "fireTurretXAtGround_withProjectile");
            }
         }

         if (var10 != null) {
            class_365 var26 = var0.method_3189(var10);
            if (var26 == null) {
               throw new RuntimeException("Cannot find turret:" + var10 + " for [" + var2 + "]" + var3 + "fireTurretXAtGround");
            }

            var23.field_4554 = var26.field_2913;
            if (var23.field_4555 == null) {
               var23.field_4530 = class_516.field_4689;
            }

            var24 = true;
         }

         var23.field_4557 = var11;
         if (var12 != null && !"NONE".equalsIgnoreCase(var12)) {
            var23.field_4558 = var0.method_3185(var12, "alsoTriggerAction", var2);
            var24 = true;
         }

         if (var13 != null && !"NONE".equalsIgnoreCase(var13)) {
            var23.field_4559 = var0.method_3185(var13, "alsoQueueAction", var2);
            var24 = true;
         }

         if (var14 != null) {
            var23.field_4560 = var0.method_3177(var14, (class_493)null);
            var24 = true;
         }

         if (var15 != null) {
            var23.field_4561 = var0.method_3177(var15, (class_493)null);
            var24 = true;
         }

         if (var16 != null) {
            var23.field_4562 = class_359.method_2309(var0, var16);
            var24 = true;
         }

         if (var17 != null) {
            var23.field_4563 = class_359.method_2309(var0, var17);
            var24 = true;
         }

         if (var18 != null) {
            var23.field_4564 = class_359.method_2309(var0, var18);
            var24 = true;
         }

         if (var19 != null) {
            var23.field_4565 = class_359.method_2309(var0, var19);
            var24 = true;
         }

         if (var21 != null) {
            var23.field_4567 = var21;
            var24 = true;
         }

         if (var20 != null) {
            var23.field_4568 = class_364.method_2313(var0, var20, var2, "addUnitsIntoTransport");
            var24 = true;
         }

         LogicBoolean var28 = LogicBoolean.create(var1.method_1393(var2, var3 + "autoTrigger", (String)null));
         var23.field_4533 = var24;
         if (var28 != null && var24) {
            class_492 var27 = new class_492();
            var27.field_4513 = var28;
            var27.field_4514 = new class_136(var23, var0.method_3184(var23.field_4531, "[" + var2 + "]" + var3, var2));
            var0.field_4425.add(var27);
         }

         if (var23.field_4531 != null && var23.field_4535 != null && var23.field_4535.field_4156 > 0) {
            var0.field_4418 = true;
         }

         var0.field_4417.add(var23);
      }

   }

   // $FF: renamed from: s () boolean
   public strictfp boolean method_126() {
      return this.field_4267;
   }

   // $FF: renamed from: r () boolean
   public strictfp boolean method_127() {
      if (this.field_4269) {
         class_236 var1 = class_236.method_1549();
         if (var1.method_1656() && var1.field_1944.field_3863.field_3783) {
            return true;
         }
      }

      return this.field_4268;
   }

   // $FF: renamed from: c () int
   public strictfp int method_130() {
      return this.field_4270;
   }

   // $FF: renamed from: t () float
   public strictfp float method_132() {
      return this.field_4271;
   }

   // $FF: renamed from: g () int
   public strictfp int method_133() {
      return this.field_4272;
   }

   // $FF: renamed from: a () com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_128() {
      return method_3172(false, this);
   }

   // $FF: renamed from: c (boolean) com.corrodinggames.rts.game.units.aa
   public strictfp class_39 method_3181(boolean var1) {
      return method_3172(var1, this);
   }

   // $FF: renamed from: e () java.lang.String
   public strictfp String method_139() {
      if (this.field_4419 != class_432.field_3652 || this.field_4420 == null) {
         this.field_4419 = class_432.field_3652;
         String var1 = this.field_4214 != null ? this.field_4214.method_2303() : this.field_4204;
         String var2 = this.field_4204;
         if (this.field_4216 != null) {
            var2 = this.field_4216;
         }

         this.field_4420 = class_432.method_2743("units." + var2 + ".name", var1);
      }

      return this.field_4420;
   }

   // $FF: renamed from: f () java.lang.String
   public strictfp String method_140() {
      if (this.field_4419 != class_432.field_3652 || this.field_4421 == null) {
         this.field_4419 = class_432.field_3652;
         String var1 = this.field_4215 != null ? this.field_4215.method_2303() : this.field_4204;
         String var2 = this.field_4204;
         if (this.field_4216 != null) {
            var2 = this.field_4216;
         }

         this.field_4421 = class_432.method_2743("units." + var2 + ".description", var1);
      }

      return this.field_4421;
   }

   // $FF: renamed from: j () boolean
   public strictfp boolean method_134() {
      return this.field_4219;
   }

   // $FF: renamed from: l () boolean
   public strictfp boolean method_136() {
      return this.field_4392;
   }

   // $FF: renamed from: k () boolean
   public strictfp boolean method_135() {
      return this.field_4391;
   }

   // $FF: renamed from: m () com.corrodinggames.rts.game.units.ac
   public strictfp class_503 method_137() {
      return this.field_4387;
   }

   // $FF: renamed from: n () boolean
   public strictfp boolean method_138() {
      return this.field_4220;
   }

   // $FF: renamed from: a (java.util.ArrayList, int) void
   public strictfp void method_3182(ArrayList var1, int var2) {
      if (this.field_4374 != 0 && this.field_4378) {
         var1.add(class_91.field_796);
         var1.add(class_91.field_797);
      }

   }

   // $FF: renamed from: h () void
   public strictfp void method_142() {
      this.field_4422 = new class_513[3];

      for(int var1 = 1; var1 <= 3; ++var1) {
         class_513 var2 = new class_513();
         this.method_3182(var2.field_4679, var1);
         this.field_4422[var1 - 1] = var2;
      }

   }

   // $FF: renamed from: a (int) java.util.ArrayList
   public strictfp ArrayList method_143(int var1) {
      if (this.field_4422 == null) {
         throw new RuntimeException("specialActionLists==null for:" + this.field_4204 + " t:" + var1);
      } else {
         return this.field_4422[var1 - 1].field_4679;
      }
   }

   // $FF: renamed from: i () java.lang.String
   public strictfp String method_141() {
      return this.field_4204;
   }

   // $FF: renamed from: q () java.lang.String
   public strictfp String method_144() {
      return this.field_4204;
   }

   // $FF: renamed from: b (int) int
   public strictfp int method_131(int var1) {
      int var2 = this.method_130();
      return var2;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.game.units.a.s
   public strictfp class_133 method_129() {
      return this.field_4423;
   }

   // $FF: renamed from: d (boolean) long
   public strictfp long method_3183(boolean var1) {
      return class_305.method_2107(this.field_4212, var1);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) com.corrodinggames.rts.game.units.custom.q
   public strictfp class_489 method_3184(String var1, String var2, String var3) {
      if (var1 == null) {
         return null;
      } else {
         class_489 var4 = new class_489();
         var4.field_4506 = var2;
         var4.field_4507 = var3;
         var4.field_4508 = var1;
         this.field_4424.add(var4);
         return var4;
      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String, java.lang.String) com.corrodinggames.rts.game.units.custom.r
   public strictfp class_491 method_3185(String var1, String var2, String var3) {
      class_491 var4 = new class_491();
      var4.a = var2;
      var4.b = var3;
      var4.c = "(known unit:)" + this.method_141();
      var4.d = this;
      var4.e = true;
      var4.field_4511 = var1;
      this.field_4424.add(var4);
      return var4;
   }

   // $FF: renamed from: d (com.corrodinggames.rts.game.units.ap) com.corrodinggames.rts.game.units.custom.q
   public static strictfp class_489 method_3186(class_24 var0) {
      if (var0 == null) {
         return null;
      } else {
         class_489 var1 = new class_489();
         var1.field_4506 = "known";
         var1.field_4509 = var0;
         var1.field_4510 = true;
         return var1;
      }
   }

   // $FF: renamed from: d (int) com.corrodinggames.rts.game.units.custom.g
   public static strictfp class_479 method_3187(int var0) {
      if (var0 >= 100) {
         int var1 = var0 - 100;
         if (var1 < field_4190.size()) {
            class_479 var2 = (class_479)field_4190.get(var1);
            return var2;
         }
      }

      return null;
   }

   // $FF: renamed from: D () java.util.ArrayList
   public static strictfp ArrayList method_3188() {
      ArrayList var0 = new ArrayList();
      int var1 = 100;

      for(Iterator var2 = field_4190.iterator(); var2.hasNext(); ++var1) {
         class_479 var3 = (class_479)var2.next();
         var0.add(var1);
      }

      return var0;
   }

   // $FF: renamed from: h (java.lang.String) com.corrodinggames.rts.game.units.custom.ai
   public strictfp class_365 method_3189(String var1) {
      Iterator var2 = this.field_4407.iterator();

      class_365 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_365)var2.next();
      } while(!var3.field_2909.equalsIgnoreCase(var1));

      return var3;
   }

   // $FF: renamed from: i (java.lang.String) com.corrodinggames.rts.game.units.custom.af
   public strictfp class_363 method_3190(String var1) {
      Iterator var2 = this.field_4408.iterator();

      class_363 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_363)var2.next();
      } while(!var3.field_2847.equalsIgnoreCase(var1));

      return var3;
   }

   // $FF: renamed from: j (java.lang.String) com.corrodinggames.rts.game.units.custom.v
   public strictfp class_496 method_3191(String var1) {
      Iterator var2 = this.field_4417.iterator();

      class_496 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_496)var2.next();
      } while(var3.field_4525 == null || !var3.field_4525.equalsIgnoreCase(var1));

      return var3;
   }

   // $FF: renamed from: k (java.lang.String) com.corrodinggames.rts.game.units.a.l
   public strictfp class_121 method_3192(String var1) {
      ArrayList var2 = this.method_143(this.field_4272);
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         class_121 var4 = (class_121)var3.next();
         if (var4 instanceof class_136) {
            class_136 var5 = (class_136)var4;
            if (var5.field_1364.field_4525.equalsIgnoreCase(var1)) {
               return var5;
            }
         }
      }

      return null;
   }
}
