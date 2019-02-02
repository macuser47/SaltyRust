package com.corrodinggames.rts.gameFramework;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.af
public class class_430 extends class_429 {
   // $FF: renamed from: e int
   int field_3643 = -1;
   // $FF: renamed from: f int
   int field_3644 = -1;
   // $FF: renamed from: g boolean
   boolean field_3645;
   // $FF: renamed from: h int
   int field_3646 = -1;
   // $FF: renamed from: i float
   float field_3647;
   // $FF: renamed from: j boolean
   boolean field_3648 = false;

   // $FF: renamed from: a () boolean
   public boolean method_2727() {
      if (this.method_2728()) {
         if (!this.c) {
            this.c = true;
            return true;
         } else {
            return false;
         }
      } else {
         if (this.c) {
            this.c = false;
         }

         return false;
      }
   }

   // $FF: renamed from: b () boolean
   public boolean method_2728() {
      return this.method_2731() > 0.5F;
   }

   // $FF: renamed from: e () float
   public float method_2731() {
      return this.method_2732(false);
   }

   // $FF: renamed from: a (boolean) float
   public float method_2732(boolean var1) {
      float var2;
      if (this.field_3646 != -1) {
         var2 = class_426.field_3575.method_2238(this.field_3646, this.field_3643) ? 0.0F : 1.0F;
      } else {
         var2 = class_426.field_3575.method_2240(this.field_3643, this.field_3644);
         var2 = this.field_3645 ? -var2 : var2;
      }

      if (var1) {
         return var2;
      } else {
         if (!this.field_3648 && Math.abs(var2 - this.field_3647) > 0.001F) {
            this.field_3648 = true;
         }

         return !this.field_3648 ? 0.0F : var2;
      }
   }

   // $FF: renamed from: c () java.lang.String
   public String method_2729() {
      return "controller";
   }

   // $FF: renamed from: d () boolean
   public boolean method_2730() {
      return false;
   }
}
