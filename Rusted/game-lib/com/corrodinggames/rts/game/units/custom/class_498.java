package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.b.class_390;
import com.corrodinggames.rts.gameFramework.b.class_391;
import com.corrodinggames.rts.gameFramework.b.class_393;
import com.corrodinggames.rts.gameFramework.b.class_394;
import com.corrodinggames.rts.gameFramework.b.class_395;
import com.corrodinggames.rts.gameFramework.utility.class_205;
import com.corrodinggames.rts.gameFramework.utility.class_210;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.z
public class class_498 {
   public String name;
   private class_357 builtInEffect = null;
   class_394 imageStrip;
   public boolean createWhenOffscreen;
   public boolean createWhenZoomedOut;
   public boolean createWhenOverLiquid;
   public boolean createWhenOverLand;
   public float spawnChance = 1.0F;
   class_493 ifSpawnFailsEmitEffects;
   public float life = 200.0F;
   public boolean showInFog;
   public float xOffsetRelative;
   public float yOffsetRelative;
   public float hOffset;
   public boolean alwayStartDirAtZero;
   public float dirOffset;
   public float xOffsetRelativeRandom;
   public float yOffsetRelativeRandom;
   public float hOffsetRandom;
   public float dirOffsetRandom;
   public float xOffsetAbsolute;
   public float yOffsetAbsolute;
   public float xOffsetAbsoluteRandom;
   public float yOffsetAbsoluteRandom;
   public float xSpeedRelative;
   public float ySpeedRelative;
   public float hSpeed;
   public float dirSpeed;
   public float xSpeedRelativeRandom;
   public float ySpeedRelativeRandom;
   public float hSpeedRandom;
   public float dirSpeedRandom;
   public float xSpeedAbsolute;
   public float ySpeedAbsolute;
   public float xSpeedAbsoluteRandom;
   public float ySpeedAbsoluteRandom;
   public class_395 priority;
   public float scaleTo;
   public float scaleFrom;
   public float alpha;
   public int color;
   public boolean shadow;
   public short drawLayer;
   public float fadeInTime;
   public boolean fadeOut;
   public float delayedStartTimer;
   public float delayedStartTimerRandom;
   public int frameIndex;
   public int frameIndexRandom;
   public int stripIndex;
   public boolean attachedToUnit;
   public boolean liveAfterAttachedDies;
   public boolean atmospheric;
   public boolean physics;
   public float physicsGravity;
   public int animateFrameStart;
   public int animateFrameEnd;
   public int animateFrameStartRandomAdd;
   public boolean animateFramePingPong;
   public float animateFrameSpeed;
   public float animateFrameSpeedRandom;
   class_493 alsoEmitEffects;
   class_359 alsoPlaySound;
   public static ArrayList fields;

   public class_498(class_357 var1) {
      this.priority = class_395.field_3223;
      this.scaleTo = 1.0F;
      this.scaleFrom = 1.0F;
      this.alpha = 1.0F;
      this.color = -1;
      this.drawLayer = 2;
      this.physicsGravity = 1.0F;
      this.builtInEffect = var1;
   }

   class_498(String var1) {
      this.priority = class_395.field_3223;
      this.scaleTo = 1.0F;
      this.scaleFrom = 1.0F;
      this.alpha = 1.0F;
      this.color = -1;
      this.drawLayer = 2;
      this.physicsGravity = 1.0F;
      this.name = var1;
   }

