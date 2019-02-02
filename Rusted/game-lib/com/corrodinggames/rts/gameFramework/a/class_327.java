package com.corrodinggames.rts.gameFramework.a;

import android.content.Context;
import android.media.SoundPool;
import com.corrodinggames.rts.R$raw;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.utility.class_180;
import com.corrodinggames.rts.gameFramework.utility.class_196;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.a.a
public class class_327 extends class_325 {
   // $FF: renamed from: a java.util.concurrent.LinkedBlockingQueue
   LinkedBlockingQueue field_2621 = new LinkedBlockingQueue();
   // $FF: renamed from: b int
   final int field_2622 = 15;
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.utility.aa
   class_180 field_2623 = new class_180(15);
   // $FF: renamed from: d com.corrodinggames.rts.gameFramework.a.d
   class_524 field_2624;
   // $FF: renamed from: e android.content.Context
   Context field_2625;
   // $FF: renamed from: f android.media.SoundPool
   SoundPool field_2626;

   public class_327() {
      for(int var1 = 0; var1 < 15; ++var1) {
         this.field_2623.method_1255(new class_523());
      }

   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_2209(Context var1) {
      if (this.field_2625 != null) {
         class_236.method_1591("AndroidSoundFactory:setContext context already set");
      } else {
         this.field_2625 = var1;
         this.field_2626 = new SoundPool(16, 3, 0);
      }
   }

   // $FF: renamed from: a () void
   public void method_2210() {
      if (this.field_2624 != null) {
         throw new RuntimeException("soundThread!=null");
      } else {
         this.field_2624 = new class_524(this);
         this.field_2624.start();
      }
   }

   // $FF: renamed from: a (int) com.corrodinggames.rts.gameFramework.a.i
   public class_299 method_2207(int var1) {
      String var2 = class_296.method_2074(R$raw.class, var1);
      class_301 var3 = new class_301(this, var2, this);
      var3.field_2508 = this;
      var3.field_2509 = this.field_2626.load(this.field_2625, var1, 1);
      return var3;
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.utility.j, boolean) com.corrodinggames.rts.gameFramework.a.i
   public class_299 method_2208(String var1, class_196 var2, boolean var3) {
      class_327 var4 = this;
      if (!var3) {
         var4 = null;
      }

      FileDescriptor var5;
      long var6;
      long var8;
      try {
         var5 = var2.method_1312();
         var6 = 0L;
         var8 = (long)var2.available();
      } catch (IOException var11) {
         var11.printStackTrace();
         return null;
      }

      class_301 var10 = new class_301(this, var1, var4);
      var10.field_2508 = this;
      var10.field_2509 = this.field_2626.load(var5, var6, var8, 1);
      return var10;
   }
}
