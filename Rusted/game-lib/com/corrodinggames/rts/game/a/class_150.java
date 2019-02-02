package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_469;
import com.corrodinggames.rts.game.units.class_503;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.a.d
public abstract class class_150 {
   // $FF: renamed from: b java.lang.String
   String field_1397;
   // $FF: renamed from: c java.util.ArrayList
   public ArrayList field_1398;
   // $FF: renamed from: a java.util.ArrayList
   private ArrayList field_1399;
   // $FF: renamed from: d com.corrodinggames.rts.game.a.a
   // $FF: synthetic field
   final class_112 field_1400;

   public class_150(class_112 var1, String var2) {
      this.field_1400 = var1;
      this.field_1397 = var2;
      var1.field_1303.add(this);
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.ap) boolean
   public boolean method_1142(class_24 var1) {
      Iterator var2 = this.field_1398.iterator();

      class_149 var3;
      do {
         if (!var2.hasNext()) {
            return false;
         }

         var3 = (class_149)var2.next();
      } while(var3.field_1394 != var1);

      return true;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) boolean
   public abstract boolean method_1143(class_24 var1);

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.ap) float
   public float method_1144(class_24 var1) {
      return 10.0F;
   }

   // $FF: renamed from: a () java.util.ArrayList
   public ArrayList method_1145() {
      Collections.shuffle(this.field_1399);
      return this.field_1399;
   }

   // $FF: renamed from: b () void
   public void method_1146() {
      this.field_1398 = new ArrayList();
      float var1 = 0.0F;
      Iterator var2 = class_469.field_4085.iterator();

      while(var2.hasNext()) {
         class_24 var3 = (class_24)var2.next();
         if (this.method_1143(var3)) {
            float var4 = this.method_1144(var3);
            var1 += var4;
            this.field_1398.add(new class_149(this, var3, var4));
         }
      }

      this.field_1399 = new ArrayList(this.field_1398);
      if (this.field_1398.size() == 0) {
         class_236.method_1591("AI: rebuildUnitMix: no units in unitMix:" + this.field_1397);
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac) com.corrodinggames.rts.game.units.ap
   public class_24 method_1147(class_503 var1) {
      return this.method_1149(var1, -1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap, com.corrodinggames.rts.game.units.ac) boolean
   public boolean method_1148(class_24 var1, class_503 var2) {
      if (var2 == null) {
         return true;
      } else {
         class_503 var3 = var1.method_137();
         if (var3 == class_503.field_4623) {
            var3 = class_503.field_4618;
         }

         if (var3 == class_503.field_4624) {
            var3 = class_503.field_4622;
         }

         return var3 == var2;
      }
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ac, int) com.corrodinggames.rts.game.units.ap
   public class_24 method_1149(class_503 var1, int var2) {
      if (this.field_1398.size() == 0) {
         class_236.method_1591("AI: getRandomUnitType: no units in unitMix:" + this.field_1397);
         return null;
      } else {
         float var3 = 0.0F;
         Iterator var4 = this.field_1398.iterator();

         while(true) {
            class_149 var5;
            do {
               do {
                  if (!var4.hasNext()) {
                     float var8 = class_296.method_2033(0.0F, var3);
                     float var9 = 0.0F;
                     Iterator var6 = this.field_1398.iterator();

                     class_149 var7;
                     do {
                        do {
                           do {
                              if (!var6.hasNext()) {
                                 class_236.method_1591("Did not find getRandomUnit, this should only happen very rarely, name:" + this.field_1397);
                                 return ((class_149)this.field_1398.get(this.field_1398.size() - 1)).field_1394;
                              }

                              var7 = (class_149)var6.next();
                           } while(!this.method_1148(var7.field_1394, var1));
                        } while(var2 != -1 && var7.field_1394.method_130() > var2);

                        var9 += var7.field_1395;
                     } while(var9 <= var8);

                     return var7.field_1394;
                  }

                  var5 = (class_149)var4.next();
               } while(!this.method_1148(var5.field_1394, var1));
            } while(var2 != -1 && var5.field_1394.method_130() > var2);

            var3 += var5.field_1395;
         }
      }
   }
}
