package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.aa
public class class_426 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.ah
   public static class_435 field_3574 = new class_436();
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.ag
   public static class_333 field_3575 = new class_333();
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3576;
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3577;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3578;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3579;
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3580;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3581;
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3582;
   // $FF: renamed from: j com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3583;
   // $FF: renamed from: k com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3584;
   // $FF: renamed from: l com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3585 = this.method_2707("Debug Left");
   // $FF: renamed from: m com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3586 = this.method_2707("Debug Right");
   // $FF: renamed from: n com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3587 = this.method_2708("Camera Up");
   // $FF: renamed from: o com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3588 = this.method_2708("Camera Down");
   // $FF: renamed from: p com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3589 = this.method_2708("Camera Left");
   // $FF: renamed from: q com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3590 = this.method_2708("Camera Right");
   // $FF: renamed from: r com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3591 = this.method_2708("Zoom In");
   // $FF: renamed from: s com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3592 = this.method_2708("Zoom Out");
   // $FF: renamed from: t com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3593 = this.method_2708("Send Chat");
   // $FF: renamed from: u com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3594 = this.method_2708("Send Team Chat");
   // $FF: renamed from: v com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3595 = this.method_2708("Ping Map");
   // $FF: renamed from: w com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3596 = this.method_2708("Show Menu");
   // $FF: renamed from: x com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3597 = this.method_2708("Save Game");
   // $FF: renamed from: y com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3598 = this.method_2708("Deselect units");
   // $FF: renamed from: z com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3599 = this.method_2708("Go to notification");
   // $FF: renamed from: A com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3600 = this.method_2708("Select Whole Army");
   // $FF: renamed from: B com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3601 = this.method_2708("Select Command Center");
   // $FF: renamed from: C com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3602 = this.method_2708("Cycle Builders");
   // $FF: renamed from: D com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3603 = this.method_2708("Cycle Extractors");
   // $FF: renamed from: E com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3604 = this.method_2708("Cycle Upgradable Fabricators");
   // $FF: renamed from: F com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3605 = this.method_2708("Cycle Land Factories");
   // $FF: renamed from: G com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3606 = this.method_2708("Cycle Air Factories");
   // $FF: renamed from: H com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3607 = this.method_2708("Next Music Track");
   // $FF: renamed from: I com.corrodinggames.rts.gameFramework.ac
   public class_428 field_3608 = this.method_2709("Game Speed (Single player)");
   // $FF: renamed from: J com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3609 = this.method_2708("Slower");
   // $FF: renamed from: K com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3610 = this.method_2708("Faster");
   // $FF: renamed from: L com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3611 = this.method_2708("Pause Game");
   // $FF: renamed from: M com.corrodinggames.rts.gameFramework.ac
   public class_428 field_3612 = this.method_2709("Unit Actions");
   // $FF: renamed from: N com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3613 = this.method_2708("Attack Move");
   // $FF: renamed from: O com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3614 = this.method_2708("Stop");
   // $FF: renamed from: P com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3615 = this.method_2708("Guard Unit");
   // $FF: renamed from: Q com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3616 = this.method_2708("Patrol");
   // $FF: renamed from: R com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3617 = this.method_2708("Action - Upgrade");
   // $FF: renamed from: S com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3618 = this.method_2708("Action - Set Rally");
   // $FF: renamed from: T com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3619 = this.method_2707("Debug Editor");
   // $FF: renamed from: U com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3620 = this.method_2707("Debug Pause");
   // $FF: renamed from: V com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3621 = this.method_2707("Debug Slow");
   // $FF: renamed from: W com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3622 = this.method_2707("Debug HideInterface");
   // $FF: renamed from: X com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3623 = this.method_2707("Debug HideInterface Temp");
   // $FF: renamed from: Y com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3624 = this.method_2707("Debug InvincibleUnits");
   // $FF: renamed from: Z com.corrodinggames.rts.gameFramework.ab
   public class_427 field_3625 = this.method_2707("Debug Take Screenshot");
   // $FF: renamed from: aa com.corrodinggames.rts.gameFramework.ab[]
   public class_427[] field_3626;
   // $FF: renamed from: ab com.corrodinggames.rts.gameFramework.ac
   public class_428 field_3627;
   // $FF: renamed from: ac com.corrodinggames.rts.gameFramework.ab[]
   public class_427[] field_3628;
   // $FF: renamed from: ad com.corrodinggames.rts.gameFramework.ab[]
   public class_427[] field_3629;
   // $FF: renamed from: ae com.corrodinggames.rts.gameFramework.ab[]
   public class_427[] field_3630;
   // $FF: renamed from: af java.util.ArrayList
   public ArrayList field_3631;
   // $FF: renamed from: ag java.util.Properties
   Properties field_3632;
   // $FF: renamed from: ah int
   int field_3633;
   // $FF: renamed from: ai int
   int field_3634;

   public class_426() {
      this.field_3587.method_2721("UP").method_2721("NUMPAD8");
      this.field_3588.method_2721("DOWN").method_2721("NUMPAD2");
      this.field_3589.method_2721("LEFT").method_2721("NUMPAD4");
      this.field_3590.method_2721("RIGHT").method_2721("NUMPAD6");
      this.field_3585.method_2721("F5");
      this.field_3586.method_2721("F6");
      this.field_3597.method_2721("CTRL+S");
      this.field_3593.method_2721("ENTER").method_2721("T");
      this.field_3594.method_2721("SHIFT+ENTER").method_2721("Y");
      this.field_3595.method_2721("M");
      this.field_3596.method_2721("ESCAPE").method_2721("F10");
      this.field_3598.method_2721("SPACE");
      this.field_3599.method_2721("CTRL+SPACE");
      this.field_3600.method_2721("CTRL+A");
      this.field_3602.method_2721("CTRL+B");
      this.field_3603.method_2721("CTRL+E");
      this.field_3604.method_2721("CTRL+F");
      this.field_3605.method_2721("CTRL+L");
      this.field_3606.method_2721("CTRL+K");
      this.field_3601.method_2721("CTRL+C");
      this.field_3607.method_2721("CTRL+N");
      this.field_3613.method_2721("A");
      this.field_3615.method_2721("G");
      this.field_3616.method_2721("P");
      this.field_3617.method_2721("U");
      this.field_3618.method_2721("R");
      this.field_3619.method_2721("CTRL+SHIFT+E");
      this.field_3620.method_2721("CTRL+SHIFT+P");
      this.field_3621.method_2721("CTRL+SHIFT+S");
      this.field_3622.method_2721("CTRL+SHIFT+H");
      this.field_3623.method_2721("CTRL+H");
      this.field_3624.method_2721("CTRL+SHIFT+I");
      this.field_3625.method_2721("CTRL+SHIFT+ALT+S");
      this.field_3609.method_2721("minus").method_2721("NUMPADSUBTRACT");
      this.field_3610.method_2721("equals").method_2721("NUMPADADD");
      int[] var1 = new int[]{54, 52, 31, 50, 30, 42, 41, 38, 39, 40, 37, 43};
      this.field_3626 = new class_427[10];

      int var2;
      for(var2 = 0; var2 < this.field_3626.length; ++var2) {
         this.field_3626[var2] = this.method_2708("unit action " + (var2 + 1));
         this.field_3626[var2].method_2719(var1[var2]);
      }

      this.field_3627 = this.method_2709("Unit Groups");
      this.field_3630 = new class_427[10];

      int var3;
      byte var4;
      for(var2 = 0; var2 < this.field_3630.length; ++var2) {
         this.field_3630[var2] = this.method_2708("create group " + (var2 + 1));
         var3 = this.method_2706(var2 == 9 ? 0 : var2 + 1);
         var4 = 1;
         this.field_3630[var2].method_2720(var3, 0, var4, false);
      }

      this.field_3628 = new class_427[10];

      for(var2 = 0; var2 < this.field_3628.length; ++var2) {
         this.field_3628[var2] = this.method_2708("select group " + (var2 + 1));
         var3 = this.method_2706(var2 == 9 ? 0 : var2 + 1);
         this.field_3628[var2].method_2719(var3);
      }

      this.field_3629 = new class_427[10];

      for(var2 = 0; var2 < this.field_3629.length; ++var2) {
         this.field_3629[var2] = this.method_2708("Add group to selection " + (var2 + 1));
         var3 = this.method_2706(var2 == 9 ? 0 : var2 + 1);
         var4 = 2;
         this.field_3629[var2].method_2720(var3, 0, var4, false);
      }

      this.field_3632 = new Properties();
      this.field_3633 = 0;
      this.field_3634 = 0;
   }

   // $FF: renamed from: a (int) int
   public int method_2706(int var1) {
      if (var1 >= 10) {
         throw new RuntimeException("number:" + var1 + " too high");
      } else {
         return var1 == 0 ? 7 : 8 + (var1 - 1);
      }
   }

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_2707(String var1) {
      if (this.field_3631 == null) {
         this.field_3631 = new ArrayList();
      }

      class_427 var2 = new class_427();
      var2.field_3635 = var1;
      var2.field_3636 = false;
      this.field_3631.add(var2);
      return var2;
   }

   // $FF: renamed from: b (java.lang.String) com.corrodinggames.rts.gameFramework.ab
   public class_427 method_2708(String var1) {
      if (this.field_3631 == null) {
         this.field_3631 = new ArrayList();
      }

      class_427 var2 = new class_427();
      var2.field_3635 = var1;
      var2.field_3636 = true;
      this.field_3631.add(var2);
      return var2;
   }

   // $FF: renamed from: c (java.lang.String) com.corrodinggames.rts.gameFramework.ac
   public class_428 method_2709(String var1) {
      if (this.field_3631 == null) {
         this.field_3631 = new ArrayList();
      }

      class_428 var2 = new class_428();
      var2.a = var1;
      var2.b = true;
      this.field_3631.add(var2);
      return var2;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_2710(String var1, String var2) {
      var1 = var1.toLowerCase(Locale.ENGLISH).trim();
      class_427 var3 = null;
      Iterator var4 = this.field_3631.iterator();

      while(var4.hasNext()) {
         class_427 var5 = (class_427)var4.next();
         if (var5.field_3635 != null && var5.method_2726().equals(var1)) {
            var3 = var5;
         }
      }

      if (var3 == null) {
         class_236.method_1588("loadKey: could not find:" + var1);
      } else {
         String[] var7 = var2.split(",");

         for(int var8 = 0; var8 <= 1 && var8 < var7.length; ++var8) {
            String var6 = var7[var8];
            if (!var6.equalsIgnoreCase("DEFAULT")) {
               var3.method_2722(var6, var8);
               if (var3.field_3637.size() > var8 && var3.field_3637.get(var8) != null) {
                  ((class_429)var3.field_3637.get(var8)).field_3642 = true;
               } else {
                  class_236.method_1595("out of range");
               }
            }
         }

      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.ab) java.lang.String
   public String method_2711(class_427 var1) {
      String var2 = "";
      boolean var3 = true;
      Iterator var4 = var1.field_3637.iterator();

      while(var4.hasNext()) {
         class_429 var5 = (class_429)var4.next();
         if (var3) {
            var3 = false;
         } else {
            var2 = var2 + ",";
         }

         if (var5.field_3642) {
            if (var5.method_2730()) {
               var2 = var2 + "CLEARED";
            } else {
               var2 = var2 + var5.method_2729();
            }
         } else {
            var2 = var2 + "DEFAULT";
         }
      }

      return var2;
   }

   // $FF: renamed from: a () void
   public void method_2712() {
      this.field_3576 = this.method_2707("shoot");
      this.field_3577 = this.method_2707("move up");
      this.field_3578 = this.method_2707("move down");
      this.field_3579 = this.method_2707("move left");
      this.field_3580 = this.method_2707("move right");
      this.field_3581 = this.method_2707("aim up");
      this.field_3582 = this.method_2707("aim down");
      this.field_3583 = this.method_2707("aim left");
      this.field_3584 = this.method_2707("aim right");
      byte var1 = 0;
      this.field_3576.method_2723(var1, "enter", -1);
      this.field_3576.method_2723(var1, "space", -1);
      this.field_3577.method_2723(var1, "w", -1);
      this.field_3578.method_2723(var1, "s", -1);
      this.field_3579.method_2723(var1, "a", -1);
      this.field_3580.method_2723(var1, "d", -1);
      this.field_3581.method_2723(var1, "UP", -1);
      this.field_3582.method_2723(var1, "DOWN", -1);
      this.field_3583.method_2723(var1, "LEFT", -1);
      this.field_3584.method_2723(var1, "RIGHT", -1);
      class_236.method_1591("getControllerCount:" + field_3575.method_2239());
      byte var2 = 1;
      this.field_3577.method_2724(var1, var2, 0, true);
      this.field_3578.method_2724(var1, var2, 0, false);
      this.field_3579.method_2724(var1, var2, 1, true);
      this.field_3580.method_2724(var1, var2, 1, false);
      this.field_3581.method_2724(var1, var2, 2, true);
      this.field_3582.method_2724(var1, var2, 2, false);
      this.field_3583.method_2724(var1, var2, 3, true);
      this.field_3584.method_2724(var1, var2, 3, false);
      this.field_3576.method_2724(var1, var2, 4, true);
   }

   // $FF: renamed from: b () void
   public void method_2713() {
      if (field_3575.method_2239() != this.field_3634) {
         this.field_3634 = field_3575.method_2239();
         class_236.method_1591("Number of controllers changed, now:" + this.field_3634);
      }

   }

   // $FF: renamed from: d (java.lang.String) int
   public static int method_2714(String var0) {
      return var0.equalsIgnoreCase("CLEARED") ? 0 : SlickToAndroidKeycodes.method_1416(var0);
   }
}
