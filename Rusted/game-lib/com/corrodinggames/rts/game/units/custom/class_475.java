package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.a
public final class class_475 {
   // $FF: renamed from: m com.corrodinggames.rts.game.units.custom.m
   private class_485 field_4140;
   // $FF: renamed from: a float
   float field_4141;
   // $FF: renamed from: b float
   float field_4142 = 1.0F;
   // $FF: renamed from: c boolean
   boolean field_4143 = false;
   // $FF: renamed from: d boolean
   boolean field_4144 = false;
   // $FF: renamed from: e boolean
   boolean field_4145;
   // $FF: renamed from: f boolean
   boolean field_4146;
   // $FF: renamed from: g boolean
   boolean field_4147;
   // $FF: renamed from: h int
   int field_4148;
   // $FF: renamed from: i float
   float field_4149 = 0.0F;
   // $FF: renamed from: j float
   float field_4150 = 0.05F;
   // $FF: renamed from: k com.corrodinggames.rts.game.units.custom.e
   class_66 field_4151;
   // $FF: renamed from: l float[]
   float[] field_4152;

   public strictfp class_475(class_66 var1) {
      this.field_4151 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.m, int) void
   public strictfp void method_3102(class_485 var1, int var2) {
      this.method_3103(var1, var2, false);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.custom.m, int, boolean) void
   public strictfp void method_3103(class_485 var1, int var2, boolean var3) {
      if (var1 != null && var1.method_3201()) {
         if (!this.field_4147 && (!this.field_4144 || !this.field_4143) || var2 > this.field_4148 || var3 && var1 == this.field_4140) {
            this.field_4147 = true;
            if (var1 != this.field_4140 || var3 || this.field_4145) {
               float var4 = 0.0F;
               if (this.field_4140 != null && this.field_4143) {
                  var4 = this.field_4140.field_4493;
               }

               this.field_4140 = var1;
               this.field_4148 = var2;
               this.method_3106();
               this.field_4144 = var3;
               if (var3) {
                  this.field_4146 = false;
               } else {
                  this.field_4146 = true;
               }

               this.field_4141 = 0.0F;
               this.field_4142 = 1.0F;
               this.field_4145 = false;
               float var5 = var1.field_4492;
               if (var4 > var5) {
                  var5 = var4;
               }

               if (var5 > 0.0F) {
                  this.field_4149 = 1.0F;
                  this.field_4150 = var5;
               } else {
                  this.field_4149 = 0.0F;
               }
            }

            this.field_4143 = true;
         }
      }
   }

   // $FF: renamed from: a () void
   public strictfp void method_3104() {
      if (this.field_4140 != null) {
         if (!this.field_4145) {
            float var1 = this.field_4140.field_4493;
            if (var1 > 0.0F) {
               this.field_4145 = true;
               this.method_3106();
               this.field_4146 = false;
               this.field_4148 = -1;
               this.field_4149 = 1.0F;
               this.field_4150 = var1;
               return;
            }
         }

         boolean var2 = true;
         this.method_3107(var2);
      }

      this.field_4143 = false;
      this.field_4140 = null;
      this.field_4148 = -1;
   }

   // $FF: renamed from: a (float) void
   public strictfp void method_3105(float var1) {
      if (this.field_4143) {
         this.field_4141 += this.field_4142 * var1;
         if (this.field_4146 && !this.field_4147) {
            this.method_3104();
         }

         this.field_4147 = false;
         if (this.field_4143) {
            if (this.field_4149 > 0.0F) {
               this.field_4149 -= this.field_4150 * var1;
            } else if (this.field_4145) {
               this.method_3104();
               return;
            }

            if (!this.field_4145 && this.field_4140 != null) {
               if (this.field_4140.field_4491) {
                  if (this.field_4141 > this.field_4140.field_4496) {
                     this.field_4141 = this.field_4140.field_4496;
                     this.field_4142 = -1.0F;
                  } else if (this.field_4141 < 0.0F) {
                     this.field_4141 = 0.0F;
                     this.field_4142 = 1.0F;
                     if (this.field_4144) {
                        this.method_3104();
                        if (!this.field_4145) {
                           return;
                        }
                     }
                  }
               } else if (this.field_4141 > this.field_4140.field_4496) {
                  if (this.field_4144) {
                     this.method_3104();
                     if (!this.field_4145) {
                        return;
                     }
                  } else {
                     this.field_4141 = 0.0F;
                     this.field_4142 = 1.0F;
                  }
               }
            }

            boolean var2 = false;
            if (this.field_4145) {
               var2 = true;
            }

            this.method_3107(var2);
         }

      }
   }

