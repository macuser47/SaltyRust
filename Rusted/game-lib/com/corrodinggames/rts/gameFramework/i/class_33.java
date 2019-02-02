package com.corrodinggames.rts.gameFramework.i;

import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.a.class_112;
import com.corrodinggames.rts.game.b.class_410;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.custom.class_479;
import com.corrodinggames.rts.game.units.custom.class_66;
import com.corrodinggames.rts.game.units.d.class_50;
import com.corrodinggames.rts.game.units.d.class_55;
import com.corrodinggames.rts.game.units.d.class_57;
import com.corrodinggames.rts.game.units.d.a.class_51;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.class_30;
import com.corrodinggames.rts.gameFramework.class_324;
import com.corrodinggames.rts.gameFramework.c.class_172;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_454;
import com.corrodinggames.rts.gameFramework.f.class_463;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.i.c
public class class_33 extends class_30 {
   // $FF: renamed from: a boolean
   boolean field_27 = false;
   // $FF: renamed from: b int
   int field_28;
   // $FF: renamed from: c int
   int field_29;
   // $FF: renamed from: d com.corrodinggames.rts.game.k
   class_107 field_30;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.i.g
   class_259 field_31;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.i.g
   class_259 field_32;
   // $FF: renamed from: g java.lang.String
   public String field_33;
   // $FF: renamed from: h boolean
   boolean field_34;
   // $FF: renamed from: i boolean
   public boolean field_35;
   // $FF: renamed from: j boolean
   boolean field_36;
   // $FF: renamed from: k boolean
   boolean field_37;
   // $FF: renamed from: l boolean
   boolean field_38;
   // $FF: renamed from: m boolean
   boolean field_39;
   // $FF: renamed from: n boolean
   public boolean field_40;
   // $FF: renamed from: o int
   int field_41;
   // $FF: renamed from: p java.lang.String
   String field_42;
   // $FF: renamed from: q int
   int field_43;
   // $FF: renamed from: r int
   int field_44;
   // $FF: renamed from: s int
   int field_45;
   // $FF: renamed from: t int
   int field_46;
   // $FF: renamed from: u float
   float field_47;
   // $FF: renamed from: v float
   float field_48;
   // $FF: renamed from: w float
   float field_49;
   // $FF: renamed from: x com.corrodinggames.rts.gameFramework.i.e
   class_261 field_50;
   // $FF: renamed from: y java.util.ArrayList
   ArrayList field_51;
   // $FF: renamed from: z android.graphics.Paint
   public Paint field_52;
   // $FF: renamed from: A android.graphics.Paint
   public Paint field_53;
   // $FF: renamed from: B android.graphics.Paint
   public Paint field_54;
   // $FF: renamed from: C android.graphics.Paint
   public Paint field_55;
   // $FF: renamed from: D boolean
   final boolean field_56;
   // $FF: renamed from: E java.util.ArrayList
   public ArrayList field_57;
   // $FF: renamed from: F android.graphics.PointF
   PointF field_58;
   // $FF: renamed from: G int
   int field_59;
   // $FF: renamed from: H float
   float field_60;
   // $FF: renamed from: I com.corrodinggames.rts.gameFramework.i.f
   class_258 field_61;
   // $FF: renamed from: J boolean
   public boolean field_62;
   // $FF: renamed from: K java.util.ArrayList
   public ArrayList field_63;
   // $FF: renamed from: L android.graphics.PointF
   PointF field_64;
   // $FF: renamed from: M boolean
   boolean field_65;
   // $FF: renamed from: N boolean
   boolean field_66;

