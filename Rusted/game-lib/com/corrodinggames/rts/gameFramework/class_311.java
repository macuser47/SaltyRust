package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import java.util.ArrayList;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.ak
public class class_311 extends class_310 {
   // $FF: renamed from: a java.util.ArrayList
   ArrayList field_2560 = new ArrayList();
   // $FF: renamed from: b java.util.ArrayList
   ArrayList field_2561 = new ArrayList();
   // $FF: renamed from: c java.util.ArrayList
   ArrayList field_2562 = new ArrayList();
   // $FF: renamed from: d boolean
   boolean field_2563 = false;

   // $FF: renamed from: a (java.lang.String) com.corrodinggames.rts.gameFramework.ao
   public class_315 method_2149(String var1) {
      return new class_316(var1, this);
   }

   // $FF: renamed from: a () com.corrodinggames.rts.gameFramework.ap
   public class_320 method_2150() {
      class_321 var1 = new class_321(this);
      return var1;
   }

   // $FF: renamed from: a (com.corrodinggames.rts.gameFramework.aj) void
   public void method_2151(class_439 var1) {
      this.e = var1;
      if (this.field_2563) {
         class_236.method_1591("AndroidMusicFactory already loaded");
      }

      this.field_2563 = true;
      this.field_2560.add(new MediaPlayer());
      this.field_2560.add(new MediaPlayer());
      this.field_2561.addAll(this.field_2560);
   }

   // $FF: renamed from: b () void
   public void method_2152() {
   }
}
