package com.corrodinggames.rts.gameFramework;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.ae
public class class_431 extends class_429 {
   // $FF: renamed from: e int
   int field_3649;

   // $FF: renamed from: a () boolean
   public boolean method_2727() {
      if (class_426.field_3575.method_2237(this.field_3649, this.b, false)) {
         if (!this.c) {
            this.c = true;
            return true;
         } else {
            return false;
         }
      } else {
         if (class_426.field_3575.method_2237(this.field_3649, this.b, true)) {
            this.c = true;
         } else if (this.c) {
            this.c = false;
         }

         return false;
      }
   }

   // $FF: renamed from: b () boolean
   public boolean method_2728() {
      return class_426.field_3575.method_2237(this.field_3649, this.b, false);
   }

   // $FF: renamed from: c () java.lang.String
   public String method_2729() {
      return this.field_3649 == 0 ? "" : class_426.field_3575.method_2241(this.field_3649, this.b);
   }

   // $FF: renamed from: d () boolean
   public boolean method_2730() {
      return this.field_3649 == 0;
   }
}
