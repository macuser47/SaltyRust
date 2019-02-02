package com.corrodinggames.rts.gameFramework.utility;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.utility.aa
public class class_180 {
   // $FF: renamed from: a java.lang.Object[]
   private final Object[] field_1579;
   // $FF: renamed from: b int
   private int field_1580;
   // $FF: renamed from: c boolean
   private final boolean field_1581 = false;

   public class_180(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("The max pool size must be > 0");
      } else {
         this.field_1579 = new Object[var1];
      }
   }

   // $FF: renamed from: a () java.lang.Object
   public Object method_1254() {
      if (this.field_1580 > 0) {
         int var1 = this.field_1580 - 1;
         Object var2 = this.field_1579[var1];
         this.field_1579[var1] = null;
         --this.field_1580;
         return var2;
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.Object) boolean
   public boolean method_1255(Object var1) {
      if (this.field_1580 < this.field_1579.length) {
         this.field_1579[this.field_1580] = var1;
         ++this.field_1580;
         return true;
      } else {
         return false;
      }
   }
}
