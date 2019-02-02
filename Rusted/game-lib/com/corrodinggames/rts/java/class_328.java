package com.corrodinggames.rts.java;

import android.content.Context;
import com.corrodinggames.rts.gameFramework.class_236;
import com.corrodinggames.rts.gameFramework.class_296;
import com.corrodinggames.rts.gameFramework.a.class_299;
import com.corrodinggames.rts.gameFramework.a.class_325;
import com.corrodinggames.rts.gameFramework.utility.class_180;
import com.corrodinggames.rts.gameFramework.utility.class_196;
import com.corrodinggames.rts.java.audio.a.class_145;
import com.corrodinggames.rts.java.audio.a.class_148;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import java.util.concurrent.LinkedBlockingQueue;

// $FF: renamed from: com.corrodinggames.rts.java.q
public class class_328 extends class_325 {
   // $FF: renamed from: a int
   final int field_2627 = 15;
   // $FF: renamed from: b java.util.concurrent.LinkedBlockingQueue
   LinkedBlockingQueue field_2628 = new LinkedBlockingQueue();
   // $FF: renamed from: c com.corrodinggames.rts.gameFramework.utility.aa
   class_180 field_2629 = new class_180(15);
   // $FF: renamed from: d com.corrodinggames.rts.java.t
   class_304 field_2630;
   // $FF: renamed from: e android.content.Context
   Context field_2631;
   // $FF: renamed from: f com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio
   public OpenALAudio field_2632;

   // $FF: renamed from: b () java.lang.Object
   public Object method_2211() {
      return this.field_2632;
   }

   public class_328(OpenALAudio var1) {
      for(int var2 = 0; var2 < 15; ++var2) {
         this.field_2629.method_1255(new class_297());
      }

      this.field_2632 = var1;
   }

   // $FF: renamed from: a (android.content.Context) void
   public void method_2209(Context var1) {
      if (this.field_2631 != null) {
         class_236.method_1591("SlickSoundFactory:setContext context already set");
      } else {
         this.field_2631 = var1;
      }
   }

   // $FF: renamed from: a (int) com.corrodinggames.rts.gameFramework.a.i
   public class_299 method_2207(int var1) {
      String var2 = class_296.method_2075(var1);
      class_302 var3 = new class_302(this, var2, this);
      String var4 = class_296.method_2075(var1);
      synchronized(this.method_2211()) {
         var3.field_2511 = this.field_2632.newSound(new class_148(var4));
         return var3;
      }
   }

   // $FF: renamed from: a (java.lang.String, com.corrodinggames.rts.gameFramework.utility.j, boolean) com.corrodinggames.rts.gameFramework.a.i
   public class_299 method_2208(String var1, class_196 var2, boolean var3) {
      class_328 var4 = this;
      if (!var3) {
         var4 = null;
      }

      class_302 var5 = new class_302(this, var1, var4);

      try {
         synchronized(this.method_2211()) {
            var5.field_2511 = this.field_2632.newSound(new class_148(var2, var2.method_1315()));
            return var5;
         }
      } catch (class_145 var9) {
         var9.printStackTrace();
         return null;
      }
   }

   // $FF: renamed from: a () void
   public void method_2210() {
      if (this.field_2630 != null) {
         throw new RuntimeException("startThreads: soundThread!=null");
      } else {
         this.field_2630 = new class_304(this);
         this.field_2630.start();
      }
   }
}
