package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.game.units.class_39;
import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_30;
import com.corrodinggames.rts.gameFramework.class_34;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.t
public class class_113 extends class_30 {
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.c.a
   private final class_99 field_1317;
   // $FF: renamed from: a java.util.ArrayList
   public ArrayList field_1318 = new ArrayList();
   // $FF: renamed from: b float
   public float field_1319;
   // $FF: renamed from: c long
   public long field_1320;
   // $FF: renamed from: d float
   public float field_1321;
   // $FF: renamed from: e float
   public float field_1322;
   // $FF: renamed from: f float
   public float field_1323;
   // $FF: renamed from: g boolean
   public boolean field_1324;

   public class_113(class_99 var1, boolean var2) {
      this.field_1317 = var1;
      this.field_1324 = var2;
   }

   // $FF: renamed from: a () void
   public void method_1013() {
      class_39 var1 = null;
      Iterator var2 = this.field_1318.iterator();

      while(var2.hasNext()) {
         class_39 var3 = (class_39)var2.next();
         if (!var3.field_141 && var3.field_182 == null) {
            this.field_1317.field_1059.method_763(var3);
            var1 = var3;
         }
      }

      if (this.field_1320 > class_236.method_1596() - 700L && var1 != null) {
         this.field_1317.field_1060.method_1582(var1.dh, var1.di);
      }

      this.field_1320 = class_236.method_1596();
   }

   // $FF: renamed from: b () void
   public void method_1014() {
      this.field_1318.clear();
   }

   // $FF: renamed from: c () void
   public void method_1015() {
      Iterator var1 = class_34.field_79.iterator();

      while(var1.hasNext()) {
         class_34 var2 = (class_34)var1.next();
         if (var2 instanceof class_44) {
            class_44 var3 = (class_44)var2;
            if (var3.bS && !this.field_1318.contains(var3)) {
               this.field_1318.add(var3);
            }
         }
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      this.method_1017();
      var1.method_2542(this.field_1319);
      var1.method_2543(this.field_1320);
      int var2 = this.field_1318.size();
      var1.method_2541(var2);
      Iterator var3 = this.field_1318.iterator();

      while(var3.hasNext()) {
         class_39 var4 = (class_39)var3.next();
         var1.method_2550(var4);
      }

      var1.method_2539(0);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_1016(class_463 var1) {
      this.field_1319 = var1.method_3012();
      this.field_1320 = var1.method_3013();
      this.field_1318.clear();
      int var2 = var1.method_3011();

      for(int var3 = 0; var3 < var2; ++var3) {
         class_39 var4 = var1.method_3019();
         if (var4 != null) {
            this.field_1318.add(var4);
         }
      }

      var1.method_3009();
   }

   // $FF: renamed from: d () void
   public void method_1017() {
      Iterator var1 = this.field_1318.iterator();

      while(var1.hasNext()) {
         class_39 var2 = (class_39)var1.next();
         if (var2.field_141) {
            var1.remove();
         }
      }

   }
}
