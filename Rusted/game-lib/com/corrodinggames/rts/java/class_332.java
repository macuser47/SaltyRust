package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.a.class_352;
import com.corrodinggames.rts.b.class_499;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.h.class_465;
import com.corrodinggames.rts.gameFramework.j.class_223;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

// $FF: renamed from: com.corrodinggames.rts.java.v
public class class_332 extends BasicGame {
   // $FF: renamed from: a org.newdawn.slick.GameContainer
   GameContainer field_2636;
   // $FF: renamed from: b com.corrodinggames.rts.java.Main
   Main field_2637;
   // $FF: renamed from: c com.corrodinggames.rts.java.a
   class_341 field_2638;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.h.j
   class_465 field_2639;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.k
   class_236 field_2640;
   // $FF: renamed from: f com.corrodinggames.rts.java.c
   class_338 field_2641;
   // $FF: renamed from: g boolean
   boolean field_2642 = false;
   // $FF: renamed from: h java.lang.Object
   Object field_2643 = new Object();
   // $FF: renamed from: i boolean
   boolean field_2644 = false;
   // $FF: renamed from: j boolean
   boolean field_2645 = false;
   // $FF: renamed from: k boolean
   boolean field_2646 = false;
   // $FF: renamed from: l boolean
   boolean field_2647 = false;
   // $FF: renamed from: m com.corrodinggames.rts.java.u
   class_308 field_2648;
   // $FF: renamed from: n com.corrodinggames.rts.java.u
   class_308 field_2649;
   // $FF: renamed from: o boolean
   boolean field_2650;
   // $FF: renamed from: p boolean
   boolean field_2651 = false;
   // $FF: renamed from: q boolean
   boolean field_2652 = false;
   // $FF: renamed from: r boolean
   boolean field_2653 = false;
   // $FF: renamed from: s boolean
   boolean field_2654 = false;
   // $FF: renamed from: t int
   int field_2655;
   // $FF: renamed from: u boolean
   boolean field_2656 = false;
   // $FF: renamed from: v boolean
   boolean field_2657;
   // $FF: renamed from: w float
   float field_2658;
   // $FF: renamed from: x float
   float field_2659;
   // $FF: renamed from: y boolean
   boolean field_2660 = false;
   // $FF: renamed from: W boolean[]
   private boolean[] field_2661 = new boolean[224];
   // $FF: renamed from: z int
   int field_2662 = 1;
   // $FF: renamed from: A int
   int field_2663 = 2;
   // $FF: renamed from: B int
   int field_2664 = 4;
   // $FF: renamed from: C int
   int field_2665 = 0;
   // $FF: renamed from: D float
   float field_2666 = 0.0F;
   // $FF: renamed from: E float
   float field_2667 = 0.0F;
   // $FF: renamed from: F int
   int field_2668 = 0;
   // $FF: renamed from: G int
   int field_2669 = 0;
   // $FF: renamed from: H int
   int field_2670;
   // $FF: renamed from: I int
   int field_2671;
   // $FF: renamed from: J int
   int field_2672;
   // $FF: renamed from: K int
   int field_2673;
   // $FF: renamed from: L boolean
   boolean field_2674;
   // $FF: renamed from: M float
   float field_2675 = 0.0F;
   // $FF: renamed from: N int
   int field_2676 = 0;
   // $FF: renamed from: O java.lang.String
   String field_2677 = "";
   // $FF: renamed from: P java.lang.String
   String field_2678 = "";
   // $FF: renamed from: Q float
   float field_2679 = 1.0F;
   // $FF: renamed from: R int
   int field_2680 = 100;
   // $FF: renamed from: S int
   int field_2681 = 100;
   // $FF: renamed from: T long
   long field_2682;
   // $FF: renamed from: U float
   float field_2683 = 0.0F;
   // $FF: renamed from: V float
   float field_2684 = 0.0F;

   public class_332(String var1) {
      super(var1);
   }

