package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.class_107;
import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_281;
import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_324;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.units.a.b
public class class_122 extends class_121 {
   // $FF: renamed from: a int
   int field_1350;
   // $FF: renamed from: b com.corrodinggames.rts.game.units.a
   class_281 field_1351;

   public class_122() {
      super("c_7");
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa, boolean) int
   public int method_1047(class_39 var1, boolean var2) {
      return -1;
   }

   // $FF: renamed from: c () int
   public int method_1046() {
      return 0;
   }

   // $FF: renamed from: m () com.corrodinggames.rts.game.units.ao
   public class_469 method_1077() {
      return null;
   }

   // $FF: renamed from: e () com.corrodinggames.rts.game.units.a.n
   public class_516 method_1059() {
      return class_516.field_4693;
   }

   // $FF: renamed from: f () com.corrodinggames.rts.game.units.a.m
   public class_518 method_1060() {
      return class_518.field_4700;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1058() {
      return false;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_1045() {
      return "Attack Mode";
   }

   // $FF: renamed from: b () java.lang.String
   public String method_1044() {
      class_281 var1 = this.method_1079();
      return var1 != null ? var1.name() : "NA";
   }

   // $FF: renamed from: d_ () java.lang.String
   public String method_1063() {
      return this.method_1045();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public void method_1070(class_39 var1) {
      class_236 var2 = class_236.method_1549();
      class_281 var3 = this.method_1080();
      class_281 var4 = this.method_1078(var3);
      class_107 var5 = null;
      var5 = var1.field_143;
      class_324 var6 = var2.field_1952.method_2159(var5);
      Iterator var7 = class_39.field_126.iterator();

      while(var7.hasNext()) {
         class_39 var8 = (class_39)var7.next();
         if (var8 instanceof class_44) {
            class_44 var9 = (class_44)var8;
            if (var9.bS) {
               var6.method_2184(var9);
            }
         }
      }

      var6.method_2200(var4);
      this.field_1350 = var2.field_1939.field_980;
      this.field_1351 = var4;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.a) com.corrodinggames.rts.game.units.a
   public class_281 method_1078(class_281 var1) {
      if (var1 == class_281.field_2409) {
         return class_281.field_2412;
      } else {
         return var1 == class_281.field_2409 ? class_281.field_2413 : class_281.field_2409;
      }
   }

   // $FF: renamed from: n () com.corrodinggames.rts.game.units.a
   public class_281 method_1079() {
      class_236 var1 = class_236.method_1549();
      class_281 var2 = this.method_1080();
      this.field_1350 = var1.field_1939.field_980;
      this.field_1351 = var2;
      return var2;
   }

   // $FF: renamed from: j_ () com.corrodinggames.rts.game.units.a
   public class_281 method_1080() {
      class_236 var1 = class_236.method_1549();
      if (this.field_1350 == var1.field_1939.field_980 && this.field_1351 != null) {
         return this.field_1351;
      } else {
         class_281 var2 = null;
         boolean var3 = false;
         boolean var4 = false;
         Iterator var5 = class_39.field_126.iterator();

         while(true) {
            while(true) {
               class_44 var7;
               do {
                  class_39 var6;
                  do {
                     if (!var5.hasNext()) {
                        return var2;
                     }

                     var6 = (class_39)var5.next();
                  } while(!(var6 instanceof class_44));

                  var7 = (class_44)var6;
               } while(!var7.bS);

               if (var2 != null && var2 != var7.field_268) {
                  var2 = class_281.field_2414;
               } else {
                  var2 = var7.field_268;
               }
            }
         }
      }
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) boolean
   public boolean method_1051(class_39 var1) {
      return true;
   }

   // $FF: renamed from: j () java.lang.String
   public String method_1062() {
      return this.method_1044();
   }

   // $FF: renamed from: p () boolean
   public boolean method_1067() {
      return true;
   }

   // $FF: renamed from: i () com.corrodinggames.rts.game.units.ap
   // $FF: synthetic method
   public class_24 method_1055() {
      return this.method_1077();
   }
}
