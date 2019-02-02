package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_81;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.c.class_99;
import com.corrodinggames.rts.gameFramework.f.class_405;
import java.io.IOException;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.r
public class class_132 extends class_121 {
   // $FF: renamed from: a boolean
   public boolean field_1357;

   public class_132(boolean var1) {
      super("c_5");
      this.c = -9990.0F;
      this.field_1357 = var1;
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
      return null;
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public class_516 method_1059() {
      return class_516.field_4691;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_518.field_4706;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: t () com.corrodinggames.rts.game.units.p
   public class_44 method_1089() {
      class_44 var1 = null;
      Iterator var2 = class_34.field_79.iterator();

      while(var2.hasNext()) {
         class_34 var3 = (class_34)var2.next();
         if (var3 instanceof class_44) {
            class_44 var4 = (class_44)var3;
            if (var4.bS) {
               var1 = var4;
            }
         }
      }

      return var1;
   }

   // $FF: renamed from: B () boolean
   public boolean method_1090() {
      class_236 var1 = class_236.method_1549();
      class_44 var2 = this.method_1089();
      if (var2 != null) {
         if (var2 instanceof class_81) {
            return true;
         } else {
            return var1.field_1915 == var2.bk;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: j () java.lang.String
   public String method_1062() {
      String var1 = "UnitInfo";
      class_236 var2 = class_236.method_1549();
      class_44 var3 = this.method_1089();
      if (var3 != null) {
         if (var3 instanceof class_81) {
            return "Editor";
         }

         if (!this.field_1357) {
            var1 = var2.field_1939.field_946.method_822(var3, false);
         } else {
            class_107 var4 = var3.bk;
            var1 = var2.field_1939.field_946.method_821(var4);
         }
      }

      return var1;
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
      if (this.field_1357) {
         return !this.method_1090();
      } else {
         return true;
      }
   }

   // $FF: renamed from: r () boolean
   public boolean method_1052() {
      return !this.field_1357;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      if (this.field_1357) {
         return "";
      } else {
         class_44 var1 = this.method_1089();
         if (var1 != null) {
            boolean var2 = false;
            String var3 = class_99.method_824(var1, true, true, var2);
            boolean var4 = false;
            if (var4) {
               class_405 var5 = new class_405();

               try {
                  var1.method_148(var5);
               } catch (IOException var7) {
                  var7.printStackTrace();
               }

               var3 = var3 + "\n" + var5.field_3310;
            }

            return var3;
         } else {
            return "";
         }
      }
   }

   // $FF: renamed from: y () boolean
   public boolean method_1069() {
      return true;
   }
}