   // $FF: renamed from: a (float, float, float, float, com.corrodinggames.rts.gameFramework.u, int) com.corrodinggames.rts.gameFramework.b.e
   public class_390 method_3217(float var1, float var2, float var3, float var4, class_34 var5, int var6) {
      class_236 var7 = class_236.method_1549();
      if (this.spawnChance < 1.0F && class_296.method_2033(0.0F, 1.0F) > this.spawnChance) {
         if (var6 < 5 && this.ifSpawnFailsEmitEffects != null) {
            this.ifSpawnFailsEmitEffects.method_3216(var1, var2, var3, var4, var5, var6 + 1);
         }

         return null;
      } else if (this.builtInEffect != null) {
         class_390 var16;
         if (this.builtInEffect == class_357.field_2797) {
            var16 = var7.field_1938.method_2466(var1, var2, var3, var4);
         } else if (this.builtInEffect == class_357.field_2798) {
            var16 = var7.field_1938.method_2468(var1, var2, var3, var4, 0);
            if (var16 != null) {
               var16.field_3145 = 0.75F;
               var16.field_3144 = 0.75F;
            }
         } else if (this.builtInEffect == class_357.field_2799) {
            var16 = var7.field_1938.method_2468(var1, var2, var3, var4, 0);
         } else if (this.builtInEffect == class_357.field_2800) {
            var16 = var7.field_1938.method_2470(var1, var2, var3, var4, 0);
         } else if (this.builtInEffect == class_357.field_2801) {
            var16 = var7.field_1938.method_2480(var1, var2, var3, 0);
         } else if (this.builtInEffect == class_357.field_2802) {
            var7.field_1938.method_2460(var1, var2, var3);
            var16 = null;
         } else {
            if (this.builtInEffect != class_357.field_2803) {
               throw new RuntimeException("Unhandled built-in type:" + this.builtInEffect);
            }

            var16 = var7.field_1938.method_2463(var1, var2, var3);
         }

         if (var16 == null) {
            return null;
         } else {
            var16.field_3179 = 2;
            if (var5 != null) {
               class_391.method_2471(var16, var5);
            }

            return var16;
         }
      } else if (!this.createWhenZoomedOut && !var7.field_1993) {
         return null;
      } else if (!this.createWhenOverLiquid && class_205.method_1373(var1, var2)) {
         return null;
      } else if (!this.createWhenOverLand && !class_205.method_1373(var1, var2)) {
         return null;
      } else {
         if (this.createWhenOffscreen) {
            var7.field_1938.method_2487();
         } else {
            var7.field_1938.method_2486();
         }

         boolean var11 = this.showInFog;
         boolean var12 = false;
         if (!var11 && this.attachedToUnit) {
            var12 = true;
            var11 = true;
         }

         class_390 var13 = var7.field_1938.method_2488(var1, var2, var3, class_393.field_3201, var11, this.priority);
         if (var13 == null) {
            return null;
         } else {
            if (var12 && !this.showInFog) {
               var13.field_3122 = false;
            }

            var13.field_3160 = this.life;
            var13.field_3161 = var13.field_3160;
            var13.field_3178 = this.stripIndex;
            if (this.imageStrip != null) {
               var13.field_3177 = this.imageStrip;
            }

            var13.field_3176 = this.frameIndex;
            if (this.frameIndexRandom != 0) {
               var13.field_3176 += class_296.method_2036(-this.frameIndexRandom, this.frameIndexRandom);
               if (var13.field_3176 < 0) {
                  var13.field_3176 = 0;
               }
            }

            if (this.alwayStartDirAtZero) {
               var13.field_3162 = 0.0F;
            } else {
               var13.field_3162 = var4;
            }

            var13.field_3162 += this.dirOffset;
            var13.field_3162 += this.method_3218(-this.dirOffsetRandom, this.dirOffsetRandom);
            float var14;
            float var15;
            if (this.xOffsetRelativeRandom != 0.0F || this.yOffsetRelativeRandom != 0.0F || this.xOffsetRelative != 0.0F || this.yOffsetRelative != 0.0F) {
               var14 = this.xOffsetRelative + this.method_3218(-this.xOffsetRelativeRandom, this.xOffsetRelativeRandom);
               var15 = this.yOffsetRelative + this.method_3218(-this.yOffsetRelativeRandom, this.yOffsetRelativeRandom);
               var13.field_3147 += class_296.method_2099(var4) * var15 - class_296.method_2098(var4) * var14;
               var13.field_3148 += class_296.method_2098(var4) * var15 + class_296.method_2099(var4) * var14;
            }

            var13.field_3149 += this.hOffset + this.method_3218(-this.hOffsetRandom, this.hOffsetRandom);
            var13.field_3175 = true;
            var13.field_3135 = true;
            var13.field_3179 = this.drawLayer;
            var13.field_3145 = this.scaleFrom;
            var13.field_3144 = this.scaleTo;
            var13.field_3143 = this.alpha;
            var13.field_3141 = this.color;
            if (this.fadeInTime != 0.0F) {
               var13.field_3136 = true;
               var13.field_3137 = this.fadeInTime;
            }

            var13.field_3180 = this.shadow;
            var13.field_3135 = this.fadeOut;
            var13.field_3159 = this.delayedStartTimer;
            var13.field_3159 += this.method_3218(-this.delayedStartTimerRandom, this.delayedStartTimerRandom);
            var13.field_3138 = this.atmospheric;
            var13.field_3139 = this.physics;
            var13.field_3140 = this.physicsGravity;
            var13.field_3134 = this.priority;
            var13.field_3154 = this.xSpeedAbsolute + this.method_3218(-this.xSpeedAbsoluteRandom, this.xSpeedAbsoluteRandom);
            var13.field_3155 = this.ySpeedAbsolute + this.method_3218(-this.ySpeedAbsoluteRandom, this.ySpeedAbsoluteRandom);
            if (this.xSpeedRelative != 0.0F || this.ySpeedRelative != 0.0F || this.xSpeedRelativeRandom != 0.0F || this.ySpeedRelativeRandom != 0.0F) {
               var14 = this.xSpeedRelative + this.method_3218(-this.xSpeedRelativeRandom, this.xSpeedRelativeRandom);
               var15 = this.ySpeedRelative + this.method_3218(-this.ySpeedRelativeRandom, this.ySpeedRelativeRandom);
               var13.field_3154 += class_296.method_2099(var4) * var15 - class_296.method_2098(var4) * var14;
               var13.field_3155 += class_296.method_2098(var4) * var15 + class_296.method_2099(var4) * var14;
            }

            var13.field_3156 = this.hSpeed + this.method_3218(-this.hSpeedRandom, this.hSpeedRandom);
            var13.field_3163 = this.dirSpeed + this.method_3218(-this.dirSpeedRandom, this.dirSpeedRandom);
            if (this.animateFrameStart != this.animateFrameEnd) {
               var13.field_3168 = true;
            }

            var13.field_3169 = this.animateFrameStart;
            if (this.animateFrameStartRandomAdd != 0) {
               var13.field_3169 += class_296.method_2036(0, this.animateFrameStartRandomAdd);
            }

            var13.field_3170 = this.animateFrameEnd;
            var13.field_3173 = (float)this.animateFrameStart;
            var13.field_3171 = this.animateFramePingPong;
            var13.field_3172 = this.animateFrameSpeed;
            var13.field_3172 += this.method_3218(-this.animateFrameSpeedRandom, this.animateFrameSpeedRandom);
            if (var5 != null && this.attachedToUnit) {
               class_391.method_2471(var13, var5);
               var13.field_3121 = this.liveAfterAttachedDies;
            }

            if (this.alsoPlaySound != null) {
               this.alsoPlaySound.method_2307(var1, var2, 1.0F);
            }

            if (var6 < 5 && this.alsoEmitEffects != null) {
               this.alsoEmitEffects.method_3216(var1, var2, var3, var4, var5, var6 + 1);
            }

            return var13;
         }
      }
   }

