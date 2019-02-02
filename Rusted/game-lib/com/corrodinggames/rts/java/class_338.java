package com.corrodinggames.rts.java;

import com.corrodinggames.rts.a.class_11;
import com.corrodinggames.rts.a.class_273;
import com.corrodinggames.rts.a.class_352;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.h.class_23;
import com.corrodinggames.rts.gameFramework.h.class_465;
import com.corrodinggames.rts.gameFramework.h.class_472;

// $FF: renamed from: com.corrodinggames.rts.java.c
public class class_338 implements class_11 {
   // $FF: renamed from: a int
   public int field_2690;
   // $FF: renamed from: b int
   public int field_2691;
   // $FF: renamed from: c com.corrodinggames.rts.java.f
   class_274 field_2692 = new class_274();
   // $FF: renamed from: d com.corrodinggames.rts.a.k
   class_352 field_2693;
   // $FF: renamed from: e java.lang.Object
   public Object field_2694 = new Object();
   // $FF: renamed from: f java.lang.Object
   public Object field_2695 = new Object();
   // $FF: renamed from: g com.corrodinggames.rts.gameFramework.h.j
   class_465 field_2696 = new class_465();

   // $FF: renamed from: a () void
   public void method_24() {
   }

   // $FF: renamed from: b () boolean
   public boolean method_25() {
      return true;
   }

   // $FF: renamed from: c () boolean
   public boolean method_26() {
      return false;
   }

   // $FF: renamed from: d () com.corrodinggames.rts.gameFramework.h.a
   public class_472 method_27() {
      return null;
   }

   // $FF: renamed from: e () boolean
   public boolean method_28() {
      return false;
   }

   // $FF: renamed from: f () boolean
   public boolean method_29() {
      class_236 var1 = class_236.method_1549();
      return var1 != null && var1.field_1937.slick2dFullScreen;
   }

   // $FF: renamed from: g () java.lang.Object
   public Object method_30() {
      return null;
   }

   // $FF: renamed from: h () int
   public int method_31() {
      return this.field_2690;
   }

   // $FF: renamed from: i () int
   public int method_32() {
      return this.field_2691;
   }

   // $FF: renamed from: j () void
   public void method_33() {
   }

   // $FF: renamed from: k () com.corrodinggames.rts.a.e
   public class_273 method_34() {
      return this.field_2692;
   }

   // $FF: renamed from: l () com.corrodinggames.rts.a.k
   public class_352 method_35() {
      return this.field_2693;
   }

   // $FF: renamed from: a (float, int) void
   public void method_36(float var1, int var2) {
      synchronized(this.field_2695) {
         this.field_2695.notifyAll();
      }
   }

   // $FF: renamed from: b (float, int) void
   public void method_37(float var1, int var2) {
   }

   // $FF: renamed from: m () void
   public void method_38() {
   }

   // $FF: renamed from: a (boolean) com.corrodinggames.rts.gameFramework.h.h
   public class_23 method_39(boolean var1) {
      return this.field_2696;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.h.h, boolean) void
   public void method_40(class_23 var1, boolean var2) {
   }

   // $FF: renamed from: n () void
   public void method_41() {
   }

   // $FF: renamed from: o () boolean
   public boolean method_42() {
      return true;
   }
}
