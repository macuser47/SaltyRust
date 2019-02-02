package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.d.class_432;

// $FF: renamed from: com.corrodinggames.rts.game.units.custom.ac
public class class_355 {
   // $FF: renamed from: a com.corrodinggames.rts.game.units.custom.ad[]
   class_356[] field_2791;
   // $FF: renamed from: b java.lang.String
   String field_2792;
   // $FF: renamed from: c int
   int field_2793 = -1;
   // $FF: renamed from: d java.lang.String
   String field_2794;

   // $FF: renamed from: a () java.lang.String
   public String method_2303() {
      if (this.field_2793 == class_432.field_3652) {
         return this.field_2792;
      } else if (this.field_2794 != null) {
         this.field_2793 = class_432.field_3652;
         this.field_2792 = class_432.method_2744(this.field_2794);
         return this.field_2792;
      } else {
         String var1 = class_432.method_2738();
         class_356[] var2 = this.field_2791;
         int var3 = var2.length;

         int var4;
         class_356 var5;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var2[var4];
            if (var1.equals(var5.field_2795)) {
               this.field_2793 = class_432.field_3652;
               this.field_2792 = var5.field_2796;
               return this.field_2792;
            }
         }

         var2 = this.field_2791;
         var3 = var2.length;

         for(var4 = 0; var4 < var3; ++var4) {
            var5 = var2[var4];
            if (var5.field_2795 == null) {
               this.field_2793 = class_432.field_3652;
               this.field_2792 = var5.field_2796;
               return this.field_2792;
            }
         }

         return "<NO DEFAULT TEXT FOUND>";
      }
   }
}
