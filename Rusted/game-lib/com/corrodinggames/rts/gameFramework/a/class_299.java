package com.corrodinggames.rts.gameFramework.a;

import com.corrodinggames.rts.gameFramework.class_296;

// $FF: renamed from: com.corrodinggames.rts.gameFramework.a.i
public abstract class class_299 {
   // $FF: renamed from: d java.lang.String
   public String field_2504;
   // $FF: renamed from: e boolean
   public boolean field_2505;
   // $FF: renamed from: f com.corrodinggames.rts.gameFramework.a.h
   // $FF: synthetic field
   final class_325 field_2506;

   public class_299(class_325 var1, String var2, class_325 var3) {
      this.field_2506 = var1;
      this.field_2505 = false;
      this.field_2504 = class_296.method_2077(var2);
      if (var3 != null) {
         var3.field_2620.put(this.field_2504, this);
      }

   }

   // $FF: renamed from: a (float, float, int, int, float) void
   public abstract void method_2104(float var1, float var2, int var3, int var4, float var5);
}
