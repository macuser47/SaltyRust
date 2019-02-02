package com.corrodinggames.rts.a;

import android.os.Handler;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.f.class_444;
import com.corrodinggames.rts.gameFramework.f.class_462;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.a.m
public class class_268 extends class_266 {
   // $FF: renamed from: b com.corrodinggames.rts.a.m
   static class_268 field_2330;
   // $FF: renamed from: c android.os.Handler
   final Handler field_2331;
   // $FF: renamed from: d java.lang.Runnable
   private Runnable field_2332;

   // $FF: renamed from: j () void
   public static void method_1875() {
      if (field_2330 != null) {
         field_2330.field_2331.method_1531(field_2330.field_2332);
      }

   }

   // $FF: renamed from: k () java.util.ArrayList
   public static ArrayList method_1876() {
      synchronized(class_444.field_3757) {
         class_236 var1 = class_236.method_1549();
         ArrayList var2 = new ArrayList();
         Iterator var3 = var1.field_1944.field_3888.iterator();

         while(var3.hasNext()) {
            class_462 var4 = (class_462)var3.next();
            var2.add(var4);
         }

         Collections.sort(var2, new m$1());
         return var2;
      }
   }
}
