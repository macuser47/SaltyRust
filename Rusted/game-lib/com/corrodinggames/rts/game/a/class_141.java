package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.class_24;
import com.corrodinggames.rts.game.units.class_44;
import java.util.HashMap;

// $FF: renamed from: com.corrodinggames.rts.game.a.c
public class class_141 {
   // $FF: renamed from: a java.util.HashMap
   HashMap field_1371 = new HashMap();
   // $FF: renamed from: b java.util.HashMap
   HashMap field_1372 = new HashMap();
   // $FF: renamed from: c java.util.HashMap
   HashMap field_1373 = new HashMap();

   // $FF: renamed from: a (boolean, com.corrodinggames.rts.game.units.ap, boolean) java.lang.Integer
   public Integer method_1122(boolean var1, class_24 var2, boolean var3) {
      if (var1) {
         return (Integer)this.field_1373.get(var2);
      } else {
         return !var3 ? (Integer)this.field_1372.get(var2) : (Integer)this.field_1371.get(var2);
      }
   }

   // $FF: renamed from: a (boolean, com.corrodinggames.rts.game.units.ap, boolean, java.lang.Integer) void
   public void method_1123(boolean var1, class_24 var2, boolean var3, Integer var4) {
      if (var1) {
         this.field_1373.put(var2, var4);
      } else if (!var3) {
         this.field_1372.put(var2, var4);
      } else {
         this.field_1371.put(var2, var4);
      }

   }

   // $FF: renamed from: a () void
   public void method_1124() {
      this.field_1371.clear();
      this.field_1372.clear();
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.ap) void
   public void method_1125(class_24 var1) {
      this.field_1371.put(var1, (Object)null);
      this.field_1372.put(var1, (Object)null);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.p) void
   public void method_1126(class_44 var1) {
      this.field_1373.put(var1.cF, (Object)null);
   }

   // $FF: renamed from: b () void
   public void method_1127() {
      this.field_1373.clear();
   }
}
