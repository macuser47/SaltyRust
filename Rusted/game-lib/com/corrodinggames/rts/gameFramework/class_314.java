package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.class_107;
import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c
public class class_314 {
   // $FF: renamed from: a boolean
   final boolean field_2568 = false;
   // $FF: renamed from: b java.util.ArrayList
   public ArrayList field_2569 = new ArrayList();
   // $FF: renamed from: c java.util.ArrayList
   public ArrayList field_2570 = new ArrayList();
   // $FF: renamed from: d java.util.ArrayList
   public ArrayList field_2571 = new ArrayList();

   // $FF: renamed from: a () void
   public strictfp void method_2157() {
      this.field_2569.clear();
      this.field_2570.clear();
      this.field_2571.clear();
   }

   // $FF: renamed from: b () com.corrodinggames.rts.gameFramework.e
   public strictfp class_324 method_2158() {
      class_324 var1 = new class_324(this);
      return var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.game.k) com.corrodinggames.rts.gameFramework.e
   public strictfp class_324 method_2159(class_107 var1) {
      if (var1 == null) {
         throw new RuntimeException("team==null");
      } else {
         class_324 var2 = new class_324(this);
         var2.field_2601 = var1;
         class_236 var3 = class_236.method_1549();
         if (!var3.field_1944.field_3809) {
            if (!var2.method_2206()) {
               class_236.method_1588("Command failed prepareAndCheckOnServer()");
            }

            this.field_2569.add(var2);
         } else {
            this.field_2571.add(var2);
         }

         return var2;
      }
   }

   // $FF: renamed from: c () void
   public strictfp void method_2160() {
      class_236 var1 = class_236.method_1549();
      if (!var1.field_1944.field_3809) {
         this.method_2161();
      } else {
         this.method_2162();
      }

   }

   // $FF: renamed from: d () void
   public strictfp void method_2161() {
      class_236 var1 = class_236.method_1549();
      int var2 = var1.field_1920;
      Iterator var3 = this.field_2569.iterator();

      while(var3.hasNext()) {
         class_324 var4 = (class_324)var3.next();
         var1.field_1948.method_2646(var4, var2);
         var4.method_2204();
      }

      this.field_2569.clear();
   }

   // $FF: renamed from: e () void
   public strictfp void method_2162() {
      class_236 var1 = class_236.method_1549();
      int var2 = var1.field_1920;
      Iterator var3 = this.field_2569.iterator();

      while(var3.hasNext()) {
         class_324 var4 = (class_324)var3.next();
         if (var4.field_2597 == var2) {
            var1.field_1948.method_2646(var4, var2);
            var4.method_2204();
            var3.remove();
         }
      }

   }
}
