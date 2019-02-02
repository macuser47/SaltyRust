package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_81;
import com.corrodinggames.rts.gameFramework.class_236;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.s
public class class_133 extends class_121 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ap
   class_24 field_1358;
   // $FF: renamed from: b java.util.ArrayList
   ArrayList field_1359 = new ArrayList();
   // $FF: renamed from: e int
   int field_1360 = 0;
   // $FF: renamed from: f boolean
   boolean field_1361;
   // $FF: renamed from: g com.corrodinggames.rts.game.units.p
   class_44 field_1362 = null;

   public class_133(class_24 var1) {
      super("s_" + var1.method_144());
      this.c = -9999.0F;
      this.field_1358 = var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_1047(class_39 var1, boolean var2) {
      return -1;
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return 0;
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   public class_24 method_1055() {
      return this.field_1358;
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public class_516 method_1059() {
      return class_516.field_4691;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_236.method_1653() ? class_518.field_4707 : class_518.field_4706;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.aa, boolean) boolean
   public boolean method_1064(class_39 var1, boolean var2) {
      class_236 var3 = class_236.method_1549();
      Iterator var4;
      class_39 var5;
      if (!var2) {
         var4 = class_39.field_125.iterator();

         while(var4.hasNext()) {
            var5 = (class_39)var4.next();
            if (var5.field_177 && var5.method_295() != this.field_1358) {
               var3.field_1939.method_765(var5);
            }
         }
      } else {
         var4 = class_39.field_125.iterator();

         while(var4.hasNext()) {
            var5 = (class_39)var4.next();
            if (var5.field_177 && var5.method_295() == this.field_1358) {
               var3.field_1939.method_765(var5);
            }
         }
      }

      return true;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_1062() {
      String var1 = "UnitInfo";
      class_236 var2 = class_236.method_1549();
      if (this.field_1362 instanceof class_81) {
         return "Editor";
      } else {
         var1 = "" + this.field_1358.method_139() + " x" + this.field_1360;
         return var1;
      }
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      return "UnitInfo";
   }

   // $FF: renamed from: d_ () java.lang.String
   public String method_1063() {
      return this.method_1045();
   }

   // $FF: renamed from: p () boolean
   public boolean method_1067() {
      return true;
   }

   // $FF: renamed from: r () boolean
   public boolean method_1052() {
      return true;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      String var1 = "";
      if (this.field_1362 instanceof class_81) {
         return "Editor";
      } else {
         if (this.field_1361) {
            var1 = "(Left click to exclusively select / Right click to unselect)\n";
         }

         return this.field_1358.method_139() + "\n" + var1 + this.field_1358.method_140();
      }
   }

   // $FF: renamed from: t () void
   public void method_1091() {
      this.field_1360 = 0;
      this.field_1361 = false;
      this.field_1362 = null;
      class_236 var1 = class_236.method_1549();
      class_39[] var2 = var1.field_1939.field_1056.method_1326();
      int var3 = 0;

      for(int var4 = var1.field_1939.field_1056.size(); var3 < var4; ++var3) {
         class_39 var5 = var2[var3];
         if (var5 instanceof class_44) {
            class_44 var6 = (class_44)var5;
            if (var6.bS) {
               if (var6.o() == this.field_1358) {
                  ++this.field_1360;
                  if (this.field_1362 == null) {
                     this.field_1362 = var6;
                  }
               } else {
                  this.field_1361 = true;
               }
            }
         }
      }

   }

   // $FF: renamed from: i_ () float
   public float method_1036() {
      return this.c - (float)this.field_1360;
   }

   // $FF: renamed from: y () boolean
   public boolean method_1069() {
      return true;
   }
}
