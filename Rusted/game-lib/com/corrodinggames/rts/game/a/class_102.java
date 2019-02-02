package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.gameFramework.class_236;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.a.g
public abstract class class_102 extends class_100 {
   // $FF: renamed from: B java.util.ArrayList
   ArrayList field_1144 = new ArrayList();
   // $FF: renamed from: C java.util.ArrayList
   ArrayList field_1145 = new ArrayList();

   // $FF: renamed from: g () int
   public int method_846() {
      return this.field_1144.size();
   }

   // $FF: renamed from: a () boolean
   public boolean method_847() {
      return false;
   }

   // $FF: renamed from: b () boolean
   public boolean method_848() {
      return false;
   }

   public class_102(class_112 var1) {
      super(var1);
   }

   // $FF: renamed from: h () boolean
   public boolean method_849() {
      Iterator var1 = this.F.field_1299.iterator();

      while(var1.hasNext()) {
         class_100 var2 = (class_100)var1.next();
         if (var2 instanceof class_103) {
            class_103 var3 = (class_103)var2;
            if (var3.field_1158 == this) {
               return true;
            }
         }
      }

      return false;
   }

   // $FF: renamed from: i () void
   public void method_850() {
      Iterator var1 = this.field_1144.iterator();

      while(true) {
         class_44 var2;
         do {
            if (!var1.hasNext()) {
               return;
            }

            var2 = (class_44)var1.next();
         } while(var2 != null && !var2.bi);

         if (var2 != null && var2.field_311 == this) {
            var2.field_311 = null;
         }

         if (var2 != null) {
            this.field_1145.remove(var2);
         }

         var1.remove();
      }
   }

   // $FF: renamed from: j () void
   public void method_851() {
      Iterator var1 = this.field_1145.iterator();

      while(true) {
         class_44 var2;
         do {
            if (!var1.hasNext()) {
               return;
            }

            var2 = (class_44)var1.next();
         } while(var2 != null && !var2.bi && var2.bX == null);

         var1.remove();
      }
   }

   // $FF: renamed from: k () void
   public void method_837() {
      this.method_854();
      this.field_1145.clear();
      super.method_837();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   protected void method_852(class_44 var1) {
      if (var1.field_311 != null) {
         var1.field_311.method_853(var1);
      }

      if (var1.bk != null && var1.bk != this.F) {
         class_236.method_1595("unit.team:" + var1.bk.field_1227 + ", ai:" + this.F.d);
      }

      this.field_1144.add(var1);
      var1.field_311 = this;
   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.p) void
   public void method_853(class_44 var1) {
      this.field_1144.remove(var1);
      this.field_1145.remove(var1);
      if (var1.field_311 == this) {
         var1.field_311 = null;
      }

   }

   // $FF: renamed from: l () void
   public void method_854() {
      Iterator var1 = this.field_1144.iterator();

      while(var1.hasNext()) {
         class_44 var2 = (class_44)var1.next();
         if (var2 != null && var2.field_311 == this) {
            var2.field_311 = null;
         }
      }

      this.field_1144.clear();
   }

   // $FF: renamed from: a (float) void
   public abstract void method_855(float var1);
}