   public boolean closeRequested() {
      if (this.field_2644) {
         return true;
      } else if (class_499.method_3220()) {
         return true;
      } else if (this.field_2638 != null && !this.field_2638.isFullscreen()) {
         ScriptEngine.getInstance().addScriptToQueue("askQuitGame();");
         return false;
      } else {
         return true;
      }
   }

   public void init(GameContainer var1) {
      this.field_2636 = var1;
      var1.setAlwaysRender(true);
      var1.setForceExit(true);
      var1.setShowFPS(false);
      var1.setTargetFrameRate(120);
      if (class_236.field_1889) {
         var1.setShowFPS(true);
         var1.setTargetFrameRate(30);
      }

      var1.setIcons(new String[]{"res/drawable/icon_window.png", "res/drawable/icon_window128.png", "res/drawable/icon_window24.png", "res/drawable/icon_window16.png"});
      var1.setUpdateOnlyWhenVisible(false);
      var1.getInput().enableKeyRepeat();
      this.field_2648 = class_339.method_2261(R$drawable.logo, true);
      this.field_2649 = class_339.method_2261(R$drawable.pointer, true);
      var1.setMouseCursor(this.field_2649.method_2138(), 0, 0);
      this.field_2682 = System.currentTimeMillis();
   }

   // $FF: renamed from: a () void
   public void method_2218() {
      this.field_2640 = class_236.method_1549();
      if (this.field_2636.isVSyncRequested() != this.field_2640.field_1937.renderVsync) {
         this.field_2636.setVSync(this.field_2640.field_1937.renderVsync);
      }

      boolean var1 = false;
      if (this.field_2640.field_1937.enableMouseCapture && !this.field_2640.field_1937.slick2dFullScreen && !this.field_2640.field_1884 && !this.field_2640.method_1558(false) && this.field_2640.field_1914) {
         var1 = true;
      }

      if (var1 != this.field_2657) {
         class_236.method_1591("Grabbing mouse:" + var1);
         this.field_2657 = var1;
         if (!this.field_2656) {
            this.field_2636.setMouseGrabbed(this.field_2657);
         }

         if (this.field_2657) {
         }

         if (!this.field_2657) {
            Mouse.setCursorPosition((int)(this.field_2658 * this.field_2679), (int)((float)Display.getHeight() - this.field_2659 * this.field_2679));
         }

         class_236.field_1897 = this.field_2657;
      }

      this.field_2636.setSmoothDeltas(this.field_2640.field_1937.renderSmoothDelta);
      if (this.field_2650 != Display.isActive()) {
         this.field_2650 = Display.isActive();
         if (this.field_2650) {
            this.method_2228();
         }
      }

   }

   // $FF: renamed from: b () void
   public void method_2219() {
      if (this.field_2651) {
         class_236.method_1595("loadingStartedThreaded");
      } else {
         this.field_2651 = true;
         this.method_2220();
      }
   }

