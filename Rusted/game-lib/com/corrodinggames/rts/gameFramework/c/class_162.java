package com.corrodinggames.rts.gameFramework.c;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.class_236;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.c.h
public class class_162 {
   // $FF: renamed from: a com.corrodinggames.rts.gameFramework.c.e
   class_98 field_1466;
   // $FF: renamed from: b com.corrodinggames.rts.gameFramework.k
   class_236 field_1467;
   // $FF: renamed from: c android.graphics.Paint
   Paint field_1468;
   // $FF: renamed from: d java.util.ArrayList
   ArrayList field_1469 = new ArrayList();

   class_162(class_236 var1, class_98 var2) {
      this.field_1466 = var2;
      this.field_1467 = var1;
      this.method_1193();
   }

   // $FF: renamed from: a () void
   public void method_1193() {
      this.field_1468 = new Paint();
      this.field_1468.method_2791(255, 255, 255, 255);
      this.field_1468.method_2781(true);
      this.field_1468.method_2783(true);
      this.field_1468.method_2799(Typeface.method_1917(Typeface.field_2362, 1));
      this.field_1467.method_1603(this.field_1468, 16.0F);
   }

   // $FF: renamed from: b () void
   public synchronized void method_1194() {
      this.field_1469.clear();
   }

   // $FF: renamed from: c () void
   public synchronized void method_1195() {
      Iterator var1 = this.field_1469.iterator();

      while(var1.hasNext()) {
         class_164 var2 = (class_164)var1.next();
         if (this.field_1469.size() > 15) {
            var1.remove();
         }
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public synchronized void method_1196(String var1, String var2) {
      this.method_1195();
      class_164 var3 = new class_164(this);
      var3.field_1470 = var1;
      var3.field_1471 = var2;
      var3.field_1472 = System.currentTimeMillis();
      var3.field_1473 = (new SimpleDateFormat("HH:mm:ss")).format(new Date());
      this.field_1469.add(var3);
   }

   // $FF: renamed from: a (float) void
   public synchronized void method_1197(float var1) {
      class_236 var2 = class_236.method_1549();
      this.method_1195();
      int var3 = 95;
      byte var4 = 20;
      int var5 = (int)(20.0F * var2.field_1955);
      boolean var6 = var2.method_1557();

      for(int var7 = this.field_1469.size() - 1; var7 >= 0; --var7) {
         class_164 var8 = (class_164)this.field_1469.get(var7);
         if (var8.method_1198()) {
            String var9;
            if (var8.field_1470 != null && !var8.field_1470.equals("")) {
               var9 = var8.field_1470 + ": " + var8.field_1471;
            } else {
               var9 = var8.field_1471;
            }

            if (var6) {
               var9 = var8.field_1473 + ": " + var9;
            }

            var2.field_1935.method_78(var9, (float)var4, (float)var3, this.field_1468);
            var3 += var5;
         }
      }

   }
}
