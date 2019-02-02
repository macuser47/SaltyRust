package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.class_44;
import com.corrodinggames.rts.gameFramework.f.class_404;
import com.corrodinggames.rts.gameFramework.f.class_463;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.game.a.k
public class class_105 extends class_102 {
   // $FF: renamed from: a float
   float field_1192 = 0.0F;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.af) void
   public void method_148(class_404 var1) {
      int var2 = this.B.size();
      var1.method_2541(var2);
      Iterator var3 = this.B.iterator();

      class_44 var4;
      while(var3.hasNext()) {
         var4 = (class_44)var3.next();
         var1.method_2551(var4);
      }

      var1.method_2539(1);
      var1.method_2541(this.C.size());
      var3 = this.C.iterator();

      while(var3.hasNext()) {
         var4 = (class_44)var3.next();
         var1.method_2551(var4);
      }

      var1.method_2542(this.field_1192);
      super.a(var1);
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.h) void
   public void method_836(class_463 var1) {
      this.l();
      int var2 = var1.method_3011();

      for(int var3 = 0; var3 < var2; ++var3) {
         class_44 var4 = var1.method_3021();
         if (var4 != null) {
            this.a(var4);
         }
      }

      byte var7 = var1.method_3009();
      if (var7 >= 1) {
         this.C.clear();
         int var8 = var1.method_3011();

         for(int var5 = 0; var5 < var8; ++var5) {
            class_44 var6 = var1.method_3021();
            if (var6 != null) {
               this.C.add(var6);
            }
         }

         this.field_1192 = var1.method_3012();
      }

      super.a(var1);
   }

   public class_105(class_112 var1) {
      super(var1);
   }

   // $FF: renamed from: a (float) void
   public void method_855(float var1) {
      this.i();
      if (!this.h()) {
         this.field_1192 += var1;
      }

      Iterator var2 = this.B.iterator();

      while(var2.hasNext()) {
         class_44 var3 = (class_44)var2.next();
         if (this.c(var3) < 3600.0F && var3.bX == null) {
            if (var3.field_311 == this) {
               var3.field_311 = null;
            }

            var2.remove();
         }
      }

      if (this.B.size() == 0 || this.field_1192 > 5000.0F) {
         this.k();
      }

   }

   // $FF: renamed from: c (com.corrodinggames.rts.game.units.p) void
   public void method_872(class_44 var1) {
      this.a(var1);
      this.C.add(var1);
   }
}