   // $FF: renamed from: a (float, float) float
   public float method_3218(float var1, float var2) {
      return var1 == var2 ? var1 : class_296.method_2033(var1, var2);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.g, com.corrodinggames.rts.gameFramework.utility.z, java.lang.String) void
   public void method_3219(class_479 var1, class_210 var2, String var3) {
      class_236 var4 = class_236.method_1549();
      this.createWhenOffscreen = var2.method_1390(var3, "createWhenOffscreen", false);
      this.createWhenZoomedOut = var2.method_1390(var3, "createWhenZoomedOut", true);
      this.createWhenOverLiquid = var2.method_1390(var3, "createWhenOverLiquid", true);
      this.createWhenOverLand = var2.method_1390(var3, "createWhenOverLand", true);
      if (!this.createWhenOverLiquid && !this.createWhenOverLand) {
         throw new RuntimeException(var3 + " effect cannot have both createWhenOverLiquid and createWhenOverLand set to false, it would never be created");
      } else {
         this.spawnChance = var2.method_1398(var3, "spawnChance", 1.0F);
         this.life = var2.method_1398(var3, "life", 200.0F);
         this.showInFog = var2.method_1390(var3, "showInFog", false);
         this.xOffsetRelative = var2.method_1398(var3, "xOffsetRelative", 0.0F);
         this.yOffsetRelative = var2.method_1398(var3, "yOffsetRelative", 0.0F);
         this.hOffset = var2.method_1398(var3, "hOffset", 0.0F);
         this.alwayStartDirAtZero = var2.method_1390(var3, "alwayStartDirAtZero", false);
         this.dirOffset = var2.method_1398(var3, "dirOffset", 0.0F);
         this.xOffsetRelativeRandom = var2.method_1398(var3, "xOffsetRelativeRandom", 0.0F);
         this.yOffsetRelativeRandom = var2.method_1398(var3, "yOffsetRelativeRandom", 0.0F);
         this.hOffsetRandom = var2.method_1398(var3, "hOffsetRandom", 0.0F);
         this.dirOffsetRandom = var2.method_1398(var3, "dirOffsetRandom", 0.0F);
         this.xOffsetAbsolute = var2.method_1398(var3, "xOffsetAbsolute", 0.0F);
         this.yOffsetAbsolute = var2.method_1398(var3, "yOffsetAbsolute", 0.0F);
         this.xOffsetAbsoluteRandom = var2.method_1398(var3, "xOffsetAbsoluteRandom", 0.0F);
         this.yOffsetAbsoluteRandom = var2.method_1398(var3, "yOffsetAbsoluteRandom", 0.0F);
         this.xSpeedRelative = var2.method_1398(var3, "xSpeedRelative", 0.0F);
         this.ySpeedRelative = var2.method_1398(var3, "ySpeedRelative", 0.0F);
         this.hSpeed = var2.method_1398(var3, "hSpeed", 0.0F);
         this.dirSpeed = var2.method_1398(var3, "dirSpeed", 0.0F);
         this.xSpeedRelativeRandom = var2.method_1398(var3, "xSpeedRelativeRandom", 0.0F);
         this.ySpeedRelativeRandom = var2.method_1398(var3, "ySpeedRelativeRandom", 0.0F);
         this.hSpeedRandom = var2.method_1398(var3, "hSpeedRandom", 0.0F);
         this.dirSpeedRandom = var2.method_1398(var3, "dirSpeedRandom", 0.0F);
         this.xSpeedAbsolute = var2.method_1398(var3, "xSpeedAbsolute", 0.0F);
         this.ySpeedAbsolute = var2.method_1398(var3, "ySpeedAbsolute", 0.0F);
         this.xSpeedAbsoluteRandom = var2.method_1398(var3, "xSpeedAbsoluteRandom", 0.0F);
         this.ySpeedAbsoluteRandom = var2.method_1398(var3, "ySpeedAbsoluteRandom", 0.0F);
         this.scaleTo = var2.method_1398(var3, "scaleTo", this.scaleTo);
         this.scaleFrom = var2.method_1398(var3, "scaleFrom", this.scaleFrom);
         this.alpha = var2.method_1398(var3, "alpha", this.alpha);
         this.color = var2.method_1394(var3, "color", this.color);
         this.shadow = var2.method_1390(var3, "shadow", false);
         this.drawLayer = 2;
         if (var2.method_1390(var3, "drawUnderUnits", false)) {
            this.drawLayer = 1;
         }

         this.fadeInTime = var2.method_1398(var3, "fadeInTime", 0.0F);
         this.fadeOut = var2.method_1390(var3, "fadeOut", true);
         this.delayedStartTimer = var2.method_1398(var3, "delayedStartTimer", 0.0F);
         this.delayedStartTimerRandom = var2.method_1398(var3, "delayedStartTimerRandom", 0.0F);
         this.frameIndex = var2.method_1397(var3, "frameIndex", 0);
         this.frameIndexRandom = var2.method_1397(var3, "frameIndexRandom", 0);
         String var5 = var2.method_1393(var3, "stripIndex", "0");
         this.stripIndex = var4.field_1938.method_2490(var5);
         if (this.stripIndex == -1) {
            throw new RuntimeException("Failed to find stripIndex with name:" + var5);
         } else {
            this.attachedToUnit = var2.method_1390(var3, "attachedToUnit", true);
            this.liveAfterAttachedDies = var2.method_1390(var3, "liveAfterAttachedDies", true);
            this.atmospheric = var2.method_1390(var3, "atmospheric", false);
            this.physics = var2.method_1390(var3, "physics", false);
            this.physicsGravity = var2.method_1398(var3, "physicsGravity", 1.0F);
            String var6 = var2.method_1393(var3, "priority", (String)null);
            if (var6 != null) {
               try {
                  this.priority = class_395.valueOf(var6);
               } catch (IllegalArgumentException var10) {
                  throw new RuntimeException("Unknown priority:" + var6);
               }
            }

            int var7 = var2.method_1397(var3, "total_frames", 1);
            if (var7 < 1) {
               throw new class_361("TOTAL_FRAMES cannot be: " + var7 + " (must be 1 or more)");
            } else {
               String var8 = var2.method_1393(var3, "image", (String)null);
               if (var8 != null) {
                  this.imageStrip = new class_394();
                  if (var7 == 1) {
                     this.imageStrip.field_3220 = true;
                  }

                  this.imageStrip.field_3218 = class_479.method_3163(var1.field_4211, var8, var1.field_4169, var1);
                  this.imageStrip.field_3212 = this.imageStrip.field_3218.method_2128() / var7;
                  this.imageStrip.field_3213 = this.imageStrip.field_3218.method_2127();
                  this.imageStrip.field_3214 = 0;
                  this.imageStrip.field_3215 = 0;
                  this.imageStrip.field_3216 = this.imageStrip.field_3212;
                  this.imageStrip.field_3217 = this.imageStrip.field_3213;
                  String var9 = var2.method_1393(var3, "imageShadow", (String)null);
                  if (var9 != null) {
                     this.imageStrip.field_3219 = class_479.method_3163(var1.field_4211, var9, var1.field_4169, var1);
                     this.shadow = true;
                  }

                  if (this.shadow && this.imageStrip.field_3219 == null) {
                     throw new class_361("imageShadow is required if image and shadow:true is used");
                  }
               }

               this.animateFrameStart = var2.method_1397(var3, "animateFrameStart", 0);
               this.animateFrameStartRandomAdd = var2.method_1397(var3, "animateFrameStartRandomAdd", 0);
               this.animateFrameEnd = var2.method_1397(var3, "animateFrameEnd", 0);
               this.animateFramePingPong = var2.method_1390(var3, "animateFramePingPong", false);
               this.animateFrameSpeed = var2.method_1401(var3, "animateFrameSpeed", 0.5F);
               this.animateFrameSpeedRandom = var2.method_1401(var3, "animateFrameSpeedRandom", 0.0F);
               if (var8 != null && this.animateFrameEnd > var7) {
                  throw new class_361("animateFrameEnd:" + this.animateFrameEnd + " cannot be larger than TOTAL_FRAMES: " + var7 + " (when using custom image)");
               } else {
                  this.alsoEmitEffects = var1.method_3178(var2.method_1393(var3, "alsoEmitEffects", (String)null));
                  this.ifSpawnFailsEmitEffects = var1.method_3178(var2.method_1393(var3, "ifSpawnFailsEmitEffects", (String)null));
                  this.alsoPlaySound = class_359.method_2310(var1, var2.method_1393(var3, "alsoPlaySound", (String)null), (class_359)null);
               }
            }
         }
      }
   }
}
