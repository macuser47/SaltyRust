package com.corrodinggames.rts.game.units;

// $FF: renamed from: com.corrodinggames.rts.game.units.ag
public class class_507 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.ah
   public class_506 field_4647 = new class_506();
   // $FF: renamed from: b com.corrodinggames.rts.game.units.ah[]
   public class_506[] field_4648 = new class_506[10];

   public class_507() {
      for(int var1 = 0; var1 < this.field_4648.length; ++var1) {
         this.field_4648[var1] = new class_506();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.units.aa) void
   public void method_3246(class_39 var1) {
      this.field_4647.field_4646.method_1327(var1);
      if (var1.field_204 >= 0) {
         this.field_4648[var1.field_204].field_4646.method_1327(var1);
      }

   }

   // $FF: renamed from: b (com.corrodinggames.rts.game.units.aa) void
   public void method_3247(class_39 var1) {
      this.field_4647.field_4646.remove(var1);
      if (var1.field_204 >= 0) {
         this.field_4648[var1.field_204].field_4646.remove(var1);
      }

   }
}
