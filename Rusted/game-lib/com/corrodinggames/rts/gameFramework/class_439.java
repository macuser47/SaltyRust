package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.f.class_454;
import java.util.ArrayList;
import java.util.HashMap;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.aj
public class class_439 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.an
   public static class_310 field_3678 = new class_311();
   // $FF: renamed from: b java.lang.Object
   Object field_3679 = new Object();
   // $FF: renamed from: c java.lang.Object
   Object field_3680 = new Object();
   // $FF: renamed from: d float
   volatile float field_3681 = 1.0F;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.ar
   class_411 field_3682;
   // $FF: renamed from: f boolean
   volatile boolean field_3683 = false;
   // $FF: renamed from: g boolean
   volatile boolean field_3684 = true;
   // $FF: renamed from: h float
   float field_3685 = 0.0F;
   // $FF: renamed from: i int
   int field_3686 = 0;
   // $FF: renamed from: j boolean
   boolean field_3687 = false;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.ap
   class_320 field_3688;
   // $FF: renamed from: l boolean
   boolean field_3689;
   // $FF: renamed from: m java.lang.String
   String field_3690;
   // $FF: renamed from: n boolean
   boolean field_3691;
   // $FF: renamed from: o boolean
   boolean field_3692;
   // $FF: renamed from: p float
   float field_3693;
   // $FF: renamed from: q float
   float field_3694;
   // $FF: renamed from: r float
   float field_3695;
   // $FF: renamed from: s boolean
   public boolean field_3696;
   // $FF: renamed from: t boolean
   public boolean field_3697;
   // $FF: renamed from: u java.lang.String
   String field_3698;
   // $FF: renamed from: v android.content.Context
   Context field_3699;
   // $FF: renamed from: w boolean
   boolean field_3700;
   // $FF: renamed from: x com.corrodinggames.rts.gameFramework.ap
   class_320 field_3701;
   // $FF: renamed from: y boolean
   boolean field_3702;
   // $FF: renamed from: z boolean
   boolean field_3703;
   // $FF: renamed from: A float
   float field_3704;
   // $FF: renamed from: B boolean
   boolean field_3705 = false;
   // $FF: renamed from: C boolean
   boolean field_3706 = false;
   // $FF: renamed from: D float
   float field_3707;
   // $FF: renamed from: E java.util.ArrayList
   ArrayList field_3708 = new ArrayList();
   // $FF: renamed from: F java.util.HashMap
   static HashMap field_3709 = new HashMap();
   // $FF: renamed from: G int
   static int field_3710 = 0;
   // $FF: renamed from: H boolean
   boolean field_3711;
   // $FF: renamed from: I boolean
   boolean field_3712;
   // $FF: renamed from: J long
   long field_3713 = -1L;

   // $FF: renamed from: a () float
   public float method_2751() {
      class_236 var1 = class_236.method_1549();
      return var1.field_1937.musicVolume * var1.field_1937.masterVolume;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2752() {
      if (class_236.field_1899 && !class_236.field_1900) {
         return false;
      } else if (this.field_3697) {
         return false;
      } else {
         return this.method_2751() > 0.01F;
      }
   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_2753(Context var1) {
      this.field_3699 = var1;
      if (!class_236.field_1899 || class_236.field_1900) {
         field_3678.method_2151(this);
         this.field_3688 = field_3678.method_2150();
         this.field_3701 = field_3678.method_2150();
         class_409.method_2630();
         if (field_3678.method_2154()) {
            this.field_3682 = new class_411(this);
            this.field_3682.start();
         }

      }
   }

   // $FF: renamed from: c () void
   public void method_2754() {
      if (!class_236.method_1654()) {
         this.field_3689 = false;
         this.field_3690 = null;
         this.field_3700 = true;
         this.field_3702 = false;
      }

      this.field_3697 = false;
   }

   // $FF: renamed from: a (java.lang.String, boolean) com.corrodinggames.rts.gameFramework.ao
   static class_315 method_2755(String var0, boolean var1) {
      class_315 var2 = (class_315)field_3709.get(var0);
      if (var2 != null) {
         return var2;
      } else {
         System.gc();

         class_315 var3;
         try {
            var3 = field_3678.method_2149(var0);
         } catch (ArithmeticException var5) {
            ++field_3710;
            class_236.method_1589("Error loading:" + var0, var5);
            if (field_3710 > 2) {
               class_236.method_1549().method_1607("Failed to load music track:" + var0 + ". Music track skipped.");
            }

            if (!var1) {
               throw new RuntimeException(var5);
            }

            return null;
         } catch (OutOfMemoryError var6) {
            ++field_3710;
            class_236.method_1589("OutOfMemoryError loading:" + var0, var6);
            class_236.method_1659();
            System.gc();
            class_236.method_1659();
            class_236.method_1549().method_1607("Ran out of memory loading music track:" + var0 + ". Music track skipped.");
            if (!var1) {
               throw new RuntimeException(var6);
            }

            return null;
         } catch (Exception var7) {
            ++field_3710;
            class_236.method_1589("Exception loading:" + var0, var7);
            if (field_3710 > 2) {
               class_236.method_1549().method_1607("Unknown error loading music track:" + var0 + ". Music track skipped.");
            }

            if (!var1) {
               throw new RuntimeException(var7);
            }

            return null;
         }

         if (!var1) {
            class_236.method_1588("getMusicHandleAndCache loading file not onload");
         } else {
            field_3709.put(var0, var3);
         }

         return var3;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.aq) java.lang.String
   public String method_2756(class_409 var1) {
      return this.method_2757(var1, var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.aq, com.corrodinggames.rts.gameFramework.aq) java.lang.String
   public String method_2757(class_409 var1, class_409 var2) {
      class_409 var4;
      if (class_296.method_2035(var1.method_2629().length + var2.method_2629().length) < var1.method_2629().length) {
         var4 = var1;
      } else {
         var4 = var2;
      }

      String[] var3 = var4.method_2629();
      return var4.method_2632(var3[class_296.method_2035(var3.length)]);
   }

   // $FF: renamed from: d () void
   public synchronized void method_2758() {
      this.field_3696 = true;
      this.field_3697 = false;
   }

   // $FF: renamed from: a (float) void
   public synchronized void method_2759(float var1) {
      if (!class_236.field_1899 || class_236.field_1900) {
         if (!field_3678.method_2154()) {
            if (!this.field_3711) {
               this.method_2761(var1);
            }

            this.field_3684 = true;
         }

         this.field_3713 = class_236.method_1596();
         class_236 var2 = class_236.method_1549();
         if (var2.field_1940.field_3607.method_2715()) {
            this.method_2758();
         }

         if (this.field_3698 != null) {
            class_454.method_2890((String)null, this.field_3698);
            this.field_3698 = null;
         }

         if (this.field_3693 != this.method_2751()) {
            this.field_3693 = this.method_2751();
            this.field_3692 = true;
         }

         synchronized(this.field_3680) {
            this.field_3681 = var1;
            if (this.field_3711) {
               if (!this.field_3712) {
                  this.field_3712 = true;
                  class_236.method_1652("Music subsystem crashed, music has been disabled to keep your game running. Please send your logs.");
               }

            } else {
               if (!this.field_3684) {
                  this.field_3685 += var1;
                  ++this.field_3686;
                  if (this.field_3685 > 320.0F && this.field_3686 > 80 && !this.field_3687) {
                     this.field_3687 = true;
                     class_236.method_1652("Lockup detected in music subsystem");
                  }
               } else {
                  this.field_3685 = 0.0F;
                  this.field_3686 = 0;
               }

               this.field_3684 = false;
               this.field_3683 = true;
               this.field_3680.notifyAll();
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_2760(String var1) {
      var1 = class_296.method_2092(var1);
      var1 = class_296.method_2077(var1);
      var1 = var1.replace("[noloop]", "");
      var1 = var1.replace("_", " ");
      return var1;
   }

   // $FF: renamed from: b (float) boolean
   public boolean method_2761(float var1) {
      try {
         this.method_2762(var1);
         return true;
      } catch (Exception var5) {
         class_236.method_1589("Music system crashed", var5);
         this.field_3711 = true;
         class_236.method_1591("Stopping music");

         try {
            this.method_2764();
         } catch (Exception var4) {
            class_236.method_1589("crash stopping music", var4);
         }

         return false;
      }
   }

   // $FF: renamed from: c (float) void
   public void method_2762(float var1) {
      if (!class_236.field_1899 || class_236.field_1900) {
         field_3678.method_2148(var1);
         if (!this.method_2752()) {
            if (this.field_3689 && this.field_3688.method_2172()) {
               this.method_2764();
               this.field_3689 = false;
               this.field_3702 = false;
            }

         } else {
            boolean var2 = false;
            if (!this.field_3689) {
               var2 = true;
            }

            if (this.field_3691) {
               if (!this.field_3703) {
                  this.field_3694 += var1;
               }

               if (this.field_3694 > 600.0F) {
                  this.field_3695 += var1;
                  if (this.field_3695 > 100.0F) {
                     this.field_3695 = 0.0F;
                     if (!this.field_3689 || !this.field_3688.method_2172()) {
                        class_236.method_1591("Next music track after non loop, timer:" + this.field_3694);
                        var2 = true;
                        this.field_3694 = 0.0F;
                     }
                  }
               }
            } else {
               this.field_3694 += var1;
               if (this.field_3694 > 3600.0F) {
                  class_236.method_1591("Next music track, timer:" + this.field_3694);
                  var2 = true;
                  this.field_3694 = 0.0F;
               }
            }

            boolean var3;
            if (var2 || this.field_3696) {
               var3 = this.field_3696;
               if (this.field_3696) {
                  class_236.method_1591("Next music track requested");
                  this.field_3696 = false;
                  this.field_3694 = 0.0F;
               }

               String var4;
               if (this.field_3700) {
                  var4 = this.method_2756(class_409.field_3381);
               } else {
                  var4 = this.method_2757(class_409.field_3382, class_409.field_3381);
               }

               if (var3 || this.field_3708.contains(var4)) {
                  for(int var5 = 0; var5 < 30 && (var4.equals(this.field_3690) || this.field_3708.contains(var4)); ++var5) {
                     var4 = this.method_2757(class_409.field_3382, class_409.field_3381);
                     if (var5 > 20) {
                        this.field_3708.clear();
                     }
                  }
               }

               if (!var4.equals(this.field_3690)) {
                  this.field_3690 = var4;
                  this.field_3700 = false;
                  this.field_3694 = 0.0F;
                  this.field_3691 = var4.contains("[noloop]");
                  this.field_3708.add(var4);
                  if (this.field_3708.size() > 4) {
                     this.field_3708.remove(0);
                  }

                  if (var3) {
                     this.field_3698 = "Now playing: " + this.method_2760(var4);
                  }

                  class_236.method_1591("setting up music:" + var4);
                  class_320 var8 = this.field_3688;
                  this.field_3688 = this.field_3701;
                  this.field_3701 = var8;
                  class_315 var6 = method_2755(var4, false);
                  this.field_3688.method_2165(var6);
                  this.field_3688.method_2168(!this.field_3691);
                  this.field_3705 = false;
                  if (!var3 && this.field_3702) {
                     this.field_3705 = true;
                  }

                  if (this.field_3689) {
                     this.field_3702 = true;
                  }

                  this.field_3703 = true;
                  this.field_3706 = false;
                  this.field_3704 = 1.0F;
                  this.field_3689 = true;
               } else if (var3) {
                  class_236.method_1591("Same music found");
               }
            }

            if (this.field_3703 || this.field_3692) {
               var3 = field_3678.method_2153();
               if (!var3) {
                  this.field_3704 -= var1 * 0.006F;
               } else if (this.field_3705) {
                  this.field_3704 -= var1 * 0.003F;
               } else {
                  this.field_3704 -= var1 * 0.008F;
               }

               float var7;
               float var9;
               if (!var3) {
                  var7 = this.field_3704 * this.method_2751();
                  var9 = (1.0F - this.field_3704) * this.method_2751();
               } else {
                  var7 = (this.field_3704 * 2.0F - 1.0F) * this.method_2751();
                  var9 = (1.0F - this.field_3704 * 2.0F) * this.method_2751();
               }

               var7 = class_296.method_2023(var7, 0.0F, 1.0F);
               var9 = class_296.method_2023(var9, 0.0F, 1.0F);
               if (this.field_3703) {
                  if (this.field_3704 <= 0.0F) {
                     this.field_3703 = false;
                     this.field_3705 = false;
                     if (this.field_3702 && !this.field_3706) {
                        this.field_3706 = true;
                        this.field_3701.method_2169();
                     }

                     if (this.field_3689) {
                        class_236.method_1591("scurrent.setVolume:" + this.method_2751());
                        this.field_3688.method_2166(this.method_2751(), this.method_2751());
                     }
                  } else {
                     this.field_3707 += var1;
                     if (this.field_3707 > 10.0F) {
                        this.field_3707 = 0.0F;
                        if (this.field_3702 && !this.field_3706) {
                           this.field_3701.method_2166(var7, var7);
                           if (var7 < 0.02F) {
                              this.field_3706 = true;
                              this.field_3701.method_2169();
                           }
                        }

                        if (this.field_3689) {
                           this.field_3688.method_2166(var9, var9);
                        }
                     }
                  }
               } else if (this.field_3689) {
                  this.field_3688.method_2166(var9, var9);
               }
            }

            this.field_3692 = false;
         }
      }
   }

   // $FF: renamed from: e () void
   public void method_2763() {
      Log.method_1708("RustedWarfare", "Music:pause()");
      aj$1 var1 = new aj$1(this);
      var1.start();
   }

   // $FF: renamed from: f () void
   public void method_2764() {
      if (this.field_3689) {
         this.field_3688.method_2170();
      }

      if (this.field_3702) {
         this.field_3701.method_2170();
      }

   }

   // $FF: renamed from: g () void
   public void method_2765() {
      aj$2 var1 = new aj$2(this);
      var1.start();
   }

   // $FF: renamed from: h () void
   public void method_2766() {
      field_3678.method_2152();
      if (this.field_3702) {
         this.field_3701.method_2169();
         this.field_3701.method_2173();
      }

      if (this.field_3688 != null) {
         this.field_3688.method_2169();
         this.field_3688.method_2173();
      }

      this.field_3688 = null;
      this.field_3690 = null;
      this.field_3689 = false;
   }
}
