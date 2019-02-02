package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.class_315;
import com.corrodinggames.rts.java.audio.Music;
import com.corrodinggames.rts.java.audio.a.class_148;

// $FF: renamed from: com.corrodinggames.rts.java.o
public class class_318 extends class_315 {
   // $FF: renamed from: a com.corrodinggames.rts.java.n
   class_313 field_2575;
   // $FF: renamed from: c com.corrodinggames.rts.java.audio.Music
   Music field_2576;

   public class_318(String var1, class_313 var2) {
      super(var1, var2);
      this.field_2575 = var2;
      synchronized(var2.method_2156()) {
         this.field_2575 = var2;
         this.field_2576 = var2.field_2566.newMusic(new class_148("assets/" + var1));
      }
   }
}