   // $FF: renamed from: c () void
   public void method_2220() {
      if (this.field_2652) {
         class_236.method_1595("loadingStartedNonThreaded");
      } else {
         this.field_2652 = true;
         if (this.field_2637 == null) {
            this.field_2637 = new Main();
         }

         this.field_2637.method_1510();
         if (class_236.field_1894) {
            class_236.method_1591("switching to sandbox");
            ScriptEngine.getInstance().addScriptToQueue("open('sandboxOptions.rml', 'maps/skirmish/[z;p10]Crossing Large (10p).tmx'); loadConfigAndStartNewSandbox('maps/skirmish/[z;p10]Crossing Large (10p).tmx');");
         }

         this.field_2653 = true;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.java.c) void
   public void method_2221(class_338 var1) {
      class_236.method_1588("SlickContainer:setup");
      this.field_2640 = class_236.method_1549();
      this.field_2641 = var1;
      this.field_2641.field_2693 = new class_352();
      this.field_2641.field_2690 = this.field_2636.getWidth();
      this.field_2641.field_2691 = this.field_2636.getHeight();
      this.field_2640.method_1560(this.field_2641.field_2690, this.field_2641.field_2691);
      this.field_2639 = new class_465();
   }

   public void update(GameContainer var1, int var2) {
      this.field_2655 = var2;
   }

   // $FF: renamed from: a (int) int
   public int method_2222(int var1) {
      if (var1 == 0) {
         return 1;
      } else if (var1 == 1) {
         return 2;
      } else if (var1 == 2) {
         return 3;
      } else {
         class_236.method_1591("Unknown mouse button:" + var1);
         return 0;
      }
   }

   // $FF: renamed from: a (int, int, boolean) void
   public void method_2223(int var1, int var2, boolean var3) {
      if (this.field_2660) {
         class_236.method_1591("mouseGrab:m:" + var3 + ",newX:" + var1 + ",newY:" + var2);
      }

      if (!this.field_2657) {
         this.field_2658 = (float)((int)((float)var1 / this.field_2679));
         this.field_2659 = (float)((int)((float)var2 / this.field_2679));
      } else {
         if (var3) {
            int var4;
            int var5;
            if (this.field_2656) {
               var4 = var1 - this.field_2680;
               var5 = var2 - this.field_2681;
            } else {
               var4 = var1;
               var5 = var2;
            }

            this.field_2658 += (float)var4 / this.field_2679;
            this.field_2659 += (float)var5 / this.field_2679;
         } else {
            this.field_2658 = (float)((int)((float)var1 / this.field_2679));
            this.field_2659 = (float)((int)((float)var2 / this.field_2679));
         }

         if (this.field_2658 < 0.0F) {
            this.field_2658 = 0.0F;
         }

         if (this.field_2659 < 0.0F) {
            this.field_2659 = 0.0F;
         }

         if (this.field_2641 != null) {
            if (this.field_2658 > (float)(this.field_2641.method_31() - 1)) {
               this.field_2658 = (float)(this.field_2641.method_31() - 1);
            }

            if (this.field_2659 > (float)(this.field_2641.method_32() - 1)) {
               this.field_2659 = (float)(this.field_2641.method_32() - 1);
            }
         } else {
            class_236.method_1591("processMouseGrab gameView==null");
         }
      }

   }

   public void mousePressed(int var1, int var2, int var3) {
      this.method_2223(var2, var3, false);
      if (this.method_2224()) {
         this.field_2637.field_1847.mouseMove((int)this.field_2658, (int)this.field_2659, 0);
         this.field_2637.field_1847.processMouseButtonDown(0, 0);
      } else if (this.field_2641 != null) {
         int var4 = this.method_2222(var1);
         if (var4 != 0) {
            this.field_2641.field_2693.method_2287(this.field_2658, this.field_2659, true, var4);
         }

      }
   }

   public void mouseDragged(int var1, int var2, int var3, int var4) {
      this.method_2223(var3, var4, true);
      if (this.method_2224()) {
         this.field_2637.field_1847.mouseMove((int)this.field_2658, (int)this.field_2659, 0);
      } else if (this.field_2641 != null) {
         this.field_2641.field_2693.method_2286(this.field_2658, this.field_2659);
      }
   }

   public void mouseMoved(int var1, int var2, int var3, int var4) {
      this.method_2223(var3, var4, true);
      if (this.method_2224()) {
         this.field_2637.field_1847.mouseMove((int)this.field_2658, (int)this.field_2659, 0);
      } else if (this.field_2641 != null) {
         this.field_2641.field_2693.method_2286(this.field_2658, this.field_2659);
      }
   }

   public void mouseReleased(int var1, int var2, int var3) {
      this.method_2223(var2, var3, false);
      if (this.method_2224()) {
         this.field_2637.field_1847.processMouseButtonUp(0, 0);
      } else if (this.field_2641 != null) {
         int var4 = this.method_2222(var1);
         if (var4 != 0) {
            this.field_2641.field_2693.method_2287(this.field_2658, this.field_2659, false, var4);
         }

      }
   }

   public void mouseWheelMoved(int var1) {
      if (this.method_2224()) {
         this.field_2637.field_1847.processMouseWheel(-(var1 / 120) * 2, 0);
      } else if (this.field_2640 != null) {
         this.field_2640.method_1630(var1);
      }
   }

   // $FF: renamed from: d () boolean
   boolean method_2224() {
      return this.field_2637 != null && this.field_2637.field_1847 != null && !this.field_2637.field_1847.method_1832();
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_2225(int var1) {
      return var1 < this.field_2661.length && var1 >= 0 ? this.field_2661[var1] : false;
   }

   // $FF: renamed from: e () int
   public int method_2226() {
      int var1 = 0;
      if (this.method_2225(42) || this.method_2225(54)) {
         var1 += this.field_2663;
      }

      if (this.method_2225(29) || this.method_2225(157)) {
         var1 += this.field_2662;
      }

      if (this.method_2225(56) || this.method_2225(184)) {
         var1 += this.field_2664;
      }

      return var1;
   }

   // $FF: renamed from: a (int, boolean) void
   public void method_2227(int var1, boolean var2) {
      if (var1 < this.field_2661.length && var1 >= 0) {
         this.field_2661[var1] = var2;
      }
   }

   // $FF: renamed from: f () void
   public void method_2228() {
      for(int var1 = 0; var1 < this.field_2661.length; ++var1) {
         if (this.field_2661[var1]) {
            this.method_2229(var1);
         }
      }

   }

   public void keyPressed(int var1, char var2) {
      int var3 = SlickToAndroidKeycodes.method_1418(var1);
      this.method_2227(var1, true);
      if (!this.method_2224()) {
         if (this.field_2640 != null) {
            this.field_2640.method_1629(var3, true);
            if (var1 == 1) {
            }

         }
      } else {
         Integer var4 = SlickToAndroidKeycodes.method_1419(var1);
         Object var5 = this.field_2637.field_1847.method_1833("event_onkeydown");
         if (var5 != null) {
            ScriptEngine.getInstance().addScriptToQueue(var5 + "(" + var3 + ");");
            if (this.field_2637.field_1847.method_1834() != null) {
               return;
            }
         }

         if (var2 > 255) {
            ScriptEngine.getInstance().addRunnableToQueue(new v$1(this));
         }

         if (var1 == 30 && this.method_2226() == this.field_2662) {
            this.field_2637.field_1847.processKeyDown(93, 0);
            this.field_2637.field_1847.processKeyUp(93, 0);
            this.field_2637.field_1847.processKeyDown(91, this.field_2663);
            this.field_2637.field_1847.processKeyUp(91, this.field_2663);
         } else if (var1 == 46 && this.method_2226() == this.field_2662) {
            this.field_2637.field_1847.processKeyDown(14, this.field_2662);
         } else if (var1 == 47 && this.method_2226() == this.field_2662) {
            this.field_2637.field_1847.processKeyDown(33, this.field_2662);
         } else {
            if (var4 != null) {
               this.field_2637.field_1847.processKeyDown(var4, this.method_2226());
            } else if (Character.isISOControl(var2)) {
               class_236.method_1591("keyPressed skipping isISOControl:" + var1 + " c:" + var2 + " c_print:" + var2);
            } else {
               this.field_2637.field_1847.processTextInputChar(var2);
            }

            if (var1 == 28 || var1 == 156) {
               ScriptEngine.getInstance().addScriptToQueue("onEnter();");
            }

            if (var1 == 1) {
               ScriptEngine.getInstance().addScriptToQueue("onEscape();");
            }

         }
      }
   }

   // $FF: renamed from: c (int) void
   public void method_2229(int var1) {
      this.keyReleased(var1, '\u0000');
   }

   public void keyReleased(int var1, char var2) {
      this.method_2227(var1, false);
      if (this.method_2224()) {
         Integer var3 = SlickToAndroidKeycodes.method_1419(var1);
         if (var3 != null) {
            this.field_2637.field_1847.processKeyUp(var3, this.method_2226());
         } else if (!Character.isISOControl(var2)) {
         }
      }

      if (this.field_2640 != null) {
         this.field_2640.method_1629(SlickToAndroidKeycodes.method_1418(var1), false);
      }
   }

   // $FF: renamed from: a (int, int) void
   public void method_2230(int var1, int var2) {
      this.field_2670 = var1;
      this.field_2671 = var2;
      this.method_2231();
   }

   // $FF: renamed from: g () void
   public void method_2231() {
      if (!this.field_2647) {
         if (!this.field_2644) {
            try {
               boolean var1 = this.field_2640.field_1937.slick2dFullScreen;
               int var2 = this.field_2670;
               int var3 = this.field_2671;
               if (var1) {
                  var2 = this.field_2638.getScreenWidth();
                  var3 = this.field_2638.getScreenHeight();
                  String var4 = this.field_2640.field_1937.slick2dFullScreenResolution;
                  if (var4 == null) {
                     class_236.method_1591("fullScreenResolutionString is null");
                     var4 = "native";
                  }

                  if (!var4.equals("native")) {
                     String[] var5 = var4.split("x");
                     if (var5.length != 2) {
                        class_236.method_1588("Unknown resolution format:" + var4);
                     } else {
                        Integer var6 = class_296.method_2093(var5[0]);
                        Integer var7 = class_296.method_2093(var5[1]);
                        if (var6 != null && var7 != null) {
                           var2 = var6;
                           var3 = var7;
                        } else {
                           class_236.method_1588("Bad resolution int:" + var4);
                        }
                     }
                  }
               }

               float var12 = 1.0F;
               if ((float)var2 <= 3360.0F && (float)var3 <= 1890.0F) {
                  if ((float)var2 > 2688.0F || (float)var3 > 1512.0F) {
                     var12 = 1.5F;
                  }
               } else {
                  var12 = 2.0F;
               }

               var12 *= this.field_2640.field_1937.uiRenderScale;
               class_236.method_1591("uiRenderScale:" + this.field_2640.field_1937.uiRenderScale);
               if (this.field_2674 == var1 && this.field_2670 == this.field_2672 && this.field_2671 == this.field_2673 && class_296.method_2048(var12, this.field_2679)) {
                  return;
               }

               this.field_2679 = var12;
               this.field_2672 = this.field_2670;
               this.field_2673 = this.field_2671;
               this.field_2674 = var1;
               if (var1) {
                  class_236.method_1591("screen: " + this.field_2638.getScreenWidth() + ", " + this.field_2638.getScreenHeight());
                  class_236.method_1591("container: " + this.field_2636.getWidth() + ", " + this.field_2636.getHeight());
                  this.field_2638.setDisplayMode(var2, var3, true);
               } else {
                  boolean var13 = false;
                  if (this.field_2638.isFullscreen()) {
                     var13 = true;
                  }

                  if (var13) {
                     this.field_2638.setDisplayMode(var2, var3, false);
                     Display.setResizable(false);
                     Display.setResizable(true);
                  } else {
                     SGL var8 = Renderer.get();
                     var8.initDisplay(var2, var3);
                     var8.enterOrtho(var2, var3);
                     Field var9 = GameContainer.class.getDeclaredField("width");
                     var9.setAccessible(true);
                     var9.set(this.field_2638, var2);
                     Field var10 = GameContainer.class.getDeclaredField("height");
                     var10.setAccessible(true);
                     var10.set(this.field_2638, var3);
                  }
               }

               this.field_2680 = Display.getWidth() / 2;
               this.field_2681 = Display.getHeight() / 2;
               int var14 = (int)((float)var2 / this.field_2679);
               int var15 = (int)((float)var3 / this.field_2679);
               if (this.field_2641 != null) {
                  this.field_2641.field_2690 = var14;
                  this.field_2641.field_2691 = var15;
               } else {
                  class_236.method_1591("setResolution: gameView=null");
               }

               if (this.field_2640 != null) {
                  this.field_2640.method_1560(var14, var15);
               } else {
                  class_236.method_1591("setResolution: game=null");
               }

               if (this.field_2637 != null && this.field_2637.field_1847 != null) {
                  this.field_2637.field_1847.setDimensions(var14, var15);
               } else {
                  class_236.method_1591("setResolution: main.libRocket=null");
               }
            } catch (Exception var11) {
               var11.printStackTrace();
            }

         }
      }
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public void method_2232(String var1, boolean var2) {
      if (!var1.startsWith("Loading units ")) {
         class_236.method_1591("--Now loading:" + var1);
      }

      if (var2) {
         this.field_2678 = this.field_2677;
         this.field_2677 = var1;
      }

      Graphics var3 = this.field_2638.method_2269();
      this.method_2233(this.field_2638, var3);
      this.field_2638.method_2270(var3);
   }

   // $FF: renamed from: a (org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics) void
   public void method_2233(GameContainer var1, Graphics var2) {
      this.field_2675 += (float)this.field_2655;
      ++this.field_2676;
      var2.setColor(Color.black);
      var2.clear();
      if (this.field_2648 != null) {
         var2.drawImage(this.field_2648.method_2138(), (float)(Display.getWidth() / 2 - this.field_2648.i / 2), (float)(Display.getHeight() / 2 - this.field_2648.j / 2));
      }

      String var3 = "Loading";
      int var4 = this.field_2676 % 4;

      int var5;
      for(var5 = 0; var5 <= var4; ++var5) {
         var3 = var3 + ".";
      }

      var3 = class_296.method_2070("    " + var3, 17);
      var5 = var2.getFont().getWidth(var3);
      int var6 = Display.getHeight() - 70;
      var2.setColor(Color.white);
      var2.drawString(var3, (float)(Display.getWidth() / 2 - var5 / 2), (float)var6);
      var2.setColor(new Color(1.0F, 1.0F, 1.0F, 0.6F));
      var5 = var2.getFont().getWidth(this.field_2677);
      var2.drawString(this.field_2677, (float)(Display.getWidth() / 2 - var5 / 2), (float)(var6 + 20));
   }

   // $FF: renamed from: a (org.newdawn.slick.Graphics) void
   public void method_2234(Graphics var1) {
      var1.pushTransform();
      var1.scale(this.field_2679, this.field_2679);
   }

   // $FF: renamed from: b (org.newdawn.slick.Graphics) void
   public void method_2235(Graphics var1) {
      var1.popTransform();
   }

   public void render(GameContainer var1, Graphics var2) {
      long var3 = System.currentTimeMillis();
      float var5 = (float)(var3 - this.field_2682) * 0.060000002F;
      int var6 = (int)(var3 - this.field_2682);
      this.field_2682 = var3;
      if (this.field_2657 && this.field_2656 && var1.hasFocus()) {
         Mouse.setCursorPosition(this.field_2680, this.field_2681);
      }

      if (!this.field_2653) {
         this.method_2233(var1, var2);
         if (!this.field_2654) {
            this.field_2654 = true;
         } else {
            if (!this.field_2651) {
               this.method_2219();
            }

         }
      } else if (this.field_2640 == null) {
         class_236.method_1588("render: game==null");
      } else {
         this.method_2218();
         float var7 = (float)this.field_2655 * 0.060000002F;
         int var8 = Display.getWidth();
         int var9 = Display.getHeight();
         if (var8 != this.field_2672 || var9 != this.field_2673) {
            if (this.field_2668 != var8 || this.field_2669 != var9) {
               this.field_2668 = var8;
               this.field_2669 = var9;
               this.field_2667 = 0.0F;
            }

            this.field_2667 += var7;
            this.field_2666 += var7;
            if (this.field_2666 > 300.0F || this.field_2667 > 20.0F || this.field_2666 > 0.0F) {
               this.field_2666 = 0.0F;
               this.field_2667 = 0.0F;
               this.method_2230(var8, var9);
            }
         }

         this.field_2637.method_1514(var7);
         if (this.field_2640.field_1937.liveReloading) {
            ++this.field_2665;
            if (this.field_2665 > 30) {
               this.field_2665 = 0;
               if (class_308.field_2544 != null) {
                  Iterator var10 = class_308.field_2544.iterator();

                  while(var10.hasNext()) {
                     class_308 var11 = (class_308)var10.next();
                     var11.method_2133();
                  }
               }

               if (!this.field_2640.method_1623(48)) {
                  this.field_2637.field_1847.detectChangesAndReload();
               }
            }
         }

         if (!this.field_2640.field_1928) {
            var2.setColor(Color.gray);
            var2.resetTransform();
            var2.clearClip();
            var2.clear();
            this.method_2234(var2);
         }

         boolean var12 = this.field_2640.field_1940.field_3625.method_2715();
         if (this.field_2640.field_1928) {
            var2.resetTransform();
            if (!this.field_2640.field_2011) {
               var2.clearClip();
               var2.clear();
            }

            this.method_2234(var2);
            var2.setColor(Color.black);
            if (!class_236.field_1890) {
               class_339 var13 = (class_339)this.field_2640.field_1935;
               var13.field_2702 = var2;
            }

            boolean var14 = this.field_2640.field_1984;
            if (var12) {
               this.field_2640.field_1984 = true;
            }

            this.field_2640.method_1574(var7, this.field_2655);
            if (var12) {
               this.field_2640.field_1984 = var14;
            }

            this.field_2655 = 0;
         } else {
            this.field_2640.field_1934.method_2759(var7);
         }

         class_223.method_1462().method_1464(0.0F);
         this.field_2637.field_1847.field_2314.update(var7);
         if (!this.field_2637.field_1847.method_1832()) {
            this.field_2637.field_1847.method_1829(var2);
            this.field_2637.field_1847.update();
            this.field_2637.field_1847.render();
            this.field_2637.field_1847.field_2314.checkForErrors();
            this.field_2637.field_1847.debug = false;
         }

         this.field_2637.field_1847.postUpdate();
         if (this.field_2644) {
            var2.clear();
         }

         this.method_2235(var2);
         if (this.field_2657 && !var12) {
            var2.drawImage(this.field_2649.method_2138(), this.field_2658 * this.field_2679, this.field_2659 * this.field_2679);
         }

         if (var12) {
            this.method_2236(var2);
         }

         if (this.field_2637.field_1853) {
            ++this.field_2637.field_1854;
            if (this.field_2637.field_1854 > 2) {
               this.field_2637.field_1853 = false;
               this.field_2637.field_1854 = 0;
               class_236.method_1591("Saving settings (queued)");
               this.field_2640.field_1937.save();
            }
         }

      }
   }

   // $FF: renamed from: c (org.newdawn.slick.Graphics) void
   public void method_2236(Graphics var1) {
      try {
         class_236.method_1591("Saving screenshot");
         String var2 = "screenshots";
         File var3 = new File("screenshots");
         if (!var3.exists()) {
            var3.mkdir();
         }

         String var4 = "screenshot_" + class_296.method_2017("d MMM yyyy HH.mm.ss") + ".png";
         Image var5 = new Image(this.field_2638.getWidth(), this.field_2638.getHeight());
         var1.copyArea(var5, 0, 0);
         ByteArrayOutputStream var6 = new ByteArrayOutputStream();
         ImageOut.write(var5, "png", var6);
         class_236.method_1661((String)null, "Saving screenshot: " + var4);
         v$2 var7 = new v$2(this, var4, var6);
         Thread var8 = new Thread(var7);
         var8.start();
      } catch (Exception var9) {
         var9.printStackTrace();
         class_236.method_1652("Failed to take screenshot:" + var9.getMessage());
      }
   }
}