   public class_33() {
      this.field_32 = class_259.field_2289;
      this.field_41 = 0;
      this.field_42 = null;
      this.field_43 = 0;
      this.field_44 = 2;
      this.field_45 = 1;
      this.field_46 = 0;
      this.field_47 = 3000.0F;
      this.field_48 = 0.0F;
      this.field_49 = 0.0F;
      this.field_50 = class_261.field_2304;
      this.field_51 = new ArrayList();
      this.field_56 = true;
      this.field_57 = new ArrayList();
      this.field_58 = new PointF();
      this.field_59 = 0;
      this.field_60 = 0.0F;
      this.field_61 = new class_258(this);
      this.field_63 = new ArrayList();
      this.field_64 = new PointF();
      this.field_65 = false;
      this.field_66 = false;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      var1.method_2540(this.field_34);
      var1.method_2541(this.field_41);
      var1.method_2541(this.field_43);
      var1.method_2541(this.field_44);
      var1.method_2541(this.field_45);
      var1.method_2541(this.field_46);
      var1.method_2542(this.field_47);
      var1.method_2542(this.field_48);
      var1.method_2542(this.field_49);
      var1.method_2540(this.field_36);
      var1.method_2541(1);
      var1.method_2541(this.field_57.size());
      Iterator var2 = this.field_57.iterator();

      while(var2.hasNext()) {
         class_257 var3 = (class_257)var2.next();
         var1.method_2545(var3.field_2276);
         var1.method_2540(var3.field_2280);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_155(class_463 var1) {
      this.field_34 = var1.method_3010();
      this.field_41 = var1.method_3011();
      this.field_43 = var1.method_3011();
      this.field_44 = var1.method_3011();
      this.field_45 = var1.method_3011();
      this.field_46 = var1.method_3011();
      this.field_47 = var1.method_3012();
      this.field_48 = var1.method_3012();
      this.field_49 = var1.method_3012();
      this.field_36 = var1.method_3010();
      int var2 = var1.method_3011();
      if (var2 >= 1) {
         int var3 = var1.method_3011();

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var1.method_3015();
            boolean var6 = var1.method_3010();
            class_257 var7 = this.method_162(var5);
            if (var7 == null) {
               class_236.method_1588("MissionEngine:readIn: Could not find saved trigger:" + var5 + " for de/activation");
            } else {
               var7.field_2280 = var6;
            }
         }
      }

   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_156(String var1) {
      class_236.method_1592("MissionEngine:triggerLog", var1);
   }

   // $FF: renamed from: a () boolean
   public boolean method_157() {
      return this.field_37;
   }

   // $FF: renamed from: b () boolean
   public boolean method_158() {
      return this.field_38;
   }

   // $FF: renamed from: c () void
   public void method_159() {
      class_236 var1 = class_236.method_1549();
      this.field_40 = false;
      this.field_28 = var1.field_1921 - 1000;
      this.field_29 = var1.field_1921 - 1000;
      this.field_52 = new Paint();
      this.field_52.method_2791(255, 255, 255, 255);
      this.field_52.method_2781(true);
      this.field_52.method_2801(Paint$Align.field_2227);
      this.field_52.method_2799(Typeface.method_1917(Typeface.field_2362, 1));
      var1.method_1603(this.field_52, 24.0F);
      this.field_54 = new Paint();
      this.field_54.method_2791(255, 255, 255, 255);
      this.field_54.method_2781(true);
      this.field_54.method_2801(Paint$Align.field_2227);
      var1.method_1603(this.field_54, 18.0F);
      this.field_55 = new Paint();
      this.field_55.method_2791(255, 255, 255, 255);
      this.field_55.method_2781(true);
      this.field_55.method_2801(Paint$Align.field_2227);
      var1.method_1603(this.field_55, 14.0F);
      this.field_53 = new Paint();
      this.field_53.method_2776(this.field_55);
      var1.method_1603(this.field_53, 18.0F);
      this.field_34 = true;
      if (var1.field_1932.field_3354 == null) {
         class_236.method_1592("MissionEngine", "Error: 'triggers' object layer is missing from this map");
         var1.method_1608("Error: 'triggers' object layer is missing from this map", 1);
      } else {
         class_410 var2 = var1.field_1932.field_3354.method_2636("map_info");
         if (var2 == null) {
            class_236.method_1592("MissionEngine", "Error: map_info is missing from this map");
            var1.method_1608("Error: map_info is missing from this map", 1);
         } else {
            this.field_35 = "survival".equalsIgnoreCase(var2.field_3400.getProperty("type"));
            if (this.field_35) {
               this.field_39 = false;
            }

            String var3 = var2.field_3400.getProperty("survivalWaves");
            if (var3 != null) {
               this.method_165(var3);
            }

            this.field_37 = "skirmish".equalsIgnoreCase(var2.field_3400.getProperty("type"));
            if (this.field_37) {
               this.field_31 = class_259.field_2293;
            }

            this.field_38 = "true".equalsIgnoreCase(var2.field_3400.getProperty("shareFogWithAllies"));
            String var4 = var2.field_3400.getProperty("winCondition");
            if (var4 == null && !this.field_37) {
               throw new RuntimeException("win condition not set");
            } else {
               if (var4 != null) {
                  if (var4.equalsIgnoreCase("none")) {
                     this.field_31 = class_259.field_2288;
                  } else if (var4.equalsIgnoreCase("allUnitsAndBuildings")) {
                     this.field_31 = class_259.field_2289;
                  } else if (var4.equalsIgnoreCase("allBuildings")) {
                     this.field_31 = class_259.field_2290;
                  } else if (var4.equalsIgnoreCase("mainBuilings")) {
                     this.field_31 = class_259.field_2291;
                  } else if (var4.equalsIgnoreCase("mainBuildings")) {
                     this.field_31 = class_259.field_2291;
                  } else {
                     if (!var4.equalsIgnoreCase("commandCenter")) {
                        throw new RuntimeException("unknown win condition:" + var4);
                     }

                     this.field_31 = class_259.field_2292;
                  }
               }

               this.field_33 = var2.field_3400.getProperty("introText");
               if (this.field_33 != null) {
                  this.field_33 = this.field_33.replaceAll("\\\\n", "\n");
               }

               if (!var1.method_1656() && !this.field_37) {
                  this.field_30 = class_107.method_954(3);
                  if (this.field_30 != null) {
                     this.field_30.field_1231 = 0;
                  }
               }

               if (var1.method_1656()) {
               }

               Iterator var12 = var1.field_1932.field_3354.field_3419.iterator();

               while(true) {
                  String var6;
                  int var7;
                  int var9;
                  class_410 var13;
                  Iterator var17;
                  class_39 var19;
                  int var20;
                  String var24;
                  String var28;
                  String var33;
                  while(var12.hasNext()) {
                     var13 = (class_410)var12.next();
                     if ("team_info".equalsIgnoreCase(var13.field_3389)) {
                        int var15 = Integer.parseInt(var13.field_3400.getProperty("team", "-2"));
                        if (var15 == -2) {
                           throw new RuntimeException("cannot find team for:" + var13.field_3387);
                        }

                        class_107 var5 = class_107.method_954(var15);
                        if (var5 == null) {
                           class_236.method_1588("No team loaded for:" + var15 + " skipping");
                           continue;
                        }

                        var6 = var13.field_3400.getProperty("credits");
                        if (var6 != null) {
                           var7 = Integer.parseInt(var6);
                           var5.field_1229 = var7;
                        }

                        var24 = var13.field_3400.getProperty("disabledAI");
                        if (var24 != null && var5 instanceof class_112) {
                           class_236.method_1588("Disabling AI:" + var15 + " by map request");
                           class_112 var8 = (class_112)var5;
                           var8.field_1288 = true;
                        }

                        var28 = var13.field_3400.getProperty("allyGroup");
                        if (var28 != null) {
                           var9 = Integer.parseInt(var28);
                           var5.field_1231 = var9;
                        }

                        var33 = var13.field_3400.getProperty("ai");
                        if (var33 != null) {
                           var5.field_1249 = var33.equalsIgnoreCase("survival");
                        }
                     }

                     if ("camera_start".equalsIgnoreCase(var13.field_3387)) {
                        var1.method_1582(var13.field_3390, var13.field_3391);
                        this.field_40 = true;
                     }

                     if ("attack_point".equalsIgnoreCase(var13.field_3387)) {
                        this.field_51.add(new PointF(var13.field_3390, var13.field_3391));
                     }

                     Iterator var21;
                     class_39 var26;
                     if ("rotate".equalsIgnoreCase(var13.field_3389)) {
                        var4 = var13.field_3400.getProperty("dir");
                        float var18 = Float.parseFloat(var4);
                        var21 = class_39.field_126.iterator();

                        while(var21.hasNext()) {
                           var26 = (class_39)var21.next();
                           if (var26 instanceof class_44 && !var26.method_212() && var13.method_2633(var26)) {
                              var26.field_154 = var18;
                           }
                        }
                     }

                     if ("fall".equalsIgnoreCase(var13.field_3389)) {
                        var17 = class_39.field_126.iterator();

                        while(var17.hasNext()) {
                           var19 = (class_39)var17.next();
                           if (var19 instanceof class_44 && !var19.method_212() && var13.method_2633(var19)) {
                              var19.method_328();
                              if (var19 instanceof class_66) {
                                 ((class_66)var19).method_601();
                              }
                           }
                        }
                     }

                     if ("set_team".equalsIgnoreCase(var13.field_3389)) {
                        var4 = var13.field_3400.getProperty("team");
                        var20 = Integer.parseInt(var4);
                        var21 = class_39.field_126.iterator();

                        while(var21.hasNext()) {
                           var26 = (class_39)var21.next();
                           if (var26 instanceof class_44 && var13.method_2633(var26)) {
                              var26.method_259(var20);
                           }
                        }
                     }

                     if ("ai_allow_full_use".equalsIgnoreCase(var13.field_3389)) {
                        var17 = class_39.field_126.iterator();

                        while(var17.hasNext()) {
                           var19 = (class_39)var17.next();
                           if (var19 instanceof class_44 && var13.method_2633(var19)) {
                              ((class_44)var19).ba = false;
                           }
                        }
                     }

                     if ("disable_unit_ai".equalsIgnoreCase(var13.field_3389)) {
                        var17 = class_39.field_126.iterator();

                        while(var17.hasNext()) {
                           var19 = (class_39)var17.next();
                           if (var19 instanceof class_44 && var13.method_2633(var19)) {
                              var19.field_134 = true;
                           }
                        }
                     }
                  }

                  var12 = class_39.field_126.iterator();

                  label333:
                  while(true) {
                     class_39 var14;
                     do {
                        if (!var12.hasNext()) {
                           this.field_57.clear();
                           var12 = var1.field_1932.field_3354.field_3419.iterator();

                           while(true) {
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
                                                               do {
                                                                  do {
                                                                     if (!var12.hasNext()) {
                                                                        var12 = this.field_57.iterator();

                                                                        while(true) {
                                                                           class_257 var16;
                                                                           String[] var25;
                                                                           String var29;
                                                                           int var32;
                                                                           do {
                                                                              if (!var12.hasNext()) {
                                                                                 return;
                                                                              }

                                                                              var16 = (class_257)var12.next();
                                                                              var4 = var16.field_2282.field_3400.getProperty("activateIds");
                                                                              if (var4 != null) {
                                                                                 String[] var27 = var4.split(",");
                                                                                 var25 = var27;
                                                                                 var7 = var27.length;

                                                                                 for(var32 = 0; var32 < var7; ++var32) {
                                                                                    var33 = var25[var32];
                                                                                    class_257 var10 = this.method_161(var33);
                                                                                    if (var10 == null) {
                                                                                       var16.method_1819("linkedTo target not found: " + var4);
                                                                                    } else {
                                                                                       var10.field_2277.add(var16);
                                                                                    }
                                                                                 }
                                                                              }

                                                                              var29 = var16.field_2282.field_3400.getProperty("whenActivatedIds");
                                                                           } while(var29 == null);

                                                                           var25 = var29.split(",");
                                                                           String[] var34 = var25;
                                                                           var32 = var25.length;

                                                                           for(var9 = 0; var9 < var32; ++var9) {
                                                                              String var35 = var34[var9];
                                                                              class_257 var11 = this.method_161(var35);
                                                                              if (var11 == null) {
                                                                                 var16.method_1819("linkedFrom target not found: " + var4);
                                                                              } else {
                                                                                 var16.field_2277.add(var11);
                                                                              }
                                                                           }
                                                                        }
                                                                     }

                                                                     var13 = (class_410)var12.next();
                                                                  } while("team_info".equalsIgnoreCase(var13.field_3389));
                                                               } while("point".equalsIgnoreCase(var13.field_3389));
                                                            } while("camera_pan".equalsIgnoreCase(var13.field_3389));
                                                         } while("camera_start".equalsIgnoreCase(var13.field_3387));
                                                      } while("map_info".equalsIgnoreCase(var13.field_3387));
                                                   } while("attack_point".equalsIgnoreCase(var13.field_3387));
                                                } while("rotate".equalsIgnoreCase(var13.field_3389));
                                             } while("fall".equalsIgnoreCase(var13.field_3389));
                                          } while("set_team".equalsIgnoreCase(var13.field_3389));
                                       } while("ai_allow_full_use".equalsIgnoreCase(var13.field_3389));
                                    } while("disable_unit_ai".equalsIgnoreCase(var13.field_3389));
                                 } while("info".equalsIgnoreCase(var13.field_3389));

                                 if (var13.field_3400 == null) {
                                    this.method_160("Error: Skipping trigger:" + var13.field_3387 + " not properties found");
                                 } else {
                                    class_257 var22 = new class_257();
                                    var22.field_2282 = var13;
                                    var22.field_2278 = class_256.method_1812(var13.field_3389);
                                    var22.field_2275 = var13.field_3387;
                                    if (var22.field_2275 == null) {
                                       var22.field_2275 = "NULL";
                                    }

                                    var20 = 0;
                                    var6 = var22.field_2275.trim();
                                    Iterator var30 = this.field_57.iterator();

                                    while(var30.hasNext()) {
                                       class_257 var31 = (class_257)var30.next();
                                       if (var31.field_2275.equalsIgnoreCase(var6)) {
                                          ++var20;
                                       }
                                    }

                                    var22.field_2276 = var22.field_2275;
                                    if (var20 != 0) {
                                       var22.field_2276 = var22.field_2276 + "_" + var20;
                                    }

                                    var22.field_2274 = var13.field_3387;
                                    var24 = var22.method_1813("delay");
                                    if (var24 != null) {
                                       var22.field_2281 = Integer.parseInt(var24);
                                    }

                                    var22.field_2279 = var22.method_1816("allToActivate", false);
                                    var28 = var13.field_3389;
                                    if (var28 != null) {
                                       var22.field_2278 = class_256.method_1812(var28);
                                       if (var22.field_2278 == null) {
                                          this.method_160("Error: Unknown type:" + var28 + " found on " + var22.field_2275);
                                          continue;
                                       }
                                    } else {
                                       this.method_160("Error: no type field set for: " + var22.field_2275);
                                    }

                                    this.field_57.add(var22);
                                 }
                              }
                           }
                        }

                        var14 = (class_39)var12.next();
                     } while(!var14.method_278());

                     var17 = class_39.field_126.iterator();

                     while(true) {
                        do {
                           do {
                              if (!var17.hasNext()) {
                                 continue label333;
                              }

                              var19 = (class_39)var17.next();
                           } while(var19 == var14);
                        } while(var19.field_143 != class_107.field_1224 && !var14.field_143.method_944(var19.field_143));

                        float var23 = class_296.method_2026(var14.dh, var14.di, var19.dh, var19.di);
                        if (var23 < 4900.0F) {
                           var14.method_277(var19);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_160(String var1) {
      class_236 var2 = class_236.method_1549();
      class_236.method_1592("MissionEngine", var1);
      var2.method_1608(var1, 1);
   }

   // $FF: renamed from: c (java.lang.String) com.corrodinggames.rts.gameFramework.i.a
   public class_257 method_161(String var1) {
      var1 = var1.trim();
      Iterator var2 = this.field_57.iterator();

      class_257 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_257)var2.next();
      } while(var3.field_2275 == null || !var3.field_2275.equalsIgnoreCase(var1));

      return var3;
   }

   // $FF: renamed from: d (java.lang.String) com.corrodinggames.rts.gameFramework.i.a
   public class_257 method_162(String var1) {
      var1 = var1.trim();
      Iterator var2 = this.field_57.iterator();

      class_257 var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (class_257)var2.next();
      } while(!var3.field_2276.equalsIgnoreCase(var1));

      return var3;
   }

   // $FF: renamed from: e (java.lang.String) android.graphics.PointF
   public PointF method_163(String var1) {
      class_236 var2 = class_236.method_1549();
      Iterator var3 = var2.field_1932.field_3354.field_3419.iterator();

      class_410 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class_410)var3.next();
      } while(!"point".equalsIgnoreCase(var4.field_3389) || var4.field_3387 == null || !var4.field_3388.equalsIgnoreCase(var1));

      this.field_58.method_1960(var4.field_3390, var4.field_3391);
      return this.field_58;
   }

   // $FF: renamed from: a (float) void
   public void method_164(float var1) {
      class_236 var2 = class_236.method_1549();
      int var5;
      String var6;
      if (this.field_35 && !this.field_62) {
         boolean var3 = true;
         boolean var4 = false;
         this.field_49 = class_296.method_2020(this.field_49, var1);
         if (this.field_49 == 0.0F && this.field_48 != 0.0F) {
            this.field_48 = class_296.method_2020(this.field_48, var1);
            var4 = true;
         }

         if (var3) {
            if (var4) {
               var5 = (int)(23.0F + this.field_52.method_2803() / 2.0F);
               var2.field_1935.method_78("- Wave " + this.field_41 + " -", var2.field_1972 / 2.0F, (float)var5, this.field_52);
               if (this.field_42 != null) {
                  var2.field_1935.method_78(this.field_42, var2.field_1972 / 2.0F, (float)var5 + this.field_52.method_2803() + 2.0F, this.field_53);
               }
            } else {
               var5 = (int)(23.0F + this.field_54.method_2803() / 2.0F);
               var6 = "Wave " + (this.field_41 + 1) + " in " + class_296.method_2072(String.valueOf((int)((double)this.field_47 / 60.0D)), 3);
               var2.field_1935.method_78(var6, var2.field_1972 / 2.0F, (float)var5, this.field_54);
               class_258 var7 = this.method_168(false);
               String var8 = var7.toString();
               var2.field_1935.method_78(var8, var2.field_1972 / 2.0F, (float)var5 + this.field_54.method_2803() + 2.0F, this.field_55);
            }
         }
      }

      if (this.field_35 && this.field_62) {
         class_260 var9 = this.method_166();
         if (var9 != null) {
            int var10 = var9.field_2299 - var2.field_1921 / 1000;
            var5 = (int)(23.0F + this.field_54.method_2803() / 2.0F);
            var6 = "Wave " + (this.field_41 + 1) + " in " + class_296.method_2072(String.valueOf(var10), 3);
            var2.field_1935.method_78(var6, var2.field_1972 / 2.0F, (float)var5, this.field_54);
            String var11 = var9.field_2300;
            if (var11 != null) {
               var2.field_1935.method_78(var11, var2.field_1972 / 2.0F, (float)var5 + this.field_54.method_2803() + 2.0F, this.field_55);
            }
         }
      }

   }

   // $FF: renamed from: f (java.lang.String) void
   public void method_165(String var1) {
      class_236.method_1591("Loading survival waves");
      this.field_62 = true;
      String[] var2 = var1.split("\n");
      int var3 = 0;
      int var4 = 0;
      boolean var5 = false;
      String[] var6 = var2;
      int var7 = var2.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         String var9 = var6[var8];
         ++var4;
         class_260 var10 = new class_260(this);
         if (var10.method_1826(var9)) {
            var10.field_2299 = var3 + (int)var10.field_2298;
            var3 = var10.field_2299;
            class_236.method_1591("Adding wave " + var4 + " at " + var10.field_2299);
            this.field_63.add(var10);
         }
      }

   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.i.d
   public class_260 method_166() {
      return this.field_41 < this.field_63.size() ? (class_260)this.field_63.get(this.field_41) : null;
   }

   // $FF: renamed from: e () void
   public void method_167() {
      this.field_66 = true;
      int var1 = class_296.method_2035(this.field_51.size());
      PointF var2 = (PointF)this.field_51.get(var1);
      this.field_64.method_1961(var2);
   }

   // $FF: renamed from: a (boolean) com.corrodinggames.rts.gameFramework.i.f
   public class_258 method_168(boolean var1) {
      class_258 var2 = this.field_61;
      int var3 = this.field_44;
      Object var4 = null;
      if (this.field_39) {
         var4 = class_469.field_4052;
      } else {
         if (this.field_43 == 0) {
            ++var3;
            var4 = class_469.field_4041;
         }

         if (this.field_43 == 1) {
            var4 = class_469.field_4042;
         }

         if (this.field_43 == 2) {
            var4 = class_469.field_4044;
         }

         if (this.field_43 == 3) {
            var3 = this.field_45;
            var4 = class_469.field_4055;
         }

         if (this.field_43 == 4) {
            var3 = this.field_45;
            var4 = class_469.field_4056;
            if (this.field_45 % 2 == 0) {
               var4 = class_469.field_4046;
            }
         }

         if (this.field_43 == 5) {
            var3 = 1;
            var4 = class_469.field_4064;
         }

         if (var1) {
            ++this.field_43;
            boolean var5 = false;
            if (this.field_45 == 1) {
               if (this.field_43 > 2) {
                  var5 = true;
               }
            } else if (this.field_45 < 5) {
               if (this.field_43 > 4) {
                  var5 = true;
               }
            } else {
               if (this.field_43 > 5) {
                  var5 = true;
               }

               if (this.field_43 > 4 && this.field_45 % 2 == 0) {
                  var5 = true;
               }
            }

            if (var5) {
               this.field_43 = 0;
               this.field_44 += 2;
               ++this.field_45;
            }
         }
      }

      class_24 var6 = class_479.method_3170((class_24)var4);
      if (var6 != null) {
         var4 = var6;
      }

      var2.field_2285 = (class_24)var4;
      var2.field_2286 = var3;
      return var2;
   }

   // $FF: renamed from: b (float) void
   public void method_169(float var1) {
      class_236 var2 = class_236.method_1549();
      int var3 = var2.field_1921;
      this.field_60 = class_296.method_2020(this.field_60, var1);
      Iterator var5;
      if (var2.field_1884 && var2.field_1929) {
         class_410 var4 = null;
         var5 = var2.field_1932.field_3354.field_3419.iterator();

         while(var5.hasNext()) {
            class_410 var6 = (class_410)var5.next();
            if ("camera_pan".equalsIgnoreCase(var6.field_3389) && this.field_59 == Integer.parseInt(var6.field_3400.getProperty("index", "-1"))) {
               var4 = var6;
            }
         }

         if (var4 == null) {
            this.field_59 = 0;
         } else {
            float var9 = class_296.method_2031(var2.field_1967 + var2.field_1975, var2.field_1968 + var2.field_1976, var4.field_3390, var4.field_3391);
            float var12 = class_296.method_2026(var2.field_1967 + var2.field_1975, var2.field_1968 + var2.field_1976, var4.field_3390, var4.field_3391);
            if (this.field_60 == 0.0F && (var12 < 225.0F || var2.field_1962)) {
               ++this.field_59;
               this.field_60 = 50.0F;
            }

            var2.field_1967 += class_296.method_2099(var9) * 0.5F * var1;
            var2.field_1968 += class_296.method_2098(var9) * 0.5F * var1;
         }
      }

      if (this.field_35) {
         if (!this.field_62) {
            this.field_47 = class_296.method_2020(this.field_47, var1);
            if (this.field_47 == 0.0F && !this.field_36) {
               ++this.field_41;
               this.field_48 = 180.0F;
               int var7 = class_296.method_2035(this.field_51.size());
               PointF var11 = (PointF)this.field_51.get(var7);
               this.field_42 = this.method_168(false).toString();
               class_258 var13 = this.method_168(true);
               this.field_47 = 1800.0F;
               var13.method_1825(var11.field_2406, var11.field_2407);
            }
         } else {
            class_260 var8 = this.method_166();
            if (var8 != null) {
               if (var8.field_2299 * 1000 < var2.field_1921) {
                  var8.method_1827();
                  ++this.field_41;
               }
            } else if (!var2.field_2006 && !var2.field_1948.method_2658()) {
               var2.field_2006 = true;
               var2.field_1939.method_777();
            }
         }
      }

      if (this.field_34) {
         this.field_34 = false;
         if (this.field_33 != null) {
            var2.method_1609("Briefing", this.field_33);
         }
      }

      if (var3 > this.field_28 + 250) {
         this.field_28 = var3;
         this.method_172(var3);
      }

      if (var3 > this.field_29 + 1000) {
         this.field_29 = var3;
         if (this.method_173()) {
            this.method_173();
            this.method_173();
         }

         boolean var10;
         class_39 var14;
         if (!var2.field_2006 && !var2.field_1948.method_2658()) {
            var10 = true;
            if (this.field_31 == class_259.field_2288) {
               var10 = false;
            } else if (this.field_31 == class_259.field_2289) {
               var5 = class_39.field_126.iterator();

               while(var5.hasNext()) {
                  var14 = (class_39)var5.next();
                  if (var14 instanceof class_44 && !var14.field_141 && var14.field_160 >= 1.0F && !var14.method_318() && var2.field_1915 != null && var2.field_1915.method_943(var14.field_143)) {
                     var10 = false;
                     break;
                  }
               }
            } else if (this.field_31 == class_259.field_2290) {
               var5 = class_39.field_126.iterator();

               while(var5.hasNext()) {
                  var14 = (class_39)var5.next();
                  if (var14.method_212() && !var14.field_141 && var14.field_160 >= 1.0F && !var14.method_318() && var2.field_1915.method_943(var14.field_143)) {
                     var10 = false;
                     break;
                  }
               }
            } else if (this.field_31 == class_259.field_2292) {
               var5 = class_39.field_126.iterator();

               while(var5.hasNext()) {
                  var14 = (class_39)var5.next();
                  if (var14 instanceof class_55 && !var14.field_141 && !var14.method_318() && var2.field_1915.method_943(var14.field_143)) {
                     var10 = false;
                     break;
                  }
               }
            } else if (this.field_31 == class_259.field_2291) {
               var5 = class_39.field_126.iterator();

               while(var5.hasNext()) {
                  var14 = (class_39)var5.next();
                  if (var14 instanceof class_50 && var14.method_212() && !(var14 instanceof class_51) && !(var14 instanceof class_57) && !var14.field_141 && !var14.method_318() && var2.field_1915.method_943(var14.field_143)) {
                     var10 = false;
                     break;
                  }
               }
            } else if (this.field_31 == class_259.field_2293) {
               var5 = class_39.field_126.iterator();

               while(var5.hasNext()) {
                  var14 = (class_39)var5.next();
                  if (!var14.field_141 && !var14.method_318() && var2.field_1915.method_943(var14.field_143)) {
                     if (var14.method_213()) {
                        var10 = false;
                        break;
                     }

                     if (var14.method_284()) {
                        var10 = false;
                        break;
                     }
                  }
               }
            }

            if (var10) {
               var2.field_2006 = true;
               var2.field_1939.method_777();
               if (var2.field_1921 > 1500) {
                  ++var2.field_1937.numberOfWins;
                  var2.field_1937.save();
               }
            }
         }

         if (this.field_35 && !this.field_36) {
            var10 = true;
            var5 = class_39.field_126.iterator();

            while(var5.hasNext()) {
               var14 = (class_39)var5.next();
               if (var14 instanceof class_55 && !var14.field_141 && !var14.method_318() && var14.field_143 == var2.field_1915) {
                  var10 = false;
               }
            }

            if (var10) {
               this.field_36 = true;
               var2.method_1609("Game Over", "You lasted till wave: " + this.field_41);
            }
         }
      }

   }

   // $FF: renamed from: g (java.lang.String) void
   public void method_170(String var1) {
      class_454.method_2887("Map ScriptError: " + var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.i.a) void
   public void method_171(class_257 var1) {
      class_236 var2 = class_236.method_1549();
      var1.field_2280 = true;
      String var3 = var1.method_1813("globalMessage");
      if (var3 != null) {
         class_454.method_2890((String)null, var1.method_1813("globalMessage"));
      }

      boolean var4 = var1.method_1816("showOnMap", false);
      if (var4) {
         var2.field_1943.method_1237(var1.method_1823(), var1.method_1824(), class_172.field_1498);
      }

      if (var1.field_2278 == class_256.field_2270) {
      }

      if (var1.field_2278 == class_256.field_2269) {
         class_107 var13 = var1.method_1821();
         if (var13 == null) {
            var1.method_1819("Team not set for changeCredits");
         } else {
            Integer var14 = var1.method_1815("set");
            if (var14 != null) {
               var13.field_1229 = var14;
            }

            Integer var15 = var1.method_1815("add");
            if (var15 != null) {
               var13.method_932(var15);
            }

         }
      } else if (var1.field_2278 == class_256.field_2268) {
         String var5 = var1.method_1813("target");
         if (var5 == null) {
            this.method_170("Move trigger has no target id:" + var1.field_2274);
         } else {
            PointF var6 = this.method_163(var5);
            if (var6 == null) {
               this.method_170("Move trigger: Cannot find target for:" + var1.field_2274 + " target:" + var5);
            } else {
               class_107 var7 = var1.method_1821();
               if (var7 == null) {
                  this.method_170("Team not set map trigger:" + var1.field_2274);
               } else {
                  int var8 = 0;
                  class_324 var9 = var2.field_1952.method_2159(var7);
                  Iterator var10 = class_39.field_126.iterator();

                  while(var10.hasNext()) {
                     class_39 var11 = (class_39)var10.next();
                     if (var11.field_143 == var7 && var11 instanceof class_44 && var1.method_1818(var11)) {
                        class_44 var12 = (class_44)var11;
                        var9.method_2184(var12);
                        ++var8;
                     }
                  }

                  var9.method_2186(var6.field_2406, var6.field_2407);
                  this.method_156("Activating move at:" + var2.field_1921 + " for teamId:" + var7.field_1227 + " to targetId:" + var5 + " (#units:" + var8 + ")");
                  if (var1.method_1813("unload") != null) {
                     Iterator var16 = class_39.field_126.iterator();

                     while(var16.hasNext()) {
                        class_39 var17 = (class_39)var16.next();
                        if (var17.field_143 == var7 && var17 instanceof class_44 && var1.method_1818(var17) && var17.method_278()) {
                           class_44 var18 = (class_44)var17;
                           class_324 var19 = var2.field_1952.method_2159(var7);
                           var19.field_2598 = true;
                           var19.method_2184(var18);
                           String var20 = var18.bB();
                           var19.method_2198(var20);
                        }
                     }
                  }

               }
            }
         }
      }
   }

   // $FF: renamed from: a (int) void
   public void method_172(int var1) {
      if (this.field_27) {
         class_236.method_1591("runMapScripts at:" + var1);
      }

      class_236 var2 = class_236.method_1549();
      Iterator var3 = this.field_57.iterator();

      while(true) {
         class_257 var4;
         do {
            if (!var3.hasNext()) {
               return;
            }

            var4 = (class_257)var3.next();
         } while(var4.field_2280);

         if (!var4.field_2283) {
            boolean var5 = false;
            boolean var6 = true;
            boolean var7 = var4.field_2279;
            if (var4.field_2281 != -1) {
               if (var4.field_2281 <= var1) {
                  if (!var7) {
                     var4.method_1820("activated by delay");
                  }

                  var5 = true;
               } else {
                  var6 = false;
               }
            }

            Iterator var8 = var4.field_2277.iterator();

            while(var8.hasNext()) {
               class_257 var9 = (class_257)var8.next();
               if (var9.field_2280) {
                  if (!var7) {
                     var4.method_1820("activated by linked trigger");
                  }

                  var5 = true;
               } else {
                  var6 = false;
               }
            }

            if (var4.field_2278 == class_256.field_2272) {
               if (var4.method_1822()) {
                  if (!var7) {
                     var4.method_1820("activated by unitDetect");
                  }

                  var5 = true;
               } else {
                  var6 = false;
               }
            }

            if (var7 && var6) {
               var4.method_1820("'and' activated");
               var5 = true;
            }

            if (var5) {
               var4.field_2283 = true;
            }
         }

         if (var4.field_2283) {
            this.method_171(var4);
         }
      }
   }

   // $FF: renamed from: f () boolean
   public boolean method_173() {
      boolean var1 = false;
      class_236 var2 = class_236.method_1549();
      if (!var2.method_1656()) {
         class_39[] var3 = class_39.field_126.method_1326();
         int var4 = 0;

         for(int var5 = class_39.field_126.size(); var4 < var5; ++var4) {
            class_39 var6 = var3[var4];
            if (var6.field_143 == class_107.field_1224 && var6 instanceof class_44 && var6.method_228() && !var6.method_313()) {
               int var7 = 0;

               for(int var8 = class_39.field_126.size(); var7 < var8; ++var7) {
                  class_39 var9 = var3[var7];
                  if (var9.field_143 == var2.field_1915 && var9.field_143 != var6.field_143 && var9 instanceof class_44 && !var9.method_280() && var9.method_228() && class_296.method_2026(var9.dh, var9.di, var6.dh, var6.di) < 28900.0F) {
                     var6.method_258(var9.field_143);
                     var6.field_178 = 60.0F;
                     var1 = true;
                     break;
                  }
               }
            }
         }
      }

      return var1;
   }
}
