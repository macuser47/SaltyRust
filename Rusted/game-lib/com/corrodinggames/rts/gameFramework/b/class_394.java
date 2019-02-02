package com.corrodinggames.rts.gameFramework.b;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.h.class_306;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.b.g
public final class class_394 {
   // $FF: renamed from: a java.lang.String
   public String field_3211;
   // $FF: renamed from: b int
   public int field_3212 = 25;
   // $FF: renamed from: c int
   public int field_3213 = 25;
   // $FF: renamed from: d int
   public int field_3214 = 1;
   // $FF: renamed from: e int
   public int field_3215 = 1;
   // $FF: renamed from: f int
   public int field_3216 = 26;
   // $FF: renamed from: g int
   public int field_3217 = 26;
   // $FF: renamed from: h com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_3218 = null;
   // $FF: renamed from: i com.corrodinggames.rts.gameFramework.h.e
   public class_306 field_3219 = null;
   // $FF: renamed from: j boolean
   public boolean field_3220 = false;

   // $FF: renamed from: a () void
   public void method_2497() {
      this.field_3219 = this.field_3218.method_2121();
      this.field_3219.method_2124();

      for(int var1 = 0; var1 < this.field_3219.method_2128(); ++var1) {
         for(int var2 = 0; var2 < this.field_3219.method_2127(); ++var2) {
            int var3 = this.field_3219.method_2125(var1, var2);
            this.field_3219.method_2126(var1, var2, Color.method_3077(Color.method_3072(var3), 0, 0, 0));
         }
      }

      this.field_3219.method_2131();
   }
}