   // $FF: renamed from: b () void
   strictfp void method_3106() {
      ArrayList var1 = this.field_4140.field_4494;
      if (this.field_4152 == null || this.field_4152.length < var1.size()) {
         this.field_4152 = new float[var1.size()];
      }

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         class_484 var3 = (class_484)var1.get(var2);
         class_483 var4 = var3.field_4479;
         class_480 var5;
         if (var4 == class_483.field_4469) {
            if (this.field_4151.field_566 != null && var3.field_4480 < this.field_4151.field_566.length) {
               var5 = this.field_4151.field_566[var3.field_4480];
               this.field_4152[var2] = var5.field_4446;
            } else {
               this.field_4152[var2] = 0.0F;
               class_236.method_1588("setBaseBlendValues: Target leg out of range for: " + this.field_4151.method_588().method_141());
            }
         } else if (var4 == class_483.field_4470) {
            if (this.field_4151.field_566 != null && var3.field_4480 < this.field_4151.field_566.length) {
               var5 = this.field_4151.field_566[var3.field_4480];
               this.field_4152[var2] = var5.field_4447;
            }
         } else if (var4 == class_483.field_4471) {
            if (this.field_4151.field_566 != null && var3.field_4480 < this.field_4151.field_566.length) {
               this.field_4151.field_566[var3.field_4480].field_4448 = class_296.method_2029(this.field_4151.field_566[var3.field_4480].field_4448, false);
               this.field_4152[var2] = this.field_4151.field_566[var3.field_4480].field_4448;
            }
         } else if (var4 == class_483.field_4472) {
            if (this.field_4151.field_566 != null && var3.field_4480 < this.field_4151.field_566.length) {
               this.field_4152[var2] = this.field_4151.field_566[var3.field_4480].field_4430;
            }
         } else if (var4 == class_483.field_4468) {
            this.field_4152[var2] = this.field_4151.field_533;
         } else if (var4 == class_483.field_4467) {
            this.field_4152[var2] = -99.0F;
         } else {
            this.field_4152[var2] = 0.0F;
            class_236.method_1588("Unsupported blend type:" + var4);
         }
      }

   }

   // $FF: renamed from: a (boolean) void
   strictfp void method_3107(boolean var1) {
      ArrayList var2 = this.field_4140.field_4494;

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         class_484 var4 = (class_484)var2.get(var3);
         class_483 var5 = var4.field_4479;
         float var6;
         if (var1) {
            var6 = 0.0F;
            if (var5 == class_483.field_4468) {
               var6 = 1.0F;
            }
         } else {
            var6 = var4.method_3198(this.field_4141);
         }

         if (this.field_4149 > 0.0F && var5 != class_483.field_4467) {
            var6 = var6 * (1.0F - this.field_4149) + this.field_4152[var3] * this.field_4149;
         }

         class_480 var7;
         if (var5 == class_483.field_4469) {
            if (this.field_4151.field_566 != null && var4.field_4480 < this.field_4151.field_566.length) {
               var7 = this.field_4151.field_566[var4.field_4480];
               var7.field_4446 = var6;
               var7.field_4441 = true;
               var7.field_4445 = true;
            }
         } else if (var5 == class_483.field_4470) {
            if (this.field_4151.field_566 != null && var4.field_4480 < this.field_4151.field_566.length) {
               var7 = this.field_4151.field_566[var4.field_4480];
               var7.field_4447 = var6;
               var7.field_4441 = true;
               var7.field_4445 = true;
            }
         } else if (var5 == class_483.field_4471 && this.field_4151.field_566 != null) {
            if (this.field_4151.field_566 != null && var4.field_4480 < this.field_4151.field_566.length) {
               this.field_4151.field_566[var4.field_4480].field_4448 = var6;
            }
         } else if (var5 == class_483.field_4472 && this.field_4151.field_566 != null) {
            if (this.field_4151.field_566 != null && var4.field_4480 < this.field_4151.field_566.length) {
               this.field_4151.field_566[var4.field_4480].field_4430 = var6;
            }
         } else if (var5 == class_483.field_4468) {
            this.field_4151.field_533 = var6;
         } else if (var5 == class_483.field_4467) {
            this.field_4151.field_531 = (int)var6;
         } else if (var5 == class_483.field_4473) {
         }
      }

   }
}
