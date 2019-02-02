package com.corrodinggames.rts.gameFramework.f;

import a.a.class_371;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.utility.class_207;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.f.e
final class class_457 implements Runnable {
   // $FF: renamed from: a java.lang.Boolean
   Boolean field_3916;
   // $FF: renamed from: b java.io.OutputStream
   OutputStream field_3917;
   // $FF: renamed from: c java.io.BufferedOutputStream
   BufferedOutputStream field_3918;
   // $FF: renamed from: d java.io.DataOutputStream
   DataOutputStream field_3919;
   // $FF: renamed from: e com.corrodinggames.rts.gameFramework.utility.u
   class_207 field_3920;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.f.c
   // $FF: synthetic field
   final class_458 field_3921;

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.f.ah) void
   public strictfp synchronized void method_2981(class_413 var1) {
      if (!this.field_3921.field_3923) {
         this.field_3921.field_3928.add(var1);
         this.notifyAll();
      }
   }

   // $FF: renamed from: a () void
   public strictfp synchronized void method_2982() {
      this.notifyAll();
   }

   // $FF: renamed from: b () void
   public strictfp synchronized void method_2983() {
      try {
         if (this.field_3921.field_3928.isEmpty() && !this.field_3921.field_3923 && !this.field_3921.field_3924) {
            this.wait(10000L);
         }
      } catch (InterruptedException var2) {
      }

   }

   strictfp class_457(class_458 var1) {
      this.field_3921 = var1;
      this.field_3916 = true;
      this.field_3920 = new class_207();
      this.field_3917 = var1.field_3926.getOutputStream();
      this.field_3918 = new BufferedOutputStream(this.field_3917);
      this.field_3919 = new DataOutputStream(this.field_3918);
   }

   public strictfp void run() {
      class_236.method_1649();
      Thread.currentThread().setName("SendWorker-" + this.field_3921.method_2992());

      try {
         while(this.field_3916 && !this.field_3921.field_3923) {
            while(!this.field_3921.field_3928.isEmpty() && !this.field_3921.field_3923) {
               class_413 var1 = (class_413)this.field_3921.field_3928.remove();
               if (this.field_3921.field_3926 instanceof class_371) {
                  boolean var2 = false;
                  class_207 var3;
                  if (var1.field_3412.length > 500) {
                     var3 = new class_207(8 + var1.field_3412.length);
                     var2 = true;
                  } else {
                     var3 = this.field_3920;
                     var3.method_1380();
                  }

                  boolean var4 = var1.field_3414;
                  DataOutputStream var5 = new DataOutputStream(var3);
                  var5.writeInt(var1.field_3412.length);
                  var5.writeInt(var1.field_3411);
                  var5.write(var1.field_3412);
                  var5.flush();
                  var5.close();
                  class_371 var6 = (class_371)this.field_3921.field_3926;
                  var6.method_2323(var3.field_1698, 0, var3.method_1381(), var4);
                  if (var2) {
                     var3.close();
                  }
               } else {
                  this.field_3919.writeInt(var1.field_3412.length);
                  this.field_3919.writeInt(var1.field_3411);
                  this.field_3919.write(var1.field_3412);
                  this.field_3919.flush();
               }

               if (var1.field_3413 != -1) {
                  try {
                     Thread.sleep((long)var1.field_3413);
                  } catch (InterruptedException var7) {
                  }
               }
            }

            if (this.field_3921.field_3924) {
               this.field_3921.field_3923 = true;
               break;
            }

            this.method_2983();
         }
      } catch (IOException var8) {
         var8.printStackTrace();
         class_236.method_1592("network:SendWorker", var8.getMessage());
      }

      class_458.method_3000(this.field_3921, false, true);
   }
}
