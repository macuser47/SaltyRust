package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.class_296;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.a
public class class_455 {
   // $FF: renamed from: a java.util.concurrent.ConcurrentLinkedQueue
   private ConcurrentLinkedQueue field_3909 = new ConcurrentLinkedQueue();

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public String method_2973(String var1) {
      return class_296.method_2086(var1);
   }

   // $FF: renamed from: a (int, java.lang.String, java.lang.String, com.corrodinggames.rts.gameFramework.f.c) void
   public void method_2974(int var1, String var2, String var3, class_458 var4) {
      class_456 var5 = new class_456(this, var1, var2, var3, var4);
      this.field_3909.add(var5);
      if (this.field_3909.size() > 45) {
         this.field_3909.poll();
      }

   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.c, int) int
   public int method_2975(class_458 var1, int var2) {
      int var3 = 0;
      Iterator var4 = this.field_3909.iterator();

      while(var4.hasNext()) {
         class_456 var5 = (class_456)var4.next();
         if (var5.field_3913 == var1 && class_296.method_2084(var5.field_3914, System.nanoTime()) < (long)var2) {
            ++var3;
            if (var5.field_3912 != null) {
               if (class_296.method_2085(var5.field_3912, '\n') >= 3) {
                  var3 += 2;
               }

               if (class_296.method_2085(var5.field_3912, '\n') >= 6) {
                  var3 += 2;
               }

               if (class_296.method_2085(var5.field_3912, '\n') >= 9) {
                  var3 += 2;
               }
            }
         }
      }

      return var3;
   }

   // $FF: renamed from: a () java.lang.String
   public String method_2976() {
      String var1 = "";

      class_456 var3;
      for(Iterator var2 = this.field_3909.iterator(); var2.hasNext(); var1 = var1 + var3.method_2979() + "\n") {
         var3 = (class_456)var2.next();
      }

      return var1;
   }

   // $FF: renamed from: b () java.util.concurrent.ConcurrentLinkedQueue
   public ConcurrentLinkedQueue method_2977() {
      return this.field_3909;
   }

   // $FF: renamed from: c () void
   public void method_2978() {
      this.field_3909.clear();
   }
}
